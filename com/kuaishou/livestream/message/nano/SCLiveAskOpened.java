package com.kuaishou.livestream.message.nano.SCLiveAskOpened;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveAskOpened extends MessageNano	// class@001407
{
    public String askId;
    public boolean enableDeleteConfirm;
    public boolean enableLockAsk;
    public static SCLiveAskOpened[] _emptyArray;

    public void SCLiveAskOpened(){
       super();
       this.clear();
    }
    public static SCLiveAskOpened[] emptyArray(){
       if (SCLiveAskOpened._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveAskOpened._emptyArray == null) {
             SCLiveAskOpened[] sCLiveAskOpe = new SCLiveAskOpened[0];
             SCLiveAskOpened._emptyArray = sCLiveAskOpe;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveAskOpened._emptyArray;
    }
    public static SCLiveAskOpened parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveAskOpened().mergeFrom(p0);
    }
    public static SCLiveAskOpened parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveAskOpened(), p0);
    }
    public SCLiveAskOpened clear(){
       this.askId = "";
       this.enableLockAsk = false;
       this.enableDeleteConfirm = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.askId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.askId);
       }
       SCLiveAskOpened tenableLockA = this.enableLockAsk;
       if (tenableLockA != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tenableLockA);
       }
       tenableLockA = this.enableDeleteConfirm;
       if (tenableLockA != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, tenableLockA);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveAskOpened mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.enableDeleteConfirm = p0.readBool();
                }
             }else {
                this.enableLockAsk = p0.readBool();
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
       SCLiveAskOpened tenableLockA = this.enableLockAsk;
       if (tenableLockA != null) {
          p0.writeBool(2, tenableLockA);
       }
       tenableLockA = this.enableDeleteConfirm;
       if (tenableLockA != null) {
          p0.writeBool(3, tenableLockA);
       }
       super.writeTo(p0);
       return;
    }
}
