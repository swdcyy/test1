package com.kuaishou.protobuf.livestream.nano.LivePrivilegeState;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LivePrivilegeState extends MessageNano	// class@000cd2
{
    public UserInfos$PicUrl[] avatarFrame;
    public UserInfos$PicUrl[] avatarFrameAnimation;
    public String bulletCommentBackgroundKey;
    public String bulletCommentColor;
    public static LivePrivilegeState[] _emptyArray;

    public void LivePrivilegeState(){
       super();
       this.clear();
    }
    public static LivePrivilegeState[] emptyArray(){
       if (LivePrivilegeState._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePrivilegeState._emptyArray == null) {
             LivePrivilegeState[] livePrivileg = new LivePrivilegeState[0];
             LivePrivilegeState._emptyArray = livePrivileg;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePrivilegeState._emptyArray;
    }
    public static LivePrivilegeState parseFrom(CodedInputByteBufferNano p0){
       return new LivePrivilegeState().mergeFrom(p0);
    }
    public static LivePrivilegeState parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePrivilegeState(), p0);
    }
    public LivePrivilegeState clear(){
       this.avatarFrame = UserInfos$PicUrl.emptyArray();
       this.bulletCommentBackgroundKey = "";
       this.avatarFrameAnimation = UserInfos$PicUrl.emptyArray();
       this.bulletCommentColor = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LivePrivilegeState tavatarFrame = this.avatarFrame;
       int i1 = 0;
       if (tavatarFrame != null && tavatarFrame.length > 0) {
          int i2 = 0;
          LivePrivilegeState tavatarFrame1 = this.avatarFrame;
          while (i2 < tavatarFrame1.length) {
             object oobject = tavatarFrame1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i2 = i2 + 1;
          }
       }
       if (!(this.bulletCommentBackgroundKey).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.bulletCommentBackgroundKey);
       }
       tavatarFrame = this.avatarFrameAnimation;
       if (tavatarFrame != null && tavatarFrame.length > 0) {
          tavatarFrame = this.avatarFrameAnimation;
          while (i1 < tavatarFrame.length) {
             object oobject1 = tavatarFrame[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(5, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.bulletCommentColor).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.bulletCommentColor);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePrivilegeState mergeFrom(CodedInputByteBufferNano p0){
       LivePrivilegeState tavatarFrame;
       int i2;
       UserInfos$PicUrl[] picUrlArray;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 26;
          if (i != i1) {
             if (i != 34) {
                i1 = 42;
                if (i != i1) {
                   if (i != 50) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.bulletCommentColor = p0.readString();
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   tavatarFrame = this.avatarFrameAnimation;
                   i2 = (tavatarFrame == null)? 0: tavatarFrame.length;
                   i = i + i2;
                   picUrlArray = new UserInfos$PicUrl[i];
                   if (i2) {
                      System.arraycopy(tavatarFrame, 0, picUrlArray, 0, i2);
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
                   this.avatarFrameAnimation = picUrlArray;
                }
             }else {
                this.bulletCommentBackgroundKey = p0.readString();
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             tavatarFrame = this.avatarFrame;
             i2 = (tavatarFrame == null)? 0: tavatarFrame.length;
             i = i + i2;
             picUrlArray = new UserInfos$PicUrl[i];
             if (i2) {
                System.arraycopy(tavatarFrame, 0, picUrlArray, 0, i2);
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
             this.avatarFrame = picUrlArray;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LivePrivilegeState tavatarFrame = this.avatarFrame;
       int i = 0;
       if (tavatarFrame != null && tavatarFrame.length > 0) {
          int i1 = 0;
          LivePrivilegeState tavatarFrame1 = this.avatarFrame;
          while (i1 < tavatarFrame1.length) {
             object oobject = tavatarFrame1[i1];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.bulletCommentBackgroundKey).equals("")) {
          p0.writeString(4, this.bulletCommentBackgroundKey);
       }
       tavatarFrame = this.avatarFrameAnimation;
       if (tavatarFrame != null && tavatarFrame.length > 0) {
          tavatarFrame = this.avatarFrameAnimation;
          while (i < tavatarFrame.length) {
             object oobject1 = tavatarFrame[i];
             if (oobject1 != null) {
                p0.writeMessage(5, oobject1);
             }
             i = i + 1;
          }
       }
       if (!(this.bulletCommentColor).equals("")) {
          p0.writeString(6, this.bulletCommentColor);
       }
       super.writeTo(p0);
       return;
    }
}
