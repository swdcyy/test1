package com.kuaishou.livestream.message.nano.LiveStreamMessages$GzoneQuickPromotionInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$GzoneQuickPromotionInfo extends MessageNano	// class@0012dd
{
    public String sogamePromotionKwailink;
    public static LiveStreamMessages$GzoneQuickPromotionInfo[] _emptyArray;

    public void LiveStreamMessages$GzoneQuickPromotionInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$GzoneQuickPromotionInfo[] emptyArray(){
       if (LiveStreamMessages$GzoneQuickPromotionInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$GzoneQuickPromotionInfo._emptyArray == null) {
             LiveStreamMessages$GzoneQuickPromotionInfo[] gzoneQuickPr = new LiveStreamMessages$GzoneQuickPromotionInfo[0];
             LiveStreamMessages$GzoneQuickPromotionInfo._emptyArray = gzoneQuickPr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$GzoneQuickPromotionInfo._emptyArray;
    }
    public static LiveStreamMessages$GzoneQuickPromotionInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$GzoneQuickPromotionInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$GzoneQuickPromotionInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$GzoneQuickPromotionInfo(), p0);
    }
    public LiveStreamMessages$GzoneQuickPromotionInfo clear(){
       this.sogamePromotionKwailink = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.sogamePromotionKwailink).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.sogamePromotionKwailink);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$GzoneQuickPromotionInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             this.sogamePromotionKwailink = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.sogamePromotionKwailink).equals("")) {
          p0.writeString(1, this.sogamePromotionKwailink);
       }
       super.writeTo(p0);
       return;
    }
}
