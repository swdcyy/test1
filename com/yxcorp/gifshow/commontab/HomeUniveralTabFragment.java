package com.yxcorp.gifshow.commontab.HomeUniveralTabFragment;
import eb5.g;
import com.kwai.component.homepage_interface.homeitemfragment.HomeItemFragment;
import com.yxcorp.gifshow.commontab.HomeUniveralTabFragment$a;
import nsd.u;
import ra6.a;
import com.yxcorp.gifshow.action.RealActionBizType;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import y8c.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import zm9.n;
import com.kwai.framework.model.universalfeedtab.UniversalFeed;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import cb5.u;
import fn9.e;
import hn5.n;
import hn5.m;
import cb5.c0;
import androidx.fragment.app.Fragment;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.HomeItemRecoRealShowPresenter;
import q99.a;
import x99.o;
import com.yxcorp.gifshow.commontab.util.UniversalTabExperimentManager;
import cb5.r;
import fn9.b;
import brd.t;
import eb5.f;
import java.lang.Boolean;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;
import com.kwai.kcube.TabIdentifier;
import on5.b;
import wa5.e;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import on5.a;
import java.lang.StringBuilder;
import jb5.d;
import com.yxcorp.gifshow.refresh.RefreshType;
import in9.c;
import q87.c;
import y99.i;
import android.view.View;
import android.os.Bundle;
import in9.b;
import in9.a;
import tx4.f;
import com.kuaishou.tk.api.a;
import db5.c;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kwai.component.feedstaggercard.model.CardStyle;
import db5.d;
import java.lang.Integer;
import java.lang.Float;
import zm9.k;
import java.util.Map;
import ro5.e0;
import com.yxcorp.gifshow.page.cost.RecyclerFragmentWithStageTrace;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kwai.component.kcube.model.model.TabConfig;
import com.kwai.component.kcube.model.model.TabBizParams;
import com.yxcorp.gifshow.model.LivePlayConfig;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.tachikoma.api.container.TKContainer;
import java.util.Objects;
import rx4.a;
import g9c.d;
import oe6.e;
import qvb.n0;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import com.yxcorp.gifshow.model.response.feed.HeaderFooterData;
import com.yxcorp.gifshow.model.response.feed.HeaderFooterInfo;
import com.kuaishou.tachikoma.TKViewContainerWrapView;
import java.util.List;
import y8c.g;
import gn9.b;
import com.kwai.component.feedstaggercard.PhotoItemViewParam;
import gn9.a;
import a9c.e;
import an9.l;
import com.yxcorp.gifshow.commontab.a;
import pa5.n;
import com.kwai.component.photo.reduce.f;
import com.yxcorp.gifshow.commontab.HomeUniveralTabFragment$b;
import ha5.e;
import ab5.a;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.commercial.tach.container.KwaiTKContainer$a;
import android.app.Activity;
import android.view.ViewGroup;
import com.kuaishou.commercial.tach.container.KwaiTKContainer;
import hn9.a;
import k2b.e0;
import zm9.c;
import org.json.JSONObject;
import java.lang.Long;
import no8.e;
import android.content.Context;
import sx4.e$a;
import com.kuaishou.tachikoma.TKViewContainerWrapView$a;
import android.widget.FrameLayout;
import qrd.l1;
import kotlin.collections.CollectionsKt__CollectionsKt;
import qvb.i;
import com.yxcorp.gifshow.commontab.pagelist.HomeUniversalTabPageList;
import yv8.c;

public final class HomeUniveralTabFragment extends HomeItemFragment implements g	// class@0011b1
{
    public final int R;
    public CardStyle S;
    public a T;
    public e U;
    public a U0;
    public c V;
    public TKViewContainerWrapView V0;
    public PublishSubject W;
    public String W0;
    public TabConfig X;
    public View X0;
    public UniversalFeed Y;
    public boolean Y0;
    public KwaiTKContainer Z;
    public static final String Z0;
    public static final HomeUniveralTabFragment$a a1;

    static {
       String str;
       HomeUniveralTabFragment.a1 = new HomeUniveralTabFragment$a(null);
       int i = a.d();
       if (i != 1) {
          str = (i != 2)? "en": "zh-hant";
       }else {
          str = "zh-hans";
       }
       HomeUniveralTabFragment.Z0 = str;
    }
    public void HomeUniveralTabFragment(){
       super();
       this.R = 1;
       this.V = RealActionBizType.UNIVERSAL_FEED_TAB;
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<RealAction>\(\)");
       this.W = publishSubje;
    }
    public t Bh(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, HomeUniveralTabFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       HomeUniveralTabFragment tY = this.Y;
       UniversalFeed mFooterBundl = (tY != null)? tY.mFooterBundleId: objArray;
       if (tY != null) {
          objArray = tY.mFooterBundleViewKey;
       }
       return new n(this, mFooterBundl, objArray);
    }
    public PresenterV2 Mh(){
       Object obj = PatchProxy.applyWithListener(null, this, HomeUniveralTabFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(HomeUniveralTabFragment.class, "9");
       return new u(true);
    }
    public void Oh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HomeUniveralTabFragment.class, "8")) {
          return;
       }
       super.Oh();
       this.I.U7(new e());
       this.I.U7(m.a().GW());
       this.I.U7(new c0(this));
       this.I.U7(new HomeItemRecoRealShowPresenter());
       HomeUniveralTabFragment tT = this.T;
       if (tT != null) {
          if (tT != null) {
             objArray = tT.n;
          }
          if (objArray != null) {
             this.I.U7(new o());
          }
       }
       if (UniversalTabExperimentManager.a()) {
          this.I.U7(new r());
       }
       this.I.U7(new b());
       return;
    }
    public t Ra(){
       return f.b(this);
    }
    public String Sh(){
       return "HomeUniveralTabFragment";
    }
    public void U0(boolean p0){
       if (PatchProxy.isSupport(HomeUniveralTabFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, HomeUniveralTabFragment.class, "18")) {
          return;
       }
       RecyclerView recyclerView = this.h0();
       if (!recyclerView instanceof CustomRecyclerView) {
          recyclerView = null;
       }
       if (recyclerView != null) {
          recyclerView.setCanPullToRefresh(p0);
       }
       return;
    }
    public TabIdentifier Ua(){
       TabIdentifier obj = PatchProxy.apply(null, this, HomeUniveralTabFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.y;
       a.o(obj, "HomeTabIdentifier.UNIVERSAL_TAB");
       return obj;
    }
    public boolean Vh(){
       String obj = PatchProxy.apply(null, this, HomeUniveralTabFragment.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = e.a();
       a.o(obj, "HomeCommonExperimentMana¡­WhiteMaskInFeaturedPage\(\)");
       String str = this.o();
       a.m(str);
       return StringsKt__StringsKt.O2(obj, str, false, 2, null);
    }
    public String X3(){
       String obj = PatchProxy.apply(null, this, HomeUniveralTabFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.d(this.Ua());
       a.o(obj, "HomeTabIdConverter.identifierToTabTag\(homeTab\)");
       return obj;
    }
    public final a Yh(){
       return this.T;
    }
    public void Z1(boolean p0,boolean p1){
       RefreshType refreshType;
       if (PatchProxy.isSupport(HomeUniveralTabFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, HomeUniveralTabFragment.class, "11")) {
          return;
       }
       super.Z1(p0, p1);
       StringBuilder str = "onStartLoading"+",firstPage="+p0+",refreshType=";
       String str1 = (p0)? "refresh": "loadMore";
       str = str+str1+",refreshSource=";
       d uod = this.Qh();
       a.o(uod, "pageList");
       refreshType = uod.x2();
       str1 = (refreshType != null)? refreshType.refreshTypeToRefreshSource(): null;
       Object[] objArray = new Object[0];
       c.C().w("HomeUniveralTabFragment", str+str1, objArray);
       return;
    }
    public void c0(){
       if (PatchProxy.applyVoid(null, this, HomeUniveralTabFragment.class, "20")) {
          return;
       }
       super.c0();
       HomeUniveralTabFragment tT = this.T;
       if (tT != null) {
          a d = tT.d;
          if (d != null) {
             d.d(false);
          }
       }
       return;
    }
    public int f(){
       int i = (this.Y0 != null)? 299: 8;
       return i;
    }
    public void fh(View p0,Bundle p1){
       HomeUniveralTabFragment tS;
       Object[] objArray1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HomeUniveralTabFragment.class, "4")) {
          return;
       }
       a.p(p0, "view");
       super.fh(p0, p1);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, HomeUniveralTabFragment.class, "22")) {
          tS = this.Y;
          UniversalFeed mHeaderBundl = (tS != null)? tS.mHeaderBundleId: objArray;
          d uod = null;
          tS = (mHeaderBundl == null || !mHeaderBundl.length())? 1: null;
          if (!tS) {
             tS = this.Y;
             mHeaderBundl = (tS != null)? tS.mHeaderBundleViewKey: objArray;
             RecyclerView recyclerView = (mHeaderBundl == null || !mHeaderBundl.length())? 1: null;
             if (!recyclerView) {
                tS = this.Y;
                mHeaderBundl = (tS != null)? tS.mHeaderBundleId: objArray;
                a.m(mHeaderBundl);
                if (!PatchProxy.applyVoidOneRefs(mHeaderBundl, objArray, b.class, "1")) {
                   a.p(mHeaderBundl, "bundle");
                   a.a(mHeaderBundl, uod, true, new a(mHeaderBundl));
                }
             }
          }
       }
    label_0071 :
       this.h0().addOnScrollListener(c.b);
       tS = this.S;
       a.m(tS);
       CardStyle mBottomType = tS.mBottomType;
       if (!PatchProxy.isSupport(d.class) || !PatchProxy.applyVoidFourRefs(this, Integer.valueOf(mBottomType), Boolean.TRUE, Float.valueOf(50.00f), null, d.class, "4")) {
          d.b(this, mBottomType, true, true, 50.00f);
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HomeUniveralTabFragment.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new k();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, HomeUniveralTabFragment.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(HomeUniveralTabFragment.class, new k());
       }else {
          obj.put(HomeUniveralTabFragment.class, null);
       }
       return obj;
    }
    public String getPageParams(){
       StringBuilder obj = PatchProxy.apply(null, this, HomeUniveralTabFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = e0.b(this, "");
       a.o(obj, "HomeTopTabPageParamsUtil.appendTabInfo\(this, sb\)");
       return obj;
    }
    public boolean kf(){
       return f.a(this);
    }
    public boolean lh(){
       return true;
    }
    public String o(){
       UniversalFeed mPage2;
       HomeUniveralTabFragment tY = this.Y;
       if (tY != null) {
          mPage2 = tY.mPage2;
          if (mPage2 != null) {
          label_000b :
             return mPage2;
          }
       }
       mPage2 = "UNIVERSAL_TAB";
       goto label_000b ;
    }
    public void onCreate(Bundle p0){
       TabBizParams mUniversalFe;
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeUniveralTabFragment.class, "3")) {
          return;
       }
       super.onCreate(p0);
       p0 = this.getArguments();
       UniversalFeed universalFee = null;
       Serializable serializable = (p0 != null)? SerializableHook.getSerializable(p0, "UNIVERSAL_TAB_PARAM"): universalFee;
       if (!serializable instanceof TabConfig) {
          serializable = universalFee;
       }
       this.X = serializable;
       if (serializable != null) {
          TabConfig mBizParams = serializable.mBizParams;
          if (mBizParams != null) {
             mUniversalFe = mBizParams.mUniversalFeed;
          label_0030 :
             this.Y = mUniversalFe;
             this.S = CardStyle.CARD_V6;
             this.T = new a(this, FollowConfigUtil.o(), 3);
             HomeUniveralTabFragment tX = this.X;
             if (tX != null) {
                mBizParams = tX.mBizParams;
                if (mBizParams != null) {
                   mUniversalFe = mBizParams.mUniversalFeed;
                   if (mUniversalFe != null) {
                      universalFee = mUniversalFe.mPage2;
                   }
                }
             }
             if (a.g(universalFee, "SCHOOL_MAP")) {
                this.Y0 = true;
             }
             return;
          }
       }
       mUniversalFe = universalFee;
       goto label_0030 ;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, HomeUniveralTabFragment.class, "24")) {
          return;
       }
       super.onDestroy();
       HomeUniveralTabFragment tZ = this.Z;
       if (tZ != null) {
          tZ.onDestroy();
       }
       tZ = this.T;
       if (tZ != null) {
          tZ.a();
       }
       this.Z = null;
       this.U0 = null;
       if (this.sh() instanceof n) {
          t ot = this.sh();
          Objects.requireNonNull(ot, "null cannot be cast to non-null type com.yxcorp.gifshow.commontab.HomeUniversalTabPhotoGridTipsHelper");
          if (!PatchProxy.applyVoid(null, ot, n.class, "5")) {
             n o = ot.o;
             if (o != null) {
                o.onDestroy();
                ot.o = null;
             }
          }
       }
       return;
    }
    public void th(){
       if (PatchProxy.applyVoid(null, this, HomeUniveralTabFragment.class, "5")) {
          return;
       }
       super.th();
       this.ia().p1(true);
       return;
    }
    public void u(){
       if (PatchProxy.applyVoid(null, this, HomeUniveralTabFragment.class, "19")) {
          return;
       }
       super.u();
       HomeUniveralTabFragment tT = this.T;
       if (tT != null) {
          a d = tT.d;
          if (d != null) {
             d.d(true);
          }
       }
       return;
    }
    public void v2(boolean p0,boolean p1){
       String mJsonContent;
       String mJsonContent1;
       Object[] objArray1;
       if (PatchProxy.isSupport(HomeUniveralTabFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, HomeUniveralTabFragment.class, "12")) {
          return;
       }
       super.v2(p0, p1);
       e.k0("");
       d uod = this.Qh();
       a.o(uod, "pageList");
       HomeFeedResponse homeFeedResp = uod.L0();
       int i = 0;
       if (p0) {
          String str = null;
          if (homeFeedResp != null) {
             HomeFeedResponse mHeaderFoote = homeFeedResp.mHeaderFooterInfo;
             if (mHeaderFoote != null) {
                HeaderFooterData mHeaderData = mHeaderFoote.getMHeaderData();
                if (mHeaderData != null) {
                   mJsonContent = mHeaderData.getMJsonContent();
                label_0048 :
                   int i1 = 1;
                   HomeUniveralTabFragment homeUniveral = (mJsonContent == null || !mJsonContent.length())? 1: null;
                   if (!homeUniveral) {
                      homeUniveral = this.W0;
                      if (homeFeedResp != null) {
                         HomeFeedResponse mHeaderFoote1 = homeFeedResp.mHeaderFooterInfo;
                         if (mHeaderFoote1 != null) {
                            HeaderFooterData mHeaderData1 = mHeaderFoote1.getMHeaderData();
                            if (mHeaderData1 != null) {
                               mJsonContent1 = mHeaderData1.getMJsonContent();
                            label_006b :
                               if (a.g(homeUniveral, mJsonContent1) ^ i1) {
                                  if (homeFeedResp != null) {
                                     mHeaderFoote = homeFeedResp.mHeaderFooterInfo;
                                     if (mHeaderFoote != null) {
                                        mHeaderData = mHeaderFoote.getMHeaderData();
                                        if (mHeaderData != null) {
                                           str = mHeaderData.getMJsonContent();
                                        }
                                     }
                                  }
                                  this.W0 = str;
                                  homeUniveral = this.V0;
                                  if (homeUniveral != null) {
                                     Object[] objArray = new Object[i1];
                                     objArray[i] = str;
                                     homeUniveral.setData(objArray);
                                  }
                               }
                            }
                         }
                      }
                      mJsonContent1 = str;
                      goto label_006b ;
                   }
                }
             }
          }
          mJsonContent = str;
          goto label_0048 ;
       }
    label_008f :
       if (homeFeedResp == null) {
          objArray1 = new Object[i];
          c.C().w("HomeUniveralTabFragment", "response is null", objArray1);
       }else {
          c uoc = c.C();
          StringBuilder str1 = "onFinishLoading"+",firstPage="+p0+",llsid="+homeFeedResp.mLlsid+",photoSize=";
          HomeFeedResponse mQPhotos = homeFeedResp.mQPhotos;
          String str2 = (mQPhotos != null)? String.valueOf(mQPhotos.size()): "empty";
          objArray1 = new Object[i];
          uoc.w("HomeUniveralTabFragment", str1+str2+",hasMore="+homeFeedResp.hasMore(), objArray1);
       }
       return;
    }
    public g vh(){
       Object[] objArray1;
       HomeUniveralTabFragment tX;
       UniversalFeed mSlideUpDown;
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, HomeUniveralTabFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 1;
       int i1 = 0;
       if (this.Y0 != null) {
          objArray1 = new Object[i];
          objArray1[i1] = this.T;
          obj = new b(this.Ua(), this.F, a.f(), objArray1);
       }else {
          objArray1 = new Object[i];
          objArray1[i1] = this.T;
          l ol = new l(this.Ua(), this.F, a.f(), objArray1);
       }
       obj.x1(this.S);
       obj.z1(new f(this));
       obj.y1(new HomeUniveralTabFragment$b(this));
       obj.n1("HOME_RECYCLE_VIEW_SCROLL_STATE", this.H.k);
       Boolean tRUE = Boolean.TRUE;
       obj.n1("HOT_LIVE_CLICK_TO_SLIDE_PLAY", tRUE);
       if (this.Y0 != null) {
          obj.n1("SCHOOL_CLICK_TO_SLIDE_PLAY", tRUE);
       }else {
          obj.n1("UNIVERSAL_TAB_CLICK_TO_SLIDE_PLAY", tRUE);
          tX = this.X;
          if (tX != null) {
             TabConfig mBizParams = tX.mBizParams;
             if (mBizParams != null) {
                TabBizParams mUniversalFe = mBizParams.mUniversalFeed;
                if (mUniversalFe != null) {
                   mSlideUpDown = mUniversalFe.mSlideUpDownRequestPath;
                label_0085 :
                   obj.n1("UNIVERSAL_TAB_CLICK_TO_SLIDE_PLAY_PATH", mSlideUpDown);
                }
             }
          }
          mSlideUpDown = objArray;
          goto label_0085 ;
       }
       tX = this.X;
       if (tX != null) {
          objArray = tX.getName(i1);
       }
       obj.n1("PAGE_NAME", objArray);
       obj.n1("HOME_COVER_ENABLE_MIN_ASPECTIO", tRUE);
       obj.n1("RECYCLERVIEW_LAYOUT_COMPLETE", Boolean.valueOf(this.H.l));
       obj.n1("HOT_ITEM_REAL_ACTION_OBSERVER", this.W);
       return obj;
    }
    public List wh(){
       FragmentActivity activity;
       HomeUniveralTabFragment tY1;
       KwaiTKContainer obj1;
       TKViewContainerWrapView tKViewContai;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       HomeUniveralTabFragment obj = PatchProxy.apply(objArray, this, HomeUniveralTabFragment.class, "13");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.Y;
       UniversalFeed mHeaderBundl = (obj != null)? obj.mHeaderBundleId: objArray;
       obj = (mHeaderBundl == null || !mHeaderBundl.length())? 1: null;
       if (!obj) {
          obj = this.Y;
          mHeaderBundl = (obj != null)? obj.mHeaderBundleViewKey: objArray;
          c uoc = (mHeaderBundl == null || !mHeaderBundl.length())? 1: null;
          if (!uoc) {
             uoc = c.C();
             StringBuilder str = "onCreateHeaderViews "+"--- bundleId: ";
             HomeUniveralTabFragment tY = this.Y;
             UniversalFeed mHeaderBundl1 = (tY != null)? tY.mHeaderBundleId: objArray;
             str = str+mHeaderBundl1+"--- viewKey: ";
             tY = this.Y;
             mHeaderBundl1 = (tY != null)? tY.mHeaderBundleViewKey: objArray;
             Object[] objArray1 = new Object[0];
             uoc.w("HomeUniveralTabFragment", str+mHeaderBundl1, objArray1);
             if (!PatchProxy.applyVoid(objArray, this, HomeUniveralTabFragment.class, "14")) {
                if (this.Z == null) {
                   activity = this.getActivity();
                   if (activity != null) {
                      tY = this.Y;
                      mHeaderBundl1 = (tY != null)? tY.mHeaderBundleId: objArray;
                      a.m(mHeaderBundl1);
                      tY1 = this.Y;
                      UniversalFeed mHeaderBundl2 = (tY1 != null)? tY1.mHeaderBundleViewKey: objArray;
                      a.m(mHeaderBundl2);
                      KwaiTKContainer$a uoa = new KwaiTKContainer$a(activity, objArray, mHeaderBundl1, mHeaderBundl2);
                      KwaiTKContainer$a uoa1 = KwaiTKContainer$a.class;
                      if (PatchProxy.isSupport(uoa1)) {
                         obj1 = PatchProxy.applyOneRefs(Boolean.TRUE, uoa, uoa1, "1");
                         if (obj1 != patchProxyRe) {
                            uoa = obj1;
                         label_00c5 :
                            obj1 = uoa.a();
                         }
                      }
                      uoa.a.u(1);
                      goto label_00c5 ;
                   }else {
                      Object[] objArray4 = objArray;
                   }
                   this.Z = obj1;
                }
                if (this.U0 == null) {
                   FragmentActivity activity1 = this.getActivity();
                   a.m(activity1);
                   a.o(activity1, "activity!!");
                   this.U0 = new a(activity1, this, this);
                }
                tY1 = this.Z;
                if (tY1 != null) {
                   long l = 0x2710;
                   HomeUniveralTabFragment tU0 = this.U0;
                   c uoc1 = new c(this);
                   obj = this.Y;
                   UniversalFeed universalFee = (obj != null)? obj.mHeaderBundleViewKey: objArray;
                   Object[] objArray2 = new Object[1];
                   String str1 = PatchProxy.apply(objArray, this, HomeUniveralTabFragment.class, "23");
                   if (str1 != patchProxyRe) {
                   }else {
                      JSONObject jSONObject = new JSONObject();
                      jSONObject.put("curLanguage", HomeUniveralTabFragment.Z0);
                      str1 = jSONObject.toString();
                      a.o(str1, "jsonObject.toString\(\)");
                   }
                   objArray2[0] = str1;
                   TKContainer tKContainer = TKContainer.class;
                   if (PatchProxy.isSupport(tKContainer)) {
                      Object[] objArray3 = new Object[]{Long.valueOf(l),tU0,uoc1,universalFee,objArray2};
                      tKViewContai = PatchProxy.apply(objArray3, tY1, tKContainer, "9");
                      if (tKViewContai != patchProxyRe) {
                      }
                   }
                   tKViewContai = tY1.h0(0x2710, new TKViewContainerWrapView(e.k), tU0, uoc1, universalFee, objArray2);
                }else {
                   tKViewContai = objArray;
                }
                this.V0 = tKViewContai;
             }
             Context context = this.getContext();
             a.m(context);
             FrameLayout uFrameLayout = new FrameLayout(context);
             obj = this.V0;
             if (obj != null) {
                objArray = obj.getView();
             }
             uFrameLayout.addView(objArray, -1, -1);
             this.X0 = uFrameLayout;
             View[] viewArray = new View[]{uFrameLayout};
             a.m(uFrameLayout);
             return CollectionsKt__CollectionsKt.P(viewArray);
          }
       }
       return objArray;
    }
    public i yh(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, HomeUniveralTabFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int page = this.getPage();
       HomeUniveralTabFragment tV = this.V;
       HomeUniveralTabFragment tY = this.Y;
       if (tY != null) {
          objArray = tY.mRequestPath;
       }
       return new HomeUniversalTabPageList(page, tV, false, objArray);
    }
}
