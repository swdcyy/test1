package com.yxcorp.gifshow.homepage.presenter.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.model.config.FeedNegativeFeedback;
import com.kwai.component.photo.reduce.g;
import com.kuaishou.android.model.feed.ActivityTemplateFeed;
import com.kuaishou.android.model.mix.TemplateFeedMeta;
import java.lang.CharSequence;
import android.widget.TextView;
import java.util.Collection;
import ekd.q;
import android.view.View;
import yta.c;
import android.view.View$OnLongClickListener;
import yta.b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.robust.PatchProxyResult;
import y8c.d;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import k2b.l0;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.StringBuilder;
import k2b.u1;
import java.lang.Boolean;
import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import yf5.a;
import com.yxcorp.gifshow.homepage.presenter.a$a;
import yta.a;
import java.util.List;
import yf5.l0$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.Fragment;
import yf5.l0;
import com.kwai.library.widget.popup.common.c;

public class a extends PresenterV2	// class@0017b0
{
    public final int p;
    public RecyclerFragment q;
    public QPhoto r;
    public ActivityTemplateFeed s;
    public d t;
    public TextView u;
    public KwaiImageView v;

    public void a(int p0){
       super();
       this.p = p0;
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "3")) {
          return;
       }
       FeedNegativeFeedback uFeedNegativ = g.d(new QPhoto(this.s), false, true);
       this.u.setText(this.s.mTemplateFeedModel.mRightDownTip);
       if (uFeedNegativ != null && !q.f(uFeedNegativ.mPhotoNegative)) {
          this.m8().setOnLongClickListener(new c(this, uFeedNegativ));
          this.u.setVisibility(false);
          this.u.setCompoundDrawablesWithIntrinsicBounds(false, false, R.drawable.arg_RES_7f080a25, false);
          this.u.setOnClickListener(new b(this, uFeedNegativ));
       }else {
          this.m8().setOnLongClickListener(objArray);
          this.u.setCompoundDrawablesWithIntrinsicBounds(false, false, false, false);
          this.u.setOnClickListener(objArray);
       }
       if (this.s.isLive()) {
          this.v.setImageResource(R.drawable.arg_RES_7f08098f);
          this.v.setVisibility(false);
       }else {
          this.v.setVisibility(8);
       }
       return;
    }
    public final ClientContent$ContentPackage P8(){
       ClientContent$ContentPackage obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       obj.photoPackage = w1.g(this.r.mEntity, (this.t.get() + 1));
       ActivityTemplateFeed mCommonMeta = this.s.mCommonMeta;
       if (mCommonMeta != null) {
          obj.ksOrderInfoPackage = l0.a(mCommonMeta.mKsOrderId);
       }
       return obj;
    }
    public final void R8(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "6")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "OPERATION_NEGATIVE_FEEDBACK";
       uElementPack.params = "{\"click_type\":"+p0+"}";
       u1.u(1, uElementPack, this.P8());
       return;
    }
    public final void S8(View p0,boolean p1,FeedNegativeFeedback p2){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, a.class, "4")) {
          return;
       }
       if (this.getActivity() == null) {
          return;
       }
       this.q.h0().requestDisallowInterceptTouchEvent(true);
       if (!PatchProxy.applyVoid(null, this, uoa, "5")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "OPERATION_ONE_LEVEL_DIALOG";
          u1.u0(3, uElementPack, this.P8());
       }
       a.b(false);
       l0$a uoa1 = new l0$a(new QPhoto(this.s)).j(p0).h(p2.mPhotoNegative).g(g.e(p2.mPhotoNegativeHeader, R.string.arg_RES_7f1038d6));
       uoa1.c(new a(this));
       uoa1.k(new a$a(this));
       uoa1.i(this.p);
       uoa1 = uoa1.b(this.getActivity());
       uoa1.f(this.q);
       uoa1.m = p1;
       g.j(uoa1.a());
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.u = p0.findViewById(0x7f0a3bd9);
       this.v = p0.findViewById(0x7f0a215e);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.q = this.r8("FRAGMENT");
       this.r = this.q8(QPhoto.class);
       this.s = this.q8(ActivityTemplateFeed.class);
       this.t = this.r8("ADAPTER_POSITION_GETTER");
       return;
    }
}
