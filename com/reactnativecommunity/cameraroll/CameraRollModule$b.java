package com.reactnativecommunity.cameraroll.CameraRollModule$b;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactContext;
import java.lang.String;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import java.lang.Void;
import android.content.ContentResolver;
import android.content.Context;
import java.lang.StringBuilder;
import android.provider.MediaStore$Images$Media;
import android.net.Uri;
import com.yxcorp.gifshow.albumcontrol.a;
import v79.a;
import android.database.Cursor;
import android.content.ContentUris;
import java.lang.Boolean;

public class CameraRollModule$b extends GuardedAsyncTask	// class@000b58
{
    public final Context a;
    public final String b;
    public final ReadableArray c;
    public final Promise d;

    public void CameraRollModule$b(ReactContext p0,String p1,ReadableArray p2,Promise p3){
       super(p0);
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public void doInBackgroundGuarded(Object[] p0){
       ContentResolver contentResol = this.a.getContentResolver();
       String[] stringArray = new String[]{"_id"};
       String str = "?";
       for (int i = 1; i < this.c.size(); i = i + 1) {
          str = str+", ?";
       }
       String str1 = "_data IN \("+str+"\)";
       Uri eXTERNAL_CON = MediaStore$Images$Media.EXTERNAL_CONTENT_URI;
       String[] stringArray1 = new String[this.c.size()];
       int i1 = 0;
       for (int i2 = 0; i2 < this.c.size(); i2 = i2 + 1) {
          stringArray1[i2] = Uri.parse(this.c.getString(i2)).getPath();
       }
       a uoa = a.b.j(this.b, contentResol, eXTERNAL_CON, stringArray, str1, stringArray1, null);
       if (uoa == null || uoa.a() == null) {
          this.d.reject("E_UNABLE_TO_DELETE", "Has no access to Privacy Kit");
       }
       Cursor uCursor = uoa.a();
       while (uCursor.moveToNext()) {
          if (contentResol.delete(ContentUris.withAppendedId(MediaStore$Images$Media.EXTERNAL_CONTENT_URI, uCursor.getLong(uCursor.getColumnIndexOrThrow("_id"))), null, null) == 1) {
             i1 = i1 + 1;
          }
       }
       uCursor.close();
       if (i1 == this.c.size()) {
          this.d.resolve(Boolean.TRUE);
       }else {
          this.d.reject("E_UNABLE_TO_DELETE", "Could not delete all media, only deleted "+i1+" photos.");
       }
       return;
    }
}
