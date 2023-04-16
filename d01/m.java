package d01.m;
import mk1.a0;
import mk1.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import z1.k;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftTitleView;

public class m	// class@001ee0
{
    public final a0 a;
    public final b b;

    public void m(a0 p0,b p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean a(){
       m obj = PatchProxy.apply(null, this, m.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a;
       boolean b = true;
       if (obj == null || (obj.c != b || obj.b == null)) {
          b = false;
       }
       return b;
    }
    public boolean b(boolean p0,k p1){
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, om, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (!p0 && (!this.a() || p1 == null)) {
          return false;
       }else if(!this.b.l()){
          b.P(LiveLogTag.GIFT.appendTag("LiveBackpackTabFreeTicketRedDotHandler"), "cannot show packet tab red dot, receiver is audience");
          return false;
       }else {
          p1.get().b();
          return true;
       }
    }
}
