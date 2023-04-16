package com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$AudienceRedPackSkin;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$CustomRedPackSkinButtonInfo;
import com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$CustomRedPackSkinInnerInfo;
import com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$CustomRedPackSkinOpenButtonInfo;

public final class LiveCustomRedPackSkinMessage$AudienceRedPackSkin extends MessageNano	// class@001173
{
    public LiveCustomRedPackSkinMessage$CustomRedPackSkinInnerInfo innerInfo;
    public LiveCustomRedPackSkinMessage$CustomRedPackSkinOpenButtonInfo openButton;
    public LiveCustomRedPackSkinMessage$CustomRedPackSkinButtonInfo sendGiftButton;
    public static LiveCustomRedPackSkinMessage$AudienceRedPackSkin[] _emptyArray;

    public void LiveCustomRedPackSkinMessage$AudienceRedPackSkin(){
       super();
       this.clear();
    }
    public static LiveCustomRedPackSkinMessage$AudienceRedPackSkin[] emptyArray(){
       if (LiveCustomRedPackSkinMessage$AudienceRedPackSkin._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCustomRedPackSkinMessage$AudienceRedPackSkin._emptyArray == null) {
             LiveCustomRedPackSkinMessage$AudienceRedPackSkin[] uAudienceRed = new LiveCustomRedPackSkinMessage$AudienceRedPackSkin[0];
             LiveCustomRedPackSkinMessage$AudienceRedPackSkin._emptyArray = uAudienceRed;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCustomRedPackSkinMessage$AudienceRedPackSkin._emptyArray;
    }
    public static LiveCustomRedPackSkinMessage$AudienceRedPackSkin parseFrom(CodedInputByteBufferNano p0){
       return new LiveCustomRedPackSkinMessage$AudienceRedPackSkin().mergeFrom(p0);
    }
    public static LiveCustomRedPackSkinMessage$AudienceRedPackSkin parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCustomRedPackSkinMessage$AudienceRedPackSkin(), p0);
    }
    public LiveCustomRedPackSkinMessage$AudienceRedPackSkin clear(){
       this.openButton = null;
       this.innerInfo = null;
       this.sendGiftButton = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveCustomRedPackSkinMessage$AudienceRedPackSkin topenButton = this.openButton;
       if (topenButton != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, topenButton);
       }
       topenButton = this.innerInfo;
       if (topenButton != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, topenButton);
       }
       topenButton = this.sendGiftButton;
       if (topenButton != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, topenButton);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCustomRedPackSkinMessage$AudienceRedPackSkin mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else if(this.sendGiftButton == null){
                   this.sendGiftButton = new LiveCustomRedPackSkinMessage$CustomRedPackSkinButtonInfo();
                }
                p0.readMessage(this.sendGiftButton);
             }else if(this.innerInfo == null){
                this.innerInfo = new LiveCustomRedPackSkinMessage$CustomRedPackSkinInnerInfo();
             }
             p0.readMessage(this.innerInfo);
          }else if(this.openButton == null){
             this.openButton = new LiveCustomRedPackSkinMessage$CustomRedPackSkinOpenButtonInfo();
          }
          p0.readMessage(this.openButton);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveCustomRedPackSkinMessage$AudienceRedPackSkin topenButton = this.openButton;
       if (topenButton != null) {
          p0.writeMessage(1, topenButton);
       }
       topenButton = this.innerInfo;
       if (topenButton != null) {
          p0.writeMessage(2, topenButton);
       }
       topenButton = this.sendGiftButton;
       if (topenButton != null) {
          p0.writeMessage(3, topenButton);
       }
       super.writeTo(p0);
       return;
    }
}
