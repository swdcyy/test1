package com.yxcorp.gifshow.util.m;
import java.lang.Runnable;
import android.content.Context;
import java.lang.Object;
import androidx.fragment.app.FragmentActivity;
import y56.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.Log;
import kzc.d;
import android.app.Activity;
import u07.t$a;
import y56.d;
import u07.u;
import y56.b;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import com.kwai.library.widget.popup.common.c$b;
import y56.c;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import u07.t;
import com.kwai.library.widget.popup.common.c;

public final class m implements Runnable	// class@001f8e
{
    public final Context b;

    public void m(Context p0){
       this.b = p0;
       super();
    }
    public final void run(){
       m tb = this.b;
       if (PatchProxy.applyVoidOneRefs(tb, null, e.class, "1")) {
       }else if(e.a != null){
          Log.n("@", "ENOSPC dialog exists");
       }else {
          d uod = new d(tb);
          uod.Z0(152);
          uod.W0(R.string.arg_RES_7f1030f2);
          uod.y0(R.string.arg_RES_7f1016d7);
          uod.S0(R.string.arg_RES_7f10058b);
          uod.Q0(R.string.arg_RES_7f1012a9);
          uod.u0(new d(tb));
          uod.J(new b(tb));
          uod.L(c.b);
          t ot = uod.b0();
          e.a = ot;
          ot.Z();
       }
       return;
    }
}
