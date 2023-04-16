package com.kuaishou.edit.draft.DeletedRange;
import z30.v;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.edit.draft.DeletedRange$b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kuaishou.edit.draft.DeletedRange$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import com.kuaishou.edit.draft.Attributes;
import com.kuaishou.edit.draft.TimeRange;
import java.util.Objects;
import com.kuaishou.edit.draft.Attributes$b;
import com.kuaishou.edit.draft.TimeRange$b;

public final class DeletedRange extends GeneratedMessageLite implements v	// class@00176f
{
    public Attributes attributes_;
    public TimeRange range_;
    public static final DeletedRange DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       DeletedRange uDeletedRang = new DeletedRange();
       DeletedRange.DEFAULT_INSTANCE = uDeletedRang;
       GeneratedMessageLite.registerDefaultInstance(DeletedRange.class, uDeletedRang);
    }
    public void DeletedRange(){
       super();
    }
    public static DeletedRange getDefaultInstance(){
       return DeletedRange.DEFAULT_INSTANCE;
    }
    public static DeletedRange$b newBuilder(){
       return DeletedRange.DEFAULT_INSTANCE.createBuilder();
    }
    public static DeletedRange$b newBuilder(DeletedRange p0){
       return DeletedRange.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static DeletedRange parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(DeletedRange.DEFAULT_INSTANCE, p0);
    }
    public static DeletedRange parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(DeletedRange.DEFAULT_INSTANCE, p0, p1);
    }
    public static DeletedRange parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(DeletedRange.DEFAULT_INSTANCE, p0);
    }
    public static DeletedRange parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(DeletedRange.DEFAULT_INSTANCE, p0, p1);
    }
    public static DeletedRange parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(DeletedRange.DEFAULT_INSTANCE, p0);
    }
    public static DeletedRange parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(DeletedRange.DEFAULT_INSTANCE, p0, p1);
    }
    public static DeletedRange parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(DeletedRange.DEFAULT_INSTANCE, p0);
    }
    public static DeletedRange parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(DeletedRange.DEFAULT_INSTANCE, p0, p1);
    }
    public static DeletedRange parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(DeletedRange.DEFAULT_INSTANCE, p0);
    }
    public static DeletedRange parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(DeletedRange.DEFAULT_INSTANCE, p0, p1);
    }
    public static DeletedRange parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(DeletedRange.DEFAULT_INSTANCE, p0);
    }
    public static DeletedRange parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(DeletedRange.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return DeletedRange.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearAttributes(){
       this.attributes_ = null;
    }
    public void clearRange(){
       this.range_ = null;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (DeletedRange$a.a[p0.ordinal()]){
           case 1:
             return new DeletedRange();
           case 2:
             return new DeletedRange$b(p2);
           case 3:
             Object[] objArray = new Object[]{"attributes_","range_"};
             return GeneratedMessageLite.newMessageInfo(DeletedRange.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\t\x02\t\x00", objArray);
           case 4:
             return DeletedRange.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = DeletedRange.PARSER;
             if (pARSER == null) {
                _monitor_enter(DeletedRange.class);
                pARSER = DeletedRange.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(DeletedRange.DEFAULT_INSTANCE);
                   DeletedRange.PARSER = pARSER;
                }
                _monitor_exit(DeletedRange.class);
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
    public Attributes getAttributes(){
       DeletedRange tattributes_ = this.attributes_;
       if (tattributes_ == null) {
          tattributes_ = Attributes.getDefaultInstance();
       }
       return tattributes_;
    }
    public TimeRange getRange(){
       DeletedRange trange_ = this.range_;
       if (trange_ == null) {
          trange_ = TimeRange.getDefaultInstance();
       }
       return trange_;
    }
    public boolean hasAttributes(){
       boolean b = (this.attributes_ != null)? true: false;
       return b;
    }
    public boolean hasRange(){
       boolean b = (this.range_ != null)? true: false;
       return b;
    }
    public void mergeAttributes(Attributes p0){
       Objects.requireNonNull(p0);
       DeletedRange tattributes_ = this.attributes_;
       this.attributes_ = (tattributes_ != null && tattributes_ != Attributes.getDefaultInstance())? Attributes.newBuilder(this.attributes_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeRange(TimeRange p0){
       Objects.requireNonNull(p0);
       DeletedRange trange_ = this.range_;
       this.range_ = (trange_ != null && trange_ != TimeRange.getDefaultInstance())? TimeRange.newBuilder(this.range_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void setAttributes(Attributes$b p0){
       this.attributes_ = p0.build();
    }
    public void setAttributes(Attributes p0){
       Objects.requireNonNull(p0);
       this.attributes_ = p0;
    }
    public void setRange(TimeRange$b p0){
       this.range_ = p0.build();
    }
    public void setRange(TimeRange p0){
       Objects.requireNonNull(p0);
       this.range_ = p0;
    }
}
