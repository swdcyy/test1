package com.kuaishou.protobuf.photo.funnel.FilterStat;
import pr4.e;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.protobuf.photo.funnel.FilterStat$b;
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
import com.kuaishou.protobuf.photo.funnel.FilterStat$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kuaishou.protobuf.photo.funnel.PrettifyRestore;
import java.util.Objects;
import com.kuaishou.protobuf.photo.funnel.PrettifyRestore$b;
import com.google.protobuf.AbstractMessageLite;

public final class FilterStat extends GeneratedMessageLite implements e	// class@000e1e
{
    public String renderTime_;
    public PrettifyRestore restore_;
    public static final FilterStat DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       FilterStat uFilterStat = new FilterStat();
       FilterStat.DEFAULT_INSTANCE = uFilterStat;
       GeneratedMessageLite.registerDefaultInstance(FilterStat.class, uFilterStat);
    }
    public void FilterStat(){
       super();
       this.renderTime_ = "";
    }
    public static FilterStat getDefaultInstance(){
       return FilterStat.DEFAULT_INSTANCE;
    }
    public static FilterStat$b newBuilder(){
       Object obj = PatchProxy.apply(null, null, FilterStat.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FilterStat.DEFAULT_INSTANCE.createBuilder();
    }
    public static FilterStat$b newBuilder(FilterStat p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FilterStat.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FilterStat.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static FilterStat parseDelimitedFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FilterStat.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(FilterStat.DEFAULT_INSTANCE, p0);
    }
    public static FilterStat parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, FilterStat.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(FilterStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static FilterStat parseFrom(ByteString p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FilterStat.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(FilterStat.DEFAULT_INSTANCE, p0);
    }
    public static FilterStat parseFrom(ByteString p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, FilterStat.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(FilterStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static FilterStat parseFrom(CodedInputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FilterStat.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(FilterStat.DEFAULT_INSTANCE, p0);
    }
    public static FilterStat parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, FilterStat.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(FilterStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static FilterStat parseFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FilterStat.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(FilterStat.DEFAULT_INSTANCE, p0);
    }
    public static FilterStat parseFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, FilterStat.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(FilterStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static FilterStat parseFrom(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FilterStat.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(FilterStat.DEFAULT_INSTANCE, p0);
    }
    public static FilterStat parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, FilterStat.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(FilterStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static FilterStat parseFrom(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FilterStat.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(FilterStat.DEFAULT_INSTANCE, p0);
    }
    public static FilterStat parseFrom(byte[] p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, FilterStat.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(FilterStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       Object obj = PatchProxy.apply(null, null, FilterStat.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FilterStat.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearRenderTime(){
       if (PatchProxy.applyVoid(null, this, FilterStat.class, "3")) {
          return;
       }
       this.renderTime_ = FilterStat.getDefaultInstance().getRenderTime();
       return;
    }
    public void clearRestore(){
       this.restore_ = null;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, FilterStat.class, "23");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       int i = 1;
       p2 = null;
       switch (FilterStat$a.a[p0.ordinal()]){
           case 1:
             return new FilterStat();
           case 2:
             return new FilterStat$b(p2);
           case 3:
             Object[] objArray = new Object[]{"renderTime_","restore_"};
             return GeneratedMessageLite.newMessageInfo(FilterStat.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\t\x00", objArray);
           case 4:
             return FilterStat.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = FilterStat.PARSER;
             if (pARSER == null) {
                _monitor_enter(FilterStat.class);
                pARSER = FilterStat.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(FilterStat.DEFAULT_INSTANCE);
                   FilterStat.PARSER = pARSER;
                }
                _monitor_exit(FilterStat.class);
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
    public String getRenderTime(){
       return this.renderTime_;
    }
    public ByteString getRenderTimeBytes(){
       Object obj = PatchProxy.apply(null, this, FilterStat.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.renderTime_);
    }
    public PrettifyRestore getRestore(){
       PrettifyRestore defaultInsta;
       FilterStat obj = PatchProxy.apply(null, this, FilterStat.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.restore_;
       if (obj == null) {
          defaultInsta = PrettifyRestore.getDefaultInstance();
       }
       return defaultInsta;
    }
    public boolean hasRestore(){
       boolean b = (this.restore_ != null)? true: false;
       return b;
    }
    public void mergeRestore(PrettifyRestore p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FilterStat.class, "8")) {
          return;
       }
       Objects.requireNonNull(p0);
       FilterStat trestore_ = this.restore_;
       this.restore_ = (trestore_ != null && trestore_ != PrettifyRestore.getDefaultInstance())? PrettifyRestore.newBuilder(this.restore_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void setRenderTime(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FilterStat.class, "2")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.renderTime_ = p0;
       return;
    }
    public void setRenderTimeBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FilterStat.class, "4")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.renderTime_ = p0.toStringUtf8();
       return;
    }
    public void setRestore(PrettifyRestore$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FilterStat.class, "7")) {
          return;
       }
       this.restore_ = p0.build();
       return;
    }
    public void setRestore(PrettifyRestore p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FilterStat.class, "6")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.restore_ = p0;
       return;
    }
}
