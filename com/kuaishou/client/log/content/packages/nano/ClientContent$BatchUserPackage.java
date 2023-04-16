package com.kuaishou.client.log.content.packages.nano.ClientContent$BatchUserPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClientContent$BatchUserPackage extends MessageNano	// class@001219
{
    public ClientContent$UserPackage[] userPackage;
    public static ClientContent$BatchUserPackage[] _emptyArray;

    public void ClientContent$BatchUserPackage(){
       super();
       this.clear();
    }
    public static ClientContent$BatchUserPackage[] emptyArray(){
       if (ClientContent$BatchUserPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$BatchUserPackage._emptyArray == null) {
             ClientContent$BatchUserPackage[] uBatchUserPa = new ClientContent$BatchUserPackage[0];
             ClientContent$BatchUserPackage._emptyArray = uBatchUserPa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$BatchUserPackage._emptyArray;
    }
    public static ClientContent$BatchUserPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$BatchUserPackage().mergeFrom(p0);
    }
    public static ClientContent$BatchUserPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$BatchUserPackage(), p0);
    }
    public ClientContent$BatchUserPackage clear(){
       this.userPackage = ClientContent$UserPackage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$BatchUserPackage tuserPackage = this.userPackage;
       if (tuserPackage != null && tuserPackage.length > 0) {
          int i1 = 0;
          ClientContent$BatchUserPackage tuserPackage1 = this.userPackage;
          while (i1 < tuserPackage1.length) {
             object oobject = tuserPackage1[i1];
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
    public ClientContent$BatchUserPackage mergeFrom(CodedInputByteBufferNano p0){
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
             ClientContent$BatchUserPackage tuserPackage = this.userPackage;
             int i2 = (tuserPackage == null)? 0: tuserPackage.length;
             i = i + i2;
             ClientContent$UserPackage[] userPackageA = new ClientContent$UserPackage[i];
             if (i2) {
                System.arraycopy(tuserPackage, 0, userPackageA, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                userPackageA[i2] = new ClientContent$UserPackage();
                p0.readMessage(userPackageA[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             userPackageA[i2] = new ClientContent$UserPackage();
             p0.readMessage(userPackageA[i2]);
             this.userPackage = userPackageA;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$BatchUserPackage tuserPackage = this.userPackage;
       if (tuserPackage != null && tuserPackage.length > 0) {
          int i = 0;
          ClientContent$BatchUserPackage tuserPackage1 = this.userPackage;
          while (i < tuserPackage1.length) {
             object oobject = tuserPackage1[i];
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
