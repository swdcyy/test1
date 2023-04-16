package com.kwai.video.westeros.models.MmuFace;
import com.kwai.video.westeros.models.MmuFaceOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kwai.video.westeros.models.MmuFace$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import java.lang.Iterable;
import java.util.List;
import com.google.protobuf.AbstractMessageLite;
import com.kwai.video.westeros.models.MmuPoint$Builder;
import java.lang.Object;
import com.kwai.video.westeros.models.MmuPoint;
import java.util.Objects;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kwai.video.westeros.models.MmuFace$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import com.kwai.video.westeros.models.MmuPointOrBuilder;
import com.kwai.video.westeros.models.MmuRect;
import com.kwai.video.westeros.models.MmuRect$Builder;

public final class MmuFace extends GeneratedMessageLite implements MmuFaceOrBuilder	// class@000fbf
{
    public float pitch_;
    public Internal$ProtobufList points_;
    public MmuRect rect_;
    public float roll_;
    public float yaw_;
    public static final MmuFace DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       MmuFace mmuFace = new MmuFace();
       MmuFace.DEFAULT_INSTANCE = mmuFace;
       GeneratedMessageLite.registerDefaultInstance(MmuFace.class, mmuFace);
    }
    public void MmuFace(){
       super();
       this.points_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static MmuFace getDefaultInstance(){
       return MmuFace.DEFAULT_INSTANCE;
    }
    public static MmuFace$Builder newBuilder(){
       return MmuFace.DEFAULT_INSTANCE.createBuilder();
    }
    public static MmuFace$Builder newBuilder(MmuFace p0){
       return MmuFace.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static MmuFace parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(MmuFace.DEFAULT_INSTANCE, p0);
    }
    public static MmuFace parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(MmuFace.DEFAULT_INSTANCE, p0, p1);
    }
    public static MmuFace parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(MmuFace.DEFAULT_INSTANCE, p0);
    }
    public static MmuFace parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MmuFace.DEFAULT_INSTANCE, p0, p1);
    }
    public static MmuFace parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(MmuFace.DEFAULT_INSTANCE, p0);
    }
    public static MmuFace parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MmuFace.DEFAULT_INSTANCE, p0, p1);
    }
    public static MmuFace parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(MmuFace.DEFAULT_INSTANCE, p0);
    }
    public static MmuFace parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MmuFace.DEFAULT_INSTANCE, p0, p1);
    }
    public static MmuFace parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(MmuFace.DEFAULT_INSTANCE, p0);
    }
    public static MmuFace parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MmuFace.DEFAULT_INSTANCE, p0, p1);
    }
    public static MmuFace parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(MmuFace.DEFAULT_INSTANCE, p0);
    }
    public static MmuFace parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MmuFace.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return MmuFace.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllPoints(Iterable p0){
       this.ensurePointsIsMutable();
       AbstractMessageLite.addAll(p0, this.points_);
    }
    public void addPoints(int p0,MmuPoint$Builder p1){
       this.ensurePointsIsMutable();
       this.points_.add(p0, p1.build());
    }
    public void addPoints(int p0,MmuPoint p1){
       Objects.requireNonNull(p1);
       this.ensurePointsIsMutable();
       this.points_.add(p0, p1);
    }
    public void addPoints(MmuPoint$Builder p0){
       this.ensurePointsIsMutable();
       this.points_.add(p0.build());
    }
    public void addPoints(MmuPoint p0){
       Objects.requireNonNull(p0);
       this.ensurePointsIsMutable();
       this.points_.add(p0);
    }
    public void clearPitch(){
       this.pitch_ = 0;
    }
    public void clearPoints(){
       this.points_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearRect(){
       this.rect_ = null;
    }
    public void clearRoll(){
       this.roll_ = 0;
    }
    public void clearYaw(){
       this.yaw_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (MmuFace$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new MmuFace();
           case 2:
             return new MmuFace$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"yaw_","pitch_","roll_","rect_","points_",MmuPoint.class};
             return GeneratedMessageLite.newMessageInfo(MmuFace.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x05\xff\x02\xff\x02\xff\x02\xff\x02\x01\x05\x05\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x01\x02\x01\x03\x01\x04\t\x05\x1b\x00", objArray);
           case 4:
             return MmuFace.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = MmuFace.PARSER;
             if (pARSER == null) {
                _monitor_enter(MmuFace.class);
                pARSER = MmuFace.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(MmuFace.DEFAULT_INSTANCE);
                   MmuFace.PARSER = pARSER;
                }
                _monitor_exit(MmuFace.class);
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
    public final void ensurePointsIsMutable(){
       if (!this.points_.isModifiable()) {
          this.points_ = GeneratedMessageLite.mutableCopy(this.points_);
       }
       return;
    }
    public float getPitch(){
       return this.pitch_;
    }
    public MmuPoint getPoints(int p0){
       return this.points_.get(p0);
    }
    public int getPointsCount(){
       return this.points_.size();
    }
    public List getPointsList(){
       return this.points_;
    }
    public MmuPointOrBuilder getPointsOrBuilder(int p0){
       return this.points_.get(p0);
    }
    public List getPointsOrBuilderList(){
       return this.points_;
    }
    public MmuRect getRect(){
       MmuFace trect_ = this.rect_;
       if (trect_ == null) {
          trect_ = MmuRect.getDefaultInstance();
       }
       return trect_;
    }
    public float getRoll(){
       return this.roll_;
    }
    public float getYaw(){
       return this.yaw_;
    }
    public boolean hasRect(){
       boolean b = (this.rect_ != null)? true: false;
       return b;
    }
    public void mergeRect(MmuRect p0){
       Objects.requireNonNull(p0);
       MmuFace trect_ = this.rect_;
       this.rect_ = (trect_ != null && trect_ != MmuRect.getDefaultInstance())? MmuRect.newBuilder(this.rect_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void removePoints(int p0){
       this.ensurePointsIsMutable();
       this.points_.remove(p0);
    }
    public void setPitch(float p0){
       this.pitch_ = p0;
    }
    public void setPoints(int p0,MmuPoint$Builder p1){
       this.ensurePointsIsMutable();
       this.points_.set(p0, p1.build());
    }
    public void setPoints(int p0,MmuPoint p1){
       Objects.requireNonNull(p1);
       this.ensurePointsIsMutable();
       this.points_.set(p0, p1);
    }
    public void setRect(MmuRect$Builder p0){
       this.rect_ = p0.build();
    }
    public void setRect(MmuRect p0){
       Objects.requireNonNull(p0);
       this.rect_ = p0;
    }
    public void setRoll(float p0){
       this.roll_ = p0;
    }
    public void setYaw(float p0){
       this.yaw_ = p0;
    }
}
