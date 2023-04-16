package com.kuaishou.android.security.base.util.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.util.Base64;

public class b	// class@000f19
{

    public void b(){
       super();
    }
    public static byte[] a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.b(p0.getBytes());
    }
    public static byte[] a(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Base64.encode(p0, 2);
    }
    public static String b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Base64.encodeToString(p0.getBytes(), 2);
    }
    public static byte[] b(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Base64.decode(p0, 2);
    }
    public static String c(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Base64.encodeToString(p0, 2);
    }
}
