package com.kuaishou.livestream.message.nano.LivePkMessages$SCPkSignalRoomCreate;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LivePkMessages$SCPkSignalRoomCreate extends MessageNano	// class@001231
{
    public String aryaConfig;
    public static LivePkMessages$SCPkSignalRoomCreate[] _emptyArray;

    public void LivePkMessages$SCPkSignalRoomCreate(){
       super();
       this.clear();
    }
    public static LivePkMessages$SCPkSignalRoomCreate[] emptyArray(){
       if (LivePkMessages$SCPkSignalRoomCreate._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePkMessages$SCPkSignalRoomCreate._emptyArray == null) {
             LivePkMessages$SCPkSignalRoomCreate[] sCPkSignalRo = new LivePkMessages$SCPkSignalRoomCreate[0];
             LivePkMessages$SCPkSignalRoomCreate._emptyArray = sCPkSignalRo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePkMessages$SCPkSignalRoomCreate._emptyArray;
    }
    public static LivePkMessages$SCPkSignalRoomCreate parseFrom(CodedInputByteBufferNano p0){
       return new LivePkMessages$SCPkSignalRoomCreate().mergeFrom(p0);
    }
    public static LivePkMessages$SCPkSignalRoomCreate parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePkMessages$SCPkSignalRoomCreate(), p0);
    }
    public LivePkMessages$SCPkSignalRoomCreate clear(){
       this.aryaConfig = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.aryaConfig).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.aryaConfig);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePkMessages$SCPkSignalRoomCreate mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             this.aryaConfig = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.aryaConfig).equals("")) {
          p0.writeString(1, this.aryaConfig);
       }
       super.writeTo(p0);
       return;
    }
}
