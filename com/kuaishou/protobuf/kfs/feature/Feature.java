package com.kuaishou.protobuf.kfs.feature.Feature;
import com.kuaishou.protobuf.kfs.feature.a;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.protobuf.kfs.feature.Feature$b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kuaishou.protobuf.kfs.feature.Feature$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.kuaishou.protobuf.kfs.feature.BytesList;
import com.kuaishou.protobuf.kfs.feature.FloatList;
import com.kuaishou.protobuf.kfs.feature.Int64List;
import com.google.protobuf.MessageLite;
import java.lang.String;
import com.kuaishou.protobuf.kfs.feature.Feature$KindCase;
import com.kuaishou.protobuf.kfs.feature.MetaInfo;
import java.util.Objects;
import com.kuaishou.protobuf.kfs.feature.BytesList$b;
import com.kuaishou.protobuf.kfs.feature.FloatList$b;
import com.kuaishou.protobuf.kfs.feature.Int64List$b;
import com.kuaishou.protobuf.kfs.feature.MetaInfo$b;

public final class Feature extends GeneratedMessageLite implements a	// class@000bf0
{
    public int kindCase_;
    public Object kind_;
    public MetaInfo meta_;
    public static final Feature DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       Feature uFeature = new Feature();
       Feature.DEFAULT_INSTANCE = uFeature;
       GeneratedMessageLite.registerDefaultInstance(Feature.class, uFeature);
    }
    public void Feature(){
       super();
       this.kindCase_ = 0;
    }
    public static Feature getDefaultInstance(){
       return Feature.DEFAULT_INSTANCE;
    }
    public static Feature$b newBuilder(){
       return Feature.DEFAULT_INSTANCE.createBuilder();
    }
    public static Feature$b newBuilder(Feature p0){
       return Feature.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static Feature parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(Feature.DEFAULT_INSTANCE, p0);
    }
    public static Feature parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(Feature.DEFAULT_INSTANCE, p0, p1);
    }
    public static Feature parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(Feature.DEFAULT_INSTANCE, p0);
    }
    public static Feature parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Feature.DEFAULT_INSTANCE, p0, p1);
    }
    public static Feature parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(Feature.DEFAULT_INSTANCE, p0);
    }
    public static Feature parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Feature.DEFAULT_INSTANCE, p0, p1);
    }
    public static Feature parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(Feature.DEFAULT_INSTANCE, p0);
    }
    public static Feature parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Feature.DEFAULT_INSTANCE, p0, p1);
    }
    public static Feature parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(Feature.DEFAULT_INSTANCE, p0);
    }
    public static Feature parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Feature.DEFAULT_INSTANCE, p0, p1);
    }
    public static Feature parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(Feature.DEFAULT_INSTANCE, p0);
    }
    public static Feature parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Feature.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return Feature.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearBytesList(){
       if (this.kindCase_ == 1) {
          this.kindCase_ = 0;
          this.kind_ = null;
       }
       return;
    }
    public void clearFloatList(){
       if (this.kindCase_ == 2) {
          this.kindCase_ = 0;
          this.kind_ = null;
       }
       return;
    }
    public void clearInt64List(){
       if (this.kindCase_ == 3) {
          this.kindCase_ = 0;
          this.kind_ = null;
       }
       return;
    }
    public void clearKind(){
       this.kindCase_ = 0;
       this.kind_ = null;
    }
    public void clearMeta(){
       this.meta_ = null;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (Feature$a.a[p0.ordinal()]){
           case 1:
             return new Feature();
           case 2:
             return new Feature$b(p2);
           case 3:
             Object[] objArray = new Object[]{"kind_","kindCase_",BytesList.class,FloatList.class,Int64List.class,"meta_"};
             return GeneratedMessageLite.newMessageInfo(Feature.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\x01\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01<\xff\x02\xff\x02\x02<\xff\x02\xff\x02\x03<\xff\x02\xff\x02\x04\t\x00", objArray);
           case 4:
             return Feature.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = Feature.PARSER;
             if (pARSER == null) {
                _monitor_enter(Feature.class);
                pARSER = Feature.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(Feature.DEFAULT_INSTANCE);
                   Feature.PARSER = pARSER;
                }
                _monitor_exit(Feature.class);
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
    public BytesList getBytesList(){
       if (this.kindCase_ == 1) {
          return this.kind_;
       }
       return BytesList.getDefaultInstance();
    }
    public FloatList getFloatList(){
       if (this.kindCase_ == 2) {
          return this.kind_;
       }
       return FloatList.getDefaultInstance();
    }
    public Int64List getInt64List(){
       if (this.kindCase_ == 3) {
          return this.kind_;
       }
       return Int64List.getDefaultInstance();
    }
    public Feature$KindCase getKindCase(){
       return Feature$KindCase.forNumber(this.kindCase_);
    }
    public MetaInfo getMeta(){
       Feature tmeta_ = this.meta_;
       if (tmeta_ == null) {
          tmeta_ = MetaInfo.getDefaultInstance();
       }
       return tmeta_;
    }
    public boolean hasBytesList(){
       boolean b = true;
       if (this.kindCase_ == b) {
       }else {
          b = false;
       }
       return b;
    }
    public boolean hasFloatList(){
       boolean b = (this.kindCase_ == 2)? true: false;
       return b;
    }
    public boolean hasInt64List(){
       boolean b = (this.kindCase_ == 3)? true: false;
       return b;
    }
    public boolean hasMeta(){
       boolean b = (this.meta_ != null)? true: false;
       return b;
    }
    public void mergeBytesList(BytesList p0){
       Objects.requireNonNull(p0);
       this.kind_ = (this.kindCase_ == 1 && this.kind_ != BytesList.getDefaultInstance())? BytesList.newBuilder(this.kind_).mergeFrom(p0).buildPartial(): p0;
       this.kindCase_ = 1;
       return;
    }
    public void mergeFloatList(FloatList p0){
       Objects.requireNonNull(p0);
       this.kind_ = (this.kindCase_ == 2 && this.kind_ != FloatList.getDefaultInstance())? FloatList.newBuilder(this.kind_).mergeFrom(p0).buildPartial(): p0;
       this.kindCase_ = 2;
       return;
    }
    public void mergeInt64List(Int64List p0){
       Objects.requireNonNull(p0);
       this.kind_ = (this.kindCase_ == 3 && this.kind_ != Int64List.getDefaultInstance())? Int64List.newBuilder(this.kind_).mergeFrom(p0).buildPartial(): p0;
       this.kindCase_ = 3;
       return;
    }
    public void mergeMeta(MetaInfo p0){
       Objects.requireNonNull(p0);
       Feature tmeta_ = this.meta_;
       this.meta_ = (tmeta_ != null && tmeta_ != MetaInfo.getDefaultInstance())? MetaInfo.newBuilder(this.meta_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void setBytesList(BytesList p0){
       Objects.requireNonNull(p0);
       this.kind_ = p0;
       this.kindCase_ = 1;
    }
    public void setFloatList(FloatList p0){
       Objects.requireNonNull(p0);
       this.kind_ = p0;
       this.kindCase_ = 2;
    }
    public void setInt64List(Int64List p0){
       Objects.requireNonNull(p0);
       this.kind_ = p0;
       this.kindCase_ = 3;
    }
    public void setMeta(MetaInfo p0){
       Objects.requireNonNull(p0);
       this.meta_ = p0;
    }
}
