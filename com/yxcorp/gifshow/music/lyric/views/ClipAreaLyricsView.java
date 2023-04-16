package com.yxcorp.gifshow.music.lyric.views.ClipAreaLyricsView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.Scroller;
import android.view.ViewConfiguration;
import android.graphics.Paint;
import com.yxcorp.utility.n;
import android.view.GestureDetector;
import spb.a;
import android.view.GestureDetector$OnGestureListener;
import java.lang.Integer;
import java.util.List;
import com.yxcorp.gifshow.model.Lyrics$Line;
import com.yxcorp.gifshow.music.lyric.views.ClipAreaLyricsView$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;
import java.lang.Long;
import java.lang.Boolean;
import java.util.Collection;
import ekd.q;
import qpb.p;
import android.graphics.Canvas;
import qpb.o;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.Lyrics$Meta;
import spb.b;
import android.view.View$OnLayoutChangeListener;
import android.view.MotionEvent;
import com.yxcorp.gifshow.model.Lyrics;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public class ClipAreaLyricsView extends View	// class@00205a
{
    public int A;
    public int B;
    public boolean C;
    public Scroller D;
    public int E;
    public ClipAreaLyricsView$a F;
    public GestureDetector G;
    public int b;
    public int c;
    public int d;
    public Paint e;
    public Paint f;
    public Paint g;
    public long h;
    public long i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public int n;
    public int o;
    public long p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public List v;
    public long w;
    public boolean x;
    public float y;
    public float z;

    public void ClipAreaLyricsView(Context p0){
       super(p0, null, 0);
    }
    public void ClipAreaLyricsView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void ClipAreaLyricsView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = -45056;
       this.c = -1;
       this.d = -2130706433;
       this.h = -1;
       this.i = -1;
       this.j = -1;
       this.k = -1;
       this.l = -1;
       this.m = true;
       this.n = 3;
       this.B = -1;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.c3);
       this.t = typedArray.getDimensionPixelSize(7, 30);
       this.u = typedArray.getDimensionPixelSize(8, 30);
       typedArray.recycle();
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ClipAreaLyricsView.class, "1")) {
       }else {
          this.D = new Scroller(this.getContext());
          this.E = ViewConfiguration.get(this.getContext()).getScaledTouchSlop();
          Paint paint = new Paint(true);
          this.e = paint;
          paint.setTextSize((float)this.u);
          this.e.setColor(this.b);
          paint = new Paint(true);
          this.f = paint;
          paint.setTextSize((float)this.u);
          this.f.setColor(this.c);
          paint = new Paint(true);
          this.g = paint;
          paint.setTextSize((float)this.u);
          this.g.setColor(this.d);
          this.setVerticalFadingEdgeEnabled(true);
          this.setFadingEdgeLength(n.c(this.getContext(), 50.00f));
          if (!PatchProxy.applyVoid(objArray, this, ClipAreaLyricsView.class, "2")) {
             this.G = new GestureDetector(this.getContext(), new a(this));
          }
       }
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, ClipAreaLyricsView.class, "24")) {
          return;
       }
       int i = this.j * (this.u + this.t);
       int i1 = 400;
       if (!PatchProxy.isSupport(ClipAreaLyricsView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), Integer.valueOf(i1), this, ClipAreaLyricsView.class, "25")) {
          int scrollY = this.getScrollY();
          this.D.startScroll(this.getScrollX(), scrollY, this.getScrollX(), (i - scrollY), 400);
          this.invalidate();
       }
       long l = this.c(i);
       if (!this.e() && this.k(l, true)) {
          ClipAreaLyricsView tF = this.F;
          if (tF != null) {
             tF.b((long)this.v.get(this.j).mStart, this.p);
          }
       }
       return;
    }
    public final int b(){
       Object obj = PatchProxy.apply(null, this, ClipAreaLyricsView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.v.size() * (this.u + this.t));
    }
    public long c(int p0){
       ClipAreaLyricsView tv;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(ClipAreaLyricsView.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ClipAreaLyricsView.class, "6");
          if (obj != patchProxyRe) {
             return obj.longValue();
          }
       }
       long l = 0;
       if (p0 < 0) {
          return l;
       }else if(!p0){
          return this.getClipTimeOrFirstLine();
       }else if(p0 >= this.b()){
          ClipAreaLyricsView tw = this.w;
          if (tw - l > 0) {
             return tw;
          }else {
             tv = this.v;
             return (long)tv.get((tv.size() - 1)).mStart;
          }
       }else {
          float f = 0x3f800000;
          int i = Math.round((((float)p0 * f) / (float)(this.u + this.t)));
          if (i < 0) {
             return l;
          }else if(i >= this.v.size()){
             tv = this.v;
             return (long)tv.get((tv.size() - 1)).mStart;
          }else {
             ClipAreaLyricsView tu = this.u;
             ClipAreaLyricsView tt = this.t;
             float f1 = ((float)(p0 % (tu + tt)) * f) / (float)(tu + tt);
             if (PatchProxy.isSupport(ClipAreaLyricsView.class)) {
                Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(i), this, ClipAreaLyricsView.class, "7");
                if (obj1 != patchProxyRe) {
                   l = obj1.longValue();
                }else if(this.v.get(i).mDuration > null){
                   l = (long)this.v.get(i).mDuration;
                }else {
                   long l1 = (long)this.v.get(i).mStart;
                   int i1 = i + 1;
                   if (i1 < this.v.size()) {
                      l = (long)this.v.get(i1).mStart - l1;
                   }else if(i1 == this.v.size()){
                      tt = this.w;
                      if (tt - l > 0) {
                         l = tt - l1;
                      }
                   }
                }
             }else {
                goto label_00a1 ;
             }
             return (long)(int)((float)this.v.get(i).mStart + ((float)l * f1));
          }
       }
    }
    public void computeScroll(){
       if (PatchProxy.applyVoid(null, this, ClipAreaLyricsView.class, "17")) {
          return;
       }
       if (!this.D.isFinished() && this.D.computeScrollOffset()) {
          int currY = this.D.getCurrY();
          if (this.getScrollY() != currY && this.C == null) {
             this.scrollTo(this.getScrollX(), currY);
          }
          this.invalidate();
       }
       return;
    }
    public void d(long p0){
       if (PatchProxy.isSupport(ClipAreaLyricsView.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, ClipAreaLyricsView.class, "14")) {
          return;
       }
       if (this.C != null) {
          if (this.l != -1) {
             this.l = -1;
             this.invalidate();
          }
          return;
       }else if(this.e()){
          return;
       }else {
          int i = this.g(p0, true, true);
          if (this.l != i && (i >= this.j && i <= this.k)) {
             this.l = i;
             this.invalidate();
          }
       label_0043 :
          return;
       }
    }
    public final boolean e(){
       Object obj = PatchProxy.apply(null, this, ClipAreaLyricsView.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return q.f(this.v);
    }
    public final long f(long p0){
       if (PatchProxy.isSupport(ClipAreaLyricsView.class)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, ClipAreaLyricsView.class, "28");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       if (!q.f(this.v) && this.v.get(0).mStart >= null) {
          p0 = Math.max(p0, (long)this.v.get(0).mStart);
       }
       return p0;
    }
    public final int g(long p0,boolean p1,boolean p2){
       ClipAreaLyricsView obj;
       int i3;
       if (PatchProxy.isSupport(ClipAreaLyricsView.class)) {
          obj = PatchProxy.applyThreeRefs(Long.valueOf(p0), Boolean.valueOf(p1), Boolean.valueOf(p2), this, ClipAreaLyricsView.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = null;
       int i = this.v.size() - 1;
       while (i >= 0) {
          if (p0 - (long)this.v.get(i).mStart >= 0) {
             if (p1 && this.v.get(i).mDuration > null) {
                int i1 = this.v.get(i).mStart + this.v.get(i).mDuration;
                if (p0 - (long)i1 >= 0) {
                   int i2 = i + 1;
                   if (i2 < this.v.size()) {
                      i3 = i2;
                   label_0077 :
                      if (p2 && this.m != null) {
                         i = i - 1;
                         if (i < 0 || this.v.get(i).mStart != this.v.get(i3).mStart) {
                            break ;
                         }
                      }else {
                         break ;
                      }
                   }
                }
             }
             i3 = i;
             goto label_0077 ;
          }
          i = i - 1;
       }
    label_009b :
       return i3;
    }
    public final int getBaseOffset(){
       return ((this.u + this.t) * this.n);
    }
    public final long getClipTimeOrFirstLine(){
       long l;
       ClipAreaLyricsView obj = PatchProxy.apply(null, this, ClipAreaLyricsView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.h;
       if (!obj - -1) {
          int i = (this.e())? 0: this.v.get(this.j).mStart;
          l = (long)i;
       }
       return l;
    }
    public void h(p p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipAreaLyricsView.class, "13")) {
          return;
       }
       this.i(p0.b);
       ClipAreaLyricsView tF = this.F;
       if (tF != null) {
          tF.c(p0, this.p);
       }
       return;
    }
    public void i(long p0){
       if (PatchProxy.isSupport(ClipAreaLyricsView.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, ClipAreaLyricsView.class, "12")) {
          return;
       }
       if (this.e()) {
          return;
       }
       boolean b = this.j(p0);
       int i = this.j * (this.u + this.t);
       boolean b1 = true;
       if (!this.D.isFinished()) {
          this.D.forceFinished(b1);
       }
       if (this.getScrollY() == i) {
          b1 = false;
       }
       this.scrollTo(this.getScrollX(), i);
       if (!b1 && b) {
          this.invalidate();
       }
       return;
    }
    public final boolean j(long p0){
       if (PatchProxy.isSupport(ClipAreaLyricsView.class)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, ClipAreaLyricsView.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.k(p0, false);
    }
    public final boolean k(long p0,boolean p1){
       if (PatchProxy.isSupport(ClipAreaLyricsView.class)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), Boolean.valueOf(p1), this, ClipAreaLyricsView.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.h = p0;
       int i = this.g(p0, true, true);
       boolean b = false;
       int i1 = this.g((this.h + this.i), b, b);
       if (!p1 && (i != this.j || i1 != this.k)) {
          this.j = i;
          this.k = i1;
          if (!PatchProxy.applyVoid(null, this, ClipAreaLyricsView.class, "11")) {
             ClipAreaLyricsView ti = this.i;
             Lyrics$Line line = this.v.get(this.k);
             Lyrics$Line mDuration = line.mDuration;
             if (mDuration > null) {
                ti = Math.max(((long)(line.mStart + mDuration) - this.h), this.i);
             }else if((this.k + true) < this.v.size()){
                ti = ((long)this.v.get((this.k + true)).mStart - this.h) - 1;
             }else {
                ClipAreaLyricsView tw = this.w;
                if (tw > 0) {
                   ti = tw - this.h;
                }
             }
             this.p = ti;
          }
          this.l();
          return true;
       }else {
          return b;
       }
    }
    public final void l(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ClipAreaLyricsView.class, "15")) {
          return;
       }
       if (this.e()) {
          return;
       }
       int i = Math.max(this.j, 0);
       ClipAreaLyricsView tn = this.n;
       int i1 = i - tn;
       i = ((i + ((this.getHeight() / (this.u + this.t)) + 2)) - 1) - tn;
       this.s = (this.getPaddingTop() + this.getBaseOffset()) + this.u;
       this.q = Math.max(i1, 0);
       this.r = Math.min(i, (this.v.size() - 1));
       if (!PatchProxy.applyVoid(objArray, this, ClipAreaLyricsView.class, "19")) {
          ClipAreaLyricsView tu = this.u;
          i = ((this.getPaddingTop() + this.getBaseOffset()) + ((this.t + tu) / 2)) + tu;
          if (this.o != i) {
             this.o = i;
             tu = this.F;
             if (tu != null) {
                tu.a(i);
             }
          }
       }
       return;
    }
    public void onDraw(Canvas p0){
       int i5;
       ClipAreaLyricsView uClipAreaLyr;
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipAreaLyricsView.class, "20")) {
          return;
       }
       super.onDraw(p0);
       if (this.e()) {
          return;
       }
       if (this.x == null) {
          if (!PatchProxy.applyVoid(null, this, ClipAreaLyricsView.class, "21")) {
             int i = this.v.size();
             ClipAreaLyricsView tv = this.v;
             ClipAreaLyricsView tf = this.f;
             int width = this.getWidth();
             if (!PatchProxy.isSupport(o.class) || !PatchProxy.applyVoidThreeRefs(tv, tf, Integer.valueOf(width), null, o.class, "2")) {
                int i1 = 0;
                int i2 = 0;
                while (i2 < tv.size()) {
                   Lyrics$Line line = tv.get(i2);
                   int i3 = (line.mText).length();
                   while (i3 > 0 && (int)tf.measureText(line.mText, i1, i3) > width) {
                      i3 = i3 - 1;
                   }
                   if (i3 != (line.mText).length()) {
                      Lyrics$Line mText = line.mText;
                      String str = (mText.substring(i3, mText.length())).trim();
                      if (!TextUtils.x(str)) {
                         Lyrics$Line line1 = new Lyrics$Line();
                         line1.mText = str;
                         line1.mMeta = new ArrayList();
                         int i4 = (line.mText).length();
                         i4 = i4 - 1;
                         while (i4 >= i3) {
                            if (line.mMeta.size() <= i4) {
                               continue ;
                            }
                            line1.mMeta.add(i1, line.mMeta.remove(i4));
                         }
                         if (line1.mMeta.size() > 0) {
                            i4 = line.mStart + line1.mMeta.get(i1).mStart;
                            line1.mStart = i4;
                         }else {
                            line1.mStart = line.mStart;
                         }
                         line.mText = (line.mText).substring(i1, i3);
                         i5 = i2 + 1;
                         tv.add(i5, line1);
                      }
                   }
                   i2 = i2 + 1;
                }
             }
             if (this.v.size() != i) {
                this.addOnLayoutChangeListener(new b(this));
                this.requestLayout();
             }
          }
          this.x = true;
          return;
       }else {
          ClipAreaLyricsView tq = this.q;
          float f = (float)(this.s + ((this.u + this.t) * tq));
          for (; tq <= this.r; tq = tq + 1) {
             if (PatchProxy.isSupport(ClipAreaLyricsView.class)) {
                uClipAreaLyr = PatchProxy.applyOneRefs(Integer.valueOf(tq), this, ClipAreaLyricsView.class, "22");
                if (uClipAreaLyr != PatchProxyResult.class) {
                }else {
                label_012f :
                   uClipAreaLyr = this.l;
                   if (tq == uClipAreaLyr) {
                      uClipAreaLyr = this.e;
                   }else if(this.m != null && (uClipAreaLyr >= null && this.v.get(tq).mStart == this.v.get(this.l).mStart)){
                      uClipAreaLyr = this.e;
                   }else if(tq >= this.j && tq <= this.k){
                      uClipAreaLyr = this.f;
                   }else {
                      uClipAreaLyr = this.g;
                   }
                }
             }else {
                goto label_012f ;
             }
             Lyrics$Line mText1 = this.v.get(tq).mText;
             float f1 = (float)this.getWidth() - uClipAreaLyr.measureText(mText1);
             f1 = f1 / 2.00f;
             p0.drawText(mText1, f1, f, uClipAreaLyr);
             i5 = this.u + this.t;
             f = f + (float)i5;
          }
          return;
       }
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(ClipAreaLyricsView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, ClipAreaLyricsView.class, "18")) {
             return;
          }
       }
       p4 = this.getMeasuredHeight() + p2;
       super.onLayout(p0, p1, p2, p3, p4);
       this.setBottom(p4);
       this.l();
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       ClipAreaLyricsView tF;
       ClipAreaLyricsView obj = PatchProxy.applyOneRefs(p0, this, ClipAreaLyricsView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!this.isEnabled()) {
          return b;
       }
       if (this.e()) {
          return b;
       }
       this.G.onTouchEvent(p0);
       int action = p0.getAction();
       ClipAreaLyricsView uClipAreaLyr = 1;
       if (action) {
          int i = -1;
          if (action != uClipAreaLyr) {
             if (action != 2) {
                if (action != 3) {
                   return b;
                }
             }else {
                obj = this.B;
                if (obj == i) {
                   return b;
                }else {
                   action = p0.findPointerIndex(obj);
                   if (action < 0) {
                      return b;
                   }else {
                      float f = p0.getX(action) - this.y;
                      float f1 = p0.getY(action) - this.z;
                      if (this.C == null && (Math.abs(f) - Math.abs(f1) < 0 && Math.abs(f1) - (float)this.E > 0)) {
                         this.C = uClipAreaLyr;
                      }
                   label_006f :
                      action = this.b();
                      if (this.C != null) {
                         int i1 = (int)((float)this.A - f1);
                         if (i1 < 0) {
                            i1 = i1 / 3;
                         }else if(i1 > action){
                            i1 = ((i1 - action) / 3) + action;
                         }
                         this.scrollTo(this.getScrollX(), i1);
                         if (this.j(this.f(this.c(i1)))) {
                            tF = this.F;
                            if (tF != null) {
                               tF.b((long)this.v.get(this.j).mStart, this.p);
                            }
                         }
                      }
                   label_00b1 :
                      return uClipAreaLyr;
                   }
                }
             }
          }
          this.C = b;
          this.B = i;
          this.a();
          tF = this.F;
          if (tF != null) {
             tF.c(new p((long)this.v.get(this.j).mStart, b), this.p);
          }
          return b;
       }else {
          this.y = p0.getX();
          this.z = p0.getY();
          this.A = this.getScrollY();
          this.B = p0.getPointerId(b);
          this.C = b;
          return uClipAreaLyr;
       }
    }
    public void setHighlightSameTimeLine(boolean p0){
       this.m = p0;
    }
    public void setListener(ClipAreaLyricsView$a p0){
       this.F = p0;
    }
    public void setLyrics(Lyrics p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipAreaLyricsView.class, "27")) {
          return;
       }
       if (p0 == null || q.f(p0.mLines)) {
          ExceptionHandler.handleCaughtException(new IllegalArgumentException("Lyrics should not be null."));
          return;
       }else {
          this.v = new ArrayList();
          int i = p0.mLines.size() - 1;
          while (i >= 0) {
             Lyrics$Line line = p0.mLines.get(i);
             Lyrics$Line mStart = line.mStart;
             if (mStart >= null) {
                this.v.add(0, line);
                if (line.mStart == null) {
                   break ;
                }
             }else if(mStart < null){
                line.mStart = 0;
                this.v.add(0, line);
                break ;
             }
             i = i - 1;
          }
          this.x = false;
          return;
       }
    }
    public void setRequestDuration(long p0){
       this.i = p0;
    }
    public void setTopPaddingLine(int p0){
       this.n = p0;
    }
    public void setTotalDuration(long p0){
       if (PatchProxy.isSupport(ClipAreaLyricsView.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, ClipAreaLyricsView.class, "26")) {
          return;
       }
       this.w = p0;
       if (this.e()) {
          return;
       }
       int i = this.v.size() - 1;
       while (i >= 0 && (long)this.v.get(i).mStart - p0 >= 0) {
          i = i - 1;
       }
       if (i == (this.v.size() - 1)) {
          return;
       }
       this.v = (i == -1)? null: this.v.subList(0, (i + 1));
       return;
    }
}
