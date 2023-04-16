package com.kuaishou.livestream.message.nano.LiveCommonNoticeMessages$TextDesc;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveCommonNoticeMessages$TextDesc extends MessageNano	// class@001162
{
    public String textColor;
    public String textContent;
    public static LiveCommonNoticeMessages$TextDesc[] _emptyArray;

    public void LiveCommonNoticeMessages$TextDesc(){
       super();
       this.clear();
    }
    public static LiveCommonNoticeMessages$TextDesc[] emptyArray(){
       if (LiveCommonNoticeMessages$TextDesc._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCommonNoticeMessages$TextDesc._emptyArray == null) {
             LiveCommonNoticeMessages$TextDesc[] textDescArra = new LiveCommonNoticeMessages$TextDesc[0];
             LiveCommonNoticeMessages$TextDesc._emptyArray = textDescArra;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCommonNoticeMessages$TextDesc._emptyArray;
    }
    public static LiveCommonNoticeMessages$TextDesc parseFrom(CodedInputByteBufferNano p0){
       return new LiveCommonNoticeMessages$TextDesc().mergeFrom(p0);
    }
    public static LiveCommonNoticeMessages$TextDesc parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCommonNoticeMessages$TextDesc(), p0);
    }
    public LiveCommonNoticeMessages$TextDesc clear(){
       this.textContent = "";
       this.textColor = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.textContent).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.textContent);
       }
       if (!(this.textColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.textColor);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCommonNoticeMessages$TextDesc mergeFrom(CodedInputByteBufferNano p0){
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
                this.textColor = p0.readString();
             }
          }else {
             this.textContent = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.textContent).equals(str)) {
          p0.writeString(1, this.textContent);
       }
       if (!(this.textColor).equals(str)) {
          p0.writeString(2, this.textColor);
       }
       super.writeTo(p0);
       return;
    }
}
