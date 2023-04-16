package h6a.f2;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayHorizontalPhotosVMFragment;
import java.lang.Object;
import com.smile.gifmaker.mvps.presenter.MainThreadScatterPresenterGroup;

public final class f2 implements Runnable	// class@002587
{
    public final SlidePlayHorizontalPhotosVMFragment b;

    public void f2(SlidePlayHorizontalPhotosVMFragment p0){
       this.b = p0;
    }
    public final void run(){
       f2 tb = this.b;
       tb.yh(tb.H);
    }
}
