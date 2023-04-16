package com.yxcorp.gifshow.notice.krn.m$b;
import oec.j;
import com.yxcorp.gifshow.notice.krn.m;
import java.lang.ref.WeakReference;
import java.lang.Object;
import android.net.Uri;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import ekd.e0;
import android.content.Context;
import ync.a;
import java.lang.Integer;
import java.lang.Boolean;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import oec.f;

public class m$b extends j	// class@0021ae
{
    public final WeakReference a;

    public void m$b(m p0){
       super();
       this.a = new WeakReference(p0);
    }
    public int b(Uri p0){
       p0 = PatchProxy.applyOneRefs(p0, this, m$b.class, "3");
       if (p0 != PatchProxyResult.class) {
          return p0.intValue();
       }
       int i = a.c(e0.b);
       if (this.a.get() != null) {
          i = this.a.get().l.intValue();
       }
       return i;
    }
    public int c(Uri p0){
       p0 = PatchProxy.applyOneRefs(p0, this, m$b.class, "4");
       if (p0 != PatchProxyResult.class) {
          return p0.intValue();
       }
       int i = a.h(e0.b);
       if (this.a.get() != null) {
          i = (this.a.get().h != null)? this.a.get().m.intValue(): this.a.get().l.intValue();
       }
    label_004a :
       return i;
    }
    public void d(Uri p0){
    }
    public boolean e(){
       Object obj = PatchProxy.apply(null, this, m$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.a.get() != null) {
          return this.a.get().i;
       }
       return false;
    }
    public void f(Uri p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$b.class, "1")) {
          return;
       }
       if (this.a.get() != null && this.a.get().h != null) {
          WritableMap writableMap = Arguments.createMap();
          writableMap.putString("url", p0.toString());
          writableMap.putInt("target", this.a.get().getReactTag());
          int i = 1;
          if (f.g(p0)) {
             i = 2;
          }
          writableMap.putInt("type", i);
          this.a.get().b("topLinkClick", writableMap);
       }
       return;
    }
}
