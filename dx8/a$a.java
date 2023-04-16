package dx8.a$a;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;

public final class a$a implements o	// class@0020f0
{
    public static final a$a b;

    static {
       a$a.b = new a$a();
    }
    public void a$a(){
       super();
    }
    public Object apply(Object p0){
       Boolean uBoolean = PatchProxy.applyOneRefs(p0, this, a$a.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          uBoolean = Boolean.valueOf(DraftFileManager.o0(p0, false));
       }
       return uBoolean;
    }
}
