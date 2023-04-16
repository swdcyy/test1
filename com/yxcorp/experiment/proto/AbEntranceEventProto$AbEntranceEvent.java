package com.yxcorp.experiment.proto.AbEntranceEventProto$AbEntranceEvent;
import com.yxcorp.experiment.proto.a;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.yxcorp.experiment.proto.AbEntranceEventProto$AbEntranceEvent$a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.yxcorp.experiment.proto.AbEntranceEventProto$AbExperiment$a;
import java.lang.Object;
import java.util.List;
import com.yxcorp.experiment.proto.AbEntranceEventProto$AbExperiment;
import java.util.Objects;
import java.lang.Iterable;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import cv8.a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import cv8.b;
import com.yxcorp.experiment.proto.AbEntranceEventProto$AbEntranceEvent$Mode;
import com.yxcorp.experiment.proto.AbEntranceEventProto$AbEntranceEvent$Source;

public final class AbEntranceEventProto$AbEntranceEvent extends GeneratedMessageLite implements a	// class@0011f3
{
    public Internal$ProtobufList abExperiment_;
    public int mode_;
    public int source_;
    public static final AbEntranceEventProto$AbEntranceEvent DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       AbEntranceEventProto$AbEntranceEvent uAbEntranceE = new AbEntranceEventProto$AbEntranceEvent();
       AbEntranceEventProto$AbEntranceEvent.DEFAULT_INSTANCE = uAbEntranceE;
       GeneratedMessageLite.registerDefaultInstance(AbEntranceEventProto$AbEntranceEvent.class, uAbEntranceE);
    }
    public void AbEntranceEventProto$AbEntranceEvent(){
       super();
       this.abExperiment_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static AbEntranceEventProto$AbEntranceEvent getDefaultInstance(){
       return AbEntranceEventProto$AbEntranceEvent.DEFAULT_INSTANCE;
    }
    public static AbEntranceEventProto$AbEntranceEvent$a newBuilder(){
       return AbEntranceEventProto$AbEntranceEvent.DEFAULT_INSTANCE.createBuilder();
    }
    public static AbEntranceEventProto$AbEntranceEvent$a newBuilder(AbEntranceEventProto$AbEntranceEvent p0){
       return AbEntranceEventProto$AbEntranceEvent.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static AbEntranceEventProto$AbEntranceEvent parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(AbEntranceEventProto$AbEntranceEvent.DEFAULT_INSTANCE, p0);
    }
    public static AbEntranceEventProto$AbEntranceEvent parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(AbEntranceEventProto$AbEntranceEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static AbEntranceEventProto$AbEntranceEvent parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(AbEntranceEventProto$AbEntranceEvent.DEFAULT_INSTANCE, p0);
    }
    public static AbEntranceEventProto$AbEntranceEvent parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AbEntranceEventProto$AbEntranceEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static AbEntranceEventProto$AbEntranceEvent parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(AbEntranceEventProto$AbEntranceEvent.DEFAULT_INSTANCE, p0);
    }
    public static AbEntranceEventProto$AbEntranceEvent parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AbEntranceEventProto$AbEntranceEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static AbEntranceEventProto$AbEntranceEvent parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(AbEntranceEventProto$AbEntranceEvent.DEFAULT_INSTANCE, p0);
    }
    public static AbEntranceEventProto$AbEntranceEvent parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AbEntranceEventProto$AbEntranceEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static AbEntranceEventProto$AbEntranceEvent parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(AbEntranceEventProto$AbEntranceEvent.DEFAULT_INSTANCE, p0);
    }
    public static AbEntranceEventProto$AbEntranceEvent parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AbEntranceEventProto$AbEntranceEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static AbEntranceEventProto$AbEntranceEvent parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(AbEntranceEventProto$AbEntranceEvent.DEFAULT_INSTANCE, p0);
    }
    public static AbEntranceEventProto$AbEntranceEvent parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AbEntranceEventProto$AbEntranceEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return AbEntranceEventProto$AbEntranceEvent.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAbExperiment(int p0,AbEntranceEventProto$AbExperiment$a p1){
       this.ensureAbExperimentIsMutable();
       this.abExperiment_.add(p0, p1.build());
    }
    public void addAbExperiment(int p0,AbEntranceEventProto$AbExperiment p1){
       Objects.requireNonNull(p1);
       this.ensureAbExperimentIsMutable();
       this.abExperiment_.add(p0, p1);
    }
    public void addAbExperiment(AbEntranceEventProto$AbExperiment$a p0){
       this.ensureAbExperimentIsMutable();
       this.abExperiment_.add(p0.build());
    }
    public void addAbExperiment(AbEntranceEventProto$AbExperiment p0){
       Objects.requireNonNull(p0);
       this.ensureAbExperimentIsMutable();
       this.abExperiment_.add(p0);
    }
    public void addAllAbExperiment(Iterable p0){
       this.ensureAbExperimentIsMutable();
       AbstractMessageLite.addAll(p0, this.abExperiment_);
    }
    public void clearAbExperiment(){
       this.abExperiment_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearMode(){
       this.mode_ = 0;
    }
    public void clearSource(){
       this.source_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (a.a[p0.ordinal()]){
           case 1:
             return new AbEntranceEventProto$AbEntranceEvent();
           case 2:
             return new AbEntranceEventProto$AbEntranceEvent$a(p2);
           case 3:
             Object[] objArray = new Object[]{"mode_","source_","abExperiment_",AbEntranceEventProto$AbExperiment.class};
             return GeneratedMessageLite.newMessageInfo(AbEntranceEventProto$AbEntranceEvent.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\f\x02\f\x03\x1b\x00", objArray);
           case 4:
             return AbEntranceEventProto$AbEntranceEvent.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = AbEntranceEventProto$AbEntranceEvent.PARSER;
             if (pARSER == null) {
                _monitor_enter(AbEntranceEventProto$AbEntranceEvent.class);
                pARSER = AbEntranceEventProto$AbEntranceEvent.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(AbEntranceEventProto$AbEntranceEvent.DEFAULT_INSTANCE);
                   AbEntranceEventProto$AbEntranceEvent.PARSER = pARSER;
                }
                _monitor_exit(AbEntranceEventProto$AbEntranceEvent.class);
             }
             return pARSER;
             break;
           case 6:
             return Byte.valueOf(i);
           case 7:
             return p2;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final void ensureAbExperimentIsMutable(){
       if (!this.abExperiment_.isModifiable()) {
          this.abExperiment_ = GeneratedMessageLite.mutableCopy(this.abExperiment_);
       }
       return;
    }
    public AbEntranceEventProto$AbExperiment getAbExperiment(int p0){
       return this.abExperiment_.get(p0);
    }
    public int getAbExperimentCount(){
       return this.abExperiment_.size();
    }
    public List getAbExperimentList(){
       return this.abExperiment_;
    }
    public b getAbExperimentOrBuilder(int p0){
       return this.abExperiment_.get(p0);
    }
    public List getAbExperimentOrBuilderList(){
       return this.abExperiment_;
    }
    public AbEntranceEventProto$AbEntranceEvent$Mode getMode(){
       AbEntranceEventProto$AbEntranceEvent$Mode uAbEntranceE = AbEntranceEventProto$AbEntranceEvent$Mode.forNumber(this.mode_);
       if (uAbEntranceE == null) {
          uAbEntranceE = AbEntranceEventProto$AbEntranceEvent$Mode.UNRECOGNIZED;
       }
       return uAbEntranceE;
    }
    public int getModeValue(){
       return this.mode_;
    }
    public AbEntranceEventProto$AbEntranceEvent$Source getSource(){
       AbEntranceEventProto$AbEntranceEvent$Source uAbEntranceE = AbEntranceEventProto$AbEntranceEvent$Source.forNumber(this.source_);
       if (uAbEntranceE == null) {
          uAbEntranceE = AbEntranceEventProto$AbEntranceEvent$Source.UNRECOGNIZED;
       }
       return uAbEntranceE;
    }
    public int getSourceValue(){
       return this.source_;
    }
    public void removeAbExperiment(int p0){
       this.ensureAbExperimentIsMutable();
       this.abExperiment_.remove(p0);
    }
    public void setAbExperiment(int p0,AbEntranceEventProto$AbExperiment$a p1){
       this.ensureAbExperimentIsMutable();
       this.abExperiment_.set(p0, p1.build());
    }
    public void setAbExperiment(int p0,AbEntranceEventProto$AbExperiment p1){
       Objects.requireNonNull(p1);
       this.ensureAbExperimentIsMutable();
       this.abExperiment_.set(p0, p1);
    }
    public void setMode(AbEntranceEventProto$AbEntranceEvent$Mode p0){
       Objects.requireNonNull(p0);
       this.mode_ = p0.getNumber();
    }
    public void setModeValue(int p0){
       this.mode_ = p0;
    }
    public void setSource(AbEntranceEventProto$AbEntranceEvent$Source p0){
       Objects.requireNonNull(p0);
       this.source_ = p0.getNumber();
    }
    public void setSourceValue(int p0){
       this.source_ = p0;
    }
}
