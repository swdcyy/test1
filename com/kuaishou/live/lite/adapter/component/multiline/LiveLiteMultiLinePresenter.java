package com.kuaishou.live.lite.adapter.component.multiline.LiveLiteMultiLinePresenter;
import b93.d;
import com.kuaishou.live.lite.adapter.component.multiline.LiveLiteMultiLinePresenter$bizObserver$1;
import sa3.b;
import java.lang.String;
import kotlin.jvm.internal.a;
import vb3.m;
import vb3.n;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import uz1.b;
import sz1.e;
import uz1.a;
import c93.b;
import xp5.g;
import d93.a;

public final class LiveLiteMultiLinePresenter extends d	// class@001e0a
{
    public final LiveLiteMultiLinePresenter$bizObserver$1 A;
    public e v;
    public n w;
    public g x;
    public m y;
    public b z;

    public void LiveLiteMultiLinePresenter(){
       super();
       this.A = new LiveLiteMultiLinePresenter$bizObserver$1(this);
    }
    public static final b c9(LiveLiteMultiLinePresenter p0){
       p0 = p0.z;
       if (p0 == null) {
          a.S("interactiveEffectService");
       }
       return p0;
    }
    public static final m d9(LiveLiteMultiLinePresenter p0){
       p0 = p0.y;
       if (p0 == null) {
          a.S("stageChangeService");
       }
       return p0;
    }
    public static final n e9(LiveLiteMultiLinePresenter p0){
       p0 = p0.w;
       if (p0 == null) {
          a.S("viewProviderService");
       }
       return p0;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, LiveLiteMultiLinePresenter.class, "3")) {
          return;
       }
       super.F8();
       LiveLiteMultiLinePresenter tv = this.v;
       if (tv == null) {
          a.S("interactManager");
       }
       tv.Wi().M(this.A);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, LiveLiteMultiLinePresenter.class, "4")) {
          return;
       }
       LiveLiteMultiLinePresenter tv = this.v;
       if (tv == null) {
          a.S("interactManager");
       }
       tv.Wi().i(this.A);
       return;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteMultiLinePresenter.class, "1")) {
          return;
       }
       a.p(p0, "provider");
       this.v = p0.a(e.class);
       this.x = p0.a(g.class);
       return;
    }
    public void Y8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteMultiLinePresenter.class, "2")) {
          return;
       }
       a.p(p0, "provider");
       this.w = p0.a(n.class);
       this.y = p0.a(m.class);
       this.z = p0.a(b.class);
       return;
    }
}
