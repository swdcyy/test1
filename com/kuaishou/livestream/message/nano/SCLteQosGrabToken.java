package com.kuaishou.livestream.message.nano.SCLteQosGrabToken;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLteQosGrabToken extends MessageNano	// class@001455
{
    public long authorId;
    public String grabTokenUrl;
    public String liveStreamId;
    public boolean needToken;
    public static SCLteQosGrabToken[] _emptyArray;

    public void SCLteQosGrabToken(){
       super();
       this.clear();
    }
    public static SCLteQosGrabToken[] emptyArray(){
       if (SCLteQosGrabToken._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLteQosGrabToken._emptyArray == null) {
             SCLteQosGrabToken[] sCLteQosGrab = new SCLteQosGrabToken[0];
             SCLteQosGrabToken._emptyArray = sCLteQosGrab;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLteQosGrabToken._emptyArray;
    }
    public static SCLteQosGrabToken parseFrom(CodedInputByteBufferNano p0){
       return new SCLteQosGrabToken().mergeFrom(p0);
    }
    public static SCLteQosGrabToken parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLteQosGrabToken(), p0);
    }
    public SCLteQosGrabToken clear(){
       this.liveStreamId = "";
       this.authorId = 0;
       this.needToken = false;
       this.grabTokenUrl = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       SCLteQosGrabToken tauthorId = this.authorId;
       if (tauthorId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tauthorId);
       }
       SCLteQosGrabToken tneedToken = this.needToken;
       if (tneedToken != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, tneedToken);
       }
       if (!(this.grabTokenUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.grabTokenUrl);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLteQosGrabToken mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.grabTokenUrl = p0.readString();
                   }
                }else {
                   this.needToken = p0.readBool();
                }
             }else {
                this.authorId = p0.readUInt64();
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
       SCLteQosGrabToken tauthorId = this.authorId;
       if (tauthorId) {
          p0.writeUInt64(2, tauthorId);
       }
       SCLteQosGrabToken tneedToken = this.needToken;
       if (tneedToken != null) {
          p0.writeBool(3, tneedToken);
       }
       if (!(this.grabTokenUrl).equals(str)) {
          p0.writeString(4, this.grabTokenUrl);
       }
       super.writeTo(p0);
       return;
    }
}
