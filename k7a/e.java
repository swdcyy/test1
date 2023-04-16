package k7a.e;
import erd.g;
import k7a.h;
import java.lang.Object;
import com.yxcorp.gifshow.detail.slideplay.PreloadInfo;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im8.f;
import java.lang.Integer;

public final class e implements g	// class@002c0d
{
    public final h b;

    public void e(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, h.class, "7")) {
       }else if(p0.mPosition == tb.r.get().intValue()){
          tb.R8();
          tb.V8("observer");
       }
       p0 = p0.mRemovePosition;
       if (p0 != -1 && p0 == tb.r.get().intValue()) {
          tb.P8("removePreloadPlayer");
          tb.S8(false);
       }
       return;
    }
}
