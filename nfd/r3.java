package nfd.r3;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.feed.SearchParams;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import da6.c;
import com.kuaishou.android.model.feed.VideoFeed;
import com.kuaishou.android.model.feed.ImageFeed;
import com.kwai.framework.model.user.User;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import e17.i;
import fg6.a;
import com.google.gson.Gson;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import x6d.x;
import com.yxcorp.plugin.search.b;
import t8d.a;
import nfd.y0;
import com.yxcorp.plugin.search.result.SearchKeywordContext;
import com.yxcorp.plugin.search.SearchPage;
import com.yxcorp.plugin.search.result.SearchTabEntity;
import sy5.a;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import h30.a;
import java.util.Map;
import lyb.b;
import java.util.HashMap;
import java.lang.Integer;
import com.google.gson.JsonObject;
import androidx.fragment.app.Fragment;
import yr4.a$a;
import il8.c;
import nfd.j2;
import ekd.q;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Double;
import java.lang.Float;
import java.lang.Long;
import yr4.a$b;
import java.util.Collection;
import com.kwai.framework.model.live.LiveTipInfo;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.kwai.feature.api.live.base.model.LiveAudienceParam$a;
import java.lang.Character;
import android.view.ViewGroup;
import y8c.f;
import android.view.View;
import ekd.p1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ml8.c;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import com.kwai.framework.model.user.UserExtraInfo;
import ekd.t0;
import com.kwai.framework.model.user.UserVerifiedDetail;
import jp.a;
import com.kwai.framework.abtest.f;
import wkd.b;
import com.kwai.framework.perf.phonelevel.d;
import nfd.k2;
import nfd.s1;
import android.net.Uri;
import android.app.Activity;
import com.yxcorp.plugin.search.SearchSource;
import n3d.a;
import x6d.e;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.text.TextUtils;
import android.text.SpannableStringBuilder;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import java.lang.Exception;
import java.util.List;
import java.lang.Short;
import w7d.e;
import w7d.e$a;

public class r3	// class@001dff
{
    public static boolean a;

    public void r3(){
       super();
    }
    public static void A(QPhoto p0,SearchParams p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, r3.class, "30")) {
          return;
       }
       if (p0 != null && p1 != null) {
          QPhoto mEntity = p0.mEntity;
          if (mEntity instanceof LiveStreamFeed) {
             mEntity.putExtra("SEARCH_PARAMS", p1);
             p0.mEntity.f("SEARCH_PARAMS", p1);
          }else if(mEntity instanceof VideoFeed){
             mEntity.putExtra("SEARCH_PARAMS", p1);
          }else if(mEntity instanceof ImageFeed){
             mEntity.putExtra("SEARCH_PARAMS", p1);
          }
          if (p0.getCurrentPosition() < 0) {
             p0.setCurrentPosition(p1.mSearchPosition);
          }
       }
    label_0043 :
       return;
    }
    public static boolean B(User p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, r3.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0.mIsBanned == null) {
          return false;
       }
       i.a(R.style.arg_RES_7f110668, 0x7f104fc8);
       return true;
    }
    public static String C(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, r3.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return "";
       }
       try{
          return a.a.q(p0);
       }catch(java.lang.Exception e3){
          ExceptionHandler.handleCaughtException(e3);
          return obj;
       }
    }
    public static void D(x p0,b p1,a p2){
       SearchKeywordContext mMajorKeywor;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, r3.class, "42")) {
          return;
       }
       if (p0 != null && y0.l()) {
          SearchPage searchPage = null;
          if (p1 != null) {
             p1 = p1.b;
             if (p1 != null) {
                mMajorKeywor = p1.mMajorKeyword;
             label_0022 :
                if (p0.c() != null) {
                   searchPage = p0.c().mTabType;
                }
                p2.b(mMajorKeywor, new SearchTabEntity(p0.d(), searchPage));
             }
          }
          mMajorKeywor = searchPage;
          goto label_0022 ;
       }
       return;
    }
    public static void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, r3.class, "22")) {
          return;
       }
       String str = SystemUtil.m(a.b());
       if (!TextUtils.x(str)) {
          p0.e("imei", str);
       }
       p0.e("oaid", a.d());
       return;
    }
    public static Map b(String p0,Object p1,Map p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, r3.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1 == null) {
          return p2;
       }
       p2.put(p0, p1);
       return p2;
    }
    public static Map c(SearchPage p0,boolean p1,b p2,String p3,String p4){
       HashMap obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(r3.class)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),p2,p3,p4};
          obj = PatchProxy.apply(objArray, null, r3.class, "43");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = new HashMap();
       r3.b("count", Integer.valueOf(20), obj);
       r3.b("pcursor", p4, obj);
       r3.b("sessionId", p3, obj);
       r3.b("feedType", p0.mTabType, obj);
       r3.b("firstScreen", Boolean.valueOf(p1), obj);
       if (p2 != null) {
          r3.b("generalTagId", p2.a, obj);
          r3.b("tagName", p2.b, obj);
          r3.b("tagSource", Integer.valueOf(p2.c), obj);
          r3.b("tagType", Integer.valueOf(p2.f), obj);
          r3.b("kgId", p2.i, obj);
          HashMap hashMap = new HashMap();
          r3.b("topSessionId", p2.l, hashMap);
          String str = PatchProxy.applyOneRefs(hashMap, null, r3.class, "44");
          if (str != patchProxyRe) {
          }else {
             a uoa = a.k();
             if (hashMap.containsKey("params")) {
                p4 = hashMap.get("params");
                if (p4 instanceof JsonObject) {
                   uoa.h(p4);
                }
                hashMap.remove("params");
             }
             uoa.g(hashMap);
             str = uoa.i();
          }
          r3.b("extParams", str, obj);
          r3.b("fromPhotoId", p2.e, obj);
       }
       return obj;
    }
    public static a$a d(int p0,Fragment p1,Map p2){
       a$a obj;
       if (PatchProxy.isSupport(r3.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, null, r3.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new a$a();
       obj.a = p0;
       c uoc = j2.c(p1);
       int i = 1;
       if (uoc != null) {
          uoc = uoc.c();
          if (uoc == i || (uoc != 7 && uoc != 4)) {
             if (uoc == 3) {
                i = 2;
             }else {
             label_003f :
                i = 0;
             }
          }
       }else {
          goto label_003f ;
       }
       obj.b = i;
       if (!q.h(p2)) {
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = p2.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             Object value = uEntry.getValue();
             if (!value instanceof Integer && (!value instanceof Boolean && (!value instanceof Double && (!value instanceof Float && (value instanceof Long || value instanceof String))))) {
                a$b uob = new a$b();
                uob.a = uEntry.getKey();
                uob.b = (value instanceof Boolean)? String.valueOf(value.equals(Boolean.TRUE)): String.valueOf(value);
                uArrayList.add(uob);
             }
          }
          if (!q.f(uArrayList)) {
             a$b[] uobArray = new a$b[0];
             obj.e = uArrayList.toArray(uobArray);
          }
       }
       return obj;
    }
    public static LiveAudienceParam e(SearchParams p0,LiveTipInfo p1,int p2){
       LiveAudienceParam$a obj;
       if (PatchProxy.isSupport(r3.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, r3.class, "32");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new LiveAudienceParam$a();
       obj.i(p1.mLiveStreamId);
       obj.m(p0);
       obj.n(p1.mServerExpTag);
       obj.g(p2);
       return obj.a();
    }
    public static boolean f(char p0,char p1){
       r3 or3 = r3.class;
       if (PatchProxy.isSupport(or3)) {
          Object obj = PatchProxy.applyTwoRefs(Character.valueOf(p0), Character.valueOf(p1), null, or3, "35");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = true;
       if (p0 == p1) {
          return b;
       }else if(Character.isLetter(p0) && Character.isLetter(p1)){
          if (Character.toLowerCase(p0) != Character.toLowerCase(p1)) {
             b = false;
          }
          return b;
       }else {
          return false;
       }
    }
    public static f g(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, r3.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new f(p1.b(p0), new PresenterV2());
    }
    public static String h(String p0){
       String str = p0;
       Object obj = PatchProxy.applyOneRefs(str, null, r3.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(p0)) {
          String[] stringArray = new String[]{"\\","$","\(","\)","*","+",".","[","]","?","^","{","}","|","-"};
          int i = 0;
          while (i < 15) {
             object oobject = stringArray[i];
             if (str.contains(oobject)) {
                str = str.replace(oobject, "\\"+oobject);
             }
             i = i + 1;
          }
       }
       return str;
    }
    public static String i(String p0){
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, r3.class, "37");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (!TextUtils.x(p0)) {
          return p0.replaceAll("\n", "");
       }
       return obj;
    }
    public static Object j(String p0,Class p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, r3.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0)) {
          return null;
       }
       try{
          return a.a.h(p0, p1);
       }catch(java.lang.Exception e3){
          ExceptionHandler.handleCaughtException(e3);
          return v1;
       }
    }
    public static RecyclerFragment k(Fragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, r3.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof RecyclerFragment) {
          return p0;
       }
       if (p0 instanceof TabHostFragment) {
          return r3.k(p0.t());
       }
       return null;
    }
    public static String l(Context p0,User p1,UserExtraInfo p2,String p3){
       Object[] objArray;
       p0 = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, r3.class, "29");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       String str = "";
       if (!t0.a(p3)) {
          UserExtraInfo mExposedInfo = p2.mExposedInfo;
          if (mExposedInfo != null && !mExposedInfo.isEmpty()) {
             str = p2.mExposedInfo.get(p3);
          }
          return str;
       }else {
          int i = 1;
          switch (Integer.parseInt(p3)){
              case 0:
                return "searchInvisible";
              case 1:
                return p1.mName;
              case 2:
                User mVerifiedDet = p1.mVerifiedDetail;
                if (mVerifiedDet != null) {
                   str = mVerifiedDet.mDescription;
                }
                return str;
                break;
              case 3:
                objArray = new Object[i];
                objArray[0] = p1.mId;
                return a.b().getString(0x7f1045d3, objArray);
              case 4:
                objArray = new Object[i];
                objArray[0] = p1.mKwaiId;
                return a.b().getString(0x7f1045d4, objArray);
              case 5:
                return p1.mText;
              case 6:
                objArray = new Object[i];
                objArray[0] = TextUtils.N((long)p1.mFansCount);
                return a.b().getString(0x7f10456c, objArray);
              case 7:
                return p1.mExtraInfo.mRemarksName;
              default:
                return str;
          }
       }
    }
    public static a m(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, r3.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (y0.A()) {
          if (f.a("searchSomeLowImageResolution")) {
             p0 = a.e;
          }
          return p0;
       }else if(b.a(-404437045).g() && s1.n().mAllLowImageResolution != null){
          p0 = a.e;
       }
       return p0;
    }
    public static String n(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, r3.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return "kwai://tube_play/"+p1+"?"+Uri.parse(p0).getEncodedQuery();
       }catch(java.lang.Exception e0){
          return "";
       }
    }
    public static void o(Activity p0,String p1,SearchSource p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, r3.class, "26")) {
          return;
       }
       r3.q(p0, p1, p2, p3, null);
       return;
    }
    public static void p(Activity p0,String p1,SearchSource p2,String p3,int p4,a p5,SearchPage p6){
       r3 or3 = r3.class;
       if (PatchProxy.isSupport(or3)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4),p5,p6};
          if (PatchProxy.applyVoid(objArray, null, or3, "28")) {
             return;
          }
       }
       if (!p0 instanceof e) {
          return;
       }else {
          p0.Z1(p0, p1, p2, p3, p4, p5, p6);
          return;
       }
    }
    public static void q(Activity p0,String p1,SearchSource p2,String p3,SearchPage p4){
       r3 or3 = r3.class;
       if (PatchProxy.isSupport(or3)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, or3, "27")) {
             return;
          }
       }
       r3.p(p0, p1, p2, p3, 0, null, p4);
       return;
    }
    public static boolean r(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, r3.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (TextUtils.isEmpty(p0)) {
          return false;
       }
       if (!p0.startsWith("#")) {
          return false;
       }
       if (p0.length() != 7 && p0.length() != 9) {
          return false;
       }
       return true;
    }
    public static boolean s(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, r3.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (TextUtils.x(p0) || TextUtils.n("null", p0))? true: false;
       return b;
    }
    public static SpannableStringBuilder t(int p0,int p1,String p2,String p3){
       SpannableStringBuilder obj;
       if (PatchProxy.isSupport(r3.class)) {
          obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, p3, null, r3.class, "19");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new SpannableStringBuilder(p2);
       p3 = r3.h(p3);
       if ((r3.h(p2)).contains(p3) && !TextUtils.x(p3)) {
          try{
             Matcher matcher = Pattern.compile(p3).matcher(obj);
             while (matcher.find()) {
                int i = matcher.start();
                int i1 = matcher.end();
                obj.setSpan(new ForegroundColorSpan(p0), i, i1, 33);
                if (p1 >= 0) {
                   obj.setSpan(new StyleSpan(p1), i, i1, 17);
                }
             }
          }catch(java.lang.Exception e8){
             e8.printStackTrace();
          }
       }
    }
    public static SpannableStringBuilder u(int p0,String p1,String p2){
       if (PatchProxy.isSupport(r3.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, null, r3.class, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return r3.t(p0, -1, p1, p2);
    }
    public static void v(short[][] p0,int p1,int p2,List p3){
       if (PatchProxy.isSupport(r3.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, null, r3.class, "36")) {
          return;
       }
       if (p1 && p2) {
          if (!p0[p1][p2]) {
             p2 = p2 - 1;
             r3.v(p0, (p1 - 1), p2, p3);
             p3.add(Short.valueOf((short)p2));
          }else if(p0[p1][p2] == 1){
             r3.v(p0, (p1 - 1), p2, p3);
          }else {
             r3.v(p0, p1, (p2 - 1), p3);
          }
       }
       return;
    }
    public static e w(SearchKeywordContext p0,SearchSource p1,String p2,SearchPage p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, r3.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return r3.x(p0, p1, p2, p3, true);
    }
    public static e x(SearchKeywordContext p0,SearchSource p1,String p2,SearchPage p3,boolean p4){
       r3 or3 = r3.class;
       if (PatchProxy.isSupport(or3)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Boolean.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, null, or3, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return r3.y(p0, p1, p2, p3, p4, null, null);
    }
    public static e y(SearchKeywordContext p0,SearchSource p1,String p2,SearchPage p3,boolean p4,a$a p5,String p6){
       e$a obj;
       r3 or3 = r3.class;
       if (PatchProxy.isSupport(or3)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Boolean.valueOf(p4),p5,p6};
          obj = PatchProxy.apply(objArray, null, or3, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new e$a();
       obj.a = p0;
       obj.c = p1;
       obj.b = p2;
       obj.d = p3;
       obj.e = p4;
       obj.f = p5;
       obj.g = p6;
       e uoe = PatchProxy.apply(null, obj, e$a.class, "1");
       if (uoe != PatchProxyResult.class) {
       }else {
          uoe = new e(obj);
       }
       return uoe;
    }
    public static e z(String p0,SearchSource p1,String p2,boolean p3){
       if (PatchProxy.isSupport(r3.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), null, r3.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (TextUtils.x(p0)) {
          return e.h;
       }else {
          return r3.x(SearchKeywordContext.simpleContext(p0), p1, p2, null, p3);
       }
    }
}
