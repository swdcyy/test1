package com.kuaishou.livestream.message.nano.LiveLineChatMessages$SCLiveLineChatMatched;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveLineChatMessages$SCLiveLineChatMatched extends MessageNano	// class@0011e1
{
    public String aryaConfig;
    public String lineChatId;
    public String liveStreamId;
    public static LiveLineChatMessages$SCLiveLineChatMatched[] _emptyArray;

    public void LiveLineChatMessages$SCLiveLineChatMatched(){
       super();
       this.clear();
    }
    public static LiveLineChatMessages$SCLiveLineChatMatched[] emptyArray(){
       if (LiveLineChatMessages$SCLiveLineChatMatched._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveLineChatMessages$SCLiveLineChatMatched._emptyArray == null) {
             LiveLineChatMessages$SCLiveLineChatMatched[] sCLiveLineCh = new LiveLineChatMessages$SCLiveLineChatMatched[0];
             LiveLineChatMessages$SCLiveLineChatMatched._emptyArray = sCLiveLineCh;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveLineChatMessages$SCLiveLineChatMatched._emptyArray;
    }
    public static LiveLineChatMessages$SCLiveLineChatMatched parseFrom(CodedInputByteBufferNano p0){
       return new LiveLineChatMessages$SCLiveLineChatMatched().mergeFrom(p0);
    }
    public static LiveLineChatMessages$SCLiveLineChatMatched parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveLineChatMessages$SCLiveLineChatMatched(), p0);
    }
    public LiveLineChatMessages$SCLiveLineChatMatched clear(){
       this.lineChatId = "";
       this.aryaConfig = "";
       this.liveStreamId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.lineChatId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.lineChatId);
       }
       if (!(this.aryaConfig).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.aryaConfig);
       }
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.liveStreamId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveLineChatMessages$SCLiveLineChatMatched mergeFrom(CodedInputByteBufferNano p0){
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
                this.aryaConfig = p0.readString();
             }
          }else {
             this.lineChatId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.lineChatId).equals(str)) {
          p0.writeString(1, this.lineChatId);
       }
       if (!(this.aryaConfig).equals(str)) {
          p0.writeString(2, this.aryaConfig);
       }
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(3, this.liveStreamId);
       }
       super.writeTo(p0);
       return;
    }
}
