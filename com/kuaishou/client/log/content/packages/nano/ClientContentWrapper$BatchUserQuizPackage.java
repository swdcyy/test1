package com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$BatchUserQuizPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$UserQuizPackage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClientContentWrapper$BatchUserQuizPackage extends MessageNano	// class@00130a
{
    public ClientContentWrapper$UserQuizPackage[] userQuizPackage;
    public static ClientContentWrapper$BatchUserQuizPackage[] _emptyArray;

    public void ClientContentWrapper$BatchUserQuizPackage(){
       super();
       this.clear();
    }
    public static ClientContentWrapper$BatchUserQuizPackage[] emptyArray(){
       if (ClientContentWrapper$BatchUserQuizPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContentWrapper$BatchUserQuizPackage._emptyArray == null) {
             ClientContentWrapper$BatchUserQuizPackage[] uBatchUserQu = new ClientContentWrapper$BatchUserQuizPackage[0];
             ClientContentWrapper$BatchUserQuizPackage._emptyArray = uBatchUserQu;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContentWrapper$BatchUserQuizPackage._emptyArray;
    }
    public static ClientContentWrapper$BatchUserQuizPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContentWrapper$BatchUserQuizPackage().mergeFrom(p0);
    }
    public static ClientContentWrapper$BatchUserQuizPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContentWrapper$BatchUserQuizPackage(), p0);
    }
    public ClientContentWrapper$BatchUserQuizPackage clear(){
       this.userQuizPackage = ClientContentWrapper$UserQuizPackage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContentWrapper$BatchUserQuizPackage tuserQuizPac = this.userQuizPackage;
       if (tuserQuizPac != null && tuserQuizPac.length > 0) {
          int i1 = 0;
          ClientContentWrapper$BatchUserQuizPackage tuserQuizPac1 = this.userQuizPackage;
          while (i1 < tuserQuizPac1.length) {
             object oobject = tuserQuizPac1[i1];
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
    public ClientContentWrapper$BatchUserQuizPackage mergeFrom(CodedInputByteBufferNano p0){
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
             ClientContentWrapper$BatchUserQuizPackage tuserQuizPac = this.userQuizPackage;
             int i2 = (tuserQuizPac == null)? 0: tuserQuizPac.length;
             i = i + i2;
             ClientContentWrapper$UserQuizPackage[] userQuizPack = new ClientContentWrapper$UserQuizPackage[i];
             if (i2) {
                System.arraycopy(tuserQuizPac, 0, userQuizPack, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                userQuizPack[i2] = new ClientContentWrapper$UserQuizPackage();
                p0.readMessage(userQuizPack[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             userQuizPack[i2] = new ClientContentWrapper$UserQuizPackage();
             p0.readMessage(userQuizPack[i2]);
             this.userQuizPackage = userQuizPack;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContentWrapper$BatchUserQuizPackage tuserQuizPac = this.userQuizPackage;
       if (tuserQuizPac != null && tuserQuizPac.length > 0) {
          int i = 0;
          ClientContentWrapper$BatchUserQuizPackage tuserQuizPac1 = this.userQuizPackage;
          while (i < tuserQuizPac1.length) {
             object oobject = tuserQuizPac1[i];
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
