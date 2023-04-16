package com.kuaishou.live.core.show.liveslidesquare.LiveGrootSlidePlayDetailContainerFragment$b;
import bx6.b;
import com.kuaishou.live.core.show.liveslidesquare.LiveGrootSlidePlayDetailContainerFragment;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import bx6.a;
import java.lang.String;
import com.kwai.library.slide.base.widget.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.slide.base.widget.d;
import com.kuaishou.live.core.show.liveslidesquare.LiveGrootSlidePlayDetailContainerFragment$b$a;
import bz6.b;

public class LiveGrootSlidePlayDetailContainerFragment$b implements b	// class@000c8d
{
    public d a;
    public final LiveGrootSlidePlayDetailContainerFragment b;

    public void LiveGrootSlidePlayDetailContainerFragment$b(LiveGrootSlidePlayDetailContainerFragment p0){
       this.b = p0;
       super();
    }
    public Fragment b(){
       return a.b(this);
    }
    public int c(){
       return a.c(this);
    }
    public boolean d(){
       return true;
    }
    public String e(){
       return a.a(this);
    }
    public a getFooterLoadingLayout(){
       d obj = PatchProxy.apply(null, this, LiveGrootSlidePlayDetailContainerFragment$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a == null) {
          obj = new d();
          this.a = obj;
          obj.j(new LiveGrootSlidePlayDetailContainerFragment$b$a(this));
       }
       return this.a;
    }
}
