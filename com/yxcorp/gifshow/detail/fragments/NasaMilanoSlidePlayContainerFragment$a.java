package com.yxcorp.gifshow.detail.fragments.NasaMilanoSlidePlayContainerFragment$a;
import ex6.a;
import com.yxcorp.gifshow.detail.fragments.NasaMilanoSlidePlayContainerFragment;
import java.lang.Object;
import wy6.c;
import com.kwai.library.slide.base.widget.SlidePlayRefreshView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import androidx.fragment.app.Fragment;

public class NasaMilanoSlidePlayContainerFragment$a implements a	// class@001505
{
    public final NasaMilanoSlidePlayContainerFragment a;

    public void NasaMilanoSlidePlayContainerFragment$a(NasaMilanoSlidePlayContainerFragment p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       return true;
    }
    public c b(){
       return null;
    }
    public SlidePlayRefreshView c(){
       Object obj = PatchProxy.apply(null, this, NasaMilanoSlidePlayContainerFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getView().findViewById(0x7f0a3537);
    }
}
