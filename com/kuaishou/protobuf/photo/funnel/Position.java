package com.kuaishou.protobuf.photo.funnel.Position;
import pr4.j;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.protobuf.photo.funnel.Position$b;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kuaishou.protobuf.photo.funnel.Position$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;

public final class Position extends GeneratedMessageLite implements j	// class@000e36
{
    public float x_;
    public float y_;
    public static final Position DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       Position position = new Position();
       Position.DEFAULT_INSTANCE = position;
       GeneratedMessageLite.registerDefaultInstance(Position.class, position);
    }
    public void Position(){
       super();
    }
    public static Position getDefaultInstance(){
       return Position.DEFAULT_INSTANCE;
    }
    public static Position$b newBuilder(){
       Object obj = PatchProxy.apply(null, null, Position.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Position.DEFAULT_INSTANCE.createBuilder();
    }
    public static Position$b newBuilder(Position p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Position.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Position.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static Position parseDelimitedFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Position.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(Position.DEFAULT_INSTANCE, p0);
    }
    public static Position parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, Position.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(Position.DEFAULT_INSTANCE, p0, p1);
    }
    public static Position parseFrom(ByteString p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Position.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(Position.DEFAULT_INSTANCE, p0);
    }
    public static Position parseFrom(ByteString p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, Position.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(Position.DEFAULT_INSTANCE, p0, p1);
    }
    public static Position parseFrom(CodedInputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Position.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(Position.DEFAULT_INSTANCE, p0);
    }
    public static Position parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, Position.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(Position.DEFAULT_INSTANCE, p0, p1);
    }
    public static Position parseFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Position.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(Position.DEFAULT_INSTANCE, p0);
    }
    public static Position parseFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, Position.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(Position.DEFAULT_INSTANCE, p0, p1);
    }
    public static Position parseFrom(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Position.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(Position.DEFAULT_INSTANCE, p0);
    }
    public static Position parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, Position.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(Position.DEFAULT_INSTANCE, p0, p1);
    }
    public static Position parseFrom(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Position.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(Position.DEFAULT_INSTANCE, p0);
    }
    public static Position parseFrom(byte[] p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, Position.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(Position.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       Object obj = PatchProxy.apply(null, null, Position.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Position.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearX(){
       this.x_ = 0;
    }
    public void clearY(){
       this.y_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, Position.class, "15");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       int i = 1;
       p2 = null;
       switch (Position$a.a[p0.ordinal()]){
           case 1:
             return new Position();
           case 2:
             return new Position$b(p2);
           case 3:
             Object[] objArray = new Object[]{"x_","y_"};
             return GeneratedMessageLite.newMessageInfo(Position.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x02\x01\x00", objArray);
           case 4:
             return Position.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = Position.PARSER;
             if (pARSER == null) {
                _monitor_enter(Position.class);
                pARSER = Position.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(Position.DEFAULT_INSTANCE);
                   Position.PARSER = pARSER;
                }
                _monitor_exit(Position.class);
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
    public float getX(){
       return this.x_;
    }
    public float getY(){
       return this.y_;
    }
    public void setX(float p0){
       this.x_ = p0;
    }
    public void setY(float p0){
       this.y_ = p0;
    }
}
