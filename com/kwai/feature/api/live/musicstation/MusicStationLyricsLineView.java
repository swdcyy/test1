package com.kwai.feature.api.live.musicstation.MusicStationLyricsLineView;
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
import java.lang.CharSequence;
import android.text.TextUtils;
import android.text.Layout;
import android.graphics.DrawFilter;
import java.lang.Integer;
import android.graphics.Path$Direction;
import java.lang.Boolean;
import java.util.Collection;
import com.yxcorp.gifshow.model.Lyrics$Meta;
import java.lang.Character;
import android.graphics.Rect;

public class MusicStationLyricsLineView extends AppCompatTextView	// class@000fe7
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
    public int v;
    public String w;

    public void MusicStationLyricsLineView(Context p0){
       super(p0);
       this.h = new ArrayList();
       this.i = new ArrayList();
       this.j = new ArrayList();
       this.k = new ArrayList();
       this.l = new ArrayList();
       this.m = new ArrayList();
       this.n = new ArrayList();
       this.p = true;
       this.r = a1.a(0x7f060753);
       this.s = new Path();
       this.t = new RectF();
       this.u = new PaintFlagsDrawFilter(0, 71);
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, MusicStationLyricsLineView.class, "2")) {
          return;
       }
       super.onAttachedToWindow();
       p1.j(this, 1);
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, MusicStationLyricsLineView.class, "3")) {
          return;
       }
       super.onDetachedFromWindow();
       p1.j(this, 0);
       return;
    }
    public void onDraw(Canvas p0){
       int[] ointArray1;
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicStationLyricsLineView.class, "9")) {
          return;
       }
       Object[] objArray = null;
       boolean b = true;
       boolean b1 = false;
       if (this.f.mMeta.isEmpty() && this.p != null) {
          if (!PatchProxy.applyVoid(objArray, this, MusicStationLyricsLineView.class, "12")) {
             int[][] ointArray = new int[][2]{ointArray1,ointArray1};
             ointArray1 = new int[b];
             ointArray1[b1] = 0x10100a1;
             ointArray1 = new int[b1];
             this.setTextColor(new ColorStateList(ointArray, new int[2]{-1,0x4dffffff}));
          }
          this.p = b1;
       }
       super.onDraw(p0);
       if (TextUtils.isEmpty(this.w) && !TextUtils.isEmpty(this.getText())) {
          this.w = this.getText().subSequence(b1, this.getLayout().getLineEnd(b1)).toString();
       }
       if (!this.isSelected()) {
          return;
       }else {
          Layout layout = this.getLayout();
          if (this.g == null) {
             this.p(layout);
             this.g = b;
          }
          if (this.o != null) {
             return;
          }else {
             DrawFilter drawFilter = p0.getDrawFilter();
             p0.setDrawFilter(this.u);
             if (!PatchProxy.applyVoid(objArray, this, MusicStationLyricsLineView.class, "13")) {
                this.s.reset();
                while (b1 < this.h.size() && this.i.get(b1).intValue() <= this.q) {
                   if (this.j.get(b1).intValue() <= this.q) {
                      this.s.addRect(this.n.get(b1), Path$Direction.CW);
                   }else {
                      RectF rectF = this.n.get(b1);
                      int i = this.q - this.i.get(b1).intValue();
                      float f = rectF.width() * (float)i;
                      f = f / (float)this.k.get(b1).intValue();
                      RectF left = rectF.left;
                      f = f + left;
                      this.t.set(left, rectF.top, f, rectF.bottom);
                      this.s.addRect(this.t, Path$Direction.CW);
                   }
                   b1 = b1 + 1;
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
       if (PatchProxy.isSupport(MusicStationLyricsLineView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, MusicStationLyricsLineView.class, "8")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       if (p0) {
          this.q();
       }
       return;
    }
    public final void p(Layout p0){
       float f1;
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicStationLyricsLineView.class, "11")) {
          return;
       }
       this.q();
       this.h.addAll(this.f.mMeta);
       Lyrics$Line mStart = this.f.mStart;
       boolean b = (!this.h.size())? true: false;
       this.o = b;
       Lyrics$Line mText = this.f.mText;
       for (int i = 0; i < this.h.size(); i = i + 1) {
          Lyrics$Meta meta = this.h.get(i);
          int i1 = meta.mStart + mStart;
          this.i.add(Integer.valueOf(i1));
          this.k.add(Integer.valueOf(meta.mDuration));
          i1 = meta.mStart + mStart;
          i1 = i1 + meta.mDuration;
          this.j.add(Integer.valueOf(i1));
          meta = meta.mStartTextIndex;
          this.l.add(Integer.valueOf(meta));
          int i2 = this.h.size() - 1;
          i2 = (i == i2)? 1: 0;
          if (i2) {
             i2 = mText.length();
          }else {
             i1 = i + 1;
             Lyrics$Meta mStartTextIn = this.h.get(i1).mStartTextIndex;
          }
          i2 = i2 - 1;
          while (i2 > meta && Character.isSpace(mText.charAt(i2))) {
             i2 = i2 - 1;
          }
          this.m.add(Integer.valueOf(i2));
          i1 = p0.getLineForOffset(meta);
          if (i1 != p0.getLineForOffset(i2)) {
             this.o = true;
          }else {
             Rect rect = new Rect();
             p0.getLineBounds(i1, rect);
             float f = p0.getPrimaryHorizontal(meta) + (float)this.getPaddingLeft();
             int i3 = i2 + 1;
             if (i2 >= mText.length()) {
                i2 = rect.width();
                i1 = this.getPaddingLeft();
             }else if(p0.getLineForOffset(i3) != i1){
                i2 = rect.width();
                i1 = this.getPaddingLeft();
             }else {
                f1 = p0.getPrimaryHorizontal(i3) + (float)this.getPaddingLeft();
             label_00f3 :
                i1 = rect.top + this.getPaddingTop();
                int i4 = rect.bottom + this.getPaddingTop();
                this.n.add(new RectF(f, (float)i1, f1, (float)i4));
             }
             i2 = i2 + i1;
             f1 = (float)i2;
             goto label_00f3 ;
          }
       }
       return;
    }
    public final void q(){
       if (PatchProxy.applyVoid(null, this, MusicStationLyricsLineView.class, "14")) {
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
    public void setOriginPaddingRight(int p0){
       this.v = p0;
    }
    public void setSelected(boolean p0){
       if (PatchProxy.isSupport(MusicStationLyricsLineView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, MusicStationLyricsLineView.class, "4")) {
          return;
       }
       super.setSelected(p0);
       if (!p0) {
          this.q();
       }
       return;
    }
}
