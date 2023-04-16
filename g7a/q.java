package g7a.q;
import com.yxcorp.gifshow.comment.utils.e$c;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import java.util.List;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g;
import java.lang.Boolean;
import hl9.i0;

public final class q implements e$c	// class@0023f4
{
    public final List a;
    public final Ref$ObjectRef b;

    public void q(Ref$ObjectRef p0){
       this.b = p0;
       super();
       this.a = p0.element;
    }
    public void a(BaseEditorFragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "1")) {
          return;
       }
       a.p(p0, "fragment");
       if (p0 instanceof EmotionFloatEditorFragment) {
          p0.ji(this.a);
       }
       return;
    }
    public Boolean b(BaseEditorFragment$g p0){
       return i0.d(this, p0);
    }
    public void c(BaseEditorFragment$g p0){
       i0.a(this, p0);
    }
    public void d(){
       i0.b(this);
    }
}
