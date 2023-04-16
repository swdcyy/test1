package com.kuaishou.live.audience.component.multiline.LiveAudienceMultiLinePresenterV2$audienceUiPositionManagerLazy$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.audience.component.multiline.LiveAudienceMultiLinePresenterV2;
import g21.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import t02.a0;
import lp3.i;
import rp5.a;
import lp3.c;
import kotlin.jvm.internal.a;
import aq5.d;
import fq5.b;
import i81.g;
import sa3.b;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ekd.m1;
import com.kuaishou.live.audience.component.multiline.LiveAudienceMultiLinePresenterV2$audienceUiPositionManagerLazy$1$1;
import com.kuaishou.live.audience.component.multiline.LiveAudienceMultiLinePresenterV2$audienceUiPositionManagerLazy$1$2;
import oq5.b;
import dq5.b;
import qc2.a;
import kq5.b;
import a32.j;
import android.view.ViewGroup;
import msd.l;

public final class LiveAudienceMultiLinePresenterV2$audienceUiPositionManagerLazy$1 extends Lambda implements a	// class@000bae
{
    public final LiveAudienceMultiLinePresenterV2 this$0;

    public void LiveAudienceMultiLinePresenterV2$audienceUiPositionManagerLazy$1(LiveAudienceMultiLinePresenterV2 p0){
       this.this$0 = p0;
       super(0);
    }
    public final a invoke(){
       Object obj = this;
       Object obj1 = PatchProxy.apply(null, obj, LiveAudienceMultiLinePresenterV2$audienceUiPositionManagerLazy$1.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       a0 p1 = LiveAudienceMultiLinePresenterV2.Y8(obj.this$0).p1;
       c uoc = LiveAudienceMultiLinePresenterV2.Z8(obj.this$0).a(a.class);
       a.o(uoc, "serviceManager.getServic¡­ivityService::class.java\)");
       c uoc1 = uoc;
       a0 w = LiveAudienceMultiLinePresenterV2.Y8(obj.this$0).W;
       a0 j1 = LiveAudienceMultiLinePresenterV2.Y8(obj.this$0).j1;
       a0 z2 = LiveAudienceMultiLinePresenterV2.Y8(obj.this$0).Z2;
       a.o(z2, "livePlayCallerContext.mLiveBasicContext");
       d uod = z2.A0();
       uoc = LiveAudienceMultiLinePresenterV2.Z8(obj.this$0).a(g.class);
       a.o(uoc, "serviceManager.getServic¡­nagerService::class.java\)");
       c uoc2 = uoc;
       uoc = LiveAudienceMultiLinePresenterV2.Z8(obj.this$0).a(b.class);
       a.o(uoc, "serviceManager.getServic¡­ffectService::class.java\)");
       c uoc3 = uoc;
       LiveAudienceMultiLinePresenterV2$audienceUiPositionManagerLazy$1 this$0 = obj.this$0;
       LiveAudienceMultiLinePresenterV2 r = this$0.R;
       LiveAudienceMultiLinePresenterV2 s = this$0.S;
       LiveAudienceMultiLinePresenterV2 liveAudience = this$0.f1;
       if (liveAudience == null) {
          a.S("multiLineContainer");
       }
       LiveAudienceMultiLinePresenterV2 g1 = obj.this$0.g1;
       if (g1 == null) {
          a.S("multiLineContainerBackground");
       }
       View view = m1.f(obj.this$0.m8(), R.id.play_view_wrapper);
       a.o(view, "bindWidget\(rootView, R.id.play_view_wrapper\)");
       a uoa = new a(p1, uoc1, w, j1, uod, uoc2, uoc3, r, s, liveAudience, g1, view, new LiveAudienceMultiLinePresenterV2$audienceUiPositionManagerLazy$1$1(obj), new LiveAudienceMultiLinePresenterV2$audienceUiPositionManagerLazy$1$2(obj));
       return obj1;
    }
    public Object invoke(){
       return this.invoke();
    }
}
