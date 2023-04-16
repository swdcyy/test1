package com.yxcorp.gifshow.share.OperationModelFactory;
import java.util.List;
import java.lang.String;
import java.io.File;
import msd.l;
import brd.t;
import com.yxcorp.gifshow.share.OperationModel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.share.OperationModel$c;
import com.yxcorp.gifshow.share.OperationModel$Type;
import com.yxcorp.gifshow.entity.IMShareData;
import com.yxcorp.gifshow.entity.LinkInfo;
import pic.b;
import mhc.x;
import pic.b$a;
import qrd.l1;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.share.OperationModelFactory$buildPageModel$$inlined$build$lambda$1;
import com.kwai.framework.model.feed.BaseFeed;
import yic.p0;
import wkd.b;
import nic.a;
import com.kuaishou.android.model.mix.CommonMeta;
import kp.r1;
import cjd.e;
import erd.o;
import com.yxcorp.gifshow.share.OperationModelUtil;
import com.kuaishou.android.model.feed.VideoFeed;
import com.yxcorp.gifshow.share.OperationModelFactory$buildPhotoModel$$inlined$build$lambda$1;
import com.yxcorp.gifshow.share.OperationModelFactory$buildPhotoModel$$inlined$build$lambda$2;
import com.yxcorp.gifshow.entity.TagDetailItem;
import java.lang.Integer;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.share.OperationModelFactory$buildProfileModel$$inlined$build$lambda$1;
import com.yxcorp.gifshow.model.SharePlatformData$ShareConfig;
import com.yxcorp.gifshow.model.SharePlatformData;

public final class OperationModelFactory	// class@001b6e
{

    public static final OperationModel a(List p0,String p1,String p2,String p3,String p4,String p5,File p6,l p7,t p8){
       QCurrentUser obj1;
       object oobject8;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p4;
       object oobject5 = p5;
       object oobject6 = p6;
       object oobject7 = p8;
       OperationModelFactory operationMod = OperationModelFactory.class;
       int i = 1;
       Boolean obj = null;
       int i1 = 0;
       if (PatchProxy.isSupport(operationMod)) {
          Object[] objArray = new Object[9];
          objArray[i1] = oobject;
          objArray[i] = oobject1;
          objArray[2] = oobject2;
          objArray[3] = oobject3;
          objArray[4] = oobject4;
          objArray[5] = oobject5;
          objArray[6] = oobject6;
          objArray[7] = p7;
          objArray[8] = oobject7;
          obj1 = PatchProxy.apply(objArray, obj, operationMod, "7");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       obj1 = QCurrentUser.ME;
       if (obj1 != null) {
          String id = obj1.getId();
          if (id != null) {
             if (!id.length()) {
                i1 = 1;
             }
             oobject8 = (i1)? oobject4: TextUtils.c(oobject4, "fid", id);
             if (oobject8 != null) {
             label_0065 :
                OperationModel$c uoc = new OperationModel$c();
                uoc.n(OperationModel$Type.PAGE);
                uoc.e(oobject7);
                uoc.d(oobject6);
                IMShareData iMShareData = new IMShareData();
                iMShareData.mPlatformData2InfoType = 3;
                LinkInfo linkInfo = new LinkInfo();
                linkInfo.mTitle = oobject1;
                linkInfo.mDesc = oobject2;
                linkInfo.mIconUrl = oobject3;
                linkInfo.mUrl = TextUtils.c(oobject8, "cc", b.A0.a().y0());
                linkInfo.mName = oobject5;
                iMShareData.mLinkInfo = linkInfo;
                Boolean uBoolean = (oobject != null)? Boolean.valueOf(oobject.contains("imfriend_list")): null;
                obj = (oobject != null)? Boolean.valueOf(oobject.contains("imfriend")): null;
                Boolean tRUE = Boolean.TRUE;
                if (a.g(obj, tRUE) && a.g(uBoolean, tRUE)) {
                   iMShareData.mShowFriendList = 3;
                }else if(a.g(obj, tRUE)){
                   iMShareData.mShowFriendList = i;
                }else if(a.g(uBoolean, tRUE)){
                   iMShareData.mShowFriendList = 2;
                }
                uoc.h(iMShareData);
                OperationModelFactory$buildPageModel$$inlined$build$lambda$1 uobuildPageM = new OperationModelFactory$buildPageModel$$inlined$build$lambda$1(p8, p6, p1, p2, p3, oobject8, p5, p0, p7);
                uoc.f(i);
                return uoc.a();
             }
          }
       }
       oobject8 = oobject4;
       goto label_0065 ;
    }
    public static final OperationModel b(BaseFeed p0,int p1,t p2){
       return OperationModelFactory.e(p0, p1, p2, false, false, null, false, 120, null);
    }
    public static final OperationModel c(BaseFeed p0,int p1,t p2,boolean p3,boolean p4){
       return OperationModelFactory.e(p0, p1, null, p3, p4, null, false, 96, null);
    }
    public static final OperationModel d(BaseFeed p0,int p1,t p2,boolean p3,boolean p4,String p5){
       return OperationModelFactory.e(p0, p1, null, p3, p4, p5, false, 64, null);
    }
    public static OperationModel e(BaseFeed p0,int p1,t p2,boolean p3,boolean p4,String p5,boolean p6,int p7,Object p8){
       t ot;
       IMShareData iMShareData;
       BaseFeed uBaseFeed = p0;
       boolean b = false;
       int i = (p7 & 0x02)? 0: p1;
       String str = "";
       String str1 = "photo";
       String str2 = "3";
       BaseFeed uBaseFeed1 = null;
       if (p7 & 0x04) {
          ot = PatchProxy.applyOneRefs(p0, uBaseFeed1, p0.class, str2);
          if (ot != PatchProxyResult.class) {
          }else {
             a.p(p0, str1);
             Object obj = b.a(0x6af2a3ec);
             String id = p0.getId();
             CommonMeta mExpTag = r1.w0(p0).mExpTag;
             CommonMeta uCommonMeta = (mExpTag != null)? mExpTag: str;
             ot = obj.e(id, uCommonMeta, null, null, p0.a(p0));
             a.o(ot, "Singleton.get\(ForwardApi¡­xtTransientParams\(photo\)\)");
          }
          ot = ot.map(new e());
       }else {
          ot = p2;
       }
       boolean b1 = (p7 & 0x08)? true: p3;
       boolean b2 = (p7 & 0x10)? false: p4;
       if (!(p7 & 0x20)) {
          str = p5;
       }
       if (!(p7 & 0x40)) {
          b = p6;
       }
       a.p(p0, str1);
       a.p(str, "guidePlatform");
       OperationModel$c uoc = new OperationModel$c();
       uoc.n(OperationModel$Type.PHOTO);
       uoc.k(p0);
       uoc.l(i);
       uoc.o(OperationModelUtil.a.d(p0));
       uoc.c(b1);
       uoc.e(ot);
       uoc.q = b2;
       if (!PatchProxy.applyVoidOneRefs(str, uoc, OperationModel$c.class, str2)) {
          a.p(str, "<set-?>");
          uoc.r = str;
       }
       uoc.g(b);
       if (uBaseFeed instanceof VideoFeed) {
          uBaseFeed1 = uBaseFeed;
       }
       if (uBaseFeed1 != null && uBaseFeed1.isPayCourse() == true) {
          iMShareData = new IMShareData();
          iMShareData.mFeed = uBaseFeed;
          iMShareData.mPlatformData2InfoType = 4;
          iMShareData.mUseParamAction = Boolean.TRUE;
          uoc.h(iMShareData);
          OperationModelFactory$buildPhotoModel$$inlined$build$lambda$1 uobuildPhoto = new OperationModelFactory$buildPhotoModel$$inlined$build$lambda$1(p0, i, b1, ot, b2, str, b);
          uoc.f(iMShareData);
       }else {
          iMShareData = new IMShareData();
          iMShareData.mFeed = uBaseFeed;
          uoc.h(iMShareData);
          OperationModelFactory$buildPhotoModel$$inlined$build$lambda$2 uobuildPhoto1 = new OperationModelFactory$buildPhotoModel$$inlined$build$lambda$2(p0, i, b1, ot, b2, str, b);
          uoc.f(iMShareData);
       }
       return uoc.a();
    }
    public static final OperationModel f(BaseFeed p0,int p1,TagDetailItem p2){
       if (PatchProxy.isSupport(OperationModelFactory.class)) {
          p2 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), null, null, OperationModelFactory.class, "2");
          if (p2 != PatchProxyResult.class) {
             return p2;
          }
       }
       a.p(p0, "photo");
       OperationModel$c uoc = new OperationModel$c();
       uoc.n(OperationModel$Type.PHOTO);
       uoc.k(p0);
       uoc.m(null);
       uoc.l(p1);
       return uoc.a();
    }
    public static final OperationModel g(User p0,int p1,String p2){
       OperationModel$c obj;
       if (PatchProxy.isSupport(OperationModelFactory.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, null, OperationModelFactory.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "user");
       obj = new OperationModel$c();
       obj.n(OperationModel$Type.PROFILE);
       obj.p(p0);
       obj.o(OperationModelUtil.a.e(p0, null));
       obj.c(true);
       obj.e(null);
       IMShareData iMShareData = new IMShareData();
       iMShareData.mUser = p0;
       obj.h(iMShareData);
       obj.f(new OperationModelFactory$buildProfileModel$$inlined$build$lambda$1(p0, p2));
       return obj.a();
    }
    public static final SharePlatformData$ShareConfig h(x p0,l p1){
       SharePlatformData$ShareConfig obj = PatchProxy.applyTwoRefs(p0, p1, null, OperationModelFactory.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "forward");
       a.p(p1, "block");
       obj = new SharePlatformData$ShareConfig();
       p1.invoke(obj);
       obj.mH5MaxTitleLength = SharePlatformData.getH5MaxTitleLength(p0.v());
       return obj;
    }
    public static final SharePlatformData i(l p0){
       SharePlatformData obj = PatchProxy.applyOneRefs(p0, null, OperationModelFactory.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "block");
       obj = new SharePlatformData();
       p0.invoke(obj);
       return obj;
    }
    public static final String j(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, OperationModelFactory.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return OperationModelUtil.a.b(p0);
    }
}
