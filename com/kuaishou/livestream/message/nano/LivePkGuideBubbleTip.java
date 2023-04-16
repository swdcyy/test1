package com.kuaishou.livestream.message.nano.LivePkGuideBubbleTip;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LivePkGuideBubbleTip extends MessageNano	// class@001210
{
    public int durationMs;
    public int pkGuideDurationMs;
    public String region;
    public static LivePkGuideBubbleTip[] _emptyArray;

    public void LivePkGuideBubbleTip(){
       super();
       this.clear();
    }
    public static LivePkGuideBubbleTip[] emptyArray(){
       if (LivePkGuideBubbleTip._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePkGuideBubbleTip._emptyArray == null) {
             LivePkGuideBubbleTip[] livePkGuideB = new LivePkGuideBubbleTip[0];
             LivePkGuideBubbleTip._emptyArray = livePkGuideB;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePkGuideBubbleTip._emptyArray;
    }
    public static LivePkGuideBubbleTip parseFrom(CodedInputByteBufferNano p0){
       return new LivePkGuideBubbleTip().mergeFrom(p0);
    }
    public static LivePkGuideBubbleTip parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePkGuideBubbleTip(), p0);
    }
    public LivePkGuideBubbleTip clear(){
       this.region = "";
       this.durationMs = 0;
       this.pkGuideDurationMs = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.region).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.region);
       }
       LivePkGuideBubbleTip tdurationMs = this.durationMs;
       if (tdurationMs != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tdurationMs);
       }
       tdurationMs = this.pkGuideDurationMs;
       if (tdurationMs != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tdurationMs);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePkGuideBubbleTip mergeFrom(CodedInputByteBufferNano p0){
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
                   this.pkGuideDurationMs = p0.readUInt32();
                }
             }else {
                this.durationMs = p0.readUInt32();
             }
          }else {
             this.region = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.region).equals("")) {
          p0.writeString(1, this.region);
       }
       LivePkGuideBubbleTip tdurationMs = this.durationMs;
       if (tdurationMs != null) {
          p0.writeUInt32(2, tdurationMs);
       }
       tdurationMs = this.pkGuideDurationMs;
       if (tdurationMs != null) {
          p0.writeUInt32(3, tdurationMs);
       }
       super.writeTo(p0);
       return;
    }
}
