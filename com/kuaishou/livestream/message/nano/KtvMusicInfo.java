package com.kuaishou.livestream.message.nano.KtvMusicInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.MusicOrderLrcCdnProto;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import java.lang.System;
import mr4.b$a;

public final class KtvMusicInfo extends MessageNano	// class@0010bb
{
    public MusicOrderLrcCdnProto[] lrcUrl;
    public String[] musicArtist;
    public b$a musicId;
    public String musicIdStr;
    public String musicName;
    public int musicType;
    public static KtvMusicInfo[] _emptyArray;

    public void KtvMusicInfo(){
       super();
       this.clear();
    }
    public static KtvMusicInfo[] emptyArray(){
       if (KtvMusicInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (KtvMusicInfo._emptyArray == null) {
             KtvMusicInfo[] ktvMusicInfo = new KtvMusicInfo[0];
             KtvMusicInfo._emptyArray = ktvMusicInfo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return KtvMusicInfo._emptyArray;
    }
    public static KtvMusicInfo parseFrom(CodedInputByteBufferNano p0){
       return new KtvMusicInfo().mergeFrom(p0);
    }
    public static KtvMusicInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new KtvMusicInfo(), p0);
    }
    public KtvMusicInfo clear(){
       this.musicId = null;
       this.lrcUrl = MusicOrderLrcCdnProto.emptyArray();
       this.musicName = "";
       this.musicArtist = WireFormatNano.EMPTY_STRING_ARRAY;
       this.musicIdStr = "";
       this.musicType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i3;
       int i = super.computeSerializedSize();
       KtvMusicInfo tmusicId = this.musicId;
       int i1 = 1;
       if (tmusicId != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(i1, tmusicId);
       }
       tmusicId = this.lrcUrl;
       int i2 = 0;
       if (tmusicId != null && tmusicId.length > 0) {
          i3 = 0;
          KtvMusicInfo tlrcUrl = this.lrcUrl;
          while (i3 < tlrcUrl.length) {
             object oobject = tlrcUrl[i3];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i3 = i3 + 1;
          }
       }
       if (!(this.musicName).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.musicName);
       }
       tmusicId = this.musicArtist;
       if (tmusicId != null && tmusicId.length > 0) {
          i3 = 0;
          int i4 = 0;
          KtvMusicInfo tmusicArtist = this.musicArtist;
          while (i2 < tmusicArtist.length) {
             object oobject1 = tmusicArtist[i2];
             if (oobject1 != null) {
                i4 = i4 + 1;
                i3 = i3 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject1);
             }
             i2 = i2 + 1;
          }
          i = (i + i3) + (i4 * 1);
       }
       if (!(this.musicIdStr).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.musicIdStr);
       }
       tmusicId = this.musicType;
       if (tmusicId != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, tmusicId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public KtvMusicInfo mergeFrom(CodedInputByteBufferNano p0){
       KtvMusicInfo tmusicArtist;
       int i2;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             int i1 = 18;
             if (i != i1) {
                if (i != 26) {
                   i1 = 34;
                   if (i != i1) {
                      if (i != 42) {
                         if (i != 48) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            i = p0.readInt32();
                            switch (i){
                                case 0:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 1:
                                  break;
                                default:
                            }
                            this.musicType = i;
                         }
                      }else {
                         this.musicIdStr = p0.readString();
                      }
                   }else {
                      i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                      tmusicArtist = this.musicArtist;
                      i2 = (tmusicArtist == null)? 0: tmusicArtist.length;
                      i = i + i2;
                      String[] stringArray = new String[i];
                      if (i2) {
                         System.arraycopy(tmusicArtist, 0, stringArray, 0, i2);
                      }
                      i1 = i - 1;
                      while (i2 < i1) {
                         stringArray[i2] = p0.readString();
                         p0.readTag();
                         i2 = i2 + 1;
                      }
                      stringArray[i2] = p0.readString();
                      this.musicArtist = stringArray;
                   }
                }else {
                   this.musicName = p0.readString();
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                tmusicArtist = this.lrcUrl;
                i2 = (tmusicArtist == null)? 0: tmusicArtist.length;
                i = i + i2;
                MusicOrderLrcCdnProto[] musicOrderLr = new MusicOrderLrcCdnProto[i];
                if (i2) {
                   System.arraycopy(tmusicArtist, 0, musicOrderLr, 0, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   musicOrderLr[i2] = new MusicOrderLrcCdnProto();
                   p0.readMessage(musicOrderLr[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                musicOrderLr[i2] = new MusicOrderLrcCdnProto();
                p0.readMessage(musicOrderLr[i2]);
                this.lrcUrl = musicOrderLr;
             }
          }else if(this.musicId == null){
             this.musicId = new b$a();
          }
          p0.readMessage(this.musicId);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       KtvMusicInfo tmusicId = this.musicId;
       if (tmusicId != null) {
          p0.writeMessage(1, tmusicId);
       }
       tmusicId = this.lrcUrl;
       int i = 0;
       if (tmusicId != null && tmusicId.length > 0) {
          int i1 = 0;
          KtvMusicInfo tlrcUrl = this.lrcUrl;
          while (i1 < tlrcUrl.length) {
             object oobject = tlrcUrl[i1];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.musicName).equals("")) {
          p0.writeString(3, this.musicName);
       }
       tmusicId = this.musicArtist;
       if (tmusicId != null && tmusicId.length > 0) {
          tmusicId = this.musicArtist;
          while (i < tmusicId.length) {
             object oobject1 = tmusicId[i];
             if (oobject1 != null) {
                p0.writeString(4, oobject1);
             }
             i = i + 1;
          }
       }
       if (!(this.musicIdStr).equals("")) {
          p0.writeString(5, this.musicIdStr);
       }
       tmusicId = this.musicType;
       if (tmusicId != null) {
          p0.writeInt32(6, tmusicId);
       }
       super.writeTo(p0);
       return;
    }
}
