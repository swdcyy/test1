package com.yxcorp.gifshow.detail.common.information.marquee.model.e;
import java.lang.Object;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.gifshow.detail.common.information.marquee.model.MarqueeResponse$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.framework.model.user.User;
import qa6.b;
import java.util.List;
import java.lang.Iterable;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.Collection;
import ekd.q;
import java.lang.Integer;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.facebook.imagepipeline.request.ImageRequest;
import wb5.d;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.text.SpannableString;
import java.lang.StringBuilder;
import rnc.i;
import lnc.a1;

public class e	// class@001431
{

    public void e(){
       super();
    }
    public static MarqueeResponse$a a(QComment p0,boolean p1){
       MarqueeResponse$a uoa;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(e.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, e.class, "8");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (p1) {
          uoa = PatchProxy.applyOneRefs(p0, null, e.class, "10");
          if (uoa != patchProxyRe) {
          }else {
             uoa = new MarqueeResponse$a();
             uoa.mMarqueeType = 6;
             uoa.mComment = p0;
          }
       }else {
          uoa = PatchProxy.applyOneRefs(p0, null, e.class, "9");
          if (uoa != patchProxyRe) {
          }else {
             uoa = new MarqueeResponse$a();
             uoa.mMarqueeType = 1;
             uoa.mComment = p0;
          }
       }
       return uoa;
    }
    public static MarqueeResponse$a b(QCurrentUser p0,boolean p1){
       User user;
       MarqueeResponse$a uoa;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(e.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, e.class, "11");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (p1) {
          user = b.a(p0);
          uoa = PatchProxy.applyOneRefs(user, null, e.class, "13");
          if (uoa != patchProxyRe) {
          }else {
             uoa = new MarqueeResponse$a();
             uoa.mMarqueeType = 7;
             uoa.mUser = user;
          }
       }else {
          user = b.a(p0);
          uoa = PatchProxy.applyOneRefs(user, null, e.class, "12");
          if (uoa != patchProxyRe) {
          }else {
             uoa = new MarqueeResponse$a();
             uoa.mMarqueeType = 2;
             uoa.mUser = user;
          }
       }
       return uoa;
    }
    public static List c(List p0,List p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ArrayList uArrayList = Lists.c(p0);
       if (!q.f(p1)) {
          uArrayList.removeAll(p1);
          p1.clear();
       }
       return uArrayList;
    }
    public static List d(int p0){
       ArrayList obj;
       MarqueeResponse$a uoa;
       if (PatchProxy.isSupport(e.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, e.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = Lists.b();
       for (int i = 0; i < p0; i = i + 1) {
          if (PatchProxy.isSupport(e.class)) {
             uoa = PatchProxy.applyOneRefs(Integer.valueOf(i), null, e.class, "3");
             if (uoa != PatchProxyResult.class) {
             label_0044 :
                obj.add(uoa);
             }
          }
          uoa = new MarqueeResponse$a();
          uoa.mMarqueeType = 0;
          uoa.a = String.valueOf(i);
          goto label_0044 ;
       }
       return obj;
    }
    public static ImageRequest[] e(User p0,HeadImageSize p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, e.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.i(p0, p1);
    }
    public static CharSequence f(QComment p0){
       String obj = PatchProxy.applyOneRefs(p0, null, e.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       if (!TextUtils.x(p0.getComment())) {
          obj = obj+i.j(new SpannableString(p0.getComment()));
       }
       if (!q.f(p0.attachmentList)) {
          obj = obj+a1.p(0x7f101640);
       }else if(p0.mEmotionInfo != null){
          obj = obj+a1.p(0x7f10078e);
       }
       return obj;
    }
    public static boolean g(MarqueeResponse$a p0){
       boolean b = true;
       if (p0 == null || p0.mMarqueeType != b) {
          b = false;
       }
       return b;
    }
    public static boolean h(MarqueeResponse$a p0){
       boolean b = (p0 != null && p0.mMarqueeType == 6)? true: false;
       return b;
    }
    public static boolean i(MarqueeResponse$a p0){
       boolean b = (p0 != null && p0.mMarqueeType == null)? true: false;
       return b;
    }
    public static boolean j(MarqueeResponse$a p0){
       boolean b = (p0 != null && p0.mMarqueeType == 2)? true: false;
       return b;
    }
    public static boolean k(MarqueeResponse$a p0){
       boolean b = (p0 != null && p0.mMarqueeType == 7)? true: false;
       return b;
    }
    public static boolean l(MarqueeResponse$a p0){
       boolean b = (p0 != null && p0.mMarqueeType == 4)? true: false;
       return b;
    }
    public static boolean m(MarqueeResponse$a p0){
       boolean b = (p0 != null && p0.mMarqueeType == 3)? true: false;
       return b;
    }
    public static boolean n(MarqueeResponse$a p0){
       boolean b = (p0 != null && p0.mMarqueeType == 5)? true: false;
       return b;
    }
}
