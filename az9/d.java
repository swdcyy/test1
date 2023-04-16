package az9.d;
import erd.g;
import az9.i0;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.ocrtext.OcrFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class d implements g	// class@000321
{
    public final i0 b;

    public void d(i0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, i0.class, "25")) {
       }else if(tb.v == null){
          OcrFragment.Jh(tb.u).Kh(tb.x);
          tb.o0();
       }
       return;
    }
}
