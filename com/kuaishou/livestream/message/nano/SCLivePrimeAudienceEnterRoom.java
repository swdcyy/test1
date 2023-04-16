package com.kuaishou.livestream.message.nano.SCLivePrimeAudienceEnterRoom;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class SCLivePrimeAudienceEnterRoom extends MessageNano	// class@001436
{
    public LiveAudienceState senderState;
    public UserInfos$UserInfo user;
    public static SCLivePrimeAudienceEnterRoom[] _emptyArray;

    public void SCLivePrimeAudienceEnterRoom(){
       super();
       this.clear();
    }
    public static SCLivePrimeAudienceEnterRoom[] emptyArray(){
       if (SCLivePrimeAudienceEnterRoom._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLivePrimeAudienceEnterRoom._emptyArray == null) {
             SCLivePrimeAudienceEnterRoom[] sCLivePrimeA = new SCLivePrimeAudienceEnterRoom[0];
             SCLivePrimeAudienceEnterRoom._emptyArray = sCLivePrimeA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLivePrimeAudienceEnterRoom._emptyArray;
    }
    public static SCLivePrimeAudienceEnterRoom parseFrom(CodedInputByteBufferNano p0){
       return new SCLivePrimeAudienceEnterRoom().mergeFrom(p0);
    }
    public static SCLivePrimeAudienceEnterRoom parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLivePrimeAudienceEnterRoom(), p0);
    }
    public SCLivePrimeAudienceEnterRoom clear(){
       this.user = null;
       this.senderState = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCLivePrimeAudienceEnterRoom tuser = this.user;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tuser);
       }
       tuser = this.senderState;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tuser);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLivePrimeAudienceEnterRoom mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
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
       SCLivePrimeAudienceEnterRoom tuser = this.user;
       if (tuser != null) {
          p0.writeMessage(1, tuser);
       }
       tuser = this.senderState;
       if (tuser != null) {
          p0.writeMessage(2, tuser);
       }
       super.writeTo(p0);
       return;
    }
}
