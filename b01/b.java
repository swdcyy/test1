package b01.b;
import ok.o;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.LiveProp;

public final class b implements o	// class@0002e5
{
    public final int b;
    public final int c;

    public void b(int p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final boolean apply(Object p0){
       boolean b;
       b tb = this.b;
       b tc = this.c;
       if (p0 != null) {
          p0 = p0.mPropPosition;
          if (p0 >= tb && p0 <= tc) {
             b = true;
          label_0011 :
             return b;
          }
       }
       b = false;
       goto label_0011 ;
    }
}
