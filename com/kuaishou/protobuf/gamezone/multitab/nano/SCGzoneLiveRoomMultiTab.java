package com.kuaishou.protobuf.gamezone.multitab.nano.SCGzoneLiveRoomMultiTab;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCGzoneLiveRoomMultiTab extends MessageNano	// class@000bc1
{
    public String payload;
    public static SCGzoneLiveRoomMultiTab[] _emptyArray;

    public void SCGzoneLiveRoomMultiTab(){
       super();
       this.clear();
    }
    public static SCGzoneLiveRoomMultiTab[] emptyArray(){
       if (SCGzoneLiveRoomMultiTab._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCGzoneLiveRoomMultiTab._emptyArray == null) {
             SCGzoneLiveRoomMultiTab[] sCGzoneLiveR = new SCGzoneLiveRoomMultiTab[0];
             SCGzoneLiveRoomMultiTab._emptyArray = sCGzoneLiveR;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCGzoneLiveRoomMultiTab._emptyArray;
    }
    public static SCGzoneLiveRoomMultiTab parseFrom(CodedInputByteBufferNano p0){
       return new SCGzoneLiveRoomMultiTab().mergeFrom(p0);
    }
    public static SCGzoneLiveRoomMultiTab parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCGzoneLiveRoomMultiTab(), p0);
    }
    public SCGzoneLiveRoomMultiTab clear(){
       this.payload = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.payload).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.payload);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCGzoneLiveRoomMultiTab mergeFrom(CodedInputByteBufferNano p0){
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
             this.payload = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.payload).equals("")) {
          p0.writeString(1, this.payload);
       }
       super.writeTo(p0);
       return;
    }
}
