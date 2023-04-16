package nod.e$a$d;
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
import lod.b;
import java.util.Objects;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3;
import com.kwai.middleware.resourcemanager.cache.type.CachePolicy;

public final class e$a$d implements g	// class@001ea1
{
    public final TextKeyboardDataViewModelV3 b;

    public void e$a$d(TextKeyboardDataViewModelV3 p0){
       this.b = p0;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a$d.class, "1")) {
          return;
       }
       a.p(p0, "it");
       Object[] objArray = new Object[0];
       a.D().w("TextEditorV3Factory", "onEditorFirstFrameShown load template", objArray);
       b uob = this.b.r0();
       Objects.requireNonNull(uob, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3");
       CachePolicy cACHE_ELSE_N = CachePolicy.CACHE_ELSE_NETWORK;
       uob.g(cACHE_ELSE_N, p0);
       uob = this.b.o0();
       Objects.requireNonNull(uob, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3");
       uob.g(cACHE_ELSE_N, p0);
       return;
    }
}
