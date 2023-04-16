package com.yxcorp.gifshow.camera.record.CameraActivity$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yxcorp.gifshow.camera.record.CameraActivity;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import java.util.Iterator;

public class CameraActivity$1 implements DefaultLifecycleObserver	// class@001c84
{
    public final CameraActivity b;

    public void CameraActivity$1(CameraActivity p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraActivity$1.class, "1")) {
          return;
       }
       if (q.f(this.b.O)) {
          return;
       }
       Iterator iterator = new ArrayList(this.b.O).iterator();
       while (iterator.hasNext()) {
          iterator.next().onCreate(p0);
       }
       return;
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraActivity$1.class, "6")) {
          return;
       }
       if (q.f(this.b.O)) {
          return;
       }
       Iterator iterator = new ArrayList(this.b.O).iterator();
       while (iterator.hasNext()) {
          iterator.next().onDestroy(p0);
       }
       return;
    }
    public void onPause(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraActivity$1.class, "4")) {
          return;
       }
       if (q.f(this.b.O)) {
          return;
       }
       Iterator iterator = new ArrayList(this.b.O).iterator();
       while (iterator.hasNext()) {
          iterator.next().onPause(p0);
       }
       return;
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraActivity$1.class, "3")) {
          return;
       }
       if (q.f(this.b.O)) {
          return;
       }
       Iterator iterator = new ArrayList(this.b.O).iterator();
       while (iterator.hasNext()) {
          iterator.next().onResume(p0);
       }
       return;
    }
    public void onStart(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraActivity$1.class, "2")) {
          return;
       }
       if (q.f(this.b.O)) {
          return;
       }
       Iterator iterator = new ArrayList(this.b.O).iterator();
       while (iterator.hasNext()) {
          iterator.next().onStart(p0);
       }
       return;
    }
    public void onStop(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraActivity$1.class, "5")) {
          return;
       }
       if (q.f(this.b.O)) {
          return;
       }
       Iterator iterator = new ArrayList(this.b.O).iterator();
       while (iterator.hasNext()) {
          iterator.next().onStop(p0);
       }
       return;
    }
}
