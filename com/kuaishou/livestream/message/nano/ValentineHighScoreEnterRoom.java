package com.kuaishou.livestream.message.nano.ValentineHighScoreEnterRoom;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class ValentineHighScoreEnterRoom extends MessageNano	// class@001482
{
    public int displayType;
    public LiveAudienceState senderState;
    public UserInfos$UserInfo user;
    public static ValentineHighScoreEnterRoom[] _emptyArray;

    public void ValentineHighScoreEnterRoom(){
       super();
       this.clear();
    }
    public static ValentineHighScoreEnterRoom[] emptyArray(){
       if (ValentineHighScoreEnterRoom._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ValentineHighScoreEnterRoom._emptyArray == null) {
             ValentineHighScoreEnterRoom[] valentineHig = new ValentineHighScoreEnterRoom[0];
             ValentineHighScoreEnterRoom._emptyArray = valentineHig;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ValentineHighScoreEnterRoom._emptyArray;
    }
    public static ValentineHighScoreEnterRoom parseFrom(CodedInputByteBufferNano p0){
       return new ValentineHighScoreEnterRoom().mergeFrom(p0);
    }
    public static ValentineHighScoreEnterRoom parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ValentineHighScoreEnterRoom(), p0);
    }
    public ValentineHighScoreEnterRoom clear(){
       this.user = null;
       this.senderState = null;
       this.displayType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ValentineHighScoreEnterRoom tuser = this.user;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tuser);
       }
       tuser = this.senderState;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tuser);
       }
       tuser = this.displayType;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tuser);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ValentineHighScoreEnterRoom mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   i = p0.readInt32();
                   if (i && (i != 1 && (i != 2 && i != 3))) {
                      continue ;
                   }else {
                      this.displayType = i;
                   }
                }
             }else if(this.senderState == null){
                this.senderState = new LiveAudienceState();
             }
             p0.readMessage(this.senderState);
          }else if(this.user == null){
             this.user = new UserInfos$UserInfo();
          }
          p0.readMessage(this.user);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ValentineHighScoreEnterRoom tuser = this.user;
       if (tuser != null) {
          p0.writeMessage(1, tuser);
       }
       tuser = this.senderState;
       if (tuser != null) {
          p0.writeMessage(2, tuser);
       }
       tuser = this.displayType;
       if (tuser != null) {
          p0.writeInt32(3, tuser);
       }
       super.writeTo(p0);
       return;
    }
}
