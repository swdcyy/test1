package com.yxcorp.gifshow.notice.krn.e;
import android.content.DialogInterface$OnClickListener;
import com.yxcorp.gifshow.notice.krn.l;
import com.yxcorp.gifshow.notice.data.model.Notice;
import f55.g;
import java.lang.Object;
import android.content.DialogInterface;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import ntb.a;
import brd.t;
import t45.d;
import brd.z;
import qtb.g;
import bp6.a;
import erd.g;
import crd.b;

public final class e implements DialogInterface$OnClickListener	// class@0021a5
{
    public final l b;
    public final Notice c;
    public final g d;

    public void e(l p0,Notice p1,g p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void onClick(DialogInterface p0,int p1){
       e tb = this.b;
       e tc = this.c;
       e td = this.d;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidTwoRefs(tc, td, tb, l.class, "13")) {
       }else {
          b.a(0x59c99826).g(tc.mId, tc.mAggregate).subscribeOn(d.c).observeOn(d.a).subscribe(new g(td), new a());
       }
       tb.n(tc.mId, "logDeleteConfirmClick", false, true);
       return;
    }
}
