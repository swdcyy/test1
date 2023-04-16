package com.kuaishou.livestream.message.nano.LiveVoicePartyToastFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveVoicePartyToastFeed extends MessageNano	// class@0013d4
{
    public String id;
    public String toastMsg;
    public static LiveVoicePartyToastFeed[] _emptyArray;

    public void LiveVoicePartyToastFeed(){
       super();
       this.clear();
    }
    public static LiveVoicePartyToastFeed[] emptyArray(){
       if (LiveVoicePartyToastFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveVoicePartyToastFeed._emptyArray == null) {
             LiveVoicePartyToastFeed[] liveVoicePar = new LiveVoicePartyToastFeed[0];
             LiveVoicePartyToastFeed._emptyArray = liveVoicePar;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveVoicePartyToastFeed._emptyArray;
    }
    public static LiveVoicePartyToastFeed parseFrom(CodedInputByteBufferNano p0){
       return new LiveVoicePartyToastFeed().mergeFrom(p0);
    }
    public static LiveVoicePartyToastFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveVoicePartyToastFeed(), p0);
    }
    public LiveVoicePartyToastFeed clear(){
       this.id = "";
       this.toastMsg = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       if (!(this.toastMsg).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.toastMsg);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveVoicePartyToastFeed mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.toastMsg = p0.readString();
             }
          }else {
             this.id = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.id).equals(str)) {
          p0.writeString(1, this.id);
       }
       if (!(this.toastMsg).equals(str)) {
          p0.writeString(2, this.toastMsg);
       }
       super.writeTo(p0);
       return;
    }
}
