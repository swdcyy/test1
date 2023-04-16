package com.kuaishou.protobuf.livestream.nano.SCLiveInteractiveGuide;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.InteractiveGuide;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class SCLiveInteractiveGuide extends MessageNano	// class@000d4f
{
    public InteractiveGuide[] guide;
    public static SCLiveInteractiveGuide[] _emptyArray;

    public void SCLiveInteractiveGuide(){
       super();
       this.clear();
    }
    public static SCLiveInteractiveGuide[] emptyArray(){
       if (SCLiveInteractiveGuide._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveInteractiveGuide._emptyArray == null) {
             SCLiveInteractiveGuide[] sCLiveIntera = new SCLiveInteractiveGuide[0];
             SCLiveInteractiveGuide._emptyArray = sCLiveIntera;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveInteractiveGuide._emptyArray;
    }
    public static SCLiveInteractiveGuide parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveInteractiveGuide().mergeFrom(p0);
    }
    public static SCLiveInteractiveGuide parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveInteractiveGuide(), p0);
    }
    public SCLiveInteractiveGuide clear(){
       this.guide = InteractiveGuide.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCLiveInteractiveGuide tguide = this.guide;
       if (tguide != null && tguide.length > 0) {
          int i1 = 0;
          SCLiveInteractiveGuide tguide1 = this.guide;
          while (i1 < tguide1.length) {
             object oobject = tguide1[i1];
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
    public SCLiveInteractiveGuide mergeFrom(CodedInputByteBufferNano p0){
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
             SCLiveInteractiveGuide tguide = this.guide;
             int i2 = (tguide == null)? 0: tguide.length;
             i = i + i2;
             InteractiveGuide[] interactiveG = new InteractiveGuide[i];
             if (i2) {
                System.arraycopy(tguide, 0, interactiveG, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                interactiveG[i2] = new InteractiveGuide();
                p0.readMessage(interactiveG[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             interactiveG[i2] = new InteractiveGuide();
             p0.readMessage(interactiveG[i2]);
             this.guide = interactiveG;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCLiveInteractiveGuide tguide = this.guide;
       if (tguide != null && tguide.length > 0) {
          int i = 0;
          SCLiveInteractiveGuide tguide1 = this.guide;
          while (i < tguide1.length) {
             object oobject = tguide1[i];
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
