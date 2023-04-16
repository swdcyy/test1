package com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import android.content.Context;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView$a;
import android.util.AttributeSet;
import a17.c;
import android.view.View;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer;
import com.yxcorp.gifshow.decoration.widget.DecorationView;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationView;
import java.lang.String;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Double;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Math;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import aqc.a;
import com.yxcorp.gifshow.decoration.widget.f;
import android.widget.AbsoluteLayout;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import android.graphics.Rect;
import java.util.LinkedList;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import com.yxcorp.gifshow.v3.editor.decoration.c;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;
import wpc.d;
import erd.g;
import xv9.b;
import wpc.i;
import erd.r;
import com.yxcorp.gifshow.util.PostUtils;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView$b;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import wpc.j;
import java.util.ArrayList;
import wpc.e;
import java.lang.Integer;
import java.lang.Float;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import gq.a;
import java.util.Iterator;
import android.widget.AbsoluteLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import wpc.c;
import a17.b$b;
import a17.b$a;
import aqc.b;
import wpc.f;
import com.yxcorp.gifshow.v3.editor.decoration.b;
import java.util.Collection;
import ekd.q$a;
import ekd.q;

public class EditDecorationContainerView extends DecorationContainerView	// class@000ef7
{
    public TextView s;
    public EditDecorationView t;
    public boolean u;
    public boolean v;
    public boolean w;
    public EditDecorationContainerView$b x;
    public DecorationContainerView$e y;
    public static final int z;

    public void EditDecorationContainerView(Context p0){
       super(p0);
       this.s = null;
       this.u = true;
       this.v = false;
       this.w = false;
       this.y = new EditDecorationContainerView$a(this);
    }
    public void EditDecorationContainerView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.s = null;
       this.u = true;
       this.v = false;
       this.w = false;
       this.y = new EditDecorationContainerView$a(this);
    }
    public void EditDecorationContainerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.s = null;
       this.u = true;
       this.v = false;
       this.w = false;
       this.y = new EditDecorationContainerView$a(this);
    }
    public static void Y(EditDecorationContainerView p0,boolean p1,boolean p2,c p3,View p4,int p5){
       if (p0.u != null) {
          p0.t.setDecorationDrawer(null);
          p0.t.setVisibility(8);
          p0.t.setIconImageRes(0);
          p0.t.d("");
       }
       super.p(p1, p2);
       return;
    }
    public static boolean s0(EditDecorationBaseDrawer p0,double p1){
       if (PatchProxy.isSupport(EditDecorationContainerView.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Double.valueOf(p1), null, EditDecorationContainerView.class, "54");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return EditDecorationContainerView.t0(p0, p1, 0);
    }
    public static boolean t0(EditDecorationBaseDrawer p0,double p1,double p2){
       if (PatchProxy.isSupport(EditDecorationContainerView.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Double.valueOf(p1), Double.valueOf(p2), null, EditDecorationContainerView.class, "55");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       double d = (p0.getStartTime() * 10000.00f) + (p2 * 10000.00f);
       long l = Math.round(d);
       long l1 = Math.round((d + (p0.getDuration() * 10000.00f)));
       long l2 = Math.round((10000.00f * p1));
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().s("luodaming", "time£º"+p1+" drawer start: "+l+" drawer end: "+l1, objArray);
       if (l - l2 <= 0 && l2 - l1 <= 0) {
          i = true;
       }
       return i;
    }
    public void A(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditDecorationContainerView.class, "1")) {
          return;
       }
       super.A(p0);
       this.setEnableAutoUnSelect(false);
       return;
    }
    public void A0(){
       if (PatchProxy.applyVoid(null, this, EditDecorationContainerView.class, "5")) {
          return;
       }
       this.t.setAlpha(0x3f800000);
       return;
    }
    public void B(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditDecorationContainerView.class, "2")) {
          return;
       }
       a uoa = new a(p0);
       this.q = uoa;
       this.addView(uoa.e());
       this.q.i();
       this.d(this.y);
       return;
    }
    public void B0(){
       if (PatchProxy.applyVoid(null, this, EditDecorationContainerView.class, "6")) {
          return;
       }
       this.t.setAlpha(0);
       return;
    }
    public void C0(EditDecorationBaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditDecorationContainerView.class, "21")) {
          return;
       }
       super.U(p0);
       this.t.invalidate();
       return;
    }
    public boolean D(){
       return false;
    }
    public void J(){
       if (PatchProxy.applyVoid(null, this, EditDecorationContainerView.class, "44")) {
          return;
       }
       EditDecorationBaseDrawer gestureTarDe = this.getGestureTargetDecoration();
       if (gestureTarDe == null) {
          return;
       }
       DecorationContainerView tq = this.q;
       if (tq != null && tq.c()) {
          gestureTarDe.setInSafeArea(this.q.h(this.u(gestureTarDe), false));
       }
       super.J();
       return;
    }
    public boolean N(BaseDrawer p0){
       return this.w0(p0);
    }
    public boolean O(BaseDrawer p0,boolean p1){
       return this.x0(p0, p1);
    }
    public boolean R(){
       Object obj = PatchProxy.apply(null, this, EditDecorationContainerView.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.S(true);
    }
    public boolean S(boolean p0){
       DecorationContainerView obj;
       if (PatchProxy.isSupport(EditDecorationContainerView.class)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, EditDecorationContainerView.class, "35");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       DecorationDrawer uDecorationD = null;
       if (this.u != null) {
          this.t.setDecorationDrawer(uDecorationD);
          this.t.setVisibility(8);
          this.t.setIconImageRes(0);
          this.t.d("");
       }
       Object[] objArray = new Object[0];
       a.D().w("EditDecorationContainerView", "unSelectDecoration |||||||||| mSelectedDecorationDrawer:"+this.k, objArray);
       obj = this.k;
       if (obj == null) {
          Object[] objArray1 = new Object[0];
          a.D().w("EditDecorationContainerView", "unSelectDecoration unSelect mSelectedDecorationDrawer is null", objArray1);
          return 0;
       }else if(!this.l.contains(obj)){
          i1.c(new RuntimeException("unSelectElement unSelect drawer not in container"));
          return 0;
       }else {
          Collections.sort(this.l, c.b);
          for (int i = 0; i < this.l.size(); i = i + 1) {
             if (this.l.get(i).getLayerIndex() > this.k.getLayerIndex()) {
                this.l.get(i).bringToFront();
             }
             this.l.get(i).setZIndex(i);
          }
          obj = this.k;
          DecorationContainerView uDecorationC = obj;
          obj.unSelect();
          this.k.setOutBoxAdditionalWidth(0);
          this.k.mIsSelected = false;
          this.k = uDecorationD;
          if (p0) {
             this.g(new d(uDecorationC), uDecorationC);
          }
          return true;
       }
    }
    public void T(){
       if (PatchProxy.applyVoid(null, this, EditDecorationContainerView.class, "20")) {
          return;
       }
       super.T();
       this.t.invalidate();
       this.getWidth();
       this.getHeight();
       return;
    }
    public void U(BaseDrawer p0){
       this.C0(p0);
    }
    public boolean Z(EditDecorationBaseDrawer p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, EditDecorationContainerView.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a0(p0, p1, true);
    }
    public boolean a0(EditDecorationBaseDrawer p0,Object p1,boolean p2){
       if (PatchProxy.isSupport(EditDecorationContainerView.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, EditDecorationContainerView.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (this.c(p0, b, p1, p2) && this.x0(p0, p2)) {
          b = true;
       }
       this.T();
       return b;
    }
    public boolean b0(EditDecorationBaseDrawer p0,Object p1,boolean p2){
       if (PatchProxy.isSupport(EditDecorationContainerView.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, EditDecorationContainerView.class, "19");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.d0(new i(this), p0);
       this.C0(p0);
       return this.c(p0, false, p1, p2);
    }
    public void c0(r p0,boolean p1){
       if (PatchProxy.isSupport(EditDecorationContainerView.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, EditDecorationContainerView.class, "46")) {
          return;
       }
       int i = 0;
       while (i < this.l.size()) {
          DecorationDrawer uDecorationD = this.l.get(i);
          try{
             if (p0.test(uDecorationD)) {
                int i1 = 0x1000000;
                if (p1) {
                   if (!uDecorationD.isGestureEnable()) {
                      uDecorationD.enableAction(i1);
                   }
                }else if(uDecorationD.isGestureEnable()){
                   uDecorationD.disableAction(i1);
                }
             }
          }catch(java.lang.Exception e1){
             PostUtils.D("EditDecorationContainerView", "changeAllElementAllAction", e1);
          }
          i = i + 1;
       }
       return;
    }
    public void d0(r p0,EditDecorationBaseDrawer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EditDecorationContainerView.class, "43")) {
          return;
       }
       super.i(p0, p1);
       if (p1 != null) {
          try{
             EditDecorationContainerView tx = this.x;
             if (tx != null && (tx.e(p1) && p0.test(p1))) {
                this.w0(p1);
             }
          }catch(java.lang.Exception e3){
             PostUtils.D("EditDecorationContainerView", "changeDrawerItemVisible", e3);
          }
       }
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EditDecorationContainerView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.w != null) {
          Object[] objArray = new Object[0];
          a.D().w("EditDecorationContainerView", "ignore All Touch Event....", objArray);
          return 0;
       }else {
          boolean b = true;
          try{
             this.v = b;
             boolean b1 = super.dispatchTouchEvent(p0);
             if (this.v != null) {
                super.onTouchEvent(p0);
             }
             return b1;
          }catch(java.lang.Exception e5){
             PostUtils.D("EditDecorationContainerView", "dispatchTouchEvent", e5);
             ExceptionHandler.handleCaughtException(e5);
             return b;
          }
       }
    }
    public void e0(){
       if (PatchProxy.applyVoid(null, this, EditDecorationContainerView.class, "42")) {
          return;
       }
       int i = 0;
       if (this.x == null) {
          Object[] objArray = new Object[i];
          a.D().w("EditDecorationContainerView", "changeDrawersVisible mShowingDelegate is null", objArray);
          return;
       }else {
          j oj = new j(this);
          if (!PatchProxy.applyVoidOneRefs(oj, this, DecorationContainerView.class, "48")) {
             for (; i < this.l.size(); i = i + 1) {
                this.i(oj, this.l.get(i));
             }
          }
          return;
       }
    }
    public void f0(r p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EditDecorationContainerView.class, "29")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       int i = 0;
       int i1 = 0;
       while (i1 < this.l.size()) {
          try{
             if (p0.test(this.l.get(i1))) {
                uArrayList.add(this.l.get(i1));
             }
          }catch(java.lang.Exception e3){
             PostUtils.D("EditDecorationContainerView", "deleteAll", e3);
          }
          i1 = i1 + 1;
       }
       for (; i < uArrayList.size(); i = i + 1) {
          this.j0(uArrayList.get(i).getLayerIndex(), p1);
       }
       return;
    }
    public boolean g0(EditDecorationBaseDrawer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EditDecorationContainerView.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.m(p0, null);
    }
    public EditDecorationView getDecorationView(){
       Object obj = PatchProxy.apply(null, this, EditDecorationContainerView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new EditDecorationView(this.getContext());
    }
    public EditDecorationContainerView$b getShowingDelegate(){
       return this.x;
    }
    public DecorationDrawer getTopDecorationDrawer(){
       Object obj = PatchProxy.apply(null, this, EditDecorationContainerView.class, "52");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.l.isEmpty()) {
          return null;
       }
       return this.l.getLast();
    }
    public EditDecorationBaseDrawer getTopElement(){
       Object obj = PatchProxy.apply(null, this, EditDecorationContainerView.class, "51");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.l.isEmpty()) {
          return null;
       }
       return this.l.getLast();
    }
    public boolean h0(EditDecorationBaseDrawer p0,Object p1,boolean p2){
       if (PatchProxy.isSupport(EditDecorationContainerView.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, EditDecorationContainerView.class, "40");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return super.n(p0, p1, p2);
    }
    public void i(r p0,BaseDrawer p1){
       this.d0(p0, p1);
    }
    public final boolean i0(EditDecorationBaseDrawer p0,Object p1,boolean p2){
       int i1;
       if (PatchProxy.isSupport(EditDecorationContainerView.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, EditDecorationContainerView.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = this.l.indexOf(p0);
       boolean b = false;
       if (i < 0 || i >= this.l.size()) {
          i1.c(new RuntimeException("deleteDecoration out of bounds"));
          return b;
       }else if(p0 == null){
          i1.c(new RuntimeException("deleteDecoration deleted drawer is null"));
          return b;
       }else {
          this.l.remove(i);
          for (; i < this.l.size(); i = i + 1) {
             EditDecorationBaseDrawer uEditDecorat = this.l.get(i);
             i1 = uEditDecorat.getZIndex() - 1;
             uEditDecorat.setZIndex(i1);
          }
          if (p0 == this.k) {
             this.k = null;
          }
          if (p2) {
             this.g(new e(p0, p1), p0);
          }
          return 1;
       }
    }
    public boolean j0(int p0,Object p1){
       if (PatchProxy.isSupport(EditDecorationContainerView.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, EditDecorationContainerView.class, "27");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.k0(p0, p1, true);
    }
    public boolean k0(int p0,Object p1,boolean p2){
       EditDecorationBaseDrawer uEditDecorat;
       if (PatchProxy.isSupport(EditDecorationContainerView.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), this, EditDecorationContainerView.class, "28");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Object[] objArray = new Object[0];
       a.D().w("EditDecorationContainerView", "deleteFromLayerIndex layerIndex:"+p0, objArray);
       int i = 0;
       while (true) {
          if (i >= this.l.size()) {
             return 0;
          }
          uEditDecorat = this.l.get(i);
          if (uEditDecorat.getLayerIndex() == p0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       this.h0(uEditDecorat, p1, p2);
       return true;
    }
    public void l0(){
       if (PatchProxy.applyVoid(null, this, EditDecorationContainerView.class, "53")) {
          return;
       }
       DecorationContainerView tq = this.q;
       if (tq != null) {
          tq.detach();
       }
       return;
    }
    public EditDecorationBaseDrawer m0(float p0,float p1){
       ArrayList obj;
       EditDecorationBaseDrawer uEditDecorat1;
       Object[] objArray1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "41";
       if (PatchProxy.isSupport(EditDecorationContainerView.class)) {
          obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, EditDecorationContainerView.class, str);
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (PatchProxy.isSupport(DecorationContainerView.class)) {
          obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, DecorationContainerView.class, str);
          if (obj != patchProxyRe) {
          label_0090 :
             EditDecorationBaseDrawer uEditDecorat = null;
             if (obj.isEmpty() || this.x == null) {
                Object[] objArray = new Object[0];
                a.D().w("EditDecorationContainerView", "findDecorationDrawerFromPosition mShowingDelegate:"+this.x, objArray);
                return uEditDecorat;
             }else {
                int i = 0;
                while (true) {
                   if (i < obj.size()) {
                      uEditDecorat1 = obj.get(i);
                      if (this.x.d(uEditDecorat1) && this.x.a(uEditDecorat1)) {
                         break ;
                      }else {
                         i++;
                      }
                   }else {
                      objArray1 = new Object[0];
                      a.D().w("EditDecorationContainerView", "findDecorationDrawerFromPosition now time not in drawer", objArray1);
                      return uEditDecorat;
                   }
                }
                objArray1 = new Object[0];
                a.D().w("EditDecorationContainerView", "findDecorationDrawerFromPosition now time in drawer i:"+i+",editDecorationBaseDrawer:"+uEditDecorat1, objArray1);
                return uEditDecorat1;
             }
          }
       }
       obj = new ArrayList();
       int i1 = this.l.size();
       i1 = i1 - 1;
       while (i1 >= 0) {
          BaseDrawer uBaseDrawer = this.l.get(i1);
          if (uBaseDrawer.isInWholeDecoration(p0, p1) && uBaseDrawer.mBaseDrawerData.D()) {
             obj.add(uBaseDrawer);
          }
       }
       Object[] objArray2 = new Object[0];
       a.D().s("DecorationEditView", "findDecorationDrawerListFromPosition |||||||||| realFindDecorationDrawerList:"+obj+",x:"+p0+",y:"+p1, objArray2);
       goto label_0090 ;
    }
    public boolean n(BaseDrawer p0,Object p1,boolean p2){
       return this.h0(p0, p1, p2);
    }
    public EditDecorationBaseDrawer n0(int p0){
       Iterator obj;
       EditDecorationBaseDrawer uEditDecorat;
       if (PatchProxy.isSupport(EditDecorationContainerView.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, EditDecorationContainerView.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.l.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return null;
          }
          uEditDecorat = obj.next();
          if (uEditDecorat.getLayerIndex() == p0) {
             break ;
          }
       }
       return uEditDecorat;
    }
    public boolean o(boolean p0){
       if (PatchProxy.isSupport(EditDecorationContainerView.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, EditDecorationContainerView.class, "38");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.p(p0, true);
    }
    public List o0(r p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, EditDecorationContainerView.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       int i = 0;
       while (i < this.l.size()) {
          try{
             if (p0.test(this.l.get(i))) {
                obj.add(this.l.get(i));
             }
          }catch(java.lang.Exception e2){
             PostUtils.D("EditDecorationContainerView", "findElementList", e2);
          }
          i = i + 1;
       }
       return obj;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, EditDecorationContainerView.class, "3")) {
          return;
       }
       super.onFinishInflate();
       this.t = this.getDecorationView();
       this.t.setLayoutParams(new AbsoluteLayout$LayoutParams(-1, -1, 0, 0));
       this.addView(this.t);
       if (this.u == null) {
          this.t.setVisibility(8);
       }
       this.s = null;
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       DecorationContainerView obj = PatchProxy.applyOneRefs(p0, this, EditDecorationContainerView.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.k;
       if (obj != null && (obj.mIsSelected != null && (obj.interceptTouchEvent() && BaseDrawer.isSameDrawer(this.m0(p0.getX(), p0.getY()), this.k)))) {
          return false;
       }
       return super.onInterceptTouchEvent(p0);
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EditDecorationContainerView.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.v = false;
       return super.onTouchEvent(p0);
    }
    public boolean p(boolean p0,boolean p1){
       EditDecorationContainerView obj;
       if (PatchProxy.isSupport(EditDecorationContainerView.class)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, EditDecorationContainerView.class, "37");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.x;
       b$a uoa = null;
       if (obj != null && obj.f(this.k)) {
          this.x.c(new c(this, p0, p1), uoa);
          return true;
       }else if(this.u != null){
          this.t.setDecorationDrawer(uoa);
          this.t.setVisibility(8);
          this.t.setIconImageRes(0);
          this.t.d("");
       }
       return super.p(p0, p1);
    }
    public EditDecorationBaseDrawer p0(int p0){
       EditDecorationBaseDrawer uEditDecorat;
       if (PatchProxy.isSupport(EditDecorationContainerView.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, EditDecorationContainerView.class, "45");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = 0;
       while (true) {
          if (i >= this.l.size()) {
             return null;
          }
          uEditDecorat = this.l.get(i);
          if (uEditDecorat.getLayerIndex() == p0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return uEditDecorat;
    }
    public Rect q0(BaseDrawer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EditDecorationContainerView.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.d(p0.getContentRect(), p0.getFinalRotate());
    }
    public boolean r0(EditDecorationBaseDrawer p0,Object p1){
       int i1;
       DecorationContainerView obj = PatchProxy.applyTwoRefs(p0, p1, this, EditDecorationContainerView.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("EditDecorationContainerView", "insertFromLayerIndex |||||||||| drawer:"+p0, objArray);
       if (this.l.contains(p0)) {
          i1.c(new RuntimeException("insert drawer exist"));
          return i;
       }else if(p0.getLayerIndex() < 0){
          i1.c(new RuntimeException("insert layerIndex error "+p0));
          return i;
       }else {
          i1 = 0;
          int i2 = 0;
          while (true) {
             if (i1 < this.l.size()) {
                EditDecorationBaseDrawer uEditDecorat = this.l.get(i1);
                if (uEditDecorat.getLayerIndex() < p0.getLayerIndex()) {
                   i2 = i1 + 1;
                }else if(uEditDecorat.getLayerIndex() > p0.getLayerIndex()){
                label_00b1 :
                   p0.mEditRect = this.e;
                   this.l.add(i2, p0);
                   for (i1 = 0; i1 < this.l.size(); i1 = i1 + 1) {
                      this.l.get(i1).setZIndex(i1);
                   }
                   obj = this.q;
                   if (obj != null && obj.c()) {
                      p0.setInSafeArea(this.q.h(this.u(p0), i));
                   }
                   p0.insert(this);
                   for (i2 = i2 + 1; i2 < this.l.size(); i2 = i2 + 1) {
                      this.l.get(i2).bringToFront();
                   }
                   this.g(new f(p0, p1), p0);
                   return 1;
                }else {
                   i1.c(new RuntimeException("insert layerIndex error drawer:"+p0+",nowDecorationDrawer:"+uEditDecorat));
                }
                i1 = i1 + 1;
             }else {
                goto label_00b1 ;
             }
          }
       }
    }
    public BaseDrawer s(float p0,float p1){
       return this.m0(p0, p1);
    }
    public void setDelegate(EditDecorationContainerView$b p0){
       this.x = p0;
    }
    public void setEnableDecorationView(boolean p0){
       this.u = p0;
    }
    public void setIgnoreAllTouchEvent(boolean p0){
       this.w = p0;
    }
    public Rect u(BaseDrawer p0){
       Rect obj = PatchProxy.applyOneRefs(p0, this, EditDecorationContainerView.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (p0.isEnableSelectBox())? p0.getOutBoxRect(): p0.getContentRect();
       return b.d(obj, p0.getFinalRotate());
    }
    public void u0(){
       if (PatchProxy.applyVoid(null, this, EditDecorationContainerView.class, "31")) {
          return;
       }
       this.v0(q.g(this.l, b.a));
       return;
    }
    public void v0(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditDecorationContainerView.class, "30")) {
          return;
       }
       ArrayList uArrayList = new ArrayList(this.m);
       this.m.clear();
       for (int i = p0.size() - 1; i >= 0; i = i - 1) {
          this.m(p0.get(i), null);
       }
       this.R();
       this.m.addAll(uArrayList);
       return;
    }
    public boolean w0(EditDecorationBaseDrawer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EditDecorationContainerView.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.x0(p0, true);
    }
    public boolean x0(EditDecorationBaseDrawer p0,boolean p1){
       if (PatchProxy.isSupport(EditDecorationContainerView.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, EditDecorationContainerView.class, "33");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = super.O(p0, p1);
       if (b && this.u != null) {
          this.k.update();
          this.t.bringToFront();
          this.t.setVisibility(0);
          this.t.setDecorationDrawer(this.k);
          this.T();
       }
       return b;
    }
    public void y0(int p0){
       if (PatchProxy.isSupport(EditDecorationContainerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, EditDecorationContainerView.class, "22")) {
          return;
       }
       this.z0(p0, true);
       return;
    }
    public void z0(int p0,boolean p1){
       EditDecorationBaseDrawer uEditDecorat;
       if (PatchProxy.isSupport(EditDecorationContainerView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, EditDecorationContainerView.class, "23")) {
          return;
       }
       int i = 0;
       while (true) {
          if (i >= this.l.size()) {
             return;
          }
          uEditDecorat = this.l.get(i);
          if (uEditDecorat.getLayerIndex() == p0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       this.x0(uEditDecorat, p1);
       return;
    }
}
