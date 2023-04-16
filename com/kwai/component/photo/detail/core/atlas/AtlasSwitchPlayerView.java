package com.kwai.component.photo.detail.core.atlas.AtlasSwitchPlayerView;
import jd5.h;
import com.kwai.component.photo.detail.core.atlas.ImageSwitcher;
import android.content.Context;
import java.util.HashSet;
import com.kwai.component.photo.detail.core.atlas.AtlasSwitchPlayerView$a;
import android.util.AttributeSet;
import jd5.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import com.kuaishou.android.model.feed.ImageFeed;
import java.lang.Integer;
import android.view.View;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.List;
import kp.r1;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.Boolean;
import android.widget.ImageView;
import jd5.g;
import jd5.f;
import com.kuaishou.android.model.mix.ImageMeta;
import id5.v;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Runnable;
import ekd.k1;
import ekd.p0;
import android.view.ViewPropertyAnimator;

public class AtlasSwitchPlayerView extends ImageSwitcher implements h	// class@000a17
{
    public ImageFeed c;
    public int d;
    public int e;
    public boolean f;
    public Set g;
    public Set h;
    public Runnable i;

    public void AtlasSwitchPlayerView(Context p0){
       super(p0);
       this.f = false;
       this.g = new HashSet();
       this.h = new HashSet();
       this.i = new AtlasSwitchPlayerView$a(this);
    }
    public void AtlasSwitchPlayerView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.f = false;
       this.g = new HashSet();
       this.h = new HashSet();
       this.i = new AtlasSwitchPlayerView$a(this);
    }
    public void c(j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AtlasSwitchPlayerView.class, "12")) {
          return;
       }
       if (!this.m()) {
          return;
       }
       this.g.remove(p0);
       return;
    }
    public void d(ImageFeed p0,int p1,int p2){
       if (PatchProxy.isSupport(AtlasSwitchPlayerView.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, AtlasSwitchPlayerView.class, "9")) {
          return;
       }
       KwaiImageView childAt = this.getChildAt(p1);
       List list = r1.m0(p0, p2);
       if (!q.f(list)) {
          childAt.P(list);
       }
       return;
    }
    public final void e(ImageFeed p0,boolean p1){
       if (PatchProxy.isSupport(AtlasSwitchPlayerView.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, AtlasSwitchPlayerView.class, "8")) {
          return;
       }
       this.c = p0;
       int i = 1;
       KwaiImageView childAt = this.getChildAt(i);
       if (!childAt.getAlpha()) {
          childAt.setAlpha(0x3f800000);
       }
       this.d = 0;
       this.e = i;
       this.d(this.c, i, 0);
       this.d(this.c, 0, this.e);
       if (p1) {
          g.o(this.h, this.d, 0, this.f);
       }
       return;
    }
    public void g(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AtlasSwitchPlayerView.class, "14")) {
          return;
       }
       if (!this.m()) {
          return;
       }
       this.h.remove(p0);
       return;
    }
    public int getCurrentFrameIndex(){
       return this.d;
    }
    public int getCurrentIndex(){
       return g.a(this);
    }
    public void h(int p0,int p1,boolean p2){
       if (PatchProxy.isSupport(AtlasSwitchPlayerView.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), this, AtlasSwitchPlayerView.class, "3")) {
          return;
       }
       this.d = p0;
       int i = 1;
       this.e = p0 + i;
       p0 = this.c.mImageModel.getAtlasList().size();
       if (this.e >= p0) {
          this.e = 0;
       }
       KwaiImageView childAt = this.getChildAt(i);
       Object[] objArray = new Object[0];
       v.C().w("AtlasSwitchPlayerView", "seek: index:"+this.d+", top.alpha:"+childAt.getAlpha()+",nextIndex:"+this.e+", size:"+p0, objArray);
       if (!childAt.getAlpha()) {
          childAt.setAlpha(0x3f800000);
       }
       this.d(this.c, i, this.d);
       this.d(this.c, 0, this.e);
       if (p2) {
          this.play();
       }
       g.o(this.h, this.d, p1, p2);
       return;
    }
    public void l(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AtlasSwitchPlayerView.class, "13")) {
          return;
       }
       if (!this.m()) {
          return;
       }
       this.h.add(p0);
       return;
    }
    public boolean m(){
       AtlasSwitchPlayerView obj = PatchProxy.apply(null, this, AtlasSwitchPlayerView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.c;
       boolean b = true;
       if (obj == null || (obj.mImageModel.getAtlasList() == null || this.c.mImageModel.getAtlasList().size() <= b)) {
          b = false;
       }
       return b;
    }
    public void p(ImageFeed p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AtlasSwitchPlayerView.class, "7")) {
          return;
       }
       this.e(p0, true);
       return;
    }
    public void pause(){
       if (PatchProxy.applyVoid(null, this, AtlasSwitchPlayerView.class, "5")) {
          return;
       }
       if (!this.m()) {
          return;
       }
       this.f = false;
       k1.m(this.i);
       g.n(this.g);
       return;
    }
    public void play(){
       if (PatchProxy.applyVoid(null, this, AtlasSwitchPlayerView.class, "2")) {
          return;
       }
       if (this.f != null || (this.m() && p0.C(this.getContext()))) {
          this.f = true;
          k1.m(this.i);
          k1.r(this.i, 2000);
          g.p(this.g);
       }
    label_0035 :
       return;
    }
    public void release(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AtlasSwitchPlayerView.class, "6")) {
          return;
       }
       this.f = false;
       this.d = 0;
       this.e = 0;
       if (!PatchProxy.applyVoid(objArray, this, ImageSwitcher.class, "5")) {
          KwaiImageView childAt = this.getChildAt(1);
          if (childAt.animate() != null) {
             childAt.animate().cancel();
          }
       }
       k1.m(this.i);
       g.q(this.g);
       this.e(this.c, false);
       return;
    }
    public void reset(){
       g.h(this);
    }
    public void resume(){
       if (PatchProxy.applyVoid(null, this, AtlasSwitchPlayerView.class, "4")) {
          return;
       }
       if (this.f == null && this.m()) {
          this.f = true;
          k1.m(this.i);
          k1.r(this.i, 2000);
          g.p(this.g);
       }
       return;
    }
    public void setImageVisibility(int p0){
       if (PatchProxy.isSupport(AtlasSwitchPlayerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, AtlasSwitchPlayerView.class, "10")) {
          return;
       }
       super.setVisibility(p0);
       return;
    }
    public void w(j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AtlasSwitchPlayerView.class, "11")) {
          return;
       }
       if (!this.m()) {
          return;
       }
       this.g.add(p0);
       return;
    }
}
