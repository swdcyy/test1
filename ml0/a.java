package ml0.a;
import os5.d;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.newpendant.top.helper.b;
import com.kuaishou.livestream.message.nano.LiveAdSocialMessages$LiveAdSocialConversionTask;
import com.kuaishou.livestream.message.nano.LiveAdSocialMessages$LiveAdSocialConversionFeed;
import com.kuaishou.live.basic.model.QLiveMessage;
import da1.c;
import com.kuaishou.live.common.core.component.comments.model.LiveAdConversionTaskMessage;
import com.kuaishou.livestream.message.nano.LiveAdSocialMessages$NormalMsg;
import com.kuaishou.livestream.message.nano.LiveAdSocialMessages$LinkMsg;
import android.view.View;
import android.animation.ObjectAnimator;
import com.kuaishou.live.common.core.basic.degrade.j;
import android.app.Activity;
import java.lang.Boolean;
import com.kuaishou.live.core.basic.utils.e;
import zl0.b1;
import o02.e;
import wkd.b;
import ia0.g;
import com.kwai.framework.model.router.RouteType;
import t45.d;
import brd.z;
import com.yxcorp.retrofit.a;
import com.yxcorp.retrofit.e;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.live.core.basic.liveslide.a;
import com.kuaishou.live.core.basic.liveslide.a$a;
import com.kuaishou.live.core.basic.liveslide.b$b;
import com.kuaishou.live.core.basic.liveslide.b;
import wg3.b;
import com.kuaishou.live.core.basic.liveslide.b$a;
import tkd.b;
import tkd.d;
import com.kuaishou.live.core.basic.activity.LivePlayActivity;
import java.lang.Number;
import java.util.Objects;
import f12.d;
import f12.c;
import com.kuaishou.live.ad.model.config.AdConversionStartConfig;
import jp3.a;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;
import com.kuaishou.livestream.message.nano.LiveAdSocialMessages$LiveAdSocialConversionNotice;
import com.kuaishou.live.common.core.component.comments.model.SystemNoticeMessage;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$FansTopConfig;
import s81.a;
import ml2.s;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import java.lang.Integer;
import kq3.a;
import com.kuaishou.live.webview.context.LiveWebViewParam;
import d61.c0;
import com.kuaishou.live.webview.a;

public class a implements d	// class@0031b9
{

    public void a(){
       super();
    }
    public Drawable Fk(){
       Object obj = PatchProxy.apply(null, this, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a();
    }
    public QLiveMessage J40(LiveAdSocialMessages$LiveAdSocialConversionTask p0,LiveAdSocialMessages$LiveAdSocialConversionFeed p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveAdConversionTaskMessage obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.applyTwoRefs(p0, p1, null, c.class, "30");
       if (obj != patchProxyRe) {
       }else {
          obj = new LiveAdConversionTaskMessage(p0.conversionId, p1.normalMsg, p1.linkMsg);
          obj.setId(String.valueOf(p0.conversionId));
       }
       return obj;
    }
    public ObjectAnimator Jw(View p0,float[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return j.a(p0, p1);
    }
    public boolean L1(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.s(p0);
    }
    public b1 L8(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       b1 obj = PatchProxy.apply(objArray, this, a.class, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(objArray, objArray, e.class, "17");
       if (obj != patchProxyRe) {
       }else if(e.r == null){
          e.r = e.b(b.a(-1961311520).a(RouteType.AD, d.b), b1.class);
       }
       obj = e.r;
       return obj;
    }
    public void Mq(Activity p0,LiveStreamFeed p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "3")) {
          return;
       }
       LiveLogTag lIVE_TVC_AD = LiveLogTag.LIVE_TVC_AD;
       b.Z(lIVE_TVC_AD, "tryToEnterLive");
       if (this.L1(p0)) {
          b.Z(lIVE_TVC_AD, "NOTE: why here\(isSlideContainer\)???");
          a.n(p0).j().f(a.n(p0).h().a(), p1);
       }else if(d.a(-2004767397).Xq(p0)){
          b.Z(lIVE_TVC_AD, "ok, will replaceLivePlayFragment");
          p0.z3();
       }
       return;
    }
    public int Rg(int p0){
       switch (p0){
           case 0:
             return 0x7f081142;
           case 1:
             return 0x7f081412;
           case 2:
             return 0x7f08249c;
           case 3:
             return 0x7f081494;
           case 4:
             return 0x7f0100a6;
           case 5:
             return 0x7f0100a9;
           case 6:
             return 0x7f0d10a0;
           default:
             return 0;
       }
    }
    public int U40(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Objects.requireNonNull(p0);
       return c.b(p0).c();
    }
    public AdConversionStartConfig WM(Class p0){
       String obj = PatchProxy.applyOneRefs(p0, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.a.getString("adConversionStartConfig", "null");
       AdConversionStartConfig uAdConversio = (obj == null || obj == "")? null: b.a(obj, p0);
       return uAdConversio;
    }
    public boolean Xq(Activity p0){
       return p0 instanceof LivePlayActivity;
    }
    public SystemNoticeMessage Yu(LiveAdSocialMessages$LiveAdSocialConversionNotice p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       SystemNoticeMessage obj = PatchProxy.applyOneRefs(p0, this, a.class, "8");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.applyOneRefs(p0, null, c.class, "10");
       if (obj != patchProxyRe) {
       }else {
          obj = new SystemNoticeMessage();
          LiveAdSocialMessages$LiveAdSocialConversionNotice id = p0.id;
          obj.mId = id;
          obj.mDisplayType = p0.displayType;
          obj.mDisplayDuration = p0.displayDuration;
          obj.mContent = p0.content;
          obj.mLogId = id;
       }
       return obj;
    }
    public long ee(){
       Object[] objArray = null;
       LiveCommonConfigResponse$FansTopConfig obj = PatchProxy.apply(objArray, this, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = LiveCommonConfigResponse$FansTopConfig.class;
       String str = a.a.getString("fansTop", "{}");
       if (str != null && str != "") {
          objArray = b.a(str, obj);
       }
       if (objArray != null) {
          return objArray.mAuthorPullRateMills;
       }else {
          return -1;
       }
    }
    public boolean iH(){
       Object obj = PatchProxy.apply(null, this, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return s.a();
    }
    public boolean isAvailable(){
       return true;
    }
    public KwaiDialogFragment vV(Activity p0,c p1,String p2,String p3,String p4,int p5){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,Integer.valueOf(p5)};
          Object obj = PatchProxy.apply(objArray, this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a uoa1 = a.c(p0, p1);
       uoa1.g(p3);
       uoa1.f(p4);
       uoa1.b.setPortraitHeightPixel(p5).setLayoutType("3").setDimAmount(0);
       c0.a.b("/udata/pkg/kwai-client-image/live_bottom_bar/live_conversion_task_bell_anim.json");
       return a.c().h(p2, uoa1);
    }
}
