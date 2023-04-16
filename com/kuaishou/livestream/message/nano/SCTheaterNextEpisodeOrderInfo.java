package com.kuaishou.livestream.message.nano.SCTheaterNextEpisodeOrderInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.TheaterEpisodeOrderInfo;

public final class SCTheaterNextEpisodeOrderInfo extends MessageNano	// class@00146a
{
    public TheaterEpisodeOrderInfo episodeOrderInfo;
    public String liveStreamId;
    public long photoUrlQueryMaxDelayMillis;
    public int switchType;
    public String theaterId;
    public String uniqueId;
    public String voicePartyId;
    public static SCTheaterNextEpisodeOrderInfo[] _emptyArray;

    public void SCTheaterNextEpisodeOrderInfo(){
       super();
       this.clear();
    }
    public static SCTheaterNextEpisodeOrderInfo[] emptyArray(){
       if (SCTheaterNextEpisodeOrderInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCTheaterNextEpisodeOrderInfo._emptyArray == null) {
             SCTheaterNextEpisodeOrderInfo[] sCTheaterNex = new SCTheaterNextEpisodeOrderInfo[0];
             SCTheaterNextEpisodeOrderInfo._emptyArray = sCTheaterNex;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCTheaterNextEpisodeOrderInfo._emptyArray;
    }
    public static SCTheaterNextEpisodeOrderInfo parseFrom(CodedInputByteBufferNano p0){
       return new SCTheaterNextEpisodeOrderInfo().mergeFrom(p0);
    }
    public static SCTheaterNextEpisodeOrderInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCTheaterNextEpisodeOrderInfo(), p0);
    }
    public SCTheaterNextEpisodeOrderInfo clear(){
       this.liveStreamId = "";
       this.voicePartyId = "";
       this.theaterId = "";
       this.episodeOrderInfo = null;
       this.photoUrlQueryMaxDelayMillis = 0;
       this.switchType = 0;
       this.uniqueId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       if (!(this.voicePartyId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.voicePartyId);
       }
       if (!(this.theaterId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.theaterId);
       }
       SCTheaterNextEpisodeOrderInfo tepisodeOrde = this.episodeOrderInfo;
       if (tepisodeOrde != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, tepisodeOrde);
       }
       SCTheaterNextEpisodeOrderInfo tphotoUrlQue = this.photoUrlQueryMaxDelayMillis;
       if (tphotoUrlQue) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tphotoUrlQue);
       }
       tepisodeOrde = this.switchType;
       if (tepisodeOrde != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, tepisodeOrde);
       }
       if (!(this.uniqueId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.uniqueId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCTheaterNextEpisodeOrderInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 40) {
                         if (i != 48) {
                            if (i != 58) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.uniqueId = p0.readString();
                            }
                         }else {
                            i = p0.readInt32();
                            if (i && (i != 1 && i != 2)) {
                               continue ;
                            }else {
                               this.switchType = i;
                            }
                         }
                      }else {
                         this.photoUrlQueryMaxDelayMillis = p0.readUInt64();
                      }
                   }else if(this.episodeOrderInfo == null){
                      this.episodeOrderInfo = new TheaterEpisodeOrderInfo();
                   }
                   p0.readMessage(this.episodeOrderInfo);
                }else {
                   this.theaterId = p0.readString();
                }
             }else {
                this.voicePartyId = p0.readString();
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
       if (!(this.voicePartyId).equals(str)) {
          p0.writeString(2, this.voicePartyId);
       }
       if (!(this.theaterId).equals(str)) {
          p0.writeString(3, this.theaterId);
       }
       SCTheaterNextEpisodeOrderInfo tepisodeOrde = this.episodeOrderInfo;
       if (tepisodeOrde != null) {
          p0.writeMessage(4, tepisodeOrde);
       }
       SCTheaterNextEpisodeOrderInfo tphotoUrlQue = this.photoUrlQueryMaxDelayMillis;
       if (tphotoUrlQue) {
          p0.writeUInt64(5, tphotoUrlQue);
       }
       tepisodeOrde = this.switchType;
       if (tepisodeOrde != null) {
          p0.writeInt32(6, tepisodeOrde);
       }
       if (!(this.uniqueId).equals(str)) {
          p0.writeString(7, this.uniqueId);
       }
       super.writeTo(p0);
       return;
    }
}
