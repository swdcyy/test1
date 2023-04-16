package com.kuaishou.protobuf.livestream.nano.LiveCommentRichText$CommentImageSegment;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveCommentAction$Action;
import java.lang.Object;
import java.lang.System;

public final class LiveCommentRichText$CommentImageSegment extends MessageNano	// class@000c50
{
    public int height;
    public LiveCommentAction$Action tapAction;
    public UserInfos$PicUrl[] url;
    public int width;
    public static LiveCommentRichText$CommentImageSegment[] _emptyArray;

    public void LiveCommentRichText$CommentImageSegment(){
       super();
       this.clear();
    }
    public static LiveCommentRichText$CommentImageSegment[] emptyArray(){
       if (LiveCommentRichText$CommentImageSegment._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCommentRichText$CommentImageSegment._emptyArray == null) {
             LiveCommentRichText$CommentImageSegment[] uCommentImag = new LiveCommentRichText$CommentImageSegment[0];
             LiveCommentRichText$CommentImageSegment._emptyArray = uCommentImag;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCommentRichText$CommentImageSegment._emptyArray;
    }
    public static LiveCommentRichText$CommentImageSegment parseFrom(CodedInputByteBufferNano p0){
       return new LiveCommentRichText$CommentImageSegment().mergeFrom(p0);
    }
    public static LiveCommentRichText$CommentImageSegment parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCommentRichText$CommentImageSegment(), p0);
    }
    public LiveCommentRichText$CommentImageSegment clear(){
       this.url = UserInfos$PicUrl.emptyArray();
       this.width = 0;
       this.height = 0;
       this.tapAction = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveCommentRichText$CommentImageSegment turl = this.url;
       if (turl != null && turl.length > 0) {
          int i1 = 0;
          LiveCommentRichText$CommentImageSegment turl1 = this.url;
          while (i1 < turl1.length) {
             object oobject = turl1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       turl = this.width;
       if (turl != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, turl);
       }
       turl = this.height;
       if (turl != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, turl);
       }
       turl = this.tapAction;
       if (turl != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, turl);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCommentRichText$CommentImageSegment mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else if(this.tapAction == null){
                      this.tapAction = new LiveCommentAction$Action();
                   }
                   p0.readMessage(this.tapAction);
                }else {
                   this.height = p0.readUInt32();
                }
             }else {
                this.width = p0.readUInt32();
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             LiveCommentRichText$CommentImageSegment turl = this.url;
             int i2 = (turl == null)? 0: turl.length;
             i = i + i2;
             UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
             if (i2) {
                System.arraycopy(turl, 0, picUrlArray, 0, i2);
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
             this.url = picUrlArray;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveCommentRichText$CommentImageSegment turl = this.url;
       if (turl != null && turl.length > 0) {
          int i = 0;
          LiveCommentRichText$CommentImageSegment turl1 = this.url;
          while (i < turl1.length) {
             object oobject = turl1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       turl = this.width;
       if (turl != null) {
          p0.writeUInt32(2, turl);
       }
       turl = this.height;
       if (turl != null) {
          p0.writeUInt32(3, turl);
       }
       turl = this.tapAction;
       if (turl != null) {
          p0.writeMessage(4, turl);
       }
       super.writeTo(p0);
       return;
    }
}
