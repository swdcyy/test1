package com.yxcorp.gifshow.record.album.utils.d;
import u07.u;
import java.util.concurrent.atomic.AtomicBoolean;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import kq.b;
import java.lang.Object;
import u07.t;
import android.view.View;
import k8c.a;
import java.lang.String;
import q87.c;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.yxcorp.gifshow.record.album.utils.g0;
import p8c.v;
import com.yxcorp.gifshow.edit.draft.model.DraftFileGuard;
import java.io.File;
import laa.m0;
import java.util.List;
import brd.t;
import com.yxcorp.gifshow.record.album.utils.b;
import p8c.f;
import com.yxcorp.gifshow.record.album.utils.t;
import erd.g;
import crd.b;

public final class d implements u	// class@001763
{
    public final AtomicBoolean b;
    public final c c;
    public final RxFragmentActivity d;
    public final int e;
    public final b f;

    public void d(AtomicBoolean p0,c p1,RxFragmentActivity p2,int p3,b p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void a(t p0,View p1){
       d tb = this.b;
       d tc = this.c;
       d td = this.d;
       d te = this.e;
       d tf = this.f;
       if (tb.get()) {
       }else {
          tb.set(true);
          Object[] objArray = new Object[0];
          a.D().w("DraftRecoverUtil", "recoverCamera dialog onPositive, recover to recording", objArray);
          DraftUtils.a(tc);
          String str = "pop_up_32_90_1";
          if (g0.e()) {
             v.e("record", "continue", str, tc.V0());
          }else {
             v.f("continue_exception_continue", 1090, str, tc.V0());
          }
          DraftFileGuard b = DraftFileGuard.b;
          b.b(tc.f0(), tc.D0(), b.e(tc));
          b.a(td, te, tc).subscribe(new f(tf, tc), t.b);
       }
       return;
    }
}
