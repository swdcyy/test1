package com.yxcorp.gifshow.v3.editor.ktv.crop.h;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.v3.editor.ktv.crop.h$a;
import com.yxcorp.gifshow.v3.editor.ktv.crop.h$b;
import kwc.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.yxcorp.gifshow.v3.editor.i;
import com.kwai.video.editorsdk2.PreviewEventListenerV2;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.editor.ktv.crop.KtvSongTimeLineView;
import android.content.Context;
import com.yxcorp.gifshow.v3.editor.ktv.crop.KtvMvTimeLineView;
import android.widget.HorizontalScrollView;
import android.view.View;
import com.yxcorp.gifshow.edit.draft.model.c;
import mwc.p;
import android.widget.ImageView;
import com.yxcorp.gifshow.widget.CustomHorizontalScroller;
import com.yxcorp.gifshow.v3.editor.ktv.crop.h$c;
import com.yxcorp.gifshow.widget.CustomHorizontalScroller$b;
import crc.d;
import com.yxcorp.gifshow.v3.editor.ktv.crop.KtvBaseTimeLineView$b;
import com.yxcorp.gifshow.v3.editor.ktv.crop.KtvBaseTimeLineView;
import java.util.Objects;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import android.widget.TextView;
import com.yxcorp.gifshow.v3.editor.ktv.crop.KtvCropRangeView;
import java.lang.CharSequence;
import android.widget.FrameLayout;
import java.lang.Boolean;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.yxcorp.gifshow.v3.previewer.ktv.p$a;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.yxcorp.gifshow.v3.previewer.ktv.p;
import faa.a;
import q87.c;
import ekd.m1;
import crc.c;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.editor.ktv.crop.KtvCropFragment;
import uaa.a;

public class h extends PresenterV2	// class@000fcb
{
    public y A;
    public CustomHorizontalScroller p;
    public ImageView q;
    public KtvCropFragment r;
    public String s;
    public Set t;
    public i u;
    public a v;
    public KtvInfo w;
    public VideoSDKPlayerView x;
    public KtvBaseTimeLineView y;
    public VideoSDKPlayerView$e z;

    public void h(){
       super();
       this.z = new h$a(this);
       this.A = new h$b(this);
       this.U7(new u());
    }
    public void E8(){
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh, "3")) {
          return;
       }
       this.t.add(this.A);
       h tu = this.u;
       if (tu != null) {
          VideoSDKPlayerView videoSDKPlay = tu.j();
          this.x = videoSDKPlay;
          if (videoSDKPlay != null) {
             videoSDKPlay.setPreviewEventListener(this.s, this.z);
          }
          KtvSongTimeLineView ktvSongTimeL = (this.u.f().getType() == Workspace$Type.KTV_SONG)? new KtvSongTimeLineView(this.getContext()): new KtvMvTimeLineView(this.getContext());
          this.y = ktvSongTimeL;
          this.p.removeAllViews();
          this.p.addView(this.y, -1, -1);
       }
       if (!PatchProxy.applyVoid(objArray, this, oh, "7")) {
          this.v.c0();
          if (p.a() != null) {
             p.a().j();
          }
          oh = this.x;
          boolean b = false;
          if (oh != null && !oh.isReleased()) {
             this.x.setLoop(b);
             this.x.seekToPlaybackStart();
             if (!this.x.isPlaying()) {
                this.x.play();
             }else {
                this.q.setImageResource(R.drawable.arg_RES_7f0807ed);
             }
          }
          oh = this.p;
          if (oh != null) {
             oh.scrollTo(b, b);
          }
       }
       this.p.setOnScrollListener(new h$c(this));
       oh = this.y;
       if (oh != null) {
          oh.setRangeChangeListener(new d(this));
          oh = this.y;
          h tu1 = this.u;
          View view = this.m8();
          h tw = this.w;
          Objects.requireNonNull(oh);
          if (!PatchProxy.applyVoidThreeRefs(tu1, view, tw, oh, KtvBaseTimeLineView.class, "1")) {
             oh.b = tu1;
             oh.h = (float)tw.mSingDuration;
             oh.n = (float)tw.mMinEditCropDuration / 1000.00f;
             oh.c = tw;
             oh.f = view.findViewById(0x7f0a1671);
             TextView textView = view.findViewById(R.id.ktv_crop_tips);
             oh.e = textView;
             KtvBaseTimeLineView d = oh.d;
             d.b = oh;
             d.d = tu1;
             d.c = oh.f;
             textView.setText(oh.d(((float)(tw.mCropEnd - tw.mCropBegin) / 1000.00f)));
             oh.e(tu1);
             oh.requestLayout();
          }
       }
       return;
    }
    public void H8(){
       h oh = h.class;
       if (PatchProxy.applyVoid(null, this, oh, "6")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, oh, "4")) {
          this.t.remove(this.A);
          oh = this.x;
          if (oh != null) {
             oh.setPreviewEventListener(this.s, null);
          }
       }
       return;
    }
    public void P8(boolean p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oh, "8")) {
          return;
       }
       oh = this.x;
       if (oh != null && !oh.isReleased()) {
          this.x.setLoop(true);
       }
       if (p0) {
          RxBus.f.b(new p$a());
       }else {
          h ty = this.y;
          Objects.requireNonNull(ty);
          if (!PatchProxy.applyVoid(null, ty, KtvBaseTimeLineView.class, "15")) {
             p op = p.a();
             op.i();
             p.r(ty.getProject(), ty.c);
             p.q(ty.b);
             ty.u = (float)(int)(((float)op.c() * ty.i) / 1000.00f);
             ty.v = (float)(int)(((float)op.d() * ty.i) / 1000.00f);
             ty.h();
             ty.requestLayout();
             Object[] objArray = new Object[0];
             a.D().w("ktv_log", "onRestore", objArray);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a1671);
       this.q = m1.f(p0, 0x7f0a1636);
       m1.a(p0, new c(this), R.id.ktv_crop_play_control);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.r = this.r8("FRAGMENT");
       this.s = this.r8("PAGE_TAG");
       this.t = this.r8("EDITOR_VIEW_LISTENERS");
       this.u = this.r8("EDITOR_HELPER_CONTRACT");
       this.v = this.r8("KARAOKE");
       this.w = this.r8("KTV_INFO");
       return;
    }
}
