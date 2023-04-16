package c.t.m.g.ab;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import android.net.Uri;
import android.os.Build$VERSION;
import android.content.ContentResolver;
import android.content.ContentProviderClient;
import android.os.Bundle;
import java.lang.Throwable;
import c.t.m.g.bt;

public class ab	// class@000bb3
{
    public final String a;
    public Context b;

    public void ab(Context p0){
       super();
       this.a = "NubiaDeviceIDHelper";
       this.b = p0;
    }
    public String a(){
       int i;
       Uri uri = Uri.parse("content://cn.nubia.identity/identity");
       try{
          i = 0;
          ContentProviderClient uContentProv = this.b.getContentResolver().acquireContentProviderClient(uri);
          Bundle uBundle = uContentProv.call("getOAID", i, i);
          if (Build$VERSION.SDK_INT >= 24) {
             uContentProv.close();
          }else {
             uContentProv.release();
          }
          if (!uBundle.getInt("code", -1)) {
             return uBundle.getString("id");
          }else {
             uBundle.getString("message");
             return i;
          }
       }catch(java.lang.Exception e0){
          bt.a("NubiaDeviceIDHelper", "getID", e0);
          return i;
       }
    }
}
