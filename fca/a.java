package fca.a;
import com.yxcorp.gifshow.v3.editor.j;
import voc.o;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.BaseEditor;
import com.yxcorp.gifshow.editor.fine.tuning.FineTuningEditorFragment;
import com.yxcorp.gifshow.v3.editor.i;
import java.lang.Boolean;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import aw9.c0;
import com.yxcorp.gifshow.v3.editor.BaseEditor$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.edit.draft.Workspace$Type;

public class a extends j	// class@0022f7
{

    public void a(){
       super();
    }
    public void C(o p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       BaseEditor tf = this.f;
       if (tf != null) {
          tf.yh(this.s);
       }
       return;
    }
    public void D(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "2")) {
          return;
       }
       this.t(p0);
       this.c(this.q(), false);
       return;
    }
    public void G(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       BaseEditor tf = this.f;
       if (tf != null && tf.isAdded()) {
          this.d.q().getChildFragmentManager().beginTransaction().u(this.f).m();
       }
       this.f = null;
       return;
    }
    public void H(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       c childFragmen = this.d.q().getChildFragmentManager();
       if (this.f == null) {
          BaseEditorFragment uBaseEditorF = this.f(childFragmen, "FineTuningEditor", FineTuningEditorFragment.class);
          this.f = uBaseEditorF;
          if (uBaseEditorF == null) {
             uBaseEditorF = new FineTuningEditorFragment();
          }
          this.f = uBaseEditorF;
          uBaseEditorF.uh(this.d, this.i);
       }
       e uoe = childFragmen.beginTransaction();
       uoe.y(R.anim.arg_RES_7f010105, 0x7f01010d);
       this.S(this.d.x(), this.d.O());
       this.f.yh(this.s);
       this.c(this.q(), true);
       this.b("FineTuningEditor", uoe);
       return;
    }
    public BaseEditor$a d(){
       Object obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new BaseEditor$a(this, 21, this.i);
    }
    public int q(){
       Object obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.i().getType() != Workspace$Type.KTV_SONG || (!this.v() || this.i().getType() == Workspace$Type.SINGLE_PICTURE)) {
          return 0x7f070395;
       }
       return 0x7f070394;
    }
}
