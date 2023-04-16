package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCShopOpened;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SCShopOpened extends MessageNano	// class@00136b
{
    public long displayMaxDelayMillis;
    public String jumpUrl;
    public long time;
    public static LiveStreamMessages$SCShopOpened[] _emptyArray;

    public void LiveStreamMessages$SCShopOpened(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCShopOpened[] emptyArray(){
       if (LiveStreamMessages$SCShopOpened._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCShopOpened._emptyArray == null) {
             LiveStreamMessages$SCShopOpened[] sCShopOpened = new LiveStreamMessages$SCShopOpened[0];
             LiveStreamMessages$SCShopOpened._emptyArray = sCShopOpened;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCShopOpened._emptyArray;
    }
    public static LiveStreamMessages$SCShopOpened parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCShopOpened().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCShopOpened parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCShopOpened(), p0);
    }
    public LiveStreamMessages$SCShopOpened clear(){
       this.time = 0;
       this.displayMaxDelayMillis = 0;
       this.jumpUrl = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCShopOpened ttime = this.time;
       int i1 = 0;
       if (ttime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttime);
       }
       ttime = this.displayMaxDelayMillis;
       if (ttime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, ttime);
       }
       if (!(this.jumpUrl).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.jumpUrl);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCShopOpened mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.jumpUrl = p0.readString();
                }
             }else {
                this.displayMaxDelayMillis = p0.readUInt64();
             }
          }else {
             this.time = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$SCShopOpened ttime = this.time;
       int i = 0;
       if (ttime - i) {
          p0.writeUInt64(1, ttime);
       }
       ttime = this.displayMaxDelayMillis;
       if (ttime - i) {
          p0.writeUInt64(2, ttime);
       }
       if (!(this.jumpUrl).equals("")) {
          p0.writeString(3, this.jumpUrl);
       }
       super.writeTo(p0);
       return;
    }
}
