package com.kuaishou.livestream.message.nano.LivePlusRecruitMessages$LivePlusRecruitAuthorPopupMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LivePlusRecruitMessages$LivePlusRecruitAuthorPopupMessage extends MessageNano	// class@001238
{
    public String buttonText;
    public String content;
    public static LivePlusRecruitMessages$LivePlusRecruitAuthorPopupMessage[] _emptyArray;

    public void LivePlusRecruitMessages$LivePlusRecruitAuthorPopupMessage(){
       super();
       this.clear();
    }
    public static LivePlusRecruitMessages$LivePlusRecruitAuthorPopupMessage[] emptyArray(){
       if (LivePlusRecruitMessages$LivePlusRecruitAuthorPopupMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePlusRecruitMessages$LivePlusRecruitAuthorPopupMessage._emptyArray == null) {
             LivePlusRecruitMessages$LivePlusRecruitAuthorPopupMessage[] livePlusRecr = new LivePlusRecruitMessages$LivePlusRecruitAuthorPopupMessage[0];
             LivePlusRecruitMessages$LivePlusRecruitAuthorPopupMessage._emptyArray = livePlusRecr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePlusRecruitMessages$LivePlusRecruitAuthorPopupMessage._emptyArray;
    }
    public static LivePlusRecruitMessages$LivePlusRecruitAuthorPopupMessage parseFrom(CodedInputByteBufferNano p0){
       return new LivePlusRecruitMessages$LivePlusRecruitAuthorPopupMessage().mergeFrom(p0);
    }
    public static LivePlusRecruitMessages$LivePlusRecruitAuthorPopupMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePlusRecruitMessages$LivePlusRecruitAuthorPopupMessage(), p0);
    }
    public LivePlusRecruitMessages$LivePlusRecruitAuthorPopupMessage clear(){
       this.content = "";
       this.buttonText = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.content).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.content);
       }
       if (!(this.buttonText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.buttonText);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePlusRecruitMessages$LivePlusRecruitAuthorPopupMessage mergeFrom(CodedInputByteBufferNano p0){
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
                this.buttonText = p0.readString();
             }
          }else {
             this.content = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.content).equals(str)) {
          p0.writeString(1, this.content);
       }
       if (!(this.buttonText).equals(str)) {
          p0.writeString(2, this.buttonText);
       }
       super.writeTo(p0);
       return;
    }
}
