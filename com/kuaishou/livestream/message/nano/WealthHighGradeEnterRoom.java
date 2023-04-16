package com.kuaishou.livestream.message.nano.WealthHighGradeEnterRoom;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class WealthHighGradeEnterRoom extends MessageNano	// class@00148a
{
    public String deviceHash;
    public int displayType;
    public LiveAudienceState senderState;
    public UserInfos$UserInfo user;
    public static WealthHighGradeEnterRoom[] _emptyArray;

    public void WealthHighGradeEnterRoom(){
       super();
       this.clear();
    }
    public static WealthHighGradeEnterRoom[] emptyArray(){
       if (WealthHighGradeEnterRoom._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (WealthHighGradeEnterRoom._emptyArray == null) {
             WealthHighGradeEnterRoom[] wealthHighGr = new WealthHighGradeEnterRoom[0];
             WealthHighGradeEnterRoom._emptyArray = wealthHighGr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return WealthHighGradeEnterRoom._emptyArray;
    }
    public static WealthHighGradeEnterRoom parseFrom(CodedInputByteBufferNano p0){
       return new WealthHighGradeEnterRoom().mergeFrom(p0);
    }
    public static WealthHighGradeEnterRoom parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new WealthHighGradeEnterRoom(), p0);
    }
    public WealthHighGradeEnterRoom clear(){
       this.user = null;
       this.senderState = null;
       this.displayType = 0;
       this.deviceHash = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       WealthHighGradeEnterRoom tuser = this.user;
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
       if (!(this.deviceHash).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.deviceHash);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public WealthHighGradeEnterRoom mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.deviceHash = p0.readString();
                   }
                }else {
                   i = p0.readInt32();
                   if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
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
       WealthHighGradeEnterRoom tuser = this.user;
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
       if (!(this.deviceHash).equals("")) {
          p0.writeString(4, this.deviceHash);
       }
       super.writeTo(p0);
       return;
    }
}
