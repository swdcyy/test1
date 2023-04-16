package com.kuaishou.livestream.message.nano.LiveStreamMessages$NormalNoticeFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveStreamRichTextFeed$RichTextSegment;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveStreamMessages$NormalNoticeFeed extends MessageNano	// class@001308
{
    public long displayDuration;
    public String id;
    public long nextDisplayGap;
    public boolean onlyAuthorShow;
    public LiveStreamRichTextFeed$RichTextSegment[] segments;
    public static LiveStreamMessages$NormalNoticeFeed[] _emptyArray;

    public void LiveStreamMessages$NormalNoticeFeed(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$NormalNoticeFeed[] emptyArray(){
       if (LiveStreamMessages$NormalNoticeFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$NormalNoticeFeed._emptyArray == null) {
             LiveStreamMessages$NormalNoticeFeed[] normalNotice = new LiveStreamMessages$NormalNoticeFeed[0];
             LiveStreamMessages$NormalNoticeFeed._emptyArray = normalNotice;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$NormalNoticeFeed._emptyArray;
    }
    public static LiveStreamMessages$NormalNoticeFeed parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$NormalNoticeFeed().mergeFrom(p0);
    }
    public static LiveStreamMessages$NormalNoticeFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$NormalNoticeFeed(), p0);
    }
    public LiveStreamMessages$NormalNoticeFeed clear(){
       this.id = "";
       this.onlyAuthorShow = false;
       this.segments = LiveStreamRichTextFeed$RichTextSegment.emptyArray();
       this.displayDuration = 0;
       this.nextDisplayGap = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.id).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       LiveStreamMessages$NormalNoticeFeed tonlyAuthorS = this.onlyAuthorShow;
       if (tonlyAuthorS != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tonlyAuthorS);
       }
       tonlyAuthorS = this.segments;
       if (tonlyAuthorS != null && tonlyAuthorS.length > 0) {
          int i1 = 0;
          LiveStreamMessages$NormalNoticeFeed tsegments = this.segments;
          while (i1 < tsegments.length) {
             object oobject = tsegments[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tonlyAuthorS = this.displayDuration;
       int i2 = 0;
       if (tonlyAuthorS - i2) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tonlyAuthorS);
       }
       tonlyAuthorS = this.nextDisplayGap;
       if (tonlyAuthorS - i2) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tonlyAuthorS);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$NormalNoticeFeed mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                int i1 = 26;
                if (i != i1) {
                   if (i != 32) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.nextDisplayGap = p0.readUInt64();
                      }
                   }else {
                      this.displayDuration = p0.readUInt64();
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   LiveStreamMessages$NormalNoticeFeed tsegments = this.segments;
                   int i2 = (tsegments == null)? 0: tsegments.length;
                   i = i + i2;
                   LiveStreamRichTextFeed$RichTextSegment[] richTextSegm = new LiveStreamRichTextFeed$RichTextSegment[i];
                   if (i2) {
                      System.arraycopy(tsegments, 0, richTextSegm, 0, i2);
                   }
                   i1 = i - 1;
                   while (i2 < i1) {
                      richTextSegm[i2] = new LiveStreamRichTextFeed$RichTextSegment();
                      p0.readMessage(richTextSegm[i2]);
                      p0.readTag();
                      i2 = i2 + 1;
                   }
                   richTextSegm[i2] = new LiveStreamRichTextFeed$RichTextSegment();
                   p0.readMessage(richTextSegm[i2]);
                   this.segments = richTextSegm;
                }
             }else {
                this.onlyAuthorShow = p0.readBool();
             }
          }else {
             this.id = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.id).equals("")) {
          p0.writeString(1, this.id);
       }
       LiveStreamMessages$NormalNoticeFeed tonlyAuthorS = this.onlyAuthorShow;
       if (tonlyAuthorS != null) {
          p0.writeBool(2, tonlyAuthorS);
       }
       tonlyAuthorS = this.segments;
       if (tonlyAuthorS != null && tonlyAuthorS.length > 0) {
          int i = 0;
          LiveStreamMessages$NormalNoticeFeed tsegments = this.segments;
          while (i < tsegments.length) {
             object oobject = tsegments[i];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i = i + 1;
          }
       }
       tonlyAuthorS = this.displayDuration;
       int i1 = 0;
       if (tonlyAuthorS - i1) {
          p0.writeUInt64(4, tonlyAuthorS);
       }
       tonlyAuthorS = this.nextDisplayGap;
       if (tonlyAuthorS - i1) {
          p0.writeUInt64(5, tonlyAuthorS);
       }
       super.writeTo(p0);
       return;
    }
}
