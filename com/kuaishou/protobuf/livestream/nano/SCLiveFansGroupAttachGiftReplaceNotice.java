package com.kuaishou.protobuf.livestream.nano.SCLiveFansGroupAttachGiftReplaceNotice;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class SCLiveFansGroupAttachGiftReplaceNotice extends MessageNano	// class@000d4e
{
    public long animationDelayShowMs;
    public UserInfos$PicUrl[] animationTipPicUrl;
    public long authorId;
    public String giftToken;
    public long liveStreamId;
    public int noticeType;
    public long replaceGiftId;
    public boolean showAnimation;
    public long userId;
    public static SCLiveFansGroupAttachGiftReplaceNotice[] _emptyArray;

    public void SCLiveFansGroupAttachGiftReplaceNotice(){
       super();
       this.clear();
    }
    public static SCLiveFansGroupAttachGiftReplaceNotice[] emptyArray(){
       if (SCLiveFansGroupAttachGiftReplaceNotice._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveFansGroupAttachGiftReplaceNotice._emptyArray == null) {
             SCLiveFansGroupAttachGiftReplaceNotice[] sCLiveFansGr = new SCLiveFansGroupAttachGiftReplaceNotice[0];
             SCLiveFansGroupAttachGiftReplaceNotice._emptyArray = sCLiveFansGr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveFansGroupAttachGiftReplaceNotice._emptyArray;
    }
    public static SCLiveFansGroupAttachGiftReplaceNotice parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveFansGroupAttachGiftReplaceNotice().mergeFrom(p0);
    }
    public static SCLiveFansGroupAttachGiftReplaceNotice parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveFansGroupAttachGiftReplaceNotice(), p0);
    }
    public SCLiveFansGroupAttachGiftReplaceNotice clear(){
       this.userId = 0;
       this.liveStreamId = 0;
       this.authorId = 0;
       this.replaceGiftId = 0;
       this.showAnimation = false;
       this.animationDelayShowMs = 0;
       this.animationTipPicUrl = UserInfos$PicUrl.emptyArray();
       this.giftToken = "";
       this.noticeType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCLiveFansGroupAttachGiftReplaceNotice tuserId = this.userId;
       int i1 = 0;
       if (tuserId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tuserId);
       }
       tuserId = this.liveStreamId;
       if (tuserId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tuserId);
       }
       tuserId = this.authorId;
       if (tuserId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tuserId);
       }
       tuserId = this.replaceGiftId;
       if (tuserId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tuserId);
       }
       tuserId = this.showAnimation;
       if (tuserId != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(5, tuserId);
       }
       tuserId = this.animationDelayShowMs;
       if (tuserId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tuserId);
       }
       tuserId = this.animationTipPicUrl;
       if (tuserId != null && tuserId.length > 0) {
          int i2 = 0;
          SCLiveFansGroupAttachGiftReplaceNotice tanimationTi = this.animationTipPicUrl;
          while (i2 < tanimationTi.length) {
             object oobject = tanimationTi[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(7, oobject);
             }
             i2 = i2 + 1;
          }
       }
       if (!(this.giftToken).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.giftToken);
       }
       tuserId = this.noticeType;
       if (tuserId != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(9, tuserId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveFansGroupAttachGiftReplaceNotice mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 40) {
                         if (i != 48) {
                            int i1 = 58;
                            if (i != i1) {
                               if (i != 66) {
                                  if (i != 72) {
                                     if (!WireFormatNano.parseUnknownField(p0, i)) {
                                        break ;
                                     }
                                  }else {
                                     i = p0.readInt32();
                                     if (i && (i != 1 && i != 2)) {
                                        continue ;
                                     }else {
                                        this.noticeType = i;
                                     }
                                  }
                               }else {
                                  this.giftToken = p0.readString();
                               }
                            }else {
                               i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                               SCLiveFansGroupAttachGiftReplaceNotice tanimationTi = this.animationTipPicUrl;
                               int i2 = (tanimationTi == null)? 0: tanimationTi.length;
                               i = i + i2;
                               UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                               if (i2) {
                                  System.arraycopy(tanimationTi, 0, picUrlArray, 0, i2);
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
                               this.animationTipPicUrl = picUrlArray;
                            }
                         }else {
                            this.animationDelayShowMs = p0.readUInt64();
                         }
                      }else {
                         this.showAnimation = p0.readBool();
                      }
                   }else {
                      this.replaceGiftId = p0.readUInt64();
                   }
                }else {
                   this.authorId = p0.readUInt64();
                }
             }else {
                this.liveStreamId = p0.readUInt64();
             }
          }else {
             this.userId = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCLiveFansGroupAttachGiftReplaceNotice tuserId = this.userId;
       int i = 0;
       if (tuserId - i) {
          p0.writeUInt64(1, tuserId);
       }
       tuserId = this.liveStreamId;
       if (tuserId - i) {
          p0.writeUInt64(2, tuserId);
       }
       tuserId = this.authorId;
       if (tuserId - i) {
          p0.writeUInt64(3, tuserId);
       }
       tuserId = this.replaceGiftId;
       if (tuserId - i) {
          p0.writeUInt64(4, tuserId);
       }
       tuserId = this.showAnimation;
       if (tuserId != null) {
          p0.writeBool(5, tuserId);
       }
       tuserId = this.animationDelayShowMs;
       if (tuserId - i) {
          p0.writeUInt64(6, tuserId);
       }
       tuserId = this.animationTipPicUrl;
       if (tuserId != null && tuserId.length > 0) {
          int i1 = 0;
          SCLiveFansGroupAttachGiftReplaceNotice tanimationTi = this.animationTipPicUrl;
          while (i1 < tanimationTi.length) {
             object oobject = tanimationTi[i1];
             if (oobject != null) {
                p0.writeMessage(7, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.giftToken).equals("")) {
          p0.writeString(8, this.giftToken);
       }
       tuserId = this.noticeType;
       if (tuserId != null) {
          p0.writeInt32(9, tuserId);
       }
       super.writeTo(p0);
       return;
    }
}
