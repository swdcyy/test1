package kod.a$m;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment$e;
import kod.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;

public final class a$m implements BaseEditorFragment$e	// class@001804
{
    public final a a;

    public void a$m(a p0){
       this.a = p0;
       super();
    }
    public final void a(boolean p0){
       a$m om = a$m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, om, "1")) {
          return;
       }
       if (p0) {
          this.a.S().R();
       }
       return;
    }
}
