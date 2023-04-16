package bg3.n;
import k51.c;
import bg3.n$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import android.view.View;
import hb2.g$b;
import ekd.m1;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import com.kuaishou.live.widget.LivePkShimmerLayout;
import ks3.i0$a;
import ks3.i0;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.api.core.model.MerchantLivePlayConfig;
import as3.a;
import com.kuaishou.merchant.api.core.model.MerchantLivePlayConfig$ChainEntranceConfig;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Number;
import android.content.res.Resources;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import za2.a0;
import cq5.a;
import bg3.m;
import android.view.View$OnClickListener;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import lnc.a1;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import zf3.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.model.feed.LiveStreamFeed$LiveSideBarModel;
import k2b.u1;
import cq5.b;

public class n extends c	// class@0003af
{
    public a0 p;
    public TextView q;
    public KwaiImageView r;
    public ImageView s;
    public View t;
    public LivePkShimmerLayout u;
    public b v;
    public int[] w;
    public i0$a x;
    public static String sLivePresenterClassName = "LiveMerchantChainPendantPresenter";

    public void n(){
       super();
       int[] ointArray = new int[]{0,this.S8(0x7f060620),this.S8(0x7f062051),this.S8(0x7f060620),0};
       this.w = ointArray;
       this.x = new n$a(this);
    }
    public void E8(){
       n on = n.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, on, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, on, "4")) {
          a0 l1 = this.p.l1;
          if (l1 != null) {
             View view = l1.i();
             this.t = view;
             this.q = m1.f(view, 0x7f0a2579);
             this.r = m1.f(this.t, 0x7f0a2578);
             this.s = m1.f(this.t, 0x7f0a2577);
             LivePkShimmerLayout livePkShimme = m1.f(this.t, R.id.live_right_pendant_container);
             this.u = livePkShimme;
             livePkShimme.setGradientColors(this.w);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, on, "13")) {
          a0 o2 = this.p.O2;
          if (o2 != null) {
             o2.b(this.x);
          }
       }
       this.V8();
       return;
    }
    public void J8(){
       n on = n.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, on, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, on, "12")) {
          a0 o2 = this.p.O2;
          if (o2 != null) {
             o2.c(this.x);
          }
       }
       return;
    }
    public final String P8(){
       Object obj = PatchProxy.apply(null, this, n.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.R8()) {
          return this.p.a3.a().mChainEntranceConfig.mEntranceImg;
       }
       return "";
    }
    public final boolean R8(){
       a0 obj = PatchProxy.apply(null, this, n.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.p.O2;
       boolean b = (obj != null && obj.d())? true: false;
       return b;
    }
    public final int S8(int p0){
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, on, "15");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       try{
          return this.l8().getColor(p0);
       }catch(java.lang.Exception e0){
          return 0;
       }
    }
    public void V8(){
       ClientContent$ContentPackage uContentPack;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n on = n.class;
       if (PatchProxy.applyVoid(null, this, on, "5")) {
          return;
       }
       if (this.R8()) {
          n tp = this.p;
          if (tp.l1 != null) {
             a0 o2 = tp.o2;
             if (o2 != null) {
                o2.h1();
             }
             o2 = this.p.L1;
             if (o2 != null) {
                o2.i();
             }
             int i = 8;
             this.s.setVisibility(i);
             if (!PatchProxy.applyVoid(null, this, on, "6")) {
                tp = this.t;
                if (tp != null) {
                   m1.a(tp, new m(this), R.id.live_side_bar_pendant_text_view);
                }
             }
             if (!PatchProxy.applyVoid(null, this, on, "7") && (this.q != null && this.R8())) {
                tp = this.q;
                MerchantLivePlayConfig$ChainEntranceConfig uChainEntran = PatchProxy.apply(null, this, on, "10");
                if (uChainEntran != patchProxyRe) {
                }else if(this.R8()){
                   uChainEntran = this.p.a3.a().mChainEntranceConfig.mEntranceDesc;
                }else {
                   uChainEntran = "";
                }
                tp.setText(uChainEntran);
             }
          label_0081 :
             int i1 = 0;
             if (!PatchProxy.applyVoid(null, this, on, "8") && this.r != null) {
                if (this.R8() && !TextUtils.x(this.P8())) {
                   this.r.setVisibility(i1);
                   LinearLayout$LayoutParams layoutParams = this.r.getLayoutParams();
                   layoutParams.height = a1.d(0x7f0708a5);
                   layoutParams.width = a1.d(0x7f0708a5);
                   layoutParams.leftMargin = a1.d(0x7f0708a6);
                   layoutParams.rightMargin = a1.d(0x7f0708a4);
                   this.r.setLayoutParams(layoutParams);
                   this.r.L(this.P8());
                }else {
                   this.r.setVisibility(i);
                }
             }
             this.p.l1.g(true);
             on = this.t;
             if (on != null) {
                on.setVisibility(i1);
             }
             on = this.p;
             LiveStreamFeedWrapper mEntity = on.c.mEntity;
             ClientContent$LiveStreamPackage liveStreamPa = on.Z2.a();
             if (!PatchProxy.isSupport(a.class) || (!PatchProxy.applyVoidThreeRefs(mEntity, liveStreamPa, Integer.valueOf(7), null, a.class, "1") && mEntity != null)) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "MERCHANT_MORELIST_BUTTON";
                if (PatchProxy.isSupport(a.class)) {
                   uContentPack = PatchProxy.applyThreeRefs(mEntity, liveStreamPa, Integer.valueOf(7), null, a.class, "8");
                   if (uContentPack != patchProxyRe) {
                   }else {
                   label_013d :
                      uContentPack = a.a(mEntity, liveStreamPa, 7);
                      if (r1.S2(mEntity)) {
                         ClientContent$TagPackage tagPackage = PatchProxy.applyOneRefs(mEntity, null, a.class, "11");
                         if (tagPackage != patchProxyRe) {
                         }else {
                            tagPackage = new ClientContent$TagPackage();
                            LiveStreamFeed mLiveSideBar = mEntity.mLiveSideBarModel;
                            if (mLiveSideBar != null) {
                               tagPackage.identity = TextUtils.k(mLiveSideBar.mLiveSideTabId);
                               tagPackage.name = TextUtils.k(mEntity.mLiveSideBarModel.mLiveSideIconText);
                            }
                            tagPackage.expTag = TextUtils.k(r1.M0(mEntity));
                         }
                         uContentPack.tagPackage = tagPackage;
                      }
                   }
                }else {
                   goto label_013d ;
                }
                u1.u0(6, uElementPack, uContentPack);
             }
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, n.class, "1")) {
          return;
       }
       this.p = this.q8(a0.class);
       this.v = this.s8(b.class);
       return;
    }
}
