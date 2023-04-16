package com.kwai.live.gzone.turntable.presenters.i;
import com.kwai.live.gzone.turntable.widget.a$a;
import com.kwai.live.gzone.turntable.presenters.f;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.live.gzone.turntable.LiveGzoneTurntableLogger;
import com.kwai.live.gzone.turntable.bean.LiveGzoneTurntablePrize;
import java.lang.Integer;
import java.lang.Long;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import y43.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import fq5.b;
import androidx.fragment.app.Fragment;
import n77.c0;
import mrd.c;
import o77.q;
import o77.t;
import com.kwai.library.widget.popup.common.c;
import n77.n;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.framework.model.user.User;
import qa6.b;
import com.kwai.live.gzone.turntable.presenters.LiveGzoneTurntableWinnerListPresenter$c;
import x57.e;
import x57.a;
import r67.a;
import java.lang.Throwable;
import com.kwai.robust.PatchProxyResult;
import android.util.Log;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import o56.c;
import o56.a;
import android.app.Application;
import u07.t$a;
import com.kwai.library.widget.popup.common.c$b;
import u07.t;
import u07.j;

public class i implements a$a	// class@000e6a
{
    public final f a;

    public void i(f p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi, "4")) {
          return;
       }
       this.a.t.q(p0);
       return;
    }
    public void b(LiveGzoneTurntablePrize p0,int p1,long p2,long p3){
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Long.valueOf(p2), Long.valueOf(p3), this, i.class, "2")) {
          return;
       }
       String[] stringArray = new String[]{"id",p0.mPrizeId,"prize",p0.mName,"availableDrawCount",String.valueOf(p1)};
       LiveGzoneTurntableLogger.f("onPrizeSnappedSuccess", stringArray);
       i ta = this.a;
       Objects.requireNonNull(ta);
       f uof = f.class;
       if (PatchProxy.applyVoidOneRefs(p0, ta, uof, "17") || (!a1.i(ta.getActivity()) || (ta.K != null && (ta.p.m.b().isAdded() && !PatchProxy.applyVoidOneRefs(p0, ta, uof, "18"))))) {
          c0 uoc0 = new c0(ta.getActivity());
          uoc0.a = p0;
          uoc0.c(ta.t);
          uoc0.b(ta.u);
          uoc0.c = new q(ta);
          uoc0.e = new t(ta);
          uoc0.a();
       }
    label_00a5 :
       n n = this.a.q.n;
       if (n != null) {
          n.a(p0, b.a(QCurrentUser.ME));
       }
       if (p2 - null > 0) {
          a.a().d(p3, p2, "LiveTurntable");
       }
       this.a.s.setOpportunityCount(p1);
       return;
    }
    public boolean c(Throwable p0){
       String[] obj = PatchProxy.applyOneRefs(p0, this, i.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = new String[]{"throwable",Log.getStackTraceString(p0)};
       LiveGzoneTurntableLogger.f("onPrizeSnappedFailed", obj);
       Activity activity = this.a.getActivity();
       if (!a1.i(activity)) {
          return 1;
       }
       String str = null;
       if (p0 instanceof KwaiException) {
          if (p0.mErrorCode == 0x1030c) {
             this.a.s.km();
             return 0;
          }else if(!TextUtils.x(p0.getMessage())){
             str = p0.getMessage();
          }
       }
       if (TextUtils.x(str)) {
          str = a.a().a().getString(R.string.arg_RES_7f104e74);
       }
       this.a.S8();
       t$a uoa = new t$a(activity);
       uoa.X0(str);
       uoa.S0(R.string.arg_RES_7f101812);
       uoa.z(0);
       this.a.J = j.d(uoa);
       return 1;
    }
    public boolean d(){
       Object[] objArray = null;
       f obj = PatchProxy.apply(objArray, this, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.a.V8();
       obj = this.a.t;
       Objects.requireNonNull(obj);
       if (!PatchProxy.applyVoid(objArray, obj, LiveGzoneTurntableLogger.class, "8")) {
          obj.i("LIVE_TURNTABLE_START_BUTTON");
       }
       boolean b = true;
       if (this.a.s.kd() < b) {
          this.a.s.km();
          b = false;
          this.a.t.q(b);
       }
       return b;
    }
    public String getLiveStreamId(){
       Object obj = PatchProxy.apply(null, this, i.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.p.m.getLiveStreamId();
    }
}
