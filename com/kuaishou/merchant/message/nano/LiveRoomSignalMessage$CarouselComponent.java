package com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$CarouselComponent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$PendantComponent;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class LiveRoomSignalMessage$CarouselComponent extends MessageNano	// class@001c45
{
    public long carouselMills;
    public int carouselType;
    public LiveRoomSignalMessage$PendantComponent[] component;
    public static LiveRoomSignalMessage$CarouselComponent[] _emptyArray;

    public void LiveRoomSignalMessage$CarouselComponent(){
       super();
       this.clear();
    }
    public static LiveRoomSignalMessage$CarouselComponent[] emptyArray(){
       if (LiveRoomSignalMessage$CarouselComponent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRoomSignalMessage$CarouselComponent._emptyArray == null) {
             LiveRoomSignalMessage$CarouselComponent[] uCarouselCom = new LiveRoomSignalMessage$CarouselComponent[0];
             LiveRoomSignalMessage$CarouselComponent._emptyArray = uCarouselCom;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRoomSignalMessage$CarouselComponent._emptyArray;
    }
    public static LiveRoomSignalMessage$CarouselComponent parseFrom(CodedInputByteBufferNano p0){
       return new LiveRoomSignalMessage$CarouselComponent().mergeFrom(p0);
    }
    public static LiveRoomSignalMessage$CarouselComponent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRoomSignalMessage$CarouselComponent(), p0);
    }
    public LiveRoomSignalMessage$CarouselComponent clear(){
       this.carouselType = 0;
       this.carouselMills = 0;
       this.component = LiveRoomSignalMessage$PendantComponent.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveRoomSignalMessage$CarouselComponent tcarouselTyp = this.carouselType;
       if (tcarouselTyp != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tcarouselTyp);
       }
       tcarouselTyp = this.carouselMills;
       if (tcarouselTyp) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tcarouselTyp);
       }
       tcarouselTyp = this.component;
       if (tcarouselTyp != null && tcarouselTyp.length > 0) {
          int i1 = 0;
          LiveRoomSignalMessage$CarouselComponent tcomponent = this.component;
          while (i1 < tcomponent.length) {
             object oobject = tcomponent[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRoomSignalMessage$CarouselComponent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                int i1 = 26;
                if (i != i1) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   LiveRoomSignalMessage$CarouselComponent tcomponent = this.component;
                   int i2 = (tcomponent == null)? 0: tcomponent.length;
                   i = i + i2;
                   LiveRoomSignalMessage$PendantComponent[] pendantCompo = new LiveRoomSignalMessage$PendantComponent[i];
                   if (i2) {
                      System.arraycopy(tcomponent, 0, pendantCompo, 0, i2);
                   }
                   i1 = i - 1;
                   while (i2 < i1) {
                      pendantCompo[i2] = new LiveRoomSignalMessage$PendantComponent();
                      p0.readMessage(pendantCompo[i2]);
                      p0.readTag();
                      i2 = i2 + 1;
                   }
                   pendantCompo[i2] = new LiveRoomSignalMessage$PendantComponent();
                   p0.readMessage(pendantCompo[i2]);
                   this.component = pendantCompo;
                }
             }else {
                this.carouselMills = p0.readUInt64();
             }
          }else {
             this.carouselType = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveRoomSignalMessage$CarouselComponent tcarouselTyp = this.carouselType;
       if (tcarouselTyp != null) {
          p0.writeUInt32(1, tcarouselTyp);
       }
       tcarouselTyp = this.carouselMills;
       if (tcarouselTyp) {
          p0.writeUInt64(2, tcarouselTyp);
       }
       tcarouselTyp = this.component;
       if (tcarouselTyp != null && tcarouselTyp.length > 0) {
          int i = 0;
          LiveRoomSignalMessage$CarouselComponent tcomponent = this.component;
          while (i < tcomponent.length) {
             object oobject = tcomponent[i];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
