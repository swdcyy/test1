package bc9.b;
import u79.o;
import java.util.List;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import java.lang.String;
import android.graphics.drawable.ColorDrawable;
import java.lang.Object;
import kotlin.jvm.internal.a;
import lnc.a1;
import bc9.b$e;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewItemViewBinder;
import u79.n;
import q79.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.video.player.KsMediaPlayer;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import com.kwai.video.player.AbstractMediaPlayer;
import com.kwai.video.player.IMediaPlayer$OnCompletionListener;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import android.view.Surface;
import bc9.b$f;
import java.lang.Runnable;
import t45.c;
import android.view.View;
import com.yxcorp.gifshow.camera.record.assistant.recommend.AssistKSBlurMaskView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.text.TextPaint;
import com.yxcorp.utility.TextUtils;
import bc9.b$a;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import android.view.TextureView;
import com.yxcorp.gifshow.widget.PlayerLayout;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout;
import java.util.Objects;
import android.widget.RelativeLayout$LayoutParams;
import qsd.d;
import android.view.ViewGroup$MarginLayoutParams;
import bc9.e;
import android.view.ViewOutlineProvider;
import bc9.b$b;
import bc9.c;
import android.view.TextureView$SurfaceTextureListener;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import com.kwai.video.player.KsMediaPlayer$Builder;
import android.content.Context;
import w46.b;
import bc9.b$c;
import bc9.b$d;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

public final class b implements o	// class@0003dc
{
    public List A;
    public KSTemplateDetailInfo B;
    public String C;
    public String D;
    public ColorDrawable E;
    public int F;
    public String G;
    public String H;
    public int I;
    public int J;
    public final String b;
    public final float c;
    public final long d;
    public final long e;
    public final float f;
    public final float g;
    public final int h;
    public TextView i;
    public TextView j;
    public View k;
    public KwaiImageView l;
    public KwaiImageView m;
    public TextureView n;
    public PlayerLayout o;
    public View p;
    public TextView q;
    public AssistKSBlurMaskView r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public Surface w;
    public KsMediaPlayer x;
    public final IMediaPlayer$OnCompletionListener y;
    public Runnable z;

    public void b(List p0,KSTemplateDetailInfo p1,String p2,String p3,ColorDrawable p4,int p5,String p6,String p7,int p8,int p9){
       a.p(p0, "coverUrl");
       a.p(p1, "templateInfo");
       a.p(p2, "numInfo");
       a.p(p4, "coverColor");
       a.p(p6, "coverSource");
       a.p(p7, "source");
       super();
       this.A = p0;
       this.B = p1;
       this.C = p2;
       this.D = p3;
       this.E = p4;
       this.F = p5;
       this.G = p6;
       this.H = p7;
       this.I = p8;
       this.J = p9;
       this.b = "AssistKSPlayerPreviewItem";
       this.c = 5.00f;
       this.d = (long)300;
       this.e = (long)200;
       this.f = 0x3f800000;
       this.h = a1.e(32.00f);
       this.y = new b$e(this);
    }
    public AbsPreviewItemViewBinder O1(){
       return n.d(this);
    }
    public void a(int p0){
    }
    public void b(d p0){
       n.j(this, p0);
    }
    public void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "6")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.D().w(this.b, "releasePlayer\(\) called mIndex="+this.F, objArray1);
       b tx = this.x;
       if (tx != null) {
          a.m(tx);
          tx.pause();
          tx = this.x;
          a.m(tx);
          tx.setOnErrorListener(objArray);
          tx = this.x;
          a.m(tx);
          tx.setOnCompletionListener(objArray);
          tx = this.x;
          a.m(tx);
          tx.setOnPreparedListener(objArray);
          tx = this.x;
          a.m(tx);
          tx.setSurface(objArray);
          tx = this.x;
          a.m(tx);
          this.x = objArray;
          c.a(new b$f(tx));
       }
       return;
    }
    public void d(View p0){
       b tj;
       b ti;
       b ti1;
       b to;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "2")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.k = p0;
       AssistKSBlurMaskView uAssistKSBlu = p0.findViewById(R.id.template_blur_bg_view);
       this.r = uAssistKSBlu;
       if (uAssistKSBlu != null) {
          uAssistKSBlu.setImageUrl(this.G);
       }
       this.m = p0.findViewById(0x7f0a31e5);
       this.m();
       TextView textView = p0.findViewById(R.id.template_image_count_des);
       this.i = textView;
       if (textView != null) {
          textView.setText(this.C);
       }
       this.j = p0.findViewById(0x7f0a3d7d);
       b$a uoa = 8;
       int i = 0;
       if (!TextUtils.isEmpty(this.D)) {
          tj = this.j;
          if (tj != null) {
             tj.setVisibility(i);
          }
          tj = this.j;
          if (tj != null) {
             tj.setText(this.D);
          }
          tj = this.i;
          if (tj != null) {
             a.m(tj);
             ti = this.i;
             a.m(ti);
             ti1 = this.i;
             a.m(ti1);
             tj.setPadding(tj.getPaddingLeft(), ti.getPaddingTop(), i, ti1.getPaddingBottom());
          }
       }else {
          tj = this.i;
          if (tj != null) {
             a.m(tj);
             ti = this.i;
             a.m(ti);
             ti1 = this.i;
             a.m(ti1);
             tj.setPadding(tj.getPaddingLeft(), ti.getPaddingTop(), i, ti1.getPaddingBottom());
          }
          tj = this.j;
          if (tj != null) {
             tj.setVisibility(uoa);
          }
       }
       textView = p0.findViewById(R.id.template_title);
       this.q = textView;
       if (textView != null) {
          TextPaint paint = textView.getPaint();
          if (paint != null) {
             paint.setFakeBoldText(true);
          }
       }
       KSTemplateDetailInfo mName = this.B.mName;
       ti = this.q;
       if (!PatchProxy.applyVoidTwoRefs(ti, mName, this, uob, "15") && ti != null) {
          if (!TextUtils.x(mName)) {
             ti.setVisibility(i);
             ti.setText(mName);
          }else {
             ti.setVisibility(uoa);
          }
       }
       KwaiImageView kwaiImageVie = p0.findViewById(R.id.template_video_control);
       this.l = kwaiImageVie;
       if (kwaiImageVie != null) {
          kwaiImageVie.setOnClickListener(new b$a(this));
       }
       this.n = p0.findViewById(0x7f0a31f8);
       this.o = p0.findViewById(0x7f0a3d8c);
       this.p = p0.findViewById(0x7f0a0255);
       if (!PatchProxy.applyVoid(null, this, uob, "16")) {
          tj = this.o;
          if (tj != null) {
             ViewGroup$LayoutParams layoutParams = tj.getLayoutParams();
             Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
             int i1 = this.J - this.I;
             layoutParams.height = i1;
             layoutParams.width = d.H0((((float)i1 * 9.00f) / (float)16));
             layoutParams.topMargin = this.I;
             to = this.o;
             a.m(to);
             to.setLayoutParams(layoutParams);
             tj = this.o;
             a.m(tj);
             if (tj.getLeft() < this.h) {
                tj = this.o;
                a.m(tj);
                layoutParams = tj.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                to = this.h;
                layoutParams.leftMargin = to;
                layoutParams.rightMargin = to;
                layoutParams.bottomMargin = i;
                to = this.o;
                a.m(to);
                to.setLayoutParams(layoutParams);
                if (!PatchProxy.applyVoid(null, this, uob, "17")) {
                   tj = this.o;
                   if (tj != null) {
                      tj.setOutlineProvider(new e());
                   }
                   tj = this.o;
                   if (tj != null) {
                      tj.setClipToOutline(true);
                   }
                }
             }
          }
       }
       tj = this.n;
       if (tj != null) {
          a.m(tj);
          tj.setOnClickListener(new b$b(this));
       }
       if (!PatchProxy.applyVoid(null, this, uob, "18")) {
          Object[] objArray = new Object[i];
          a.D().w(this.b, "initSurface: ", objArray);
          uob = this.n;
          if (uob != null) {
             a.m(uob);
             uob.setSurfaceTextureListener(new c(this));
          }
       }
       uob = this.z;
       if (uob != null) {
          uob.run();
       }
       this.z = null;
       return;
    }
    public void e(float p0){
       n.a(this, p0);
    }
    public void f(){
       n.g(this);
    }
    public void g(boolean p0){
       n.c(this, p0);
    }
    public int getIndex(){
       return this.F;
    }
    public View getView(){
       return this.k;
    }
    public void h(AbsPreviewItemViewBinder p0){
       n.k(this, p0);
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       int i = 0;
       if (this.k == null) {
          Object[] objArray = new Object[i];
          a.D().w(this.b, "previewPause is unbinded ignore this", objArray);
       }
       if (this.x == null) {
          return;
       }else {
          Object[] objArray1 = new Object[i];
          a.D().w(this.b, "previewPause\(\) called mIndex="+this.F, objArray1);
          b tx = this.x;
          a.m(tx);
          tx.pause();
          return;
       }
    }
    public boolean isPlaying(){
       return n.f(this);
    }
    public boolean isPrepared(){
       boolean b = (this.k != null)? true: false;
       return b;
    }
    public final void j(){
       Object[] objArray;
       if (PatchProxy.applyVoid(null, this, b.class, "19")) {
          return;
       }
       int i = 0;
       if (this.x != null) {
          objArray = new Object[i];
          a.D().w(this.b, "initPlayer: mMediaPlayer is created", objArray);
          return;
       }else if(this.k == null || this.m == null){
          objArray = new Object[i];
          a.D().w(this.b, "initPlayer: is unbinded ignore this", objArray);
          return;
       }else if(TextUtils.isEmpty(this.H)){
          i1.c(new RuntimeException(this.b+" initPlayer: wrong video source"));
          return;
       }else {
          KsMediaPlayer ksMediaPlaye = new KsMediaPlayer$Builder(a1.c()).build();
          this.x = ksMediaPlaye;
          a.m(ksMediaPlaye);
          ksMediaPlaye.setBizFt("AssistKSPlayerPreviewItem");
          this.v = i;
          b tx = this.x;
          a.m(tx);
          float f = 0;
          try{
             tx.setVolume(f, f);
             tx = this.x;
             a.m(tx);
             tx.setDataSource(this.H);
          }catch(java.io.IOException e0){
             a.D().e(this.b, "followshoot init player fail", e0);
          }
          tx = this.x;
          a.m(tx);
          tx.setAudioStreamType(3);
          tx = this.x;
          a.m(tx);
          tx.setOnErrorListener(new b$c(this));
          tx = this.x;
          a.m(tx);
          tx.setOnPreparedListener(new b$d(this));
          tx = this.x;
          a.m(tx);
          tx.prepareAsync();
          return;
       }
    }
    public int k(){
       return 1;
    }
    public void l(){
       n.h(this);
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, b.class, "12")) {
          return;
       }
       int i = 0;
       if (this.k != null) {
          b tm = this.m;
          if (tm != null) {
             a.m(tm);
             tm.setPlaceHolderImage(this.E);
             tm = this.m;
             a.m(tm);
             tm.P(this.A);
             tm = this.m;
             a.m(tm);
             tm.setVisibility(i);
             return;
          }
       }
       Object[] objArray = new Object[i];
       a.D().s(this.b, "showCover: is unbind ignore this", objArray);
       return;
    }
    public void n(){
       this.s = true;
    }
    public View o(ViewGroup p0){
       return n.b(this, p0);
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "13")) {
          return;
       }
       this.x();
       return;
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, b.class, "9")) {
          return;
       }
       this.t = false;
       this.s = false;
       this.u = false;
       this.c();
       return;
    }
    public void q(boolean p0){
       n.i(this, p0);
    }
    public void r(){
       Object[] objArray1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "5")) {
          return;
       }
       int i = 0;
       if (this.k == null) {
          objArray1 = new Object[i];
          a.D().w(this.b, "previewPlay: is unbinded ignore this", objArray1);
          return;
       }else if(this.s != null || this.t != null){
          objArray1 = new Object[i];
          a.D().s(this.b, "previewPlay: now is paused state cancel play mOnPagePaused="+this.s+" mOnUserPaused="+this.t, objArray1);
          return;
       }else if(this.x == null){
          this.j();
       }
       b tx = this.x;
       if (tx != null && this.v == null) {
          a.m(tx);
          tx.setOnCompletionListener(this.y);
          this.v = true;
       }
       objArray1 = new Object[i];
       a.D().w(this.b, "previewPlay\(\) called mIndex="+this.F, objArray1);
       tx = this.x;
       if (tx != null && !tx.isPlaying()) {
          tx = this.x;
          a.m(tx);
          tx.setSurface(this.w);
          tx = this.x;
          a.m(tx);
          tx.start();
          tx = this.x;
          a.m(tx);
          tx.setVolume(0x3f800000, 0x3f800000);
          tx = this.x;
          a.m(tx);
          tx.setOnPreparedListener(objArray);
       }
       return;
    }
    public boolean s(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (TextUtils.isEmpty(this.G) ^ 0x01);
    }
    public void t(){
       this.u = true;
    }
    public void u(int p0,float p1){
       n.e(this, p0, p1);
    }
    public void unbind(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.k = null;
       b tm = this.m;
       if (tm != null) {
          a.m(tm);
          tm.setVisibility(0);
          this.m = null;
       }
       tm = this.n;
       if (tm != null) {
          a.m(tm);
          tm.setSurfaceTextureListener(null);
          this.n = null;
       }
       this.y();
       this.c();
       return;
    }
    public void v(){
       boolean b;
       if (PatchProxy.applyVoid(null, this, b.class, "10")) {
          return;
       }
       b = false;
       this.s = b;
       if (this.k == null) {
          Object[] objArray = new Object[b];
          a.D().s(this.b, "onActivityResumed: is unbinded ignore this", objArray);
          return;
       }else {
          this.m();
          if (this.u != null) {
             this.r();
          }
          return;
       }
    }
    public void w(boolean p0,boolean p1){
       b tl;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uob, "8")) {
          return;
       }
       if (this.k != null) {
          uob = this.l;
          if (uob != null) {
             a.m(uob);
             uob.clearAnimation();
             int i = 0;
             if (!p1) {
                tl = this.l;
                a.m(tl);
                if (!p0) {
                   i = 4;
                }
                tl.setVisibility(i);
                return;
             }else if(p0){
                tl = this.l;
                a.m(tl);
                if (!tl.getVisibility()) {
                label_0053 :
                   return;
                }
             }
             if (!p0) {
                tl = this.l;
                a.m(tl);
                if (tl.getVisibility() == 4) {
                   goto label_0053 ;
                }
             }
             tl = this.l;
             a.m(tl);
             tl.setVisibility(i);
             AlphaAnimation uAlphaAnimat = (p0)? new AlphaAnimation(this.g, this.f): new AlphaAnimation(this.f, this.g);
             uAlphaAnimat.setDuration(this.e);
             uAlphaAnimat.setFillAfter(true);
             tl = this.l;
             a.m(tl);
             tl.startAnimation(uAlphaAnimat);
          }
       }
       return;
    }
    public final void x(){
       if (PatchProxy.applyVoid(null, this, b.class, "14")) {
          return;
       }
       int i = 0;
       if (this.k == null) {
          Object[] objArray = new Object[i];
          a.D().w(this.b, "onClickPlayBtn: is unbinded, ignore this click .", objArray);
          return;
       }else if(this.x == null){
          this.j();
       }
       Object[] objArray1 = new Object[i];
       a.D().s(this.b, "onClickPlayBtn: ", objArray1);
       b tx = this.x;
       if (tx != null && tx.isPlaying() == true) {
          this.t = true;
          this.i();
          this.w(true, true);
       }else {
          this.t = i;
          this.r();
          this.w(i, true);
       }
       return;
    }
    public final void y(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "7")) {
          return;
       }
       b tw = this.w;
       if (tw != null) {
          a.m(tw);
          tw.release();
          this.w = objArray;
          Object[] objArray1 = new Object[0];
          a.D().s(this.b, "surface released", objArray1);
       }
       return;
    }
}
