package com.kuaishou.protobuf.livestream.nano.InteractiveGuideDisplayInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.InteractiveGuideDisplayContent;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class InteractiveGuideDisplayInfo extends MessageNano	// class@000c27
{
    public InteractiveGuideDisplayContent[] displayContent;
    public long picRotationDurationMs;
    public int style;
    public static InteractiveGuideDisplayInfo[] _emptyArray;

    public void InteractiveGuideDisplayInfo(){
       super();
       this.clear();
    }
    public static InteractiveGuideDisplayInfo[] emptyArray(){
       if (InteractiveGuideDisplayInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (InteractiveGuideDisplayInfo._emptyArray == null) {
             InteractiveGuideDisplayInfo[] interactiveG = new InteractiveGuideDisplayInfo[0];
             InteractiveGuideDisplayInfo._emptyArray = interactiveG;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return InteractiveGuideDisplayInfo._emptyArray;
    }
    public static InteractiveGuideDisplayInfo parseFrom(CodedInputByteBufferNano p0){
       return new InteractiveGuideDisplayInfo().mergeFrom(p0);
    }
    public static InteractiveGuideDisplayInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new InteractiveGuideDisplayInfo(), p0);
    }
    public InteractiveGuideDisplayInfo clear(){
       this.displayContent = InteractiveGuideDisplayContent.emptyArray();
       this.style = 0;
       this.picRotationDurationMs = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       InteractiveGuideDisplayInfo tdisplayCont = this.displayContent;
       if (tdisplayCont != null && tdisplayCont.length > 0) {
          int i1 = 0;
          InteractiveGuideDisplayInfo tdisplayCont1 = this.displayContent;
          while (i1 < tdisplayCont1.length) {
             object oobject = tdisplayCont1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tdisplayCont = this.style;
       if (tdisplayCont != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tdisplayCont);
       }
       tdisplayCont = this.picRotationDurationMs;
       if (tdisplayCont) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tdisplayCont);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public InteractiveGuideDisplayInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (i != 16) {
                if (i != 48) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.picRotationDurationMs = p0.readUInt64();
                }
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && (i != 4 && i != 5))))) {
                   continue ;
                }else {
                   this.style = i;
                }
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             InteractiveGuideDisplayInfo tdisplayCont = this.displayContent;
             int i2 = (tdisplayCont == null)? 0: tdisplayCont.length;
             i = i + i2;
             InteractiveGuideDisplayContent[] interactiveG = new InteractiveGuideDisplayContent[i];
             if (i2) {
                System.arraycopy(tdisplayCont, 0, interactiveG, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                interactiveG[i2] = new InteractiveGuideDisplayContent();
                p0.readMessage(interactiveG[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             interactiveG[i2] = new InteractiveGuideDisplayContent();
             p0.readMessage(interactiveG[i2]);
             this.displayContent = interactiveG;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       InteractiveGuideDisplayInfo tdisplayCont = this.displayContent;
       if (tdisplayCont != null && tdisplayCont.length > 0) {
          int i = 0;
          InteractiveGuideDisplayInfo tdisplayCont1 = this.displayContent;
          while (i < tdisplayCont1.length) {
             object oobject = tdisplayCont1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       tdisplayCont = this.style;
       if (tdisplayCont != null) {
          p0.writeInt32(2, tdisplayCont);
       }
       tdisplayCont = this.picRotationDurationMs;
       if (tdisplayCont) {
          p0.writeUInt64(6, tdisplayCont);
       }
       super.writeTo(p0);
       return;
    }
}
