package com.kuaishou.client.log.content.packages.nano.ClientContent$IMMessageMultiImageLinkPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.System;

public final class ClientContent$IMMessageMultiImageLinkPackage extends MessageNano	// class@001250
{
    public String desc;
    public String errImageUrl;
    public String iconUrl;
    public String[] imageUrls;
    public String sourceName;
    public int sourceType;
    public String title;
    public String url;
    public static ClientContent$IMMessageMultiImageLinkPackage[] _emptyArray;

    public void ClientContent$IMMessageMultiImageLinkPackage(){
       super();
       this.clear();
    }
    public static ClientContent$IMMessageMultiImageLinkPackage[] emptyArray(){
       if (ClientContent$IMMessageMultiImageLinkPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$IMMessageMultiImageLinkPackage._emptyArray == null) {
             ClientContent$IMMessageMultiImageLinkPackage[] iMMessageMul = new ClientContent$IMMessageMultiImageLinkPackage[0];
             ClientContent$IMMessageMultiImageLinkPackage._emptyArray = iMMessageMul;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$IMMessageMultiImageLinkPackage._emptyArray;
    }
    public static ClientContent$IMMessageMultiImageLinkPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$IMMessageMultiImageLinkPackage().mergeFrom(p0);
    }
    public static ClientContent$IMMessageMultiImageLinkPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$IMMessageMultiImageLinkPackage(), p0);
    }
    public ClientContent$IMMessageMultiImageLinkPackage clear(){
       this.url = "";
       this.sourceType = 0;
       this.sourceName = "";
       this.title = "";
       this.iconUrl = "";
       this.desc = "";
       this.imageUrls = WireFormatNano.EMPTY_STRING_ARRAY;
       this.errImageUrl = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.url).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.url);
       }
       ClientContent$IMMessageMultiImageLinkPackage tsourceType = this.sourceType;
       if (tsourceType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tsourceType);
       }
       if (!(this.sourceName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.sourceName);
       }
       if (!(this.title).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.title);
       }
       if (!(this.iconUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.iconUrl);
       }
       if (!(this.desc).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.desc);
       }
       tsourceType = this.imageUrls;
       if (tsourceType != null && tsourceType.length > 0) {
          int i1 = 0;
          int i2 = 0;
          int i3 = 0;
          ClientContent$IMMessageMultiImageLinkPackage timageUrls = this.imageUrls;
          while (i1 < timageUrls.length) {
             object oobject = timageUrls[i1];
             if (oobject != null) {
                i3 = i3 + 1;
                i2 = i2 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i1 = i1 + 1;
          }
          i = (i + i2) + (i3 * 1);
       }
       if (!(this.errImageUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.errImageUrl);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$IMMessageMultiImageLinkPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 42) {
                         if (i != 50) {
                            int i1 = 58;
                            if (i != i1) {
                               if (i != 66) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
                                  }
                               }else {
                                  this.errImageUrl = p0.readString();
                               }
                            }else {
                               i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                               ClientContent$IMMessageMultiImageLinkPackage timageUrls = this.imageUrls;
                               int i2 = (timageUrls == null)? 0: timageUrls.length;
                               i = i + i2;
                               String[] stringArray = new String[i];
                               if (i2) {
                                  System.arraycopy(timageUrls, 0, stringArray, 0, i2);
                               }
                               i1 = i - 1;
                               while (i2 < i1) {
                                  stringArray[i2] = p0.readString();
                                  p0.readTag();
                                  i2 = i2 + 1;
                               }
                               stringArray[i2] = p0.readString();
                               this.imageUrls = stringArray;
                            }
                         }else {
                            this.desc = p0.readString();
                         }
                      }else {
                         this.iconUrl = p0.readString();
                      }
                   }else {
                      this.title = p0.readString();
                   }
                }else {
                   this.sourceName = p0.readString();
                }
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.sourceType = i;
                }
             }
          }else {
             this.url = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.url).equals(str)) {
          p0.writeString(1, this.url);
       }
       ClientContent$IMMessageMultiImageLinkPackage tsourceType = this.sourceType;
       if (tsourceType != null) {
          p0.writeInt32(2, tsourceType);
       }
       if (!(this.sourceName).equals(str)) {
          p0.writeString(3, this.sourceName);
       }
       if (!(this.title).equals(str)) {
          p0.writeString(4, this.title);
       }
       if (!(this.iconUrl).equals(str)) {
          p0.writeString(5, this.iconUrl);
       }
       if (!(this.desc).equals(str)) {
          p0.writeString(6, this.desc);
       }
       tsourceType = this.imageUrls;
       if (tsourceType != null && tsourceType.length > 0) {
          int i = 0;
          ClientContent$IMMessageMultiImageLinkPackage timageUrls = this.imageUrls;
          while (i < timageUrls.length) {
             object oobject = timageUrls[i];
             if (oobject != null) {
                p0.writeString(7, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.errImageUrl).equals(str)) {
          p0.writeString(8, this.errImageUrl);
       }
       super.writeTo(p0);
       return;
    }
}
