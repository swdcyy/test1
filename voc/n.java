package voc.n;
import com.yxcorp.gifshow.v3.editor.j;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.BaseEditor;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import java.util.List;
import java.util.Collection;
import java.util.Objects;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;

public abstract class n extends j	// class@004058
{
    public EditReduxViewModel t;

    public void n(){
       super();
    }
    public void B(EditorDelegate p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, n.class, "3")) {
          return;
       }
       a.p(p0, "delegate");
       a.p(p1, "subType");
       super.B(p0, p1);
       EditReduxViewModel uEditReduxVi = this.U();
       this.t = uEditReduxVi;
       if (uEditReduxVi == null) {
          a.S("bizViewModel");
       }
       uEditReduxVi.p0().addAll(this.V());
       return;
    }
    public void I(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, n.class, "4")) {
          return;
       }
       super.I();
       n tt = this.t;
       if (tt == null) {
          a.S("bizViewModel");
       }
       Objects.requireNonNull(tt);
       if (!PatchProxy.applyVoid(objArray, tt, EditReduxViewModel.class, "8")) {
          EditReduxViewModel d = tt.d;
          if (d != null) {
             d.dispose();
          }
       }
       return;
    }
    public final EditReduxViewModel T(){
       n obj = PatchProxy.apply(null, this, n.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.t;
       if (obj == null) {
          a.S("bizViewModel");
       }
       return obj;
    }
    public abstract EditReduxViewModel U();
    public List V(){
       Object obj = PatchProxy.apply(null, this, n.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ArrayList();
    }
}
