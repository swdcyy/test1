package com.yxcorp.plugin.search.template.bigcard.widget.ConnerFrameLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint;
import lnc.a1;
import ekd.r;
import android.graphics.RectF;
import android.graphics.Path;
import android.graphics.Canvas;
import android.view.ViewGroup;
import java.lang.Integer;
import android.view.View;
import android.graphics.Path$Direction;
import android.graphics.Path$FillType;

public class ConnerFrameLayout extends FrameLayout	// class@00077e
{
    public Paint b;
    public int c;
    public RectF d;
    public Path e;
    public boolean f;
    public boolean g;

    public void ConnerFrameLayout(Context p0){
       super(p0);
       this.f = true;
       this.g = true;
       this.a(p0);
    }
    public void ConnerFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.f = true;
       this.g = true;
       this.g = p0.obtainStyledAttributes(p1, c$b.Q4).getBoolean(0, true);
       this.a(p0);
    }
    public void ConnerFrameLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.f = true;
       this.g = true;
       this.a(p0);
    }
    public final void a(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ConnerFrameLayout.class, "1")) {
          return;
       }
       this.b = new Paint(1);
       this.c = a1.d(0x7f070e56);
       this.b.setColor(r.b(p0, R.color.arg_RES_7f061b13));
       this.d = new RectF();
       this.e = new Path();
       return;
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ConnerFrameLayout.class, "3")) {
          return;
       }
       super.dispatchDraw(p0);
       if (this.f != null) {
          p0.drawPath(this.e, this.b);
       }
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(ConnerFrameLayout.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, ConnerFrameLayout.class, "2")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       float f = 0;
       this.d.set(f, f, (float)p0, (float)p1);
       this.e.reset();
       ConnerFrameLayout te = this.e;
       ConnerFrameLayout td = this.d;
       ConnerFrameLayout tc = this.c;
       float f1 = (float)tc;
       if (this.g != null) {
          f = (float)tc;
       }
       te.addRoundRect(td, f1, f, Path$Direction.CCW);
       this.e.addRect(this.d, Path$Direction.CW);
       this.e.setFillType(Path$FillType.WINDING);
       return;
    }
    public void setEnableConner(boolean p0){
       this.f = p0;
    }
}
