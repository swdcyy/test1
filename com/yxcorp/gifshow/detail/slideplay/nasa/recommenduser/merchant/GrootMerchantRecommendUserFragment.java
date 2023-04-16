package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.GrootMerchantRecommendUserFragment;
import k6a.g;
import im8.g;
import com.kwai.component.photo.detail.slide.groot.DetailSlidePlayFragment;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.library.slide.base.log.SlidePlayLogger;
import com.kwai.robust.PatchProxyResult;
import m6a.l;
import java.util.Map;
import java.util.HashMap;
import uw9.p3;
import x1a.a$a;
import x1a.a;
import android.os.Bundle;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.GrootMerchantRecommendUserFragment$a;
import com.kuaishou.android.model.feed.MerchantCardType;
import java.lang.Enum;
import n6a.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.v2.MerchantRecommendUserListPresenterV2;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.v2.i;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.MerchantRecommendUserListPresenter;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.f;
import android.view.View;
import androidx.fragment.app.Fragment;
import o6a.l;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.MerchantRecommendUserManager;
import dw6.b;
import com.kwai.library.groot.slide.fragment.GrootBaseFragment;
import hx6.a;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.lang.Boolean;
import com.kwai.kds.krn.api.page.KwaiRnContainerView;
import java.lang.Exception;
import java.lang.Number;
import ag6.a;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import com.yxcorp.utility.n;
import ekd.i;
import android.content.Context;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.res.Resources;
import cw9.c;
import android.widget.LinearLayout$LayoutParams;
import m6a.d;
import msd.q;
import com.yxcorp.gifshow.util.l;
import com.kuaishou.android.model.feed.MerchantRecommendUserFeed;
import yp.l0;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import tl8.d;

public class GrootMerchantRecommendUserFragment extends DetailSlidePlayFragment implements g, g	// class@001785
{
    public NasaBizParam F;
    public MerchantRecommendUserManager G;
    public l H;
    public PublishSubject I;
    public int J;
    public BaseFragment K;
    public PresenterV2 L;
    public boolean M;
    public boolean N;
    public static final int O;

    public void GrootMerchantRecommendUserFragment(){
       super();
       this.I = PublishSubject.g();
       this.N = false;
    }
    public void H2(){
       if (PatchProxy.applyVoidWithListener(null, this, GrootMerchantRecommendUserFragment.class, "16")) {
          return;
       }
       this.mh();
       PatchProxy.onMethodExit(GrootMerchantRecommendUserFragment.class, "16");
       return;
    }
    public void N2(){
       if (PatchProxy.applyVoidWithListener(null, this, GrootMerchantRecommendUserFragment.class, "17")) {
          return;
       }
       this.ph();
       PatchProxy.onMethodExit(GrootMerchantRecommendUserFragment.class, "17");
       return;
    }
    public void Q0(){
       if (PatchProxy.applyVoidWithListener(null, this, GrootMerchantRecommendUserFragment.class, "15")) {
          return;
       }
       this.M = false;
       this.oh();
       PatchProxy.onMethodExit(GrootMerchantRecommendUserFragment.class, "15");
       return;
    }
    public void Q1(){
       if (PatchProxy.applyVoidWithListener(null, this, GrootMerchantRecommendUserFragment.class, "14")) {
          return;
       }
       this.M = true;
       this.nh();
       PatchProxy.onMethodExit(GrootMerchantRecommendUserFragment.class, "14");
       return;
    }
    public boolean V(){
       return this.M;
    }
    public void d0(){
       if (PatchProxy.applyVoidWithListener(null, this, GrootMerchantRecommendUserFragment.class, "13")) {
          return;
       }
       GrootMerchantRecommendUserFragment tL = this.L;
       if (tL != null) {
          tL.destroy();
       }
       PatchProxy.onMethodExit(GrootMerchantRecommendUserFragment.class, "13");
       return;
    }
    public SlidePlayLogger d1(){
       return null;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, GrootMerchantRecommendUserFragment.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          PatchProxy.onMethodExit(GrootMerchantRecommendUserFragment.class, "19");
          return new l();
       }else {
          PatchProxy.onMethodExit(GrootMerchantRecommendUserFragment.class, "19");
          return null;
       }
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefsWithListener(p0, this, GrootMerchantRecommendUserFragment.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(GrootMerchantRecommendUserFragment.class, new l());
       }else {
          obj.put(GrootMerchantRecommendUserFragment.class, null);
       }
       PatchProxy.onMethodExit(GrootMerchantRecommendUserFragment.class, "20");
       return obj;
    }
    public int getPage(){
       return 0x7d42;
    }
    public String getPageParams(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyWithListener(null, this, GrootMerchantRecommendUserFragment.class, "18");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(null, null, p3.class, "7");
       if (obj != patchProxyRe) {
       }else {
          a$a uoa = new a$a();
          uoa.f("merchant_anchor");
          obj = uoa.a().toString();
       }
       PatchProxy.onMethodExit(GrootMerchantRecommendUserFragment.class, "18");
       return obj;
    }
    public String getUrl(){
       return "";
    }
    public String o(){
       return "FEATURED_PAGE";
    }
    public void onActivityCreated(Bundle p0){
       int i;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, GrootMerchantRecommendUserFragment.class, "7")) {
          return;
       }
       super.onActivityCreated(p0);
       PhotoDetailParam photoDetailP = this.rh();
       if (photoDetailP == null) {
          PatchProxy.onMethodExit(GrootMerchantRecommendUserFragment.class, "7");
          return;
       }else {
          String str = "8";
          Object[] objArray = null;
          if (!PatchProxy.applyVoidWithListener(objArray, this, GrootMerchantRecommendUserFragment.class, str)) {
             if (this.N != null && this.L != null) {
                PatchProxy.onMethodExit(GrootMerchantRecommendUserFragment.class, str);
             }else {
                this.L = new PresenterV2();
                i = GrootMerchantRecommendUserFragment$a.a[this.xh().ordinal()];
                if (i != 1) {
                   if (i != 2) {
                      if (i == 3) {
                         this.L.U7(new a(this));
                      }
                   }else {
                      this.L.U7(new MerchantRecommendUserListPresenterV2());
                      this.L.U7(new i());
                   }
                }else {
                   this.L.U7(new MerchantRecommendUserListPresenter());
                   this.L.U7(new f());
                }
                this.L.f(this.requireView());
                PatchProxy.onMethodExit(GrootMerchantRecommendUserFragment.class, str);
             }
          }
          str = "11";
          if (!PatchProxy.applyVoidWithListener(objArray, this, GrootMerchantRecommendUserFragment.class, str)) {
             i = GrootMerchantRecommendUserFragment$a.a[this.xh().ordinal()];
             if (i != 1) {
                if (i == 2 && this.H == null) {
                   this.H = new l(this.J);
                }
             }else if(this.G == null){
                this.G = new MerchantRecommendUserManager(this.J);
             }
             PatchProxy.onMethodExit(GrootMerchantRecommendUserFragment.class, str);
          }
          Object[] objArray1 = new Object[]{this,photoDetailP};
          this.L.i(objArray1);
          PatchProxy.onMethodExit(GrootMerchantRecommendUserFragment.class, "7");
          return;
       }
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, GrootMerchantRecommendUserFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.K = this;
       this.F = a.a(this.ch());
       PatchProxy.onMethodExit(GrootMerchantRecommendUserFragment.class, "1");
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       int this;
       int b;
       String str2;
       int i2;
       int i3;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       GrootBaseFragment obj = PatchProxy.applyThreeRefsWithListener(p0, p1, p2, this, GrootMerchantRecommendUserFragment.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       super.onCreateView(p0, p1, p2);
       MerchantCardType merchantCard = this.xh();
       String str = "4";
       Object[] objArray = null;
       obj = PatchProxy.applyWithListener(objArray, this, GrootMerchantRecommendUserFragment.class, str);
       this = 0x7f0a2b2f;
       int i = 1;
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          obj = this.j;
          if (obj == null) {
             PatchProxy.onMethodExit(GrootMerchantRecommendUserFragment.class, str);
          }else {
             try{
                Object tag = obj.getTag(this);
                if (tag == null) {
                   PatchProxy.onMethodExit(GrootMerchantRecommendUserFragment.class, str);
                }else if(tag == this.xh()){
                   b = true;
                }else {
                   b = false;
                }
                PatchProxy.onMethodExit(GrootMerchantRecommendUserFragment.class, str);
             }catch(java.lang.Exception e0){
                PatchProxy.onMethodExit(GrootMerchantRecommendUserFragment.class, str);
             }
          }
       }
       this.N = b;
       if (this.N == null) {
          String str1 = "3";
          if (!PatchProxy.applyVoidWithListener(objArray, this, GrootMerchantRecommendUserFragment.class, str1)) {
             obj = this.j;
             if (obj == null) {
                PatchProxy.onMethodExit(GrootMerchantRecommendUserFragment.class, str1);
             }else {
                View view2 = obj.findViewById(R.id.kwai_rn_container_view);
                if (!view2 instanceof KwaiRnContainerView) {
                   PatchProxy.onMethodExit(GrootMerchantRecommendUserFragment.class, str1);
                }else {
                   try{
                      view2.b();
                   }catch(java.lang.Exception e1){
                      e1.toString();
                   }
                   PatchProxy.onMethodExit(GrootMerchantRecommendUserFragment.class, str1);
                }
             }
          }
          str1 = "6";
          obj = PatchProxy.applyWithListener(objArray, this, GrootMerchantRecommendUserFragment.class, str1);
          int i1 = 3;
          if (obj != patchProxyRe) {
             b = obj.intValue();
          }else {
             b = GrootMerchantRecommendUserFragment$a.a[this.xh().ordinal()];
             if (b != i) {
                if (b != 2) {
                   if (b != i1) {
                      PatchProxy.onMethodExit(GrootMerchantRecommendUserFragment.class, str1);
                   }else {
                      b = 0x7f0d0ef5;
                      PatchProxy.onMethodExit(GrootMerchantRecommendUserFragment.class, str1);
                   }
                }else {
                   PatchProxy.onMethodExit(GrootMerchantRecommendUserFragment.class, str1);
                }
                b = 0x7f0d1078;
             }else {
                b = 0x7f0d1077;
                PatchProxy.onMethodExit(GrootMerchantRecommendUserFragment.class, str1);
             }
          }
          View view = a.c(p0, b, p1, false);
          this.j = view;
          view.setTag(this, merchantCard);
          if (merchantCard == MerchantCardType.TYPE_MERCHANT_RECOMMEND_V1 || merchantCard == MerchantCardType.TYPE_MERCHANT_RECOMMEND_V2) {
             str2 = "5";
             view = PatchProxy.applyWithListener(objArray, this, GrootMerchantRecommendUserFragment.class, str2);
             if (view != patchProxyRe) {
                i2 = view.intValue();
             }else {
                i2 = n.j(this.requireActivity());
                if (i2 <= 0) {
                   i2 = n.t(this.requireActivity());
                   i3 = (i.c())? 0: n.A(this.requireContext());
                   i2 = i2 - i3;
                }
                i3 = (a1.d(0x7f070fdf) + n.A(this.requireContext())) + a1.e(20.00f);
                this.j.findViewById(0x7f0a42cc).getLayoutParams().topMargin = i3;
                i2 = (i2 - (i3 + a1.e(44.00f))) - (a1.e(0x42f00000) + c.b(this.requireContext().getResources(), 0x7f070bf1));
                i3 = a1.e(140.00f);
                b = a1.e(16.00f);
                while (true) {
                   int i4 = i3 * i1;
                   this = i1 - 1;
                   int i5 = this * b;
                   i4 = i4 + i5;
                   if (i4 > i2) {
                      if (this == i) {
                         i2 = this;
                      label_018b :
                         View view1 = this.j.findViewById(R.id.recycler_view);
                         i3 = (i3 * i2) + (b * (i2 - 1));
                         view1.getLayoutParams().height = i3;
                         view1.setMinimumHeight(i3);
                         PatchProxy.onMethodExit(GrootMerchantRecommendUserFragment.class, str2);
                      }else {
                         i1 = this;
                      }
                   }else {
                      i2 = i1;
                      goto label_018b ;
                   }
                }
             }
             this.J = i2;
          }
       }
       str2 = "12";
       if (!PatchProxy.applyVoidOneRefsWithListener(merchantCard, this, GrootMerchantRecommendUserFragment.class, str2)) {
          i2 = c.b(this.getContext().getResources(), R.dimen.arg_RES_7f070bf1);
          GrootBaseFragment tj = this.j;
          if (tj != null) {
             tj.setPadding(false, false, false, i2);
          }
          l.b(this.j, new d(this));
          PatchProxy.onMethodExit(GrootMerchantRecommendUserFragment.class, str2);
       }
       PatchProxy.onMethodExit(GrootMerchantRecommendUserFragment.class, "2");
       return this.j;
    }
    public final MerchantCardType xh(){
       Object obj = PatchProxy.applyWithListener(null, this, GrootMerchantRecommendUserFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(GrootMerchantRecommendUserFragment.class, "10");
       return l0.a(this.yh());
    }
    public MerchantRecommendUserFeed yh(){
       Object[] objArray = null;
       PhotoDetailParam obj = PatchProxy.applyWithListener(objArray, this, GrootMerchantRecommendUserFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.rh();
       if (obj != null) {
          PhotoDetailParam mPhoto = obj.mPhoto;
          if (mPhoto != null && mPhoto.getEntity() != null) {
             PatchProxy.onMethodExit(GrootMerchantRecommendUserFragment.class, "9");
             return obj.mPhoto.getEntity().a(MerchantRecommendUserFeed.class);
          }
       }
       PatchProxy.onMethodExit(GrootMerchantRecommendUserFragment.class, "9");
       return objArray;
    }
}
