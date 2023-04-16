package com.kuaishou.client.log.content.packages.nano.ClientContent$BatchFeatureSwitchPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$FeatureSwitchPackage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClientContent$BatchFeatureSwitchPackage extends MessageNano	// class@00120d
{
    public ClientContent$FeatureSwitchPackage[] featureSwitchPackage;
    public static ClientContent$BatchFeatureSwitchPackage[] _emptyArray;

    public void ClientContent$BatchFeatureSwitchPackage(){
       super();
       this.clear();
    }
    public static ClientContent$BatchFeatureSwitchPackage[] emptyArray(){
       if (ClientContent$BatchFeatureSwitchPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$BatchFeatureSwitchPackage._emptyArray == null) {
             ClientContent$BatchFeatureSwitchPackage[] uBatchFeatur = new ClientContent$BatchFeatureSwitchPackage[0];
             ClientContent$BatchFeatureSwitchPackage._emptyArray = uBatchFeatur;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$BatchFeatureSwitchPackage._emptyArray;
    }
    public static ClientContent$BatchFeatureSwitchPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$BatchFeatureSwitchPackage().mergeFrom(p0);
    }
    public static ClientContent$BatchFeatureSwitchPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$BatchFeatureSwitchPackage(), p0);
    }
    public ClientContent$BatchFeatureSwitchPackage clear(){
       this.featureSwitchPackage = ClientContent$FeatureSwitchPackage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$BatchFeatureSwitchPackage tuBatchFeatu = this.featureSwitchPackage;
       if (tuBatchFeatu != null && tuBatchFeatu.length > 0) {
          int i1 = 0;
          ClientContent$BatchFeatureSwitchPackage tuBatchFeatu1 = this.featureSwitchPackage;
          while (i1 < tuBatchFeatu1.length) {
             object oobject = tuBatchFeatu1[i1];
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
    public ClientContent$BatchFeatureSwitchPackage mergeFrom(CodedInputByteBufferNano p0){
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
             ClientContent$BatchFeatureSwitchPackage tuBatchFeatu = this.featureSwitchPackage;
             int i2 = (tuBatchFeatu == null)? 0: tuBatchFeatu.length;
             i = i + i2;
             ClientContent$FeatureSwitchPackage[] uFeatureSwit = new ClientContent$FeatureSwitchPackage[i];
             if (i2) {
                System.arraycopy(tuBatchFeatu, 0, uFeatureSwit, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                uFeatureSwit[i2] = new ClientContent$FeatureSwitchPackage();
                p0.readMessage(uFeatureSwit[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             uFeatureSwit[i2] = new ClientContent$FeatureSwitchPackage();
             p0.readMessage(uFeatureSwit[i2]);
             this.featureSwitchPackage = uFeatureSwit;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$BatchFeatureSwitchPackage tuBatchFeatu = this.featureSwitchPackage;
       if (tuBatchFeatu != null && tuBatchFeatu.length > 0) {
          int i = 0;
          ClientContent$BatchFeatureSwitchPackage tuBatchFeatu1 = this.featureSwitchPackage;
          while (i < tuBatchFeatu1.length) {
             object oobject = tuBatchFeatu1[i];
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
