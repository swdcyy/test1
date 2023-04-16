package com.kuaishou.live.core.show.subscribe.choose.a$b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.show.subscribe.choose.a$a;
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

public class a$b extends PresenterV2	// class@0010cc
{
    public KwaiImageView p;
    public LiveAnchorSubscribePhoto q;
    public TextView r;
    public static String sLivePresenterClassName = "LiveAnchorSubscribeChoosePhotoListAdapter$CommonItemPresenter";

    public void a$b(){
       super();
    }
    public void a$b(a$a p0){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "3")) {
          return;
       }
       this.p.U(this.q.mCoverUrls);
       this.r.setText(TextUtils.k(this.q.mDuration));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a2646);
       this.r = m1.f(p0, 0x7f0a18d7);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "2")) {
          return;
       }
       this.q = this.q8(LiveAnchorSubscribePhoto.class);
       return;
    }
}
