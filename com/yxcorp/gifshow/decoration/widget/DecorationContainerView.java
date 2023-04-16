package com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import android.widget.AbsoluteLayout;
import android.content.Context;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$ActionMode;
import android.graphics.Rect;
import aw9.p;
import java.util.LinkedList;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.GestureDetector;
import com.yxcorp.gifshow.decoration.widget.d;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector$OnGestureListener;
import com.yxcorp.gifshow.decoration.widget.g;
import com.yxcorp.gifshow.decoration.widget.e;
import com.yxcorp.gifshow.decoration.widget.g$a;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import aw9.x;
import erd.g;
import com.yxcorp.gifshow.decoration.widget.f;
import aw9.w;
import aw9.e;
import gq.a;
import q87.c;
import aw9.v;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import aw9.f;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import aw9.g;
import com.yxcorp.gifshow.decoration.widget.f$a;
import com.yxcorp.gifshow.decoration.widget.f$b;
import aw9.i;
import java.lang.Runnable;
import java.util.Iterator;
import java.util.List;
import erd.r;
import java.lang.Integer;
import aw9.j;
import com.yxcorp.gifshow.util.PostUtils;
import android.view.MotionEvent;
import com.yxcorp.gifshow.decoration.widget.a;
import android.view.View;
import com.yxcorp.gifshow.decoration.widget.b;
import aw9.u;
import java.lang.Float;
import aw9.r;
import aw9.s;
import android.util.Pair;
import aw9.t;
import aw9.l;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$b;
import java.util.ArrayList;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer;
import aw9.n;

public class DecorationContainerView extends AbsoluteLayout	// class@0012b8
{
    public boolean b;
    public boolean c;
    public DecorationContainerView$ActionMode d;
    public Rect e;
    public GestureDetector f;
    public g g;
    public boolean h;
    public boolean i;
    public Runnable j;
    public BaseDrawer k;
    public LinkedList l;
    public LinkedList m;
    public boolean n;
    public boolean o;
    public View p;
    public f q;
    public static final int r;

    public void DecorationContainerView(Context p0){
       super(p0);
       this.b = true;
       this.c = true;
       this.d = DecorationContainerView$ActionMode.SELECTED_TAP_OR_MOVE;
       this.e = new Rect();
       this.i = true;
       this.j = new p(this);
       this.l = new LinkedList();
       this.m = new LinkedList();
       this.n = false;
       this.o = false;
       this.A(p0);
    }
    public void DecorationContainerView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = true;
       this.c = true;
       this.d = DecorationContainerView$ActionMode.SELECTED_TAP_OR_MOVE;
       this.e = new Rect();
       this.i = true;
       this.j = new p(this);
       this.l = new LinkedList();
       this.m = new LinkedList();
       this.n = false;
       this.o = false;
       this.A(p0);
    }
    public void DecorationContainerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = true;
       this.c = true;
       this.d = DecorationContainerView$ActionMode.SELECTED_TAP_OR_MOVE;
       this.e = new Rect();
       this.i = true;
       this.j = new p(this);
       this.l = new LinkedList();
       this.m = new LinkedList();
       this.n = false;
       this.o = false;
       this.A(p0);
    }
    public void A(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DecorationContainerView.class, "1")) {
          return;
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, DecorationContainerView.class, "4")) {
          this.f = new GestureDetector(this.getContext(), new d(this), new Handler(Looper.getMainLooper()));
          if (!PatchProxy.applyVoid(objArray, this, DecorationContainerView.class, "19")) {
             this.g = new g(this.getContext(), new e(this));
          }
       }
       this.B(p0);
       return;
    }
    public void B(Context p0){
    }
    public void C(boolean p0){
       this.b = p0;
    }
    public boolean D(){
       return true;
    }
    public void E(){
       if (PatchProxy.applyVoid(null, this, DecorationContainerView.class, "23")) {
          return;
       }
       BaseDrawer gestureTarDe = this.getGestureTargetDecoration();
       if (gestureTarDe != null) {
          gestureTarDe.onDoubleFingerScaleAndRotateEnd();
       }
       this.g(new x(gestureTarDe), gestureTarDe);
       DecorationContainerView tq = this.q;
       if (tq != null) {
          tq.i();
       }
       this.h = false;
       this.e();
       return;
    }
    public void F(){
       if (PatchProxy.applyVoid(null, this, DecorationContainerView.class, "22")) {
          return;
       }
       this.d = DecorationContainerView$ActionMode.DOUBLE_FINGER_SCALE_AND_ROTATE;
       BaseDrawer gestureTarDe = this.getGestureTargetDecoration();
       if (gestureTarDe != null) {
          gestureTarDe.onDoubleFingerScaleAndRotateStart();
       }
       this.g(new w(gestureTarDe), gestureTarDe);
       return;
    }
    public void G(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DecorationContainerView.class, "50")) {
          return;
       }
       if (this.k == p0) {
          this.R();
       }
       return;
    }
    public void H(BaseDrawer p0){
    }
    public void I(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DecorationContainerView.class, "25")) {
          return;
       }
       this.g(new e(p0), p0);
       p0.onSingleFingerMoveEnd();
       DecorationContainerView tq = this.q;
       if (tq != null) {
          tq.i();
       }
       return;
    }
    public void J(){
       if (PatchProxy.applyVoid(null, this, DecorationContainerView.class, "24")) {
          return;
       }
       BaseDrawer gestureTarDe = this.getGestureTargetDecoration();
       if (gestureTarDe == null) {
          Object[] objArray = new Object[0];
          a.D().A("DecorationEditView", "onSingleFingerMoveEnd move but not select", objArray);
          return;
       }else {
          this.I(gestureTarDe);
          return;
       }
    }
    public void K(){
    }
    public void L(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DecorationContainerView.class, "21")) {
          return;
       }
       this.g(new v(p0), p0);
       p0.onSingleFingerScaleAndRotateEnd();
       return;
    }
    public void M(DecorationContainerView$d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DecorationContainerView.class, "30")) {
          return;
       }
       this.m.remove(p0);
       return;
    }
    public boolean N(BaseDrawer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DecorationContainerView.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.O(p0, true);
    }
    public boolean O(BaseDrawer p0,boolean p1){
       Object[] objArray1;
       if (PatchProxy.isSupport(DecorationContainerView.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, DecorationContainerView.class, "43");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Object[] objArray = new Object[0];
       String str = "DecorationEditView";
       a.D().w(str, "selectDecoration |||||||||| decorationDrawer:"+p0, objArray);
       if (p0 == null) {
          objArray1 = new Object[0];
          a.D().A(str, "selectDecoration selected decorationDrawer is null", objArray1);
          return 0;
       }else if(!this.l.contains(p0)){
          objArray1 = new Object[0];
          a.D().A(str, "selectDecoration element was not added", objArray1);
          return 0;
       }else if(!p0.mBaseDrawerData.D()){
          objArray1 = new Object[0];
          a.D().w(str, "selectDecoration element gesture not enable", objArray1);
          return 0;
       }else {
          this.k = p0;
          int i = 0;
          while (i < this.l.size()) {
             BaseDrawer uBaseDrawer = this.l.get(i);
             if (!p0.equals(uBaseDrawer) && p0.mBaseDrawerData.B() < uBaseDrawer.mBaseDrawerData.B()) {
                uBaseDrawer = uBaseDrawer.mBaseDrawerData;
                int i1 = uBaseDrawer.B() - 1;
                uBaseDrawer.c0(i1);
             }
             i = i + 1;
          }
          this.l.remove(p0.mBaseDrawerData.B());
          p0.mBaseDrawerData.c0(0);
          if (!this.l.isEmpty()) {
             p0.mBaseDrawerData.c0(this.l.size());
          }
          p0.mIsSelected = true;
          p0.select();
          this.l.add(p0);
          p0.bringToFront();
          if (p1) {
             this.g(new f(p0), p0);
          }
          return 1;
       }
    }
    public boolean P(){
       return this.o;
    }
    public void Q(boolean p0){
       this.c = p0;
    }
    public boolean R(){
       Object obj = PatchProxy.apply(null, this, DecorationContainerView.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.S(true);
    }
    public boolean S(boolean p0){
       DecorationContainerView obj;
       if (PatchProxy.isSupport(DecorationContainerView.class)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, DecorationContainerView.class, "45");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Object[] objArray = new Object[0];
       a.D().w("DecorationEditView", "unSelectDecoration |||||||||| mSelectedDecorationDrawer:"+this.k, objArray);
       obj = this.k;
       if (obj == null) {
          Object[] objArray1 = new Object[0];
          a.D().w("DecorationEditView", "unSelectDecoration unSelect mSelectedDecorationDrawer is null", objArray1);
          return 0;
       }else if(!this.l.contains(obj)){
          i1.c(new RuntimeException("unSelectElement unSelect drawer not in container"));
          return 0;
       }else {
          obj = this.k;
          obj.unSelect();
          this.k.mIsSelected = false;
          this.k = null;
          if (p0) {
             this.g(new g(obj), obj);
          }
          return true;
       }
    }
    public void T(){
       if (PatchProxy.applyVoid(null, this, DecorationContainerView.class, "26")) {
          return;
       }
       DecorationContainerView tk = this.k;
       if (tk == null) {
          Object[] objArray = new Object[0];
          a.D().A("DecorationEditView", "update error mSelectedDecorationDrawer is null!", objArray);
          return;
       }else {
          this.U(tk);
          return;
       }
    }
    public void U(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DecorationContainerView.class, "27")) {
          return;
       }
       p0.update();
       Object[] objArray = new Object[0];
       a.D().s("DecorationEditView", "update", objArray);
       return;
    }
    public void V(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DecorationContainerView.class, "8")) {
          return;
       }
       this.T();
       return;
    }
    public void W(){
       if (PatchProxy.applyVoid(null, this, DecorationContainerView.class, "47")) {
          return;
       }
       this.e.set(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight());
       return;
    }
    public void X(f$a p0,f$b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DecorationContainerView.class, "2")) {
          return;
       }
       DecorationContainerView tq = this.q;
       if (tq != null) {
          tq.a(p0);
          this.q.f(p1);
       }
       return;
    }
    public boolean c(BaseDrawer p0,boolean p1,Object p2,boolean p3){
       DecorationContainerView obj;
       Object[] objArray1;
       if (PatchProxy.isSupport(DecorationContainerView.class)) {
          obj = PatchProxy.applyFourRefs(p0, Boolean.valueOf(p1), p2, Boolean.valueOf(p3), this, DecorationContainerView.class, "33");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Object[] objArray = new Object[0];
       a.D().w("DecorationEditView", "addDecoration |||||||||| decorationDrawer:"+p0, objArray);
       if (p0 == null) {
          objArray1 = new Object[0];
          a.D().A("DecorationEditView", "addDecoration added decorationDrawer is null", objArray1);
          return 0;
       }else if(this.l.contains(p0)){
          objArray1 = new Object[0];
          a.D().A("DecorationEditView", "addDecoration element is exist in this container", objArray1);
          return 0;
       }else {
          p0.mBaseDrawerData.c0(0);
          if (!this.l.isEmpty()) {
             p0.mBaseDrawerData.c0(this.l.size());
          }
          p0.mEditRect = this.e;
          this.l.add(p0);
          obj = this.q;
          if (obj != null && obj.c()) {
             p0.setInSafeArea(this.q.h(this.u(p0), 0));
          }
          p0.add(this, p1);
          p0.bringToFront();
          this.e();
          if (p3) {
             this.g(new i(p0, p2), p0);
          }
          p2 = new Object[0];
          a.D().w("DecorationEditView", "addDecoration decorationDrawer:"+p0, p2);
          return true;
       }
    }
    public void d(DecorationContainerView$d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DecorationContainerView.class, "29")) {
          return;
       }
       if (p0 != null && !this.m.contains(p0)) {
          this.m.add(p0);
       }
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, DecorationContainerView.class, "51")) {
          return;
       }
       if (this.i != null) {
          this.h();
          this.postDelayed(this.j, 2000);
       }
       return;
    }
    public void f(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DecorationContainerView.class, "55")) {
          return;
       }
       this.g(p0, null);
       return;
    }
    public void g(g p0,BaseDrawer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DecorationContainerView.class, "56")) {
          return;
       }
       Iterator iterator = this.m.iterator();
       while (iterator.hasNext()) {
          try{
             DecorationContainerView$d uod = iterator.next();
             if (p1 != null && !uod.r(p1)) {
                continue ;
             }else {
                p0.accept(uod);
             }
          }catch(java.lang.Exception e1){
             i1.c(e1);
             goto label_0011 ;
          }
       }
       return;
    }
    public List getDecorationDrawerList(){
       return this.l;
    }
    public Rect getEditorRect(){
       return this.e;
    }
    public BaseDrawer getGestureTargetDecoration(){
       return this.k;
    }
    public BaseDrawer getSelectDecorationDrawer(){
       return this.k;
    }
    public BaseDrawer getSelectDrawer(){
       return this.k;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, DecorationContainerView.class, "52")) {
          return;
       }
       if (this.i != null) {
          this.removeCallbacks(this.j);
       }
       return;
    }
    public void i(r p0,BaseDrawer p1){
       boolean b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DecorationContainerView.class, "49")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       try{
          if (p0.test(p1)) {
             b = p1.changeDrawerVisible(true);
             this.H(p1);
          label_0025 :
             if (b) {
                this.U(p1);
             }
          }else {
             this.G(p1);
             b = p1.changeDrawerVisible(false);
             goto label_0025 ;
          }
       }catch(java.lang.Exception e3){
          i1.c(e3);
       }
       return;
    }
    public DecorationContainerView$ActionMode j(){
       return DecorationContainerView$ActionMode.SELECT;
    }
    public boolean k(){
       Object obj = PatchProxy.apply(null, this, DecorationContainerView.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.o(false);
    }
    public boolean l(int p0,boolean p1,Object p2,boolean p3){
       BaseDrawer obj;
       if (PatchProxy.isSupport(DecorationContainerView.class)) {
          obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), Boolean.valueOf(p1), p2, Boolean.valueOf(p3), this, DecorationContainerView.class, "39");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (p0 < 0 || p0 >= this.getDecorationDrawerList().size()) {
          PostUtils.D("DecorationEditView", "deleteDecoration out of bounds", new RuntimeException("deleteDecoration out of bounds, index="+p0+", size="+this.getDecorationDrawerList().size()));
          return b;
       }else {
          BaseDrawer uBaseDrawer = this.getDecorationDrawerList().get(p0);
          if (uBaseDrawer == null) {
             i1.c(new RuntimeException("deleteDecoration deleted drawer is null"));
             return b;
          }else {
             this.l.remove(p0);
             for (; p0 < this.l.size(); p0++) {
                obj = this.l.get(p0).mBaseDrawerData;
                int i = obj.B() - 1;
                obj.c0(i);
             }
             uBaseDrawer.remove(this, p1);
             if (uBaseDrawer == this.k) {
                this.k = null;
             }
             if (p3) {
                this.g(new j(uBaseDrawer, p2), uBaseDrawer);
             }
             return 1;
          }
       }
    }
    public boolean m(BaseDrawer p0,Object p1){
       p1 = PatchProxy.applyTwoRefs(p0, null, this, DecorationContainerView.class, "37");
       if (p1 != PatchProxyResult.class) {
          return p1.booleanValue();
       }
       return this.n(p0, null, true);
    }
    public boolean n(BaseDrawer p0,Object p1,boolean p2){
       if (PatchProxy.isSupport(DecorationContainerView.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, DecorationContainerView.class, "38");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.l(this.getDecorationDrawerList().indexOf(p0), false, p1, p2);
    }
    public boolean o(boolean p0){
       if (PatchProxy.isSupport(DecorationContainerView.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, DecorationContainerView.class, "35");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.p(p0, true);
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       return this.b;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(DecorationContainerView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, DecorationContainerView.class, "3")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       this.e.set(0, 0, this.getWidth(), this.getHeight());
       if (this.getWidth() > 0 && this.getHeight() > 0) {
          this.f(a.b);
       }
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(DecorationContainerView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, DecorationContainerView.class, "10")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       DecorationContainerView tq = this.q;
       if (tq != null) {
          tq.a(tq.g());
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       BaseDrawer obj = PatchProxy.applyOneRefs(p0, this, DecorationContainerView.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       String str = "DecorationEditView";
       if (this.c == null) {
          a.D().z(str, "error", new RuntimeException("onTouchEvent touch disable"));
          return this.b;
       }else {
          this.f(b.b);
          obj = this.getGestureTargetDecoration();
          int i = 0;
          if (obj != null && p0.getPointerCount() > 1) {
             float x = p0.getX(i);
             float y = p0.getY(i);
             float x1 = p0.getX(1);
             float y1 = p0.getY(1);
             if (obj.isInWholeDecoration(x, y) || obj.isInWholeDecoration(x1, y1)) {
                this.g.e(p0);
                if (this.h == null) {
                   this.F();
                }else {
                   obj.onDoubleFingerScaleAndRotateProcess();
                   this.g(new u(obj), obj);
                }
                Object[] objArray = new Object[i];
                a.D().s(str, "detectorDoubleFingerRotateAndScale |||||||||| mIsInDoubleFinger:"+this.h+",x0:"+x+",x1:"+x1+",y0:"+y+",y1:"+y1, objArray);
                this.h = true;
             }
             return 1;
          }else if(this.h != null){
             this.E();
             return 1;
          }else {
             DecorationContainerView tp = this.p;
             if (tp != null) {
                tp.setTag(Boolean.TRUE);
                this.p.dispatchTouchEvent(p0);
             }
             if (!p0.getAction()) {
                this.h();
             }else if(p0.getAction() == 1){
                this.e();
             }
             if (this.d == DecorationContainerView$ActionMode.MOVE && (p0.getAction() == 1 && obj != null)) {
                this.J();
                return 1;
             }else if(this.d == DecorationContainerView$ActionMode.SINGLE_FINGER_SCALE_AND_ROTATE && (p0.getAction() == 1 && obj != null)){
                this.L(obj);
                DecorationContainerView tq = this.q;
                if (tq != null) {
                   tq.i();
                }
                return 1;
             }else if(this.n != null){
                this.f.onTouchEvent(p0);
                obj = this.getGestureTargetDecoration();
                if (!p0.getAction() && (obj != null && (obj.mIsSelected != null && !obj.isInWholeDecoration(p0.getX(i), p0.getY(i))))) {
                   this.R();
                   return 1;
                }else if(obj != null && obj.isInWholeDecoration(p0.getX(i), p0.getY(i))){
                   i = true;
                }
                return i;
             }else {
                return this.f.onTouchEvent(p0);
             }
          }
       }
    }
    public boolean p(boolean p0,boolean p1){
       if (PatchProxy.isSupport(DecorationContainerView.class)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, DecorationContainerView.class, "36");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.l.isEmpty()) {
          return false;
       }else {
          return this.l((this.l.size() - 1), p0, null, p1);
       }
    }
    public void q(MotionEvent p0,float p1,float p2){
       if (PatchProxy.isSupport(DecorationContainerView.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, DecorationContainerView.class, "13")) {
          return;
       }
       BaseDrawer gestureTarDe = this.getGestureTargetDecoration();
       if (gestureTarDe == null) {
          return;
       }
       DecorationContainerView tq = this.q;
       if (tq == null) {
          gestureTarDe.onSingleFingerMoveProcess((- p1), (- p2));
          this.g(new r(gestureTarDe), gestureTarDe);
          return;
       }else {
          boolean b = true;
          if (!tq.c() || this.q.h(this.u(gestureTarDe), b)) {
             b = false;
          }
          if (!b) {
             this.q.i();
             gestureTarDe.onSingleFingerMoveProcess((- p1), (- p2));
             this.g(new s(gestureTarDe), gestureTarDe);
             return;
          }else {
             Pair pair = this.q.d(p0, p1, p2, this.u(gestureTarDe));
             gestureTarDe.onSingleFingerMoveProcess((- pair.first.floatValue()), (- pair.second.floatValue()));
             this.g(new t(gestureTarDe), gestureTarDe);
             return;
          }
       }
    }
    public boolean r(MotionEvent p0,float p1,float p2){
       DecorationContainerView obj;
       if (PatchProxy.isSupport(DecorationContainerView.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, DecorationContainerView.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.k == null) {
          Object[] objArray = new Object[0];
          a.D().s("DecorationEditView", "detectorSingleFingerRotateAndScale scale and rotate but not select", objArray);
          return 0;
       }else {
          obj = this.q;
          if (obj != null) {
             obj = (obj.c() && !this.q.h(this.u(this.k), true))? 1: null;
             if (!obj) {
                this.q.i();
             }else {
                this.q.b();
             }
          }
          this.k.onSingleFingerScaleAndRotateProcess(p0.getX(), p0.getY());
          this.T();
          this.g(new l(this), this.k);
          Object[] objArray1 = new Object[0];
          a.D().s("DecorationEditView", "detectorSingleFingerRotateAndScale scale and rotate |||||||||| distanceX:"+p1+"distanceY:"+p2, objArray1);
          return true;
       }
    }
    public BaseDrawer s(float p0,float p1){
       BaseDrawer uBaseDrawer;
       if (PatchProxy.isSupport(DecorationContainerView.class)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, DecorationContainerView.class, "40");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray = new Object[0];
       a.D().s("DecorationEditView", "findDecorationDrawerFromPosition |||||||||| x:"+p0+",y:"+p1, objArray);
       int i = this.l.size() - 1;
       while (true) {
          if (i < 0) {
             return null;
          }
          uBaseDrawer = this.l.get(i);
          if (uBaseDrawer.isInWholeDecoration(p0, p1) && uBaseDrawer.mBaseDrawerData.D()) {
             break ;
          }else {
             i = i - 1;
          }
       }
       return uBaseDrawer;
    }
    public void setEnableAutoUnSelect(boolean p0){
       this.i = p0;
    }
    public void setScaleX(float p0){
       if (PatchProxy.isSupport(DecorationContainerView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, DecorationContainerView.class, "53")) {
          return;
       }
       super.setScaleX(p0);
       View parent = this.getParent();
       Iterator iterator = this.l.iterator();
       while (iterator.hasNext()) {
          float f = parent.getScaleX() * p0;
          iterator.next().mBaseDrawerData.X(f);
       }
       if (this.q != null) {
          this.getViewTreeObserver().addOnGlobalLayoutListener(new DecorationContainerView$a(this));
       }
       Object[] objArray = new Object[0];
       a.D().w("DecorationEditView", "setScaleX scaleX:"+p0, objArray);
       return;
    }
    public void setScaleY(float p0){
       if (PatchProxy.isSupport(DecorationContainerView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, DecorationContainerView.class, "54")) {
          return;
       }
       super.setScaleY(p0);
       View parent = this.getParent();
       Iterator iterator = this.l.iterator();
       while (iterator.hasNext()) {
          float f = parent.getScaleY() * p0;
          iterator.next().mBaseDrawerData.X(f);
       }
       if (this.q != null) {
          this.getViewTreeObserver().addOnGlobalLayoutListener(new DecorationContainerView$b(this));
       }
       Object[] objArray = new Object[0];
       a.D().w("DecorationEditView", "setScaleX scaleY:"+p0, objArray);
       return;
    }
    public void setShowCustomButton(boolean p0){
       this.o = p0;
    }
    public void setUndersideView(View p0){
       this.p = p0;
    }
    public void setVideoCoverNeedTouchEvent(boolean p0){
       this.n = p0;
    }
    public void setVisibility(int p0){
       if (PatchProxy.isSupport(DecorationContainerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, DecorationContainerView.class, "9")) {
          return;
       }
       super.setVisibility(p0);
       DecorationContainerView tq = this.q;
       if (tq != null) {
          tq.i();
       }
       return;
    }
    public List t(r p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, DecorationContainerView.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = this.l.iterator();
       while (iterator.hasNext()) {
          BaseDrawer uBaseDrawer = iterator.next();
          try{
             if (p0.test(uBaseDrawer)) {
                obj.add(uBaseDrawer);
             }
          }catch(java.lang.Exception e2){
             i1.c(e2);
             goto label_001a ;
          }
       }
       return obj;
    }
    public Rect u(BaseDrawer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DecorationContainerView.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.getOutBoxRect();
    }
    public boolean v(MotionEvent p0){
       return false;
    }
    public void w(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DecorationContainerView.class, "6")) {
          return;
       }
       this.d = DecorationContainerView$ActionMode.SELECT;
       this.N(p0);
       this.T();
       return;
    }
    public boolean x(MotionEvent p0){
       this.d = DecorationContainerView$ActionMode.SINGLE_TAP_BLANK_SCREEN;
       return true;
    }
    public boolean y(MotionEvent p0){
       Object[] obj = PatchProxy.applyOneRefs(p0, this, DecorationContainerView.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.g(new n(this, p0), this.k);
       obj = new Object[0];
       a.D().A("DecorationEditView", "detectorSingleFingerUp tap blank screen", obj);
       return true;
    }
    public void z(BaseDrawer p0){
    }
}
