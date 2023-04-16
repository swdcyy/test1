package com.kwai.video.westeros.models.YlabModelPathConfig;
import com.kwai.video.westeros.models.YlabModelPathConfigOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.MapFieldLite;
import com.kwai.video.westeros.models.YlabModelPathConfig$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import java.util.LinkedHashMap;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kwai.video.westeros.models.YlabModelPathConfig$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.kwai.video.westeros.models.YlabModelPathConfig$MapDefaultEntryHolder;
import com.google.protobuf.MessageLite;
import java.util.Map;
import java.util.Collections;
import java.util.HashMap;
import java.lang.IllegalArgumentException;

public final class YlabModelPathConfig extends GeneratedMessageLite implements YlabModelPathConfigOrBuilder	// class@0010b3
{
    public MapFieldLite map_;
    public static final YlabModelPathConfig DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       YlabModelPathConfig ylabModelPat = new YlabModelPathConfig();
       YlabModelPathConfig.DEFAULT_INSTANCE = ylabModelPat;
       GeneratedMessageLite.registerDefaultInstance(YlabModelPathConfig.class, ylabModelPat);
    }
    public void YlabModelPathConfig(){
       super();
       this.map_ = MapFieldLite.emptyMapField();
    }
    public static YlabModelPathConfig getDefaultInstance(){
       return YlabModelPathConfig.DEFAULT_INSTANCE;
    }
    public static YlabModelPathConfig$Builder newBuilder(){
       return YlabModelPathConfig.DEFAULT_INSTANCE.createBuilder();
    }
    public static YlabModelPathConfig$Builder newBuilder(YlabModelPathConfig p0){
       return YlabModelPathConfig.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static YlabModelPathConfig parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(YlabModelPathConfig.DEFAULT_INSTANCE, p0);
    }
    public static YlabModelPathConfig parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(YlabModelPathConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static YlabModelPathConfig parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(YlabModelPathConfig.DEFAULT_INSTANCE, p0);
    }
    public static YlabModelPathConfig parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(YlabModelPathConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static YlabModelPathConfig parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(YlabModelPathConfig.DEFAULT_INSTANCE, p0);
    }
    public static YlabModelPathConfig parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(YlabModelPathConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static YlabModelPathConfig parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(YlabModelPathConfig.DEFAULT_INSTANCE, p0);
    }
    public static YlabModelPathConfig parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(YlabModelPathConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static YlabModelPathConfig parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(YlabModelPathConfig.DEFAULT_INSTANCE, p0);
    }
    public static YlabModelPathConfig parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(YlabModelPathConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static YlabModelPathConfig parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(YlabModelPathConfig.DEFAULT_INSTANCE, p0);
    }
    public static YlabModelPathConfig parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(YlabModelPathConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return YlabModelPathConfig.DEFAULT_INSTANCE.getParserForType();
    }
    public boolean containsMap(String p0){
       Objects.requireNonNull(p0);
       return this.internalGetMap().containsKey(p0);
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (YlabModelPathConfig$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new YlabModelPathConfig();
           case 2:
             return new YlabModelPathConfig$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"map_",YlabModelPathConfig$MapDefaultEntryHolder.defaultEntry};
             return GeneratedMessageLite.newMessageInfo(YlabModelPathConfig.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\x012\x00", objArray);
           case 4:
             return YlabModelPathConfig.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = YlabModelPathConfig.PARSER;
             if (pARSER == null) {
                _monitor_enter(YlabModelPathConfig.class);
                pARSER = YlabModelPathConfig.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(YlabModelPathConfig.DEFAULT_INSTANCE);
                   YlabModelPathConfig.PARSER = pARSER;
                }
                _monitor_exit(YlabModelPathConfig.class);
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
    public Map getMap(){
       return this.getMapMap();
    }
    public int getMapCount(){
       return this.internalGetMap().size();
    }
    public Map getMapMap(){
       return Collections.unmodifiableMap(this.internalGetMap());
    }
    public String getMapOrDefault(String p0,String p1){
       Objects.requireNonNull(p0);
       MapFieldLite mapFieldLite = this.internalGetMap();
       if (mapFieldLite.containsKey(p0)) {
          p1 = mapFieldLite.get(p0);
       }
       return p1;
    }
    public String getMapOrThrow(String p0){
       Objects.requireNonNull(p0);
       MapFieldLite mapFieldLite = this.internalGetMap();
       if (mapFieldLite.containsKey(p0)) {
          return mapFieldLite.get(p0);
       }
       throw new IllegalArgumentException();
    }
    public Map getMutableMapMap(){
       return this.internalGetMutableMap();
    }
    public final MapFieldLite internalGetMap(){
       return this.map_;
    }
    public final MapFieldLite internalGetMutableMap(){
       if (!this.map_.isMutable()) {
          this.map_ = this.map_.mutableCopy();
       }
       return this.map_;
    }
}
