package com.kuaishou.client.log.content.packages.nano.ClientContent$LiveBarrageInfoPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$LiveBarrageInfoPackage extends MessageNano	// class@001268
{
    public int barrageAlpha;
    public int barragePosType;
    public int barrageTextSize;
    public static ClientContent$LiveBarrageInfoPackage[] _emptyArray;

    public void ClientContent$LiveBarrageInfoPackage(){
       super();
       this.clear();
    }
    public static ClientContent$LiveBarrageInfoPackage[] emptyArray(){
       if (ClientContent$LiveBarrageInfoPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$LiveBarrageInfoPackage._emptyArray == null) {
             ClientContent$LiveBarrageInfoPackage[] liveBarrageI = new ClientContent$LiveBarrageInfoPackage[0];
             ClientContent$LiveBarrageInfoPackage._emptyArray = liveBarrageI;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$LiveBarrageInfoPackage._emptyArray;
    }
    public static ClientContent$LiveBarrageInfoPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$LiveBarrageInfoPackage().mergeFrom(p0);
    }
    public static ClientContent$LiveBarrageInfoPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$LiveBarrageInfoPackage(), p0);
    }
    public ClientContent$LiveBarrageInfoPackage clear(){
       this.barragePosType = 0;
       this.barrageTextSize = 0;
       this.barrageAlpha = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$LiveBarrageInfoPackage tbarragePosT = this.barragePosType;
       if (tbarragePosT != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tbarragePosT);
       }
       tbarragePosT = this.barrageTextSize;
       if (tbarragePosT != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tbarragePosT);
       }
       tbarragePosT = this.barrageAlpha;
       if (tbarragePosT != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tbarragePosT);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$LiveBarrageInfoPackage mergeFrom(CodedInputByteBufferNano p0){
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
                   this.barrageAlpha = p0.readUInt32();
                }
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && (i != 4 && i != 5))))) {
                   continue ;
                }else {
                   this.barrageTextSize = i;
                }
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
                continue ;
             }else {
                this.barragePosType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$LiveBarrageInfoPackage tbarragePosT = this.barragePosType;
       if (tbarragePosT != null) {
          p0.writeInt32(1, tbarragePosT);
       }
       tbarragePosT = this.barrageTextSize;
       if (tbarragePosT != null) {
          p0.writeInt32(2, tbarragePosT);
       }
       tbarragePosT = this.barrageAlpha;
       if (tbarragePosT != null) {
          p0.writeUInt32(3, tbarragePosT);
       }
       super.writeTo(p0);
       return;
    }
}
