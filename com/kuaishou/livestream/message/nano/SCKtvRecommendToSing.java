package com.kuaishou.livestream.message.nano.SCKtvRecommendToSing;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCKtvRecommendToSing extends MessageNano	// class@0013fb
{
    public String feedContent;
    public String id;
    public String ktvId;
    public String liveStreamId;
    public String musicIdStr;
    public int musicType;
    public String voicePartyId;
    public static SCKtvRecommendToSing[] _emptyArray;

    public void SCKtvRecommendToSing(){
       super();
       this.clear();
    }
    public static SCKtvRecommendToSing[] emptyArray(){
       if (SCKtvRecommendToSing._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCKtvRecommendToSing._emptyArray == null) {
             SCKtvRecommendToSing[] sCKtvRecomme = new SCKtvRecommendToSing[0];
             SCKtvRecommendToSing._emptyArray = sCKtvRecomme;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCKtvRecommendToSing._emptyArray;
    }
    public static SCKtvRecommendToSing parseFrom(CodedInputByteBufferNano p0){
       return new SCKtvRecommendToSing().mergeFrom(p0);
    }
    public static SCKtvRecommendToSing parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCKtvRecommendToSing(), p0);
    }
    public SCKtvRecommendToSing clear(){
       this.liveStreamId = "";
       this.voicePartyId = "";
       this.ktvId = "";
       this.musicIdStr = "";
       this.musicType = 0;
       this.feedContent = "";
       this.id = "";
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
       if (!(this.ktvId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.ktvId);
       }
       if (!(this.musicIdStr).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.musicIdStr);
       }
       SCKtvRecommendToSing tmusicType = this.musicType;
       if (tmusicType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tmusicType);
       }
       if (!(this.feedContent).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.feedContent);
       }
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.id);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCKtvRecommendToSing mergeFrom(CodedInputByteBufferNano p0){
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
                         if (i != 50) {
                            if (i != 58) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.id = p0.readString();
                            }
                         }else {
                            this.feedContent = p0.readString();
                         }
                      }else {
                         i = p0.readInt32();
                         switch (i){
                             case 0:
                             case 2:
                             case 3:
                             case 4:
                             case 5:
                             case 6:
                             case 7:
                             case 8:
                             case 9:
                             case 10:
                             case 11:
                             case 1:
                               break;
                             default:
                         }
                         this.musicType = i;
                      }
                   }else {
                      this.musicIdStr = p0.readString();
                   }
                }else {
                   this.ktvId = p0.readString();
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
       if (!(this.ktvId).equals(str)) {
          p0.writeString(3, this.ktvId);
       }
       if (!(this.musicIdStr).equals(str)) {
          p0.writeString(4, this.musicIdStr);
       }
       SCKtvRecommendToSing tmusicType = this.musicType;
       if (tmusicType != null) {
          p0.writeInt32(5, tmusicType);
       }
       if (!(this.feedContent).equals(str)) {
          p0.writeString(6, this.feedContent);
       }
       if (!(this.id).equals(str)) {
          p0.writeString(7, this.id);
       }
       super.writeTo(p0);
       return;
    }
}
