package com.kwai.video.westeros.models.UiTouchEvent;
import com.kwai.video.westeros.models.UiTouchEventOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kwai.video.westeros.models.UiTouchEvent$Builder;
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
import com.kwai.video.westeros.models.Point2d$Builder;
import java.lang.Object;
import com.kwai.video.westeros.models.Point2d;
import java.util.Objects;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kwai.video.westeros.models.UiTouchEvent$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import com.kwai.video.westeros.models.Point2dOrBuilder;
import com.kwai.video.westeros.models.UiTouchEventType;

public final class UiTouchEvent extends GeneratedMessageLite implements UiTouchEventOrBuilder	// class@001077
{
    public Internal$ProtobufList points_;
    public int type_;
    public static final UiTouchEvent DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       UiTouchEvent uiTouchEvent = new UiTouchEvent();
       UiTouchEvent.DEFAULT_INSTANCE = uiTouchEvent;
       GeneratedMessageLite.registerDefaultInstance(UiTouchEvent.class, uiTouchEvent);
    }
    public void UiTouchEvent(){
       super();
       this.points_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static UiTouchEvent getDefaultInstance(){
       return UiTouchEvent.DEFAULT_INSTANCE;
    }
    public static UiTouchEvent$Builder newBuilder(){
       return UiTouchEvent.DEFAULT_INSTANCE.createBuilder();
    }
    public static UiTouchEvent$Builder newBuilder(UiTouchEvent p0){
       return UiTouchEvent.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static UiTouchEvent parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(UiTouchEvent.DEFAULT_INSTANCE, p0);
    }
    public static UiTouchEvent parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(UiTouchEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static UiTouchEvent parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(UiTouchEvent.DEFAULT_INSTANCE, p0);
    }
    public static UiTouchEvent parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(UiTouchEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static UiTouchEvent parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(UiTouchEvent.DEFAULT_INSTANCE, p0);
    }
    public static UiTouchEvent parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(UiTouchEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static UiTouchEvent parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(UiTouchEvent.DEFAULT_INSTANCE, p0);
    }
    public static UiTouchEvent parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(UiTouchEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static UiTouchEvent parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(UiTouchEvent.DEFAULT_INSTANCE, p0);
    }
    public static UiTouchEvent parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(UiTouchEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static UiTouchEvent parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(UiTouchEvent.DEFAULT_INSTANCE, p0);
    }
    public static UiTouchEvent parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(UiTouchEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return UiTouchEvent.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllPoints(Iterable p0){
       this.ensurePointsIsMutable();
       AbstractMessageLite.addAll(p0, this.points_);
    }
    public void addPoints(int p0,Point2d$Builder p1){
       this.ensurePointsIsMutable();
       this.points_.add(p0, p1.build());
    }
    public void addPoints(int p0,Point2d p1){
       Objects.requireNonNull(p1);
       this.ensurePointsIsMutable();
       this.points_.add(p0, p1);
    }
    public void addPoints(Point2d$Builder p0){
       this.ensurePointsIsMutable();
       this.points_.add(p0.build());
    }
    public void addPoints(Point2d p0){
       Objects.requireNonNull(p0);
       this.ensurePointsIsMutable();
       this.points_.add(p0);
    }
    public void clearPoints(){
       this.points_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearType(){
       this.type_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (UiTouchEvent$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new UiTouchEvent();
           case 2:
             return new UiTouchEvent$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"type_","points_",Point2d.class};
             return GeneratedMessageLite.newMessageInfo(UiTouchEvent.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\f\x02\x1b\x00", objArray);
           case 4:
             return UiTouchEvent.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = UiTouchEvent.PARSER;
             if (pARSER == null) {
                _monitor_enter(UiTouchEvent.class);
                pARSER = UiTouchEvent.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(UiTouchEvent.DEFAULT_INSTANCE);
                   UiTouchEvent.PARSER = pARSER;
                }
                _monitor_exit(UiTouchEvent.class);
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
    public Point2d getPoints(int p0){
       return this.points_.get(p0);
    }
    public int getPointsCount(){
       return this.points_.size();
    }
    public List getPointsList(){
       return this.points_;
    }
    public Point2dOrBuilder getPointsOrBuilder(int p0){
       return this.points_.get(p0);
    }
    public List getPointsOrBuilderList(){
       return this.points_;
    }
    public UiTouchEventType getType(){
       UiTouchEventType uiTouchEvent = UiTouchEventType.forNumber(this.type_);
       if (uiTouchEvent == null) {
          uiTouchEvent = UiTouchEventType.UNRECOGNIZED;
       }
       return uiTouchEvent;
    }
    public int getTypeValue(){
       return this.type_;
    }
    public void removePoints(int p0){
       this.ensurePointsIsMutable();
       this.points_.remove(p0);
    }
    public void setPoints(int p0,Point2d$Builder p1){
       this.ensurePointsIsMutable();
       this.points_.set(p0, p1.build());
    }
    public void setPoints(int p0,Point2d p1){
       Objects.requireNonNull(p1);
       this.ensurePointsIsMutable();
       this.points_.set(p0, p1);
    }
    public void setType(UiTouchEventType p0){
       Objects.requireNonNull(p0);
       this.type_ = p0.getNumber();
    }
    public void setTypeValue(int p0){
       this.type_ = p0;
    }
}
