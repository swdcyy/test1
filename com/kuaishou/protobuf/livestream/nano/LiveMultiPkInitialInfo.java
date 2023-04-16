package com.kuaishou.protobuf.livestream.nano.LiveMultiPkInitialInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveMultiPkInitialInfo extends MessageNano	// class@000cc1
{
    public int currentUserInitialJoinType;
    public static LiveMultiPkInitialInfo[] _emptyArray;

    public void LiveMultiPkInitialInfo(){
       super();
       this.clear();
    }
    public static LiveMultiPkInitialInfo[] emptyArray(){
       if (LiveMultiPkInitialInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveMultiPkInitialInfo._emptyArray == null) {
             LiveMultiPkInitialInfo[] liveMultiPkI = new LiveMultiPkInitialInfo[0];
             LiveMultiPkInitialInfo._emptyArray = liveMultiPkI;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveMultiPkInitialInfo._emptyArray;
    }
    public static LiveMultiPkInitialInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveMultiPkInitialInfo().mergeFrom(p0);
    }
    public static LiveMultiPkInitialInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveMultiPkInitialInfo(), p0);
    }
    public LiveMultiPkInitialInfo clear(){
       this.currentUserInitialJoinType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveMultiPkInitialInfo tcurrentUser = this.currentUserInitialJoinType;
       if (tcurrentUser != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tcurrentUser);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveMultiPkInitialInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && (i != 2 && i != 3))) {
                continue ;
             }else {
                this.currentUserInitialJoinType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveMultiPkInitialInfo tcurrentUser = this.currentUserInitialJoinType;
       if (tcurrentUser != null) {
          p0.writeInt32(1, tcurrentUser);
       }
       super.writeTo(p0);
       return;
    }
}
