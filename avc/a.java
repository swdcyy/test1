package avc.a;
import erd.g;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import di0.b;
import kotlin.jvm.internal.a;

public final class a implements g	// class@0002d1
{
    public final FontViewModel b;

    public void a(FontViewModel p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().s("FontBIZ", "load config finish, size is: "+p0.size(), objArray);
          a.o(p0, "it");
          b.t(this.b.w0(), p0, null, 2, null);
          this.b.p0();
       }
       return;
    }
}
