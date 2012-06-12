/*******************************************************************************
 * Copyright 2012 the original author or authors.
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
 * 
 * Contributors:
 * nrkkalyan@gmail.com
 *******************************************************************************/
_PACKAGE_

import org.springframework.data.neo4j.annotation.EndNode;
import org.springframework.data.neo4j.annotation.RelationshipEntity;
import org.springframework.data.neo4j.annotation.StartNode;


@RelationshipEntity(_PARAMS_)
public class _RELATIONSHIP_ENTITY_ extends BaseNode {
	private static final long serialVersionUID = 1L;
	
    @EndNode
    _END_NODE_ENTITY_
    
    @StartNode
    _START_NODE_ENTITY_

    _FIELDS_
    
    private _RELATIONSHIP_ENTITY_() {
    }

    _GETTER_AND_SETTER_
    
}
