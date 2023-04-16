package com.kuaishou.live.core.show.subscribe.subscribelist.a;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.subscribe.model.LiveSubscribedAnchorInfo$LiveSubscribedAnchor;
import com.kwai.framework.model.user.UserInfo;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;
import android.widget.TextView;
import java.lang.StringBuilder;
import lnc.a1;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import com.yxcorp.widget.selector.drawable.DrawableCreator$Shape;
import android.graphics.drawable.Drawable;
import com.kuaishou.live.core.show.subscribe.LiveSubscribeStatus;
import com.kuaishou.live.core.basic.model.LiveSubscribeBookStatus;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import wk2.s;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import pk2.c;
import pk2.b;
import brd.t;
import cjd.e;
import erd.o;
import com.kuaishou.live.core.show.subscribe.subscribelist.a$b;
import sfc.a;
import erd.g;
import crd.b;
import com.kuaishou.live.core.show.subscribe.subscribelist.a$a;
import ekd.m1;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.widget.EmojiTextView;
import dl2.c;
import android.view.View$OnClickListener;
import dl2.b;

public class a extends c	// class@00116a
{
    public KwaiImageView p;
    public EmojiTextView q;
    public EmojiTextView r;
    public SelectShapeTextView s;
    public LiveSubscribedAnchorInfo$LiveSubscribedAnchor t;
    public static String sLivePresenterClassName = "LiveSubscribedAnchorPresenter";

    public void a(){
       super();
    }
    public void E8(){
       b uob;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          return;
       }
       this.p.U(this.t.mUserInfo.mHeadUrls);
       this.q.setText(this.t.mTitle);
       this.r.setText(a1.p(R.string.arg_RES_7f102bca)+this.t.mStartTime);
       this.m8().setBackgroundResource(R.drawable.arg_RES_7f08035c);
       if (!PatchProxy.applyVoid(objArray, this, uoa, "4")) {
          a tt = this.t;
          if (tt.mDisableCancel != null) {
             if (!PatchProxy.applyVoid(objArray, this, uoa, "11")) {
                this.s.setText(R.string.arg_RES_7f102c4c);
                this.s.setEnabled(false);
                uob = new b();
                uob.g(KwaiRadiusStyles.FULL);
                uob.x(0x3f800000);
                uob.w(a1.a(R.color.arg_RES_7f061aaa));
                uob.v(a1.a(R.color.arg_RES_7f06202f));
                uob.s(DrawableCreator$Shape.Rectangle);
                this.s.setBackground(uob.a());
                this.s.setTextColor(a1.a(R.color.arg_RES_7f061aaa));
             }
          }else if(tt.mStatus == LiveSubscribeStatus.OVER){
             if (!PatchProxy.applyVoid(objArray, this, uoa, "10")) {
                this.s.setText(R.string.arg_RES_7f102bc3);
                this.s.setEnabled(false);
                uob = new b();
                uob.g(KwaiRadiusStyles.FULL);
                uob.x(0x3f800000);
                uob.w(a1.a(R.color.arg_RES_7f061aaa));
                uob.v(a1.a(R.color.arg_RES_7f06202f));
                uob.s(DrawableCreator$Shape.Rectangle);
                this.s.setBackground(uob.a());
                this.s.setTextColor(a1.a(R.color.arg_RES_7f061aaa));
             }
          }else {
             LiveSubscribedAnchorInfo$LiveSubscribedAnchor mBookStatus = tt.mBookStatus;
             if (mBookStatus == LiveSubscribeBookStatus.BOOKED) {
                this.S8();
             }else if(mBookStatus == LiveSubscribeBookStatus.NOT_BOOK){
                this.R8();
             }else {
                this.R8();
             }
          }
       }
       ClientEvent$ElementPackage uElementPack = s.c(this.P8(), this.t);
       ClientContent$ContentPackage uContentPack = s.b(this.t);
       if (!PatchProxy.applyVoidTwoRefs(uElementPack, uContentPack, objArray, s.class, "3")) {
          uElementPack.action2 = "LIVE_APPOINTMENT_SUBCARD";
          u1.u0(1, uElementPack, uContentPack);
       }
       return;
    }
    public final String P8(){
       a tt = this.t;
       String str = "CANCEL";
       if (tt.mStatus == LiveSubscribeStatus.OVER) {
          str = "OVER";
       }else {
          LiveSubscribedAnchorInfo$LiveSubscribedAnchor mBookStatus = tt.mBookStatus;
          if (mBookStatus != LiveSubscribeBookStatus.BOOKED && mBookStatus == LiveSubscribeBookStatus.NOT_BOOK) {
             str = "ORDER";
          }
       }
       return str;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, a.class, "8")) {
          return;
       }
       this.s.setText(R.string.arg_RES_7f102bce);
       this.s.setEnabled(true);
       b uob = new b();
       uob.g(KwaiRadiusStyles.FULL);
       uob.v(a1.a(R.color.arg_RES_7f060751));
       uob.s(DrawableCreator$Shape.Rectangle);
       this.s.setBackground(uob.a());
       this.s.setTextColor(a1.a(R.color.arg_RES_7f061ff3));
       return;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, a.class, "9")) {
          return;
       }
       this.s.setText(R.string.arg_RES_7f102bbf);
       this.s.setEnabled(true);
       b uob = new b();
       uob.g(KwaiRadiusStyles.FULL);
       uob.x(0x3f800000);
       uob.w(a1.a(R.color.arg_RES_7f060751));
       uob.v(a1.a(R.color.arg_RES_7f06202f));
       uob.s(DrawableCreator$Shape.Rectangle);
       this.s.setBackground(uob.a());
       this.s.setTextColor(a1.a(R.color.arg_RES_7f061fab));
       return;
    }
    public final void V8(LiveSubscribedAnchorInfo$LiveSubscribedAnchor p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "7")) {
          return;
       }
       this.X7(b.b().b(p0.mSubscribeId, 1).map(new e()).subscribe(new a$b(this, p0), new a()));
       return;
    }
    public final void W8(LiveSubscribedAnchorInfo$LiveSubscribedAnchor p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "6")) {
          return;
       }
       this.X7(b.b().y0(p0.mSubscribeId).map(new e()).subscribe(new a$a(this, p0), new a()));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a260a);
       this.p = m1.f(p0, 0x7f0a2662);
       this.q = m1.f(p0, 0x7f0a2663);
       this.r = m1.f(p0, 0x7f0a2605);
       m1.a(p0, new c(this), R.id.live_subscribed_anchor_avatar);
       m1.a(p0, new b(this), R.id.live_subscribe_anchor_action_button);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.t = this.q8(LiveSubscribedAnchorInfo$LiveSubscribedAnchor.class);
       return;
    }
}
