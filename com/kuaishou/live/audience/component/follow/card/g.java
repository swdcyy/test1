package com.kuaishou.live.audience.component.follow.card.g;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.n;
import brd.t;
import t45.d;
import brd.z;
import qy0.m;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.audience.component.follow.LiveAudienceFollowCardUser;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.framework.model.user.UserInfo;
import wb5.g;
import b61.b;
import java.lang.CharSequence;
import android.widget.TextView;
import qy0.l;
import android.view.View$OnClickListener;
import android.graphics.drawable.Drawable;
import qy0.c;

public class g extends c	// class@000ad0
{
    public c p;
    public LiveAudienceFollowCardUser q;
    public KwaiImageView r;
    public TextView s;
    public TextView t;
    public TextView u;
    public static String sLivePresenterClassName = "LiveAudienceBaseActivityFollowCardUserItemPresenter";

    public void g(){
       super();
    }
    public void E8(){
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og, "2")) {
          return;
       }
       this.X7(RxBus.f.f(n.class).observeOn(d.a).subscribe(new m(this)));
       if (!PatchProxy.applyVoid(objArray, this, og, "4")) {
          LiveAudienceFollowCardUser mUserInfo = this.q.mUserInfo;
          if (mUserInfo != null) {
             g.d(this.r, mUserInfo, HeadImageSize.MIDDLE);
             this.s.setText(b.c(mUserInfo));
          }
          this.t.setText(this.q.mDescription);
          if (this.q.mIsFollowed != null) {
             this.R8();
          }else {
             this.P8();
          }
       }
       return;
    }
    public void J8(){
       PatchProxy.applyVoid(null, this, g.class, "3");
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, g.class, "5")) {
          return;
       }
       this.u.setText(R.string.arg_RES_7f100f8f);
       this.u.setOnClickListener(new l(this));
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, g.class, "7")) {
          return;
       }
       this.u.setBackground(null);
       this.u.setText(R.string.arg_RES_7f101034);
       this.u.setOnClickListener(null);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.p = this.r8("follow_card_user");
       this.q = this.q8(LiveAudienceFollowCardUser.class);
       return;
    }
}
