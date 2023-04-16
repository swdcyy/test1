package com.kuaishou.protobuf.livestream.nano.LiveUiText;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveUiText extends MessageNano	// class@000d1f
{
    public String textColor;
    public String textContent;
    public static LiveUiText[] _emptyArray;

    public void LiveUiText(){
       super();
       this.clear();
    }
    public static LiveUiText[] emptyArray(){
       if (LiveUiText._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveUiText._emptyArray == null) {
             LiveUiText[] liveUiTextAr = new LiveUiText[0];
             LiveUiText._emptyArray = liveUiTextAr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveUiText._emptyArray;
    }
    public static LiveUiText parseFrom(CodedInputByteBufferNano p0){
       return new LiveUiText().mergeFrom(p0);
    }
    public static LiveUiText parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveUiText(), p0);
    }
    public LiveUiText clear(){
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
    public LiveUiText mergeFrom(CodedInputByteBufferNano p0){
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
