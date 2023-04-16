package com.kuaishou.livestream.message.nano.LiveStreamMessages$PkValuesTip;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$PkValuesTip extends MessageNano	// class@00131c
{
    public long displayDurationMs;
    public String tipContent;
    public int tipType;
    public static LiveStreamMessages$PkValuesTip[] _emptyArray;

    public void LiveStreamMessages$PkValuesTip(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$PkValuesTip[] emptyArray(){
       if (LiveStreamMessages$PkValuesTip._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$PkValuesTip._emptyArray == null) {
             LiveStreamMessages$PkValuesTip[] pkValuesTipA = new LiveStreamMessages$PkValuesTip[0];
             LiveStreamMessages$PkValuesTip._emptyArray = pkValuesTipA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$PkValuesTip._emptyArray;
    }
    public static LiveStreamMessages$PkValuesTip parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$PkValuesTip().mergeFrom(p0);
    }
    public static LiveStreamMessages$PkValuesTip parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$PkValuesTip(), p0);
    }
    public LiveStreamMessages$PkValuesTip clear(){
       this.tipContent = "";
       this.tipType = 0;
       this.displayDurationMs = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.tipContent).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.tipContent);
       }
       LiveStreamMessages$PkValuesTip ttipType = this.tipType;
       if (ttipType != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, ttipType);
       }
       ttipType = this.displayDurationMs;
       if (ttipType) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, ttipType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$PkValuesTip mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.displayDurationMs = p0.readUInt64();
                }
             }else {
                this.tipType = p0.readUInt32();
             }
          }else {
             this.tipContent = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.tipContent).equals("")) {
          p0.writeString(1, this.tipContent);
       }
       LiveStreamMessages$PkValuesTip ttipType = this.tipType;
       if (ttipType != null) {
          p0.writeUInt32(2, ttipType);
       }
       ttipType = this.displayDurationMs;
       if (ttipType) {
          p0.writeUInt64(3, ttipType);
       }
       super.writeTo(p0);
       return;
    }
}
