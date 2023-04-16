package com.yxcorp.gifshow.v3.editor.music_v2.utils.c;
import erd.g;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import voc.a0;
import androidx.fragment.app.FragmentActivity;
import java.lang.Object;
import orc.b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.v3.editor.music_v2.utils.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e17.i$b;
import o79.i;
import java.lang.CharSequence;
import com.yxcorp.gifshow.v3.editor.music_v2.utils.a;
import e17.i$e;
import e17.i;
import lsc.z;
import java.lang.Runnable;
import ekd.k1;

public final class c implements g	// class@001127
{
    public final ProgressFragment b;
    public final a0 c;
    public final FragmentActivity d;

    public void c(ProgressFragment p0,a0 p1,FragmentActivity p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       c tb = this.b;
       c tc = this.c;
       c td = this.d;
       if (tb.isAdded()) {
          tb.dismissAllowingStateLoss();
       }
       tc.c(p0);
       if (!PatchProxy.applyVoid(null, null, e.class, "7")) {
          i$b uob = new i$b();
          uob.y(i.p(R.string.arg_RES_7f100735));
          uob.o(1000);
          uob.s(R.layout.arg_RES_7f0d00a8);
          uob.A(a.a);
          i.z(uob);
       }
       e.d(true, td);
       if (td != null) {
          k1.r(new z(td, p0), 1000);
       }
       return;
    }
}
