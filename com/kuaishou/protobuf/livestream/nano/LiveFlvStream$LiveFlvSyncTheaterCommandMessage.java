package com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFlvSyncTheaterCommandMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveFlvStream$LiveFlvSyncTheaterCommandMessage extends MessageNano	// class@000c76
{
    public long currentPosition;
    public String episodeOrderId;
    public boolean hasPlayVolume;
    public float playVolume;
    public int theaterCommandType;
    public String theaterId;
    public static LiveFlvStream$LiveFlvSyncTheaterCommandMessage[] _emptyArray;

    public void LiveFlvStream$LiveFlvSyncTheaterCommandMessage(){
       super();
       this.clear();
    }
    public static LiveFlvStream$LiveFlvSyncTheaterCommandMessage[] emptyArray(){
       if (LiveFlvStream$LiveFlvSyncTheaterCommandMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveFlvStream$LiveFlvSyncTheaterCommandMessage._emptyArray == null) {
             LiveFlvStream$LiveFlvSyncTheaterCommandMessage[] liveFlvSyncT = new LiveFlvStream$LiveFlvSyncTheaterCommandMessage[0];
             LiveFlvStream$LiveFlvSyncTheaterCommandMessage._emptyArray = liveFlvSyncT;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveFlvStream$LiveFlvSyncTheaterCommandMessage._emptyArray;
    }
    public static LiveFlvStream$LiveFlvSyncTheaterCommandMessage parseFrom(CodedInputByteBufferNano p0){
       return new LiveFlvStream$LiveFlvSyncTheaterCommandMessage().mergeFrom(p0);
    }
    public static LiveFlvStream$LiveFlvSyncTheaterCommandMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveFlvStream$LiveFlvSyncTheaterCommandMessage(), p0);
    }
    public LiveFlvStream$LiveFlvSyncTheaterCommandMessage clear(){
       this.theaterId = "";
       this.episodeOrderId = "";
       this.theaterCommandType = 0;
       this.currentPosition = 0;
       this.playVolume = 0;
       this.hasPlayVolume = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveFlvStream$LiveFlvSyncTheaterCommandMessage ttheaterComm = this.theaterCommandType;
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
       if (Float.floatToIntBits(this.playVolume) != Float.floatToIntBits(0)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(5, this.playVolume);
       }
       ttheaterComm = this.hasPlayVolume;
       if (ttheaterComm != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(6, ttheaterComm);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveFlvStream$LiveFlvSyncTheaterCommandMessage mergeFrom(CodedInputByteBufferNano p0){
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
       LiveFlvStream$LiveFlvSyncTheaterCommandMessage ttheaterComm = this.theaterCommandType;
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
       if (Float.floatToIntBits(this.playVolume) != Float.floatToIntBits(0)) {
          p0.writeFloat(5, this.playVolume);
       }
       ttheaterComm = this.hasPlayVolume;
       if (ttheaterComm != null) {
          p0.writeBool(6, ttheaterComm);
       }
       super.writeTo(p0);
       return;
    }
}
