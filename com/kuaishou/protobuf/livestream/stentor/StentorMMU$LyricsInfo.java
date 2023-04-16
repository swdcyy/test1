package com.kuaishou.protobuf.livestream.stentor.StentorMMU$LyricsInfo;
import hr4.d;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$LyricsInfo$a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import java.lang.String;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import hr4.a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class StentorMMU$LyricsInfo extends GeneratedMessageLite implements d	// class@000d8c
{
    public String lyrics_;
    public static final StentorMMU$LyricsInfo DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       StentorMMU$LyricsInfo lyricsInfo = new StentorMMU$LyricsInfo();
       StentorMMU$LyricsInfo.DEFAULT_INSTANCE = lyricsInfo;
       GeneratedMessageLite.registerDefaultInstance(StentorMMU$LyricsInfo.class, lyricsInfo);
    }
    public void StentorMMU$LyricsInfo(){
       super();
       this.lyrics_ = "";
    }
    public static StentorMMU$LyricsInfo getDefaultInstance(){
       return StentorMMU$LyricsInfo.DEFAULT_INSTANCE;
    }
    public static StentorMMU$LyricsInfo$a newBuilder(){
       return StentorMMU$LyricsInfo.DEFAULT_INSTANCE.createBuilder();
    }
    public static StentorMMU$LyricsInfo$a newBuilder(StentorMMU$LyricsInfo p0){
       return StentorMMU$LyricsInfo.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static StentorMMU$LyricsInfo parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(StentorMMU$LyricsInfo.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$LyricsInfo parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(StentorMMU$LyricsInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$LyricsInfo parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$LyricsInfo.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$LyricsInfo parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$LyricsInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$LyricsInfo parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$LyricsInfo.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$LyricsInfo parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$LyricsInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$LyricsInfo parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$LyricsInfo.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$LyricsInfo parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$LyricsInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$LyricsInfo parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$LyricsInfo.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$LyricsInfo parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$LyricsInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$LyricsInfo parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$LyricsInfo.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$LyricsInfo parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$LyricsInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return StentorMMU$LyricsInfo.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearLyrics(){
       this.lyrics_ = StentorMMU$LyricsInfo.getDefaultInstance().getLyrics();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (a.a[p0.ordinal()]){
           case 1:
             return new StentorMMU$LyricsInfo();
           case 2:
             return new StentorMMU$LyricsInfo$a(p2);
           case 3:
             Object[] objArray = new Object[i];
             objArray[0] = "lyrics_";
             return GeneratedMessageLite.newMessageInfo(StentorMMU$LyricsInfo.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x00", objArray);
           case 4:
             return StentorMMU$LyricsInfo.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = StentorMMU$LyricsInfo.PARSER;
             if (pARSER == null) {
                _monitor_enter(StentorMMU$LyricsInfo.class);
                pARSER = StentorMMU$LyricsInfo.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(StentorMMU$LyricsInfo.DEFAULT_INSTANCE);
                   StentorMMU$LyricsInfo.PARSER = pARSER;
                }
                _monitor_exit(StentorMMU$LyricsInfo.class);
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
    public String getLyrics(){
       return this.lyrics_;
    }
    public ByteString getLyricsBytes(){
       return ByteString.copyFromUtf8(this.lyrics_);
    }
    public void setLyrics(String p0){
       Objects.requireNonNull(p0);
       this.lyrics_ = p0;
    }
    public void setLyricsBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.lyrics_ = p0.toStringUtf8();
    }
}
