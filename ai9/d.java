package ai9.d;
import android.view.View$OnLongClickListener;
import ai9.i;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import com.yxcorp.gifshow.dialog.PostDialogPlugin;
import u07.t$a;
import com.yxcorp.gifshow.camera.record.base.d;
import android.app.Activity;
import ai9.e;
import u07.u;
import com.yxcorp.gifshow.dialog.PostDialogPlugin$DialogScenario;

public final class d implements View$OnLongClickListener	// class@0000cb
{
    public final i b;

    public void d(i p0){
       this.b = p0;
    }
    public final boolean onLongClick(View p0){
       boolean b;
       d tb = this.b;
       Objects.requireNonNull(tb);
       Object obj = PatchProxy.apply(null, tb, i.class, "10");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          t$a uoa = new t$a(tb.e);
          uoa.W0(R.string.arg_RES_7f1045ef);
          uoa.y0(R.string.arg_RES_7f1045ee);
          uoa.S0(R.string.arg_RES_7f1045ed);
          uoa.Q0(R.string.cancel);
          uoa.u0(new e(tb));
          d.a(0x34dc9f9c).lV(uoa, PostDialogPlugin$DialogScenario.UNKNOWN);
          b = true;
       }
       return b;
    }
}
