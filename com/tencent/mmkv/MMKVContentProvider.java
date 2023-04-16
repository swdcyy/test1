package com.tencent.mmkv.MMKVContentProvider;
import android.content.ContentProvider;
import android.content.Context;
import android.net.Uri;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Object;
import android.app.ActivityManager;
import java.util.List;
import java.util.Iterator;
import android.app.ActivityManager$RunningAppProcessInfo;
import android.content.ComponentName;
import java.lang.Class;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import java.lang.Exception;
import android.os.Bundle;
import java.lang.UnsupportedOperationException;
import android.content.ContentValues;
import com.tencent.mmkv.MMKV;
import com.tencent.mmkv.ParcelableMMKV;
import android.os.Parcelable;
import android.database.Cursor;

public class MMKVContentProvider extends ContentProvider	// class@000f25
{
    public static Uri gUri;

    public void MMKVContentProvider(){
       super();
    }
    public static Uri contentUri(Context p0){
       Uri gUri = MMKVContentProvider.gUri;
       if (gUri != null) {
          return gUri;
       }
       gUri = null;
       if (p0 == null) {
          return gUri;
       }
       String str = MMKVContentProvider.queryAuthority(p0);
       if (str == null) {
          return gUri;
       }
       Uri uri = Uri.parse("content://"+str);
       MMKVContentProvider.gUri = uri;
       return uri;
    }
    public static String getProcessNameByPID(Context p0,int p1){
       ActivityManager systemServic = p0.getSystemService("activity");
       if (systemServic != null) {
          Iterator iterator = systemServic.getRunningAppProcesses().iterator();
          while (iterator.hasNext()) {
             ActivityManager$RunningAppProcessInfo runningAppPr = iterator.next();
             if (runningAppPr.pid == p1) {
                return runningAppPr.processName;
             }
          }
       }
       return "";
    }
    public static String queryAuthority(Context p0){
       try{
          ComponentName uComponentNa = new ComponentName(p0, MMKVContentProvider.class.getName());
          PackageManager packageManag = p0.getPackageManager();
          if (packageManag != null) {
             ProviderInfo providerInfo = packageManag.getProviderInfo(uComponentNa, 0);
             if (providerInfo != null) {
                return providerInfo.authority;
             }
          }
       }catch(java.lang.Exception e2){
          e2.printStackTrace();
       }
       return null;
    }
    public Bundle call(String p0,String p1,Bundle p2){
       if (p0.equals("mmkvFromAshmemID") && p2 != null) {
          int intx = p2.getInt("KEY_SIZE");
          int intx1 = p2.getInt("KEY_MODE");
          String str = p2.getString("KEY_CRYPT");
          try{
             return this.mmkvFromAshmemID(p1, intx, intx1, str);
          }catch(java.lang.Exception e4){
             e4.getMessage();
          }
       label_0026 :
          return v0;
       }else {
          goto label_0026 ;
       }
    }
    public int delete(Uri p0,String p1,String[] p2){
       throw new UnsupportedOperationException("Not implement in MMKV");
    }
    public String getType(Uri p0){
       return null;
    }
    public Uri insert(Uri p0,ContentValues p1){
       throw new UnsupportedOperationException("Not implement in MMKV");
    }
    public final Bundle mmkvFromAshmemID(String p0,int p1,int p2,String p3){
       MMKV mMKV = MMKV.mmkvWithAshmemID(this.getContext(), p0, p1, p2, p3);
       ParcelableMMKV parcelableMM = new ParcelableMMKV(mMKV);
       mMKV.ashmemFD();
       mMKV.ashmemMetaFD();
       Bundle uBundle = new Bundle();
       uBundle.putParcelable("KEY", parcelableMM);
       return uBundle;
    }
    public boolean onCreate(){
       Context context = this.getContext();
       boolean b = false;
       if (context == null) {
          return b;
       }
       String str = MMKVContentProvider.queryAuthority(context);
       if (str == null) {
          return b;
       }
       if (MMKVContentProvider.gUri == null) {
          MMKVContentProvider.gUri = Uri.parse("content://"+str);
       }
       return true;
    }
    public Cursor query(Uri p0,String[] p1,String p2,String[] p3,String p4){
       throw new UnsupportedOperationException("Not implement in MMKV");
    }
    public int update(Uri p0,ContentValues p1,String p2,String[] p3){
       throw new UnsupportedOperationException("Not implement in MMKV");
    }
}
