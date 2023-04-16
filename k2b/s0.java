package k2b.s0;
import java.lang.Runnable;
import com.yxcorp.gifshow.log.n;
import java.lang.Object;
import java.util.Objects;
import com.yxcorp.gifshow.log.o;
import k2b.x1;
import kvb.c;
import android.content.Context;
import lvb.a;
import java.lang.String;
import com.yxcorp.gifshow.log.utils.a;
import com.google.gson.Gson;
import k2b.b3;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kvb.d;
import java.util.List;
import com.yxcorp.gifshow.numberfour.NumberFourEventType;
import java.util.Map;
import java.util.Queue;
import q2b.j;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$EventPackage;
import y2b.b;

public final class s0 implements Runnable	// class@001bb9
{
    public final n b;

    public void s0(n p0){
       this.b = p0;
    }
    public final void run(){
       n h;
       n h1;
       Queue c;
       j oj;
       a pageShowEven;
       s0 tb = this.b;
       Objects.requireNonNull(tb);
       o oo = o.class;
       if (n.A1().Q()) {
          tb.H.d(tb.a, new c());
          a uoa = n.A1().y();
          Object[] objArray = null;
          if (uoa == null) {
             try{
                uoa = tb.d.p().h(a.a(tb.a, "number_four_config.json"), a.class);
             }catch(java.lang.Exception e0){
                uoa = objArray;
             }
          }
       }
    }
}
