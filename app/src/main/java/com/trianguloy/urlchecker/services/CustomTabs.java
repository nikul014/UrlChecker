package com.trianguloy.urlchecker.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import com.trianguloy.urlchecker.BuildConfig;

/**
 * Empty service for fake custom tabs.
 * <p>
 * referrer: https://chromium.googlesource.com/chromium/src/+/b71e98cdf14f18cb967a73857826f6e8c568cea0/chrome/android/java/src/org/chromium/chrome/browser/customtabs/CustomTabsConnectionService.java
 */
public class CustomTabs extends Service {


    @Override
    public void onCreate() {
        log("onCreate");
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        log("onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        log("onDestroy");
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        log("onBind");
        return null;
//        return new IBinder() {
//            @Override
//            public String getInterfaceDescriptor() throws RemoteException {
//                log("getInterfaceDescriptor");
//                return null;
//            }
//
//            @Override
//            public boolean pingBinder() {
//                log("pingBinder");
//                return false;
//            }
//
//            @Override
//            public boolean isBinderAlive() {
//                log("isBinderAlive");
//                return false;
//            }
//
//            @Override
//            public IInterface queryLocalInterface(String descriptor) {
//                log("queryLocalInterface");
//                return null;
//            }
//
//            @Override
//            public void dump(FileDescriptor fd, String[] args) throws RemoteException {
//                log("dump");
//            }
//
//            @Override
//            public void dumpAsync(FileDescriptor fd, String[] args) throws RemoteException {
//                log("dumpAsync");
//            }
//
//            @Override
//            public boolean transact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
//                log("transact");
//                return false;
//            }
//
//            @Override
//            public void linkToDeath(DeathRecipient recipient, int flags) throws RemoteException {
//                log("linkToDeath");
//            }
//
//            @Override
//            public boolean unlinkToDeath(DeathRecipient recipient, int flags) {
//                log("unlinkToDeath");
//                return false;
//            }
//        };
    }

    // ------------------- logging -------------------

    private static final String TAG = "CT-service";

    private void log(String message) {
        if (BuildConfig.DEBUG) {
            Toast.makeText(this, TAG + ": " + message, Toast.LENGTH_SHORT).show();
        }
        Log.d(TAG, message);
    }
}
