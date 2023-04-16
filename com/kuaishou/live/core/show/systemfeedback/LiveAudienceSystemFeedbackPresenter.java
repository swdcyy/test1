package com.kuaishou.live.core.show.systemfeedback.LiveAudienceSystemFeedbackPresenter;
import c12.f;
import java.util.ArrayList;
import com.kuaishou.live.core.show.systemfeedback.LiveAudienceSystemFeedbackPresenter$systemFeedbackShowTipService$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import crd.b;
import java.util.Iterator;
import java.lang.Iterable;
import gl2.f;
import com.kuaishou.live.core.show.systemfeedback.LiveAudienceSystemFeedbackPresenter$systemFeedbackShowTipService$2$a;
import com.kwai.robust.PatchProxyResult;
import f12.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.jvm.internal.a;
import lp3.i;
import t02.a0;
import im2.f;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import f12.c;
import pm8.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;
import ry1.b;
import lp3.c;
import brd.t;
import com.kuaishou.live.core.show.systemfeedback.LiveAudienceSystemFeedbackPresenter$a;
import erd.g;
import io.reactivex.internal.functions.Functions;

public final class LiveAudienceSystemFeedbackPresenter extends f	// class@001172
{
    public final ArrayList K;
    public i L;
    public a0 M;
    public f N;
    public boolean O;
    public b P;
    public final p Q;
    public d R;
    public long S;
    public static String sLivePresenterClassName = "LiveAudienceSystemFeedbackPresenter";

    public void LiveAudienceSystemFeedbackPresenter(){
       super();
       this.K = new ArrayList();
       this.O = true;
       this.Q = s.c(new LiveAudienceSystemFeedbackPresenter$systemFeedbackShowTipService$2(this));
    }
    public void Q(boolean p0){
       LiveAudienceSystemFeedbackPresenter liveAudience = LiveAudienceSystemFeedbackPresenter.class;
       if (PatchProxy.isSupport(liveAudience) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveAudience, "4")) {
          return;
       }
       LiveAudienceSystemFeedbackPresenter tP = this.P;
       if (tP != null) {
          tP.dispose();
       }
       this.P = null;
       Iterator iterator = this.K.iterator();
       while (iterator.hasNext()) {
          iterator.next().d();
       }
       this.K.clear();
       this.S = 0;
       return;
    }
    public final void a9(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceSystemFeedbackPresenter.class, "10")) {
          return;
       }
       p0.c();
       this.K.add(p0);
       return;
    }
    public final LiveAudienceSystemFeedbackPresenter$systemFeedbackShowTipService$2$a b9(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceSystemFeedbackPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.Q.getValue();
    }
    public final boolean c9(){
       LiveAudienceSystemFeedbackPresenter obj = PatchProxy.apply(null, this, LiveAudienceSystemFeedbackPresenter.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.R;
       boolean b = false;
       if (obj != null) {
          int i = obj.c();
          if (i == 1 || i == 2) {
             b = true;
          }
       }
       return b;
    }
    public void j8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceSystemFeedbackPresenter.class, "2")) {
          return;
       }
       super.j8();
       Activity obj = this.r8("LIVE_SERVICE_MANAGER");
       a.o(obj, "inject\(LiveAccessIds.LIVE_SERVICE_MANAGER\)");
       this.L = obj;
       obj = this.q8(a0.class);
       a.o(obj, "inject\(LivePlayCallerContext::class.java\)");
       this.M = obj;
       obj = this.r8("LIVE_WEALTH_GRADE_BARRAGE_NEW_STYLE_ENTER_ROOM");
       a.o(obj, "inject\(LiveEnterRoomAcce¡­AGE_NEW_STYLE_ENTER_ROOM\)");
       this.N = obj;
       obj = this.getActivity();
       if (obj instanceof FragmentActivity) {
          objArray = obj;
       }
       if (objArray != null) {
          this.R = c.c(objArray);
       }
       return;
    }
    public void x(boolean p0){
       LiveAudienceSystemFeedbackPresenter liveAudience = LiveAudienceSystemFeedbackPresenter.class;
       if (PatchProxy.isSupport(liveAudience) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveAudience, "3")) {
          return;
       }
       SharedPreferences a = a.a;
       String str = "user";
       boolean booleanx = a.getBoolean(b.d(str)+"isAudienceFirstEnterLive", true);
       this.O = booleanx;
       if (booleanx) {
          SharedPreferences$Editor uEditor = a.edit();
          uEditor.putBoolean(b.d(str)+"isAudienceFirstEnterLive", false);
          g.a(uEditor);
       }
       LiveAudienceSystemFeedbackPresenter tL = this.L;
       if (tL == null) {
          a.S("liveServiceManager");
       }
       c uoc = tL.a(b.class);
       a.o(uoc, "liveServiceManager.getSe¡­btainService::class.java\)");
       this.P = uoc.W().subscribe(new LiveAudienceSystemFeedbackPresenter$a(this), Functions.d());
       return;
    }
}
