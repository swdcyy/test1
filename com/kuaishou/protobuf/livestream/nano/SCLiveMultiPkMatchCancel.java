package com.kuaishou.protobuf.livestream.nano.SCLiveMultiPkMatchCancel;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveMultiPkMatchCancel extends MessageNano	// class@000d62
{
    public String liveStreamId;
    public boolean multiPk;
    public static SCLiveMultiPkMatchCancel[] _emptyArray;

    public void SCLiveMultiPkMatchCancel(){
       super();
       this.clear();
    }
    public static SCLiveMultiPkMatchCancel[] emptyArray(){
       if (SCLiveMultiPkMatchCancel._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveMultiPkMatchCancel._emptyArray == null) {
             SCLiveMultiPkMatchCancel[] sCLiveMultiP = new SCLiveMultiPkMatchCancel[0];
             SCLiveMultiPkMatchCancel._emptyArray = sCLiveMultiP;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveMultiPkMatchCancel._emptyArray;
    }
    public static SCLiveMultiPkMatchCancel parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveMultiPkMatchCancel().mergeFrom(p0);
    }
    public static SCLiveMultiPkMatchCancel parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveMultiPkMatchCancel(), p0);
    }
    public SCLiveMultiPkMatchCancel clear(){
       this.liveStreamId = "";
       this.multiPk = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.liveStreamId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       SCLiveMultiPkMatchCancel tmultiPk = this.multiPk;
       if (tmultiPk != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tmultiPk);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveMultiPkMatchCancel mergeFrom(CodedInputByteBufferNano p0){
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
                this.multiPk = p0.readBool();
             }
          }else {
             this.liveStreamId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.liveStreamId).equals("")) {
          p0.writeString(1, this.liveStreamId);
       }
       SCLiveMultiPkMatchCancel tmultiPk = this.multiPk;
       if (tmultiPk != null) {
          p0.writeBool(2, tmultiPk);
       }
       super.writeTo(p0);
       return;
    }
}
