package com.yxcorp.gifshow.notice.krn.k;
import android.content.DialogInterface$OnClickListener;
import com.yxcorp.gifshow.notice.krn.l;
import com.yxcorp.gifshow.notice.data.model.Notice;
import f55.g;
import java.lang.Object;
import android.content.DialogInterface;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.reminder.data.model.ReminderLongPressActionModel;
import ztb.g;
import wkd.b;
import pcc.a;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.notice.krn.f;
import erd.o;
import qtb.m;
import bp6.a;
import erd.g;
import crd.b;

public final class k implements DialogInterface$OnClickListener	// class@0021ab
{
    public final l b;
    public final Notice c;
    public final int d;
    public final g e;
    public final boolean f;

    public void k(l p0,Notice p1,int p2,g p3,boolean p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void onClick(DialogInterface p0,int p1){
       k tb = this.b;
       k tc = this.c;
       k td = this.d;
       k te = this.e;
       k tf = this.f;
       Objects.requireNonNull(tb);
       if (!PatchProxy.isSupport(l.class) || !PatchProxy.applyVoidThreeRefs(tc, Integer.valueOf(td), te, tb, l.class, "17")) {
          ReminderLongPressActionModel reminderLong = g.e(tc);
          if (reminderLong != null) {
             b.a(0x428e0eda).a(td, reminderLong.mActionStatus, reminderLong.mActionType, reminderLong.mActionId).subscribeOn(d.c).map(f.b).observeOn(d.a).subscribe(new m(te, reminderLong), new a());
          }
       }
       tb.n(tc.mId, "logDisturbConfirmClick", tf, true);
       return;
    }
}
