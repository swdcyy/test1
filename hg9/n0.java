package hg9.n0;
import erd.g;
import com.yxcorp.gifshow.camera.record.photo.TakePictureFragment;
import java.lang.Object;
import wc9.r;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.gifshow.post.api.core.model.TakePictureType;
import com.yxcorp.gifshow.util.rx.RxBus;
import lm6.h;

public final class n0 implements g	// class@00266b
{
    public final TakePictureFragment b;

    public void n0(TakePictureFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       n0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, TakePictureFragment.class, "13")) {
       }else if(tb.F == TakePictureType.SHARE){
          RxBus.f.b(new h());
       }
       return;
    }
}
