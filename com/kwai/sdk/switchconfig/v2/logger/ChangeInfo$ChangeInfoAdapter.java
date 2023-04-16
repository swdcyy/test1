package com.kwai.sdk.switchconfig.v2.logger.ChangeInfo$ChangeInfoAdapter;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import com.kwai.sdk.switchconfig.v2.logger.ChangeInfo;
import java.lang.String;
import java.util.Objects;
import com.kwai.sdk.switchconfig.v2.logger.ChangeInfo$a;
import com.google.gson.stream.JsonToken;
import java.lang.Enum;
import java.util.List;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import com.google.gson.stream.b;

public class ChangeInfo$ChangeInfoAdapter extends TypeAdapter	// class@001683
{

    public void ChangeInfo$ChangeInfoAdapter(){
       super();
    }
    public Object read(a p0){
       ChangeInfo uChangeInfo = new ChangeInfo();
       p0.c();
       while (p0.l()) {
          String str = p0.y();
          Objects.requireNonNull(str);
          int i = -1;
          switch (str.hashCode()){
              case 0xb8bb4c94:
                if (str.equals("reportBlockKswitches")) {
                   i = 0;
                }
                break;
              case 0xbc03bf53:
                if (str.equals("updateSampleRate")) {
                   i = 1;
                }
                break;
              case 0x4e6e6e9f:
                if (str.equals("affectSampleRate")) {
                   i = 2;
                }
                break;
              case 0x6ffef2c6:
                if (str.equals("validSampleRate")) {
                   i = 3;
                }
                break;
              default:
          }
          switch (i){
              case 0:
                int i1 = ChangeInfo$a.a[p0.J().ordinal()];
                if (i1 != 1 && i1 != 2) {
                   continue ;
                }else {
                   Type[] typeArray = new Type[]{String.class};
                   uChangeInfo.mChangeBlockReportKswitches = new Gson().e(p0, a.getParameterized(List.class, typeArray).getType());
                }
                break;
              case 1:
                uChangeInfo.mChangeUpdateSampleRate = p0.u();
                break;
              case 2:
                uChangeInfo.mChangeAffectSampleRate = p0.u();
                break;
              case 3:
                uChangeInfo.mChangeValidSampleRate = p0.u();
                break;
              default:
                p0.Q();
          }
       }
       p0.j();
       return uChangeInfo;
    }
    public void write(b p0,Object p1){
       p0.e();
       p0.r("reportBlockKswitches").O(p1.mChangeBlockReportKswitches.toString());
       p0.r("updateSampleRate").J(p1.mChangeUpdateSampleRate);
       p0.r("validSampleRate").J(p1.mChangeValidSampleRate);
       p0.r("affectSampleRate").J(p1.mChangeAffectSampleRate);
       p0.j();
    }
}
