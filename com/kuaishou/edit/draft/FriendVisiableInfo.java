package com.kuaishou.edit.draft.FriendVisiableInfo;
import com.kuaishou.edit.draft.i;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kuaishou.edit.draft.FriendVisiableInfo$b;
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
import com.kuaishou.edit.draft.FriendVisiableInfo$User$a;
import java.lang.Object;
import com.kuaishou.edit.draft.FriendVisiableInfo$User;
import java.util.Objects;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kuaishou.edit.draft.FriendVisiableInfo$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import com.kuaishou.edit.draft.FriendVisiableInfo$Type;
import com.kuaishou.edit.draft.FriendVisiableInfo$c;

public final class FriendVisiableInfo extends GeneratedMessageLite implements i	// class@0017b7
{
    public int type_;
    public Internal$ProtobufList userList_;
    public static final FriendVisiableInfo DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       FriendVisiableInfo uFriendVisia = new FriendVisiableInfo();
       FriendVisiableInfo.DEFAULT_INSTANCE = uFriendVisia;
       GeneratedMessageLite.registerDefaultInstance(FriendVisiableInfo.class, uFriendVisia);
    }
    public void FriendVisiableInfo(){
       super();
       this.userList_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static FriendVisiableInfo getDefaultInstance(){
       return FriendVisiableInfo.DEFAULT_INSTANCE;
    }
    public static FriendVisiableInfo$b newBuilder(){
       return FriendVisiableInfo.DEFAULT_INSTANCE.createBuilder();
    }
    public static FriendVisiableInfo$b newBuilder(FriendVisiableInfo p0){
       return FriendVisiableInfo.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static FriendVisiableInfo parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(FriendVisiableInfo.DEFAULT_INSTANCE, p0);
    }
    public static FriendVisiableInfo parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(FriendVisiableInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static FriendVisiableInfo parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(FriendVisiableInfo.DEFAULT_INSTANCE, p0);
    }
    public static FriendVisiableInfo parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FriendVisiableInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static FriendVisiableInfo parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(FriendVisiableInfo.DEFAULT_INSTANCE, p0);
    }
    public static FriendVisiableInfo parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FriendVisiableInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static FriendVisiableInfo parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(FriendVisiableInfo.DEFAULT_INSTANCE, p0);
    }
    public static FriendVisiableInfo parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FriendVisiableInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static FriendVisiableInfo parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(FriendVisiableInfo.DEFAULT_INSTANCE, p0);
    }
    public static FriendVisiableInfo parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FriendVisiableInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static FriendVisiableInfo parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(FriendVisiableInfo.DEFAULT_INSTANCE, p0);
    }
    public static FriendVisiableInfo parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FriendVisiableInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return FriendVisiableInfo.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllUserList(Iterable p0){
       this.ensureUserListIsMutable();
       AbstractMessageLite.addAll(p0, this.userList_);
    }
    public void addUserList(int p0,FriendVisiableInfo$User$a p1){
       this.ensureUserListIsMutable();
       this.userList_.add(p0, p1.build());
    }
    public void addUserList(int p0,FriendVisiableInfo$User p1){
       Objects.requireNonNull(p1);
       this.ensureUserListIsMutable();
       this.userList_.add(p0, p1);
    }
    public void addUserList(FriendVisiableInfo$User$a p0){
       this.ensureUserListIsMutable();
       this.userList_.add(p0.build());
    }
    public void addUserList(FriendVisiableInfo$User p0){
       Objects.requireNonNull(p0);
       this.ensureUserListIsMutable();
       this.userList_.add(p0);
    }
    public void clearType(){
       this.type_ = 0;
    }
    public void clearUserList(){
       this.userList_ = GeneratedMessageLite.emptyProtobufList();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (FriendVisiableInfo$a.a[p0.ordinal()]){
           case 1:
             return new FriendVisiableInfo();
           case 2:
             return new FriendVisiableInfo$b(p2);
           case 3:
             Object[] objArray = new Object[]{"type_","userList_",FriendVisiableInfo$User.class};
             return GeneratedMessageLite.newMessageInfo(FriendVisiableInfo.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\f\x02\x1b\x00", objArray);
           case 4:
             return FriendVisiableInfo.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = FriendVisiableInfo.PARSER;
             if (pARSER == null) {
                _monitor_enter(FriendVisiableInfo.class);
                pARSER = FriendVisiableInfo.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(FriendVisiableInfo.DEFAULT_INSTANCE);
                   FriendVisiableInfo.PARSER = pARSER;
                }
                _monitor_exit(FriendVisiableInfo.class);
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
    public final void ensureUserListIsMutable(){
       if (!this.userList_.isModifiable()) {
          this.userList_ = GeneratedMessageLite.mutableCopy(this.userList_);
       }
       return;
    }
    public FriendVisiableInfo$Type getType(){
       FriendVisiableInfo$Type type = FriendVisiableInfo$Type.forNumber(this.type_);
       if (type == null) {
          type = FriendVisiableInfo$Type.UNRECOGNIZED;
       }
       return type;
    }
    public int getTypeValue(){
       return this.type_;
    }
    public FriendVisiableInfo$User getUserList(int p0){
       return this.userList_.get(p0);
    }
    public int getUserListCount(){
       return this.userList_.size();
    }
    public List getUserListList(){
       return this.userList_;
    }
    public FriendVisiableInfo$c getUserListOrBuilder(int p0){
       return this.userList_.get(p0);
    }
    public List getUserListOrBuilderList(){
       return this.userList_;
    }
    public void removeUserList(int p0){
       this.ensureUserListIsMutable();
       this.userList_.remove(p0);
    }
    public void setType(FriendVisiableInfo$Type p0){
       Objects.requireNonNull(p0);
       this.type_ = p0.getNumber();
    }
    public void setTypeValue(int p0){
       this.type_ = p0;
    }
    public void setUserList(int p0,FriendVisiableInfo$User$a p1){
       this.ensureUserListIsMutable();
       this.userList_.set(p0, p1.build());
    }
    public void setUserList(int p0,FriendVisiableInfo$User p1){
       Objects.requireNonNull(p1);
       this.ensureUserListIsMutable();
       this.userList_.set(p0, p1);
    }
}
