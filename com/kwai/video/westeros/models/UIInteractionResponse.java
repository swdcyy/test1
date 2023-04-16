package com.kwai.video.westeros.models.UIInteractionResponse;
import com.kwai.video.westeros.models.UIInteractionResponseOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kwai.video.westeros.models.UIInteractionResponse$Builder;
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
import com.kwai.video.westeros.models.Point$Builder;
import java.lang.Object;
import com.kwai.video.westeros.models.Point;
import java.util.Objects;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kwai.video.westeros.models.UIInteractionResponse$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import com.kwai.video.westeros.models.PointOrBuilder;
import com.kwai.video.westeros.models.UIInteractionResponseType;

public final class UIInteractionResponse extends GeneratedMessageLite implements UIInteractionResponseOrBuilder	// class@001070
{
    public Internal$ProtobufList points_;
    public int type_;
    public static final UIInteractionResponse DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       UIInteractionResponse uIInteractio = new UIInteractionResponse();
       UIInteractionResponse.DEFAULT_INSTANCE = uIInteractio;
       GeneratedMessageLite.registerDefaultInstance(UIInteractionResponse.class, uIInteractio);
    }
    public void UIInteractionResponse(){
       super();
       this.points_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static UIInteractionResponse getDefaultInstance(){
       return UIInteractionResponse.DEFAULT_INSTANCE;
    }
    public static UIInteractionResponse$Builder newBuilder(){
       return UIInteractionResponse.DEFAULT_INSTANCE.createBuilder();
    }
    public static UIInteractionResponse$Builder newBuilder(UIInteractionResponse p0){
       return UIInteractionResponse.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static UIInteractionResponse parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(UIInteractionResponse.DEFAULT_INSTANCE, p0);
    }
    public static UIInteractionResponse parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(UIInteractionResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static UIInteractionResponse parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(UIInteractionResponse.DEFAULT_INSTANCE, p0);
    }
    public static UIInteractionResponse parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(UIInteractionResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static UIInteractionResponse parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(UIInteractionResponse.DEFAULT_INSTANCE, p0);
    }
    public static UIInteractionResponse parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(UIInteractionResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static UIInteractionResponse parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(UIInteractionResponse.DEFAULT_INSTANCE, p0);
    }
    public static UIInteractionResponse parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(UIInteractionResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static UIInteractionResponse parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(UIInteractionResponse.DEFAULT_INSTANCE, p0);
    }
    public static UIInteractionResponse parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(UIInteractionResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static UIInteractionResponse parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(UIInteractionResponse.DEFAULT_INSTANCE, p0);
    }
    public static UIInteractionResponse parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(UIInteractionResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return UIInteractionResponse.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllPoints(Iterable p0){
       this.ensurePointsIsMutable();
       AbstractMessageLite.addAll(p0, this.points_);
    }
    public void addPoints(int p0,Point$Builder p1){
       this.ensurePointsIsMutable();
       this.points_.add(p0, p1.build());
    }
    public void addPoints(int p0,Point p1){
       Objects.requireNonNull(p1);
       this.ensurePointsIsMutable();
       this.points_.add(p0, p1);
    }
    public void addPoints(Point$Builder p0){
       this.ensurePointsIsMutable();
       this.points_.add(p0.build());
    }
    public void addPoints(Point p0){
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
       switch (UIInteractionResponse$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new UIInteractionResponse();
           case 2:
             return new UIInteractionResponse$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"type_","points_",Point.class};
             return GeneratedMessageLite.newMessageInfo(UIInteractionResponse.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\f\x02\x1b\x00", objArray);
           case 4:
             return UIInteractionResponse.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = UIInteractionResponse.PARSER;
             if (pARSER == null) {
                _monitor_enter(UIInteractionResponse.class);
                pARSER = UIInteractionResponse.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(UIInteractionResponse.DEFAULT_INSTANCE);
                   UIInteractionResponse.PARSER = pARSER;
                }
                _monitor_exit(UIInteractionResponse.class);
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
    public Point getPoints(int p0){
       return this.points_.get(p0);
    }
    public int getPointsCount(){
       return this.points_.size();
    }
    public List getPointsList(){
       return this.points_;
    }
    public PointOrBuilder getPointsOrBuilder(int p0){
       return this.points_.get(p0);
    }
    public List getPointsOrBuilderList(){
       return this.points_;
    }
    public UIInteractionResponseType getType(){
       UIInteractionResponseType uIInteractio = UIInteractionResponseType.forNumber(this.type_);
       if (uIInteractio == null) {
          uIInteractio = UIInteractionResponseType.UNRECOGNIZED;
       }
       return uIInteractio;
    }
    public int getTypeValue(){
       return this.type_;
    }
    public void removePoints(int p0){
       this.ensurePointsIsMutable();
       this.points_.remove(p0);
    }
    public void setPoints(int p0,Point$Builder p1){
       this.ensurePointsIsMutable();
       this.points_.set(p0, p1.build());
    }
    public void setPoints(int p0,Point p1){
       Objects.requireNonNull(p1);
       this.ensurePointsIsMutable();
       this.points_.set(p0, p1);
    }
    public void setType(UIInteractionResponseType p0){
       Objects.requireNonNull(p0);
       this.type_ = p0.getNumber();
    }
    public void setTypeValue(int p0){
       this.type_ = p0;
    }
}
