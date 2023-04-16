package com.kuaishou.livestream.message.nano.LiveActivityTopRightPendant$SCLiveActivityTopRightPendantClose;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveActivityTopRightPendant$SCLiveActivityTopRightPendantClose extends MessageNano	// class@0010d1
{
    public String pendantId;
    public static LiveActivityTopRightPendant$SCLiveActivityTopRightPendantClose[] _emptyArray;

    public void LiveActivityTopRightPendant$SCLiveActivityTopRightPendantClose(){
       super();
       this.clear();
    }
    public static LiveActivityTopRightPendant$SCLiveActivityTopRightPendantClose[] emptyArray(){
       if (LiveActivityTopRightPendant$SCLiveActivityTopRightPendantClose._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveActivityTopRightPendant$SCLiveActivityTopRightPendantClose._emptyArray == null) {
             LiveActivityTopRightPendant$SCLiveActivityTopRightPendantClose[] sCLiveActivi = new LiveActivityTopRightPendant$SCLiveActivityTopRightPendantClose[0];
             LiveActivityTopRightPendant$SCLiveActivityTopRightPendantClose._emptyArray = sCLiveActivi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveActivityTopRightPendant$SCLiveActivityTopRightPendantClose._emptyArray;
    }
    public static LiveActivityTopRightPendant$SCLiveActivityTopRightPendantClose parseFrom(CodedInputByteBufferNano p0){
       return new LiveActivityTopRightPendant$SCLiveActivityTopRightPendantClose().mergeFrom(p0);
    }
    public static LiveActivityTopRightPendant$SCLiveActivityTopRightPendantClose parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveActivityTopRightPendant$SCLiveActivityTopRightPendantClose(), p0);
    }
    public LiveActivityTopRightPendant$SCLiveActivityTopRightPendantClose clear(){
       this.pendantId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.pendantId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.pendantId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveActivityTopRightPendant$SCLiveActivityTopRightPendantClose mergeFrom(CodedInputByteBufferNano p0){
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
             this.pendantId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.pendantId).equals("")) {
          p0.writeString(1, this.pendantId);
       }
       super.writeTo(p0);
       return;
    }
}
