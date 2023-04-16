package com.yxcorp.gifshow.activity.share.presenter.m2;
import com.yxcorp.gifshow.activity.share.presenter.r1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.share.presenter.c0;
import f66.i;
import jq.a;
import q87.c;
import com.yxcorp.gifshow.activity.share.presenter.l2;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import im8.f;
import java.io.File;
import com.yxcorp.gifshow.activity.share.presenter.m2$g;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.activity.preview.f;
import android.view.View;
import com.yxcorp.gifshow.activity.share.player.PreviewPlayer;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import oa0.a;
import java.lang.CharSequence;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import android.util.Pair;
import lnc.p6;
import java.lang.Boolean;
import com.yxcorp.gifshow.activity.share.presenter.k2;
import io.reactivex.g;
import brd.t;
import t45.d;
import brd.z;
import zw8.z4;
import com.yxcorp.gifshow.activity.share.presenter.m2$h;
import zw8.y4;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.widget.PicturesContainer;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.activity.share.presenter.m2$f;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kwai.robust.PatchProxyResult;
import java.lang.Float;
import java.lang.Number;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import vw8.a;
import com.yxcorp.gifshow.activity.share.presenter.m2$a;
import e46.b;
import android.widget.TextView;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import com.yxcorp.gifshow.activity.share.presenter.m2$b;
import jp.a;
import com.yxcorp.gifshow.activity.share.presenter.m2$d;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.framework.model.feed.BaseFeed;
import ub.b;
import wb5.h;
import com.yxcorp.gifshow.activity.share.presenter.m2$e;
import ekd.m1;
import java.lang.Integer;
import android.net.Uri;
import ekd.x0;
import com.yxcorp.gifshow.activity.share.presenter.m2$c;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public class m2 extends r1	// class@00140e
{
    public View U0;
    public RelativeLayout V0;
    public int W0;
    public KwaiImageView Z;

    public void m2(){
       super();
       this.W0 = -1;
    }
    public void E8(){
       m2 om2 = m2.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, om2, "2")) {
          return;
       }
       super.E8();
       Object[] objArray1 = new Object[0];
       a.b().w("SharePreviewPresenter", "onBind", objArray1);
       if (!PatchProxy.applyVoid(objArray, this, om2, "4") && this.q != null) {
          this.Z.setOnClickListener(new l2(this));
       }
       this.S8();
       return;
    }
    public void R8(){
       Object[] objArray1;
       if (PatchProxy.applyVoid(null, this, m2.class, "16")) {
          return;
       }
       if (this.y == null) {
          return;
       }
       if (this.z.get() != null) {
          int i = 0;
          Object[] objArray = new Object[i];
          a.b().w("SharePreviewPresenter", "autoCropCoverIfNeeded\(\) ", objArray);
          c0 ty = this.y;
          File uFile = this.z.get();
          m2$g og = new m2$g(this);
          if (!PatchProxy.applyVoidThreeRefs(ty, uFile, og, this, m2.class, "17")) {
             if (f.j(ty.a1())) {
                objArray1 = new Object[i];
                a.b().w("SharePreviewPresenter", "cropVideoCoverIfNeeded: current type is picture", objArray1);
             }else {
                c0 tq = this.q;
                if (tq != null && (tq.b() == null || !this.q.b() instanceof VideoSDKPlayerView)) {
                   objArray1 = new Object[i];
                   a.b().w("SharePreviewPresenter", "cropVideoCoverIfNeeded: mPreviewPlayer.getPlayerView = "+this.q, objArray1);
                }else if(a.b()){
                   tq = this.H;
                   if (tq != null && tq.contains("preview")) {
                      objArray1 = new Object[i];
                      a.b().w("SharePreviewPresenter", "autoCropCoverIfNeeded\(\) auto crop cover bubble already showed", objArray1);
                   }
                }
                VideoSDKPlayerView videoSDKPlay = this.q.b();
                int videoWidth = videoSDKPlay.getVideoWidth();
                Size size = new Size(videoWidth, videoSDKPlay.getVideoHeight());
                Pair pair = p6.a(ty, size);
                if (pair.second.booleanValue()) {
                   objArray1 = new Object[i];
                   a.b().w("SharePreviewPresenter", "cropVideoCoverIfNeeded: need auto crop cover", objArray1);
                   p6.k(ty, pair.first);
                   this.X7(t.create(new k2(ty, size, uFile)).observeOn(d.c).subscribeOn(d.a).subscribe(new z4(og), new y4(og)));
                }
             }
          }
       }
       return;
    }
    public void Z8(Workspace$Type p0,PicturesContainer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, m2.class, "15")) {
          return;
       }
       super.Z8(p0, p1);
       if (p0 == Workspace$Type.LONG_PICTURE || p0 == Workspace$Type.SINGLE_PICTURE) {
          RecyclerView recyclerView = p1.findViewById(R.id.picture_recycler_view);
          recyclerView.addOnScrollListener(new m2$f(this, recyclerView));
       }
       return;
    }
    public void d9(float p0){
       Object[] objArray;
       int i1;
       int i2;
       c0 tu;
       a b;
       Object obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       m2 om2 = m2.class;
       if (PatchProxy.isSupport(om2) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, om2, "10")) {
          return;
       }
       int i = 0;
       if (this.z.get() != null) {
          objArray = new Object[i];
          a.b().w("SharePreviewPresenter", "setCoverView coverFile: "+this.z.get().getAbsolutePath()+", isExist: "+this.z.get().exists()+" coverRatio： "+p0, objArray);
       }
       QPhoto qPhoto = null;
       if (p0 - 0x3f828f5c <= 0 && p0 - 0x3f7ae148 >= 0) {
          Object[] objArray1 = new Object[i];
          a.b().s("SharePreviewPresenter", "方形视频", objArray1);
          i1 = this.s9();
          i2 = this.s9();
       }else if(p0 - 0x3f800000 < 0){
          objArray = new Object[i];
          a.b().s("SharePreviewPresenter", "竖屏视频", objArray);
          i2 = this.s9();
          obj = PatchProxy.apply(qPhoto, this, om2, "7");
          if (obj != patchProxyRe) {
             i1 = obj.intValue();
          }else {
             i1 = a1.d(R.dimen.arg_RES_7f070270);
          }
       }else {
          objArray = new Object[i];
          a.b().s("SharePreviewPresenter", "横屏视频", objArray);
          Object obj1 = PatchProxy.apply(qPhoto, this, om2, "8");
          i2 = (obj1 != patchProxyRe)? obj1.intValue(): a1.d(R.dimen.arg_RES_7f070268);
          obj = PatchProxy.apply(qPhoto, this, om2, "9");
          if (obj != patchProxyRe) {
             i1 = obj.intValue();
          }else {
             i1 = a1.d(R.dimen.arg_RES_7f07034c);
          }
       }
       i2 = i1;
       i1 = i2;
       ViewGroup$LayoutParams layoutParams = this.V0.getLayoutParams();
       layoutParams.width = i1;
       layoutParams.height = i2;
       this.V0.setVisibility(i);
       this.V0.setLayoutParams(layoutParams);
       int i3 = 8;
       if (!DraftUtils.W(this.G, this.y)) {
          this.v.setVisibility(i3);
          if (this.V8(this.y)) {
             a.t(qPhoto);
             this.v.setVisibility(i);
             this.v.setOnClickListener(new m2$a(this));
          }
       }else if(!PatchProxy.applyVoid(qPhoto, this, om2, "11") && (this.u == null || this.v == null)){
          if (DraftUtils.W(this.G, this.y) && b.a(this.G)) {
             this.u.setText(R.string.arg_RES_7f100f11);
             if (!a.p0()) {
                Drawable drawable = ContextCompat.getDrawable(this.getContext(), R.drawable.arg_RES_7f082362);
                drawable.setBounds(i, i, a1.d(R.dimen.arg_RES_7f070334), a1.d(R.dimen.arg_RES_7f070334));
                this.u.setCompoundDrawablesWithIntrinsicBounds(qPhoto, qPhoto, drawable, qPhoto);
                this.u.setCompoundDrawablePadding(a1.d(R.dimen.arg_RES_7f0702e3));
             }
          }else {
             this.u.setText(R.string.arg_RES_7f100f15);
          }
          this.v.setVisibility(i);
          a.t(this.G);
       }
       if (!PatchProxy.isSupport(om2) || !PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, om2, "3")) {
          if (this.U0 == null) {
             objArray = new Object[i];
             a.b().t("SharePreviewPresenter", "initPlayIcon mVideoPlayIcon is null", objArray);
          }else {
             tu = this.y;
             if (tu != null && DraftUtils.V(tu)) {
                this.U0.setVisibility(i3);
             }else {
                tu = this.G;
                if (tu != null && !tu.isVideoType()) {
                   this.U0.setVisibility(i3);
                }else {
                   this.U0.setVisibility(i);
                }
             }
          }
       }
       if (this.z.get() != null) {
          Object[] objArray2 = new Object[i];
          a.b().w("SharePreviewPresenter", "setCoverView cover file is not null", objArray2);
          this.W0 = -1;
          this.q9(i1, i2);
          String absolutePath = this.z.get().getAbsolutePath();
          if (!PatchProxy.applyVoidOneRefs(absolutePath, this, om2, "14")) {
             c0 tq = this.q;
             if (tq != null && tq.b() instanceof VideoSDKPlayerView) {
                this.q.b().setCoverPath(absolutePath);
             }
          }
          if (DraftUtils.W(this.G, this.y) && (this.G.isSinglePhoto() || this.G.isKtvSong())) {
             tu = this.u;
             if (tu != null) {
                tu.setText(a1.p(R.string.arg_RES_7f100f0b));
             }
          }
       }else if(DraftUtils.W(this.G, this.y)){
          Object[] objArray3 = new Object[i];
          a.b().w("SharePreviewPresenter", "setCoverView use qphoto", objArray3);
          this.v.setOnClickListener(new m2$b(this));
          if (!PatchProxy.applyVoid(qPhoto, this, om2, "13") && DraftUtils.W(this.G, this.y)) {
             b = a.b;
             h.e(this.Z, this.G.mEntity, i, b, new m2$d(this));
             tu = this.q;
             if (tu != null && tu.b() instanceof VideoSDKPlayerView) {
                h.e(this.q.b().getCoverView(), this.G.mEntity, i, b, new m2$e(this));
             }
          }
          if (this.G.isSinglePhoto() || this.G.isKtvSong()) {
             tu = this.u;
             if (tu != null) {
                tu.setText(a1.p(R.string.arg_RES_7f100f0b));
             }
          }
       }
    label_02d4 :
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m2.class, "1")) {
          return;
       }
       super.doBindView(p0);
       this.Z = m1.f(p0, 0x7f0a3195);
       this.U0 = m1.f(p0, 0x7f0a4403);
       this.V0 = m1.f(p0, 0x7f0a0ef1);
       Object[] objArray = new Object[0];
       a.b().w("SharePreviewPresenter", "doBindView", objArray);
       return;
    }
    public void m9(){
       if (PatchProxy.applyVoid(null, this, m2.class, "13")) {
          return;
       }
       if (DraftUtils.W(this.G, this.y)) {
          a b = a.b;
          h.e(this.Z, this.G.mEntity, false, b, new m2$d(this));
          c0 tq = this.q;
          if (tq != null && tq.b() instanceof VideoSDKPlayerView) {
             h.e(this.q.b().getCoverView(), this.G.mEntity, false, b, new m2$e(this));
          }
       }
       return;
    }
    public void q9(int p0,int p1){
       m2 om2 = m2.class;
       if (PatchProxy.isSupport(om2) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, om2, "12")) {
          return;
       }
       om2 = this.W0;
       int i = 1;
       if (om2 >= i) {
          return;
       }
       this.W0 = om2 + i;
       this.Z.B(x0.e(this.z.get()), p0, p1, new m2$c(this, p0, p1));
       return;
    }
    public final int s9(){
       Object obj = PatchProxy.apply(null, this, m2.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.d(0x7f070352);
    }
}
