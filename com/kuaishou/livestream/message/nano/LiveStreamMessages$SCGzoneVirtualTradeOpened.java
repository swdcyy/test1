package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCGzoneVirtualTradeOpened;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$GzoneVirtualTradeBubble;

public final class LiveStreamMessages$SCGzoneVirtualTradeOpened extends MessageNano	// class@001336
{
    public LiveStreamMessages$GzoneVirtualTradeBubble bubble;
    public long displayMaxDelayMillis;
    public boolean dynamicUrl;
    public String shopUrl;
    public long time;
    public static LiveStreamMessages$SCGzoneVirtualTradeOpened[] _emptyArray;

    public void LiveStreamMessages$SCGzoneVirtualTradeOpened(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCGzoneVirtualTradeOpened[] emptyArray(){
       if (LiveStreamMessages$SCGzoneVirtualTradeOpened._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCGzoneVirtualTradeOpened._emptyArray == null) {
             LiveStreamMessages$SCGzoneVirtualTradeOpened[] sCGzoneVirtu = new LiveStreamMessages$SCGzoneVirtualTradeOpened[0];
             LiveStreamMessages$SCGzoneVirtualTradeOpened._emptyArray = sCGzoneVirtu;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCGzoneVirtualTradeOpened._emptyArray;
    }
    public static LiveStreamMessages$SCGzoneVirtualTradeOpened parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCGzoneVirtualTradeOpened().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCGzoneVirtualTradeOpened parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCGzoneVirtualTradeOpened(), p0);
    }
    public LiveStreamMessages$SCGzoneVirtualTradeOpened clear(){
       this.time = 0;
       this.displayMaxDelayMillis = 0;
       this.shopUrl = "";
       this.dynamicUrl = false;
       this.bubble = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCGzoneVirtualTradeOpened ttime = this.time;
       int i1 = 0;
       if (ttime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttime);
       }
       ttime = this.displayMaxDelayMillis;
       if (ttime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, ttime);
       }
       if (!(this.shopUrl).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.shopUrl);
       }
       ttime = this.dynamicUrl;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, ttime);
       }
       ttime = this.bubble;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(5, ttime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCGzoneVirtualTradeOpened mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 32) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else if(this.bubble == null){
                         this.bubble = new LiveStreamMessages$GzoneVirtualTradeBubble();
                      }
                      p0.readMessage(this.bubble);
                   }else {
                      this.dynamicUrl = p0.readBool();
                   }
                }else {
                   this.shopUrl = p0.readString();
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
       LiveStreamMessages$SCGzoneVirtualTradeOpened ttime = this.time;
       int i = 0;
       if (ttime - i) {
          p0.writeUInt64(1, ttime);
       }
       ttime = this.displayMaxDelayMillis;
       if (ttime - i) {
          p0.writeUInt64(2, ttime);
       }
       if (!(this.shopUrl).equals("")) {
          p0.writeString(3, this.shopUrl);
       }
       ttime = this.dynamicUrl;
       if (ttime != null) {
          p0.writeBool(4, ttime);
       }
       ttime = this.bubble;
       if (ttime != null) {
          p0.writeMessage(5, ttime);
       }
       super.writeTo(p0);
       return;
    }
}
