package tq.b;
import java.lang.Object;
import com.kuaishou.android.vader.Channel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Number;

public class b	// class@00255f
{

    public void b(){
       super();
    }
    public static Channel a(int p0){
       Channel obj;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = Channel.NORMAL;
       if (p0 == obj.getValue()) {
          return obj;
       }else {
          obj = Channel.HIGH_FREQ;
          if (p0 == obj.getValue()) {
             return obj;
          }else {
             obj = Channel.REAL_TIME;
             if (p0 == obj.getValue()) {
                return obj;
             }else {
                obj = Channel.REAL_SHOW;
                if (p0 == obj.getValue()) {
                   return obj;
                }else {
                   obj = Channel.CLICK2;
                   if (p0 == obj.getValue()) {
                      return obj;
                   }else {
                      obj = Channel.COVER_SHOW;
                      if (p0 == obj.getValue()) {
                         return obj;
                      }else {
                         obj = Channel.COMMENT_SHOW;
                         if (p0 == obj.getValue()) {
                            return obj;
                         }else {
                            obj = Channel.USER_TRACK;
                            if (p0 == obj.getValue()) {
                               return obj;
                            }else {
                               throw new IllegalArgumentException("Unknown channel status: "+p0);
                            }
                         }
                      }
                   }
                }
             }
          }
       }
    }
    public static int b(Channel p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return p0.getValue();
    }
}
