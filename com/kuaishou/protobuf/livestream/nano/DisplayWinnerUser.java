package com.kuaishou.protobuf.livestream.nano.DisplayWinnerUser;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class DisplayWinnerUser extends MessageNano	// class@000c0c
{
    public String extraInfo;
    public UserInfos$UserInfo userInfo;
    public int winKsCoin;
    public static DisplayWinnerUser[] _emptyArray;

    public void DisplayWinnerUser(){
       super();
       this.clear();
    }
    public static DisplayWinnerUser[] emptyArray(){
       if (DisplayWinnerUser._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (DisplayWinnerUser._emptyArray == null) {
             DisplayWinnerUser[] uDisplayWinn = new DisplayWinnerUser[0];
             DisplayWinnerUser._emptyArray = uDisplayWinn;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return DisplayWinnerUser._emptyArray;
    }
    public static DisplayWinnerUser parseFrom(CodedInputByteBufferNano p0){
       return new DisplayWinnerUser().mergeFrom(p0);
    }
    public static DisplayWinnerUser parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new DisplayWinnerUser(), p0);
    }
    public DisplayWinnerUser clear(){
       this.winKsCoin = 0;
       this.userInfo = null;
       this.extraInfo = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       DisplayWinnerUser twinKsCoin = this.winKsCoin;
       if (twinKsCoin != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, twinKsCoin);
       }
       twinKsCoin = this.userInfo;
       if (twinKsCoin != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, twinKsCoin);
       }
       if (!(this.extraInfo).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.extraInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public DisplayWinnerUser mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.extraInfo = p0.readString();
                }
             }else if(this.userInfo == null){
                this.userInfo = new UserInfos$UserInfo();
             }
             p0.readMessage(this.userInfo);
          }else {
             this.winKsCoin = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       DisplayWinnerUser twinKsCoin = this.winKsCoin;
       if (twinKsCoin != null) {
          p0.writeUInt32(1, twinKsCoin);
       }
       twinKsCoin = this.userInfo;
       if (twinKsCoin != null) {
          p0.writeMessage(2, twinKsCoin);
       }
       if (!(this.extraInfo).equals("")) {
          p0.writeString(3, this.extraInfo);
       }
       super.writeTo(p0);
       return;
    }
}
