package com.kwai.library.widget.specific.lyrics.LyricsView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.widget.Scroller;
import android.graphics.Paint;
import android.graphics.Color;
import android.view.ViewConfiguration;
import com.yxcorp.utility.n;
import com.kwai.library.widget.specific.lyrics.LyricsLine;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import com.kwai.library.widget.specific.lyrics.LyricsLine$Meta;
import android.graphics.Canvas;
import android.graphics.Typeface;
import ekd.d0;
import android.graphics.Paint$Style;
import android.graphics.Paint$Join;
import android.content.res.Resources;
import java.lang.Math;
import java.lang.StringBuilder;
import android.view.ViewGroup$LayoutParams;
import android.view.View$MeasureSpec;
import android.view.MotionEvent;
import com.kwai.library.widget.specific.lyrics.LyricsView$a;
import android.view.GestureDetector;
import com.kwai.library.widget.specific.lyrics.a;
import android.view.GestureDetector$OnGestureListener;
import a2.q;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.IllegalArgumentException;
import lnc.a1;

public class LyricsView extends View	// class@0009fe
{
    public boolean A;
    public Scroller B;
    public int C;
    public LyricsView$a D;
    public GestureDetector E;
    public boolean F;
    public boolean G;
    public long H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public List N;
    public long O;
    public Paint P;
    public Paint Q;
    public boolean R;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;
    public int t;
    public boolean u;
    public float v;
    public float w;
    public int x;
    public int y;
    public boolean z;

    public void LyricsView(Context p0){
       super(p0, null, 0);
    }
    public void LyricsView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LyricsView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 0;
       this.m = true;
       this.n = true;
       this.p = false;
       this.q = false;
       this.y = -1;
       this.A = true;
       this.H = -1;
       this.I = -1;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.c3);
       this.c = typedArray.getColor(4, -1);
       this.e = typedArray.getColor(0, -1);
       this.d = typedArray.getDimensionPixelSize(8, 30);
       this.f = typedArray.getDimensionPixelSize(7, 30);
       this.g = typedArray.getBoolean(true, 0);
       this.h = typedArray.getBoolean(3, 0);
       this.i = typedArray.getInt(6, -1);
       this.j = typedArray.getInt(9, 0);
       this.k = typedArray.getInt(5, true);
       this.l = typedArray.getBoolean(2, 0);
       typedArray.recycle();
       this.B = new Scroller(this.getContext());
       Paint paint = new Paint(true);
       this.Q = paint;
       paint.setTextSize((float)this.d);
       this.Q.setColor(this.c);
       int i = Color.alpha(this.c);
       if (i > 0) {
          this.Q.setAlpha(i);
       }
       paint = new Paint(true);
       this.P = paint;
       paint.setTextSize((float)this.d);
       this.P.setColor(this.e);
       i = Color.alpha(this.e);
       if (i > 0) {
          this.P.setAlpha(i);
       }
       this.C = ViewConfiguration.get(this.getContext()).getScaledTouchSlop();
       this.setVerticalFadingEdgeEnabled(true);
       this.setFadingEdgeLength(n.c(this.getContext(), 50.00f));
       return;
    }
    public static String g(LyricsLine p0,int p1){
       LyricsLine$Meta mStartTextIn = p0.d.get(p1).mStartTextIndex;
       if (p1 == (p0.d.size() - 1) && mStartTextIn < (p0.c).length()) {
          return (p0.c).substring(mStartTextIn);
       }
       if (p1 >= (p0.d.size() - 1)) {
          return "";
       }
       p1++;
       LyricsLine$Meta mStartTextIn1 = p0.d.get(p1).mStartTextIndex;
       if (mStartTextIn1 <= (p0.c).length() && mStartTextIn1 > mStartTextIn) {
          return (p0.c).substring(mStartTextIn, mStartTextIn1);
       }
       return "";
    }
    public void a(){
       LyricsView td = this.d;
       int i = this.I * (this.f + td);
       if (this.k == 1) {
          i = i + td;
       }
       this.j(i, 400);
       return;
    }
    public void b(){
       this.N = null;
       this.I = -1;
       this.H = -1;
       this.invalidate();
    }
    public final int c(){
       return (this.N.size() * (this.d + this.f));
    }
    public void computeScroll(){
       if (!this.B.isFinished() && this.B.computeScrollOffset()) {
          int currY = this.B.getCurrY();
          if (this.getScrollY() != currY && this.z == null) {
             this.scrollTo(this.getScrollX(), currY);
          }
          this.invalidate();
       }
       return;
    }
    public long d(int p0){
       LyricsView tN;
       LyricsLine a;
       long l = 0;
       if (p0 <= 0) {
          return l;
       }
       if (p0 >= this.c()) {
          LyricsView tO = this.O;
          if (tO - l > 0) {
             return tO;
          }else {
             tN = this.N;
             a = tN.get((tN.size() - 1)).a;
          }
       }else {
          int i = p0 / (this.d + this.f);
          if (i < 0) {
             return l;
          }else if(i >= this.N.size()){
             tN = this.N;
             a = tN.get((tN.size() - 1)).a;
          }else {
             LyricsView td = this.d;
             LyricsView tf = this.f;
             p0 = (int)((float)this.N.get(i).a + ((float)this.f(i) * (((float)(p0 % (td + tf)) * 0x3f800000) / (float)(td + tf))));
          }
       }
       return (long)a;
    }
    public final void e(String p0,float p1,float p2,Paint p3,Canvas p4){
       if (this.p != null) {
          p3.setTypeface(d0.c());
       }
       LyricsView tb = (this.q != null)? this.b: 0;
       if (this.h != null) {
          p3.setStyle(Paint$Style.STROKE);
          p3.setStrokeJoin(Paint$Join.ROUND);
          p3.setStrokeMiter(10.00f);
          p3.setColor(this.getResources().getColor(R.color.arg_RES_7f061610));
          p3.setStrokeWidth((float)n.c(this.getContext(), 0x3fc00000));
          p2 = p2 + (float)tb;
          p4.drawText(p0, p1, p2, p3);
          p3.setStyle(Paint$Style.FILL);
          p3.setColor(p3.getColor());
          p4.drawText(p0, p1, p2, p3);
       }else {
          p4.drawText(p0, p1, (p2 + (float)tb), p3);
       }
       return;
    }
    public final long f(int p0){
       long l = (long)this.N.get(p0).a;
       p0++;
       if (p0 < this.N.size()) {
          return ((long)this.N.get(p0).a - l);
       }
       if (p0 == this.N.size()) {
          LyricsView tO = this.O;
          if (tO > 0) {
             return (tO - l);
          }
       }
       return 0;
    }
    public float getBottomFadingEdgeStrength(){
       float f = (this.G != null)? 0x3f800000: 0;
       return f;
    }
    public final int getSeekScrollY(){
       int i;
       LyricsView td;
       LyricsView tf;
       if (this.k == null) {
          if (this.s != null) {
             i = (((this.M + this.d) + this.f) - (this.getHeight() / 2)) + ((this.I - 1) * (this.d + this.f));
          label_0037 :
             return i;
          }else {
             i = this.I - this.j;
             td = this.d;
             tf = this.f;
          }
       }else {
          LyricsView tI = this.I;
          td = this.d;
          tf = this.f;
       }
       i = i * (td + tf);
       goto label_0037 ;
    }
    public int getSingleLineHeight(){
       return (this.d + this.f);
    }
    public float getTopFadingEdgeStrength(){
       float f = 0x3f800000;
       if (this.r != null) {
          return f;
       }
       if (this.G == null || this.I <= null) {
          f = 0;
       }
       return f;
    }
    public void h(long p0,boolean p1){
       int i;
       LyricsView tN = this.N;
       if (tN == null || (!tN.isEmpty() && this.H - p0)) {
          this.H = p0;
          if (!this.i(p0) && p1) {
             this.invalidate();
             return;
          }else {
             LyricsView lyricsView = null;
             tN = (this.k == true)? this.d: 0;
             int seekScrollY = this.getSeekScrollY();
             if (p1) {
                this.j(Math.max(seekScrollY, tN), 1500);
                return;
             }else {
                long l = this.f(this.I);
                if (l - null > 0) {
                   lyricsView = (int)((((float)(p0 - (long)this.N.get(this.I).a) * 0x3f800000) / (float)l) * (float)(this.d + this.f));
                }
                if (!this.B.isFinished()) {
                   this.B.forceFinished(true);
                }
                this.scrollTo(this.getScrollX(), Math.max((seekScrollY + lyricsView), tN));
             }
          }
       }
       return;
    }
    public final boolean i(long p0){
       int i2;
       this.H = p0;
       int i = this.N.size() - 1;
       while (true) {
          if (i >= 0) {
             if (this.H - (long)this.N.get(i).a >= 0) {
                if (this.N.get(i).b > null) {
                   int i1 = this.N.get(i).a + this.N.get(i).b;
                   if (p0 - (long)i1 >= 0) {
                      i2 = i + 1;
                      if (i2 >= this.N.size()) {
                      label_004f :
                         i2 = i;
                      }
                      if (this.o != null) {
                         i = i - 1;
                         if (i >= 0 && this.N.get(i).a == this.N.get(i2).a) {
                            goto label_004f ;
                         }else if(i2 != this.I){
                            break ;
                         }else {
                            return false;
                         }
                      }else {
                         goto label_0073 ;
                      }
                   }else {
                      goto label_004f ;
                   }
                }else {
                   goto label_004f ;
                }
             }else {
                i = i - 1;
             }
          }else {
             i2 = 0;
             goto label_0073 ;
          }
       }
       this.I = i2;
       this.k();
       return 1;
    }
    public final void j(int p0,int p1){
       int scrollY = this.getScrollY();
       this.B.startScroll(this.getScrollX(), scrollY, this.getScrollX(), (p0 - scrollY), p1);
       this.invalidate();
    }
    public final void k(){
       int i4;
       LyricsView tN = this.N;
       if (tN != null && !tN.isEmpty()) {
          int i = 0;
          int i1 = Math.max(this.I, i);
          int i2 = 2;
          int i3 = (this.getHeight() / (this.d + this.f)) + i2;
          LyricsView ti = this.i;
          if (ti > null) {
             i3 = Math.min(i3, ti);
          }
          ti = this.k;
          if (ti != null) {
             if (ti != i2) {
                i4 = (i3 / 2) - 1;
                i3 = i1 - ((i3 - 1) - i4);
                i4 = i4 + i1;
                this.M = this.getPaddingTop() + (((this.getHeight() - this.getPaddingTop()) - this.getPaddingBottom()) / i2);
             label_008f :
                this.J = Math.max(i3, i);
                i = Math.min(i4, (this.N.size() - 1));
                this.K = i;
                i1 = Math.max((i - i1), (i1 - this.J));
                if (i1 > 0) {
                   this.L = 159 / i1;
                }
             }else {
                i2 = i1 - this.j;
                i4 = (i3 + i2) - 1;
                this.M = ((this.getHeight() - this.getPaddingBottom()) - this.getPaddingTop()) - (((i4 - i2) + 1) * (this.d + this.f));
             }
          }else if(!i1 && this.s != null){
             i2 = i1;
          }else {
             i2 = i1 - this.j;
          }
          i4 = (i3 + i2) - 1;
          this.M = (this.getPaddingTop() + this.d) + this.s;
          i3 = i2;
          goto label_008f ;
       }
    label_00b2 :
       return;
    }
    public void onDraw(Canvas p0){
       int i;
       int i1;
       float f1;
       float f2;
       float f3;
       LyricsView lyricsView3;
       float f4;
       float f5;
       float f8;
       int i8;
       LyricsView lyricsView = this;
       Canvas uCanvas = p0;
       super.onDraw(p0);
       LyricsView n = lyricsView.N;
       n = (n == null || n.isEmpty())? 1: null;
       if (n) {
          return;
       }else {
          n = lyricsView.J;
          if (lyricsView.q != null && n > null) {
             i = n - 1;
          }
          LyricsView lyricsView1 = i;
          float f = (float)(lyricsView.M + ((lyricsView.d + lyricsView.f) * i));
          while (lyricsView1 <= lyricsView.K) {
             if (lyricsView.m == null) {
                n = lyricsView.P;
             }else if(lyricsView1 == lyricsView.I){
                n = lyricsView.Q;
             }else if(lyricsView.o != null && lyricsView.N.get(lyricsView1).a == lyricsView.N.get(lyricsView.I).a){
                n = lyricsView.Q;
             }else {
                n = lyricsView.P;
             }
             LyricsView lyricsView2 = n;
             long l = 0x3f800000;
             if (lyricsView.g != null) {
                i1 = 96;
                if (lyricsView.k != null || lyricsView1 >= lyricsView.I) {
                   LyricsView i5 = lyricsView.I;
                   int i6 = lyricsView.d + lyricsView.f;
                   int i7 = i6 * i5;
                   i = this.getScrollY() - i7;
                   f1 = (float)i * l;
                   f1 = f1 / (float)i6;
                   float f9 = 0x437f0000;
                   i7 = 255;
                   if (lyricsView1 < i5) {
                      i8 = i5 - lyricsView1;
                      i8 = i8 - 1;
                      f8 = (float)i8 + f1;
                      n = lyricsView.L;
                   }else if(lyricsView1 > i5){
                      i8 = lyricsView1 - i5;
                      i8 = i8 - 1;
                      f8 = (float)i8 - f1;
                      n = lyricsView.L;
                   }else {
                      i = 255;
                   label_00a8 :
                      i1 = Math.min(Math.max(i, i1), i7);
                   }
                   f8 = f8 * (float)n;
                   f9 = f9 - f8;
                   i = (int)f9;
                   goto label_00a8 ;
                }
                lyricsView2.setAlpha(i1);
             }
             LyricsLine c = lyricsView.N.get(lyricsView1).c;
             f1 = lyricsView2.measureText(c);
             if (lyricsView.n != null) {
                f2 = (float)this.getWidth() - f1;
                f2 = f2 / 2.00f;
                f3 = f2;
             }else {
                f3 = 0;
             }
             if (lyricsView1 == lyricsView.I && lyricsView.l != null) {
                i = p0.getHeight() + this.getScrollY();
                LyricsLine lyricsLine = lyricsView.N.get(lyricsView.I);
                long l1 = lyricsView.H - (long)lyricsLine.a;
                if (l1 <= 0) {
                   lyricsView3 = lyricsView1;
                   f4 = f;
                   f5 = 0;
                }else {
                   StringBuilder str = "";
                   int i3 = 0;
                   while (true) {
                      if (i3 < lyricsLine.d.size()) {
                         LyricsLine$Meta meta = lyricsLine.d.get(i3);
                         LyricsLine$Meta mStart = meta.mStart;
                         int i4 = meta.mDuration + mStart;
                         LyricsLine lyricsLine1 = lyricsLine;
                         if ((long)i4 - l1 <= 0) {
                            lyricsLine = lyricsLine1;
                            str = str+LyricsView.g(lyricsLine, i3);
                            i3 = i3 + 1;
                            l = 0x3f800000;
                         }else {
                            lyricsView3 = lyricsView1;
                            lyricsLine = lyricsLine1;
                            f4 = f;
                            if ((long)mStart - l1 < 0) {
                               l1 = l1 - (long)meta.mStart;
                               f2 = (float)l1;
                               f2 = f2 * 0x3f800000;
                               f2 = f2 / (float)meta.mDuration;
                               f5 = lyricsView.P.measureText(LyricsView.g(lyricsLine, i3)) * f2;
                            label_0167 :
                               f5 = f5 + lyricsView.Q.measureText(str);
                            }else {
                            label_0166 :
                               f5 = 0;
                               goto label_0167 ;
                            }
                         }
                      }else {
                         lyricsView3 = lyricsView1;
                         f4 = f;
                         goto label_0166 ;
                      }
                   }
                }
                float f6 = f5 + f3;
                p0.save();
                float f7 = (float)i;
                uCanvas.clipRect(0, 0, f6, f7);
                f2 = f3;
                f8 = f4;
                Canvas uCanvas1 = p0;
                this.e(c, f2, f8, lyricsView.Q, uCanvas1);
                p0.restore();
                p0.save();
                uCanvas.clipRect(f6, 0, (float)p0.getWidth(), f7);
                this.e(c, f2, f8, lyricsView.P, uCanvas1);
                p0.restore();
             }else {
                lyricsView3 = lyricsView1;
                f4 = f;
                this.e(c, f3, f4, lyricsView2, p0);
             }
             i = lyricsView.K - 1;
             if (lyricsView3 <= i) {
                if (lyricsView3 < lyricsView.N.size()) {
                   int i2 = lyricsView3 + 1;
                   if (lyricsView.N.get(lyricsView3).a == lyricsView.N.get(i2).a && lyricsView.u != null) {
                      n = 1;
                   label_01e0 :
                      n = (n)? lyricsView.t: lyricsView.f;
                      i1 = lyricsView.d + n;
                      f = f4 + (float)i1;
                   }
                }
                n = null;
                goto label_01e0 ;
             }else {
                f = f4;
             }
             lyricsView1 = lyricsView3 + 1;
          }
          return;
       }
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       p4 = this.getMeasuredHeight() + p2;
       super.onLayout(p0, p1, p2, p3, p4);
       this.setBottom(p4);
       this.k();
    }
    public void onMeasure(int p0,int p1){
       if (this.i != -1 && this.getLayoutParams().height == -2) {
          super.onMeasure(p0, View$MeasureSpec.makeMeasureSpec(((this.d + this.f) * this.i), 0x40000000));
       }else {
          super.onMeasure(p0, p1);
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       LyricsView tD1;
       boolean b = false;
       if (!this.isEnabled()) {
          return b;
       }
       if (this.A == null) {
          return b;
       }
       LyricsView tD = this.D;
       if (tD != null && tD.d(p0)) {
          return b;
       }
       tD = this.N;
       if (tD == null || tD.isEmpty()) {
          return b;
       }
       if (this.E == null) {
          this.E = new GestureDetector(this.getContext(), new a(this));
       }
       this.E.onTouchEvent(p0);
       int i = q.c(p0);
       boolean b1 = true;
       if (i) {
          if (i != b1) {
             if (i != 2) {
                if (i == 3) {
                label_00c3 :
                   this.z = b;
                   this.y = -1;
                   this.a();
                   tD1 = this.D;
                   if (tD1 != null) {
                      tD1.c(this.N.get(this.I).a);
                   }
                   return b;
                }
             }else {
                tD = this.y;
                if (tD == -1) {
                   return b;
                }else {
                   i = q.a(p0, tD);
                   if (i < 0) {
                      return b;
                   }else {
                      float f = q.f(p0, i) - this.v;
                      float f1 = q.g(p0, i) - this.w;
                      if (this.z == null && (Math.abs(f) - Math.abs(f1) < 0 && Math.abs(f1) - (float)this.C > 0)) {
                         this.z = b1;
                      }
                   label_0087 :
                      i = this.c();
                      if (this.z != null) {
                         int i1 = (int)((float)this.x - f1);
                         if (i1 < 0) {
                            i1 = i1 / 3;
                         }else if(i1 > i){
                            i1 = ((i1 - i) / 3) + i;
                         }
                         this.scrollTo(this.getScrollX(), i1);
                         if (this.i(this.d(i1))) {
                            tD1 = this.D;
                            if (tD1 != null) {
                               tD1.a(this.N.get(this.I).a);
                            }
                         }
                      }
                   }
                }
             }
          }else {
             goto label_00c3 ;
          }
       }else {
          this.v = p0.getX();
          this.w = p0.getY();
          this.x = this.getScrollY();
          this.y = q.e(p0, b);
          this.z = b;
       }
    label_00f8 :
       return b1;
    }
    public void setCenterHorizontal(boolean p0){
       this.n = p0;
       this.invalidate();
    }
    public void setEnableFadingEdge(boolean p0){
       this.G = p0;
       this.invalidate();
    }
    public void setEnableGradient(boolean p0){
       this.g = p0;
       this.invalidate();
    }
    public void setEnableHighlight(boolean p0){
       this.m = p0;
       this.invalidate();
    }
    public void setEnableKara(boolean p0){
       this.l = p0;
       this.invalidate();
    }
    public void setFirstLineFading(boolean p0){
       this.r = p0;
       this.invalidate();
    }
    public void setFirstLinePaddingForTopStyle(int p0){
       this.s = p0;
       this.invalidate();
    }
    public void setFont(Typeface p0){
       this.P.setTypeface(p0);
       this.Q.setTypeface(p0);
    }
    public void setHighlightSameTimeLine(boolean p0){
       this.o = p0;
       this.invalidate();
    }
    public void setIsNeedBoldText(boolean p0){
       this.p = p0;
    }
    public void setIsNormalRecord(boolean p0){
       this.q = p0;
    }
    public void setLayoutType(int p0){
       this.k = p0;
       this.k();
       this.invalidate();
    }
    public void setListener(LyricsView$a p0){
       this.D = p0;
    }
    public void setLrcColor(int p0){
       this.e = p0;
       this.P.setColor(p0);
       p0 = Color.alpha(this.e);
       if (p0 > 0) {
          this.P.setAlpha(p0);
       }
       this.invalidate();
       return;
    }
    public void setLrcPadding(int p0){
       this.f = p0;
       this.invalidate();
    }
    public void setLrcTextSize(int p0){
       this.d = p0;
       float f = (float)p0;
       this.P.setTextSize(f);
       this.Q.setTextSize(f);
       this.invalidate();
    }
    public void setLyrics(List p0){
       if (p0 == null || p0.isEmpty()) {
          throw new IllegalArgumentException("LyricsLine should not be null.");
       }
       this.b();
       this.N = p0;
       this.R = false;
       if (this.getWidth() > 0) {
          ArrayList uArrayList = new ArrayList(p0);
          LyricsView tN = this.N;
          LyricsView tP = this.P;
          int width = this.getWidth();
          int i = 0;
          while (i < tN.size()) {
             LyricsLine lyricsLine = tN.get(i);
             int i1 = (lyricsLine.c).length();
             while (i1 > 0 && (int)tP.measureText(lyricsLine.c, false, i1) > width) {
                i1 = i1 - 1;
             }
             if (i1 != (lyricsLine.c).length()) {
                LyricsLine c = lyricsLine.c;
                String str = (c.substring(i1, c.length())).trim();
                if (!TextUtils.x(str)) {
                   LyricsLine lyricsLine1 = new LyricsLine();
                   lyricsLine1.c = str;
                   lyricsLine1.d = new ArrayList();
                   int i2 = (lyricsLine.c).length();
                   i2 = i2 - 1;
                   while (i2 >= i1) {
                      if (lyricsLine.d.size() <= i2) {
                         continue ;
                      }
                      lyricsLine1.d.add(false, lyricsLine.d.remove(i2));
                   }
                   if (lyricsLine1.d.size() > 0) {
                      i2 = lyricsLine.a + lyricsLine1.d.get(false).mStart;
                      lyricsLine1.a = i2;
                   }else {
                      lyricsLine1.a = lyricsLine.a;
                   }
                   lyricsLine.c = (lyricsLine.c).substring(false, i1);
                   int i3 = i + 1;
                   tN.add(i3, lyricsLine1);
                }
             }
             i = i + 1;
          }
          if (this.N.size() != uArrayList.size()) {
             this.R = true;
          }
       }
       this.h(0, false);
       return;
    }
    public void setMaxLine(int p0){
       this.i = p0;
       this.requestLayout();
       this.k();
    }
    public void setOFFSET_Y(float p0){
       this.b = a1.e(p0);
    }
    public void setSplitLinePadding(int p0){
       this.u = true;
       this.t = p0;
       this.invalidate();
    }
    public void setTopPaddingLine(int p0){
       this.j = p0;
    }
    public void setTotalDuration(long p0){
       this.O = p0;
    }
    public void setTouchable(boolean p0){
       this.A = p0;
    }
}
