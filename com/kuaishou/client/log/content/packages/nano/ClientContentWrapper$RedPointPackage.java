package com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$RedPointPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$RedPointDetailPackage;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class ClientContentWrapper$RedPointPackage extends MessageNano	// class@00133c
{
    public int index;
    public String name;
    public ClientContentWrapper$RedPointDetailPackage[] redPointDetailPackage;
    public int value;
    public static ClientContentWrapper$RedPointPackage[] _emptyArray;

    public void ClientContentWrapper$RedPointPackage(){
       super();
       this.clear();
    }
    public static ClientContentWrapper$RedPointPackage[] emptyArray(){
       if (ClientContentWrapper$RedPointPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContentWrapper$RedPointPackage._emptyArray == null) {
             ClientContentWrapper$RedPointPackage[] redPointPack = new ClientContentWrapper$RedPointPackage[0];
             ClientContentWrapper$RedPointPackage._emptyArray = redPointPack;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContentWrapper$RedPointPackage._emptyArray;
    }
    public static ClientContentWrapper$RedPointPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContentWrapper$RedPointPackage().mergeFrom(p0);
    }
    public static ClientContentWrapper$RedPointPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContentWrapper$RedPointPackage(), p0);
    }
    public ClientContentWrapper$RedPointPackage clear(){
       this.name = "";
       this.index = 0;
       this.value = 0;
       this.redPointDetailPackage = ClientContentWrapper$RedPointDetailPackage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.name).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.name);
       }
       ClientContentWrapper$RedPointPackage tindex = this.index;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tindex);
       }
       tindex = this.value;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tindex);
       }
       tindex = this.redPointDetailPackage;
       if (tindex != null && tindex.length > 0) {
          int i1 = 0;
          ClientContentWrapper$RedPointPackage tredPointDet = this.redPointDetailPackage;
          while (i1 < tredPointDet.length) {
             object oobject = tredPointDet[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(4, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContentWrapper$RedPointPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   int i1 = 34;
                   if (i != i1) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                      ClientContentWrapper$RedPointPackage tredPointDet = this.redPointDetailPackage;
                      int i2 = (tredPointDet == null)? 0: tredPointDet.length;
                      i = i + i2;
                      ClientContentWrapper$RedPointDetailPackage[] redPointDeta = new ClientContentWrapper$RedPointDetailPackage[i];
                      if (i2) {
                         System.arraycopy(tredPointDet, 0, redPointDeta, 0, i2);
                      }
                      i1 = i - 1;
                      while (i2 < i1) {
                         redPointDeta[i2] = new ClientContentWrapper$RedPointDetailPackage();
                         p0.readMessage(redPointDeta[i2]);
                         p0.readTag();
                         i2 = i2 + 1;
                      }
                      redPointDeta[i2] = new ClientContentWrapper$RedPointDetailPackage();
                      p0.readMessage(redPointDeta[i2]);
                      this.redPointDetailPackage = redPointDeta;
                   }
                }else {
                   this.value = p0.readUInt32();
                }
             }else {
                this.index = p0.readUInt32();
             }
          }else {
             this.name = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.name).equals("")) {
          p0.writeString(1, this.name);
       }
       ClientContentWrapper$RedPointPackage tindex = this.index;
       if (tindex != null) {
          p0.writeUInt32(2, tindex);
       }
       tindex = this.value;
       if (tindex != null) {
          p0.writeUInt32(3, tindex);
       }
       tindex = this.redPointDetailPackage;
       if (tindex != null && tindex.length > 0) {
          int i = 0;
          ClientContentWrapper$RedPointPackage tredPointDet = this.redPointDetailPackage;
          while (i < tredPointDet.length) {
             object oobject = tredPointDet[i];
             if (oobject != null) {
                p0.writeMessage(4, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
