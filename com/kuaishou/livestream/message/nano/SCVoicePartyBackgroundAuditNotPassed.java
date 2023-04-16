package com.kuaishou.livestream.message.nano.SCVoicePartyBackgroundAuditNotPassed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCVoicePartyBackgroundAuditNotPassed extends MessageNano	// class@00146c
{
    public String detail;
    public String title;
    public static SCVoicePartyBackgroundAuditNotPassed[] _emptyArray;

    public void SCVoicePartyBackgroundAuditNotPassed(){
       super();
       this.clear();
    }
    public static SCVoicePartyBackgroundAuditNotPassed[] emptyArray(){
       if (SCVoicePartyBackgroundAuditNotPassed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCVoicePartyBackgroundAuditNotPassed._emptyArray == null) {
             SCVoicePartyBackgroundAuditNotPassed[] sCVoiceParty = new SCVoicePartyBackgroundAuditNotPassed[0];
             SCVoicePartyBackgroundAuditNotPassed._emptyArray = sCVoiceParty;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCVoicePartyBackgroundAuditNotPassed._emptyArray;
    }
    public static SCVoicePartyBackgroundAuditNotPassed parseFrom(CodedInputByteBufferNano p0){
       return new SCVoicePartyBackgroundAuditNotPassed().mergeFrom(p0);
    }
    public static SCVoicePartyBackgroundAuditNotPassed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCVoicePartyBackgroundAuditNotPassed(), p0);
    }
    public SCVoicePartyBackgroundAuditNotPassed clear(){
       this.title = "";
       this.detail = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.title).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.title);
       }
       if (!(this.detail).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.detail);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCVoicePartyBackgroundAuditNotPassed mergeFrom(CodedInputByteBufferNano p0){
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
                this.detail = p0.readString();
             }
          }else {
             this.title = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.title).equals(str)) {
          p0.writeString(1, this.title);
       }
       if (!(this.detail).equals(str)) {
          p0.writeString(2, this.detail);
       }
       super.writeTo(p0);
       return;
    }
}
