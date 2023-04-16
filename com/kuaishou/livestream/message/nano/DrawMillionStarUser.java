package com.kuaishou.livestream.message.nano.DrawMillionStarUser;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class DrawMillionStarUser extends MessageNano	// class@0010a5
{
    public long number;
    public int type;
    public long userId;
    public static DrawMillionStarUser[] _emptyArray;

    public void DrawMillionStarUser(){
       super();
       this.clear();
    }
    public static DrawMillionStarUser[] emptyArray(){
       if (DrawMillionStarUser._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (DrawMillionStarUser._emptyArray == null) {
             DrawMillionStarUser[] uDrawMillion = new DrawMillionStarUser[0];
             DrawMillionStarUser._emptyArray = uDrawMillion;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return DrawMillionStarUser._emptyArray;
    }
    public static DrawMillionStarUser parseFrom(CodedInputByteBufferNano p0){
       return new DrawMillionStarUser().mergeFrom(p0);
    }
    public static DrawMillionStarUser parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new DrawMillionStarUser(), p0);
    }
    public DrawMillionStarUser clear(){
       this.userId = 0;
       this.number = 0;
       this.type = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       DrawMillionStarUser tuserId = this.userId;
       int i1 = 0;
       if (tuserId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tuserId);
       }
       tuserId = this.number;
       if (tuserId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tuserId);
       }
       tuserId = this.type;
       if (tuserId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tuserId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public DrawMillionStarUser mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.type = p0.readUInt32();
                }
             }else {
                this.number = p0.readUInt64();
             }
          }else {
             this.userId = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       DrawMillionStarUser tuserId = this.userId;
       int i = 0;
       if (tuserId - i) {
          p0.writeUInt64(1, tuserId);
       }
       tuserId = this.number;
       if (tuserId - i) {
          p0.writeUInt64(2, tuserId);
       }
       tuserId = this.type;
       if (tuserId != null) {
          p0.writeUInt32(3, tuserId);
       }
       super.writeTo(p0);
       return;
    }
}
