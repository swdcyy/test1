package com.kuaishou.livestream.message.nano.SCTheaterOpened;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCTheaterOpened extends MessageNano	// class@00146b
{
    public boolean fromEnterRoom;
    public String liveStreamId;
    public String theaterId;
    public String voicePartyId;
    public static SCTheaterOpened[] _emptyArray;

    public void SCTheaterOpened(){
       super();
       this.clear();
    }
    public static SCTheaterOpened[] emptyArray(){
       if (SCTheaterOpened._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCTheaterOpened._emptyArray == null) {
             SCTheaterOpened[] sCTheaterOpe = new SCTheaterOpened[0];
             SCTheaterOpened._emptyArray = sCTheaterOpe;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCTheaterOpened._emptyArray;
    }
    public static SCTheaterOpened parseFrom(CodedInputByteBufferNano p0){
       return new SCTheaterOpened().mergeFrom(p0);
    }
    public static SCTheaterOpened parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCTheaterOpened(), p0);
    }
    public SCTheaterOpened clear(){
       this.liveStreamId = "";
       this.voicePartyId = "";
       this.theaterId = "";
       this.fromEnterRoom = false;
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
       SCTheaterOpened tfromEnterRo = this.fromEnterRoom;
       if (tfromEnterRo != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, tfromEnterRo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCTheaterOpened mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.fromEnterRoom = p0.readBool();
                   }
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
       SCTheaterOpened tfromEnterRo = this.fromEnterRoom;
       if (tfromEnterRo != null) {
          p0.writeBool(4, tfromEnterRo);
       }
       super.writeTo(p0);
       return;
    }
}
