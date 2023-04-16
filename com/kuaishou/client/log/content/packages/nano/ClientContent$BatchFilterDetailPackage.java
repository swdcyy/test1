package com.kuaishou.client.log.content.packages.nano.ClientContent$BatchFilterDetailPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$FilterDetailPackage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClientContent$BatchFilterDetailPackage extends MessageNano	// class@00120f
{
    public ClientContent$FilterDetailPackage[] filterDetailPackage;
    public static ClientContent$BatchFilterDetailPackage[] _emptyArray;

    public void ClientContent$BatchFilterDetailPackage(){
       super();
       this.clear();
    }
    public static ClientContent$BatchFilterDetailPackage[] emptyArray(){
       if (ClientContent$BatchFilterDetailPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$BatchFilterDetailPackage._emptyArray == null) {
             ClientContent$BatchFilterDetailPackage[] uBatchFilter = new ClientContent$BatchFilterDetailPackage[0];
             ClientContent$BatchFilterDetailPackage._emptyArray = uBatchFilter;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$BatchFilterDetailPackage._emptyArray;
    }
    public static ClientContent$BatchFilterDetailPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$BatchFilterDetailPackage().mergeFrom(p0);
    }
    public static ClientContent$BatchFilterDetailPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$BatchFilterDetailPackage(), p0);
    }
    public ClientContent$BatchFilterDetailPackage clear(){
       this.filterDetailPackage = ClientContent$FilterDetailPackage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$BatchFilterDetailPackage tfilterDetai = this.filterDetailPackage;
       if (tfilterDetai != null && tfilterDetai.length > 0) {
          int i1 = 0;
          ClientContent$BatchFilterDetailPackage tfilterDetai1 = this.filterDetailPackage;
          while (i1 < tfilterDetai1.length) {
             object oobject = tfilterDetai1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$BatchFilterDetailPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             ClientContent$BatchFilterDetailPackage tfilterDetai = this.filterDetailPackage;
             int i2 = (tfilterDetai == null)? 0: tfilterDetai.length;
             i = i + i2;
             ClientContent$FilterDetailPackage[] uFilterDetai = new ClientContent$FilterDetailPackage[i];
             if (i2) {
                System.arraycopy(tfilterDetai, 0, uFilterDetai, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                uFilterDetai[i2] = new ClientContent$FilterDetailPackage();
                p0.readMessage(uFilterDetai[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             uFilterDetai[i2] = new ClientContent$FilterDetailPackage();
             p0.readMessage(uFilterDetai[i2]);
             this.filterDetailPackage = uFilterDetai;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$BatchFilterDetailPackage tfilterDetai = this.filterDetailPackage;
       if (tfilterDetai != null && tfilterDetai.length > 0) {
          int i = 0;
          ClientContent$BatchFilterDetailPackage tfilterDetai1 = this.filterDetailPackage;
          while (i < tfilterDetai1.length) {
             object oobject = tfilterDetai1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
