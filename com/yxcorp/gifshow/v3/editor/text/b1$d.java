package com.yxcorp.gifshow.v3.editor.text.b1$d;
import wpc.a0;
import com.yxcorp.gifshow.v3.editor.text.b1;
import java.lang.Object;
import wpc.z;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.kuaishou.edit.draft.Workspace$Source;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import com.kuaishou.edit.draft.AssetSegment;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import vpc.c;
import com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement;
import faa.a;
import q87.c;
import android.app.Activity;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import k2b.e0;
import hvc.a;
import e17.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.v3.editor.text.tts.g;
import huc.b0;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.kuaishou.edit.draft.TtsAudio;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import erd.r;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import com.yxcorp.gifshow.fragment.AttrAnimProgressFragment;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import brd.t;
import t45.d;
import brd.z;
import huc.e1;
import erd.o;
import huc.d1;
import erd.a;
import erd.g;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.v3.editor.text.c1;
import crd.b;

public class b1$d implements a0	// class@0013ad
{
    public boolean a;
    public final b1 b;

    public void b1$d(b1 p0){
       this.b = p0;
       super();
       this.a = false;
    }
    public void a(){
       z.d(this);
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, b1$d.class, "1")) {
          return;
       }
       if (DraftUtils.o(this.b.s) || (this.b.s.T0() != Workspace$Source.REEDIT && (this.a == null && !this.b.N.E0()))) {
          this.b.M.onNext(Boolean.TRUE);
          this.a = true;
       }
    label_003d :
       return;
    }
    public void c(AssetSegment p0,Size p1,Size p2,c p3){
       z.e(this, p0, p1, p2, p3);
    }
    public void d(){
       z.h(this);
    }
    public void e(EditTextBaseElement p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b1$d.class, "2")) {
          return;
       }
       String str = "TextCommonPresenter";
       int i = 0;
       if (p0 == null) {
          Object[] objArray = new Object[i];
          a.D().w(str, "decorationDrawer is null", objArray);
          return;
       }else {
          boolean b = true;
          if ((p0.getText()).isEmpty()) {
             a.c(this.b.y.getContext(), b);
             i.a(R.style.arg_RES_7f11066a, 0x7f100cb7);
             return;
          }else if(!this.b.getActivity() instanceof GifshowActivity || this.b.S.f() == null){
             b1$d tb = this.b;
             tb.P = b;
             e0 context = tb.y.getContext();
             boolean b1 = (this.b.S.e(p0.getDecorationId()) == null)? true: false;
             a.c(context, b1);
             this.b.L.R();
             tb = this.b;
             tb.L.c0(tb.V0, i);
             if (this.b.W != null) {
                tb = this.b;
                FragmentActivity activity = tb.r.getActivity();
                Objects.requireNonNull(tb);
                if (!PatchProxy.applyVoidOneRefs(activity, tb, b1.class, "8")) {
                   Object[] objArray1 = new Object[i];
                   a.D().w(str, "tts showWaitingDialog: ", objArray1);
                   if (tb.X == null) {
                      AttrAnimProgressFragment uAttrAnimPro = new AttrAnimProgressFragment();
                      tb.X = uAttrAnimPro;
                      uAttrAnimPro.vh(b);
                      tb.X.uh(R.dimen.arg_RES_7f070340, 0x7f070340);
                   }
                   tb.X.setCancelable(i);
                   tb.X.show(activity.getSupportFragmentManager(), str);
                }
                t.just(new Object()).observeOn(d.c).map(new e1(this)).observeOn(d.a).doAfterTerminate(new d1(this, p0)).subscribe(Functions.d(), c1.b);
             }else {
                this.b.W8(p0);
             }
          }
          return;
       }
    }
    public void f(){
       z.g(this);
    }
    public void g(EditTextBaseElement p0){
       z.c(this, p0);
    }
    public void h(boolean p0){
       if (PatchProxy.isSupport(b1$d.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, b1$d.class, "3")) {
          return;
       }
       this.b.X8();
       return;
    }
}
