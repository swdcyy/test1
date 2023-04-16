package com.kuaishou.livestream.message.nano.SCLiveAskClosed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveAskClosed extends MessageNano	// class@001405
{
    public String askId;
    public static SCLiveAskClosed[] _emptyArray;

    public void SCLiveAskClosed(){
       super();
       this.clear();
    }
    public static SCLiveAskClosed[] emptyArray(){
       if (SCLiveAskClosed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveAskClosed._emptyArray == null) {
             SCLiveAskClosed[] sCLiveAskClo = new SCLiveAskClosed[0];
             SCLiveAskClosed._emptyArray = sCLiveAskClo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveAskClosed._emptyArray;
    }
    public static SCLiveAskClosed parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveAskClosed().mergeFrom(p0);
    }
    public static SCLiveAskClosed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveAskClosed(), p0);
    }
    public SCLiveAskClosed clear(){
       this.askId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.askId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.askId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveAskClosed mergeFrom(CodedInputByteBufferNano p0){
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
             this.askId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.askId).equals("")) {
          p0.writeString(1, this.askId);
       }
       super.writeTo(p0);
       return;
    }
}
