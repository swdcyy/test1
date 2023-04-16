package com.yxcorp.gifshow.record.album.utils.i;
import erd.g;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import kq.b;
import java.lang.Object;
import com.kwai.gifshow.post.api.feature.popup.BubbleEnterPostParam;
import com.yxcorp.gifshow.record.album.utils.g0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import k8c.a;
import q87.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import kzc.d;
import android.app.Activity;
import lnc.a1;
import u07.t$a;
import com.yxcorp.gifshow.record.album.utils.e0;
import u07.u;
import p8c.p;
import com.kwai.library.widget.popup.common.c$b;
import p8c.i;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import p8c.s;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;

public final class i implements g	// class@00176c
{
    public final RxFragmentActivity b;
    public final int c;
    public final b d;

    public void i(RxFragmentActivity p0,int p1,b p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       i tb = this.b;
       i tc = this.c;
       i td = this.d;
       if (!PatchProxy.isSupport(g0.class) || !PatchProxy.applyVoidFourRefs(tb, Integer.valueOf(tc), td, p0, null, g0.class, "8")) {
          Object[] objArray = new Object[0];
          String str = "DraftRecoverUtil";
          a.D().w(str, "bubble source, recoverEdit show recoverDialog by bubble", objArray);
          if (TextUtils.x(p0.getWorkspaceId()) || p0.getCoverFile() == null) {
             Object[] objArray1 = new Object[0];
             a.D().w(str, "bubble source, recoverEdit show recoverDialog by bubble invalid param", objArray1);
          }else {
             AtomicBoolean uAtomicBoole = new AtomicBoolean(0);
             p0.getType();
             d uod = new d(tb);
             uod.Z0(89);
             uod.X0(a1.p(R.string.arg_RES_7f100ad7));
             uod.z0("");
             uod.S0(R.string.arg_RES_7f100ad6);
             uod.Q0(R.string.arg_RES_7f100ad5);
             e0 uoe0 = new e0(uAtomicBoole, td, p0, tb, tc);
             uod.u0(v12);
             uod.t0(new p(uAtomicBoole, p0));
             uod.z(0);
             uod.L(new i(p0));
             uod.Y(new s(p0));
          }
       }
       return;
    }
}
