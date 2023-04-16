package com.kuaishou.livestream.message.nano.LiveHousePendantMessages$LiveHouseLotteryRule;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveHousePendantMessages$LiveHouseLotteryRule extends MessageNano	// class@0011c6
{
    public String text;
    public String url;
    public static LiveHousePendantMessages$LiveHouseLotteryRule[] _emptyArray;

    public void LiveHousePendantMessages$LiveHouseLotteryRule(){
       super();
       this.clear();
    }
    public static LiveHousePendantMessages$LiveHouseLotteryRule[] emptyArray(){
       if (LiveHousePendantMessages$LiveHouseLotteryRule._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveHousePendantMessages$LiveHouseLotteryRule._emptyArray == null) {
             LiveHousePendantMessages$LiveHouseLotteryRule[] liveHouseLot = new LiveHousePendantMessages$LiveHouseLotteryRule[0];
             LiveHousePendantMessages$LiveHouseLotteryRule._emptyArray = liveHouseLot;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveHousePendantMessages$LiveHouseLotteryRule._emptyArray;
    }
    public static LiveHousePendantMessages$LiveHouseLotteryRule parseFrom(CodedInputByteBufferNano p0){
       return new LiveHousePendantMessages$LiveHouseLotteryRule().mergeFrom(p0);
    }
    public static LiveHousePendantMessages$LiveHouseLotteryRule parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveHousePendantMessages$LiveHouseLotteryRule(), p0);
    }
    public LiveHousePendantMessages$LiveHouseLotteryRule clear(){
       this.text = "";
       this.url = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.text).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.text);
       }
       if (!(this.url).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.url);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveHousePendantMessages$LiveHouseLotteryRule mergeFrom(CodedInputByteBufferNano p0){
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
                this.url = p0.readString();
             }
          }else {
             this.text = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.text).equals(str)) {
          p0.writeString(1, this.text);
       }
       if (!(this.url).equals(str)) {
          p0.writeString(2, this.url);
       }
       super.writeTo(p0);
       return;
    }
}
