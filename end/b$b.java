package end.b$b;
import com.yxcorp.gifshow.v3.EditorManager$b;
import end.b;
import java.lang.Object;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import kod.a;
import hnd.f;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.UpdateProjectAction;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import ooc.c1;

public final class b$b implements EditorManager$b	// class@000d9d
{
    public boolean a;
    public final b b;

    public void b$b(b p0){
       this.b = p0;
       super();
    }
    public void d(EditorItemFunc p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
          return;
       }
       if (p0 == EditorItemFunc.COVER_VIDEO) {
          this.a = true;
       }
       if (p0 == EditorItemFunc.SUBTITLE_V2) {
          EditDecorationContainerViewV2.P0(this.b.S(), false, false, 2, null);
          this.b.S().setAllowedInterceptChange(false);
       }
       this.b.e0();
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, b$b.class, "2")) {
          return;
       }
       if (this.a != null) {
          this.b.s0().t0(new UpdateProjectAction(false));
          this.a = false;
       }
       this.b.S().setAllowedInterceptChange(true);
       return;
    }
    public void f(){
       c1.a(this);
    }
}
