package com.kuaishou.livestream.message.nano.LiveLocalLifeBuyingNoticeSignal$SCLiveLocalLifeBuyingNoticeSignal;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveLocalLifeBuyingNoticeSignal$SCLiveLocalLifeBuyingNoticeSignal extends MessageNano	// class@0011e9
{
    public String bulletText;
    public String jumpUri;
    public static LiveLocalLifeBuyingNoticeSignal$SCLiveLocalLifeBuyingNoticeSignal[] _emptyArray;

    public void LiveLocalLifeBuyingNoticeSignal$SCLiveLocalLifeBuyingNoticeSignal(){
       super();
       this.clear();
    }
    public static LiveLocalLifeBuyingNoticeSignal$SCLiveLocalLifeBuyingNoticeSignal[] emptyArray(){
       if (LiveLocalLifeBuyingNoticeSignal$SCLiveLocalLifeBuyingNoticeSignal._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveLocalLifeBuyingNoticeSignal$SCLiveLocalLifeBuyingNoticeSignal._emptyArray == null) {
             LiveLocalLifeBuyingNoticeSignal$SCLiveLocalLifeBuyingNoticeSignal[] sCLiveLocalL = new LiveLocalLifeBuyingNoticeSignal$SCLiveLocalLifeBuyingNoticeSignal[0];
             LiveLocalLifeBuyingNoticeSignal$SCLiveLocalLifeBuyingNoticeSignal._emptyArray = sCLiveLocalL;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveLocalLifeBuyingNoticeSignal$SCLiveLocalLifeBuyingNoticeSignal._emptyArray;
    }
    public static LiveLocalLifeBuyingNoticeSignal$SCLiveLocalLifeBuyingNoticeSignal parseFrom(CodedInputByteBufferNano p0){
       return new LiveLocalLifeBuyingNoticeSignal$SCLiveLocalLifeBuyingNoticeSignal().mergeFrom(p0);
    }
    public static LiveLocalLifeBuyingNoticeSignal$SCLiveLocalLifeBuyingNoticeSignal parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveLocalLifeBuyingNoticeSignal$SCLiveLocalLifeBuyingNoticeSignal(), p0);
    }
    public LiveLocalLifeBuyingNoticeSignal$SCLiveLocalLifeBuyingNoticeSignal clear(){
       this.bulletText = "";
       this.jumpUri = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.bulletText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.bulletText);
       }
       if (!(this.jumpUri).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.jumpUri);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveLocalLifeBuyingNoticeSignal$SCLiveLocalLifeBuyingNoticeSignal mergeFrom(CodedInputByteBufferNano p0){
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
                this.jumpUri = p0.readString();
             }
          }else {
             this.bulletText = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.bulletText).equals(str)) {
          p0.writeString(1, this.bulletText);
       }
       if (!(this.jumpUri).equals(str)) {
          p0.writeString(2, this.jumpUri);
       }
       super.writeTo(p0);
       return;
    }
}
