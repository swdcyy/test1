package com.yxcorp.gifshow.notice.krn.i;
import android.content.DialogInterface$OnClickListener;
import com.yxcorp.gifshow.notice.krn.l;
import com.yxcorp.gifshow.notice.box.data.NoticeBox;
import f55.g;
import java.lang.Object;
import android.content.DialogInterface;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import ysb.a;
import brd.t;
import qtb.j;
import qtb.l;
import erd.g;
import crd.b;

public final class i implements DialogInterface$OnClickListener	// class@0021a9
{
    public final l b;
    public final NoticeBox c;
    public final g d;

    public void i(l p0,NoticeBox p1,g p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void onClick(DialogInterface p0,int p1){
       i tb = this.b;
       i tc = this.c;
       i td = this.d;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidTwoRefs(tc, td, tb, l.class, "15")) {
       }else {
          b.a(0x636667f2).b(tc.mId).subscribe(new j(td), new l(td));
       }
       tb.n(tc.mId, "logBoxDeleteDialogConfirmClick", false, true);
       return;
    }
}
