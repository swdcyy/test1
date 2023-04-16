package com.kuaishou.client.log.stat.packages.nano.ClientStat$RerankStatEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$EdgeSampleAttrPackage;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$EdgeItemPackage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClientStat$RerankStatEvent extends MessageNano	// class@0007fa
{
    public ClientStat$EdgeSampleAttrPackage[] commonAttr;
    public ClientStat$EdgeItemPackage[] itemList;
    public static ClientStat$RerankStatEvent[] _emptyArray;

    public void ClientStat$RerankStatEvent(){
       super();
       this.clear();
    }
    public static ClientStat$RerankStatEvent[] emptyArray(){
       if (ClientStat$RerankStatEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$RerankStatEvent._emptyArray == null) {
             ClientStat$RerankStatEvent[] rerankStatEv = new ClientStat$RerankStatEvent[0];
             ClientStat$RerankStatEvent._emptyArray = rerankStatEv;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$RerankStatEvent._emptyArray;
    }
    public static ClientStat$RerankStatEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$RerankStatEvent().mergeFrom(p0);
    }
    public static ClientStat$RerankStatEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$RerankStatEvent(), p0);
    }
    public ClientStat$RerankStatEvent clear(){
       this.commonAttr = ClientStat$EdgeSampleAttrPackage.emptyArray();
       this.itemList = ClientStat$EdgeItemPackage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$RerankStatEvent tcommonAttr = this.commonAttr;
       int i1 = 0;
       if (tcommonAttr != null && tcommonAttr.length > 0) {
          int i2 = 0;
          ClientStat$RerankStatEvent tcommonAttr1 = this.commonAttr;
          while (i2 < tcommonAttr1.length) {
             object oobject = tcommonAttr1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tcommonAttr = this.itemList;
       if (tcommonAttr != null && tcommonAttr.length > 0) {
          tcommonAttr = this.itemList;
          while (i1 < tcommonAttr.length) {
             object oobject1 = tcommonAttr[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$RerankStatEvent mergeFrom(CodedInputByteBufferNano p0){
       ClientStat$RerankStatEvent titemList;
       int i2;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             i1 = 18;
             if (i != i1) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                titemList = this.itemList;
                i2 = (titemList == null)? 0: titemList.length;
                i = i + i2;
                ClientStat$EdgeItemPackage[] uEdgeItemPac = new ClientStat$EdgeItemPackage[i];
                if (i2) {
                   System.arraycopy(titemList, 0, uEdgeItemPac, 0, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   uEdgeItemPac[i2] = new ClientStat$EdgeItemPackage();
                   p0.readMessage(uEdgeItemPac[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                uEdgeItemPac[i2] = new ClientStat$EdgeItemPackage();
                p0.readMessage(uEdgeItemPac[i2]);
                this.itemList = uEdgeItemPac;
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             titemList = this.commonAttr;
             i2 = (titemList == null)? 0: titemList.length;
             i = i + i2;
             ClientStat$EdgeSampleAttrPackage[] uEdgeSampleA = new ClientStat$EdgeSampleAttrPackage[i];
             if (i2) {
                System.arraycopy(titemList, 0, uEdgeSampleA, 0, i2);
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
             this.commonAttr = uEdgeSampleA;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$RerankStatEvent tcommonAttr = this.commonAttr;
       int i = 0;
       if (tcommonAttr != null && tcommonAttr.length > 0) {
          int i1 = 0;
          ClientStat$RerankStatEvent tcommonAttr1 = this.commonAttr;
          while (i1 < tcommonAttr1.length) {
             object oobject = tcommonAttr1[i1];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tcommonAttr = this.itemList;
       if (tcommonAttr != null && tcommonAttr.length > 0) {
          tcommonAttr = this.itemList;
          while (i < tcommonAttr.length) {
             object oobject1 = tcommonAttr[i];
             if (oobject1 != null) {
                p0.writeMessage(2, oobject1);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
