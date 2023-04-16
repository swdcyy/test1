package dj5.a;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import qj7.d;
import java.lang.CharSequence;
import msd.l;
import kotlin.collections.ArraysKt___ArraysKt;
import java.util.Collection;
import trd.y;
import com.kwai.dva.hook_namespace.NamespaceHook;
import android.os.Build$VERSION;
import java.lang.ClassLoader;
import com.kwai.robust.PatchProxyResult;
import java.lang.Throwable;
import qrd.i;
import java.util.List;
import java.lang.NullPointerException;
import java.lang.System;
import qrd.l1;

public final class a	// class@0014bf
{
    public static final a a;
    public static final List b;
    public static String c;
    public static boolean d;

    static {
       a.a = new a();
       a.b = new ArrayList();
    }
    public void a(){
       super();
    }
    public synchronized final void a(String[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       a.p(p0, "soList");
       d.c(a.C("add library that be loaded by host namespace, size=", Integer.valueOf(p0.length)));
       d.a(ArraysKt___ArraysKt.Gg(p0, null, null, null, 0, null, null, 63, null));
       if (a.c == null) {
          y.s0(a.b, p0);
       }else {
          NamespaceHook.a(p0);
       }
       return;
    }
    public final boolean b(){
       boolean b = (Build$VERSION.SDK_INT >= 28)? true: false;
       return b;
    }
    public final boolean c(){
       boolean b = (Build$VERSION.SDK_INT >= 24)? true: false;
       return b;
    }
    public final String d(ClassLoader p0){
       String obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "target");
       obj = this.f();
       int i = (obj.length() > 0)? 1: 0;
       if (i) {
          return obj;
       }else {
          String str = NamespaceHook.b(p0, NamespaceHook.class.getClassLoader());
          if (str == null) {
             str = "";
          }
       label_0045 :
          return str;
       }
    }
    public synchronized final String e(){
       String obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f();
       int i = 1;
       int i1 = (obj.length() > 0)? 1: 0;
       if (i1) {
          return obj;
       }else {
          obj = a.c;
          if (obj == null) {
             obj = NamespaceHook.c();
             if (obj == null) {
                obj = "";
             }
          label_0044 :
             List list = (!obj.length())? 1: null;
             if (list) {
                list = a.b;
                if (i ^ list.isEmpty()) {
                   d.c(a.C("target so list is not empty, size=", Integer.valueOf(list.size())));
                   String[] stringArray = new String[0];
                   Object[] objArray = list.toArray(stringArray);
                   if (objArray != null) {
                      NamespaceHook.a(objArray);
                      list.clear();
                   }else {
                      throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                   }
                }
             }
             a.c = obj;
             return obj;
          }else {
             return obj;
          }
       }
    }
    public final String f(){
       Object obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!a.d) {
          _monitor_enter(this);
          if (!a.d) {
             d.c("load so: dva-nativehook");
             if (!PatchProxy.applyVoid(null, null, NamespaceHook.class, "1")) {
                System.loadLibrary("dva-nativehook");
             }
             a.d = true;
          }
          _monitor_exit(this);
       }
       return "";
    }
}
