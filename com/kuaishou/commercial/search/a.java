package com.kuaishou.commercial.search.a;
import nl9.v;
import java.lang.Object;
import ml8.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import nl9.u;
import uy.p;
import uy.l;
import com.kuaishou.commercial.search.live.SearchAdLiveConversionPresenter;
import uy.g;
import com.kuaishou.commercial.search.feed.AdSearchDoubleFeedClickRecommendPresenter;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import mxb.c;
import bdd.e;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SearchBrandInfo;
import com.kwai.framework.model.feed.BaseFeed;
import nx8.k;
import iw.a;
import com.yxcorp.gifshow.ad.report.monitor.DynamicMonitorFactory;
import msd.l;
import cm9.a;
import com.kuaishou.commercial.search.live.b;
import com.kuaishou.commercial.search.live.d;
import ldd.c;
import idd.b;
import py.b;
import android.view.View;
import android.app.Activity;
import com.kuaishou.commercial.search.b;
import java.lang.Boolean;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import nx8.g;
import com.yxcorp.gifshow.photoad.model.PhotoAdDataWrapper;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import com.yxcorp.gifshow.ad.AdMainProcess;
import uy.k;
import sy.b;
import bm9.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.google.gson.JsonObject;
import nl9.a;
import fg6.a;
import com.kuaishou.commercial.search.qrcode.AdARScanResultModel;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import yx.j0;
import com.yxcorp.gifshow.model.CDNUrl;
import wy.g;
import kotlin.collections.ArraysKt___ArraysKt;
import com.yxcorp.gifshow.fragment.DialogContainerFragment;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.fragment.ContainerFragment;
import py.d;
import android.content.DialogInterface$OnDismissListener;
import py.e;
import com.yxcorp.gifshow.fragment.DialogContainerFragment$b;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import e17.i;
import java.lang.Throwable;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import java.lang.Number;
import tw.e;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverActionBarInfo;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import gdd.n;
import ufd.l;
import android.view.ViewGroup;
import rl9.b;
import java.lang.Integer;
import i2b.a;
import g59.k0;
import qy.e;
import qy.c;
import gdd.s;
import sy.a;
import rl9.c;
import qdd.a;
import rl9.f;
import pdd.c;
import wkd.b;
import ip.b;
import tw.j;
import android.content.Context;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import y8c.g;
import y8c.q;
import com.kuaishou.commercial.search.CommercialSearchPhotoShowConsumer;
import brd.t;
import y8c.a;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import gr8.c;
import brd.x;
import erd.g;
import crd.b;
import qy.h;
import gdd.a;
import qdd.i;
import jdd.d;
import jdd.e;
import mdd.f;
import mdd.d;
import gdd.q;
import rl9.d;
import qdd.b;
import com.kwai.sdk.switchconfig.a;
import k2b.e0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.b;
import k2b.u1;
import com.yxcorp.gifshow.log.b;
import pt5.a;
import com.kuaishou.commercial.search.widget.a;
import sy.c;
import java.util.List;
import com.yxcorp.gifshow.plugin.impl.search.BannerEntity;
import jm9.b;
import jm9.a;
import com.kuaishou.commercial.search.banner.SearchHomeAdBannerView;
import py.j;
import qy.a;
import py.a;
import rl9.e;
import qdd.l;
import com.kuaishou.commercial.search.commodity.AdSearchCommodityCoverTipsPresenter;
import com.kuaishou.commercial.search.commodity.AdSearchCommodityCoverClickPresenter;
import ry.b;

public class a implements v	// class@001545
{

    public void a(){
       super();
    }
    public void A2(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       d.a(-1694791652).A2(p0);
       this.F(p0);
       p0.add(new p());
       p0.add(new l());
       p0.add(new SearchAdLiveConversionPresenter());
       p0.add(new g());
       p0.add(new AdSearchDoubleFeedClickRecommendPresenter());
       this.D00(p0);
       return;
    }
    public String AO(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c.L(p0);
    }
    public String Ap(QPhoto p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyOneRefs(p0, this, a.class, "38");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.applyOneRefs(p0, null, e.class, "14");
       if (obj != patchProxyRe) {
       }else {
          PhotoAdvertisement$SearchBrandInfo searchBrandI = e.b(p0);
          obj = (searchBrandI == null)? "": k.d(searchBrandI.mShopProductModuleLinkUrl, p0.mEntity);
       }
       return obj;
    }
    public void C30(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "49")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p0 = DynamicMonitorFactory.c.n(p0, "searchAdFeed", null);
       if (p0 != null) {
          p0.start();
       }
       return;
    }
    public void Ce(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "7")) {
          return;
       }
       p0.add(new b());
       p0.add(new d());
       p0.add(new c());
       p0.add(new b());
       this.D00(p0);
       this.n(p0);
       return;
    }
    public void D00(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "50")) {
          return;
       }
       p0.add(new b());
       return;
    }
    public void EK(View p0,View p1,Activity p2,QPhoto p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, a.class, "53")) {
          return;
       }
       b.a(p0, p1, p2, p3);
       return;
    }
    public boolean EP(Activity p0,a p1){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PhotoAdvertisement obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "18");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.applyTwoRefs(p0, p1, null, b.class, "10");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          patchProxyRe = 0;
          if (p1 == null || (p1.getAdQPhoto() != null && k.B(p1.getAdQPhoto()) != null)) {
             obj = k.B(p1.getAdQPhoto());
             if (obj != null) {
                if (!TextUtils.x(obj.mUrl) || !TextUtils.x(obj.mScheme)) {
                   patchProxyRe = 1;
                }
                if (patchProxyRe) {
                   g.a.a(p0, new PhotoAdDataWrapper(p1.getAdQPhoto().mEntity)).m();
                }
                b = patchProxyRe;
             }
          }
          b = false;
       }
       return b;
    }
    public final void F(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       p0.add(new k());
       return;
    }
    public void Ge(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "45")) {
          return;
       }
       p0.add(new b());
       this.D00(p0);
       return;
    }
    public void Gf(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "8")) {
          return;
       }
       p0.add(new c());
       return;
    }
    public boolean Gx(QPhoto p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.h(p0, p1);
    }
    public void JH(GifshowActivity p0,JsonObject p1,a p2){
       Object[] objArray;
       Object[] obj;
       boolean b;
       String url;
       if (PatchProxy.applyVoidThreeRefsWithListener(p0, p1, p2, this, a.class, "55")) {
          return;
       }
       int i = 0;
       try{
          AdARScanResultModel uAdARScanRes = a.a.c(p1, AdARScanResultModel.class);
          if (p0 == null) {
             this.z0(p2, uAdARScanRes);
             objArray = new Object[i];
             j0.c("CommercialSearchAdPluginImpl-showAdARScanResultDialog", "showAdARScanResultDialog fail : activity is null", objArray);
             PatchProxy.onMethodExit(a.class, "55");
             return;
          }else if(uAdARScanRes != null && (!TextUtils.x(uAdARScanRes.getMActivityId()) && (uAdARScanRes.getMVideoUrls() != null && uAdARScanRes.getMVideoUrls().length > 0))){
             obj = PatchProxy.applyOneRefs(uAdARScanRes, null, g.class, "2");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else {
                CDNUrl[] mVideoUrls = uAdARScanRes.getMVideoUrls();
                if (mVideoUrls != null) {
                   CDNUrl uCDNUrl = ArraysKt___ArraysKt.Ib(mVideoUrls);
                   if (uCDNUrl != null) {
                      url = uCDNUrl.getUrl();
                   label_0071 :
                      b = TextUtils.x(url);
                   }
                }
                url = null;
                goto label_0071 ;
             }
             if (!b) {
                if (p2 != null) {
                   p2.a(g.a(uAdARScanRes));
                }
                DialogContainerFragment uDialogConta = new DialogContainerFragment();
                uDialogConta.Jh(i);
                uDialogConta.Ih(i);
                uDialogConta.nh(true);
                uDialogConta.vh(i);
                uDialogConta.k0(new d(this, p2, uAdARScanRes));
                uDialogConta.Lh(new e(uAdARScanRes, p2));
                uDialogConta.Cb(p0.getSupportFragmentManager(), "AdARScanResultDialog");
             }
          }
       label_00ad :
          obj = new Object[i];
          j0.c("CommercialSearchAdPluginImpl-showAdARScanResultDialog", "showAdARScanResultDialog fail : data is null", obj);
          this.z0(p2, uAdARScanRes);
          i.a(R.style.arg_RES_7f11066a, 0x7f100085);
          PatchProxy.onMethodExit(a.class, "55");
          return;
       }catch(java.lang.Exception e10){
          this.z0(p2, null);
          objArray = new Object[i];
          j0.d("CommercialSearchAdPluginImpl-showAdARScanResultDialog", e10, objArray);
       }
          PatchProxy.onMethodExit(a.class, "55");
          return;
    }
    public String LL(a p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PhotoAdvertisement$AdData obj = PatchProxy.applyOneRefs(p0, this, a.class, "20");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.applyOneRefs(p0, null, e.class, "29");
       if (obj != patchProxyRe) {
       }else if(p0 != null && (p0.getAdQPhoto() != null && (k.B(p0.getAdQPhoto()) != null && k.B(p0.getAdQPhoto()).mAdData != null))){
          obj = k.B(p0.getAdQPhoto()).mAdData.mSearchRecommendReason;
       }else {
          String str = "";
       }
       return obj;
    }
    public void N10(c p0,boolean p1){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, a.class, "9")) {
          return;
       }
       this.F(p0);
       p0.add(new p());
       this.D00(p0);
       return;
    }
    public int N5(QPhoto p0){
       int i;
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = PatchProxy.applyOneRefs(p0, null, e.class, "13");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          PhotoAdvertisement photoAdverti = k.B(p0);
          if (photoAdverti != null) {
             photoAdverti = photoAdverti.mAdData;
             if (photoAdverti != null) {
                PhotoAdvertisement$AdData mCoverAction = photoAdverti.mCoverActionbarInfo;
                if (mCoverAction != null) {
                   i = mCoverAction.mAdStyle;
                }
             }
          }
          i = 0;
       }
       return i;
    }
    public PresenterV2 O20(Object p0,boolean p1){
       if (PatchProxy.isSupport2(a.class, "25")) {
          Object obj = PatchProxy.applyTwoRefsWithListener(p0, Boolean.valueOf(p1), this, a.class, "25");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       PatchProxy.onMethodExit(a.class, "25");
       return new n(p0, p1);
    }
    public final View S(ViewGroup p0,b p1,int p2,int p3){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, a.class, "33");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       View view = a.i(p0, p2);
       k0.c(view, R.id.play_view_container_stub, p1.b(p3));
       k0.c(view, R.id.user_root_layout_stub, p1.b(2));
       k0.c(view, R.id.product_layout_stub, p1.b(7));
       return view;
    }
    public void TK(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       p0.add(new e());
       p0.add(new c());
       p0.add(new c());
       p0.add(new b());
       p0.add(new s());
       this.D00(p0);
       this.n(p0);
       return;
    }
    public void Tb(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "44")) {
          return;
       }
       p0.add(new a());
       return;
    }
    public c UE(){
       Object obj = PatchProxy.apply(null, this, a.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a();
    }
    public PhotoAdvertisement$SearchBrandInfo Ui(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.b(p0);
    }
    public f VW(){
       Object obj = PatchProxy.apply(null, this, a.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c();
    }
    public void Vh(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "11")) {
          return;
       }
       p0.add(new b());
       p0.add(new d());
       return;
    }
    public void Xo(BaseFeed p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "57")) {
          return;
       }
       b.m(p0, 1);
       return;
    }
    public String Y2(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null || !b.a(-570058679).b(p0.mEntity)) {
          return "";
       }
       return j.s(p0);
    }
    public View Yl(ViewGroup p0,int p1,b p2){
       View obj;
       a uoa = this;
       ViewGroup viewGroup = p0;
       b uob = p2;
       a uoa1 = a.class;
       if (PatchProxy.isSupport(uoa1)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, a.class, "32");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = 6;
       boolean b = 0x7f0d137d;
       int i1 = 4;
       int i2 = 3;
       switch (p1){
           case 1:
             return uoa.S(viewGroup, uob, 0x7f0d1376, i2);
           case 2:
             return uoa.S(viewGroup, uob, 0x7f0d137f, i1);
           case 3:
             obj = a.i(viewGroup, R.layout.arg_RES_7f0d13df);
             k0.c(obj, R.id.user_root_layout_stub, uob.b(2));
             k0.c(obj, R.id.play_view_container_stub, uob.b(5));
             return obj;
           case 4:
             if (PatchProxy.isSupport(uoa1)) {
                obj = PatchProxy.applyFourRefs(p0, p2, Integer.valueOf(R.layout.arg_RES_7f0d1378), Integer.valueOf(i), this, a.class, "35");
                if (obj != PatchProxyResult.class) {
                label_00e9 :
                   return obj;
                }
             }
             obj = a.i(viewGroup, R.layout.arg_RES_7f0d1378);
             k0.c(obj, R.id.play_view_container_stub, uob.b(i));
             k0.c(obj, R.id.follow_button_stub, uob.b(1));
             obj.findViewById(R.id.vip_badge).setImageResource(uob.a(1));
             k0.c(obj, R.id.product_layout_stub, uob.b(7));
             goto label_00e9 ;
             break;
           case 5:
             return uoa.g0(viewGroup, uob, 0x7f0d1377, i2);
           case 6:
             return uoa.g0(viewGroup, uob, 0x7f0d1380, i1);
           case 7:
             return uoa.q0(viewGroup, uob, b, i2);
           case 8:
             return uoa.q0(viewGroup, uob, b, i1);
           case 9:
             return uoa.q0(viewGroup, uob, b, i);
           case 10:
             if (PatchProxy.isSupport(uoa1)) {
                obj = PatchProxy.applyThreeRefs(p0, p2, Integer.valueOf(R.layout.arg_RES_7f0d137c), this, a.class, "37");
                if (obj != PatchProxyResult.class) {
                label_0078 :
                   return obj;
                }
             }
             obj = a.i(viewGroup, R.layout.arg_RES_7f0d137c);
             k0.c(obj, R.id.photo_layout_stub, uob.b(9));
             k0.c(obj, R.id.product_layout_stub, uob.b(7));
             goto label_0078 ;
             break;
           default:
             return new View(p0.getContext());
       }
    }
    public void ZC(RecyclerView p0,g p1,q p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "41")) {
          return;
       }
       if (p1 != null && b.b(1)) {
          p2.I5().compose(c.c(p2.m(), FragmentEvent.DESTROY)).subscribe(new CommercialSearchPhotoShowConsumer(p0, p1, p2));
       }
       return;
    }
    public void ZK(int p0,QPhoto p1,boolean p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), this, a.class, "30")) {
          return;
       }
       if (p0 != 1) {
          if (p0 == 2) {
             e.q(p1, p2);
          }
       }else {
          e.m(p1, p2);
       }
       return;
    }
    public void Zo(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
          return;
       }
       p0.add(new h());
       p0.add(new s());
       this.D00(p0);
       this.n(p0);
       return;
    }
    public int aK(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return e.c(p0);
    }
    public PresenterV2 bf(int p0){
       if (PatchProxy.isSupport2(a.class, "24")) {
          Object obj = PatchProxy.applyOneRefsWithListener(Integer.valueOf(p0), this, a.class, "24");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       switch (p0){
           case 6:
             PatchProxy.onMethodExit(a.class, "24");
             return new q();
           case 7:
             PatchProxy.onMethodExit(a.class, "24");
             return new d();
           case 8:
             PatchProxy.onMethodExit(a.class, "24");
             return new f();
           case 9:
             PatchProxy.onMethodExit(a.class, "24");
             return new e();
           case 10:
             PatchProxy.onMethodExit(a.class, "24");
             return new d();
           case 11:
             PatchProxy.onMethodExit(a.class, "24");
             return new i();
           case 12:
             PatchProxy.onMethodExit(a.class, "24");
             return new a();
           default:
             PatchProxy.onMethodExit(a.class, "24");
             return new PresenterV2();
       }
    }
    public d cA(){
       Object obj = PatchProxy.apply(null, this, a.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b();
    }
    public boolean cN(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.j(p0);
    }
    public void d6(Activity p0,c p1,String p2){
       ClientEvent$UrlPackage page2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "59")) {
          return;
       }
       boolean b = false;
       if (!a.t().d("enableShowSearchHomeWidgetView", b)) {
          return;
       }
       Object obj = PatchProxy.applyOneRefs(p2, this, uoa, "61");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(!TextUtils.x(p2) && (!TextUtils.n("search_entrance_bottom_featured", p2) && (!TextUtils.n("search_entrance_follow", p2) && (!TextUtils.n("search_entrance_find", p2) && (!TextUtils.n("search_entrance_nearby", p2) && (!TextUtils.n("search_entrance_mall", p2) && (!TextUtils.n("search_entrance_tv_station", p2) && (TextUtils.n("search_entrance_home", p2) || TextUtils.n("search_entrance_search_detail", p2))))))))){
          b = true;
       }
       if (!b) {
          return;
       }else if(p0 != null && (!p0.isFinishing() && (p0.isDestroyed() || !p0 instanceof e0))){
          p2 = p0.o();
          if (TextUtils.x(p2)) {
             ClientEvent$UrlPackage urlPackage = PatchProxy.applyOneRefs(p0, this, uoa, "62");
             if (urlPackage != patchProxyRe) {
             }else {
                b uob = u1.h();
                if (uob != null) {
                   b uob1 = uob.d(p0);
                   if (uob1 != null) {
                      urlPackage = uob1.C();
                   }
                }
                urlPackage = null;
             }
             if (urlPackage != null) {
                page2 = urlPackage.page2;
             }
          }
          if (d.a(0x60b9226c).oM(page2)) {
             return;
          }else {
             p1.add(new a());
          }
       }
    label_00d4 :
       return;
    }
    public boolean dB(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, a.class, "14");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(objArray, objArray, b.class, "4");
       b = (obj != patchProxyRe)? obj.booleanValue(): a.t().d("adSearchSingleModeEnableSharedPlayer", false);
       return b;
    }
    public final View g0(ViewGroup p0,b p1,int p2,int p3){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, a.class, "34");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       View view = a.i(p0, p2);
       k0.c(view, R.id.play_view_container_stub, p1.b(p3));
       k0.c(view, R.id.follow_button_stub, p1.b(1));
       view.findViewById(R.id.vip_badge).setImageResource(p1.a(1));
       return view;
    }
    public boolean gU(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "58");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (b.f(p0) != b) {
          b = false;
       }
       return b;
    }
    public void gZ(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "46")) {
          return;
       }
       p0.add(new c());
       return;
    }
    public String i4(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null || !b.a(-570058679).b(p0.mEntity)) {
          return "";
       }
       return j.j(p0);
    }
    public boolean iE(PhotoAdvertisement p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "54");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.d(p0);
    }
    public boolean iI(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (e.d(p0) != null)? true: false;
       return b;
    }
    public boolean isAvailable(){
       return false;
    }
    public void jN(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "6")) {
          return;
       }
       p0.add(new c());
       p0.add(new s());
       this.D00(p0);
       this.n(p0);
       return;
    }
    public a kb(ViewGroup p0,BannerEntity p1,e0 p2,b p3){
       SearchHomeAdBannerView obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, a.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.getChildCount() > 0) {
          p0.removeAllViews();
       }
       obj = new SearchHomeAdBannerView(p0.getContext(), p1, p2);
       obj.setAdBannerListener(p3);
       p0.addView(obj);
       return obj;
    }
    public void m6(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "10")) {
          return;
       }
       p0.add(new j());
       p0.add(new b());
       p0.add(new d());
       this.D00(p0);
       return;
    }
    public void mG(PhotoAdvertisement p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "23")) {
          return;
       }
       e.h(p0, p1);
       return;
    }
    public void n(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "52")) {
          return;
       }
       p0.add(new a());
       return;
    }
    public void nC(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "51")) {
          return;
       }
       p0.add(new a());
       return;
    }
    public boolean nh(){
       Object obj = PatchProxy.apply(null, this, a.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.b(0);
    }
    public View o6(ViewGroup p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "48");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       View view = a.i(p0, R.layout.arg_RES_7f0d1354);
       if (p1) {
          e.a(view);
       }
       return view;
    }
    public boolean pQ(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return j.f(p0, 16);
    }
    public final View q0(ViewGroup p0,b p1,int p2,int p3){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, a.class, "36");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       View view = a.i(p0, p2);
       k0.c(view, R.id.play_view_container_stub, p1.b(p3));
       k0.c(view, R.id.child_link_layout_stub, p1.b(8));
       k0.c(view, R.id.user_root_layout_stub, p1.b(2));
       return view;
    }
    public void qL(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       p0.add(new e());
       p0.add(new h());
       p0.add(new c());
       p0.add(new b());
       p0.add(new s());
       this.D00(p0);
       this.n(p0);
       return;
    }
    public e v4(){
       Object obj = PatchProxy.apply(null, this, a.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new l();
    }
    public void v50(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "60")) {
          return;
       }
       p0.add(new AdSearchCommodityCoverTipsPresenter());
       p0.add(new p());
       p0.add(new AdSearchCommodityCoverClickPresenter());
       p0.add(new b());
       p0.add(new b());
       return;
    }
    public boolean w8(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (e.e(p0) != null)? true: false;
       return b;
    }
    public boolean x9(a p0){
       boolean b;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b obj = PatchProxy.applyOneRefs(p0, this, a.class, "16");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = b.class;
       Object obj1 = PatchProxy.applyOneRefs(p0, null, obj, "6");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          obj1 = PatchProxy.applyOneRefs(p0, null, obj, "7");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(p0 == null || p0.getAdQPhoto() == null){
             b1 = false;
          }else {
             b1 = b.i(p0.getAdQPhoto());
          }
          if (!b1) {
             Object obj2 = PatchProxy.applyOneRefs(p0, null, obj, "9");
             if (obj2 != patchProxyRe) {
                b = obj2.booleanValue();
             }else if(p0 == null || p0.getAdQPhoto() == null){
                b = false;
             }else {
                b = b.j(p0.getAdQPhoto());
             }
             if (!b) {
                b = false;
             }
          }
          b = true;
       }
       return b;
    }
    public final void z0(a p0,AdARScanResultModel p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "56")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p0.c(g.a(p1));
       return;
    }
}
