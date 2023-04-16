package com.kuaishou.livestream.message.nano.LiveStreamRichTextFeed$RichTextFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveStreamRichTextFeed$RichTextSegment;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveStreamRichTextFeed$RichTextFeed extends MessageNano	// class@001396
{
    public String id;
    public LiveStreamRichTextFeed$RichTextSegment[] segments;
    public long sortRank;
    public long time;
    public int type;
    public static LiveStreamRichTextFeed$RichTextFeed[] _emptyArray;

    public void LiveStreamRichTextFeed$RichTextFeed(){
       super();
       this.clear();
    }
    public static LiveStreamRichTextFeed$RichTextFeed[] emptyArray(){
       if (LiveStreamRichTextFeed$RichTextFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamRichTextFeed$RichTextFeed._emptyArray == null) {
             LiveStreamRichTextFeed$RichTextFeed[] richTextFeed = new LiveStreamRichTextFeed$RichTextFeed[0];
             LiveStreamRichTextFeed$RichTextFeed._emptyArray = richTextFeed;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamRichTextFeed$RichTextFeed._emptyArray;
    }
    public static LiveStreamRichTextFeed$RichTextFeed parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamRichTextFeed$RichTextFeed().mergeFrom(p0);
    }
    public static LiveStreamRichTextFeed$RichTextFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamRichTextFeed$RichTextFeed(), p0);
    }
    public LiveStreamRichTextFeed$RichTextFeed clear(){
       this.id = "";
       this.sortRank = 0;
       this.time = 0;
       this.type = 0;
       this.segments = LiveStreamRichTextFeed$RichTextSegment.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.id).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       LiveStreamRichTextFeed$RichTextFeed tsortRank = this.sortRank;
       int i1 = 0;
       if (tsortRank - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tsortRank);
       }
       tsortRank = this.time;
       if (tsortRank - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tsortRank);
       }
       tsortRank = this.type;
       if (tsortRank != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tsortRank);
       }
       tsortRank = this.segments;
       if (tsortRank != null && tsortRank.length > 0) {
          int i2 = 0;
          LiveStreamRichTextFeed$RichTextFeed tsegments = this.segments;
          while (i2 < tsegments.length) {
             object oobject = tsegments[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(5, oobject);
             }
             i2 = i2 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamRichTextFeed$RichTextFeed mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      int i1 = 42;
                      if (i != i1) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                         LiveStreamRichTextFeed$RichTextFeed tsegments = this.segments;
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
                      this.type = p0.readUInt32();
                   }
                }else {
                   this.time = p0.readUInt64();
                }
             }else {
                this.sortRank = p0.readUInt64();
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
       LiveStreamRichTextFeed$RichTextFeed tsortRank = this.sortRank;
       int i = 0;
       if (tsortRank - i) {
          p0.writeUInt64(2, tsortRank);
       }
       tsortRank = this.time;
       if (tsortRank - i) {
          p0.writeUInt64(3, tsortRank);
       }
       tsortRank = this.type;
       if (tsortRank != null) {
          p0.writeUInt32(4, tsortRank);
       }
       tsortRank = this.segments;
       if (tsortRank != null && tsortRank.length > 0) {
          int i1 = 0;
          LiveStreamRichTextFeed$RichTextFeed tsegments = this.segments;
          while (i1 < tsegments.length) {
             object oobject = tsegments[i1];
             if (oobject != null) {
                p0.writeMessage(5, oobject);
             }
             i1 = i1 + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
