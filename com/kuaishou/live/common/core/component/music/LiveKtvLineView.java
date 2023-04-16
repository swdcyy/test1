package com.kuaishou.live.common.core.component.music.LiveKtvLineView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import java.util.ArrayList;
import lnc.a1;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.PaintFlagsDrawFilter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import android.view.View;
import ekd.p1;
import android.graphics.Canvas;
import com.yxcorp.gifshow.model.Lyrics$Line;
import java.util.List;
import android.content.res.ColorStateList;
import android.text.Layout;
import java.util.Collection;
import com.yxcorp.gifshow.model.Lyrics$Meta;
import java.lang.Integer;
import java.lang.Character;
import android.graphics.Rect;
import android.graphics.DrawFilter;
import android.graphics.Path$Direction;
import java.lang.Boolean;

public class LiveKtvLineView extends AppCompatTextView	// class@0016ad
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
    public int r;
    public Path s;
    public RectF t;
    public DrawFilter u;

    public void LiveKtvLineView(Context p0){
       super(p0);
       this.h = new ArrayList();
       this.i = new ArrayList();
       this.j = new ArrayList();
       this.k = new ArrayList();
       this.l = new ArrayList();
       this.m = new ArrayList();
       this.n = new ArrayList();
       this.p = true;
       this.r = a1.a(0x7f061cf4);
       this.s = new Path();
       this.t = new RectF();
       this.u = new PaintFlagsDrawFilter(0, 71);
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, LiveKtvLineView.class, "2")) {
          return;
       }
       super.onAttachedToWindow();
       p1.j(this, 1);
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveKtvLineView.class, "3")) {
          return;
       }
       super.onDetachedFromWindow();
       p1.j(this, 0);
       return;
    }
    public void onDraw(Canvas p0){
       boolean i;
       float f2;
       int[] ointArray1;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveKtvLineView.class, "7")) {
          return;
       }
       Object[] objArray = null;
       boolean b = false;
       boolean b1 = true;
       if (this.f.mMeta.isEmpty() && this.p != null) {
          if (!PatchProxy.applyVoid(objArray, this, LiveKtvLineView.class, "9")) {
             int[][] ointArray = new int[][2]{ointArray1,ointArray1};
             ointArray1 = new int[b1];
             ointArray1[b] = 0x10100a1;
             ointArray1 = new int[b];
             this.setTextColor(new ColorStateList(ointArray, new int[2]{0xfffe3666,0x80ffffff}));
          }
          this.p = b;
       }
       super.onDraw(p0);
       if (!this.isSelected()) {
          return;
       }else {
          Layout layout = this.getLayout();
          if (this.g == null) {
             if (!PatchProxy.applyVoidOneRefs(layout, this, LiveKtvLineView.class, "8")) {
                this.p();
                this.h.addAll(this.f.mMeta);
                Lyrics$Line mStart = this.f.mStart;
                i = (!this.h.size())? true: false;
                this.o = i;
                Lyrics$Line mText = this.f.mText;
                for (int i1 = 0; i1 < this.h.size(); i1 = i1 + 1) {
                   Lyrics$Meta meta = this.h.get(i1);
                   int i2 = meta.mStart + mStart;
                   this.i.add(Integer.valueOf(i2));
                   this.k.add(Integer.valueOf(meta.mDuration));
                   i2 = meta.mStart + mStart;
                   i2 = i2 + meta.mDuration;
                   this.j.add(Integer.valueOf(i2));
                   meta = meta.mStartTextIndex;
                   this.l.add(Integer.valueOf(meta));
                   int i3 = this.h.size() - b1;
                   i3 = (i1 == i3)? 1: 0;
                   if (i3) {
                      i3 = mText.length();
                   }else {
                      i2 = i1 + 1;
                      Lyrics$Meta mStartTextIn = this.h.get(i2).mStartTextIndex;
                   }
                   i3 = i3 - b1;
                   while (i3 > meta && Character.isSpace(mText.charAt(i3))) {
                      i3 = i3 - 1;
                   }
                   this.m.add(Integer.valueOf(i3));
                   i2 = layout.getLineForOffset(meta);
                   if (i2 != layout.getLineForOffset(i3)) {
                      this.o = b1;
                   }else {
                      Rect rect = new Rect();
                      layout.getLineBounds(i2, rect);
                      float f1 = layout.getPrimaryHorizontal(meta) + (float)this.getPaddingLeft();
                      int i4 = i3 + 1;
                      if (i3 >= mText.length()) {
                         i3 = rect.width();
                         i2 = this.getPaddingLeft();
                      }else if(layout.getLineForOffset(i4) != i2){
                         i3 = rect.width();
                         i2 = this.getPaddingLeft();
                      }else {
                         f2 = layout.getPrimaryHorizontal(i4) + (float)this.getPaddingLeft();
                      label_014a :
                         i2 = rect.top + this.getPaddingTop();
                         int i5 = rect.bottom + this.getPaddingTop();
                         this.n.add(new RectF(f1, (float)i2, f2, (float)i5));
                      }
                      i3 = i3 + i2;
                      f2 = (float)i3;
                      goto label_014a ;
                   }
                }
             }
             this.g = b1;
          }
          if (this.o != null) {
             return;
          }else {
             DrawFilter drawFilter = p0.getDrawFilter();
             p0.setDrawFilter(this.u);
             if (!PatchProxy.applyVoid(objArray, this, LiveKtvLineView.class, "10")) {
                this.s.reset();
                while (b < this.h.size() && this.i.get(b).intValue() <= this.q) {
                   if (this.j.get(b).intValue() <= this.q) {
                      this.s.addRect(this.n.get(b), Path$Direction.CW);
                   }else {
                      RectF rectF = this.n.get(b);
                      i = this.q - this.i.get(b).intValue();
                      float f = rectF.width() * (float)i;
                      f = f / (float)this.k.get(b).intValue();
                      RectF left = rectF.left;
                      f = f + left;
                      this.t.set(left, rectF.top, f, rectF.bottom);
                      this.s.addRect(this.t, Path$Direction.CW);
                   }
                   b = b + 1;
                }
             }
             p0.save();
             this.setTextColor(this.r);
             p0.clipPath(this.s);
             super.onDraw(p0);
             this.setTextColor(this.getTextColors());
             p0.setDrawFilter(drawFilter);
             p0.restore();
             return;
          }
       }
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(LiveKtvLineView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, LiveKtvLineView.class, "6")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       if (p0) {
          this.p();
       }
       return;
    }
    public final void p(){
       if (PatchProxy.applyVoid(null, this, LiveKtvLineView.class, "11")) {
          return;
       }
       this.h.clear();
       this.i.clear();
       this.j.clear();
       this.k.clear();
       this.l.clear();
       this.m.clear();
       this.n.clear();
       this.s.reset();
       this.g = false;
       this.o = false;
       return;
    }
    public void setHighLightColor(int p0){
       this.r = p0;
    }
    public void setSelected(boolean p0){
       if (PatchProxy.isSupport(LiveKtvLineView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveKtvLineView.class, "4")) {
          return;
       }
       super.setSelected(p0);
       if (!p0) {
          this.p();
       }
       return;
    }
}
