package com.yxcorp.gifshow.comment.utils.b;
import android.app.Activity;
import java.lang.Object;
import k2b.e0;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.yxcorp.gifshow.comment.config.CommentInterceptorConfig$AlertInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.comment.config.CommentInterceptorConfig$MultipleLanguage;
import com.yxcorp.gifshow.comment.config.CommentInterceptorConfig;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.ref.WeakReference;
import com.kwai.library.widget.popup.common.c;
import java.util.regex.Pattern;
import com.yxcorp.gifshow.comment.utils.b$a;
import java.util.List;
import com.kwai.sdk.switchconfig.a;
import hl9.m;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import hl9.n;
import java.util.Iterator;
import java.util.regex.Matcher;
import android.util.Base64;
import kzc.d;
import u07.t$a;
import android.text.SpannableStringBuilder;
import com.yxcorp.gifshow.label.tag.span.ColorClickableSpan;
import hl9.e;
import android.view.View$OnClickListener;
import lnc.a1;
import hl9.j;
import u07.u;
import hl9.k;
import u07.f;
import hl9.l;
import w07.l;
import hl9.r;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c$b;
import java.util.Random;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import android.graphics.drawable.Drawable;
import hl9.g;
import hl9.h;
import hl9.i;
import hl9.f;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import u07.a;
import hl9.q;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import hl9.p;
import com.kuaishou.android.model.mix.QComment;

public class b	// class@001106
{
    public final Activity a;
    public b$a b;
    public WeakReference c;
    public static boolean d;

    public void b(Activity p0){
       super();
       this.a = p0;
    }
    public static void d(e0 p0,int p1,String p2,String p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, null, b.class, "2")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "COMMON_POPUP_WINDOW";
       i3 oi3 = i3.f();
       oi3.c("pop_id", Integer.valueOf(p1));
       oi3.d("source", p3);
       oi3.d("button_name", p2);
       uElementPack.params = oi3.e();
       ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
       urlPackage.page2 = "APP_GENERAL";
       ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
       uClickEvent.urlPackage = urlPackage;
       uClickEvent.elementPackage = uElementPack;
       b.a(0x4b316083).B(null, uClickEvent, p0);
       return;
    }
    public static void e(e0 p0,int p1,String p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, null, b.class, "3")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "CLOSE_COMMON_POPUP_WINDOW";
       i3 oi3 = i3.f();
       oi3.c("pop_id", Integer.valueOf(p1));
       oi3.d("source", p2);
       uElementPack.params = oi3.e();
       ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
       urlPackage.page2 = "APP_GENERAL";
       ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
       uClickEvent.urlPackage = urlPackage;
       uClickEvent.elementPackage = uElementPack;
       b.a(0x4b316083).B(null, uClickEvent, p0);
       return;
    }
    public static void f(e0 p0,int p1,String p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, null, b.class, "4")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "COMMON_POPUP_WINDOW";
       i3 oi3 = i3.f();
       oi3.c("pop_id", Integer.valueOf(p1));
       oi3.d("source", p2);
       uElementPack.params = oi3.e();
       ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
       urlPackage.page2 = "APP_GENERAL";
       ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
       showEvent.urlPackage = urlPackage;
       showEvent.elementPackage = uElementPack;
       b.a(0x4b316083).W0(null, showEvent, p0);
       return;
    }
    public static void g(boolean p0){
       b.d = p0;
    }
    public final boolean a(CommentInterceptorConfig$AlertInfo p0){
       boolean b;
       CommentInterceptorConfig$AlertInfo obj = PatchProxy.applyOneRefs(p0, this, b.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = p0.mLinkText;
       b = false;
       if (obj == null) {
          return b;
       }
       if (!TextUtils.x(CommentInterceptorConfig.getSuitMultiLanguageText(obj)) && !TextUtils.x(p0.mLinkUrl)) {
          b = true;
       }
       return b;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       b tc = this.c;
       if (tc != null && tc.get() != null) {
          this.c.get().o();
       }
       return;
    }
    public final Pattern c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Pattern.compile(p0, 2);
    }
    public boolean h(String p0,String p1,b$a p2,String p3){
       int i1;
       b uob = b.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, b.class, "6");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       this.b = p2;
       List list = PatchProxy.applyOneRefs(p0, this, uob, "8");
       obj = "";
       Object obj1 = null;
       if (list != patchProxyRe) {
       }else {
          List value = a.t().getValue(p0, new m(this).getType(), obj1);
          if (value == null) {
             value = new Gson().i(obj, new n(this).getType());
          }
          list = value;
       }
       p0 = PatchProxy.applyTwoRefs(list, p1, this, uob, "11");
       d uod = 2;
       if (p0 != patchProxyRe) {
          obj1 = p0;
       }else if(list == null || list.isEmpty()){
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             CommentInterceptorConfig uCommentInte = iterator.next();
             if (uCommentInte.mNeedFilter != null && !TextUtils.x(uCommentInte.mPreExcludeMatcher)) {
                p1 = this.c(uCommentInte.mPreExcludeMatcher).matcher(p1).replaceAll(obj);
             }
             CommentInterceptorConfig mEncodeMatch = uCommentInte.mEncodeMatcher;
             if (mEncodeMatch != null && !TextUtils.x(mEncodeMatch)) {
                mEncodeMatch = uCommentInte.mEncodeMatcher;
                String str1 = PatchProxy.applyOneRefs(mEncodeMatch, this, uob, "10");
                if (str1 != patchProxyRe) {
                }else {
                   str1 = new String(Base64.decode(mEncodeMatch, uod));
                }
                if (this.c(str1).matcher(p1).find()) {
                   obj1 = uCommentInte;
                   break ;
                }
             }
          }
       }
       int i = 0;
       if (obj1 != null) {
          if (!PatchProxy.applyVoidTwoRefs(obj1, p3, this, uob, "9")) {
             CommentInterceptorConfig mAlertType = obj1.mAlertType;
             if (mAlertType != true) {
                if (mAlertType == uod) {
                   mAlertType = obj1.mAlertInfo;
                   CommentInterceptorConfig mItemId = obj1.mItemId;
                   if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidThreeRefs(mAlertType, Integer.valueOf(mItemId), p3, this, b.class, "14")) {
                      uod = new d(this.a);
                      uod.Z0(mItemId);
                      uod.X0(CommentInterceptorConfig.getSuitMultiLanguageText(mAlertType.title));
                      String str = PatchProxy.applyOneRefs(mAlertType, this, uob, "16");
                      if (str != patchProxyRe) {
                      }else {
                         str = CommentInterceptorConfig.getSuitMultiLanguageText(mAlertType.mMessages[i]);
                         if (this.a(mAlertType)) {
                            SpannableStringBuilder spannableStr = new SpannableStringBuilder(str);
                            String suitMultiLan = CommentInterceptorConfig.getSuitMultiLanguageText(mAlertType.mLinkText);
                            spannableStr.append(suitMultiLan);
                            ColorClickableSpan uColorClicka = new ColorClickableSpan(mAlertType.mLinkUrl, suitMultiLan);
                            uColorClicka.e(new e(this, mAlertType));
                            spannableStr.setSpan(uColorClicka, spannableStr.length(), spannableStr.length(), 17);
                            str = spannableStr;
                         }
                      }
                      uod.z0(str);
                      uod.T0(a1.p(R.string.arg_RES_7f104cb1));
                      uod.R0(a1.p(R.string.arg_RES_7f100822));
                      uod.u0(new j(this, mItemId, p3));
                      uod.t0(new k(this, mItemId, p3));
                      t$a uoa = f.e(uod);
                      uoa.a0(new l(this, mAlertType));
                      this.c = new WeakReference(uoa.Y(new r(this, mItemId, p3)));
                   }
                }
             }else {
                CommentInterceptorConfig mAlertInfo = obj1.mAlertInfo;
                mAlertType = obj1.mItemId;
                if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidThreeRefs(mAlertInfo, Integer.valueOf(mAlertType), p3, this, b.class, "13")) {
                   int len = mAlertInfo.mMessages.length;
                   if (PatchProxy.isSupport(uob)) {
                      Object obj2 = PatchProxy.applyOneRefs(Integer.valueOf(len), this, uob, "15");
                      if (obj2 != patchProxyRe) {
                         i1 = obj2.intValue();
                      label_01d5 :
                         d uod1 = new d(this.a);
                         uod1.b1(KwaiDialogOption.d);
                         uod1.Z0(mAlertType);
                         uod1.z0(CommentInterceptorConfig.getSuitMultiLanguageText(mAlertInfo.mMessages[i1]));
                         uod1.S0(R.string.cancel);
                         uod1.Q0(R.string.arg_RES_7f104637);
                         uod1.C0(a1.f(R.drawable.arg_RES_7f080a5b));
                         uod1.s0(new g(this, mAlertType, p3));
                         uod1.u0(new h(this, mAlertType, p3));
                         uod1.t0(new i(this, mAlertType, p3));
                         uod1.z(true);
                         uod1.J(new f(this, mAlertType, p3));
                         uod1.A(true);
                         uod1 = a.c(uod1);
                         uod1.V0(true);
                         uod1.L(new q(this, R.layout.arg_RES_7f0d01d7, mAlertInfo));
                         this.c = new WeakReference(uod1.Y(new p(this, mAlertType, p3)));
                      }
                   }
                   i1 = new Random().nextInt(len);
                   goto label_01d5 ;
                }
             }
          }
          return true;
       }else {
          return i;
       }
    }
    public boolean i(String p0,String p1,QComment p2,b$a p3,String p4){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          p2 = PatchProxy.apply(objArray, this, uob, "7");
          if (p2 != PatchProxyResult.class) {
             return p2.booleanValue();
          }
       }
       return this.h(p0, p1, p3, p4);
    }
}
