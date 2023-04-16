package com.kuaishou.protobuf.livestream.nano.LiveAryaBroadcastProto$LiveAryaBroadcastTheaterCommandMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveAryaBroadcastProto$LiveAryaBroadcastTheaterCommandMessage extends MessageNano	// class@000c38
{
    public float captureVolume;
    public long currentPosition;
    public String episodeOrderId;
    public boolean hasCaptureVolume;
    public boolean hasPlayVolume;
    public float playVolume;
    public int theaterCommandType;
    public String theaterId;
    public static LiveAryaBroadcastProto$LiveAryaBroadcastTheaterCommandMessage[] _emptyArray;

    public void LiveAryaBroadcastProto$LiveAryaBroadcastTheaterCommandMessage(){
       super();
       this.clear();
    }
    public static LiveAryaBroadcastProto$LiveAryaBroadcastTheaterCommandMessage[] emptyArray(){
       if (LiveAryaBroadcastProto$LiveAryaBroadcastTheaterCommandMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveAryaBroadcastProto$LiveAryaBroadcastTheaterCommandMessage._emptyArray == null) {
             LiveAryaBroadcastProto$LiveAryaBroadcastTheaterCommandMessage[] liveAryaBroa = new LiveAryaBroadcastProto$LiveAryaBroadcastTheaterCommandMessage[0];
             LiveAryaBroadcastProto$LiveAryaBroadcastTheaterCommandMessage._emptyArray = liveAryaBroa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveAryaBroadcastProto$LiveAryaBroadcastTheaterCommandMessage._emptyArray;
    }
    public static LiveAryaBroadcastProto$LiveAryaBroadcastTheaterCommandMessage parseFrom(CodedInputByteBufferNano p0){
       return new LiveAryaBroadcastProto$LiveAryaBroadcastTheaterCommandMessage().mergeFrom(p0);
    }
    public static LiveAryaBroadcastProto$LiveAryaBroadcastTheaterCommandMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveAryaBroadcastProto$LiveAryaBroadcastTheaterCommandMessage(), p0);
    }
    public LiveAryaBroadcastProto$LiveAryaBroadcastTheaterCommandMessage clear(){
       this.theaterId = "";
       this.episodeOrderId = "";
       this.theaterCommandType = 0;
       this.currentPosition = 0;
       this.captureVolume = 0;
       this.hasCaptureVolume = false;
       this.playVolume = 0;
       this.hasPlayVolume = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveAryaBroadcastProto$LiveAryaBroadcastTheaterCommandMessage ttheaterComm = this.theaterCommandType;
       if (ttheaterComm != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ttheaterComm);
       }
       String str = "";
       if (!(this.theaterId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.theaterId);
       }
       if (!(this.episodeOrderId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.episodeOrderId);
       }
       ttheaterComm = this.currentPosition;
       if (ttheaterComm) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, ttheaterComm);
       }
       float f = 0;
       if (Float.floatToIntBits(this.captureVolume) != Float.floatToIntBits(f)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(5, this.captureVolume);
       }
       ttheaterComm = this.hasCaptureVolume;
       if (ttheaterComm != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(6, ttheaterComm);
       }
       if (Float.floatToIntBits(this.playVolume) != Float.floatToIntBits(f)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(7, this.playVolume);
       }
       ttheaterComm = this.hasPlayVolume;
       if (ttheaterComm != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(8, ttheaterComm);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveAryaBroadcastProto$LiveAryaBroadcastTheaterCommandMessage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 32) {
                      if (i != 45) {
                         if (i != 48) {
                            if (i != 61) {
                               if (i != 64) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
                                  }
                               }else {
                                  this.hasPlayVolume = p0.readBool();
                               }
                            }else {
                               this.playVolume = p0.readFloat();
                            }
                         }else {
                            this.hasCaptureVolume = p0.readBool();
                         }
                      }else {
                         this.captureVolume = p0.readFloat();
                      }
                   }else {
                      this.currentPosition = p0.readUInt64();
                   }
                }else {
                   this.episodeOrderId = p0.readString();
                }
             }else {
                this.theaterId = p0.readString();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && (i != 2 && i != 3))) {
                continue ;
             }else {
                this.theaterCommandType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveAryaBroadcastProto$LiveAryaBroadcastTheaterCommandMessage ttheaterComm = this.theaterCommandType;
       if (ttheaterComm != null) {
          p0.writeInt32(1, ttheaterComm);
       }
       String str = "";
       if (!(this.theaterId).equals(str)) {
          p0.writeString(2, this.theaterId);
       }
       if (!(this.episodeOrderId).equals(str)) {
          p0.writeString(3, this.episodeOrderId);
       }
       ttheaterComm = this.currentPosition;
       if (ttheaterComm) {
          p0.writeUInt64(4, ttheaterComm);
       }
       float f = 0;
       if (Float.floatToIntBits(this.captureVolume) != Float.floatToIntBits(f)) {
          p0.writeFloat(5, this.captureVolume);
       }
       ttheaterComm = this.hasCaptureVolume;
       if (ttheaterComm != null) {
          p0.writeBool(6, ttheaterComm);
       }
       if (Float.floatToIntBits(this.playVolume) != Float.floatToIntBits(f)) {
          p0.writeFloat(7, this.playVolume);
       }
       ttheaterComm = this.hasPlayVolume;
       if (ttheaterComm != null) {
          p0.writeBool(8, ttheaterComm);
       }
       super.writeTo(p0);
       return;
    }
}
