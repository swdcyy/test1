package aja.k;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.follow.common.model.RealtimeMeta;
import java.lang.String;
import java.util.List;
import com.kwai.framework.model.user.User;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import lnc.i3;
import com.kuaishou.android.model.feed.PhotoType;
import kp.r1;
import java.lang.Number;
import com.yxcorp.utility.TextUtils;
import java.util.Collection;
import ekd.q;
import org.json.JSONArray;
import java.util.Iterator;
import java.lang.CharSequence;
import com.yxcorp.gifshow.follow.common.model.RealtimeMeta$LogParams;
import java.lang.Long;
import com.yxcorp.gifshow.follow.model.FilterOption;
import org.json.JSONObject;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import yga.b;
import java.lang.Throwable;
import yga.c;
import k2b.e0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.yxcorp.gifshow.follow.model.FilterBox;
import k2b.f3;
import tl8.d;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.h;
import com.yxcorp.gifshow.log.model.ShowMetaData;

public class k	// class@000092
{

    public void k(){
       super();
    }
    public static String a(BaseFeed p0,RealtimeMeta p1,String p2,int p3,List p4,User[] p5){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),p4,p5};
          p5 = PatchProxy.apply(objArray, null, ok, "3");
          if (p5 != patchProxyRe) {
             return p5;
          }
       }
       i3 oi3 = i3.f();
       oi3.c("type", Integer.valueOf(r1.S1(p0).toInt()));
       oi3.c("content_type", Integer.valueOf(p1.mContentType));
       oi3.d("title", TextUtils.k(p1.mTitle));
       oi3.d("sub_title", TextUtils.k(p1.mSubTitle));
       String str = PatchProxy.applyOneRefs(p4, null, ok, "4");
       if (str != patchProxyRe) {
       }else if(q.f(p4)){
          str = "";
       }else {
          JSONArray jSONArray = new JSONArray();
          Iterator iterator = p4.iterator();
          while (iterator.hasNext()) {
             BaseFeed uBaseFeed = iterator.next();
             if (!TextUtils.x(r1.t1(uBaseFeed))) {
                jSONArray.put(r1.t1(uBaseFeed));
             }
          }
          str = jSONArray.toString();
       }
       oi3.d("photos", str);
       p1 = p1.mLogParams;
       if (p1 != null) {
          oi3.c("friend_cnt", Long.valueOf(p1.mFriendCount));
       }
       if (!TextUtils.x(p2)) {
          oi3.d("click_area", p2);
       }
       String str1 = "has_replace";
       if (p3 == 1) {
          oi3.d(str1, "FALSE");
       }else if(p3 == 2){
          oi3.d(str1, "TRUE");
       }
       str1 = "new";
       if (p3 == 3) {
          oi3.d("card_style", str1);
       }else if(p3 == 5){
          oi3.d("card_style", str1);
       }else {
          oi3.d("card_style", "old");
       }
       if (!TextUtils.x(r1.M0(p0))) {
          oi3.d("exp_tag", r1.M0(p0));
       }
       return oi3.e();
    }
    public static i3 b(FilterOption p0){
       i3 obj = PatchProxy.applyOneRefs(p0, null, k.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i3.f();
       obj.d("option_name", p0.mName);
       obj.d("option_displayText", p0.mDisplayText);
       return obj;
    }
    public static String c(FilterOption p0){
       JSONObject obj = PatchProxy.applyOneRefs(p0, null, k.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new JSONObject();
          JSONArray jSONArray = new JSONArray();
          jSONArray.put(p0.mName);
          obj.put("filter_option", jSONArray);
       }catch(org.json.JSONException e3){
          c.e(KsLogFollowTag.FOLLOW_STAGGER.appendTag("StaggerLogger"), "jsonException", e3);
       }
       return obj.toString();
    }
    public static void d(e0 p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), null, k.class, "26")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "RECOMMEND_AUTHOR_AGGR_ENTRANCE";
       i3 oi3 = i3.f();
       oi3.c("author_num", Integer.valueOf(p1));
       oi3.c("click_area", Integer.valueOf(p2));
       oi3.c("index", Integer.valueOf(p3));
       uElementPack.params = oi3.toString();
       u1.M("", p0, 6, uElementPack, null, null);
       return;
    }
    public static void e(e0 p0,int p1,String p2,int p3){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, Integer.valueOf(p3), null, k.class, "27")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "RECOMMEND_AUTHOR_CARD";
       i3 oi3 = i3.f();
       oi3.c("click_area", Integer.valueOf(p1));
       uElementPack.params = oi3.toString();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
       userPackage.identity = p2;
       userPackage.index = p3;
       uContentPack.userPackage = userPackage;
       u1.M("", p0, 6, uElementPack, uContentPack, null);
       return;
    }
    public static void f(List p0,e0 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, k.class, "5")) {
          return;
       }
       if (q.f(p0)) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          FilterBox uFilterBox = iterator.next();
          if (uFilterBox != null && !q.f(uFilterBox.mOptions)) {
             Iterator iterator1 = uFilterBox.mOptions.iterator();
             while (iterator1.hasNext()) {
                f3 uof3 = f3.l("2923766", "FOLLOW_TOP_BAR_FILTER_OPTION_BTN");
                uof3.n(6);
                uof3.m(k.b(iterator1.next()).e());
                uof3.h(p1);
             }
          }
       }
       return;
    }
    public static void g(e0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, k.class, "23")) {
          return;
       }
       f3.l("", "PULL_UP_TO_END_PAGE").h(p0);
       return;
    }
    public static void h(int p0,e0 p1){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, null, ok, "22")) {
          return;
       }
       f3 uof3 = f3.l("", "PULL_UP_TO_END_FEEDS");
       i3 oi3 = i3.f();
       oi3.c("max_index", Integer.valueOf(p0));
       uof3.m(oi3.e());
       uof3.h(p1);
       return;
    }
    public static void i(BaseFeed p0,String p1,int p2){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, k.class, "2")) {
          return;
       }
       Object obj = p0.a(RealtimeMeta.class);
       if (obj == null) {
          return;
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(p0);
       h oh = h.m("2631996", "FOLLOW_ENTRY_CARD");
       oh.n(k.a(p0, obj, p1, p2, obj.mPhotos, obj.mUserAvatars));
       oh.c(uContentPack);
       oh.h();
       return;
    }
    public static void j(e0 p0,String p1,int p2){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, k.class, "29")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "RECOMMEND_AUTHOR_CARD";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
       userPackage.identity = p1;
       userPackage.index = p2;
       uContentPack.userPackage = userPackage;
       u1.B0(new ShowMetaData().setLogPage(p0).setType(8).setElementPackage(uElementPack).setContentPackage(uContentPack));
       return;
    }
}
