package com.yxcorp.gifshow.camera.record.breakpoint.panel.BreakpointPanel;
import ml8.d;
import android.widget.RelativeLayout;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.breakpoint.a;
import com.yxcorp.gifshow.camera.record.breakpoint.panel.a;
import com.kwai.video.player.KsMediaPlayer;
import com.yxcorp.gifshow.model.Lyrics;
import com.yxcorp.gifshow.camera.record.widget.SingleLineLyricWordView;
import com.yxcorp.gifshow.camera.record.base.g;
import rc9.a;
import com.yxcorp.gifshow.camera.record.breakpoint.b;
import j36.d;
import j36.g;
import android.view.ViewPropertyAnimator;
import com.yxcorp.gifshow.camera.record.breakpoint.panel.BreakpointPanel$a;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent$PanelType;
import com.yxcorp.gifshow.camera.record.breakpoint.panel.BreakpointBar;
import android.view.View;
import ekd.m1;
import android.widget.TextView;
import sc9.b;
import android.view.View$OnClickListener;
import sc9.c;
import com.yxcorp.gifshow.camera.record.breakpoint.panel.BreakpointPanel$b;
import com.yxcorp.gifshow.util.DateUtils;
import com.kwai.robust.PatchProxyResult;
import android.text.SpannableStringBuilder;
import java.lang.CharSequence;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import android.text.style.ForegroundColorSpan;
import unc.d;

public class BreakpointPanel extends RelativeLayout implements d	// class@000db6
{
    public View b;
    public View c;
    public TextView d;
    public TextView e;
    public TextView f;
    public BreakpointBar g;
    public a h;
    public boolean i;
    public static final int j;

    static {
       BreakpointPanel.j = a1.g() + a1.e(100.00f);
    }
    public void BreakpointPanel(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BreakpointPanel.class, "6")) {
          return;
       }
       if (this.i == null) {
          return;
       }
       this.i = false;
       BreakpointPanel th = this.h;
       Objects.requireNonNull(th);
       if (!PatchProxy.applyVoid(objArray, th, a.class, "15")) {
          a q = th.q;
          Objects.requireNonNull(q);
          if (!PatchProxy.applyVoid(objArray, q, a.class, "5") && q.c(false)) {
             q.f.setLooping(true);
             q.b.a(objArray);
             q.c.P0();
             if (q.c.d1()) {
                q.g();
                q.f.seekTo((q.g + (long)q.e.b));
             }
          }
          q = th.o;
          Objects.requireNonNull(q);
          if (!PatchProxy.applyVoid(objArray, q, b.class, "4")) {
             q.a();
          }
          if (th.x != null) {
             d.c().g(th.x);
          }
       }
       this.animate().translationY((float)BreakpointPanel.j).setListener(new BreakpointPanel$a(this));
       RxBus.f.b(new PanelShowEvent(CameraPageType.VIDEO, PanelShowEvent$PanelType.BREAKPOINT, this.getContext(), false));
       return;
    }
    public boolean b(){
       return this.i;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, BreakpointPanel.class, "10")) {
          return;
       }
       this.f();
       this.e();
       this.g.a();
       this.d();
       this.requestLayout();
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, BreakpointPanel.class, "13")) {
          return;
       }
       this.g.b();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BreakpointPanel.class, "1")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a0516);
       this.g = m1.f(p0, 0x7f0a050c);
       this.c = m1.f(p0, 0x7f0a0517);
       this.e = m1.f(p0, 0x7f0a050e);
       this.d = m1.f(p0, 0x7f0a050f);
       this.f = m1.f(p0, 0x7f0a0519);
       m1.a(p0, new b(this), R.id.breakpoint_btn_cancel);
       m1.a(p0, new c(this), R.id.breakpoint_panel);
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, BreakpointPanel.class, "12")) {
          return;
       }
       BreakpointPanel td = this.d;
       int i = (this.h.p.h() && !this.h.p.f())? 0x7f1041d4: 0x7f1041d3;
       td.setText(i);
       this.d.setEnabled(this.h.p.g());
       this.d.setOnClickListener(new BreakpointPanel$b(this));
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, BreakpointPanel.class, "11")) {
          return;
       }
       this.d.setEnabled(this.h.p.g());
       BreakpointPanel te = this.e;
       a p = this.h.p;
       a c = p.c;
       BreakpointPanel uBreakpointP = 1;
       boolean b = false;
       boolean b1 = (c != null && c != p.a)? true: false;
       te.setEnabled(b1);
       a p1 = this.h.p;
       p = p1.d;
       if (p >= p1.a && p1.j == null) {
          uBreakpointP = null;
       }
       if (uBreakpointP) {
          String str = DateUtils.q((long)p, b);
          BreakpointPanel tf = this.f;
          String str1 = a1.r(R.string.arg_RES_7f1003dc, str);
          SpannableStringBuilder spannableStr = PatchProxy.applyTwoRefs(str1, str, this, BreakpointPanel.class, "15");
          if (spannableStr != PatchProxyResult.class) {
          }else {
             spannableStr = new SpannableStringBuilder(str1);
             Matcher matcher = Pattern.compile(str).matcher(str1);
             while (matcher.find()) {
                spannableStr.setSpan(new ForegroundColorSpan(-1), matcher.start(), matcher.end(), 33);
             }
          }
          tf.setText(spannableStr);
       }else {
          this.f.setText(R.string.arg_RES_7f1003db);
       }
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, BreakpointPanel.class, "2")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       this.setTranslationY((float)BreakpointPanel.j);
       d.b(this.b);
       return;
    }
}
