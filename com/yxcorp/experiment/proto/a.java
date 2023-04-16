package com.yxcorp.experiment.proto.a;
import com.google.protobuf.MessageLiteOrBuilder;
import com.yxcorp.experiment.proto.AbEntranceEventProto$AbExperiment;
import java.util.List;
import com.yxcorp.experiment.proto.AbEntranceEventProto$AbEntranceEvent$Mode;
import com.yxcorp.experiment.proto.AbEntranceEventProto$AbEntranceEvent$Source;

public interface abstract a implements MessageLiteOrBuilder	// class@0011f6
{

    AbEntranceEventProto$AbExperiment getAbExperiment(int p0);
    int getAbExperimentCount();
    List getAbExperimentList();
    AbEntranceEventProto$AbEntranceEvent$Mode getMode();
    int getModeValue();
    AbEntranceEventProto$AbEntranceEvent$Source getSource();
    int getSourceValue();
}
