package com.kuaishou.protobuf.livestream.nano.LiveCommentRichText$TextStyle;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveCommentRichText$TextStyle extends MessageNano	// class@000c53
{
    public int color;
    public int fontFamily;
    public int fontSize;
    public int shadowColor;
    public static LiveCommentRichText$TextStyle[] _emptyArray;

    public void LiveCommentRichText$TextStyle(){
       super();
       this.clear();
    }
    public static LiveCommentRichText$TextStyle[] emptyArray(){
       if (LiveCommentRichText$TextStyle._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCommentRichText$TextStyle._emptyArray == null) {
             LiveCommentRichText$TextStyle[] textStyleArr = new LiveCommentRichText$TextStyle[0];
             LiveCommentRichText$TextStyle._emptyArray = textStyleArr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCommentRichText$TextStyle._emptyArray;
    }
    public static LiveCommentRichText$TextStyle parseFrom(CodedInputByteBufferNano p0){
       return new LiveCommentRichText$TextStyle().mergeFrom(p0);
    }
    public static LiveCommentRichText$TextStyle parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCommentRichText$TextStyle(), p0);
    }
    public LiveCommentRichText$TextStyle clear(){
       this.color = 0;
       this.shadowColor = 0;
       this.fontSize = 0;
       this.fontFamily = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveCommentRichText$TextStyle tcolor = this.color;
       if (tcolor != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tcolor);
       }
       tcolor = this.shadowColor;
       if (tcolor != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tcolor);
       }
       tcolor = this.fontSize;
       if (tcolor != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tcolor);
       }
       tcolor = this.fontFamily;
       if (tcolor != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tcolor);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCommentRichText$TextStyle mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      i = p0.readInt32();
                      if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
                         continue ;
                      }else {
                         this.fontFamily = i;
                      }
                   }
                }else {
                   this.fontSize = p0.readUInt32();
                }
             }else {
                this.shadowColor = p0.readUInt32();
             }
          }else {
             this.color = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveCommentRichText$TextStyle tcolor = this.color;
       if (tcolor != null) {
          p0.writeUInt32(1, tcolor);
       }
       tcolor = this.shadowColor;
       if (tcolor != null) {
          p0.writeUInt32(2, tcolor);
       }
       tcolor = this.fontSize;
       if (tcolor != null) {
          p0.writeUInt32(3, tcolor);
       }
       tcolor = this.fontFamily;
       if (tcolor != null) {
          p0.writeInt32(4, tcolor);
       }
       super.writeTo(p0);
       return;
    }
}
