package gca.a;
import com.yxcorp.gifshow.editor.fine.tuning.data.EditorFineTuningType;
import com.kuaishou.edit.draft.FineTuningParam;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class a	// class@00245f
{
    public final EditorFineTuningType a;
    public FineTuningParam b;

    public void a(EditorFineTuningType p0,FineTuningParam p1){
       a.p(p0, "editorFineTuningType");
       a.p(p1, "fineTuningParam");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final EditorFineTuningType a(){
       return this.a;
    }
    public final FineTuningParam b(){
       return this.b;
    }
    public final void c(FineTuningParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.b = p0;
       return;
    }
}
