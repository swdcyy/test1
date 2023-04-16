package ind.b$a$c;
import io.reactivex.g;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextKeyboardDataViewModelV3;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateRepo;

public final class b$a$c implements g	// class@00102a
{
    public final TextKeyboardDataViewModelV3 b;

    public void b$a$c(TextKeyboardDataViewModelV3 p0){
       this.b = p0;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a$c.class, "1")) {
          return;
       }
       a.p(p0, "it");
       this.b.q0().i(p0, true);
       return;
    }
}
