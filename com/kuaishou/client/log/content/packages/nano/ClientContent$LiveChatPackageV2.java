package com.kuaishou.client.log.content.packages.nano.ClientContent$LiveChatPackageV2;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$LiveChatPackageV2 extends MessageNano	// class@00126a
{
    public int applyUsersNumber;
    public long giftKsCoin;
    public boolean isFriend;
    public String liveStreamId;
    public String peerId;
    public String userId;
    public static ClientContent$LiveChatPackageV2[] _emptyArray;

    public void ClientContent$LiveChatPackageV2(){
       super();
       this.clear();
    }
    public static ClientContent$LiveChatPackageV2[] emptyArray(){
       if (ClientContent$LiveChatPackageV2._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$LiveChatPackageV2._emptyArray == null) {
             ClientContent$LiveChatPackageV2[] liveChatPack = new ClientContent$LiveChatPackageV2[0];
             ClientContent$LiveChatPackageV2._emptyArray = liveChatPack;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$LiveChatPackageV2._emptyArray;
    }
    public static ClientContent$LiveChatPackageV2 parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$LiveChatPackageV2().mergeFrom(p0);
    }
    public static ClientContent$LiveChatPackageV2 parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$LiveChatPackageV2(), p0);
    }
    public ClientContent$LiveChatPackageV2 clear(){
       this.userId = "";
       this.peerId = "";
       this.liveStreamId = "";
       this.applyUsersNumber = 0;
       this.isFriend = false;
       this.giftKsCoin = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.userId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.userId);
       }
       if (!(this.peerId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.peerId);
       }
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.liveStreamId);
       }
       ClientContent$LiveChatPackageV2 tapplyUsersN = this.applyUsersNumber;
       if (tapplyUsersN != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tapplyUsersN);
       }
       tapplyUsersN = this.isFriend;
       if (tapplyUsersN != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(5, tapplyUsersN);
       }
       tapplyUsersN = this.giftKsCoin;
       if (tapplyUsersN) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tapplyUsersN);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$LiveChatPackageV2 mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 32) {
                      if (i != 40) {
                         if (i != 48) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.giftKsCoin = p0.readUInt64();
                         }
                      }else {
                         this.isFriend = p0.readBool();
                      }
                   }else {
                      this.applyUsersNumber = p0.readUInt32();
                   }
                }else {
                   this.liveStreamId = p0.readString();
                }
             }else {
                this.peerId = p0.readString();
             }
          }else {
             this.userId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.userId).equals(str)) {
          p0.writeString(1, this.userId);
       }
       if (!(this.peerId).equals(str)) {
          p0.writeString(2, this.peerId);
       }
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(3, this.liveStreamId);
       }
       ClientContent$LiveChatPackageV2 tapplyUsersN = this.applyUsersNumber;
       if (tapplyUsersN != null) {
          p0.writeUInt32(4, tapplyUsersN);
       }
       tapplyUsersN = this.isFriend;
       if (tapplyUsersN != null) {
          p0.writeBool(5, tapplyUsersN);
       }
       tapplyUsersN = this.giftKsCoin;
       if (tapplyUsersN) {
          p0.writeUInt64(6, tapplyUsersN);
       }
       super.writeTo(p0);
       return;
    }
}
