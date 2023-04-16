package lld.a;
import com.yxcorp.gifshow.v3.editor.j;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import voc.o;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.BaseEditor;
import java.lang.Boolean;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import com.yxcrop.gifshow.v3.editor.crop.CropEditorFragment;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcrop.gifshow.v3.editor.crop.CropEditorFragment$b;
import aw9.c0;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import oa0.a;
import android.content.SharedPreferences;
import hba.a;
import haa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import eba.a;
import faa.a;
import q87.c;
import tkd.b;
import tkd.d;
import com.yxcorp.gifshow.dialog.PostDialogPlugin;
import u07.t$a;
import android.app.Activity;
import com.yxcorp.gifshow.dialog.PostDialogPlugin$DialogScenario;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.yxcorp.gifshow.v3.editor.BaseEditor$a;
import com.kwai.robust.PatchProxyResult;

public class a extends j	// class@001c3f
{
    public EditDecorationContainerView t;

    public void a(EditDecorationContainerView p0){
       super();
       this.t = p0;
    }
    public void C(o p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
          return;
       }
       if (this.f != null) {
          this.T();
       }
       return;
    }
    public void D(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "3")) {
          return;
       }
       this.t(p0);
       this.c(R.dimen.arg_RES_7f07038f, false);
       return;
    }
    public void G(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
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
       SharedPreferences a;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "1")) {
          return;
       }
       c childFragmen = this.d.q().getChildFragmentManager();
       if (this.f == null) {
          BaseEditorFragment uBaseEditorF = this.f(childFragmen, "cropEditor", CropEditorFragment.class);
          this.f = uBaseEditorF;
          if (uBaseEditorF == null) {
             uBaseEditorF = new CropEditorFragment();
          }
          this.f = uBaseEditorF;
          uBaseEditorF.uh(this.d, this.i);
          this.f.G.l = this.t;
       }
       e uoe = childFragmen.beginTransaction();
       uoe.y(R.anim.arg_RES_7f010105, 0x7f01010d);
       this.a("cropEditor", uoe);
       this.S(this.d.x(), this.d.O());
       this.T();
       boolean b = true;
       this.c(R.dimen.arg_RES_7f07038f, b);
       childFragmen = this.i().N();
       if (childFragmen != null) {
          a = a.a;
          if (a.getBoolean("first_show_crop_popup", b) && (!a.r(childFragmen).E() || !a.q(childFragmen).E())) {
             Object[] objArray1 = new Object[0];
             a.D().s("cropEditor", "text/sticker exist, popup", objArray1);
             if (!PatchProxy.applyVoid(objArray, this, uoa, "2")) {
                t$a uoa1 = new t$a(this.i().getContext());
                uoa1.y0(R.string.arg_RES_7f100bcb);
                uoa1.S0(R.string.arg_RES_7f101812);
                d.a(0x34dc9f9c).lV(uoa1, PostDialogPlugin$DialogScenario.UNKNOWN);
             }
             SharedPreferences$Editor uEditor = a.edit();
             uEditor.putBoolean("first_show_crop_popup", 0);
             g.a(uEditor);
          }
       }
       return;
    }
    public final void T(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       this.f.G.f = this.s;
       return;
    }
    public BaseEditor$a d(){
       Object obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new BaseEditor$a(this, 21, this.i);
    }
    public int q(){
       return 0x7f07038f;
    }
    public boolean y(){
       return false;
    }
}
