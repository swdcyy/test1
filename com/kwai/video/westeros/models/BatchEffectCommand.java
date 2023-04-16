package com.kwai.video.westeros.models.BatchEffectCommand;
import com.kwai.video.westeros.models.BatchEffectCommandOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kwai.video.westeros.models.BatchEffectCommand$Builder;
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
import com.kwai.video.westeros.models.EffectCommand$Builder;
import java.lang.Object;
import com.kwai.video.westeros.models.EffectCommand;
import java.util.Objects;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kwai.video.westeros.models.BatchEffectCommand$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import com.kwai.video.westeros.models.EffectCommandOrBuilder;

public final class BatchEffectCommand extends GeneratedMessageLite implements BatchEffectCommandOrBuilder	// class@000ea9
{
    public Internal$ProtobufList commands_;
    public static final BatchEffectCommand DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       BatchEffectCommand uBatchEffect = new BatchEffectCommand();
       BatchEffectCommand.DEFAULT_INSTANCE = uBatchEffect;
       GeneratedMessageLite.registerDefaultInstance(BatchEffectCommand.class, uBatchEffect);
    }
    public void BatchEffectCommand(){
       super();
       this.commands_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static BatchEffectCommand getDefaultInstance(){
       return BatchEffectCommand.DEFAULT_INSTANCE;
    }
    public static BatchEffectCommand$Builder newBuilder(){
       return BatchEffectCommand.DEFAULT_INSTANCE.createBuilder();
    }
    public static BatchEffectCommand$Builder newBuilder(BatchEffectCommand p0){
       return BatchEffectCommand.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static BatchEffectCommand parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(BatchEffectCommand.DEFAULT_INSTANCE, p0);
    }
    public static BatchEffectCommand parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(BatchEffectCommand.DEFAULT_INSTANCE, p0, p1);
    }
    public static BatchEffectCommand parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(BatchEffectCommand.DEFAULT_INSTANCE, p0);
    }
    public static BatchEffectCommand parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(BatchEffectCommand.DEFAULT_INSTANCE, p0, p1);
    }
    public static BatchEffectCommand parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(BatchEffectCommand.DEFAULT_INSTANCE, p0);
    }
    public static BatchEffectCommand parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(BatchEffectCommand.DEFAULT_INSTANCE, p0, p1);
    }
    public static BatchEffectCommand parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(BatchEffectCommand.DEFAULT_INSTANCE, p0);
    }
    public static BatchEffectCommand parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(BatchEffectCommand.DEFAULT_INSTANCE, p0, p1);
    }
    public static BatchEffectCommand parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(BatchEffectCommand.DEFAULT_INSTANCE, p0);
    }
    public static BatchEffectCommand parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(BatchEffectCommand.DEFAULT_INSTANCE, p0, p1);
    }
    public static BatchEffectCommand parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(BatchEffectCommand.DEFAULT_INSTANCE, p0);
    }
    public static BatchEffectCommand parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(BatchEffectCommand.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return BatchEffectCommand.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllCommands(Iterable p0){
       this.ensureCommandsIsMutable();
       AbstractMessageLite.addAll(p0, this.commands_);
    }
    public void addCommands(int p0,EffectCommand$Builder p1){
       this.ensureCommandsIsMutable();
       this.commands_.add(p0, p1.build());
    }
    public void addCommands(int p0,EffectCommand p1){
       Objects.requireNonNull(p1);
       this.ensureCommandsIsMutable();
       this.commands_.add(p0, p1);
    }
    public void addCommands(EffectCommand$Builder p0){
       this.ensureCommandsIsMutable();
       this.commands_.add(p0.build());
    }
    public void addCommands(EffectCommand p0){
       Objects.requireNonNull(p0);
       this.ensureCommandsIsMutable();
       this.commands_.add(p0);
    }
    public void clearCommands(){
       this.commands_ = GeneratedMessageLite.emptyProtobufList();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (BatchEffectCommand$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new BatchEffectCommand();
           case 2:
             return new BatchEffectCommand$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"commands_",EffectCommand.class};
             return GeneratedMessageLite.newMessageInfo(BatchEffectCommand.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x1b\x00", objArray);
           case 4:
             return BatchEffectCommand.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = BatchEffectCommand.PARSER;
             if (pARSER == null) {
                _monitor_enter(BatchEffectCommand.class);
                pARSER = BatchEffectCommand.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(BatchEffectCommand.DEFAULT_INSTANCE);
                   BatchEffectCommand.PARSER = pARSER;
                }
                _monitor_exit(BatchEffectCommand.class);
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
    public final void ensureCommandsIsMutable(){
       if (!this.commands_.isModifiable()) {
          this.commands_ = GeneratedMessageLite.mutableCopy(this.commands_);
       }
       return;
    }
    public EffectCommand getCommands(int p0){
       return this.commands_.get(p0);
    }
    public int getCommandsCount(){
       return this.commands_.size();
    }
    public List getCommandsList(){
       return this.commands_;
    }
    public EffectCommandOrBuilder getCommandsOrBuilder(int p0){
       return this.commands_.get(p0);
    }
    public List getCommandsOrBuilderList(){
       return this.commands_;
    }
    public void removeCommands(int p0){
       this.ensureCommandsIsMutable();
       this.commands_.remove(p0);
    }
    public void setCommands(int p0,EffectCommand$Builder p1){
       this.ensureCommandsIsMutable();
       this.commands_.set(p0, p1.build());
    }
    public void setCommands(int p0,EffectCommand p1){
       Objects.requireNonNull(p1);
       this.ensureCommandsIsMutable();
       this.commands_.set(p0, p1);
    }
}
