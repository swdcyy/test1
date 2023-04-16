package com.kuaishou.livestream.message.nano.LiveBlindDateSignalMessages$SCLiveBlindDateTryUpdateAudiencePendant;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveBlindDateSignalMessages$SCLiveBlindDateTryUpdateAudiencePendant extends MessageNano	// class@00111d
{
    public String bizId;
    public boolean delayRefresh;
    public String extraInfo;
    public String highlightDescription;
    public String liveStreamId;
    public long maxDelayMillis;
    public int version;
    public static LiveBlindDateSignalMessages$SCLiveBlindDateTryUpdateAudiencePendant[] _emptyArray;

    public void LiveBlindDateSignalMessages$SCLiveBlindDateTryUpdateAudiencePendant(){
       super();
       this.clear();
    }
    public static LiveBlindDateSignalMessages$SCLiveBlindDateTryUpdateAudiencePendant[] emptyArray(){
       if (LiveBlindDateSignalMessages$SCLiveBlindDateTryUpdateAudiencePendant._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveBlindDateSignalMessages$SCLiveBlindDateTryUpdateAudiencePendant._emptyArray == null) {
             LiveBlindDateSignalMessages$SCLiveBlindDateTryUpdateAudiencePendant[] sCLiveBlindD = new LiveBlindDateSignalMessages$SCLiveBlindDateTryUpdateAudiencePendant[0];
             LiveBlindDateSignalMessages$SCLiveBlindDateTryUpdateAudiencePendant._emptyArray = sCLiveBlindD;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveBlindDateSignalMessages$SCLiveBlindDateTryUpdateAudiencePendant._emptyArray;
    }
    public static LiveBlindDateSignalMessages$SCLiveBlindDateTryUpdateAudiencePendant parseFrom(CodedInputByteBufferNano p0){
       return new LiveBlindDateSignalMessages$SCLiveBlindDateTryUpdateAudiencePendant().mergeFrom(p0);
    }
    public static LiveBlindDateSignalMessages$SCLiveBlindDateTryUpdateAudiencePendant parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveBlindDateSignalMessages$SCLiveBlindDateTryUpdateAudiencePendant(), p0);
    }
    public LiveBlindDateSignalMessages$SCLiveBlindDateTryUpdateAudiencePendant clear(){
       this.liveStreamId = "";
       this.highlightDescription = "";
       this.delayRefresh = false;
       this.maxDelayMillis = 0;
       this.bizId = "";
       this.extraInfo = "";
       this.version = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       if (!(this.highlightDescription).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.highlightDescription);
       }
       LiveBlindDateSignalMessages$SCLiveBlindDateTryUpdateAudiencePendant tdelayRefres = this.delayRefresh;
       if (tdelayRefres != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, tdelayRefres);
       }
       LiveBlindDateSignalMessages$SCLiveBlindDateTryUpdateAudiencePendant tmaxDelayMil = this.maxDelayMillis;
       if (tmaxDelayMil) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tmaxDelayMil);
       }
       if (!(this.bizId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.bizId);
       }
       if (!(this.extraInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.extraInfo);
       }
       tdelayRefres = this.version;
       if (tdelayRefres != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, tdelayRefres);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveBlindDateSignalMessages$SCLiveBlindDateTryUpdateAudiencePendant mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 42) {
                         if (i != 50) {
                            if (i != 56) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.version = p0.readUInt32();
                            }
                         }else {
                            this.extraInfo = p0.readString();
                         }
                      }else {
                         this.bizId = p0.readString();
                      }
                   }else {
                      this.maxDelayMillis = p0.readUInt64();
                   }
                }else {
                   this.delayRefresh = p0.readBool();
                }
             }else {
                this.highlightDescription = p0.readString();
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
       if (!(this.highlightDescription).equals(str)) {
          p0.writeString(2, this.highlightDescription);
       }
       LiveBlindDateSignalMessages$SCLiveBlindDateTryUpdateAudiencePendant tdelayRefres = this.delayRefresh;
       if (tdelayRefres != null) {
          p0.writeBool(3, tdelayRefres);
       }
       LiveBlindDateSignalMessages$SCLiveBlindDateTryUpdateAudiencePendant tmaxDelayMil = this.maxDelayMillis;
       if (tmaxDelayMil) {
          p0.writeUInt64(4, tmaxDelayMil);
       }
       if (!(this.bizId).equals(str)) {
          p0.writeString(5, this.bizId);
       }
       if (!(this.extraInfo).equals(str)) {
          p0.writeString(6, this.extraInfo);
       }
       tdelayRefres = this.version;
       if (tdelayRefres != null) {
          p0.writeUInt32(7, tdelayRefres);
       }
       super.writeTo(p0);
       return;
    }
}
