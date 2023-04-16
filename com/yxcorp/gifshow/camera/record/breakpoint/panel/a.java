package com.yxcorp.gifshow.camera.record.breakpoint.panel.a;
import ml8.d;
import com.yxcorp.gifshow.camera.record.breakpoint.a;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.breakpoint.panel.a$a;
import ekd.y0;
import android.os.Looper;
import sc9.f;
import java.lang.Runnable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import ekd.k1;
import sc9.e;
import com.kwai.video.player.IMediaPlayer$OnSeekCompleteListener;
import com.kwai.video.player.AbstractMediaPlayer;
import com.kwai.video.player.KsMediaPlayer;
import com.yxcorp.gifshow.camera.record.base.g;
import com.kwai.robust.PatchProxyResult;
import rc9.a;
import com.yxcorp.gifshow.camera.record.widget.SingleLineLyricWordView;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.breakpoint.panel.BreakpointPanel;
import android.view.View;
import ekd.m1;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Math;

public class a implements d	// class@000db8
{
    public SingleLineLyricWordView b;
    public g c;
    public final a d;
    public final a e;
    public KsMediaPlayer f;
    public long g;
    public final y0 h;
    public boolean i;
    public int j;
    public int k;
    public Runnable l;

    public void a(a p0){
       super();
       this.l = new a$a(this);
       this.d = p0;
       this.e = p0.p;
       this.h = new y0(Looper.getMainLooper(), 30, new f(this));
    }
    public final void a(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "16")) {
          return;
       }
       this.f(p0);
       k1.m(this.l);
       this.g();
       this.b(true);
       this.i = true;
       this.f.setOnSeekCompleteListener(new e(this));
       this.f.seekTo((this.g + (long)this.j));
       return;
    }
    public final void b(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "18")) {
          return;
       }
       if (this.c(true) && !this.c.d1()) {
          uoa = this.f;
          long l = (p0)? 1: 0;
          uoa.setOption(4, "enable-accurate-seek", l);
       }
       return;
    }
    public final boolean c(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoa, "15");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.c != null) {
          uoa = this.f;
          if (uoa != null && uoa.isMediaPlayerValid()) {
             if (!p0) {
                return true;
             }else {
                return this.d.g2();
             }
          }
       }
       return false;
    }
    public final void d(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "14")) {
          return;
       }
       this.b.d(this.e.e);
       a td = this.d;
       Objects.requireNonNull(td);
       if (!PatchProxy.applyVoid(objArray, td, a.class, "19")) {
          td = td.s;
          if (td != null) {
             td.d();
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a0514);
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, a.class, "13")) {
          return;
       }
       if (this.i == null) {
          Object[] objArray = new Object[0];
          a.D().y("breakpoint", "µΩ¥Ô÷’µ„ "+this.k, objArray);
          this.g();
          this.a(0);
       }
       return;
    }
    public final void f(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "17")) {
          return;
       }
       uoa = this.e;
       a d = uoa.d;
       a b = uoa.b;
       if (d <= b) {
          this.j = b;
          this.k = uoa.a;
          return;
       }else if(d <= (b + 2000)){
          this.j = b;
          this.k = d;
          return;
       }else if(p0){
          this.j = d - 2000;
          this.k = d;
          return;
       }else {
          this.j = b;
          this.k = d;
          b = uoa.k;
          if (b) {
             this.k = Math.min(d, (int)b);
          }
          return;
       }
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, a.class, "7")) {
          return;
       }
       if (!this.c(false)) {
          return;
       }
       this.f.setOnSeekCompleteListener(null);
       if (this.f.isPlaying()) {
          this.f.pause();
       }
       this.h.e();
       return;
    }
}
