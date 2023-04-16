package com.yxcorp.gifshow.growth.invite.slidepage.GrowthInvitePageFragment;
import com.kwai.component.photo.detail.slide.groot.DetailSlidePlayFragment;
import com.yxcorp.gifshow.growth.invite.slidepage.GrowthInvitePageFragment$a;
import nsd.u;
import com.yxcorp.gifshow.growth.invite.slidepage.GrowthInvitePageFragment$configurationChangeListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.growth.invite.slidepage.GrowthInvitePageFragment$tkBridge$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.groot.slide.fragment.GrootBaseFragment;
import com.yxcorp.gifshow.growth.invite.slidepage.GrowthInvitePageFragment$b;
import java.lang.Runnable;
import android.view.View;
import com.kwai.feature.api.feed.growth.model.invite.InviteSlidePageFeedModel;
import com.google.gson.JsonObject;
import com.kwai.feature.api.feed.growth.model.invite.InviteCardMeta;
import com.google.gson.JsonElement;
import sx4.e;
import tx4.h;
import androidx.fragment.app.Fragment;
import oo5.a;
import lnc.i3;
import com.kwai.robust.PatchProxyResult;
import tb7.d;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import kp.r1;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.android.model.mix.CommonMeta;
import wkd.b;
import yma.a;
import yma.c;
import brd.t;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.library.slide.base.log.SlidePlayLogger;
import android.os.Bundle;
import java.lang.CharSequence;
import foa.b;
import com.yxcorp.gifshow.detail.presenter.ResumeAndPausePlayerByPageLifecyclePresenter;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import qrd.l1;
import dw6.b;
import hx6.a;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import tl8.d;
import android.content.Context;
import android.widget.FrameLayout;
import le5.f;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import lnc.a1;
import androidx.fragment.app.FragmentActivity;
import cra.w;
import q87.c;
import android.app.Activity;
import rx4.a;
import rx4.b;
import tx4.l;
import com.kuaishou.activity.kwaibubble.KwaiPopGlobalConfig;
import eoa.a;
import tx4.p;
import eoa.b;
import eoa.c;
import java.util.Objects;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import rn.c;
import sx4.e$a;
import tx4.o;
import rkd.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.b;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;

public final class GrowthInvitePageFragment extends DetailSlidePlayFragment	// class@0013cc
{
    public PresenterV2 F;
    public NasaBizParam G;
    public a H;
    public e I;
    public InviteSlidePageFeedModel J;
    public final p K;
    public final p L;
    public static final GrowthInvitePageFragment$a M;

    static {
       GrowthInvitePageFragment.M = new GrowthInvitePageFragment$a(null);
    }
    public void GrowthInvitePageFragment(){
       super();
       this.K = s.c(new GrowthInvitePageFragment$configurationChangeListener$2(this));
       this.L = s.c(new GrowthInvitePageFragment$tkBridge$2(this));
    }
    public final void Ah(){
       if (PatchProxy.applyVoid(null, this, GrowthInvitePageFragment.class, "14")) {
          return;
       }
       GrootBaseFragment tj = this.j;
       if (tj != null) {
          tj.post(new GrowthInvitePageFragment$b(this));
       }
       return;
    }
    public final void Bh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, GrowthInvitePageFragment.class, "22")) {
          return;
       }
       GrowthInvitePageFragment tI = this.I;
       if (tI != null) {
          GrowthInvitePageFragment tJ = this.J;
          if (tJ != null) {
             InviteSlidePageFeedModel mInviteCardM = tJ.mInviteCardMeta;
             if (mInviteCardM != null) {
                JsonObject tkData = mInviteCardM.getTkData();
                if (tkData != null) {
                   objArray = tkData.toString();
                }
             }
          }
          b.a(tI, "updateUI", objArray, null, 4, null);
       }
       return;
    }
    public void H2(){
       InviteSlidePageFeedModel mCommonMeta;
       String str1;
       JsonObject reportInfo1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, GrowthInvitePageFragment.class, "9")) {
          return;
       }
       this.mh();
       a.h(this, false);
       this.Bh();
       GrowthInvitePageFragment tI = this.I;
       if (tI != null) {
          b.a(tI, "onShow", null, null, 6, null);
       }
       if (!PatchProxy.applyVoid(objArray, this, GrowthInvitePageFragment.class, "19")) {
          i3 oi3 = i3.f();
          String str = PatchProxy.apply(objArray, this, GrowthInvitePageFragment.class, "23");
          if (str != PatchProxyResult.class) {
          }else {
             tI = this.J;
             if (tI != null) {
                mCommonMeta = tI.mInviteCardMeta;
                if (mCommonMeta != null) {
                   reportInfo1 = mCommonMeta.getReportInfo();
                label_0050 :
                   str = d.h(reportInfo1, "cardType", objArray, 2, objArray);
                }
             }
             reportInfo1 = objArray;
             goto label_0050 ;
          }
          oi3.d("card_type", str);
          oi3.d("card_status", "doudi");
          DetailSlidePlayFragment tx = this.x;
          a.o(tx, "mDetailParam");
          oi3.c("feed_index", Integer.valueOf((r1.y1(tx.getBaseFeed()) + 1)));
          tI = this.J;
          if (tI != null) {
             mCommonMeta = tI.mCommonMeta;
             if (mCommonMeta != null) {
                objArray = mCommonMeta.mListLoadSequenceID;
             }
          }
          oi3.d("llsid", objArray);
          this.yh("SLIDE_UP_DOWN_LIEBIAN_POS_ITEM", oi3.e());
          c obj = b.a(-1257347683);
          a.o(obj, "Singleton.get\(GrowthApi::class.java\)");
          obj = obj.a();
          GrowthInvitePageFragment tJ = this.J;
          if (tJ != null) {
             InviteSlidePageFeedModel mInviteCardM = tJ.mInviteCardMeta;
             if (mInviteCardM != null) {
                JsonObject reportInfo = mInviteCardM.getReportInfo();
                if (reportInfo != null) {
                   str1 = reportInfo.toString();
                   if (str1 != null) {
                   label_00be :
                      obj.c(str1).subscribe();
                   }
                }
             }
          }
          str1 = "{}";
          goto label_00be ;
       }
       return;
    }
    public void N2(){
       if (PatchProxy.applyVoid(null, this, GrowthInvitePageFragment.class, "11")) {
          return;
       }
       this.ph();
       a.h(this, true);
       return;
    }
    public void Q0(){
       if (PatchProxy.applyVoid(null, this, GrowthInvitePageFragment.class, "10")) {
          return;
       }
       this.oh();
       return;
    }
    public void Q1(){
       if (PatchProxy.applyVoid(null, this, GrowthInvitePageFragment.class, "8")) {
          return;
       }
       this.nh();
       return;
    }
    public void d0(){
       if (PatchProxy.applyVoid(null, this, GrowthInvitePageFragment.class, "7")) {
          return;
       }
       GrowthInvitePageFragment tF = this.F;
       if (tF != null) {
          tF.destroy();
       }
       this.zh();
       return;
    }
    public SlidePlayLogger d1(){
       return null;
    }
    public int getPage(){
       return 0x7d42;
    }
    public String o(){
       return "FEATURED_PAGE";
    }
    public void onActivityCreated(Bundle p0){
       String bgm;
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthInvitePageFragment.class, "6")) {
          return;
       }
       super.onActivityCreated(p0);
       if (this.rh() == null) {
          return;
       }
       int i = 0;
       if (this.F == null) {
          PresenterV2 presenterV2 = new PresenterV2();
          GrowthInvitePageFragment tJ = this.J;
          String str = null;
          if (tJ != null) {
             InviteSlidePageFeedModel mInviteCardM = tJ.mInviteCardMeta;
             if (mInviteCardM != null) {
                bgm = mInviteCardM.getBgm();
             label_002f :
                b uob = (bgm == null || !bgm.length())? 1: null;
                if (!uob) {
                   GrowthInvitePageFragment tJ1 = this.J;
                   if (tJ1 != null) {
                      InviteSlidePageFeedModel mInviteCardM1 = tJ1.mInviteCardMeta;
                      if (mInviteCardM1 != null) {
                         str = mInviteCardM1.getBgm();
                      }
                   }
                   a.m(str);
                   presenterV2.U7(new b(str, this));
                   presenterV2.U7(new ResumeAndPausePlayerByPageLifecyclePresenter(this));
                }
                presenterV2.f(this.requireView());
                this.F = presenterV2;
             }
          }
          bgm = str;
          goto label_002f ;
       }
       GrowthInvitePageFragment tF = this.F;
       if (tF != null) {
          Object[] objArray = new Object[]{this,this.rh()};
          tF.i(objArray);
       }
       this.qh();
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthInvitePageFragment.class, "3")) {
          return;
       }
       super.onCreate(p0);
       p0 = a.a(this.ch());
       a.o(p0, "SlideParamsConvertUtils.¡­le\(grootInjectItemParams\)");
       this.G = p0;
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       InviteSlidePageFeedModel inviteSlideP;
       GrowthInvitePageFragment tG;
       FragmentActivity activity;
       JsonObject tkData;
       c a;
       boolean b;
       String tkBundleId;
       KwaiPopGlobalConfig c;
       int tkMinVer;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Context obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, GrowthInvitePageFragment.class, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "inflater");
       super.onCreateView(p0, p1, p2);
       PhotoDetailParam photoDetailP = this.rh();
       GifshowActivity gifshowActiv = null;
       if (photoDetailP != null) {
          BaseFeed baseFeed = photoDetailP.getBaseFeed();
          if (baseFeed != null) {
             inviteSlideP = baseFeed.a(InviteSlidePageFeedModel.class);
          label_0032 :
             this.J = inviteSlideP;
             int i = 0;
             if (this.j == null && this.getContext() != null) {
                obj = this.getContext();
                a.m(obj);
                FrameLayout uFrameLayout = new FrameLayout(obj);
                if (f.b()) {
                   tG = this.G;
                   String str = "nasaBizParam";
                   if (tG == null) {
                      a.S(str);
                   }
                   NasaSlideParam nasaSlidePar = tG.getNasaSlideParam();
                   String str1 = "nasaBizParam.nasaSlideParam";
                   a.o(nasaSlidePar, str1);
                   if (!nasaSlidePar.isHomePage()) {
                      tG = this.G;
                      if (tG == null) {
                         a.S(str);
                      }
                      nasaSlidePar = tG.getNasaSlideParam();
                      a.o(nasaSlidePar, str1);
                      if (!nasaSlidePar.isTrendingPage()) {
                      label_007d :
                         uFrameLayout.setPadding(i, i, i, a1.d(R.dimen.arg_RES_7f070bf1));
                      }
                   }
                }else {
                   goto label_007d ;
                }
                this.j = uFrameLayout;
             }
             if (this.H == null) {
                activity = this.getActivity();
                if (!PatchProxy.applyVoidOneRefs(activity, this, GrowthInvitePageFragment.class, "12")) {
                   tG = this.J;
                   InviteSlidePageFeedModel mInviteCardM = (tG != null)? tG.mInviteCardMeta: gifshowActiv;
                   if (mInviteCardM == null) {
                      Object[] objArray = new Object[i];
                      w.C().t("GrowthInvitePage", "renderTkView userMeta is null", objArray);
                      this.Ah();
                   }else if(activity == null || activity.isFinishing()){
                      a uoa = PatchProxy.applyOneRefs(activity, this, GrowthInvitePageFragment.class, "13");
                      if (uoa != patchProxyRe) {
                      }else {
                         tG = this.J;
                         if (tG != null) {
                            mInviteCardM = tG.mInviteCardMeta;
                            if (mInviteCardM != null) {
                               tkBundleId = mInviteCardM.getTkBundleId();
                            label_00e1 :
                               b uob1 = new b(activity, gifshowActiv, tkBundleId, "Growth_feeds");
                               l ol = PatchProxy.apply(gifshowActiv, this, GrowthInvitePageFragment.class, "2");
                               if (ol == patchProxyRe) {
                                  ol = this.L.getValue();
                               }
                               uob1.c(ol);
                               c = KwaiPopGlobalConfig.c;
                               if (tkBundleId == null) {
                                  tkBundleId = "";
                               }
                               uob1.f(c.a(tkBundleId));
                               uob1.g(1);
                               GrowthInvitePageFragment tJ = this.J;
                               if (tJ != null) {
                                  inviteSlideP = tJ.mInviteCardMeta;
                                  if (inviteSlideP != null) {
                                     tkMinVer = inviteSlideP.getTkMinVer();
                                  label_011d :
                                     uob1.e(tkMinVer);
                                     uob1.d(a.b);
                                     uoa = uob1.b();
                                     a.o(uoa, "TKContainerBuilder\(\n    ¡­le\)\n      }\n    }.build\(\)");
                                  }
                               }
                               tkMinVer = -1;
                               goto label_011d ;
                            }
                         }
                         tkBundleId = gifshowActiv;
                         goto label_00e1 ;
                      }
                      this.H = uoa;
                      JsonObject jsonObject = new JsonObject();
                      jsonObject.c0("action", "initData");
                      tG = this.J;
                      if (tG != null) {
                         mInviteCardM = tG.mInviteCardMeta;
                         if (mInviteCardM != null) {
                            tkData = mInviteCardM.getTkData();
                            if (tkData != null) {
                            label_0150 :
                               jsonObject.G("data", tkData);
                               String str2 = jsonObject.toString();
                               a.o(str2, "JsonObject\(\).apply {\n   ¡­bject\(\)\)\n    }.toString\(\)");
                               b uob = new b(this);
                               a = c.a;
                               Objects.requireNonNull(a);
                               Object[] obj1 = PatchProxy.apply(gifshowActiv, a, c.class, "1");
                               b = (obj1 != patchProxyRe)? obj1.booleanValue(): a.t().d("invite_slide_page_use_async", 1);
                               if (b) {
                                  GrowthInvitePageFragment tH = this.H;
                                  if (tH != null) {
                                     Object[] objArray1 = new Object[]{str2};
                                     tH.n(c.c.a(), null, uob, "page", objArray1);
                                  }
                               }else {
                                  GrowthInvitePageFragment tH1 = this.H;
                                  if (tH1 != null) {
                                     obj1 = new Object[]{str2};
                                     tH1.f(gifshowActiv, uob, "page", obj1);
                                  }
                               }
                            }
                         }
                      }
                      tkData = new JsonObject();
                      goto label_0150 ;
                   }
                }
             }
          label_01a7 :
             if (b.f()) {
                activity = this.getActivity();
                if (activity instanceof GifshowActivity) {
                   gifshowActiv = activity;
                }
                if (gifshowActiv != null) {
                   gifshowActiv.i3(this.xh());
                }
             }
             return this.j;
          }
       }
       inviteSlideP = gifshowActiv;
       goto label_0032 ;
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, GrowthInvitePageFragment.class, "5")) {
          return;
       }
       super.onDestroyView();
       this.zh();
       if (b.f()) {
          FragmentActivity activity = this.getActivity();
          if (activity instanceof GifshowActivity) {
             objArray = activity;
          }
          if (objArray != null) {
             objArray.s3(this.xh());
          }
       }
       return;
    }
    public final b xh(){
       Object obj = PatchProxy.apply(null, this, GrowthInvitePageFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.K.getValue();
    }
    public final void yh(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GrowthInvitePageFragment.class, "21")) {
          return;
       }
       ShowMetaData showMetaData = new ShowMetaData();
       showMetaData.setType(3);
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = p0;
       uElementPack.params = p1;
       showMetaData.setElementPackage(uElementPack);
       u1.B0(showMetaData);
       return;
    }
    public final void zh(){
       if (PatchProxy.applyVoid(null, this, GrowthInvitePageFragment.class, "15")) {
          return;
       }
       GrowthInvitePageFragment tH = this.H;
       if (tH != null) {
          tH.onStop();
       }
       tH = this.H;
       if (tH != null) {
          tH.onDestroy();
       }
       GrootBaseFragment tj = this.j;
       if (!tj instanceof ViewGroup) {
          tj = null;
       }
       if (tj != null) {
          tj.removeAllViews();
       }
       this.H = null;
       return;
    }
}
