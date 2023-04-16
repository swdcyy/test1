package com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveQualityPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.System;

public final class ClientContentWrapper$LiveQualityPackage extends MessageNano	// class@001325
{
    public String[] availableQuality;
    public String currentQuality;
    public String previousQuality;
    public static ClientContentWrapper$LiveQualityPackage[] _emptyArray;

    public void ClientContentWrapper$LiveQualityPackage(){
       super();
       this.clear();
    }
    public static ClientContentWrapper$LiveQualityPackage[] emptyArray(){
       if (ClientContentWrapper$LiveQualityPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContentWrapper$LiveQualityPackage._emptyArray == null) {
             ClientContentWrapper$LiveQualityPackage[] liveQualityP = new ClientContentWrapper$LiveQualityPackage[0];
             ClientContentWrapper$LiveQualityPackage._emptyArray = liveQualityP;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContentWrapper$LiveQualityPackage._emptyArray;
    }
    public static ClientContentWrapper$LiveQualityPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContentWrapper$LiveQualityPackage().mergeFrom(p0);
    }
    public static ClientContentWrapper$LiveQualityPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContentWrapper$LiveQualityPackage(), p0);
    }
    public ClientContentWrapper$LiveQualityPackage clear(){
       this.currentQuality = "";
       this.previousQuality = "";
       this.availableQuality = WireFormatNano.EMPTY_STRING_ARRAY;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.currentQuality).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.currentQuality);
       }
       if (!(this.previousQuality).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.previousQuality);
       }
       ClientContentWrapper$LiveQualityPackage tavailableQu = this.availableQuality;
       if (tavailableQu != null && tavailableQu.length > 0) {
          int i1 = 0;
          int i2 = 0;
          int i3 = 0;
          ClientContentWrapper$LiveQualityPackage tavailableQu1 = this.availableQuality;
          while (i1 < tavailableQu1.length) {
             object oobject = tavailableQu1[i1];
             if (oobject != null) {
                i3 = i3 + 1;
                i2 = i2 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i1 = i1 + 1;
          }
          i = (i + i2) + (i3 * 1);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContentWrapper$LiveQualityPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                int i1 = 26;
                if (i != i1) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   ClientContentWrapper$LiveQualityPackage tavailableQu = this.availableQuality;
                   int i2 = (tavailableQu == null)? 0: tavailableQu.length;
                   i = i + i2;
                   String[] stringArray = new String[i];
                   if (i2) {
                      System.arraycopy(tavailableQu, 0, stringArray, 0, i2);
                   }
                   i1 = i - 1;
                   while (i2 < i1) {
                      stringArray[i2] = p0.readString();
                      p0.readTag();
                      i2 = i2 + 1;
                   }
                   stringArray[i2] = p0.readString();
                   this.availableQuality = stringArray;
                }
             }else {
                this.previousQuality = p0.readString();
             }
          }else {
             this.currentQuality = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.currentQuality).equals(str)) {
          p0.writeString(1, this.currentQuality);
       }
       if (!(this.previousQuality).equals(str)) {
          p0.writeString(2, this.previousQuality);
       }
       ClientContentWrapper$LiveQualityPackage tavailableQu = this.availableQuality;
       if (tavailableQu != null && tavailableQu.length > 0) {
          int i = 0;
          ClientContentWrapper$LiveQualityPackage tavailableQu1 = this.availableQuality;
          while (i < tavailableQu1.length) {
             object oobject = tavailableQu1[i];
             if (oobject != null) {
                p0.writeString(3, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
