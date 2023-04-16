package oc9.q;
import oc9.u;
import com.yxcorp.gifshow.camera.record.base.d;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import oc9.t;
import oc9.s;
import java.util.Iterator;
import java.util.List;
import ekd.k1;
import java.lang.StringBuilder;
import va9.a;
import java.lang.UnsupportedOperationException;
import com.yxcorp.gifshow.camerasdk.recorder.a;
import q16.a$a;
import com.kwai.robust.PatchProxyResult;
import java.util.Collections;
import android.view.View;
import com.yxcorp.gifshow.camerasdk.q;
import android.content.Intent;
import java.lang.Integer;
import android.view.KeyEvent;
import android.view.MotionEvent;

public class q extends d implements u	// class@0032f4
{
    public boolean n;
    public final List o;

    public void q(CameraPageType p0,b p1){
       super(p0, p1);
       this.o = new ArrayList();
    }
    public void E1(boolean p0){
       q oq = q.class;
       if (PatchProxy.isSupport(oq) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oq, "22")) {
          return;
       }
       s.e(this, p0);
       Iterator iterator = this.o.iterator();
       while (iterator.hasNext()) {
          iterator.next().E1(p0);
       }
       return;
    }
    public void G(){
       if (PatchProxy.applyVoid(null, this, q.class, "12")) {
          return;
       }
       Iterator iterator = this.o.iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          ot.G();
          a.d(ot.getClass().getSimpleName()+" onCameraClosed", k1.i());
       }
       return;
    }
    public void L0(t p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "21")) {
          return;
       }
       if (this.n != null) {
          throw new UnsupportedOperationException("Please add child before fragment create");
       }
       if (!this.o.contains(p0)) {
          this.o.add(p0);
       }
       return;
    }
    public void L3(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "18")) {
          return;
       }
       Iterator iterator = this.o.iterator();
       while (iterator.hasNext()) {
          iterator.next().L3(p0);
       }
       return;
    }
    public void de(a$a p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, q.class, "17")) {
          return;
       }
       Iterator iterator = this.o.iterator();
       while (iterator.hasNext()) {
          iterator.next().de(p0, p1);
       }
       return;
    }
    public List getChildren(){
       Object obj = PatchProxy.apply(null, this, q.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Collections.unmodifiableList(this.o);
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "2")) {
          return;
       }
       super.k(p0);
       Iterator iterator = this.o.iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          ot.k(p0);
          a.d(ot.getClass().getSimpleName()+" onViewCreated", k1.i());
       }
       return;
    }
    public void lc(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "19")) {
          return;
       }
       s.a(this, p0);
       Iterator iterator = this.o.iterator();
       while (iterator.hasNext()) {
          iterator.next().lc(p0);
       }
       return;
    }
    public void nb(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "14")) {
          return;
       }
       super.nb(p0);
       Iterator iterator = this.o.iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          ot.nb(p0);
          a.d(ot.getClass().getSimpleName()+" setCameraHelper", k1.i());
       }
       return;
    }
    public void onActivityCallback(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(q.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, q.class, "9")) {
          return;
       }
       Iterator iterator = this.o.iterator();
       while (iterator.hasNext()) {
          iterator.next().onActivityCallback(p0, p1, p2);
       }
       return;
    }
    public boolean onBackPressed(){
       Iterator obj = PatchProxy.apply(null, this, q.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.o.iterator();
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
       if (PatchProxy.applyVoid(null, this, q.class, "8")) {
          return;
       }
       super.onDestroy();
       Iterator iterator = this.o.iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          ot.onDestroy();
          a.d(ot.getClass().getSimpleName()+" onDestroy", k1.i());
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, q.class, "7")) {
          return;
       }
       super.onDestroyView();
       Iterator iterator = this.o.iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          ot.onDestroyView();
          a.d(ot.getClass().getSimpleName()+" onDestroyView", k1.i());
       }
       return;
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       Iterator obj;
       q oq = q.class;
       if (PatchProxy.isSupport(oq)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, oq, "16");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.o.iterator();
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
       if (PatchProxy.applyVoid(null, this, q.class, "5")) {
          return;
       }
       super.onPause();
       Iterator iterator = this.o.iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          ot.onPause();
          a.d(ot.getClass().getSimpleName()+" onPause", k1.i());
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, q.class, "4")) {
          return;
       }
       super.onResume();
       Iterator iterator = this.o.iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          ot.onResume();
          a.d(ot.getClass().getSimpleName()+" onResume", k1.i());
       }
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, q.class, "3")) {
          return;
       }
       Iterator iterator = this.o.iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          ot.onStart();
          a.d(ot.getClass().getSimpleName()+" onStart", k1.i());
       }
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, q.class, "6")) {
          return;
       }
       Iterator iterator = this.o.iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          ot.onStop();
          a.d(ot.getClass().getSimpleName()+" onStop", k1.i());
       }
       return;
    }
    public boolean onTouch(View p0,MotionEvent p1){
       Iterator obj = PatchProxy.applyTwoRefs(p0, p1, this, q.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.o.iterator();
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
    public boolean pc(){
       Iterator obj = PatchProxy.apply(null, this, q.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.o.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return s.b(this);
          }
          if (!obj.next().pc()) {
             break ;
          }
       }
       return false;
    }
    public void w(){
       if (PatchProxy.applyVoid(null, this, q.class, "11")) {
          return;
       }
       Iterator iterator = this.o.iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          ot.w();
          a.d(ot.getClass().getSimpleName()+" onCameraOpened", k1.i());
       }
       return;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "1")) {
          return;
       }
       super.w1(p0);
       Iterator iterator = this.o.iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          ot.w1(p0);
          a.d(ot.getClass().getSimpleName()+" onCreate", k1.i());
       }
       this.n = true;
       return;
    }
}
