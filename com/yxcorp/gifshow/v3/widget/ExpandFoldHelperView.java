package com.yxcorp.gifshow.v3.widget.ExpandFoldHelperView;
import android.view.GestureDetector$OnGestureListener;
import android.widget.RelativeLayout;
import android.content.Context;
import com.kuaishou.ax2c.AX2C;
import android.view.ViewGroup;
import android.view.View;
import com.yxcorp.gifshow.v3.widget.ExpandFoldHelperView$c;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import com.yxcorp.gifshow.v3.widget.ExpandFoldHelperView$f;
import java.lang.Integer;
import android.widget.TextView;
import com.yxcorp.gifshow.v3.widget.ExpandFoldHelperView$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.widget.ExpandFoldHelperView$b;
import com.yxcorp.gifshow.v3.widget.ExpandFoldHelperView$d;
import dg.h;
import dg.e;
import ekd.f;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ooc.g1;
import com.yxcorp.gifshow.v3.widget.ExpandFoldHelperView$e;
import com.yxcorp.gifshow.v3.widget.ExpandFoldHelperView$g;
import java.lang.CharSequence;

public class ExpandFoldHelperView extends RelativeLayout implements GestureDetector$OnGestureListener	// class@00164a
{
    public View b;
    public View c;
    public float d;
    public float e;
    public ExpandFoldHelperView$f f;
    public ExpandFoldHelperView$g g;
    public int h;
    public boolean i;
    public boolean j;
    public View k;
    public View l;
    public TextView m;
    public int n;
    public boolean o;
    public ExpandFoldHelperView$e p;
    public int q;
    public final m r;
    public boolean s;

    public void ExpandFoldHelperView(Context p0){
       super(p0);
       new AX2C(this.getContext()).inflateSync(R.layout.edit_expand_fold_help_view, this, true);
       this.r = new ExpandFoldHelperView$c(this);
    }
    public void ExpandFoldHelperView(Context p0,AttributeSet p1){
       super(p0, p1);
       new AX2C(this.getContext()).inflateSync(R.layout.edit_expand_fold_help_view, this, true);
       this.r = new ExpandFoldHelperView$c(this);
    }
    public void ExpandFoldHelperView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       new AX2C(this.getContext()).inflateSync(R.layout.edit_expand_fold_help_view, this, true);
       this.r = new ExpandFoldHelperView$c(this);
    }
    public void a(float p0){
       if (PatchProxy.isSupport(ExpandFoldHelperView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ExpandFoldHelperView.class, "7")) {
          return;
       }
       this.d();
       ExpandFoldHelperView th = this.h;
       float f = (float)th;
       int i = (int)(f - ((float)th * (p0 / (this.d - this.e))));
       if (i < 0) {
          i = 0;
       }
       if (this.j == null) {
          RelativeLayout$LayoutParams layoutParams = this.b.getLayoutParams();
          layoutParams.height = i;
          this.b.setLayoutParams(layoutParams);
       }
       this.c.setTranslationY(p0);
       this.c.invalidate();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, ExpandFoldHelperView.class, "5")) {
          return;
       }
       this.o = false;
       ExpandFoldHelperView tc = this.c;
       if (tc != null) {
          tc.setTranslationY(0);
          this.a(0);
          tc = this.f;
          if (tc != null) {
             tc.q();
          }
       }
       return;
    }
    public void c(View p0,int p1){
       if (PatchProxy.isSupport(ExpandFoldHelperView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ExpandFoldHelperView.class, "2")) {
          return;
       }
       this.b = this.findViewById(0x7f0a0e51);
       this.k = this.findViewById(0x7f0a1716);
       this.l = this.findViewById(0x7f0a3643);
       this.m = this.findViewById(0x7f0a0c7e);
       this.c = p0;
       this.q = p1;
       this.k.setOnClickListener(new ExpandFoldHelperView$a(this));
       this.l.setOnClickListener(new ExpandFoldHelperView$b(this));
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, ExpandFoldHelperView.class, "3")) {
          return;
       }
       ExpandFoldHelperView uExpandFoldH = null;
       if (this.d - uExpandFoldH <= 0) {
          this.d = (float)this.c.getHeight();
       }
       if (this.e - uExpandFoldH <= 0) {
          this.e = (float)this.b.getHeight();
       }
       uExpandFoldH = this.n;
       if (this.e - (float)uExpandFoldH < 0) {
          this.e = (float)uExpandFoldH;
       }
       if (this.h <= null) {
          this.h = this.b.getHeight();
       }
       return;
    }
    public final void e(float p0){
       if (PatchProxy.isSupport(ExpandFoldHelperView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ExpandFoldHelperView.class, "6")) {
          return;
       }
       if (this.s != null) {
          return;
       }
       if ((v0 = p0) > 0) {
          ExpandFoldHelperView tf = this.f;
          if (tf != null) {
             tf.p();
          }
       }
       if (!this.c.getTranslationY() - p0) {
          if (!v0) {
             ExpandFoldHelperView tf1 = this.f;
             if (tf1 != null) {
                tf1.q();
             }
          }
          return;
       }else {
          f.n(this.c.getTranslationY(), (float)(int)p0, 700.00f, 40.00f, new ExpandFoldHelperView$d(this, p0));
          this.s = true;
          return;
       }
    }
    public TextView getTitleTextView(){
       return this.m;
    }
    public boolean onDown(MotionEvent p0){
       this.i = false;
       return false;
    }
    public boolean onFling(MotionEvent p0,MotionEvent p1,float p2,float p3){
       return false;
    }
    public void onLongPress(MotionEvent p0){
    }
    public boolean onScroll(MotionEvent p0,MotionEvent p1,float p2,float p3){
       return false;
    }
    public void onShowPress(MotionEvent p0){
    }
    public boolean onSingleTapUp(MotionEvent p0){
       p0 = PatchProxy.applyOneRefs(p0, this, ExpandFoldHelperView.class, "8");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       if (this.i != null) {
          return true;
       }
       this.d();
       ExpandFoldHelperView td = this.d;
       ExpandFoldHelperView te = this.e;
       if (this.c.getTranslationY() - ((td - te) / 2.00f) < 0) {
          this.e((td - te));
          g1.v(this.q, "editor_scenes_fold", "");
       }else {
          this.e(0);
          g1.v(this.q, "editor_scenes_expand", "");
       }
       return true;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(ExpandFoldHelperView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, ExpandFoldHelperView.class, "4")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.n = p1;
       return;
    }
    public void setClickInterceptor(ExpandFoldHelperView$e p0){
       this.p = p0;
    }
    public void setExpandFoldListener(ExpandFoldHelperView$f p0){
       this.f = p0;
    }
    public void setFill(boolean p0){
       this.j = p0;
    }
    public void setPreActionListener(ExpandFoldHelperView$g p0){
       this.g = p0;
    }
    public void setTitle(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ExpandFoldHelperView.class, "1")) {
          return;
       }
       if (this.m == null) {
          this.m = this.findViewById(0x7f0a0c7e);
       }
       this.m.setText(p0);
       return;
    }
}
