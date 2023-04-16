package com.yxcorp.gifshow.detail.fragments.NasaMilanoSlidePlayContainerFragment$e;
import bx6.b;
import com.yxcorp.gifshow.detail.fragments.NasaMilanoSlidePlayContainerFragment;
import java.lang.String;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import bx6.a;
import com.kwai.library.slide.base.widget.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.slide.base.widget.d;
import g9a.a;
import android.view.View;
import android.view.ViewStub;
import com.kwai.component.photo.detail.slide.container.groot.GrootSlidePlayDetailBaseContainerFragment;
import jf5.a;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import rf5.u;
import bz6.b;

public class NasaMilanoSlidePlayContainerFragment$e implements b	// class@001509
{
    public d a;
    public String b;
    public final NasaMilanoSlidePlayContainerFragment c;

    public void NasaMilanoSlidePlayContainerFragment$e(NasaMilanoSlidePlayContainerFragment p0,String p1){
       this.c = p0;
       super();
       this.b = p1;
    }
    public Fragment b(){
       return this.c;
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
       d obj = PatchProxy.apply(null, this, NasaMilanoSlidePlayContainerFragment$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a == null) {
          obj = new d();
          this.a = obj;
          NasaMilanoSlidePlayContainerFragment$e tc = this.c;
          a uoa = new a(this.c.getView().findViewById(0x7f0a2c32), tc.q, tc.N8(), this.c.K.R);
          uoa.i = this.b;
          obj.j(uoa);
       }
       return this.a;
    }
}
