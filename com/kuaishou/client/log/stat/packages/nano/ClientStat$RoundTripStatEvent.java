package com.kuaishou.client.log.stat.packages.nano.ClientStat$RoundTripStatEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$RoundTripStatEvent extends MessageNano	// class@0007fd
{
    public long duration;
    public int type;
    public static ClientStat$RoundTripStatEvent[] _emptyArray;

    public void ClientStat$RoundTripStatEvent(){
       super();
       this.clear();
    }
    public static ClientStat$RoundTripStatEvent[] emptyArray(){
       if (ClientStat$RoundTripStatEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$RoundTripStatEvent._emptyArray == null) {
             ClientStat$RoundTripStatEvent[] roundTripSta = new ClientStat$RoundTripStatEvent[0];
             ClientStat$RoundTripStatEvent._emptyArray = roundTripSta;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$RoundTripStatEvent._emptyArray;
    }
    public static ClientStat$RoundTripStatEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$RoundTripStatEvent().mergeFrom(p0);
    }
    public static ClientStat$RoundTripStatEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$RoundTripStatEvent(), p0);
    }
    public ClientStat$RoundTripStatEvent clear(){
       this.type = 0;
       this.duration = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$RoundTripStatEvent ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ttype);
       }
       ttype = this.duration;
       if (ttype) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, ttype);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$RoundTripStatEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.duration = p0.readUInt64();
             }
          }else {
             i = p0.readInt32();
             if (i && i != 1) {
                continue ;
             }else {
                this.type = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$RoundTripStatEvent ttype = this.type;
       if (ttype != null) {
          p0.writeInt32(1, ttype);
       }
       ttype = this.duration;
       if (ttype) {
          p0.writeUInt64(2, ttype);
       }
       super.writeTo(p0);
       return;
    }
}
