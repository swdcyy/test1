package com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$CommonOrArrowRedPackSkin;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$CustomRedPackSkinInnerInfo;
import com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$CustomRedPackSkinOpenButtonInfo;

public final class LiveCustomRedPackSkinMessage$CommonOrArrowRedPackSkin extends MessageNano	// class@001174
{
    public LiveCustomRedPackSkinMessage$CustomRedPackSkinInnerInfo innerInfo;
    public LiveCustomRedPackSkinMessage$CustomRedPackSkinOpenButtonInfo openButton;
    public static LiveCustomRedPackSkinMessage$CommonOrArrowRedPackSkin[] _emptyArray;

    public void LiveCustomRedPackSkinMessage$CommonOrArrowRedPackSkin(){
       super();
       this.clear();
    }
    public static LiveCustomRedPackSkinMessage$CommonOrArrowRedPackSkin[] emptyArray(){
       if (LiveCustomRedPackSkinMessage$CommonOrArrowRedPackSkin._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCustomRedPackSkinMessage$CommonOrArrowRedPackSkin._emptyArray == null) {
             LiveCustomRedPackSkinMessage$CommonOrArrowRedPackSkin[] uCommonOrArr = new LiveCustomRedPackSkinMessage$CommonOrArrowRedPackSkin[0];
             LiveCustomRedPackSkinMessage$CommonOrArrowRedPackSkin._emptyArray = uCommonOrArr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCustomRedPackSkinMessage$CommonOrArrowRedPackSkin._emptyArray;
    }
    public static LiveCustomRedPackSkinMessage$CommonOrArrowRedPackSkin parseFrom(CodedInputByteBufferNano p0){
       return new LiveCustomRedPackSkinMessage$CommonOrArrowRedPackSkin().mergeFrom(p0);
    }
    public static LiveCustomRedPackSkinMessage$CommonOrArrowRedPackSkin parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCustomRedPackSkinMessage$CommonOrArrowRedPackSkin(), p0);
    }
    public LiveCustomRedPackSkinMessage$CommonOrArrowRedPackSkin clear(){
       this.openButton = null;
       this.innerInfo = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveCustomRedPackSkinMessage$CommonOrArrowRedPackSkin topenButton = this.openButton;
       if (topenButton != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, topenButton);
       }
       topenButton = this.innerInfo;
       if (topenButton != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, topenButton);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCustomRedPackSkinMessage$CommonOrArrowRedPackSkin mergeFrom(CodedInputByteBufferNano p0){
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
       LiveCustomRedPackSkinMessage$CommonOrArrowRedPackSkin topenButton = this.openButton;
       if (topenButton != null) {
          p0.writeMessage(1, topenButton);
       }
       topenButton = this.innerInfo;
       if (topenButton != null) {
          p0.writeMessage(2, topenButton);
       }
       super.writeTo(p0);
       return;
    }
}
