package nod.e$a$b;
import io.reactivex.g;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextKeyboardDataViewModelV3;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import faa.a;
import q87.c;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextFontRepoV3;
import java.lang.Integer;

public final class e$a$b implements g	// class@001e9f
{
    public final TextKeyboardDataViewModelV3 b;

    public void e$a$b(TextKeyboardDataViewModelV3 p0){
       this.b = p0;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a$b.class, "1")) {
          return;
       }
       a.p(p0, "it");
       Object[] objArray = new Object[0];
       a.D().w("TextEditorV3Factory", "onEditorFirstFrameShown load font", objArray);
       this.b.p0().d(p0, Integer.valueOf(4));
       return;
    }
}
