package iq8.p;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.tachikoma.core.bridge.c;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import zp8.a;
import wp8.a;
import android.graphics.Color;

public class p	// class@00271c
{

    public void p(){
       super();
    }
    public static int a(int p0,int p1){
       if (p1 == 255) {
          return p0;
       }
       if (!p1) {
          return (p0 & 0xffffff);
       }
       return ((p0 & 0xffffff) | ((((p0 >> 24) * (p1 + (p1 >> 7))) >> 8) << 24));
    }
    public static int b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, p.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return p.c(p0, null);
    }
    public static int c(String p0,c p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, p.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (TextUtils.isEmpty(p0)) {
          return i;
       }
       StringBuilder str = 35;
       if (p0.charAt(i) == str) {
          return p.e(p0, p1);
       }
       if (p0.charAt(i) == 'r') {
          p.d(p1, new IllegalArgumentException("Wrong color format rgb\(\) or rgba\(\), "+p0));
          return i;
       }else if(p0.charAt(i) != str && (p0.length() == 6 || p0.length() == 8)){
          a.i("TKColorUtil", "Wrong color format without \'#\' header, "+p0);
          return p.e("#"+p0, p1);
       }else {
          p.d(p1, new IllegalArgumentException("Unknown color format, "+p0));
          return i;
       }
    }
    public static void d(c p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, p.class, "4")) {
          return;
       }
       int i = -1;
       if (p0 != null) {
          i = p0.i();
       }
       a.b(p1, i);
       return;
    }
    public static int e(String p0,c p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, p.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = Color.parseColor(p0);
       if (p0.length() == 9) {
          i = (i >> 8) | ((i & 0x00ff) << 24);
       }
       return i;
    }
}
