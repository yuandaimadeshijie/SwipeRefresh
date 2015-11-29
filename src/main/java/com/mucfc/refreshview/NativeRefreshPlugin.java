package com.mucfc.refreshview;

import com.mucfc.framework.CallbackContext;
import com.mucfc.framework.MucfcPlugin;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by neuyuandaima on 2015/11/16.
 */
public class NativeRefreshPlugin extends MucfcPlugin {
    public static final String PLUGIN_NAME = "NativeRefreshPlugin";
    private final String ACTION_APPLY = "callRefresh";

    @Override
    public boolean checkAction(String action) {
        if (ACTION_APPLY.equals(action)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void execute(String action, JSONObject rawArgs, CallbackContext callbackContext) {
        boolean loadFinish = rawArgs.optBoolean("loadFinish", false);
        String refreshMode = rawArgs.optString("refreshMode", "");
        Map<String, Object> map = new HashMap<>();
        map.put("loadFinish", loadFinish);
        map.put("refreshMode", refreshMode);
        cordova.onMessage(PLUGIN_NAME, map);
    }

    @Override
    public Object onMessage(String id, Object data) {
        return super.onMessage(id, data);
    }
}
