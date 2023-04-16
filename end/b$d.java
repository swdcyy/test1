package end.b$d;
import java.lang.Runnable;
import end.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import kod.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.v3.EditorManager$b;
import com.yxcorp.gifshow.v3.EditorManager;

public final class b$d implements Runnable	// class@000d9f
{
    public final b b;

    public void b$d(b p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b$d.class, "1")) {
          return;
       }
       b$d tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, b.class, "12")) {
          BaseFragment uBaseFragmen = tb.Q().q();
          if (!uBaseFragmen instanceof BaseEditorFragment) {
             uBaseFragmen = objArray;
          }
          if (uBaseFragmen != null) {
             objArray = uBaseFragmen.B;
          }
          if (objArray != null) {
             objArray.f(tb.G);
          }
       }
       return;
    }
}
