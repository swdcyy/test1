package b8a.j;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.e;
import java.lang.Object;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus$d;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;

public final class j implements g	// class@0003b8
{
    public final e b;

    public void j(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j tb = this.b;
       if ((tb.v.getPhotoId()).equals(p0.a.getPhotoId())) {
          tb.P8(p0.b, p0.c, p0.d, p0.e, false);
       }
       return;
    }
}
