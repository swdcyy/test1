package com.yxcorp.gifshow.notice.krn.h;
import android.content.DialogInterface$OnClickListener;
import com.yxcorp.gifshow.notice.krn.l;
import com.yxcorp.gifshow.notice.box.data.NoticeBox;
import android.app.Activity;
import f55.g;
import java.lang.Object;
import android.content.DialogInterface;
import java.util.Objects;
import java.lang.String;
import mz6.b;
import android.content.Context;
import mz6.b$d;
import nfc.j;
import qtb.b;
import android.content.DialogInterface$OnCancelListener;
import com.yxcorp.gifshow.notice.krn.i;
import android.app.Dialog;

public final class h implements DialogInterface$OnClickListener	// class@0021a8
{
    public final l b;
    public final NoticeBox c;
    public final Activity d;
    public final g e;

    public void h(l p0,NoticeBox p1,Activity p2,g p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void onClick(DialogInterface p0,int p1){
       h tb = this.b;
       h tc = this.c;
       h te = this.e;
       Objects.requireNonNull(tb);
       tb.n(tc.mId, "logBoxShowDeleteConfirmDialog", false, false);
       tb.n(tc.mId, "logBoxDeleteDialogClick", false, true);
       b uob = new b(this.d);
       uob.n(R.string.arg_RES_7f10425d);
       uob.a(j.a(R.color.arg_RES_7f060c49, 0x7f104270));
       uob.k(new b(tb, te, tc));
       uob.l(new i(tb, tc, te));
       uob.q();
    }
}
