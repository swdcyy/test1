package com.kuaishou.livestream.message.nano.LiveAttachGiftGuideConfigMessage$LiveAttachFastGiftConfigMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.String;
import java.lang.Object;
import java.lang.System;

public final class LiveAttachGiftGuideConfigMessage$LiveAttachFastGiftConfigMessage extends MessageNano	// class@0010fc
{
    public boolean enableDefaultSelectNotNotify;
    public int giftId;
    public String notNotifyText;
    public String[] sendGiftMsgKeys;
    public static LiveAttachGiftGuideConfigMessage$LiveAttachFastGiftConfigMessage[] _emptyArray;

    public void LiveAttachGiftGuideConfigMessage$LiveAttachFastGiftConfigMessage(){
       super();
       this.clear();
    }
    public static LiveAttachGiftGuideConfigMessage$LiveAttachFastGiftConfigMessage[] emptyArray(){
       if (LiveAttachGiftGuideConfigMessage$LiveAttachFastGiftConfigMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveAttachGiftGuideConfigMessage$LiveAttachFastGiftConfigMessage._emptyArray == null) {
             LiveAttachGiftGuideConfigMessage$LiveAttachFastGiftConfigMessage[] liveAttachFa = new LiveAttachGiftGuideConfigMessage$LiveAttachFastGiftConfigMessage[0];
             LiveAttachGiftGuideConfigMessage$LiveAttachFastGiftConfigMessage._emptyArray = liveAttachFa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveAttachGiftGuideConfigMessage$LiveAttachFastGiftConfigMessage._emptyArray;
    }
    public static LiveAttachGiftGuideConfigMessage$LiveAttachFastGiftConfigMessage parseFrom(CodedInputByteBufferNano p0){
       return new LiveAttachGiftGuideConfigMessage$LiveAttachFastGiftConfigMessage().mergeFrom(p0);
    }
    public static LiveAttachGiftGuideConfigMessage$LiveAttachFastGiftConfigMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveAttachGiftGuideConfigMessage$LiveAttachFastGiftConfigMessage(), p0);
    }
    public LiveAttachGiftGuideConfigMessage$LiveAttachFastGiftConfigMessage clear(){
       this.giftId = 0;
       this.sendGiftMsgKeys = WireFormatNano.EMPTY_STRING_ARRAY;
       this.notNotifyText = "";
       this.enableDefaultSelectNotNotify = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveAttachGiftGuideConfigMessage$LiveAttachFastGiftConfigMessage tgiftId = this.giftId;
       int i1 = 1;
       if (tgiftId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(i1, tgiftId);
       }
       tgiftId = this.sendGiftMsgKeys;
       if (tgiftId != null && tgiftId.length > 0) {
          int i2 = 0;
          int i3 = 0;
          int i4 = 0;
          LiveAttachGiftGuideConfigMessage$LiveAttachFastGiftConfigMessage tsendGiftMsg = this.sendGiftMsgKeys;
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
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.notNotifyText);
       }
       tgiftId = this.enableDefaultSelectNotNotify;
       if (tgiftId != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, tgiftId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveAttachGiftGuideConfigMessage$LiveAttachFastGiftConfigMessage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             int i1 = 18;
             if (i != i1) {
                if (i != 26) {
                   if (i != 32) {
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
                LiveAttachGiftGuideConfigMessage$LiveAttachFastGiftConfigMessage tsendGiftMsg = this.sendGiftMsgKeys;
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
             this.giftId = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveAttachGiftGuideConfigMessage$LiveAttachFastGiftConfigMessage tgiftId = this.giftId;
       if (tgiftId != null) {
          p0.writeUInt32(1, tgiftId);
       }
       tgiftId = this.sendGiftMsgKeys;
       if (tgiftId != null && tgiftId.length > 0) {
          int i = 0;
          LiveAttachGiftGuideConfigMessage$LiveAttachFastGiftConfigMessage tsendGiftMsg = this.sendGiftMsgKeys;
          while (i < tsendGiftMsg.length) {
             object oobject = tsendGiftMsg[i];
             if (oobject != null) {
                p0.writeString(2, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.notNotifyText).equals("")) {
          p0.writeString(3, this.notNotifyText);
       }
       tgiftId = this.enableDefaultSelectNotNotify;
       if (tgiftId != null) {
          p0.writeBool(4, tgiftId);
       }
       super.writeTo(p0);
       return;
    }
}
