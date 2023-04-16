package com.kuaishou.live.rt.scene.LiveScene$1;
import androidx.lifecycle.LifecycleObserver;
import com.kuaishou.live.rt.scene.LiveScene;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.util.Iterator;
import java.util.List;
import ep3.b;

public class LiveScene$1 implements LifecycleObserver	// class@000f79
{
    public final LiveScene b;

    public void LiveScene$1(LiveScene p0){
       this.b = p0;
       super();
    }
    public void onDestroy(){
    }
    public void onPause(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveScene$1.class, "3")) {
          return;
       }
       LiveScene$1 tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, LiveScene.class, "18")) {
          Iterator iterator = tb.g.iterator();
          while (iterator.hasNext()) {
             iterator.next().Q0();
          }
       }
       return;
    }
    public void onResume(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveScene$1.class, "2")) {
          return;
       }
       LiveScene$1 tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, LiveScene.class, "17")) {
          Iterator iterator = tb.g.iterator();
          while (iterator.hasNext()) {
             iterator.next().H2();
          }
       }
       return;
    }
    public void onStart(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveScene$1.class, "1")) {
          return;
       }
       LiveScene$1 tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, LiveScene.class, "16")) {
          Iterator iterator = tb.g.iterator();
          while (iterator.hasNext()) {
             iterator.next().Q1();
          }
       }
       return;
    }
    public void onStop(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveScene$1.class, "4")) {
          return;
       }
       LiveScene$1 tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, LiveScene.class, "19")) {
          Iterator iterator = tb.g.iterator();
          while (iterator.hasNext()) {
             iterator.next().N2();
          }
       }
       return;
    }
}
