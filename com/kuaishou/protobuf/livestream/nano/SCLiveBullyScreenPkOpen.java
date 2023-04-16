package com.kuaishou.protobuf.livestream.nano.SCLiveBullyScreenPkOpen;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LivePunishAnimationInfoSource;

public final class SCLiveBullyScreenPkOpen extends MessageNano	// class@000d45
{
    public int bloodHintLimitPercent;
    public long bullyScreenOpenTimestamp;
    public boolean compressedToAudio;
    public String multiPkId;
    public long openAnimationDeadline;
    public LivePunishAnimationInfoSource punishAnimationSource;
    public int videoLimitPercent;
    public static SCLiveBullyScreenPkOpen[] _emptyArray;

    public void SCLiveBullyScreenPkOpen(){
       super();
       this.clear();
    }
    public static SCLiveBullyScreenPkOpen[] emptyArray(){
       if (SCLiveBullyScreenPkOpen._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveBullyScreenPkOpen._emptyArray == null) {
             SCLiveBullyScreenPkOpen[] sCLiveBullyS = new SCLiveBullyScreenPkOpen[0];
             SCLiveBullyScreenPkOpen._emptyArray = sCLiveBullyS;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveBullyScreenPkOpen._emptyArray;
    }
    public static SCLiveBullyScreenPkOpen parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveBullyScreenPkOpen().mergeFrom(p0);
    }
    public static SCLiveBullyScreenPkOpen parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveBullyScreenPkOpen(), p0);
    }
    public SCLiveBullyScreenPkOpen clear(){
       this.multiPkId = "";
       this.punishAnimationSource = null;
       this.bullyScreenOpenTimestamp = 0;
       this.openAnimationDeadline = 0;
       this.compressedToAudio = false;
       this.bloodHintLimitPercent = 0;
       this.videoLimitPercent = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.multiPkId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.multiPkId);
       }
       SCLiveBullyScreenPkOpen tpunishAnima = this.punishAnimationSource;
       if (tpunishAnima != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tpunishAnima);
       }
       tpunishAnima = this.bullyScreenOpenTimestamp;
       int i1 = 0;
       if (tpunishAnima - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tpunishAnima);
       }
       tpunishAnima = this.openAnimationDeadline;
       if (tpunishAnima - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tpunishAnima);
       }
       tpunishAnima = this.compressedToAudio;
       if (tpunishAnima != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(5, tpunishAnima);
       }
       tpunishAnima = this.bloodHintLimitPercent;
       if (tpunishAnima != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, tpunishAnima);
       }
       tpunishAnima = this.videoLimitPercent;
       if (tpunishAnima != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, tpunishAnima);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveBullyScreenPkOpen mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 40) {
                         if (i != 48) {
                            if (i != 56) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.videoLimitPercent = p0.readUInt32();
                            }
                         }else {
                            this.bloodHintLimitPercent = p0.readUInt32();
                         }
                      }else {
                         this.compressedToAudio = p0.readBool();
                      }
                   }else {
                      this.openAnimationDeadline = p0.readUInt64();
                   }
                }else {
                   this.bullyScreenOpenTimestamp = p0.readUInt64();
                }
             }else if(this.punishAnimationSource == null){
                this.punishAnimationSource = new LivePunishAnimationInfoSource();
             }
             p0.readMessage(this.punishAnimationSource);
          }else {
             this.multiPkId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.multiPkId).equals("")) {
          p0.writeString(1, this.multiPkId);
       }
       SCLiveBullyScreenPkOpen tpunishAnima = this.punishAnimationSource;
       if (tpunishAnima != null) {
          p0.writeMessage(2, tpunishAnima);
       }
       tpunishAnima = this.bullyScreenOpenTimestamp;
       int i = 0;
       if (tpunishAnima - i) {
          p0.writeUInt64(3, tpunishAnima);
       }
       tpunishAnima = this.openAnimationDeadline;
       if (tpunishAnima - i) {
          p0.writeUInt64(4, tpunishAnima);
       }
       tpunishAnima = this.compressedToAudio;
       if (tpunishAnima != null) {
          p0.writeBool(5, tpunishAnima);
       }
       tpunishAnima = this.bloodHintLimitPercent;
       if (tpunishAnima != null) {
          p0.writeUInt32(6, tpunishAnima);
       }
       tpunishAnima = this.videoLimitPercent;
       if (tpunishAnima != null) {
          p0.writeUInt32(7, tpunishAnima);
       }
       super.writeTo(p0);
       return;
    }
}
