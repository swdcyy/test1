package ind.b$a$a;
import io.reactivex.g;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextKeyboardDataViewModelV3;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextFontRepoV3;
import java.lang.Integer;

public final class b$a$a implements g	// class@001028
{
    public final TextKeyboardDataViewModelV3 b;

    public void b$a$a(TextKeyboardDataViewModelV3 p0){
       this.b = p0;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a$a.class, "1")) {
          return;
       }
       a.p(p0, "it");
       this.b.p0().d(p0, Integer.valueOf(0));
       return;
    }
}
