/*
 * Created on Oct 24, 2010
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
import org.fest.assertions.data.Offset;
import org.fest.assertions.internal.*;
import org.fest.util.VisibleForTesting;

/**
 * Assertion methods for floats. To create an instance of this class, use the factory methods
 * <code>{@link Assertions#assertThat(Float)}</code> or <code>{@link Assertions#assertThat(float)}</code>.
 *
 * @author Yvonne Wang
 * @author Alex Ruiz
 * @author Ansgar Konermann
 */
public class FloatAssert extends GenericAssert<FloatAssert, Float> implements ComparableAssert<Float>, FloatingPointNumberAssert<Float> {

  @VisibleForTesting Comparables comparables = Comparables.instance();
  @VisibleForTesting Floats floats = Floats.instance();

  protected FloatAssert(Float actual) {
    super(actual);
  }

  /**
   * Verifies that the actual value is equal to the given one.
   * @param expected the given value to compare the actual value to.
   * @return {@code this} assertion object.
   * @throws AssertionError if the actual value is {@code null}.
   * @throws AssertionError if the actual value is not equal to the given one.
   */
  public FloatAssert isEqualTo(float expected) {
    floats.assertEqual(info, actual, expected);
    return this;
  }

  /** {@inheritDoc} */
  public FloatAssert isEqualTo(Float expected, Offset<Float> offset) {
    floats.assertEqual(info, actual, expected, offset);
    return this;
  }

  /**
   * Verifies that the actual value is equal to the given one, within a positive offset.
   * @param expected the given value to compare the actual value to.
   * @param offset the given positive offset.
   * @return {@code this} assertion object.
   * @throws NullPointerException if the given offset is {@code null}.
   * @throws AssertionError if the actual value is {@code null}.
   * @throws AssertionError if the actual value is not equal to the given one.
   */
  public FloatAssert isEqualTo(float expected, Offset<Float> offset) {
    floats.assertEqual(info, actual, expected, offset);
    return this;
  }

  /**
   * Verifies that the actual value is not equal to the given one.
   * @param other the given value to compare the actual value to.
   * @return {@code this} assertion object.
   * @throws AssertionError if the actual value is {@code null}.
   * @throws AssertionError if the actual value is equal to the given one.
   */
  public FloatAssert isNotEqualTo(float other) {
    floats.assertNotEqual(info, actual, other);
    return this;
  }

  /** {@inheritDoc} */
  public FloatAssert isZero() {
    floats.assertIsZero(info, actual);
    return this;
  }

  /** {@inheritDoc} */
  public FloatAssert isNotZero() {
    floats.assertIsNotZero(info, actual);
    return this;
  }

  /** {@inheritDoc} */
  public FloatAssert isPositive() {
    floats.assertIsPositive(info, actual);
    return this;
  }

  /** {@inheritDoc} */
  public FloatAssert isNegative() {
    floats.assertIsNegative(info, actual);
    return this;
  }

  /** {@inheritDoc} */
  public FloatAssert isLessThan(Float other) {
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
  public FloatAssert isLessThan(float other) {
    floats.assertLessThan(info, actual, other);
    return this;
  }

  /** {@inheritDoc} */
  public FloatAssert isLessThanOrEqualTo(Float other) {
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
  public FloatAssert isLessThanOrEqualTo(float other) {
    floats.assertLessThanOrEqualTo(info, actual, other);
    return this;
  }

  /** {@inheritDoc} */
  public FloatAssert isGreaterThan(Float other) {
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
  public FloatAssert isGreaterThan(float other) {
    floats.assertGreaterThan(info, actual, other);
    return this;
  }

  /** {@inheritDoc} */
  public FloatAssert isGreaterThanOrEqualTo(Float other) {
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
  public FloatAssert isGreaterThanOrEqualTo(float other) {
    floats.assertGreaterThanOrEqualTo(info, actual, other);
    return this;
  }
}