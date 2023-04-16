package com.yxcorp.gifshow.album.widget.preview.m;
import com.yxcorp.gifshow.album.widget.preview.a$a;
import com.yxcorp.gifshow.album.widget.preview.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j79.l0;
import com.yxcorp.gifshow.album.widget.preview.KsAlbumVideoPlayerView;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.RuntimeException;
import java.lang.Throwable;
import ic7.b;
import java.lang.Double;
import android.widget.SeekBar;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewItemViewBinder;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import android.widget.TextView;
import ic7.a;

public class m extends a$a	// class@001b40
{
    public int a;
    public final f b;

    public void m(f p0){
       this.b = p0;
       super();
       this.a = 0;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, m.class, "6")) {
          return;
       }
       m tb = this.b;
       if (tb.g == null) {
          tb.A(false);
          f j = this.b.j;
          boolean b = (j instanceof l0 && j.J0())? true: false;
          this.b.c.i(false, b);
       }
       return;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "5")) {
          return;
       }
       this.b.D();
       this.b.A(false);
       if (!TextUtils.isEmpty(p0)) {
          b.a(new RuntimeException(p0));
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       m tb = this.b;
       tb.p = 2;
       if (tb.q != null) {
          tb.c.e();
          this.b.q = false;
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, m.class, "4")) {
          return;
       }
       this.b.A(false);
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, m.class, "3")) {
          return;
       }
       this.b.A(true);
       return;
    }
    public void f(double p0){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, om, "2")) {
          return;
       }
       double d = (10000.00f * p0) * 0x3ff0000000000000;
       int i = (int)(d / this.b.c.getVideoLength());
       m tb = this.b;
       if (tb.o == null && this.a != i) {
          if (tb.b.o() != null) {
             int i1 = (int)(d / this.b.c.getVideoLength());
             this.b.b.o().setProgress(i1);
             StringBuilder str = "onTimeUpdate\(\) called with: v = ["+p0+"], progress = ["+i1;
             Log.b("VideoSdkPlayerPreviewItem", str+"]");
          }
          if (this.a > i) {
             Log.d("VideoSdkPlayerPreviewItem", "KpMidPlayerController: currentPosition shake!!!");
          }
          this.a = i;
       }
       if (this.b.b.n() != null) {
          this.b.b.n().setText(a.c((long)(p0 * 0x408f400000000000)));
       }
       return;
    }
}
