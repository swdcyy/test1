package com.kuaishou.live.preview.item.lifecycle.LivePreviewLifecyclePresenter$a;
import wk3.f;
import com.kuaishou.live.preview.item.lifecycle.LivePreviewLifecyclePresenter;
import java.lang.Object;
import wk3.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public class LivePreviewLifecyclePresenter$a implements f	// class@000de9
{
    public final LivePreviewLifecyclePresenter b;

    public void LivePreviewLifecyclePresenter$a(LivePreviewLifecyclePresenter p0){
       this.b = p0;
       super();
    }
    public boolean E(){
       return this.b.z;
    }
    public void I1(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePreviewLifecyclePresenter$a.class, "2")) {
          return;
       }
       this.b.D.remove(p0);
       return;
    }
    public boolean Q4(){
       boolean b = (this.b.A != LiveWillShowType.NONE)? true: false;
       return b;
    }
    public void f3(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePreviewLifecyclePresenter$a.class, "1")) {
          return;
       }
       if (!this.b.D.contains(p0)) {
          this.b.D.add(p0);
       }
       return;
    }
    public boolean isSelected(){
       return this.b.x;
    }
    public LiveWillShowType m5(){
       return this.b.A;
    }
    public boolean w7(){
       return this.b.y;
    }
}
