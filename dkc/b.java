package dkc.b;
import java.lang.String;
import okhttp3.MediaType;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.feed.BaseFeed;
import kp.w1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import com.kwai.components.feedmodel.feed.KaraokeChorusModel;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.model.music.Music;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.android.model.music.MusicType;
import com.yxcorp.gifshow.log.model.CommonParams;
import com.kuaishou.android.model.mix.CommonMeta;
import dkc.a;
import tl8.d;
import ok.h;
import tl8.e;
import com.google.gson.JsonObject;
import com.kuaishou.android.model.feed.PhotoType;
import kp.r1;
import java.lang.CharSequence;
import k2b.k2;
import k2b.u1;
import com.google.common.collect.ImmutableMap$b;
import com.google.common.collect.ImmutableMap;
import zk.g;
import com.kuaishou.android.model.mix.TagItem;
import com.yxcorp.gifshow.model.config.ActivityInfo;
import com.kuaishou.android.model.mix.PhotoKgTag;
import java.util.List;
import java.util.Iterator;
import android.app.Activity;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagShowPackage;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.y1;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import k2b.e0;
import gw8.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import k2b.l0;
import java.util.HashMap;
import java.util.Map;
import ekd.q;
import java.util.Set;
import java.util.Map$Entry;
import com.google.gson.JsonElement;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.kuaishou.android.model.mix.SameFrameInfo;
import com.yxcorp.gifshow.util.SameFrameExt;
import cs4.b$a;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Long;
import com.google.protobuf.nano.MessageNano;
import okhttp3.RequestBody;
import wkd.b;
import dya.a;
import brd.t;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public final class b	// class@002232
{
    public static final MediaType a;

    static {
       b.a = MediaType.parse("application/octet-stream");
    }
    public void b(){
       super();
    }
    public static ClientContent$PhotoPackage a(QPhoto p0,int p1,boolean p2){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), null, b.class, "33");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       ClientContent$PhotoPackage photoPackage = w1.g(p0.mEntity, p1);
       photoPackage.tagOwner = p2;
       return photoPackage;
    }
    public static ClientContent$TagPackage b(QPhoto p0){
       ClientContent$TagPackage obj = PatchProxy.applyOneRefs(p0, null, b.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$TagPackage();
       if (p0.getKaraokeChorusModel() != null) {
          obj.identity = TextUtils.k(p0.getKaraokeChorusModel().mPhotoId);
          obj.name = TextUtils.k(p0.getKaraokeChorusModel().mUserName);
          obj.type = 9;
       }
       return obj;
    }
    public static ClientContent$TagPackage c(Music p0){
       ClientContent$TagPackage obj = PatchProxy.applyOneRefs(p0, null, b.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$TagPackage();
       obj.identity = TextUtils.k(p0.mId);
       obj.name = TextUtils.k(p0.mName);
       i3 oi3 = i3.f();
       oi3.c("highlight_judge", Integer.valueOf(0));
       obj.params = oi3.e();
       obj.type = 1;
       p0 = p0.mType;
       if (p0 != null) {
          obj.secondaryType = String.valueOf(p0.mValue);
       }
       return obj;
    }
    public static ClientContent$TagPackage d(String p0){
       ClientContent$TagPackage obj = PatchProxy.applyOneRefs(p0, null, b.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$TagPackage();
       obj.name = TextUtils.k(p0);
       obj.type = 21;
       return obj;
    }
    public static CommonParams e(BaseFeed p0,String p1,String p2,int p3){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, p2, Integer.valueOf(p3), null, b.class, "29");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       CommonParams uCommonParam = (p0 == null)? null: b.f(p0, p1, p2, p3, e.c(p0, CommonMeta.class, a.b));
       return uCommonParam;
    }
    public static CommonParams f(BaseFeed p0,String p1,String p2,int p3,int p4){
       JsonObject obj1;
       String str;
       b uob = b.class;
       Object obj = null;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),Integer.valueOf(p4)};
          obj1 = PatchProxy.apply(objArray, obj, uob, "30");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       if (p0 == null) {
          return obj;
       }else {
          obj1 = new JsonObject();
          obj1.a0("photo_type", Integer.valueOf(r1.S1(p0).toInt()));
          obj1.c0("photo_identity", TextUtils.I(p0.getId()));
          obj1.c0("photo_exp_tag", r1.M0(p0));
          obj1.a0("photo_index", Integer.valueOf(p4));
          obj1.c0("photo_llsid", r1.w0(p0).mListLoadSequenceID);
          obj1.c0("photo_s_author_id", r1.U1(p0));
          if (!TextUtils.x(p1)) {
             obj1.c0("tag_identity", p1);
          }
          if (!TextUtils.x(p2)) {
             obj1.c0("tag_name", p2);
          }
          if (p3) {
             obj1.a0("tag_type", Integer.valueOf(p3));
          }
          k2 ok2 = u1.j();
          CommonParams uCommonParam = new CommonParams();
          ImmutableMap$b uob1 = ImmutableMap.builder().c("element_action", new g("CLICK_TAG"));
          ok2 = (ok2 != null)? ok2.d: "";
          uCommonParam.mEntryTag = uob1.c("page_name", new g(ok2)).c("params", obj1).a();
          return uCommonParam;
       }
    }
    public static CommonParams g(QPhoto p0,int p1){
       b uob = b.class;
       CommonParams uCommonParam = null;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), uCommonParam, uob, "26");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 != null) {
          uCommonParam = b.f(p0.getEntity(), uCommonParam, uCommonParam, 0, p1);
       }
       return uCommonParam;
    }
    public static ClientContent$TagPackage h(TagItem p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.i(p0, null);
    }
    public static ClientContent$TagPackage i(TagItem p0,QPhoto p1){
       ClientContent$TagPackage obj = PatchProxy.applyTwoRefs(p0, p1, null, b.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$TagPackage();
       obj.identity = TextUtils.I(p0.mId);
       obj.name = TextUtils.I(p0.mName);
       obj.type = (p0.mRich != null)? 6: 2;
       TagItem mCount = p0.mCount;
       if (mCount > null) {
          obj.photoCount = (long)mCount;
       }
       obj.params = b.n(p1, p0.mName, 0).e();
       return obj;
    }
    public static ClientContent$TagPackage j(ActivityInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.k(p0, null);
    }
    public static ClientContent$TagPackage k(ActivityInfo p0,QPhoto p1){
       ClientContent$TagPackage obj = PatchProxy.applyTwoRefs(p0, p1, null, b.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$TagPackage();
       obj.identity = TextUtils.I(p0.mTagId);
       obj.name = TextUtils.I(p0.mKeyword);
       obj.type = 6;
       obj.params = b.n(p1, p0.mKeyword, 1).e();
       return obj;
    }
    public static ClientContent$TagPackage l(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.m(p0, null);
    }
    public static ClientContent$TagPackage m(String p0,QPhoto p1){
       ClientContent$TagPackage obj = PatchProxy.applyTwoRefs(p0, p1, null, b.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$TagPackage();
       obj.identity = "";
       obj.name = TextUtils.I(p0);
       obj.type = 2;
       obj.params = b.n(p1, p0, 0).e();
       return obj;
    }
    public static i3 n(QPhoto p0,String p1,int p2){
       i3 obj;
       if (PatchProxy.isSupport(b.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, b.class, "49");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = i3.f();
       if (p0 != null) {
          PhotoKgTag photoKgTag = b.o(p0, p1);
          Integer integer = 1;
          int i = (photoKgTag != null)? 1: 0;
          obj.c("reinforce_judge", Integer.valueOf(i));
          if (i == integer) {
             p2 = 0;
          }
          obj.c("highlight_judge", Integer.valueOf(p2));
          if (photoKgTag != null) {
             obj.d("kg_id", photoKgTag.mKgId);
             obj.c("tag_style", Integer.valueOf(photoKgTag.mTagSource));
          }
       }else {
          obj.c("highlight_judge", Integer.valueOf(p2));
       }
       return obj;
    }
    public static PhotoKgTag o(QPhoto p0,String p1){
       PhotoKgTag obj = PatchProxy.applyTwoRefs(p0, p1, null, b.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Iterator iterator = p0.getKgTags().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          obj = iterator.next();
          if ((obj.mName).equals(p1)) {
             break ;
          }
       }
       return obj;
    }
    public static void p(QPhoto p0,List p1,Activity p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b.class, "3")) {
          return;
       }
       if (!p1.isEmpty()) {
          ClientContent$ContentPackage uContentPack = w1.h(p0.mEntity);
          ClientContent$TagShowPackage tagShowPacka = new ClientContent$TagShowPackage();
          uContentPack.tagShowPackage = tagShowPacka;
          ClientContent$TagPackage[] tagPackageAr = new ClientContent$TagPackage[p1.size()];
          tagShowPacka.tagPackage = p1.toArray(tagPackageAr);
          ShowMetaData showMetaData = new ShowMetaData().setType(3).setElementPackage(y1.a("showTag", 900, 12)).setContentPackage(uContentPack).setFeedLogCtx(p0.getFeedLogCtx());
          v0 = p2 instanceof e0;
          if (uContentPack) {
             showMetaData.setLogPage(p2);
          }
          u1.B0(showMetaData);
          if (!PatchProxy.applyVoidTwoRefs(p1, p2, null, b.class, "4")) {
             Iterator iterator = p1.iterator();
             while (iterator.hasNext()) {
                ClientContent$TagPackage tagPackage = iterator.next();
                ActivityInfo uActivityInf = a.a(tagPackage.name);
                if (uActivityInf != null && !TextUtils.x(uActivityInf.mKsOrderId)) {
                   ClientContent$ContentPackage uContentPack1 = new ClientContent$ContentPackage();
                   uContentPack1.tagPackage = tagPackage;
                   uContentPack1.ksOrderInfoPackage = l0.a(uActivityInf.mKsOrderId);
                   ClientEvent$ElementPackage uElementPack = l0.c("showTag");
                   uElementPack.type = 12;
                   ShowMetaData showMetaData1 = new ShowMetaData().setType(3).setElementPackage(uElementPack).setContentPackage(uContentPack1);
                   if (uContentPack) {
                      showMetaData1.setLogPage(p2);
                   }
                   u1.B0(showMetaData1);
                }
             }
          }
       }
       return;
    }
    public static void q(QPhoto p0,String p1,ClientContent$TagPackage p2,ClientContent$KsOrderInfoPackage p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, b.class, "8")) {
          return;
       }
       b.r(p0, p1, p2, b.e(p0.getEntity(), p2.identity, p2.name, p2.type), p3);
       return;
    }
    public static void r(QPhoto p0,String p1,ClientContent$TagPackage p2,CommonParams p3,ClientContent$KsOrderInfoPackage p4){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, uob, "9")) {
             return;
          }
       }
       b.s(p0, p1, p2, p3, p4, "");
       return;
    }
    public static void s(QPhoto p0,String p1,ClientContent$TagPackage p2,CommonParams p3,ClientContent$KsOrderInfoPackage p4,String p5){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, null, uob, "10")) {
             return;
          }
       }
       HashMap hashMap = new HashMap();
       if (!TextUtils.x(p5)) {
          hashMap.put("tag_area", p5);
       }
       PhotoKgTag photoKgTag = b.o(p0, p2.name);
       if (photoKgTag != null) {
          hashMap.put("kg_id", photoKgTag.mKgId);
       }
       b.t(p0, p1, p2, p3, p4, hashMap);
       return;
    }
    public static void t(QPhoto p0,String p1,ClientContent$TagPackage p2,CommonParams p3,ClientContent$KsOrderInfoPackage p4,Map p5){
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p4;
       b uob = b.class;
       int i = 4;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,oobject3,oobject4,p5};
          if (PatchProxy.applyVoid(objArray, null, uob, "11")) {
             return;
          }
       }
       JsonObject jsonObject = new JsonObject();
       ClientContent$ContentPackage uContentPack = w1.h(oobject.mEntity);
       uContentPack.tagPackage = oobject2;
       if (oobject4 != null) {
          uContentPack.ksOrderInfoPackage = oobject4;
       }
       if (!q.h(p5)) {
          Iterator iterator = p5.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             jsonObject.c0(key, uEntry.getValue());
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       ClientContent$TagPackage type = oobject2.type;
       if (type == 1) {
          jsonObject.H("show_explicitly", Boolean.FALSE);
          jsonObject.c0("tag_type", "MUSIC");
          uElementPack.action2 = "CLICK_TAG";
       }else if(type == i){
          jsonObject.H("show_explicitly", Boolean.FALSE);
          jsonObject.c0("tag_type", "MAGIC");
          uElementPack.action2 = "CLICK_TAG";
       }else {
          uElementPack.action = 841;
       }
       uElementPack.params = jsonObject.toString();
       uElementPack.name = oobject1;
       uElementPack.type = 1;
       u1.B(new ClickMetaData().setType(1).setElementPackage(uElementPack).setContentPackage(uContentPack).setCommonParams(oobject3).setFeedLogCtx(p0.getFeedLogCtx()));
       String photoId = p0.getPhotoId();
       if (p0.getSameFrameInfo() != null && !TextUtils.x(SameFrameExt.b(p0))) {
          photoId = SameFrameExt.b(p0);
       }
       try{
          String str = photoId;
          String expTag = p0.getExpTag();
          if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidFourRefs(str, expTag, p2, Integer.valueOf(1), null, b.class, "12")) {
             b$a uoa = new b$a();
             uoa.a = Long.valueOf(QCurrentUser.ME.getId()).longValue();
             oobject2.expTag = TextUtils.k(expTag);
             e0.b = oobject2;
             e0.c = 1;
             e0.d = TextUtils.k(str);
             b.a(-970208632).a(RequestBody.create(b.a, MessageNano.toByteArray(e0))).subscribe(Functions.d(), Functions.d());
          }
       }catch(java.lang.Exception e0){
       }
       return;
    }
    public static void u(QPhoto p0,String p1,ClientContent$TagPackage p2,CommonParams p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, b.class, "6")) {
          return;
       }
       b.v(p0, p1, p2, p3, null);
       return;
    }
    public static void v(QPhoto p0,String p1,ClientContent$TagPackage p2,CommonParams p3,String p4){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, uob, "7")) {
             return;
          }
       }
       ActivityInfo uActivityInf = a.a(p2.name);
       if (uActivityInf != null && !TextUtils.x(uActivityInf.mKsOrderId)) {
          b.s(p0, p1, p2, p3, l0.a(uActivityInf.mKsOrderId), p4);
       }else {
          b.s(p0, p1, p2, p3, null, p4);
       }
       return;
    }
    public static void w(QPhoto p0,int p1,boolean p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), null, b.class, "32")) {
          return;
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = b.a(p0, p1, p2);
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action = 0x75db;
       u1.u0(6, uElementPack, uContentPack);
       return;
    }
}
