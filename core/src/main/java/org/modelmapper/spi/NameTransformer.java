/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.modelmapper.spi;

/**
 * Transforms eligible property and class names prior to matching.
 * 
 * @author Jonathan Halterman
 */
public interface NameTransformer {
  /**
   * Transforms the {@code name} for the given {@code nameableType}.
   * 
   * @param name to transform
   * @param nameableType to transform name for
   */
  String transform(String name, NameableType nameableType);
}
