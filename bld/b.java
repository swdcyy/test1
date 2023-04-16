package bld.b;
import java.lang.Object;
import com.yxcorp.widget.selector.drawable.DrawableCreator$Shape;
import com.yxcorp.widget.selector.drawable.DrawableCreator$Gradient;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import java.lang.Integer;
import android.content.res.ColorStateList;
import java.lang.Float;
import android.graphics.drawable.GradientDrawable$Orientation;
import java.lang.Class;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.IllegalAccessException;
import java.lang.NoSuchFieldException;
import java.util.ArrayList;
import java.util.Iterator;
import lnc.a1;
import bld.c;
import java.lang.Math;

public class b	// class@000274
{
    public Integer A;
    public boolean A0;
    public Integer B;
    public GradientDrawable B0;
    public Integer C;
    public StateListDrawable C0;
    public Integer D;
    public Integer E;
    public Integer F;
    public Integer G;
    public Integer H;
    public Integer I;
    public Integer J;
    public Integer K;
    public Integer L;
    public Integer M;
    public Integer N;
    public Integer O;
    public Integer P;
    public Integer Q;
    public Integer R;
    public Integer S;
    public Integer T;
    public Integer U;
    public Integer V;
    public Integer W;
    public Drawable X;
    public Drawable Y;
    public Drawable Z;
    public DrawableCreator$Shape a;
    public Drawable a0;
    public Integer b;
    public Drawable b0;
    public Float c;
    public Drawable c0;
    public Float d;
    public Drawable d0;
    public Float e;
    public Drawable e0;
    public Float f;
    public Drawable f0;
    public Float g;
    public Drawable g0;
    public int h;
    public Drawable h0;
    public Float i;
    public Drawable i0;
    public Float j;
    public Drawable j0;
    public Integer k;
    public Drawable k0;
    public Integer l;
    public Drawable l0;
    public Integer m;
    public Drawable m0;
    public Float n;
    public Integer n0;
    public DrawableCreator$Gradient o;
    public Integer o0;
    public boolean p;
    public Integer p0;
    public Rect q;
    public Integer q0;
    public Float r;
    public Integer r0;
    public Float s;
    public Integer s0;
    public Float t;
    public Integer t0;
    public Integer u;
    public Integer u0;
    public float v;
    public Integer v0;
    public float w;
    public Integer w0;
    public boolean x;
    public Integer x0;
    public Integer y;
    public Integer y0;
    public Integer z;
    public int z0;

    public void b(){
       super();
       this.a = DrawableCreator$Shape.Rectangle;
       this.h = -1;
       this.o = DrawableCreator$Gradient.Linear;
       this.p = false;
       this.q = new Rect();
       this.v = 0;
       this.w = 0;
       this.x = false;
       this.A0 = false;
       this.B0 = null;
       this.C0 = null;
    }
    public b A(Drawable p0){
       this.A0 = true;
       this.j0 = p0;
       return this;
    }
    public Drawable a(){
       StateListDrawable stateListDra;
       Drawable uDrawable = null;
       if (this.A0 != null) {
          stateListDra = this.c();
       }else {
          uDrawable = this.b();
          stateListDra = uDrawable;
       }
       if (this.x != null && this.y != null) {
          if (stateListDra != null) {
             uDrawable = stateListDra;
          }
          return new RippleDrawable(ColorStateList.valueOf(this.y.intValue()), uDrawable, uDrawable);
       }else if(uDrawable == null){
          uDrawable = stateListDra;
       }
       return uDrawable;
    }
    public final GradientDrawable b(){
       int[] ointArray;
       int i5;
       int i6;
       int i7;
       int i8;
       ArrayList uArrayList;
       ArrayList uArrayList1;
       b d;
       b z;
       int[][] ointArray1;
       int[] ointArray2;
       Iterator iterator;
       int[] ointArray3;
       ArrayList uArrayList2;
       b p;
       int[][] ointArray4;
       int[] ointArray5;
       int[] ointArray6;
       b uob = this;
       b b0 = uob.B0;
       if (b0 == null) {
          b0 = new GradientDrawable();
       }
       b uob1 = b0;
       uob1.setShape(uob.a.value);
       b0 = uob.c;
       if (b0 != null) {
          uob1.setCornerRadius(b0.floatValue());
       }
       int i = 3;
       int i1 = 2;
       int i2 = 0;
       int i3 = 1;
       if (uob.d != null && uob.e != null) {
          b0 = uob.f;
          if (b0 != null && uob.g != null) {
             float[] uofloatArray = new float[]{b0.floatValue(),uob.f.floatValue(),uob.g.floatValue(),uob.g.floatValue(),uob.e.floatValue(),uob.e.floatValue(),uob.d.floatValue(),uob.d.floatValue()};
             uob1.setCornerRadii(uofloatArray);
          }
       }
       if (uob.o == DrawableCreator$Gradient.Linear) {
          b0 = uob.h;
          if (b0 != -1) {
             int i4 = b0 % 360;
             uob.h = i4;
             if (!(i4 % 45)) {
                GradientDrawable$Orientation lEFT_RIGHT = GradientDrawable$Orientation.LEFT_RIGHT;
                if (i4) {
                   if (i4 != 45) {
                      if (i4 != 90) {
                         if (i4 != 135) {
                            if (i4 != 180) {
                               if (i4 != 225) {
                                  if (i4 != 270) {
                                     if (i4 == 315) {
                                        lEFT_RIGHT = GradientDrawable$Orientation.TL_BR;
                                     }
                                  }else {
                                     lEFT_RIGHT = GradientDrawable$Orientation.TOP_BOTTOM;
                                  }
                               }else {
                                  lEFT_RIGHT = GradientDrawable$Orientation.TR_BL;
                               }
                            }else {
                               lEFT_RIGHT = GradientDrawable$Orientation.RIGHT_LEFT;
                            }
                         }else {
                            lEFT_RIGHT = GradientDrawable$Orientation.BR_TL;
                         }
                      }else {
                         lEFT_RIGHT = GradientDrawable$Orientation.BOTTOM_TOP;
                      }
                   }else {
                      lEFT_RIGHT = GradientDrawable$Orientation.BL_TR;
                   }
                }
                uob1.setOrientation(lEFT_RIGHT);
             }
          }
       }
       b0 = uob.i;
       if (b0 != null && uob.j != null) {
          uob1.setGradientCenter(b0.floatValue(), uob.j.floatValue());
       }
       b0 = uob.m;
       if (b0 != null && uob.l != null) {
          if (uob.k != null) {
             ointArray = new int[i];
             ointArray[i2] = b0.intValue();
             ointArray[i3] = uob.k.intValue();
             ointArray[i1] = uob.l.intValue();
          }else {
             ointArray = new int[i1];
             ointArray[i2] = b0.intValue();
             ointArray[i3] = uob.l.intValue();
          }
          uob1.setColors(ointArray);
       }
       b0 = uob.n;
       if (b0 != null) {
          uob1.setGradientRadius(b0.floatValue());
       }
       uob1.setGradientType(uob.o.value);
       uob1.setUseLevel(uob.p);
       if (!uob.q.isEmpty()) {
          try{
             Field declaredFiel = uob1.getClass().getDeclaredField("mPadding");
             declaredFiel.setAccessible(i3);
             declaredFiel.set(uob1, uob.q);
          }catch(java.lang.NoSuchFieldException e0){
             e0.printStackTrace();
          }catch(java.lang.IllegalAccessException e0){
             e0.printStackTrace();
          }
       }
    }
    public final StateListDrawable c(){
       int[] ointArray;
       b tC0 = this.C0;
       int i = 0;
       int i1 = 1;
       if (this.h0 != null) {
          tC0 = this.d(tC0);
          ointArray = new int[i1];
          ointArray[i] = -16842910;
          tC0.addState(ointArray, this.h0);
       }
       if (this.X != null) {
          tC0 = this.d(tC0);
          ointArray = new int[i1];
          ointArray[i] = 0x101009f;
          tC0.addState(ointArray, this.X);
       }
       if (this.f0 != null) {
          tC0 = this.d(tC0);
          ointArray = new int[i1];
          ointArray[i] = -16842911;
          tC0.addState(ointArray, this.f0);
       }
       if (this.Y != null) {
          tC0 = this.d(tC0);
          ointArray = new int[i1];
          ointArray[i] = 0x10100a0;
          tC0.addState(ointArray, this.Y);
       }
       if (this.g0 != null) {
          tC0 = this.d(tC0);
          ointArray = new int[i1];
          ointArray[i] = -16842912;
          tC0.addState(ointArray, this.g0);
       }
       if (this.a0 != null) {
          tC0 = this.d(tC0);
          ointArray = new int[i1];
          ointArray[i] = 0x10100a1;
          tC0.addState(ointArray, this.a0);
       }
       if (this.i0 != null) {
          tC0 = this.d(tC0);
          ointArray = new int[i1];
          ointArray[i] = -16842913;
          tC0.addState(ointArray, this.i0);
       }
       if (this.b0 != null) {
          tC0 = this.d(tC0);
          ointArray = new int[i1];
          ointArray[i] = 0x10100a7;
          tC0.addState(ointArray, this.b0);
       }
       if (this.j0 != null) {
          tC0 = this.d(tC0);
          ointArray = new int[i1];
          ointArray[i] = -16842919;
          tC0.addState(ointArray, this.j0);
       }
       if (this.c0 != null) {
          tC0 = this.d(tC0);
          ointArray = new int[i1];
          ointArray[i] = 0x101009c;
          tC0.addState(ointArray, this.c0);
       }
       if (this.k0 != null) {
          tC0 = this.d(tC0);
          ointArray = new int[i1];
          ointArray[i] = -16842908;
          tC0.addState(ointArray, this.k0);
       }
       if (this.d0 != null) {
          tC0 = this.d(tC0);
          ointArray = new int[i1];
          ointArray[i] = 0x1010367;
          tC0.addState(ointArray, this.d0);
       }
       if (this.l0 != null) {
          tC0 = this.d(tC0);
          ointArray = new int[i1];
          ointArray[i] = -16843623;
          tC0.addState(ointArray, this.l0);
       }
       if (this.e0 != null) {
          tC0 = this.d(tC0);
          ointArray = new int[i1];
          ointArray[i] = 0x10102fe;
          tC0.addState(ointArray, this.e0);
       }
       if (this.m0 != null) {
          tC0 = this.d(tC0);
          ointArray = new int[i1];
          ointArray[i] = -16843518;
          tC0.addState(ointArray, this.m0);
       }
       if (this.Z != null) {
          tC0 = this.d(tC0);
          ointArray = new int[i1];
          ointArray[i] = 0x101009e;
          tC0.addState(ointArray, this.Z);
       }
       return tC0;
    }
    public StateListDrawable d(StateListDrawable p0){
       if (p0 == null) {
          p0 = new StateListDrawable();
       }
       return p0;
    }
    public final Float e(float p0){
       if (p0 <= 0) {
          return Float.valueOf(0);
       }
       return Float.valueOf((float)a1.e(p0));
    }
    public b f(GradientDrawable p0){
       this.B0 = p0;
       return this;
    }
    public b g(c p0){
       Float uFloat = this.e(p0.getRadius());
       this.c = uFloat;
       if (uFloat.floatValue() > 0) {
          return this;
       }
       this.f = this.e(p0.getTopLeftRadius());
       this.g = this.e(p0.getTopRightRadius());
       this.d = this.e(p0.getBottomLeftRadius());
       this.e = this.e(p0.getBottomRightRadius());
       return this;
    }
    public b h(Drawable p0){
       this.A0 = true;
       this.Z = p0;
       return this;
    }
    public b i(DrawableCreator$Gradient p0){
       this.o = p0;
       return this;
    }
    public b j(int p0){
       this.h = p0;
       return this;
    }
    public b k(float p0,float p1){
       this.i = Float.valueOf(p0);
       this.j = Float.valueOf(p1);
       return this;
    }
    public b l(int p0,int p1){
       this.m = Integer.valueOf(p0);
       this.l = Integer.valueOf(p1);
       return this;
    }
    public b m(int p0,int p1,int p2){
       this.m = Integer.valueOf(p0);
       this.k = Integer.valueOf(p1);
       this.l = Integer.valueOf(p2);
       return this;
    }
    public b n(float p0,float p1,float p2,float p3){
       b tq = this.q;
       tq.left = (int)p0;
       tq.top = (int)p1;
       tq.right = (int)p2;
       tq.bottom = (int)p3;
       return this;
    }
    public b o(Drawable p0){
       this.A0 = true;
       this.b0 = p0;
       return this;
    }
    public b p(int p0,int p1){
       this.P = Integer.valueOf(p0);
       this.V = Integer.valueOf(p1);
       return this;
    }
    public b q(Drawable p0){
       this.A0 = true;
       this.a0 = p0;
       return this;
    }
    public b r(int p0,int p1){
       this.O = Integer.valueOf(p0);
       this.U = Integer.valueOf(p1);
       return this;
    }
    public b s(DrawableCreator$Shape p0){
       this.a = p0;
       return this;
    }
    public b t(float p0){
       this.s = Float.valueOf(p0);
       return this;
    }
    public b u(float p0){
       this.r = Float.valueOf(p0);
       return this;
    }
    public b v(int p0){
       this.b = Integer.valueOf(p0);
       return this;
    }
    public b w(int p0){
       this.u = Integer.valueOf(p0);
       return this;
    }
    public b x(float p0){
       this.t = (p0 <= 0)? Float.valueOf(0): Float.valueOf((float)a1.e(p0));
       return this;
    }
    public b y(float p0){
       this.t = Float.valueOf(Math.max(p0, 0));
       return this;
    }
    public b z(Drawable p0){
       this.A0 = true;
       this.h0 = p0;
       return this;
    }
}
