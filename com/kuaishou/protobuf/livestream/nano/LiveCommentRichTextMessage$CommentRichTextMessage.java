package com.kuaishou.protobuf.livestream.nano.LiveCommentRichTextMessage$CommentRichTextMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveCommentRichTextMessage$CommentRichTextSegment;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveCommentAction$Action;
import com.kuaishou.protobuf.livestream.nano.LiveFeedBackground;
import java.lang.System;

public final class LiveCommentRichTextMessage$CommentRichTextMessage extends MessageNano	// class@000c55
{
    public int bizType;
    public String deviceHash;
    public LiveFeedBackground feedBackground;
    public String id;
    public LiveCommentAction$Action longPressAction;
    public LiveCommentRichTextMessage$CommentRichTextSegment[] segment;
    public long serverTimestamp;
    public long sortRank;
    public LiveCommentAction$Action tapAction;
    public long userId;
    public static LiveCommentRichTextMessage$CommentRichTextMessage[] _emptyArray;

    public void LiveCommentRichTextMessage$CommentRichTextMessage(){
       super();
       this.clear();
    }
    public static LiveCommentRichTextMessage$CommentRichTextMessage[] emptyArray(){
       if (LiveCommentRichTextMessage$CommentRichTextMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCommentRichTextMessage$CommentRichTextMessage._emptyArray == null) {
             LiveCommentRichTextMessage$CommentRichTextMessage[] uCommentRich = new LiveCommentRichTextMessage$CommentRichTextMessage[0];
             LiveCommentRichTextMessage$CommentRichTextMessage._emptyArray = uCommentRich;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCommentRichTextMessage$CommentRichTextMessage._emptyArray;
    }
    public static LiveCommentRichTextMessage$CommentRichTextMessage parseFrom(CodedInputByteBufferNano p0){
       return new LiveCommentRichTextMessage$CommentRichTextMessage().mergeFrom(p0);
    }
    public static LiveCommentRichTextMessage$CommentRichTextMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCommentRichTextMessage$CommentRichTextMessage(), p0);
    }
    public LiveCommentRichTextMessage$CommentRichTextMessage clear(){
       this.id = "";
       this.userId = 0;
       this.serverTimestamp = 0;
       this.deviceHash = "";
       this.sortRank = 0;
       this.bizType = 0;
       this.segment = LiveCommentRichTextMessage$CommentRichTextSegment.emptyArray();
       this.feedBackground = null;
       this.tapAction = null;
       this.longPressAction = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       LiveCommentRichTextMessage$CommentRichTextMessage tuserId = this.userId;
       if (tuserId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tuserId);
       }
       tuserId = this.serverTimestamp;
       if (tuserId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tuserId);
       }
       if (!(this.deviceHash).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.deviceHash);
       }
       LiveCommentRichTextMessage$CommentRichTextMessage tsortRank = this.sortRank;
       if (tsortRank) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tsortRank);
       }
       tsortRank = this.bizType;
       if (tsortRank != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, tsortRank);
       }
       tsortRank = this.segment;
       if (tsortRank != null && tsortRank.length > 0) {
          int i1 = 0;
          LiveCommentRichTextMessage$CommentRichTextMessage tsegment = this.segment;
          while (i1 < tsegment.length) {
             object oobject = tsegment[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(7, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tsortRank = this.feedBackground;
       if (tsortRank != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(8, tsortRank);
       }
       tsortRank = this.tapAction;
       if (tsortRank != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(9, tsortRank);
       }
       tsortRank = this.longPressAction;
       if (tsortRank != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(10, tsortRank);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCommentRichTextMessage$CommentRichTextMessage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.id = p0.readString();
                break;
              case 16:
                this.userId = p0.readUInt64();
                break;
              case 24:
                this.serverTimestamp = p0.readUInt64();
                break;
              case '"':
                this.deviceHash = p0.readString();
                break;
              case '(':
                this.sortRank = p0.readUInt64();
                break;
              case '0':
                this.bizType = p0.readUInt32();
                break;
              case ':':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 58);
                LiveCommentRichTextMessage$CommentRichTextMessage tsegment = this.segment;
                int i1 = (tsegment == null)? 0: tsegment.length;
                i = i + i1;
                LiveCommentRichTextMessage$CommentRichTextSegment[] uCommentRich = new LiveCommentRichTextMessage$CommentRichTextSegment[i];
                if (i1) {
                   System.arraycopy(tsegment, 0, uCommentRich, 0, i1);
                }
                int i2 = i - 1;
                while (i1 < i2) {
                   uCommentRich[i1] = new LiveCommentRichTextMessage$CommentRichTextSegment();
                   p0.readMessage(uCommentRich[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                uCommentRich[i1] = new LiveCommentRichTextMessage$CommentRichTextSegment();
                p0.readMessage(uCommentRich[i1]);
                this.segment = uCommentRich;
                break;
              case 'B':
                if (this.feedBackground == null) {
                   this.feedBackground = new LiveFeedBackground();
                }
                p0.readMessage(this.feedBackground);
                break;
              case 'J':
                if (this.tapAction == null) {
                   this.tapAction = new LiveCommentAction$Action();
                }
                p0.readMessage(this.tapAction);
                break;
              case 'R':
                if (this.longPressAction == null) {
                   this.longPressAction = new LiveCommentAction$Action();
                }
                p0.readMessage(this.longPressAction);
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
       String str = "";
       if (!(this.id).equals(str)) {
          p0.writeString(1, this.id);
       }
       LiveCommentRichTextMessage$CommentRichTextMessage tuserId = this.userId;
       if (tuserId) {
          p0.writeUInt64(2, tuserId);
       }
       tuserId = this.serverTimestamp;
       if (tuserId) {
          p0.writeUInt64(3, tuserId);
       }
       if (!(this.deviceHash).equals(str)) {
          p0.writeString(4, this.deviceHash);
       }
       LiveCommentRichTextMessage$CommentRichTextMessage tsortRank = this.sortRank;
       if (tsortRank) {
          p0.writeUInt64(5, tsortRank);
       }
       tsortRank = this.bizType;
       if (tsortRank != null) {
          p0.writeUInt32(6, tsortRank);
       }
       tsortRank = this.segment;
       if (tsortRank != null && tsortRank.length > 0) {
          int i = 0;
          LiveCommentRichTextMessage$CommentRichTextMessage tsegment = this.segment;
          while (i < tsegment.length) {
             object oobject = tsegment[i];
             if (oobject != null) {
                p0.writeMessage(7, oobject);
             }
             i = i + 1;
          }
       }
       tsortRank = this.feedBackground;
       if (tsortRank != null) {
          p0.writeMessage(8, tsortRank);
       }
       tsortRank = this.tapAction;
       if (tsortRank != null) {
          p0.writeMessage(9, tsortRank);
       }
       tsortRank = this.longPressAction;
       if (tsortRank != null) {
          p0.writeMessage(10, tsortRank);
       }
       super.writeTo(p0);
       return;
    }
}
