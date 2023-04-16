package com.kuaishou.client.log.content.packages.nano.ClientContent$GossipMessagePackageV2;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserStatusPackageV2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class ClientContent$GossipMessagePackageV2 extends MessageNano	// class@001248
{
    public String aggregate;
    public boolean aggregation;
    public int count;
    public String extParams;
    public boolean hasArrow;
    public String id;
    public int index;
    public ClientContent$PhotoPackage[] photoPackage;
    public String realtionType;
    public int type;
    public String unread;
    public ClientContent$UserStatusPackageV2[] userStatusPackage;
    public static ClientContent$GossipMessagePackageV2[] _emptyArray;

    public void ClientContent$GossipMessagePackageV2(){
       super();
       this.clear();
    }
    public static ClientContent$GossipMessagePackageV2[] emptyArray(){
       if (ClientContent$GossipMessagePackageV2._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$GossipMessagePackageV2._emptyArray == null) {
             ClientContent$GossipMessagePackageV2[] gossipMessag = new ClientContent$GossipMessagePackageV2[0];
             ClientContent$GossipMessagePackageV2._emptyArray = gossipMessag;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$GossipMessagePackageV2._emptyArray;
    }
    public static ClientContent$GossipMessagePackageV2 parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$GossipMessagePackageV2().mergeFrom(p0);
    }
    public static ClientContent$GossipMessagePackageV2 parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$GossipMessagePackageV2(), p0);
    }
    public ClientContent$GossipMessagePackageV2 clear(){
       this.id = "";
       this.index = 0;
       this.aggregation = false;
       this.count = 0;
       this.userStatusPackage = ClientContent$UserStatusPackageV2.emptyArray();
       this.type = 0;
       this.photoPackage = ClientContent$PhotoPackage.emptyArray();
       this.realtionType = "";
       this.hasArrow = false;
       this.unread = "";
       this.extParams = "";
       this.aggregate = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       ClientContent$GossipMessagePackageV2 tindex = this.index;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tindex);
       }
       tindex = this.aggregation;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, tindex);
       }
       tindex = this.count;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tindex);
       }
       tindex = this.userStatusPackage;
       int i1 = 0;
       if (tindex != null && tindex.length > 0) {
          int i2 = 0;
          ClientContent$GossipMessagePackageV2 tuserStatusP = this.userStatusPackage;
          while (i2 < tuserStatusP.length) {
             object oobject = tuserStatusP[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(5, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tindex = this.type;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, tindex);
       }
       tindex = this.photoPackage;
       if (tindex != null && tindex.length > 0) {
          tindex = this.photoPackage;
          while (i1 < tindex.length) {
             object oobject1 = tindex[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(7, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.realtionType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.realtionType);
       }
       tindex = this.hasArrow;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(9, tindex);
       }
       if (!(this.unread).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.unread);
       }
       if (!(this.extParams).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.extParams);
       }
       if (!(this.aggregate).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.aggregate);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$GossipMessagePackageV2 mergeFrom(CodedInputByteBufferNano p0){
       ClientContent$GossipMessagePackageV2 tuserStatusP;
       int i2;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 10:
                this.id = p0.readString();
                break;
              case 16:
                this.index = p0.readUInt32();
                break;
              case 24:
                this.aggregation = p0.readBool();
                break;
              case 32:
                this.count = p0.readUInt32();
                break;
              case '*':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 42);
                tuserStatusP = this.userStatusPackage;
                i2 = (tuserStatusP == null)? 0: tuserStatusP.length;
                i = i + i2;
                ClientContent$UserStatusPackageV2[] userStatusPa = new ClientContent$UserStatusPackageV2[i];
                if (i2) {
                   System.arraycopy(tuserStatusP, i1, userStatusPa, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   userStatusPa[i2] = new ClientContent$UserStatusPackageV2();
                   p0.readMessage(userStatusPa[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                userStatusPa[i2] = new ClientContent$UserStatusPackageV2();
                p0.readMessage(userStatusPa[i2]);
                this.userStatusPackage = userStatusPa;
                break;
              case '0':
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
                    case 1:
                      break;
                    default:
                }
                this.type = i;
                break;
              case ':':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 58);
                tuserStatusP = this.photoPackage;
                i2 = (tuserStatusP == null)? 0: tuserStatusP.length;
                i = i + i2;
                ClientContent$PhotoPackage[] photoPackage = new ClientContent$PhotoPackage[i];
                if (i2) {
                   System.arraycopy(tuserStatusP, i1, photoPackage, i1, i2);
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
              case 'B':
                this.realtionType = p0.readString();
                break;
              case 'H':
                this.hasArrow = p0.readBool();
                break;
              case 'R':
                this.unread = p0.readString();
                break;
              case 'Z':
                this.extParams = p0.readString();
                break;
              case 'b':
                this.aggregate = p0.readString();
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
       if (!(this.id).equals(str)) {
          p0.writeString(1, this.id);
       }
       ClientContent$GossipMessagePackageV2 tindex = this.index;
       if (tindex != null) {
          p0.writeUInt32(2, tindex);
       }
       tindex = this.aggregation;
       if (tindex != null) {
          p0.writeBool(3, tindex);
       }
       tindex = this.count;
       if (tindex != null) {
          p0.writeUInt32(4, tindex);
       }
       tindex = this.userStatusPackage;
       int i = 0;
       if (tindex != null && tindex.length > 0) {
          int i1 = 0;
          ClientContent$GossipMessagePackageV2 tuserStatusP = this.userStatusPackage;
          while (i1 < tuserStatusP.length) {
             object oobject = tuserStatusP[i1];
             if (oobject != null) {
                p0.writeMessage(5, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tindex = this.type;
       if (tindex != null) {
          p0.writeInt32(6, tindex);
       }
       tindex = this.photoPackage;
       if (tindex != null && tindex.length > 0) {
          tindex = this.photoPackage;
          while (i < tindex.length) {
             object oobject1 = tindex[i];
             if (oobject1 != null) {
                p0.writeMessage(7, oobject1);
             }
             i = i + 1;
          }
       }
       if (!(this.realtionType).equals(str)) {
          p0.writeString(8, this.realtionType);
       }
       tindex = this.hasArrow;
       if (tindex != null) {
          p0.writeBool(9, tindex);
       }
       if (!(this.unread).equals(str)) {
          p0.writeString(10, this.unread);
       }
       if (!(this.extParams).equals(str)) {
          p0.writeString(11, this.extParams);
       }
       if (!(this.aggregate).equals(str)) {
          p0.writeString(12, this.aggregate);
       }
       super.writeTo(p0);
       return;
    }
}
