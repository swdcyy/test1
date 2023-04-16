package com.kuaishou.client.log.content.packages.nano.ClientContent$MagicFacePackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$MagicFacePackage extends MessageNano	// class@0012a8
{
    public long duration;
    public int groupId;
    public String id;
    public int index;
    public String magicFaceParams;
    public String magicName;
    public String name;
    public String parentId;
    public String reqId;
    public int segmentIndex;
    public boolean showCoverTag;
    public long startTime;
    public String strategyId;
    public int type;
    public static ClientContent$MagicFacePackage[] _emptyArray;

    public void ClientContent$MagicFacePackage(){
       super();
       this.clear();
    }
    public static ClientContent$MagicFacePackage[] emptyArray(){
       if (ClientContent$MagicFacePackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$MagicFacePackage._emptyArray == null) {
             ClientContent$MagicFacePackage[] magicFacePac = new ClientContent$MagicFacePackage[0];
             ClientContent$MagicFacePackage._emptyArray = magicFacePac;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$MagicFacePackage._emptyArray;
    }
    public static ClientContent$MagicFacePackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$MagicFacePackage().mergeFrom(p0);
    }
    public static ClientContent$MagicFacePackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$MagicFacePackage(), p0);
    }
    public ClientContent$MagicFacePackage clear(){
       this.name = "";
       this.startTime = 0;
       this.duration = 0;
       this.id = "";
       this.groupId = 0;
       this.index = 0;
       this.segmentIndex = 0;
       this.type = 0;
       this.parentId = "";
       this.magicName = "";
       this.magicFaceParams = "";
       this.showCoverTag = false;
       this.strategyId = "";
       this.reqId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.name).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.name);
       }
       ClientContent$MagicFacePackage tstartTime = this.startTime;
       if (tstartTime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tstartTime);
       }
       tstartTime = this.duration;
       if (tstartTime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tstartTime);
       }
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.id);
       }
       ClientContent$MagicFacePackage tgroupId = this.groupId;
       if (tgroupId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, tgroupId);
       }
       tgroupId = this.index;
       if (tgroupId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, tgroupId);
       }
       tgroupId = this.segmentIndex;
       if (tgroupId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, tgroupId);
       }
       tgroupId = this.type;
       if (tgroupId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(8, tgroupId);
       }
       if (!(this.parentId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.parentId);
       }
       if (!(this.magicName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.magicName);
       }
       if (!(this.magicFaceParams).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.magicFaceParams);
       }
       tgroupId = this.showCoverTag;
       if (tgroupId != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(12, tgroupId);
       }
       if (!(this.strategyId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(13, this.strategyId);
       }
       if (!(this.reqId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(14, this.reqId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$MagicFacePackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.name = p0.readString();
                break;
              case 16:
                this.startTime = p0.readUInt64();
                break;
              case 24:
                this.duration = p0.readUInt64();
                break;
              case '"':
                this.id = p0.readString();
                break;
              case '(':
                this.groupId = p0.readUInt32();
                break;
              case '0':
                this.index = p0.readUInt32();
                break;
              case '8':
                this.segmentIndex = p0.readUInt32();
                break;
              case '@':
                this.type = p0.readUInt32();
                break;
              case 'J':
                this.parentId = p0.readString();
                break;
              case 'R':
                this.magicName = p0.readString();
                break;
              case 'Z':
                this.magicFaceParams = p0.readString();
                break;
              case '`':
                this.showCoverTag = p0.readBool();
                break;
              case 'j':
                this.strategyId = p0.readString();
                break;
              case 'r':
                this.reqId = p0.readString();
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
       if (!(this.name).equals(str)) {
          p0.writeString(1, this.name);
       }
       ClientContent$MagicFacePackage tstartTime = this.startTime;
       if (tstartTime) {
          p0.writeUInt64(2, tstartTime);
       }
       tstartTime = this.duration;
       if (tstartTime) {
          p0.writeUInt64(3, tstartTime);
       }
       if (!(this.id).equals(str)) {
          p0.writeString(4, this.id);
       }
       ClientContent$MagicFacePackage tgroupId = this.groupId;
       if (tgroupId != null) {
          p0.writeUInt32(5, tgroupId);
       }
       tgroupId = this.index;
       if (tgroupId != null) {
          p0.writeUInt32(6, tgroupId);
       }
       tgroupId = this.segmentIndex;
       if (tgroupId != null) {
          p0.writeUInt32(7, tgroupId);
       }
       tgroupId = this.type;
       if (tgroupId != null) {
          p0.writeUInt32(8, tgroupId);
       }
       if (!(this.parentId).equals(str)) {
          p0.writeString(9, this.parentId);
       }
       if (!(this.magicName).equals(str)) {
          p0.writeString(10, this.magicName);
       }
       if (!(this.magicFaceParams).equals(str)) {
          p0.writeString(11, this.magicFaceParams);
       }
       tgroupId = this.showCoverTag;
       if (tgroupId != null) {
          p0.writeBool(12, tgroupId);
       }
       if (!(this.strategyId).equals(str)) {
          p0.writeString(13, this.strategyId);
       }
       if (!(this.reqId).equals(str)) {
          p0.writeString(14, this.reqId);
       }
       super.writeTo(p0);
       return;
    }
}
