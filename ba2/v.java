package ba2.v;
import android.util.SparseIntArray;
import java.lang.Object;
import java.lang.String;
import com.kwai.feature.api.live.service.show.hourlytrank.ranklist.LiveHourlyRankType;
import com.kuaishou.live.common.core.component.notification.LiveCommonNotificationMessage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ba2.v$a;
import java.lang.Enum;
import java.lang.CharSequence;
import java.lang.Boolean;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveDistrictRankConfig;
import java.lang.reflect.Type;
import wg3.a;
import java.lang.Number;

public class v	// class@0003b1
{
    public static final SparseIntArray a;
    public static final SparseIntArray b;

    static {
       SparseIntArray sparseIntArr = new SparseIntArray();
       v.a = sparseIntArr;
       sparseIntArr.put(1, R.color.arg_RES_7f061464);
       sparseIntArr.put(2, R.color.arg_RES_7f061469);
       sparseIntArr.put(3, R.color.arg_RES_7f06146c);
       sparseIntArr = new SparseIntArray();
       v.b = sparseIntArr;
       sparseIntArr.put(1, R.color.arg_RES_7f061463);
       sparseIntArr.put(2, R.color.arg_RES_7f061468);
       sparseIntArr.put(3, R.color.arg_RES_7f06146b);
    }
    public void v(){
       super();
    }
    public static String a(int p0){
       if (p0 != 5) {
          return "HOURLY_RANK";
       }
       return "QUARTER_HOURLY_RANK";
    }
    public static String b(int p0){
       if (p0 == 1) {
          return "1";
       }
       if (p0 != 2) {
          return "0";
       }
       return "2";
    }
    public static LiveHourlyRankType c(int p0){
       if (p0 == 1) {
          return LiveHourlyRankType.NATIONAL_RANK;
       }
       if (p0 == 2) {
          return LiveHourlyRankType.DISTRICT_RANK;
       }
       if (p0 != 3) {
          return LiveHourlyRankType.UNKNOWN;
       }
       return LiveHourlyRankType.CITY_RANK;
    }
    public static LiveHourlyRankType d(int p0){
       if (p0 == 1) {
          return LiveHourlyRankType.NATIONAL_RANK;
       }
       if (p0 == 2) {
          return LiveHourlyRankType.DISTRICT_RANK;
       }
       if (p0 != 4) {
          return LiveHourlyRankType.UNKNOWN;
       }
       return LiveHourlyRankType.CITY_RANK;
    }
    public static LiveCommonNotificationMessage e(String p0,LiveHourlyRankType p1){
       String str;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, v.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = v$a.a[p1.ordinal()];
       if (i != 4) {
          str = (i != 6)? "": "kwailive://hourlyranklist?tab=5";
       }else {
          str = "kwailive://hourlyranklist?tab=4";
       }
       LiveCommonNotificationMessage liveCommonNo = new LiveCommonNotificationMessage();
       liveCommonNo.u0(p0);
       liveCommonNo.p0(R.drawable.arg_RES_7f08249c);
       liveCommonNo.A(4);
       liveCommonNo.q0(str);
       liveCommonNo.o0(0);
       return liveCommonNo;
    }
    public static boolean f(){
       LiveConfigStartupResponse$LiveDistrictRankConfig obj = PatchProxy.apply(null, null, v.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = a.l(LiveConfigStartupResponse$LiveDistrictRankConfig.class);
       boolean b = (obj != null && obj.mDisableShowRank == null)? true: false;
       return b;
    }
    public static boolean g(){
       LiveConfigStartupResponse$LiveDistrictRankConfig obj = PatchProxy.apply(null, null, v.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = a.l(LiveConfigStartupResponse$LiveDistrictRankConfig.class);
       boolean b = (obj != null && obj.mDisableShowGlobalRank == null)? true: false;
       return b;
    }
    public static int h(LiveHourlyRankType p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, v.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       switch (v$a.a[p0.ordinal()]){
           case 1:
             return 1;
           case 2:
             return 2;
           case 3:
             return 4;
           case 4:
             return 7;
           case 5:
             return 6;
           case 6:
             return 8;
           default:
             return 3;
       }
    }
}
