package com.kuaishou.client.log.content.packages.nano.ClientContent$ChinaMobileQuickLoginValidateResultPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$ChinaMobileQuickLoginValidateResultPackage extends MessageNano	// class@00122a
{
    public int authType;
    public String authTypeDescription;
    public int channel;
    public String openId;
    public String resultCode;
    public String token;
    public static ClientContent$ChinaMobileQuickLoginValidateResultPackage[] _emptyArray;

    public void ClientContent$ChinaMobileQuickLoginValidateResultPackage(){
       super();
       this.clear();
    }
    public static ClientContent$ChinaMobileQuickLoginValidateResultPackage[] emptyArray(){
       if (ClientContent$ChinaMobileQuickLoginValidateResultPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$ChinaMobileQuickLoginValidateResultPackage._emptyArray == null) {
             ClientContent$ChinaMobileQuickLoginValidateResultPackage[] uChinaMobile = new ClientContent$ChinaMobileQuickLoginValidateResultPackage[0];
             ClientContent$ChinaMobileQuickLoginValidateResultPackage._emptyArray = uChinaMobile;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$ChinaMobileQuickLoginValidateResultPackage._emptyArray;
    }
    public static ClientContent$ChinaMobileQuickLoginValidateResultPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$ChinaMobileQuickLoginValidateResultPackage().mergeFrom(p0);
    }
    public static ClientContent$ChinaMobileQuickLoginValidateResultPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$ChinaMobileQuickLoginValidateResultPackage(), p0);
    }
    public ClientContent$ChinaMobileQuickLoginValidateResultPackage clear(){
       this.resultCode = "";
       this.token = "";
       this.authType = 0;
       this.authTypeDescription = "";
       this.openId = "";
       this.channel = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.resultCode).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.resultCode);
       }
       if (!(this.token).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.token);
       }
       ClientContent$ChinaMobileQuickLoginValidateResultPackage tauthType = this.authType;
       if (tauthType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tauthType);
       }
       if (!(this.authTypeDescription).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.authTypeDescription);
       }
       if (!(this.openId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.openId);
       }
       tauthType = this.channel;
       if (tauthType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, tauthType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$ChinaMobileQuickLoginValidateResultPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 42) {
                         if (i != 48) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            i = p0.readInt32();
                            if (i && i != 1) {
                               continue ;
                            }else {
                               this.channel = i;
                            }
                         }
                      }else {
                         this.openId = p0.readString();
                      }
                   }else {
                      this.authTypeDescription = p0.readString();
                   }
                }else {
                   i = p0.readInt32();
                   if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
                      continue ;
                   }else {
                      this.authType = i;
                   }
                }
             }else {
                this.token = p0.readString();
             }
          }else {
             this.resultCode = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.resultCode).equals(str)) {
          p0.writeString(1, this.resultCode);
       }
       if (!(this.token).equals(str)) {
          p0.writeString(2, this.token);
       }
       ClientContent$ChinaMobileQuickLoginValidateResultPackage tauthType = this.authType;
       if (tauthType != null) {
          p0.writeInt32(3, tauthType);
       }
       if (!(this.authTypeDescription).equals(str)) {
          p0.writeString(4, this.authTypeDescription);
       }
       if (!(this.openId).equals(str)) {
          p0.writeString(5, this.openId);
       }
       tauthType = this.channel;
       if (tauthType != null) {
          p0.writeInt32(6, tauthType);
       }
       super.writeTo(p0);
       return;
    }
}
