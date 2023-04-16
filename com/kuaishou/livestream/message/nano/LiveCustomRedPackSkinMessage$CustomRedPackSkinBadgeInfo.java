package com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$CustomRedPackSkinBadgeInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveCustomRedPackSkinMessage$CustomRedPackSkinBadgeInfo extends MessageNano	// class@001176
{
    public String badgeLabelBgColor;
    public static LiveCustomRedPackSkinMessage$CustomRedPackSkinBadgeInfo[] _emptyArray;

    public void LiveCustomRedPackSkinMessage$CustomRedPackSkinBadgeInfo(){
       super();
       this.clear();
    }
    public static LiveCustomRedPackSkinMessage$CustomRedPackSkinBadgeInfo[] emptyArray(){
       if (LiveCustomRedPackSkinMessage$CustomRedPackSkinBadgeInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCustomRedPackSkinMessage$CustomRedPackSkinBadgeInfo._emptyArray == null) {
             LiveCustomRedPackSkinMessage$CustomRedPackSkinBadgeInfo[] uCustomRedPa = new LiveCustomRedPackSkinMessage$CustomRedPackSkinBadgeInfo[0];
             LiveCustomRedPackSkinMessage$CustomRedPackSkinBadgeInfo._emptyArray = uCustomRedPa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCustomRedPackSkinMessage$CustomRedPackSkinBadgeInfo._emptyArray;
    }
    public static LiveCustomRedPackSkinMessage$CustomRedPackSkinBadgeInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveCustomRedPackSkinMessage$CustomRedPackSkinBadgeInfo().mergeFrom(p0);
    }
    public static LiveCustomRedPackSkinMessage$CustomRedPackSkinBadgeInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCustomRedPackSkinMessage$CustomRedPackSkinBadgeInfo(), p0);
    }
    public LiveCustomRedPackSkinMessage$CustomRedPackSkinBadgeInfo clear(){
       this.badgeLabelBgColor = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.badgeLabelBgColor).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.badgeLabelBgColor);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCustomRedPackSkinMessage$CustomRedPackSkinBadgeInfo mergeFrom(CodedInputByteBufferNano p0){
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
             this.badgeLabelBgColor = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.badgeLabelBgColor).equals("")) {
          p0.writeString(1, this.badgeLabelBgColor);
       }
       super.writeTo(p0);
       return;
    }
}
