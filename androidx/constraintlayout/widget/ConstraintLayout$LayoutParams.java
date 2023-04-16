package androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams$a;
import android.util.SparseIntArray;
import java.lang.String;
import java.lang.Float;
import java.lang.Math;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.solver.widgets.f;

public class ConstraintLayout$LayoutParams extends ViewGroup$MarginLayoutParams	// class@0006b4
{
    public float A;
    public String B;
    public float C;
    public int D;
    public float E;
    public float F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public float O;
    public float P;
    public int Q;
    public int R;
    public int S;
    public boolean T;
    public boolean U;
    public String V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public int a;
    public boolean a0;
    public int b;
    public boolean b0;
    public float c;
    public boolean c0;
    public int d;
    public int d0;
    public int e;
    public int e0;
    public int f;
    public int f0;
    public int g;
    public int g0;
    public int h;
    public int h0;
    public int i;
    public int i0;
    public int j;
    public float j0;
    public int k;
    public int k0;
    public int l;
    public int l0;
    public int m;
    public float m0;
    public int n;
    public ConstraintWidget n0;
    public float o;
    public boolean o0;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public float z;

    public void ConstraintLayout$LayoutParams(int p0,int p1){
       super(p0, p1);
       this.a = -1;
       this.b = -1;
       this.c = 0xbf800000;
       this.d = -1;
       this.e = -1;
       this.f = -1;
       this.g = -1;
       this.h = -1;
       this.i = -1;
       this.j = -1;
       this.k = -1;
       this.l = -1;
       this.m = -1;
       this.n = 0;
       this.o = 0;
       this.p = -1;
       this.q = -1;
       this.r = -1;
       this.s = -1;
       this.t = -1;
       this.u = -1;
       this.v = -1;
       this.w = -1;
       this.x = -1;
       this.y = -1;
       this.z = 0x3f000000;
       this.A = 0x3f000000;
       this.B = null;
       this.C = 0;
       this.D = 1;
       this.E = 0xbf800000;
       this.F = 0xbf800000;
       this.G = 0;
       this.H = 0;
       this.I = 0;
       this.J = 0;
       this.K = 0;
       this.L = 0;
       this.M = 0;
       this.N = 0;
       this.O = 0x3f800000;
       this.P = 0x3f800000;
       this.Q = -1;
       this.R = -1;
       this.S = -1;
       this.T = false;
       this.U = false;
       this.V = null;
       this.W = true;
       this.X = true;
       this.Y = false;
       this.Z = false;
       this.a0 = false;
       this.b0 = false;
       this.c0 = false;
       this.d0 = -1;
       this.e0 = -1;
       this.f0 = -1;
       this.g0 = -1;
       this.h0 = -1;
       this.i0 = -1;
       this.j0 = 0x3f000000;
       this.n0 = new ConstraintWidget();
       this.o0 = false;
    }
    public void ConstraintLayout$LayoutParams(Context p0,AttributeSet p1){
       float f1;
       super(p0, p1);
       this.a = -1;
       this.b = -1;
       this.c = 0xbf800000;
       this.d = -1;
       this.e = -1;
       this.f = -1;
       this.g = -1;
       this.h = -1;
       this.i = -1;
       this.j = -1;
       this.k = -1;
       this.l = -1;
       this.m = -1;
       this.n = 0;
       this.o = 0;
       this.p = -1;
       this.q = -1;
       this.r = -1;
       this.s = -1;
       this.t = -1;
       this.u = -1;
       this.v = -1;
       this.w = -1;
       this.x = -1;
       this.y = -1;
       float f = 0x3f000000;
       this.z = f;
       this.A = f;
       String str = null;
       this.B = str;
       this.C = 0;
       this.D = 1;
       this.E = 0xbf800000;
       this.F = 0xbf800000;
       this.G = 0;
       this.H = 0;
       this.I = 0;
       this.J = 0;
       this.K = 0;
       this.L = 0;
       this.M = 0;
       this.N = 0;
       this.O = 0x3f800000;
       this.P = 0x3f800000;
       this.Q = -1;
       this.R = -1;
       this.S = -1;
       this.T = false;
       this.U = false;
       this.V = str;
       this.W = true;
       this.X = true;
       this.Y = false;
       this.Z = false;
       this.a0 = false;
       this.b0 = false;
       this.c0 = false;
       this.d0 = -1;
       this.e0 = -1;
       this.f0 = -1;
       this.g0 = -1;
       this.h0 = -1;
       this.i0 = -1;
       this.j0 = f;
       this.n0 = new ConstraintWidget();
       this.o0 = false;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.a0);
       int indexCount = typedArray.getIndexCount();
       int i = 0;
       while (i < indexCount) {
          int index = typedArray.getIndex(i);
          int i1 = ConstraintLayout$LayoutParams$a.a.get(index);
          int i2 = 2;
          switch (i1){
              case 1:
                this.S = typedArray.getInt(index, this.S);
                break;
              case 2:
                i1 = typedArray.getResourceId(index, this.m);
                this.m = i1;
                if (i1 == -1) {
                   this.m = typedArray.getInt(index, -1);
                }
                break;
              case 3:
                this.n = typedArray.getDimensionPixelSize(index, this.n);
                break;
              case 4:
                f1 = 360.00f;
                f = typedArray.getFloat(index, this.o) % f1;
                this.o = f;
                if (f < 0) {
                   f = f1 - f;
                   f = f % f1;
                   this.o = f;
                }
                break;
              case 5:
                this.a = typedArray.getDimensionPixelOffset(index, this.a);
                break;
              case 6:
                this.b = typedArray.getDimensionPixelOffset(index, this.b);
                break;
              case 7:
                this.c = typedArray.getFloat(index, this.c);
                break;
              case 8:
                i1 = typedArray.getResourceId(index, this.d);
                this.d = i1;
                if (i1 == -1) {
                   this.d = typedArray.getInt(index, -1);
                }
                break;
              case 9:
                i1 = typedArray.getResourceId(index, this.e);
                this.e = i1;
                if (i1 == -1) {
                   this.e = typedArray.getInt(index, -1);
                }
                break;
              case 10:
                i1 = typedArray.getResourceId(index, this.f);
                this.f = i1;
                if (i1 == -1) {
                   this.f = typedArray.getInt(index, -1);
                }
                break;
              case 11:
                i1 = typedArray.getResourceId(index, this.g);
                this.g = i1;
                if (i1 == -1) {
                   this.g = typedArray.getInt(index, -1);
                }
                break;
              case 12:
                i1 = typedArray.getResourceId(index, this.h);
                this.h = i1;
                if (i1 == -1) {
                   this.h = typedArray.getInt(index, -1);
                }
                break;
              case 13:
                i1 = typedArray.getResourceId(index, this.i);
                this.i = i1;
                if (i1 == -1) {
                   this.i = typedArray.getInt(index, -1);
                }
                break;
              case 14:
                i1 = typedArray.getResourceId(index, this.j);
                this.j = i1;
                if (i1 == -1) {
                   this.j = typedArray.getInt(index, -1);
                }
                break;
              case 15:
                i1 = typedArray.getResourceId(index, this.k);
                this.k = i1;
                if (i1 == -1) {
                   this.k = typedArray.getInt(index, -1);
                }
                break;
              case 16:
                i1 = typedArray.getResourceId(index, this.l);
                this.l = i1;
                if (i1 == -1) {
                   this.l = typedArray.getInt(index, -1);
                }
                break;
              case 17:
                i1 = typedArray.getResourceId(index, this.p);
                this.p = i1;
                if (i1 == -1) {
                   this.p = typedArray.getInt(index, -1);
                }
                break;
              case 18:
                i1 = typedArray.getResourceId(index, this.q);
                this.q = i1;
                if (i1 == -1) {
                   this.q = typedArray.getInt(index, -1);
                }
                break;
              case 19:
                i1 = typedArray.getResourceId(index, this.r);
                this.r = i1;
                if (i1 == -1) {
                   this.r = typedArray.getInt(index, -1);
                }
                break;
              case 20:
                i1 = typedArray.getResourceId(index, this.s);
                this.s = i1;
                if (i1 == -1) {
                   this.s = typedArray.getInt(index, -1);
                }
                break;
              case 21:
                this.t = typedArray.getDimensionPixelSize(index, this.t);
                break;
              case 22:
                this.u = typedArray.getDimensionPixelSize(index, this.u);
                break;
              case 23:
                this.v = typedArray.getDimensionPixelSize(index, this.v);
                break;
              case 24:
                this.w = typedArray.getDimensionPixelSize(index, this.w);
                break;
              case 25:
                this.x = typedArray.getDimensionPixelSize(index, this.x);
                break;
              case 26:
                this.y = typedArray.getDimensionPixelSize(index, this.y);
                break;
              case 27:
                this.T = typedArray.getBoolean(index, this.T);
                break;
              case 28:
                this.U = typedArray.getBoolean(index, this.U);
                break;
              case 29:
                this.z = typedArray.getFloat(index, this.z);
                break;
              case 30:
                this.A = typedArray.getFloat(index, this.A);
                break;
              case 31:
                this.I = typedArray.getInt(index, 0);
                break;
              case 32:
                this.J = typedArray.getInt(index, 0);
                break;
              case '!':
                this.K = typedArray.getDimensionPixelSize(index, this.K);
                break;
              case '"':
                try{
                   this.M = typedArray.getDimensionPixelSize(index, this.M);
                }catch(java.lang.Exception e0){
                   if (typedArray.getInt(index, this.M) == -2) {
                      this.M = -2;
                   }
                }
                break;
              case '#':
                this.O = Math.max(0, typedArray.getFloat(index, this.O));
                this.I = i2;
                break;
              case '$':
                try{
                   this.L = typedArray.getDimensionPixelSize(index, this.L);
                }catch(java.lang.Exception e0){
                   if (typedArray.getInt(index, this.L) == -2) {
                      this.L = -2;
                   }
                }
                break;
              case '%':
                try{
                   this.N = typedArray.getDimensionPixelSize(index, this.N);
                }catch(java.lang.Exception e0){
                   if (typedArray.getInt(index, this.N) == -2) {
                      this.N = -2;
                   }
                }
                break;
              case '&':
                this.P = Math.max(0, typedArray.getFloat(index, this.P));
                this.J = i2;
                break;
              default:
                switch (i1){
                    case ',':
                      String str1 = typedArray.getString(index);
                      this.B = str1;
                      this.C = Float.NaN;
                      this.D = -1;
                      if (str1 != null) {
                         index = str1.length();
                         i1 = (this.B).indexOf(44);
                         if (i1 > 0) {
                            i2 = index - 1;
                            if (i1 < i2) {
                               String str2 = (this.B).substring(0, i1);
                               if (str2.equalsIgnoreCase("W")) {
                                  this.D = 0;
                               }else if(str2.equalsIgnoreCase("H")){
                                  this.D = 1;
                               }
                               i1 = i1 + 1;
                               try{
                               label_0133 :
                                  i2 = (this.B).indexOf(58);
                                  if (i2 >= 0) {
                                     index = index - 1;
                                     if (i2 < index) {
                                        str1 = (this.B).substring(i1, i2);
                                        i2 = i2 + 1;
                                        str = (this.B).substring(i2);
                                        if (str1.length() > 0 && str.length() > 0) {
                                           f = Float.parseFloat(str1);
                                           f1 = Float.parseFloat(str);
                                           if (f > 0 && f1 > 0) {
                                              if (this.D == 1) {
                                                 f1 = f1 / f;
                                                 this.C = Math.abs(f1);
                                              }else {
                                                 f = f / f1;
                                                 this.C = Math.abs(f);
                                              }
                                           }
                                        }
                                     }
                                  }
                                  str1 = (this.B).substring(i1);
                                  if (str1.length() > 0) {
                                     this.C = Float.parseFloat(str1);
                                  }
                               }catch(java.lang.NumberFormatException e0){
                               }
                            }
                         }
                         i1 = 0;
                         goto label_0133 ;
                      }
                      break;
                    case '-':
                      this.E = typedArray.getFloat(index, this.E);
                      break;
                    case '.':
                      this.F = typedArray.getFloat(index, this.F);
                      break;
                    case '/':
                      this.G = typedArray.getInt(index, 0);
                      break;
                    case '0':
                      this.H = typedArray.getInt(index, 0);
                      break;
                    case '1':
                      this.Q = typedArray.getDimensionPixelOffset(index, this.Q);
                      break;
                    case '2':
                      this.R = typedArray.getDimensionPixelOffset(index, this.R);
                      break;
                    case '3':
                      this.V = typedArray.getString(index);
                      break;
                    default:
                }
          }
          i = i + 1;
       }
       typedArray.recycle();
       this.c();
       return;
    }
    public void ConstraintLayout$LayoutParams(ViewGroup$LayoutParams p0){
       super(p0);
       this.a = -1;
       this.b = -1;
       this.c = 0xbf800000;
       this.d = -1;
       this.e = -1;
       this.f = -1;
       this.g = -1;
       this.h = -1;
       this.i = -1;
       this.j = -1;
       this.k = -1;
       this.l = -1;
       this.m = -1;
       this.n = 0;
       this.o = 0;
       this.p = -1;
       this.q = -1;
       this.r = -1;
       this.s = -1;
       this.t = -1;
       this.u = -1;
       this.v = -1;
       this.w = -1;
       this.x = -1;
       this.y = -1;
       this.z = 0x3f000000;
       this.A = 0x3f000000;
       this.B = null;
       this.C = 0;
       this.D = 1;
       this.E = 0xbf800000;
       this.F = 0xbf800000;
       this.G = 0;
       this.H = 0;
       this.I = 0;
       this.J = 0;
       this.K = 0;
       this.L = 0;
       this.M = 0;
       this.N = 0;
       this.O = 0x3f800000;
       this.P = 0x3f800000;
       this.Q = -1;
       this.R = -1;
       this.S = -1;
       this.T = false;
       this.U = false;
       this.V = null;
       this.W = true;
       this.X = true;
       this.Y = false;
       this.Z = false;
       this.a0 = false;
       this.b0 = false;
       this.c0 = false;
       this.d0 = -1;
       this.e0 = -1;
       this.f0 = -1;
       this.g0 = -1;
       this.h0 = -1;
       this.i0 = -1;
       this.j0 = 0x3f000000;
       this.n0 = new ConstraintWidget();
       this.o0 = false;
    }
    public void ConstraintLayout$LayoutParams(ConstraintLayout$LayoutParams p0){
       super(p0);
       this.a = -1;
       this.b = -1;
       this.c = 0xbf800000;
       this.d = -1;
       this.e = -1;
       this.f = -1;
       this.g = -1;
       this.h = -1;
       this.i = -1;
       this.j = -1;
       this.k = -1;
       this.l = -1;
       this.m = -1;
       this.n = 0;
       this.o = 0;
       this.p = -1;
       this.q = -1;
       this.r = -1;
       this.s = -1;
       this.t = -1;
       this.u = -1;
       this.v = -1;
       this.w = -1;
       this.x = -1;
       this.y = -1;
       this.z = 0x3f000000;
       this.A = 0x3f000000;
       this.B = null;
       this.C = 0;
       this.D = 1;
       this.E = 0xbf800000;
       this.F = 0xbf800000;
       this.G = 0;
       this.H = 0;
       this.I = 0;
       this.J = 0;
       this.K = 0;
       this.L = 0;
       this.M = 0;
       this.N = 0;
       this.O = 0x3f800000;
       this.P = 0x3f800000;
       this.Q = -1;
       this.R = -1;
       this.S = -1;
       this.T = false;
       this.U = false;
       this.V = null;
       this.W = true;
       this.X = true;
       this.Y = false;
       this.Z = false;
       this.a0 = false;
       this.b0 = false;
       this.c0 = false;
       this.d0 = -1;
       this.e0 = -1;
       this.f0 = -1;
       this.g0 = -1;
       this.h0 = -1;
       this.i0 = -1;
       this.j0 = 0x3f000000;
       this.n0 = new ConstraintWidget();
       this.o0 = false;
       this.a = p0.a;
       this.b = p0.b;
       this.c = p0.c;
       this.d = p0.d;
       this.e = p0.e;
       this.f = p0.f;
       this.g = p0.g;
       this.h = p0.h;
       this.i = p0.i;
       this.j = p0.j;
       this.k = p0.k;
       this.l = p0.l;
       this.m = p0.m;
       this.n = p0.n;
       this.o = p0.o;
       this.p = p0.p;
       this.q = p0.q;
       this.r = p0.r;
       this.s = p0.s;
       this.t = p0.t;
       this.u = p0.u;
       this.v = p0.v;
       this.w = p0.w;
       this.x = p0.x;
       this.y = p0.y;
       this.z = p0.z;
       this.A = p0.A;
       this.B = p0.B;
       this.C = p0.C;
       this.D = p0.D;
       this.E = p0.E;
       this.F = p0.F;
       this.G = p0.G;
       this.H = p0.H;
       this.T = p0.T;
       this.U = p0.U;
       this.I = p0.I;
       this.J = p0.J;
       this.K = p0.K;
       this.M = p0.M;
       this.L = p0.L;
       this.N = p0.N;
       this.O = p0.O;
       this.P = p0.P;
       this.Q = p0.Q;
       this.R = p0.R;
       this.S = p0.S;
       this.W = p0.W;
       this.X = p0.X;
       this.Y = p0.Y;
       this.Z = p0.Z;
       this.d0 = p0.d0;
       this.e0 = p0.e0;
       this.f0 = p0.f0;
       this.g0 = p0.g0;
       this.h0 = p0.h0;
       this.i0 = p0.i0;
       this.j0 = p0.j0;
       this.V = p0.V;
       this.n0 = p0.n0;
    }
    public String a(){
       return this.V;
    }
    public ConstraintWidget b(){
       return this.n0;
    }
    public void c(){
       boolean b = false;
       this.Z = b;
       boolean b1 = true;
       this.W = b1;
       this.X = b1;
       ViewGroup$MarginLayoutParams twidth = this.width;
       if (twidth == -2 && this.T != null) {
          this.W = b;
          if (this.I == null) {
             this.I = b1;
          }
       }
       ViewGroup$MarginLayoutParams theight = this.height;
       if (theight == -2 && this.U != null) {
          this.X = b;
          if (this.J == null) {
             this.J = b1;
          }
       }
       if (twidth == null || twidth == -1) {
          this.W = b;
          if (twidth == null && this.I == b1) {
             this.width = -2;
             this.T = b1;
          }
       }
       if (theight == null || theight == -1) {
          this.X = b;
          if (theight == null && this.J == b1) {
             this.height = -2;
             this.U = b1;
          }
       }
       if (!this.c - 0xbf800000 && (this.a != -1 || this.b != -1)) {
          this.Z = b1;
          this.W = b1;
          this.X = b1;
          if (!this.n0 instanceof f) {
             this.n0 = new f();
          }
          this.n0.n1(this.S);
       }
       return;
    }
    public void resolveLayoutDirection(int p0){
       ViewGroup$MarginLayoutParams tleftMargin = this.leftMargin;
       ViewGroup$MarginLayoutParams trightMargin = this.rightMargin;
       super.resolveLayoutDirection(p0);
       float f = 0;
       int i = 1;
       ConstraintLayout$LayoutParams layoutParams = (i == this.getLayoutDirection())? 1: null;
       this.f0 = -1;
       this.g0 = -1;
       this.d0 = -1;
       this.e0 = -1;
       this.h0 = -1;
       this.i0 = -1;
       this.h0 = this.t;
       this.i0 = this.v;
       ConstraintLayout$LayoutParams tz = this.z;
       this.j0 = tz;
       ConstraintLayout$LayoutParams ta = this.a;
       this.k0 = ta;
       ConstraintLayout$LayoutParams tb = this.b;
       this.l0 = tb;
       ConstraintLayout$LayoutParams tc = this.c;
       this.m0 = tc;
       if (layoutParams) {
          layoutParams = this.p;
          if (layoutParams != -1) {
             this.f0 = layoutParams;
          }else {
             layoutParams = this.q;
             if (layoutParams != -1) {
                this.g0 = layoutParams;
             }else {
             label_0048 :
                layoutParams = this.r;
                if (layoutParams != -1) {
                   this.e0 = layoutParams;
                   f = Float.MIN_VALUE;
                }
                layoutParams = this.s;
                if (layoutParams != -1) {
                   this.d0 = layoutParams;
                   f = Float.MIN_VALUE;
                }
                layoutParams = this.x;
                if (layoutParams != -1) {
                   this.i0 = layoutParams;
                }
                layoutParams = this.y;
                if (layoutParams != -1) {
                   this.h0 = layoutParams;
                }
                float f1 = 0x3f800000;
                if (f) {
                   this.j0 = f1 - tz;
                }
                if (this.Z != null && this.S == i) {
                   if (tc - 0xbf800000) {
                      this.m0 = f1 - tc;
                      this.k0 = -1;
                      this.l0 = -1;
                   }else if(ta != -1){
                      this.l0 = ta;
                      this.k0 = -1;
                      this.m0 = 0xbf800000;
                   }else if(tb != -1){
                      this.k0 = tb;
                      this.l0 = -1;
                      this.m0 = 0xbf800000;
                   }
                }
             }
          }
          f = Float.MIN_VALUE;
          goto label_0048 ;
       }else {
          layoutParams = this.p;
          if (layoutParams != -1) {
             this.e0 = layoutParams;
          }
          layoutParams = this.q;
          if (layoutParams != -1) {
             this.d0 = layoutParams;
          }
          layoutParams = this.r;
          if (layoutParams != -1) {
             this.f0 = layoutParams;
          }
          layoutParams = this.s;
          if (layoutParams != -1) {
             this.g0 = layoutParams;
          }
          layoutParams = this.x;
          if (layoutParams != -1) {
             this.h0 = layoutParams;
          }
          layoutParams = this.y;
          if (layoutParams != -1) {
             this.i0 = layoutParams;
          }
       }
    label_00b6 :
       if (this.r == -1 && (this.s == -1 && (this.q == -1 && this.p == -1))) {
          layoutParams = this.f;
          if (layoutParams != -1) {
             this.f0 = layoutParams;
             if (this.rightMargin <= null && trightMargin > null) {
                this.rightMargin = trightMargin;
             }
          }else {
             layoutParams = this.g;
             if (layoutParams != -1) {
                this.g0 = layoutParams;
                if (this.rightMargin <= null && trightMargin > null) {
                   this.rightMargin = trightMargin;
                }
             }
          }
          layoutParams = this.d;
          if (layoutParams != -1) {
             this.d0 = layoutParams;
             if (this.leftMargin <= null && tleftMargin > null) {
                this.leftMargin = tleftMargin;
             }
          }else {
             layoutParams = this.e;
             if (layoutParams != -1) {
                this.e0 = layoutParams;
                if (this.leftMargin <= null && tleftMargin > null) {
                   this.leftMargin = tleftMargin;
                }
             }
          }
       }
    label_0100 :
       return;
    }
}
