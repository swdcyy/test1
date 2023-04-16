package com.kuaishou.protobuf.livestream.nano.LiveKlinkProcessCondition;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveKlinkProcessCondition extends MessageNano	// class@000ca0
{
    public String enableProcessLiveStreamId;
    public static LiveKlinkProcessCondition[] _emptyArray;

    public void LiveKlinkProcessCondition(){
       super();
       this.clear();
    }
    public static LiveKlinkProcessCondition[] emptyArray(){
       if (LiveKlinkProcessCondition._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveKlinkProcessCondition._emptyArray == null) {
             LiveKlinkProcessCondition[] liveKlinkPro = new LiveKlinkProcessCondition[0];
             LiveKlinkProcessCondition._emptyArray = liveKlinkPro;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveKlinkProcessCondition._emptyArray;
    }
    public static LiveKlinkProcessCondition parseFrom(CodedInputByteBufferNano p0){
       return new LiveKlinkProcessCondition().mergeFrom(p0);
    }
    public static LiveKlinkProcessCondition parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveKlinkProcessCondition(), p0);
    }
    public LiveKlinkProcessCondition clear(){
       this.enableProcessLiveStreamId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.enableProcessLiveStreamId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.enableProcessLiveStreamId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveKlinkProcessCondition mergeFrom(CodedInputByteBufferNano p0){
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
             this.enableProcessLiveStreamId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.enableProcessLiveStreamId).equals("")) {
          p0.writeString(1, this.enableProcessLiveStreamId);
       }
       super.writeTo(p0);
       return;
    }
}
