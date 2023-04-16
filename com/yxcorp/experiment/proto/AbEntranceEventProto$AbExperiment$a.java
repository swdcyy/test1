package com.yxcorp.experiment.proto.AbEntranceEventProto$AbExperiment$a;
import cv8.b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.yxcorp.experiment.proto.AbEntranceEventProto$AbExperiment;
import com.google.protobuf.GeneratedMessageLite;
import cv8.a;
import java.lang.String;
import com.google.protobuf.ByteString;

public final class AbEntranceEventProto$AbExperiment$a extends GeneratedMessageLite$Builder implements b	// class@0011f4
{

    public void AbEntranceEventProto$AbExperiment$a(){
       super(AbEntranceEventProto$AbExperiment.DEFAULT_INSTANCE);
    }
    public void AbEntranceEventProto$AbExperiment$a(a p0){
       super(AbEntranceEventProto$AbExperiment.DEFAULT_INSTANCE);
    }
    public AbEntranceEventProto$AbExperiment$a a(int p0){
       this.copyOnWrite();
       this.instance.setCount(p0);
       return this;
    }
    public AbEntranceEventProto$AbExperiment$a b(int p0){
       this.copyOnWrite();
       this.instance.setDf(p0);
       return this;
    }
    public AbEntranceEventProto$AbExperiment$a c(String p0){
       this.copyOnWrite();
       this.instance.setExtraInfo(p0);
       return this;
    }
    public AbEntranceEventProto$AbExperiment$a d(long p0){
       this.copyOnWrite();
       this.instance.setGid(p0);
       return this;
    }
    public int getCount(){
       return this.instance.getCount();
    }
    public int getDf(){
       return this.instance.getDf();
    }
    public String getExtraInfo(){
       return this.instance.getExtraInfo();
    }
    public ByteString getExtraInfoBytes(){
       return this.instance.getExtraInfoBytes();
    }
    public long getGid(){
       return this.instance.getGid();
    }
}
