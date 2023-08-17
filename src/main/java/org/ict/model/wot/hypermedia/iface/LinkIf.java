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
package org.ict.model.wot.hypermedia.iface;

import org.cyberborean.rdfbeans.annotations.RDF;
import org.cyberborean.rdfbeans.annotations.RDFBean;

/**
 * @author F. Kohlmorgen
 */
@RDFBean("https://www.w3.org/2019/wot/hypermedia#Link")
public interface LinkIf {
	@RDF("https://www.w3.org/2019/wot/hypermedia#hasTarget")
	String getHref();
	@RDF("https://www.w3.org/2019/wot/hypermedia#hintsAtMediaType")
	String getType();
	@RDF("https://www.w3.org/2019/wot/hypermedia#hasRelationType")
	String getRel();
	@RDF("https://www.w3.org/2019/wot/hypermedia#hasAnchor")
	String getAnchor();
}
