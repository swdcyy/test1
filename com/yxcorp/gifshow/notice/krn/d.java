package com.yxcorp.gifshow.notice.krn.d;
import android.content.DialogInterface$OnClickListener;
import com.yxcorp.gifshow.notice.krn.l;
import com.yxcorp.gifshow.notice.data.model.Notice;
import android.app.Activity;
import f55.g;
import java.lang.Object;
import android.content.DialogInterface;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.GifshowActivity;
import jga.f$a;
import com.kwai.framework.model.user.User;
import jga.c;
import wca.b;
import jga.f;
import brd.t;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import qtb.f;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public final class d implements DialogInterface$OnClickListener	// class@0021a4
{
    public final l b;
    public final Notice c;
    public final Activity d;
    public final g e;

    public void d(l p0,Notice p1,Activity p2,g p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void onClick(DialogInterface p0,int p1){
       d tb = this.b;
       d tc = this.c;
       d td = this.d;
       d te = this.e;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidThreeRefs(tc, td, te, tb, l.class, "11")) {
       }else if(tc.mFromUsers == null || td == null){
          f$a uoa = new f$a(tc.mFromUsers[0], td.Q2());
          uoa.d(tc.mFromUsers[0].getThirdPartyName());
          uoa.o(td.getUrl());
          uoa.q(true);
          uoa.i(b.g(tc.mFromUsers[0].getId()));
          FollowHelper.k(uoa.b()).subscribe(new f(te), Functions.d());
       }
       tb.n(tc.mId, "logUnFollowConfirmClick", false, true);
       return;
    }
}
