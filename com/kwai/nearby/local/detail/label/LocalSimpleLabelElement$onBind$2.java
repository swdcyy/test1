package com.kwai.nearby.local.detail.label.LocalSimpleLabelElement$onBind$2;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kwai.nearby.local.detail.label.LocalSimpleLabelElement;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import zc7.h;
import java.lang.Boolean;
import java.lang.Float;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import lnc.i3;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kwai.components.nearbymodel.model.LocalSimpleLabelInfo;
import java.lang.Number;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import k2b.e0;
import com.kwai.robust.PatchProxyResult;
import android.text.TextUtils;
import android.net.Uri;
import kotlin.text.StringsKt__StringsKt;
import java.lang.StringBuilder;
import zsd.u;
import nf6.i;
import ekd.x0;
import android.content.Context;
import android.content.Intent;
import android.app.Activity;

public final class LocalSimpleLabelElement$onBind$2 extends FunctionReferenceImpl implements l	// class@000f8d
{

    public void LocalSimpleLabelElement$onBind$2(LocalSimpleLabelElement p0){
       super(1, p0, LocalSimpleLabelElement.class, "onElementClick", "onElementClick\(Ljava/lang/String;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(String p0){
       h a;
       LocalSimpleLabelElement h;
       LocalSimpleLabelElement v1;
       boolean b;
       String str3;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, LocalSimpleLabelElement$onBind$2.class, "1")) {
          return;
       }
       a.p(obj1, "p1");
       CallableReference uCallableRef = obj.receiver;
       Objects.requireNonNull(uCallableRef);
       if (!PatchProxy.applyVoidOneRefs(obj1, uCallableRef, LocalSimpleLabelElement.class, "15") && !TextUtils.x(p0)) {
          a = h.a;
          LocalSimpleLabelElement t = uCallableRef.t;
          a.m(t);
          LocalSimpleLabelElement v = uCallableRef.v;
          a.m(v);
          LocalSimpleLabelElement a1 = uCallableRef.A;
          h = uCallableRef.H;
          LocalSimpleLabelElement i = uCallableRef.I;
          Objects.requireNonNull(a);
          h oh = h.class;
          int i1 = 2;
          if (PatchProxy.isSupport(oh)) {
             Object[] objArray = new Object[]{t,v,Boolean.valueOf(a1),h,Float.valueOf(i)};
             if (!PatchProxy.applyVoid(objArray, a, oh, "3")) {
             label_0070 :
                a.p(h, "guidePlayStrategy");
                if (t != null && v != null) {
                   ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                   uContentPack.photoPackage = w1.f(t.mEntity);
                   ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
                   urlPackage.page2 = "DETAIL";
                   i3 oi3 = i3.f();
                   CommonMeta commonMeta = t.getCommonMeta();
                   commonMeta = (commonMeta != null)? commonMeta.mExpTag: null;
                   oi3.d("exp_tag", TextUtils.I(commonMeta));
                   urlPackage.params = oi3.e();
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "DISTANCE_TAG_CARD";
                   oi3 = i3.f();
                   oi3.d("card_content", v.mText);
                   str3 = (a1 != null)? "TRUE": "FALSE";
                   oi3.d("have_show_guide", str3);
                   oi3.d("content_type", v.mLinkGuideType);
                   oi3.d("show_time_classify", h);
                   oi3.c("show_time_type", Float.valueOf(i));
                   oi3.d("distance_type", v.mTagType);
                   uElementPack.params = oi3.e();
                   ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
                   uClickEvent.elementPackage = uElementPack;
                   uClickEvent.urlPackage = urlPackage;
                   uClickEvent.contentPackage = uContentPack;
                   b.a(0x4b316083).B("2859609", uClickEvent, null);
                }
             }
          }else {
             goto label_0070 ;
          }
          b = (uCallableRef.A != null || ((v1 = uCallableRef.v) != null && v1.mIsSubTextShowing == 1))? true: false;
          String str = String.valueOf(b);
          StringBuilder str1 = PatchProxy.applyThreeRefs(p0, "distanceTagAnnotationed", str, uCallableRef, LocalSimpleLabelElement.class, "17");
          if (str1 != PatchProxyResult.class) {
          }else if(obj1 == null || TextUtils.isEmpty(p0)){
             str1 = "";
          }else {
             Uri uri = Uri.parse(p0);
             a.o(uri, "Uri.parse\(linkUrl\)");
             char c = '=';
             String str2 = "&";
             str3 = "?";
             if (!TextUtils.x(uri.getFragment())) {
                if (!StringsKt__StringsKt.O2(obj1, str3, 0, 2, null)) {
                   str2 = str3;
                }
                str1 = u.g2(p0, "#", str2+"distanceTagAnnotationed"+c+str+'#', false, 4, null);
             }else {
                str1 = obj1;
                if (!StringsKt__StringsKt.O2(obj1, str3, 0, 2, null)) {
                   str2 = str3;
                }
                str1 = str1+str2+"distanceTagAnnotationed"+c+str;
             }
          }
          Intent intent = b.a(0x66dce92a).c(uCallableRef.u, x0.f(str1), 1, 0);
          if (intent != null) {
             t = uCallableRef.u;
             if (t != null) {
                t.startActivity(intent);
             }
          }
       }
    label_01de :
       return;
    }
}
