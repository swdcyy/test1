package com.kuaishou.client.log.content.packages.nano.ClientContent$CameraRecordFeaturesStatusPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MagicFacePackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$FilterDetailPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BeautyMakeUpStatusPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$StyleStatusPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BeautyStatusPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BodyUsePackage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MusicDetailPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$FeatureSwitchPackage;

public final class ClientContent$CameraRecordFeaturesStatusPackage extends MessageNano	// class@001226
{
    public ClientContent$FeatureSwitchPackage beatsSwitchPackage;
    public boolean beauty;
    public ClientContent$BeautyMakeUpStatusPackage[] beautyMakeUpStatusDetailPackage;
    public ClientContent$BeautyStatusPackage beautyStatusPackage;
    public ClientContent$BeautyStatusPackage[] beautyUsePackage;
    public ClientContent$BodyUsePackage[] bodyUserPackage;
    public ClientContent$FilterDetailPackage[] filterUsePackage;
    public ClientContent$MagicFacePackage[] magicFacePackage;
    public String magicMusic;
    public String music;
    public ClientContent$MusicDetailPackage musicDetailPackage;
    public ClientContent$StyleStatusPackage[] styleStatusPackage;
    public static ClientContent$CameraRecordFeaturesStatusPackage[] _emptyArray;

    public void ClientContent$CameraRecordFeaturesStatusPackage(){
       super();
       this.clear();
    }
    public static ClientContent$CameraRecordFeaturesStatusPackage[] emptyArray(){
       if (ClientContent$CameraRecordFeaturesStatusPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$CameraRecordFeaturesStatusPackage._emptyArray == null) {
             ClientContent$CameraRecordFeaturesStatusPackage[] uCameraRecor = new ClientContent$CameraRecordFeaturesStatusPackage[0];
             ClientContent$CameraRecordFeaturesStatusPackage._emptyArray = uCameraRecor;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$CameraRecordFeaturesStatusPackage._emptyArray;
    }
    public static ClientContent$CameraRecordFeaturesStatusPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$CameraRecordFeaturesStatusPackage().mergeFrom(p0);
    }
    public static ClientContent$CameraRecordFeaturesStatusPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$CameraRecordFeaturesStatusPackage(), p0);
    }
    public ClientContent$CameraRecordFeaturesStatusPackage clear(){
       this.beauty = false;
       this.magicFacePackage = ClientContent$MagicFacePackage.emptyArray();
       this.magicMusic = "";
       this.music = "";
       this.beatsSwitchPackage = null;
       this.musicDetailPackage = null;
       this.beautyStatusPackage = null;
       this.filterUsePackage = ClientContent$FilterDetailPackage.emptyArray();
       this.beautyMakeUpStatusDetailPackage = ClientContent$BeautyMakeUpStatusPackage.emptyArray();
       this.styleStatusPackage = ClientContent$StyleStatusPackage.emptyArray();
       this.beautyUsePackage = ClientContent$BeautyStatusPackage.emptyArray();
       this.bodyUserPackage = ClientContent$BodyUsePackage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       ClientContent$CameraRecordFeaturesStatusPackage tmagicFacePa;
       object oobject;
       int i = super.computeSerializedSize();
       ClientContent$CameraRecordFeaturesStatusPackage tbeauty = this.beauty;
       if (tbeauty != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, tbeauty);
       }
       tbeauty = this.magicFacePackage;
       int i1 = 0;
       if (tbeauty != null && tbeauty.length > 0) {
          i2 = 0;
          tmagicFacePa = this.magicFacePackage;
          while (i2 < tmagicFacePa.length) {
             oobject = tmagicFacePa[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i2 = i2 + 1;
          }
       }
       String str = "";
       if (!(this.magicMusic).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.magicMusic);
       }
       if (!(this.music).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.music);
       }
       tbeauty = this.beatsSwitchPackage;
       if (tbeauty != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(5, tbeauty);
       }
       tbeauty = this.musicDetailPackage;
       if (tbeauty != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(6, tbeauty);
       }
       tbeauty = this.beautyStatusPackage;
       if (tbeauty != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(7, tbeauty);
       }
       tbeauty = this.filterUsePackage;
       if (tbeauty != null && tbeauty.length > 0) {
          i2 = 0;
          tmagicFacePa = this.filterUsePackage;
          while (i2 < tmagicFacePa.length) {
             oobject = tmagicFacePa[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(8, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tbeauty = this.beautyMakeUpStatusDetailPackage;
       if (tbeauty != null && tbeauty.length > 0) {
          i2 = 0;
          tmagicFacePa = this.beautyMakeUpStatusDetailPackage;
          while (i2 < tmagicFacePa.length) {
             oobject = tmagicFacePa[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(9, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tbeauty = this.styleStatusPackage;
       if (tbeauty != null && tbeauty.length > 0) {
          i2 = 0;
          tmagicFacePa = this.styleStatusPackage;
          while (i2 < tmagicFacePa.length) {
             oobject = tmagicFacePa[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(10, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tbeauty = this.beautyUsePackage;
       if (tbeauty != null && tbeauty.length > 0) {
          i2 = 0;
          tmagicFacePa = this.beautyUsePackage;
          while (i2 < tmagicFacePa.length) {
             oobject = tmagicFacePa[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(11, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tbeauty = this.bodyUserPackage;
       if (tbeauty != null && tbeauty.length > 0) {
          tbeauty = this.bodyUserPackage;
          while (i1 < tbeauty.length) {
             object oobject1 = tbeauty[i1];
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
    public ClientContent$CameraRecordFeaturesStatusPackage mergeFrom(CodedInputByteBufferNano p0){
       ClientContent$CameraRecordFeaturesStatusPackage tmagicFacePa;
       int i2;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 8:
                this.beauty = p0.readBool();
                break;
              case 18:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 18);
                tmagicFacePa = this.magicFacePackage;
                i2 = (tmagicFacePa == null)? 0: tmagicFacePa.length;
                i = i + i2;
                ClientContent$MagicFacePackage[] magicFacePac = new ClientContent$MagicFacePackage[i];
                if (i2) {
                   System.arraycopy(tmagicFacePa, i1, magicFacePac, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   magicFacePac[i2] = new ClientContent$MagicFacePackage();
                   p0.readMessage(magicFacePac[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                magicFacePac[i2] = new ClientContent$MagicFacePackage();
                p0.readMessage(magicFacePac[i2]);
                this.magicFacePackage = magicFacePac;
                break;
              case 26:
                this.magicMusic = p0.readString();
                break;
              case '"':
                this.music = p0.readString();
                break;
              case '*':
                if (this.beatsSwitchPackage == null) {
                   this.beatsSwitchPackage = new ClientContent$FeatureSwitchPackage();
                }
                p0.readMessage(this.beatsSwitchPackage);
                break;
              case '2':
                if (this.musicDetailPackage == null) {
                   this.musicDetailPackage = new ClientContent$MusicDetailPackage();
                }
                p0.readMessage(this.musicDetailPackage);
                break;
              case ':':
                if (this.beautyStatusPackage == null) {
                   this.beautyStatusPackage = new ClientContent$BeautyStatusPackage();
                }
                p0.readMessage(this.beautyStatusPackage);
                break;
              case 'B':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 66);
                tmagicFacePa = this.filterUsePackage;
                i2 = (tmagicFacePa == null)? 0: tmagicFacePa.length;
                i = i + i2;
                ClientContent$FilterDetailPackage[] uFilterDetai = new ClientContent$FilterDetailPackage[i];
                if (i2) {
                   System.arraycopy(tmagicFacePa, i1, uFilterDetai, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   uFilterDetai[i2] = new ClientContent$FilterDetailPackage();
                   p0.readMessage(uFilterDetai[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                uFilterDetai[i2] = new ClientContent$FilterDetailPackage();
                p0.readMessage(uFilterDetai[i2]);
                this.filterUsePackage = uFilterDetai;
                break;
              case 'J':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 74);
                tmagicFacePa = this.beautyMakeUpStatusDetailPackage;
                i2 = (tmagicFacePa == null)? 0: tmagicFacePa.length;
                i = i + i2;
                ClientContent$BeautyMakeUpStatusPackage[] uBeautyMakeU = new ClientContent$BeautyMakeUpStatusPackage[i];
                if (i2) {
                   System.arraycopy(tmagicFacePa, i1, uBeautyMakeU, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   uBeautyMakeU[i2] = new ClientContent$BeautyMakeUpStatusPackage();
                   p0.readMessage(uBeautyMakeU[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                uBeautyMakeU[i2] = new ClientContent$BeautyMakeUpStatusPackage();
                p0.readMessage(uBeautyMakeU[i2]);
                this.beautyMakeUpStatusDetailPackage = uBeautyMakeU;
                break;
              case 'R':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 82);
                tmagicFacePa = this.styleStatusPackage;
                i2 = (tmagicFacePa == null)? 0: tmagicFacePa.length;
                i = i + i2;
                ClientContent$StyleStatusPackage[] styleStatusP = new ClientContent$StyleStatusPackage[i];
                if (i2) {
                   System.arraycopy(tmagicFacePa, i1, styleStatusP, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   styleStatusP[i2] = new ClientContent$StyleStatusPackage();
                   p0.readMessage(styleStatusP[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                styleStatusP[i2] = new ClientContent$StyleStatusPackage();
                p0.readMessage(styleStatusP[i2]);
                this.styleStatusPackage = styleStatusP;
                break;
              case 'Z':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 90);
                tmagicFacePa = this.beautyUsePackage;
                i2 = (tmagicFacePa == null)? 0: tmagicFacePa.length;
                i = i + i2;
                ClientContent$BeautyStatusPackage[] uBeautyStatu = new ClientContent$BeautyStatusPackage[i];
                if (i2) {
                   System.arraycopy(tmagicFacePa, i1, uBeautyStatu, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   uBeautyStatu[i2] = new ClientContent$BeautyStatusPackage();
                   p0.readMessage(uBeautyStatu[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                uBeautyStatu[i2] = new ClientContent$BeautyStatusPackage();
                p0.readMessage(uBeautyStatu[i2]);
                this.beautyUsePackage = uBeautyStatu;
                break;
              case 'b':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 98);
                tmagicFacePa = this.bodyUserPackage;
                i2 = (tmagicFacePa == null)? 0: tmagicFacePa.length;
                i = i + i2;
                ClientContent$BodyUsePackage[] uBodyUsePack = new ClientContent$BodyUsePackage[i];
                if (i2) {
                   System.arraycopy(tmagicFacePa, i1, uBodyUsePack, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   uBodyUsePack[i2] = new ClientContent$BodyUsePackage();
                   p0.readMessage(uBodyUsePack[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                uBodyUsePack[i2] = new ClientContent$BodyUsePackage();
                p0.readMessage(uBodyUsePack[i2]);
                this.bodyUserPackage = uBodyUsePack;
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
       ClientContent$CameraRecordFeaturesStatusPackage tmagicFacePa;
       object oobject;
       ClientContent$CameraRecordFeaturesStatusPackage tbeauty = this.beauty;
       if (tbeauty != null) {
          p0.writeBool(1, tbeauty);
       }
       tbeauty = this.magicFacePackage;
       int i = 0;
       if (tbeauty != null && tbeauty.length > 0) {
          i1 = 0;
          tmagicFacePa = this.magicFacePackage;
          while (i1 < tmagicFacePa.length) {
             oobject = tmagicFacePa[i1];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       String str = "";
       if (!(this.magicMusic).equals(str)) {
          p0.writeString(3, this.magicMusic);
       }
       if (!(this.music).equals(str)) {
          p0.writeString(4, this.music);
       }
       tbeauty = this.beatsSwitchPackage;
       if (tbeauty != null) {
          p0.writeMessage(5, tbeauty);
       }
       tbeauty = this.musicDetailPackage;
       if (tbeauty != null) {
          p0.writeMessage(6, tbeauty);
       }
       tbeauty = this.beautyStatusPackage;
       if (tbeauty != null) {
          p0.writeMessage(7, tbeauty);
       }
       tbeauty = this.filterUsePackage;
       if (tbeauty != null && tbeauty.length > 0) {
          i1 = 0;
          tmagicFacePa = this.filterUsePackage;
          while (i1 < tmagicFacePa.length) {
             oobject = tmagicFacePa[i1];
             if (oobject != null) {
                p0.writeMessage(8, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tbeauty = this.beautyMakeUpStatusDetailPackage;
       if (tbeauty != null && tbeauty.length > 0) {
          i1 = 0;
          tmagicFacePa = this.beautyMakeUpStatusDetailPackage;
          while (i1 < tmagicFacePa.length) {
             oobject = tmagicFacePa[i1];
             if (oobject != null) {
                p0.writeMessage(9, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tbeauty = this.styleStatusPackage;
       if (tbeauty != null && tbeauty.length > 0) {
          i1 = 0;
          tmagicFacePa = this.styleStatusPackage;
          while (i1 < tmagicFacePa.length) {
             oobject = tmagicFacePa[i1];
             if (oobject != null) {
                p0.writeMessage(10, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tbeauty = this.beautyUsePackage;
       if (tbeauty != null && tbeauty.length > 0) {
          i1 = 0;
          tmagicFacePa = this.beautyUsePackage;
          while (i1 < tmagicFacePa.length) {
             oobject = tmagicFacePa[i1];
             if (oobject != null) {
                p0.writeMessage(11, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tbeauty = this.bodyUserPackage;
       if (tbeauty != null && tbeauty.length > 0) {
          tbeauty = this.bodyUserPackage;
          while (i < tbeauty.length) {
             object oobject1 = tbeauty[i];
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
