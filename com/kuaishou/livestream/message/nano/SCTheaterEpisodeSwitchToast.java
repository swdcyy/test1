package com.kuaishou.livestream.message.nano.SCTheaterEpisodeSwitchToast;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCTheaterEpisodeSwitchToast extends MessageNano	// class@001469
{
    public String currentPlayingOrderId;
    public String liveStreamId;
    public String theaterId;
    public String toastMessage;
    public String voicePartyId;
    public static SCTheaterEpisodeSwitchToast[] _emptyArray;

    public void SCTheaterEpisodeSwitchToast(){
       super();
       this.clear();
    }
    public static SCTheaterEpisodeSwitchToast[] emptyArray(){
       if (SCTheaterEpisodeSwitchToast._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCTheaterEpisodeSwitchToast._emptyArray == null) {
             SCTheaterEpisodeSwitchToast[] sCTheaterEpi = new SCTheaterEpisodeSwitchToast[0];
             SCTheaterEpisodeSwitchToast._emptyArray = sCTheaterEpi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCTheaterEpisodeSwitchToast._emptyArray;
    }
    public static SCTheaterEpisodeSwitchToast parseFrom(CodedInputByteBufferNano p0){
       return new SCTheaterEpisodeSwitchToast().mergeFrom(p0);
    }
    public static SCTheaterEpisodeSwitchToast parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCTheaterEpisodeSwitchToast(), p0);
    }
    public SCTheaterEpisodeSwitchToast clear(){
       this.liveStreamId = "";
       this.voicePartyId = "";
       this.theaterId = "";
       this.currentPlayingOrderId = "";
       this.toastMessage = "";
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
       if (!(this.currentPlayingOrderId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.currentPlayingOrderId);
       }
       if (!(this.toastMessage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.toastMessage);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCTheaterEpisodeSwitchToast mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.toastMessage = p0.readString();
                      }
                   }else {
                      this.currentPlayingOrderId = p0.readString();
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
       if (!(this.currentPlayingOrderId).equals(str)) {
          p0.writeString(4, this.currentPlayingOrderId);
       }
       if (!(this.toastMessage).equals(str)) {
          p0.writeString(5, this.toastMessage);
       }
       super.writeTo(p0);
       return;
    }
}
