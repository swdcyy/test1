package com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTransList;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClientEvent$ExpTagTransList extends MessageNano	// class@001355
{
    public ClientEvent$ExpTagTrans[] expTagTrans;
    public static ClientEvent$ExpTagTransList[] _emptyArray;

    public void ClientEvent$ExpTagTransList(){
       super();
       this.clear();
    }
    public static ClientEvent$ExpTagTransList[] emptyArray(){
       if (ClientEvent$ExpTagTransList._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientEvent$ExpTagTransList._emptyArray == null) {
             ClientEvent$ExpTagTransList[] uExpTagTrans = new ClientEvent$ExpTagTransList[0];
             ClientEvent$ExpTagTransList._emptyArray = uExpTagTrans;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientEvent$ExpTagTransList._emptyArray;
    }
    public static ClientEvent$ExpTagTransList parseFrom(CodedInputByteBufferNano p0){
       return new ClientEvent$ExpTagTransList().mergeFrom(p0);
    }
    public static ClientEvent$ExpTagTransList parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientEvent$ExpTagTransList(), p0);
    }
    public ClientEvent$ExpTagTransList clear(){
       this.expTagTrans = ClientEvent$ExpTagTrans.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientEvent$ExpTagTransList texpTagTrans = this.expTagTrans;
       if (texpTagTrans != null && texpTagTrans.length > 0) {
          int i1 = 0;
          ClientEvent$ExpTagTransList texpTagTrans1 = this.expTagTrans;
          while (i1 < texpTagTrans1.length) {
             object oobject = texpTagTrans1[i1];
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
    public ClientEvent$ExpTagTransList mergeFrom(CodedInputByteBufferNano p0){
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
             ClientEvent$ExpTagTransList texpTagTrans = this.expTagTrans;
             int i2 = (texpTagTrans == null)? 0: texpTagTrans.length;
             i = i + i2;
             ClientEvent$ExpTagTrans[] uExpTagTrans = new ClientEvent$ExpTagTrans[i];
             if (i2) {
                System.arraycopy(texpTagTrans, 0, uExpTagTrans, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                uExpTagTrans[i2] = new ClientEvent$ExpTagTrans();
                p0.readMessage(uExpTagTrans[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             uExpTagTrans[i2] = new ClientEvent$ExpTagTrans();
             p0.readMessage(uExpTagTrans[i2]);
             this.expTagTrans = uExpTagTrans;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientEvent$ExpTagTransList texpTagTrans = this.expTagTrans;
       if (texpTagTrans != null && texpTagTrans.length > 0) {
          int i = 0;
          ClientEvent$ExpTagTransList texpTagTrans1 = this.expTagTrans;
          while (i < texpTagTrans1.length) {
             object oobject = texpTagTrans1[i];
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
