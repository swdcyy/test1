package com.reactnativecommunity.cameraroll.CameraRollModule$c;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactContext;
import java.lang.String;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.Promise;
import com.reactnativecommunity.cameraroll.CameraRollModule$a;
import java.util.HashSet;
import java.lang.Object;
import java.lang.Void;
import java.lang.StringBuilder;
import java.util.ArrayList;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.facebook.react.bridge.WritableNativeMap;
import android.content.ContentResolver;
import android.content.Context;
import com.yxcorp.gifshow.albumcontrol.a;
import android.net.Uri;
import android.provider.MediaStore$Files;
import android.net.Uri$Builder;
import com.reactnativecommunity.cameraroll.CameraRollModule;
import v79.a;
import android.database.Cursor;
import com.facebook.react.bridge.WritableMap;
import java.util.Set;
import java.lang.Integer;
import java.lang.Throwable;

public class CameraRollModule$c extends GuardedAsyncTask	// class@000b59
{
    public final Context a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final ReadableArray f;
    public final Promise g;
    public final String h;
    public final long i;
    public final long j;
    public final Set k;

    public void CameraRollModule$c(ReactContext p0,String p1,int p2,String p3,String p4,ReadableArray p5,String p6,long p7,long p8,ReadableArray p9,Promise p10,CameraRollModule$a p11){
       super(p0);
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p10;
       this.h = p6;
       this.i = p7;
       this.j = p8;
       HashSet hashSet = new HashSet();
       if (p9 == null) {
       }else {
          int i = 0;
          while (i < p9.size()) {
             String str = p9.getString(i);
             if (str != null) {
                hashSet.add(str);
             }
             i++;
          }
       }
       this.k = hashSet;
       return;
    }
    public void doInBackgroundGuarded(Object[] p0){
       String str4;
       String str = "limit=";
       StringBuilder str1 = "1";
       ArrayList uArrayList = new ArrayList();
       if (!TextUtils.isEmpty(this.e)) {
          str1 = str1+" AND bucket_display_name = ?";
          uArrayList.add(this.e);
       }
       String str2 = "Photos";
       if ((this.h).equals(str2)) {
          str1 = str1+" AND media_type = 1";
       label_0051 :
          CameraRollModule$c tf = this.f;
          int i = 0;
          if (tf != null && tf.size() > 0) {
             str1 = str1+" AND mime_type IN \(";
             for (int i1 = 0; i1 < this.f.size(); i1 = i1 + 1) {
                str1 = str1+"?,";
                uArrayList.add(this.f.getString(i1));
             }
             str1.replace((str1.length() - 1), str1.length(), "\)");
          }
          String str3 = "";
          CameraRollModule$c uoc = null;
          if (this.i - uoc > 0) {
             str1 = str1+" AND datetaken > ?";
             uArrayList.add(this.i+str3);
          }
          if (this.j - uoc > 0) {
             str1 = str1+" AND datetaken <= ?";
             uArrayList.add(this.j+str3);
          }
          WritableNativeMap writableNati = new WritableNativeMap();
          ContentResolver contentResol = this.a.getContentResolver();
          try{
             str4 = str+(this.c + 1);
             if (!TextUtils.isEmpty(this.d)) {
                str4 = str+this.d+","+(this.c + 1);
             }
             String[] stringArray = new String[uArrayList.size()];
             a uoa = a.b.j(this.b, contentResol, MediaStore$Files.getContentUri("external").buildUpon().encodedQuery(str4).build(), CameraRollModule.PROJECTION, str1, uArrayList.toArray(stringArray), "date_added DESC, date_modified DESC");
             if (uoa == null || uoa.a() == null) {
                this.g.reject("E_UNABLE_TO_LOAD", "Could not get media");
             }else {
                Cursor uCursor = uoa.a();
                CameraRollModule.putEdges(contentResol, uCursor, writableNati, this.c, this.k);
                CameraRollModule$c tc = this.c;
                if (!TextUtils.isEmpty(this.d)) {
                   i = Integer.parseInt(this.d);
                }
                CameraRollModule.putPageInfo(uCursor, writableNati, tc, i);
                uCursor.close();
                this.g.resolve(writableNati);
             }
          }catch(java.lang.SecurityException e14){
             this.g.reject("E_UNABLE_TO_LOAD_PERMISSION", "Could not get media: need READ_EXTERNAL_STORAGE permission", e14);
          }
       }else {
          String str5 = "Videos";
          if ((this.h).equals(str5)) {
             str1 = str1+" AND media_type = 3";
             goto label_0051 ;
          }else {
             str4 = "All";
             if ((this.h).equals(str4)) {
                str1 = str1+" AND media_type IN \(3,1\)";
                goto label_0051 ;
             }else {
                this.g.reject("E_UNABLE_TO_FILTER", "Invalid filter option: \'"+this.h+"\'. Expected one of \'"+str2+"\', \'"+str5+"\' or \'"+str4+"\'.");
             }
          }
       }
    }
}
