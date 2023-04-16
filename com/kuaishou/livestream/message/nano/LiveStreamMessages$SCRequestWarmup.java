package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCRequestWarmup;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SCRequestWarmup extends MessageNano	// class@001368
{
    public long requestMaxDelayMillis;
    public long time;
    public String url;
    public boolean withSelfParams;
    public static LiveStreamMessages$SCRequestWarmup[] _emptyArray;

    public void LiveStreamMessages$SCRequestWarmup(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCRequestWarmup[] emptyArray(){
       if (LiveStreamMessages$SCRequestWarmup._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCRequestWarmup._emptyArray == null) {
             LiveStreamMessages$SCRequestWarmup[] sCRequestWar = new LiveStreamMessages$SCRequestWarmup[0];
             LiveStreamMessages$SCRequestWarmup._emptyArray = sCRequestWar;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCRequestWarmup._emptyArray;
    }
    public static LiveStreamMessages$SCRequestWarmup parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCRequestWarmup().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCRequestWarmup parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCRequestWarmup(), p0);
    }
    public LiveStreamMessages$SCRequestWarmup clear(){
       this.time = 0;
       this.url = "";
       this.requestMaxDelayMillis = 0;
       this.withSelfParams = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCRequestWarmup ttime = this.time;
       int i1 = 0;
       if (ttime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttime);
       }
       if (!(this.url).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.url);
       }
       ttime = this.requestMaxDelayMillis;
       if (ttime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, ttime);
       }
       ttime = this.withSelfParams;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, ttime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCRequestWarmup mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.withSelfParams = p0.readBool();
                   }
                }else {
                   this.requestMaxDelayMillis = p0.readUInt64();
                }
             }else {
                this.url = p0.readString();
             }
          }else {
             this.time = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$SCRequestWarmup ttime = this.time;
       int i = 0;
       if (ttime - i) {
          p0.writeUInt64(1, ttime);
       }
       if (!(this.url).equals("")) {
          p0.writeString(2, this.url);
       }
       ttime = this.requestMaxDelayMillis;
       if (ttime - i) {
          p0.writeUInt64(3, ttime);
       }
       ttime = this.withSelfParams;
       if (ttime != null) {
          p0.writeBool(4, ttime);
       }
       super.writeTo(p0);
       return;
    }
}
