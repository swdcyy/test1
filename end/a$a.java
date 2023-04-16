package end.a$a;
import com.yxcorp.gifshow.v3.EditorManager$b;
import end.a;
import java.lang.Object;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yld.a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextBaseElement;
import kotlin.jvm.internal.a;
import ooc.c1;

public final class a$a implements EditorManager$b	// class@000d99
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void d(EditorItemFunc p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       if (p0 != this.a.H()) {
          this.a.I().R();
       }
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "2")) {
          return;
       }
       EditDecorationBaseDrawer selectDrawer = this.a.I().getSelectDrawer();
       if (selectDrawer != null) {
          a.o(selectDrawer, "mContainerView.selectDrawer ?: return");
          if (selectDrawer.isSubtitle()) {
             this.a.I().R();
          }
       }
       return;
    }
    public void f(){
       c1.a(this);
    }
}
