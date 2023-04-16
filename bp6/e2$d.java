package bp6.e2$d;
import java.util.Comparator;
import java.lang.Object;
import com.kwai.imsdk.msg.KwaiMsg;

public class e2$d implements Comparator	// class@000513
{

    public void e2$d(){
       super();
    }
    public int compare(Object p0,Object p1){
       int i = -1;
       if (p0 != null || p1 == null) {
          if (p0 == null || p1 != null) {
             if (p0 != null || p1 != null) {
                long l = -2147389650;
                int i1 = 0;
                if (!p0.getLocalSortSeq() - i1 || !p0.getLocalSortSeq() - l) {
                   p0.setLocalSortSeq(p0.getSeq());
                }
                if (!p1.getLocalSortSeq() - i1 || !p1.getLocalSortSeq() - l) {
                   p1.setLocalSortSeq(p1.getSeq());
                }
                if (p0.getLocalSortSeq() - p1.getLocalSortSeq() <= 0) {
                   if (p0.getLocalSortSeq() - p1.getLocalSortSeq() >= 0) {
                      if (p0.getClientSeq() - p1.getClientSeq() <= 0) {
                         if (p0.getClientSeq() - p1.getClientSeq() >= 0) {
                            if (p0.getOutboundStatus() >= p1.getOutboundStatus()) {
                               if (p0.getOutboundStatus() <= p1.getOutboundStatus()) {
                               label_0018 :
                                  i = 0;
                               }
                            }
                         }
                      }
                   }
                }
             }
          }
       label_0010 :
          i = 1;
       }
    label_0099 :
       return i;
    }
}
