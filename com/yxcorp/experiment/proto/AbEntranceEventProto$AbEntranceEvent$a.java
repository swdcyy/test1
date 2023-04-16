package com.yxcorp.experiment.proto.AbEntranceEventProto$AbEntranceEvent$a;
import com.yxcorp.experiment.proto.a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.yxcorp.experiment.proto.AbEntranceEventProto$AbEntranceEvent;
import com.google.protobuf.GeneratedMessageLite;
import cv8.a;
import com.yxcorp.experiment.proto.AbEntranceEventProto$AbExperiment;
import java.util.List;
import java.util.Collections;
import com.yxcorp.experiment.proto.AbEntranceEventProto$AbEntranceEvent$Mode;
import com.yxcorp.experiment.proto.AbEntranceEventProto$AbEntranceEvent$Source;

public final class AbEntranceEventProto$AbEntranceEvent$a extends GeneratedMessageLite$Builder implements a	// class@0011f2
{

    public void AbEntranceEventProto$AbEntranceEvent$a(){
       super(AbEntranceEventProto$AbEntranceEvent.DEFAULT_INSTANCE);
    }
    public void AbEntranceEventProto$AbEntranceEvent$a(a p0){
       super(AbEntranceEventProto$AbEntranceEvent.DEFAULT_INSTANCE);
    }
    public AbEntranceEventProto$AbExperiment getAbExperiment(int p0){
       return this.instance.getAbExperiment(p0);
    }
    public int getAbExperimentCount(){
       return this.instance.getAbExperimentCount();
    }
    public List getAbExperimentList(){
       return Collections.unmodifiableList(this.instance.getAbExperimentList());
    }
    public AbEntranceEventProto$AbEntranceEvent$Mode getMode(){
       return this.instance.getMode();
    }
    public int getModeValue(){
       return this.instance.getModeValue();
    }
    public AbEntranceEventProto$AbEntranceEvent$Source getSource(){
       return this.instance.getSource();
    }
    public int getSourceValue(){
       return this.instance.getSourceValue();
    }
}
