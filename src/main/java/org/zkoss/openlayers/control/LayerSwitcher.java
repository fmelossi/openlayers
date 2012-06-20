/* LayerSwitcher.java

{{IS_NOTE
	Purpose:
		
	Description:
		
	History:
		Jun 20, 2012 10:32:38 AM , Created by jumperchen
}}IS_NOTE

Copyright (C) 2012 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
}}IS_RIGHT
*/
package org.zkoss.openlayers.control;

import java.util.Map;

import org.zkoss.json.JSONValue;


/**
 * @author jumperchen
 *
 */
public class LayerSwitcher extends Control {
	public LayerSwitcher() {
		super(null);
	}
	public LayerSwitcher(Map options) {
		super(options);
	}
	
	protected String getNativeClass() {
		return "OpenLayers.Control.LayerSwitcher";
	}
	@Override
	public String toJSONString() {
		return toJSONMap(pair("id", getUuid()),
			  pair("pkg", getNativeClass(), false),
			  pair("options", JSONValue.toJSONString(getOptions())));
	}
}
