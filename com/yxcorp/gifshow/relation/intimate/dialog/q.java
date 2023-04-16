package com.yxcorp.gifshow.relation.intimate.dialog.q;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.relation.intimate.dialog.p;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.relation.intimate.dialog.e;
import com.yxcorp.gifshow.model.IntimateRelationDialogParams;
import lnc.a1;
import com.yxcorp.gifshow.model.IntimateRelationInfo;
import java.lang.CharSequence;
import e17.i;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.util.Objects;
import java.lang.Boolean;
import crd.b;
import com.yxcorp.utility.TextUtils;
import abc.a0;
import abc.b0;
import erd.g;
import com.yxcorp.gifshow.relation.intimate.helper.i;

public class q extends m	// class@001901
{
    public final p c;

    public void q(p p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "1")) {
          return;
       }
       q tc = this.c;
       e i = tc.i;
       int i1 = 1;
       if (i.isFromAgree == null) {
          int i2 = 2;
          if (i.mRelationStatus == i2) {
             Object[] objArray = new Object[i2];
             IntimateRelationInfo mName = this.c.h.mName;
             objArray[0] = mName;
             objArray[i1] = mName;
             i.d(R.style.arg_RES_7f11066a, String.format(a1.p(R.string.arg_RES_7f103fb1), objArray));
             return;
          }
       }
       int i3 = tc.m.getSwitch() ^ i1;
       Objects.requireNonNull(tc);
       p op = p.class;
       if (!PatchProxy.isSupport(op) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(i3), tc, op, "11")) {
          tc.m.g(i3, i1, i1);
          op = tc.t;
          if (op != null && (!op.isDisposed() && tc.u != null)) {
             tc.t.dispose();
          }
       label_006f :
          if (!TextUtils.x(tc.i.mTargetId)) {
             tc.u = i1;
             e i4 = tc.i;
             tc.t = i.d(i4.mTargetId, i3, i4.mSource, new a0(tc), new b0(tc));
          }
       }
       return;
    }
}
