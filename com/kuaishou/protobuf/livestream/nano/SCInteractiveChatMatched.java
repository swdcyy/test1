package com.kuaishou.protobuf.livestream.nano.SCInteractiveChatMatched;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatBizIdentity;

public final class SCInteractiveChatMatched extends MessageNano	// class@000d3a
{
    public String aryaConfig;
    public InteractiveChatBizIdentity bizIdentity;
    public String extraInfo;
    public String matchId;
    public String sessionId;
    public static SCInteractiveChatMatched[] _emptyArray;

    public void SCInteractiveChatMatched(){
       super();
       this.clear();
    }
    public static SCInteractiveChatMatched[] emptyArray(){
       if (SCInteractiveChatMatched._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCInteractiveChatMatched._emptyArray == null) {
             SCInteractiveChatMatched[] sCInteractiv = new SCInteractiveChatMatched[0];
             SCInteractiveChatMatched._emptyArray = sCInteractiv;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCInteractiveChatMatched._emptyArray;
    }
    public static SCInteractiveChatMatched parseFrom(CodedInputByteBufferNano p0){
       return new SCInteractiveChatMatched().mergeFrom(p0);
    }
    public static SCInteractiveChatMatched parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCInteractiveChatMatched(), p0);
    }
    public SCInteractiveChatMatched clear(){
       this.bizIdentity = null;
       this.aryaConfig = "";
       this.sessionId = "";
       this.extraInfo = "";
       this.matchId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCInteractiveChatMatched tbizIdentity = this.bizIdentity;
       if (tbizIdentity != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tbizIdentity);
       }
       String str = "";
       if (!(this.aryaConfig).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.aryaConfig);
       }
       if (!(this.sessionId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.sessionId);
       }
       if (!(this.extraInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.extraInfo);
       }
       if (!(this.matchId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.matchId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCInteractiveChatMatched mergeFrom(CodedInputByteBufferNano p0){
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
                         this.matchId = p0.readString();
                      }
                   }else {
                      this.extraInfo = p0.readString();
                   }
                }else {
                   this.sessionId = p0.readString();
                }
             }else {
                this.aryaConfig = p0.readString();
             }
          }else if(this.bizIdentity == null){
             this.bizIdentity = new InteractiveChatBizIdentity();
          }
          p0.readMessage(this.bizIdentity);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCInteractiveChatMatched tbizIdentity = this.bizIdentity;
       if (tbizIdentity != null) {
          p0.writeMessage(1, tbizIdentity);
       }
       String str = "";
       if (!(this.aryaConfig).equals(str)) {
          p0.writeString(2, this.aryaConfig);
       }
       if (!(this.sessionId).equals(str)) {
          p0.writeString(3, this.sessionId);
       }
       if (!(this.extraInfo).equals(str)) {
          p0.writeString(4, this.extraInfo);
       }
       if (!(this.matchId).equals(str)) {
          p0.writeString(5, this.matchId);
       }
       super.writeTo(p0);
       return;
    }
}
