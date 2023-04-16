package com.kwai.video.westeros.models.ModuleStats;
import com.kwai.video.westeros.models.ModuleStatsOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.ModuleStats$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kwai.video.westeros.models.ModuleStats$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class ModuleStats extends GeneratedMessageLite implements ModuleStatsOrBuilder	// class@000fe6
{
    public float avgMs_;
    public boolean enabled_;
    public int frameDropRate_;
    public float maxMs_;
    public float minMs_;
    public static final ModuleStats DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       ModuleStats moduleStats = new ModuleStats();
       ModuleStats.DEFAULT_INSTANCE = moduleStats;
       GeneratedMessageLite.registerDefaultInstance(ModuleStats.class, moduleStats);
    }
    public void ModuleStats(){
       super();
    }
    public static ModuleStats getDefaultInstance(){
       return ModuleStats.DEFAULT_INSTANCE;
    }
    public static ModuleStats$Builder newBuilder(){
       return ModuleStats.DEFAULT_INSTANCE.createBuilder();
    }
    public static ModuleStats$Builder newBuilder(ModuleStats p0){
       return ModuleStats.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static ModuleStats parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(ModuleStats.DEFAULT_INSTANCE, p0);
    }
    public static ModuleStats parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(ModuleStats.DEFAULT_INSTANCE, p0, p1);
    }
    public static ModuleStats parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(ModuleStats.DEFAULT_INSTANCE, p0);
    }
    public static ModuleStats parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ModuleStats.DEFAULT_INSTANCE, p0, p1);
    }
    public static ModuleStats parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(ModuleStats.DEFAULT_INSTANCE, p0);
    }
    public static ModuleStats parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ModuleStats.DEFAULT_INSTANCE, p0, p1);
    }
    public static ModuleStats parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(ModuleStats.DEFAULT_INSTANCE, p0);
    }
    public static ModuleStats parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ModuleStats.DEFAULT_INSTANCE, p0, p1);
    }
    public static ModuleStats parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(ModuleStats.DEFAULT_INSTANCE, p0);
    }
    public static ModuleStats parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ModuleStats.DEFAULT_INSTANCE, p0, p1);
    }
    public static ModuleStats parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(ModuleStats.DEFAULT_INSTANCE, p0);
    }
    public static ModuleStats parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ModuleStats.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return ModuleStats.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearAvgMs(){
       this.avgMs_ = 0;
    }
    public void clearEnabled(){
       this.enabled_ = false;
    }
    public void clearFrameDropRate(){
       this.frameDropRate_ = 0;
    }
    public void clearMaxMs(){
       this.maxMs_ = 0;
    }
    public void clearMinMs(){
       this.minMs_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (ModuleStats$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new ModuleStats();
           case 2:
             return new ModuleStats$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"enabled_","avgMs_","maxMs_","minMs_","frameDropRate_"};
             return GeneratedMessageLite.newMessageInfo(ModuleStats.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x05\xff\x02\xff\x02\xff\x02\xff\x02\x01\x05\x05\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07\x02\x01\x03\x01\x04\x01\x05\x04\x00", objArray);
           case 4:
             return ModuleStats.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = ModuleStats.PARSER;
             if (pARSER == null) {
                _monitor_enter(ModuleStats.class);
                pARSER = ModuleStats.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(ModuleStats.DEFAULT_INSTANCE);
                   ModuleStats.PARSER = pARSER;
                }
                _monitor_exit(ModuleStats.class);
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
    public float getAvgMs(){
       return this.avgMs_;
    }
    public boolean getEnabled(){
       return this.enabled_;
    }
    public int getFrameDropRate(){
       return this.frameDropRate_;
    }
    public float getMaxMs(){
       return this.maxMs_;
    }
    public float getMinMs(){
       return this.minMs_;
    }
    public void setAvgMs(float p0){
       this.avgMs_ = p0;
    }
    public void setEnabled(boolean p0){
       this.enabled_ = p0;
    }
    public void setFrameDropRate(int p0){
       this.frameDropRate_ = p0;
    }
    public void setMaxMs(float p0){
       this.maxMs_ = p0;
    }
    public void setMinMs(float p0){
       this.minMs_ = p0;
    }
}
