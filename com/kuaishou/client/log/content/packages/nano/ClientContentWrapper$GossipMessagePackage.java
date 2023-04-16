package com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$GossipMessagePackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class ClientContentWrapper$GossipMessagePackage extends MessageNano	// class@001311
{
    public boolean aggregation;
    public int count;
    public boolean hasArrow;
    public String id;
    public int index;
    public ClientContent$PhotoPackage[] photoPackage;
    public String realtionType;
    public int type;
    public static ClientContentWrapper$GossipMessagePackage[] _emptyArray;

    public void ClientContentWrapper$GossipMessagePackage(){
       super();
       this.clear();
    }
    public static ClientContentWrapper$GossipMessagePackage[] emptyArray(){
       if (ClientContentWrapper$GossipMessagePackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContentWrapper$GossipMessagePackage._emptyArray == null) {
             ClientContentWrapper$GossipMessagePackage[] gossipMessag = new ClientContentWrapper$GossipMessagePackage[0];
             ClientContentWrapper$GossipMessagePackage._emptyArray = gossipMessag;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContentWrapper$GossipMessagePackage._emptyArray;
    }
    public static ClientContentWrapper$GossipMessagePackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContentWrapper$GossipMessagePackage().mergeFrom(p0);
    }
    public static ClientContentWrapper$GossipMessagePackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContentWrapper$GossipMessagePackage(), p0);
    }
    public ClientContentWrapper$GossipMessagePackage clear(){
       this.id = "";
       this.index = 0;
       this.aggregation = false;
       this.count = 0;
       this.type = 0;
       this.photoPackage = ClientContent$PhotoPackage.emptyArray();
       this.realtionType = "";
       this.hasArrow = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       ClientContentWrapper$GossipMessagePackage tindex = this.index;
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
       tindex = this.type;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, tindex);
       }
       tindex = this.photoPackage;
       if (tindex != null && tindex.length > 0) {
          int i1 = 0;
          ClientContentWrapper$GossipMessagePackage tphotoPackag = this.photoPackage;
          while (i1 < tphotoPackag.length) {
             object oobject = tphotoPackag[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(7, oobject);
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
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContentWrapper$GossipMessagePackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 48) {
                         int i1 = 58;
                         if (i != i1) {
                            if (i != 66) {
                               if (i != 72) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
                                  }
                               }else {
                                  this.hasArrow = p0.readBool();
                               }
                            }else {
                               this.realtionType = p0.readString();
                            }
                         }else {
                            i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                            ClientContentWrapper$GossipMessagePackage tphotoPackag = this.photoPackage;
                            int i2 = (tphotoPackag == null)? 0: tphotoPackag.length;
                            i = i + i2;
                            ClientContent$PhotoPackage[] photoPackage = new ClientContent$PhotoPackage[i];
                            if (i2) {
                               System.arraycopy(tphotoPackag, 0, photoPackage, 0, i2);
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
                             case 1:
                               break;
                             default:
                         }
                         this.type = i;
                      }
                   }else {
                      this.count = p0.readUInt32();
                   }
                }else {
                   this.aggregation = p0.readBool();
                }
             }else {
                this.index = p0.readUInt32();
             }
          }else {
             this.id = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.id).equals(str)) {
          p0.writeString(1, this.id);
       }
       ClientContentWrapper$GossipMessagePackage tindex = this.index;
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
       tindex = this.type;
       if (tindex != null) {
          p0.writeInt32(6, tindex);
       }
       tindex = this.photoPackage;
       if (tindex != null && tindex.length > 0) {
          int i = 0;
          ClientContentWrapper$GossipMessagePackage tphotoPackag = this.photoPackage;
          while (i < tphotoPackag.length) {
             object oobject = tphotoPackag[i];
             if (oobject != null) {
                p0.writeMessage(7, oobject);
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
       super.writeTo(p0);
       return;
    }
}
