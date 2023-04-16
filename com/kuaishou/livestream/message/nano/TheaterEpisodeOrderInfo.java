package com.kuaishou.livestream.message.nano.TheaterEpisodeOrderInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.TheaterEpisodeInfo;

public final class TheaterEpisodeOrderInfo extends MessageNano	// class@001478
{
    public TheaterEpisodeInfo episodeInfo;
    public String episodeOrderId;
    public static TheaterEpisodeOrderInfo[] _emptyArray;

    public void TheaterEpisodeOrderInfo(){
       super();
       this.clear();
    }
    public static TheaterEpisodeOrderInfo[] emptyArray(){
       if (TheaterEpisodeOrderInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (TheaterEpisodeOrderInfo._emptyArray == null) {
             TheaterEpisodeOrderInfo[] theaterEpiso = new TheaterEpisodeOrderInfo[0];
             TheaterEpisodeOrderInfo._emptyArray = theaterEpiso;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return TheaterEpisodeOrderInfo._emptyArray;
    }
    public static TheaterEpisodeOrderInfo parseFrom(CodedInputByteBufferNano p0){
       return new TheaterEpisodeOrderInfo().mergeFrom(p0);
    }
    public static TheaterEpisodeOrderInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new TheaterEpisodeOrderInfo(), p0);
    }
    public TheaterEpisodeOrderInfo clear(){
       this.episodeOrderId = "";
       this.episodeInfo = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.episodeOrderId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.episodeOrderId);
       }
       TheaterEpisodeOrderInfo tepisodeInfo = this.episodeInfo;
       if (tepisodeInfo != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tepisodeInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public TheaterEpisodeOrderInfo mergeFrom(CodedInputByteBufferNano p0){
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
             }else if(this.episodeInfo == null){
                this.episodeInfo = new TheaterEpisodeInfo();
             }
             p0.readMessage(this.episodeInfo);
          }else {
             this.episodeOrderId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.episodeOrderId).equals("")) {
          p0.writeString(1, this.episodeOrderId);
       }
       TheaterEpisodeOrderInfo tepisodeInfo = this.episodeInfo;
       if (tepisodeInfo != null) {
          p0.writeMessage(2, tepisodeInfo);
       }
       super.writeTo(p0);
       return;
    }
}
