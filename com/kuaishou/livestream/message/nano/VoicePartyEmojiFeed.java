package com.kuaishou.livestream.message.nano.VoicePartyEmojiFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class VoicePartyEmojiFeed extends MessageNano	// class@001483
{
    public long emojiId;
    public int emojiType;
    public UserInfos$PicUrl[] emojiUrl;
    public long fromMicSeatId;
    public int scene;
    public long toMicSeatId;
    public long toUserId;
    public long userId;
    public static VoicePartyEmojiFeed[] _emptyArray;

    public void VoicePartyEmojiFeed(){
       super();
       this.clear();
    }
    public static VoicePartyEmojiFeed[] emptyArray(){
       if (VoicePartyEmojiFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (VoicePartyEmojiFeed._emptyArray == null) {
             VoicePartyEmojiFeed[] voicePartyEm = new VoicePartyEmojiFeed[0];
             VoicePartyEmojiFeed._emptyArray = voicePartyEm;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return VoicePartyEmojiFeed._emptyArray;
    }
    public static VoicePartyEmojiFeed parseFrom(CodedInputByteBufferNano p0){
       return new VoicePartyEmojiFeed().mergeFrom(p0);
    }
    public static VoicePartyEmojiFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new VoicePartyEmojiFeed(), p0);
    }
    public VoicePartyEmojiFeed clear(){
       this.userId = 0;
       this.emojiId = 0;
       this.emojiType = 0;
       this.emojiUrl = UserInfos$PicUrl.emptyArray();
       this.fromMicSeatId = 0;
       this.toMicSeatId = 0;
       this.scene = 0;
       this.toUserId = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       VoicePartyEmojiFeed tuserId = this.userId;
       int i1 = 0;
       if (tuserId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tuserId);
       }
       tuserId = this.emojiId;
       if (tuserId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tuserId);
       }
       tuserId = this.emojiType;
       if (tuserId != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tuserId);
       }
       tuserId = this.emojiUrl;
       if (tuserId != null && tuserId.length > 0) {
          int i2 = 0;
          VoicePartyEmojiFeed temojiUrl = this.emojiUrl;
          while (i2 < temojiUrl.length) {
             object oobject = temojiUrl[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(4, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tuserId = this.fromMicSeatId;
       if (tuserId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tuserId);
       }
       tuserId = this.toMicSeatId;
       if (tuserId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tuserId);
       }
       tuserId = this.scene;
       if (tuserId != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(7, tuserId);
       }
       tuserId = this.toUserId;
       if (tuserId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, tuserId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public VoicePartyEmojiFeed mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                int i1 = 2;
                int i2 = 1;
                if (i != 24) {
                   int i3 = 34;
                   if (i != i3) {
                      if (i != 40) {
                         if (i != 48) {
                            if (i != 56) {
                               if (i != 64) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
                                  }
                               }else {
                                  this.toUserId = p0.readUInt64();
                               }
                            }else {
                               i = p0.readInt32();
                               if (i && (i != i2 && i != i1)) {
                                  continue ;
                               }else {
                                  this.scene = i;
                               }
                            }
                         }else {
                            this.toMicSeatId = p0.readUInt64();
                         }
                      }else {
                         this.fromMicSeatId = p0.readUInt64();
                      }
                   }else {
                      i = WireFormatNano.getRepeatedFieldArrayLength(p0, i3);
                      VoicePartyEmojiFeed temojiUrl = this.emojiUrl;
                      i1 = 0;
                      i2 = (temojiUrl == null)? 0: temojiUrl.length;
                      i = i + i2;
                      UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                      if (i2) {
                         System.arraycopy(temojiUrl, i1, picUrlArray, i1, i2);
                      }
                      i3 = i - 1;
                      while (i2 < i3) {
                         picUrlArray[i2] = new UserInfos$PicUrl();
                         p0.readMessage(picUrlArray[i2]);
                         p0.readTag();
                         i2 = i2 + 1;
                      }
                      picUrlArray[i2] = new UserInfos$PicUrl();
                      p0.readMessage(picUrlArray[i2]);
                      this.emojiUrl = picUrlArray;
                   }
                }else {
                   i = p0.readInt32();
                   if (i && (i != i2 && (i != i1 && i != 3))) {
                      continue ;
                   }else {
                      this.emojiType = i;
                   }
                }
             }else {
                this.emojiId = p0.readUInt64();
             }
          }else {
             this.userId = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       VoicePartyEmojiFeed tuserId = this.userId;
       int i = 0;
       if (tuserId - i) {
          p0.writeUInt64(1, tuserId);
       }
       tuserId = this.emojiId;
       if (tuserId - i) {
          p0.writeUInt64(2, tuserId);
       }
       tuserId = this.emojiType;
       if (tuserId != null) {
          p0.writeInt32(3, tuserId);
       }
       tuserId = this.emojiUrl;
       if (tuserId != null && tuserId.length > 0) {
          int i1 = 0;
          VoicePartyEmojiFeed temojiUrl = this.emojiUrl;
          while (i1 < temojiUrl.length) {
             object oobject = temojiUrl[i1];
             if (oobject != null) {
                p0.writeMessage(4, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tuserId = this.fromMicSeatId;
       if (tuserId - i) {
          p0.writeUInt64(5, tuserId);
       }
       tuserId = this.toMicSeatId;
       if (tuserId - i) {
          p0.writeUInt64(6, tuserId);
       }
       tuserId = this.scene;
       if (tuserId != null) {
          p0.writeInt32(7, tuserId);
       }
       tuserId = this.toUserId;
       if (tuserId - i) {
          p0.writeUInt64(8, tuserId);
       }
       super.writeTo(p0);
       return;
    }
}
