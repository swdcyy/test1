package com.yxcorp.gifshow.v3.editor.sticker.s;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import t36.f;
import com.yxcorp.gifshow.v3.editor.sticker.s$a;
import com.yxcorp.gifshow.v3.editor.sticker.s$b;
import com.yxcorp.gifshow.v3.editor.sticker.tag.a;
import stc.c;
import com.yxcorp.gifshow.v3.editor.sticker.element.vm.StickerElementViewModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import eba.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.f;
import java.util.Objects;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import ltc.a;
import faa.a;
import q87.c;
import lwc.h;
import itc.c0;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import io.reactivex.subjects.PublishSubject;
import itc.f0;
import com.yxcorp.gifshow.v3.editor.sticker.m;
import erd.g;
import crd.b;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import itc.e0;
import com.yxcorp.gifshow.v3.editor.sticker.n;
import lwc.d;
import uwc.b;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import voc.o;
import androidx.lifecycle.MutableLiveData;

public class s extends PresenterV2	// class@001290
{
    public d A;
    public final f B;
    public final y C;
    public f D;
    public g E;
    public o p;
    public c q;
    public BaseFragment r;
    public h s;
    public b t;
    public StickerElementViewModel u;
    public a v;
    public MutableLiveData w;
    public EditDecorationContainerView x;
    public z y;
    public Observer z;

    public void s(f p0,f p1){
       super();
       this.z = null;
       this.C = new s$a(this);
       this.E = new s$b(this);
       this.U7(new a());
       this.U7(new c());
       this.D = p1;
       this.B = p0;
    }
    public void E8(){
       StickerElementViewModel stickerEleme = StickerElementViewModel.class;
       String str = "3";
       if (PatchProxy.applyVoid(null, this, s.class, str)) {
          return;
       }
       this.u = ViewModelProviders.of(this.r).get(stickerEleme);
       a uoa = this.q.U0();
       this.v = uoa;
       uoa.c0();
       s tu = this.u;
       s tv = this.v;
       boolean b = f.E(this.q.a1());
       Objects.requireNonNull(tu);
       if (!PatchProxy.isSupport(stickerEleme) || !PatchProxy.applyVoidTwoRefs(tv, Boolean.valueOf(b), tu, stickerEleme, "2")) {
          String str1 = "stickerDraft";
          a.p(tv, str1);
          StickerElementViewModel p = tu.p;
          Objects.requireNonNull(p);
          if (!PatchProxy.applyVoidOneRefs(tv, p, a.class, str)) {
             a.p(tv, str1);
             p.a = tv;
             Object[] objArray = new Object[0];
             a.D().w("StickerElementRepo", "init", objArray);
          }
          tu.n = b;
       }
       this.s = f.l(this.r);
       if (this.z == null) {
          this.z = new c0(this);
       }
       this.w.observe(this.r, this.z);
       this.X7(this.s.D0().subscribe(new f0(this), m.b));
       this.B.d(this.C);
       this.D.d(this.E);
       this.X7(this.r.m().subscribe(new e0(this), n.b));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, s.class, "6")) {
          return;
       }
       this.D.c(this.E);
       s tz = this.z;
       if (tz != null) {
          this.w.removeObserver(tz);
       }
       if (this.A.c("SinglePicStickerEditPresenter")) {
          this.A.d("SinglePicStickerEditPresenter");
       }
       return;
    }
    public final void P8(boolean p0){
       s os = s.class;
       if (PatchProxy.isSupport(os) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, os, "5")) {
          return;
       }
       if (this.v.D() && p0) {
          this.v.g(true);
       }
       s tt = this.t;
       if (tt != null) {
          tt.V0();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "2")) {
          return;
       }
       this.x = m1.f(p0, 0x7f0a0a6c);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, s.class, "1")) {
          return;
       }
       this.r = this.r8("FRAGMENT");
       this.p = this.r8("EDITOR_CONTEXT");
       this.q = this.r8("WORKSPACE");
       this.w = this.r8("EDIT_PREVIEW_INIT_LIVE_DATA");
       this.A = this.r8("EDIT_PREVIEW_PREPARE_TASK_MANAGER");
       return;
    }
}
