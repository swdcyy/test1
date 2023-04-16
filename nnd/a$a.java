package nnd.a$a;
import com.yxcorp.gifshow.v3.EditorManager$b;
import nnd.a;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import yld.a;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import ooc.c1;

public final class a$a implements EditorManager$b	// class@001e8f
{
    public final a a;
    public final EditorItemFunc b;

    public void a$a(a p0,EditorItemFunc p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void d(EditorItemFunc p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       if (p0 != this.b) {
          EditDecorationBaseDrawer selectDrawer = this.a.I().getSelectDrawer();
          if (selectDrawer != null) {
             a.o(selectDrawer, "mContainerView.selectDrawer ?: return");
             if (!selectDrawer.isSubtitle()) {
                this.a.I().R();
             }
          }
       }
       return;
    }
    public void e(){
       c1.b(this);
    }
    public void f(){
       c1.a(this);
    }
}
