package ix9.d;
import erd.g;
import com.yxcorp.gifshow.detail.comment.nasa.tab.dynamic.d;
import java.lang.Object;
import nk9.e;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class d implements g	// class@0028b2
{
    public final d b;

    public void d(d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, d.class, "6")) {
       }else if(!p0.a()){
          tb.P8("commentWonderfulHidePanel", "");
       }
       return;
    }
}
