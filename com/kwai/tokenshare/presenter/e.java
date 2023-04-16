package com.kwai.tokenshare.presenter.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.yxcorp.plugin.kwaitoken.model.BaseDialogInfo;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import ekd.k0;
import fg6.a;
import eu7.a;
import com.google.gson.Gson;
import java.lang.NullPointerException;
import java.lang.Exception;
import lc5.b;
import com.kwai.tokenshare.KwaiTokenCustomPopUpDialog;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import com.facebook.drawee.view.DraweeView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import android.widget.LinearLayout;
import lnc.a1;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Objects;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Long;
import java.util.Locale;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.View;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import android.net.Uri;
import ekd.x0;
import wkd.b;
import nf6.i;
import o56.c;
import o56.a;
import android.content.Context;
import android.content.Intent;
import ekd.m1;
import com.yxcorp.gifshow.widget.EmojiTextView;
import com.yxcorp.widget.selector.view.SelectShapeButton;
import android.text.TextPaint;
import fu7.l;
import android.view.View$OnClickListener;
import fu7.k;
import fu7.g;
import fu7.h;
import fu7.j;
import fu7.i;
import com.yxcorp.plugin.kwaitoken.model.CustomDialogInfo;

public class e extends PresenterV2	// class@001941
{
    public TextView A;
    public ImageView B;
    public LinearLayout C;
    public TextView D;
    public ImageView E;
    public ViewStub F;
    public RelativeLayout G;
    public LinearLayout H;
    public KwaiTokenCustomPopUpDialog p;
    public CustomDialogInfo q;
    public a r;
    public EmojiTextView s;
    public KwaiImageView t;
    public KwaiImageView u;
    public TextView v;
    public SelectShapeButton w;
    public KwaiImageView x;
    public EmojiTextView y;
    public LinearLayout z;

    public void e(){
       super();
    }
    public void E8(){
       boolean b;
       int i1;
       e uoe1;
       e uoe2;
       Object obj1;
       Object obj2;
       int b1;
       e a;
       long l;
       String str;
       long l1;
       long l2;
       Object[] objArray1;
       Object[] objArray2;
       ClientEvent$ShowEvent showEvent;
       ClientEvent$ElementPackage uElementPack;
       i3 oi3;
       a uoa = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, uoa, uoe, "8")) {
          return;
       }
       a obj = PatchProxy.apply(objArray, uoa, uoe, "16");
       int i = 0;
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          try{
             BaseDialogInfo mExtParams = uoa.q.mExtParams;
             if (mExtParams != null) {
                JsonElement jsonElement = k0.e(mExtParams, "dialogData");
                if (jsonElement != null) {
                   uoa.r = a.a.c(jsonElement, a.class);
                   b = true;
                }else {
                   throw new NullPointerException("自定义回流弹窗数据feedDialogData is null");
                }
             }else {
                throw new NullPointerException("自定义回流弹窗数据extParams==null");
             }
          }catch(java.lang.Exception e0){
             String[] stringArray = new String[]{"KwaiTokenDialogFeedPresenter"};
             b.f(e0.getMessage(), stringArray);
             uoa.p.c();
             b = false;
          }
       }
    }
    public final boolean P8(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TextUtils.n(p0, "longPhoto");
    }
    public final boolean R8(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.n(p0, "pictureHorizontal") && (TextUtils.n(p0, "pictureSingle") || TextUtils.n(p0, "pictureVertical")))? true: false;
       return b;
    }
    public final void S8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "23")) {
          return;
       }
       ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
       i3 oi3 = i3.f();
       oi3.d("click_button", p0);
       p0 = oi3.e();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.type = 18;
       uElementPack.action2 = "CUSTOM_DIALOG_SHOW";
       i3 oi31 = i3.f();
       oi31.d("originSubBiz", this.q.mOriginSubBiz);
       oi31.d("newShowTypes", "customDialog");
       oi31.d("actionButtonText", this.r.mActionButtonText);
       oi31.d("footerText", this.r.mFooterText);
       oi31.d("extParams", p0);
       uElementPack.params = oi31.e();
       uClickEvent.elementPackage = uElementPack;
       u1.z(null, uClickEvent);
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, e.class, "5")) {
          return;
       }
       this.S8("HEAD");
       this.W8(this.r.mAvatarUri);
       this.p.c();
       return;
    }
    public final void W8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "17")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       Intent intent = b.a(0x66dce92a).c(a.a().f(), x0.f(p0), true, false);
       if (intent != null) {
          a.a().f().startActivity(intent);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       this.G = m1.f(p0, 0x7f0a3676);
       this.H = m1.f(p0, 0x7f0a28bb);
       this.F = m1.f(p0, 0x7f0a1320);
       this.A = m1.f(p0, 0x7f0a424b);
       this.B = m1.f(p0, 0x7f0a1577);
       this.z = m1.f(p0, 0x7f0a093a);
       this.C = m1.f(p0, 0x7f0a0932);
       this.E = m1.f(p0, 0x7f0a1543);
       this.D = m1.f(p0, 0x7f0a41b9);
       this.t = m1.f(p0, 0x7f0a1516);
       this.s = m1.f(p0, 0x7f0a414e);
       this.u = m1.f(p0, 0x7f0a132c);
       this.v = m1.f(p0, 0x7f0a41a0);
       this.w = m1.f(p0, 0x7f0a0540);
       this.x = m1.f(p0, 0x7f0a14f5);
       EmojiTextView uEmojiTextVi = m1.f(p0, R.id.tv_user_feed_token_dialog);
       this.y = uEmojiTextVi;
       uEmojiTextVi.getPaint().setFakeBoldText(true);
       m1.a(p0, new l(this), R.id.iv_close_feed_token_dialog);
       m1.a(p0, new k(this), R.id.btn_go_feed_token_dialog);
       m1.a(p0, new g(this), R.id.iv_avatar_feed_token_dialog);
       m1.a(p0, new h(this), R.id.tv_user_feed_token_dialog);
       m1.a(p0, new j(this), R.id.iv_cover_feed_token_dialog);
       m1.a(p0, new i(this), R.id.ll_hint_feed_token_dialog);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.p = this.q8(KwaiTokenCustomPopUpDialog.class);
       this.q = this.q8(CustomDialogInfo.class);
       return;
    }
}
