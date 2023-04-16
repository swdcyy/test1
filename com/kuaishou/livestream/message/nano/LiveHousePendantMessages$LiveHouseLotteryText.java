package com.kuaishou.livestream.message.nano.LiveHousePendantMessages$LiveHouseLotteryText;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveHousePendantMessages$LiveHouseLotteryText extends MessageNano	// class@0011c7
{
    public String text;
    public int type;
    public static LiveHousePendantMessages$LiveHouseLotteryText[] _emptyArray;

    public void LiveHousePendantMessages$LiveHouseLotteryText(){
       super();
       this.clear();
    }
    public static LiveHousePendantMessages$LiveHouseLotteryText[] emptyArray(){
       if (LiveHousePendantMessages$LiveHouseLotteryText._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveHousePendantMessages$LiveHouseLotteryText._emptyArray == null) {
             LiveHousePendantMessages$LiveHouseLotteryText[] liveHouseLot = new LiveHousePendantMessages$LiveHouseLotteryText[0];
             LiveHousePendantMessages$LiveHouseLotteryText._emptyArray = liveHouseLot;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveHousePendantMessages$LiveHouseLotteryText._emptyArray;
    }
    public static LiveHousePendantMessages$LiveHouseLotteryText parseFrom(CodedInputByteBufferNano p0){
       return new LiveHousePendantMessages$LiveHouseLotteryText().mergeFrom(p0);
    }
    public static LiveHousePendantMessages$LiveHouseLotteryText parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveHousePendantMessages$LiveHouseLotteryText(), p0);
    }
    public LiveHousePendantMessages$LiveHouseLotteryText clear(){
       this.text = "";
       this.type = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.text).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.text);
       }
       LiveHousePendantMessages$LiveHouseLotteryText ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, ttype);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveHousePendantMessages$LiveHouseLotteryText mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.type = p0.readInt32();
             }
          }else {
             this.text = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.text).equals("")) {
          p0.writeString(1, this.text);
       }
       LiveHousePendantMessages$LiveHouseLotteryText ttype = this.type;
       if (ttype != null) {
          p0.writeInt32(2, ttype);
       }
       super.writeTo(p0);
       return;
    }
}
