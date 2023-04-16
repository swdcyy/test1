package gz2.f;
import java.lang.Runnable;
import gz2.h;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFaceTransDataMessage;
import java.lang.Object;
import ly2.e;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFaceTransDataMessage$LiveFacePoint;
import my2.a$a;

public final class f implements Runnable	// class@002bd9
{
    public final h b;
    public final LiveFlvStream$LiveFaceTransDataMessage c;
    public final boolean d;

    public void f(h p0,LiveFlvStream$LiveFaceTransDataMessage p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       f tb = this.b;
       f tc = this.c;
       f td = this.d;
       if (tb.e != null) {
          LiveFlvStream$LiveFaceTransDataMessage liveFaceTran = tc.facePointArray;
          e[] uoeArray = new e[liveFaceTran.length];
          for (int i = 0; i < liveFaceTran.length; i = i + 1) {
             object oobject = liveFaceTran[i];
             uoeArray[i] = new e(oobject.index, oobject.x, oobject.y);
          }
          tb.e.e(td, uoeArray);
       }
       return;
    }
}
