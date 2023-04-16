package c.t.m.g.dw;
import java.lang.String;
import java.io.UnsupportedEncodingException;
import android.content.Context;
import android.os.Build;
import java.util.HashMap;
import c.t.m.g.ei;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.StringBuilder;
import c.t.m.g.ed;
import c.t.m.g.eh;
import java.lang.System;
import android.content.Intent;
import android.content.ComponentName;
import com.kwai.plugin.dva.feature.core.hook.a;
import java.lang.Throwable;

public class dw	// class@000c59
{

    public static String a(int p0){
       int i1;
       String str;
       byte[] uobyteArray = new byte[22]{0x9c,0x90,0x92,0xd1,0x8b,0x9a,0x91,0x9c,0x9a,0x91,0x8b,0xd1,0x92,0x9e,0x8f,0xd1,0x88,0x9e,0x94,0x9a,0x8a,0x8f};
       p0 = (((p0 * 7) + 15) > 15)? 21: 15;
       byte[] uobyteArray1 = new byte[p0];
       int i = 0;
       while (i < p0) {
          if (p0 > 15 && i > 9) {
             i1 = i + 1;
             i1 = ~ uobyteArray[i1];
             uobyteArray1[i] = (byte)i1;
          }else {
             i1 = ~ uobyteArray[i];
             uobyteArray1[i] = (byte)i1;
          }
          i = i + 1;
       }
       try{
          str = new String(uobyteArray1, "UTF-8");
       }catch(java.io.UnsupportedEncodingException e5){
          e5.printStackTrace();
          str = "";
       }
       return str;
    }
    public static void a(Context p0){
       String str = "location_invoke_map_count";
       String str1 = "location_invoke_map_time";
       String str2 = "LocationSDK";
       String mANUFACTURER = Build.MANUFACTURER;
       boolean b = Boolean.parseBoolean(ei.a().get("enable_invoke_map"));
       ed.a("ManHattanStrategy", "invokeMap start, manufacturer = "+mANUFACTURER+", control = "+b);
       if (b && (!mANUFACTURER.equals("Meizu") && (mANUFACTURER.equals("samsung") || mANUFACTURER.equals("OnePlus")))) {
          int i = eh.a(str2, str, 0);
          StringBuilder str3 = "invokeMap middle, result = ";
          boolean b1 = ((v13 = (System.currentTimeMillis() - eh.a(str2, str1, 0)) - 0x5265c00) > 0 && i <= 5)? true: false;
          ed.a("ManHattanStrategy", str3+b1);
          if (v13 > 0 && i <= 5) {
             eh.b(str2, str1, System.currentTimeMillis());
             eh.b(str2, str, (i + 1));
             Intent intent = new Intent();
             intent.setPackage(dw.a(0));
             intent.setAction(dw.a(1));
             intent.putExtra("source", "location_official");
             a.e(p0, intent);
             ed.a("ManHattanStrategy", "invokeMap end, "+dw.a(0)+", "+dw.a(1));
          }
       }
    label_00d9 :
       return;
    }
}
