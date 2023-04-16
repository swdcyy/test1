package com.kuaishou.livestream.message.nano.LiveMagicBoxOpenResultNotice;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveMagicBoxOpenResultNotice extends MessageNano	// class@0011fa
{
    public String buttonText;
    public int giftId;
    public String noticeText;
    public LiveAudienceState senderState;
    public UserInfos$UserInfo user;
    public static LiveMagicBoxOpenResultNotice[] _emptyArray;

    public void LiveMagicBoxOpenResultNotice(){
       super();
       this.clear();
    }
    public static LiveMagicBoxOpenResultNotice[] emptyArray(){
       if (LiveMagicBoxOpenResultNotice._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveMagicBoxOpenResultNotice._emptyArray == null) {
             LiveMagicBoxOpenResultNotice[] liveMagicBox = new LiveMagicBoxOpenResultNotice[0];
             LiveMagicBoxOpenResultNotice._emptyArray = liveMagicBox;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveMagicBoxOpenResultNotice._emptyArray;
    }
    public static LiveMagicBoxOpenResultNotice parseFrom(CodedInputByteBufferNano p0){
       return new LiveMagicBoxOpenResultNotice().mergeFrom(p0);
    }
    public static LiveMagicBoxOpenResultNotice parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveMagicBoxOpenResultNotice(), p0);
    }
    public LiveMagicBoxOpenResultNotice clear(){
       this.user = null;
       this.noticeText = "";
       this.giftId = 0;
       this.buttonText = "";
       this.senderState = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveMagicBoxOpenResultNotice tuser = this.user;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tuser);
       }
       String str = "";
       if (!(this.noticeText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.noticeText);
       }
       tuser = this.giftId;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tuser);
       }
       if (!(this.buttonText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.buttonText);
       }
       tuser = this.senderState;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(5, tuser);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveMagicBoxOpenResultNotice mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else if(this.senderState == null){
                         this.senderState = new LiveAudienceState();
                      }
                      p0.readMessage(this.senderState);
                   }else {
                      this.buttonText = p0.readString();
                   }
                }else {
                   this.giftId = p0.readUInt32();
                }
             }else {
                this.noticeText = p0.readString();
             }
          }else if(this.user == null){
             this.user = new UserInfos$UserInfo();
          }
          p0.readMessage(this.user);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveMagicBoxOpenResultNotice tuser = this.user;
       if (tuser != null) {
          p0.writeMessage(1, tuser);
       }
       String str = "";
       if (!(this.noticeText).equals(str)) {
          p0.writeString(2, this.noticeText);
       }
       tuser = this.giftId;
       if (tuser != null) {
          p0.writeUInt32(3, tuser);
       }
       if (!(this.buttonText).equals(str)) {
          p0.writeString(4, this.buttonText);
       }
       tuser = this.senderState;
       if (tuser != null) {
          p0.writeMessage(5, tuser);
       }
       super.writeTo(p0);
       return;
    }
}
