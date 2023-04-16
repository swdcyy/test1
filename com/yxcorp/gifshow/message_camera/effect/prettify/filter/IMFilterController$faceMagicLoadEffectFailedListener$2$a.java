package com.yxcorp.gifshow.message_camera.effect.prettify.filter.IMFilterController$faceMagicLoadEffectFailedListener$2$a;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicLoadEffectFailedListener;
import com.yxcorp.gifshow.message_camera.effect.prettify.filter.IMFilterController$faceMagicLoadEffectFailedListener$2;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.Objects;
import com.yxcorp.gifshow.message_camera.effect.prettify.filter.IMFilterController;
import java.lang.StringBuilder;
import dc5.c;
import ui9.j;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import com.yxcorp.gifshow.prettify.filter.data.FilterStateManager;
import com.yxcorp.gifshow.prettify.v4.magic.filter.Filters;
import kotlin.jvm.internal.a;
import zsd.u;
import t16.a;
import j16.b;
import com.yxcorp.gifshow.prettify.v4.magic.filter.n;

public final class IMFilterController$faceMagicLoadEffectFailedListener$2$a implements FaceMagicController$FaceMagicLoadEffectFailedListener	// class@001dc7
{
    public final IMFilterController$faceMagicLoadEffectFailedListener$2 b;

    public void IMFilterController$faceMagicLoadEffectFailedListener$2$a(IMFilterController$faceMagicLoadEffectFailedListener$2 p0){
       this.b = p0;
       super();
    }
    public final void onLoadFileError(String p0,int p1){
       IMFilterController$faceMagicLoadEffectFailedListener$2$a uofaceMagicL = IMFilterController$faceMagicLoadEffectFailedListener$2$a.class;
       if (PatchProxy.isSupport(uofaceMagicL) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uofaceMagicL, "1")) {
          return;
       }
       IMFilterController$faceMagicLoadEffectFailedListener$2 this$0 = this.b.this$0;
       Objects.requireNonNull(this$0);
       IMFilterController iMFilterCont = IMFilterController.class;
       if (!PatchProxy.isSupport(iMFilterCont) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this$0, iMFilterCont, "15")) {
          String str = "IMFilterController";
          c.c(str, "onLoadFileError...path: "+p0+" , download filter resource.");
          boolean b = false;
          int i = (p0 == null || !p0.length())? 1: 0;
          if (!i && p1 == 2) {
             IMFilterController a = this$0.a;
             if (a != null && a.l0(p0) != true) {
                c.c(str, "[filter][keypath][apply]  onLoadFileError path: "+p0);
                a = this$0.a;
                if (a != null) {
                   a.M(p0);
                }
                FilterConfig uFilterConfi = this$0.g.d();
                if (uFilterConfi != null) {
                   String filterResour = Filters.getFilterResourcePath(uFilterConfi);
                   a.o(filterResour, "Filters.getFilterResourcePath\(it\)");
                   if (u.q2(p0, filterResour, b, 2, null)) {
                      n.g(new a("record", "inner_resource"), uFilterConfi, null, true);
                   }
                }
             }
          }
       }
    label_00aa :
       return;
    }
}
