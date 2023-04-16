package alc.a;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.i3;
import com.yxcorp.gifshow.entity.TrendingInfo;
import java.lang.Integer;
import java.lang.Number;
import java.util.Map;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.components.feedmodel.OperationBarInfo;
import com.google.gson.JsonObject;
import java.lang.Boolean;
import com.google.gson.JsonElement;
import ekd.q;
import java.util.Set;
import java.util.Iterator;
import k2b.e0;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.log.model.CommonParams;
import com.kuaishou.android.model.feed.PhotoType;
import kp.r1;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.model.mix.CommonMeta;
import com.google.common.collect.ImmutableMap$b;
import com.google.common.collect.ImmutableMap;
import zk.g;
import k2b.k2;
import k2b.u1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import android.view.View;
import com.kwai.components.feedmodel.OperationBarInfo$GeneralInfo;
import com.yxcorp.gifshow.log.model.ShowMetaData;

public final class a	// class@000153
{

    public void a(){
       super();
    }
    public static ClientEvent$ElementPackage a(String p0){
       ClientEvent$ElementPackage obj = PatchProxy.applyOneRefs(p0, null, a.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientEvent$ElementPackage();
       i3 oi3 = i3.f();
       oi3.d("button_text", p0);
       obj.params = oi3.e();
       obj.name = "POPULAR_POPUP_CARD";
       obj.action2 = "FIND_MORE_BUTTON";
       return obj;
    }
    public static ClientEvent$ElementPackage b(TrendingInfo p0){
       ClientEvent$ElementPackage obj = PatchProxy.applyOneRefs(p0, null, a.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientEvent$ElementPackage();
       i3 oi3 = i3.f();
       oi3.d("trending_id", p0.mId);
       oi3.d("trending_name", p0.mDesc);
       oi3.c("trending_top", Integer.valueOf(p0.mTop));
       oi3.d("popular_type", p0.mPopularType);
       oi3.d("trending_type", p0.mTrendingType);
       obj.params = oi3.e();
       obj.name = "MORE_POPULAR";
       obj.action2 = "MORE_POPULAR";
       return obj;
    }
    public static ClientEvent$ElementPackage c(TrendingInfo p0,Map p1){
       ClientEvent$ElementPackage obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientEvent$ElementPackage();
       i3 oi3 = a.e(p1);
       oi3.d("trending_id", p0.mId);
       oi3.d("trending_name", p0.mDesc);
       oi3.c("trending_top", Integer.valueOf(p0.mTop));
       oi3.c("trending_feedcount", Integer.valueOf(p0.mFeedCount));
       oi3.d("popular_type", p0.mPopularType);
       oi3.d("trending_type", p0.mTrendingType);
       oi3.d("wordId", p0.mWordId);
       String str = (p0.isSubTrending())? "SON": "MAIN";
       oi3.d("trending_event_type", str);
       if (!TextUtils.isEmpty(p0.mTrendingLocationString) && ("nearby").equals(p0.mTrendingType)) {
          oi3.d("city", p0.mTrendingLocationString);
       }
       obj.params = oi3.e();
       obj.name = "POPULAR_POPUP_CARD";
       obj.action2 = "POPULAR_POPUP_CARD";
       return obj;
    }
    public static ClientEvent$ElementPackage d(OperationBarInfo p0){
       JsonObject obj = PatchProxy.applyOneRefs(p0, null, a.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JsonObject();
       obj.c0("trending_id", p0.mId);
       obj.c0("linkurl", p0.mLink);
       obj.H("is_extra_trend", Boolean.valueOf(p0.mIsExtraTrendingFeed));
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.params = obj.toString();
       uElementPack.name = "POPULAR_ENTRANCE";
       uElementPack.action2 = "POPULAR_ENTRANCE";
       return uElementPack;
    }
    public static i3 e(Map p0){
       i3 obj = PatchProxy.applyOneRefs(p0, null, a.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i3.f();
       if (!q.h(p0)) {
          Iterator iterator = p0.keySet().iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             obj.d(str, String.valueOf(p0.get(str)));
          }
       }
       return obj;
    }
    public static void f(e0 p0,OperationBarInfo p1,BaseFeed p2,int p3){
       JsonObject obj;
       CommonParams uCommonParam;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), null, a.class, "2")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = a.d(p1);
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyThreeRefs(p1, p2, Integer.valueOf(p3), null, a.class, "19");
          if (obj != PatchProxyResult.class) {
             uCommonParam = obj;
          label_00c1 :
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = w1.f(p2);
             ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
             uClickEvent.type = 1;
             uClickEvent.elementPackage = uElementPack;
             uClickEvent.contentPackage = uContentPack;
             b.a(0x4b316083).Y("", uClickEvent, p0, false, null, uCommonParam, null);
             return;
          }
       }
       obj = new JsonObject();
       obj.a0("photo_type", Integer.valueOf(r1.S1(p2).toInt()));
       obj.c0("photo_identity", TextUtils.I(p2.getId()));
       obj.c0("photo_exp_tag", r1.M0(p2));
       obj.a0("photo_index", Integer.valueOf(p3));
       obj.c0("photo_llsid", r1.w0(p2).mListLoadSequenceID);
       obj.c0("photo_s_author_id", r1.U1(p2));
       obj.c0("photo_trending_id", p1.mId);
       CommonParams uCommonParam1 = new CommonParams();
       uCommonParam1.mEntryTag = ImmutableMap.builder().c("element_action", new g("POPULAR_ENTRANCE")).c("page_name", new g(u1.j().d)).c("params", obj).a();
       uCommonParam = uCommonParam1;
       goto label_00c1 ;
    }
    public static void g(e0 p0,OperationBarInfo p1,BaseFeed p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a.class, "1")) {
          return;
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(p2);
       u1.D0("", p0, 6, a.d(p1), uContentPack, null);
       return;
    }
    public static void h(e0 p0,OperationBarInfo p1,BaseFeed p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a.class, "3")) {
          return;
       }
       OperationBarInfo mGeneralInfo = p1.mGeneralInfo;
       if (mGeneralInfo == null) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("word", mGeneralInfo.mWord);
       jsonObject.a0("index", Integer.valueOf(mGeneralInfo.mIndex));
       jsonObject.a0("trendingCount", Integer.valueOf(mGeneralInfo.mTrendingCount));
       jsonObject.H("is_show", Boolean.valueOf((TextUtils.isEmpty(p1.mDesc) ^ 0x01)));
       uElementPack.params = jsonObject.toString();
       uElementPack.action2 = "POPULAR_ENTRANCE_JUDGE";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(p2);
       u1.D0("", p0, 3, uElementPack, uContentPack, null);
       return;
    }
    public static void i(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "13")) {
          return;
       }
       u1.u(1, a.a(p0), null);
       return;
    }
    public static void j(TrendingInfo p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "10")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       u1.u(1, a.c(p0, p1), null);
       return;
    }
    public static void k(TrendingInfo p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "9")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       u1.u0(3, a.c(p0, p1), null);
       return;
    }
    public static void l(String p0,Map p1,String p2,e0 p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, a.class, "8")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = PatchProxy.applyThreeRefs(p0, p1, p2, null, a.class, "23");
       if (uElementPack != PatchProxyResult.class) {
       }else {
          uElementPack = new ClientEvent$ElementPackage();
          uElementPack.name = "POPULAR_POPUP";
          uElementPack.action2 = "POPULAR_POPUP";
          i3 oi3 = a.e(p1);
          oi3.d("trending_type", p0);
          oi3.d("city", p2);
          uElementPack.params = oi3.e();
       }
       u1.B0(new ShowMetaData().setType(10).setLogPage(p3).setElementPackage(uElementPack));
       return;
    }
    public static void m(BaseFeed p0,boolean p1){
       ClientEvent$ElementPackage uElementPack;
       a uoa = a.class;
       Object obj = null;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), obj, uoa, "5")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (PatchProxy.isSupport(uoa)) {
          uElementPack = PatchProxy.applyOneRefs(Boolean.valueOf(p1), obj, uoa, "21");
          if (uElementPack != PatchProxyResult.class) {
          label_0046 :
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = w1.f(p0);
             u1.u0(7, uElementPack, uContentPack);
             return;
          }
       }
       uElementPack = new ClientEvent$ElementPackage();
       String str = "ENTER_NEXT_TRENDING";
       String str1 = (p1)? str: "ENTER_PREVIOUS_TRENDING";
       uElementPack.name = str1;
       if (!p1) {
          str = "ENTER_PREVIOUS_TRENDING";
       }
       uElementPack.action2 = str;
       goto label_0046 ;
    }
}
