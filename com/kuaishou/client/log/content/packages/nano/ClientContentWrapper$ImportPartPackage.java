package com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ImportPartPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Float;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContentWrapper$ImportPartPackage extends MessageNano	// class@001313
{
    public boolean isClipped;
    public int rotationDegree;
    public float speedRate;
    public int type;
    public static ClientContentWrapper$ImportPartPackage[] _emptyArray;

    public void ClientContentWrapper$ImportPartPackage(){
       super();
       this.clear();
    }
    public static ClientContentWrapper$ImportPartPackage[] emptyArray(){
       if (ClientContentWrapper$ImportPartPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContentWrapper$ImportPartPackage._emptyArray == null) {
             ClientContentWrapper$ImportPartPackage[] importPartPa = new ClientContentWrapper$ImportPartPackage[0];
             ClientContentWrapper$ImportPartPackage._emptyArray = importPartPa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContentWrapper$ImportPartPackage._emptyArray;
    }
    public static ClientContentWrapper$ImportPartPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContentWrapper$ImportPartPackage().mergeFrom(p0);
    }
    public static ClientContentWrapper$ImportPartPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContentWrapper$ImportPartPackage(), p0);
    }
    public ClientContentWrapper$ImportPartPackage clear(){
       this.type = 0;
       this.isClipped = false;
       this.rotationDegree = 0;
       this.speedRate = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContentWrapper$ImportPartPackage ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ttype);
       }
       ttype = this.isClipped;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, ttype);
       }
       ttype = this.rotationDegree;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, ttype);
       }
       if (Float.floatToIntBits(this.speedRate) != Float.floatToIntBits(0)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(4, this.speedRate);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContentWrapper$ImportPartPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 37) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.speedRate = p0.readFloat();
                   }
                }else {
                   this.rotationDegree = p0.readInt32();
                }
             }else {
                this.isClipped = p0.readBool();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.type = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContentWrapper$ImportPartPackage ttype = this.type;
       if (ttype != null) {
          p0.writeInt32(1, ttype);
       }
       ttype = this.isClipped;
       if (ttype != null) {
          p0.writeBool(2, ttype);
       }
       ttype = this.rotationDegree;
       if (ttype != null) {
          p0.writeInt32(3, ttype);
       }
       if (Float.floatToIntBits(this.speedRate) != Float.floatToIntBits(0)) {
          p0.writeFloat(4, this.speedRate);
       }
       super.writeTo(p0);
       return;
    }
}
