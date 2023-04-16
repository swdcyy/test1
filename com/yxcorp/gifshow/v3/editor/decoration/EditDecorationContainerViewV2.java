package com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import wpc.v;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import wpc.o;
import android.util.AttributeSet;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import java.lang.Float;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2$b;
import erd.g;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$ActionMode;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2$d;
import java.util.List;
import java.util.Comparator;
import trd.x;
import java.util.Iterator;
import java.util.LinkedList;
import android.view.View;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView$b;
import wpc.u;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2$onMoveEnd$1;
import android.graphics.Rect;
import lnc.a1;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import msd.a;
import kotlin.jvm.internal.Ref$FloatRef;
import android.animation.ValueAnimator;
import wpc.l;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import wpc.m;
import android.animation.AnimatorSet;
import wpc.n;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.view.MotionEvent;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2$f;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2$g;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2$h;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2$updateGlobalScale$$inlined$apply$lambda$2;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2$i;
import qrd.l1;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationView;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationViewV2;
import android.widget.AbsoluteLayout;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import i2b.a;
import android.view.ViewGroup$LayoutParams;
import java.lang.Integer;
import android.view.ViewParent;
import com.yxcorp.gifshow.v3.customizer.preview.EditorPreviewContainerLayout;
import com.yxcorp.gifshow.v3.customizer.preview.EditorPreviewContainerLayoutV2;
import android.graphics.RectF;
import android.view.ViewGroup$MarginLayoutParams;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2$c;
import kotlin.Pair;
import java.lang.Number;
import wpc.p;
import com.yxcorp.gifshow.decoration.widget.f;
import wpc.q;
import android.util.Pair;
import wpc.r;
import gq.a;
import q87.c;
import faa.a;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2$e;

public final class EditDecorationContainerViewV2 extends EditDecorationContainerView implements v	// class@000f03
{
    public View A;
    public boolean B;
    public boolean C;
    public EditDecorationBaseDrawer D;
    public boolean E;
    public boolean F;
    public Rect G;
    public boolean H;
    public boolean I;
    public boolean J;
    public u K;
    public ValueAnimator L;
    public boolean M;
    public float N;
    public final List O;
    public final List P;
    public final AnimatorListenerAdapter Q;
    public HashMap R;
    public static final EditDecorationContainerViewV2$a S;

    static {
       EditDecorationContainerViewV2.S = new EditDecorationContainerViewV2$a(null);
    }
    public void EditDecorationContainerViewV2(Context p0){
       a.p(p0, "context");
       super(p0);
       this.F = true;
       this.I = true;
       this.O = new ArrayList();
       this.P = new ArrayList();
       this.Q = new o(this);
    }
    public void EditDecorationContainerViewV2(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.F = true;
       this.I = true;
       this.O = new ArrayList();
       this.P = new ArrayList();
       this.Q = new o(this);
    }
    public void EditDecorationContainerViewV2(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.F = true;
       this.I = true;
       this.O = new ArrayList();
       this.P = new ArrayList();
       this.Q = new o(this);
    }
    public static final void D0(EditDecorationContainerViewV2 p0,EditDecorationBaseDrawer p1){
       super.I(p1);
    }
    public static void P0(EditDecorationContainerViewV2 p0,boolean p1,boolean p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = true;
       }
       p0.O0(p1, p2);
       return;
    }
    public void A(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditDecorationContainerViewV2.class, "1")) {
          return;
       }
       this.B = PostExperimentUtils.z();
       super.A(p0);
       return;
    }
    public void E(){
       if (PatchProxy.applyVoid(null, this, EditDecorationContainerViewV2.class, "37")) {
          return;
       }
       if (this.B != null) {
          super.E();
          if (this.getSelectDrawer() != null && a.g(this.D, this.getSelectDrawer())) {
             this.A0();
          }
       }else {
          super.E();
       }
       return;
    }
    public final void E0(EditDecorationBaseDrawer p0,float p1,float p2){
       if (PatchProxy.isSupport(EditDecorationContainerViewV2.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, EditDecorationContainerViewV2.class, "39")) {
          return;
       }
       p0.onSingleFingerMoveProcess(p1, p2);
       this.C0(p0);
       this.g(new EditDecorationContainerViewV2$b(p0), p0);
       return;
    }
    public void F(){
       if (PatchProxy.applyVoid(null, this, EditDecorationContainerViewV2.class, "36")) {
          return;
       }
       if (this.B != null) {
          if (this.d == DecorationContainerView$ActionMode.MOVE) {
             this.J();
          }
          if (this.I != null && this.getSelectDrawer() != null) {
             if (a.g(this.D, this.getSelectDrawer())) {
                this.B0();
             }else {
                this.S(true);
             }
          }
       }
    label_003b :
       super.F();
       return;
    }
    public final void F0(){
       if (PatchProxy.applyVoid(null, this, EditDecorationContainerViewV2.class, "43")) {
          return;
       }
       DecorationContainerView tl = this.l;
       a.o(tl, "mDecorationDrawerList");
       x.p0(tl, EditDecorationContainerViewV2$d.b);
       tl = this.k;
       int i = 0;
       Iterator iterator = this.l.iterator();
       while (iterator.hasNext()) {
          EditDecorationBaseDrawer uEditDecorat = iterator.next();
          if (a.g(uEditDecorat, tl)) {
             continue ;
          }
          uEditDecorat.bringToFront();
          a.o(uEditDecorat, "nowDecorationDrawer");
          int i1 = i + 1;
          uEditDecorat.setZIndex(i);
          i = i1;
       }
       if (tl != null) {
          tl.bringToFront();
          tl.setZIndex((this.l.size() - 1));
       }
       return;
    }
    public void G(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditDecorationContainerViewV2.class, "45")) {
       }else {
          a.p(p0, "drawerItem");
          if (this.B != null) {
             if (a.g(this.k, p0) && this.u != null) {
                EditDecorationContainerView tt = this.t;
                a.o(tt, "mDecorationView");
                tt.setVisibility(8);
             }
          }else {
             super.G(p0);
          }
       }
       return;
    }
    public final EditDecorationBaseDrawer G0(boolean p0,boolean p1){
       Iterator obj;
       EditDecorationBaseDrawer uEditDecorat;
       boolean b;
       if (PatchProxy.isSupport(EditDecorationContainerViewV2.class)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, EditDecorationContainerViewV2.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.l.iterator();
       while (true) {
          uEditDecorat = null;
          if (!obj.hasNext()) {
             return uEditDecorat;
          }
          EditDecorationBaseDrawer uEditDecorat1 = obj.next();
          if (this.x == null) {
             break ;
          }else {
             String str = "drawer";
             if (p0) {
                a.o(uEditDecorat1, str);
                b = uEditDecorat1.isSubtitle();
             }else if(p1){
                a.o(uEditDecorat1, str);
                b = uEditDecorat1.isSticker();
             }else {
                a.o(uEditDecorat1, str);
                b = (!uEditDecorat1.isSubtitle() && !uEditDecorat1.isSticker())? true: false;
             }
             if (b) {
                EditDecorationContainerView tx = this.x;
                a.m(tx);
                if (tx.d(uEditDecorat1)) {
                   return uEditDecorat1;
                }
             }
          }
       }
       return uEditDecorat;
    }
    public void H(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditDecorationContainerViewV2.class, "44")) {
       }else {
          a.p(p0, "drawerItem");
          if (this.B != null && (a.g(this.k, p0) && this.u != null)) {
             EditDecorationContainerView tt = this.t;
             a.o(tt, "mDecorationView");
             tt.setVisibility(0);
          }
       }
       return;
    }
    public final EditDecorationBaseDrawer H0(){
       Object obj = PatchProxy.apply(null, this, EditDecorationContainerViewV2.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.G0(false, true);
    }
    public void I(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditDecorationContainerViewV2.class, "34")) {
       }else {
          a.p(p0, "targetDrawer");
          if (this.B != null) {
             EditDecorationContainerViewV2 tK = this.K;
             if (tK != null) {
                tK.n();
             }
             tK = this.D;
             EditDecorationContainerViewV2$onMoveEnd$1 oonMoveEnd$1 = new EditDecorationContainerViewV2$onMoveEnd$1(this, p0);
             if (!PatchProxy.applyVoidTwoRefs(tK, oonMoveEnd$1, this, EditDecorationContainerViewV2.class, "38") && tK != null) {
                Rect rect = this.u(tK);
                EditDecorationContainerViewV2 tG = this.G;
                if (tG == null) {
                   tG = this.getEditorRect();
                }
                int i = a1.e(56.00f);
                String str = "EditDecorationContainerViewV2";
                Log.g(str, "minDistance = "+i);
                Rect right = rect.right;
                int i1 = tG.left + i;
                if (right >= i1) {
                   right = rect.left;
                   i1 = tG.right - i;
                   if (right <= i1) {
                      i1 = 0;
                   label_0071 :
                      right = rect.bottom;
                      int i2 = tG.top + i;
                      if (right < i2) {
                         i2 = i2 - right;
                      }else {
                         rect = rect.top;
                         int i3 = tG.bottom - i;
                         i2 = (rect > i3)? i3 - rect: 0;
                      }
                      Log.g(str, "deltaX = "+i1+", deltaY = "+i2);
                      if (!i1 && !i2) {
                         oonMoveEnd$1.invoke();
                      }else {
                         Ref$FloatRef uFloatRef = new Ref$FloatRef();
                         uFloatRef.element = 0;
                         float[] uofloatArray = new float[]{0,(float)i1};
                         ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray);
                         valueAnimato.addUpdateListener(new l(this, tK, uFloatRef));
                         uFloatRef = new Ref$FloatRef();
                         uFloatRef.element = 0;
                         float[] uofloatArray1 = new float[]{0,(float)i2};
                         ValueAnimator valueAnimato1 = ValueAnimator.ofFloat(uofloatArray1);
                         valueAnimato1.addUpdateListener(new m(this, tK, uFloatRef));
                         AnimatorSet uAnimatorSet = new AnimatorSet();
                         uAnimatorSet.setDuration(200);
                         uAnimatorSet.addListener(new n(oonMoveEnd$1));
                         Animator[] uAnimatorArr = new Animator[]{valueAnimato,valueAnimato1};
                         uAnimatorSet.playTogether(uAnimatorArr);
                         uAnimatorSet.start();
                      }
                   }
                }
                i1 = i1 - right;
                goto label_0071 ;
             }
          }else {
             super.I(p0);
          }
       }
       return;
    }
    public final EditDecorationBaseDrawer I0(){
       Object obj = PatchProxy.apply(null, this, EditDecorationContainerViewV2.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.G0(true, false);
    }
    public final EditDecorationBaseDrawer J0(){
       Object obj = PatchProxy.apply(null, this, EditDecorationContainerViewV2.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.G0(false, false);
    }
    public void K(){
       if (PatchProxy.applyVoid(null, this, EditDecorationContainerViewV2.class, "30")) {
          return;
       }
       if (this.B != null && (this.d == DecorationContainerView$ActionMode.SELECTED_TAP_OR_MOVE && (this.I != null && this.getSelectDrawer() != null))) {
          if (a.g(this.D, this.getSelectDrawer())) {
             this.B0();
          }else {
             this.S(true);
          }
       }
       return;
    }
    public final boolean K0(){
       return this.M;
    }
    public void L(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditDecorationContainerViewV2.class, "31")) {
       }else {
          a.p(p0, "targetDecoration");
          if (this.B != null) {
             EditDecorationContainerViewV2 tK = this.K;
             if (tK != null) {
                tK.n();
             }
          }
          super.L(p0);
       }
       return;
    }
    public void L0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, EditDecorationContainerViewV2.class, "23")) {
          return;
       }
       if (this.B != null && !PatchProxy.applyVoid(objArray, this, EditDecorationContainerViewV2.class, "5")) {
          EditDecorationContainerViewV2 tA = this.A;
          if (tA != null) {
             tA.setVisibility(8);
          }
       }
       return;
    }
    public final void M0(float p0,float p1,float p2,float p3){
       if (PatchProxy.isSupport(EditDecorationContainerViewV2.class) && PatchProxy.applyVoidFourRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), Float.valueOf(p3), this, EditDecorationContainerViewV2.class, "14")) {
          return;
       }
       EditDecorationContainerViewV2 tK = this.K;
       if (tK != null) {
          tK.a(p0, p1, p2, p3);
       }
       return;
    }
    public void N0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, EditDecorationContainerViewV2.class, "22")) {
          return;
       }
       if (this.B != null && !PatchProxy.applyVoid(objArray, this, EditDecorationContainerViewV2.class, "4")) {
          EditDecorationContainerViewV2 tA = this.A;
          if (tA != null) {
             tA.bringToFront();
          }
          DecorationContainerView tk = this.k;
          if (tk != null) {
             tk.bringToFront();
          }
          EditDecorationContainerView tt = this.t;
          if (tt != null) {
             tt.bringToFront();
          }
          tA = this.A;
          if (tA != null) {
             tA.setVisibility(0);
          }
       }
    label_003a :
       return;
    }
    public boolean O(BaseDrawer p0,boolean p1){
       return this.x0(p0, p1);
    }
    public final void O0(boolean p0,boolean p1){
       if (this.F != null || p1) {
          this.E = p0;
       }
       return;
    }
    public final void Q0(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditDecorationContainerViewV2.class, "27")) {
          return;
       }
       a.p(p0, "e");
       DecorationContainerView tk = this.k;
       boolean b = (tk != null)? true: false;
       this.J = b;
       this.g(new EditDecorationContainerViewV2$f(this, p0), tk);
       return;
    }
    public final void R0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, EditDecorationContainerViewV2.class, "16")) {
          return;
       }
       EditDecorationContainerViewV2 tK = this.K;
       if (tK != null) {
          Iterator iterator = this.l.iterator();
          while (iterator.hasNext()) {
             EditDecorationBaseDrawer uEditDecorat = iterator.next();
             if (uEditDecorat instanceof EditDecorationBaseDrawer) {
                if (objArray == null) {
                   objArray = tK.f(this.C, uEditDecorat.getAirWallType());
                }
                uEditDecorat.updateAirWallLimits(objArray);
             }
          }
       }
       return;
    }
    public boolean S(boolean p0){
       if (PatchProxy.isSupport(EditDecorationContainerViewV2.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, EditDecorationContainerViewV2.class, "20");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       p0 = super.S(p0);
       if (p0 && this.F != null) {
          k1.r(new EditDecorationContainerViewV2$g(this), 0);
       }
       return p0;
    }
    public final void S0(float p0){
       Object obj1;
       if (PatchProxy.isSupport(EditDecorationContainerViewV2.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, EditDecorationContainerViewV2.class, "9")) {
          return;
       }
       if (!this.l.isEmpty()) {
          int i = 0;
          EditDecorationContainerViewV2 obj = this.l.get(i);
          String str = "mDecorationDrawerList[0]";
          a.o(obj, str);
          if (obj.getGlobalScale() - p0) {
             obj = this.L;
             if (obj != null && obj.isRunning() == true) {
                obj = this.L;
                if (obj != null) {
                   obj.cancel();
                }
             }
             float[] uofloatArray = new float[]{obj1.getGlobalScale(),p0};
             obj1 = this.l.get(i);
             a.o(obj1, str);
             ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray);
             valueAnimato.setDuration(200);
             valueAnimato.addUpdateListener(new EditDecorationContainerViewV2$h(this, p0));
             valueAnimato.addListener(new EditDecorationContainerViewV2$i(new EditDecorationContainerViewV2$updateGlobalScale$$inlined$apply$lambda$2(this, p0)));
             valueAnimato.start();
             this.L = valueAnimato;
          }
       }
       return;
    }
    public final void T0(boolean p0,boolean p1){
       if (PatchProxy.isSupport(EditDecorationContainerViewV2.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, EditDecorationContainerViewV2.class, "8")) {
          return;
       }
       Iterator iterator = this.l.iterator();
       while (iterator.hasNext()) {
          EditDecorationBaseDrawer uEditDecorat = iterator.next();
          String str = "drawer";
          if (p1) {
             a.o(uEditDecorat, str);
             boolean b = (p0 && uEditDecorat.isInteractSticker())? true: false;
             uEditDecorat.setCustomButtonEnable(b);
          }else {
             a.o(uEditDecorat, str);
             uEditDecorat.setCustomButtonEnable(p0);
          }
       }
       this.t.invalidate();
       this.H = p0;
       return;
    }
    public final void U0(boolean p0){
       if (PatchProxy.isSupport(EditDecorationContainerViewV2.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, EditDecorationContainerViewV2.class, "7")) {
          return;
       }
       Iterator iterator = this.l.iterator();
       while (iterator.hasNext()) {
          EditDecorationBaseDrawer uEditDecorat = iterator.next();
          a.o(uEditDecorat, "drawer");
          if (uEditDecorat.isNewText()) {
             uEditDecorat.setCustomButtonEnable(p0);
          }
       }
       this.t.invalidate();
       this.o = p0;
       return;
    }
    public void V(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditDecorationContainerViewV2.class, "35")) {
       }else {
          a.p(p0, "movingDrawer");
          if (this.B != null) {
             this.C0(p0);
          }else {
             super.V(p0);
          }
       }
       return;
    }
    public final void V0(boolean p0){
       if (PatchProxy.isSupport(EditDecorationContainerViewV2.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, EditDecorationContainerViewV2.class, "48")) {
          return;
       }
       EditDecorationContainerViewV2 tK = this.K;
       if (tK != null) {
          tK.e((p0 ^ 0x01));
       }
       return;
    }
    public boolean Z(EditDecorationBaseDrawer p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, EditDecorationContainerViewV2.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "decorationDrawer");
       return super.Z(p0, p1);
    }
    public void a(u p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditDecorationContainerViewV2.class, "46")) {
          return;
       }
       a.p(p0, "consumer");
       this.K = p0;
       return;
    }
    public void b(u p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditDecorationContainerViewV2.class, "47")) {
          return;
       }
       a.p(p0, "consumer");
       if (a.g(p0, this.K)) {
          this.K = null;
       }
       return;
    }
    public boolean c(BaseDrawer p0,boolean p1,Object p2,boolean p3){
       boolean b;
       if (PatchProxy.isSupport(EditDecorationContainerViewV2.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Boolean.valueOf(p1), p2, Boolean.valueOf(p3), this, EditDecorationContainerViewV2.class, "17");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          label_0034 :
             return b;
          }
       }
       a.p(p0, "decorationDrawer");
       b = super.c(p0, p1, p2, p3);
       this.R0();
       goto label_0034 ;
    }
    public BaseDrawer getActiveDrawer(){
       return this.D;
    }
    public final List getAnimationEndCallbacks(){
       return this.P;
    }
    public final List getAnimationStartCallbacks(){
       return this.O;
    }
    public EditDecorationView getDecorationView(){
       EditDecorationViewV2 obj = PatchProxy.apply(null, this, EditDecorationContainerViewV2.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.B != null) {
          Log.g("EditDecorationContainerViewV2", "newText, getDecorationView.....");
          Context context = this.getContext();
          a.o(context, "context");
          obj = new EditDecorationViewV2(context);
       }else {
          EditDecorationView decorationVi = super.getDecorationView();
          a.o(decorationVi, "super.getDecorationView\(\)");
       }
       return obj;
    }
    public BaseDrawer getGestureTargetDecoration(){
       return this.getGestureTargetDecoration();
    }
    public EditDecorationBaseDrawer getGestureTargetDecoration(){
       EditDecorationBaseDrawer gestureTarDe;
       EditDecorationContainerViewV2 obj = PatchProxy.apply(null, this, EditDecorationContainerViewV2.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.B != null)? this.D: super.getGestureTargetDecoration();
       return obj;
    }
    public final boolean getInterceptWhenTapOnBlankScreen(){
       return this.E;
    }
    public final ValueAnimator getMCustomButtonAnimator(){
       return this.L;
    }
    public final boolean getMEnableHideDecorationView(){
       return this.I;
    }
    public final AnimatorListenerAdapter getMPullUpContainerAnimationListener(){
       return this.Q;
    }
    public final boolean getMSelectedWhenActionDown(){
       return this.J;
    }
    public final boolean getMShouldShowStickerCustomButton(){
       return this.H;
    }
    public final float getPullUpTranslationY(){
       return this.N;
    }
    public DecorationContainerView$ActionMode j(){
       DecorationContainerView$ActionMode obj = PatchProxy.apply(null, this, EditDecorationContainerViewV2.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.B != null) {
          obj = DecorationContainerView$ActionMode.DOWN_TO_NEW_ITEM;
       }else {
          obj = super.j();
          a.o(obj, "super.decideScrollActionMode\(\)");
       }
       return obj;
    }
    public void onFinishInflate(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, EditDecorationContainerViewV2.class, "2")) {
          return;
       }
       super.onFinishInflate();
       if (this.B != null) {
          if (!PatchProxy.applyVoid(objArray, this, EditDecorationContainerViewV2.class, "3")) {
             this.A = a.k(this, 0x7f0d15d1, 0);
             ViewGroup$LayoutParams layoutParams = this.generateDefaultLayoutParams();
             layoutParams.width = -1;
             layoutParams.height = -1;
             this.addView(this.A, layoutParams);
             EditDecorationContainerViewV2 tA = this.A;
             if (tA != null) {
                tA.setVisibility(8);
             }
          }
          this.setVisibility(0);
       }
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       RectF rectF;
       EditDecorationContainerViewV2 tK;
       if (PatchProxy.isSupport(EditDecorationContainerViewV2.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, EditDecorationContainerViewV2.class, "15")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       ViewGroup$MarginLayoutParams marginLayout = null;
       if (this.C == null && (this.getParent() instanceof EditorPreviewContainerLayout || this.getParent() instanceof EditorPreviewContainerLayoutV2)) {
          ViewParent parent = this.getParent();
          if (!parent instanceof View) {
             parent = marginLayout;
          }
          ViewGroup$LayoutParams layoutParams = (parent != null)? parent.getLayoutParams(): marginLayout;
          if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
             marginLayout = layoutParams;
          }
          if (marginLayout != null) {
             float f = (float)marginLayout.leftMargin;
             float f1 = (float)marginLayout.topMargin;
             rectF = new RectF(f, f1, ((float)marginLayout.width + f), ((float)marginLayout.height + f1));
             tK = this.K;
             if (tK != null) {
                tK.b(rectF);
             }
          }else {
          label_00c4 :
             return;
          }
       }else {
          ViewParent parent1 = this.getParent();
          if (parent1 instanceof View) {
             marginLayout = parent1;
          }
          if (marginLayout != null) {
             View view = marginLayout.findViewById(R.id.preview_player_container);
             if (view != null) {
                ViewGroup$LayoutParams layoutParams1 = view.getLayoutParams();
                if (layoutParams1 != null) {
                   ViewGroup$LayoutParams height = layoutParams1.height;
                   float f2 = ((float)(marginLayout.getWidth() - layoutParams1.width) / 2.00f) + ((float)(layoutParams1.width - p0) / 2.00f);
                   float f3 = ((float)(marginLayout.getHeight() - height) / 2.00f) + ((float)(height - p1) / 2.00f);
                   rectF = new RectF(f2, f3, ((float)p0 + f2), ((float)p1 + f3));
                   tK = this.K;
                   if (tK != null) {
                      tK.b(rectF);
                   }
                }
             }
          }
          return;
       }
       this.R0();
       goto label_00c4 ;
    }
    public boolean p(boolean p0,boolean p1){
       if (PatchProxy.isSupport(EditDecorationContainerViewV2.class)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, EditDecorationContainerViewV2.class, "21");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       p0 = super.p(p0, p1);
       if (p0) {
          k1.p(new EditDecorationContainerViewV2$c(this), Integer.valueOf(0));
       }
       return p0;
    }
    public void q(MotionEvent p0,float p1,float p2){
       EditDecorationContainerViewV2 tK;
       Rect rect;
       Pair pair;
       boolean this;
       if (PatchProxy.isSupport(EditDecorationContainerViewV2.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, EditDecorationContainerViewV2.class, "40")) {
          return;
       }
       a.p(p0, "currentEvent");
       if (this.B != null) {
          if (!PatchProxy.isSupport(EditDecorationContainerViewV2.class) || !PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, EditDecorationContainerViewV2.class, "42")) {
             EditDecorationBaseDrawer gestureTarDe = this.getGestureTargetDecoration();
             if (gestureTarDe != null) {
                DecorationContainerView tq = this.q;
                boolean b = gestureTarDe.isInteractSticker();
                String str = "getPainterContentRect\(targetDecoration\)";
                if (tq == null) {
                   tK = this.K;
                   if (tK != null) {
                      rect = this.q0(gestureTarDe);
                      a.o(rect, str);
                      pair = tK.c(p0, p1, p2, rect, b);
                      if (pair != null) {
                      label_0077 :
                         gestureTarDe.onSingleFingerMoveProcess((- pair.getFirst().floatValue()), (- pair.getSecond().floatValue()));
                         this.g(new p(gestureTarDe), gestureTarDe);
                      }
                   }
                   pair = new Pair(Float.valueOf(p1), Float.valueOf(p2));
                   goto label_0077 ;
                }else {
                   this = true;
                   if (!tq.c() || tq.h(this.u(gestureTarDe), this)) {
                      this = false;
                   }
                   if (!this) {
                      tq.i();
                      tK = this.K;
                      if (tK != null) {
                         rect = this.q0(gestureTarDe);
                         a.o(rect, str);
                         pair = tK.c(p0, p1, p2, rect, b);
                         if (pair != null) {
                         label_00d5 :
                            gestureTarDe.onSingleFingerMoveProcess((- pair.getFirst().floatValue()), (- pair.getSecond().floatValue()));
                            this.g(new q(gestureTarDe), gestureTarDe);
                         }
                      }
                      pair = new Pair(Float.valueOf(p1), Float.valueOf(p2));
                      goto label_00d5 ;
                   }else {
                      Pair pair1 = tq.d(p0, p1, p2, this.u(gestureTarDe));
                      EditDecorationContainerViewV2 tK1 = this.K;
                      if (tK1 != null) {
                         Pair first = pair1.first;
                         a.o(first, "newDistancePair.first");
                         float this1 = first.floatValue();
                         first = pair1.second;
                         a.o(first, "newDistancePair.second");
                         rect = this.q0(gestureTarDe);
                         a.o(rect, str);
                         pair = tK1.c(p0, this1, first.floatValue(), rect, b);
                         if (pair != null) {
                         label_0136 :
                            gestureTarDe.onSingleFingerMoveProcess((- pair.getFirst().floatValue()), (- pair.getSecond().floatValue()));
                            this.g(new r(gestureTarDe), gestureTarDe);
                         }
                      }
                      pair = new Pair(pair1.first, pair1.second);
                      goto label_0136 ;
                   }
                }
             }
          }
       }else {
          super.q(p0, p1, p2);
       }
       return;
    }
    public boolean r(MotionEvent p0,float p1,float p2){
       EditDecorationBaseDrawer obj;
       if (PatchProxy.isSupport(EditDecorationContainerViewV2.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, EditDecorationContainerViewV2.class, "41");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "currentEvent");
       if (this.B != null) {
          obj = this.getGestureTargetDecoration();
          if (obj != null) {
             boolean b = obj.isInteractSticker();
             EditDecorationContainerViewV2 tK = this.K;
             if (tK != null) {
                Rect rect = this.q0(obj);
                a.o(rect, "getPainterContentRect\(targetDecoration\)");
                tK.c(p0, p1, p2, rect, b);
             }
          }else {
             return super.r(p0, p1, p2);
          }
       }
       return super.r(p0, p1, p2);
    }
    public final void setAllowedInterceptChange(boolean p0){
       this.F = p0;
    }
    public final void setMCustomButtonAnimator(ValueAnimator p0){
       this.L = p0;
    }
    public final void setMEnableHideDecorationView(boolean p0){
       this.I = p0;
    }
    public final void setMSelectedWhenActionDown(boolean p0){
       this.J = p0;
    }
    public final void setMShouldShowStickerCustomButton(boolean p0){
       this.H = p0;
    }
    public final void setPullUp(boolean p0){
       this.M = p0;
    }
    public final void setPullUpTranslationY(float p0){
       this.N = p0;
    }
    public final void setRestrictRect(Rect p0){
       this.G = p0;
    }
    public boolean v(MotionEvent p0){
       Object[] obj = PatchProxy.applyOneRefs(p0, this, EditDecorationContainerViewV2.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "e");
       boolean b = true;
       int i = 0;
       if (this.B != null) {
          Object[] objArray = new Object[i];
          a.D().s("EditDecorationContainerViewV2", "detectorSingleFingerUp preSelect", objArray);
          if (this.k != null) {
             this.R();
          }
          if (this.m0(p0.getX(), p0.getY()) == null) {
             obj = new Object[i];
             a.D().w("EditDecorationContainerViewV2", "drawer has gone when ACTION_UP...", obj);
          }else {
             this.d = DecorationContainerView$ActionMode.SELECT;
             this.w0(this.D);
             this.T();
          }
       }else {
          b = false;
       }
       return b;
    }
    public void w(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditDecorationContainerViewV2.class, "25")) {
       }else {
          a.p(p0, "clickedDecorationDrawer");
          this.d = DecorationContainerView$ActionMode.DOWN_TO_NEW_ITEM;
          this.D = p0;
          this.T();
       }
       return;
    }
    public boolean x(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EditDecorationContainerViewV2.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "e");
       this.d = DecorationContainerView$ActionMode.SINGLE_TAP_BLANK_SCREEN;
       this.D = null;
       this.Q0(p0);
       return this.E;
    }
    public boolean x0(EditDecorationBaseDrawer p0,boolean p1){
       if (PatchProxy.isSupport(EditDecorationContainerViewV2.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, EditDecorationContainerViewV2.class, "19");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "decorationDrawer");
       p1 = super.x0(p0, p1);
       if (this.getShowingDelegate() == null) {
          PostUtils.D("EditDecorationContainerViewV2", "selectDecoration", new IllegalArgumentException("showingDelegate is null when selectDecoration\(\)"));
       }
       if (p1 && (this.u != null && (this.getShowingDelegate() != null && (!this.getShowingDelegate().b(p0) || !this.getShowingDelegate().d(p0))))) {
          EditDecorationContainerView tt = this.t;
          a.o(tt, "mDecorationView");
          tt.setVisibility(8);
       }
    label_0068 :
       if (p1 && this.F != null) {
          k1.r(new EditDecorationContainerViewV2$e(this), 0);
       }
       return p1;
    }
    public boolean y(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EditDecorationContainerViewV2.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.B != null)? true: super.y(p0);
       return b;
    }
    public void z(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditDecorationContainerViewV2.class, "24")) {
       }else {
          a.p(p0, "clickedDecorationDrawer");
          this.D = p0;
       }
       return;
    }
}
