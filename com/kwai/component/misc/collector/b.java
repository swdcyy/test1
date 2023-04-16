package com.kwai.component.misc.collector.b;
import qc5.a;
import java.lang.String;
import java.util.regex.Pattern;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import pc5.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import java.lang.Boolean;
import o56.d;
import oe6.a;
import android.content.Context;
import qc5.b;
import java.lang.Runnable;
import t45.c;

public class b implements a	// class@000a96
{
    public String a;
    public boolean b;
    public boolean c;
    public final AtomicBoolean d;
    public static final Pattern e;

    static {
       b.e = Pattern.compile("^\([A-Za-z]{1}[A-Za-z0-9_]*[\\.|:]\)*[A-Za-z][A-Za-z0-9_]*$");
    }
    public void b(){
       super();
       this.d = new AtomicBoolean(true);
    }
    public String a(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.g()) {
          objArray = this.a;
       }
       return objArray;
    }
    public void b(){
       SharedPreferences$Editor uEditor;
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       if (this.b != null) {
          uEditor = a.a.edit();
          uEditor.putBoolean("IsHotPageUploadAppList", true);
          g.a(uEditor);
       }
       if (this.c != null) {
          uEditor = a.a.edit();
          uEditor.putBoolean("HomeHotApiHasUploadedImeis", true);
          g.a(uEditor);
       }
       this.a = null;
       return;
    }
    public boolean c(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = false;
       if (!d.e && (a.a() && this.d.getAndSet(b))) {
          b = true;
       }
    label_0028 :
       return b;
    }
    public void d(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "5")) {
          return;
       }
       if (!this.g()) {
          return;
       }
       c.a(new b(this, p0));
       return;
    }
    public final boolean e(){
       Object obj = PatchProxy.apply(null, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a.getBoolean("IsHotPageUploadAppList", false);
    }
    public final boolean f(){
       Object obj = PatchProxy.apply(null, this, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a.getBoolean("HomeHotApiHasUploadedImeis", false);
    }
    public final boolean g(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = (!this.e() || !this.f())? true: false;
       return b;
    }
}
