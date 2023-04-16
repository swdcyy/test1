package com.kuaishou.livestream.message.nano.LiveReservationStickerMessage$SCLiveReservationStickerUpdate;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveCdnNodeView;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveReservationStickerMessage$SCLiveReservationStickerUpdate extends MessageNano	// class@00128b
{
    public long authorId;
    public LiveCdnNodeView[] buttonIcon;
    public boolean disableCancelReservation;
    public LiveCdnNodeView[] displayBackgroundUrl;
    public String displayDay;
    public String displayReservedUserCount;
    public String displayReservedUserCountSuffix;
    public String displayTime;
    public boolean enableDisplayReserveButton;
    public int reservationActivityType;
    public String reservationId;
    public long reservedUserCount;
    public static LiveReservationStickerMessage$SCLiveReservationStickerUpdate[] _emptyArray;

    public void LiveReservationStickerMessage$SCLiveReservationStickerUpdate(){
       super();
       this.clear();
    }
    public static LiveReservationStickerMessage$SCLiveReservationStickerUpdate[] emptyArray(){
       if (LiveReservationStickerMessage$SCLiveReservationStickerUpdate._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveReservationStickerMessage$SCLiveReservationStickerUpdate._emptyArray == null) {
             LiveReservationStickerMessage$SCLiveReservationStickerUpdate[] sCLiveReserv = new LiveReservationStickerMessage$SCLiveReservationStickerUpdate[0];
             LiveReservationStickerMessage$SCLiveReservationStickerUpdate._emptyArray = sCLiveReserv;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveReservationStickerMessage$SCLiveReservationStickerUpdate._emptyArray;
    }
    public static LiveReservationStickerMessage$SCLiveReservationStickerUpdate parseFrom(CodedInputByteBufferNano p0){
       return new LiveReservationStickerMessage$SCLiveReservationStickerUpdate().mergeFrom(p0);
    }
    public static LiveReservationStickerMessage$SCLiveReservationStickerUpdate parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveReservationStickerMessage$SCLiveReservationStickerUpdate(), p0);
    }
    public LiveReservationStickerMessage$SCLiveReservationStickerUpdate clear(){
       this.reservationId = "";
       this.displayTime = "";
       this.displayDay = "";
       this.reservedUserCount = 0;
       this.displayReservedUserCount = "";
       this.displayReservedUserCountSuffix = "";
       this.enableDisplayReserveButton = false;
       this.disableCancelReservation = false;
       this.displayBackgroundUrl = LiveCdnNodeView.emptyArray();
       this.reservationActivityType = 0;
       this.authorId = 0;
       this.buttonIcon = LiveCdnNodeView.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.reservationId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.reservationId);
       }
       if (!(this.displayTime).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.displayTime);
       }
       if (!(this.displayDay).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.displayDay);
       }
       LiveReservationStickerMessage$SCLiveReservationStickerUpdate treservedUse = this.reservedUserCount;
       if (treservedUse) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, treservedUse);
       }
       if (!(this.displayReservedUserCount).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.displayReservedUserCount);
       }
       if (!(this.displayReservedUserCountSuffix).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.displayReservedUserCountSuffix);
       }
       LiveReservationStickerMessage$SCLiveReservationStickerUpdate tenableDispl = this.enableDisplayReserveButton;
       if (tenableDispl != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(7, tenableDispl);
       }
       tenableDispl = this.disableCancelReservation;
       if (tenableDispl != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(8, tenableDispl);
       }
       tenableDispl = this.displayBackgroundUrl;
       int i1 = 0;
       if (tenableDispl != null && tenableDispl.length > 0) {
          int i2 = 0;
          treservedUse = this.displayBackgroundUrl;
          while (i2 < treservedUse.length) {
             object oobject = treservedUse[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(9, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tenableDispl = this.reservationActivityType;
       if (tenableDispl != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(10, tenableDispl);
       }
       treservedUse = this.authorId;
       if (treservedUse) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(11, treservedUse);
       }
       tenableDispl = this.buttonIcon;
       if (tenableDispl != null && tenableDispl.length > 0) {
          tenableDispl = this.buttonIcon;
          while (i1 < tenableDispl.length) {
             object oobject1 = tenableDispl[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(12, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveReservationStickerMessage$SCLiveReservationStickerUpdate mergeFrom(CodedInputByteBufferNano p0){
       LiveReservationStickerMessage$SCLiveReservationStickerUpdate tdisplayBack;
       int i2;
       LiveCdnNodeView[] liveCdnNodeV;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 10:
                this.reservationId = p0.readString();
                break;
              case 18:
                this.displayTime = p0.readString();
                break;
              case 26:
                this.displayDay = p0.readString();
                break;
              case 32:
                this.reservedUserCount = p0.readUInt64();
                break;
              case '*':
                this.displayReservedUserCount = p0.readString();
                break;
              case '2':
                this.displayReservedUserCountSuffix = p0.readString();
                break;
              case '8':
                this.enableDisplayReserveButton = p0.readBool();
                break;
              case '@':
                this.disableCancelReservation = p0.readBool();
                break;
              case 'J':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 74);
                tdisplayBack = this.displayBackgroundUrl;
                i2 = (tdisplayBack == null)? 0: tdisplayBack.length;
                i = i + i2;
                liveCdnNodeV = new LiveCdnNodeView[i];
                if (i2) {
                   System.arraycopy(tdisplayBack, i1, liveCdnNodeV, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   liveCdnNodeV[i2] = new LiveCdnNodeView();
                   p0.readMessage(liveCdnNodeV[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                liveCdnNodeV[i2] = new LiveCdnNodeView();
                p0.readMessage(liveCdnNodeV[i2]);
                this.displayBackgroundUrl = liveCdnNodeV;
                break;
              case 'P':
                i = p0.readInt32();
                if (i && i != 1) {
                   continue ;
                }else {
                   this.reservationActivityType = i;
                }
                break;
              case 'X':
                this.authorId = p0.readUInt64();
                break;
              case 'b':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 98);
                tdisplayBack = this.buttonIcon;
                i2 = (tdisplayBack == null)? 0: tdisplayBack.length;
                i = i + i2;
                liveCdnNodeV = new LiveCdnNodeView[i];
                if (i2) {
                   System.arraycopy(tdisplayBack, i1, liveCdnNodeV, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   liveCdnNodeV[i2] = new LiveCdnNodeView();
                   p0.readMessage(liveCdnNodeV[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                liveCdnNodeV[i2] = new LiveCdnNodeView();
                p0.readMessage(liveCdnNodeV[i2]);
                this.buttonIcon = liveCdnNodeV;
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
       if (!(this.reservationId).equals(str)) {
          p0.writeString(1, this.reservationId);
       }
       if (!(this.displayTime).equals(str)) {
          p0.writeString(2, this.displayTime);
       }
       if (!(this.displayDay).equals(str)) {
          p0.writeString(3, this.displayDay);
       }
       LiveReservationStickerMessage$SCLiveReservationStickerUpdate treservedUse = this.reservedUserCount;
       if (treservedUse) {
          p0.writeUInt64(4, treservedUse);
       }
       if (!(this.displayReservedUserCount).equals(str)) {
          p0.writeString(5, this.displayReservedUserCount);
       }
       if (!(this.displayReservedUserCountSuffix).equals(str)) {
          p0.writeString(6, this.displayReservedUserCountSuffix);
       }
       LiveReservationStickerMessage$SCLiveReservationStickerUpdate tenableDispl = this.enableDisplayReserveButton;
       if (tenableDispl != null) {
          p0.writeBool(7, tenableDispl);
       }
       tenableDispl = this.disableCancelReservation;
       if (tenableDispl != null) {
          p0.writeBool(8, tenableDispl);
       }
       tenableDispl = this.displayBackgroundUrl;
       int i = 0;
       if (tenableDispl != null && tenableDispl.length > 0) {
          int i1 = 0;
          treservedUse = this.displayBackgroundUrl;
          while (i1 < treservedUse.length) {
             object oobject = treservedUse[i1];
             if (oobject != null) {
                p0.writeMessage(9, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tenableDispl = this.reservationActivityType;
       if (tenableDispl != null) {
          p0.writeInt32(10, tenableDispl);
       }
       treservedUse = this.authorId;
       if (treservedUse) {
          p0.writeUInt64(11, treservedUse);
       }
       tenableDispl = this.buttonIcon;
       if (tenableDispl != null && tenableDispl.length > 0) {
          tenableDispl = this.buttonIcon;
          while (i < tenableDispl.length) {
             object oobject1 = tenableDispl[i];
             if (oobject1 != null) {
                p0.writeMessage(12, oobject1);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
