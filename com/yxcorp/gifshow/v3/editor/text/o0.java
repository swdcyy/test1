package com.yxcorp.gifshow.v3.editor.text.o0;
import erd.g;
import com.yxcorp.gifshow.v3.editor.text.ReEditCoverPresenter;
import android.app.Activity;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.text.ReEditCoverPresenter$Action;
import java.util.Objects;
import faa.a;
import java.lang.String;
import q87.c;
import com.yxcorp.gifshow.fragment.AttrAnimProgressFragment;
import androidx.fragment.app.DialogFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import com.yxcorp.gifshow.v3.editor.text.p0;
import io.reactivex.g;
import huc.m0;
import huc.k0;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class o0 implements g	// class@00147c
{
    public final ReEditCoverPresenter b;
    public final Activity c;

    public void o0(ReEditCoverPresenter p0,Activity p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       o0 tb = this.b;
       o0 tc = this.c;
       Objects.requireNonNull(tb);
       int i = 0;
       String str = "ReEditCoverPresenter";
       if (p0 == ReEditCoverPresenter$Action.SAVE) {
          Object[] objArray = new Object[i];
          a.D().s(str, "Action.SAVE", objArray);
          p0 = new AttrAnimProgressFragment();
          p0.setCancelable(i);
          p0.show(tb.r.q().getChildFragmentManager(), str);
          if (tb.p.a1() == Workspace$Type.SINGLE_PICTURE && DraftUtils.y(tb.p) - DraftUtils.s(tb.p) > 0) {
             t ot = PatchProxy.apply(null, tb, ReEditCoverPresenter.class, "6");
             if (ot != PatchProxyResult.class) {
             }else {
                ot = t.create(new p0(tb));
             }
             tb.X7(ot.subscribe(new m0(tb, tc, p0), new k0(tb, tc, p0)));
          }else {
             tb.S8(p0, tc);
          }
       }else {
          tb.P8(tc, R.anim.arg_RES_7f0100f3, 0x7f01010d);
          Object[] objArray1 = new Object[i];
          a.D().s(str, "CANCEL", objArray1);
       }
       return;
    }
}
