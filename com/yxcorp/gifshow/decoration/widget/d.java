package com.yxcorp.gifshow.decoration.widget.d;
import android.view.GestureDetector$OnGestureListener;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import java.lang.Object;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Objects;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$ActionMode;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import aw9.k;
import erd.g;
import java.lang.Float;
import aw9.d;
import aw9.q;
import com.yxcorp.gifshow.decoration.widget.f;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$c;
import java.lang.Enum;
import aw9.m;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import aw9.h;

public class d implements GestureDetector$OnGestureListener	// class@0012bd
{
    public final DecorationContainerView b;

    public void d(DecorationContainerView p0){
       this.b = p0;
       super();
    }
    public boolean onDown(MotionEvent p0){
       boolean b1;
       Object[] objArray1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d obj = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.b;
       boolean b = false;
       if (obj.h != null) {
          return b;
       }
       Objects.requireNonNull(obj);
       Object[] obj1 = PatchProxy.applyOneRefs(p0, obj, DecorationContainerView.class, "5");
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
       }else {
          float x = p0.getX();
          float y = p0.getY();
          obj.d = DecorationContainerView$ActionMode.MOVE;
          BaseDrawer uBaseDrawer = obj.s(x, y);
          Object[] objArray = new Object[b];
          a.D().s("DecorationEditView", "detectorSingleFingerDown |||||||||| x:"+x+",y:"+y, objArray);
          DecorationContainerView k = obj.k;
          if (k != null) {
             if (BaseDrawer.isSameDrawer(uBaseDrawer, k)) {
                obj.z(uBaseDrawer);
                if (obj.k.isInScaleAndRotateButton(x, y)) {
                   obj.d = DecorationContainerView$ActionMode.SINGLE_FINGER_SCALE_AND_ROTATE;
                   obj.k.onSingleFingerScaleAndRotateStart(x, y);
                   obj.g(new k(obj), obj.k);
                   objArray1 = new Object[b];
                   a.D().s("DecorationEditView", "detectorSingleFingerDown selected scale and rotate", objArray1);
                }else if(obj.k.isInCustomButton(x, y)){
                   obj.d = DecorationContainerView$ActionMode.SINGLE_TAP_CUSTOM_BUTTON;
                   objArray1 = new Object[b];
                   a.D().s("DecorationEditView", "detectorSingleFingerDown selected click custom button", objArray1);
                }else if(obj.k.isInRemoveButton(x, y)){
                   obj.d = DecorationContainerView$ActionMode.DELETE;
                   objArray1 = new Object[b];
                   a.D().s("DecorationEditView", "detectorSingleFingerDown selected delete", objArray1);
                }else if(obj.k.isInWholeDecoration(x, y)){
                   obj.d = DecorationContainerView$ActionMode.SELECTED_TAP_OR_MOVE;
                   objArray1 = new Object[b];
                   a.D().s("DecorationEditView", "detectorSingleFingerDown selected edit or move", objArray1);
                }else {
                   objArray1 = new Object[b];
                   a.D().A("DecorationEditView", "detectorSingleFingerDown warning not hit any action", objArray1);
                }
             }else if(uBaseDrawer == null){
                obj1 = new Object[b];
                a.D().s("DecorationEditView", "detectorSingleFingerDown selected click blank", obj1);
                b1 = obj.x(p0);
             }else {
                obj.R();
                obj.w(uBaseDrawer);
                objArray1 = new Object[b];
                a.D().s("DecorationEditView", "detectorSingleFingerDown selected click new drawer", objArray1);
             }
          }else if(uBaseDrawer != null){
             obj.w(uBaseDrawer);
             objArray1 = new Object[b];
             a.D().s("DecorationEditView", "detectorSingleFingerDown unSelected click new drawer", objArray1);
          }else {
             obj1 = new Object[b];
             a.D().s("DecorationEditView", "detectorSingleFingerDown unselected click blank", obj1);
             b1 = obj.x(p0);
          }
          b1 = true;
       }
       return b1;
    }
    public boolean onFling(MotionEvent p0,MotionEvent p1,float p2,float p3){
       if (PatchProxy.isSupport(d.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Float.valueOf(p2), Float.valueOf(p3), this, d.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.isSupport(DecorationContainerView.class) && (!PatchProxy.applyVoidFourRefs(p0, p1, Float.valueOf(p2), Float.valueOf(p3), tb, DecorationContainerView.class, "15") && tb.d == DecorationContainerView$ActionMode.SINGLE_TAP_BLANK_SCREEN)) {
          tb.f(new d(p0, p1, p2, p3));
       }
       return false;
    }
    public void onLongPress(MotionEvent p0){
    }
    public boolean onScroll(MotionEvent p0,MotionEvent p1,float p2,float p3){
       String obj;
       Object[] objArray;
       DecorationContainerView d;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(d.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Float.valueOf(p2), Float.valueOf(p3), this, d.class, "3");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       obj = "DecorationEditView";
       int i = 0;
       if (p0 != null && (p1 != null && p0.getPointerId(i) != p1.getPointerId(i))) {
          objArray = new Object[i];
          a.D().s(obj, "onScroll double finger", objArray);
          return i;
       }else {
          d tb = this.b;
          d = tb.d;
          DecorationContainerView$ActionMode sELECTED_TAP = DecorationContainerView$ActionMode.SELECTED_TAP_OR_MOVE;
          if (d != sELECTED_TAP && (d == DecorationContainerView$ActionMode.MOVE || d == tb.j())) {
             tb = this.b;
             Objects.requireNonNull(tb);
             if (PatchProxy.isSupport(DecorationContainerView.class)) {
                Object obj1 = PatchProxy.applyThreeRefs(p1, Float.valueOf(p2), Float.valueOf(p3), tb, DecorationContainerView.class, "7");
                if (obj1 != patchProxyRe) {
                   i = obj1.booleanValue();
                }else {
                label_008d :
                   BaseDrawer gestureTarDe = tb.getGestureTargetDecoration();
                   if (gestureTarDe == null) {
                      objArray = new Object[i];
                      a.D().s(obj, "detectorSingleFingerMove move but not select", objArray);
                   }else {
                      d = tb.d;
                      if (d == sELECTED_TAP || d == tb.j()) {
                         tb.K();
                         if (!PatchProxy.isSupport(DecorationContainerView.class) || !PatchProxy.applyVoidThreeRefs(p1, Float.valueOf(p2), Float.valueOf(p3), tb, DecorationContainerView.class, "12")) {
                            BaseDrawer gestureTarDe1 = tb.getGestureTargetDecoration();
                            if (gestureTarDe1 != null) {
                               gestureTarDe1.onSingleFingerMoveStart();
                               tb.g(new q(gestureTarDe1), gestureTarDe1);
                            }
                         }
                      }else {
                         tb.q(p1, p2, p3);
                      }
                      tb.V(gestureTarDe);
                      tb.d = DecorationContainerView$ActionMode.MOVE;
                      Object[] objArray1 = new Object[i];
                      a.D().s(obj, "detectorSingleFingerMove move |||||||||| distanceX:"+p2+"distanceY:"+p3, objArray1);
                      i = true;
                   }
                }
             }else {
                goto label_008d ;
             }
             return i;
          }else {
             tb = this.b;
             if (tb.d == DecorationContainerView$ActionMode.SINGLE_FINGER_SCALE_AND_ROTATE) {
                return tb.r(p1, p2, p3);
             }else {
                return i;
             }
          }
       }
    }
    public void onShowPress(MotionEvent p0){
    }
    public boolean onSingleTapUp(MotionEvent p0){
       Object[] objArray1;
       DecorationContainerView k;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d obj = PatchProxy.applyOneRefs(p0, this, d.class, "4");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.b;
       boolean b = false;
       if (obj.h != null) {
          return b;
       }
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, DecorationContainerView.class, "17");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          Object[] objArray = new Object[b];
          a.D().s("DecorationEditView", "detectorSingleFingerUp ||||||||||  x:"+p0.getX()+",y:"+p0.getY(), objArray);
          DecorationContainerView q = obj.q;
          if (q != null) {
             q.i();
          }
          p0.getX();
          p0.getY();
          switch (DecorationContainerView$c.a[obj.d.ordinal()]){
              case 1:
                obj.d = DecorationContainerView$ActionMode.EDIT;
                if (!PatchProxy.applyVoidOneRefs(p0, obj, DecorationContainerView.class, "46")) {
                   q = obj.k;
                   if (q == null) {
                      objArray1 = new Object[b];
                      a.D().A("DecorationEditView", "selectedTap edit text but not select ", objArray1);
                   }else if(q.mBaseDrawerData.I()){
                      obj.k.selectedTap(p0);
                      k = obj.k;
                      obj.g(new h(k), k);
                   }
                }
                obj.T();
                objArray1 = new Object[b];
                a.D().s("DecorationEditView", "detectorSingleFingerUp selected tap", objArray1);
             label_00f8 :
                b = true;
                break;
              case 2:
                objArray1 = new Object[b];
                a.D().s("DecorationEditView", "detectorSingleFingerUp select", objArray1);
                goto label_00f8 ;
                break;
              case 3:
                obj.R();
                objArray1 = new Object[b];
                a.D().s("DecorationEditView", "detectorSingleFingerUp unselect", objArray1);
                goto label_00f8 ;
                break;
              case 4:
                k = obj.k;
                if (k == null) {
                   objArray1 = new Object[b];
                   a.D().A("DecorationEditView", "detectorSingleFingerUp custom button but not select", objArray1);
                   goto label_00f8 ;
                }else {
                   obj.g(new m(obj), k);
                   objArray1 = new Object[b];
                   a.D().s("DecorationEditView", "detectorSingleFingerUp custom button", objArray1);
                   goto label_00f8 ;
                }
                break;
              case 5:
                if (obj.k == null) {
                   objArray1 = new Object[b];
                   a.D().A("DecorationEditView", "detectorSingleFingerUp delete but not select ", objArray1);
                }else if(obj.D()){
                   obj.R();
                }
                obj.k();
                objArray1 = new Object[b];
                a.D().s("DecorationEditView", "detectorSingleFingerUp delete", objArray1);
                break;
              case 6:
                b = obj.y(p0);
                break;
              case 7:
                b = obj.v(p0);
                break;
              default:
                objArray1 = new Object[b];
                a.D().s("DecorationEditView", "detectorSingleFingerUp do unknown", objArray1);
          }
       }
       return b;
    }
}
