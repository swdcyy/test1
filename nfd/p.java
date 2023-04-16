package nfd.p;
import java.lang.Object;
import java.lang.String;
import com.google.gson.JsonObject;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.User;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.User$FollowStatus;
import java.lang.Boolean;
import com.kwai.framework.model.user.UserHeadIcon;
import nfd.g3;
import android.content.Context;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.yxcorp.plugin.search.entity.SearchItem;
import android.app.Activity;
import com.yxcorp.gifshow.entity.helper.FollowSource;
import nfd.c1;
import jga.f;
import lyb.h;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.yxcorp.plugin.search.utils.b;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateBaseFeed;
import nfd.q1;
import com.yxcorp.plugin.search.entity.ExtInfo;
import com.yxcorp.plugin.search.entity.template.base.JCAladdinModel;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateMeta;
import com.yxcorp.gifshow.model.CDNUrl;
import zf6.k;
import com.yxcorp.plugin.search.entity.TemplateText;

public class p	// class@001df3
{

    public void p(){
       super();
    }
    public static void a(String p0,String p1,JsonObject p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, p.class, "10")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          p2.c0("pendent_type", p0);
       }
       if (!TextUtils.x(p1)) {
          p2.c0("pendent_url", p1);
       }
       return;
    }
    public static JsonObject b(User p0,JsonObject p1){
       User obj = PatchProxy.applyTwoRefs(p0, p1, null, p.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.mFollowStatus == User$FollowStatus.FOLLOWING) {
          p1.H("is_follow", Boolean.TRUE);
       }
       obj = p0.mHeadIcon;
       String str = (obj == null)? "": obj.mHeadIconName;
       if (g3.s(p0)) {
          str = "feeling";
       }
       p.a(str, g3.g(p0), p1);
       return p1;
    }
    public static boolean c(User p0,Context p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, null, p.class, "3");
       if (p1 != PatchProxyResult.class) {
          return p1.booleanValue();
       }
       if (p0 != null) {
          return false;
       }
       ExceptionHandler.handleCaughtException(new IllegalArgumentException("user can not be null!"));
       return true;
    }
    public static void d(SearchItem p0,Activity p1,User p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, p.class, "5")) {
          return;
       }
       String sourceString = FollowSource.SEARCH.getSourceString(p2);
       f uof = PatchProxy.applyFourRefs(p1, p0, p2, sourceString, null, c1.class, "2");
       if (uof != PatchProxyResult.class) {
       }else {
          uof = c1.a(p1, p0, p2, sourceString, -1, null);
       }
       FollowHelper.c(uof, b.a);
       return;
    }
    public static JsonObject e(SearchItem p0,TemplateBaseFeed p1,User p2){
       TemplateBaseFeed obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, p.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       JsonObject jsonObject = q1.a(p0);
       obj = p1.mExtInfo;
       if (obj != null) {
          ExtInfo mButton = obj.mButton;
          if (mButton != null && (mButton.getButtonViewType() == 4 && p1.mExtInfo.mButton.mStatus == null)) {
             jsonObject.H("is_show_appoint", Boolean.TRUE);
          }
       }
       if (p2 != null) {
          p.b(p2, jsonObject);
       }
       return jsonObject;
    }
    public static JsonObject f(SearchItem p0,User p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, p.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       JsonObject jsonObject = q1.a(p0);
       if (p1 != null) {
          p.b(p1, jsonObject);
       }
       return jsonObject;
    }
    public static CDNUrl[] g(TemplateMeta p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, p.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = (k.d())? p0.mTitleContentTypeDarkIcons: p0.mTitleContentTypeIcons;
       return p0;
    }
    public static boolean h(TemplateText p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, p.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 == null || TextUtils.x(p0.mText))? true: false;
       return b;
    }
}
