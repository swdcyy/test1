package com.kuaishou.protobuf.livestream.nano.LiveCommentAction$ActionShowMenu;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveCommentAction$ActionShowMenu extends MessageNano	// class@000c4a
{
    public int contentIndex;
    public int nameIndex;
    public static LiveCommentAction$ActionShowMenu[] _emptyArray;

    public void LiveCommentAction$ActionShowMenu(){
       super();
       this.clear();
    }
    public static LiveCommentAction$ActionShowMenu[] emptyArray(){
       if (LiveCommentAction$ActionShowMenu._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCommentAction$ActionShowMenu._emptyArray == null) {
             LiveCommentAction$ActionShowMenu[] uActionShowM = new LiveCommentAction$ActionShowMenu[0];
             LiveCommentAction$ActionShowMenu._emptyArray = uActionShowM;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCommentAction$ActionShowMenu._emptyArray;
    }
    public static LiveCommentAction$ActionShowMenu parseFrom(CodedInputByteBufferNano p0){
       return new LiveCommentAction$ActionShowMenu().mergeFrom(p0);
    }
    public static LiveCommentAction$ActionShowMenu parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCommentAction$ActionShowMenu(), p0);
    }
    public LiveCommentAction$ActionShowMenu clear(){
       this.nameIndex = 0;
       this.contentIndex = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveCommentAction$ActionShowMenu tnameIndex = this.nameIndex;
       if (tnameIndex != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tnameIndex);
       }
       tnameIndex = this.contentIndex;
       if (tnameIndex != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tnameIndex);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCommentAction$ActionShowMenu mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.contentIndex = p0.readUInt32();
             }
          }else {
             this.nameIndex = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveCommentAction$ActionShowMenu tnameIndex = this.nameIndex;
       if (tnameIndex != null) {
          p0.writeUInt32(1, tnameIndex);
       }
       tnameIndex = this.contentIndex;
       if (tnameIndex != null) {
          p0.writeUInt32(2, tnameIndex);
       }
       super.writeTo(p0);
       return;
    }
}
