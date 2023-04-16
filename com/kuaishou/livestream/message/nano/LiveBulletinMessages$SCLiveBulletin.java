package com.kuaishou.livestream.message.nano.LiveBulletinMessages$SCLiveBulletin;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveBulletinMessages$LiveReservationLiteModel;
import java.lang.System;

public final class LiveBulletinMessages$SCLiveBulletin extends MessageNano	// class@001134
{
    public boolean autoCreate;
    public String bizType;
    public String bulletin;
    public long bulletinId;
    public String id;
    public LiveBulletinMessages$LiveReservationLiteModel liveReservation;
    public int reason;
    public String[] tag;
    public static LiveBulletinMessages$SCLiveBulletin[] _emptyArray;

    public void LiveBulletinMessages$SCLiveBulletin(){
       super();
       this.clear();
    }
    public static LiveBulletinMessages$SCLiveBulletin[] emptyArray(){
       if (LiveBulletinMessages$SCLiveBulletin._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveBulletinMessages$SCLiveBulletin._emptyArray == null) {
             LiveBulletinMessages$SCLiveBulletin[] sCLiveBullet = new LiveBulletinMessages$SCLiveBulletin[0];
             LiveBulletinMessages$SCLiveBulletin._emptyArray = sCLiveBullet;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveBulletinMessages$SCLiveBulletin._emptyArray;
    }
    public static LiveBulletinMessages$SCLiveBulletin parseFrom(CodedInputByteBufferNano p0){
       return new LiveBulletinMessages$SCLiveBulletin().mergeFrom(p0);
    }
    public static LiveBulletinMessages$SCLiveBulletin parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveBulletinMessages$SCLiveBulletin(), p0);
    }
    public LiveBulletinMessages$SCLiveBulletin clear(){
       this.tag = WireFormatNano.EMPTY_STRING_ARRAY;
       this.bulletin = "";
       this.reason = 0;
       this.bulletinId = 0;
       this.id = "";
       this.autoCreate = false;
       this.liveReservation = null;
       this.bizType = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveBulletinMessages$SCLiveBulletin ttag = this.tag;
       if (ttag != null && ttag.length > 0) {
          int i1 = 0;
          int i2 = 0;
          int i3 = 0;
          LiveBulletinMessages$SCLiveBulletin ttag1 = this.tag;
          while (i1 < ttag1.length) {
             object oobject = ttag1[i1];
             if (oobject != null) {
                i3 = i3 + 1;
                i2 = i2 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i1 = i1 + 1;
          }
          i = (i + i2) + (i3 * 1);
       }
       String str = "";
       if (!(this.bulletin).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.bulletin);
       }
       ttag = this.reason;
       if (ttag != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, ttag);
       }
       LiveBulletinMessages$SCLiveBulletin tbulletinId = this.bulletinId;
       if (tbulletinId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tbulletinId);
       }
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.id);
       }
       ttag = this.autoCreate;
       if (ttag != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(6, ttag);
       }
       ttag = this.liveReservation;
       if (ttag != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(7, ttag);
       }
       if (!(this.bizType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.bizType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveBulletinMessages$SCLiveBulletin mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 42) {
                         if (i != 48) {
                            if (i != 58) {
                               if (i != 66) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
                                  }
                               }else {
                                  this.bizType = p0.readString();
                               }
                            }else if(this.liveReservation == null){
                               this.liveReservation = new LiveBulletinMessages$LiveReservationLiteModel();
                            }
                            p0.readMessage(this.liveReservation);
                         }else {
                            this.autoCreate = p0.readBool();
                         }
                      }else {
                         this.id = p0.readString();
                      }
                   }else {
                      this.bulletinId = p0.readUInt64();
                   }
                }else {
                   i = p0.readInt32();
                   if (i && (i != 1 && i != 2)) {
                      continue ;
                   }else {
                      this.reason = i;
                   }
                }
             }else {
                this.bulletin = p0.readString();
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             LiveBulletinMessages$SCLiveBulletin ttag = this.tag;
             int i2 = (ttag == null)? 0: ttag.length;
             i = i + i2;
             String[] stringArray = new String[i];
             if (i2) {
                System.arraycopy(ttag, 0, stringArray, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                stringArray[i2] = p0.readString();
                p0.readTag();
                i2 = i2 + 1;
             }
             stringArray[i2] = p0.readString();
             this.tag = stringArray;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveBulletinMessages$SCLiveBulletin ttag = this.tag;
       if (ttag != null && ttag.length > 0) {
          int i = 0;
          LiveBulletinMessages$SCLiveBulletin ttag1 = this.tag;
          while (i < ttag1.length) {
             object oobject = ttag1[i];
             if (oobject != null) {
                p0.writeString(1, oobject);
             }
             i = i + 1;
          }
       }
       String str = "";
       if (!(this.bulletin).equals(str)) {
          p0.writeString(2, this.bulletin);
       }
       ttag = this.reason;
       if (ttag != null) {
          p0.writeInt32(3, ttag);
       }
       LiveBulletinMessages$SCLiveBulletin tbulletinId = this.bulletinId;
       if (tbulletinId) {
          p0.writeUInt64(4, tbulletinId);
       }
       if (!(this.id).equals(str)) {
          p0.writeString(5, this.id);
       }
       ttag = this.autoCreate;
       if (ttag != null) {
          p0.writeBool(6, ttag);
       }
       ttag = this.liveReservation;
       if (ttag != null) {
          p0.writeMessage(7, ttag);
       }
       if (!(this.bizType).equals(str)) {
          p0.writeString(8, this.bizType);
       }
       super.writeTo(p0);
       return;
    }
}
