package com.yxcorp.gifshow.ad.detail.comment.presenter.fake.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import i59.f$b;
import android.content.Context;
import com.yxcorp.gifshow.entity.QPhoto;
import n49.s;
import g59.e;
import mxb.c;
import com.yxcorp.gifshow.util.rx.RxBus;
import wl9.b;
import brd.t;
import t45.d;
import brd.z;
import vy8.b;
import erd.g;
import crd.b;
import vy8.c;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle;
import com.yxcorp.gifshow.ad.detail.comment.presenter.fake.FakeCommentContentPresenter$1;
import java.lang.Runnable;
import androidx.lifecycle.LifecycleObserver;
import wkd.b;
import s59.s;
import vy8.e;
import s59.b;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import al9.a;
import android.view.View;
import android.text.SpannableStringBuilder;
import com.kuaishou.android.model.mix.QComment;
import java.lang.CharSequence;
import vy8.d;
import i59.f;
import android.app.Application;
import o56.a;
import android.graphics.drawable.Drawable;
import ync.a;
import y17.a;
import i59.f$a;
import msd.a;
import android.text.method.MovementMethod;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import ekd.m1;
import com.yxcorp.gifshow.widget.textview.CommentTextView;
import n49.o;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;

public class c extends PresenterV2	// class@00154a
{
    public CommentTextView p;
    public View q;
    public CommentsFragment r;
    public QComment s;
    public QPhoto t;
    public o u;
    public f$b v;
    public LifecycleObserver w;
    public b x;

    public void c(){
       super();
    }
    public static void P8(c p0){
       p0.R8();
    }
    public void E8(){
       c uoc = c.class;
       if (PatchProxy.applyVoid(null, this, uoc, "3")) {
          return;
       }
       c tt = this.t;
       this.v = new f$b(s.m(this.t, this.getContext()), s.n(this.t, this.getContext()), c.p(tt, e.a(tt)));
       this.R8();
       this.X7(RxBus.f.f(b.class).observeOn(d.a).subscribe(new b(this)));
       c uoc1 = new c(this);
       if (!PatchProxy.applyVoidOneRefs(uoc1, this, uoc, "6") && k.B(this.t).mConversionType == 1) {
          Activity activity = this.getActivity();
          if (activity instanceof LifecycleOwner) {
             FakeCommentContentPresenter$1 u1 = new FakeCommentContentPresenter$1(this, uoc1);
             this.w = u1;
             activity.getLifecycle().addObserver(u1);
          }
       }
       uoc1 = new c(this);
       if (!PatchProxy.applyVoidOneRefs(uoc1, this, uoc, "8") && k.B(this.t).mConversionType == 1) {
          e uoe = new e(this, uoc1);
          this.x = uoe;
          b.a(-901401630).r(uoe);
       }
       if (this.r.q() instanceof a) {
          if (this.r.q().J0()) {
             this.q.setVisibility(8);
          }else {
             this.q.setVisibility(0);
          }
       }
       return;
    }
    public void J8(){
       c uoc = c.class;
       if (PatchProxy.applyVoid(null, this, uoc, "5")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, uoc, "7")) {
          Activity activity = this.getActivity();
          if (activity instanceof LifecycleOwner && this.w != null) {
             activity.getLifecycle().removeObserver(this.w);
             this.w = null;
          }
       }
       if (!PatchProxy.applyVoid(null, this, uoc, "9") && this.x != null) {
          b.a(-901401630).v(this.x);
          this.x = null;
       }
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       SpannableStringBuilder spannableStr = new SpannableStringBuilder(this.s.mComment);
       if (!c.Z(this.t)) {
          c tv = this.v;
          d uod = new d(this);
          if (!PatchProxy.applyVoidThreeRefs(spannableStr, tv, uod, null, f.class, "9")) {
             spannableStr.append(" ");
             int i = spannableStr.length();
             spannableStr.append("${ad}");
             Drawable uDrawable = a.g(a.b(), tv.b, tv.a);
             a uoa = new a(uDrawable, "${ad}");
             int intrinsicWid = uDrawable.getIntrinsicWidth();
             uoa.c(intrinsicWid, uDrawable.getIntrinsicHeight());
             intrinsicWid = i + 5;
             spannableStr.setSpan(uoa, i, intrinsicWid, 33);
             spannableStr.append(tv.c);
             spannableStr.setSpan(new f$a(tv, uod), intrinsicWid, ((tv.c).length() + intrinsicWid), 33);
          }
          this.p.setMovementMethod(LinkMovementMethod.getInstance());
          this.p.setHighlightColor(0);
       }
       this.p.setText(spannableStr);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0846);
       this.q = m1.f(p0, 0x7f0a4377);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.s = this.q8(QComment.class);
       this.t = this.q8(QPhoto.class);
       this.u = this.r8("PHOTO_AD_ACTION_BAR_CLICK_PROCESSOR");
       this.r = this.t8("FRAGMENT");
       return;
    }
}
