package com.kuaishou.livestream.message.nano.LiveCapsuleGiftRedDotNotice;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveCapsuleGiftRedDotNotice extends MessageNano	// class@001137
{
    public int noticeType;
    public static LiveCapsuleGiftRedDotNotice[] _emptyArray;

    public void LiveCapsuleGiftRedDotNotice(){
       super();
       this.clear();
    }
    public static LiveCapsuleGiftRedDotNotice[] emptyArray(){
       if (LiveCapsuleGiftRedDotNotice._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCapsuleGiftRedDotNotice._emptyArray == null) {
             LiveCapsuleGiftRedDotNotice[] liveCapsuleG = new LiveCapsuleGiftRedDotNotice[0];
             LiveCapsuleGiftRedDotNotice._emptyArray = liveCapsuleG;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCapsuleGiftRedDotNotice._emptyArray;
    }
    public static LiveCapsuleGiftRedDotNotice parseFrom(CodedInputByteBufferNano p0){
       return new LiveCapsuleGiftRedDotNotice().mergeFrom(p0);
    }
    public static LiveCapsuleGiftRedDotNotice parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCapsuleGiftRedDotNotice(), p0);
    }
    public LiveCapsuleGiftRedDotNotice clear(){
       this.noticeType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveCapsuleGiftRedDotNotice tnoticeType = this.noticeType;
       if (tnoticeType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tnoticeType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCapsuleGiftRedDotNotice mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.noticeType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveCapsuleGiftRedDotNotice tnoticeType = this.noticeType;
       if (tnoticeType != null) {
          p0.writeInt32(1, tnoticeType);
       }
       super.writeTo(p0);
       return;
    }
}
