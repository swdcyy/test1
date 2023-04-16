package com.kwai.privacykit.interceptor.ClipboardInterceptor;
import java.util.WeakHashMap;
import java.util.Map;
import java.util.Collections;
import java.lang.String;
import wk7.f;
import tk7.j;
import com.kwai.privacykit.interceptor.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.content.ClipboardManager;
import android.content.ClipboardManager$OnPrimaryClipChangedListener;
import wk7.j;
import android.content.ClipData;
import c97.d;
import android.content.Context;
import com.kwai.privacykit.interceptor.b;
import com.kwai.privacykit.interceptor.a;
import java.lang.CharSequence;
import android.content.ClipData$Item;

public class ClipboardInterceptor	// class@0013c3
{
    public static Map a;
    public static boolean b;
    public static boolean c;
    public static ClipData d;

    static {
       ClipboardInterceptor.a = Collections.synchronizedMap(new WeakHashMap());
       ClipboardInterceptor.b = true;
       ClipboardInterceptor.c = true;
       f.a("ClipboardInterceptor", "static initializer: ");
       if (j.i()) {
          ClipboardInterceptor.e();
          ClipboardInterceptor.d();
       }else {
          c a = c.a;
          if (!PatchProxy.applyVoidOneRefs(a, null, j.class, "42")) {
             j.f.put(a, new Object());
          }
       }
    }
    public void ClipboardInterceptor(){
       super();
    }
    public static boolean a(){
       Object obj = PatchProxy.apply(null, null, ClipboardInterceptor.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (j.i() && (!j.l() || ClipboardInterceptor.b))? true: false;
       return b;
    }
    public static void addPrimaryClipChangedListener(ClipboardManager p0,ClipboardManager$OnPrimaryClipChangedListener p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, ClipboardInterceptor.class, "11")) {
          return;
       }
       f.a("ClipboardInterceptor", "addPrimaryClipChangedListener: ");
       if (p1 != null) {
          if (!j.i()) {
             j.d("clipboard", "addPrimaryClipChangedListener");
          }
          ClipboardInterceptor.a.put(p1, new Object());
       }
       return;
    }
    public static ClipData b(){
       ClipboardInterceptor uClipboardIn = ClipboardInterceptor.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, objArray, uClipboardIn, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (j.l() && (ClipboardInterceptor.c && !PatchProxy.applyVoid(objArray, objArray, uClipboardIn, "4"))) {
          ClipboardManager systemServic = d.a().d().getSystemService("clipboard");
          if (systemServic.hasPrimaryClip()) {
             f.a("ClipboardInterceptor", "updateClipData: hasPrimaryClip is true");
             ClipboardInterceptor.d = systemServic.getPrimaryClip();
          }else {
             f.a("ClipboardInterceptor", "updateClipData: hasPrimaryClip is false");
             ClipboardInterceptor.d = objArray;
          }
          ClipboardInterceptor.c = false;
       }
       return ClipboardInterceptor.d;
    }
    public static void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, ClipboardInterceptor.class, "6")) {
          return;
       }
       j.e("clipboard", p0, j.i());
       p0 = (ClipboardInterceptor.b)? "not agree user license": "getPrimaryClip app is background";
       f.a("ClipboardInterceptor", p0);
       return;
    }
    public static void d(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, ClipboardInterceptor.class, "1")) {
          return;
       }
       f.a("ClipboardInterceptor", "registerAppLifeEventListener: ");
       b a = b.a;
       if (!PatchProxy.applyVoidOneRefs(a, objArray, j.class, "44")) {
          j.g.put(a, new Object());
       }
       return;
    }
    public static void e(){
       if (PatchProxy.applyVoid(null, null, ClipboardInterceptor.class, "2")) {
          return;
       }
       d.a().d().getSystemService("clipboard").addPrimaryClipChangedListener(a.a);
       return;
    }
    public static ClipData getPrimaryClip(ClipboardManager p0){
       p0 = PatchProxy.applyOneRefs(p0, null, ClipboardInterceptor.class, "5");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       f.a("ClipboardInterceptor", "getPrimaryClip: ");
       if (ClipboardInterceptor.a()) {
          return ClipboardInterceptor.b();
       }
       ClipboardInterceptor.c("ClipboardInterceptor#getPrimaryClip");
       return ClipData.newPlainText("", "");
    }
    public static CharSequence getText(ClipboardManager p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ClipboardInterceptor uClipboardIn = ClipboardInterceptor.class;
       p0 = PatchProxy.applyOneRefs(p0, null, uClipboardIn, "9");
       if (p0 != patchProxyRe) {
          return p0;
       }
       f.a("ClipboardInterceptor", "getText: ");
       String str = "";
       if (ClipboardInterceptor.a()) {
          ClipData uClipData = ClipboardInterceptor.b();
          Object obj = PatchProxy.applyOneRefs(uClipData, null, uClipboardIn, "10");
          if (obj != patchProxyRe) {
             str = obj;
          }else if(uClipData != null && uClipData.getItemCount() > 0){
             str = uClipData.getItemAt(0).getText();
          }
          return str;
       }else {
          ClipboardInterceptor.c("ClipboardInterceptor#getText");
          return str;
       }
    }
    public static void removePrimaryClipChangedListener(ClipboardManager p0,ClipboardManager$OnPrimaryClipChangedListener p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, ClipboardInterceptor.class, "12")) {
          return;
       }
       ClipboardInterceptor.a.remove(p1);
       return;
    }
}
