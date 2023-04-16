package hg9.o0;
import erd.g;
import com.yxcorp.gifshow.camera.record.photo.TakePictureFragment;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import ed9.f;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent$PanelType;
import com.kwai.gifshow.post.api.core.model.TakePictureType;
import com.yxcorp.gifshow.util.rx.RxBus;
import ed9.g;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Map;

public final class o0 implements g	// class@00266d
{
    public final TakePictureFragment b;

    public void o0(TakePictureFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       o0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, TakePictureFragment.class, "14")) {
       }else if(p0.b != tb.lh() || !PanelShowEvent.a(tb.getActivity(), p0)){
          tb.B.c(p0);
          boolean b = false;
          boolean b1 = (p0.b() || p0.c == PanelShowEvent$PanelType.MAGIC)? true: false;
          if (tb.F == TakePictureType.SHARE) {
             RxBus f = RxBus.f;
             if (tb.B.a()) {
                TakePictureFragment b2 = tb.B;
                Objects.requireNonNull(b2);
                Object obj = PatchProxy.apply(null, b2, f.class, "4");
                int i = (obj != PatchProxyResult.class)? obj.intValue(): b2.b.size();
                if (i != 1 || (p0.c != PanelShowEvent$PanelType.PRETTIFY || p0.a != null)) {
                label_0080 :
                   f.b(new g(b, b1, tb.getActivity()));
                }
             }
             b = true;
             goto label_0080 ;
          }else {
             RxBus.f.b(new g((tb.B.a() ^ 1), tb.getActivity()));
          }
       }
       return;
    }
}
