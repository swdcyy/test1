package com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class ClientContent$TagPackage extends MessageNano	// class@0012e4
{
    public String expTag;
    public String identity;
    public long index;
    public String llsid;
    public String name;
    public String params;
    public long photoCount;
    public ClientContent$PhotoPackage[] photoPackage;
    public String secondaryType;
    public int type;
    public static ClientContent$TagPackage[] _emptyArray;

    public void ClientContent$TagPackage(){
       super();
       this.clear();
    }
    public static ClientContent$TagPackage[] emptyArray(){
       if (ClientContent$TagPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$TagPackage._emptyArray == null) {
             ClientContent$TagPackage[] tagPackageAr = new ClientContent$TagPackage[0];
             ClientContent$TagPackage._emptyArray = tagPackageAr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$TagPackage._emptyArray;
    }
    public static ClientContent$TagPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$TagPackage().mergeFrom(p0);
    }
    public static ClientContent$TagPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$TagPackage(), p0);
    }
    public ClientContent$TagPackage clear(){
       this.identity = "";
       this.name = "";
       this.expTag = "";
       this.index = 0;
       this.llsid = "";
       this.photoCount = 0;
       this.type = 0;
       this.photoPackage = ClientContent$PhotoPackage.emptyArray();
       this.secondaryType = "";
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
       if (!(this.name).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.name);
       }
       if (!(this.expTag).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.expTag);
       }
       ClientContent$TagPackage tindex = this.index;
       if (tindex) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tindex);
       }
       if (!(this.llsid).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.llsid);
       }
       tindex = this.photoCount;
       if (tindex) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tindex);
       }
       ClientContent$TagPackage ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(7, ttype);
       }
       ttype = this.photoPackage;
       if (ttype != null && ttype.length > 0) {
          int i1 = 0;
          tindex = this.photoPackage;
          while (i1 < tindex.length) {
             object oobject = tindex[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(8, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.secondaryType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.secondaryType);
       }
       if (!(this.params).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.params);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$TagPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.identity = p0.readString();
                break;
              case 18:
                this.name = p0.readString();
                break;
              case 26:
                this.expTag = p0.readString();
                break;
              case 32:
                this.index = p0.readUInt64();
                break;
              case '*':
                this.llsid = p0.readString();
                break;
              case '0':
                this.photoCount = p0.readUInt64();
                break;
              case '8':
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
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 1:
                      break;
                    default:
                }
                this.type = i;
                break;
              case 'B':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 66);
                ClientContent$TagPackage tphotoPackag = this.photoPackage;
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
              case 'J':
                this.secondaryType = p0.readString();
                break;
              case 'R':
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
       if (!(this.name).equals(str)) {
          p0.writeString(2, this.name);
       }
       if (!(this.expTag).equals(str)) {
          p0.writeString(3, this.expTag);
       }
       ClientContent$TagPackage tindex = this.index;
       if (tindex) {
          p0.writeUInt64(4, tindex);
       }
       if (!(this.llsid).equals(str)) {
          p0.writeString(5, this.llsid);
       }
       tindex = this.photoCount;
       if (tindex) {
          p0.writeUInt64(6, tindex);
       }
       ClientContent$TagPackage ttype = this.type;
       if (ttype != null) {
          p0.writeInt32(7, ttype);
       }
       ttype = this.photoPackage;
       if (ttype != null && ttype.length > 0) {
          int i = 0;
          tindex = this.photoPackage;
          while (i < tindex.length) {
             object oobject = tindex[i];
             if (oobject != null) {
                p0.writeMessage(8, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.secondaryType).equals(str)) {
          p0.writeString(9, this.secondaryType);
       }
       if (!(this.params).equals(str)) {
          p0.writeString(10, this.params);
       }
       super.writeTo(p0);
       return;
    }
}
