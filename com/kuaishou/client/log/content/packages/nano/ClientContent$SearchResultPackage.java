package com.kuaishou.client.log.content.packages.nano.ClientContent$SearchResultPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$IMPersonalSessionPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$IMGroupSessionPackage;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class ClientContent$SearchResultPackage extends MessageNano	// class@0012db
{
    public boolean allowToCollect;
    public String contentId;
    public int contentType;
    public int count;
    public String expTag;
    public boolean followUser;
    public ClientContent$IMGroupSessionPackage[] imGroupSessionPackage;
    public ClientContent$IMPersonalSessionPackage[] imPersonalSessionPackage;
    public String keyword;
    public String llsid;
    public String musicType;
    public String name;
    public ClientContent$PhotoPackage[] photoPackage;
    public int position;
    public String secondaryType;
    public long showTime;
    public int type;
    public static ClientContent$SearchResultPackage[] _emptyArray;

    public void ClientContent$SearchResultPackage(){
       super();
       this.clear();
    }
    public static ClientContent$SearchResultPackage[] emptyArray(){
       if (ClientContent$SearchResultPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$SearchResultPackage._emptyArray == null) {
             ClientContent$SearchResultPackage[] searchResult = new ClientContent$SearchResultPackage[0];
             ClientContent$SearchResultPackage._emptyArray = searchResult;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$SearchResultPackage._emptyArray;
    }
    public static ClientContent$SearchResultPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$SearchResultPackage().mergeFrom(p0);
    }
    public static ClientContent$SearchResultPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$SearchResultPackage(), p0);
    }
    public ClientContent$SearchResultPackage clear(){
       this.contentId = "";
       this.position = 0;
       this.contentType = 0;
       this.keyword = "";
       this.type = 0;
       this.name = "";
       this.expTag = "";
       this.llsid = "";
       this.count = 0;
       this.photoPackage = ClientContent$PhotoPackage.emptyArray();
       this.musicType = "";
       this.allowToCollect = false;
       this.secondaryType = "";
       this.followUser = false;
       this.imPersonalSessionPackage = ClientContent$IMPersonalSessionPackage.emptyArray();
       this.imGroupSessionPackage = ClientContent$IMGroupSessionPackage.emptyArray();
       this.showTime = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.contentId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.contentId);
       }
       ClientContent$SearchResultPackage tposition = this.position;
       if (tposition != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tposition);
       }
       tposition = this.contentType;
       if (tposition != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tposition);
       }
       if (!(this.keyword).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.keyword);
       }
       tposition = this.type;
       if (tposition != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tposition);
       }
       if (!(this.name).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.name);
       }
       if (!(this.expTag).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.expTag);
       }
       if (!(this.llsid).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.llsid);
       }
       tposition = this.count;
       if (tposition != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(9, tposition);
       }
       tposition = this.photoPackage;
       int i1 = 0;
       if (tposition != null && tposition.length > 0) {
          i2 = 0;
          ClientContent$SearchResultPackage tphotoPackag = this.photoPackage;
          while (i2 < tphotoPackag.length) {
             object oobject = tphotoPackag[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(10, oobject);
             }
             i2 = i2 + 1;
          }
       }
       if (!(this.musicType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.musicType);
       }
       tposition = this.allowToCollect;
       if (tposition != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(12, tposition);
       }
       if (!(this.secondaryType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(13, this.secondaryType);
       }
       tposition = this.followUser;
       if (tposition != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(14, tposition);
       }
       tposition = this.imPersonalSessionPackage;
       if (tposition != null && tposition.length > 0) {
          i2 = 0;
          ClientContent$SearchResultPackage timPersonalS = this.imPersonalSessionPackage;
          while (i2 < timPersonalS.length) {
             object oobject1 = timPersonalS[i2];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(15, oobject1);
             }
             i2 = i2 + 1;
          }
       }
       tposition = this.imGroupSessionPackage;
       if (tposition != null && tposition.length > 0) {
          tposition = this.imGroupSessionPackage;
          while (i1 < tposition.length) {
             object oobject2 = tposition[i1];
             if (oobject2 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(16, oobject2);
             }
             i1 = i1 + 1;
          }
       }
       tposition = this.showTime;
       if (tposition) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(17, tposition);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$SearchResultPackage mergeFrom(CodedInputByteBufferNano p0){
       ClientContent$SearchResultPackage tphotoPackag;
       int i2;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 10:
                this.contentId = p0.readString();
                break;
              case 16:
                this.position = p0.readUInt32();
                break;
              case 24:
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
                    case 1:
                      break;
                    default:
                }
                this.contentType = i;
                break;
              case '"':
                this.keyword = p0.readString();
                break;
              case '(':
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
                    case 1:
                      break;
                    default:
                }
                this.type = i;
                break;
              case '2':
                this.name = p0.readString();
                break;
              case ':':
                this.expTag = p0.readString();
                break;
              case 'B':
                this.llsid = p0.readString();
                break;
              case 'H':
                this.count = p0.readUInt32();
                break;
              case 'R':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 82);
                tphotoPackag = this.photoPackage;
                i2 = (tphotoPackag == null)? 0: tphotoPackag.length;
                i = i + i2;
                ClientContent$PhotoPackage[] photoPackage = new ClientContent$PhotoPackage[i];
                if (i2) {
                   System.arraycopy(tphotoPackag, i1, photoPackage, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   photoPackage[i2] = new ClientContent$PhotoPackage();
                   p0.readMessage(photoPackage[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                photoPackage[i2] = new ClientContent$PhotoPackage();
                p0.readMessage(photoPackage[i2]);
                this.photoPackage = photoPackage;
                break;
              case 'Z':
                this.musicType = p0.readString();
                break;
              case '`':
                this.allowToCollect = p0.readBool();
                break;
              case 'j':
                this.secondaryType = p0.readString();
                break;
              case 'p':
                this.followUser = p0.readBool();
                break;
              case 'z':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 122);
                tphotoPackag = this.imPersonalSessionPackage;
                i2 = (tphotoPackag == null)? 0: tphotoPackag.length;
                i = i + i2;
                ClientContent$IMPersonalSessionPackage[] iMPersonalSe = new ClientContent$IMPersonalSessionPackage[i];
                if (i2) {
                   System.arraycopy(tphotoPackag, i1, iMPersonalSe, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   iMPersonalSe[i2] = new ClientContent$IMPersonalSessionPackage();
                   p0.readMessage(iMPersonalSe[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                iMPersonalSe[i2] = new ClientContent$IMPersonalSessionPackage();
                p0.readMessage(iMPersonalSe[i2]);
                this.imPersonalSessionPackage = iMPersonalSe;
                break;
              case 130:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 130);
                tphotoPackag = this.imGroupSessionPackage;
                i2 = (tphotoPackag == null)? 0: tphotoPackag.length;
                i = i + i2;
                ClientContent$IMGroupSessionPackage[] iMGroupSessi = new ClientContent$IMGroupSessionPackage[i];
                if (i2) {
                   System.arraycopy(tphotoPackag, i1, iMGroupSessi, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   iMGroupSessi[i2] = new ClientContent$IMGroupSessionPackage();
                   p0.readMessage(iMGroupSessi[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                iMGroupSessi[i2] = new ClientContent$IMGroupSessionPackage();
                p0.readMessage(iMGroupSessi[i2]);
                this.imGroupSessionPackage = iMGroupSessi;
                break;
              case 136:
                this.showTime = p0.readUInt64();
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
       int i1;
       String str = "";
       if (!(this.contentId).equals(str)) {
          p0.writeString(1, this.contentId);
       }
       ClientContent$SearchResultPackage tposition = this.position;
       if (tposition != null) {
          p0.writeUInt32(2, tposition);
       }
       tposition = this.contentType;
       if (tposition != null) {
          p0.writeInt32(3, tposition);
       }
       if (!(this.keyword).equals(str)) {
          p0.writeString(4, this.keyword);
       }
       tposition = this.type;
       if (tposition != null) {
          p0.writeInt32(5, tposition);
       }
       if (!(this.name).equals(str)) {
          p0.writeString(6, this.name);
       }
       if (!(this.expTag).equals(str)) {
          p0.writeString(7, this.expTag);
       }
       if (!(this.llsid).equals(str)) {
          p0.writeString(8, this.llsid);
       }
       tposition = this.count;
       if (tposition != null) {
          p0.writeUInt32(9, tposition);
       }
       tposition = this.photoPackage;
       int i = 0;
       if (tposition != null && tposition.length > 0) {
          i1 = 0;
          ClientContent$SearchResultPackage tphotoPackag = this.photoPackage;
          while (i1 < tphotoPackag.length) {
             object oobject = tphotoPackag[i1];
             if (oobject != null) {
                p0.writeMessage(10, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.musicType).equals(str)) {
          p0.writeString(11, this.musicType);
       }
       tposition = this.allowToCollect;
       if (tposition != null) {
          p0.writeBool(12, tposition);
       }
       if (!(this.secondaryType).equals(str)) {
          p0.writeString(13, this.secondaryType);
       }
       tposition = this.followUser;
       if (tposition != null) {
          p0.writeBool(14, tposition);
       }
       tposition = this.imPersonalSessionPackage;
       if (tposition != null && tposition.length > 0) {
          i1 = 0;
          ClientContent$SearchResultPackage timPersonalS = this.imPersonalSessionPackage;
          while (i1 < timPersonalS.length) {
             object oobject1 = timPersonalS[i1];
             if (oobject1 != null) {
                p0.writeMessage(15, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       tposition = this.imGroupSessionPackage;
       if (tposition != null && tposition.length > 0) {
          tposition = this.imGroupSessionPackage;
          while (i < tposition.length) {
             object oobject2 = tposition[i];
             if (oobject2 != null) {
                p0.writeMessage(16, oobject2);
             }
             i = i + 1;
          }
       }
       tposition = this.showTime;
       if (tposition) {
          p0.writeUInt64(17, tposition);
       }
       super.writeTo(p0);
       return;
    }
}
