/*
 * Copyright © 2023 Institut fuer Kommunikationstechnik - FH-Dortmund (codebase.ikt@fh-dortmund.de)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ict.model.wot.security;

import java.net.URI;
import java.util.List;
import java.util.Map;
import org.ict.model.wot.constant.SecuritySchemaType;
import org.ict.model.wot.security.iface.NoSecuritySchemeIf;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author F. Kohlmorgen
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class NoSecurityScheme extends SecurityScheme implements NoSecuritySchemeIf {

  public NoSecurityScheme() {
    super(null, NoSecurityScheme.class.getName(), SecuritySchemaType.Nosec.getType(), null, null,
        null, null);
  }

  @Builder
  public NoSecurityScheme(SecuritySchemaType scheme, List<String> atType, String description,
      Map<String, String> descriptions, URI proxy) {
    super(null, NoSecurityScheme.class.getName(), scheme.getType(), atType, description,
        descriptions, proxy);
  }
}
