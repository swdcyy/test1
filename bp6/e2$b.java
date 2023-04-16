package bp6.e2$b;
import java.util.Comparator;
import java.lang.Object;
import com.kwai.imsdk.msg.KwaiMsg;

public class e2$b implements Comparator	// class@000511
{

    public void e2$b(){
       super();
    }
    public int compare(Object p0,Object p1){
       int i = -1;
       if (p0 != null || p1 == null) {
          if (p0 == null || p1 != null) {
             if (p0 != null || p1 != null) {
                if (p0.getSeq() - p1.getSeq() <= 0) {
                   if (p0.getSeq() - p1.getSeq() >= 0) {
                      if (p0.getLocalMsgId() - p1.getLocalMsgId() <= 0) {
                         if (p0.getLocalMsgId() - p1.getLocalMsgId() >= 0) {
                            if (p0.getOutboundStatus() >= p1.getOutboundStatus()) {
                               if (p0.getOutboundStatus() <= p1.getOutboundStatus()) {
                               }
                            }
                         }
                      }
                   }
                }
             }
          }
       label_000f :
          i = 1;
       }
    label_0062 :
       return i;
    }
}
