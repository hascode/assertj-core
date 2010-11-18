/*
 * Created on Oct 20, 2010
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright @2010 the original author or authors.
 */
package org.fest.assertions.api;

import org.fest.assertions.core.*;
import org.fest.assertions.internal.*;
import org.fest.util.VisibleForTesting;

/**
 * Assertion methods for shorts. To create an instance of this class, use the factory methods
 * <code>{@link Assertions#assertThat(Short)}</code> or <code>{@link Assertions#assertThat(short)}</code>.
 *
 * @author Yvonne Wang
 * @author David DIDIER
 * @author Ansgar Konermann
 * @author Alex Ruiz
 */
public class ShortAssert extends GenericAssert<ShortAssert, Short> implements ComparableAssert<Short>, NumberAssert<Short> {

  @VisibleForTesting Comparables comparables = Comparables.instance();
  @VisibleForTesting Shorts shorts = Shorts.instance();

  protected ShortAssert(Short actual) {
    super(actual);
  }

  /**
   * Verifies that the actual value is equal to the given one.
   * @param expected the given value to compare the actual value to.
   * @return {@code this} assertion object.
   * @throws AssertionError if the actual value is {@code null}.
   * @throws AssertionError if the actual value is not equal to the given one.
   */
  public ShortAssert isEqualTo(short expected) {
    shorts.assertEqual(info, actual, expected);
    return this;
  }

  /**
   * Verifies that the actual value is not equal to the given one.
   * @param other the given value to compare the actual value to.
   * @return {@code this} assertion object.
   * @throws AssertionError if the actual value is {@code null}.
   * @throws AssertionError if the actual value is equal to the given one.
   */
  public ShortAssert isNotEqualTo(short other) {
    shorts.assertNotEqual(info, actual, other);
    return this;
  }

  /** {@inheritDoc} */
  public ShortAssert isZero() {
    shorts.assertIsZero(info, actual);
    return this;
  }

  /** {@inheritDoc} */
  public ShortAssert isNotZero() {
    shorts.assertIsNotZero(info, actual);
    return this;
  }

  /** {@inheritDoc} */
  public ShortAssert isPositive() {
    shorts.assertIsPositive(info, actual);
    return this;
  }

  /** {@inheritDoc} */
  public ShortAssert isNegative() {
    shorts.assertIsNegative(info, actual);
    return this;
  }

  /** {@inheritDoc} */
  public ShortAssert isLessThan(Short other) {
    comparables.assertLessThan(info, actual, other);
    return this;
  }

  /**
   * Verifies that the actual value is less than the given one.
   * @param other the given value to compare the actual value to.
   * @return {@code this} assertion object.
   * @throws AssertionError if the actual value is {@code null}.
   * @throws AssertionError if the actual value is equal to or greater than the given one.
   */
  public ShortAssert isLessThan(short other) {
    shorts.assertLessThan(info, actual, other);
    return this;
  }

  /** {@inheritDoc} */
  public ShortAssert isLessThanOrEqualTo(Short other) {
    comparables.assertLessThanOrEqualTo(info, actual, other);
    return this;
  }

  /**
   * Verifies that the actual value is less than or equal to the given one.
   * @param other the given value to compare the actual value to.
   * @return {@code this} assertion object.
   * @throws AssertionError if the actual value is {@code null}.
   * @throws AssertionError if the actual value is greater than the given one.
   */
  public ShortAssert isLessThanOrEqualTo(short other) {
    shorts.assertLessThanOrEqualTo(info, actual, other);
    return this;
  }

  /** {@inheritDoc} */
  public ShortAssert isGreaterThan(Short other) {
    comparables.assertGreaterThan(info, actual, other);
    return this;
  }

  /**
   * Verifies that the actual value is greater than the given one.
   * @param other the given value to compare the actual value to.
   * @return {@code this} assertion object.
   * @throws AssertionError if the actual value is {@code null}.
   * @throws AssertionError if the actual value is equal to or less than the given one.
   */
  public ShortAssert isGreaterThan(short other) {
    shorts.assertGreaterThan(info, actual, other);
    return this;
  }

  /** {@inheritDoc} */
  public ShortAssert isGreaterThanOrEqualTo(Short other) {
    comparables.assertGreaterThanOrEqualTo(info, actual, other);
    return this;
  }

  /**
   * Verifies that the actual value is greater than or equal to the given one.
   * @param other the given value to compare the actual value to.
   * @return {@code this} assertion object.
   * @throws AssertionError if the actual value is {@code null}.
   * @throws AssertionError if the actual value is less than the given one.
   */
  public ShortAssert isGreaterThanOrEqualTo(short other) {
    shorts.assertGreaterThanOrEqualTo(info, actual, other);
    return this;
  }
}