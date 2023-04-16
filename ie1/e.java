package ie1.e;
import java.lang.Object;
import java.util.Map;
import java.util.Set;
import ae1.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import java.util.Map$Entry;
import aq5.d;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.feature.api.live.base.service.bizrelation.AnchorBizRelation;
import aq5.a;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;

public class e	// class@0028b6
{

    public void e(){
       super();
    }
    public static a a(Map p0,Set p1){
       Object obj = null;
       Map$Entry obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, e.class, "3");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          obj1 = iterator.next();
          if (!p1.contains(obj1.getKey()) && obj1.getValue().d == 4) {
             obj = obj1.getValue();
             break ;
          }
       }
       return obj;
    }
    public static boolean b(d p0,int p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uoe, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0.r2(AnchorBizRelation.CHAT_BETWEEN_ANCHORS)) {
          i.f(R.style.arg_RES_7f110668, a1.p(R.string.arg_RES_7f101dc8), true);
          return true;
       }else if(!p0.r2(AnchorBizRelation.PK) && (!p0.r2(AnchorBizRelation.LIVE_MULTI_PK) && (p0.r2(AnchorBizRelation.LIVE_PK_PENDANT) || p0.r2(AnchorBizRelation.LIVE_PK_WAITING)))){
          i.f(R.style.arg_RES_7f110668, a1.p(R.string.arg_RES_7f1029d3), true);
          return true;
       }else if(!p0.r2(AnchorBizRelation.LIVE_LINE) && (p0.r2(AnchorBizRelation.LIVE_MULTI_LINE) || p0.r2(AnchorBizRelation.LIVE_LINE_PENDANT))){
          i.f(R.style.arg_RES_7f110668, a1.p(R.string.arg_RES_7f1029d3), true);
          return true;
       }else if(p0.r2(AnchorBizRelation.VOICE_PARTY)){
          i.f(R.style.arg_RES_7f110668, a1.p(R.string.arg_RES_7f100af9), true);
          return true;
       }else if(p0.r2(AnchorBizRelation.LIVE_PAID_SHOW)){
          i.f(R.style.arg_RES_7f110668, a1.p(R.string.arg_RES_7f102888), true);
          return true;
       }else if(p0.r2(AnchorBizRelation.RECRUIT_EXPLAIN_PANEL) && p1 == 2){
          i.a(R.style.arg_RES_7f110668, 0x7f102b46);
          return true;
       }else {
          return false;
       }
    }
}
