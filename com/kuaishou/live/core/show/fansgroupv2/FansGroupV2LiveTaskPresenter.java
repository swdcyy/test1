package com.kuaishou.live.core.show.fansgroupv2.FansGroupV2LiveTaskPresenter;
import c12.f;
import com.kuaishou.live.core.show.fansgroupv2.FansGroupV2LiveTaskPresenter$a;
import nsd.u;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import t02.a0;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import org.greenrobot.eventbus.a;
import vq5.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import ks3.r;
import i95.f;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle$State;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.core.show.fansgroupv2.FansGroupV2LiveTaskPresenter$onEventMainThread$1;
import msd.a;
import s95.c;
import com.kuaishou.live.core.show.fansgroupv2.FansGroupV2LiveTaskPresenter$onEventMainThread$2;
import android.content.Context;
import android.net.Uri;
import ekd.x0;
import android.app.Activity;
import android.net.Uri$Builder;
import com.kuaishou.live.core.show.fansgroupv2.FansGroupV2LiveTaskPresenter$b;
import vq5.b;

public final class FansGroupV2LiveTaskPresenter extends f	// class@000b50
{
    public d K;
    public BaseFragment L;
    public a0 M;
    public r N;
    public static final ArrayList O;
    public static final FansGroupV2LiveTaskPresenter$a P;
    public static String sLivePresenterClassName;

    static {
       FansGroupV2LiveTaskPresenter.P = new FansGroupV2LiveTaskPresenter$a(null);
       Integer[] integerArray = new Integer[]{Integer.valueOf(3),Integer.valueOf(6),Integer.valueOf(4),Integer.valueOf(5),Integer.valueOf(7),Integer.valueOf(2),Integer.valueOf(1000)};
       FansGroupV2LiveTaskPresenter.O = CollectionsKt__CollectionsKt.r(integerArray);
    }
    public void FansGroupV2LiveTaskPresenter(){
       super();
    }
    public static final a0 a9(FansGroupV2LiveTaskPresenter p0){
       p0 = p0.M;
       if (p0 == null) {
          a.S("mLivePlayCallerContext");
       }
       return p0;
    }
    public void Q(boolean p0){
       FansGroupV2LiveTaskPresenter uFansGroupV2 = FansGroupV2LiveTaskPresenter.class;
       if (PatchProxy.isSupport(uFansGroupV2) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uFansGroupV2, "3")) {
          return;
       }
       a.d().t(this);
       FansGroupV2LiveTaskPresenter tK = this.K;
       if (tK == null) {
          a.S("mLiveRouterManager");
       }
       tK.Z4("fansgroupaction");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, FansGroupV2LiveTaskPresenter.class, "1")) {
          return;
       }
       super.j8();
       Object obj = this.r8("LIVE_ROUTER_SERVICE");
       a.o(obj, "inject\(LiveAccessIds.LIVE_ROUTER_SERVICE\)");
       this.K = obj;
       obj = this.r8("LIVE_FRAGMENT");
       a.o(obj, "inject\(LiveAccessIds.LIVE_FRAGMENT\)");
       this.L = obj;
       obj = this.q8(a0.class);
       a.o(obj, "inject\(LivePlayCallerContext::class.java\)");
       this.M = obj;
       obj = this.r8("LIVE_MERCHANT_AUDIENCE_BOTTOM_BAR_SERVICE");
       a.o(obj, "inject\(MerchantAccessIds¡­IENCE_BOTTOM_BAR_SERVICE\)");
       this.N = obj;
       return;
    }
    public final void onEventMainThread(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FansGroupV2LiveTaskPresenter.class, "4")) {
          return;
       }
       a.p(p0, "taskEvent");
       FansGroupV2LiveTaskPresenter tL = this.L;
       if (tL == null) {
          a.S("mFragment");
       }
       Lifecycle lifecycle = tL.getLifecycle();
       a.o(lifecycle, "mFragment.lifecycle");
       if (lifecycle.getCurrentState() != Lifecycle$State.RESUMED) {
          return;
       }else {
          String str = "FansGroupV2LiveTask";
          if (TextUtils.x(p0.c())) {
             c.d(str, FansGroupV2LiveTaskPresenter$onEventMainThread$1.INSTANCE);
             return;
          }else {
             int i = p0.d();
             c.d(str, new FansGroupV2LiveTaskPresenter$onEventMainThread$2(i, p0));
             if (FansGroupV2LiveTaskPresenter.O.contains(Integer.valueOf(i))) {
                if (1000 == i) {
                   tL = this.K;
                   if (tL == null) {
                      a.S("mLiveRouterManager");
                   }
                   tL.r4(p0.c(), null);
                }else {
                   str = x0.a(Uri.parse(p0.c()), "internaljump");
                   if (TextUtils.x(str)) {
                      if (i == 7) {
                         tL = this.K;
                         if (tL == null) {
                            a.S("mLiveRouterManager");
                         }
                         tL.r4(p0.c(), this.getActivity());
                      }
                   }else {
                      Uri$Builder uBuilder = Uri.parse(str).buildUpon();
                      uBuilder.appendQueryParameter("rnViewTag", p0.b());
                      Uri uri = uBuilder.build();
                      tL = this.K;
                      if (tL == null) {
                         a.S("mLiveRouterManager");
                      }
                      tL.r4(uri.toString(), null);
                   }
                }
             }
             return;
          }
       }
    }
    public void x(boolean p0){
       FansGroupV2LiveTaskPresenter uFansGroupV2 = FansGroupV2LiveTaskPresenter.class;
       if (PatchProxy.isSupport(uFansGroupV2) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uFansGroupV2, "2")) {
          return;
       }
       a.d().p(this);
       FansGroupV2LiveTaskPresenter tK = this.K;
       if (tK == null) {
          a.S("mLiveRouterManager");
       }
       tK.t5("fansgroupaction", new FansGroupV2LiveTaskPresenter$b(this));
       return;
    }
}
