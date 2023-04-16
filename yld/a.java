package yld.a;
import yld.l;
import ei0.a;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import amd.c;
import com.yxcrop.gifshow.v3.editor.decoration_v2.ui.DecorationTimelineFragment;
import yld.a$a;
import yld.a$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import yld.a$c;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.v3.EditorManager$b;
import com.yxcorp.gifshow.v3.EditorManager;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;

public abstract class a extends a implements l	// class@002a58
{
    public final EditDecorationContainerViewV2 c;
    public final c d;
    public final DecorationTimelineFragment e;
    public final a$a f;
    public final EditorManager$b g;
    public final Fragment h;
    public final EditorDelegate i;
    public final EditorItemFunc j;
    public final boolean k;

    public void a(View p0,Fragment p1,EditorDelegate p2,EditorItemFunc p3,boolean p4){
       a.p(p0, "rootView");
       a.p(p1, "fragment");
       a.p(p2, "editorDelegate");
       a.p(p3, "func");
       super(p0);
       this.h = p1;
       this.i = p2;
       this.j = p3;
       this.k = p4;
       p0 = p0.findViewById(R.id.new_text_decoration_editor_view);
       a.o(p0, "rootView.findViewById\(R.¡­t_decoration_editor_view\)");
       this.c = p0;
       this.d = this.M(p1);
       this.e = this.L(p4);
       this.f = new a$a(this);
       this.g = new a$b(this);
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       k1.r(new a$c(this), 5);
       this.c.d(this.f);
       return;
    }
    public void C(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "4")) {
          BaseFragment uBaseFragmen = this.i.q();
          if (!uBaseFragmen instanceof BaseEditorFragment) {
             uBaseFragmen = objArray;
          }
          if (uBaseFragmen != null) {
             objArray = uBaseFragmen.B;
          }
          if (objArray != null) {
             objArray.F(this.F());
          }
       }
       this.c.M(this.f);
       return;
    }
    public abstract boolean D(BaseDrawer p0);
    public final EditorDelegate E(){
       return this.i;
    }
    public EditorManager$b F(){
       return this.g;
    }
    public final Fragment G(){
       return this.h;
    }
    public final EditorItemFunc H(){
       return this.j;
    }
    public final EditDecorationContainerViewV2 I(){
       return this.c;
    }
    public final DecorationTimelineFragment J(){
       return this.e;
    }
    public final c K(){
       return this.d;
    }
    public abstract DecorationTimelineFragment L(boolean p0);
    public abstract c M(Fragment p0);
    public abstract void N(EditDecorationBaseDrawer p0);
}
