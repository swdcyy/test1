package com.kuaishou.livestream.message.nano.LiveShopMessages$SCShopMerchantSquareOpened;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveShopMessages$SCShopMerchantSquareOpened extends MessageNano	// class@0012a7
{
    public String desc;
    public String descColor;
    public int gatewayType;
    public long iconHeight;
    public String iconUrl;
    public long iconWidth;
    public String jumpUrl;
    public String liveStreamId;
    public static LiveShopMessages$SCShopMerchantSquareOpened[] _emptyArray;

    public void LiveShopMessages$SCShopMerchantSquareOpened(){
       super();
       this.clear();
    }
    public static LiveShopMessages$SCShopMerchantSquareOpened[] emptyArray(){
       if (LiveShopMessages$SCShopMerchantSquareOpened._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveShopMessages$SCShopMerchantSquareOpened._emptyArray == null) {
             LiveShopMessages$SCShopMerchantSquareOpened[] sCShopMercha = new LiveShopMessages$SCShopMerchantSquareOpened[0];
             LiveShopMessages$SCShopMerchantSquareOpened._emptyArray = sCShopMercha;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveShopMessages$SCShopMerchantSquareOpened._emptyArray;
    }
    public static LiveShopMessages$SCShopMerchantSquareOpened parseFrom(CodedInputByteBufferNano p0){
       return new LiveShopMessages$SCShopMerchantSquareOpened().mergeFrom(p0);
    }
    public static LiveShopMessages$SCShopMerchantSquareOpened parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveShopMessages$SCShopMerchantSquareOpened(), p0);
    }
    public LiveShopMessages$SCShopMerchantSquareOpened clear(){
       this.liveStreamId = "";
       this.iconUrl = "";
       this.iconWidth = 0;
       this.iconHeight = 0;
       this.desc = "";
       this.descColor = "";
       this.jumpUrl = "";
       this.gatewayType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       if (!(this.iconUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.iconUrl);
       }
       LiveShopMessages$SCShopMerchantSquareOpened ticonWidth = this.iconWidth;
       if (ticonWidth) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, ticonWidth);
       }
       ticonWidth = this.iconHeight;
       if (ticonWidth) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, ticonWidth);
       }
       if (!(this.desc).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.desc);
       }
       if (!(this.descColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.descColor);
       }
       if (!(this.jumpUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.jumpUrl);
       }
       LiveShopMessages$SCShopMerchantSquareOpened tgatewayType = this.gatewayType;
       if (tgatewayType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(8, tgatewayType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveShopMessages$SCShopMerchantSquareOpened mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 42) {
                         if (i != 50) {
                            if (i != 58) {
                               if (i != 64) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
                                  }
                               }else {
                                  i = p0.readInt32();
                                  if (i && (i != 1 && i != 2)) {
                                     continue ;
                                  }else {
                                     this.gatewayType = i;
                                  }
                               }
                            }else {
                               this.jumpUrl = p0.readString();
                            }
                         }else {
                            this.descColor = p0.readString();
                         }
                      }else {
                         this.desc = p0.readString();
                      }
                   }else {
                      this.iconHeight = p0.readUInt64();
                   }
                }else {
                   this.iconWidth = p0.readUInt64();
                }
             }else {
                this.iconUrl = p0.readString();
             }
          }else {
             this.liveStreamId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(1, this.liveStreamId);
       }
       if (!(this.iconUrl).equals(str)) {
          p0.writeString(2, this.iconUrl);
       }
       LiveShopMessages$SCShopMerchantSquareOpened ticonWidth = this.iconWidth;
       if (ticonWidth) {
          p0.writeUInt64(3, ticonWidth);
       }
       ticonWidth = this.iconHeight;
       if (ticonWidth) {
          p0.writeUInt64(4, ticonWidth);
       }
       if (!(this.desc).equals(str)) {
          p0.writeString(5, this.desc);
       }
       if (!(this.descColor).equals(str)) {
          p0.writeString(6, this.descColor);
       }
       if (!(this.jumpUrl).equals(str)) {
          p0.writeString(7, this.jumpUrl);
       }
       LiveShopMessages$SCShopMerchantSquareOpened tgatewayType = this.gatewayType;
       if (tgatewayType != null) {
          p0.writeInt32(8, tgatewayType);
       }
       super.writeTo(p0);
       return;
    }
}
