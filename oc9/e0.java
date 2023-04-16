package oc9.e0;
import oc9.u;
import oc9.d0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import oc9.t;
import oc9.b0;
import java.lang.Boolean;
import oc9.s;
import java.lang.UnsupportedOperationException;
import com.yxcorp.gifshow.camerasdk.recorder.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.Float;
import q16.a$a;
import java.util.Collections;
import android.view.View;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.camerasdk.q;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.MotionEvent;

public class e0 extends d0 implements u	// class@0032e7
{
    public boolean o;
    public final List p;

    public void e0(CameraPageType p0,b p1){
       super(p0, p1);
       this.p = new ArrayList();
    }
    public void A0(){
       if (PatchProxy.applyVoid(null, this, e0.class, "26")) {
          return;
       }
       Iterator iterator = this.p.iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          if (ot instanceof b0) {
             ot.A0();
          }
       }
       return;
    }
    public void E0(){
       if (PatchProxy.applyVoid(null, this, e0.class, "30")) {
          return;
       }
       Iterator iterator = this.p.iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          if (ot instanceof b0) {
             ot.E0();
          }
       }
       return;
    }
    public void E1(boolean p0){
       e0 uoe0 = e0.class;
       if (PatchProxy.isSupport(uoe0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe0, "35")) {
          return;
       }
       s.e(this, p0);
       Iterator iterator = this.p.iterator();
       while (iterator.hasNext()) {
          iterator.next().E1(p0);
       }
       return;
    }
    public void G(){
       if (PatchProxy.applyVoid(null, this, e0.class, "14")) {
          return;
       }
       Iterator iterator = this.p.iterator();
       while (iterator.hasNext()) {
          iterator.next().G();
       }
       return;
    }
    public void I7(){
       if (PatchProxy.applyVoid(null, this, e0.class, "24")) {
          return;
       }
       Iterator iterator = this.p.iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          if (ot instanceof b0) {
             ot.I7();
          }
       }
       return;
    }
    public void L0(t p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0.class, "2")) {
          return;
       }
       if (this.o != null) {
          throw new UnsupportedOperationException("Please add child before fragment create");
       }
       if (!this.p.contains(p0)) {
          this.p.add(p0);
       }
       return;
    }
    public void L3(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0.class, "20")) {
          return;
       }
       Iterator iterator = this.p.iterator();
       while (iterator.hasNext()) {
          iterator.next().L3(p0);
       }
       return;
    }
    public void P1(){
       if (PatchProxy.applyVoid(null, this, e0.class, "27")) {
          return;
       }
       Iterator iterator = this.p.iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          if (ot instanceof b0) {
             ot.P1();
          }
       }
       return;
    }
    public boolean R0(){
       Iterator obj = PatchProxy.apply(null, this, e0.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.p.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return false;
          }
          t ot = obj.next();
          if (ot instanceof b0 && ot.R0()) {
             break ;
          }
       }
       return true;
    }
    public void T1(boolean p0){
       e0 uoe0 = e0.class;
       if (PatchProxy.isSupport(uoe0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe0, "31")) {
          return;
       }
       Iterator iterator = this.p.iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          if (ot instanceof b0) {
             ot.T1(p0);
          }
       }
       return;
    }
    public void X7(int p0,float p1){
       e0 uoe0 = e0.class;
       if (PatchProxy.isSupport(uoe0) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, uoe0, "25")) {
          return;
       }
       Iterator iterator = this.p.iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          if (ot instanceof b0) {
             ot.X7(p0, p1);
          }
       }
       return;
    }
    public void d5(int p0){
       e0 uoe0 = e0.class;
       if (PatchProxy.isSupport(uoe0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe0, "34")) {
          return;
       }
       super.d5(p0);
       Iterator iterator = this.p.iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          if (ot instanceof b0) {
             ot.d5(p0);
          }
       }
       return;
    }
    public void de(a$a p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e0.class, "19")) {
          return;
       }
       Iterator iterator = this.p.iterator();
       while (iterator.hasNext()) {
          iterator.next().de(p0, p1);
       }
       return;
    }
    public void e2(){
       if (PatchProxy.applyVoid(null, this, e0.class, "28")) {
          return;
       }
       Iterator iterator = this.p.iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          if (ot instanceof b0) {
             ot.e2();
          }
       }
       return;
    }
    public List getChildren(){
       Object obj = PatchProxy.apply(null, this, e0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Collections.unmodifiableList(this.p);
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0.class, "4")) {
          return;
       }
       super.k(p0);
       Iterator iterator = this.p.iterator();
       while (iterator.hasNext()) {
          iterator.next().k(p0);
       }
       return;
    }
    public void lc(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0.class, "21")) {
          return;
       }
       s.a(this, p0);
       Iterator iterator = this.p.iterator();
       while (iterator.hasNext()) {
          iterator.next().lc(p0);
       }
       return;
    }
    public void nb(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0.class, "16")) {
          return;
       }
       super.nb(p0);
       Iterator iterator = this.p.iterator();
       while (iterator.hasNext()) {
          iterator.next().nb(p0);
       }
       return;
    }
    public void onActivityCallback(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(e0.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, e0.class, "12")) {
          return;
       }
       Iterator iterator = this.p.iterator();
       while (iterator.hasNext()) {
          iterator.next().onActivityCallback(p0, p1, p2);
       }
       return;
    }
    public boolean onBackPressed(){
       Iterator obj = PatchProxy.apply(null, this, e0.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.p.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return false;
          }
          if (obj.next().onBackPressed()) {
             break ;
          }
       }
       return true;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, e0.class, "10")) {
          return;
       }
       super.onDestroy();
       Iterator iterator = this.p.iterator();
       while (iterator.hasNext()) {
          iterator.next().onDestroy();
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, e0.class, "9")) {
          return;
       }
       super.onDestroyView();
       Iterator iterator = this.p.iterator();
       while (iterator.hasNext()) {
          iterator.next().onDestroyView();
       }
       return;
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       Iterator obj;
       e0 uoe0 = e0.class;
       if (PatchProxy.isSupport(uoe0)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoe0, "18");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.p.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return false;
          }
          if (obj.next().onKeyDown(p0, p1)) {
             break ;
          }
       }
       return true;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, e0.class, "7")) {
          return;
       }
       super.onPause();
       Iterator iterator = this.p.iterator();
       while (iterator.hasNext()) {
          iterator.next().onPause();
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, e0.class, "6")) {
          return;
       }
       super.onResume();
       Iterator iterator = this.p.iterator();
       while (iterator.hasNext()) {
          iterator.next().onResume();
       }
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, e0.class, "5")) {
          return;
       }
       Iterator iterator = this.p.iterator();
       while (iterator.hasNext()) {
          iterator.next().onStart();
       }
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, e0.class, "8")) {
          return;
       }
       Iterator iterator = this.p.iterator();
       while (iterator.hasNext()) {
          iterator.next().onStop();
       }
       return;
    }
    public boolean onTouch(View p0,MotionEvent p1){
       Iterator obj = PatchProxy.applyTwoRefs(p0, p1, this, e0.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.p.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return false;
          }
          if (obj.next().onTouch(p0, p1)) {
             break ;
          }
       }
       return true;
    }
    public void q1(){
       if (PatchProxy.applyVoid(null, this, e0.class, "23")) {
          return;
       }
       Iterator iterator = this.p.iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          if (ot instanceof b0) {
             ot.q1();
          }
       }
       return;
    }
    public boolean q2(){
       Iterator obj = PatchProxy.apply(null, this, e0.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.p.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return true;
          }
          t ot = obj.next();
          if (ot instanceof b0 && !ot.q2()) {
             break ;
          }
       }
       return false;
    }
    public void qb(){
       if (PatchProxy.applyVoid(null, this, e0.class, "33")) {
          return;
       }
       Iterator iterator = this.p.iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          if (ot instanceof b0) {
             ot.qb();
          }
       }
       return;
    }
    public void s0(){
       if (PatchProxy.applyVoid(null, this, e0.class, "29")) {
          return;
       }
       Iterator iterator = this.p.iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          if (ot instanceof b0) {
             ot.s0();
          }
       }
       return;
    }
    public void t1(){
       if (PatchProxy.applyVoid(null, this, e0.class, "15")) {
          return;
       }
       Iterator iterator = this.p.iterator();
       while (iterator.hasNext()) {
          iterator.next().t1();
       }
       return;
    }
    public void w(){
       if (PatchProxy.applyVoid(null, this, e0.class, "13")) {
          return;
       }
       Iterator iterator = this.p.iterator();
       while (iterator.hasNext()) {
          iterator.next().w();
       }
       return;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0.class, "3")) {
          return;
       }
       super.w1(p0);
       Iterator iterator = this.p.iterator();
       while (iterator.hasNext()) {
          iterator.next().w1(p0);
       }
       this.o = true;
       return;
    }
}
