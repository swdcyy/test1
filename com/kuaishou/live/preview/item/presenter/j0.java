package com.kuaishou.live.preview.item.presenter.j0;
import k51.c;
import koc.c;
import com.yxcorp.gifshow.widget.d;
import d6a.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.User;
import lu7.f;
import android.text.SpannableStringBuilder;
import java.lang.CharSequence;
import com.yxcorp.gifshow.util.FakeBoldStyleSpan;
import android.widget.TextView;
import com.kuaishou.android.live.model.LiveStreamModel;
import java.util.Collection;
import ekd.q;
import android.view.View;
import oe6.b;
import com.kuaishou.live.preview.item.presenter.h0;
import com.yxcorp.gifshow.widget.KSTextDisplayHandler$a;
import com.yxcorp.utility.TextUtils;
import lnc.a1;
import rnc.i;
import wkd.b;
import nl9.c;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.framework.model.feed.BaseFeed;
import android.text.Spannable;
import com.yxcorp.gifshow.widget.TextWithEndTagView;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.live.basic.richtext.a;
import bc.b;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import im8.f;
import java.lang.Boolean;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.yxcorp.gifshow.entity.QPreInfo;
import az6.a;
import com.kuaishou.live.preview.item.presenter.i0;
import android.view.View$OnClickListener;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.c;
import rs5.a;
import ekd.m1;
import dl3.c1;
import dl3.d1;
import hl3.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class j0 extends c	// class@000e2a
{
    public TextWithEndTagView A;
    public final a B;
    public QPhoto p;
    public f q;
    public PhotoDetailParam r;
    public BaseFragment s;
    public LiveStreamModel t;
    public b u;
    public final c v;
    public final d w;
    public TextView x;
    public SlidePlayViewModel y;
    public SimpleDraweeSpanTextView z;

    public void j0(){
       super();
       this.v = new c();
       this.w = new d();
       this.B = new a();
    }
    public void E8(){
       j0 oj0 = j0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oj0, "4")) {
          return;
       }
       this.v.n(this.p.getTags());
       if (!PatchProxy.applyVoid(objArray, this, oj0, "7")) {
          String str = "@"+f.a(this.p.getUser());
          SpannableStringBuilder spannableStr = new SpannableStringBuilder(str);
          int i = 0;
          spannableStr.setSpan(new FakeBoldStyleSpan(i), i, str.length(), 33);
          this.x.setText(spannableStr);
          if (q.f(this.t.mPreviewCaptionRichTexts)) {
             if (!PatchProxy.applyVoid(objArray, this, oj0, "8")) {
                this.A.setVisibility(i);
                this.v.i(this.p, 3);
                this.v.j(b.G());
                this.v.a(true);
                this.w.b(h0.a);
                String caption = this.p.getCaption();
                if (TextUtils.x(caption) || TextUtils.n("...", caption)) {
                   int i1 = (this.p.isAd())? 0x7f10515e: 0x7f105198;
                   caption = a1.p(i1);
                }
                SpannableStringBuilder spannableStr1 = new SpannableStringBuilder(i.j(caption));
                b.a(-1050732302).c(this.p.mEntity, spannableStr1, this.getContext());
                this.w.a(spannableStr1);
                this.v.g(spannableStr1);
                this.A.setText(spannableStr1);
                PhotoAdvertisement photoAdverti = k.B(this.p);
                if (photoAdverti != null && !TextUtils.x(photoAdverti.mSourceDescription)) {
                   i = 1;
                }
                if (i) {
                   this.A.setTagText(photoAdverti.mSourceDescription);
                }else {
                   this.A.setTagText("");
                }
             }
             this.z.setVisibility(8);
          }else if(PatchProxy.applyVoid(objArray, this, oj0, "9")){
             if (!q.f(this.t.mPreviewCaptionRichTexts)) {
                this.z.setVisibility(i);
                oj0 = this.z;
                LiveStreamModel mPreviewCapt = this.t.mPreviewCaptionRichTexts;
                if (!PatchProxy.applyVoidTwoRefs(oj0, mPreviewCapt, objArray, a.class, "3")) {
                   CharSequence uCharSequenc = a.a(mPreviewCapt);
                   if (uCharSequenc instanceof b) {
                      oj0.setDraweeSpanStringBuilder(uCharSequenc);
                   }else {
                      oj0.setText(uCharSequenc);
                   }
                }
             }else {
                this.z.setVisibility(8);
             }
          }
          this.A.setVisibility(8);
       }
       if (this.s.getParentFragment() != null) {
          SlidePlayViewModel slidePlayVie = SlidePlayViewModel.S0(this.s.getParentFragment());
          this.y = slidePlayVie;
          if (slidePlayVie != null) {
             slidePlayVie.P(this.s, this.B);
          }
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, j0.class, "3")) {
          return;
       }
       this.v.k(a1.a(R.color.arg_RES_7f061ff3));
       this.v.l(1);
       this.w.h(1);
       this.w.f(a1.a(R.color.arg_RES_7f061ff3));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, j0.class, "5")) {
          return;
       }
       j0 ty = this.y;
       if (ty != null) {
          ty.D(this.s, this.B);
       }
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, j0.class, "6")) {
          return;
       }
       if (this.q.get().booleanValue()) {
          j0 tr = this.r;
          c.b(this.getActivity(), tr.mPhoto, tr.getDetailCommonParam().getPreInfo(), this.r.mPhotoIndex, false, null, i0.b);
       }else {
          this.u.b(false, true);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j0.class, "2")) {
          return;
       }
       this.x = m1.f(p0, 0x7f0a4387);
       SimpleDraweeSpanTextView simpleDrawee = m1.f(p0, R.id.live_preview_bottom_caption);
       this.z = simpleDrawee;
       simpleDrawee.setOnClickListener(new c1(this));
       TextWithEndTagView textWithEndT = m1.f(p0, R.id.live_preview_bottom_caption_tag_view);
       this.A = textWithEndT;
       textWithEndT.setOnClickListener(new d1(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j0.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.u = this.r8("LIVE_SIMPLE_ENTER_LIVE_SERVICE");
       this.q = this.x8("LIVE_ANCHOR_END");
       this.t = this.q8(LiveStreamModel.class);
       this.r = this.q8(PhotoDetailParam.class);
       this.s = this.r8("DETAIL_FRAGMENT");
       return;
    }
}
