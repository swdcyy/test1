package h6a.k1;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootVerticalDetailVMFragment;
import java.lang.Object;
import zca.s;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayVerticalPhotosVMFragment;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import com.yxcorp.gifshow.entity.QPhoto;

public final class k1 implements g	// class@00259a
{
    public final NasaGrootVerticalDetailVMFragment b;

    public void k1(NasaGrootVerticalDetailVMFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       k1 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefsWithListener(p0, tb, NasaGrootVerticalDetailVMFragment.class, "5")) {
       }else if(p0.a != null){
          a.d().k(new PlayEvent(tb.O, PlayEvent$Status.PAUSE, 20));
       }else {
          a.d().k(new PlayEvent(tb.O, PlayEvent$Status.RESUME, 20));
       }
       PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "5");
       return;
    }
}
