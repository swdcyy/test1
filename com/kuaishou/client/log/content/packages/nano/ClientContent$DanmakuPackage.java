package com.kuaishou.client.log.content.packages.nano.ClientContent$DanmakuPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$DanmakuPackage extends MessageNano	// class@001233
{
    public int danmakuBodyCount;
    public String danmakuId;
    public String danmakuUserId;
    public boolean highcopy;
    public boolean highlike;
    public String serverParams;
    public static ClientContent$DanmakuPackage[] _emptyArray;

    public void ClientContent$DanmakuPackage(){
       super();
       this.clear();
    }
    public static ClientContent$DanmakuPackage[] emptyArray(){
       if (ClientContent$DanmakuPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$DanmakuPackage._emptyArray == null) {
             ClientContent$DanmakuPackage[] uDanmakuPack = new ClientContent$DanmakuPackage[0];
             ClientContent$DanmakuPackage._emptyArray = uDanmakuPack;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$DanmakuPackage._emptyArray;
    }
    public static ClientContent$DanmakuPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$DanmakuPackage().mergeFrom(p0);
    }
    public static ClientContent$DanmakuPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$DanmakuPackage(), p0);
    }
    public ClientContent$DanmakuPackage clear(){
       this.danmakuId = "";
       this.danmakuUserId = "";
       this.highcopy = false;
       this.highlike = false;
       this.danmakuBodyCount = 0;
       this.serverParams = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.danmakuId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.danmakuId);
       }
       if (!(this.danmakuUserId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.danmakuUserId);
       }
       ClientContent$DanmakuPackage thighcopy = this.highcopy;
       if (thighcopy != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, thighcopy);
       }
       thighcopy = this.highlike;
       if (thighcopy != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, thighcopy);
       }
       thighcopy = this.danmakuBodyCount;
       if (thighcopy != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, thighcopy);
       }
       if (!(this.serverParams).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.serverParams);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$DanmakuPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 40) {
                         if (i != 50) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.serverParams = p0.readString();
                         }
                      }else {
                         this.danmakuBodyCount = p0.readUInt32();
                      }
                   }else {
                      this.highlike = p0.readBool();
                   }
                }else {
                   this.highcopy = p0.readBool();
                }
             }else {
                this.danmakuUserId = p0.readString();
             }
          }else {
             this.danmakuId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.danmakuId).equals(str)) {
          p0.writeString(1, this.danmakuId);
       }
       if (!(this.danmakuUserId).equals(str)) {
          p0.writeString(2, this.danmakuUserId);
       }
       ClientContent$DanmakuPackage thighcopy = this.highcopy;
       if (thighcopy != null) {
          p0.writeBool(3, thighcopy);
       }
       thighcopy = this.highlike;
       if (thighcopy != null) {
          p0.writeBool(4, thighcopy);
       }
       thighcopy = this.danmakuBodyCount;
       if (thighcopy != null) {
          p0.writeUInt32(5, thighcopy);
       }
       if (!(this.serverParams).equals(str)) {
          p0.writeString(6, this.serverParams);
       }
       super.writeTo(p0);
       return;
    }
}
