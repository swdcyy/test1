package com.kuaishou.live.lite.recoguide.LiveLiteRecoGuideController;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.lite.recoguide.LiveLiteRecoGuideController$a;
import nsd.u;
import n93.b;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager;
import xp5.i;
import e93.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.recoguide.LiveLiteRecoGuideController$liveLiteRecoGuideShowRecordTimestamp$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.lite.recoguide.LiveLiteRecoGuideController$e;
import ok.x;
import com.google.common.base.Suppliers;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import com.kuaishou.android.live.model.LiveStreamModel;
import com.kwai.framework.model.user.User;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveLiteRecoGuideConfig;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.live.lite.slide.LiveLiteSlideParam;
import java.util.Set;
import ci3.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.os.SystemClock;
import java.util.Objects;
import com.kuaishou.live.lite.recoguide.LiveLiteRecoGuideController$b;
import com.kuaishou.live.lite.recoguide.LiveLiteRecoGuideController$c;
import java.lang.Runnable;
import ekd.k1;
import com.kuaishou.live.panel.operation.LiveFeedbackOperationRecoItem$b;
import com.kuaishou.live.lite.recoguide.LiveLiteRecoGuideController$d;
import erd.g;
import crd.b;
import eoc.f;
import java.lang.Number;
import v63.a;
import n93.a;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage;

public final class LiveLiteRecoGuideController extends ViewController	// class@000ad9
{
    public b j;
    public long k;
    public a l;
    public final p m;
    public final x n;
    public LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage o;
    public final b p;
    public final LiveLiteGuidanceMessageQueueManager q;
    public final i r;
    public final a s;
    public static final LiveLiteRecoGuideController$a t;

    static {
       LiveLiteRecoGuideController.t = new LiveLiteRecoGuideController$a(null);
    }
    public void LiveLiteRecoGuideController(b p0,LiveLiteGuidanceMessageQueueManager p1,i p2,a p3){
       a.p(p0, "liveLiteBottomBubbleService");
       a.p(p1, "guideMessageService");
       a.p(p2, "logPackageService");
       a.p(p3, "infoService");
       super();
       this.p = p0;
       this.q = p1;
       this.r = p2;
       this.s = p3;
       this.m = s.c(LiveLiteRecoGuideController$liveLiteRecoGuideShowRecordTimestamp$2.INSTANCE);
       x ox = Suppliers.a(LiveLiteRecoGuideController$e.b);
       a.o(ox, "Suppliers.memoize {\n    бн    recoGuideConfig\n    }");
       this.n = ox;
    }
    public void F2(){
       boolean b;
       Object[] objArray1;
       LiveLiteRecoGuideController liveLiteReco = LiveLiteRecoGuideController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveLiteReco, "2")) {
          return;
       }
       LiveStreamFeed liveStreamFe = this.s.j0();
       if (liveStreamFe != null) {
          liveStreamFe = liveStreamFe.mLiveStreamModel;
          if (liveStreamFe != null) {
             int i = 1;
             if (liveStreamFe.mLiveTrafficType == i) {
                liveStreamFe = this.s.j0();
                liveStreamFe = (liveStreamFe != null)? liveStreamFe.mUser: objArray;
                a.m(liveStreamFe);
                if (!liveStreamFe.isFollowingOrFollowRequesting() && (this.n.get() != null && !TextUtils.x(this.n.get().mSubBizType))) {
                   FragmentActivity uFragmentAct = this.B2();
                   a.m(uFragmentAct);
                   LiveLiteSlideParam mOrganicTraf = LiveLiteSlideParam.of(uFragmentAct).mOrganicTrafficSet;
                   LiveStreamFeed liveStreamFe1 = this.s.j0();
                   String id = (liveStreamFe1 != null)? liveStreamFe1.getId(): objArray;
                   if (!mOrganicTraf.contains(id) && c.a()) {
                      Activity obj = PatchProxy.apply(objArray, this, liveLiteReco, "3");
                      if (obj != PatchProxyResult.class) {
                         b = obj.booleanValue();
                      }else if(!this.V2() || (SystemClock.elapsedRealtime() - this.V2()) - 0x240c8400 >= 0){
                         i = 0;
                      }
                      b = i;
                      if (b) {
                         obj = this.B2();
                         Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                         if (LiveLiteSlideParam.of(obj).mOrganicTrafficSet.size() >= 3) {
                            this.o = new LiveLiteRecoGuideController$b(this);
                            k1.s(new LiveLiteRecoGuideController$c(this), this, 100);
                         }
                         this.k = SystemClock.elapsedRealtime();
                      }
                   }
                }
             }
          }
       }
    label_00d2 :
       this.j = f.a(LiveFeedbackOperationRecoItem$b.class, new LiveLiteRecoGuideController$d(this));
       return;
    }
    public void J2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveLiteRecoGuideController.class, "6")) {
          return;
       }
       LiveLiteRecoGuideController tk = this.k;
       long l = SystemClock.elapsedRealtime() - tk;
       if (tk > 0 && l - (long)5000 < 0) {
          FragmentActivity uFragmentAct = this.B2();
          a.m(uFragmentAct);
          LiveLiteSlideParam mOrganicTraf = LiveLiteSlideParam.of(uFragmentAct).mOrganicTrafficSet;
          LiveStreamFeed liveStreamFe = this.s.j0();
          if (liveStreamFe != null) {
             objArray = liveStreamFe.getId();
          }
          mOrganicTraf.add(objArray);
       }
       this.X2();
       return;
    }
    public final long V2(){
       Object obj = PatchProxy.apply(null, this, LiveLiteRecoGuideController.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = this.m.getValue();
       }
       return obj.longValue();
    }
    public final void W2(){
       if (PatchProxy.applyVoid(null, this, LiveLiteRecoGuideController.class, "4")) {
          return;
       }
       this.X2();
       a.a(-1);
       return;
    }
    public final void X2(){
       if (PatchProxy.applyVoid(null, this, LiveLiteRecoGuideController.class, "5")) {
          return;
       }
       LiveLiteRecoGuideController tl = this.l;
       if (tl != null) {
          this.p.a(tl);
       }
       tl = this.o;
       if (tl != null) {
          a.m(tl);
          this.q.c(tl);
       }
       k1.n(this);
       tl = this.j;
       if (tl != null) {
          tl.dispose();
       }
       this.l = null;
       return;
    }
}
