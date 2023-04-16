package jw8.f;
import erd.o;
import com.yxcorp.gifshow.encode.EncodeRequest$a;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.lang.Object;
import q5b.h;

public final class f implements o	// class@0029bd
{
    public final EncodeRequest$a b;
    public final EditorSdk2V2$VideoEditorProject c;

    public void f(EncodeRequest$a p0,EditorSdk2V2$VideoEditorProject p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       f tb = this.b;
       f tc = this.c;
       if (p0 != null && p0.length > 0) {
          tb.i(h.a(p0));
       }
       return tc;
    }
}
