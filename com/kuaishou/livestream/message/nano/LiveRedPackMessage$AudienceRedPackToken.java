package com.kuaishou.livestream.message.nano.LiveRedPackMessage$AudienceRedPackToken;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveRedPackMessage$AudienceRedPackToken extends MessageNano	// class@00126d
{
    public long deadline;
    public String redPackId;
    public static LiveRedPackMessage$AudienceRedPackToken[] _emptyArray;

    public void LiveRedPackMessage$AudienceRedPackToken(){
       super();
       this.clear();
    }
    public static LiveRedPackMessage$AudienceRedPackToken[] emptyArray(){
       if (LiveRedPackMessage$AudienceRedPackToken._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRedPackMessage$AudienceRedPackToken._emptyArray == null) {
             LiveRedPackMessage$AudienceRedPackToken[] uAudienceRed = new LiveRedPackMessage$AudienceRedPackToken[0];
             LiveRedPackMessage$AudienceRedPackToken._emptyArray = uAudienceRed;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRedPackMessage$AudienceRedPackToken._emptyArray;
    }
    public static LiveRedPackMessage$AudienceRedPackToken parseFrom(CodedInputByteBufferNano p0){
       return new LiveRedPackMessage$AudienceRedPackToken().mergeFrom(p0);
    }
    public static LiveRedPackMessage$AudienceRedPackToken parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRedPackMessage$AudienceRedPackToken(), p0);
    }
    public LiveRedPackMessage$AudienceRedPackToken clear(){
       this.redPackId = "";
       this.deadline = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.redPackId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.redPackId);
       }
       LiveRedPackMessage$AudienceRedPackToken tdeadline = this.deadline;
       if (tdeadline) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tdeadline);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRedPackMessage$AudienceRedPackToken mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.deadline = p0.readUInt64();
             }
          }else {
             this.redPackId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.redPackId).equals("")) {
          p0.writeString(1, this.redPackId);
       }
       LiveRedPackMessage$AudienceRedPackToken tdeadline = this.deadline;
       if (tdeadline) {
          p0.writeUInt64(2, tdeadline);
       }
       super.writeTo(p0);
       return;
    }
}
