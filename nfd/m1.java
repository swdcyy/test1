package nfd.m1;
import java.lang.Object;
import wkd.b;
import t8d.a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import sy5.a;
import k2b.e0;
import com.yxcorp.plugin.search.homepage.module.history.SearchHistoryData;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.plugin.search.result.SearchKeywordContext;
import com.search.common.entity.SearchBaseItem;
import com.yxcorp.plugin.search.result.SearchTabEntity;
import com.yxcorp.plugin.search.entity.SearchHistoryItem;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.google.gson.JsonObject;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import fbd.j;
import gbd.i;
import com.yxcorp.gifshow.plugin.impl.search.BannerItemEntity;
import l9d.c;
import l9d.b;
import ok.x;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import gbd.d;
import com.yxcorp.plugin.search.entity.SearchHotTagItem;
import com.yxcorp.plugin.search.entity.IconEntity;
import k2b.l0;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserExtraInfo;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import q2b.h$b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import acd.c;
import com.yxcorp.plugin.search.entity.SuggestItem;
import com.yxcorp.plugin.search.entity.SuggestKeywordItem;
import com.yxcorp.plugin.search.entity.SuggestTagEntity;
import java.lang.Number;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import q7d.j0;
import com.yxcorp.plugin.search.utils.j0;
import com.kwai.framework.model.live.LiveTipInfo;
import com.kwai.framework.model.user.User$FollowStatus;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.yxcorp.plugin.search.SearchPage;

public class m1	// class@001dcf
{
    public static final a a;

    static {
       m1.a = b.a(-958410096);
    }
    public void m1(){
       super();
    }
    public static String a(String p0,int p1,int p2,String p3,int p4,long p5,boolean p6){
       a obj;
       m1 om1 = m1.class;
       if (PatchProxy.isSupport(om1)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,Integer.valueOf(p4),Long.valueOf(p5),Boolean.valueOf(p6)};
          obj = PatchProxy.apply(objArray, null, om1, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = a.k();
       obj.e("tab_name", p0).a("tab_pos", p1).a("tab_id", p2);
       if (!p6) {
          obj.b("subtab_id", p5).e("subtab_name", p3).a("subtab_pos", p4);
       }
       return obj.i();
    }
    public static a b(String p0,int p1,String p2){
       if (PatchProxy.isSupport(m1.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, null, m1.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return a.k().e("list_id", p0).a("rank", p1).e("name", p2);
    }
    public static void c(int p0,e0 p1,SearchHistoryData p2,String p3,String p4){
       a a;
       m1 om1 = m1.class;
       if (PatchProxy.isSupport(om1)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, om1, "2")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = p4;
       a uoa = a.k().e("list_id", p3);
       if (p2 != null) {
          uoa.e("name", SearchKeywordContext.getEncryptedMobile(p2.mSearchWord)).a("rank", p2.mPosition);
          a = m1.a;
          if (a.a(p2.mSearchWord) != null) {
             uoa.a("source_tab", a.a(p2.mSearchWord).mId);
          }
          SearchHistoryData mSearchHisto = p2.mSearchHistoryItem;
          if (mSearchHisto != null && !TextUtils.x(mSearchHisto.mKeywordLabel)) {
             uoa.e("label", p2.mSearchHistoryItem.mKeywordLabel);
          }
       }
    label_007a :
       uElementPack.params = a.k().d("keyword", uoa.j()).i();
       i.j(p0, p1, uElementPack, j.a("HISTORY_KEYWORD"));
       return;
    }
    public static void d(boolean p0,e0 p1,BannerItemEntity p2,c p3,b p4,boolean p5,String p6){
       object oobject = p2;
       object oobject1 = p3;
       object oobject2 = p4;
       object oobject3 = p6;
       m1 om1 = m1.class;
       if (PatchProxy.isSupport(om1)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),p1,oobject,oobject1,oobject2,Boolean.valueOf(p5),oobject3};
          if (PatchProxy.applyVoid(objArray, null, om1, "18")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "BANNER_CARD";
       uElementPack.params = a.k().a("id", oobject.mBannerId).e("type", "BANNER").e("name", oobject.mPromotion).e("list_id", oobject3).i();
       ClientEvent$AreaPackage uAreaPackage = i.a("HOME_TAB");
       uAreaPackage.params = m1.a(oobject1.a, (oobject1.c + 1), oobject1.b, oobject2.c.get(), (oobject2.b.get().intValue() + 1), oobject2.d.get().longValue(), p5);
       i.k((p0 ^ 0x01), p1, uElementPack, uAreaPackage, null, null);
       return;
    }
    public static void e(int p0,e0 p1,String p2,int p3,String p4){
       m1 om1 = m1.class;
       if (PatchProxy.isSupport(om1)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, null, om1, "22")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = p2;
       a uoa = a.k();
       uoa.e("type", p4);
       if (p3 != -1) {
          uoa.a("id", p3);
       }
       uElementPack.params = uoa.i();
       i.j(p0, p1, uElementPack, j.a("SEARCH_BAR"));
       return;
    }
    public static void f(int p0,e0 p1,String p2,String p3,String p4){
       m1 om1 = m1.class;
       if (PatchProxy.isSupport(om1)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, om1, "21")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       a uoa = a.k();
       uoa.e("task_id", p4);
       uElementPack.action2 = p2;
       d uod = d.r();
       uod.l(uoa.j());
       uod.s();
       uElementPack.params = a.k().e("type", p3).h(uod.f()).i();
       i.j(p0, p1, uElementPack, j.a(""));
       return;
    }
    public static void g(int p0,e0 p1,String p2,String p3,String p4){
       m1 om1 = m1.class;
       if (PatchProxy.isSupport(om1)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, om1, "11")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "TAB";
       a uoa = a.k();
       if (!TextUtils.x(p2)) {
          uoa.e("tab_name", p2);
       }
       if (!TextUtils.x(p3)) {
          uoa.e("tab_id", p3);
       }
       uElementPack.params = uoa.i();
       i.j(p0, p1, uElementPack, j.a(p4));
       return;
    }
    public static void h(int p0,e0 p1,String p2,JsonObject p3){
       if (PatchProxy.isSupport(m1.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, null, m1.class, "28")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       a uoa = a.k();
       uElementPack.action2 = p2;
       if (p3 != null) {
          uoa.h(p3);
       }
       uElementPack.params = uoa.i();
       i.j(p0, p1, uElementPack, null);
       return;
    }
    public static void i(int p0,e0 p1,SearchHotTagItem p2,boolean p3,String p4){
       String str;
       int i;
       m1 om1 = m1.class;
       ClientContent$ContentPackage uContentPack = null;
       if (PatchProxy.isSupport(om1)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,Boolean.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, uContentPack, om1, "7")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "KEYWORD";
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(om1)) {
          str = PatchProxy.applyTwoRefs(p2, Boolean.valueOf(p3), uContentPack, om1, "8");
          if (str != patchProxyRe) {
          label_00c8 :
             uElementPack.params = str;
             SearchBaseItem mKsOrderId = p2.mKsOrderId;
             if (!TextUtils.x(mKsOrderId)) {
                uContentPack = l0.b(mKsOrderId);
             }
             i.k(p0, p1, uElementPack, j.a(p4), uContentPack, p2.mSessionId);
             return;
          }
       }
       i = -1;
       a uoa = m1.b(p2.mSessionId, (p2.mPosition + i), p2.mKeyword).e("id", p2.mId);
       if (p3) {
          uoa.a("pos", p2.mPosition);
       }
       SearchHotTagItem mIcon = p2.mIcon;
       if (mIcon != null) {
          uoa.e("label", mIcon.mIconText);
       }
       mIcon = p2.mNormalIndex;
       if (mIcon != i) {
          uoa.a("normalindex", mIcon);
       }
       JsonObject jsonObject = PatchProxy.applyOneRefs(p2, uContentPack, om1, "9");
       if (jsonObject != patchProxyRe) {
       }else {
          a uoa1 = a.k().b("hot_value", p2.mHotValue).a("type", p2.mHotWordType);
          if (p2.mIsShowEmoji != null) {
             uoa1.a("is_emoji", (TextUtils.x(p2.mEmoji) ^ 1));
          }
          jsonObject = uoa1.j();
       }
       uoa.d("params", jsonObject);
       str = a.k().d("keyword", uoa.j()).i();
       goto label_00c8 ;
    }
    public static void j(e0 p0,int p1){
       m1 om1 = m1.class;
       if (PatchProxy.isSupport(om1) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, om1, "26")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "TOAST_CARD";
       i.j(p1, p0, uElementPack, j.a("SEARCH_BAR"));
       return;
    }
    public static void k(boolean p0,e0 p1,User p2,String p3){
       if (PatchProxy.isSupport(m1.class) && PatchProxy.applyVoidFourRefs(Boolean.valueOf(p0), p1, p2, p3, null, m1.class, "20")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "USER_RECO_CARD";
       a uoa = a.k();
       String str = (p2.mIsLiving != null)? "TRUE": "FALSE";
       int i = 1;
       uoa = uoa.e("live_status", str).a("portal", i);
       User mExtraInfo = p2.mExtraInfo;
       int i1 = (mExtraInfo == null)? 0: mExtraInfo.mRecommendReasonValue;
       uElementPack.params = uoa.a("reason_value", i1).e("click_area", p3).i();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
       userPackage.index = p2.mPosition + i;
       userPackage.identity = p2.getId();
       uContentPack.userPackage = userPackage;
       i.k((p0 ^ 0x01), p1, uElementPack, j.a("USER_RECO_LIST"), uContentPack, null);
       return;
    }
    public static void l(e0 p0,String p1,int p2,String p3){
       if (PatchProxy.isSupport(m1.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, null, m1.class, "25")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "SLIDE_HOTLIST";
       uElementPack.params = a.k().e("list_id", p3).e("tab_name", p1).a("tab_id", p2).i();
       h$b uob = h$b.e(7, "SLIDE_HOTLIST");
       uob.k(uElementPack);
       j.i(p0, uob);
       return;
    }
    public static void m(e0 p0,String p1,String p2,String p3,int p4,String p5,String p6){
       m1 om1 = m1.class;
       if (PatchProxy.isSupport(om1)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4),p5,p6};
          if (PatchProxy.applyVoid(objArray, null, om1, "12")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = p1;
       a uoa = a.k().e("list_id", p2).e("list_id", p2).e("name", SearchKeywordContext.getEncryptedMobile(p3));
       if (p4 >= 0) {
          uoa.a("rank", p4);
       }
       uElementPack.params = a.k().d("keyword", uoa.j()).d("params", a.k().e("search_type", p5).j()).i();
       i.k(1, p0, uElementPack, j.a("SEARCH_BAR"), i.b(p6, null), null);
       return;
    }
    public static void n(BaseFragment p0,c p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, m1.class, "19")) {
          return;
       }
       m1.g(1, p0, p1.getTitle(), String.valueOf(p1.getModuleId()), p2);
       return;
    }
    public static void o(int p0,e0 p1,SuggestItem p2,String p3,int p4,boolean p5,boolean p6){
       SuggestItem mUser;
       object oobject = p2;
       object oobject1 = p3;
       m1 om1 = m1.class;
       ClientContent$ContentPackage uContentPack = null;
       int i = 1;
       if (PatchProxy.isSupport(om1)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,oobject,oobject1,Integer.valueOf(p4),Boolean.valueOf(p5),Boolean.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, uContentPack, om1, "4")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = oobject1;
       a uoa = a.k().e("list_id", oobject.mSessionId).a("rank", p4);
       JsonObject jsonObject = new JsonObject();
       jsonObject.H("is_highlight", Boolean.valueOf(oobject.mIsHighLight));
       String str = "keyword";
       if (p6) {
          SuggestItem mKeywordItem = oobject.mKeywordItem;
          if (mKeywordItem != null && mKeywordItem.mSugTag != null) {
             JsonObject jsonObject1 = new JsonObject();
             SuggestKeywordItem mSugTag = oobject.mKeywordItem.mSugTag;
             SuggestTagEntity mDirectText = mSugTag.mDirectText;
             SuggestTagEntity mDirectType = mSugTag.mDirectType;
             if (!TextUtils.x(mDirectText)) {
                jsonObject1.c0(str, mDirectText);
             }
             if (!TextUtils.x(mDirectType)) {
                jsonObject1.c0("type", mDirectType);
             }
             jsonObject1.a0("pos", Integer.valueOf(i));
             JsonArray jsonArray = new JsonArray();
             jsonArray.G(jsonObject1);
             jsonObject.G("subtag", jsonArray);
          }
       }
       String str1 = "";
       String str2 = "name";
       if (p5) {
          mUser = oobject.mUser;
          User mName = (mUser != null)? mUser.mName: str1;
          uoa.e(str2, mName);
       }else {
          mUser = oobject.mKeywordItem;
          if (mUser != null) {
             uoa.e(str2, mUser.mKeyWord);
          }
       }
       if (!(p2.getSugText()).equals(str1)) {
          jsonObject.c0("tag", p2.getSugText());
          jsonObject.c0("operation_id", p2.getSugOperationId());
       }
       uoa.d("sug_params", jsonObject);
       uoa = a.k().d(str, uoa.j());
       SuggestItem mUserItem = oobject.mUserItem;
       str1 = "ext_params";
       if (mUserItem != null && !TextUtils.x(mUserItem.mExtParams)) {
          uoa.e(str1, oobject.mUserItem.mExtParams);
       }else {
          mUserItem = oobject.mKeywordItem;
          if (mUserItem != null && !TextUtils.x(mUserItem.mExtParams)) {
             uoa.e(str1, oobject.mKeywordItem.mExtParams);
          }
       }
       uElementPack.params = uoa.i();
       if (!PatchProxy.isSupport(om1) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, uElementPack, p2, null, m1.class, "5")) {
          SuggestItem mKeywordItem1 = oobject.mKeywordItem;
          if (mKeywordItem1 != null) {
             uContentPack = i.b(mKeywordItem1.mKsOrderId, uContentPack);
          }
          i.k(p0, p1, uElementPack, j.a("SUGGESTION"), uContentPack, null);
       }
       return;
    }
    public static void p(int p0,e0 p1,String p2,SuggestItem p3,int p4,String p5){
       m1 om1 = m1.class;
       if (PatchProxy.isSupport(om1)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,Integer.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, null, om1, "6")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = p2;
       a uoa = m1.b(p3.mSessionId, p4, "").e("card_id", p3.mUser.getId()).e("card_type", "USER");
       a uoa1 = a.k();
       SuggestItem mUser = p3.mUser;
       if (mUser.mLiveTipInfo != null && !j0.u(mUser)) {
          uoa1.e("label", "USER_LIVE").e("label_id", p3.mUser.mLiveTipInfo.mLiveStreamId);
       }
       if (!TextUtils.x(p5)) {
          uoa1.e("user_sug", p5);
       }
       SuggestItem mUserItem = p3.mUserItem;
       if (mUserItem != null) {
          j0 mSugTag = mUserItem.mSugTag;
          if (mSugTag != null) {
             uoa1.e("tag", mSugTag.mSugText);
             uoa1.e("operation_id", p3.mUserItem.mSugTag.mOperationId);
          }
       }
       mUserItem = p3.mUserItem;
       if (mUserItem != null && !TextUtils.x(mUserItem.mExtParams)) {
          uoa.e("ext_params", p3.mUserItem.mExtParams);
       }
       mUserItem = p3.mUser;
       if (mUserItem != null && mUserItem.mFollowStatus == User$FollowStatus.FOLLOWING) {
          uoa1.f("is_follow", 1);
       }
       uoa1.f("is_highlight", p3.mIsHighLight);
       uoa.d("card_params", uoa1.j());
       uElementPack.params = uoa.i();
       i.l(p0, p1, uElementPack, j.a("SUGGESTION"), null, p3.mSessionId, p3.getSuggestFeedLogCtx());
       return;
    }
    public static void q(SearchPage p0){
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, null, m1.class, "13")) {
          return;
       }
       p0 = (p0 != null)? p0.mLogName: "FocusSearchBox";
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.name = p0;
       uElementPack.type = 8;
       uElementPack.action = 987;
       j.d(1, uElementPack, null);
       return;
    }
}
