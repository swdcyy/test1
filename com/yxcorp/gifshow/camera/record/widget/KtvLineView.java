package com.yxcorp.gifshow.camera.record.widget.KtvLineView;
import androidx.appcompat.widget.AppCompatTextView;
import lnc.a1;
import android.content.Context;
import java.util.ArrayList;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.PaintFlagsDrawFilter;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import android.view.View;
import ekd.p1;
import android.graphics.Canvas;
import android.text.Layout;
import com.yxcorp.gifshow.model.Lyrics$Line;
import java.util.Collection;
import java.util.List;
import com.yxcorp.gifshow.model.Lyrics$Meta;
import java.lang.Integer;
import java.lang.Character;
import android.graphics.Rect;
import android.graphics.DrawFilter;
import android.graphics.Path$Direction;
import android.content.res.ColorStateList;
import java.lang.Boolean;
import java.lang.CharSequence;

public class KtvLineView extends AppCompatTextView	// class@000fc5
{
    public Lyrics$Line f;
    public boolean g;
    public List h;
    public List i;
    public List j;
    public List k;
    public List l;
    public List m;
    public List n;
    public boolean o;
    public boolean p;
    public int q;
    public Path r;
    public RectF s;
    public DrawFilter t;
    public int u;
    public int v;
    public int w;
    public static final int x;

    static {
       KtvLineView.x = a1.a(0x7f061c9b);
    }
    public void KtvLineView(Context p0){
       super(p0);
       this.h = new ArrayList();
       this.i = new ArrayList();
       this.j = new ArrayList();
       this.k = new ArrayList();
       this.l = new ArrayList();
       this.m = new ArrayList();
       this.n = new ArrayList();
       this.r = new Path();
       this.s = new RectF();
       this.t = new PaintFlagsDrawFilter(0, 199);
       this.u = -1;
       this.v = -1;
       this.w = KtvLineView.x;
    }
    public void KtvLineView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.h = new ArrayList();
       this.i = new ArrayList();
       this.j = new ArrayList();
       this.k = new ArrayList();
       this.l = new ArrayList();
       this.m = new ArrayList();
       this.n = new ArrayList();
       this.r = new Path();
       this.s = new RectF();
       this.t = new PaintFlagsDrawFilter(0, 199);
       this.u = -1;
       this.v = -1;
       this.w = KtvLineView.x;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, KtvLineView.class, "2")) {
          return;
       }
       super.onAttachedToWindow();
       p1.j(this, 1);
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, KtvLineView.class, "3")) {
          return;
       }
       super.onDetachedFromWindow();
       p1.j(this, 0);
       return;
    }
    public void onDraw(Canvas p0){
       int i;
       float f2;
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvLineView.class, "7")) {
          return;
       }
       super.onDraw(p0);
       if (!this.isSelected()) {
          return;
       }
       if (this.f == null) {
          return;
       }
       boolean b = false;
       if (this.p != null) {
          this.r();
          this.g = b;
          return;
       }else {
          Layout layout = this.getLayout();
          if (this.g == null) {
             boolean b1 = true;
             if (!PatchProxy.applyVoidOneRefs(layout, this, KtvLineView.class, "8")) {
                this.r();
                this.h.addAll(this.f.mMeta);
                Lyrics$Line mStart = this.f.mStart;
                boolean b2 = (!this.h.size())? true: false;
                this.o = b2;
                Lyrics$Line mText = this.f.mText;
                for (i = 0; i < this.h.size(); i = i + 1) {
                   Lyrics$Meta meta = this.h.get(i);
                   int i1 = meta.mStart + mStart;
                   this.i.add(Integer.valueOf(i1));
                   this.k.add(Integer.valueOf(meta.mDuration));
                   i1 = meta.mStart + mStart;
                   i1 = i1 + meta.mDuration;
                   this.j.add(Integer.valueOf(i1));
                   meta = meta.mStartTextIndex;
                   this.l.add(Integer.valueOf(meta));
                   int i2 = this.h.size() - b1;
                   i2 = (i == i2)? 1: 0;
                   if (i2) {
                      i2 = mText.length();
                   }else {
                      i1 = i + 1;
                      Lyrics$Meta mStartTextIn = this.h.get(i1).mStartTextIndex;
                   }
                   i2 = i2 - b1;
                   while (i2 > meta && Character.isSpace(mText.charAt(i2))) {
                      i2 = i2 - 1;
                   }
                   this.m.add(Integer.valueOf(i2));
                   i1 = layout.getLineForOffset(meta);
                   if (i1 != layout.getLineForOffset(i2)) {
                      this.o = b1;
                   }else {
                      Rect rect = new Rect();
                      layout.getLineBounds(i1, rect);
                      float f1 = layout.getPrimaryHorizontal(meta) + (float)this.getPaddingLeft();
                      int i3 = i2 + 1;
                      if (i2 >= mText.length()) {
                         i2 = rect.width();
                         i1 = this.getPaddingLeft();
                      }else if(layout.getLineForOffset(i3) != i1){
                         i2 = rect.width();
                         i1 = this.getPaddingLeft();
                      }else {
                         f2 = layout.getPrimaryHorizontal(i3) + (float)this.getPaddingLeft();
                      label_0120 :
                         i1 = rect.top + this.getPaddingTop();
                         int i4 = rect.bottom + this.getPaddingTop();
                         this.n.add(new RectF(f1, (float)i1, f2, (float)i4));
                      }
                      i2 = i2 + i1;
                      f2 = (float)i2;
                      goto label_0120 ;
                   }
                }
             }
             this.g = b1;
          }
          if (this.o != null) {
             return;
          }else {
             DrawFilter drawFilter = p0.getDrawFilter();
             p0.setDrawFilter(this.t);
             if (!PatchProxy.applyVoid(null, this, KtvLineView.class, "9")) {
                this.r.reset();
                while (b < this.h.size() && this.i.get(b).intValue() <= this.q) {
                   if (this.j.get(b).intValue() <= this.q) {
                      this.r.addRect(this.n.get(b), Path$Direction.CW);
                   }else {
                      RectF rectF = this.n.get(b);
                      i = this.q - this.i.get(b).intValue();
                      float f = rectF.width() * (float)i;
                      f = f / (float)this.k.get(b).intValue();
                      RectF left = rectF.left;
                      f = f + left;
                      this.s.set(left, rectF.top, f, rectF.bottom);
                      this.r.addRect(this.s, Path$Direction.CW);
                   }
                   b = b + 1;
                }
             }
             p0.save();
             this.setTextColor(this.w);
             p0.clipPath(this.r);
             super.onDraw(p0);
             this.setTextColor(this.getTextColors());
             p0.setDrawFilter(drawFilter);
             p0.restore();
             return;
          }
       }
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(KtvLineView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, KtvLineView.class, "6")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       if (p0) {
          this.r();
       }
       return;
    }
    public void p(Lyrics$Line p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvLineView.class, "1")) {
          return;
       }
       this.f = p0;
       this.setWillNotDraw(false);
       String str = (p0 == null)? "": p0.mText;
       this.setText(str);
       this.r();
       this.setPaintFlags(199);
       return;
    }
    public void q(){
       if (PatchProxy.applyVoid(null, this, KtvLineView.class, "12")) {
          return;
       }
       this.setTextColor(this.u);
       this.invalidate();
       return;
    }
    public final void r(){
       if (PatchProxy.applyVoid(null, this, KtvLineView.class, "10")) {
          return;
       }
       this.h.clear();
       this.i.clear();
       this.j.clear();
       this.k.clear();
       this.l.clear();
       this.m.clear();
       this.n.clear();
       this.r.reset();
       this.g = false;
       this.o = false;
       return;
    }
    public void s(int p0){
       if (PatchProxy.isSupport(KtvLineView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, KtvLineView.class, "5")) {
          return;
       }
       if (!this.isSelected()) {
          return;
       }
       if (this.o != null) {
          return;
       }
       this.q = p0;
       this.invalidate();
       return;
    }
    public void setActiveLineBaseColor(int p0){
       this.v = p0;
    }
    public void setActiveLineHighlightWordColor(int p0){
       this.w = p0;
    }
    public void setDragMode(boolean p0){
       if (PatchProxy.isSupport(KtvLineView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KtvLineView.class, "11")) {
          return;
       }
       this.p = p0;
       this.invalidate();
       return;
    }
    public void setNormalLineColor(int p0){
       this.u = p0;
    }
    public void setSelected(boolean p0){
       if (PatchProxy.isSupport(KtvLineView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KtvLineView.class, "4")) {
          return;
       }
       if (p0) {
          this.setTextColor(this.v);
       }else {
          this.setTextColor(this.u);
          this.r();
       }
       super.setSelected(p0);
       return;
    }
}
