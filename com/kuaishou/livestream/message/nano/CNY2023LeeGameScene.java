package com.kuaishou.livestream.message.nano.CNY2023LeeGameScene;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.DrawMillionStarUser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.CNY2023LeeGameScene$PopUpInfo;
import com.kuaishou.livestream.message.nano.Widget;
import java.lang.Object;
import java.lang.System;

public final class CNY2023LeeGameScene extends MessageNano	// class@00109d
{
    public int actionType;
    public long afterX;
    public long beforeX;
    public long endTime;
    public int gameType;
    public CNY2023LeeGameScene$PopUpInfo popupInfo;
    public long random;
    public int sessionId;
    public DrawMillionStarUser[] starUser;
    public long startTime;
    public Widget widget;
    public static CNY2023LeeGameScene[] _emptyArray;

    public void CNY2023LeeGameScene(){
       super();
       this.clear();
    }
    public static CNY2023LeeGameScene[] emptyArray(){
       if (CNY2023LeeGameScene._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (CNY2023LeeGameScene._emptyArray == null) {
             CNY2023LeeGameScene[] uCNY2023LeeG = new CNY2023LeeGameScene[0];
             CNY2023LeeGameScene._emptyArray = uCNY2023LeeG;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return CNY2023LeeGameScene._emptyArray;
    }
    public static CNY2023LeeGameScene parseFrom(CodedInputByteBufferNano p0){
       return new CNY2023LeeGameScene().mergeFrom(p0);
    }
    public static CNY2023LeeGameScene parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new CNY2023LeeGameScene(), p0);
    }
    public CNY2023LeeGameScene clear(){
       this.actionType = 0;
       this.gameType = 0;
       this.sessionId = 0;
       this.startTime = 0;
       this.endTime = 0;
       this.random = 0;
       this.beforeX = 0;
       this.afterX = 0;
       this.starUser = DrawMillionStarUser.emptyArray();
       this.widget = null;
       this.popupInfo = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       CNY2023LeeGameScene tactionType = this.actionType;
       if (tactionType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tactionType);
       }
       tactionType = this.gameType;
       if (tactionType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tactionType);
       }
       tactionType = this.sessionId;
       if (tactionType != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tactionType);
       }
       tactionType = this.startTime;
       int i1 = 0;
       if (tactionType - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tactionType);
       }
       tactionType = this.endTime;
       if (tactionType - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tactionType);
       }
       tactionType = this.random;
       if (tactionType - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tactionType);
       }
       tactionType = this.beforeX;
       if (tactionType - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, tactionType);
       }
       tactionType = this.afterX;
       if (tactionType - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, tactionType);
       }
       tactionType = this.starUser;
       if (tactionType != null && tactionType.length > 0) {
          int i2 = 0;
          CNY2023LeeGameScene tstarUser = this.starUser;
          while (i2 < tstarUser.length) {
             object oobject = tstarUser[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(9, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tactionType = this.widget;
       if (tactionType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(10, tactionType);
       }
       tactionType = this.popupInfo;
       if (tactionType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(11, tactionType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public CNY2023LeeGameScene mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          CNY2023LeeGameScene uCNY2023LeeG = 1;
          switch (i){
              case 0:
                return this;
              case 8:
                i = p0.readInt32();
                if (i && i != uCNY2023LeeG) {
                   continue ;
                }else {
                   this.actionType = i;
                }
                break;
              case 16:
                i = p0.readInt32();
                if (i && (i != uCNY2023LeeG && (i != 2 && i != 3))) {
                   continue ;
                }else {
                   this.gameType = i;
                }
                break;
              case 24:
                this.sessionId = p0.readUInt32();
                break;
              case 32:
                this.startTime = p0.readUInt64();
                break;
              case '(':
                this.endTime = p0.readUInt64();
                break;
              case '0':
                this.random = p0.readUInt64();
                break;
              case '8':
                this.beforeX = p0.readUInt64();
                break;
              case '@':
                this.afterX = p0.readUInt64();
                break;
              case 'J':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 74);
                uCNY2023LeeG = this.starUser;
                int i1 = (uCNY2023LeeG == null)? 0: uCNY2023LeeG.length;
                i = i + i1;
                DrawMillionStarUser[] uDrawMillion = new DrawMillionStarUser[i];
                if (i1) {
                   System.arraycopy(uCNY2023LeeG, 0, uDrawMillion, 0, i1);
                }
                int i2 = i - 1;
                while (i1 < i2) {
                   uDrawMillion[i1] = new DrawMillionStarUser();
                   p0.readMessage(uDrawMillion[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                uDrawMillion[i1] = new DrawMillionStarUser();
                p0.readMessage(uDrawMillion[i1]);
                this.starUser = uDrawMillion;
                break;
              case 'R':
                if (this.widget == null) {
                   this.widget = new Widget();
                }
                p0.readMessage(this.widget);
                break;
              case 'Z':
                if (this.popupInfo == null) {
                   this.popupInfo = new CNY2023LeeGameScene$PopUpInfo();
                }
                p0.readMessage(this.popupInfo);
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
       CNY2023LeeGameScene tactionType = this.actionType;
       if (tactionType != null) {
          p0.writeInt32(1, tactionType);
       }
       tactionType = this.gameType;
       if (tactionType != null) {
          p0.writeInt32(2, tactionType);
       }
       tactionType = this.sessionId;
       if (tactionType != null) {
          p0.writeUInt32(3, tactionType);
       }
       tactionType = this.startTime;
       int i = 0;
       if (tactionType - i) {
          p0.writeUInt64(4, tactionType);
       }
       tactionType = this.endTime;
       if (tactionType - i) {
          p0.writeUInt64(5, tactionType);
       }
       tactionType = this.random;
       if (tactionType - i) {
          p0.writeUInt64(6, tactionType);
       }
       tactionType = this.beforeX;
       if (tactionType - i) {
          p0.writeUInt64(7, tactionType);
       }
       tactionType = this.afterX;
       if (tactionType - i) {
          p0.writeUInt64(8, tactionType);
       }
       tactionType = this.starUser;
       if (tactionType != null && tactionType.length > 0) {
          int i1 = 0;
          CNY2023LeeGameScene tstarUser = this.starUser;
          while (i1 < tstarUser.length) {
             object oobject = tstarUser[i1];
             if (oobject != null) {
                p0.writeMessage(9, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tactionType = this.widget;
       if (tactionType != null) {
          p0.writeMessage(10, tactionType);
       }
       tactionType = this.popupInfo;
       if (tactionType != null) {
          p0.writeMessage(11, tactionType);
       }
       super.writeTo(p0);
       return;
    }
}
