package ah0.c;
import java.lang.Object;
import com.kuaishou.house.live.consult.HouseConsultPendantMessage;
import java.util.HashMap;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import og0.a;
import com.kuaishou.live.house.model.HouseLiveExplainMessage;
import yg0.a;
import com.kuaishou.house.live.bottombar.HouseLiveIconMessage;
import ah0.a;
import ah0.b;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import java.lang.Integer;
import org.json.JSONObject;
import org.json.JSONException;

public class c	// class@000098
{

    public void c(){
       super();
    }
    public static HashMap a(HouseConsultPendantMessage p0){
       String str;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = null;
       HashMap obj1 = PatchProxy.applyOneRefs(p0, obj, c.class, "6");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       obj1 = new HashMap();
       obj1.put("business_id", p0.getMBizType());
       obj1.put("compress_style", "NORMAL");
       obj = PatchProxy.applyOneRefs(p0, obj, a.class, "2");
       if (obj != patchProxyRe) {
       }else if(p0.getMReservedStatus() == 1){
          str = "WEAK";
       }else {
          str = "STRONG";
       }
       obj = str;
       obj1.put("strong_style", obj);
       obj1.put("author_role", p0.getMAuthorRole());
       obj1.put("text_type", p0.getMTextType());
       return obj1;
    }
    public static HashMap b(HouseLiveExplainMessage p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, null, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       obj.put("business_id", a.a(p0));
       obj.put("card_type", a.b(p0));
       obj.put("compress_style", "NORMAL");
       obj.put("item_id", p0.getMProductId());
       obj.put("item_type", p0.getMSource());
       obj.put("author_role", p0.getMAuthorRole());
       obj.put("text_type", p0.getMButtonType());
       return obj;
    }
    public static HashMap c(HouseLiveIconMessage p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, null, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       obj.put("button_type", String.valueOf(k0.b(p0, a.a, b.a).or(Integer.valueOf(0)).intValue()));
       if (p0 != null) {
          String statisticsIn = p0.getStatisticsInfo();
          String str = "statistics_info";
          try{
             obj.put(str, statisticsIn);
             obj.put("business_id", new JSONObject(statisticsIn).getString("business_id"));
          }catch(org.json.JSONException e4){
             e4.printStackTrace();
          }
       }
    }
}
