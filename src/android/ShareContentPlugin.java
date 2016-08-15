package com.ferdinandsilva.android;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ContentValues;
import android.net.Uri;
import android.app.Activity;
import android.telephony.SmsManager;

import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaInterface;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ShareContentPlugin extends CordovaPlugin {
    public static final String TAG = "ShareContentPlugin";

    public static Context thisContext;

    public ShareContentPlugin() {
    }

    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
        ShareContentPlugin.thisContext = cordova.getActivity().getApplicationContext();
    }
    
    public void share(String text_to_share, CallbackContext callbackContext) {
        
        Intent shareIntent = new Intent();
        shareIntent.setAction(Intent.ACTION_SEND);
        shareIntent.putExtra(Intent.EXTRA_TEXT, text_to_share);
        shareIntent.setType("text/plain");
        shareIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        ShareContentPlugin.thisContext.startActivity(shareIntent);
        callbackContext.success(text_to_share);
    }

    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {

        if ("share".equals(action)) {
            share(args.get(0).toString(), callbackContext);
        } else {
            return false;
        }

        return true;    
    }

}