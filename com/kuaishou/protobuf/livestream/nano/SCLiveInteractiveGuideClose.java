package com.kuaishou.protobuf.livestream.nano.SCLiveInteractiveGuideClose;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.InteractiveGuideClose;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class SCLiveInteractiveGuideClose extends MessageNano	// class@000d50
{
    public InteractiveGuideClose[] guideClose;
    public static SCLiveInteractiveGuideClose[] _emptyArray;

    public void SCLiveInteractiveGuideClose(){
       super();
       this.clear();
    }
    public static SCLiveInteractiveGuideClose[] emptyArray(){
       if (SCLiveInteractiveGuideClose._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveInteractiveGuideClose._emptyArray == null) {
             SCLiveInteractiveGuideClose[] sCLiveIntera = new SCLiveInteractiveGuideClose[0];
             SCLiveInteractiveGuideClose._emptyArray = sCLiveIntera;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveInteractiveGuideClose._emptyArray;
    }
    public static SCLiveInteractiveGuideClose parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveInteractiveGuideClose().mergeFrom(p0);
    }
    public static SCLiveInteractiveGuideClose parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveInteractiveGuideClose(), p0);
    }
    public SCLiveInteractiveGuideClose clear(){
       this.guideClose = InteractiveGuideClose.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCLiveInteractiveGuideClose tguideClose = this.guideClose;
       if (tguideClose != null && tguideClose.length > 0) {
          int i1 = 0;
          SCLiveInteractiveGuideClose tguideClose1 = this.guideClose;
          while (i1 < tguideClose1.length) {
             object oobject = tguideClose1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveInteractiveGuideClose mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             SCLiveInteractiveGuideClose tguideClose = this.guideClose;
             int i2 = (tguideClose == null)? 0: tguideClose.length;
             i = i + i2;
             InteractiveGuideClose[] interactiveG = new InteractiveGuideClose[i];
             if (i2) {
                System.arraycopy(tguideClose, 0, interactiveG, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                interactiveG[i2] = new InteractiveGuideClose();
                p0.readMessage(interactiveG[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             interactiveG[i2] = new InteractiveGuideClose();
             p0.readMessage(interactiveG[i2]);
             this.guideClose = interactiveG;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCLiveInteractiveGuideClose tguideClose = this.guideClose;
       if (tguideClose != null && tguideClose.length > 0) {
          int i = 0;
          SCLiveInteractiveGuideClose tguideClose1 = this.guideClose;
          while (i < tguideClose1.length) {
             object oobject = tguideClose1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
