
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


import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*


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
		switch (iconname){
            case "Icon1":
                this.getPackageManager().setComponentEnabledSetting(new ComponentName((Context)this, Icon1.class), 1, 1);
                this.getPackageManager().setComponentEnabledSetting(new ComponentName((Context)this, Icon2.class), 2, 1);
                this.getPackageManager().setComponentEnabledSetting(new ComponentName((Context)this, Icon3.class), 2, 1);
                this.getPackageManager().setComponentEnabledSetting(new ComponentName((Context)this, Icon4.class), 2, 1);
				this.getPackageManager().setComponentEnabledSetting(new ComponentName((Context)this, Icon5.class), 2, 1);
                Toast.makeText((Context)this, (CharSequence)"Launcher "+iconname+" has been applied successfully", 0).show();
                break;
            case "Icon2":
                this.getPackageManager().setComponentEnabledSetting(new ComponentName((Context)this, Icon1.class), 2, 1);
                this.getPackageManager().setComponentEnabledSetting(new ComponentName((Context)this, Icon2.class), 1, 1);
                this.getPackageManager().setComponentEnabledSetting(new ComponentName((Context)this, Icon3.class), 2, 1);
                this.getPackageManager().setComponentEnabledSetting(new ComponentName((Context)this, Icon4.class), 2, 1);
				this.getPackageManager().setComponentEnabledSetting(new ComponentName((Context)this, Icon5.class), 2, 1);
                Toast.makeText((Context)this, (CharSequence)"Launcher "+iconname+" has been applied successfully", 0).show();
                break;
            case "Icon3":
                this.getPackageManager().setComponentEnabledSetting(new ComponentName((Context)this, Icon1.class), 2, 1);
                this.getPackageManager().setComponentEnabledSetting(new ComponentName((Context)this, Icon2.class), 2, 1);
                this.getPackageManager().setComponentEnabledSetting(new ComponentName((Context)this, Icon3.class), 1, 1);
                this.getPackageManager().setComponentEnabledSetting(new ComponentName((Context)this, Icon4.class), 2, 1);
				this.getPackageManager().setComponentEnabledSetting(new ComponentName((Context)this, Icon5.class), 2, 1);
                Toast.makeText((Context)this, (CharSequence)"Launcher "+iconname+" has been applied successfully", 0).show();
                break;
            case "Icon4":
                this.getPackageManager().setComponentEnabledSetting(new ComponentName((Context)this, Icon1.class), 2, 1);
                this.getPackageManager().setComponentEnabledSetting(new ComponentName((Context)this, Icon2.class), 2, 1);
                this.getPackageManager().setComponentEnabledSetting(new ComponentName((Context)this, Icon3.class), 2, 1);
                this.getPackageManager().setComponentEnabledSetting(new ComponentName((Context)this, Icon4.class), 1, 1);
				this.getPackageManager().setComponentEnabledSetting(new ComponentName((Context)this, Icon5.class), 2, 1);
                Toast.makeText((Context)this, (CharSequence)"Launcher "+iconname+" has been applied successfully", 0).show();
                break;
            case "Icon5":
                this.getPackageManager().setComponentEnabledSetting(new ComponentName((Context)this, Icon1.class), 2, 1);
                this.getPackageManager().setComponentEnabledSetting(new ComponentName((Context)this, Icon2.class), 2, 1);
                this.getPackageManager().setComponentEnabledSetting(new ComponentName((Context)this, Icon3.class), 2, 1);
                this.getPackageManager().setComponentEnabledSetting(new ComponentName((Context)this, Icon4.class), 2, 1);
				this.getPackageManager().setComponentEnabledSetting(new ComponentName((Context)this, Icon5.class), 1, 1);
                Toast.makeText((Context)this, (CharSequence)"Launcher "+iconname+" has been applied successfully", 0).show();
                break;
            default:
                Toast.makeText((Context)this, (CharSequence)"Invalid icon name", 0).show();
                break;
        }
		
            callbackContext.success("Plugin Success");
         
       // return compressedBase64;
    }
    
    

}
