package com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoSeekBarDragPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$PhotoSeekBarDragPackage extends MessageNano	// class@0012c4
{
    public long cost;
    public long endTime;
    public long startTime;
    public static ClientContent$PhotoSeekBarDragPackage[] _emptyArray;

    public void ClientContent$PhotoSeekBarDragPackage(){
       super();
       this.clear();
    }
    public static ClientContent$PhotoSeekBarDragPackage[] emptyArray(){
       if (ClientContent$PhotoSeekBarDragPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$PhotoSeekBarDragPackage._emptyArray == null) {
             ClientContent$PhotoSeekBarDragPackage[] photoSeekBar = new ClientContent$PhotoSeekBarDragPackage[0];
             ClientContent$PhotoSeekBarDragPackage._emptyArray = photoSeekBar;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$PhotoSeekBarDragPackage._emptyArray;
    }
    public static ClientContent$PhotoSeekBarDragPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$PhotoSeekBarDragPackage().mergeFrom(p0);
    }
    public static ClientContent$PhotoSeekBarDragPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$PhotoSeekBarDragPackage(), p0);
    }
    public ClientContent$PhotoSeekBarDragPackage clear(){
       this.startTime = 0;
       this.endTime = 0;
       this.cost = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$PhotoSeekBarDragPackage tstartTime = this.startTime;
       int i1 = 0;
       if (tstartTime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tstartTime);
       }
       tstartTime = this.endTime;
       if (tstartTime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tstartTime);
       }
       tstartTime = this.cost;
       if (tstartTime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tstartTime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$PhotoSeekBarDragPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.cost = p0.readUInt64();
                }
             }else {
                this.endTime = p0.readUInt64();
             }
          }else {
             this.startTime = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$PhotoSeekBarDragPackage tstartTime = this.startTime;
       int i = 0;
       if (tstartTime - i) {
          p0.writeUInt64(1, tstartTime);
       }
       tstartTime = this.endTime;
       if (tstartTime - i) {
          p0.writeUInt64(2, tstartTime);
       }
       tstartTime = this.cost;
       if (tstartTime - i) {
          p0.writeUInt64(3, tstartTime);
       }
       super.writeTo(p0);
       return;
    }
}
