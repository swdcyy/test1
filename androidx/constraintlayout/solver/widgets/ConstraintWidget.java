package androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.lang.Object;
import androidx.constraintlayout.solver.widgets.analyzer.WidgetRun;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type;
import java.util.ArrayList;
import androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour;
import java.lang.String;
import androidx.constraintlayout.solver.widgets.d;
import androidx.constraintlayout.solver.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.solver.c;
import java.util.HashSet;
import androidx.constraintlayout.solver.widgets.g;
import java.util.Iterator;
import androidx.constraintlayout.solver.widgets.h;
import androidx.constraintlayout.solver.widgets.f;
import androidx.constraintlayout.solver.SolverVariable;
import f1.b;
import androidx.constraintlayout.solver.widgets.analyzer.d;
import androidx.constraintlayout.solver.b;
import java.lang.Math;
import androidx.constraintlayout.solver.widgets.ConstraintWidget$a;
import java.lang.Enum;
import androidx.constraintlayout.solver.widgets.a;
import java.util.Objects;
import java.util.HashMap;
import java.util.Arrays;
import f1.a;
import androidx.constraintlayout.solver.widgets.analyzer.c;
import java.lang.AssertionError;
import java.lang.Float;
import java.lang.StringBuilder;

public class ConstraintWidget	// class@00068f
{
    public int A;
    public boolean A0;
    public float B;
    public int B0;
    public int[] C;
    public int C0;
    public float D;
    public boolean D0;
    public boolean E;
    public boolean E0;
    public boolean F;
    public float[] F0;
    public boolean G;
    public ConstraintWidget[] G0;
    public int H;
    public ConstraintWidget[] H0;
    public int I;
    public ConstraintWidget I0;
    public ConstraintAnchor J;
    public ConstraintWidget J0;
    public ConstraintAnchor K;
    public int K0;
    public ConstraintAnchor L;
    public int L0;
    public ConstraintAnchor M;
    public ConstraintAnchor N;
    public ConstraintAnchor O;
    public ConstraintAnchor P;
    public ConstraintAnchor Q;
    public ConstraintAnchor[] R;
    public ArrayList S;
    public boolean[] T;
    public ConstraintWidget$DimensionBehaviour[] U;
    public ConstraintWidget V;
    public int W;
    public int X;
    public float Y;
    public int Z;
    public boolean a;
    public int a0;
    public WidgetRun[] b;
    public int b0;
    public c c;
    public int c0;
    public c d;
    public int d0;
    public c e;
    public int e0;
    public d f;
    public int f0;
    public boolean[] g;
    public int g0;
    public boolean h;
    public int h0;
    public boolean i;
    public int i0;
    public boolean j;
    public float j0;
    public boolean k;
    public float k0;
    public boolean l;
    public Object l0;
    public boolean m;
    public int m0;
    public int n;
    public int n0;
    public int o;
    public String o0;
    public int p;
    public String p0;
    public int q;
    public int q0;
    public int[] r;
    public int r0;
    public int s;
    public int s0;
    public int t;
    public int t0;
    public float u;
    public boolean u0;
    public int v;
    public boolean v0;
    public int w;
    public boolean w0;
    public float x;
    public boolean x0;
    public boolean y;
    public boolean y0;
    public boolean z;
    public boolean z0;
    public static float M0 = 0.000000;

    public void ConstraintWidget(){
       ConstraintWidget$DimensionBehaviour fIXED;
       super();
       this.a = false;
       WidgetRun[] widgetRunArr = new WidgetRun[2];
       this.b = widgetRunArr;
       this.e = null;
       this.f = null;
       this.g = new boolean[2]{0x01,0x01};
       this.h = false;
       this.i = true;
       this.j = false;
       this.k = true;
       this.l = false;
       this.m = false;
       this.n = -1;
       this.o = -1;
       this.p = 0;
       this.q = 0;
       int[] ointArray = new int[]{null,null};
       this.r = ointArray;
       this.s = 0;
       this.t = 0;
       this.u = 0x3f800000;
       this.v = 0;
       this.w = 0;
       this.x = 0x3f800000;
       this.A = -1;
       this.B = 0x3f800000;
       this.C = new int[2]{0x7fffffff,0x7fffffff};
       this.D = 0;
       this.E = false;
       this.G = false;
       this.H = 0;
       this.I = 0;
       ConstraintAnchor uConstraintA = new ConstraintAnchor(this, ConstraintAnchor$Type.LEFT);
       this.J = uConstraintA;
       ConstraintAnchor uConstraintA1 = new ConstraintAnchor(this, ConstraintAnchor$Type.TOP);
       this.K = uConstraintA1;
       ConstraintAnchor uConstraintA2 = new ConstraintAnchor(this, ConstraintAnchor$Type.RIGHT);
       this.L = uConstraintA2;
       ConstraintAnchor uConstraintA3 = new ConstraintAnchor(this, ConstraintAnchor$Type.BOTTOM);
       this.M = uConstraintA3;
       ConstraintAnchor uConstraintA4 = new ConstraintAnchor(this, ConstraintAnchor$Type.BASELINE);
       this.N = uConstraintA4;
       this.O = new ConstraintAnchor(this, ConstraintAnchor$Type.CENTER_X);
       this.P = new ConstraintAnchor(this, ConstraintAnchor$Type.CENTER_Y);
       ConstraintAnchor uConstraintA5 = new ConstraintAnchor(this, ConstraintAnchor$Type.CENTER);
       this.Q = uConstraintA5;
       ConstraintAnchor[] uConstraintA6 = new ConstraintAnchor[]{uConstraintA,uConstraintA2,uConstraintA1,uConstraintA3,uConstraintA4,uConstraintA5};
       this.R = uConstraintA6;
       this.S = new ArrayList();
       boolean[] uobooleanArr = new boolean[]{fIXED,fIXED};
       this.T = uobooleanArr;
       ConstraintWidget$DimensionBehaviour[] uDimensionBe = new ConstraintWidget$DimensionBehaviour[2];
       fIXED = ConstraintWidget$DimensionBehaviour.FIXED;
       this.U = uDimensionBe;
       this.V = null;
       this.W = 0;
       this.X = 0;
       this.Y = 0;
       this.Z = -1;
       this.a0 = 0;
       this.b0 = 0;
       this.c0 = 0;
       this.d0 = 0;
       this.e0 = 0;
       this.f0 = 0;
       this.g0 = 0;
       float m0 = ConstraintWidget.M0;
       this.j0 = m0;
       this.k0 = m0;
       this.m0 = 0;
       this.n0 = 0;
       this.o0 = null;
       this.p0 = null;
       this.A0 = false;
       this.B0 = 0;
       this.C0 = 0;
       this.F0 = new float[2]{0xbf800000,0xbf800000};
       ConstraintWidget[] uConstraintW = new ConstraintWidget[2];
       this.G0 = uConstraintW;
       ConstraintWidget[] uConstraintW1 = new ConstraintWidget[]{null,null};
       this.H0 = uConstraintW1;
       this.I0 = null;
       this.J0 = null;
       this.K0 = -1;
       this.L0 = -1;
       this.d();
    }
    public void ConstraintWidget(int p0,int p1){
       super(0, 0, p0, p1);
    }
    public void ConstraintWidget(int p0,int p1,int p2,int p3){
       ConstraintWidget$DimensionBehaviour fIXED;
       int i = this;
       super();
       i.a = false;
       WidgetRun[] widgetRunArr = new WidgetRun[2];
       i.b = widgetRunArr;
       i.e = null;
       i.f = null;
       i.g = new boolean[2]{0x01,0x01};
       i.h = false;
       i.i = true;
       i.j = false;
       i.k = true;
       i.l = false;
       i.m = false;
       i.n = -1;
       i.o = -1;
       i.p = 0;
       i.q = 0;
       int[] ointArray = new int[]{null,null};
       i.r = ointArray;
       i.s = 0;
       i.t = 0;
       i.u = 0x3f800000;
       i.v = 0;
       i.w = 0;
       i.x = 0x3f800000;
       i.A = -1;
       i.B = 0x3f800000;
       i.C = new int[2]{0x7fffffff,0x7fffffff};
       i.D = 0;
       i.E = false;
       i.G = false;
       i.H = 0;
       i.I = 0;
       ConstraintAnchor uConstraintA = new ConstraintAnchor(this, ConstraintAnchor$Type.LEFT);
       i.J = uConstraintA;
       ConstraintAnchor uConstraintA1 = new ConstraintAnchor(this, ConstraintAnchor$Type.TOP);
       i.K = uConstraintA1;
       ConstraintAnchor uConstraintA2 = new ConstraintAnchor(this, ConstraintAnchor$Type.RIGHT);
       i.L = uConstraintA2;
       ConstraintAnchor uConstraintA3 = new ConstraintAnchor(this, ConstraintAnchor$Type.BOTTOM);
       i.M = uConstraintA3;
       ConstraintAnchor uConstraintA4 = new ConstraintAnchor(this, ConstraintAnchor$Type.BASELINE);
       i.N = uConstraintA4;
       i.O = new ConstraintAnchor(this, ConstraintAnchor$Type.CENTER_X);
       i.P = new ConstraintAnchor(this, ConstraintAnchor$Type.CENTER_Y);
       ConstraintAnchor uConstraintA5 = new ConstraintAnchor(this, ConstraintAnchor$Type.CENTER);
       i.Q = uConstraintA5;
       ConstraintAnchor[] uConstraintA6 = new ConstraintAnchor[]{uConstraintA,uConstraintA2,uConstraintA1,uConstraintA3,uConstraintA4,uConstraintA5};
       i.R = uConstraintA6;
       i.S = new ArrayList();
       boolean[] uobooleanArr = new boolean[]{fIXED,fIXED};
       i.T = uobooleanArr;
       ConstraintWidget$DimensionBehaviour[] uDimensionBe = new ConstraintWidget$DimensionBehaviour[2];
       fIXED = ConstraintWidget$DimensionBehaviour.FIXED;
       i.U = uDimensionBe;
       i.V = null;
       i.W = 0;
       i.X = 0;
       i.Y = 0;
       i.Z = -1;
       i.a0 = 0;
       i.b0 = 0;
       i.c0 = 0;
       i.d0 = 0;
       i.e0 = 0;
       i.f0 = 0;
       i.g0 = 0;
       float m0 = ConstraintWidget.M0;
       i.j0 = m0;
       i.k0 = m0;
       i.m0 = 0;
       i.n0 = 0;
       i.o0 = null;
       i.p0 = null;
       i.A0 = false;
       i.B0 = 0;
       i.C0 = 0;
       i.F0 = new float[2]{0xbf800000,0xbf800000};
       ConstraintWidget[] uConstraintW = new ConstraintWidget[2];
       i.G0 = uConstraintW;
       ConstraintWidget[] uConstraintW1 = new ConstraintWidget[]{null,null};
       i.H0 = uConstraintW1;
       i.I0 = null;
       i.J0 = null;
       i.K0 = -1;
       i.L0 = -1;
       i.a0 = p0;
       i.b0 = p1;
       i.W = p2;
       i.X = p3;
       this.d();
    }
    public void ConstraintWidget(String p0){
       ConstraintWidget$DimensionBehaviour fIXED;
       super();
       this.a = false;
       WidgetRun[] widgetRunArr = new WidgetRun[2];
       this.b = widgetRunArr;
       this.e = null;
       this.f = null;
       this.g = new boolean[2]{0x01,0x01};
       this.h = false;
       this.i = true;
       this.j = false;
       this.k = true;
       this.l = false;
       this.m = false;
       this.n = -1;
       this.o = -1;
       this.p = 0;
       this.q = 0;
       int[] ointArray = new int[]{null,null};
       this.r = ointArray;
       this.s = 0;
       this.t = 0;
       this.u = 0x3f800000;
       this.v = 0;
       this.w = 0;
       this.x = 0x3f800000;
       this.A = -1;
       this.B = 0x3f800000;
       this.C = new int[2]{0x7fffffff,0x7fffffff};
       this.D = 0;
       this.E = false;
       this.G = false;
       this.H = 0;
       this.I = 0;
       ConstraintAnchor uConstraintA = new ConstraintAnchor(this, ConstraintAnchor$Type.LEFT);
       this.J = uConstraintA;
       ConstraintAnchor uConstraintA1 = new ConstraintAnchor(this, ConstraintAnchor$Type.TOP);
       this.K = uConstraintA1;
       ConstraintAnchor uConstraintA2 = new ConstraintAnchor(this, ConstraintAnchor$Type.RIGHT);
       this.L = uConstraintA2;
       ConstraintAnchor uConstraintA3 = new ConstraintAnchor(this, ConstraintAnchor$Type.BOTTOM);
       this.M = uConstraintA3;
       ConstraintAnchor uConstraintA4 = new ConstraintAnchor(this, ConstraintAnchor$Type.BASELINE);
       this.N = uConstraintA4;
       this.O = new ConstraintAnchor(this, ConstraintAnchor$Type.CENTER_X);
       this.P = new ConstraintAnchor(this, ConstraintAnchor$Type.CENTER_Y);
       ConstraintAnchor uConstraintA5 = new ConstraintAnchor(this, ConstraintAnchor$Type.CENTER);
       this.Q = uConstraintA5;
       ConstraintAnchor[] uConstraintA6 = new ConstraintAnchor[]{uConstraintA,uConstraintA2,uConstraintA1,uConstraintA3,uConstraintA4,uConstraintA5};
       this.R = uConstraintA6;
       this.S = new ArrayList();
       boolean[] uobooleanArr = new boolean[]{fIXED,fIXED};
       this.T = uobooleanArr;
       ConstraintWidget$DimensionBehaviour[] uDimensionBe = new ConstraintWidget$DimensionBehaviour[2];
       fIXED = ConstraintWidget$DimensionBehaviour.FIXED;
       this.U = uDimensionBe;
       this.V = null;
       this.W = 0;
       this.X = 0;
       this.Y = 0;
       this.Z = -1;
       this.a0 = 0;
       this.b0 = 0;
       this.c0 = 0;
       this.d0 = 0;
       this.e0 = 0;
       this.f0 = 0;
       this.g0 = 0;
       float m0 = ConstraintWidget.M0;
       this.j0 = m0;
       this.k0 = m0;
       this.m0 = 0;
       this.n0 = 0;
       this.o0 = null;
       this.p0 = null;
       this.A0 = false;
       this.B0 = 0;
       this.C0 = 0;
       this.F0 = new float[2]{0xbf800000,0xbf800000};
       ConstraintWidget[] uConstraintW = new ConstraintWidget[2];
       this.G0 = uConstraintW;
       ConstraintWidget[] uConstraintW1 = new ConstraintWidget[]{null,null};
       this.H0 = uConstraintW1;
       this.I0 = null;
       this.J0 = null;
       this.K0 = -1;
       this.L0 = -1;
       this.d();
       this.q0(p0);
    }
    public int A(){
       return this.B0;
    }
    public void A0(float p0){
       this.j0 = p0;
    }
    public ConstraintWidget$DimensionBehaviour B(){
       return this.U[0];
    }
    public void B0(int p0){
       this.B0 = p0;
    }
    public int C(){
       ConstraintWidget tJ = this.J;
       int i = 0;
       if (tJ != null) {
          i = i + tJ.g;
       }
       tJ = this.L;
       if (tJ != null) {
          i = i + tJ.g;
       }
       return i;
    }
    public void C0(int p0,int p1){
       this.a0 = p0;
       p1 = p1 - p0;
       this.W = p1;
       ConstraintWidget th0 = this.h0;
       if (p1 < th0) {
          this.W = th0;
       }
       return;
    }
    public int D(){
       return this.H;
    }
    public void D0(ConstraintWidget$DimensionBehaviour p0){
       this.U[0] = p0;
    }
    public int E(){
       return this.I;
    }
    public void E0(int p0,int p1,int p2,float p3){
       this.p = p0;
       this.s = p1;
       if (p2 == Integer.MAX_VALUE) {
          p2 = 0;
       }
       this.t = p2;
       this.u = p3;
       if (p3 > 0 && (p3 - 0x3f800000 < 0 && !p0)) {
          this.p = 2;
       }
    label_001e :
       return;
    }
    public int F(int p0){
       if (!p0) {
          return this.U();
       }
       if (p0 == 1) {
          return this.y();
       }
       return 0;
    }
    public void F0(float p0){
       this.F0[0] = p0;
    }
    public int G(){
       return this.C[1];
    }
    public void G0(int p0,boolean p1){
       this.T[p0] = p1;
    }
    public int H(){
       return this.C[0];
    }
    public void H0(boolean p0){
       this.F = p0;
    }
    public int I(){
       return this.i0;
    }
    public void I0(boolean p0){
       this.G = p0;
    }
    public int J(){
       return this.h0;
    }
    public void J0(int p0,int p1){
       this.H = p0;
       this.I = p1;
       this.M0(false);
    }
    public ConstraintWidget K(int p0){
       ConstraintWidget tL;
       ConstraintAnchor f;
       if (!p0) {
          tL = this.L;
          f = tL.f;
          if (f != null && f.f == tL) {
             return f.d;
          }
       }else if(p0 == 1){
          tL = this.M;
          f = tL.f;
          if (f != null && f.f == tL) {
             return f.d;
          }
       }
       return null;
    }
    public void K0(int p0){
       this.C[1] = p0;
    }
    public ConstraintWidget L(){
       return this.V;
    }
    public void L0(int p0){
       this.C[0] = p0;
    }
    public ConstraintWidget M(int p0){
       ConstraintWidget tJ;
       ConstraintAnchor f;
       if (!p0) {
          tJ = this.J;
          f = tJ.f;
          if (f != null && f.f == tJ) {
             return f.d;
          }
       }else if(p0 == 1){
          tJ = this.K;
          f = tJ.f;
          if (f != null && f.f == tJ) {
             return f.d;
          }
       }
       return null;
    }
    public void M0(boolean p0){
       this.i = p0;
    }
    public int N(){
       return (this.V() + this.W);
    }
    public void N0(int p0){
       this.i0 = (p0 < 0)? 0: p0;
       return;
    }
    public WidgetRun O(int p0){
       if (!p0) {
          return this.e;
       }
       if (p0 == 1) {
          return this.f;
       }
       return null;
    }
    public void O0(int p0){
       this.h0 = (p0 < 0)? 0: p0;
       return;
    }
    public float P(){
       return this.k0;
    }
    public void P0(int p0,int p1){
       this.a0 = p0;
       this.b0 = p1;
    }
    public int Q(){
       return this.C0;
    }
    public void Q0(ConstraintWidget p0){
       this.V = p0;
    }
    public ConstraintWidget$DimensionBehaviour R(){
       return this.U[1];
    }
    public void R0(float p0){
       this.k0 = p0;
    }
    public int S(){
       int i = 0;
       if (this.J != null) {
          i = i + this.K.g;
       }
       if (this.L != null) {
          i = i + this.M.g;
       }
       return i;
    }
    public void S0(int p0){
       this.C0 = p0;
    }
    public int T(){
       return this.n0;
    }
    public void T0(int p0,int p1){
       this.b0 = p0;
       p1 = p1 - p0;
       this.X = p1;
       ConstraintWidget ti0 = this.i0;
       if (p1 < ti0) {
          this.X = ti0;
       }
       return;
    }
    public int U(){
       if (this.n0 == 8) {
          return 0;
       }
       return this.W;
    }
    public void U0(ConstraintWidget$DimensionBehaviour p0){
       this.U[1] = p0;
    }
    public int V(){
       ConstraintWidget tV = this.V;
       if (tV != null && tV instanceof d) {
          return (tV.U0 + this.a0);
       }
       return this.a0;
    }
    public void V0(int p0,int p1,int p2,float p3){
       this.q = p0;
       this.v = p1;
       if (p2 == Integer.MAX_VALUE) {
          p2 = 0;
       }
       this.w = p2;
       this.x = p3;
       if (p3 > 0 && (p3 - 0x3f800000 < 0 && !p0)) {
          this.q = 2;
       }
    label_001e :
       return;
    }
    public int W(){
       ConstraintWidget tV = this.V;
       if (tV != null && tV instanceof d) {
          return (tV.V0 + this.b0);
       }
       return this.b0;
    }
    public void W0(float p0){
       this.F0[1] = p0;
    }
    public boolean X(){
       return this.E;
    }
    public void X0(int p0){
       this.n0 = p0;
    }
    public boolean Y(int p0){
       int i;
       boolean b = true;
       if (!p0) {
          p0 = (this.J.f != null)? 1: 0;
          i = (this.L.f != null)? 1: 0;
          if ((p0 + i) >= 2) {
             b = false;
          }
          return b;
       }else if(this.K.f != null){
          p0 = 1;
       }else {
          p0 = 0;
       }
       i = (this.M.f != null)? 1: 0;
       p0 = p0 + i;
       i = (this.N.f != null)? 1: 0;
       if ((p0 + i) >= 2) {
          b = false;
       }
       return b;
    }
    public void Y0(int p0){
       this.W = p0;
       ConstraintWidget th0 = this.h0;
       if (p0 < th0) {
          this.W = th0;
       }
       return;
    }
    public boolean Z(){
       int i = this.S.size();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return false;
          }
          if (this.S.get(i1).m()) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return true;
    }
    public void Z0(int p0){
       this.a0 = p0;
    }
    public void a0(ConstraintAnchor$Type p0,ConstraintWidget p1,ConstraintAnchor$Type p2,int p3,int p4){
       this.p(p0).b(p1.p(p2), p3, p4, true);
    }
    public void a1(int p0){
       this.b0 = p0;
    }
    public final boolean b0(int p0){
       p0 = p0 * 2;
       ConstraintWidget tR = this.R;
       int i = 1;
       if (tR[p0].f != null && tR[p0].f.f != tR[p0]) {
          p0 = p0 + i;
          if (tR[p0].f != null && tR[p0].f.f == tR[p0]) {
          label_0028 :
             return i;
          }
       }
       i = false;
       goto label_0028 ;
    }
    public void b1(boolean p0,boolean p1,boolean p2,boolean p3){
       float f = 0x3f800000;
       if (this.A == -1) {
          if (p2 && !p3) {
             this.A = 0;
          }else if(!p2 && p3){
             this.A = 1;
             if (this.Z == -1) {
                this.B = f / this.B;
             }
          }
       }
       if (this.A == null && (!this.K.o() || !this.M.o())) {
          this.A = 1;
       }else if(this.A == 1 && (!this.J.o() || !this.L.o())){
          this.A = 0;
       }
       if (this.A == -1 && (this.K.o() && (this.M.o() && (!this.J.o() || !this.L.o())))) {
          if (this.K.o() && this.M.o()) {
             this.A = 0;
          }else if(this.J.o() && this.L.o()){
             this.B = f / this.B;
             this.A = 1;
          }
       }
       if (this.A == -1) {
          ConstraintWidget ts = this.s;
          if (ts > null && this.v == null) {
             this.A = 0;
          }else if(ts == null && this.v > null){
             this.B = f / this.B;
             this.A = 1;
          }
       }
       return;
    }
    public boolean c0(){
       ConstraintWidget tJ = this.J;
       ConstraintAnchor f = tJ.f;
       if (f == null || f.f != tJ) {
          tJ = this.L;
          f = tJ.f;
          if (f == null || f.f != tJ) {
             return false;
          }
       }
       return true;
    }
    public void c1(boolean p0,boolean p1){
       ConstraintWidget tW;
       int i = p0 & this.e.k();
       int i1 = p1 & this.f.k();
       ConstraintWidget te = this.e;
       DependencyNode g = te.h.g;
       ConstraintWidget tf = this.f;
       DependencyNode g1 = tf.h.g;
       DependencyNode g2 = te.i.g;
       DependencyNode g3 = tf.i.g;
       int i2 = g3 - g1;
       if ((g2 - g) >= 0 && (i2 >= 0 && (g != Integer.MIN_VALUE && (g != Integer.MAX_VALUE && (g1 != Integer.MIN_VALUE && (g1 != Integer.MAX_VALUE && (g2 != Integer.MIN_VALUE && (g2 != Integer.MAX_VALUE && (g3 == Integer.MIN_VALUE || g3 == Integer.MAX_VALUE))))))))) {
          g2 = 0;
          g = 0;
          g3 = 0;
          g1 = 0;
       }
       int i3 = g2 - g;
       int i4 = g3 - g1;
       if (i) {
          this.a0 = g;
       }
       if (i1) {
          this.b0 = g1;
       }
       if (this.n0 == 8) {
          this.W = 0;
          this.X = 0;
          return;
       }else if(i){
          if (this.U[0] == ConstraintWidget$DimensionBehaviour.FIXED) {
             tW = this.W;
             if (i3 < tW) {
                i3 = tW;
             }
          }
          this.W = i3;
          tW = this.h0;
          if (i3 < tW) {
             this.W = tW;
          }
       }
       if (i1) {
          if (this.U[1] == ConstraintWidget$DimensionBehaviour.FIXED) {
             tW = this.X;
             if (i4 < tW) {
                i4 = tW;
             }
          }
          this.X = i4;
          tW = this.i0;
          if (i4 < tW) {
             this.X = tW;
          }
       }
       return;
    }
    public final void d(){
       this.S.add(this.J);
       this.S.add(this.K);
       this.S.add(this.L);
       this.S.add(this.M);
       this.S.add(this.O);
       this.S.add(this.P);
       this.S.add(this.Q);
       this.S.add(this.N);
    }
    public boolean d0(){
       return this.F;
    }
    public void d1(c p0,boolean p1){
       WidgetRun i4;
       int i = p0.x(this.J);
       int i1 = p0.x(this.K);
       int i2 = p0.x(this.L);
       int i3 = p0.x(this.M);
       if (p1) {
          ConstraintWidget te = this.e;
          if (te != null) {
             WidgetRun h = te.h;
             if (h.j != null) {
                i4 = te.i;
                if (i4.j != null) {
                   i = h.g;
                   i2 = i4.g;
                }
             }
          }
       }
       if (p1) {
          ConstraintWidget tf = this.f;
          if (tf != null) {
             i4 = tf.h;
             if (i4.j != null) {
                WidgetRun i5 = tf.i;
                if (i5.j != null) {
                   i1 = i4.g;
                   i3 = i5.g;
                }
             }
          }
       }
       int i6 = i3 - i1;
       if ((i2 - i) >= 0 && (i6 >= 0 && (i != Integer.MIN_VALUE && (i != Integer.MAX_VALUE && (i1 != Integer.MIN_VALUE && (i1 != Integer.MAX_VALUE && (i2 != Integer.MIN_VALUE && (i2 != Integer.MAX_VALUE && (i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE))))))))) {
          i3 = 0;
          i = 0;
          i1 = 0;
          i2 = 0;
       }
       this.x0(i, i1, i2, i3);
       return;
    }
    public void e(d p0,c p1,HashSet p2,int p3,boolean p4){
       HashSet hashSet;
       Iterator iterator;
       if (p4) {
          if (!p2.contains(this)) {
             return;
          }else {
             g.a(p0, p1, this);
             p2.remove(this);
             this.g(p1, p0.F1(64));
          }
       }
       if (!p3) {
          hashSet = this.J.d();
          if (hashSet != null) {
             iterator = hashSet.iterator();
             while (iterator.hasNext()) {
                iterator.next().d.e(p0, p1, p2, p3, true);
             }
          }
          hashSet = this.L.d();
          if (hashSet != null) {
             iterator = hashSet.iterator();
             while (iterator.hasNext()) {
                iterator.next().d.e(p0, p1, p2, p3, true);
             }
          }
       }else {
          hashSet = this.K.d();
          if (hashSet != null) {
             iterator = hashSet.iterator();
             while (iterator.hasNext()) {
                iterator.next().d.e(p0, p1, p2, p3, true);
             }
          }
          hashSet = this.M.d();
          if (hashSet != null) {
             iterator = hashSet.iterator();
             while (iterator.hasNext()) {
                iterator.next().d.e(p0, p1, p2, p3, true);
             }
          }
          hashSet = this.N.d();
          if (hashSet != null) {
             iterator = hashSet.iterator();
             while (iterator.hasNext()) {
                iterator.next().d.e(p0, p1, p2, p3, true);
             }
          }
       }
       return;
    }
    public boolean e0(){
       ConstraintWidget tK = this.K;
       ConstraintAnchor f = tK.f;
       if (f == null || f.f != tK) {
          tK = this.M;
          f = tK.f;
          if (f == null || f.f != tK) {
             return false;
          }
       }
       return true;
    }
    public boolean f(){
       boolean b = (this instanceof h || this instanceof f)? true: false;
       return b;
    }
    public boolean f0(){
       return this.G;
    }
    public void g(c p0,boolean p1){
       boolean b;
       int b1;
       boolean b2;
       ConstraintWidget e;
       ConstraintWidget f;
       int b3;
       ConstraintWidget uConstraintW1;
       boolean b4;
       boolean b5;
       SolverVariable solverVariab9;
       int i4;
       ConstraintWidget uConstraintW4;
       ConstraintWidget uConstraintW5;
       ConstraintWidget uConstraintW6;
       boolean b6;
       boolean b7;
       int i5;
       WidgetRun h1;
       c uoc1;
       SolverVariable solverVariab10;
       boolean b11;
       ConstraintWidget a0;
       boolean b12;
       ConstraintWidget$DimensionBehaviour uDimensionBe;
       SolverVariable solverVariab12;
       SolverVariable solverVariab13;
       SolverVariable solverVariab14;
       ConstraintWidget$DimensionBehaviour uDimensionBe1;
       SolverVariable solverVariab15;
       boolean b13;
       SolverVariable solverVariab16;
       int i9;
       int i10;
       object oobject1;
       boolean b14;
       SolverVariable solverVariab19;
       ConstraintWidget uConstraintW7;
       object oobject2;
       int i12;
       int i13;
       ConstraintWidget uConstraintW = this;
       c uoc = p0;
       SolverVariable solverVariab = uoc.q(uConstraintW.J);
       SolverVariable solverVariab1 = uoc.q(uConstraintW.L);
       SolverVariable solverVariab2 = uoc.q(uConstraintW.K);
       SolverVariable solverVariab3 = uoc.q(uConstraintW.M);
       SolverVariable solverVariab4 = uoc.q(uConstraintW.N);
       ConstraintWidget v = uConstraintW.V;
       boolean i = 1;
       int i1 = 0;
       if (v != null) {
          b = (v != null && v.U[i1] == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT)? true: false;
          v = (v != null && v.U[i] == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT)? 1: null;
          b1 = v;
          b2 = b;
       }else {
          b2 = false;
          b1 = false;
       }
       if (uConstraintW.n0 == 8 && !this.Z()) {
          v = uConstraintW.T;
          if (!v[i1] && !v[i]) {
             return;
          }
       }
       v = uConstraintW.l;
       b uob = 5;
       if (v != null || uConstraintW.m != null) {
          if (v != null) {
             uoc.f(solverVariab, uConstraintW.a0);
             uoc.f(solverVariab1, (uConstraintW.a0 + uConstraintW.W));
             if (b2) {
                v = uConstraintW.V;
                if (v != null) {
                   if (uConstraintW.k != null) {
                      v.r1(uConstraintW.J);
                      v.l1(uConstraintW.L);
                   }else {
                      uoc.h(uoc.q(v.L), solverVariab1, i1, uob);
                   }
                }
             }
          }
          if (uConstraintW.m != null) {
             uoc.f(solverVariab2, uConstraintW.b0);
             uoc.f(solverVariab3, (uConstraintW.b0 + uConstraintW.X));
             if (uConstraintW.N.m()) {
                uoc.f(solverVariab4, (uConstraintW.b0 + uConstraintW.g0));
             }
             if (b1) {
                v = uConstraintW.V;
                if (v != null) {
                   if (uConstraintW.k != null) {
                      v.r1(uConstraintW.K);
                      v.q1(uConstraintW.M);
                   }else {
                      uoc.h(uoc.q(v.M), solverVariab3, i1, uob);
                   }
                }
             }
          }
       label_00d7 :
          if (uConstraintW.l != null && uConstraintW.m != null) {
             uConstraintW.l = i1;
             uConstraintW.m = i1;
             return;
          }
       }
    label_00e4 :
       b y = c.y;
       long l = 1;
       if (y != null) {
          y.K = y.K + l;
       }
       if (p1) {
          e = uConstraintW.e;
          if (e != null) {
             f = uConstraintW.f;
             if (f != null) {
                WidgetRun h = e.h;
                if (h.j != null && (e.i.j != null && (f.h.j != null && f.i.j != null))) {
                   if (y) {
                      y.w = y.w + l;
                   }
                   uoc.f(solverVariab, h.g);
                   uoc.f(solverVariab1, uConstraintW.e.i.g);
                   uoc.f(solverVariab2, uConstraintW.f.h.g);
                   uoc.f(solverVariab3, uConstraintW.f.i.g);
                   uoc.f(solverVariab4, uConstraintW.f.k.g);
                   if (uConstraintW.V != null) {
                      if (b2) {
                         b = 0;
                         if (uConstraintW.g[b] && !this.c0()) {
                            uoc.h(uoc.q(uConstraintW.V.L), solverVariab1, b, 8);
                         }
                      }
                      if (b1 && (uConstraintW.g[1] && !this.e0())) {
                         uoc.h(uoc.q(uConstraintW.V.M), solverVariab3, 0, 8);
                      label_0180 :
                         uConstraintW.l = false;
                         uConstraintW.m = false;
                         return;
                      }
                   }
                label_017f :
                   b3 = false;
                   goto label_0180 ;
                }
             }
          }
       }
       if (y) {
          y.x = y.x + l;
       }
       if (uConstraintW.V != null) {
          boolean i2 = 0;
          if (uConstraintW.b0(i2)) {
             uConstraintW.V.i1(uConstraintW, i2);
             v = 1;
          }else {
             i2 = this.c0();
          }
          b = 1;
          if (uConstraintW.b0(b)) {
             uConstraintW.V.i1(uConstraintW, b);
             uConstraintW1 = 1;
          }else {
             uConstraintW1 = this.e0();
          }
          if (!v && (b2 && (uConstraintW.n0 != 8 && (uConstraintW.J.f == null && uConstraintW.L.f == null)))) {
             uoc.h(uoc.q(uConstraintW.V.L), solverVariab1, 0, 1);
          }
       label_01db :
          if (!uConstraintW1 && (b1 && (uConstraintW.n0 != 8 && (uConstraintW.K.f == null && (uConstraintW.M.f == null && uConstraintW.N == null))))) {
             uoc.h(uoc.q(uConstraintW.V.M), solverVariab3, 0, 1);
          }
       label_0202 :
          b4 = v;
          b5 = uConstraintW1;
       }else {
          b5 = false;
          b4 = 0;
       }
       v = uConstraintW.W;
       uConstraintW1 = uConstraintW.h0;
       if (v >= uConstraintW1) {
          uConstraintW1 = v;
       }
       ConstraintWidget x = uConstraintW.X;
       e = uConstraintW.i0;
       if (x >= e) {
          e = x;
       }
       f = uConstraintW.U;
       ConstraintWidget$DimensionBehaviour mATCH_CONSTR = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
       ConstraintWidget uConstraintW2 = uConstraintW1;
       i = (f[0] != mATCH_CONSTR)? true: false;
       ConstraintWidget uConstraintW3 = e;
       b = (f[1] != mATCH_CONSTR)? true: false;
       e = uConstraintW.Z;
       uConstraintW.A = e;
       SolverVariable solverVariab5 = solverVariab4;
       ConstraintWidget y1 = uConstraintW.Y;
       uConstraintW.B = y1;
       SolverVariable solverVariab6 = solverVariab3;
       ConstraintWidget p = uConstraintW.p;
       SolverVariable solverVariab7 = solverVariab2;
       ConstraintWidget q = uConstraintW.q;
       SolverVariable solverVariab8 = solverVariab1;
       if (y1 > 0) {
          solverVariab9 = solverVariab;
          if (uConstraintW.n0 != 8) {
             if (f[0] == mATCH_CONSTR && p == null) {
                p = 3;
             }
             int i3 = 1;
             if (f[i3] == mATCH_CONSTR && q == null) {
                q = 3;
             }
             if (f[0] == mATCH_CONSTR && f[i3] == mATCH_CONSTR) {
                solverVariab1 = 3;
                if (p == solverVariab1 && q == solverVariab1) {
                   uConstraintW.b1(b2, b1, i, b);
                label_02ce :
                   i4 = 0;
                   uConstraintW4 = p;
                   uConstraintW5 = q;
                   uConstraintW1 = uConstraintW2;
                   uConstraintW6 = uConstraintW3;
                label_02d8 :
                   b6 = true;
                }
             }else {
                a0 = 3;
             }
             b = 0;
             if (f[b] == mATCH_CONSTR && p == solverVariab1) {
                uConstraintW.A = b;
                b = (int)(y1 * (float)x);
                if (f[1] != mATCH_CONSTR) {
                   uConstraintW5 = q;
                   uConstraintW6 = uConstraintW3;
                   b6 = false;
                   i4 = 0;
                   uConstraintW4 = 4;
                }else {
                   uConstraintW4 = p;
                   uConstraintW5 = q;
                   uConstraintW6 = uConstraintW3;
                   b6 = true;
                   i4 = 0;
                }
             }else {
                b3 = 1;
                if (f[b3] == mATCH_CONSTR && q == 3) {
                   uConstraintW.A = b3;
                   if (e == -1) {
                      uConstraintW.B = 0x3f800000 / y1;
                   }
                   i4 = 0;
                   uConstraintW6 = (int)(uConstraintW.B * (float)v);
                   uConstraintW4 = p;
                   if (f[i4] != mATCH_CONSTR) {
                      uConstraintW1 = uConstraintW2;
                      b6 = false;
                      uConstraintW5 = 4;
                   }else {
                      uConstraintW5 = q;
                      uConstraintW1 = uConstraintW2;
                      goto label_02d8 ;
                   }
                }else {
                   goto label_02ce ;
                }
             }
          }else {
          label_02dc :
             i4 = 0;
             uConstraintW4 = p;
             uConstraintW5 = q;
             uConstraintW1 = uConstraintW2;
             uConstraintW6 = uConstraintW3;
             b6 = false;
          }
       }else {
          solverVariab9 = solverVariab;
          goto label_02dc ;
       }
       v = uConstraintW.r;
       v[i4] = uConstraintW4;
       v[1] = uConstraintW5;
       uConstraintW.h = b6;
       if (b6) {
          v = uConstraintW.A;
          x = -1;
          if (v == null || v == x) {
             b7 = true;
          label_02ff :
             if (b6) {
                v = uConstraintW.A;
                if (v == 1 || v == x) {
                   i5 = 1;
                label_030d :
                   ConstraintWidget$DimensionBehaviour wRAP_CONTENT = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                   boolean b8 = (uConstraintW.U[0] == wRAP_CONTENT && uConstraintW instanceof d)? true: false;
                   uConstraintW3 = (b8)? 0: uConstraintW1;
                   int i6 = uConstraintW.Q.o() ^ 0x01;
                   v = uConstraintW.T;
                   boolean b9 = v[0];
                   boolean b10 = v[1];
                   if (uConstraintW.n != 2 && uConstraintW.l == null) {
                      if (p1) {
                         v = uConstraintW.e;
                         if (v != null) {
                            h1 = v.h;
                            if (h1.j != null && v.i.j != null) {
                               if (p1) {
                                  uoc1 = p0;
                                  solverVariab3 = solverVariab9;
                                  uoc1.f(solverVariab3, h1.g);
                                  solverVariab10 = solverVariab8;
                                  uoc1.f(solverVariab10, uConstraintW.e.i.g);
                                  if (uConstraintW.V != null && b2) {
                                     b = 0;
                                     if (uConstraintW.g[b] && !this.c0()) {
                                        uoc1.h(uoc1.q(uConstraintW.V.L), solverVariab10, b, 8);
                                     }
                                  }
                                  b12 = b2;
                                  b11 = b1;
                                  uDimensionBe = mATCH_CONSTR;
                                  solverVariab8 = solverVariab10;
                                  solverVariab15 = solverVariab3;
                                  uDimensionBe1 = wRAP_CONTENT;
                                  b13 = b6;
                                  solverVariab12 = solverVariab5;
                                  solverVariab13 = solverVariab6;
                                  solverVariab14 = solverVariab7;
                               }else {
                                  i9 = p0;
                               label_0446 :
                                  b12 = b2;
                                  uDimensionBe = mATCH_CONSTR;
                                  uDimensionBe1 = wRAP_CONTENT;
                                  b13 = b6;
                                  solverVariab12 = solverVariab5;
                                  solverVariab13 = solverVariab6;
                                  solverVariab14 = solverVariab7;
                                  solverVariab15 = solverVariab9;
                                  b11 = b1;
                               }
                            }
                         }
                      }
                      uoc1 = p0;
                      solverVariab10 = solverVariab8;
                      solverVariab3 = solverVariab9;
                      v = uConstraintW.V;
                      SolverVariable solverVariab11 = (v != null)? uoc1.q(v.L): 0;
                      v = uConstraintW.V;
                      solverVariab8 = (v != null)? uoc1.q(v.J): 0;
                      i4 = 0;
                      b11 = uConstraintW.g[i4];
                      v = uConstraintW.U;
                      object oobject = v[i4];
                      e = uConstraintW.J;
                      uConstraintW1 = uConstraintW.L;
                      a0 = uConstraintW.a0;
                      x = uConstraintW.h0;
                      int i7 = uConstraintW.C[i4];
                      f = uConstraintW.j0;
                      int i8 = (v[1] == mATCH_CONSTR)? 1: 0;
                      b12 = b2;
                      b11 = b1;
                      uDimensionBe = mATCH_CONSTR;
                      solverVariab12 = solverVariab5;
                      solverVariab13 = solverVariab6;
                      solverVariab14 = solverVariab7;
                      solverVariab8 = solverVariab10;
                      uDimensionBe1 = wRAP_CONTENT;
                      solverVariab15 = solverVariab3;
                      b13 = b6;
                      this.i(p0, true, b2, b1, b11, solverVariab8, solverVariab11, oobject, b8, e, uConstraintW1, a0, uConstraintW3, x, i7, f, b7, i8, b4, b5, b9, uConstraintW4, uConstraintW5, uConstraintW.s, uConstraintW.t, uConstraintW.u, i6);
                   }else {
                      goto label_0446 ;
                   }
                   if (p1) {
                      uConstraintW = this;
                      v = uConstraintW.f;
                      if (v != null) {
                         h1 = v.h;
                         if (h1.j != null && v.i.j != null) {
                            uoc = p0;
                            solverVariab = solverVariab14;
                            uoc.f(solverVariab, h1.g);
                            solverVariab1 = solverVariab13;
                            uoc.f(solverVariab1, uConstraintW.f.i.g);
                            solverVariab16 = solverVariab12;
                            uoc.f(solverVariab16, uConstraintW.f.k.g);
                            v = uConstraintW.V;
                            if (v != null && (!b5 && b11)) {
                               i9 = 1;
                               if (uConstraintW.g[i9]) {
                                  b3 = 8;
                                  i10 = 0;
                                  uoc.h(uoc.q(v.M), solverVariab1, i10, b3);
                               }else {
                                  b3 = 8;
                                  i10 = 0;
                               }
                            }else {
                               b3 = 8;
                               i10 = 0;
                               i9 = 1;
                            }
                            oobject1 = null;
                         label_04cd :
                            mATCH_CONSTR = (uConstraintW.o == 2)? 0: oobject1;
                            if (mATCH_CONSTR != null && uConstraintW.m == null) {
                               b8 = (uConstraintW.U[i9] == uDimensionBe1 && uConstraintW instanceof d)? true: false;
                               if (b8) {
                                  uConstraintW6 = 0;
                               }
                               v = uConstraintW.V;
                               SolverVariable solverVariab17 = (v != null)? uoc.q(v.M): null;
                               v = uConstraintW.V;
                               SolverVariable solverVariab18 = (v != null)? uoc.q(v.K): null;
                               if (uConstraintW.g0 > null || uConstraintW.n0 == b3) {
                                  if (uConstraintW.N.f != null) {
                                     uoc.e(solverVariab16, solverVariab, this.q(), b3);
                                     uoc.e(solverVariab16, uoc.q(uConstraintW.N.f), i10, b3);
                                     if (b11) {
                                        uoc.h(solverVariab17, uoc.q(uConstraintW.M), i10, 5);
                                     }
                                     b14 = false;
                                  label_054a :
                                     b2 = uConstraintW.g[i9];
                                     v = uConstraintW.U;
                                     oobject1 = v[i9];
                                     f = uConstraintW.K;
                                     e = uConstraintW.M;
                                     uConstraintW1 = uConstraintW.b0;
                                     x = uConstraintW.i0;
                                     int i11 = uConstraintW.C[i9];
                                     p = uConstraintW.k0;
                                     boolean b15 = (v[0] == uDimensionBe)? true: false;
                                     solverVariab9 = solverVariab1;
                                     solverVariab19 = solverVariab;
                                     this.i(p0, false, b11, b12, b2, solverVariab18, solverVariab17, oobject1, b8, f, e, uConstraintW1, uConstraintW6, x, i11, p, i5, b15, b5, b4, b10, uConstraintW5, uConstraintW4, uConstraintW.v, uConstraintW.w, uConstraintW.x, b14);
                                  }else if(uConstraintW.n0 == b3){
                                     uoc.e(solverVariab16, solverVariab, i10, b3);
                                  }else {
                                     uoc.e(solverVariab16, solverVariab, this.q(), b3);
                                  }
                               }
                               b14 = i6;
                               goto label_054a ;
                            }else {
                               solverVariab9 = solverVariab1;
                               solverVariab19 = solverVariab;
                            }
                            if (b13) {
                               b1 = 8;
                               uConstraintW7 = this;
                               if (uConstraintW7.A == 1) {
                                  p0.k(solverVariab9, solverVariab19, solverVariab8, solverVariab15, uConstraintW7.B, b1);
                               }else {
                                  p0.k(solverVariab8, solverVariab15, solverVariab9, solverVariab19, uConstraintW7.B, 8);
                               }
                            }else {
                               uConstraintW7 = this;
                            }
                            if (uConstraintW7.Q.o()) {
                               p0.b(uConstraintW7, uConstraintW7.Q.j().h(), (float)Math.toRadians((double)(uConstraintW7.D + 90.00f)), uConstraintW7.Q.f());
                            }
                            uConstraintW7.l = false;
                            uConstraintW7.m = false;
                            return;
                         }
                      }
                      uoc = p0;
                      solverVariab16 = solverVariab12;
                      solverVariab1 = solverVariab13;
                      solverVariab = solverVariab14;
                      b3 = 8;
                      i10 = 0;
                      i9 = 1;
                   }else {
                      b3 = 8;
                      i10 = 0;
                      i9 = 1;
                      uConstraintW = this;
                      uoc = p0;
                      solverVariab16 = solverVariab12;
                      solverVariab1 = solverVariab13;
                      solverVariab = solverVariab14;
                   }
                   oobject1 = 1;
                   goto label_04cd ;
                }
             }
             i5 = 0;
             goto label_030d ;
          }
       }else {
          x = -1;
       }
       b7 = false;
       goto label_02ff ;
    }
    public boolean g0(){
       boolean b = (this.i != null && this.n0 != 8)? true: false;
       return b;
    }
    public boolean h(){
       boolean b = (this.n0 != 8)? true: false;
       return b;
    }
    public boolean h0(){
       boolean b = (this.l != null || (this.J.n() && this.L.n()))? true: false;
       return b;
    }
    public final void i(c p0,boolean p1,boolean p2,boolean p3,boolean p4,SolverVariable p5,SolverVariable p6,ConstraintWidget$DimensionBehaviour p7,boolean p8,ConstraintAnchor p9,ConstraintAnchor p10,int p11,int p12,int p13,int p14,float p15,boolean p16,boolean p17,boolean p18,boolean p19,boolean p20,int p21,int p22,int p23,int p24,float p25,boolean p26){
       ConstraintWidget uConstraintW1;
       int i7;
       SolverVariable solverVariab4;
       int i8;
       SolverVariable solverVariab5;
       SolverVariable solverVariab6;
       int i9;
       SolverVariable solverVariab7;
       int i10;
       SolverVariable solverVariab8;
       SolverVariable solverVariab9;
       SolverVariable solverVariab10;
       ConstraintAnchor f;
       int i11;
       ConstraintWidget v;
       ConstraintWidget v1;
       int i13;
       int i14;
       int i15;
       int i16;
       int i17;
       SolverVariable solverVariab11;
       ConstraintWidget uConstraintW2;
       SolverVariable solverVariab12;
       ConstraintWidget uConstraintW3;
       ConstraintWidget uConstraintW = this;
       c uoc = p0;
       int i = p13;
       int i1 = p14;
       int i2 = p23;
       int i3 = p24;
       SolverVariable solverVariab = uoc.q(p9);
       SolverVariable solverVariab1 = uoc.q(p10);
       SolverVariable solverVariab2 = uoc.q(p9.j());
       SolverVariable solverVariab3 = uoc.q(p10.j());
       if (c.w() != null) {
          b uob = c.w();
          uob.H = uob.H + 1;
       }
       boolean b = p9.o();
       boolean b1 = p10.o();
       int b2 = uConstraintW.Q.o();
       int i4 = (b1)? b + 1: b;
       if (b2) {
          i4 = i4 + 1;
       }
       int i5 = (p16)? 3: p21;
       int i6 = ConstraintWidget$a.b[p7.ordinal()];
       if (i6 != 1 && (i6 != 2 && i6 != 3)) {
          uConstraintW1 = 4;
          if (i6 != uConstraintW1) {
             i6 = i5;
          }else {
             i6 = i5;
             if (i6 != uConstraintW1) {
                i5 = 1;
             label_0082 :
                if (uConstraintW.n0 == 8) {
                   i7 = 0;
                   i5 = 0;
                }else {
                   i7 = p12;
                }
                if (p26) {
                   if (!b && (!b1 && !b2)) {
                      uoc.f(solverVariab, p11);
                   }else if(b && !b1){
                      solverVariab4 = solverVariab3;
                      i8 = 8;
                      uoc.e(solverVariab, solverVariab2, p9.f(), i8);
                   label_00b0 :
                      if (!i5) {
                         if (p8) {
                            uoc.e(solverVariab1, solverVariab, 0, 3);
                            i8 = 8;
                            if (i > 0) {
                               uoc.h(solverVariab1, solverVariab, i, i8);
                            }
                            if (i1 < Integer.MAX_VALUE) {
                               uoc.j(solverVariab1, solverVariab, i1, i8);
                            }
                         }else {
                            uoc.e(solverVariab1, solverVariab, i7, i8);
                         }
                      }else if(i4 != 2 && (!p16 && (i6 == 1 || !i6))){
                         i1 = Math.max(i2, i7);
                         if (i3 > 0) {
                            i1 = Math.min(i3, i1);
                         }
                         uoc.e(solverVariab1, solverVariab, i1, 8);
                         i5 = 0;
                      }else {
                         i1 = -2;
                         int i18 = (i2 == i1)? i7: i2;
                         i1 = (i3 == i1)? i7: i3;
                         if (i7 > 0 && i6 != 1) {
                            i7 = 0;
                         }
                         if (i18 > 0) {
                            uoc.h(solverVariab1, solverVariab, i18, 8);
                            i7 = Math.max(i7, i18);
                         }
                         if (i1 > 0) {
                            v = (p2 && i6 == 1)? 0: 1;
                            if (v) {
                               i2 = 8;
                               uoc.j(solverVariab1, solverVariab, i1, i2);
                            }else {
                               i2 = 8;
                            }
                            i7 = Math.min(i7, i1);
                         }else {
                            i2 = 8;
                         }
                         if (i6 == 1) {
                            if (p2) {
                               uoc.e(solverVariab1, solverVariab, i7, i2);
                            }else if(p18){
                               uoc.e(solverVariab1, solverVariab, i7, 5);
                               uoc.j(solverVariab1, solverVariab, i7, i2);
                            }else {
                               uoc.e(solverVariab1, solverVariab, i7, 5);
                               uoc.j(solverVariab1, solverVariab, i7, i2);
                            }
                            i3 = i1;
                            i2 = i18;
                         }else if(i6 == 2){
                            ConstraintAnchor$Type tOP = ConstraintAnchor$Type.TOP;
                            if (p9.k() == tOP || p9.k() == ConstraintAnchor$Type.BOTTOM) {
                               solverVariab10 = uoc.q(uConstraintW.V.p(tOP));
                               solverVariab9 = uoc.q(uConstraintW.V.p(ConstraintAnchor$Type.BOTTOM));
                            }else {
                               solverVariab10 = uoc.q(uConstraintW.V.p(ConstraintAnchor$Type.LEFT));
                               solverVariab9 = uoc.q(uConstraintW.V.p(ConstraintAnchor$Type.RIGHT));
                            }
                            b uob1 = p0.r();
                            b uob2 = uob1;
                            b uob3 = uob1;
                            solverVariab7 = solverVariab4;
                            solverVariab5 = solverVariab2;
                            i10 = i4;
                            solverVariab6 = solverVariab1;
                            uob2.n(solverVariab1, solverVariab, solverVariab9, solverVariab10, p25);
                            uoc.d(uob3);
                            i7 = p4;
                            i3 = i1;
                            i5 = i18;
                            i9 = 0;
                         label_01c9 :
                            if (p26) {
                               if (p18) {
                                  solverVariab8 = p6;
                                  solverVariab9 = solverVariab6;
                                  solverVariab10 = solverVariab;
                                  p12 = i7;
                                  i4 = i10;
                                  i8 = 2;
                                  solverVariab6 = p5;
                               }else if(!b && (!b1 && (!b2 || (b && !b1)))){
                                  if (!b && b1) {
                                     uoc.e(solverVariab6, solverVariab7, (- p10.f()), 8);
                                     if (p2) {
                                        if (uConstraintW.j != null && solverVariab.g != null) {
                                           v1 = uConstraintW.V;
                                           if (v1 != null) {
                                              if (p1) {
                                                 v1.m1(p9);
                                              }else {
                                                 v1.r1(p9);
                                              }
                                           }
                                        }
                                        uoc.h(solverVariab, p5, 0, 5);
                                     }
                                  }else {
                                     int i12 = p5;
                                     ConstraintAnchor uConstraintA = p9;
                                     i8 = 8;
                                     if (b && b1) {
                                        ConstraintAnchor d = uConstraintA.f.d;
                                        ConstraintAnchor uConstraintA1 = p10;
                                        ConstraintAnchor d1 = uConstraintA1.f.d;
                                        v = this.L();
                                        b2 = 6;
                                        if (i9) {
                                           if (!i6) {
                                              if (!i3 && !i5) {
                                                 if (solverVariab5.g != null && solverVariab7.g != null) {
                                                    uoc.e(solverVariab, solverVariab5, p9.f(), i8);
                                                    uoc.e(solverVariab6, solverVariab7, (- p10.f()), i8);
                                                    return;
                                                 }else {
                                                    solverVariab9 = 8;
                                                    i13 = 8;
                                                    i10 = 1;
                                                    i11 = 0;
                                                    i14 = 0;
                                                 }
                                              }else {
                                                 solverVariab9 = 5;
                                                 i13 = 5;
                                                 i10 = 0;
                                                 i11 = 1;
                                                 i14 = 1;
                                              }
                                              if (d instanceof a || d1 instanceof a) {
                                                 i13 = 4;
                                              }
                                              i8 = p6;
                                              i15 = i10;
                                              i10 = i13;
                                              i13 = i6;
                                              i6 = solverVariab9;
                                           label_035f :
                                              i3 = 6;
                                           label_0360 :
                                              if (i14 && (solverVariab5 == solverVariab7 && d != v)) {
                                                 i14 = 0;
                                                 i16 = 0;
                                              }else {
                                                 i16 = 1;
                                              }
                                              if (i11) {
                                                 if (!i9 && (!p17 && (!p19 && (solverVariab5 == i12 && solverVariab7 == i8)))) {
                                                    i16 = 8;
                                                    i17 = 0;
                                                 }else {
                                                    i11 = p2;
                                                    SolverVariable solverVariab13 = i6;
                                                    i17 = i16;
                                                    i16 = i3;
                                                 }
                                                 solverVariab11 = solverVariab6;
                                                 p12 = i7;
                                                 uConstraintA1 = d1;
                                                 uConstraintW2 = v;
                                                 i7 = 8;
                                                 solverVariab12 = solverVariab;
                                                 p0.c(solverVariab, solverVariab5, p9.f(), p15, solverVariab7, solverVariab11, p10.f(), i16);
                                                 solverVariab8 = 8;
                                                 i16 = i17;
                                              }else {
                                                 solverVariab11 = solverVariab6;
                                                 uConstraintW2 = v;
                                                 uConstraintA1 = d1;
                                                 solverVariab12 = solverVariab;
                                                 p12 = i7;
                                                 i7 = 8;
                                                 i11 = p2;
                                              }
                                              if (uConstraintW.n0 == i7 && !p10.m()) {
                                                 return;
                                              }else if(i14){
                                                 if (0 && (solverVariab5 != solverVariab7 && (!i9 && (d instanceof a || uConstraintA1 instanceof a)))) {
                                                    i6 = 6;
                                                 }
                                              label_03df :
                                                 solverVariab10 = solverVariab12;
                                                 uoc.h(solverVariab10, solverVariab5, p9.f(), i6);
                                                 solverVariab9 = solverVariab11;
                                                 uoc.j(solverVariab9, solverVariab7, (- p10.f()), i6);
                                              }else {
                                                 solverVariab9 = solverVariab11;
                                                 solverVariab10 = solverVariab12;
                                              }
                                              if (0 && (p20 && (!d instanceof a && !uConstraintA1 instanceof a))) {
                                                 i1 = 6;
                                                 i6 = 6;
                                                 i16 = 1;
                                              }else {
                                                 i1 = i10;
                                              }
                                              if (i16) {
                                                 if (i15 && (!p19 || p3)) {
                                                    uConstraintW3 = uConstraintW2;
                                                    if (d != uConstraintW3 && uConstraintA1 != uConstraintW3) {
                                                       b2 = i1;
                                                    }
                                                    if (d instanceof f || uConstraintA1 instanceof f) {
                                                       b2 = 5;
                                                    }
                                                    if (d instanceof a || uConstraintA1 instanceof a) {
                                                       b2 = 5;
                                                    }
                                                    i8 = (p19)? 5: b2;
                                                    i1 = Math.max(i8, i1);
                                                 }else {
                                                    uConstraintW3 = uConstraintW2;
                                                 }
                                                 if (0) {
                                                    i1 = Math.min(i6, i1);
                                                    if (p16 && (!p19 && (d == uConstraintW3 || uConstraintA1 == uConstraintW3))) {
                                                       i1 = 4;
                                                    }
                                                 }
                                                 uoc.e(solverVariab10, solverVariab5, p9.f(), i1);
                                                 uoc.e(solverVariab9, solverVariab7, (- p10.f()), i1);
                                              }
                                              if (0) {
                                                 solverVariab6 = p5;
                                                 i6 = (solverVariab6 == solverVariab5)? p9.f(): 0;
                                                 if (solverVariab5 != solverVariab6) {
                                                    uoc.h(solverVariab10, solverVariab6, i6, 5);
                                                 }
                                              }
                                              if (0 && (i9 && (!p13 && !i5))) {
                                                 if (i9 && i13 == 3) {
                                                    uoc.h(solverVariab9, solverVariab10, 0, i7);
                                                 label_048b :
                                                    if (i11 && p12) {
                                                       f = p10;
                                                       if (f.f != null) {
                                                          i7 = p10.f();
                                                          solverVariab8 = p6;
                                                       }else {
                                                          solverVariab8 = p6;
                                                          i7 = 0;
                                                       }
                                                       if (solverVariab7 != solverVariab8) {
                                                          if (uConstraintW.j != null && solverVariab9.g != null) {
                                                             v = uConstraintW.V;
                                                             if (v != null) {
                                                                if (p1) {
                                                                   v.l1(f);
                                                                }else {
                                                                   v.q1(f);
                                                                }
                                                                return;
                                                             }
                                                          }
                                                          uoc.h(solverVariab8, solverVariab9, i7, 5);
                                                       }
                                                    }
                                                 label_04bd :
                                                    return;
                                                 }else {
                                                    uoc.h(solverVariab9, solverVariab10, 0, 5);
                                                    goto label_048b ;
                                                 }
                                              }else {
                                                 goto label_048b ;
                                              }
                                           }else if(i6 == 1){
                                              i13 = i6;
                                              v1 = 4;
                                              i3 = 6;
                                              i8 = 0;
                                           }else if(i6 == 3){
                                              i13 = i6;
                                              if (uConstraintW.A == -1) {
                                                 if (p19) {
                                                    v1 = (p2)? 5: 4;
                                                 }else {
                                                    v1 = 8;
                                                 }
                                                 i3 = v1;
                                                 v1 = 5;
                                                 i8 = 1;
                                              }else if(p16){
                                                 i6 = p22;
                                                 v1 = (i6 == 2 || i6 == 1)? 1: 0;
                                                 if (!v1) {
                                                    v1 = 5;
                                                    solverVariab9 = 8;
                                                 }else {
                                                    v1 = 4;
                                                    solverVariab9 = 5;
                                                 }
                                                 i8 = p6;
                                                 i10 = v1;
                                                 i6 = solverVariab9;
                                                 i3 = 6;
                                                 i15 = 1;
                                              }else if(i3 > 0){
                                                 i8 = p6;
                                                 v1 = 1;
                                                 solverVariab9 = 1;
                                                 i15 = 1;
                                                 i10 = 5;
                                              }else if(!i3 && !i5){
                                                 if (!p19) {
                                                    i8 = p6;
                                                    v1 = 1;
                                                    solverVariab9 = 1;
                                                    i15 = 1;
                                                    i10 = 8;
                                                 }else if(d != v && d1 != v){
                                                    solverVariab8 = 4;
                                                 }else {
                                                    solverVariab8 = 5;
                                                 }
                                                 i8 = p6;
                                                 i3 = 6;
                                                 i15 = 1;
                                                 i10 = 4;
                                              }else {
                                                 i8 = p6;
                                                 v1 = 1;
                                                 solverVariab9 = 1;
                                                 i15 = 1;
                                              label_0358 :
                                                 i10 = 4;
                                              }
                                              i11 = 1;
                                              i14 = 1;
                                              goto label_0360 ;
                                           }else {
                                              i13 = i6;
                                              i8 = p6;
                                              v1 = 0;
                                              solverVariab9 = 0;
                                           label_0356 :
                                              i15 = 0;
                                              goto label_0358 ;
                                           }
                                           i10 = v1;
                                           i15 = i8;
                                           solverVariab8 = 8;
                                           i11 = 1;
                                           i14 = 1;
                                           i8 = p6;
                                           goto label_0360 ;
                                        }else {
                                           i13 = i6;
                                           if (solverVariab5.g != null && solverVariab7.g != null) {
                                              p0.c(solverVariab, solverVariab5, p9.f(), p15, solverVariab7, solverVariab6, p10.f(), 8);
                                              if (p2 && i7) {
                                                 if (uConstraintA1.f != null) {
                                                    i7 = p10.f();
                                                    solverVariab3 = p6;
                                                 }else {
                                                    solverVariab3 = p6;
                                                    i7 = 0;
                                                 }
                                                 if (solverVariab7 != solverVariab3) {
                                                    uoc.h(solverVariab3, solverVariab6, i7, 5);
                                                 }
                                              }
                                           label_0351 :
                                              return;
                                           }else {
                                              i8 = p6;
                                              v1 = 1;
                                              solverVariab9 = 1;
                                              goto label_0356 ;
                                           }
                                        }
                                        i11 = v1;
                                        i14 = solverVariab9;
                                        solverVariab8 = 5;
                                        goto label_035f ;
                                     }
                                  }
                               }
                               solverVariab9 = solverVariab6;
                               p12 = i7;
                               i11 = p2;
                               goto label_048b ;
                            }else {
                               solverVariab8 = p6;
                               solverVariab9 = solverVariab6;
                               solverVariab10 = solverVariab;
                               p12 = i7;
                               i7 = 8;
                               solverVariab6 = p5;
                               i4 = i10;
                               i8 = 2;
                            }
                            if (i4 < i8 && (p2 && p12)) {
                               uoc.h(solverVariab10, solverVariab6, 0, 8);
                               i8 = (p1 || uConstraintW.N.f == null)? 1: 0;
                               if (!p1) {
                                  f = uConstraintW.N.f;
                                  if (f != null) {
                                     f = f.d;
                                     if (f.Y - null) {
                                        ConstraintWidget u = f.U;
                                        ConstraintWidget$DimensionBehaviour mATCH_CONSTR = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                                        if (u[0] == mATCH_CONSTR) {
                                           i4 = 1;
                                           if (u[i4] != mATCH_CONSTR) {
                                           }
                                        }else {
                                        }
                                     }else {
                                     }
                                  }else {
                                  label_0503 :
                                     i4 = i8;
                                  }
                               }else {
                                  goto label_0503 ;
                               }
                               if (i4) {
                                  uoc.h(solverVariab8, solverVariab9, 0, 8);
                               }
                            }
                         label_050a :
                            return;
                         }else {
                            solverVariab5 = solverVariab2;
                            solverVariab6 = solverVariab1;
                            solverVariab7 = solverVariab4;
                            i10 = i4;
                            i3 = i1;
                            i9 = i5;
                            i7 = 1;
                            i5 = i18;
                            goto label_01c9 ;
                         }
                      }
                      i7 = p4;
                      solverVariab5 = solverVariab2;
                      solverVariab6 = solverVariab1;
                      i9 = i5;
                      solverVariab7 = solverVariab4;
                      i5 = i2;
                      i10 = i4;
                      goto label_01c9 ;
                   }
                }
                solverVariab4 = solverVariab3;
                i8 = 8;
                goto label_00b0 ;
             }
          }
       }else {
          i6 = i5;
          uConstraintW1 = 4;
       }
       i5 = 0;
       goto label_0082 ;
    }
    public boolean i0(){
       boolean b = (this.m != null || (this.K.n() && this.M.n()))? true: false;
       return b;
    }
    public void j(ConstraintAnchor$Type p0,ConstraintWidget p1,ConstraintAnchor$Type p2,int p3){
       ConstraintAnchor uConstraintA;
       ConstraintAnchor$Type tOP;
       ConstraintAnchor uConstraintA2;
       ConstraintAnchor uConstraintA4;
       ConstraintAnchor uConstraintA5;
       ConstraintAnchor uConstraintA6;
       ConstraintAnchor$Type cENTER = ConstraintAnchor$Type.CENTER;
       int i = 0;
       if (p0 == cENTER) {
          if (p2 == cENTER) {
             p0 = ConstraintAnchor$Type.LEFT;
             uConstraintA = this.p(p0);
             ConstraintAnchor$Type rIGHT = ConstraintAnchor$Type.RIGHT;
             ConstraintAnchor uConstraintA1 = this.p(rIGHT);
             tOP = ConstraintAnchor$Type.TOP;
             uConstraintA2 = this.p(tOP);
             ConstraintAnchor$Type bOTTOM = ConstraintAnchor$Type.BOTTOM;
             ConstraintAnchor uConstraintA3 = this.p(bOTTOM);
             int i1 = 1;
             if (uConstraintA == null || (uConstraintA.o() || (uConstraintA1 != null && uConstraintA1.o()))) {
                uConstraintA4 = null;
             }else {
                this.j(p0, p1, p0, i);
                this.j(rIGHT, p1, rIGHT, i);
                uConstraintA4 = 1;
             }
             if (uConstraintA2 == null || (uConstraintA2.o() || (uConstraintA3 != null && uConstraintA3.o()))) {
                i1 = 0;
             }else {
                this.j(tOP, p1, tOP, i);
                this.j(bOTTOM, p1, bOTTOM, i);
             }
             if (uConstraintA4 && i1) {
                this.p(cENTER).a(p1.p(cENTER), i);
             }else if(uConstraintA4 != null){
                uConstraintA4 = ConstraintAnchor$Type.CENTER_X;
                uConstraintA = this.p(uConstraintA4);
                uConstraintA.a(p1.p(uConstraintA4), i);
             }else if(i1){
                uConstraintA4 = ConstraintAnchor$Type.CENTER_Y;
                uConstraintA = this.p(uConstraintA4);
                uConstraintA.a(p1.p(uConstraintA4), i);
             }
          }else {
             p0 = ConstraintAnchor$Type.LEFT;
             if (p2 == p0 || p2 == ConstraintAnchor$Type.RIGHT) {
                this.j(p0, p1, p2, i);
                this.j(ConstraintAnchor$Type.RIGHT, p1, p2, i);
                this.p(cENTER).a(p1.p(p2), i);
             }else {
                p0 = ConstraintAnchor$Type.TOP;
                if (p2 == p0 || p2 == ConstraintAnchor$Type.BOTTOM) {
                   this.j(p0, p1, p2, i);
                   this.j(ConstraintAnchor$Type.BOTTOM, p1, p2, i);
                   this.p(cENTER).a(p1.p(p2), i);
                }
             }
          }
       }else {
          ConstraintAnchor$Type cENTER_X = ConstraintAnchor$Type.CENTER_X;
          if (p0 == cENTER_X) {
             tOP = ConstraintAnchor$Type.LEFT;
             if (p2 == tOP || p2 == ConstraintAnchor$Type.RIGHT) {
                uConstraintA5 = p1.p(p2);
                this.p(tOP).a(uConstraintA5, i);
                this.p(ConstraintAnchor$Type.RIGHT).a(uConstraintA5, i);
                this.p(cENTER_X).a(uConstraintA5, i);
             }
          }
          tOP = ConstraintAnchor$Type.CENTER_Y;
          if (p0 == tOP) {
             ConstraintAnchor$Type tOP1 = ConstraintAnchor$Type.TOP;
             if (p2 == tOP1 || p2 == ConstraintAnchor$Type.BOTTOM) {
                uConstraintA4 = p1.p(p2);
                this.p(tOP1).a(uConstraintA4, i);
                this.p(ConstraintAnchor$Type.BOTTOM).a(uConstraintA4, i);
                this.p(tOP).a(uConstraintA4, i);
             }
          }
          if (p0 == cENTER_X && p2 == cENTER_X) {
             p0 = ConstraintAnchor$Type.LEFT;
             uConstraintA6 = this.p(p0);
             uConstraintA6.a(p1.p(p0), i);
             p0 = ConstraintAnchor$Type.RIGHT;
             uConstraintA6 = this.p(p0);
             uConstraintA6.a(p1.p(p0), i);
             this.p(cENTER_X).a(p1.p(p2), i);
          }else if(p0 == tOP && p2 == tOP){
             p0 = ConstraintAnchor$Type.TOP;
             uConstraintA6 = this.p(p0);
             uConstraintA6.a(p1.p(p0), i);
             p0 = ConstraintAnchor$Type.BOTTOM;
             uConstraintA6 = this.p(p0);
             uConstraintA6.a(p1.p(p0), i);
             this.p(tOP).a(p1.p(p2), i);
          }else {
             uConstraintA2 = this.p(p0);
             uConstraintA5 = p1.p(p2);
             if (uConstraintA2.p(uConstraintA5)) {
                p2 = ConstraintAnchor$Type.BASELINE;
                if (p0 == p2) {
                   uConstraintA4 = this.p(ConstraintAnchor$Type.TOP);
                   uConstraintA = this.p(ConstraintAnchor$Type.BOTTOM);
                   if (uConstraintA4 != null) {
                      uConstraintA4.q();
                   }
                   if (uConstraintA != null) {
                      uConstraintA.q();
                   }
                   p3 = 0;
                }else if(p0 == ConstraintAnchor$Type.TOP || p0 == ConstraintAnchor$Type.BOTTOM){
                   uConstraintA = this.p(p2);
                   if (uConstraintA != null) {
                      uConstraintA.q();
                   }
                   uConstraintA = this.p(cENTER);
                   if (uConstraintA.j() != uConstraintA5) {
                      uConstraintA.q();
                   }
                   uConstraintA4 = this.p(p0).g();
                   uConstraintA = this.p(tOP);
                   if (uConstraintA.o()) {
                      uConstraintA4.q();
                      uConstraintA.q();
                   }
                }else if(p0 == ConstraintAnchor$Type.LEFT || p0 == ConstraintAnchor$Type.RIGHT){
                   uConstraintA = this.p(cENTER);
                   if (uConstraintA.j() != uConstraintA5) {
                      uConstraintA.q();
                   }
                   uConstraintA4 = this.p(p0).g();
                   uConstraintA = this.p(cENTER_X);
                   if (uConstraintA.o()) {
                      uConstraintA4.q();
                      uConstraintA.q();
                   }
                }
                uConstraintA2.a(uConstraintA5, p3);
             }
          }
       }
    label_01f9 :
       return;
    }
    public boolean j0(){
       ConstraintWidget tU = this.U;
       int i = 0;
       ConstraintWidget$DimensionBehaviour mATCH_CONSTR = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
       if (tU[i] == mATCH_CONSTR && tU[1] == mATCH_CONSTR) {
          i = true;
       }
       return i;
    }
    public void k(ConstraintAnchor p0,ConstraintAnchor p1,int p2){
       if (p0.h() == this) {
          this.j(p0.k(), p1.h(), p1.k(), p2);
       }
       return;
    }
    public void k0(){
       this.J.q();
       this.K.q();
       this.L.q();
       this.M.q();
       this.N.q();
       this.O.q();
       this.P.q();
       this.Q.q();
       this.V = null;
       this.D = 0;
       this.W = 0;
       this.X = 0;
       this.Y = 0;
       this.Z = -1;
       this.a0 = 0;
       this.b0 = 0;
       this.e0 = 0;
       this.f0 = 0;
       this.g0 = 0;
       this.h0 = 0;
       this.i0 = 0;
       float m0 = ConstraintWidget.M0;
       this.j0 = m0;
       this.k0 = m0;
       ConstraintWidget tU = this.U;
       ConstraintWidget$DimensionBehaviour fIXED = ConstraintWidget$DimensionBehaviour.FIXED;
       tU[0] = fIXED;
       tU[1] = fIXED;
       this.l0 = null;
       this.m0 = 0;
       this.n0 = 0;
       this.p0 = null;
       this.y0 = false;
       this.z0 = false;
       this.B0 = 0;
       this.C0 = 0;
       this.D0 = false;
       this.E0 = false;
       ConstraintWidget tF0 = this.F0;
       tF0[0] = 0xbf800000;
       tF0[1] = 0xbf800000;
       this.n = -1;
       this.o = -1;
       tF0 = this.C;
       tF0[0] = Integer.MAX_VALUE;
       tF0[1] = Integer.MAX_VALUE;
       this.p = 0;
       this.q = 0;
       this.u = 0x3f800000;
       this.x = 0x3f800000;
       this.t = Integer.MAX_VALUE;
       this.w = Integer.MAX_VALUE;
       this.s = 0;
       this.v = 0;
       this.h = false;
       this.A = -1;
       this.B = 0x3f800000;
       this.A0 = false;
       tF0 = this.g;
       tF0[0] = 1;
       tF0[1] = 1;
       this.G = false;
       tF0 = this.T;
       tF0[0] = 0;
       tF0[1] = 0;
       this.i = true;
    }
    public void l(ConstraintWidget p0,float p1,int p2){
       ConstraintAnchor$Type cENTER = ConstraintAnchor$Type.CENTER;
       this.a0(cENTER, p0, cENTER, p2, 0);
       this.D = p1;
    }
    public void l0(){
       ConstraintWidget uConstraintW = this.L();
       if (uConstraintW != null && uConstraintW instanceof d) {
          Objects.requireNonNull(this.L());
       }
       int i1 = this.S.size();
       for (int i = 0; i < i1; i = i + 1) {
          this.S.get(i).q();
       }
       return;
    }
    public void m(ConstraintWidget p0,HashMap p1){
       this.n = p0.n;
       this.o = p0.o;
       this.p = p0.p;
       this.q = p0.q;
       ConstraintWidget tr = this.r;
       ConstraintWidget r = p0.r;
       int i = 0;
       tr[i] = r[i];
       tr[1] = r[1];
       this.s = p0.s;
       this.t = p0.t;
       this.v = p0.v;
       this.w = p0.w;
       this.x = p0.x;
       this.y = p0.y;
       this.z = p0.z;
       this.A = p0.A;
       this.B = p0.B;
       tr = p0.C;
       this.C = Arrays.copyOf(tr, tr.length);
       this.D = p0.D;
       this.E = p0.E;
       this.F = p0.F;
       this.J.q();
       this.K.q();
       this.L.q();
       this.M.q();
       this.N.q();
       this.O.q();
       this.P.q();
       this.Q.q();
       this.U = Arrays.copyOf(this.U, 2);
       r = null;
       tr = (this.V == null)? r: p1.get(p0.V);
       this.V = tr;
       this.W = p0.W;
       this.X = p0.X;
       this.Y = p0.Y;
       this.Z = p0.Z;
       this.a0 = p0.a0;
       this.b0 = p0.b0;
       this.c0 = p0.c0;
       this.d0 = p0.d0;
       this.e0 = p0.e0;
       this.f0 = p0.f0;
       this.g0 = p0.g0;
       this.h0 = p0.h0;
       this.i0 = p0.i0;
       this.j0 = p0.j0;
       this.k0 = p0.k0;
       this.l0 = p0.l0;
       this.m0 = p0.m0;
       this.n0 = p0.n0;
       this.o0 = p0.o0;
       this.p0 = p0.p0;
       this.q0 = p0.q0;
       this.r0 = p0.r0;
       this.s0 = p0.s0;
       this.t0 = p0.t0;
       this.u0 = p0.u0;
       this.v0 = p0.v0;
       this.w0 = p0.w0;
       this.x0 = p0.x0;
       this.y0 = p0.y0;
       this.z0 = p0.z0;
       this.B0 = p0.B0;
       this.C0 = p0.C0;
       this.D0 = p0.D0;
       this.E0 = p0.E0;
       tr = this.F0;
       ConstraintWidget f0 = p0.F0;
       tr[i] = f0[i];
       tr[1] = f0[1];
       tr = this.G0;
       f0 = p0.G0;
       tr[i] = f0[i];
       tr[1] = f0[1];
       tr = this.H0;
       f0 = p0.H0;
       tr[i] = f0[i];
       tr[1] = f0[1];
       tr = p0.I0;
       tr = (tr == null)? r: p1.get(tr);
       this.I0 = tr;
       p0 = p0.J0;
       if (p0 != null) {
          r = p1.get(p0);
       }
       this.J0 = r;
       return;
    }
    public void m0(){
       boolean b = false;
       this.l = b;
       this.m = b;
       int i = this.S.size();
       for (; b < i; b = b + 1) {
          this.S.get(b).r();
       }
       return;
    }
    public void n(c p0){
       p0.q(this.J);
       p0.q(this.K);
       p0.q(this.L);
       p0.q(this.M);
       if (this.g0 > null) {
          p0.q(this.N);
       }
       return;
    }
    public void n0(a p0){
       this.J.s(p0);
       this.K.s(p0);
       this.L.s(p0);
       this.M.s(p0);
       this.N.s(p0);
       this.Q.s(p0);
       this.O.s(p0);
       this.P.s(p0);
    }
    public void o(){
       if (this.e == null) {
          this.e = new c(this);
       }
       if (this.f == null) {
          this.f = new d(this);
       }
       return;
    }
    public void o0(int p0){
       this.g0 = p0;
       boolean b = (p0 > 0)? true: false;
       this.E = b;
       return;
    }
    public ConstraintAnchor p(ConstraintAnchor$Type p0){
       switch (ConstraintWidget$a.a[p0.ordinal()]){
           case 1:
             return this.J;
           case 2:
             return this.K;
           case 3:
             return this.L;
           case 4:
             return this.M;
           case 5:
             return this.N;
           case 6:
             return this.Q;
           case 7:
             return this.O;
           case 8:
             return this.P;
           case 9:
             return null;
           default:
             throw new AssertionError(p0.name());
       }
    }
    public void p0(Object p0){
       this.l0 = p0;
    }
    public int q(){
       return this.g0;
    }
    public void q0(String p0){
       this.o0 = p0;
    }
    public float r(int p0){
       if (!p0) {
          return this.j0;
       }
       if (p0 == 1) {
          return this.k0;
       }
       return 0xbf800000;
    }
    public void r0(String p0){
       float f2;
       float f = 0;
       if (p0 == null || !p0.length()) {
          this.Y = f;
          return;
       }else {
          int i = -1;
          int i1 = p0.length();
          int i2 = p0.indexOf(44);
          int i3 = 0;
          if (i2 > 0 && i2 < (i1 - 1)) {
             String str = p0.substring(i3, i2);
             if (str.equalsIgnoreCase("W")) {
                i = 0;
             }else if(str.equalsIgnoreCase("H")){
                i = 1;
             }
             i3 = i2 + 1;
          }
          try{
             i2 = p0.indexOf(58);
             if (i2 >= 0 && i2 < (i1 - 1)) {
                String str1 = p0.substring(i3, i2);
                p0 = p0.substring((i2 + 1));
                if (str1.length() > 0 && p0.length() > 0) {
                   float f1 = Float.parseFloat(str1);
                   f2 = Float.parseFloat(p0);
                   if (f1 - f > 0 && f2 - f > 0) {
                      f2 = (i == 1)? Math.abs((f2 / f1)): Math.abs((f1 / f2));
                   }else {
                   label_0084 :
                      f2 = 0;
                   }
                }else {
                   goto label_0084 ;
                }
             }else {
                p0 = p0.substring(i3);
                if (p0.length() > 0) {
                   f2 = Float.parseFloat(p0);
                }else {
                   goto label_0084 ;
                }
             }
          }catch(java.lang.NumberFormatException e0){
          }
          if (f2 - e0 > 0) {
             this.Y = f2;
             this.Z = i;
          }
          return;
       }
    }
    public int s(){
       return (this.W() + this.X);
    }
    public void s0(int p0){
       if (this.E == null) {
          return;
       }
       int i = p0 - this.g0;
       int i1 = this.X + i;
       this.b0 = i;
       this.K.t(i);
       this.M.t(i1);
       this.N.t(p0);
       this.m = true;
       return;
    }
    public Object t(){
       return this.l0;
    }
    public void t0(int p0,int p1){
       this.J.t(p0);
       this.L.t(p1);
       this.a0 = p0;
       this.W = p1 - p0;
       this.l = true;
    }
    public String toString(){
       StringBuilder str = "";
       String str1 = "";
       String str2 = (this.p0 != null)? "type: "+this.p0+" ": str1;
       str = str+str2;
       if (this.o0 != null) {
          str1 = "id: "+this.o0+" ";
       }
       return str+str1+"\("+this.a0+", "+this.b0+"\) - \("+this.W+" x "+this.X+"\)";
    }
    public String u(){
       return this.o0;
    }
    public void u0(int p0){
       this.J.t(p0);
       this.a0 = p0;
    }
    public ConstraintWidget$DimensionBehaviour v(int p0){
       if (!p0) {
          return this.B();
       }
       if (p0 == 1) {
          return this.R();
       }
       return null;
    }
    public void v0(int p0){
       this.K.t(p0);
       this.b0 = p0;
    }
    public float w(){
       return this.Y;
    }
    public void w0(int p0,int p1){
       this.K.t(p0);
       this.M.t(p1);
       this.b0 = p0;
       this.X = p1 - p0;
       if (this.E != null) {
          this.N.t((p0 + this.g0));
       }
       this.m = true;
       return;
    }
    public int x(){
       return this.Z;
    }
    public void x0(int p0,int p1,int p2,int p3){
       ConstraintWidget uConstraintW;
       ConstraintWidget uConstraintW1;
       p2 = p2 - p0;
       p3 = p3 - p1;
       this.a0 = p0;
       this.b0 = p1;
       p1 = 0;
       if (this.n0 == 8) {
          this.W = p1;
          this.X = p1;
          return;
       }else {
          ConstraintWidget tU = this.U;
          ConstraintWidget$DimensionBehaviour fIXED = ConstraintWidget$DimensionBehaviour.FIXED;
          if (tU[p1] == fIXED) {
             ConstraintWidget tW = this.W;
             if (p2 < tW) {
                uConstraintW = tW;
             }
          }
          if (tU[1] == fIXED) {
             tU = this.X;
             if (p3 < tU) {
                uConstraintW1 = tU;
             }
          }
          this.W = uConstraintW;
          this.X = uConstraintW1;
          tU = this.i0;
          if (uConstraintW1 < tU) {
             this.X = tU;
          }
          tU = this.h0;
          if (uConstraintW < tU) {
             this.W = tU;
          }
          return;
       }
    }
    public int y(){
       if (this.n0 == 8) {
          return 0;
       }
       return this.X;
    }
    public void y0(boolean p0){
       this.E = p0;
    }
    public float z(){
       return this.j0;
    }
    public void z0(int p0){
       this.X = p0;
       ConstraintWidget ti0 = this.i0;
       if (p0 < ti0) {
          this.X = ti0;
       }
       return;
    }
}
