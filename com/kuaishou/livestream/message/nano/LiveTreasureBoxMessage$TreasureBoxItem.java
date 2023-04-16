package com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$TreasureBoxItem;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$TreasureBoxSingleItemStyle;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$TreasureBoxStyleText;
import java.lang.Object;
import java.lang.System;

public final class LiveTreasureBoxMessage$TreasureBoxItem extends MessageNano	// class@0013b5
{
    public int count;
    public LiveTreasureBoxMessage$TreasureBoxStyleText countText;
    public UserInfos$PicUrl[] displayPict;
    public long itemId;
    public LiveTreasureBoxMessage$TreasureBoxSingleItemStyle singleItemStyle;
    public LiveTreasureBoxMessage$TreasureBoxStyleText unitText;
    public static LiveTreasureBoxMessage$TreasureBoxItem[] _emptyArray;

    public void LiveTreasureBoxMessage$TreasureBoxItem(){
       super();
       this.clear();
    }
    public static LiveTreasureBoxMessage$TreasureBoxItem[] emptyArray(){
       if (LiveTreasureBoxMessage$TreasureBoxItem._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveTreasureBoxMessage$TreasureBoxItem._emptyArray == null) {
             LiveTreasureBoxMessage$TreasureBoxItem[] treasureBoxI = new LiveTreasureBoxMessage$TreasureBoxItem[0];
             LiveTreasureBoxMessage$TreasureBoxItem._emptyArray = treasureBoxI;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveTreasureBoxMessage$TreasureBoxItem._emptyArray;
    }
    public static LiveTreasureBoxMessage$TreasureBoxItem parseFrom(CodedInputByteBufferNano p0){
       return new LiveTreasureBoxMessage$TreasureBoxItem().mergeFrom(p0);
    }
    public static LiveTreasureBoxMessage$TreasureBoxItem parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveTreasureBoxMessage$TreasureBoxItem(), p0);
    }
    public LiveTreasureBoxMessage$TreasureBoxItem clear(){
       this.itemId = 0;
       this.count = 0;
       this.displayPict = UserInfos$PicUrl.emptyArray();
       this.countText = null;
       this.unitText = null;
       this.singleItemStyle = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveTreasureBoxMessage$TreasureBoxItem titemId = this.itemId;
       if (titemId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, titemId);
       }
       titemId = this.count;
       if (titemId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, titemId);
       }
       titemId = this.displayPict;
       if (titemId != null && titemId.length > 0) {
          int i1 = 0;
          LiveTreasureBoxMessage$TreasureBoxItem tdisplayPict = this.displayPict;
          while (i1 < tdisplayPict.length) {
             object oobject = tdisplayPict[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       titemId = this.countText;
       if (titemId != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, titemId);
       }
       titemId = this.unitText;
       if (titemId != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(5, titemId);
       }
       titemId = this.singleItemStyle;
       if (titemId != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(6, titemId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveTreasureBoxMessage$TreasureBoxItem mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                int i1 = 26;
                if (i != i1) {
                   if (i != 34) {
                      if (i != 42) {
                         if (i != 50) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else if(this.singleItemStyle == null){
                            this.singleItemStyle = new LiveTreasureBoxMessage$TreasureBoxSingleItemStyle();
                         }
                         p0.readMessage(this.singleItemStyle);
                      }else if(this.unitText == null){
                         this.unitText = new LiveTreasureBoxMessage$TreasureBoxStyleText();
                      }
                      p0.readMessage(this.unitText);
                   }else if(this.countText == null){
                      this.countText = new LiveTreasureBoxMessage$TreasureBoxStyleText();
                   }
                   p0.readMessage(this.countText);
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   LiveTreasureBoxMessage$TreasureBoxItem tdisplayPict = this.displayPict;
                   int i2 = (tdisplayPict == null)? 0: tdisplayPict.length;
                   i = i + i2;
                   UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                   if (i2) {
                      System.arraycopy(tdisplayPict, 0, picUrlArray, 0, i2);
                   }
                   i1 = i - 1;
                   while (i2 < i1) {
                      picUrlArray[i2] = new UserInfos$PicUrl();
                      p0.readMessage(picUrlArray[i2]);
                      p0.readTag();
                      i2 = i2 + 1;
                   }
                   picUrlArray[i2] = new UserInfos$PicUrl();
                   p0.readMessage(picUrlArray[i2]);
                   this.displayPict = picUrlArray;
                }
             }else {
                this.count = p0.readUInt32();
             }
          }else {
             this.itemId = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveTreasureBoxMessage$TreasureBoxItem titemId = this.itemId;
       if (titemId) {
          p0.writeUInt64(1, titemId);
       }
       titemId = this.count;
       if (titemId != null) {
          p0.writeUInt32(2, titemId);
       }
       titemId = this.displayPict;
       if (titemId != null && titemId.length > 0) {
          int i = 0;
          LiveTreasureBoxMessage$TreasureBoxItem tdisplayPict = this.displayPict;
          while (i < tdisplayPict.length) {
             object oobject = tdisplayPict[i];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i = i + 1;
          }
       }
       titemId = this.countText;
       if (titemId != null) {
          p0.writeMessage(4, titemId);
       }
       titemId = this.unitText;
       if (titemId != null) {
          p0.writeMessage(5, titemId);
       }
       titemId = this.singleItemStyle;
       if (titemId != null) {
          p0.writeMessage(6, titemId);
       }
       super.writeTo(p0);
       return;
    }
}
