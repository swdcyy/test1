package gh9.f$h;
import erd.g;
import gh9.f;
import java.lang.Object;
import zb9.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class f$h implements g	// class@00249b
{
    public final f b;

    public void f$h(f p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$h.class, "1")) {
       }else if(TextUtils.n(p0.a(), "SWAP_IMAGE_SHOW_EVENT")){
          this.b.k2((p0.b() ^ 0x01), false);
       }
       return;
    }
}
