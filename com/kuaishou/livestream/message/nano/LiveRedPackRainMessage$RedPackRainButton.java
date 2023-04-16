package com.kuaishou.livestream.message.nano.LiveRedPackRainMessage$RedPackRainButton;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveRedPackRainMessage$RedPackRainPicture;
import com.kuaishou.livestream.message.nano.LiveRedPackRainMessage$RedPackRainText;

public final class LiveRedPackRainMessage$RedPackRainButton extends MessageNano	// class@001271
{
    public boolean isHidden;
    public String link;
    public LiveRedPackRainMessage$RedPackRainPicture picture;
    public LiveRedPackRainMessage$RedPackRainText text;
    public static LiveRedPackRainMessage$RedPackRainButton[] _emptyArray;

    public void LiveRedPackRainMessage$RedPackRainButton(){
       super();
       this.clear();
    }
    public static LiveRedPackRainMessage$RedPackRainButton[] emptyArray(){
       if (LiveRedPackRainMessage$RedPackRainButton._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRedPackRainMessage$RedPackRainButton._emptyArray == null) {
             LiveRedPackRainMessage$RedPackRainButton[] redPackRainB = new LiveRedPackRainMessage$RedPackRainButton[0];
             LiveRedPackRainMessage$RedPackRainButton._emptyArray = redPackRainB;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRedPackRainMessage$RedPackRainButton._emptyArray;
    }
    public static LiveRedPackRainMessage$RedPackRainButton parseFrom(CodedInputByteBufferNano p0){
       return new LiveRedPackRainMessage$RedPackRainButton().mergeFrom(p0);
    }
    public static LiveRedPackRainMessage$RedPackRainButton parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRedPackRainMessage$RedPackRainButton(), p0);
    }
    public LiveRedPackRainMessage$RedPackRainButton clear(){
       this.text = null;
       this.picture = null;
       this.link = "";
       this.isHidden = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveRedPackRainMessage$RedPackRainButton ttext = this.text;
       if (ttext != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, ttext);
       }
       ttext = this.picture;
       if (ttext != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, ttext);
       }
       if (!(this.link).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.link);
       }
       ttext = this.isHidden;
       if (ttext != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, ttext);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRedPackRainMessage$RedPackRainButton mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.isHidden = p0.readBool();
                   }
                }else {
                   this.link = p0.readString();
                }
             }else if(this.picture == null){
                this.picture = new LiveRedPackRainMessage$RedPackRainPicture();
             }
             p0.readMessage(this.picture);
          }else if(this.text == null){
             this.text = new LiveRedPackRainMessage$RedPackRainText();
          }
          p0.readMessage(this.text);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveRedPackRainMessage$RedPackRainButton ttext = this.text;
       if (ttext != null) {
          p0.writeMessage(1, ttext);
       }
       ttext = this.picture;
       if (ttext != null) {
          p0.writeMessage(2, ttext);
       }
       if (!(this.link).equals("")) {
          p0.writeString(3, this.link);
       }
       ttext = this.isHidden;
       if (ttext != null) {
          p0.writeBool(4, ttext);
       }
       super.writeTo(p0);
       return;
    }
}
