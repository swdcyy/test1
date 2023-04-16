package com.kuaishou.livestream.message.nano.LiveRedPackMessage$SCAudienceRedPackToken;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveRedPackMessage$AudienceRedPackToken;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class LiveRedPackMessage$SCAudienceRedPackToken extends MessageNano	// class@00126f
{
    public LiveRedPackMessage$AudienceRedPackToken[] token;
    public static LiveRedPackMessage$SCAudienceRedPackToken[] _emptyArray;

    public void LiveRedPackMessage$SCAudienceRedPackToken(){
       super();
       this.clear();
    }
    public static LiveRedPackMessage$SCAudienceRedPackToken[] emptyArray(){
       if (LiveRedPackMessage$SCAudienceRedPackToken._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRedPackMessage$SCAudienceRedPackToken._emptyArray == null) {
             LiveRedPackMessage$SCAudienceRedPackToken[] sCAudienceRe = new LiveRedPackMessage$SCAudienceRedPackToken[0];
             LiveRedPackMessage$SCAudienceRedPackToken._emptyArray = sCAudienceRe;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRedPackMessage$SCAudienceRedPackToken._emptyArray;
    }
    public static LiveRedPackMessage$SCAudienceRedPackToken parseFrom(CodedInputByteBufferNano p0){
       return new LiveRedPackMessage$SCAudienceRedPackToken().mergeFrom(p0);
    }
    public static LiveRedPackMessage$SCAudienceRedPackToken parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRedPackMessage$SCAudienceRedPackToken(), p0);
    }
    public LiveRedPackMessage$SCAudienceRedPackToken clear(){
       this.token = LiveRedPackMessage$AudienceRedPackToken.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveRedPackMessage$SCAudienceRedPackToken ttoken = this.token;
       if (ttoken != null && ttoken.length > 0) {
          int i1 = 0;
          LiveRedPackMessage$SCAudienceRedPackToken ttoken1 = this.token;
          while (i1 < ttoken1.length) {
             object oobject = ttoken1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRedPackMessage$SCAudienceRedPackToken mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             LiveRedPackMessage$SCAudienceRedPackToken ttoken = this.token;
             int i2 = (ttoken == null)? 0: ttoken.length;
             i = i + i2;
             LiveRedPackMessage$AudienceRedPackToken[] uAudienceRed = new LiveRedPackMessage$AudienceRedPackToken[i];
             if (i2) {
                System.arraycopy(ttoken, 0, uAudienceRed, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                uAudienceRed[i2] = new LiveRedPackMessage$AudienceRedPackToken();
                p0.readMessage(uAudienceRed[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             uAudienceRed[i2] = new LiveRedPackMessage$AudienceRedPackToken();
             p0.readMessage(uAudienceRed[i2]);
             this.token = uAudienceRed;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveRedPackMessage$SCAudienceRedPackToken ttoken = this.token;
       if (ttoken != null && ttoken.length > 0) {
          int i = 0;
          LiveRedPackMessage$SCAudienceRedPackToken ttoken1 = this.token;
          while (i < ttoken1.length) {
             object oobject = ttoken1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
