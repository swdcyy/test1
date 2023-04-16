package com.kuaishou.livestream.message.nano.LiveLocalLifeProductHot$SCLiveLocalLifeHotProduct;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveLocalLifeProductHot$LiveLocalLifeCDNUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveLocalLifeProductHot$SCLiveLocalLifeHotProduct extends MessageNano	// class@0011f1
{
    public int hotSaleStatus;
    public String itemId;
    public int lastVolume;
    public LiveLocalLifeProductHot$LiveLocalLifeCDNUrl[] leftIcon;
    public int volume;
    public static LiveLocalLifeProductHot$SCLiveLocalLifeHotProduct[] _emptyArray;

    public void LiveLocalLifeProductHot$SCLiveLocalLifeHotProduct(){
       super();
       this.clear();
    }
    public static LiveLocalLifeProductHot$SCLiveLocalLifeHotProduct[] emptyArray(){
       if (LiveLocalLifeProductHot$SCLiveLocalLifeHotProduct._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveLocalLifeProductHot$SCLiveLocalLifeHotProduct._emptyArray == null) {
             LiveLocalLifeProductHot$SCLiveLocalLifeHotProduct[] sCLiveLocalL = new LiveLocalLifeProductHot$SCLiveLocalLifeHotProduct[0];
             LiveLocalLifeProductHot$SCLiveLocalLifeHotProduct._emptyArray = sCLiveLocalL;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveLocalLifeProductHot$SCLiveLocalLifeHotProduct._emptyArray;
    }
    public static LiveLocalLifeProductHot$SCLiveLocalLifeHotProduct parseFrom(CodedInputByteBufferNano p0){
       return new LiveLocalLifeProductHot$SCLiveLocalLifeHotProduct().mergeFrom(p0);
    }
    public static LiveLocalLifeProductHot$SCLiveLocalLifeHotProduct parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveLocalLifeProductHot$SCLiveLocalLifeHotProduct(), p0);
    }
    public LiveLocalLifeProductHot$SCLiveLocalLifeHotProduct clear(){
       this.leftIcon = LiveLocalLifeProductHot$LiveLocalLifeCDNUrl.emptyArray();
       this.volume = 0;
       this.lastVolume = 0;
       this.itemId = "";
       this.hotSaleStatus = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveLocalLifeProductHot$SCLiveLocalLifeHotProduct tleftIcon = this.leftIcon;
       if (tleftIcon != null && tleftIcon.length > 0) {
          int i1 = 0;
          LiveLocalLifeProductHot$SCLiveLocalLifeHotProduct tleftIcon1 = this.leftIcon;
          while (i1 < tleftIcon1.length) {
             object oobject = tleftIcon1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tleftIcon = this.volume;
       if (tleftIcon != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tleftIcon);
       }
       tleftIcon = this.lastVolume;
       if (tleftIcon != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tleftIcon);
       }
       if (!(this.itemId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.itemId);
       }
       tleftIcon = this.hotSaleStatus;
       if (tleftIcon != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tleftIcon);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveLocalLifeProductHot$SCLiveLocalLifeHotProduct mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         i = p0.readInt32();
                         if (i && i != 1) {
                            continue ;
                         }else {
                            this.hotSaleStatus = i;
                         }
                      }
                   }else {
                      this.itemId = p0.readString();
                   }
                }else {
                   this.lastVolume = p0.readUInt32();
                }
             }else {
                this.volume = p0.readUInt32();
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             LiveLocalLifeProductHot$SCLiveLocalLifeHotProduct tleftIcon = this.leftIcon;
             int i2 = (tleftIcon == null)? 0: tleftIcon.length;
             i = i + i2;
             LiveLocalLifeProductHot$LiveLocalLifeCDNUrl[] liveLocalLif = new LiveLocalLifeProductHot$LiveLocalLifeCDNUrl[i];
             if (i2) {
                System.arraycopy(tleftIcon, 0, liveLocalLif, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                liveLocalLif[i2] = new LiveLocalLifeProductHot$LiveLocalLifeCDNUrl();
                p0.readMessage(liveLocalLif[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             liveLocalLif[i2] = new LiveLocalLifeProductHot$LiveLocalLifeCDNUrl();
             p0.readMessage(liveLocalLif[i2]);
             this.leftIcon = liveLocalLif;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveLocalLifeProductHot$SCLiveLocalLifeHotProduct tleftIcon = this.leftIcon;
       if (tleftIcon != null && tleftIcon.length > 0) {
          int i = 0;
          LiveLocalLifeProductHot$SCLiveLocalLifeHotProduct tleftIcon1 = this.leftIcon;
          while (i < tleftIcon1.length) {
             object oobject = tleftIcon1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       tleftIcon = this.volume;
       if (tleftIcon != null) {
          p0.writeUInt32(2, tleftIcon);
       }
       tleftIcon = this.lastVolume;
       if (tleftIcon != null) {
          p0.writeUInt32(3, tleftIcon);
       }
       if (!(this.itemId).equals("")) {
          p0.writeString(4, this.itemId);
       }
       tleftIcon = this.hotSaleStatus;
       if (tleftIcon != null) {
          p0.writeInt32(5, tleftIcon);
       }
       super.writeTo(p0);
       return;
    }
}
