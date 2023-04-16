package com.kuaishou.client.log.stat.packages.nano.ClientStat$LiveUseGlassesPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$LiveUseGlassesPackage extends MessageNano	// class@001407
{
    public long endTime;
    public long startTime;
    public static ClientStat$LiveUseGlassesPackage[] _emptyArray;

    public void ClientStat$LiveUseGlassesPackage(){
       super();
       this.clear();
    }
    public static ClientStat$LiveUseGlassesPackage[] emptyArray(){
       if (ClientStat$LiveUseGlassesPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$LiveUseGlassesPackage._emptyArray == null) {
             ClientStat$LiveUseGlassesPackage[] liveUseGlass = new ClientStat$LiveUseGlassesPackage[0];
             ClientStat$LiveUseGlassesPackage._emptyArray = liveUseGlass;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$LiveUseGlassesPackage._emptyArray;
    }
    public static ClientStat$LiveUseGlassesPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$LiveUseGlassesPackage().mergeFrom(p0);
    }
    public static ClientStat$LiveUseGlassesPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$LiveUseGlassesPackage(), p0);
    }
    public ClientStat$LiveUseGlassesPackage clear(){
       this.startTime = 0;
       this.endTime = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$LiveUseGlassesPackage tstartTime = this.startTime;
       int i1 = 0;
       if (tstartTime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tstartTime);
       }
       tstartTime = this.endTime;
       if (tstartTime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tstartTime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$LiveUseGlassesPackage mergeFrom(CodedInputByteBufferNano p0){
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
                this.endTime = p0.readUInt64();
             }
          }else {
             this.startTime = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$LiveUseGlassesPackage tstartTime = this.startTime;
       int i = 0;
       if (tstartTime - i) {
          p0.writeUInt64(1, tstartTime);
       }
       tstartTime = this.endTime;
       if (tstartTime - i) {
          p0.writeUInt64(2, tstartTime);
       }
       super.writeTo(p0);
       return;
    }
}
