package com.kuaishou.client.log.content.packages.nano.ClientContent$VideoEditFeaturesStatusPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.String;
import java.lang.Object;
import java.lang.System;

public final class ClientContent$VideoEditFeaturesStatusPackage extends MessageNano	// class@0012f1
{
    public String background;
    public String cover;
    public String crop;
    public boolean cut;
    public String[] effect;
    public int effectIndex;
    public String[] filter;
    public int filterIndex;
    public int frameDuration;
    public String[] magic;
    public String[] magicFinger;
    public int magicIndex;
    public String[] mosaic;
    public String[] music;
    public int musicIndex;
    public String[] sticker;
    public int stickerIndex;
    public boolean subtitle;
    public String[] transition;
    public int transitionIndex;
    public String trim;
    public static ClientContent$VideoEditFeaturesStatusPackage[] _emptyArray;

    public void ClientContent$VideoEditFeaturesStatusPackage(){
       super();
       this.clear();
    }
    public static ClientContent$VideoEditFeaturesStatusPackage[] emptyArray(){
       if (ClientContent$VideoEditFeaturesStatusPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$VideoEditFeaturesStatusPackage._emptyArray == null) {
             ClientContent$VideoEditFeaturesStatusPackage[] videoEditFea = new ClientContent$VideoEditFeaturesStatusPackage[0];
             ClientContent$VideoEditFeaturesStatusPackage._emptyArray = videoEditFea;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$VideoEditFeaturesStatusPackage._emptyArray;
    }
    public static ClientContent$VideoEditFeaturesStatusPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$VideoEditFeaturesStatusPackage().mergeFrom(p0);
    }
    public static ClientContent$VideoEditFeaturesStatusPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$VideoEditFeaturesStatusPackage(), p0);
    }
    public ClientContent$VideoEditFeaturesStatusPackage clear(){
       this.cut = false;
       this.filterIndex = 0;
       this.musicIndex = 0;
       this.effectIndex = 0;
       this.magicIndex = 0;
       this.subtitle = false;
       this.stickerIndex = 0;
       this.transitionIndex = 0;
       String[] eMPTY_STRING = WireFormatNano.EMPTY_STRING_ARRAY;
       this.filter = eMPTY_STRING;
       this.music = eMPTY_STRING;
       this.effect = eMPTY_STRING;
       this.magic = eMPTY_STRING;
       this.sticker = eMPTY_STRING;
       this.transition = eMPTY_STRING;
       this.magicFinger = eMPTY_STRING;
       this.cover = "";
       this.mosaic = eMPTY_STRING;
       this.frameDuration = 0;
       this.background = "";
       this.crop = "";
       this.trim = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i4;
       int i5;
       int i6;
       ClientContent$VideoEditFeaturesStatusPackage tfilter;
       object oobject;
       int i = super.computeSerializedSize();
       ClientContent$VideoEditFeaturesStatusPackage tcut = this.cut;
       int i1 = 1;
       if (tcut != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(i1, tcut);
       }
       tcut = this.filterIndex;
       int i2 = 2;
       if (tcut != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(i2, tcut);
       }
       tcut = this.musicIndex;
       if (tcut != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tcut);
       }
       tcut = this.effectIndex;
       if (tcut != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tcut);
       }
       tcut = this.magicIndex;
       if (tcut != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, tcut);
       }
       tcut = this.subtitle;
       if (tcut != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(6, tcut);
       }
       tcut = this.stickerIndex;
       if (tcut != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, tcut);
       }
       tcut = this.transitionIndex;
       if (tcut != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(8, tcut);
       }
       tcut = this.filter;
       int i3 = 0;
       if (tcut != null && tcut.length > 0) {
          i4 = 0;
          i5 = 0;
          i6 = 0;
          tfilter = this.filter;
          while (i4 < tfilter.length) {
             oobject = tfilter[i4];
             if (oobject != null) {
                i6 = i6 + 1;
                i5 = i5 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i4 = i4 + 1;
          }
          i = (i + i5) + (i6 * 1);
       }
       tcut = this.music;
       if (tcut != null && tcut.length > 0) {
          i4 = 0;
          i5 = 0;
          i6 = 0;
          tfilter = this.music;
          while (i4 < tfilter.length) {
             oobject = tfilter[i4];
             if (oobject != null) {
                i6 = i6 + 1;
                i5 = i5 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i4 = i4 + 1;
          }
          i = (i + i5) + (i6 * 1);
       }
       tcut = this.effect;
       if (tcut != null && tcut.length > 0) {
          i4 = 0;
          i5 = 0;
          i6 = 0;
          tfilter = this.effect;
          while (i4 < tfilter.length) {
             oobject = tfilter[i4];
             if (oobject != null) {
                i6 = i6 + 1;
                i5 = i5 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i4 = i4 + 1;
          }
          i = (i + i5) + (i6 * 1);
       }
       tcut = this.magic;
       if (tcut != null && tcut.length > 0) {
          i4 = 0;
          i5 = 0;
          i6 = 0;
          tfilter = this.magic;
          while (i4 < tfilter.length) {
             oobject = tfilter[i4];
             if (oobject != null) {
                i6 = i6 + 1;
                i5 = i5 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i4 = i4 + 1;
          }
          i = (i + i5) + (i6 * 1);
       }
       tcut = this.sticker;
       if (tcut != null && tcut.length > 0) {
          i4 = 0;
          i5 = 0;
          i6 = 0;
          tfilter = this.sticker;
          while (i4 < tfilter.length) {
             oobject = tfilter[i4];
             if (oobject != null) {
                i6 = i6 + 1;
                i5 = i5 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i4 = i4 + 1;
          }
          i = (i + i5) + (i6 * 1);
       }
       tcut = this.transition;
       if (tcut != null && tcut.length > 0) {
          i4 = 0;
          i5 = 0;
          i6 = 0;
          tfilter = this.transition;
          while (i4 < tfilter.length) {
             oobject = tfilter[i4];
             if (oobject != null) {
                i6 = i6 + 1;
                i5 = i5 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i4 = i4 + 1;
          }
          i = (i + i5) + (i6 * 1);
       }
       tcut = this.magicFinger;
       if (tcut != null && tcut.length > 0) {
          i4 = 0;
          i5 = 0;
          i6 = 0;
          tfilter = this.magicFinger;
          while (i4 < tfilter.length) {
             oobject = tfilter[i4];
             if (oobject != null) {
                i6 = i6 + 1;
                i5 = i5 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i4 = i4 + 1;
          }
          i = (i + i5) + (i6 * 1);
       }
       String str = "";
       if (!(this.cover).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(16, this.cover);
       }
       tcut = this.mosaic;
       if (tcut != null && tcut.length > 0) {
          i4 = 0;
          i5 = 0;
          ClientContent$VideoEditFeaturesStatusPackage tmosaic = this.mosaic;
          while (i3 < tmosaic.length) {
             object oobject1 = tmosaic[i3];
             if (oobject1 != null) {
                i5 = i5 + 1;
                i4 = i4 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject1);
             }
             i3 = i3 + 1;
          }
          i = (i + i4) + (i5 * 2);
       }
       tcut = this.frameDuration;
       if (tcut != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(18, tcut);
       }
       if (!(this.background).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(19, this.background);
       }
       if (!(this.crop).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(20, this.crop);
       }
       if (!(this.trim).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(21, this.trim);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$VideoEditFeaturesStatusPackage mergeFrom(CodedInputByteBufferNano p0){
       ClientContent$VideoEditFeaturesStatusPackage tfilter;
       int i2;
       String[] stringArray;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 8:
                this.cut = p0.readBool();
                break;
              case 16:
                this.filterIndex = p0.readUInt32();
                break;
              case 24:
                this.musicIndex = p0.readUInt32();
                break;
              case 32:
                this.effectIndex = p0.readUInt32();
                break;
              case '(':
                this.magicIndex = p0.readUInt32();
                break;
              case '0':
                this.subtitle = p0.readBool();
                break;
              case '8':
                this.stickerIndex = p0.readUInt32();
                break;
              case '@':
                this.transitionIndex = p0.readUInt32();
                break;
              case 'J':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 74);
                tfilter = this.filter;
                i2 = (tfilter == null)? 0: tfilter.length;
                i = i + i2;
                stringArray = new String[i];
                if (i2) {
                   System.arraycopy(tfilter, i1, stringArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.filter = stringArray;
                break;
              case 'R':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 82);
                tfilter = this.music;
                i2 = (tfilter == null)? 0: tfilter.length;
                i = i + i2;
                stringArray = new String[i];
                if (i2) {
                   System.arraycopy(tfilter, i1, stringArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.music = stringArray;
                break;
              case 'Z':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 90);
                tfilter = this.effect;
                i2 = (tfilter == null)? 0: tfilter.length;
                i = i + i2;
                stringArray = new String[i];
                if (i2) {
                   System.arraycopy(tfilter, i1, stringArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.effect = stringArray;
                break;
              case 'b':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 98);
                tfilter = this.magic;
                i2 = (tfilter == null)? 0: tfilter.length;
                i = i + i2;
                stringArray = new String[i];
                if (i2) {
                   System.arraycopy(tfilter, i1, stringArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.magic = stringArray;
                break;
              case 'j':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 106);
                tfilter = this.sticker;
                i2 = (tfilter == null)? 0: tfilter.length;
                i = i + i2;
                stringArray = new String[i];
                if (i2) {
                   System.arraycopy(tfilter, i1, stringArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.sticker = stringArray;
                break;
              case 'r':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 114);
                tfilter = this.transition;
                i2 = (tfilter == null)? 0: tfilter.length;
                i = i + i2;
                stringArray = new String[i];
                if (i2) {
                   System.arraycopy(tfilter, i1, stringArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.transition = stringArray;
                break;
              case 'z':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 122);
                tfilter = this.magicFinger;
                i2 = (tfilter == null)? 0: tfilter.length;
                i = i + i2;
                stringArray = new String[i];
                if (i2) {
                   System.arraycopy(tfilter, i1, stringArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.magicFinger = stringArray;
                break;
              case 130:
                this.cover = p0.readString();
                break;
              case 138:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 138);
                tfilter = this.mosaic;
                i2 = (tfilter == null)? 0: tfilter.length;
                i = i + i2;
                stringArray = new String[i];
                if (i2) {
                   System.arraycopy(tfilter, i1, stringArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.mosaic = stringArray;
                break;
              case 144:
                this.frameDuration = p0.readUInt32();
                break;
              case 154:
                this.background = p0.readString();
                break;
              case 162:
                this.crop = p0.readString();
                break;
              case 170:
                this.trim = p0.readString();
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
       ClientContent$VideoEditFeaturesStatusPackage tfilter;
       object oobject;
       ClientContent$VideoEditFeaturesStatusPackage tcut = this.cut;
       if (tcut != null) {
          p0.writeBool(1, tcut);
       }
       tcut = this.filterIndex;
       if (tcut != null) {
          p0.writeUInt32(2, tcut);
       }
       tcut = this.musicIndex;
       if (tcut != null) {
          p0.writeUInt32(3, tcut);
       }
       tcut = this.effectIndex;
       if (tcut != null) {
          p0.writeUInt32(4, tcut);
       }
       tcut = this.magicIndex;
       if (tcut != null) {
          p0.writeUInt32(5, tcut);
       }
       tcut = this.subtitle;
       if (tcut != null) {
          p0.writeBool(6, tcut);
       }
       tcut = this.stickerIndex;
       if (tcut != null) {
          p0.writeUInt32(7, tcut);
       }
       tcut = this.transitionIndex;
       if (tcut != null) {
          p0.writeUInt32(8, tcut);
       }
       tcut = this.filter;
       int i = 0;
       if (tcut != null && tcut.length > 0) {
          i1 = 0;
          tfilter = this.filter;
          while (i1 < tfilter.length) {
             oobject = tfilter[i1];
             if (oobject != null) {
                p0.writeString(9, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tcut = this.music;
       if (tcut != null && tcut.length > 0) {
          i1 = 0;
          tfilter = this.music;
          while (i1 < tfilter.length) {
             oobject = tfilter[i1];
             if (oobject != null) {
                p0.writeString(10, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tcut = this.effect;
       if (tcut != null && tcut.length > 0) {
          i1 = 0;
          tfilter = this.effect;
          while (i1 < tfilter.length) {
             oobject = tfilter[i1];
             if (oobject != null) {
                p0.writeString(11, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tcut = this.magic;
       if (tcut != null && tcut.length > 0) {
          i1 = 0;
          tfilter = this.magic;
          while (i1 < tfilter.length) {
             oobject = tfilter[i1];
             if (oobject != null) {
                p0.writeString(12, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tcut = this.sticker;
       if (tcut != null && tcut.length > 0) {
          i1 = 0;
          tfilter = this.sticker;
          while (i1 < tfilter.length) {
             oobject = tfilter[i1];
             if (oobject != null) {
                p0.writeString(13, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tcut = this.transition;
       if (tcut != null && tcut.length > 0) {
          i1 = 0;
          tfilter = this.transition;
          while (i1 < tfilter.length) {
             oobject = tfilter[i1];
             if (oobject != null) {
                p0.writeString(14, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tcut = this.magicFinger;
       if (tcut != null && tcut.length > 0) {
          i1 = 0;
          tfilter = this.magicFinger;
          while (i1 < tfilter.length) {
             oobject = tfilter[i1];
             if (oobject != null) {
                p0.writeString(15, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.cover).equals("")) {
          p0.writeString(16, this.cover);
       }
       tcut = this.mosaic;
       if (tcut != null && tcut.length > 0) {
          tcut = this.mosaic;
          while (i < tcut.length) {
             object oobject1 = tcut[i];
             if (oobject1 != null) {
                p0.writeString(17, oobject1);
             }
             i = i + 1;
          }
       }
       tcut = this.frameDuration;
       if (tcut != null) {
          p0.writeUInt32(18, tcut);
       }
       if (!(this.background).equals("")) {
          p0.writeString(19, this.background);
       }
       if (!(this.crop).equals("")) {
          p0.writeString(20, this.crop);
       }
       if (!(this.trim).equals("")) {
          p0.writeString(21, this.trim);
       }
       super.writeTo(p0);
       return;
    }
}
