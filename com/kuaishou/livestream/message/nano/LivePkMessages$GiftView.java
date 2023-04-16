package com.kuaishou.livestream.message.nano.LivePkMessages$GiftView;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveCdnNodeView;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LivePkMessages$GiftView extends MessageNano	// class@001212
{
    public int id;
    public String name;
    public LiveCdnNodeView[] pic;
    public int unitPrice;
    public static LivePkMessages$GiftView[] _emptyArray;

    public void LivePkMessages$GiftView(){
       super();
       this.clear();
    }
    public static LivePkMessages$GiftView[] emptyArray(){
       if (LivePkMessages$GiftView._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePkMessages$GiftView._emptyArray == null) {
             LivePkMessages$GiftView[] giftViewArra = new LivePkMessages$GiftView[0];
             LivePkMessages$GiftView._emptyArray = giftViewArra;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePkMessages$GiftView._emptyArray;
    }
    public static LivePkMessages$GiftView parseFrom(CodedInputByteBufferNano p0){
       return new LivePkMessages$GiftView().mergeFrom(p0);
    }
    public static LivePkMessages$GiftView parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePkMessages$GiftView(), p0);
    }
    public LivePkMessages$GiftView clear(){
       this.id = 0;
       this.name = "";
       this.unitPrice = 0;
       this.pic = LiveCdnNodeView.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LivePkMessages$GiftView tid = this.id;
       if (tid != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tid);
       }
       if (!(this.name).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.name);
       }
       tid = this.unitPrice;
       if (tid != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tid);
       }
       tid = this.pic;
       if (tid != null && tid.length > 0) {
          int i1 = 0;
          LivePkMessages$GiftView tpic = this.pic;
          while (i1 < tpic.length) {
             object oobject = tpic[i1];
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
    public LivePkMessages$GiftView mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 24) {
                   int i1 = 34;
                   if (i != i1) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                      LivePkMessages$GiftView tpic = this.pic;
                      int i2 = (tpic == null)? 0: tpic.length;
                      i = i + i2;
                      LiveCdnNodeView[] liveCdnNodeV = new LiveCdnNodeView[i];
                      if (i2) {
                         System.arraycopy(tpic, 0, liveCdnNodeV, 0, i2);
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
                      this.pic = liveCdnNodeV;
                   }
                }else {
                   this.unitPrice = p0.readUInt32();
                }
             }else {
                this.name = p0.readString();
             }
          }else {
             this.id = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LivePkMessages$GiftView tid = this.id;
       if (tid != null) {
          p0.writeUInt32(1, tid);
       }
       if (!(this.name).equals("")) {
          p0.writeString(2, this.name);
       }
       tid = this.unitPrice;
       if (tid != null) {
          p0.writeUInt32(3, tid);
       }
       tid = this.pic;
       if (tid != null && tid.length > 0) {
          int i = 0;
          LivePkMessages$GiftView tpic = this.pic;
          while (i < tpic.length) {
             object oobject = tpic[i];
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
