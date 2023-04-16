package g7a.c0;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.d;
import java.lang.Object;
import nk9.i;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class c0 implements g	// class@0023d0
{
    public final d b;

    public void c0(d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, d.class, "19")) {
       }else if(p0.a != null){
          tb.T = 0;
          tb.W8();
       }else {
          tb.R8();
       }
       return;
    }
}
