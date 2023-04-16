package com.yxcorp.gifshow.v3.editor.text.ReEditCoverPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.text.o0;
import huc.j0;
import erd.g;
import crd.b;
import brd.t;
import java.lang.Integer;
import com.yxcorp.gifshow.fragment.AttrAnimProgressFragment;
import java.lang.Throwable;
import androidx.fragment.app.Fragment;
import e17.i;
import com.yxcorp.gifshow.util.PostUtils;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import t45.d;
import brd.z;
import huc.i0;
import erd.a;
import io.reactivex.internal.functions.Functions;
import huc.l0;
import qaa.a;
import io.reactivex.subjects.PublishSubject;

public class ReEditCoverPresenter extends PresenterV2	// class@0013a1
{
    public c p;
    public a q;
    public EditorDelegate r;
    public PublishSubject s;

    public void ReEditCoverPresenter(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, ReEditCoverPresenter.class, "2")) {
          return;
       }
       if (this.getActivity() == null) {
          return;
       }
       Activity activity = this.getActivity();
       if (!this.r.p()) {
          return;
       }
       this.X7(this.s.subscribe(new o0(this, activity), new j0(this, activity)));
       return;
    }
    public final void P8(Activity p0,int p1,int p2){
       if (PatchProxy.isSupport(ReEditCoverPresenter.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, ReEditCoverPresenter.class, "4")) {
          return;
       }
       p0.setResult(0);
       p0.finish();
       p0.overridePendingTransition(p1, p2);
       return;
    }
    public final void R8(Activity p0,AttrAnimProgressFragment p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ReEditCoverPresenter.class, "3")) {
          return;
       }
       if (p1 != null && p1.isAdded()) {
          p1.dismiss();
       }
       i.a(R.style.arg_RES_7f110668, 0x7f103678);
       PostUtils.D("ReEditCoverPresenter", "save failed", p2);
       this.P8(p0, R.anim.arg_RES_7f0100f3, 0x7f01010d);
       return;
    }
    public final void S8(AttrAnimProgressFragment p0,Activity p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReEditCoverPresenter.class, "5")) {
          return;
       }
       this.X7(DraftFileManager.E().j0(this.p, false).observeOn(d.a).doAfterTerminate(new i0(this, p1, p0)).subscribe(Functions.d(), new l0(this, p1, p0)));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, ReEditCoverPresenter.class, "1")) {
          return;
       }
       this.p = this.r8("WORKSPACE");
       this.q = this.r8("COVER");
       this.r = this.r8("EDITOR_DELEGATE");
       this.s = this.r8("COVER_OUTFILE_EVENT");
       return;
    }
}
