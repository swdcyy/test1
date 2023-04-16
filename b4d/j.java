package b4d.j;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import b4d.j$a;
import android.os.Looper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import java.lang.CharSequence;
import android.widget.EditText;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import b4d.j$b;
import android.text.TextWatcher;
import b4d.i;
import java.lang.Runnable;
import b4d.h;
import erd.g;
import crd.b;
import brd.t;
import b4d.g;
import b4d.f;
import b4d.e;
import android.os.Handler;
import android.animation.ValueAnimator;
import java.lang.Boolean;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.TextView;
import ky5.n;
import android.text.Editable;
import com.kwai.library.widget.edittext.SafeEditText;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditConfig;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import ekd.m1;
import com.yxcorp.gifshow.widget.EmojiEditText;
import io.reactivex.subjects.PublishSubject;

public class j extends PresenterV2	// class@000378
{
    public PublishSubject A;
    public PublishSubject B;
    public CharSequence C;
    public boolean p;
    public ValueAnimator q;
    public EmojiEditText r;
    public View s;
    public View t;
    public EmotionFloatEditorFragment u;
    public Handler v;
    public View w;
    public j$b x;
    public PublishSubject y;
    public PublishSubject z;
    public static final int D;
    public static final int E;
    public static final int F;

    static {
       j.D = a1.e(8.00f);
       j.E = a1.e(36.00f);
       j.F = a1.e(64.00f);
    }
    public void j(){
       super();
       this.v = new j$a(this, Looper.getMainLooper());
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, j.class, "3")) {
          return;
       }
       if (this.r == null) {
          return;
       }
       this.s = this.m8().findViewById(0x7f0a0ca8);
       this.C = this.r.getHint();
       Log.g("FinishButtonAnimPr", "on bind mOriginHint:"+this.C);
       j$b uob = new j$b(this);
       this.x = uob;
       this.r.addTextChangedListener(uob);
       this.r.post(new i(this));
       j ty = this.y;
       if (ty != null) {
          this.X7(ty.subscribe(new h(this)));
       }
       ty = this.z;
       if (ty != null) {
          this.X7(ty.subscribe(new g(this)));
       }
       ty = this.A;
       if (ty != null) {
          this.X7(ty.subscribe(new f(this)));
       }
       ty = this.B;
       if (ty != null) {
          this.X7(ty.subscribe(new e(this)));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, j.class, "4")) {
          return;
       }
       j tr = this.r;
       if (tr == null) {
          return;
       }
       j tx = this.x;
       if (tx != null) {
          tr.removeTextChangedListener(tx);
       }
       this.P8();
       this.v.removeMessages(1);
       this.v.removeMessages(2);
       this.v.removeCallbacksAndMessages(null);
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, j.class, "5")) {
          return;
       }
       j tq = this.q;
       if (tq != null) {
          tq.cancel();
          this.q = null;
       }
       return;
    }
    public void R8(boolean p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oj, "12")) {
          return;
       }
       Log.g("FinishButtonAnimPr", "hide anim enter...mIsAnimating:"+this.p);
       if (p0) {
          if (!PatchProxy.applyVoid(null, this, oj, "13")) {
             this.v.removeMessages(1);
             this.v.removeMessages(2);
             this.v.sendEmptyMessageDelayed(2, 120);
          }
       }else {
          this.t.setAlpha(0);
          ViewGroup$LayoutParams layoutParams = this.t.getLayoutParams();
          layoutParams.width = j.E;
          this.t.setLayoutParams(layoutParams);
          ViewGroup$MarginLayoutParams layoutParams1 = this.s.getLayoutParams();
          layoutParams1.rightMargin = 0;
          this.s.setLayoutParams(layoutParams1);
          n.a(this.r, this.C, 0);
       }
       return;
    }
    public void S8(boolean p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oj, "10")) {
          return;
       }
       Log.g("FinishButtonAnimPr", "show anim enter...mIsAnimating:"+this.p);
       if (p0) {
          if (!PatchProxy.applyVoid(null, this, oj, "14")) {
             this.v.removeMessages(1);
             this.v.removeMessages(2);
             this.v.sendEmptyMessageDelayed(1, 120);
          }
       }else {
          this.t.setAlpha(0x3f800000);
          ViewGroup$LayoutParams layoutParams = this.t.getLayoutParams();
          int f = j.F;
          layoutParams.width = f;
          this.t.setLayoutParams(layoutParams);
          ViewGroup$MarginLayoutParams layoutParams1 = this.s.getLayoutParams();
          layoutParams1.rightMargin = f + j.D;
          this.s.setLayoutParams(layoutParams1);
       }
       return;
    }
    public final void V8(boolean p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oj, "8")) {
          return;
       }
       String str = (this.r.getText() != null && !this.u.Bi().isEnableFinishShowWithSpace())? (this.r.getText().toString()).trim(): this.r.getText().toString();
       if (!str.length()) {
          oj = this.w;
          if (oj == null || oj.getVisibility() == 8) {
             this.R8(p0);
          }else {
          label_0058 :
             this.S8(p0);
             j tw = this.w;
             if (tw != null && tw.getVisibility() == 8) {
                this.r.setHint("");
             }
          }
       }else {
          goto label_0058 ;
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "2")) {
          return;
       }
       this.w = m1.f(p0, 0x7f0a0cff);
       this.r = m1.f(p0, 0x7f0a0ca8);
       this.t = m1.f(p0, 0x7f0a0eb2);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       this.u = this.r8("floateditor");
       this.y = this.t8("emotion_preview");
       this.z = this.r8("PICTURE_PREVIEW");
       this.A = this.t8("GIF_EMOTION_SHOW_HIDE");
       this.B = this.t8("PICTURE_DELETE");
       return;
    }
}
