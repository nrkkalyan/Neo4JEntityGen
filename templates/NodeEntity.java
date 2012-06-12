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

import org.neo4j.helpers.collection.IteratorUtil;
import org.springframework.data.neo4j.annotation.*;
import org.springframework.data.neo4j.support.index.IndexType;

import java.util.*;

_IMPORTS_

/**
 * 
 * _COMMENTS_
 * 
 */
@NodeEntity(_PARAMS_)
public class _ENTITY_ extends BaseNode {
	private static final long serialVersionUID = 1L;

    _@Indexed_FIELDS_

    _@RelatedTo_

    _@RelatedTo_

    _@RelatedToVia_
    
    _@Query_

    _NON_Indexed_FIELDS_


    public _ENTITY_() {
    }

    public _ENTITY_(_ARGS_) {
        _SET_FIELDS_
    }

    _GETTER_AND_SETTER_
    

    @Override
    public String toString() {
    	String str = _TO_STRING_;
        return str;
    }
      
}

