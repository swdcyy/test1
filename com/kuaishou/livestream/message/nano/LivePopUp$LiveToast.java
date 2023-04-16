package com.kuaishou.livestream.message.nano.LivePopUp$LiveToast;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LivePopUp$LiveToast extends MessageNano	// class@00124a
{
    public String content;
    public static LivePopUp$LiveToast[] _emptyArray;

    public void LivePopUp$LiveToast(){
       super();
       this.clear();
    }
    public static LivePopUp$LiveToast[] emptyArray(){
       if (LivePopUp$LiveToast._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePopUp$LiveToast._emptyArray == null) {
             LivePopUp$LiveToast[] liveToastArr = new LivePopUp$LiveToast[0];
             LivePopUp$LiveToast._emptyArray = liveToastArr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePopUp$LiveToast._emptyArray;
    }
    public static LivePopUp$LiveToast parseFrom(CodedInputByteBufferNano p0){
       return new LivePopUp$LiveToast().mergeFrom(p0);
    }
    public static LivePopUp$LiveToast parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePopUp$LiveToast(), p0);
    }
    public LivePopUp$LiveToast clear(){
       this.content = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.content).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.content);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePopUp$LiveToast mergeFrom(CodedInputByteBufferNano p0){
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
             this.content = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.content).equals("")) {
          p0.writeString(1, this.content);
       }
       super.writeTo(p0);
       return;
    }
}
