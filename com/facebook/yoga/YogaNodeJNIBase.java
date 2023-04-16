package com.facebook.yoga.YogaNodeJNIBase;
import java.lang.Cloneable;
import lg.g;
import com.facebook.yoga.YogaNative;
import java.lang.IllegalStateException;
import java.lang.String;
import lg.b;
import lg.c;
import lg.i;
import java.lang.Float;
import com.facebook.yoga.YogaUnit;
import com.facebook.yoga.YogaEdge;
import lg.e;
import com.facebook.yoga.YogaOverflow;
import com.facebook.yoga.YogaPositionType;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaWrap;
import java.lang.Object;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import com.facebook.yoga.YogaAlign;
import lg.a;
import java.lang.RuntimeException;
import java.lang.Throwable;
import com.facebook.yoga.YogaDisplay;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaNodeJNIBase$a;
import java.lang.Enum;
import java.lang.IllegalArgumentException;

public abstract class YogaNodeJNIBase extends g implements Cloneable	// class@00145d
{
    public float[] arr;
    public YogaNodeJNIBase b;
    public List c;
    public e d;
    public a e;
    public long f;
    public Object g;
    public boolean h;
    public int mLayoutDirection;

    public void YogaNodeJNIBase(){
       super(YogaNative.jni_YGNodeNewJNI());
    }
    public void YogaNodeJNIBase(long p0){
       super();
       this.arr = null;
       this.mLayoutDirection = 0;
       this.h = true;
       if (!p0) {
          throw new IllegalStateException("Failed to allocate native memory");
       }
       this.f = p0;
       return;
    }
    public void YogaNodeJNIBase(b p0){
       super(YogaNative.jni_YGNodeNewWithConfigJNI(p0.b));
    }
    public static i T0(long p0){
       return new i(Float.intBitsToFloat((int)p0), YogaUnit.fromInt((int)(p0 >> 32)));
    }
    public float A(){
       YogaNodeJNIBase tarr = this.arr;
       int i = (tarr != null)? tarr[1]: 0;
       return i;
    }
    public void A0(float p0){
       YogaNative.jni_YGNodeStyleSetMaxHeightPercentJNI(this.f, p0);
    }
    public float B(){
       YogaNodeJNIBase tarr = this.arr;
       int i = (tarr != null)? tarr[3]: 0;
       return i;
    }
    public void B0(float p0){
       YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.f, p0);
    }
    public float C(){
       YogaNodeJNIBase tarr = this.arr;
       int i = (tarr != null)? tarr[4]: 0;
       return i;
    }
    public void C0(float p0){
       YogaNative.jni_YGNodeStyleSetMaxWidthPercentJNI(this.f, p0);
    }
    public i D(YogaEdge p0){
       return YogaNodeJNIBase.T0(YogaNative.jni_YGNodeStyleGetMarginJNI(this.f, p0.intValue()));
    }
    public void D0(e p0){
       this.d = p0;
       YogaNodeJNIBase tf = this.f;
       boolean b = (p0 != null)? true: false;
       YogaNative.jni_YGNodeSetHasMeasureFuncJNI(tf, b);
       return;
    }
    public i E(){
       return YogaNodeJNIBase.T0(YogaNative.jni_YGNodeStyleGetMaxHeightJNI(this.f));
    }
    public void E0(float p0){
       YogaNative.jni_YGNodeStyleSetMinHeightJNI(this.f, p0);
    }
    public i F(){
       return YogaNodeJNIBase.T0(YogaNative.jni_YGNodeStyleGetMaxWidthJNI(this.f));
    }
    public void F0(float p0){
       YogaNative.jni_YGNodeStyleSetMinHeightPercentJNI(this.f, p0);
    }
    public i G(){
       return YogaNodeJNIBase.T0(YogaNative.jni_YGNodeStyleGetMinHeightJNI(this.f));
    }
    public void G0(float p0){
       YogaNative.jni_YGNodeStyleSetMinWidthJNI(this.f, p0);
    }
    public i H(){
       return YogaNodeJNIBase.T0(YogaNative.jni_YGNodeStyleGetMinWidthJNI(this.f));
    }
    public void H0(float p0){
       YogaNative.jni_YGNodeStyleSetMinWidthPercentJNI(this.f, p0);
    }
    public YogaOverflow I(){
       return YogaOverflow.fromInt(YogaNative.jni_YGNodeStyleGetOverflowJNI(this.f));
    }
    public void I0(YogaOverflow p0){
       YogaNative.jni_YGNodeStyleSetOverflowJNI(this.f, p0.intValue());
    }
    public g J(){
       return this.S0();
    }
    public void J0(YogaEdge p0,float p1){
       YogaNative.jni_YGNodeStyleSetPaddingJNI(this.f, p0.intValue(), p1);
    }
    public i K(YogaEdge p0){
       return YogaNodeJNIBase.T0(YogaNative.jni_YGNodeStyleGetPaddingJNI(this.f, p0.intValue()));
    }
    public void K0(YogaEdge p0,float p1){
       YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(this.f, p0.intValue(), p1);
    }
    public g L(){
       return this.S0();
    }
    public void L0(YogaEdge p0,float p1){
       YogaNative.jni_YGNodeStyleSetPositionJNI(this.f, p0.intValue(), p1);
    }
    public i M(YogaEdge p0){
       return YogaNodeJNIBase.T0(YogaNative.jni_YGNodeStyleGetPositionJNI(this.f, p0.intValue()));
    }
    public void M0(YogaEdge p0,float p1){
       YogaNative.jni_YGNodeStyleSetPositionPercentJNI(this.f, p0.intValue(), p1);
    }
    public YogaPositionType N(){
       return YogaPositionType.fromInt(YogaNative.jni_YGNodeStyleGetPositionTypeJNI(this.f));
    }
    public void N0(YogaPositionType p0){
       YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.f, p0.intValue());
    }
    public YogaDirection O(){
       return YogaDirection.fromInt(YogaNative.jni_YGNodeStyleGetDirectionJNI(this.f));
    }
    public void O0(float p0){
       YogaNative.jni_YGNodeStyleSetWidthJNI(this.f, p0);
    }
    public i P(){
       return YogaNodeJNIBase.T0(YogaNative.jni_YGNodeStyleGetWidthJNI(this.f));
    }
    public void P0(){
       YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.f);
    }
    public YogaWrap Q(){
       return YogaWrap.fromInt(YogaNative.jni_YGNodeStyleGetFlexWrapJNI(this.f));
    }
    public void Q0(float p0){
       YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.f, p0);
    }
    public boolean R(){
       YogaNodeJNIBase tarr = this.arr;
       if (tarr == null) {
          return this.h;
       }
       int i = 0;
       if (((int)tarr[i] & 16) == 16) {
          i = true;
       }
       return i;
    }
    public void R0(YogaWrap p0){
       YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.f, p0.intValue());
    }
    public int S(g p0){
       YogaNodeJNIBase tc = this.c;
       int i = (tc == null)? -1: tc.indexOf(p0);
       return i;
    }
    public YogaNodeJNIBase S0(){
       return this.b;
    }
    public boolean T(){
       boolean b = (this.e != null)? true: false;
       return b;
    }
    public boolean U(){
       return YogaNative.jni_YGNodeIsDirtyJNI(this.f);
    }
    public boolean V(){
       boolean b = (this.d != null)? true: false;
       return b;
    }
    public boolean W(){
       return YogaNative.jni_YGNodeIsReferenceBaselineJNI(this.f);
    }
    public void X(){
       YogaNodeJNIBase tarr = this.arr;
       if (tarr != null) {
          tarr[0] = (float)((int)tarr[0] & 0xef);
       }
       this.h = false;
       return;
    }
    public void Y(){
       YogaNative.jni_YGNodePrintJNI(this.f);
    }
    public g Z(int p0){
       YogaNodeJNIBase tc = this.c;
       if (tc == null) {
          throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
       }
       YogaNodeJNIBase yogaNodeJNIB = tc.remove(p0);
       yogaNodeJNIB.b = null;
       YogaNative.jni_YGNodeRemoveChildJNI(this.f, yogaNodeJNIB.f);
       return yogaNodeJNIB;
    }
    public void a(g p0,int p1){
       if (p0.b != null) {
          throw new IllegalStateException("Child already has a parent, it must be removed first.");
       }
       if (this.c == null) {
          this.c = new ArrayList(4);
       }
       this.c.add(p1, p0);
       p0.b = this;
       YogaNative.jni_YGNodeInsertChildJNI(this.f, p0.f, p1);
       return;
    }
    public void a0(){
       this.d = null;
       this.e = null;
       this.g = null;
       this.arr = null;
       this.h = true;
       this.mLayoutDirection = 0;
       YogaNative.jni_YGNodeResetJNI(this.f);
    }
    public void b(float p0,float p1){
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(this);
       int i = 0;
       int i1 = 0;
       while (i1 < uArrayList.size()) {
          YogaNodeJNIBase c = uArrayList.get(i1).c;
          if (c != null) {
             uArrayList.addAll(c);
          }
          i1 = i1 + 1;
       }
       YogaNodeJNIBase[] yogaNodeJNIB = new YogaNodeJNIBase[uArrayList.size()];
       Object[] objArray = uArrayList.toArray(yogaNodeJNIB);
       long[] olongArray = new long[objArray.length];
       for (; i < objArray.length; i = i + 1) {
          olongArray[i] = objArray[i].f;
       }
       YogaNative.jni_YGNodeCalculateLayoutJNI(this.f, p0, p1, olongArray, objArray);
       return;
    }
    public void b0(YogaAlign p0){
       YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.f, p0.intValue());
    }
    public final float baseline(float p0,float p1){
       return this.e.a(this, p0, p1);
    }
    public g c(){
       try{
          YogaNodeJNIBase yogaNodeJNIB = super.clone();
          long l = YogaNative.jni_YGNodeCloneJNI(this.f);
          yogaNodeJNIB.b = null;
          yogaNodeJNIB.f = l;
          yogaNodeJNIB.c = null;
          YogaNative.jni_YGNodeClearChildrenJNI(l);
          return yogaNodeJNIB;
       }catch(java.lang.CloneNotSupportedException e0){
          throw new RuntimeException(e0);
       }
    }
    public void c0(YogaAlign p0){
       YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.f, p0.intValue());
    }
    public void d(g p0){
       YogaNative.jni_YGNodeCopyStyleJNI(this.f, p0.f);
    }
    public void d0(YogaAlign p0){
       YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.f, p0.intValue());
    }
    public void e(){
       YogaNative.jni_YGNodeMarkDirtyJNI(this.f);
    }
    public void e0(float p0){
       YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.f, p0);
    }
    public YogaAlign f(){
       return YogaAlign.fromInt(YogaNative.jni_YGNodeStyleGetAlignContentJNI(this.f));
    }
    public void f0(a p0){
       this.e = p0;
       YogaNodeJNIBase tf = this.f;
       boolean b = (p0 != null)? true: false;
       YogaNative.jni_YGNodeSetHasBaselineFuncJNI(tf, b);
       return;
    }
    public YogaAlign g(){
       return YogaAlign.fromInt(YogaNative.jni_YGNodeStyleGetAlignItemsJNI(this.f));
    }
    public void g0(YogaEdge p0,float p1){
       YogaNative.jni_YGNodeStyleSetBorderJNI(this.f, p0.intValue(), p1);
    }
    public YogaAlign h(){
       return YogaAlign.fromInt(YogaNative.jni_YGNodeStyleGetAlignSelfJNI(this.f));
    }
    public void h0(Object p0){
       this.g = p0;
    }
    public float i(){
       return YogaNative.jni_YGNodeStyleGetAspectRatioJNI(this.f);
    }
    public void i0(YogaDirection p0){
       YogaNative.jni_YGNodeStyleSetDirectionJNI(this.f, p0.intValue());
    }
    public float j(YogaEdge p0){
       return YogaNative.jni_YGNodeStyleGetBorderJNI(this.f, p0.intValue());
    }
    public void j0(YogaDisplay p0){
       YogaNative.jni_YGNodeStyleSetDisplayJNI(this.f, p0.intValue());
    }
    public g k(int p0){
       YogaNodeJNIBase tc = this.c;
       if (tc != null) {
          return tc.get(p0);
       }
       throw new IllegalStateException("YogaNode does not have children");
    }
    public void k0(float p0){
       YogaNative.jni_YGNodeStyleSetFlexJNI(this.f, p0);
    }
    public int l(){
       YogaNodeJNIBase tc = this.c;
       int i = (tc == null)? 0: tc.size();
       return i;
    }
    public void l0(float p0){
       YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.f, p0);
    }
    public Object m(){
       return this.g;
    }
    public void m0(){
       YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(this.f);
    }
    public final long measure(float p0,int p1,float p2,int p3){
       if (this.V()) {
          return this.d.a(this, p0, YogaMeasureMode.fromInt(p1), p2, YogaMeasureMode.fromInt(p3));
       }
       throw new RuntimeException("Measure function isn\'t defined!");
    }
    public YogaDisplay n(){
       return YogaDisplay.fromInt(YogaNative.jni_YGNodeStyleGetDisplayJNI(this.f));
    }
    public void n0(float p0){
       YogaNative.jni_YGNodeStyleSetFlexBasisPercentJNI(this.f, p0);
    }
    public float o(){
       return YogaNative.jni_YGNodeStyleGetFlexJNI(this.f);
    }
    public void o0(YogaFlexDirection p0){
       YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.f, p0.intValue());
    }
    public i p(){
       return YogaNodeJNIBase.T0(YogaNative.jni_YGNodeStyleGetFlexBasisJNI(this.f));
    }
    public void p0(float p0){
       YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.f, p0);
    }
    public YogaFlexDirection q(){
       return YogaFlexDirection.fromInt(YogaNative.jni_YGNodeStyleGetFlexDirectionJNI(this.f));
    }
    public void q0(float p0){
       YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.f, p0);
    }
    public float r(){
       return YogaNative.jni_YGNodeStyleGetFlexGrowJNI(this.f);
    }
    public void r0(float p0){
       YogaNative.jni_YGNodeStyleSetHeightJNI(this.f, p0);
    }
    public final long replaceChild(YogaNodeJNIBase p0,int p1){
       YogaNodeJNIBase tc = this.c;
       if (tc == null) {
          throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
       }
       tc.remove(p1);
       this.c.add(p1, p0);
       p0.b = this;
       return p0.f;
    }
    public float s(){
       return YogaNative.jni_YGNodeStyleGetFlexShrinkJNI(this.f);
    }
    public void s0(){
       YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.f);
    }
    public i t(){
       return YogaNodeJNIBase.T0(YogaNative.jni_YGNodeStyleGetHeightJNI(this.f));
    }
    public void t0(float p0){
       YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.f, p0);
    }
    public YogaJustify u(){
       return YogaJustify.fromInt(YogaNative.jni_YGNodeStyleGetJustifyContentJNI(this.f));
    }
    public void u0(boolean p0){
       YogaNative.jni_YGNodeSetIsReferenceBaselineJNI(this.f, p0);
    }
    public float v(YogaEdge p0){
       int i2;
       YogaNodeJNIBase tarr = this.arr;
       if (tarr != null) {
          int i = 0;
          if (((int)tarr[i] & 4) == 4) {
             int i1 = (((int)tarr[i] & 1) == 1)? 0: 4;
             i1 = i1 - 14;
             if (((int)tarr[i] & 2) != 2) {
                i = 4;
             }
             i1 = i1 - i;
             switch (YogaNodeJNIBase$a.a[p0.ordinal()]){
                 case 1:
                   return this.arr[i1];
                 case 2:
                   return this.arr[(i1 + 1)];
                 case 3:
                   return this.arr[(i1 + 2)];
                 case 4:
                   return this.arr[(i1 + 3)];
                 case 5:
                   i2 = (this.w() == YogaDirection.RTL)? this.arr[(i1 + 2)]: this.arr[i1];
                   return i2;
                   break;
                 case 6:
                   i2 = (this.w() == YogaDirection.RTL)? this.arr[i1]: this.arr[(i1 + 2)];
                   return i2;
                   break;
                 default:
                   throw new IllegalArgumentException("Cannot get layout border of multi-edge shorthands");
             }
          }
       }
       return 0;
    }
    public void v0(YogaJustify p0){
       YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.f, p0.intValue());
    }
    public YogaDirection w(){
       YogaNodeJNIBase tarr = this.arr;
       int i = (tarr != null)? (int)tarr[5]: this.mLayoutDirection;
       return YogaDirection.fromInt(i);
    }
    public void w0(YogaEdge p0,float p1){
       YogaNative.jni_YGNodeStyleSetMarginJNI(this.f, p0.intValue(), p1);
    }
    public float x(){
       YogaNodeJNIBase tarr = this.arr;
       int i = (tarr != null)? tarr[2]: 0;
       return i;
    }
    public void x0(YogaEdge p0){
       YogaNative.jni_YGNodeStyleSetMarginAutoJNI(this.f, p0.intValue());
    }
    public float y(YogaEdge p0){
       int i2;
       YogaNodeJNIBase tarr = this.arr;
       if (tarr != null) {
          int i = 1;
          if (((int)tarr[0] & i) == i) {
             int i1 = 8;
             switch (YogaNodeJNIBase$a.a[p0.ordinal()]){
                 case 1:
                   return this.arr[6];
                 case 2:
                   return this.arr[7];
                 case 3:
                   return this.arr[i1];
                 case 4:
                   return this.arr[9];
                 case 5:
                   i2 = (this.w() == YogaDirection.RTL)? this.arr[i1]: this.arr[6];
                   return i2;
                   break;
                 case 6:
                   i2 = (this.w() == YogaDirection.RTL)? this.arr[6]: this.arr[i1];
                   return i2;
                   break;
                 default:
                   throw new IllegalArgumentException("Cannot get layout margins of multi-edge shorthands");
             }
          }
       }
       return 0;
    }
    public void y0(YogaEdge p0,float p1){
       YogaNative.jni_YGNodeStyleSetMarginPercentJNI(this.f, p0.intValue(), p1);
    }
    public float z(YogaEdge p0){
       int i2;
       YogaNodeJNIBase tarr = this.arr;
       if (tarr != null) {
          int i = 0;
          if (((int)tarr[i] & 2) == 2) {
             if (((int)tarr[i] & 1) != 1) {
                i = 4;
             }
             int i1 = i - 10;
             switch (YogaNodeJNIBase$a.a[p0.ordinal()]){
                 case 1:
                   return this.arr[i1];
                 case 2:
                   return this.arr[(i1 + 1)];
                 case 3:
                   return this.arr[(i1 + 2)];
                 case 4:
                   return this.arr[(i1 + 3)];
                 case 5:
                   i2 = (this.w() == YogaDirection.RTL)? this.arr[(i1 + 2)]: this.arr[i1];
                   return i2;
                   break;
                 case 6:
                   i2 = (this.w() == YogaDirection.RTL)? this.arr[i1]: this.arr[(i1 + 2)];
                   return i2;
                   break;
                 default:
                   throw new IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
             }
          }
       }
       return 0;
    }
    public void z0(float p0){
       YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.f, p0);
    }
}
