package m19.d;
import erd.g;
import m19.e;
import java.lang.Object;
import com.yxcorp.gifshow.detail.slideplay.PreloadInfo;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im8.f;
import java.lang.Integer;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import q3a.i;

public final class d implements g	// class@002de0
{
    public final e b;

    public void d(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, e.class, "6")) {
       }else if(p0.mPosition == tb.r.get().intValue()){
          tb.S8();
          tb.V8("observer");
       }
       p0 = p0.mRemovePosition;
       if (p0 != -1 && p0 == tb.r.get().intValue()) {
          tb.R8("removePreloadPlayer");
          if (!PatchProxy.applyVoid(null, tb, e.class, "9")) {
             if (tb.getActivity() == null) {
                tb.R8("removePreloadPlayer, activity is null, not remove");
             }else if(tb.w != null){
                tb.R8("removePreloadPlayer, mIsBecomesAttached == true, not remove");
             }else if(tb.v instanceof i){
                tb.R8("release preload player:");
                tb.v.m();
             }
          }
       }
    label_0074 :
       return;
    }
}
