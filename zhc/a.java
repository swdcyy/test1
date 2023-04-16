package zhc.a;
import zhc.b;
import mhc.o0$c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import mhc.g2;
import mhc.g2$a;
import com.yxcorp.gifshow.entity.QPhoto;
import kotlin.Pair;
import vhc.m;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$Companion;
import com.yxcorp.gifshow.share.KsShareBuilder;
import uo7.k;
import com.kwai.sharelib.a;
import java.lang.Exception;
import androidx.fragment.app.DialogFragment;
import rq4.d;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.share.OperationModel;
import kic.a;
import zic.e;
import com.kwai.feature.api.social.login.model.LoginParams;
import mhc.o2;
import yhc.d;
import java.util.Objects;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.gifshow.share.model.guide.ShareGuide;
import mic.b;
import com.kuaishou.android.model.mix.PhotoGuide;
import b3a.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import n80.c;
import mhc.i0;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.Collection;
import uo7.q;
import uo7.l;
import mhc.o0;
import uo7.d;
import mhc.m2;
import uo7.b0;
import java.lang.System;
import com.kwai.feature.api.social.message.imshare.model.IMShareRecoRequest;
import zhc.a$a;
import io.reactivex.i;
import brd.a0;
import com.yxcorp.gifshow.share.widget.ForwardPopSectionFragment;
import com.yxcorp.gifshow.share.widget.ForwardPopSectionFragment$a;
import zhc.a$b;
import uo7.u;
import uo7.f0;
import vhc.q;
import fp7.c;
import uo7.g0;
import fp7.k;
import vhc.o;
import cp7.d;
import cp7.j;
import com.yxcorp.gifshow.share.OperationModel$c;
import com.yxcorp.gifshow.share.OperationModel$Type;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;

public class a extends o0$c implements b	// class@004c81
{
    public a b;
    public ForwardGridSectionFragment c;
    public final Pair d;
    public a e;
    public final GifshowActivity f;
    public final PhotoDetailParam g;
    public final String h;

    public void a(GifshowActivity p0,PhotoDetailParam p1,String p2){
       a.p(p0, "activity");
       a.p(p1, "mParam");
       a.p(p2, "subBiz");
       super(p1.getBaseFeed());
       this.f = p0;
       this.g = p1;
       this.h = p2;
       PhotoDetailParam mPhoto = p1.mPhoto;
       a.o(mPhoto, "mParam.mPhoto");
       g2$a x = g2.X;
       g2 og2 = x.w();
       this.d = m.b(mPhoto, og2, x.x());
    }
    public void b(){
       PatchProxy.applyVoid(null, this, a.class, "12");
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       if (ForwardGridSectionFragment.W0.a()) {
          return;
       }
       a uoa = this.o(this.m().a());
       this.b = uoa;
       if (uoa == null) {
          a.S("shareManager");
       }
       uoa.l();
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, a.class, "9")) {
          return;
       }
       try{
          a tc = this.c;
          if (tc != null) {
             tc.dismissAllowingStateLoss();
          }
          this.c = null;
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return;
    }
    public void i(DialogFragment p0){
    }
    public void j(DialogFragment p0){
    }
    public void k(k p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "10")) {
          return;
       }
       a.p(p0, "conf");
       a.p(p1, "log");
       return;
    }
    public final GifshowActivity l(){
       return this.f;
    }
    public KsShareBuilder m(){
       d a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       PhotoDetailParam obj = PatchProxy.apply(objArray, this, a.class, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       this.c = this.n();
       this.e = new a(this.g.mPhoto.mEntity, this.h);
       e uoe = new e(this.f, this.q(this.g));
       PhotoDetailParam mPhoto = this.g.mPhoto;
       a.o(mPhoto, "mParam.mPhoto");
       String photoId = mPhoto.getPhotoId();
       a.o(photoId, "mParam.mPhoto.photoId");
       QPhoto mEntity = this.g.mPhoto.mEntity;
       a.o(mEntity, "mParam.mPhoto.mEntity");
       LoginParams loginParams = o2.e(mEntity, this.f);
       KsShareBuilder ksShareBuild = new KsShareBuilder(this.f, this.h, photoId, loginParams, this.c);
       a = d.a;
       a tg = this.g;
       Objects.requireNonNull(a);
       photoId = "2";
       PhotoGuide photoGuide = PatchProxy.applyOneRefs(tg, a, d.class, photoId);
       if (photoGuide != patchProxyRe) {
       }else {
          a.p(tg, "mParam");
          PhotoDetailParam mPhoto2 = tg.mPhoto;
          a.o(mPhoto2, "mParam.mPhoto");
          PhotoMeta photoMeta = mPhoto2.getPhotoMeta();
          ShareGuide shareGuide = (photoMeta != null)? b.a(photoMeta): objArray;
          if (shareGuide != null) {
             if (photoMeta != null) {
                ShareGuide shareGuide1 = b.a(photoMeta);
                if (shareGuide1 != null) {
                   photoGuide = shareGuide1.getShareGuidePlatform("default");
                label_009d :
                   if (photoGuide != null) {
                      photoGuide = photoGuide.mIconType;
                   }
                }
             }
             Object[] objArray1 = objArray;
             goto label_009d ;
          }
          photoGuide = objArray;
       }
       String[] obj1 = PatchProxy.applyOneRefs(photoGuide, objArray, b.class, photoId);
       if (obj1 != patchProxyRe) {
          photoGuide = obj1;
       }else if(!TextUtils.x(photoGuide)){
          photoGuide = c.c();
          String str1 = "wechat";
          if (TextUtils.x(photoGuide) || (TextUtils.n(photoGuide, str1) || (TextUtils.n(photoGuide, "qq2.0") || (!TextUtils.n(photoGuide, "wechat_moments") && !TextUtils.n(photoGuide, "wechat_wow"))))) {
             photoGuide = str1;
          }
       }
       a.o(photoGuide, "NonslideForwardGuideHelp¡­areGuidePlatform\(mParam\)\)");
       obj1 = new String[]{this.d.getSecond().a()};
       ArrayList uArrayList = Lists.e(obj1);
       a.o(uArrayList, "Lists.newArrayList<Strin¡­Factory.second.elementId\)");
       KsShareBuilder ksShareBuild1 = obj.C(photoGuide).s(uArrayList);
       a te = this.e;
       if (te == null) {
          a.S("photoDm");
       }
       ksShareBuild1 = ksShareBuild1.n(te);
       ksShareBuild1.z(this);
       ksShareBuild1 = ksShareBuild1.f(uoe).g(new m2());
       String str = String.valueOf(System.currentTimeMillis());
       PhotoDetailParam mPhoto1 = this.g.mPhoto;
       a.o(mPhoto1, "mParam.mPhoto");
       int i = (mPhoto1.isLiveStream())? 2: 1;
       obj = this.g.mPhoto;
       a.o(obj, "mParam.mPhoto");
       photoId = obj.getPhotoId();
       a.o(photoId, "mParam.mPhoto.photoId");
       obj = this.g.mPhoto;
       a.o(obj, "mParam.mPhoto");
       IMShareRecoRequest iMShareRecoR = new IMShareRecoRequest(str, i, photoId, obj.getUserId(), 1);
       a0 uoa0 = a0.k(new a$a(te));
       a.o(uoa0, "Single.create {\n        ¡­t.onSuccess\(true\)\n      }");
       ksShareBuild1.x(uoa0);
       return ksShareBuild1;
    }
    public ForwardGridSectionFragment n(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = d.a;
       a tf = this.f;
       a tg = this.g;
       Objects.requireNonNull(obj);
       ForwardPopSectionFragment uForwardPopS = PatchProxy.applyTwoRefs(tf, tg, obj, d.class, "1");
       if (uForwardPopS != patchProxyRe) {
       }else {
          a.p(tf, "activity");
          a.p(tg, "mParam");
          int i = (tg.enableSlidePlay())? 1: 2;
          uForwardPopS = ForwardPopSectionFragment.Z0.a(tf, i);
       }
       return uForwardPopS;
    }
    public a o(k p0){
       q obj = PatchProxy.applyOneRefs(p0, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "shareConfig");
       PhotoDetailParam mPhoto = this.g.mPhoto;
       a.o(mPhoto, "mParam.mPhoto");
       obj = new q(mPhoto, true, new c());
       a uoa = new a(p0, new a$b(this)).f(this.d.getFirst(), this.d.getSecond()).f("wechat", obj);
       mPhoto = this.g.mPhoto;
       a.o(mPhoto, "mParam.mPhoto");
       obj = new q(mPhoto, false, new k());
       uoa = uoa.f("wechatMoments", obj);
       mPhoto = this.g.mPhoto;
       a.o(mPhoto, "mParam.mPhoto");
       o oo = new o(mPhoto, false, new d());
       uoa = uoa.f("qq", oo);
       mPhoto = this.g.mPhoto;
       a.o(mPhoto, "mParam.mPhoto");
       oo = new o(mPhoto, false, new j());
       return uoa.f("qzone", oo);
    }
    public final PhotoDetailParam p(){
       return this.g;
    }
    public OperationModel q(PhotoDetailParam p0){
       OperationModel$c obj = PatchProxy.applyOneRefs(p0, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "mParam");
       obj = new OperationModel$c();
       obj.n(OperationModel$Type.PHOTO);
       p0 = p0.mPhoto;
       QPhoto mEntity = (p0 != null)? p0.mEntity: null;
       obj.k(mEntity);
       return obj.a();
    }
    public final String r(){
       return this.h;
    }
    public void s(k p0,ShareInitResponse$SharePanelElement p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "11")) {
          return;
       }
       a.p(p0, "ksShareConfiguration");
       a.p(p1, "panelElement");
       return;
    }
}
