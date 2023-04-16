package com.kuaishou.livestream.message.nano.LiveCommonWebViewMessages$SCLiveCommonWebViewDisplay;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveCommonWebViewMessages$SCLiveCommonWebViewDisplay extends MessageNano	// class@00116e
{
    public String link;
    public String liveStreamId;
    public static LiveCommonWebViewMessages$SCLiveCommonWebViewDisplay[] _emptyArray;

    public void LiveCommonWebViewMessages$SCLiveCommonWebViewDisplay(){
       super();
       this.clear();
    }
    public static LiveCommonWebViewMessages$SCLiveCommonWebViewDisplay[] emptyArray(){
       if (LiveCommonWebViewMessages$SCLiveCommonWebViewDisplay._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCommonWebViewMessages$SCLiveCommonWebViewDisplay._emptyArray == null) {
             LiveCommonWebViewMessages$SCLiveCommonWebViewDisplay[] sCLiveCommon = new LiveCommonWebViewMessages$SCLiveCommonWebViewDisplay[0];
             LiveCommonWebViewMessages$SCLiveCommonWebViewDisplay._emptyArray = sCLiveCommon;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCommonWebViewMessages$SCLiveCommonWebViewDisplay._emptyArray;
    }
    public static LiveCommonWebViewMessages$SCLiveCommonWebViewDisplay parseFrom(CodedInputByteBufferNano p0){
       return new LiveCommonWebViewMessages$SCLiveCommonWebViewDisplay().mergeFrom(p0);
    }
    public static LiveCommonWebViewMessages$SCLiveCommonWebViewDisplay parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCommonWebViewMessages$SCLiveCommonWebViewDisplay(), p0);
    }
    public LiveCommonWebViewMessages$SCLiveCommonWebViewDisplay clear(){
       this.liveStreamId = "";
       this.link = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       if (!(this.link).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.link);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCommonWebViewMessages$SCLiveCommonWebViewDisplay mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.link = p0.readString();
             }
          }else {
             this.liveStreamId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(1, this.liveStreamId);
       }
       if (!(this.link).equals(str)) {
          p0.writeString(2, this.link);
       }
       super.writeTo(p0);
       return;
    }
}
