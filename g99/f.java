package g99.f;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.atlas_detail.common.presenter.toolbar.a;
import java.lang.Object;
import com.kwai.feature.component.photofeatures.startup.response.AvatarInfoResponse;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.widget.AvatarWithPendantView;

public final class f implements Observer	// class@002442
{
    public final a b;

    public void f(a p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       AvatarInfoResponse mType;
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, a.class, "4")) {
       }else if(p0 != null){
          mType = p0.mType;
       }else {
          mType = 3;
       }
       if (mType != 1) {
          tb.R8();
       }else if(tb.v.useLive() || p0.mPhoto != null){
          if (!PatchProxy.applyVoid(null, tb, a.class, "6")) {
             p0 = tb.q;
             if (p0 != null) {
                p0.o();
             }
          }
       }else {
          tb.R8();
       }
       return;
    }
}
