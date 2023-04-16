package com.yxcorp.gifshow.relation.intimate.dialog.p$c;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.relation.intimate.dialog.p;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.relation.intimate.dialog.e;
import cbc.b;
import k2b.h;
import k2b.e0;
import com.yxcorp.gifshow.model.IntimateRelationDialogParams;
import java.util.Objects;
import java.lang.Integer;
import v9c.a;
import q87.c;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.DialogFragment;
import android.app.Activity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import crd.b;
import wkd.b;
import xac.s;
import brd.t;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import brd.x;
import cjd.e;
import erd.o;
import com.yxcorp.gifshow.relation.intimate.dialog.o;
import t45.d;
import brd.z;
import abc.z;
import erd.a;
import com.yxcorp.gifshow.relation.intimate.dialog.n;
import com.yxcorp.gifshow.relation.intimate.dialog.m;
import erd.g;

public class p$c extends m	// class@0018fd
{
    public final p c;

    public void p$c(p p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p$c.class, "1")) {
          return;
       }
       e g = this.c.g;
       ProgressFragment obj = null;
       if (!PatchProxy.applyVoidOneRefs(g, obj, b.class, "40")) {
          h.k("PRODUCE_PHOTO").i(g);
       }
       p$c tc = this.c;
       e i = tc.i;
       IntimateRelationDialogParams mTargetId = i.mTargetId;
       IntimateRelationDialogParams mIntimateTyp = i.mIntimateType;
       Objects.requireNonNull(tc);
       p op = p.class;
       if (!PatchProxy.isSupport(op) || !PatchProxy.applyVoidTwoRefs(mTargetId, Integer.valueOf(mIntimateTyp), tc, op, "6")) {
          Object[] objArray = new Object[0];
          a.C().w("IntimateRelationSuccessDialog", "launchPostMediaScene: start request MediaSceneParams.", objArray);
          obj = PatchProxy.apply(obj, tc, op, "19");
          if (obj != PatchProxyResult.class) {
          }else {
             obj = new ProgressFragment();
             obj.setCancelable(0);
             obj.zh(0);
          }
          if (!PatchProxy.applyVoidOneRefs(obj, tc, op, "20") && !tc.g.isFinishing()) {
             obj.show(tc.g.getSupportFragmentManager(), "loading");
          }
          op = tc.t;
          if (op != null && !op.isDisposed()) {
             tc.t.dispose();
          }
          tc.t = b.a(-1334121008).A(mTargetId, mIntimateTyp).compose(tc.g.E2(ActivityEvent.DESTROY)).map(new e()).flatMap(new o(tc)).subscribeOn(d.c).observeOn(d.a).doFinally(new z(tc, obj)).subscribe(n.b, m.b);
       }
       return;
    }
}
