package h62.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.live.core.show.conditionredpacket.logger.ConditionSubRedPacketType;

public final class a	// class@002c67
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public static final int a(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 != 39) {
          if (p0 != 45) {
             if (p0 != 47) {
                switch (p0){
                    case 14:
                      p0 = ConditionSubRedPacketType.SUB_RED_PACKET_TYPE_CONDITION_FANS_GROUP.getSubRedPacketType();
                      break;
                    case 15:
                      p0 = ConditionSubRedPacketType.SUB_RED_PACKET_TYPE_CONDITION_SHARE.getSubRedPacketType();
                      break;
                    case 16:
                      p0 = ConditionSubRedPacketType.SUB_RED_PACKET_TYPE_CONDITION_GIFT.getSubRedPacketType();
                      break;
                    default:
                      p0 = 0;
                }
             }else {
                p0 = ConditionSubRedPacketType.SUB_RED_PACKET_TYPE_CONDITION_PASSWORD.getSubRedPacketType();
             }
          }else {
             p0 = ConditionSubRedPacketType.SUB_RED_PACKET_TYPE_CONDITION_ARROW.getSubRedPacketType();
          }
       }else {
          p0 = ConditionSubRedPacketType.SUB_RED_PACKET_TYPE_CONDITION_COMMON.getSubRedPacketType();
       }
       return p0;
    }
}
