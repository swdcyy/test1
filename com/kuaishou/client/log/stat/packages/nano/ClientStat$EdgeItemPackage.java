package com.kuaishou.client.log.stat.packages.nano.ClientStat$EdgeItemPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$EdgeSampleAttrPackage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$EdgeItemMetaInfo;

public final class ClientStat$EdgeItemPackage extends MessageNano	// class@0013d1
{
    public ClientStat$EdgeItemMetaInfo item;
    public ClientStat$EdgeSampleAttrPackage[] itemAttr;
    public static ClientStat$EdgeItemPackage[] _emptyArray;

    public void ClientStat$EdgeItemPackage(){
       super();
       this.clear();
    }
    public static ClientStat$EdgeItemPackage[] emptyArray(){
       if (ClientStat$EdgeItemPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$EdgeItemPackage._emptyArray == null) {
             ClientStat$EdgeItemPackage[] uEdgeItemPac = new ClientStat$EdgeItemPackage[0];
             ClientStat$EdgeItemPackage._emptyArray = uEdgeItemPac;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$EdgeItemPackage._emptyArray;
    }
    public static ClientStat$EdgeItemPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$EdgeItemPackage().mergeFrom(p0);
    }
    public static ClientStat$EdgeItemPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$EdgeItemPackage(), p0);
    }
    public ClientStat$EdgeItemPackage clear(){
       this.item = null;
       this.itemAttr = ClientStat$EdgeSampleAttrPackage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$EdgeItemPackage titem = this.item;
       if (titem != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, titem);
       }
       titem = this.itemAttr;
       if (titem != null && titem.length > 0) {
          int i1 = 0;
          ClientStat$EdgeItemPackage titemAttr = this.itemAttr;
          while (i1 < titemAttr.length) {
             object oobject = titemAttr[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$EdgeItemPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             int i1 = 18;
             if (i != i1) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                ClientStat$EdgeItemPackage titemAttr = this.itemAttr;
                int i2 = (titemAttr == null)? 0: titemAttr.length;
                i = i + i2;
                ClientStat$EdgeSampleAttrPackage[] uEdgeSampleA = new ClientStat$EdgeSampleAttrPackage[i];
                if (i2) {
                   System.arraycopy(titemAttr, 0, uEdgeSampleA, 0, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   uEdgeSampleA[i2] = new ClientStat$EdgeSampleAttrPackage();
                   p0.readMessage(uEdgeSampleA[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                uEdgeSampleA[i2] = new ClientStat$EdgeSampleAttrPackage();
                p0.readMessage(uEdgeSampleA[i2]);
                this.itemAttr = uEdgeSampleA;
             }
          }else if(this.item == null){
             this.item = new ClientStat$EdgeItemMetaInfo();
          }
          p0.readMessage(this.item);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$EdgeItemPackage titem = this.item;
       if (titem != null) {
          p0.writeMessage(1, titem);
       }
       titem = this.itemAttr;
       if (titem != null && titem.length > 0) {
          int i = 0;
          ClientStat$EdgeItemPackage titemAttr = this.itemAttr;
          while (i < titemAttr.length) {
             object oobject = titemAttr[i];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
