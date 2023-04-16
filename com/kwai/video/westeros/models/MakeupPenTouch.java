package com.kwai.video.westeros.models.MakeupPenTouch;
import com.kwai.video.westeros.models.MakeupPenTouchOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.MakeupPenTouch$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kwai.video.westeros.models.MakeupPenTouch$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import com.kwai.video.westeros.models.FMPoint;
import com.kwai.video.westeros.models.EffectMakeupPenTouchType;
import java.util.Objects;
import com.kwai.video.westeros.models.FMPoint$Builder;

public final class MakeupPenTouch extends GeneratedMessageLite implements MakeupPenTouchOrBuilder	// class@000fa3
{
    public int count_;
    public FMPoint point_;
    public int type_;
    public static final MakeupPenTouch DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       MakeupPenTouch makeupPenTou = new MakeupPenTouch();
       MakeupPenTouch.DEFAULT_INSTANCE = makeupPenTou;
       GeneratedMessageLite.registerDefaultInstance(MakeupPenTouch.class, makeupPenTou);
    }
    public void MakeupPenTouch(){
       super();
    }
    public static MakeupPenTouch getDefaultInstance(){
       return MakeupPenTouch.DEFAULT_INSTANCE;
    }
    public static MakeupPenTouch$Builder newBuilder(){
       return MakeupPenTouch.DEFAULT_INSTANCE.createBuilder();
    }
    public static MakeupPenTouch$Builder newBuilder(MakeupPenTouch p0){
       return MakeupPenTouch.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static MakeupPenTouch parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(MakeupPenTouch.DEFAULT_INSTANCE, p0);
    }
    public static MakeupPenTouch parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(MakeupPenTouch.DEFAULT_INSTANCE, p0, p1);
    }
    public static MakeupPenTouch parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(MakeupPenTouch.DEFAULT_INSTANCE, p0);
    }
    public static MakeupPenTouch parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MakeupPenTouch.DEFAULT_INSTANCE, p0, p1);
    }
    public static MakeupPenTouch parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(MakeupPenTouch.DEFAULT_INSTANCE, p0);
    }
    public static MakeupPenTouch parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MakeupPenTouch.DEFAULT_INSTANCE, p0, p1);
    }
    public static MakeupPenTouch parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(MakeupPenTouch.DEFAULT_INSTANCE, p0);
    }
    public static MakeupPenTouch parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MakeupPenTouch.DEFAULT_INSTANCE, p0, p1);
    }
    public static MakeupPenTouch parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(MakeupPenTouch.DEFAULT_INSTANCE, p0);
    }
    public static MakeupPenTouch parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MakeupPenTouch.DEFAULT_INSTANCE, p0, p1);
    }
    public static MakeupPenTouch parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(MakeupPenTouch.DEFAULT_INSTANCE, p0);
    }
    public static MakeupPenTouch parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MakeupPenTouch.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return MakeupPenTouch.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearCount(){
       this.count_ = 0;
    }
    public void clearPoint(){
       this.point_ = null;
    }
    public void clearType(){
       this.type_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (MakeupPenTouch$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new MakeupPenTouch();
           case 2:
             return new MakeupPenTouch$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"type_","point_","count_"};
             return GeneratedMessageLite.newMessageInfo(MakeupPenTouch.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\f\x02\t\x03\x04\x00", objArray);
           case 4:
             return MakeupPenTouch.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = MakeupPenTouch.PARSER;
             if (pARSER == null) {
                _monitor_enter(MakeupPenTouch.class);
                pARSER = MakeupPenTouch.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(MakeupPenTouch.DEFAULT_INSTANCE);
                   MakeupPenTouch.PARSER = pARSER;
                }
                _monitor_exit(MakeupPenTouch.class);
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
    public int getCount(){
       return this.count_;
    }
    public FMPoint getPoint(){
       MakeupPenTouch tpoint_ = this.point_;
       if (tpoint_ == null) {
          tpoint_ = FMPoint.getDefaultInstance();
       }
       return tpoint_;
    }
    public EffectMakeupPenTouchType getType(){
       EffectMakeupPenTouchType uEffectMakeu = EffectMakeupPenTouchType.forNumber(this.type_);
       if (uEffectMakeu == null) {
          uEffectMakeu = EffectMakeupPenTouchType.UNRECOGNIZED;
       }
       return uEffectMakeu;
    }
    public int getTypeValue(){
       return this.type_;
    }
    public boolean hasPoint(){
       boolean b = (this.point_ != null)? true: false;
       return b;
    }
    public void mergePoint(FMPoint p0){
       Objects.requireNonNull(p0);
       MakeupPenTouch tpoint_ = this.point_;
       this.point_ = (tpoint_ != null && tpoint_ != FMPoint.getDefaultInstance())? FMPoint.newBuilder(this.point_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void setCount(int p0){
       this.count_ = p0;
    }
    public void setPoint(FMPoint$Builder p0){
       this.point_ = p0.build();
    }
    public void setPoint(FMPoint p0){
       Objects.requireNonNull(p0);
       this.point_ = p0;
    }
    public void setType(EffectMakeupPenTouchType p0){
       Objects.requireNonNull(p0);
       this.type_ = p0.getNumber();
    }
    public void setTypeValue(int p0){
       this.type_ = p0;
    }
}
