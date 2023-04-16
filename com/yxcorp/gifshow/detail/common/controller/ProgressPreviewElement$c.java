package com.yxcorp.gifshow.detail.common.controller.ProgressPreviewElement$c;
import erd.g;
import com.yxcorp.gifshow.detail.common.controller.ProgressPreviewElement;
import java.lang.Object;
import java.lang.Float;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import iq7.j;
import kotlin.jvm.internal.a;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b;
import qp7.x0;
import qp7.b;
import java.lang.Long;
import pp7.b;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.components.feedmodel.ProgressHighLightInfo;
import com.kuaishou.android.model.mix.w;
import lnc.ja;
import iq7.j$a;
import rf5.u;
import com.yxcorp.utility.Log;
import brd.g;

public final class ProgressPreviewElement$c implements g	// class@0013b9
{
    public final ProgressPreviewElement b;

    public void ProgressPreviewElement$c(ProgressPreviewElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       e player1;
       if (PatchProxy.applyVoidOneRefs(p0, this, ProgressPreviewElement$c.class, "1")) {
       }else {
          ProgressPreviewElement$c tb = this.b;
          Objects.requireNonNull(tb);
          j oj = j.class;
          if (!PatchProxy.applyVoidOneRefs(p0, tb, ProgressPreviewElement.class, "7")) {
             ProgressPreviewElement w = tb.w;
             ProgressPreviewElement a = tb.A;
             if (a == null) {
                a.S("mPlayModule");
             }
             e player = a.getPlayer();
             String str = "mPlayModule.player";
             a.o(player, str);
             if (w - player.getDuration()) {
                w = tb.A;
                if (w == null) {
                   a.S("mPlayModule");
                }
                player1 = w.getPlayer();
                a.o(player1, str);
                tb.w = player1.getDuration();
                tb.E().j(tb.w);
             }
             w = tb.A;
             if (w == null) {
                a.S("mPlayModule");
             }
             player1 = w.getPlayer();
             a.o(player1, str);
             a.m(p0);
             long l = (long)((float)player1.getDuration() * p0.floatValue());
             p0 = tb.E();
             Objects.requireNonNull(p0);
             if (!PatchProxy.isSupport(oj) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), p0, oj, "13")) {
                p0.i.f(Long.valueOf(l));
             }
             if (tb.o0()) {
                p0 = tb.z;
                if (p0 == null) {
                   a.S("mPhoto");
                }
                int i = 0;
                p0 = w.R(p0.getEntity())[i];
                a.o(p0, "highLightInfo");
                long highLightPos = p0.getHighLightPosition();
                ProgressHighLightInfo mDisplayText = p0.mDisplayText;
                if (l - highLightPos >= 0) {
                   i = 1;
                }
                if (tb.v != i) {
                   if (tb.u != null) {
                      ja.a();
                   }
                   tb.v = i;
                }
                p0 = tb.E();
                a.o(mDisplayText, "highLightText");
                j$a uoa = new j$a(highLightPos, l, mDisplayText);
                Objects.requireNonNull(p0);
                if (!PatchProxy.applyVoidOneRefs(v11, p0, oj, "14")) {
                   a.p(v11, "tracking");
                   p0.k.f(v11);
                }
             }
             tb.u = true;
             p0 = tb.F;
             if (p0 == null) {
                a.S("mSwipeToProfileFeedMovement");
             }
             if (p0.w()) {
                Log.g("ProgressPreviewElement", "side bar is expand, no preview!");
             }else {
                p0 = tb.J;
                if (p0 != null) {
                   p0.onNext(Long.valueOf(l));
                }
             }
          }
       }
       return;
    }
}
