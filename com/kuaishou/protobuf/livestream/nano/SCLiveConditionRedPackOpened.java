package com.kuaishou.protobuf.livestream.nano.SCLiveConditionRedPackOpened;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.DisplayWinnerUser;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class SCLiveConditionRedPackOpened extends MessageNano	// class@000d4a
{
    public String displayMaxWinnerCountMessage;
    public String displayWinnerCount;
    public DisplayWinnerUser[] displayWinnerUser;
    public String liveStreamId;
    public long maxDelayDuration;
    public String redPackId;
    public int redPackType;
    public static SCLiveConditionRedPackOpened[] _emptyArray;

    public void SCLiveConditionRedPackOpened(){
       super();
       this.clear();
    }
    public static SCLiveConditionRedPackOpened[] emptyArray(){
       if (SCLiveConditionRedPackOpened._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveConditionRedPackOpened._emptyArray == null) {
             SCLiveConditionRedPackOpened[] sCLiveCondit = new SCLiveConditionRedPackOpened[0];
             SCLiveConditionRedPackOpened._emptyArray = sCLiveCondit;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveConditionRedPackOpened._emptyArray;
    }
    public static SCLiveConditionRedPackOpened parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveConditionRedPackOpened().mergeFrom(p0);
    }
    public static SCLiveConditionRedPackOpened parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveConditionRedPackOpened(), p0);
    }
    public SCLiveConditionRedPackOpened clear(){
       this.liveStreamId = "";
       this.redPackType = 0;
       this.redPackId = "";
       this.maxDelayDuration = 0;
       this.displayWinnerUser = DisplayWinnerUser.emptyArray();
       this.displayWinnerCount = "";
       this.displayMaxWinnerCountMessage = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       SCLiveConditionRedPackOpened tredPackType = this.redPackType;
       if (tredPackType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tredPackType);
       }
       if (!(this.redPackId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.redPackId);
       }
       SCLiveConditionRedPackOpened tmaxDelayDur = this.maxDelayDuration;
       if (tmaxDelayDur) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tmaxDelayDur);
       }
       tredPackType = this.displayWinnerUser;
       if (tredPackType != null && tredPackType.length > 0) {
          int i1 = 0;
          tmaxDelayDur = this.displayWinnerUser;
          while (i1 < tmaxDelayDur.length) {
             object oobject = tmaxDelayDur[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(5, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.displayWinnerCount).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.displayWinnerCount);
       }
       if (!(this.displayMaxWinnerCountMessage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.displayMaxWinnerCountMessage);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveConditionRedPackOpened mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 32) {
                      int i1 = 42;
                      if (i != i1) {
                         if (i != 50) {
                            if (i != 58) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.displayMaxWinnerCountMessage = p0.readString();
                            }
                         }else {
                            this.displayWinnerCount = p0.readString();
                         }
                      }else {
                         i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                         SCLiveConditionRedPackOpened tdisplayWinn = this.displayWinnerUser;
                         int i2 = (tdisplayWinn == null)? 0: tdisplayWinn.length;
                         i = i + i2;
                         DisplayWinnerUser[] uDisplayWinn = new DisplayWinnerUser[i];
                         if (i2) {
                            System.arraycopy(tdisplayWinn, 0, uDisplayWinn, 0, i2);
                         }
                         i1 = i - 1;
                         while (i2 < i1) {
                            uDisplayWinn[i2] = new DisplayWinnerUser();
                            p0.readMessage(uDisplayWinn[i2]);
                            p0.readTag();
                            i2 = i2 + 1;
                         }
                         uDisplayWinn[i2] = new DisplayWinnerUser();
                         p0.readMessage(uDisplayWinn[i2]);
                         this.displayWinnerUser = uDisplayWinn;
                      }
                   }else {
                      this.maxDelayDuration = p0.readUInt64();
                   }
                }else {
                   this.redPackId = p0.readString();
                }
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   switch (i){
                       case 11:
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
                       case 23:
                       case 24:
                       case 25:
                       case 26:
                       case 27:
                       case 28:
                       case 29:
                       case 30:
                       case 31:
                       case 32:
                       case '!':
                       case '"':
                       case '#':
                       case '$':
                       case '%':
                       case '&':
                       case 39:
                       case '(':
                       case ')':
                       case '*':
                       case '+':
                       case ',':
                       case '-':
                       case '.':
                       case '/':
                       case '0':
                       case 12:
                         break;
                       default:
                   }
                }
                this.redPackType = i;
             }
          }else {
             this.liveStreamId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(1, this.liveStreamId);
       }
       SCLiveConditionRedPackOpened tredPackType = this.redPackType;
       if (tredPackType != null) {
          p0.writeInt32(2, tredPackType);
       }
       if (!(this.redPackId).equals(str)) {
          p0.writeString(3, this.redPackId);
       }
       SCLiveConditionRedPackOpened tmaxDelayDur = this.maxDelayDuration;
       if (tmaxDelayDur) {
          p0.writeUInt64(4, tmaxDelayDur);
       }
       tredPackType = this.displayWinnerUser;
       if (tredPackType != null && tredPackType.length > 0) {
          int i = 0;
          tmaxDelayDur = this.displayWinnerUser;
          while (i < tmaxDelayDur.length) {
             object oobject = tmaxDelayDur[i];
             if (oobject != null) {
                p0.writeMessage(5, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.displayWinnerCount).equals(str)) {
          p0.writeString(6, this.displayWinnerCount);
       }
       if (!(this.displayMaxWinnerCountMessage).equals(str)) {
          p0.writeString(7, this.displayMaxWinnerCountMessage);
       }
       super.writeTo(p0);
       return;
    }
}
