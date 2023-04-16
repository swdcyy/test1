package com.kuaishou.client.log.stat.packages.nano.ClientStat$BridgeCenterEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Float;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$BridgeCenterEvent extends MessageNano	// class@0007ab
{
    public String biz;
    public String bridge;
    public String exception;
    public String extraInfo;
    public int findCost;
    public int findFrom;
    public int invokeCost;
    public String namespace;
    public String pageSource;
    public float ratio;
    public boolean success;
    public static ClientStat$BridgeCenterEvent[] _emptyArray;

    public void ClientStat$BridgeCenterEvent(){
       super();
       this.clear();
    }
    public static ClientStat$BridgeCenterEvent[] emptyArray(){
       if (ClientStat$BridgeCenterEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$BridgeCenterEvent._emptyArray == null) {
             ClientStat$BridgeCenterEvent[] uBridgeCente = new ClientStat$BridgeCenterEvent[0];
             ClientStat$BridgeCenterEvent._emptyArray = uBridgeCente;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$BridgeCenterEvent._emptyArray;
    }
    public static ClientStat$BridgeCenterEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$BridgeCenterEvent().mergeFrom(p0);
    }
    public static ClientStat$BridgeCenterEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$BridgeCenterEvent(), p0);
    }
    public ClientStat$BridgeCenterEvent clear(){
       this.biz = "";
       this.namespace = "";
       this.bridge = "";
       this.findCost = 0;
       this.invokeCost = 0;
       this.findFrom = 0;
       this.success = false;
       this.exception = "";
       this.ratio = 0;
       this.pageSource = "";
       this.extraInfo = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.biz).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.biz);
       }
       if (!(this.namespace).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.namespace);
       }
       if (!(this.bridge).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.bridge);
       }
       ClientStat$BridgeCenterEvent tfindCost = this.findCost;
       if (tfindCost != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tfindCost);
       }
       tfindCost = this.invokeCost;
       if (tfindCost != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, tfindCost);
       }
       tfindCost = this.findFrom;
       if (tfindCost != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, tfindCost);
       }
       tfindCost = this.success;
       if (tfindCost != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(7, tfindCost);
       }
       if (!(this.exception).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.exception);
       }
       if (Float.floatToIntBits(this.ratio) != Float.floatToIntBits(0)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(9, this.ratio);
       }
       if (!(this.pageSource).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.pageSource);
       }
       if (!(this.extraInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.extraInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$BridgeCenterEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.biz = p0.readString();
                break;
              case 18:
                this.namespace = p0.readString();
                break;
              case 26:
                this.bridge = p0.readString();
                break;
              case 32:
                this.findCost = p0.readUInt32();
                break;
              case '(':
                this.invokeCost = p0.readUInt32();
                break;
              case '0':
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != 3))) {
                   continue ;
                }else {
                   this.findFrom = i;
                }
                break;
              case '8':
                this.success = p0.readBool();
                break;
              case 'B':
                this.exception = p0.readString();
                break;
              case 'M':
                this.ratio = p0.readFloat();
                break;
              case 'R':
                this.pageSource = p0.readString();
                break;
              case 'Z':
                this.extraInfo = p0.readString();
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   return this;
                }
                continue ;
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.biz).equals(str)) {
          p0.writeString(1, this.biz);
       }
       if (!(this.namespace).equals(str)) {
          p0.writeString(2, this.namespace);
       }
       if (!(this.bridge).equals(str)) {
          p0.writeString(3, this.bridge);
       }
       ClientStat$BridgeCenterEvent tfindCost = this.findCost;
       if (tfindCost != null) {
          p0.writeUInt32(4, tfindCost);
       }
       tfindCost = this.invokeCost;
       if (tfindCost != null) {
          p0.writeUInt32(5, tfindCost);
       }
       tfindCost = this.findFrom;
       if (tfindCost != null) {
          p0.writeInt32(6, tfindCost);
       }
       tfindCost = this.success;
       if (tfindCost != null) {
          p0.writeBool(7, tfindCost);
       }
       if (!(this.exception).equals(str)) {
          p0.writeString(8, this.exception);
       }
       if (Float.floatToIntBits(this.ratio) != Float.floatToIntBits(0)) {
          p0.writeFloat(9, this.ratio);
       }
       if (!(this.pageSource).equals(str)) {
          p0.writeString(10, this.pageSource);
       }
       if (!(this.extraInfo).equals(str)) {
          p0.writeString(11, this.extraInfo);
       }
       super.writeTo(p0);
       return;
    }
}
