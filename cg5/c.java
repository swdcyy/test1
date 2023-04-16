package cg5.c;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import lnc.i3;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.kuaishou.android.model.mix.CommonMeta;
import java.lang.Boolean;
import wkd.b;
import com.yxcorp.gifshow.log.g;
import cg5.d;
import k2b.k2;
import k2b.u1;
import com.yxcorp.gifshow.log.h;
import com.kwai.framework.logger.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import brd.x;
import com.yxcorp.gifshow.model.config.FeedNegativeFeedback$NegativeReason;
import com.kuaishou.android.model.mix.QRecoTag;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import cg5.b;
import tl8.d;
import ok.h;
import tl8.e;
import cjd.e;
import erd.o;
import cg5.a;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public class c	// class@0006b5
{

    public void c(){
       super();
    }
    public static t a(QPhoto p0,int p1,String p2,String p3,String p4,int p5,String p6,i3 p7){
       i3 obj;
       object oobject = p0;
       object oobject1 = p2;
       object oobject2 = p6;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{oobject,Integer.valueOf(p1),oobject1,p3,p4,Integer.valueOf(p5),oobject2,p7};
          obj = PatchProxy.apply(objArray, null, uoc, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0.isLiveStream()) {
          return c.e(p0.getLiveStreamId(), p1, 0, p2, c.l(p0.getExpTag()), p0.getServerExpTag(), c.d(), p3, p4, r1.Q1(oobject.mEntity), r1.O0(oobject.mEntity));
       }else if(("PYMK").equals(oobject2)){
          obj = (p7 != null)? p7: i3.f();
          String str = obj.e();
          if (p0.getCommonMeta() != null) {
             obj.a("is_feed", Boolean.TRUE);
             obj.d("exp_tag", p0.getExpTag());
             obj.d("serverExpTag", p0.getServerExpTag());
             obj.d("expTagList", b.a(0xe0ff4fb).d());
             obj.d("pageURL", p0.getVideoUrl());
             str = obj.e();
          }
          String str1 = str;
          c.j(p0, p1, 0, p2, p3, p4, p5, p6, str1);
          return c.b().h(p0.getUserId(), oobject1, str1);
       }else {
          return c.b().f(p0.getPhotoId(), p1, p2, c.l(p0.getExpTag()), p0.getServerExpTag(), c.d(), p3, p4, p0.getUserId(), p6, c.c(), p0.getFeedLogCtxString());
       }
    }
    public static d b(){
       Object obj = PatchProxy.apply(null, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(-621758545);
    }
    public static String c(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, objArray, c.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (u1.j() != null) {
          objArray = u1.j().d;
       }
       return objArray;
    }
    public static String d(){
       Object obj = PatchProxy.apply(null, null, c.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(0xe0ff4fb).d();
    }
    public static t e(String p0,int p1,int p2,String p3,String p4,String p5,String p6,String p7,String p8,String p9,FeedLogCtx p10){
       c uoc = c.class;
       String str = null;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[11];
          objArray[0] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          objArray[9] = p9;
          objArray[10] = p10;
          Object obj = PatchProxy.apply(objArray, str, uoc, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       d uod = c.b();
       String str1 = b.a(0x4b316083).i(c.c(), str);
       if (p10 != null) {
          str = p10.toJsonString();
       }
       return uod.g(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, str1, str);
    }
    public static t f(String p0,int p1,int p2,String p3,String p4,String p5,String p6,String p7,FeedLogCtx p8){
       Object[] objArray;
       object oobject = p8;
       c uoc = c.class;
       object oobject1 = null;
       if (PatchProxy.isSupport(uoc)) {
          objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = oobject1;
          objArray[7] = oobject1;
          objArray[8] = oobject;
          Object obj = PatchProxy.apply(objArray, oobject1, uoc, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = c.d();
       FeedLogCtx uFeedLogCtx = (oobject != null)? oobject.stidContainer: oobject1;
       a uoa = new a("LIVE_REDUCE_RESULT", 0, 0, 0, p8);
       return c.e(p0, p1, p2, p3, p4, p5, str, null, null, uFeedLogCtx, p8).compose(objArray);
    }
    public static t g(QPhoto p0,int p1,int p2,FeedNegativeFeedback$NegativeReason p3,QRecoTag p4,String p5,String p6){
       object oobject;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,oobject,p5,p6};
          oobject = null;
          uoc = PatchProxy.apply(objArray, oobject, uoc, "9");
          if (uoc != PatchProxyResult.class) {
             return uoc;
          }
       }
       return c.h(p0, p1, p2, p3, null, p5, p6, null);
    }
    public static t h(QPhoto p0,int p1,int p2,FeedNegativeFeedback$NegativeReason p3,QRecoTag p4,String p5,String p6,String p7){
       object oobject = p0;
       object oobject1 = p3;
       object oobject2 = p4;
       c uoc = c.class;
       FeedNegativeFeedback$NegativeReason negativeReas = null;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{oobject,Integer.valueOf(p1),Integer.valueOf(p2),oobject1,oobject2,p5,p6,p7};
          Object obj = PatchProxy.apply(objArray, negativeReas, uoc, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0.isLiveStream()) {
          return c.e(p0.getLiveStreamId(), p1, p2, p6, c.l(p0.getExpTag()), p0.getServerExpTag(), c.d(), oobject1.mId, "", r1.Q1(oobject.mEntity), r1.O0(oobject.mEntity));
       }else if(!TextUtils.x(oobject1.mTagId)){
          negativeReas = oobject1.mTagId;
       }
       Object obj1 = negativeReas;
       d uod = c.b();
       String photoId = p0.getPhotoId();
       int i = e.h(oobject.mEntity, CommonMeta.class, b.b).intValue();
       String expTag = p0.getExpTag();
       String serverExpTag = p0.getServerExpTag();
       String str = c.d();
       String listLoadSequ = p0.getListLoadSequenceID();
       FeedNegativeFeedback$NegativeReason mId = oobject1.mId;
       QRecoTag qRecoTag = (oobject2 != null)? oobject2.mId: obj1;
       return uod.d(photoId, i, p6, expTag, serverExpTag, str, listLoadSequ, mId, qRecoTag, p5, p0.getUserId(), p7, c.c(), obj1, p0.getFeedLogCtxString());
    }
    public static t i(String p0,QPhoto p1,int p2,FeedNegativeFeedback$NegativeReason p3,QRecoTag p4,String p5){
       object oobject = p1;
       object oobject1 = p3;
       object oobject2 = p4;
       c uoc = c.class;
       QRecoTag qRecoTag = null;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,oobject,Integer.valueOf(p2),oobject1,oobject2,p5};
          Object obj = PatchProxy.apply(objArray, qRecoTag, uoc, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1.isLiveStream()) {
          return c.e(p1.getLiveStreamId(), p2, 0, p5, c.l(p1.getExpTag()), p1.getServerExpTag(), c.d(), oobject1.mId, "", r1.Q1(oobject.mEntity), r1.O0(oobject.mEntity)).map(new e());
       }else {
          d uod = c.b();
          String photoId = p1.getPhotoId();
          int i = e.h(oobject.mEntity, CommonMeta.class, a.b).intValue();
          String expTag = p1.getExpTag();
          FeedNegativeFeedback$NegativeReason mId = oobject1.mId;
          if (oobject2 != null) {
             qRecoTag = oobject2.mId;
          }
          return uod.c(p0, photoId, i, expTag, p5, mId, qRecoTag, p1.getListLoadSequenceID(), p1.getFeedLogCtxString()).map(new e());
       }
    }
    public static void j(QPhoto p0,int p1,int p2,String p3,String p4,String p5,int p6,String p7,String p8){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = p7;
          objArray[8] = p8;
          if (PatchProxy.applyVoid(objArray, null, uoc, "7")) {
             return;
          }
       }
       c.k(p0, p1, p2, p3, p4, p5, p6, p7, p8, c.c(), "");
       return;
    }
    public static void k(QPhoto p0,int p1,int p2,String p3,String p4,String p5,int p6,String p7,String p8,String p9,String p10){
       c uoc = c.class;
       String str = null;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[11];
          objArray[0] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = p7;
          objArray[8] = p8;
          objArray[9] = p9;
          objArray[10] = p10;
          if (PatchProxy.applyVoid(objArray, str, uoc, "8")) {
             return;
          }
       }
       String str1 = (p0 == null)? "0": p0.getPhotoId();
       String str2 = str1;
       str1 = "";
       String str3 = (p0 == null)? str1: p0.getExpTag();
       if (p0 != null) {
          str1 = p0.getServerExpTag();
       }
       String str4 = str1;
       String str5 = (p0 == null)? p10: p0.getUserId();
       d uod = c.b();
       int i = p6;
       int i1 = (i == -1)? 1: i;
       String str6 = c.l(str3);
       String str7 = c.d();
       String str8 = (TextUtils.x(p9))? c.c(): p9;
       if (p0 != null) {
          str = p0.getFeedLogCtxString();
       }
       uod.b(i1, p2, "PYMK", str2, p1, p3, str6, str4, str7, p4, p5, str5, p7, str8, p8, str).subscribe(Functions.d());
       return;
    }
    public static String l(String p0){
       if (p0 != null) {
       }else {
          p0 = "_";
       }
       return p0;
    }
}
