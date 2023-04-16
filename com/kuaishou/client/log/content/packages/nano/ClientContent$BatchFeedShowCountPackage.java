package com.kuaishou.client.log.content.packages.nano.ClientContent$BatchFeedShowCountPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$FeedShowCountPackage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClientContent$BatchFeedShowCountPackage extends MessageNano	// class@00120e
{
    public ClientContent$FeedShowCountPackage[] feedShowCountPackage;
    public static ClientContent$BatchFeedShowCountPackage[] _emptyArray;

    public void ClientContent$BatchFeedShowCountPackage(){
       super();
       this.clear();
    }
    public static ClientContent$BatchFeedShowCountPackage[] emptyArray(){
       if (ClientContent$BatchFeedShowCountPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$BatchFeedShowCountPackage._emptyArray == null) {
             ClientContent$BatchFeedShowCountPackage[] uBatchFeedSh = new ClientContent$BatchFeedShowCountPackage[0];
             ClientContent$BatchFeedShowCountPackage._emptyArray = uBatchFeedSh;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$BatchFeedShowCountPackage._emptyArray;
    }
    public static ClientContent$BatchFeedShowCountPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$BatchFeedShowCountPackage().mergeFrom(p0);
    }
    public static ClientContent$BatchFeedShowCountPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$BatchFeedShowCountPackage(), p0);
    }
    public ClientContent$BatchFeedShowCountPackage clear(){
       this.feedShowCountPackage = ClientContent$FeedShowCountPackage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$BatchFeedShowCountPackage tuBatchFeedS = this.feedShowCountPackage;
       if (tuBatchFeedS != null && tuBatchFeedS.length > 0) {
          int i1 = 0;
          ClientContent$BatchFeedShowCountPackage tuBatchFeedS1 = this.feedShowCountPackage;
          while (i1 < tuBatchFeedS1.length) {
             object oobject = tuBatchFeedS1[i1];
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
    public ClientContent$BatchFeedShowCountPackage mergeFrom(CodedInputByteBufferNano p0){
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
             ClientContent$BatchFeedShowCountPackage tuBatchFeedS = this.feedShowCountPackage;
             int i2 = (tuBatchFeedS == null)? 0: tuBatchFeedS.length;
             i = i + i2;
             ClientContent$FeedShowCountPackage[] uFeedShowCou = new ClientContent$FeedShowCountPackage[i];
             if (i2) {
                System.arraycopy(tuBatchFeedS, 0, uFeedShowCou, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                uFeedShowCou[i2] = new ClientContent$FeedShowCountPackage();
                p0.readMessage(uFeedShowCou[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             uFeedShowCou[i2] = new ClientContent$FeedShowCountPackage();
             p0.readMessage(uFeedShowCou[i2]);
             this.feedShowCountPackage = uFeedShowCou;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$BatchFeedShowCountPackage tuBatchFeedS = this.feedShowCountPackage;
       if (tuBatchFeedS != null && tuBatchFeedS.length > 0) {
          int i = 0;
          ClientContent$BatchFeedShowCountPackage tuBatchFeedS1 = this.feedShowCountPackage;
          while (i < tuBatchFeedS1.length) {
             object oobject = tuBatchFeedS1[i];
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
