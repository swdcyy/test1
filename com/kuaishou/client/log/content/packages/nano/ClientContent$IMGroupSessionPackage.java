package com.kuaishou.client.log.content.packages.nano.ClientContent$IMGroupSessionPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$IMGroupSessionPackage extends MessageNano	// class@001249
{
    public String groupId;
    public int groupType;
    public int isMute;
    public int isTop;
    public String label;
    public int memberNum;
    public String ownerId;
    public String params;
    public int position;
    public String secondTag;
    public int unreadMassageNum;
    public int userRole;
    public static ClientContent$IMGroupSessionPackage[] _emptyArray;

    public void ClientContent$IMGroupSessionPackage(){
       super();
       this.clear();
    }
    public static ClientContent$IMGroupSessionPackage[] emptyArray(){
       if (ClientContent$IMGroupSessionPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$IMGroupSessionPackage._emptyArray == null) {
             ClientContent$IMGroupSessionPackage[] iMGroupSessi = new ClientContent$IMGroupSessionPackage[0];
             ClientContent$IMGroupSessionPackage._emptyArray = iMGroupSessi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$IMGroupSessionPackage._emptyArray;
    }
    public static ClientContent$IMGroupSessionPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$IMGroupSessionPackage().mergeFrom(p0);
    }
    public static ClientContent$IMGroupSessionPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$IMGroupSessionPackage(), p0);
    }
    public ClientContent$IMGroupSessionPackage clear(){
       this.groupId = "";
       this.groupType = 0;
       this.isTop = 0;
       this.isMute = 0;
       this.position = 0;
       this.unreadMassageNum = 0;
       this.memberNum = 0;
       this.userRole = 0;
       this.params = "";
       this.ownerId = "";
       this.secondTag = "";
       this.label = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.groupId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.groupId);
       }
       ClientContent$IMGroupSessionPackage tgroupType = this.groupType;
       if (tgroupType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tgroupType);
       }
       tgroupType = this.isTop;
       if (tgroupType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tgroupType);
       }
       tgroupType = this.isMute;
       if (tgroupType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tgroupType);
       }
       tgroupType = this.position;
       if (tgroupType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tgroupType);
       }
       tgroupType = this.unreadMassageNum;
       if (tgroupType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, tgroupType);
       }
       tgroupType = this.memberNum;
       if (tgroupType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(7, tgroupType);
       }
       tgroupType = this.userRole;
       if (tgroupType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(8, tgroupType);
       }
       if (!(this.params).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.params);
       }
       if (!(this.ownerId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.ownerId);
       }
       if (!(this.secondTag).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.secondTag);
       }
       if (!(this.label).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.label);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$IMGroupSessionPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.groupId = p0.readString();
                break;
              case 16:
                this.groupType = p0.readInt32();
                break;
              case 24:
                this.isTop = p0.readInt32();
                break;
              case 32:
                this.isMute = p0.readInt32();
                break;
              case '(':
                this.position = p0.readInt32();
                break;
              case '0':
                this.unreadMassageNum = p0.readInt32();
                break;
              case '8':
                this.memberNum = p0.readInt32();
                break;
              case '@':
                this.userRole = p0.readInt32();
                break;
              case 'J':
                this.params = p0.readString();
                break;
              case 'R':
                this.ownerId = p0.readString();
                break;
              case 'Z':
                this.secondTag = p0.readString();
                break;
              case 'b':
                this.label = p0.readString();
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   return this;
                }
                continue ;
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.groupId).equals(str)) {
          p0.writeString(1, this.groupId);
       }
       ClientContent$IMGroupSessionPackage tgroupType = this.groupType;
       if (tgroupType != null) {
          p0.writeInt32(2, tgroupType);
       }
       tgroupType = this.isTop;
       if (tgroupType != null) {
          p0.writeInt32(3, tgroupType);
       }
       tgroupType = this.isMute;
       if (tgroupType != null) {
          p0.writeInt32(4, tgroupType);
       }
       tgroupType = this.position;
       if (tgroupType != null) {
          p0.writeInt32(5, tgroupType);
       }
       tgroupType = this.unreadMassageNum;
       if (tgroupType != null) {
          p0.writeInt32(6, tgroupType);
       }
       tgroupType = this.memberNum;
       if (tgroupType != null) {
          p0.writeInt32(7, tgroupType);
       }
       tgroupType = this.userRole;
       if (tgroupType != null) {
          p0.writeInt32(8, tgroupType);
       }
       if (!(this.params).equals(str)) {
          p0.writeString(9, this.params);
       }
       if (!(this.ownerId).equals(str)) {
          p0.writeString(10, this.ownerId);
       }
       if (!(this.secondTag).equals(str)) {
          p0.writeString(11, this.secondTag);
       }
       if (!(this.label).equals(str)) {
          p0.writeString(12, this.label);
       }
       super.writeTo(p0);
       return;
    }
}
