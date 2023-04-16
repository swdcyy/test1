package com.kuaishou.livestream.message.nano.SCKtvOpened;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCKtvOpened extends MessageNano	// class@0013fa
{
    public boolean disableApplaud;
    public boolean fromEnterRoom;
    public String ktvId;
    public String liveStreamId;
    public String voicePartyId;
    public static SCKtvOpened[] _emptyArray;

    public void SCKtvOpened(){
       super();
       this.clear();
    }
    public static SCKtvOpened[] emptyArray(){
       if (SCKtvOpened._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCKtvOpened._emptyArray == null) {
             SCKtvOpened[] sCKtvOpenedA = new SCKtvOpened[0];
             SCKtvOpened._emptyArray = sCKtvOpenedA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCKtvOpened._emptyArray;
    }
    public static SCKtvOpened parseFrom(CodedInputByteBufferNano p0){
       return new SCKtvOpened().mergeFrom(p0);
    }
    public static SCKtvOpened parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCKtvOpened(), p0);
    }
    public SCKtvOpened clear(){
       this.liveStreamId = "";
       this.voicePartyId = "";
       this.ktvId = "";
       this.disableApplaud = false;
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
       if (!(this.ktvId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.ktvId);
       }
       SCKtvOpened tdisableAppl = this.disableApplaud;
       if (tdisableAppl != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, tdisableAppl);
       }
       tdisableAppl = this.fromEnterRoom;
       if (tdisableAppl != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(5, tdisableAppl);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCKtvOpened mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 32) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.fromEnterRoom = p0.readBool();
                      }
                   }else {
                      this.disableApplaud = p0.readBool();
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
       SCKtvOpened tdisableAppl = this.disableApplaud;
       if (tdisableAppl != null) {
          p0.writeBool(4, tdisableAppl);
       }
       tdisableAppl = this.fromEnterRoom;
       if (tdisableAppl != null) {
          p0.writeBool(5, tdisableAppl);
       }
       super.writeTo(p0);
       return;
    }
}
