package com.kuaishou.client.log.content.packages.nano.ClientContent$CollectionPackageV2;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class ClientContent$CollectionPackageV2 extends MessageNano	// class@00122b
{
    public String cnt;
    public String expTag;
    public String id;
    public String identity;
    public String index;
    public String llsid;
    public String name;
    public String params;
    public String photoCount;
    public ClientContent$PhotoPackage[] photoPackage;
    public String secondaryType;
    public String status;
    public String type;
    public String value;
    public static ClientContent$CollectionPackageV2[] _emptyArray;

    public void ClientContent$CollectionPackageV2(){
       super();
       this.clear();
    }
    public static ClientContent$CollectionPackageV2[] emptyArray(){
       if (ClientContent$CollectionPackageV2._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$CollectionPackageV2._emptyArray == null) {
             ClientContent$CollectionPackageV2[] uCollectionP = new ClientContent$CollectionPackageV2[0];
             ClientContent$CollectionPackageV2._emptyArray = uCollectionP;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$CollectionPackageV2._emptyArray;
    }
    public static ClientContent$CollectionPackageV2 parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$CollectionPackageV2().mergeFrom(p0);
    }
    public static ClientContent$CollectionPackageV2 parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$CollectionPackageV2(), p0);
    }
    public ClientContent$CollectionPackageV2 clear(){
       this.identity = "";
       this.id = "";
       this.name = "";
       this.index = "";
       this.value = "";
       this.cnt = "";
       this.status = "";
       this.type = "";
       this.secondaryType = "";
       this.photoPackage = ClientContent$PhotoPackage.emptyArray();
       this.photoCount = "";
       this.expTag = "";
       this.llsid = "";
       this.params = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.identity).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.identity);
       }
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.id);
       }
       if (!(this.name).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.name);
       }
       if (!(this.index).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.index);
       }
       if (!(this.value).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.value);
       }
       if (!(this.cnt).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.cnt);
       }
       if (!(this.status).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.status);
       }
       if (!(this.type).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.type);
       }
       if (!(this.secondaryType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.secondaryType);
       }
       ClientContent$CollectionPackageV2 tphotoPackag = this.photoPackage;
       if (tphotoPackag != null && tphotoPackag.length > 0) {
          int i1 = 0;
          ClientContent$CollectionPackageV2 tphotoPackag1 = this.photoPackage;
          while (i1 < tphotoPackag1.length) {
             object oobject = tphotoPackag1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(10, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.photoCount).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.photoCount);
       }
       if (!(this.expTag).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.expTag);
       }
       if (!(this.llsid).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(13, this.llsid);
       }
       if (!(this.params).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(14, this.params);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$CollectionPackageV2 mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.identity = p0.readString();
                break;
              case 18:
                this.id = p0.readString();
                break;
              case 26:
                this.name = p0.readString();
                break;
              case '"':
                this.index = p0.readString();
                break;
              case '*':
                this.value = p0.readString();
                break;
              case '2':
                this.cnt = p0.readString();
                break;
              case ':':
                this.status = p0.readString();
                break;
              case 'B':
                this.type = p0.readString();
                break;
              case 'J':
                this.secondaryType = p0.readString();
                break;
              case 'R':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 82);
                ClientContent$CollectionPackageV2 tphotoPackag = this.photoPackage;
                int i1 = (tphotoPackag == null)? 0: tphotoPackag.length;
                i = i + i1;
                ClientContent$PhotoPackage[] photoPackage = new ClientContent$PhotoPackage[i];
                if (i1) {
                   System.arraycopy(tphotoPackag, 0, photoPackage, 0, i1);
                }
                int i2 = i - 1;
                while (i1 < i2) {
                   photoPackage[i1] = new ClientContent$PhotoPackage();
                   p0.readMessage(photoPackage[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                photoPackage[i1] = new ClientContent$PhotoPackage();
                p0.readMessage(photoPackage[i1]);
                this.photoPackage = photoPackage;
                break;
              case 'Z':
                this.photoCount = p0.readString();
                break;
              case 'b':
                this.expTag = p0.readString();
                break;
              case 'j':
                this.llsid = p0.readString();
                break;
              case 'r':
                this.params = p0.readString();
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   return this;
                }
                continue ;
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.identity).equals(str)) {
          p0.writeString(1, this.identity);
       }
       if (!(this.id).equals(str)) {
          p0.writeString(2, this.id);
       }
       if (!(this.name).equals(str)) {
          p0.writeString(3, this.name);
       }
       if (!(this.index).equals(str)) {
          p0.writeString(4, this.index);
       }
       if (!(this.value).equals(str)) {
          p0.writeString(5, this.value);
       }
       if (!(this.cnt).equals(str)) {
          p0.writeString(6, this.cnt);
       }
       if (!(this.status).equals(str)) {
          p0.writeString(7, this.status);
       }
       if (!(this.type).equals(str)) {
          p0.writeString(8, this.type);
       }
       if (!(this.secondaryType).equals(str)) {
          p0.writeString(9, this.secondaryType);
       }
       ClientContent$CollectionPackageV2 tphotoPackag = this.photoPackage;
       if (tphotoPackag != null && tphotoPackag.length > 0) {
          int i = 0;
          ClientContent$CollectionPackageV2 tphotoPackag1 = this.photoPackage;
          while (i < tphotoPackag1.length) {
             object oobject = tphotoPackag1[i];
             if (oobject != null) {
                p0.writeMessage(10, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.photoCount).equals(str)) {
          p0.writeString(11, this.photoCount);
       }
       if (!(this.expTag).equals(str)) {
          p0.writeString(12, this.expTag);
       }
       if (!(this.llsid).equals(str)) {
          p0.writeString(13, this.llsid);
       }
       if (!(this.params).equals(str)) {
          p0.writeString(14, this.params);
       }
       super.writeTo(p0);
       return;
    }
}
