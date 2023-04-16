package com.kuaishou.livestream.message.nano.GzoneInteractiveCommentNotice;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class GzoneInteractiveCommentNotice extends MessageNano	// class@0010b1
{
    public String commentBgcolorL;
    public String commentBgcolorR;
    public String commentColor;
    public String commentText;
    public long displayDurationMs;
    public String id;
    public UserInfos$PicUrl[] roleHeadUrl;
    public String roleName;
    public int roleType;
    public static GzoneInteractiveCommentNotice[] _emptyArray;

    public void GzoneInteractiveCommentNotice(){
       super();
       this.clear();
    }
    public static GzoneInteractiveCommentNotice[] emptyArray(){
       if (GzoneInteractiveCommentNotice._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (GzoneInteractiveCommentNotice._emptyArray == null) {
             GzoneInteractiveCommentNotice[] gzoneInterac = new GzoneInteractiveCommentNotice[0];
             GzoneInteractiveCommentNotice._emptyArray = gzoneInterac;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return GzoneInteractiveCommentNotice._emptyArray;
    }
    public static GzoneInteractiveCommentNotice parseFrom(CodedInputByteBufferNano p0){
       return new GzoneInteractiveCommentNotice().mergeFrom(p0);
    }
    public static GzoneInteractiveCommentNotice parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new GzoneInteractiveCommentNotice(), p0);
    }
    public GzoneInteractiveCommentNotice clear(){
       this.roleType = 0;
       this.roleName = "";
       this.roleHeadUrl = UserInfos$PicUrl.emptyArray();
       this.commentText = "";
       this.commentColor = "";
       this.commentBgcolorL = "";
       this.commentBgcolorR = "";
       this.displayDurationMs = 0;
       this.id = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       GzoneInteractiveCommentNotice troleHeadUrl;
       int i = super.computeSerializedSize();
       GzoneInteractiveCommentNotice troleType = this.roleType;
       if (troleType != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, troleType);
       }
       String str = "";
       if (!(this.roleName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.roleName);
       }
       troleType = this.roleHeadUrl;
       if (troleType != null && troleType.length > 0) {
          int i1 = 0;
          troleHeadUrl = this.roleHeadUrl;
          while (i1 < troleHeadUrl.length) {
             object oobject = troleHeadUrl[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.commentText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.commentText);
       }
       if (!(this.commentColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.commentColor);
       }
       if (!(this.commentBgcolorL).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.commentBgcolorL);
       }
       if (!(this.commentBgcolorR).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.commentBgcolorR);
       }
       troleHeadUrl = this.displayDurationMs;
       if (troleHeadUrl) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, troleHeadUrl);
       }
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.id);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public GzoneInteractiveCommentNotice mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                int i1 = 26;
                if (i != i1) {
                   if (i != 34) {
                      if (i != 42) {
                         if (i != 50) {
                            if (i != 58) {
                               if (i != 64) {
                                  if (i != 74) {
                                     if (!WireFormatNano.parseUnknownField(p0, i)) {
                                        break ;
                                     }
                                  }else {
                                     this.id = p0.readString();
                                  }
                               }else {
                                  this.displayDurationMs = p0.readUInt64();
                               }
                            }else {
                               this.commentBgcolorR = p0.readString();
                            }
                         }else {
                            this.commentBgcolorL = p0.readString();
                         }
                      }else {
                         this.commentColor = p0.readString();
                      }
                   }else {
                      this.commentText = p0.readString();
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   GzoneInteractiveCommentNotice troleHeadUrl = this.roleHeadUrl;
                   int i2 = (troleHeadUrl == null)? 0: troleHeadUrl.length;
                   i = i + i2;
                   UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                   if (i2) {
                      System.arraycopy(troleHeadUrl, 0, picUrlArray, 0, i2);
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
                   this.roleHeadUrl = picUrlArray;
                }
             }else {
                this.roleName = p0.readString();
             }
          }else {
             this.roleType = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       GzoneInteractiveCommentNotice troleHeadUrl;
       GzoneInteractiveCommentNotice troleType = this.roleType;
       if (troleType != null) {
          p0.writeUInt32(1, troleType);
       }
       String str = "";
       if (!(this.roleName).equals(str)) {
          p0.writeString(2, this.roleName);
       }
       troleType = this.roleHeadUrl;
       if (troleType != null && troleType.length > 0) {
          int i = 0;
          troleHeadUrl = this.roleHeadUrl;
          while (i < troleHeadUrl.length) {
             object oobject = troleHeadUrl[i];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.commentText).equals(str)) {
          p0.writeString(4, this.commentText);
       }
       if (!(this.commentColor).equals(str)) {
          p0.writeString(5, this.commentColor);
       }
       if (!(this.commentBgcolorL).equals(str)) {
          p0.writeString(6, this.commentBgcolorL);
       }
       if (!(this.commentBgcolorR).equals(str)) {
          p0.writeString(7, this.commentBgcolorR);
       }
       troleHeadUrl = this.displayDurationMs;
       if (troleHeadUrl) {
          p0.writeUInt64(8, troleHeadUrl);
       }
       if (!(this.id).equals(str)) {
          p0.writeString(9, this.id);
       }
       super.writeTo(p0);
       return;
    }
}
