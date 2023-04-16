package com.kuaishou.live.lite.slide.LiveLiteGrootAdapterFragment$a;
import id3.e;
import com.kuaishou.live.lite.slide.LiveLiteGrootAdapterFragment;
import java.lang.Object;
import vy6.a;
import androidx.viewpager.widget.ViewPager$i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.photo.detail.slide.groot.DetailSlidePlayFragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.library.groot.slide.fragment.GrootBaseFragment;
import java.lang.Boolean;

public class LiveLiteGrootAdapterFragment$a implements e	// class@000b4f
{
    public final LiveLiteGrootAdapterFragment a;

    public void LiveLiteGrootAdapterFragment$a(LiveLiteGrootAdapterFragment p0){
       this.a = p0;
       super();
    }
    public void a(a p0){
       this.a.L = p0;
    }
    public void b(ViewPager$i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteGrootAdapterFragment$a.class, "2")) {
          return;
       }
       this.a.y.g(p0);
       return;
    }
    public void c(ViewPager$i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteGrootAdapterFragment$a.class, "1")) {
          return;
       }
       this.a.y.i(p0);
       return;
    }
    public void d(a p0){
       p0.L = null;
    }
    public int e(){
       Object obj = PatchProxy.apply(null, this, LiveLiteGrootAdapterFragment$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.y.j();
    }
    public int f(){
       Object obj = PatchProxy.apply(null, this, LiveLiteGrootAdapterFragment$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.dh();
    }
    public boolean isSelected(){
       Object obj = PatchProxy.apply(null, this, LiveLiteGrootAdapterFragment$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.fh();
    }
}
