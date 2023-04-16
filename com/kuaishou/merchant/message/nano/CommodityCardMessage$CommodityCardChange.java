package com.kuaishou.merchant.message.nano.CommodityCardMessage$CommodityCardChange;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.System;

public final class CommodityCardMessage$CommodityCardChange extends MessageNano	// class@001c39
{
    public boolean cleanFrames;
    public String[] frame;
    public String itemId;
    public static CommodityCardMessage$CommodityCardChange[] _emptyArray;

    public void CommodityCardMessage$CommodityCardChange(){
       super();
       this.clear();
    }
    public static CommodityCardMessage$CommodityCardChange[] emptyArray(){
       if (CommodityCardMessage$CommodityCardChange._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (CommodityCardMessage$CommodityCardChange._emptyArray == null) {
             CommodityCardMessage$CommodityCardChange[] uCommodityCa = new CommodityCardMessage$CommodityCardChange[0];
             CommodityCardMessage$CommodityCardChange._emptyArray = uCommodityCa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return CommodityCardMessage$CommodityCardChange._emptyArray;
    }
    public static CommodityCardMessage$CommodityCardChange parseFrom(CodedInputByteBufferNano p0){
       return new CommodityCardMessage$CommodityCardChange().mergeFrom(p0);
    }
    public static CommodityCardMessage$CommodityCardChange parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new CommodityCardMessage$CommodityCardChange(), p0);
    }
    public CommodityCardMessage$CommodityCardChange clear(){
       this.itemId = "";
       this.frame = WireFormatNano.EMPTY_STRING_ARRAY;
       this.cleanFrames = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       int i1 = 1;
       if (!(this.itemId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(i1, this.itemId);
       }
       CommodityCardMessage$CommodityCardChange tframe = this.frame;
       if (tframe != null && tframe.length > 0) {
          int i2 = 0;
          int i3 = 0;
          int i4 = 0;
          CommodityCardMessage$CommodityCardChange tframe1 = this.frame;
          while (i2 < tframe1.length) {
             object oobject = tframe1[i2];
             if (oobject != null) {
                i4 = i4 + 1;
                i3 = i3 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i2 = i2 + 1;
          }
          i = (i + i3) + (i4 * 1);
       }
       tframe = this.cleanFrames;
       if (tframe != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, tframe);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public CommodityCardMessage$CommodityCardChange mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             int i1 = 18;
             if (i != i1) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.cleanFrames = p0.readBool();
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                CommodityCardMessage$CommodityCardChange tframe = this.frame;
                int i2 = (tframe == null)? 0: tframe.length;
                i = i + i2;
                String[] stringArray = new String[i];
                if (i2) {
                   System.arraycopy(tframe, 0, stringArray, 0, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.frame = stringArray;
             }
          }else {
             this.itemId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.itemId).equals("")) {
          p0.writeString(1, this.itemId);
       }
       CommodityCardMessage$CommodityCardChange tframe = this.frame;
       if (tframe != null && tframe.length > 0) {
          int i = 0;
          CommodityCardMessage$CommodityCardChange tframe1 = this.frame;
          while (i < tframe1.length) {
             object oobject = tframe1[i];
             if (oobject != null) {
                p0.writeString(2, oobject);
             }
             i = i + 1;
          }
       }
       tframe = this.cleanFrames;
       if (tframe != null) {
          p0.writeBool(3, tframe);
       }
       super.writeTo(p0);
       return;
    }
}
