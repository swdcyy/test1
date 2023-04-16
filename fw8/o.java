package fw8.o;
import lnc.w;
import com.kuaishou.viewbinder.BaseViewBinder;
import qxc.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;
import android.os.Bundle;

public class o extends w	// class@002365
{
    public final BaseViewBinder d;
    public final a e;

    public void o(int p0,BaseViewBinder p1,a p2){
       this.d = p1;
       this.e = p2;
       super(p0);
    }
    public void onFinish(int p0,View p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, oo, "1")) {
          return;
       }
       this.d.t(p1, LayoutInflater.from(a.a().a()), null);
       o te = this.e;
       if (te != null) {
          te.a(p1);
       }
       return;
    }
}
