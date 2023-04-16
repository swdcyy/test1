package com.kuaishou.protobuf.livestream.nano.LiveMultiContinuousWinInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveMultiContinuousWinInfo extends MessageNano	// class@000cad
{
    public int continuousWinCount;
    public String continuousWinRouteUrl;
    public static LiveMultiContinuousWinInfo[] _emptyArray;

    public void LiveMultiContinuousWinInfo(){
       super();
       this.clear();
    }
    public static LiveMultiContinuousWinInfo[] emptyArray(){
       if (LiveMultiContinuousWinInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveMultiContinuousWinInfo._emptyArray == null) {
             LiveMultiContinuousWinInfo[] liveMultiCon = new LiveMultiContinuousWinInfo[0];
             LiveMultiContinuousWinInfo._emptyArray = liveMultiCon;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveMultiContinuousWinInfo._emptyArray;
    }
    public static LiveMultiContinuousWinInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveMultiContinuousWinInfo().mergeFrom(p0);
    }
    public static LiveMultiContinuousWinInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveMultiContinuousWinInfo(), p0);
    }
    public LiveMultiContinuousWinInfo clear(){
       this.continuousWinCount = 0;
       this.continuousWinRouteUrl = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveMultiContinuousWinInfo tcontinuousW = this.continuousWinCount;
       if (tcontinuousW != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tcontinuousW);
       }
       if (!(this.continuousWinRouteUrl).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.continuousWinRouteUrl);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveMultiContinuousWinInfo mergeFrom(CodedInputByteBufferNano p0){
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
                this.continuousWinRouteUrl = p0.readString();
             }
          }else {
             this.continuousWinCount = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveMultiContinuousWinInfo tcontinuousW = this.continuousWinCount;
       if (tcontinuousW != null) {
          p0.writeUInt32(1, tcontinuousW);
       }
       if (!(this.continuousWinRouteUrl).equals("")) {
          p0.writeString(2, this.continuousWinRouteUrl);
       }
       super.writeTo(p0);
       return;
    }
}
