package com.kuaishou.protobuf.livestream.nano.PkAttachGiftInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import java.lang.System;

public final class PkAttachGiftInfo extends MessageNano	// class@000d2e
{
    public boolean enableDefaultSelectNotNotify;
    public int giftId;
    public String giftToken;
    public String notNotifyText;
    public String recoGiftLlsid;
    public String[] sendGiftMsgKeys;
    public static PkAttachGiftInfo[] _emptyArray;

    public void PkAttachGiftInfo(){
       super();
       this.clear();
    }
    public static PkAttachGiftInfo[] emptyArray(){
       if (PkAttachGiftInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (PkAttachGiftInfo._emptyArray == null) {
             PkAttachGiftInfo[] pkAttachGift = new PkAttachGiftInfo[0];
             PkAttachGiftInfo._emptyArray = pkAttachGift;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return PkAttachGiftInfo._emptyArray;
    }
    public static PkAttachGiftInfo parseFrom(CodedInputByteBufferNano p0){
       return new PkAttachGiftInfo().mergeFrom(p0);
    }
    public static PkAttachGiftInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new PkAttachGiftInfo(), p0);
    }
    public PkAttachGiftInfo clear(){
       this.giftId = 0;
       this.giftToken = "";
       this.recoGiftLlsid = "";
       this.sendGiftMsgKeys = WireFormatNano.EMPTY_STRING_ARRAY;
       this.notNotifyText = "";
       this.enableDefaultSelectNotNotify = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       PkAttachGiftInfo tgiftId = this.giftId;
       int i1 = 1;
       if (tgiftId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(i1, tgiftId);
       }
       if (!(this.giftToken).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.giftToken);
       }
       if (!(this.recoGiftLlsid).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.recoGiftLlsid);
       }
       tgiftId = this.sendGiftMsgKeys;
       if (tgiftId != null && tgiftId.length > 0) {
          int i2 = 0;
          int i3 = 0;
          int i4 = 0;
          PkAttachGiftInfo tsendGiftMsg = this.sendGiftMsgKeys;
          while (i2 < tsendGiftMsg.length) {
             object oobject = tsendGiftMsg[i2];
             if (oobject != null) {
                i4 = i4 + 1;
                i3 = i3 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i2 = i2 + 1;
          }
          i = (i + i3) + (i4 * 1);
       }
       if (!(this.notNotifyText).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.notNotifyText);
       }
       tgiftId = this.enableDefaultSelectNotNotify;
       if (tgiftId != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(6, tgiftId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public PkAttachGiftInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   int i1 = 34;
                   if (i != i1) {
                      if (i != 42) {
                         if (i != 48) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.enableDefaultSelectNotNotify = p0.readBool();
                         }
                      }else {
                         this.notNotifyText = p0.readString();
                      }
                   }else {
                      i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                      PkAttachGiftInfo tsendGiftMsg = this.sendGiftMsgKeys;
                      int i2 = (tsendGiftMsg == null)? 0: tsendGiftMsg.length;
                      i = i + i2;
                      String[] stringArray = new String[i];
                      if (i2) {
                         System.arraycopy(tsendGiftMsg, 0, stringArray, 0, i2);
                      }
                      i1 = i - 1;
                      while (i2 < i1) {
                         stringArray[i2] = p0.readString();
                         p0.readTag();
                         i2 = i2 + 1;
                      }
                      stringArray[i2] = p0.readString();
                      this.sendGiftMsgKeys = stringArray;
                   }
                }else {
                   this.recoGiftLlsid = p0.readString();
                }
             }else {
                this.giftToken = p0.readString();
             }
          }else {
             this.giftId = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       PkAttachGiftInfo tgiftId = this.giftId;
       if (tgiftId != null) {
          p0.writeUInt32(1, tgiftId);
       }
       String str = "";
       if (!(this.giftToken).equals(str)) {
          p0.writeString(2, this.giftToken);
       }
       if (!(this.recoGiftLlsid).equals(str)) {
          p0.writeString(3, this.recoGiftLlsid);
       }
       tgiftId = this.sendGiftMsgKeys;
       if (tgiftId != null && tgiftId.length > 0) {
          int i = 0;
          PkAttachGiftInfo tsendGiftMsg = this.sendGiftMsgKeys;
          while (i < tsendGiftMsg.length) {
             object oobject = tsendGiftMsg[i];
             if (oobject != null) {
                p0.writeString(4, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.notNotifyText).equals(str)) {
          p0.writeString(5, this.notNotifyText);
       }
       tgiftId = this.enableDefaultSelectNotNotify;
       if (tgiftId != null) {
          p0.writeBool(6, tgiftId);
       }
       super.writeTo(p0);
       return;
    }
}
