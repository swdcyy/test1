package com.yxcorp.gifshow.notice.krn.j;
import android.content.DialogInterface$OnClickListener;
import com.yxcorp.gifshow.notice.krn.l;
import com.yxcorp.gifshow.notice.data.model.Notice;
import android.app.Activity;
import f55.g;
import java.lang.Object;
import android.content.DialogInterface;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import mz6.b;
import android.content.Context;
import mz6.b$d;
import nfc.j;
import qtb.q;
import android.content.DialogInterface$OnCancelListener;
import com.yxcorp.gifshow.notice.krn.e;
import android.app.Dialog;
import o56.a;
import android.app.Application;
import android.content.ClipboardManager;
import java.lang.CharSequence;
import android.content.ClipData;
import e17.i;
import com.kwai.feature.api.social.bridge.beans.JsNoticeResult;

public final class j implements DialogInterface$OnClickListener	// class@0021aa
{
    public final l b;
    public final Notice c;
    public final int d;
    public final Activity e;
    public final g f;

    public void j(l p0,Notice p1,int p2,Activity p3,g p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void onClick(DialogInterface p0,int p1){
       j tb = this.b;
       j tc = this.c;
       j td = this.d;
       j te = this.e;
       j tf = this.f;
       Objects.requireNonNull(tb);
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object[] objArray = new Object[]{tc,Integer.valueOf(td),Integer.valueOf(p1),te,tf};
          if (!PatchProxy.applyVoid(objArray, tb, ol, "12")) {
          label_0039 :
             int i = 0x7f104270;
             if (p1 == i) {
                b uob = new b(te);
                uob.n(R.string.arg_RES_7f10425d);
                uob.a(j.a(R.color.arg_RES_7f060c49, i));
                uob.k(new q(tb, tc, tf));
                uob.l(new e(tb, tc, tf));
                uob.q();
                tb.n(tc.mId, "logDialogDeleteClick", 0, 1);
                tb.n(tc.mId, "logShowDeleteDialog", 0, 0);
             }else if(p1 == 0x7f101c20){
                tb.F(true, te, tc, td, tf);
                tb.n(tc.mId, "logDisturbClick", 1, 1);
             }else if(p1 == 0x7f101c1c){
                tb.F(false, te, tc, td, tf);
                tb.n(tc.mId, "logDisturbClick", 0, 1);
             }else if(p1 == 0x7f10082b){
                ClipboardManager systemServic = a.B.getSystemService("clipboard");
                if (systemServic != null) {
                   systemServic.setPrimaryClip(ClipData.newPlainText(null, tc.mContentUrl));
                   i.a(R.style.arg_RES_7f110669, 0x7f100833);
                   tf.onSuccess(new JsNoticeResult(1, "copy"));
                }
             }
          }
       }else {
          goto label_0039 ;
       }
       return;
    }
}
