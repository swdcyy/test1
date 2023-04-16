package com.kuaishou.live.core.show.subscribe.choose.c$b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.show.subscribe.choose.c$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.subscribe.choose.LiveAnchorSubscribePhoto;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import android.widget.TextView;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import qk2.l;
import android.view.View$OnClickListener;
import z1.a;

public class c$b extends PresenterV2	// class@0010d4
{
    public LiveAnchorSubscribePhoto p;
    public a q;
    public KwaiImageView r;
    public TextView s;
    public static String sLivePresenterClassName = "LiveAnchorSubscribeSelectedPhotoListAdapter$ItemPresenter";

    public void c$b(){
       super();
    }
    public void c$b(c$a p0){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c$b.class, "3")) {
          return;
       }
       this.r.U(this.p.mCoverUrls);
       this.s.setText(TextUtils.k(this.p.mDuration));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "1")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a264e);
       this.s = m1.f(p0, 0x7f0a264f);
       m1.f(p0, R.id.live_subscribe_seleted_photo_delete_view).setOnClickListener(new l(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c$b.class, "2")) {
          return;
       }
       this.p = this.q8(LiveAnchorSubscribePhoto.class);
       this.q = this.t8("DELETE_CONSUMER");
       return;
    }
}
