package com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$ItemCurrency;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveRoomSignalMessage$ItemCurrency extends MessageNano	// class@001c4d
{
    public String currencyContent;
    public int currencyPosition;
    public static LiveRoomSignalMessage$ItemCurrency[] _emptyArray;

    public void LiveRoomSignalMessage$ItemCurrency(){
       super();
       this.clear();
    }
    public static LiveRoomSignalMessage$ItemCurrency[] emptyArray(){
       if (LiveRoomSignalMessage$ItemCurrency._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRoomSignalMessage$ItemCurrency._emptyArray == null) {
             LiveRoomSignalMessage$ItemCurrency[] itemCurrency = new LiveRoomSignalMessage$ItemCurrency[0];
             LiveRoomSignalMessage$ItemCurrency._emptyArray = itemCurrency;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRoomSignalMessage$ItemCurrency._emptyArray;
    }
    public static LiveRoomSignalMessage$ItemCurrency parseFrom(CodedInputByteBufferNano p0){
       return new LiveRoomSignalMessage$ItemCurrency().mergeFrom(p0);
    }
    public static LiveRoomSignalMessage$ItemCurrency parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRoomSignalMessage$ItemCurrency(), p0);
    }
    public LiveRoomSignalMessage$ItemCurrency clear(){
       this.currencyPosition = 0;
       this.currencyContent = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveRoomSignalMessage$ItemCurrency tcurrencyPos = this.currencyPosition;
       if (tcurrencyPos != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tcurrencyPos);
       }
       if (!(this.currencyContent).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.currencyContent);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRoomSignalMessage$ItemCurrency mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.currencyContent = p0.readString();
             }
          }else {
             this.currencyPosition = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveRoomSignalMessage$ItemCurrency tcurrencyPos = this.currencyPosition;
       if (tcurrencyPos != null) {
          p0.writeUInt32(1, tcurrencyPos);
       }
       if (!(this.currencyContent).equals("")) {
          p0.writeString(2, this.currencyContent);
       }
       super.writeTo(p0);
       return;
    }
}
