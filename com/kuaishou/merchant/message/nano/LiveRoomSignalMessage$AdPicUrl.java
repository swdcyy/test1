package com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$AdPicUrl;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveRoomSignalMessage$AdPicUrl extends MessageNano	// class@001c3d
{
    public String cdn;
    public String url;
    public static LiveRoomSignalMessage$AdPicUrl[] _emptyArray;

    public void LiveRoomSignalMessage$AdPicUrl(){
       super();
       this.clear();
    }
    public static LiveRoomSignalMessage$AdPicUrl[] emptyArray(){
       if (LiveRoomSignalMessage$AdPicUrl._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRoomSignalMessage$AdPicUrl._emptyArray == null) {
             LiveRoomSignalMessage$AdPicUrl[] uAdPicUrlArr = new LiveRoomSignalMessage$AdPicUrl[0];
             LiveRoomSignalMessage$AdPicUrl._emptyArray = uAdPicUrlArr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRoomSignalMessage$AdPicUrl._emptyArray;
    }
    public static LiveRoomSignalMessage$AdPicUrl parseFrom(CodedInputByteBufferNano p0){
       return new LiveRoomSignalMessage$AdPicUrl().mergeFrom(p0);
    }
    public static LiveRoomSignalMessage$AdPicUrl parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRoomSignalMessage$AdPicUrl(), p0);
    }
    public LiveRoomSignalMessage$AdPicUrl clear(){
       this.cdn = "";
       this.url = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.cdn).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.cdn);
       }
       if (!(this.url).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.url);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRoomSignalMessage$AdPicUrl mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.url = p0.readString();
             }
          }else {
             this.cdn = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.cdn).equals(str)) {
          p0.writeString(1, this.cdn);
       }
       if (!(this.url).equals(str)) {
          p0.writeString(2, this.url);
       }
       super.writeTo(p0);
       return;
    }
}
