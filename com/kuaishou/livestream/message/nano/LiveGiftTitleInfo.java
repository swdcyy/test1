package com.kuaishou.livestream.message.nano.LiveGiftTitleInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveGiftTitleInfo extends MessageNano	// class@0011bf
{
    public String giftFeedDisplayText;
    public int giftId;
    public UserInfos$UserInfo namingUser;
    public long version;
    public static LiveGiftTitleInfo[] _emptyArray;

    public void LiveGiftTitleInfo(){
       super();
       this.clear();
    }
    public static LiveGiftTitleInfo[] emptyArray(){
       if (LiveGiftTitleInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveGiftTitleInfo._emptyArray == null) {
             LiveGiftTitleInfo[] liveGiftTitl = new LiveGiftTitleInfo[0];
             LiveGiftTitleInfo._emptyArray = liveGiftTitl;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveGiftTitleInfo._emptyArray;
    }
    public static LiveGiftTitleInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveGiftTitleInfo().mergeFrom(p0);
    }
    public static LiveGiftTitleInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveGiftTitleInfo(), p0);
    }
    public LiveGiftTitleInfo clear(){
       this.giftId = 0;
       this.giftFeedDisplayText = "";
       this.namingUser = null;
       this.version = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveGiftTitleInfo tgiftId = this.giftId;
       if (tgiftId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tgiftId);
       }
       if (!(this.giftFeedDisplayText).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.giftFeedDisplayText);
       }
       tgiftId = this.namingUser;
       if (tgiftId != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tgiftId);
       }
       tgiftId = this.version;
       if (tgiftId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tgiftId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveGiftTitleInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.version = p0.readUInt64();
                   }
                }else if(this.namingUser == null){
                   this.namingUser = new UserInfos$UserInfo();
                }
                p0.readMessage(this.namingUser);
             }else {
                this.giftFeedDisplayText = p0.readString();
             }
          }else {
             this.giftId = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveGiftTitleInfo tgiftId = this.giftId;
       if (tgiftId != null) {
          p0.writeUInt32(1, tgiftId);
       }
       if (!(this.giftFeedDisplayText).equals("")) {
          p0.writeString(2, this.giftFeedDisplayText);
       }
       tgiftId = this.namingUser;
       if (tgiftId != null) {
          p0.writeMessage(3, tgiftId);
       }
       tgiftId = this.version;
       if (tgiftId) {
          p0.writeUInt64(4, tgiftId);
       }
       super.writeTo(p0);
       return;
    }
}
