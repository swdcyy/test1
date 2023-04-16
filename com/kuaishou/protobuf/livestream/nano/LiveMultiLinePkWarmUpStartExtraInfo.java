package com.kuaishou.protobuf.livestream.nano.LiveMultiLinePkWarmUpStartExtraInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveMultiLinePkWarmUpStartExtraInfo extends MessageNano	// class@000cb7
{
    public long warmUpEndDeadline;
    public long warmUpEndNotifyDeadline;
    public String warmUpToast;
    public int warmUpToastDuration;
    public static LiveMultiLinePkWarmUpStartExtraInfo[] _emptyArray;

    public void LiveMultiLinePkWarmUpStartExtraInfo(){
       super();
       this.clear();
    }
    public static LiveMultiLinePkWarmUpStartExtraInfo[] emptyArray(){
       if (LiveMultiLinePkWarmUpStartExtraInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveMultiLinePkWarmUpStartExtraInfo._emptyArray == null) {
             LiveMultiLinePkWarmUpStartExtraInfo[] liveMultiLin = new LiveMultiLinePkWarmUpStartExtraInfo[0];
             LiveMultiLinePkWarmUpStartExtraInfo._emptyArray = liveMultiLin;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveMultiLinePkWarmUpStartExtraInfo._emptyArray;
    }
    public static LiveMultiLinePkWarmUpStartExtraInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveMultiLinePkWarmUpStartExtraInfo().mergeFrom(p0);
    }
    public static LiveMultiLinePkWarmUpStartExtraInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveMultiLinePkWarmUpStartExtraInfo(), p0);
    }
    public LiveMultiLinePkWarmUpStartExtraInfo clear(){
       this.warmUpToast = "";
       this.warmUpToastDuration = 0;
       this.warmUpEndDeadline = 0;
       this.warmUpEndNotifyDeadline = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.warmUpToast).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.warmUpToast);
       }
       LiveMultiLinePkWarmUpStartExtraInfo twarmUpToast = this.warmUpToastDuration;
       if (twarmUpToast != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, twarmUpToast);
       }
       twarmUpToast = this.warmUpEndDeadline;
       int i1 = 0;
       if (twarmUpToast - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, twarmUpToast);
       }
       twarmUpToast = this.warmUpEndNotifyDeadline;
       if (twarmUpToast - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, twarmUpToast);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveMultiLinePkWarmUpStartExtraInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.warmUpEndNotifyDeadline = p0.readUInt64();
                   }
                }else {
                   this.warmUpEndDeadline = p0.readUInt64();
                }
             }else {
                this.warmUpToastDuration = p0.readUInt32();
             }
          }else {
             this.warmUpToast = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.warmUpToast).equals("")) {
          p0.writeString(1, this.warmUpToast);
       }
       LiveMultiLinePkWarmUpStartExtraInfo twarmUpToast = this.warmUpToastDuration;
       if (twarmUpToast != null) {
          p0.writeUInt32(2, twarmUpToast);
       }
       twarmUpToast = this.warmUpEndDeadline;
       int i = 0;
       if (twarmUpToast - i) {
          p0.writeUInt64(3, twarmUpToast);
       }
       twarmUpToast = this.warmUpEndNotifyDeadline;
       if (twarmUpToast - i) {
          p0.writeUInt64(4, twarmUpToast);
       }
       super.writeTo(p0);
       return;
    }
}
