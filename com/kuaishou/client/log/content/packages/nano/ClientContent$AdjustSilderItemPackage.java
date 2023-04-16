package com.kuaishou.client.log.content.packages.nano.ClientContent$AdjustSilderItemPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Float;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$AdjustSilderItemPackage extends MessageNano	// class@001203
{
    public boolean isAdjusted;
    public String item;
    public float value;
    public static ClientContent$AdjustSilderItemPackage[] _emptyArray;

    public void ClientContent$AdjustSilderItemPackage(){
       super();
       this.clear();
    }
    public static ClientContent$AdjustSilderItemPackage[] emptyArray(){
       if (ClientContent$AdjustSilderItemPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$AdjustSilderItemPackage._emptyArray == null) {
             ClientContent$AdjustSilderItemPackage[] uAdjustSilde = new ClientContent$AdjustSilderItemPackage[0];
             ClientContent$AdjustSilderItemPackage._emptyArray = uAdjustSilde;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$AdjustSilderItemPackage._emptyArray;
    }
    public static ClientContent$AdjustSilderItemPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$AdjustSilderItemPackage().mergeFrom(p0);
    }
    public static ClientContent$AdjustSilderItemPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$AdjustSilderItemPackage(), p0);
    }
    public ClientContent$AdjustSilderItemPackage clear(){
       this.item = "";
       this.isAdjusted = false;
       this.value = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.item).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.item);
       }
       ClientContent$AdjustSilderItemPackage tisAdjusted = this.isAdjusted;
       if (tisAdjusted != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tisAdjusted);
       }
       if (Float.floatToIntBits(this.value) != Float.floatToIntBits(0)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(3, this.value);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$AdjustSilderItemPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 29) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.value = p0.readFloat();
                }
             }else {
                this.isAdjusted = p0.readBool();
             }
          }else {
             this.item = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.item).equals("")) {
          p0.writeString(1, this.item);
       }
       ClientContent$AdjustSilderItemPackage tisAdjusted = this.isAdjusted;
       if (tisAdjusted != null) {
          p0.writeBool(2, tisAdjusted);
       }
       if (Float.floatToIntBits(this.value) != Float.floatToIntBits(0)) {
          p0.writeFloat(3, this.value);
       }
       super.writeTo(p0);
       return;
    }
}
