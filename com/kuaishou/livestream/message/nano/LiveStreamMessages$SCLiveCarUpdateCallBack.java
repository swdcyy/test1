package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveCarUpdateCallBack;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SCLiveCarUpdateCallBack extends MessageNano	// class@00133a
{
    public long requestDelayMs;
    public boolean triggerCallback;
    public String updateParams;
    public static LiveStreamMessages$SCLiveCarUpdateCallBack[] _emptyArray;

    public void LiveStreamMessages$SCLiveCarUpdateCallBack(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCLiveCarUpdateCallBack[] emptyArray(){
       if (LiveStreamMessages$SCLiveCarUpdateCallBack._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCLiveCarUpdateCallBack._emptyArray == null) {
             LiveStreamMessages$SCLiveCarUpdateCallBack[] sCLiveCarUpd = new LiveStreamMessages$SCLiveCarUpdateCallBack[0];
             LiveStreamMessages$SCLiveCarUpdateCallBack._emptyArray = sCLiveCarUpd;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCLiveCarUpdateCallBack._emptyArray;
    }
    public static LiveStreamMessages$SCLiveCarUpdateCallBack parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCLiveCarUpdateCallBack().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCLiveCarUpdateCallBack parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCLiveCarUpdateCallBack(), p0);
    }
    public LiveStreamMessages$SCLiveCarUpdateCallBack clear(){
       this.updateParams = "";
       this.requestDelayMs = 0;
       this.triggerCallback = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.updateParams).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.updateParams);
       }
       LiveStreamMessages$SCLiveCarUpdateCallBack trequestDela = this.requestDelayMs;
       if (trequestDela) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(2, trequestDela);
       }
       trequestDela = this.triggerCallback;
       if (trequestDela != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, trequestDela);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCLiveCarUpdateCallBack mergeFrom(CodedInputByteBufferNano p0){
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
                   this.triggerCallback = p0.readBool();
                }
             }else {
                this.requestDelayMs = p0.readInt64();
             }
          }else {
             this.updateParams = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.updateParams).equals("")) {
          p0.writeString(1, this.updateParams);
       }
       LiveStreamMessages$SCLiveCarUpdateCallBack trequestDela = this.requestDelayMs;
       if (trequestDela) {
          p0.writeInt64(2, trequestDela);
       }
       trequestDela = this.triggerCallback;
       if (trequestDela != null) {
          p0.writeBool(3, trequestDela);
       }
       super.writeTo(p0);
       return;
    }
}
