package com.yxcorp.experiment.logger.LogEventWrapper;
import java.io.Serializable;
import java.lang.Object;
import com.yxcorp.experiment.ABConfig;
import java.lang.Long;
import com.yxcorp.experiment.proto.AbEntranceEventProto$AbExperiment$a;
import com.yxcorp.experiment.proto.AbEntranceEventProto$AbExperiment;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;

public class LogEventWrapper implements Serializable	// class@0011ea
{
    public AbEntranceEventProto$AbExperiment mLogItem;
    public int mLogPolicy;
    public static final long serialVersionUID = 0x578a210bb4e495df;

    public void LogEventWrapper(){
       super();
    }
    public static LogEventWrapper create(ABConfig p0){
       if (p0 == null || p0.getGroupId() == null) {
          return null;
       }
       AbEntranceEventProto$AbExperiment$a uAbExperimen = AbEntranceEventProto$AbExperiment.newBuilder();
       uAbExperimen.d(p0.getGroupId().longValue());
       uAbExperimen.a(1);
       uAbExperimen.b(p0.getDynamicFlag());
       LogEventWrapper logEventWrap = new LogEventWrapper();
       logEventWrap.mLogItem = uAbExperimen.build();
       logEventWrap.mLogPolicy = p0.getLogPolicy();
       return logEventWrap;
    }
    public LogEventWrapper update(ABConfig p0){
       if (p0 != null && p0.getGroupId() != null) {
          AbEntranceEventProto$AbExperiment$a uAbExperimen = this.mLogItem.toBuilder();
          uAbExperimen.a((this.mLogItem.getCount() + 1));
          this.mLogItem = uAbExperimen.build();
          this.mLogPolicy = p0.getLogPolicy();
       }
       return this;
    }
}
