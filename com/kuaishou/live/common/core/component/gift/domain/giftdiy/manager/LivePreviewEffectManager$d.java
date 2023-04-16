package com.kuaishou.live.common.core.component.gift.domain.giftdiy.manager.LivePreviewEffectManager$d;
import lz2.c;
import com.kuaishou.live.common.core.component.gift.domain.giftdiy.manager.LivePreviewEffectManager;
import java.lang.Object;
import pz2.c;
import lz2.b;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import cj1.a;
import java.lang.Boolean;

public final class LivePreviewEffectManager$d implements c	// class@001244
{
    public final LivePreviewEffectManager a;

    public void LivePreviewEffectManager$d(LivePreviewEffectManager p0){
       this.a = p0;
       super();
    }
    public void a(c p0){
       b.a(this, p0);
    }
    public void e(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePreviewEffectManager$d.class, "3")) {
          return;
       }
       a.p(p0, "renderTaskList");
       LivePreviewEffectManager e = this.a.e;
       if (e != null && p0.contains(e)) {
          LivePreviewEffectManager$d ta = this.a;
          ta.b("onTasksEnqueueSucceed", 3, ta.f);
       }
       return;
    }
    public void g(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePreviewEffectManager$d.class, "4")) {
          return;
       }
       a.p(p0, "renderTask");
       if (a.g(p0, this.a.e)) {
          LivePreviewEffectManager$d ta = this.a;
          ta.b("onSurviveStart", 2, ta.f);
       }
       return;
    }
    public void h(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePreviewEffectManager$d.class, "2")) {
          return;
       }
       if (a.g(p0, this.a.e)) {
          LivePreviewEffectManager$d ta = this.a;
          ta.b("onEffectTaskStartRender", 1, ta.f);
       }
       return;
    }
    public void i(c p0,boolean p1,String p2){
       if (PatchProxy.isSupport(LivePreviewEffectManager$d.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, LivePreviewEffectManager$d.class, "1")) {
          return;
       }
       if (a.g(p0, this.a.e)) {
          LivePreviewEffectManager$d ta = this.a;
          ta.b("onEffectTaskFinishRender", 0, ta.f);
       }
       return;
    }
    public void j(List p0){
       b.b(this, p0);
    }
}
