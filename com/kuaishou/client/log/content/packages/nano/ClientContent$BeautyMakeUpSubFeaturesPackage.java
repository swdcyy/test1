package com.kuaishou.client.log.content.packages.nano.ClientContent$BeautyMakeUpSubFeaturesPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$BeautyMakeUpSubFeaturesPackage extends MessageNano	// class@00121e
{
    public String secodaryIndex;
    public String secodaryTypeNew;
    public int secondaryType;
    public String segmentIndex;
    public String tabId;
    public String thirdIndex;
    public String thirdType;
    public String value;
    public static ClientContent$BeautyMakeUpSubFeaturesPackage[] _emptyArray;

    public void ClientContent$BeautyMakeUpSubFeaturesPackage(){
       super();
       this.clear();
    }
    public static ClientContent$BeautyMakeUpSubFeaturesPackage[] emptyArray(){
       if (ClientContent$BeautyMakeUpSubFeaturesPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$BeautyMakeUpSubFeaturesPackage._emptyArray == null) {
             ClientContent$BeautyMakeUpSubFeaturesPackage[] uBeautyMakeU = new ClientContent$BeautyMakeUpSubFeaturesPackage[0];
             ClientContent$BeautyMakeUpSubFeaturesPackage._emptyArray = uBeautyMakeU;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$BeautyMakeUpSubFeaturesPackage._emptyArray;
    }
    public static ClientContent$BeautyMakeUpSubFeaturesPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$BeautyMakeUpSubFeaturesPackage().mergeFrom(p0);
    }
    public static ClientContent$BeautyMakeUpSubFeaturesPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$BeautyMakeUpSubFeaturesPackage(), p0);
    }
    public ClientContent$BeautyMakeUpSubFeaturesPackage clear(){
       this.secondaryType = 0;
       this.thirdType = "";
       this.value = "";
       this.secodaryTypeNew = "";
       this.secodaryIndex = "";
       this.thirdIndex = "";
       this.segmentIndex = "";
       this.tabId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$BeautyMakeUpSubFeaturesPackage tsecondaryTy = this.secondaryType;
       if (tsecondaryTy != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tsecondaryTy);
       }
       String str = "";
       if (!(this.thirdType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.thirdType);
       }
       if (!(this.value).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.value);
       }
       if (!(this.secodaryTypeNew).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.secodaryTypeNew);
       }
       if (!(this.secodaryIndex).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.secodaryIndex);
       }
       if (!(this.thirdIndex).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.thirdIndex);
       }
       if (!(this.segmentIndex).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.segmentIndex);
       }
       if (!(this.tabId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.tabId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$BeautyMakeUpSubFeaturesPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 42) {
                         if (i != 50) {
                            if (i != 58) {
                               if (i != 66) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
                                  }
                               }else {
                                  this.tabId = p0.readString();
                               }
                            }else {
                               this.segmentIndex = p0.readString();
                            }
                         }else {
                            this.thirdIndex = p0.readString();
                         }
                      }else {
                         this.secodaryIndex = p0.readString();
                      }
                   }else {
                      this.secodaryTypeNew = p0.readString();
                   }
                }else {
                   this.value = p0.readString();
                }
             }else {
                this.thirdType = p0.readString();
             }
          }else {
             i = p0.readInt32();
             switch (i){
                 case 0:
                 case 2:
                 case 3:
                 case 4:
                 case 5:
                 case 6:
                 case 7:
                 case 8:
                 case 9:
                 case 1:
                   break;
                 default:
             }
             this.secondaryType = i;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$BeautyMakeUpSubFeaturesPackage tsecondaryTy = this.secondaryType;
       if (tsecondaryTy != null) {
          p0.writeInt32(1, tsecondaryTy);
       }
       String str = "";
       if (!(this.thirdType).equals(str)) {
          p0.writeString(2, this.thirdType);
       }
       if (!(this.value).equals(str)) {
          p0.writeString(3, this.value);
       }
       if (!(this.secodaryTypeNew).equals(str)) {
          p0.writeString(4, this.secodaryTypeNew);
       }
       if (!(this.secodaryIndex).equals(str)) {
          p0.writeString(5, this.secodaryIndex);
       }
       if (!(this.thirdIndex).equals(str)) {
          p0.writeString(6, this.thirdIndex);
       }
       if (!(this.segmentIndex).equals(str)) {
          p0.writeString(7, this.segmentIndex);
       }
       if (!(this.tabId).equals(str)) {
          p0.writeString(8, this.tabId);
       }
       super.writeTo(p0);
       return;
    }
}
