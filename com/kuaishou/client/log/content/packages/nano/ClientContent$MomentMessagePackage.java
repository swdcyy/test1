package com.kuaishou.client.log.content.packages.nano.ClientContent$MomentMessagePackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$MomentMessagePackage extends MessageNano	// class@0012ae
{
    public String atId;
    public String authorId;
    public String id;
    public int index;
    public String location;
    public String pictureId;
    public String reason;
    public String status;
    public String tagId;
    public String type;
    public static ClientContent$MomentMessagePackage[] _emptyArray;

    public void ClientContent$MomentMessagePackage(){
       super();
       this.clear();
    }
    public static ClientContent$MomentMessagePackage[] emptyArray(){
       if (ClientContent$MomentMessagePackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$MomentMessagePackage._emptyArray == null) {
             ClientContent$MomentMessagePackage[] momentMessag = new ClientContent$MomentMessagePackage[0];
             ClientContent$MomentMessagePackage._emptyArray = momentMessag;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$MomentMessagePackage._emptyArray;
    }
    public static ClientContent$MomentMessagePackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$MomentMessagePackage().mergeFrom(p0);
    }
    public static ClientContent$MomentMessagePackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$MomentMessagePackage(), p0);
    }
    public ClientContent$MomentMessagePackage clear(){
       this.id = "";
       this.authorId = "";
       this.status = "";
       this.tagId = "";
       this.index = 0;
       this.reason = "";
       this.pictureId = "";
       this.type = "";
       this.location = "";
       this.atId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       if (!(this.authorId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.authorId);
       }
       if (!(this.status).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.status);
       }
       if (!(this.tagId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.tagId);
       }
       ClientContent$MomentMessagePackage tindex = this.index;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, tindex);
       }
       if (!(this.reason).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.reason);
       }
       if (!(this.pictureId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.pictureId);
       }
       if (!(this.type).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.type);
       }
       if (!(this.location).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.location);
       }
       if (!(this.atId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.atId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$MomentMessagePackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.id = p0.readString();
                break;
              case 18:
                this.authorId = p0.readString();
                break;
              case 26:
                this.status = p0.readString();
                break;
              case '"':
                this.tagId = p0.readString();
                break;
              case '(':
                this.index = p0.readUInt32();
                break;
              case '2':
                this.reason = p0.readString();
                break;
              case ':':
                this.pictureId = p0.readString();
                break;
              case 'B':
                this.type = p0.readString();
                break;
              case 'J':
                this.location = p0.readString();
                break;
              case 'R':
                this.atId = p0.readString();
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
       if (!(this.id).equals(str)) {
          p0.writeString(1, this.id);
       }
       if (!(this.authorId).equals(str)) {
          p0.writeString(2, this.authorId);
       }
       if (!(this.status).equals(str)) {
          p0.writeString(3, this.status);
       }
       if (!(this.tagId).equals(str)) {
          p0.writeString(4, this.tagId);
       }
       ClientContent$MomentMessagePackage tindex = this.index;
       if (tindex != null) {
          p0.writeUInt32(5, tindex);
       }
       if (!(this.reason).equals(str)) {
          p0.writeString(6, this.reason);
       }
       if (!(this.pictureId).equals(str)) {
          p0.writeString(7, this.pictureId);
       }
       if (!(this.type).equals(str)) {
          p0.writeString(8, this.type);
       }
       if (!(this.location).equals(str)) {
          p0.writeString(9, this.location);
       }
       if (!(this.atId).equals(str)) {
          p0.writeString(10, this.atId);
       }
       super.writeTo(p0);
       return;
    }
}
