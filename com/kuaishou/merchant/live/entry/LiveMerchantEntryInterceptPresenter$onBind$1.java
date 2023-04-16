package com.kuaishou.merchant.live.entry.LiveMerchantEntryInterceptPresenter$onBind$1;
import io.reactivex.g;
import com.kuaishou.merchant.live.entry.LiveMerchantEntryInterceptPresenter;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.live.entry.OOMConfig;
import com.kuaishou.merchant.live.entry.LiveMerchantEntryInterceptPresenter$onBind$1$emmit$1;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ot3.u0;
import o56.c;
import o56.a;
import kotlin.jvm.internal.a;
import ur5.a;
import b64.c;
import java.lang.Float;
import java.lang.Runtime;
import com.kuaishou.merchant.live.MerchantLiveLogBiz;
import java.lang.StringBuilder;
import p74.a;
import o74.a;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import ot3.z;
import y04.d;
import y04.c;
import brd.t;
import t45.d;
import brd.z;
import cjd.e;
import erd.o;
import com.kuaishou.merchant.live.entry.LiveMerchantEntryInterceptPresenter$onBind$1$a;
import com.kuaishou.merchant.live.entry.OOMConfig$Alert;
import msd.l;
import com.kuaishou.merchant.live.entry.LiveMerchantEntryInterceptPresenter$onBind$1$b;
import erd.g;
import crd.b;

public final class LiveMerchantEntryInterceptPresenter$onBind$1 implements g	// class@001a12
{
    public final LiveMerchantEntryInterceptPresenter b;

    public void LiveMerchantEntryInterceptPresenter$onBind$1(LiveMerchantEntryInterceptPresenter p0){
       this.b = p0;
       super();
    }
    public final void subscribe(v p0){
       boolean b;
       OOMConfig oOMConfig1;
       c a;
       LiveMerchantEntryInterceptPresenter liveMerchant = LiveMerchantEntryInterceptPresenter.class;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantEntryInterceptPresenter$onBind$1.class, str)) {
          return;
       }
       OOMConfig oOMConfig = OOMConfig.get();
       LiveMerchantEntryInterceptPresenter$onBind$1$emmit$1 oonBind$1$em = new LiveMerchantEntryInterceptPresenter$onBind$1$emmit$1(p0);
       Activity activity = this.b.getActivity();
       if (activity != null) {
          LiveMerchantEntryInterceptPresenter$onBind$1 tb = this.b;
          Objects.requireNonNull(tb);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          Object obj = PatchProxy.applyOneRefs(oOMConfig, tb, liveMerchant, "3");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if((u0.b() - a.a().e()) - oOMConfig.mColdStartInterval > 0){
             oOMConfig1 = 1;
          }else {
             oOMConfig1 = null;
          }
          if (oOMConfig.mIsEnabled != null && oOMConfig.mAlert != null) {
             LiveMerchantEntryInterceptPresenter p = tb.p;
             if (p == null) {
                a.S("mMerchantConfirmService");
             }
             if (p.b() && (!LiveMerchantEntryInterceptPresenter.u && oOMConfig1)) {
                a = c.a;
                oOMConfig1 = oOMConfig.mMemThreshold;
                Objects.requireNonNull(a);
                c uoc = c.class;
                if (PatchProxy.isSupport(uoc)) {
                   Runtime obj1 = PatchProxy.applyOneRefs(Float.valueOf(oOMConfig1), a, uoc, str);
                   if (obj1 != patchProxyRe) {
                      b = obj1.booleanValue();
                   }else {
                   label_008a :
                      obj1 = Runtime.getRuntime();
                      long l = obj1.maxMemory();
                      long l1 = l - (obj1.totalMemory() - obj1.freeMemory());
                      a.s(MerchantLiveLogBiz.ENTRY, "LiveMerchantMemUtil", "Ê£ÓàÄÚ´æ"+(((float)l1 * 0x3f800000) / (float)0x100000)+"MB");
                      b = (l > 0 && (((double)l1 * 0x3ff0000000000000) / (double)l) - (double)oOMConfig1 < 0)? true: false;
                   }
                }else {
                   goto label_008a ;
                }
                if (b) {
                   b = true;
                }
             }
          }
       label_00dd :
          b = false;
          if (b) {
             oOMConfig = oOMConfig.mAlert;
             LiveMerchantEntryInterceptPresenter.u = true;
             LiveMerchantEntryInterceptPresenter$onBind$1 tb1 = this.b;
             Objects.requireNonNull(tb1);
             if (!PatchProxy.applyVoid(null, tb1, liveMerchant, "4")) {
                Activity activity1 = tb1.getActivity();
                if (activity1 != null && !activity1.isFinishing()) {
                   tb1.P8();
                   tb1.r = z.a(activity1);
                }
             }
             this.b.X7(c.a().x().observeOn(d.a).map(new e()).subscribe(new LiveMerchantEntryInterceptPresenter$onBind$1$a(this, activity, oOMConfig, oonBind$1$em), new LiveMerchantEntryInterceptPresenter$onBind$1$b(this, oonBind$1$em)));
          label_0139 :
             return;
          }
       }
       oonBind$1$em.invoke(Boolean.FALSE);
       goto label_0139 ;
    }
}
