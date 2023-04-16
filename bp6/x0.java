package bp6.x0;
import java.lang.Runnable;
import com.kwai.imsdk.internal.v;
import qo6.b;
import java.lang.Object;
import java.lang.String;
import com.kwai.imsdk.internal.client.i;
import qo6.a;
import cp6.n;
import com.kwai.imsdk.d;
import cp6.a0;
import org.greenrobot.greendao.Property;
import com.kwai.imsdk.msg.KwaiMsgDao$Properties;
import java.util.List;
import rp6.w;
import com.kwai.imsdk.msg.KwaiMsg;
import rp6.k0;
import com.kwai.imsdk.internal.data.MsgSeqInfo;

public final class x0 implements Runnable	// class@00055a
{
    public final v b;
    public final b c;
    public final int d;

    public void x0(v p0,b p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       x0 tc = this.c;
       x0 td = this.d;
       i oi = i.t(this.b.a);
       String tar = tc.getTarget();
       int tarType = tc.getTargetType();
       if (td <= null) {
          td = 20;
       }
       d uod = n.i(oi.a).p(tar, tarType);
       Property[] propertyArra = new Property[]{KwaiMsgDao$Properties.Seq,KwaiMsgDao$Properties.ClientSeq};
       List list = a0.i(oi.a).m(tar, tarType, Long.MAX_VALUE, td, true, propertyArra);
       if (uod != null && uod.y() > 0) {
          if (list == null || list.size() <= 1) {
             w.e(oi.a).m(0, Long.MAX_VALUE, td, tar, tarType);
          }else if(!a0.i(oi.a).x(list)){
             w.e(oi.a).m(list.get((list.size() - 1)).getSeq(), list.get(0).getSeq(), td, tar, tarType);
          }else if(k0.a(oi.a).c(tar, tarType) != null && k0.a(oi.a).c(tar, tarType).getMaxSeq() - list.get(0).getSeq() > 0){
             w.e(oi.a).m(list.get(0).getSeq(), k0.a(oi.a).c(tar, tarType).getMaxSeq(), td, tar, tarType);
          }
       }else if(list == null || list.size() <= 1){
          w.e(oi.a).m(0, Long.MAX_VALUE, td, tar, tarType);
       }
       return;
    }
}
