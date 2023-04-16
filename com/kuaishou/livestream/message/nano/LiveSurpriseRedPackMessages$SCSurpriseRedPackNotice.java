package com.kuaishou.livestream.message.nano.LiveSurpriseRedPackMessages$SCSurpriseRedPackNotice;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveSurpriseRedPackMessages$SCSurpriseRedPackNotice extends MessageNano	// class@0013a1
{
    public String id;
    public String liveStreamId;
    public String token;
    public static LiveSurpriseRedPackMessages$SCSurpriseRedPackNotice[] _emptyArray;

    public void LiveSurpriseRedPackMessages$SCSurpriseRedPackNotice(){
       super();
       this.clear();
    }
    public static LiveSurpriseRedPackMessages$SCSurpriseRedPackNotice[] emptyArray(){
       if (LiveSurpriseRedPackMessages$SCSurpriseRedPackNotice._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveSurpriseRedPackMessages$SCSurpriseRedPackNotice._emptyArray == null) {
             LiveSurpriseRedPackMessages$SCSurpriseRedPackNotice[] sCSurpriseRe = new LiveSurpriseRedPackMessages$SCSurpriseRedPackNotice[0];
             LiveSurpriseRedPackMessages$SCSurpriseRedPackNotice._emptyArray = sCSurpriseRe;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveSurpriseRedPackMessages$SCSurpriseRedPackNotice._emptyArray;
    }
    public static LiveSurpriseRedPackMessages$SCSurpriseRedPackNotice parseFrom(CodedInputByteBufferNano p0){
       return new LiveSurpriseRedPackMessages$SCSurpriseRedPackNotice().mergeFrom(p0);
    }
    public static LiveSurpriseRedPackMessages$SCSurpriseRedPackNotice parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveSurpriseRedPackMessages$SCSurpriseRedPackNotice(), p0);
    }
    public LiveSurpriseRedPackMessages$SCSurpriseRedPackNotice clear(){
       this.id = "";
       this.token = "";
       this.liveStreamId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       if (!(this.token).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.token);
       }
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.liveStreamId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveSurpriseRedPackMessages$SCSurpriseRedPackNotice mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.liveStreamId = p0.readString();
                }
             }else {
                this.token = p0.readString();
             }
          }else {
             this.id = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.id).equals(str)) {
          p0.writeString(1, this.id);
       }
       if (!(this.token).equals(str)) {
          p0.writeString(2, this.token);
       }
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(3, this.liveStreamId);
       }
       super.writeTo(p0);
       return;
    }
}
