package com.yxcorp.gifshow.widget.NestedListenerCoordinatorLayout;
import a2.s;
import a2.w;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.yxcorp.gifshow.widget.NestedListenerCoordinatorLayout$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.widget.NestedListenerCoordinatorLayout$childHelper$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import tyc.h3;
import android.view.View;
import java.lang.Float;
import a2.u;

public class NestedListenerCoordinatorLayout extends CoordinatorLayout implements s, w	// class@00188b
{
    public int A;
    public final p B;
    public HashMap C;
    public h3 z;
    public static final NestedListenerCoordinatorLayout$a D;

    static {
       NestedListenerCoordinatorLayout.D = new NestedListenerCoordinatorLayout$a(null);
    }
    public void NestedListenerCoordinatorLayout(Context p0){
       a.p(p0, "context");
       super(p0);
       this.B = s.c(new NestedListenerCoordinatorLayout$childHelper$2(this));
       this.setNestedScrollingEnabled(true);
    }
    public void NestedListenerCoordinatorLayout(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.B = s.c(new NestedListenerCoordinatorLayout$childHelper$2(this));
       this.setNestedScrollingEnabled(true);
    }
    public void NestedListenerCoordinatorLayout(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.B = s.c(new NestedListenerCoordinatorLayout$childHelper$2(this));
       this.setNestedScrollingEnabled(true);
    }
    public boolean canScrollVertically(int p0){
       NestedListenerCoordinatorLayout obj;
       if (PatchProxy.isSupport(NestedListenerCoordinatorLayout.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, NestedListenerCoordinatorLayout.class, "30");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.z;
       boolean b = (obj != null)? obj.F(p0): super.canScrollVertically(p0);
       return b;
    }
    public boolean dispatchNestedFling(float p0,float p1,boolean p2){
       if (PatchProxy.isSupport(NestedListenerCoordinatorLayout.class)) {
          Object obj = PatchProxy.applyThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Boolean.valueOf(p2), this, NestedListenerCoordinatorLayout.class, "29");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.getChildHelper().a(p0, p1, p2);
    }
    public boolean dispatchNestedPreFling(float p0,float p1){
       if (PatchProxy.isSupport(NestedListenerCoordinatorLayout.class)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, NestedListenerCoordinatorLayout.class, "28");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.getChildHelper().b(p0, p1);
    }
    public boolean dispatchNestedPreScroll(int p0,int p1,int[] p2,int[] p3){
       if (PatchProxy.isSupport(NestedListenerCoordinatorLayout.class)) {
          Object obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, p3, this, NestedListenerCoordinatorLayout.class, "27");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.getChildHelper().c(p0, p1, p2, p3);
    }
    public boolean dispatchNestedPreScroll(int p0,int p1,int[] p2,int[] p3,int p4){
       if (PatchProxy.isSupport(NestedListenerCoordinatorLayout.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),p2,p3,Integer.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, this, NestedListenerCoordinatorLayout.class, "26");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.getChildHelper().d(p0, p1, p2, p3, p4);
    }
    public void dispatchNestedScroll(int p0,int p1,int p2,int p3,int[] p4,int p5,int[] p6){
       object oobject = p6;
       if (PatchProxy.isSupport(NestedListenerCoordinatorLayout.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),p4,Integer.valueOf(p5),oobject};
          if (PatchProxy.applyVoid(objArray, this, NestedListenerCoordinatorLayout.class, "23")) {
             return;
          }
       }else {
          int i = this;
       }
       a.p(oobject, "consumed");
       this.getChildHelper().e(p0, p1, p2, p3, p4, p5, p6);
       return;
    }
    public boolean dispatchNestedScroll(int p0,int p1,int p2,int p3,int[] p4){
       if (PatchProxy.isSupport(NestedListenerCoordinatorLayout.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),p4};
          Object obj = PatchProxy.apply(objArray, this, NestedListenerCoordinatorLayout.class, "25");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.getChildHelper().f(p0, p1, p2, p3, p4);
    }
    public boolean dispatchNestedScroll(int p0,int p1,int p2,int p3,int[] p4,int p5){
       if (PatchProxy.isSupport(NestedListenerCoordinatorLayout.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),p4,Integer.valueOf(p5)};
          Object obj = PatchProxy.apply(objArray, this, NestedListenerCoordinatorLayout.class, "24");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.getChildHelper().g(p0, p1, p2, p3, p4, p5);
    }
    public final u getChildHelper(){
       Object obj = PatchProxy.apply(null, this, NestedListenerCoordinatorLayout.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.B.getValue();
    }
    public boolean hasNestedScrollingParent(){
       Object obj = PatchProxy.apply(null, this, NestedListenerCoordinatorLayout.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getChildHelper().k();
    }
    public boolean hasNestedScrollingParent(int p0){
       if (PatchProxy.isSupport(NestedListenerCoordinatorLayout.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, NestedListenerCoordinatorLayout.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.getChildHelper().l(p0);
    }
    public boolean isNestedScrollingEnabled(){
       Object obj = PatchProxy.apply(null, this, NestedListenerCoordinatorLayout.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getChildHelper().m();
    }
    public boolean onNestedFling(View p0,float p1,float p2,boolean p3){
       if (PatchProxy.isSupport(NestedListenerCoordinatorLayout.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Float.valueOf(p1), Float.valueOf(p2), Boolean.valueOf(p3), this, NestedListenerCoordinatorLayout.class, "18");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "target");
       boolean b = super.onNestedFling(p0, p1, p2, p3);
       b = (this.dispatchNestedFling(p1, p2, p3) || b)? true: false;
       return b;
    }
    public boolean onNestedPreFling(View p0,float p1,float p2){
       if (PatchProxy.isSupport(NestedListenerCoordinatorLayout.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, NestedListenerCoordinatorLayout.class, "17");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "target");
       boolean b = super.onNestedPreFling(p0, p1, p2);
       b = (this.dispatchNestedPreFling(p1, p2) || b)? true: false;
       return b;
    }
    public void onNestedPreScroll(View p0,int p1,int p2,int[] p3){
       if (PatchProxy.isSupport(NestedListenerCoordinatorLayout.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, NestedListenerCoordinatorLayout.class, "11")) {
          return;
       }
       a.p(p0, "target");
       a.p(p3, "consumed");
       NestedListenerCoordinatorLayout tz = this.z;
       if (tz != null) {
          tz.b(p0, p1, p2, p3, null);
       }
       NestedListenerCoordinatorLayout tA = this.A;
       int[] ointArray = null;
       if (tA != 1) {
          if (tA != 2) {
             super.onNestedPreScroll(p0, p1, p2, p3);
          }else {
             super.onNestedPreScroll(p0, p1, p2, p3);
             this.dispatchNestedPreScroll(p1, p2, p3, ointArray);
             p3[0] = p3[0] + p3[0];
             p3[1] = p3[1] + p3[1];
          }
       }else {
          this.dispatchNestedPreScroll(p1, p2, p3, ointArray);
          int i = p3[0];
          int i1 = p3[1];
          super.onNestedPreScroll(p0, (p1 - i), (p2 - i1), p3);
          p3[0] = p3[0] + i;
          p3[1] = p3[1] + i1;
       }
       return;
    }
    public void onNestedPreScroll(View p0,int p1,int p2,int[] p3,int p4){
       int i = 2;
       if (PatchProxy.isSupport(NestedListenerCoordinatorLayout.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, NestedListenerCoordinatorLayout.class, "10")) {
             return;
          }
       }
       a.p(p0, "target");
       a.p(p3, "consumed");
       NestedListenerCoordinatorLayout tz = this.z;
       if (tz != null) {
          tz.b(p0, p1, p2, p3, Integer.valueOf(p4));
       }
       NestedListenerCoordinatorLayout tA = this.A;
       if (tA != 1) {
          if (tA != i) {
             super.onNestedPreScroll(p0, p1, p2, p3, p4);
          }else {
             super.onNestedPreScroll(p0, p1, p2, p3, p4);
             this.dispatchNestedPreScroll(p1, p2, p3, null, p4);
             p3[0] = p3[0] + p3[0];
             p3[1] = p3[1] + p3[1];
          }
       }else {
          int i1 = p4;
          this.dispatchNestedPreScroll(p1, p2, p3, null, i1);
          int i2 = p3[0];
          i = p3[1];
          super.onNestedPreScroll(p0, (p1 - i2), (p2 - i), p3, i1);
          p3[0] = p3[0] + i2;
          p3[1] = p3[1] + i;
       }
       return;
    }
    public void onNestedScroll(View p0,int p1,int p2,int p3,int p4){
       NestedListenerCoordinatorLayout nestedListen = this;
       object oobject = p0;
       int i = 1;
       int i1 = 0;
       if (PatchProxy.isSupport(NestedListenerCoordinatorLayout.class)) {
          Object[] objArray = new Object[]{oobject,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, NestedListenerCoordinatorLayout.class, "12")) {
             return;
          }
       }
       a.p(oobject, "target");
       super.onNestedScroll(p0, p1, p2, p3, p4);
       NestedListenerCoordinatorLayout z = nestedListen.z;
       if (z != null && z.e(p0, p1, p2, p3, p4, Integer.valueOf(i1), null) == i) {
          this.dispatchNestedScroll(p1, p2, p3, p4, null);
       }
       return;
    }
    public void onNestedScroll(View p0,int p1,int p2,int p3,int p4,int p5){
       Object obj = this;
       object oobject = p0;
       int i = 1;
       if (PatchProxy.isSupport(NestedListenerCoordinatorLayout.class)) {
          Object[] objArray = new Object[]{oobject,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, obj, NestedListenerCoordinatorLayout.class, "13")) {
             return;
          }
       }
       a.p(oobject, "target");
       super.onNestedScroll(p0, p1, p2, p3, p4, p5);
       NestedListenerCoordinatorLayout z = obj.z;
       if (z != null && z.e(p0, p1, p2, p3, p4, Integer.valueOf(p5), null) == i) {
          this.dispatchNestedScroll(p1, p2, p3, p4, null, p5);
       }
       return;
    }
    public void onNestedScroll(View p0,int p1,int p2,int p3,int p4,int p5,int[] p6){
       NestedListenerCoordinatorLayout nestedListen = this;
       object oobject = p0;
       object oobject1 = p6;
       if (PatchProxy.isSupport(NestedListenerCoordinatorLayout.class)) {
          Object[] objArray = new Object[]{oobject,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),oobject1};
          if (PatchProxy.applyVoid(objArray, this, NestedListenerCoordinatorLayout.class, "14")) {
             return;
          }
       }
       a.p(p0, "target");
       a.p(oobject1, "consumed");
       super.onNestedScroll(p0, p1, p2, p3, p4, p5);
       NestedListenerCoordinatorLayout z = nestedListen.z;
       if (z != null && z.e(p0, p1, p2, p3, p4, Integer.valueOf(p5), p6) == true) {
          this.dispatchNestedScroll(p1, p2, p3, p4, null, p5, p6);
       }
       return;
    }
    public void onNestedScrollAccepted(View p0,View p1,int p2){
       if (PatchProxy.isSupport(NestedListenerCoordinatorLayout.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, NestedListenerCoordinatorLayout.class, "9")) {
          return;
       }
       a.p(p0, "child");
       a.p(p1, "target");
       NestedListenerCoordinatorLayout tz = this.z;
       if (tz != null) {
          tz.d(p0, p1, p2, null);
       }
       super.onNestedScrollAccepted(p0, p1, p2);
       return;
    }
    public void onNestedScrollAccepted(View p0,View p1,int p2,int p3){
       if (PatchProxy.isSupport(NestedListenerCoordinatorLayout.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, NestedListenerCoordinatorLayout.class, "8")) {
          return;
       }
       a.p(p0, "child");
       a.p(p1, "target");
       super.onNestedScrollAccepted(p0, p1, p2, p3);
       NestedListenerCoordinatorLayout tz = this.z;
       if (tz != null) {
          tz.d(p0, p1, p2, Integer.valueOf(p3));
       }
       return;
    }
    public boolean onStartNestedScroll(View p0,View p1,int p2){
       NestedListenerCoordinatorLayout obj;
       if (PatchProxy.isSupport(NestedListenerCoordinatorLayout.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, NestedListenerCoordinatorLayout.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "child");
       a.p(p1, "target");
       obj = this.z;
       if (obj != null) {
          obj.a(p0, p1, p2, null);
       }
       boolean b = super.onStartNestedScroll(p0, p1, p2);
       b = (this.startNestedScroll(p2) || b)? true: false;
       return b;
    }
    public boolean onStartNestedScroll(View p0,View p1,int p2,int p3){
       NestedListenerCoordinatorLayout obj;
       if (PatchProxy.isSupport(NestedListenerCoordinatorLayout.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, NestedListenerCoordinatorLayout.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "child");
       a.p(p1, "target");
       obj = this.z;
       if (obj != null) {
          obj.a(p0, p1, p2, Integer.valueOf(p3));
       }
       boolean b = super.onStartNestedScroll(p0, p1, p2, p3);
       b = (this.startNestedScroll(p2, p3) || b)? true: false;
       return b;
    }
    public void onStopNestedScroll(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NestedListenerCoordinatorLayout.class, "16")) {
          return;
       }
       a.p(p0, "target");
       super.onStopNestedScroll(p0);
       NestedListenerCoordinatorLayout tz = this.z;
       if (tz != null) {
          tz.c(p0, null);
       }
       this.stopNestedScroll();
       return;
    }
    public void onStopNestedScroll(View p0,int p1){
       if (PatchProxy.isSupport(NestedListenerCoordinatorLayout.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, NestedListenerCoordinatorLayout.class, "15")) {
          return;
       }
       a.p(p0, "target");
       super.onStopNestedScroll(p0, p1);
       NestedListenerCoordinatorLayout tz = this.z;
       if (tz != null) {
          tz.c(p0, Integer.valueOf(p1));
       }
       this.stopNestedScroll(p1);
       return;
    }
    public final void setNestedScrollListener(h3 p0){
       this.z = p0;
    }
    public void setNestedScrollingEnabled(boolean p0){
       if (PatchProxy.isSupport(NestedListenerCoordinatorLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, NestedListenerCoordinatorLayout.class, "3")) {
          return;
       }
       this.getChildHelper().n(p0);
       return;
    }
    public final void setScrollOrder(int p0){
       this.A = p0;
    }
    public boolean startNestedScroll(int p0){
       if (PatchProxy.isSupport(NestedListenerCoordinatorLayout.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, NestedListenerCoordinatorLayout.class, "20");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.getChildHelper().p(p0);
    }
    public boolean startNestedScroll(int p0,int p1){
       if (PatchProxy.isSupport(NestedListenerCoordinatorLayout.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, NestedListenerCoordinatorLayout.class, "19");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.getChildHelper().q(p0, p1);
    }
    public void stopNestedScroll(){
       if (PatchProxy.applyVoid(null, this, NestedListenerCoordinatorLayout.class, "22")) {
          return;
       }
       this.getChildHelper().r();
       return;
    }
    public void stopNestedScroll(int p0){
       if (PatchProxy.isSupport(NestedListenerCoordinatorLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, NestedListenerCoordinatorLayout.class, "21")) {
          return;
       }
       this.getChildHelper().s(p0);
       return;
    }
}
