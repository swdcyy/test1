package com.kuaishou.livestream.message.nano.SCCNY2023LeeGameConfig;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.CNY2023LeeGameScene;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class SCCNY2023LeeGameConfig extends MessageNano	// class@0013ef
{
    public CNY2023LeeGameScene[] challengeGame;
    public CNY2023LeeGameScene[] numberGame;
    public CNY2023LeeGameScene[] taskGame;
    public static SCCNY2023LeeGameConfig[] _emptyArray;

    public void SCCNY2023LeeGameConfig(){
       super();
       this.clear();
    }
    public static SCCNY2023LeeGameConfig[] emptyArray(){
       if (SCCNY2023LeeGameConfig._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCCNY2023LeeGameConfig._emptyArray == null) {
             SCCNY2023LeeGameConfig[] sCCNY2023Lee = new SCCNY2023LeeGameConfig[0];
             SCCNY2023LeeGameConfig._emptyArray = sCCNY2023Lee;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCCNY2023LeeGameConfig._emptyArray;
    }
    public static SCCNY2023LeeGameConfig parseFrom(CodedInputByteBufferNano p0){
       return new SCCNY2023LeeGameConfig().mergeFrom(p0);
    }
    public static SCCNY2023LeeGameConfig parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCCNY2023LeeGameConfig(), p0);
    }
    public SCCNY2023LeeGameConfig clear(){
       this.numberGame = CNY2023LeeGameScene.emptyArray();
       this.challengeGame = CNY2023LeeGameScene.emptyArray();
       this.taskGame = CNY2023LeeGameScene.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       SCCNY2023LeeGameConfig tnumberGame1;
       object oobject;
       int i = super.computeSerializedSize();
       SCCNY2023LeeGameConfig tnumberGame = this.numberGame;
       int i1 = 0;
       if (tnumberGame != null && tnumberGame.length > 0) {
          i2 = 0;
          tnumberGame1 = this.numberGame;
          while (i2 < tnumberGame1.length) {
             oobject = tnumberGame1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tnumberGame = this.challengeGame;
       if (tnumberGame != null && tnumberGame.length > 0) {
          i2 = 0;
          tnumberGame1 = this.challengeGame;
          while (i2 < tnumberGame1.length) {
             oobject = tnumberGame1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tnumberGame = this.taskGame;
       if (tnumberGame != null && tnumberGame.length > 0) {
          tnumberGame = this.taskGame;
          while (i1 < tnumberGame.length) {
             object oobject1 = tnumberGame[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCCNY2023LeeGameConfig mergeFrom(CodedInputByteBufferNano p0){
       SCCNY2023LeeGameConfig ttaskGame;
       int i2;
       CNY2023LeeGameScene[] uCNY2023LeeG;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             i1 = 18;
             if (i != i1) {
                i1 = 26;
                if (i != i1) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   ttaskGame = this.taskGame;
                   i2 = (ttaskGame == null)? 0: ttaskGame.length;
                   i = i + i2;
                   uCNY2023LeeG = new CNY2023LeeGameScene[i];
                   if (i2) {
                      System.arraycopy(ttaskGame, 0, uCNY2023LeeG, 0, i2);
                   }
                   i1 = i - 1;
                   while (i2 < i1) {
                      uCNY2023LeeG[i2] = new CNY2023LeeGameScene();
                      p0.readMessage(uCNY2023LeeG[i2]);
                      p0.readTag();
                      i2 = i2 + 1;
                   }
                   uCNY2023LeeG[i2] = new CNY2023LeeGameScene();
                   p0.readMessage(uCNY2023LeeG[i2]);
                   this.taskGame = uCNY2023LeeG;
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                ttaskGame = this.challengeGame;
                i2 = (ttaskGame == null)? 0: ttaskGame.length;
                i = i + i2;
                uCNY2023LeeG = new CNY2023LeeGameScene[i];
                if (i2) {
                   System.arraycopy(ttaskGame, 0, uCNY2023LeeG, 0, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   uCNY2023LeeG[i2] = new CNY2023LeeGameScene();
                   p0.readMessage(uCNY2023LeeG[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                uCNY2023LeeG[i2] = new CNY2023LeeGameScene();
                p0.readMessage(uCNY2023LeeG[i2]);
                this.challengeGame = uCNY2023LeeG;
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             ttaskGame = this.numberGame;
             i2 = (ttaskGame == null)? 0: ttaskGame.length;
             i = i + i2;
             uCNY2023LeeG = new CNY2023LeeGameScene[i];
             if (i2) {
                System.arraycopy(ttaskGame, 0, uCNY2023LeeG, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                uCNY2023LeeG[i2] = new CNY2023LeeGameScene();
                p0.readMessage(uCNY2023LeeG[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             uCNY2023LeeG[i2] = new CNY2023LeeGameScene();
             p0.readMessage(uCNY2023LeeG[i2]);
             this.numberGame = uCNY2023LeeG;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       int i1;
       SCCNY2023LeeGameConfig tnumberGame1;
       object oobject;
       SCCNY2023LeeGameConfig tnumberGame = this.numberGame;
       int i = 0;
       if (tnumberGame != null && tnumberGame.length > 0) {
          i1 = 0;
          tnumberGame1 = this.numberGame;
          while (i1 < tnumberGame1.length) {
             oobject = tnumberGame1[i1];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tnumberGame = this.challengeGame;
       if (tnumberGame != null && tnumberGame.length > 0) {
          i1 = 0;
          tnumberGame1 = this.challengeGame;
          while (i1 < tnumberGame1.length) {
             oobject = tnumberGame1[i1];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tnumberGame = this.taskGame;
       if (tnumberGame != null && tnumberGame.length > 0) {
          tnumberGame = this.taskGame;
          while (i < tnumberGame.length) {
             object oobject1 = tnumberGame[i];
             if (oobject1 != null) {
                p0.writeMessage(3, oobject1);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
