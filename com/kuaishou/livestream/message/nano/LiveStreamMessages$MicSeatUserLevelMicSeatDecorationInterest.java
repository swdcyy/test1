package com.kuaishou.livestream.message.nano.LiveStreamMessages$MicSeatUserLevelMicSeatDecorationInterest;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveCdnNodeView;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class LiveStreamMessages$MicSeatUserLevelMicSeatDecorationInterest extends MessageNano	// class@001302
{
    public int id;
    public boolean isDefault;
    public LiveCdnNodeView[] materialUrls;
    public int type;
    public static LiveStreamMessages$MicSeatUserLevelMicSeatDecorationInterest[] _emptyArray;

    public void LiveStreamMessages$MicSeatUserLevelMicSeatDecorationInterest(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$MicSeatUserLevelMicSeatDecorationInterest[] emptyArray(){
       if (LiveStreamMessages$MicSeatUserLevelMicSeatDecorationInterest._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$MicSeatUserLevelMicSeatDecorationInterest._emptyArray == null) {
             LiveStreamMessages$MicSeatUserLevelMicSeatDecorationInterest[] micSeatUserL = new LiveStreamMessages$MicSeatUserLevelMicSeatDecorationInterest[0];
             LiveStreamMessages$MicSeatUserLevelMicSeatDecorationInterest._emptyArray = micSeatUserL;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$MicSeatUserLevelMicSeatDecorationInterest._emptyArray;
    }
    public static LiveStreamMessages$MicSeatUserLevelMicSeatDecorationInterest parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$MicSeatUserLevelMicSeatDecorationInterest().mergeFrom(p0);
    }
    public static LiveStreamMessages$MicSeatUserLevelMicSeatDecorationInterest parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$MicSeatUserLevelMicSeatDecorationInterest(), p0);
    }
    public LiveStreamMessages$MicSeatUserLevelMicSeatDecorationInterest clear(){
       this.id = 0;
       this.type = 0;
       this.isDefault = false;
       this.materialUrls = LiveCdnNodeView.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$MicSeatUserLevelMicSeatDecorationInterest tid = this.id;
       if (tid != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tid);
       }
       tid = this.type;
       if (tid != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tid);
       }
       tid = this.isDefault;
       if (tid != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, tid);
       }
       tid = this.materialUrls;
       if (tid != null && tid.length > 0) {
          int i1 = 0;
          LiveStreamMessages$MicSeatUserLevelMicSeatDecorationInterest tmaterialUrl = this.materialUrls;
          while (i1 < tmaterialUrl.length) {
             object oobject = tmaterialUrl[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(4, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$MicSeatUserLevelMicSeatDecorationInterest mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   int i1 = 34;
                   if (i != i1) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                      LiveStreamMessages$MicSeatUserLevelMicSeatDecorationInterest tmaterialUrl = this.materialUrls;
                      int i2 = (tmaterialUrl == null)? 0: tmaterialUrl.length;
                      i = i + i2;
                      LiveCdnNodeView[] liveCdnNodeV = new LiveCdnNodeView[i];
                      if (i2) {
                         System.arraycopy(tmaterialUrl, 0, liveCdnNodeV, 0, i2);
                      }
                      i1 = i - 1;
                      while (i2 < i1) {
                         liveCdnNodeV[i2] = new LiveCdnNodeView();
                         p0.readMessage(liveCdnNodeV[i2]);
                         p0.readTag();
                         i2 = i2 + 1;
                      }
                      liveCdnNodeV[i2] = new LiveCdnNodeView();
                      p0.readMessage(liveCdnNodeV[i2]);
                      this.materialUrls = liveCdnNodeV;
                   }
                }else {
                   this.isDefault = p0.readBool();
                }
             }else {
                i = p0.readInt32();
                switch (i){
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 1:
                      break;
                    default:
                }
                this.type = i;
             }
          }else {
             this.id = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$MicSeatUserLevelMicSeatDecorationInterest tid = this.id;
       if (tid != null) {
          p0.writeUInt32(1, tid);
       }
       tid = this.type;
       if (tid != null) {
          p0.writeInt32(2, tid);
       }
       tid = this.isDefault;
       if (tid != null) {
          p0.writeBool(3, tid);
       }
       tid = this.materialUrls;
       if (tid != null && tid.length > 0) {
          int i = 0;
          LiveStreamMessages$MicSeatUserLevelMicSeatDecorationInterest tmaterialUrl = this.materialUrls;
          while (i < tmaterialUrl.length) {
             object oobject = tmaterialUrl[i];
             if (oobject != null) {
                p0.writeMessage(4, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
