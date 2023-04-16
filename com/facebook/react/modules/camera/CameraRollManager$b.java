package com.facebook.react.modules.camera.CameraRollManager$b;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactContext;
import java.lang.String;
import com.facebook.react.bridge.ReadableArray;
import java.lang.Integer;
import com.facebook.react.bridge.Promise;
import com.facebook.react.modules.camera.CameraRollManager$a;
import java.lang.Object;
import java.lang.Void;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.util.ArrayList;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Objects;
import com.facebook.react.bridge.WritableNativeMap;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.MediaStore$Files;
import com.facebook.react.modules.camera.CameraRollManager;
import android.database.Cursor;
import com.facebook.react.bridge.WritableMap;
import java.lang.Throwable;

public class CameraRollManager$b extends GuardedAsyncTask	// class@00127d
{
    public final Context a;
    public final int b;
    public final String c;
    public final String d;
    public final ReadableArray e;
    public final Promise f;
    public final String g;
    public final Integer h;

    public void CameraRollManager$b(ReactContext p0,int p1,String p2,String p3,ReadableArray p4,String p5,Integer p6,Promise p7,CameraRollManager$a p8){
       super(p0);
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p7;
       this.g = p5;
       this.h = p6;
    }
    public void doInBackgroundGuarded(Object[] p0){
       Object obj;
       try{
          obj = this;
          String str = "1";
          if (PatchProxy.applyVoidOneRefs(p0, obj, CameraRollManager$b.class, str)) {
          }else {
             StringBuilder str1 = str;
             ArrayList uArrayList = new ArrayList();
             if (!TextUtils.isEmpty(obj.c)) {
                str1 = str1+" AND datetaken < ?";
                uArrayList.add(obj.c);
             }
             if (!TextUtils.isEmpty(obj.d)) {
                str1 = str1+" AND bucket_display_name = ?";
                uArrayList.add(obj.d);
             }
             if (obj.h != null) {
                str1 = str1+" AND _size < ?";
                uArrayList.add(obj.h.toString());
             }
             CameraRollManager$b g = obj.g;
             Objects.requireNonNull(g);
             int i = -1;
             int i1 = 0;
             switch (g.hashCode()){
                 case 0x8e7174a1:
                   if (g.equals("Photos")) {
                      i = 0;
                   }
                   break;
                 case 0x98b76778:
                   if (g.equals("Videos")) {
                      i = 1;
                   }
                   break;
                 case 0x10181:
                   if (g.equals("All")) {
                      i = 2;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   str1 = str1+" AND media_type = 1";
                label_00cf :
                   g = obj.e;
                   if (g != null && g.size() > 0) {
                      str1 = str1+" AND mime_type IN \(";
                      for (; i1 < obj.e.size(); i1 = i1 + 1) {
                         str1 = str1+"?,";
                         uArrayList.add(obj.e.getString(i1));
                      }
                      str1.replace((str1.length() - 1), str1.length(), "\)");
                   }
                   WritableNativeMap writableNati = new WritableNativeMap();
                   ContentResolver contentResol = obj.a.getContentResolver();
                   String[] stringArray = new String[uArrayList.size()];
                   Cursor uCursor = contentResol.query(MediaStore$Files.getContentUri("external"), CameraRollManager.PROJECTION, str1, uArrayList.toArray(stringArray), "datetaken DESC, date_modified DESC LIMIT "+(obj.b + 1));
                   if (uCursor == null) {
                      obj.f.reject("E_UNABLE_TO_LOAD", "Could not get media");
                   }else {
                      CameraRollManager.putEdges(contentResol, uCursor, writableNati, obj.b);
                      CameraRollManager.putPageInfo(uCursor, writableNati, obj.b);
                      uCursor.close();
                      obj.f.resolve(writableNati);
                   }
                   break;
                 case 1:
                   str1 = str1+" AND media_type = 3";
                   goto label_00cf ;
                   break;
                 case 2:
                   str1 = str1+" AND media_type IN \(3,1\)";
                   goto label_00cf ;
                   break;
                 default:
                   obj.f.reject("E_UNABLE_TO_FILTER", "Invalid filter option: \'"+obj.g+"\'. Expected one of \'"+"Photos"+"\', \'"+"Videos"+"\' or \'"+"All"+"\'.");
             }
          }
       }catch(java.lang.SecurityException e0){
          obj.f.reject("E_UNABLE_TO_LOAD_PERMISSION", "Could not get media: need READ_EXTERNAL_STORAGE permission", e0);
       }
       return;
    }
}
