package com.kuaishou.protobuf.livestream.nano.InteractiveGuideIntroductionInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class InteractiveGuideIntroductionInfo extends MessageNano	// class@000c29
{
    public boolean hasCloseButton;
    public String title;
    public static InteractiveGuideIntroductionInfo[] _emptyArray;

    public void InteractiveGuideIntroductionInfo(){
       super();
       this.clear();
    }
    public static InteractiveGuideIntroductionInfo[] emptyArray(){
       if (InteractiveGuideIntroductionInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (InteractiveGuideIntroductionInfo._emptyArray == null) {
             InteractiveGuideIntroductionInfo[] interactiveG = new InteractiveGuideIntroductionInfo[0];
             InteractiveGuideIntroductionInfo._emptyArray = interactiveG;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return InteractiveGuideIntroductionInfo._emptyArray;
    }
    public static InteractiveGuideIntroductionInfo parseFrom(CodedInputByteBufferNano p0){
       return new InteractiveGuideIntroductionInfo().mergeFrom(p0);
    }
    public static InteractiveGuideIntroductionInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new InteractiveGuideIntroductionInfo(), p0);
    }
    public InteractiveGuideIntroductionInfo clear(){
       this.title = "";
       this.hasCloseButton = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.title).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.title);
       }
       InteractiveGuideIntroductionInfo thasCloseBut = this.hasCloseButton;
       if (thasCloseBut != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, thasCloseBut);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public InteractiveGuideIntroductionInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.hasCloseButton = p0.readBool();
             }
          }else {
             this.title = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.title).equals("")) {
          p0.writeString(1, this.title);
       }
       InteractiveGuideIntroductionInfo thasCloseBut = this.hasCloseButton;
       if (thasCloseBut != null) {
          p0.writeBool(2, thasCloseBut);
       }
       super.writeTo(p0);
       return;
    }
}
