package id9.z;
import ui9.b;
import oc9.d0;
import lnc.a1;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.base.d;
import qc9.a;
import com.yxcorp.gifshow.camera.record.video.viewbinder.bottom.AbsRecordBottomBarViewBinder;
import oh9.a;
import id9.u;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.EffectSlot;
import com.kwai.video.westeros.models.EffectResource;
import ui9.a;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import vf9.y1;
import q16.a$a;
import com.yxcorp.gifshow.camerasdk.recorder.a;
import com.kwai.robust.PatchProxyResult;
import java.io.File;
import com.yxcorp.gifshow.util.PostUtils;
import hd9.n;
import qkd.c;
import com.kuaishou.android.model.music.Music;
import java.lang.Math;
import org.json.JSONObject;
import e16.b;
import com.kwai.framework.model.feed.BaseFeed;
import s8c.a;
import java.lang.Throwable;
import q87.c;
import java.util.Objects;
import android.os.Parcelable;
import org.parceler.b;
import java.lang.Long;
import com.kwai.feature.post.api.music.data.MusicSource;
import hd9.a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import pi9.e;
import android.view.View;
import lnc.f5;
import lnc.s6;
import com.yxcorp.utility.n;
import android.widget.TextView;
import qh9.c;
import hd9.m0;
import java.lang.Integer;
import android.view.ViewParent;
import android.view.ViewStub;
import c35.p;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import brd.t;
import id9.v;
import erd.g;
import t45.d;
import brd.z;
import id9.y;
import crd.b;
import com.kuaishou.android.model.feed.VideoFeed;
import tl8.d;
import hd9.o;
import qxc.b;
import pi9.i;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import xb.t$b;
import com.facebook.drawee.view.SimpleDraweeView;
import hf9.b;
import hf9.b$a;
import android.content.Intent;
import java.io.Serializable;
import ekd.j0;
import vf9.g0;
import id9.w;
import mc9.a;
import id9.x;

public class z extends d0 implements b	// class@002800
{
    public AbsRecordBottomBarViewBinder A;
    public KwaiImageView o;
    public View p;
    public KwaiImageView q;
    public View r;
    public TextView s;
    public ImageView t;
    public ViewStub u;
    public KwaiImageView v;
    public Music w;
    public BaseFeed x;
    public String y;
    public Bitmap z;
    public static final int B;
    public static final int C;

    static {
       z.B = a1.e(9.50f);
       z.C = a1.e(0);
    }
    public void z(CameraPageType p0,b p1){
       super(p0, p1);
       d tf = this.f;
       if (tf instanceof a) {
          this.A = tf.zb();
       }
       this.d.n(a.class, new u(this));
       return;
    }
    public void S1(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       a.b(this, p0, p1, p2, p3);
    }
    public void X0(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       if (PatchProxy.isSupport(z.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, z.class, "5")) {
          return;
       }
       if (this.d.d(y1.c).b == null) {
          this.g2(false);
       }
       return;
    }
    public void de(a$a p0,a p1){
       boolean b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, z.class, "3")) {
          return;
       }
       if (this.w == null) {
          return;
       }
       String absolutePath = new File(PostUtils.n(), "followshoot_audio.mp4").getAbsolutePath();
       c.d(this.d.d(n.j).b, absolutePath);
       p1.i = absolutePath;
       z tw = this.w;
       long l = (long)tw.mKtvBeginTime;
       Music mDuration = tw.mDuration;
       int i = (mDuration > null)? Math.min((mDuration * 1000), p1.c): p1.c * 1000;
       JSONObject jSONObject = b.a(tw, l, (long)i, true);
       try{
          jSONObject.put("tagSourcePhotoId", this.x.getId());
       }catch(org.json.JSONException e2){
          a.D().z("FSMusicController", "FSMusicController", e2);
       }
       z oz = 1;
       Objects.requireNonNull(p0);
       if (PatchProxy.isSupport(a$a.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.TRUE, p0, a$a.class, "18");
          if (obj != PatchProxyResult.class) {
             b = obj;
          label_0081 :
             b = b.N(b.c(this.w)).M(jSONObject.toString());
             Objects.requireNonNull(b);
             if (PatchProxy.isSupport(a$a.class)) {
                jSONObject = PatchProxy.applyOneRefs(Long.valueOf(200), b, a$a.class, "21");
                if (jSONObject != PatchProxyResult.class) {
                   b = jSONObject;
                label_00b0 :
                   b.P(MusicSource.REC_SAME_MUSIC).K(this.w);
                   return;
                }
             }
             b.q1 = 200;
             goto label_00b0 ;
          }
       }
       p0.n1 = oz;
       goto label_0081 ;
    }
    public final void g2(boolean p0){
       z oz = z.class;
       if (PatchProxy.isSupport(oz) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oz, "6")) {
          return;
       }
       Bitmap uBitmap = null;
       if (!p0) {
          if (this.w != null) {
             this.d.m(new a());
          }
          this.z = uBitmap;
          this.h2(8);
          this.o.i0();
          this.o.setForegroundDrawable(uBitmap);
          boolean b = false;
          this.o.setSelected(b);
          if (e.e()) {
             f5.c(this.o, this.q, this.r, b, b);
          }else {
             this.o.setPadding(z.C, z.C, z.C, z.C);
             this.o.setImageDrawable(a1.f(R.drawable.arg_RES_7f081c25));
             if (s6.m()) {
                n.Y(this.q, 4, b);
             }
          }
          z ts = this.s;
          if (ts != null) {
             ts.setText(R.string.arg_RES_7f103703);
          }
       }
       this.w = uBitmap;
       this.d.m(new c(true));
       this.d.m(new m0());
       return;
    }
    public void h(EffectDescription p0,EffectSlot p1){
       a.a(this, p0, p1);
    }
    public final void h2(int p0){
       z oz = z.class;
       if (PatchProxy.isSupport(oz) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oz, "8")) {
          return;
       }
       if (p0) {
          z tu = this.u;
          if (tu != null && tu.getParent() != null) {
             return;
          }
       }
       if (PatchProxy.applyVoid(null, this, oz, "7") || (!e.e() && !s6.m())) {
          oz = this.A;
          this.t = (oz != null)? oz.L(): p.c(this.l, 0x7f0a05c6, 0x7f0a05c5);
       }
    label_0054 :
       n.Y(this.t, p0, false);
       return;
    }
    public final void i2(){
       if (PatchProxy.applyVoid(null, this, z.class, "10")) {
          return;
       }
       if (this.w != null && !TextUtils.x(this.y)) {
          this.Y1(t.just("").doOnNext(new v(this)).subscribeOn(d.c).observeOn(d.a).subscribe(new y(this)));
          this.o.setSelected(true);
          if (!TextUtils.x(o.a(this.x.a(VideoFeed.class)).mName)) {
             this.s.setText(this.w.mName);
          }else {
             this.s.setText(R.string.arg_RES_7f103703);
          }
       }
       return;
    }
    public void k(View p0){
       KwaiImageView kwaiImageVie;
       AbsRecordBottomBarViewBinder y;
       TextView textView;
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "2")) {
          return;
       }
       super.k(p0);
       z tA = this.A;
       View view = null;
       View view1 = (tA == null)? view: tA.H();
       this.o = b.a(view1, p0, 0x7f0a05db);
       tA = this.A;
       view1 = (tA == null)? view: tA.J();
       this.s = b.a(view1, p0, 0x7f0a2c9c);
       tA = this.A;
       view1 = (tA == null)? view: tA.y;
       this.u = b.a(view1, p0, 0x7f0a05c6);
       tA = this.A;
       view1 = (tA == null)? view: tA.K();
       this.v = b.a(view1, p0, 0x7f0a05dc);
       this.p = p0.findViewById(0x7f0a05c4);
       this.w = o.a(this.x);
       n.Y(this.v, 4, false);
       this.q = p0.findViewById(0x7f0a2ca9);
       this.r = p0.findViewById(0x7f0a2c7d);
       if (e.e()) {
          f5.b(this.o, this.p, this.s, this.q, this.r);
       }else if(s6.m()){
          View[] viewArray = new View[]{this.o,this.q};
          i.a(this.s, viewArray);
          this.o.setPlaceHolderImage(R.drawable.arg_RES_7f081c00);
          this.q.getHierarchy().u(t$b.g);
          this.q.setActualImageResource(R.drawable.arg_RES_7f081c27);
       }
       if (!this.d.d(b.c.a()).a()) {
          tA = this.A;
          if (tA != null) {
             view = tA.G();
          }
          n.Y(b.a(view, p0, R.id.button_switch_music_layout), false, true);
       }
       this.o.setVisibility(false);
       this.s.setText(R.string.arg_RES_7f103703);
       this.s.setVisibility(false);
       this.i2();
       return;
    }
    public void onEffectDescriptionUpdatedOnCancel(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.c(this, p0, p1, p2);
    }
    public void onEffectDescriptionUpdatedOnError(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.d(this, p0, p1, p2);
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "1")) {
          return;
       }
       super.w1(p0);
       this.x = j0.e(p0, "source_photo_origin_photo");
       this.y = j0.f(p0, "source_photo_origin_file");
       this.d.l(g0.class, new w(this));
       this.d.l(a.class, new x(this));
       return;
    }
}
