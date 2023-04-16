package nfd.q1;
import java.lang.Object;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.plugin.search.entity.SearchItem;
import java.lang.String;
import com.google.gson.JsonObject;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import gbd.t;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.util.List;
import java.util.Iterator;
import com.yxcorp.plugin.search.entity.SearchItem$SearchItemType;
import com.yxcorp.plugin.search.entity.kbox.KBoxItem;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateUserFeed;
import nfd.g;
import com.kwai.framework.model.user.User;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateMusicFeed;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateBaseFeed;
import com.yxcorp.plugin.search.entity.template.base.JCAladdinFeed;
import com.yxcorp.plugin.search.entity.kbox.KBoxObjectModel;
import java.lang.Boolean;
import e7d.h;
import com.yxcorp.plugin.search.SearchPage;
import com.yxcorp.plugin.search.entity.kbox.KBoxRealLog;
import java.lang.Number;
import e7d.a;
import ecd.b;
import ecd.d;
import sy5.a;
import java.util.Map;
import com.search.common.entity.SearchBaseItem;
import com.yxcorp.plugin.search.entity.template.base.JCAladdinModel;
import nfd.p;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateIcon;
import com.kwai.framework.model.user.UserHeadIcon;
import gbd.c;
import gbd.d;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Collection;
import ekd.q;
import com.yxcorp.plugin.search.entity.SearchPOITabItem;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateCollectionFeed;
import com.yxcorp.plugin.search.entity.result.SearchCollectionItem;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateMeta;
import com.yxcorp.plugin.search.entity.TemplateText;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateCommodityFeed;
import com.yxcorp.plugin.search.response.SearchCommodityItem;
import com.yxcorp.plugin.search.response.SearchGoodsInfo;
import com.google.gson.JsonArray;
import com.yxcorp.plugin.search.response.SearchGoodsInfo$AttractionTag;
import com.google.gson.JsonElement;
import java.lang.StringBuilder;

public class q1	// class@001df5
{

    public void q1(){
       super();
    }
    public static void A(int p0,BaseFragment p1,SearchItem p2,String p3,JsonObject p4,JsonObject p5){
       q1 oq1 = q1.class;
       if (PatchProxy.isSupport(oq1)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,null,p5};
          if (PatchProxy.applyVoid(objArray, null, oq1, "11")) {
             return;
          }
       }
       q1.u(p0, p1, p2, q1.g(p2, p3, null, p5, q1.a(p2)));
       return;
    }
    public static void B(int p0,BaseFragment p1,SearchItem p2,String p3,JsonObject p4,JsonObject p5,JsonObject p6){
       q1 oq1 = q1.class;
       if (PatchProxy.isSupport(oq1)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,null,p5,p6};
          if (PatchProxy.applyVoid(objArray, null, oq1, "13")) {
             return;
          }
       }
       t.n(p0, p1, q1.g(p2, p3, null, p5, p6), t.a(p1, "ALADDIN", p2), p2);
       return;
    }
    public static void C(int p0,BaseFragment p1,SearchItem p2,ClientEvent$ElementPackage p3,FeedLogCtx p4){
       q1 oq1 = q1.class;
       if (PatchProxy.isSupport(oq1)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, oq1, "5")) {
             return;
          }
       }
       t.m(p0, p1, p3, t.a(p1, "ALADDIN", p2), null, p2, p4);
       return;
    }
    public static void D(int p0,BaseFragment p1,SearchItem p2,String p3,JsonObject p4,JsonObject p5,JsonObject p6,FeedLogCtx p7){
       object oobject;
       q1 oq1 = q1.class;
       if (PatchProxy.isSupport(oq1)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,oobject,p5,p6,p7};
          oobject = null;
          if (PatchProxy.applyVoid(objArray, oobject, oq1, "14")) {
             return;
          }
       }
       q1.F(p0, p1, p2, p3, null, p5, p6, p7, "ALADDIN");
       return;
    }
    public static void E(int p0,BaseFragment p1,SearchItem p2,String p3,JsonObject p4,JsonObject p5,FeedLogCtx p6){
       q1 oq1 = q1.class;
       if (PatchProxy.isSupport(oq1)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,null,p5,p6};
          if (PatchProxy.applyVoid(objArray, null, oq1, "12")) {
             return;
          }
       }
       t.o(p0, p1, q1.g(p2, p3, null, p5, q1.a(p2)), t.a(p1, "ALADDIN", p2), p2, p6);
       return;
    }
    public static void F(int p0,BaseFragment p1,SearchItem p2,String p3,JsonObject p4,JsonObject p5,JsonObject p6,FeedLogCtx p7,String p8){
       q1 oq1 = q1.class;
       if (PatchProxy.isSupport(oq1)) {
          Object[] objArray = new Object[9];
          objArray[0] = Integer.valueOf(p0);
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          if (PatchProxy.applyVoid(objArray, null, oq1, "15")) {
             return;
          }
       }
       t.o(p0, p1, q1.g(p2, p3, p4, p5, p6), t.a(p1, p8, p2), p2, p7);
       return;
    }
    public static void G(List p0,BaseFragment p1){
       KBoxItem mType;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, q1.class, "37")) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          SearchItem searchItem = iterator.next();
          SearchItem mItemType = searchItem.mItemType;
          SearchItem$SearchItemType kBOX = SearchItem$SearchItemType.KBOX;
          if (mItemType == kBOX) {
             if (mItemType == kBOX) {
                if (!searchItem.weakStyleKbox()) {
                   mType = searchItem.mKBoxItem.mType;
                   if (mType != 2 && (mType != 27 && (mType != 28 && (mType == 98 || mType == 36)))) {
                      continue ;
                   }
                }
             }
             Object obj = PatchProxy.applyTwoRefs(searchItem, p1, null, q1.class, "39");
             if (obj != PatchProxyResult.class) {
             }else {
                mItemType = searchItem.mKBoxItem;
                if (mItemType != null) {
                   KBoxItem mType1 = mItemType.mType;
                   if (mType1 == 1) {
                      obj = q1.m(searchItem, 0, true, false, "", false);
                   }else if(mType1 == 4){
                      if (g.c(searchItem).mUser.mLiveTipInfo != null) {
                         q1.I(0, p1, searchItem, g.c(searchItem), true, "BASE_LIVE_PENDANT_SUBCARD");
                      }
                      obj = q1.n(searchItem, g.c(searchItem), 0, "BASE_SUBCARD");
                   }else if(mType1 == 5){
                      obj = q1.e(searchItem, g.b(searchItem), "BASE_SUBCARD", null);
                   }else if(mType1 == 6){
                      obj = q1.e(searchItem, g.a(searchItem), searchItem.mKBoxItem.getAction2(""), null);
                   }else {
                      int i = 12;
                      if (mType1 == i) {
                         if (mType1 == i) {
                            mType = mItemType.mBaseFeed;
                            if (mType instanceof JCAladdinFeed) {
                            label_00bf :
                               obj = q1.e(searchItem, mType, "BASE_SUBCARD", null);
                            }
                         }
                         mType = null;
                         goto label_00bf ;
                      }else if(mType1 == 23){
                         mType1 = mItemType.mKboxModel;
                         obj = q1.d(searchItem, mType1, "APPOINT_SUBCARD", null, null, mType1.getExtParamsObject());
                      }
                   }
                }
                obj = null;
             }
             q1.C(0, p1, searchItem, obj, q1.q(searchItem));
          }
       }
       return;
    }
    public static void H(SearchItem p0,int p1,boolean p2,boolean p3,boolean p4,String p5,BaseFragment p6){
       q1 oq1 = q1.class;
       if (PatchProxy.isSupport(oq1)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Boolean.valueOf(p2),Boolean.valueOf(p3),Boolean.valueOf(p4),p5,p6};
          if (PatchProxy.applyVoid(objArray, null, oq1, "1")) {
             return;
          }
       }
       t.n(p1, p6, q1.m(p0, p1, p2, p3, p5, p4), t.a(p6, "ALADDIN", p0), p0);
       return;
    }
    public static void I(int p0,BaseFragment p1,SearchItem p2,TemplateUserFeed p3,boolean p4,String p5){
       q1 oq1 = q1.class;
       if (PatchProxy.isSupport(oq1)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,Boolean.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, null, oq1, "24")) {
             return;
          }
       }
       q1.C(p0, p1, p2, q1.n(p2, p3, p4, p5), p3.getFeedLogCtx());
       return;
    }
    public static void J(int p0,BaseFragment p1,SearchItem p2,TemplateUserFeed p3,boolean p4,String p5,JsonObject p6,JsonObject p7){
       object oobject;
       q1 oq1 = q1.class;
       if (PatchProxy.isSupport(oq1)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,Boolean.valueOf(p4),p5,oobject,p7};
          oobject = null;
          if (PatchProxy.applyVoid(objArray, oobject, oq1, "25")) {
             return;
          }
       }
       q1.C(p0, p1, p2, q1.o(p2, p3, p4, p5, null, p7), p3.getFeedLogCtx());
       return;
    }
    public static void K(h p0,SearchPage p1,String p2,int p3,KBoxRealLog p4){
       q1 oq1 = q1.class;
       if (PatchProxy.isSupport(oq1)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, null, oq1, "36")) {
             return;
          }
       }
       JsonObject jsonObject = new JsonObject();
       jsonObject.a0("kboxType", Integer.valueOf(p3));
       if (p4 != null) {
          jsonObject.c0("templateId", p4.mTemplateId);
          jsonObject.c0("bizId", p4.mBizId);
          jsonObject.c0("templateName", p4.mTemplateName);
       }
       if (p0 != null && p0.d() instanceof b) {
          d.b(p0.d(), p2, jsonObject);
       }
       return;
    }
    public static JsonObject a(SearchItem p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, q1.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return q1.b(p0, null);
    }
    public static JsonObject b(SearchItem p0,TemplateBaseFeed p1){
       UserHeadIcon mHeadIconNam;
       String pendantUrlFo;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       UserHeadIcon userHeadIcon = null;
       a obj = PatchProxy.applyTwoRefs(p0, p1, userHeadIcon, q1.class, "30");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (p0 == null) {
          return new JsonObject();
       }
       obj = a.k();
       SearchItem mRealLog = p0.mRealLog;
       if (mRealLog != null) {
          obj.e("biz_id", mRealLog.mBizId);
          if (p0.mRealLog.mExtendParams != null) {
             obj.d("extend_params", a.k().g(p0.mRealLog.mExtendParams).j());
          }
       }
       obj.e("search_session_id", p0.mSessionId);
       if (p1 instanceof JCAladdinFeed) {
          obj.e("kg_id", p1.mModel.mKgId);
          obj.a("kg_card_type", p1.mModel.mTagCardType);
       }
       JsonObject jsonObject = obj.j();
       Object obj1 = PatchProxy.applyTwoRefs(p0, jsonObject, userHeadIcon, p.class, "9");
       if (obj1 != patchProxyRe) {
          jsonObject = obj1;
       }else {
          p0 = p0.mKBoxItem;
          if (p0 != null) {
             KBoxItem mBaseFeed = p0.mBaseFeed;
             if (mBaseFeed instanceof JCAladdinFeed) {
                JCAladdinFeed mModel = mBaseFeed.mModel;
                if (mModel != null) {
                   JCAladdinModel mLeftIcon = mModel.mLeftIcon;
                   if (mLeftIcon != null) {
                      TemplateIcon mHeadIcon = mLeftIcon.mHeadIcon;
                      if (mHeadIcon != null) {
                         mHeadIconNam = mHeadIcon.mHeadIconName;
                      }else if(mBaseFeed.isShowMoodPendantForJcTemplate()){
                         mHeadIconNam = "feeling";
                      }else {
                      label_0097 :
                         pendantUrlFo = mBaseFeed.getPendantUrlForJcTemplate();
                      label_009d :
                         p.a(userHeadIcon, pendantUrlFo, jsonObject);
                      }
                      userHeadIcon = mHeadIconNam;
                      goto label_0097 ;
                   }
                }
             }
          }
          pendantUrlFo = userHeadIcon;
          goto label_009d ;
       }
       return jsonObject;
    }
    public static ClientEvent$ElementPackage c(SearchItem p0,String p1,String p2,String p3){
       KBoxRealLog mTemplateId;
       d obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, q1.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c.f().c();
       obj.k(p3);
       obj.q(p2);
       obj.w("COMMON");
       obj.s();
       JsonObject jsonObject = obj.f();
       a uoa = a.k();
       SearchItem mRealLog = p0.mRealLog;
       if (mRealLog != null && !TextUtils.x(mRealLog.mBizId)) {
          uoa.e("biz_id", p0.mRealLog.mBizId);
       }
       uoa.e("search_session_id", p0.mSessionId);
       obj = c.f().e();
       obj.l(uoa.j());
       SearchItem mRealLog1 = p0.mRealLog;
       String str = "";
       mRealLog1 = (mRealLog1 == null)? str: mRealLog1.mTemplateId;
       obj.k(mRealLog1);
       mRealLog1 = p0.mRealLog;
       if (mRealLog1 != null) {
          str = mRealLog1.mTemplateName;
       }
       obj.w(str);
       obj.u(p0.mRank);
       obj.t(p0.mPosition);
       d uod = d.r();
       uod.a(p1);
       uod.h(q1.p(p0).e().h(obj.f()).h(jsonObject).i());
       return uod.d();
    }
    public static ClientEvent$ElementPackage d(SearchItem p0,KBoxObjectModel p1,String p2,JsonObject p3,JsonObject p4,JsonObject p5){
       d uod;
       q1 oq1 = q1.class;
       if (PatchProxy.isSupport(oq1)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          Object obj = PatchProxy.apply(objArray, null, oq1, "22");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p3 == null && p1 != null) {
          uod = c.f().c();
          uod.k(p1.getItemId());
          uod.w(p1.getItemType());
          uod.s();
          uod = uod.f();
       }
       d uod1 = q1.p(p0);
       uod1.l(a.k().h(q1.a(p0)).h(p5).j());
       d uod2 = d.r();
       uod2.a(p2);
       uod2.h(uod1.e().h(uod).h(p4).i());
       return uod2.d();
    }
    public static ClientEvent$ElementPackage e(SearchItem p0,TemplateBaseFeed p1,String p2,JsonObject p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, q1.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return q1.f(p0, p1, p2, p3, q1.b(p0, p1), null);
    }
    public static ClientEvent$ElementPackage f(SearchItem p0,TemplateBaseFeed p1,String p2,JsonObject p3,JsonObject p4,JsonObject p5){
       q1 oq1 = q1.class;
       if (PatchProxy.isSupport(oq1)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          Object obj = PatchProxy.apply(objArray, null, oq1, "19");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0.mRealLog == null) {
          return null;
       }else {
          JsonObject jsonObject = q1.i(p1, p5).f();
          p5 = q1.a(p0);
          if (p4 != null) {
             p5 = a.k().h(p4).h(q1.a(p0)).j();
          }
          d uod = q1.p(p0);
          uod.l(p5);
          d uod1 = d.r();
          uod1.a(p2);
          uod1.h(uod.e().h(jsonObject).h(p3).i());
          return uod1.d();
       }
    }
    public static ClientEvent$ElementPackage g(SearchItem p0,String p1,JsonObject p2,JsonObject p3,JsonObject p4){
       q1 oq1 = q1.class;
       if (PatchProxy.isSupport(oq1)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, null, oq1, "17");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0.mRealLog == null) {
          return null;
       }else if(p4 != null){
          p4 = a.k().h(p4).h(q1.a(p0)).j();
       }else {
          p4 = q1.a(p0);
       }
       d uod = q1.p(p0);
       uod.l(p4);
       d uod1 = d.r();
       uod1.a(p1);
       uod1.h(uod.e().h(p3).h(p2).i());
       return uod1.d();
    }
    public static JsonObject h(String p0){
       d obj = PatchProxy.applyOneRefs(p0, null, q1.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c.f().c();
       obj.k(p0);
       obj.w("USER");
       obj.s();
       return obj.f();
    }
    public static d i(TemplateBaseFeed p0,JsonObject p1){
       d obj = PatchProxy.applyTwoRefs(p0, p1, null, q1.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c.f().c();
       obj.k(p0.getItemId());
       obj.w(p0.getItemType());
       obj.t(p0.getPosition());
       obj.v(p0.getSubType());
       obj.c(p0.getAuthorId());
       obj.q(p0.getItemName());
       obj.l(p1);
       obj.s();
       if (p0 instanceof TemplateMusicFeed) {
          obj.n("music_id", p0.getMusicId());
       }
       return obj;
    }
    public static JsonObject j(String p0,String p1,int p2){
       d obj;
       if (PatchProxy.isSupport(q1.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, q1.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = c.f().c();
       obj.k(p0);
       obj.w("LIVE");
       obj.c(p1);
       obj.t(p2);
       obj.s();
       return obj.f();
    }
    public static ClientEvent$ElementPackage k(SearchItem p0,KBoxObjectModel p1,String p2,JsonObject p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, q1.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return q1.d(p0, p1, p2, null, p3, null);
    }
    public static JsonObject l(SearchItem p0,TemplateBaseFeed p1,int p2,String p3){
       d obj;
       if (PatchProxy.isSupport(q1.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), p3, null, q1.class, "31");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = c.f().c();
       if (p3.equals("TAB")) {
          if (p0 != null) {
             SearchItem mKBoxItem = p0.mKBoxItem;
             if (mKBoxItem != null && mKBoxItem.mKboxModel != null) {
                obj.t((p2 + 1));
                if (!q.f(p0.mKBoxItem.mKboxModel.mTabs) && p0.mKBoxItem.mKboxModel.mTabs.get(p2) != null) {
                   obj.q(p0.mKBoxItem.mKboxModel.mTabs.get(p2).mTabName);
                   obj.k(String.valueOf(p0.mKBoxItem.mKboxModel.mTabs.get(p2).mTabId));
                }
             }
          }
          return null;
       }else if(p3.equals("TITLE")){
          if (p0 != null) {
             p0 = p0.mKBoxItem;
             if (p0 != null) {
                KBoxItem mKboxModel = p0.mKboxModel;
                if (mKboxModel != null) {
                   obj.q(mKboxModel.mCityName);
                }
             }
          }
          return null;
       }else if(p3.equals("COLLECTION")){
          if (p1 == null || !p1 instanceof TemplateCollectionFeed) {
             return null;
          }else {
             obj.t(p1.getPosition());
             TemplateCollectionFeed mCollectionI = p1.mCollectionItem;
             if (mCollectionI != null) {
                obj.k(mCollectionI.mCollectionId);
             }
          }
       }
       obj.w(p3);
       obj.s();
       return obj.f();
    }
    public static ClientEvent$ElementPackage m(SearchItem p0,int p1,boolean p2,boolean p3,String p4,boolean p5){
       KBoxItem obj1;
       TemplateText mText1;
       String str3;
       q1 oq1 = q1.class;
       int i = 0;
       String obj = null;
       if (PatchProxy.isSupport(oq1)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Boolean.valueOf(p2),Boolean.valueOf(p3),p4,Boolean.valueOf(p5)};
          obj1 = PatchProxy.apply(objArray, obj, oq1, "2");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       if (p5) {
          if (p0.mKBoxBaseItems.get(i).mType == 1) {
             obj1 = p0.mKBoxBaseItems.get(i).mKBoxTitleMeta;
          }else if(p0.mKBoxBaseItems.get(1).mType == 1){
             obj1 = p0.mKBoxBaseItems.get(1).mKBoxTitleMeta;
          }else {
             obj1 = obj;
          }
       }else {
          obj1 = p0.mKBoxItem.mKBoxTitleMeta;
       }
       if (obj1 == null) {
          return obj;
       }else if(p1 == 1){
          TemplateMeta mButton = obj1.mButton;
          if (mButton != null) {
             TemplateIcon mAladdinText = mButton.mAladdinText;
             if (mAladdinText != null) {
                TemplateText mText = mAladdinText.mText;
             label_0088 :
                d uod = c.f().c();
                SearchItem mRealLog = p0.mRealLog;
                obj = "";
                String str = (mRealLog == null)? obj: mRealLog.mBizId;
                uod.k(str);
                String str1 = (p3)? "SUBTITLE": "TITLE";
                uod.w(str1);
                uod.q(mText);
                uod.s();
                JsonObject jsonObject = uod.f();
                a uoa = a.k();
                SearchItem mRealLog1 = p0.mRealLog;
                if (mRealLog1 != null && !TextUtils.x(mRealLog1.mBizId)) {
                   uoa.e("biz_id", p0.mRealLog.mBizId);
                }
                uoa.e("search_session_id", p0.mSessionId);
                d uod1 = q1.p(p0);
                uod1.l(uoa.j());
                if (p1 == 1 && !p2) {
                   TemplateMeta mButton1 = obj1.mButton;
                   if (mButton1.mType != 1) {
                      TemplateIcon mAladdinText1 = mButton1.mAladdinText;
                      if (mAladdinText1 != null) {
                         mText1 = mAladdinText1.mText;
                      }
                   }
                }
                uod1.g(mText1);
                String str2 = uod1.e().h(jsonObject).i();
                d uod2 = d.r();
                if (!p1 || p2) {
                   str3 = (p5)? "HEADLINESMALL_SUBCARD": "HEADLINE_SUBCARD";
                }else if(obj1.mButton.mType == 1){
                   str3 = (p5)? "HEADLINESMALL_MORE_SUBCARD": "HEADLINE_MORE_SUBCARD";
                }else {
                   str3 = "HEADLINE_BUTTON_SUBCARD";
                }
                uod2.a(str3);
                uod2.h(str2);
                return uod2.d();
             }
          }
       }
       if (p3) {
          goto label_0088 ;
       }else {
          p4 = q1.t(obj1);
          goto label_0088 ;
       }
    }
    public static ClientEvent$ElementPackage n(SearchItem p0,TemplateUserFeed p1,boolean p2,String p3){
       TemplateUserFeed obj;
       if (PatchProxy.isSupport(q1.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Boolean.valueOf(p2), p3, null, q1.class, "26");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       JsonObject jsonObject = q1.a(p0);
       if (p1 != null) {
          obj = p1.mUser;
          if (obj != null) {
             p.b(obj, jsonObject);
          }
       }
       return q1.o(p0, p1, p2, p3, null, jsonObject);
    }
    public static ClientEvent$ElementPackage o(SearchItem p0,TemplateUserFeed p1,boolean p2,String p3,JsonObject p4,JsonObject p5){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       q1 oq1 = q1.class;
       Object obj = null;
       if (PatchProxy.isSupport(oq1)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),p3,p4,p5};
          Object obj1 = PatchProxy.apply(objArray, obj, oq1, "27");
          if (obj1 != patchProxyRe) {
             return obj1;
          }
       }
       if (PatchProxy.isSupport(oq1)) {
          String obj2 = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, q1.class, "28");
          if (obj2 != patchProxyRe) {
             obj = obj2;
          }else if(p0 == null || p1 == null){
             d uod2 = c.f().c();
             obj2 = (p2)? p1.getLiveId(): p1.getItemId();
             uod2.k(obj2);
             obj2 = (p2)? "LIVE": "USER";
             uod2.w(obj2);
             String authorId = (p2)? p1.getAuthorId(): "";
             uod2.c(authorId);
             uod2.t(p1.getPosition());
             uod2.s();
             obj = uod2.f();
          }
       }else {
          goto label_004a ;
       }
       d uod = q1.p(p0);
       uod.l(p5);
       d uod1 = d.r();
       uod1.a(p3);
       uod1.h(uod.e().h(obj).h(p4).i());
       return uod1.d();
    }
    public static d p(SearchItem p0){
       d obj = PatchProxy.applyOneRefs(p0, null, q1.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.r();
       SearchItem mRealLog = p0.mRealLog;
       String str = "";
       String str1 = (mRealLog == null)? str: mRealLog.mTemplateId;
       obj.k(str1);
       mRealLog = p0.mRealLog;
       if (mRealLog != null) {
          str = mRealLog.mTemplateName;
       }
       obj.w(str);
       obj.u(p0.mRank);
       obj.t(p0.mPosition);
       return obj;
    }
    public static FeedLogCtx q(SearchItem p0){
       TemplateBaseFeed templateBase;
       FeedLogCtx uFeedLogCtx = null;
       SearchItem obj = PatchProxy.applyOneRefs(p0, uFeedLogCtx, q1.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          obj = p0.mKBoxItem;
          if (obj != null) {
             KBoxItem mType = obj.mType;
             if (mType == 6) {
                templateBase = g.a(p0);
             }else if(mType == 4){
                templateBase = g.c(p0);
             }else {
                templateBase = uFeedLogCtx;
             }
             if (templateBase != null) {
                uFeedLogCtx = templateBase.getFeedLogCtx();
             }
          }
       }
       return uFeedLogCtx;
    }
    public static JsonObject r(TemplateBaseFeed p0){
       Object obj = null;
       JsonObject obj1 = PatchProxy.applyOneRefs(p0, obj, q1.class, "42");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       obj1 = (p0 instanceof TemplateCommodityFeed)? q1.s(p0.mCommodityItem): new JsonObject();
       if (obj1 != null && !TextUtils.x(p0.getTabId())) {
          obj1.c0("kboxtab_id", p0.getTabId());
       }
       return obj1;
    }
    public static JsonObject s(SearchCommodityItem p0){
       SearchGoodsInfo$AttractionTag obj = null;
       SearchCommodityItem obj1 = PatchProxy.applyOneRefs(p0, obj, q1.class, "41");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 != null) {
          obj1 = p0.mGoodsInfo;
          if (obj1 != null && !q.f(obj1.mAttractionTags)) {
             JsonArray jsonArray = new JsonArray();
             Iterator iterator = p0.mGoodsInfo.mAttractionTags.iterator();
             while (iterator.hasNext()) {
                obj = iterator.next();
                if (obj.mIsShow != null) {
                   a uoa = a.k();
                   uoa.a("type", obj.mLogType);
                   uoa.e("text", obj.mText);
                   jsonArray.G(uoa.j());
                }
             }
             a uoa1 = a.k();
             uoa1.c("tag_list", jsonArray);
             return uoa1.j();
          }
       }
       return obj;
    }
    public static String t(TemplateMeta p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, q1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = p.h(p0.mTitleContentType) ^ 0x01;
       int i1 = p.h(p0.mTitleContentName) ^ 0x01;
       String str = "";
       TemplateText mText = (i)? p0.mTitleContentType.mText: str;
       TemplateText mText1 = (i1)? p0.mTitleContentName.mText: str;
       if (!i && !i1) {
          p0 = p0.mDynamicTitle;
          if (p0 != null) {
             str = p0.mText;
          }
          mText1 = str;
       }
       return mText+mText1;
    }
    public static void u(int p0,BaseFragment p1,SearchItem p2,ClientEvent$ElementPackage p3){
       if (PatchProxy.isSupport(q1.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, null, q1.class, "4")) {
          return;
       }
       t.n(p0, p1, p3, t.a(p1, "ALADDIN", p2), p2);
       return;
    }
    public static void v(int p0,BaseFragment p1,SearchItem p2,TemplateBaseFeed p3,String p4){
       q1 oq1 = q1.class;
       if (PatchProxy.isSupport(oq1)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, oq1, "6")) {
             return;
          }
       }
       q1.w(p0, p1, p2, p3, p4, null);
       return;
    }
    public static void w(int p0,BaseFragment p1,SearchItem p2,TemplateBaseFeed p3,String p4,JsonObject p5){
       q1 oq1 = q1.class;
       FeedLogCtx uFeedLogCtx = null;
       if (PatchProxy.isSupport(oq1)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, uFeedLogCtx, oq1, "7")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = q1.e(p2, p3, p4, p5);
       ClientEvent$AreaPackage uAreaPackage = t.a(p1, "ALADDIN", p2);
       if (p3 != null) {
          uFeedLogCtx = p3.getFeedLogCtx();
       }
       t.o(p0, p1, uElementPack, uAreaPackage, p2, uFeedLogCtx);
       return;
    }
    public static void x(int p0,BaseFragment p1,SearchItem p2,TemplateBaseFeed p3,String p4,JsonObject p5,JsonObject p6){
       object oobject;
       q1 oq1 = q1.class;
       if (PatchProxy.isSupport(oq1)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,p4,oobject,p6};
          oobject = null;
          if (PatchProxy.applyVoid(objArray, oobject, oq1, "8")) {
             return;
          }
       }
       q1.y(p0, p1, p2, p3, p4, null, p6, null);
       return;
    }
    public static void y(int p0,BaseFragment p1,SearchItem p2,TemplateBaseFeed p3,String p4,JsonObject p5,JsonObject p6,JsonObject p7){
       q1 oq1 = q1.class;
       Object obj = null;
       if (PatchProxy.isSupport(oq1)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,p4,p5,p6,p7};
          if (PatchProxy.applyVoid(objArray, obj, oq1, "9")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = q1.f(p2, p3, p4, p5, p6, p7);
       ClientEvent$AreaPackage uAreaPackage = t.a(p1, "ALADDIN", p2);
       FeedLogCtx uFeedLogCtx = (p3 != null)? p3.getFeedLogCtx(): obj;
       t.o(p0, p1, uElementPack, uAreaPackage, p2, uFeedLogCtx);
       return;
    }
    public static void z(int p0,BaseFragment p1,SearchItem p2,String p3,JsonObject p4){
       q1 oq1 = q1.class;
       if (PatchProxy.isSupport(oq1)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, oq1, "10")) {
             return;
          }
       }
       q1.A(p0, p1, p2, p3, null, p4);
       return;
    }
}
