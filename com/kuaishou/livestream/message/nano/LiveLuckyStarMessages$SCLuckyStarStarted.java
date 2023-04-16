package com.kuaishou.livestream.message.nano.LiveLuckyStarMessages$SCLuckyStarStarted;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveCdnNodeView;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveLuckyStarMessages$SCLuckyStarStarted extends MessageNano	// class@0011f8
{
    public LiveCdnNodeView[] dynamicCountDownIcon;
    public LiveCdnNodeView[] dynamicShakeIcon;
    public LiveCdnNodeView[] liteAuthorInfoAreaIcon;
    public LiveCdnNodeView[] liteStaticIcon;
    public String luckyStarId;
    public long maxAdvanceRequestRollUserMillis;
    public long openDeadline;
    public LiveCdnNodeView[] staticIcon;
    public int type;
    public boolean useNewUi;
    public long widgetDisappearTime;
    public static LiveLuckyStarMessages$SCLuckyStarStarted[] _emptyArray;

    public void LiveLuckyStarMessages$SCLuckyStarStarted(){
       super();
       this.clear();
    }
    public static LiveLuckyStarMessages$SCLuckyStarStarted[] emptyArray(){
       if (LiveLuckyStarMessages$SCLuckyStarStarted._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveLuckyStarMessages$SCLuckyStarStarted._emptyArray == null) {
             LiveLuckyStarMessages$SCLuckyStarStarted[] sCLuckyStarS = new LiveLuckyStarMessages$SCLuckyStarStarted[0];
             LiveLuckyStarMessages$SCLuckyStarStarted._emptyArray = sCLuckyStarS;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveLuckyStarMessages$SCLuckyStarStarted._emptyArray;
    }
    public static LiveLuckyStarMessages$SCLuckyStarStarted parseFrom(CodedInputByteBufferNano p0){
       return new LiveLuckyStarMessages$SCLuckyStarStarted().mergeFrom(p0);
    }
    public static LiveLuckyStarMessages$SCLuckyStarStarted parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveLuckyStarMessages$SCLuckyStarStarted(), p0);
    }
    public LiveLuckyStarMessages$SCLuckyStarStarted clear(){
       this.luckyStarId = "";
       this.openDeadline = 0;
       this.type = 0;
       this.maxAdvanceRequestRollUserMillis = 0;
       this.useNewUi = false;
       this.widgetDisappearTime = 0;
       this.staticIcon = LiveCdnNodeView.emptyArray();
       this.dynamicCountDownIcon = LiveCdnNodeView.emptyArray();
       this.dynamicShakeIcon = LiveCdnNodeView.emptyArray();
       this.liteStaticIcon = LiveCdnNodeView.emptyArray();
       this.liteAuthorInfoAreaIcon = LiveCdnNodeView.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       object oobject;
       int i = super.computeSerializedSize();
       if (!(this.luckyStarId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.luckyStarId);
       }
       LiveLuckyStarMessages$SCLuckyStarStarted topenDeadlin = this.openDeadline;
       LiveLuckyStarMessages$SCLuckyStarStarted sCLuckyStarS = null;
       if (topenDeadlin - sCLuckyStarS) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, topenDeadlin);
       }
       topenDeadlin = this.type;
       if (topenDeadlin != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, topenDeadlin);
       }
       topenDeadlin = this.maxAdvanceRequestRollUserMillis;
       if (topenDeadlin - sCLuckyStarS) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, topenDeadlin);
       }
       topenDeadlin = this.useNewUi;
       if (topenDeadlin != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(5, topenDeadlin);
       }
       topenDeadlin = this.widgetDisappearTime;
       if (topenDeadlin - sCLuckyStarS) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, topenDeadlin);
       }
       topenDeadlin = this.staticIcon;
       int i1 = 0;
       if (topenDeadlin != null && topenDeadlin.length > 0) {
          i2 = 0;
          sCLuckyStarS = this.staticIcon;
          while (i2 < sCLuckyStarS.length) {
             oobject = sCLuckyStarS[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(7, oobject);
             }
             i2 = i2 + 1;
          }
       }
       topenDeadlin = this.dynamicCountDownIcon;
       if (topenDeadlin != null && topenDeadlin.length > 0) {
          i2 = 0;
          sCLuckyStarS = this.dynamicCountDownIcon;
          while (i2 < sCLuckyStarS.length) {
             oobject = sCLuckyStarS[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(8, oobject);
             }
             i2 = i2 + 1;
          }
       }
       topenDeadlin = this.dynamicShakeIcon;
       if (topenDeadlin != null && topenDeadlin.length > 0) {
          i2 = 0;
          sCLuckyStarS = this.dynamicShakeIcon;
          while (i2 < sCLuckyStarS.length) {
             oobject = sCLuckyStarS[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(9, oobject);
             }
             i2 = i2 + 1;
          }
       }
       topenDeadlin = this.liteStaticIcon;
       if (topenDeadlin != null && topenDeadlin.length > 0) {
          i2 = 0;
          sCLuckyStarS = this.liteStaticIcon;
          while (i2 < sCLuckyStarS.length) {
             oobject = sCLuckyStarS[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(10, oobject);
             }
             i2 = i2 + 1;
          }
       }
       topenDeadlin = this.liteAuthorInfoAreaIcon;
       if (topenDeadlin != null && topenDeadlin.length > 0) {
          topenDeadlin = this.liteAuthorInfoAreaIcon;
          while (i1 < topenDeadlin.length) {
             object oobject1 = topenDeadlin[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(11, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveLuckyStarMessages$SCLuckyStarStarted mergeFrom(CodedInputByteBufferNano p0){
       LiveLuckyStarMessages$SCLuckyStarStarted tstaticIcon;
       int i2;
       LiveCdnNodeView[] liveCdnNodeV;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 10:
                this.luckyStarId = p0.readString();
                break;
              case 16:
                this.openDeadline = p0.readUInt64();
                break;
              case 24:
                this.type = p0.readUInt32();
                break;
              case 32:
                this.maxAdvanceRequestRollUserMillis = p0.readUInt64();
                break;
              case '(':
                this.useNewUi = p0.readBool();
                break;
              case '0':
                this.widgetDisappearTime = p0.readUInt64();
                break;
              case ':':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 58);
                tstaticIcon = this.staticIcon;
                i2 = (tstaticIcon == null)? 0: tstaticIcon.length;
                i = i + i2;
                liveCdnNodeV = new LiveCdnNodeView[i];
                if (i2) {
                   System.arraycopy(tstaticIcon, i1, liveCdnNodeV, i1, i2);
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
                this.staticIcon = liveCdnNodeV;
                break;
              case 'B':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 66);
                tstaticIcon = this.dynamicCountDownIcon;
                i2 = (tstaticIcon == null)? 0: tstaticIcon.length;
                i = i + i2;
                liveCdnNodeV = new LiveCdnNodeView[i];
                if (i2) {
                   System.arraycopy(tstaticIcon, i1, liveCdnNodeV, i1, i2);
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
                this.dynamicCountDownIcon = liveCdnNodeV;
                break;
              case 'J':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 74);
                tstaticIcon = this.dynamicShakeIcon;
                i2 = (tstaticIcon == null)? 0: tstaticIcon.length;
                i = i + i2;
                liveCdnNodeV = new LiveCdnNodeView[i];
                if (i2) {
                   System.arraycopy(tstaticIcon, i1, liveCdnNodeV, i1, i2);
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
                this.dynamicShakeIcon = liveCdnNodeV;
                break;
              case 'R':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 82);
                tstaticIcon = this.liteStaticIcon;
                i2 = (tstaticIcon == null)? 0: tstaticIcon.length;
                i = i + i2;
                liveCdnNodeV = new LiveCdnNodeView[i];
                if (i2) {
                   System.arraycopy(tstaticIcon, i1, liveCdnNodeV, i1, i2);
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
                this.liteStaticIcon = liveCdnNodeV;
                break;
              case 'Z':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 90);
                tstaticIcon = this.liteAuthorInfoAreaIcon;
                i2 = (tstaticIcon == null)? 0: tstaticIcon.length;
                i = i + i2;
                liveCdnNodeV = new LiveCdnNodeView[i];
                if (i2) {
                   System.arraycopy(tstaticIcon, i1, liveCdnNodeV, i1, i2);
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
                this.liteAuthorInfoAreaIcon = liveCdnNodeV;
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
       object oobject;
       if (!(this.luckyStarId).equals("")) {
          p0.writeString(1, this.luckyStarId);
       }
       LiveLuckyStarMessages$SCLuckyStarStarted topenDeadlin = this.openDeadline;
       LiveLuckyStarMessages$SCLuckyStarStarted sCLuckyStarS = null;
       if (topenDeadlin - sCLuckyStarS) {
          p0.writeUInt64(2, topenDeadlin);
       }
       topenDeadlin = this.type;
       if (topenDeadlin != null) {
          p0.writeUInt32(3, topenDeadlin);
       }
       topenDeadlin = this.maxAdvanceRequestRollUserMillis;
       if (topenDeadlin - sCLuckyStarS) {
          p0.writeUInt64(4, topenDeadlin);
       }
       topenDeadlin = this.useNewUi;
       if (topenDeadlin != null) {
          p0.writeBool(5, topenDeadlin);
       }
       topenDeadlin = this.widgetDisappearTime;
       if (topenDeadlin - sCLuckyStarS) {
          p0.writeUInt64(6, topenDeadlin);
       }
       topenDeadlin = this.staticIcon;
       int i = 0;
       if (topenDeadlin != null && topenDeadlin.length > 0) {
          i1 = 0;
          sCLuckyStarS = this.staticIcon;
          while (i1 < sCLuckyStarS.length) {
             oobject = sCLuckyStarS[i1];
             if (oobject != null) {
                p0.writeMessage(7, oobject);
             }
             i1 = i1 + 1;
          }
       }
       topenDeadlin = this.dynamicCountDownIcon;
       if (topenDeadlin != null && topenDeadlin.length > 0) {
          i1 = 0;
          sCLuckyStarS = this.dynamicCountDownIcon;
          while (i1 < sCLuckyStarS.length) {
             oobject = sCLuckyStarS[i1];
             if (oobject != null) {
                p0.writeMessage(8, oobject);
             }
             i1 = i1 + 1;
          }
       }
       topenDeadlin = this.dynamicShakeIcon;
       if (topenDeadlin != null && topenDeadlin.length > 0) {
          i1 = 0;
          sCLuckyStarS = this.dynamicShakeIcon;
          while (i1 < sCLuckyStarS.length) {
             oobject = sCLuckyStarS[i1];
             if (oobject != null) {
                p0.writeMessage(9, oobject);
             }
             i1 = i1 + 1;
          }
       }
       topenDeadlin = this.liteStaticIcon;
       if (topenDeadlin != null && topenDeadlin.length > 0) {
          i1 = 0;
          sCLuckyStarS = this.liteStaticIcon;
          while (i1 < sCLuckyStarS.length) {
             oobject = sCLuckyStarS[i1];
             if (oobject != null) {
                p0.writeMessage(10, oobject);
             }
             i1 = i1 + 1;
          }
       }
       topenDeadlin = this.liteAuthorInfoAreaIcon;
       if (topenDeadlin != null && topenDeadlin.length > 0) {
          topenDeadlin = this.liteAuthorInfoAreaIcon;
          while (i < topenDeadlin.length) {
             object oobject1 = topenDeadlin[i];
             if (oobject1 != null) {
                p0.writeMessage(11, oobject1);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
