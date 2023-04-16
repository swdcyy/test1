package com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveChatPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContentWrapper$LiveChatPackage extends MessageNano	// class@00131e
{
    public int applyUsersNumber;
    public long giftKsCoin;
    public boolean isFriend;
    public String liveStreamId;
    public String peerId;
    public String userId;
    public static ClientContentWrapper$LiveChatPackage[] _emptyArray;

    public void ClientContentWrapper$LiveChatPackage(){
       super();
       this.clear();
    }
    public static ClientContentWrapper$LiveChatPackage[] emptyArray(){
       if (ClientContentWrapper$LiveChatPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContentWrapper$LiveChatPackage._emptyArray == null) {
             ClientContentWrapper$LiveChatPackage[] liveChatPack = new ClientContentWrapper$LiveChatPackage[0];
             ClientContentWrapper$LiveChatPackage._emptyArray = liveChatPack;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContentWrapper$LiveChatPackage._emptyArray;
    }
    public static ClientContentWrapper$LiveChatPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContentWrapper$LiveChatPackage().mergeFrom(p0);
    }
    public static ClientContentWrapper$LiveChatPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContentWrapper$LiveChatPackage(), p0);
    }
    public ClientContentWrapper$LiveChatPackage clear(){
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
       ClientContentWrapper$LiveChatPackage tapplyUsersN = this.applyUsersNumber;
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
    public ClientContentWrapper$LiveChatPackage mergeFrom(CodedInputByteBufferNano p0){
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
       ClientContentWrapper$LiveChatPackage tapplyUsersN = this.applyUsersNumber;
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
