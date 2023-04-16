package jg9.r;
import erd.g;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;

public final class r implements g	// class@002aaf
{
    public static final r b;

    static {
       r.b = new r();
    }
    public void r(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().w("MultiPicturePreviewHelper", "previewFragment:"+p0, objArray);
       }
       return;
    }
}
