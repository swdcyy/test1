package com.kuaishou.livestream.message.nano.SCLiveAskLocked;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveAskLocked extends MessageNano	// class@001406
{
    public String askId;
    public static SCLiveAskLocked[] _emptyArray;

    public void SCLiveAskLocked(){
       super();
       this.clear();
    }
    public static SCLiveAskLocked[] emptyArray(){
       if (SCLiveAskLocked._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveAskLocked._emptyArray == null) {
             SCLiveAskLocked[] sCLiveAskLoc = new SCLiveAskLocked[0];
             SCLiveAskLocked._emptyArray = sCLiveAskLoc;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveAskLocked._emptyArray;
    }
    public static SCLiveAskLocked parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveAskLocked().mergeFrom(p0);
    }
    public static SCLiveAskLocked parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveAskLocked(), p0);
    }
    public SCLiveAskLocked clear(){
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
    public SCLiveAskLocked mergeFrom(CodedInputByteBufferNano p0){
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
