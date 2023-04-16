package kj9.d;
import ij9.a;
import com.kwai.component.feedstaggercard.model.CardStyle;
import java.lang.Object;
import im8.c;
import java.lang.String;
import java.util.ArrayList;
import ekd.j;
import y8c.f;
import android.view.ViewGroup;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import i2b.a;
import kj9.f;
import ml8.c;

public class d extends a	// class@002ca7
{
    public final ArrayList x;

    public void d(CardStyle p0){
       super();
       Object[] objArray = new Object[]{new c("HOT_CHANNEL_CARD_STYLE", p0)};
       this.x = j.a(objArray);
    }
    public ArrayList a1(int p0,f p1){
       return this.x;
    }
    public f h1(ViewGroup p0,int p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uod, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.i(p0, 0x7f0d067f), new f());
    }
}
