package com.kwai.video.westeros.models.YCNNFace;
import com.kwai.video.westeros.models.YCNNFaceOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kwai.video.westeros.models.YCNNFace$Builder;
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
import com.kwai.video.westeros.models.YCNNPoint$Builder;
import java.lang.Object;
import com.kwai.video.westeros.models.YCNNPoint;
import java.util.Objects;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kwai.video.westeros.models.YCNNFace$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import com.kwai.video.westeros.models.YCNNPointOrBuilder;
import com.kwai.video.westeros.models.YCNNRect;
import com.kwai.video.westeros.models.YCNNRect$Builder;

public final class YCNNFace extends GeneratedMessageLite implements YCNNFaceOrBuilder	// class@00108e
{
    public float pitch_;
    public Internal$ProtobufList points_;
    public YCNNRect rect_;
    public float roll_;
    public float yaw_;
    public static final YCNNFace DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       YCNNFace yCNNFace = new YCNNFace();
       YCNNFace.DEFAULT_INSTANCE = yCNNFace;
       GeneratedMessageLite.registerDefaultInstance(YCNNFace.class, yCNNFace);
    }
    public void YCNNFace(){
       super();
       this.points_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static YCNNFace getDefaultInstance(){
       return YCNNFace.DEFAULT_INSTANCE;
    }
    public static YCNNFace$Builder newBuilder(){
       return YCNNFace.DEFAULT_INSTANCE.createBuilder();
    }
    public static YCNNFace$Builder newBuilder(YCNNFace p0){
       return YCNNFace.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static YCNNFace parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(YCNNFace.DEFAULT_INSTANCE, p0);
    }
    public static YCNNFace parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(YCNNFace.DEFAULT_INSTANCE, p0, p1);
    }
    public static YCNNFace parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(YCNNFace.DEFAULT_INSTANCE, p0);
    }
    public static YCNNFace parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(YCNNFace.DEFAULT_INSTANCE, p0, p1);
    }
    public static YCNNFace parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(YCNNFace.DEFAULT_INSTANCE, p0);
    }
    public static YCNNFace parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(YCNNFace.DEFAULT_INSTANCE, p0, p1);
    }
    public static YCNNFace parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(YCNNFace.DEFAULT_INSTANCE, p0);
    }
    public static YCNNFace parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(YCNNFace.DEFAULT_INSTANCE, p0, p1);
    }
    public static YCNNFace parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(YCNNFace.DEFAULT_INSTANCE, p0);
    }
    public static YCNNFace parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(YCNNFace.DEFAULT_INSTANCE, p0, p1);
    }
    public static YCNNFace parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(YCNNFace.DEFAULT_INSTANCE, p0);
    }
    public static YCNNFace parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(YCNNFace.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return YCNNFace.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllPoints(Iterable p0){
       this.ensurePointsIsMutable();
       AbstractMessageLite.addAll(p0, this.points_);
    }
    public void addPoints(int p0,YCNNPoint$Builder p1){
       this.ensurePointsIsMutable();
       this.points_.add(p0, p1.build());
    }
    public void addPoints(int p0,YCNNPoint p1){
       Objects.requireNonNull(p1);
       this.ensurePointsIsMutable();
       this.points_.add(p0, p1);
    }
    public void addPoints(YCNNPoint$Builder p0){
       this.ensurePointsIsMutable();
       this.points_.add(p0.build());
    }
    public void addPoints(YCNNPoint p0){
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
       switch (YCNNFace$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new YCNNFace();
           case 2:
             return new YCNNFace$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"yaw_","pitch_","roll_","rect_","points_",YCNNPoint.class};
             return GeneratedMessageLite.newMessageInfo(YCNNFace.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x05\xff\x02\xff\x02\xff\x02\xff\x02\x01\x05\x05\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x01\x02\x01\x03\x01\x04\t\x05\x1b\x00", objArray);
           case 4:
             return YCNNFace.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = YCNNFace.PARSER;
             if (pARSER == null) {
                _monitor_enter(YCNNFace.class);
                pARSER = YCNNFace.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(YCNNFace.DEFAULT_INSTANCE);
                   YCNNFace.PARSER = pARSER;
                }
                _monitor_exit(YCNNFace.class);
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
    public YCNNPoint getPoints(int p0){
       return this.points_.get(p0);
    }
    public int getPointsCount(){
       return this.points_.size();
    }
    public List getPointsList(){
       return this.points_;
    }
    public YCNNPointOrBuilder getPointsOrBuilder(int p0){
       return this.points_.get(p0);
    }
    public List getPointsOrBuilderList(){
       return this.points_;
    }
    public YCNNRect getRect(){
       YCNNFace trect_ = this.rect_;
       if (trect_ == null) {
          trect_ = YCNNRect.getDefaultInstance();
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
    public void mergeRect(YCNNRect p0){
       Objects.requireNonNull(p0);
       YCNNFace trect_ = this.rect_;
       this.rect_ = (trect_ != null && trect_ != YCNNRect.getDefaultInstance())? YCNNRect.newBuilder(this.rect_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void removePoints(int p0){
       this.ensurePointsIsMutable();
       this.points_.remove(p0);
    }
    public void setPitch(float p0){
       this.pitch_ = p0;
    }
    public void setPoints(int p0,YCNNPoint$Builder p1){
       this.ensurePointsIsMutable();
       this.points_.set(p0, p1.build());
    }
    public void setPoints(int p0,YCNNPoint p1){
       Objects.requireNonNull(p1);
       this.ensurePointsIsMutable();
       this.points_.set(p0, p1);
    }
    public void setRect(YCNNRect$Builder p0){
       this.rect_ = p0.build();
    }
    public void setRect(YCNNRect p0){
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
