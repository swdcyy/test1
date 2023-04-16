package com.kuaishou.livestream.message.nano.SCLiveRevenueActivityInfoSignal;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.SCLiveRevenueActivityInfoShakeActivity;
import com.kuaishou.livestream.message.nano.SCLiveRevenueActivityInfoOverRoom;

public final class SCLiveRevenueActivityInfoSignal extends MessageNano	// class@001441
{
    public SCLiveRevenueActivityInfoOverRoom overRoom;
    public SCLiveRevenueActivityInfoShakeActivity shakeActivity;
    public static SCLiveRevenueActivityInfoSignal[] _emptyArray;

    public void SCLiveRevenueActivityInfoSignal(){
       super();
       this.clear();
    }
    public static SCLiveRevenueActivityInfoSignal[] emptyArray(){
       if (SCLiveRevenueActivityInfoSignal._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveRevenueActivityInfoSignal._emptyArray == null) {
             SCLiveRevenueActivityInfoSignal[] sCLiveRevenu = new SCLiveRevenueActivityInfoSignal[0];
             SCLiveRevenueActivityInfoSignal._emptyArray = sCLiveRevenu;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveRevenueActivityInfoSignal._emptyArray;
    }
    public static SCLiveRevenueActivityInfoSignal parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveRevenueActivityInfoSignal().mergeFrom(p0);
    }
    public static SCLiveRevenueActivityInfoSignal parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveRevenueActivityInfoSignal(), p0);
    }
    public SCLiveRevenueActivityInfoSignal clear(){
       this.overRoom = null;
       this.shakeActivity = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCLiveRevenueActivityInfoSignal toverRoom = this.overRoom;
       if (toverRoom != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, toverRoom);
       }
       toverRoom = this.shakeActivity;
       if (toverRoom != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, toverRoom);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveRevenueActivityInfoSignal mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else if(this.shakeActivity == null){
                this.shakeActivity = new SCLiveRevenueActivityInfoShakeActivity();
             }
             p0.readMessage(this.shakeActivity);
          }else if(this.overRoom == null){
             this.overRoom = new SCLiveRevenueActivityInfoOverRoom();
          }
          p0.readMessage(this.overRoom);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCLiveRevenueActivityInfoSignal toverRoom = this.overRoom;
       if (toverRoom != null) {
          p0.writeMessage(1, toverRoom);
       }
       toverRoom = this.shakeActivity;
       if (toverRoom != null) {
          p0.writeMessage(2, toverRoom);
       }
       super.writeTo(p0);
       return;
    }
}
