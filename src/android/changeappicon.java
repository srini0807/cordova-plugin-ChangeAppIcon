
package com.cordova.changeappicon;

import org.apache.cordova.*;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.apache.cordova.PluginResult.Status;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

import android.util.Log;
import android.net.Uri;
import android.content.ContentUris;

import android.content.Context;
import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;


public class changeappicon extends CordovaPlugin {
    private static final String TAG = "changeappicon";
    private static final String GET_ChanageToIcon = "ChanageToIcon";



    @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
        Log.i(TAG, "Initializing changeappicon Plugin");
    }

    public boolean execute(String action, CordovaArgs args, CallbackContext callbackContext) throws JSONException {

        if (action.equals(GET_ChanageToIcon)) {
            ChanageToIcon(args.optString(0),callbackContext);
        } else {
            Log.i(TAG, "This action doesn't exist");
            return false;
        }
        return true;
    }

    public void ChanageToIcon(String iconname,  CallbackContext callbackContext) {
        Log.i(TAG, "ChanageToIcon: "+ iconname);
        final Context ct = this.cordova.getActivity().getApplicationContext();
        //final Context ct = cordova.getActivity();
        PackageManager pm = ct.getPackageManager();
        switch (iconname){
            case "Icon1":

                pm.setComponentEnabledSetting(this.cordova.getActivity().getComponentName() , PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
                pm.setComponentEnabledSetting(new ComponentName(ct, "com.tmrw.clrm.Icon1"), PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);
                pm.setComponentEnabledSetting(new ComponentName(ct, "com.tmrw.clrm.Icon2"), PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
                pm.setComponentEnabledSetting(new ComponentName(ct, "com.tmrw.clrm.Icon3"), PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
                pm.setComponentEnabledSetting(new ComponentName(ct, "com.tmrw.clrm.Icon4"), PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
                pm.setComponentEnabledSetting(new ComponentName(ct, "com.tmrw.clrm.Icon5"), PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
                //Toast.makeText(this, "Launcher "+iconname+" has been applied successfully", Toast.LENGTH_LONG).show();
                break;
            case "Icon2":
				pm.setComponentEnabledSetting(this.cordova.getActivity().getComponentName() , PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
                pm.setComponentEnabledSetting(new ComponentName(ct, "com.tmrw.clrm.Icon1"), PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
                pm.setComponentEnabledSetting(new ComponentName(ct, "com.tmrw.clrm.Icon2"), PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);
                pm.setComponentEnabledSetting(new ComponentName(ct, "com.tmrw.clrm.Icon3"), PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
                pm.setComponentEnabledSetting(new ComponentName(ct, "com.tmrw.clrm.Icon4"), PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
                pm.setComponentEnabledSetting(new ComponentName(ct, "com.tmrw.clrm.Icon5"), PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
                //Toast.makeText(this, "Launcher "+iconname+" has been applied successfully", Toast.LENGTH_LONG).show();
                break;
            case "Icon3":
				pm.setComponentEnabledSetting(this.cordova.getActivity().getComponentName() , PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
                pm.setComponentEnabledSetting(new ComponentName(ct, "com.classroom.phoenix.Icon1"), PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
                pm.setComponentEnabledSetting(new ComponentName(ct, "com.classroom.phoenix.Icon2"), PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
                pm.setComponentEnabledSetting(new ComponentName(ct, "com.classroom.phoenix.Icon3"), PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);
                pm.setComponentEnabledSetting(new ComponentName(ct, "com.classroom.phoenix.Icon4"), PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
                pm.setComponentEnabledSetting(new ComponentName(ct, "com.classroom.phoenix.Icon5"), PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
                //Toast.makeText(this, "Launcher "+iconname+" has been applied successfully", Toast.LENGTH_LONG).show();
                break;
            case "Icon4":
				pm.setComponentEnabledSetting(this.cordova.getActivity().getComponentName() , PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
                pm.setComponentEnabledSetting(new ComponentName(ct, "com.classroom.phoenix.Icon1"), PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
                pm.setComponentEnabledSetting(new ComponentName(ct, "com.classroom.phoenix.Icon2"), PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
                pm.setComponentEnabledSetting(new ComponentName(ct, "com.classroom.phoenix.Icon3"), PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
                pm.setComponentEnabledSetting(new ComponentName(ct, "com.classroom.phoenix.Icon4"), PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);
                pm.setComponentEnabledSetting(new ComponentName(ct, "com.classroom.phoenix.Icon5"), PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
                //Toast.makeText(this, "Launcher "+iconname+" has been applied successfully", Toast.LENGTH_LONG).show();
                break;
            case "Icon5":
				pm.setComponentEnabledSetting(this.cordova.getActivity().getComponentName() , PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
                pm.setComponentEnabledSetting(new ComponentName(ct, "com.classroom.phoenix.Icon1"), PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
                pm.setComponentEnabledSetting(new ComponentName(ct, "com.classroom.phoenix.Icon2"), PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
                pm.setComponentEnabledSetting(new ComponentName(ct, "com.classroom.phoenix.Icon3"), PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
                pm.setComponentEnabledSetting(new ComponentName(ct, "com.classroom.phoenix.Icon4"), PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
                pm.setComponentEnabledSetting(new ComponentName(ct, "com.classroom.phoenix.Icon5"), PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);
                //Toast.makeText(this, "Launcher "+iconname+" has been applied successfully", Toast.LENGTH_LONG).show();
                break;
            default:
                //Toast.makeText(this, "Invalid icon name", Toast.LENGTH_LONG).show();
                break;
        }

        callbackContext.success("Plugin Success");

        // return compressedBase64;
    }



}
