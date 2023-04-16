package com.kuaishou.live.preview.item.lifecycle.LivePreviewLifecyclePresenter$b;
import d6a.a;
import com.kuaishou.live.preview.item.lifecycle.LivePreviewLifecyclePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import wk3.b;

public class LivePreviewLifecyclePresenter$b extends a	// class@000dea
{
    public final LivePreviewLifecyclePresenter b;

    public void LivePreviewLifecyclePresenter$b(LivePreviewLifecyclePresenter p0){
       this.b = p0;
       super();
    }
    public void B0(){
       if (PatchProxy.applyVoid(null, this, LivePreviewLifecyclePresenter$b.class, "4")) {
          return;
       }
       Iterator iterator = this.b.D.iterator();
       while (iterator.hasNext()) {
          iterator.next().x4();
       }
       return;
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, LivePreviewLifecyclePresenter$b.class, "2")) {
          return;
       }
       LivePreviewLifecyclePresenter$b tb = this.b;
       tb.x = false;
       Iterator iterator = tb.D.iterator();
       while (iterator.hasNext()) {
          iterator.next().t7();
       }
       this.b.V8();
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, LivePreviewLifecyclePresenter$b.class, "1")) {
          return;
       }
       LivePreviewLifecyclePresenter$b tb = this.b;
       tb.x = true;
       Iterator iterator = tb.D.iterator();
       while (iterator.hasNext()) {
          iterator.next().Y4();
       }
       this.b.V8();
       this.b.S8();
       return;
    }
    public void k1(){
       if (PatchProxy.applyVoid(null, this, LivePreviewLifecyclePresenter$b.class, "3")) {
          return;
       }
       Iterator iterator = this.b.D.iterator();
       while (iterator.hasNext()) {
          iterator.next().W4();
       }
       return;
    }
}
