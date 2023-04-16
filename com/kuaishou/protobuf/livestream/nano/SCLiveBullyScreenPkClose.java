package com.kuaishou.protobuf.livestream.nano.SCLiveBullyScreenPkClose;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveBullyScreenPkClose extends MessageNano	// class@000d44
{
    public String closeToastInfo;
    public String multiPkId;
    public long timestamp;
    public static SCLiveBullyScreenPkClose[] _emptyArray;

    public void SCLiveBullyScreenPkClose(){
       super();
       this.clear();
    }
    public static SCLiveBullyScreenPkClose[] emptyArray(){
       if (SCLiveBullyScreenPkClose._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveBullyScreenPkClose._emptyArray == null) {
             SCLiveBullyScreenPkClose[] sCLiveBullyS = new SCLiveBullyScreenPkClose[0];
             SCLiveBullyScreenPkClose._emptyArray = sCLiveBullyS;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveBullyScreenPkClose._emptyArray;
    }
    public static SCLiveBullyScreenPkClose parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveBullyScreenPkClose().mergeFrom(p0);
    }
    public static SCLiveBullyScreenPkClose parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveBullyScreenPkClose(), p0);
    }
    public SCLiveBullyScreenPkClose clear(){
       this.multiPkId = "";
       this.closeToastInfo = "";
       this.timestamp = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.multiPkId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.multiPkId);
       }
       if (!(this.closeToastInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.closeToastInfo);
       }
       SCLiveBullyScreenPkClose ttimestamp = this.timestamp;
       if (ttimestamp) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, ttimestamp);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveBullyScreenPkClose mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.timestamp = p0.readUInt64();
                }
             }else {
                this.closeToastInfo = p0.readString();
             }
          }else {
             this.multiPkId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.multiPkId).equals(str)) {
          p0.writeString(1, this.multiPkId);
       }
       if (!(this.closeToastInfo).equals(str)) {
          p0.writeString(2, this.closeToastInfo);
       }
       SCLiveBullyScreenPkClose ttimestamp = this.timestamp;
       if (ttimestamp) {
          p0.writeUInt64(3, ttimestamp);
       }
       super.writeTo(p0);
       return;
    }
}
