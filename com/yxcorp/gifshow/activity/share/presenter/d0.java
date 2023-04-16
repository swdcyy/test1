package com.yxcorp.gifshow.activity.share.presenter.d0;
import erd.g;
import com.yxcorp.gifshow.activity.share.presenter.h0;
import java.lang.Object;
import java.lang.Integer;
import f66.i;
import jq.a;
import java.lang.String;
import q87.c;
import com.yxcorp.gifshow.fragment.AttrAnimProgressFragment;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import oa0.a;
import lq.l$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import brd.t;
import brd.z;
import io.reactivex.android.schedulers.a;
import zw8.p0;
import zw8.n0;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class d0 implements g	// class@0013d6
{
    public final h0 b;

    public void d0(h0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d0 tb = this.b;
       int i = 0;
       if (tb.v != null) {
          Object[] objArray = new Object[i];
          a.b().w("ShareCancelPresenter", "return when finishing", objArray);
       }else {
          tb.v = true;
          AttrAnimProgressFragment uAttrAnimPro = new AttrAnimProgressFragment();
          tb.u = uAttrAnimPro;
          uAttrAnimPro.setCancelable(i);
          tb.u.show(tb.r.getSupportFragmentManager(), "ShareCancel");
          tb.P8();
          if (tb.q == null || p0.intValue() == 3) {
             tb.R8(i);
          }else if(p0.intValue() == 2){
             a.s1(i);
             tb.S8(null);
          }else if(PatchProxy.applyVoid(null, tb, h0.class, "7")){
             tb.X7(DraftFileManager.E().p(tb.q).observeOn(a.c()).subscribe(new p0(tb), new n0(tb)));
          }
       }
       return;
    }
}
