package f6a.b;
import wm5.a;
import java.lang.String;
import java.util.regex.Pattern;
import java.lang.Object;
import android.content.Intent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import w7a.d;
import android.net.Uri;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import o56.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import android.view.View;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import vm5.o;
import java.lang.Integer;
import com.yxcorp.gifshow.detail.PhotoDetailActivity;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayConfig;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import fg6.a;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.google.gson.Gson;
import androidx.fragment.app.Fragment;
import d6a.f;
import z7a.a;
import com.yxcorp.gifshow.detail.slideplay.SlideMediaType;
import qvb.i;
import d6a.i;
import d6a.j;
import com.yxcorp.gifshow.detail.slideplay.b;
import com.yxcorp.gifshow.nasa.NasaTagInfo;
import com.yxcorp.gifshow.nasa.NasaSlideParam$a;
import com.kwai.gifshow.post.api.core.model.CameraBtnExtParams;
import ekd.w0;
import com.yxcorp.gifshow.entity.QPhoto;
import wm5.b;
import java.util.regex.Matcher;
import android.app.Activity;
import lnc.a1;
import rkd.b;
import android.net.Uri$Builder;
import wkd.b;
import nf6.i;
import android.content.Context;
import y8a.c;
import com.yxcorp.gifshow.tube.StandardSerialInfo;
import fm5.a;
import com.yxcorp.gifshow.tube.SerialInfo;
import com.kuaishou.android.model.mix.CommonMeta;
import wx6.d;
import com.kwai.feature.api.feed.detail.router.DetailLogParam;
import androidx.fragment.app.FragmentActivity;
import foc.y;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.nasa.NasaSlideSerialParam$b;
import com.yxcorp.gifshow.nasa.NasaSlideSerialParam;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;
import java.util.UUID;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.player.gotham.impl.KwaiSessionKeyGenerator;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import e0a.j;
import com.yxcorp.gifshow.detail.slideplay.presenter.c;

public class b implements a	// class@0022c7
{
    public static final Pattern b;

    static {
       b.b = Pattern.compile("kwai://channelaggregate\(/.*\)?");
    }
    public void b(){
       super();
    }
    public boolean B50(Intent p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, b.class, "6");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.applyOneRefs(p0, null, d.class, "1");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(p0 == null){
          Uri data = p0.getData();
          if (data != null && data.isHierarchical()) {
             String str = data.toString();
             a.o(str, "uri.toString\(\)");
             if (!TextUtils.x(str) && (!(a.g("healthy", data.getHost()) ^ 1) && (!(a.g("/slide", data.getPath()) ^ 1) && ((a.g("kwai", data.getScheme()) ^ 1) && (!(a.g(a.y, data.getScheme()) ^ 1) && (!TextUtils.x(data.getQueryParameter("departmentId")) && !TextUtils.x(data.getQueryParameter("photoId")))))))) {
                b = true;
             }
          }
       }
    label_0096 :
       b = false;
       PatchProxy.onMethodExit(b.class, "6");
       return b;
    }
    public void Ba(GifshowActivity p0,int p1,PhotoDetailParam p2,View p3,NasaSlideParam p4,boolean p5,o p6){
       int i = 4;
       if (PatchProxy.isSupport2(b.class, "2")) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,p3,p4,Boolean.valueOf(p5),p6};
          if (PatchProxy.applyVoid(objArray, this, b.class, "2")) {
             return;
          }
       }
       if (p2 != null) {
          p2.setBizType(i);
       }
       Intent intent = PhotoDetailActivity.x3(p0, p2, p3);
       NasaBizParam nasaBizParam = new NasaBizParam();
       nasaBizParam.setNasaSlideParam(p4);
       if (p2 != null && p2.getSlidePlayConfig() != null) {
          p4.setEnableShowMarque(p2.getSlidePlayConfig().mEnableShowMarque);
       }
       nasaBizParam.mNeedReplaceFeed = p5;
       nasaBizParam.putParamIntoIntent(intent);
       if (p6 != null) {
          p6.a(intent, null);
       }
       PhotoDetailActivity.K3(p0, p1, intent, p3);
       PatchProxy.onMethodExit(b.class, "2");
       return;
    }
    public void Cv(GifshowActivity p0,BaseFragment p1,String p2,boolean p3,int p4){
       object oobject = p0;
       object oobject1 = p2;
       int i = 4;
       int i1 = 0;
       int i2 = 1;
       if (PatchProxy.isSupport2(b.class, "17")) {
          Object[] objArray = new Object[]{oobject,p1,oobject1,Boolean.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, b.class, "17")) {
             return;
          }
       }else {
          int i3 = this;
       }
       SimpleMagicFace simpleMagicF = a.a.h(p2, SimpleMagicFace.class);
       String str = f.b(p1);
       PhotoDetailParam photoDetailP = new PhotoDetailParam().setBizType(i).setSlidePlayId(str);
       photoDetailP.getSlidePlayConfig().setEnablePullRefresh(i1);
       b.g(j.e(new a(simpleMagicF.mId, p4), str, SlideMediaType.ALL));
       NasaTagInfo nasaTagInfo = new NasaTagInfo();
       nasaTagInfo.setMagicFace(simpleMagicF);
       nasaTagInfo.setFromMagicFaceRecord(i2);
       nasaTagInfo.setFromTakePhotoTab(p3);
       NasaSlideParam$a uoa = new NasaSlideParam$a();
       uoa.T("DETAIL");
       uoa.Z("MAGIC_FRIENDS_RECORD");
       uoa.q(i1);
       uoa.v(i1);
       uoa.f(i2);
       uoa.P(nasaTagInfo);
       Intent intent = PhotoDetailActivity.x3(p0, photoDetailP, null);
       NasaBizParam nasaBizParam = new NasaBizParam();
       nasaBizParam.setNasaSlideParam(uoa.a());
       nasaBizParam.mNeedReplaceFeed = i2;
       nasaBizParam.putParamIntoIntent(intent);
       CameraBtnExtParams uCameraBtnEx = new CameraBtnExtParams();
       uCameraBtnEx.mIsReturnToCameraActivity = i2;
       uCameraBtnEx.putCameraBtnExtParamsIntoIntent(intent);
       PhotoDetailActivity.J3(p0, 1025, intent, null, 0, 0);
       PatchProxy.onMethodExit(b.class, "17");
       return;
    }
    public boolean FT(Intent p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = false;
       if (p0 == null) {
          PatchProxy.onMethodExit(b.class, "4");
          return b;
       }else {
          Uri data = p0.getData();
          if (data == null || !data.isHierarchical()) {
             PatchProxy.onMethodExit(b.class, "4");
             return b;
          }else if(TextUtils.x(data.toString())){
             PatchProxy.onMethodExit(b.class, "4");
             return b;
          }else {
             PatchProxy.onMethodExit(b.class, "4");
             return ("pay_course").equals(w0.a(data, "feed_biz_type"));
          }
       }
    }
    public void Jk(GifshowActivity p0,QPhoto p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, b.class, "7")) {
          return;
       }
       this.cF(p0, p1, null);
       PatchProxy.onMethodExit(b.class, "7");
       return;
    }
    public boolean Kx(Intent p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = false;
       if (p0 == null) {
          PatchProxy.onMethodExit(b.class, "3");
          return b;
       }else {
          Uri data = p0.getData();
          if (data == null || !data.isHierarchical()) {
             PatchProxy.onMethodExit(b.class, "3");
             return b;
          }else {
             String str = data.toString();
             if (TextUtils.x(str)) {
                PatchProxy.onMethodExit(b.class, "3");
                return b;
             }else {
                PatchProxy.onMethodExit(b.class, "3");
                return b.b.matcher(str).find();
             }
          }
       }
    }
    public void NV(GifshowActivity p0,String p1,String p2,String p3,int p4,String p5,boolean p6,b p7){
       String str;
       if (PatchProxy.isSupport2(b.class, "11")) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4),p5,Boolean.valueOf(p6),p7};
          if (PatchProxy.applyVoid(objArray, this, b.class, "11")) {
             return;
          }
       }
       if (a1.i(p0) && (TextUtils.x(p1) || TextUtils.x(p3))) {
          PatchProxy.onMethodExit(b.class, "11");
          return;
       }else if(b.g()){
          str = "episode_tablet";
       }else {
          str = "episode";
       }
       Uri$Builder uBuilder = new Uri$Builder().scheme(a.y).authority(str).path("/play");
       if (p6) {
          uBuilder.appendQueryParameter("clusterId", p3);
          uBuilder.appendQueryParameter("clusterType", String.valueOf(p4));
       }else {
          uBuilder.appendQueryParameter("serialId", p3);
          uBuilder.appendQueryParameter("serialType", String.valueOf(p4));
       }
       if (!TextUtils.x(p1)) {
          uBuilder.appendQueryParameter("photoId", p1);
       }
       if (!TextUtils.x(p2)) {
          uBuilder.appendQueryParameter("selectedPhotoId", p2);
       }
       if (!TextUtils.x(p5)) {
          uBuilder.appendQueryParameter("sourcePhotoPage", p5);
       }
       if (p7 != null && !TextUtils.x(p7.b())) {
          uBuilder.appendQueryParameter("continueSessionID", p7.b());
       }
       if (p7 != null) {
          uBuilder.appendQueryParameter("autoShowPanel", String.valueOf(p7.a()));
       }
       p0.startActivity(b.a(0x66dce92a).a(p0, uBuilder.build()));
       PatchProxy.onMethodExit(b.class, "11");
       return;
    }
    public boolean TI(){
       return true;
    }
    public boolean Uc(Intent p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, b.class, "5");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.applyOneRefs(p0, null, c.class, "1");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(p0 == null){
          Uri data = p0.getData();
          if (data != null && data.isHierarchical()) {
             String str = data.toString();
             a.o(str, "uri.toString\(\)");
             if (!TextUtils.x(str) && (!(a.g("episode", data.getHost()) ^ 1) || (!(a.g("episode_tablet", data.getHost()) ^ 1) && ((a.g("/play", data.getPath()) ^ 1) || (!(a.g("kwai", data.getScheme()) ^ 1) || ((a.g(a.y, data.getScheme()) ^ 1) || (!TextUtils.x(data.getQueryParameter("photoId")) && (TextUtils.x(data.getQueryParameter("serialId")) || (!TextUtils.x(data.getQueryParameter("serialType")) || (!TextUtils.x(data.getQueryParameter("clusterId")) && !TextUtils.x(data.getQueryParameter("clusterType")))))))))))) {
                b = true;
             }
          }
       }
    label_00c9 :
       b = false;
       PatchProxy.onMethodExit(b.class, "5");
       return b;
    }
    public void Us(GifshowActivity p0,String p1,String p2,String p3,int p4,String p5,boolean p6){
       if (PatchProxy.isSupport2(b.class, "10")) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4),p5,Boolean.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, this, b.class, "10")) {
             return;
          }
       }else {
          int i = this;
       }
       this.NV(p0, p1, p2, p3, p4, p5, p6, null);
       PatchProxy.onMethodExit(b.class, "10");
       return;
    }
    public void cF(GifshowActivity p0,QPhoto p1,b p2){
       QPhoto qPhoto = p1;
       if (PatchProxy.applyVoidThreeRefsWithListener(p0, p1, p2, this, b.class, "9")) {
          return;
       }
       if (!qPhoto || qPhoto.mEntity == null) {
          PatchProxy.onMethodExit(b.class, "9");
          return;
       }else {
          StandardSerialInfo standardSeri = a.t(p1);
          if (a1.i(p0) && standardSeri != null) {
             StandardSerialInfo mSerialInfo = standardSeri.mSerialInfo;
             if (mSerialInfo != null && !TextUtils.x(mSerialInfo.mSerialId)) {
                String photoId = p1.getPhotoId();
                String photoId1 = p1.getPhotoId();
                standardSeri = standardSeri.mSerialInfo;
                SerialInfo mSerialId = standardSeri.mSerialId;
                SerialInfo mType = standardSeri.mType;
                CommonMeta mSourcePhoto = (p1.getCommonMeta() != null)? p1.getCommonMeta().mSourcePhotoPage: "";
                this.NV(p0, photoId, photoId1, mSerialId, mType, mSourcePhoto, a.v(p1), p2);
                PatchProxy.onMethodExit(b.class, "9");
                return;
             }
          }
          PatchProxy.onMethodExit(b.class, "9");
          return;
       }
    }
    public void dL(GifshowActivity p0,BaseFragment p1,QPhoto p2,int p3){
       if (PatchProxy.isSupport2(b.class, "18") && PatchProxy.applyVoidFourRefsWithListener(p0, p1, p2, Integer.valueOf(p3), this, b.class, "18")) {
          return;
       }
       PhotoDetailParam photoDetailP = new PhotoDetailParam(p2).setBizType(4).setSlidePlayId(f.b(p1));
       photoDetailP.mDialogType = p3;
       NasaSlideParam$a uoa = new NasaSlideParam$a();
       uoa.T("DETAIL");
       Intent intent = PhotoDetailActivity.x3(p0, photoDetailP, null);
       NasaBizParam nasaBizParam = new NasaBizParam();
       nasaBizParam.setNasaSlideParam(uoa.a());
       nasaBizParam.mNeedReplaceFeed = true;
       nasaBizParam.putParamIntoIntent(intent);
       PhotoDetailActivity.J3(p0, 1025, intent, null, 0, 0);
       PatchProxy.onMethodExit(b.class, "18");
       return;
    }
    public boolean isAvailable(){
       return true;
    }
    public void kL(GifshowActivity p0,QPhoto p1,b p2,String p3,View p4,d p5){
       boolean i1;
       boolean b;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p3;
       object oobject3 = p4;
       object oobject4 = p5;
       int i = 4;
       if (PatchProxy.isSupport2(b.class, "8")) {
          Object[] objArray = new Object[]{oobject,oobject1,p2,oobject2,oobject3,oobject4};
          if (PatchProxy.applyVoid(objArray, this, b.class, "8")) {
             return;
          }
       }else {
          int i2 = this;
       }
       if (oobject1 == null || oobject1.mEntity == null) {
          PatchProxy.onMethodExit(b.class, "8");
          return;
       }else {
          StandardSerialInfo standardSeri = a.t(p1);
          if (a1.i(p0) && standardSeri != null) {
             standardSeri = standardSeri.mSerialInfo;
             if (standardSeri != null && !TextUtils.x(standardSeri.mSerialId)) {
                PhotoDetailParam photoDetailP = new PhotoDetailParam(oobject1);
                photoDetailP.setSlidePlayId(oobject2);
                photoDetailP.setEpisodeSerial(1);
                photoDetailP.getDetailLogParam().setRecoTabId(25);
                photoDetailP.setBizType(i);
                photoDetailP.getSlidePlayConfig().setEnablePullRefresh(0);
                photoDetailP.mPhoto = oobject1;
                if (oobject3 != null) {
                   i1 = y.b(oobject, oobject3);
                   if (photoDetailP.getDetailCommonParam() != null) {
                      photoDetailP.getDetailCommonParam().setUnserializableBundleId(i1);
                   }
                }
                String str = "";
                CommonMeta mSourcePhoto = (p1.getCommonMeta() != null)? p1.getCommonMeta().mSourcePhotoPage: str;
                b = TextUtils.n(mSourcePhoto, "MUSIC_RADIO");
                boolean b1 = (b && a.t().d("musicRadio", 0))? true: false;
                NasaSlideParam$a uoa = new NasaSlideParam$a();
                uoa.T("DETAIL");
                uoa.C(1);
                uoa = uoa.k(0);
                uoa.Z(mSourcePhoto);
                uoa.b(1);
                uoa.K(b);
                uoa.s(b1);
                NasaSlideSerialParam$b uob = new NasaSlideSerialParam$b();
                uob.h(a.g(p1));
                uob.i(a.r(p1));
                uob.g(mSourcePhoto);
                uob.e(a.v(p1));
                if (p2 != null) {
                   str = p2.b();
                }
                uob.b(str);
                uob.c(0);
                i1 = (p2 != null && p2.a())? true: false;
                uob.d(i1);
                uob.f(0);
                uoa.O(uob.a());
                NasaSlideParam nasaSlidePar = uoa.a();
                if (b) {
                   photoDetailP.getDetailPlayConfig().setPlayInBackground(1);
                }
                DetailLogParam detailLogPar = photoDetailP.getDetailLogParam();
                detailLogPar.addShowPositionPortrait();
                String str1 = UUID.randomUUID().toString();
                String str2 = "slide_session_id";
                detailLogPar.addPageUrlParam(str2, str1).addBizParam(str2, str1);
                String photoId = p1.getPhotoId();
                if (!TextUtils.x(photoId)) {
                   str1 = "slide_first_photo_id";
                   detailLogPar.addPageUrlParam(str1, photoId).addBizParam(str1, photoId);
                }
                if (!TextUtils.x(photoId)) {
                   str1 = "upper_recommend_photo_id";
                   detailLogPar.addPageUrlParam(str1, photoId).addBizParam(str1, photoId);
                }
                if (p2 != null && p2.c() != null) {
                   detailLogPar.addPageUrlParam("tube_id", p2.c());
                }
                detailLogPar.addSlideSessionParams(photoDetailP.getBaseFeed());
                if (oobject4 instanceof KwaiSessionKeyGenerator) {
                   photoDetailP.getDetailPlayConfig().setSharedPlaySessionKeyGenerator(oobject4);
                   photoDetailP.getDetailPlayConfig().setEnableSyncSharedPlayerStatus(1);
                   photoDetailP.getDetailPlayConfig().setContinuePlayWhileExit(1);
                }
                Intent intent = PhotoDetailActivity.x3(oobject, photoDetailP, null);
                NasaBizParam nasaBizParam = new NasaBizParam();
                nasaBizParam.setNasaSlideParam(nasaSlidePar);
                nasaBizParam.mNeedReplaceFeed = false;
                nasaBizParam.putParamIntoIntent(intent);
                if (oobject3 != null) {
                   PhotoDetailActivity.J3(p0, 816, intent, p4, p4.getWidth(), p4.getHeight());
                }else {
                   PhotoDetailActivity.J3(p0, 816, intent, 0, 0, 0);
                }
                PatchProxy.onMethodExit(b.class, "8");
                return;
             }
          }
          PatchProxy.onMethodExit(b.class, "8");
          return;
       }
    }
    public PresenterV2 vR(){
       Object[] objArray = null;
       Object obj = PatchProxy.applyWithListener(objArray, this, b.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (j.j()) {
          PatchProxy.onMethodExit(b.class, "16");
          return new c();
       }else {
          PatchProxy.onMethodExit(b.class, "16");
          return objArray;
       }
    }
    public void z20(GifshowActivity p0,int p1,PhotoDetailParam p2,View p3,int p4,int p5,NasaSlideParam p6,boolean p7,o p8){
       object oobject = p0;
       object oobject1 = p2;
       object oobject2 = p3;
       object oobject3 = p6;
       object oobject4 = p8;
       int i = 4;
       if (PatchProxy.isSupport2(b.class, "1")) {
          Object[] objArray = new Object[9];
          objArray[0] = oobject;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = oobject1;
          objArray[3] = oobject2;
          objArray[i] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = oobject3;
          objArray[7] = Boolean.valueOf(p7);
          objArray[8] = oobject4;
          if (PatchProxy.applyVoid(objArray, this, b.class, "1")) {
             return;
          }
       }else {
          int i1 = this;
       }
       if (oobject1 != null) {
          p2.setBizType(i);
       }
       Intent intent = PhotoDetailActivity.x3(p0, p2, p3);
       NasaBizParam nasaBizParam = new NasaBizParam();
       nasaBizParam.setNasaSlideParam(oobject3);
       if (oobject1 != null && p2.getSlidePlayConfig() != null) {
          oobject3.setEnableShowMarque(p2.getSlidePlayConfig().mEnableShowMarque);
       }
       nasaBizParam.mNeedReplaceFeed = p7;
       nasaBizParam.putParamIntoIntent(intent);
       if (oobject4 != null) {
          oobject4.a(intent, null);
       }
       PhotoDetailActivity.J3(p0, p1, intent, p3, p4, p5);
       PatchProxy.onMethodExit(b.class, "1");
       return;
    }
}
