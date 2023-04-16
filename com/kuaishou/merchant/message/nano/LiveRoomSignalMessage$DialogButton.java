package com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$DialogButton;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveRoomSignalMessage$DialogButton extends MessageNano	// class@001c49
{
    public String buttonText;
    public String buttonUrl;
    public static LiveRoomSignalMessage$DialogButton[] _emptyArray;

    public void LiveRoomSignalMessage$DialogButton(){
       super();
       this.clear();
    }
    public static LiveRoomSignalMessage$DialogButton[] emptyArray(){
       if (LiveRoomSignalMessage$DialogButton._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRoomSignalMessage$DialogButton._emptyArray == null) {
             LiveRoomSignalMessage$DialogButton[] uDialogButto = new LiveRoomSignalMessage$DialogButton[0];
             LiveRoomSignalMessage$DialogButton._emptyArray = uDialogButto;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRoomSignalMessage$DialogButton._emptyArray;
    }
    public static LiveRoomSignalMessage$DialogButton parseFrom(CodedInputByteBufferNano p0){
       return new LiveRoomSignalMessage$DialogButton().mergeFrom(p0);
    }
    public static LiveRoomSignalMessage$DialogButton parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRoomSignalMessage$DialogButton(), p0);
    }
    public LiveRoomSignalMessage$DialogButton clear(){
       this.buttonText = "";
       this.buttonUrl = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.buttonText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.buttonText);
       }
       if (!(this.buttonUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.buttonUrl);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRoomSignalMessage$DialogButton mergeFrom(CodedInputByteBufferNano p0){
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
             }else {
                this.buttonUrl = p0.readString();
             }
          }else {
             this.buttonText = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.buttonText).equals(str)) {
          p0.writeString(1, this.buttonText);
       }
       if (!(this.buttonUrl).equals(str)) {
          p0.writeString(2, this.buttonUrl);
       }
       super.writeTo(p0);
       return;
    }
}
