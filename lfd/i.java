package lfd.i;
import lfd.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;
import com.yxcorp.plugin.search.entity.template.base.JCAladdinFeed;
import lfd.b;
import com.yxcorp.plugin.search.entity.SearchItem;
import android.view.View;
import android.content.Context;
import o56.a;
import android.app.Application;
import lfd.h;
import java.lang.Runnable;
import com.yxcorp.plugin.search.utils.x;

public class i implements d	// class@001c32
{
    public b a;
    public JCAladdinFeed b;
    public b c;

    public void i(){
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, i.class, "4")) {
          return;
       }
       i ta = this.a;
       if (ta != null) {
          b9.a(ta);
       }
       return;
    }
    public void b(JCAladdinFeed p0,b p1,SearchItem p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, i.class, "1")) {
          return;
       }
       this.b = p0;
       this.c = p1;
       x.d(p1.getView().getContext(), a.B.getString(R.string.arg_RES_7f103078), new h(this, p0, p1, p2));
       return;
    }
}
