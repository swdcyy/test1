package com.kuaishou.livestream.message.nano.AuthorMusicInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.AuthorMusicLrcCdnProto;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.System;

public final class AuthorMusicInfo extends MessageNano	// class@001096
{
    public UserInfos$PicUrl[] imageUrl;
    public AuthorMusicLrcCdnProto[] lrcUrl;
    public String[] musicArtist;
    public String musicId;
    public String musicName;
    public int musicType;
    public static AuthorMusicInfo[] _emptyArray;

    public void AuthorMusicInfo(){
       super();
       this.clear();
    }
    public static AuthorMusicInfo[] emptyArray(){
       if (AuthorMusicInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (AuthorMusicInfo._emptyArray == null) {
             AuthorMusicInfo[] uAuthorMusic = new AuthorMusicInfo[0];
             AuthorMusicInfo._emptyArray = uAuthorMusic;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return AuthorMusicInfo._emptyArray;
    }
    public static AuthorMusicInfo parseFrom(CodedInputByteBufferNano p0){
       return new AuthorMusicInfo().mergeFrom(p0);
    }
    public static AuthorMusicInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new AuthorMusicInfo(), p0);
    }
    public AuthorMusicInfo clear(){
       this.musicId = "";
       this.musicType = 0;
       this.lrcUrl = AuthorMusicLrcCdnProto.emptyArray();
       this.imageUrl = UserInfos$PicUrl.emptyArray();
       this.musicName = "";
       this.musicArtist = WireFormatNano.EMPTY_STRING_ARRAY;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       AuthorMusicInfo tlrcUrl;
       object oobject;
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.musicId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.musicId);
       }
       AuthorMusicInfo tmusicType = this.musicType;
       if (tmusicType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tmusicType);
       }
       tmusicType = this.lrcUrl;
       int i1 = 0;
       if (tmusicType != null && tmusicType.length > 0) {
          i2 = 0;
          tlrcUrl = this.lrcUrl;
          while (i2 < tlrcUrl.length) {
             oobject = tlrcUrl[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tmusicType = this.imageUrl;
       if (tmusicType != null && tmusicType.length > 0) {
          i2 = 0;
          tlrcUrl = this.imageUrl;
          while (i2 < tlrcUrl.length) {
             oobject = tlrcUrl[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(4, oobject);
             }
             i2 = i2 + 1;
          }
       }
       if (!(this.musicName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.musicName);
       }
       tmusicType = this.musicArtist;
       if (tmusicType != null && tmusicType.length > 0) {
          i2 = 0;
          int i3 = 0;
          tlrcUrl = this.musicArtist;
          while (i1 < tlrcUrl.length) {
             oobject = tlrcUrl[i1];
             if (oobject != null) {
                i3 = i3 + 1;
                i2 = i2 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i1 = i1 + 1;
          }
          i = (i + i2) + (i3 * 1);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public AuthorMusicInfo mergeFrom(CodedInputByteBufferNano p0){
       AuthorMusicInfo tmusicArtist;
       int i2;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                int i1 = 26;
                if (i != i1) {
                   i1 = 34;
                   if (i != i1) {
                      if (i != 42) {
                         i1 = 50;
                         if (i != i1) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
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
                      tmusicArtist = this.imageUrl;
                      i2 = (tmusicArtist == null)? 0: tmusicArtist.length;
                      i = i + i2;
                      UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                      if (i2) {
                         System.arraycopy(tmusicArtist, 0, picUrlArray, 0, i2);
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
                      this.imageUrl = picUrlArray;
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   tmusicArtist = this.lrcUrl;
                   i2 = (tmusicArtist == null)? 0: tmusicArtist.length;
                   i = i + i2;
                   AuthorMusicLrcCdnProto[] uAuthorMusic = new AuthorMusicLrcCdnProto[i];
                   if (i2) {
                      System.arraycopy(tmusicArtist, 0, uAuthorMusic, 0, i2);
                   }
                   i1 = i - 1;
                   while (i2 < i1) {
                      uAuthorMusic[i2] = new AuthorMusicLrcCdnProto();
                      p0.readMessage(uAuthorMusic[i2]);
                      p0.readTag();
                      i2 = i2 + 1;
                   }
                   uAuthorMusic[i2] = new AuthorMusicLrcCdnProto();
                   p0.readMessage(uAuthorMusic[i2]);
                   this.lrcUrl = uAuthorMusic;
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
             this.musicId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       int i1;
       AuthorMusicInfo tlrcUrl;
       object oobject;
       String str = "";
       if (!(this.musicId).equals(str)) {
          p0.writeString(1, this.musicId);
       }
       AuthorMusicInfo tmusicType = this.musicType;
       if (tmusicType != null) {
          p0.writeInt32(2, tmusicType);
       }
       tmusicType = this.lrcUrl;
       int i = 0;
       if (tmusicType != null && tmusicType.length > 0) {
          i1 = 0;
          tlrcUrl = this.lrcUrl;
          while (i1 < tlrcUrl.length) {
             oobject = tlrcUrl[i1];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tmusicType = this.imageUrl;
       if (tmusicType != null && tmusicType.length > 0) {
          i1 = 0;
          tlrcUrl = this.imageUrl;
          while (i1 < tlrcUrl.length) {
             oobject = tlrcUrl[i1];
             if (oobject != null) {
                p0.writeMessage(4, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.musicName).equals(str)) {
          p0.writeString(5, this.musicName);
       }
       tmusicType = this.musicArtist;
       if (tmusicType != null && tmusicType.length > 0) {
          tmusicType = this.musicArtist;
          while (i < tmusicType.length) {
             object oobject1 = tmusicType[i];
             if (oobject1 != null) {
                p0.writeString(6, oobject1);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
