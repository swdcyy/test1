package com.kuaishou.protobuf.log.nano.ClientCommon$AppPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientCommon$AppPackage extends MessageNano	// class@000de0
{
    public String channel;
    public String language;
    public String packageName;
    public int platform;
    public int product;
    public String productName;
    public int versionCode;
    public String versionName;
    public static ClientCommon$AppPackage[] _emptyArray;

    public void ClientCommon$AppPackage(){
       super();
       this.clear();
    }
    public static ClientCommon$AppPackage[] emptyArray(){
       if (ClientCommon$AppPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientCommon$AppPackage._emptyArray == null) {
             ClientCommon$AppPackage[] uAppPackageA = new ClientCommon$AppPackage[0];
             ClientCommon$AppPackage._emptyArray = uAppPackageA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientCommon$AppPackage._emptyArray;
    }
    public static ClientCommon$AppPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientCommon$AppPackage().mergeFrom(p0);
    }
    public static ClientCommon$AppPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientCommon$AppPackage(), p0);
    }
    public ClientCommon$AppPackage clear(){
       this.product = 0;
       this.platform = 0;
       this.language = "";
       this.channel = "";
       this.versionName = "";
       this.versionCode = 0;
       this.packageName = "";
       this.productName = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientCommon$AppPackage tproduct = this.product;
       if (tproduct != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tproduct);
       }
       tproduct = this.platform;
       if (tproduct != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tproduct);
       }
       String str = "";
       if (!(this.language).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.language);
       }
       if (!(this.channel).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.channel);
       }
       if (!(this.versionName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.versionName);
       }
       tproduct = this.versionCode;
       if (tproduct != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, tproduct);
       }
       if (!(this.packageName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.packageName);
       }
       if (!(this.productName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.productName);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientCommon$AppPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 42) {
                         if (i != 48) {
                            if (i != 58) {
                               if (i != 66) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
                                  }
                               }else {
                                  this.productName = p0.readString();
                               }
                            }else {
                               this.packageName = p0.readString();
                            }
                         }else {
                            this.versionCode = p0.readInt32();
                         }
                      }else {
                         this.versionName = p0.readString();
                      }
                   }else {
                      this.channel = p0.readString();
                   }
                }else {
                   this.language = p0.readString();
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
                    case 10:
                    case 1:
                      break;
                    default:
                }
                this.platform = i;
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
                 case 10:
                 case 11:
                 case 12:
                 case 13:
                 case 14:
                 case 15:
                 case 16:
                 case 17:
                 case 1:
                   break;
                 default:
             }
             this.product = i;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientCommon$AppPackage tproduct = this.product;
       if (tproduct != null) {
          p0.writeInt32(1, tproduct);
       }
       tproduct = this.platform;
       if (tproduct != null) {
          p0.writeInt32(2, tproduct);
       }
       String str = "";
       if (!(this.language).equals(str)) {
          p0.writeString(3, this.language);
       }
       if (!(this.channel).equals(str)) {
          p0.writeString(4, this.channel);
       }
       if (!(this.versionName).equals(str)) {
          p0.writeString(5, this.versionName);
       }
       tproduct = this.versionCode;
       if (tproduct != null) {
          p0.writeInt32(6, tproduct);
       }
       if (!(this.packageName).equals(str)) {
          p0.writeString(7, this.packageName);
       }
       if (!(this.productName).equals(str)) {
          p0.writeString(8, this.productName);
       }
       super.writeTo(p0);
       return;
    }
}
