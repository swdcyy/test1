package h6a.k2;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayPhotoDetailVMFragment;
import java.lang.Object;

public final class k2 implements Runnable	// class@00259b
{
    public final SlidePlayPhotoDetailVMFragment b;

    public void k2(SlidePlayPhotoDetailVMFragment p0){
       this.b = p0;
    }
    public final void run(){
       SlidePlayPhotoDetailVMFragment.xh(this.b);
    }
}
