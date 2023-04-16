package gca.b;
import gca.a;
import com.yxcorp.gifshow.editor.fine.tuning.data.EditorFineTuningType;
import com.kuaishou.edit.draft.FineTuningParam;
import gca.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class b extends a	// class@002460
{
    public final c c;
    public boolean d;
    public boolean e;

    public void b(EditorFineTuningType p0,FineTuningParam p1,c p2,boolean p3,boolean p4){
       a.p(p0, "editorFineTuningType");
       a.p(p1, "fineTuningParam");
       a.p(p2, "fineTuningViewData");
       super(p0, p1);
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final c d(){
       return this.c;
    }
    public final boolean e(){
       return this.e;
    }
}
