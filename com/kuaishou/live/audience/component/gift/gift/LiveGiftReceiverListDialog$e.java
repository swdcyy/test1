package com.kuaishou.live.audience.component.gift.gift.LiveGiftReceiverListDialog$e;
import k51.c;
import com.kuaishou.live.audience.component.gift.gift.LiveGiftReceiverListDialog;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kuaishou.live.common.core.component.gift.gift.audience.LiveGiftReceiver;
import com.kwai.framework.model.user.UserInfo;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiImageView;
import lnc.a1;
import android.view.View;
import va1.n0;
import android.graphics.Typeface;
import android.widget.TextView;
import nf1.c;
import com.kuaishou.protobuf.livestream.nano.UserStateRichTextSegment;
import java.lang.CharSequence;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import az0.o;
import android.view.View$OnClickListener;
import b61.b;
import ekd.m1;
import com.yxcorp.gifshow.widget.EmojiTextView;

public class LiveGiftReceiverListDialog$e extends c	// class@000ae7
{
    public KwaiImageView p;
    public EmojiTextView q;
    public TextView r;
    public LiveGiftReceiver s;
    public final LiveGiftReceiverListDialog t;
    public static String sLivePresenterClassName = "LiveGiftReceiverListDialog$ReceiverItemPresenter";

    public void LiveGiftReceiverListDialog$e(LiveGiftReceiverListDialog p0){
       this.t = p0;
       super();
    }
    public void E8(){
       LiveGiftReceiverListDialog$e uoe = LiveGiftReceiverListDialog$e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "3")) {
          return;
       }
       this.p.setPlaceHolderImage(R.drawable.detail_avatar_secret);
       this.p.U(this.s.mUserInfo.mHeadUrls);
       if (this.s.mIsSendToAll != null) {
          if (!PatchProxy.applyVoid(objArray, this, uoe, "4")) {
             this.p.setImageResource(this.s.mAllReceiverRes);
             n0.r(this.p, a1.e(17.00f));
             n0.p(this.p, a1.e(28.00f));
             n0.q(this.p, a1.e(28.00f));
             this.q.setTypeface(Typeface.defaultFromStyle(1));
          }
       }else if(PatchProxy.applyVoid(objArray, this, uoe, "5")){
          n0.r(this.p, a1.e(16.00f));
          n0.p(this.p, a1.e(0x41f00000));
          n0.q(this.p, a1.e(0x41f00000));
          this.q.setTypeface(Typeface.defaultFromStyle(0));
       }
       if (this.t.G != null) {
          this.r.setText(c.b.B1(this.s.mIconSegment, a1.d(R.dimen.arg_RES_7f070a33)));
       }else {
          this.r.setVisibility(8);
       }
       this.m8().setOnClickListener(new o(this));
       this.q.setText(b.c(this.s.mUserInfo));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftReceiverListDialog$e.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a1d5e);
       this.q = m1.f(p0, 0x7f0a1d63);
       this.r = m1.f(p0, 0x7f0a2700);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveGiftReceiverListDialog$e.class, "1")) {
          return;
       }
       this.s = this.q8(LiveGiftReceiver.class);
       return;
    }
}
