package com.kuaishou.protobuf.livestream.nano.LiveConditionAudienceRedPackUpdateInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveConditionAudienceRedPackUpdateInfo extends MessageNano	// class@000c5c
{
    public String displayParticipantCount;
    public String liveStreamId;
    public int participantCount;
    public String redPackId;
    public int redPackType;
    public static LiveConditionAudienceRedPackUpdateInfo[] _emptyArray;

    public void LiveConditionAudienceRedPackUpdateInfo(){
       super();
       this.clear();
    }
    public static LiveConditionAudienceRedPackUpdateInfo[] emptyArray(){
       if (LiveConditionAudienceRedPackUpdateInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveConditionAudienceRedPackUpdateInfo._emptyArray == null) {
             LiveConditionAudienceRedPackUpdateInfo[] liveConditio = new LiveConditionAudienceRedPackUpdateInfo[0];
             LiveConditionAudienceRedPackUpdateInfo._emptyArray = liveConditio;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveConditionAudienceRedPackUpdateInfo._emptyArray;
    }
    public static LiveConditionAudienceRedPackUpdateInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveConditionAudienceRedPackUpdateInfo().mergeFrom(p0);
    }
    public static LiveConditionAudienceRedPackUpdateInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveConditionAudienceRedPackUpdateInfo(), p0);
    }
    public LiveConditionAudienceRedPackUpdateInfo clear(){
       this.liveStreamId = "";
       this.redPackType = 0;
       this.redPackId = "";
       this.displayParticipantCount = "";
       this.participantCount = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       LiveConditionAudienceRedPackUpdateInfo tredPackType = this.redPackType;
       if (tredPackType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tredPackType);
       }
       if (!(this.redPackId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.redPackId);
       }
       if (!(this.displayParticipantCount).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.displayParticipantCount);
       }
       tredPackType = this.participantCount;
       if (tredPackType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tredPackType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveConditionAudienceRedPackUpdateInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.participantCount = p0.readInt32();
                      }
                   }else {
                      this.displayParticipantCount = p0.readString();
                   }
                }else {
                   this.redPackId = p0.readString();
                }
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   switch (i){
                       case 11:
                       case 13:
                       case 14:
                       case 15:
                       case 16:
                       case 17:
                       case 18:
                       case 19:
                       case 20:
                       case 21:
                       case 22:
                       case 23:
                       case 24:
                       case 25:
                       case 26:
                       case 27:
                       case 28:
                       case 29:
                       case 30:
                       case 31:
                       case 32:
                       case '!':
                       case '"':
                       case '#':
                       case '$':
                       case '%':
                       case '&':
                       case 39:
                       case '(':
                       case ')':
                       case '*':
                       case '+':
                       case ',':
                       case '-':
                       case '.':
                       case '/':
                       case '0':
                       case 12:
                         break;
                       default:
                   }
                }
                this.redPackType = i;
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
       LiveConditionAudienceRedPackUpdateInfo tredPackType = this.redPackType;
       if (tredPackType != null) {
          p0.writeInt32(2, tredPackType);
       }
       if (!(this.redPackId).equals(str)) {
          p0.writeString(3, this.redPackId);
       }
       if (!(this.displayParticipantCount).equals(str)) {
          p0.writeString(4, this.displayParticipantCount);
       }
       tredPackType = this.participantCount;
       if (tredPackType != null) {
          p0.writeInt32(5, tredPackType);
       }
       super.writeTo(p0);
       return;
    }
}
