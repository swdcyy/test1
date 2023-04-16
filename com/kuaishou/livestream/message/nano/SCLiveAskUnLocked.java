package com.kuaishou.livestream.message.nano.SCLiveAskUnLocked;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveAskUnLocked extends MessageNano	// class@001409
{
    public String askId;
    public static SCLiveAskUnLocked[] _emptyArray;

    public void SCLiveAskUnLocked(){
       super();
       this.clear();
    }
    public static SCLiveAskUnLocked[] emptyArray(){
       if (SCLiveAskUnLocked._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveAskUnLocked._emptyArray == null) {
             SCLiveAskUnLocked[] sCLiveAskUnL = new SCLiveAskUnLocked[0];
             SCLiveAskUnLocked._emptyArray = sCLiveAskUnL;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveAskUnLocked._emptyArray;
    }
    public static SCLiveAskUnLocked parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveAskUnLocked().mergeFrom(p0);
    }
    public static SCLiveAskUnLocked parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveAskUnLocked(), p0);
    }
    public SCLiveAskUnLocked clear(){
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
    public SCLiveAskUnLocked mergeFrom(CodedInputByteBufferNano p0){
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
