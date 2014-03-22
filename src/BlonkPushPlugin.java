package com.blonk.app;

import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.device.Device;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class BlonkPushPlugin extends CordovaPlugin {
	
	/**
     * Executes the request and returns PluginResult.
     *
     * @param action            The action to execute.
     * @param args              JSONArry of arguments for the plugin.
     * @param callbackContext   The callback id used when calling back into JavaScript.
     * @return                  True if the action was valid, false if not.
     */
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("getPushData")) {
            JSONObject r = new JSONObject();
            String data = "this is where data will go.";
            r.put("data", data);
            callbackContext.success(r);
        }
        else {
            return false;
        }
        return true;
    }	 

}
