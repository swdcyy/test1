package com.kuaishou.livestream.message.nano.LiveLineChatMessages$LiveLineChatPayInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveColorTextMessages$LiveColorText;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveLineChatMessages$LiveLineChatPayInfo extends MessageNano	// class@0011dc
{
    public String acceptButtonTips;
    public LiveColorTextMessages$LiveColorText[] acceptNotice;
    public boolean highFans;
    public long inviteePayAmount;
    public long inviterPayAmount;
    public String payBudgetPopUpTips;
    public String payNotice;
    public int payType;
    public String payUrl;
    public boolean shopLive;
    public static LiveLineChatMessages$LiveLineChatPayInfo[] _emptyArray;

    public void LiveLineChatMessages$LiveLineChatPayInfo(){
       super();
       this.clear();
    }
    public static LiveLineChatMessages$LiveLineChatPayInfo[] emptyArray(){
       if (LiveLineChatMessages$LiveLineChatPayInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveLineChatMessages$LiveLineChatPayInfo._emptyArray == null) {
             LiveLineChatMessages$LiveLineChatPayInfo[] liveLineChat = new LiveLineChatMessages$LiveLineChatPayInfo[0];
             LiveLineChatMessages$LiveLineChatPayInfo._emptyArray = liveLineChat;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveLineChatMessages$LiveLineChatPayInfo._emptyArray;
    }
    public static LiveLineChatMessages$LiveLineChatPayInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveLineChatMessages$LiveLineChatPayInfo().mergeFrom(p0);
    }
    public static LiveLineChatMessages$LiveLineChatPayInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveLineChatMessages$LiveLineChatPayInfo(), p0);
    }
    public LiveLineChatMessages$LiveLineChatPayInfo clear(){
       this.acceptButtonTips = "";
       this.payNotice = "";
       this.payType = 0;
       this.inviterPayAmount = 0;
       this.inviteePayAmount = 0;
       this.acceptNotice = LiveColorTextMessages$LiveColorText.emptyArray();
       this.payUrl = "";
       this.highFans = false;
       this.shopLive = false;
       this.payBudgetPopUpTips = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.acceptButtonTips).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.acceptButtonTips);
       }
       if (!(this.payNotice).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.payNotice);
       }
       LiveLineChatMessages$LiveLineChatPayInfo tpayType = this.payType;
       if (tpayType != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tpayType);
       }
       LiveLineChatMessages$LiveLineChatPayInfo tinviterPayA = this.inviterPayAmount;
       if (tinviterPayA) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tinviterPayA);
       }
       tinviterPayA = this.inviteePayAmount;
       if (tinviterPayA) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tinviterPayA);
       }
       tpayType = this.acceptNotice;
       if (tpayType != null && tpayType.length > 0) {
          int i1 = 0;
          tinviterPayA = this.acceptNotice;
          while (i1 < tinviterPayA.length) {
             object oobject = tinviterPayA[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(6, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.payUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.payUrl);
       }
       tpayType = this.highFans;
       if (tpayType != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(8, tpayType);
       }
       tpayType = this.shopLive;
       if (tpayType != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(9, tpayType);
       }
       if (!(this.payBudgetPopUpTips).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.payBudgetPopUpTips);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveLineChatMessages$LiveLineChatPayInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.acceptButtonTips = p0.readString();
                break;
              case 18:
                this.payNotice = p0.readString();
                break;
              case 24:
                this.payType = p0.readUInt32();
                break;
              case 32:
                this.inviterPayAmount = p0.readUInt64();
                break;
              case '(':
                this.inviteePayAmount = p0.readUInt64();
                break;
              case '2':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 50);
                LiveLineChatMessages$LiveLineChatPayInfo tacceptNotic = this.acceptNotice;
                int i1 = (tacceptNotic == null)? 0: tacceptNotic.length;
                i = i + i1;
                LiveColorTextMessages$LiveColorText[] liveColorTex = new LiveColorTextMessages$LiveColorText[i];
                if (i1) {
                   System.arraycopy(tacceptNotic, 0, liveColorTex, 0, i1);
                }
                int i2 = i - 1;
                while (i1 < i2) {
                   liveColorTex[i1] = new LiveColorTextMessages$LiveColorText();
                   p0.readMessage(liveColorTex[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                liveColorTex[i1] = new LiveColorTextMessages$LiveColorText();
                p0.readMessage(liveColorTex[i1]);
                this.acceptNotice = liveColorTex;
                break;
              case ':':
                this.payUrl = p0.readString();
                break;
              case '@':
                this.highFans = p0.readBool();
                break;
              case 'H':
                this.shopLive = p0.readBool();
                break;
              case 'R':
                this.payBudgetPopUpTips = p0.readString();
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
       if (!(this.acceptButtonTips).equals(str)) {
          p0.writeString(1, this.acceptButtonTips);
       }
       if (!(this.payNotice).equals(str)) {
          p0.writeString(2, this.payNotice);
       }
       LiveLineChatMessages$LiveLineChatPayInfo tpayType = this.payType;
       if (tpayType != null) {
          p0.writeUInt32(3, tpayType);
       }
       LiveLineChatMessages$LiveLineChatPayInfo tinviterPayA = this.inviterPayAmount;
       if (tinviterPayA) {
          p0.writeUInt64(4, tinviterPayA);
       }
       tinviterPayA = this.inviteePayAmount;
       if (tinviterPayA) {
          p0.writeUInt64(5, tinviterPayA);
       }
       tpayType = this.acceptNotice;
       if (tpayType != null && tpayType.length > 0) {
          int i = 0;
          tinviterPayA = this.acceptNotice;
          while (i < tinviterPayA.length) {
             object oobject = tinviterPayA[i];
             if (oobject != null) {
                p0.writeMessage(6, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.payUrl).equals(str)) {
          p0.writeString(7, this.payUrl);
       }
       tpayType = this.highFans;
       if (tpayType != null) {
          p0.writeBool(8, tpayType);
       }
       tpayType = this.shopLive;
       if (tpayType != null) {
          p0.writeBool(9, tpayType);
       }
       if (!(this.payBudgetPopUpTips).equals(str)) {
          p0.writeString(10, this.payBudgetPopUpTips);
       }
       super.writeTo(p0);
       return;
    }
}
