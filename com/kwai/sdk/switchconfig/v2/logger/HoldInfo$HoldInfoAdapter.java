package com.kwai.sdk.switchconfig.v2.logger.HoldInfo$HoldInfoAdapter;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import com.kwai.sdk.switchconfig.v2.logger.HoldInfo;
import java.lang.String;
import java.util.Objects;
import com.kwai.sdk.switchconfig.v2.logger.HoldInfo$a;
import com.google.gson.stream.JsonToken;
import java.lang.Enum;
import java.util.List;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import com.google.gson.stream.b;

public class HoldInfo$HoldInfoAdapter extends TypeAdapter	// class@001686
{

    public void HoldInfo$HoldInfoAdapter(){
       super();
    }
    public Object read(a p0){
       HoldInfo holdInfo = new HoldInfo();
       p0.c();
       while (p0.l()) {
          String str = p0.y();
          Objects.requireNonNull(str);
          int i = -1;
          switch (str.hashCode()){
              case 0x88751aa:
                if (str.equals("sampleRate")) {
                   i = 0;
                }
                break;
              case 0x21ffe4c5:
                if (str.equals("interval")) {
                   i = 1;
                }
                break;
              case 0x39a59179:
                if (str.equals("reportKswitches")) {
                   i = 2;
                }
                break;
              default:
          }
          switch (i){
              case 0:
                holdInfo.mHoldSampleRate = p0.u();
                break;
              case 1:
                holdInfo.mHoldInterval = p0.v();
                break;
              case 2:
                int i1 = HoldInfo$a.a[p0.J().ordinal()];
                if (i1 != 1 && i1 != 2) {
                   continue ;
                }else {
                   Type[] typeArray = new Type[]{String.class};
                   holdInfo.mHoldReportKswitches = new Gson().e(p0, a.getParameterized(List.class, typeArray).getType());
                }
                break;
              default:
                p0.Q();
          }
       }
       p0.j();
       return holdInfo;
    }
    public void write(b p0,Object p1){
       p0.e();
       p0.r("reportKswitches").O(p1.mHoldReportKswitches.toString());
       p0.r("interval").K((long)p1.mHoldInterval);
       p0.r("sampleRate").J(p1.mHoldSampleRate);
       p0.j();
    }
}
