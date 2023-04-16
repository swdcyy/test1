package com.kuaishou.livestream.message.nano.SCLiveVoicePartyPkAccept;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveVoicePartyPkAccept extends MessageNano	// class@00144b
{
    public String pkId;
    public static SCLiveVoicePartyPkAccept[] _emptyArray;

    public void SCLiveVoicePartyPkAccept(){
       super();
       this.clear();
    }
    public static SCLiveVoicePartyPkAccept[] emptyArray(){
       if (SCLiveVoicePartyPkAccept._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveVoicePartyPkAccept._emptyArray == null) {
             SCLiveVoicePartyPkAccept[] sCLiveVoiceP = new SCLiveVoicePartyPkAccept[0];
             SCLiveVoicePartyPkAccept._emptyArray = sCLiveVoiceP;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveVoicePartyPkAccept._emptyArray;
    }
    public static SCLiveVoicePartyPkAccept parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveVoicePartyPkAccept().mergeFrom(p0);
    }
    public static SCLiveVoicePartyPkAccept parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveVoicePartyPkAccept(), p0);
    }
    public SCLiveVoicePartyPkAccept clear(){
       this.pkId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.pkId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.pkId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveVoicePartyPkAccept mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             this.pkId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.pkId).equals("")) {
          p0.writeString(1, this.pkId);
       }
       super.writeTo(p0);
       return;
    }
}
