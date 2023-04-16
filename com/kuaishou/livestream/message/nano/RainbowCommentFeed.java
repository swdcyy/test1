package com.kuaishou.livestream.message.nano.RainbowCommentFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class RainbowCommentFeed extends MessageNano	// class@0013e7
{
    public String comment;
    public long commentId;
    public String hintText;
    public long randomTime;
    public int type;
    public static RainbowCommentFeed[] _emptyArray;

    public void RainbowCommentFeed(){
       super();
       this.clear();
    }
    public static RainbowCommentFeed[] emptyArray(){
       if (RainbowCommentFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (RainbowCommentFeed._emptyArray == null) {
             RainbowCommentFeed[] rainbowComme = new RainbowCommentFeed[0];
             RainbowCommentFeed._emptyArray = rainbowComme;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return RainbowCommentFeed._emptyArray;
    }
    public static RainbowCommentFeed parseFrom(CodedInputByteBufferNano p0){
       return new RainbowCommentFeed().mergeFrom(p0);
    }
    public static RainbowCommentFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new RainbowCommentFeed(), p0);
    }
    public RainbowCommentFeed clear(){
       this.type = 0;
       this.commentId = 0;
       this.comment = "";
       this.hintText = "";
       this.randomTime = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       RainbowCommentFeed ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ttype);
       }
       ttype = this.commentId;
       int i1 = 0;
       if (ttype - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, ttype);
       }
       String str = "";
       if (!(this.comment).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.comment);
       }
       if (!(this.hintText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.hintText);
       }
       ttype = this.randomTime;
       if (ttype - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, ttype);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public RainbowCommentFeed mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.randomTime = p0.readUInt64();
                      }
                   }else {
                      this.hintText = p0.readString();
                   }
                }else {
                   this.comment = p0.readString();
                }
             }else {
                this.commentId = p0.readUInt64();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.type = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       RainbowCommentFeed ttype = this.type;
       if (ttype != null) {
          p0.writeInt32(1, ttype);
       }
       ttype = this.commentId;
       int i = 0;
       if (ttype - i) {
          p0.writeUInt64(2, ttype);
       }
       String str = "";
       if (!(this.comment).equals(str)) {
          p0.writeString(3, this.comment);
       }
       if (!(this.hintText).equals(str)) {
          p0.writeString(4, this.hintText);
       }
       ttype = this.randomTime;
       if (ttype - i) {
          p0.writeUInt64(5, ttype);
       }
       super.writeTo(p0);
       return;
    }
}
