package com.yxcorp.experiment.jsonadapter.LogEventWrapperJsonAdapter;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import com.yxcorp.experiment.logger.LogEventWrapper;
import java.lang.String;
import java.util.Objects;
import com.yxcorp.experiment.proto.AbEntranceEventProto$AbExperiment$a;
import com.yxcorp.experiment.proto.AbEntranceEventProto$AbExperiment;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.gson.stream.b;

public class LogEventWrapperJsonAdapter extends TypeAdapter	// class@0011e6
{

    public void LogEventWrapperJsonAdapter(){
       super();
    }
    public Object read(a p0){
       LogEventWrapper logEventWrap = new LogEventWrapper();
       p0.c();
       while (p0.l()) {
          String str = p0.y();
          Objects.requireNonNull(str);
          if (!str.equals("mLogItem")) {
             if (!str.equals("mLogPolicy")) {
                continue ;
             }else {
                logEventWrap.mLogPolicy = p0.v();
             }
          }else {
             AbEntranceEventProto$AbExperiment$a uAbExperimen = AbEntranceEventProto$AbExperiment.newBuilder();
             p0.c();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                int i = -1;
                switch (str1.hashCode()){
                    case 3202:
                      if (str1.equals("df")) {
                         i = 0;
                      }
                      break;
                    case 0x18fc2:
                      if (str1.equals("gid")) {
                         i = 1;
                      }
                      break;
                    case 0x5a7510f:
                      if (str1.equals("count")) {
                         i = 2;
                      }
                      break;
                    case 0x2c8e937d:
                      if (str1.equals("extra_info")) {
                         i = 3;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      uAbExperimen.b(p0.v());
                      break;
                    case 1:
                      uAbExperimen.d((long)p0.v());
                      continue ;
                      break;
                    case 2:
                      uAbExperimen.a(p0.v());
                      continue ;
                      break;
                    case 3:
                      uAbExperimen.c(p0.E());
                      continue ;
                      break;
                    default:
                      continue ;
                }
             }
             p0.j();
             logEventWrap.mLogItem = uAbExperimen.build();
          }
       }
       p0.j();
       return logEventWrap;
    }
    public void write(b p0,Object p1){
       p0.e();
       p0.r("mLogPolicy").K((long)p1.mLogPolicy);
       p0.r("mLogItem").e();
       p0.r("gid").K(p1.mLogItem.getGid());
       p0.r("count").K((long)p1.mLogItem.getCount());
       p0.r("df").K((long)p1.mLogItem.getDf());
       p0.r("extra_info").O(p1.mLogItem.getExtraInfo());
       p0.j();
       p0.j();
    }
}
