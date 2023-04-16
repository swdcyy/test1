package e0b.e;
import android.content.Context;
import e0b.e$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.lelink.ScreencastManager;
import com.yxcorp.gifshow.lelink.ScreencastManager$a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.Button;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ag6.a;
import ekd.m1;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.yxcorp.gifshow.detail.view.ScaleAnimSeekBar;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import e0b.e$b;
import android.view.View$OnClickListener;
import e0b.e$c;
import e0b.e$d;
import e0b.e$e;
import e0b.e$f;
import e0b.e$g;
import e0b.e$h;
import e0b.e$i;
import e0b.e$j;
import com.yxcorp.gifshow.detail.view.ScaleAnimSeekBar$a;
import java.lang.CharSequence;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Long;
import java.lang.Boolean;
import com.yxcorp.gifshow.lelink.util.KLogLelink;
import com.yxcorp.gifshow.lelink.util.KLogLelink$a;
import java.lang.StringBuilder;
import q87.c;
import zf6.j;
import b0b.a;
import lnc.a1;
import cgc.a;
import xza.a;
import com.hpplay.sdk.source.browse.api.LelinkServiceInfo;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import nsd.r0;
import java.util.Locale;
import java.util.Arrays;

public final class e	// class@0025bf
{
    public final e$a A;
    public final String a;
    public final int b;
    public View c;
    public ConstraintLayout d;
    public ImageView e;
    public TextView f;
    public TextView g;
    public TextView h;
    public Button i;
    public Button j;
    public ImageView k;
    public View l;
    public View m;
    public TextView n;
    public ConstraintLayout o;
    public ImageView p;
    public TextView q;
    public TextView r;
    public ScaleAnimSeekBar s;
    public long t;
    public boolean u;
    public int v;
    public String w;
    public int x;
    public final ScreencastManager y;
    public final Context z;

    public void e(Context p0,e$a p1){
       a.p(p0, "mContext");
       a.p(p1, "mLelinkPlayPanelListener");
       super();
       this.z = p0;
       this.A = p1;
       this.a = "LelinkPlayPanel";
       this.b = 0x2710;
       this.u = true;
       this.v = 0x7f0d08e0;
       this.x = -1;
       this.y = ScreencastManager.A.a();
    }
    public final Context a(){
       return this.z;
    }
    public final e$a b(){
       return this.A;
    }
    public final View c(){
       return this.c;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, e.class, "16")) {
          return;
       }
       e tc = this.c;
       if (tc != null) {
          tc.setVisibility(8);
       }
       tc = this.i;
       if (tc != null) {
          tc.setVisibility(8);
       }
       tc = this.j;
       if (tc != null) {
          tc.setVisibility(8);
       }
       tc = this.l;
       if (tc != null) {
          tc.setVisibility(8);
       }
       tc = this.m;
       if (tc != null) {
          tc.setVisibility(8);
       }
       this.A.D();
       return;
    }
    public final void e(){
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "1")) {
          return;
       }
       View view = a.c(LayoutInflater.from(this.z), this.v, objArray, false);
       this.c = view;
       this.d = m1.f(view, 0x7f0a1757);
       this.e = m1.f(this.c, 0x7f0a174f);
       this.f = m1.f(this.c, 0x7f0a174e);
       this.g = m1.f(this.c, 0x7f0a175c);
       this.h = m1.f(this.c, 0x7f0a1750);
       this.i = m1.f(this.c, 0x7f0a4409);
       this.j = m1.f(this.c, 0x7f0a3aaf);
       this.k = m1.f(this.c, 0x7f0a3d43);
       this.l = m1.f(this.c, 0x7f0a06ac);
       this.m = m1.f(this.c, 0x7f0a349d);
       this.n = m1.f(this.c, 0x7f0a1755);
       this.o = m1.f(this.c, 0x7f0a1759);
       this.p = m1.f(this.c, 0x7f0a1756);
       this.q = m1.f(this.c, 0x7f0a175a);
       this.r = m1.f(this.c, 0x7f0a1758);
       ScaleAnimSeekBar scaleAnimSee = m1.f(this.c, R.id.lelink_seek_bar);
       this.s = scaleAnimSee;
       if (scaleAnimSee != null) {
          scaleAnimSee.setMaxProgress(this.b);
       }
       e ts = this.s;
       if (ts != null) {
          ts.setThumbDrawable(ContextCompat.getDrawable(this.z, R.drawable.arg_RES_7f08107a));
       }
       ts = this.s;
       if (ts != null) {
          ts.setProgressWidth(4);
       }
       ts = this.e;
       if (ts != null) {
          ts.setOnClickListener(new e$b(this));
       }
       ts = this.k;
       if (ts != null) {
          ts.setOnClickListener(new e$c(this));
       }
       ts = this.i;
       if (ts != null) {
          ts.setOnClickListener(new e$d(this));
       }
       ts = this.j;
       if (ts != null) {
          ts.setOnClickListener(new e$e(this));
       }
       ts = this.l;
       if (ts != null) {
          ts.setOnClickListener(new e$f(this));
       }
       ts = this.m;
       if (ts != null) {
          ts.setOnClickListener(new e$g(this));
       }
       ts = this.n;
       if (ts != null) {
          ts.setOnClickListener(new e$h(this));
       }
       ts = this.p;
       if (ts != null) {
          ts.setOnClickListener(new e$i(this));
       }
       ts = this.s;
       if (ts != null) {
          ts.setOnSeekBarChangeListener(new e$j(this));
       }
       if (!PatchProxy.applyVoid(objArray, this, uoe, "4")) {
          ts = this.w;
          if (ts != null) {
             e tf = this.f;
             if (tf != null) {
                tf.setText(ts);
             }
             ts = this.f;
             if (ts != null) {
                ts.setVisibility(false);
             }
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uoe, "5") && this.x > -1) {
          uoe = this.o;
          ViewGroup$LayoutParams layoutParams = (uoe != null)? uoe.getLayoutParams(): objArray;
          if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
             objArray = layoutParams;
          }
          if (objArray != null) {
             objArray.bottomMargin = this.x;
          }
       }
    label_01b1 :
       return;
    }
    public final void f(long p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoe, "11")) {
          return;
       }
       this.t = p0;
       uoe = this.r;
       if (uoe != null) {
          uoe.setText(this.o(p0));
       }
       return;
    }
    public final void g(boolean p0){
       e tp;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "13")) {
          return;
       }
       Object[] objArray = new Object[0];
       KLogLelink.e.a().s(this.a, "isPlaying "+p0, objArray);
       this.u = p0;
       int i = 0x7f06060a;
       if (p0) {
          tp = this.p;
          if (tp != null) {
             tp.setImageDrawable(j.n(this.z, R.drawable.arg_RES_7f0805ae, i));
          }
       }else {
          tp = this.p;
          if (tp != null) {
             tp.setImageDrawable(j.n(this.z, R.drawable.arg_RES_7f08059d, i));
          }
       }
       return;
    }
    public final void h(long p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoe, "10")) {
          return;
       }
       if (!this.t) {
          return;
       }
       uoe = this.q;
       if (uoe != null) {
          uoe.setText(this.o(p0));
       }
       uoe = this.s;
       if (uoe != null) {
          uoe.setProgress((int)((p0 * (long)this.b) / this.t));
       }
       return;
    }
    public final void i(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "15")) {
          return;
       }
       a.p(p0, "quality");
       Object[] objArray = new Object[0];
       KLogLelink.e.a().s(this.a, p0, objArray);
       e ti = this.i;
       if (ti != null) {
          ti.setText(p0);
       }
       return;
    }
    public final void j(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "14")) {
          return;
       }
       a.p(p0, "speed");
       Object[] objArray = new Object[0];
       KLogLelink.e.a().s(this.a, p0, objArray);
       e tj = this.j;
       if (tj != null) {
          tj.setText(p0);
       }
       return;
    }
    public final void k(Object p0,boolean p1,String p2,String p3){
       String str;
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), p2, p3, this, e.class, "6")) {
          return;
       }
       a.p(p0, "device");
       a.p(p3, "speed");
       int i = 0;
       Object[] objArray = new Object[i];
       KLogLelink.e.a().w(this.a, "投屏视频清晰度: "+p2, objArray);
       e tc = this.c;
       if (tc != null && tc.getVisibility() == 8) {
          str = a1.p(R.string.arg_RES_7f100da2);
          a.o(str, "CommonUtil.string\(R.stri… .exit_screen_projection\)");
          this.y.j().s(str, "ING", p0 instanceof a);
       }
       tc = this.c;
       if (tc != null) {
          tc.setVisibility(i);
       }
       this.A.onShow();
       if (p0 instanceof a) {
          this.m(p0.b(), p1, p2, true, p3);
       }else if(p0 instanceof a){
          str = p0.a().getName();
          a.o(str, "device.deviceInfo.name");
          this.m(str, p1, p2, false, p3);
       }
       return;
    }
    public final void l(boolean p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "8")) {
          return;
       }
       Object[] objArray = new Object[0];
       KLogLelink.e.a().s(this.a, "show error", objArray);
       uoe = this.g;
       if (uoe != null) {
          uoe.setText(this.z.getResources().getText(R.string.arg_RES_7f1007f9));
       }
       uoe = this.h;
       if (uoe != null) {
          uoe.setText(this.z.getResources().getText(R.string.arg_RES_7f103cef));
       }
       uoe = this.i;
       if (uoe != null) {
          uoe.setVisibility(8);
       }
       uoe = this.j;
       if (uoe != null) {
          uoe.setVisibility(8);
       }
       uoe = this.l;
       if (uoe != null) {
          uoe.setVisibility(8);
       }
       uoe = this.m;
       if (uoe != null && uoe.getVisibility() == 8) {
          String str = a1.p(R.string.arg_RES_7f10445b);
          a.o(str, "CommonUtil.string\(R.stri…   .screencast_reconnect\)");
          this.y.j().s(str, "STOP", p0);
       }
       e tm = this.m;
       if (tm != null) {
          tm.setVisibility(0);
       }
       tm = this.n;
       if (tm != null) {
          tm.setVisibility(0);
       }
       tm = this.o;
       if (tm != null) {
          tm.setVisibility(8);
       }
       return;
    }
    public final void m(String p0,boolean p1,String p2,boolean p3,String p4){
       e ti;
       int i;
       e ti1;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),p2,Boolean.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, uoe, "7")) {
             return;
          }
       }
       Object[] objArray1 = new Object[0];
       KLogLelink.e.a().s(this.a, "show play", objArray1);
       uoe = this.g;
       if (uoe != null) {
          uoe.setText(this.z.getResources().getText(R.string.arg_RES_7f104f01));
       }
       uoe = this.h;
       if (uoe != null) {
          uoe.setText(p0);
       }
       p0 = "";
       if (p1) {
          ti = this.i;
          if (ti != null && ti.getVisibility() == 8) {
             a uoa = this.y.j();
             String str = (p2 != null)? p2: p0;
             uoa.s(str, "ING", p3);
          }
       }
       ti = this.i;
       if (ti != null) {
          i = (p1)? 0: 8;
          ti.setVisibility(i);
       }
       if (p2 != null) {
          ti1 = this.i;
          if (ti1 != null) {
             ti1.setText(p2);
          }
       }
       if (p3) {
          ti1 = this.j;
          if (ti1 != null && ti1.getVisibility() == 8) {
             a uoa1 = this.y.j();
             if (p4 != null) {
                p0 = p4;
             }
             uoa1.s(p0, "ING", p3);
          }
       }
       e tj = this.j;
       if (tj != null) {
          i = (p3)? 0: 8;
          tj.setVisibility(i);
       }
       if (p4 != null) {
          tj = this.j;
          if (tj != null) {
             tj.setText(p4);
          }
       }
       tj = this.l;
       if (tj != null && tj.getVisibility() == 8) {
          String str1 = a1.p(R.string.arg_RES_7f1004f4);
          a.o(str1, "CommonUtil.string\(\n     …  R.string.change_device\)");
          this.y.j().s(str1, "ING", p3);
       }
       tj = this.l;
       if (tj != null) {
          tj.setVisibility(0);
       }
       tj = this.m;
       if (tj != null) {
          tj.setVisibility(8);
       }
       tj = this.n;
       if (tj != null) {
          tj.setVisibility(8);
       }
       tj = this.o;
       if (tj != null) {
          tj.setVisibility(0);
       }
       return;
    }
    public final void n(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "9")) {
          return;
       }
       a.p(p0, "name");
       e th = this.h;
       if (th != null) {
          th.setText(p0);
       }
       return;
    }
    public final String o(long p0){
       String str;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uoe, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 <= 0) {
          return "00:00";
       }else {
          long l = (long)0x36ee80;
          long l1 = p0 / l;
          long l2 = (long)0xea60;
          l = (p0 % l) / l2;
          p0 = p0 % l2;
          p0 = p0 / (long)1000;
          if (!(int)l1) {
             Object[] objArray = new Object[]{Long.valueOf(l),Long.valueOf(p0)};
             str = String.format(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(objArray, 2));
             a.o(str, "java.lang.String.format\(locale, format, *args\)");
          }else {
             Object[] objArray1 = new Object[]{Long.valueOf(l1),Long.valueOf(l),Long.valueOf(p0)};
             str = String.format(Locale.getDefault(), "%d:%02d:%02d", Arrays.copyOf(objArray1, 3));
             a.o(str, "java.lang.String.format\(locale, format, *args\)");
          }
          return str;
       }
    }
}
