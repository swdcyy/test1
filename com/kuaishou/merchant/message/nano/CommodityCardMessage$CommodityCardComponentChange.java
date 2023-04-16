package com.kuaishou.merchant.message.nano.CommodityCardMessage$CommodityCardComponentChange;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class CommodityCardMessage$CommodityCardComponentChange extends MessageNano	// class@001c3a
{
    public static CommodityCardMessage$CommodityCardComponentChange[] _emptyArray;

    public void CommodityCardMessage$CommodityCardComponentChange(){
       super();
       this.clear();
    }
    public static CommodityCardMessage$CommodityCardComponentChange[] emptyArray(){
       if (CommodityCardMessage$CommodityCardComponentChange._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (CommodityCardMessage$CommodityCardComponentChange._emptyArray == null) {
             CommodityCardMessage$CommodityCardComponentChange[] uCommodityCa = new CommodityCardMessage$CommodityCardComponentChange[0];
             CommodityCardMessage$CommodityCardComponentChange._emptyArray = uCommodityCa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return CommodityCardMessage$CommodityCardComponentChange._emptyArray;
    }
    public static CommodityCardMessage$CommodityCardComponentChange parseFrom(CodedInputByteBufferNano p0){
       return new CommodityCardMessage$CommodityCardComponentChange().mergeFrom(p0);
    }
    public static CommodityCardMessage$CommodityCardComponentChange parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new CommodityCardMessage$CommodityCardComponentChange(), p0);
    }
    public CommodityCardMessage$CommodityCardComponentChange clear(){
       this.cachedSize = -1;
       return this;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public CommodityCardMessage$CommodityCardComponentChange mergeFrom(CodedInputByteBufferNano p0){
       int i;
       do {
          i = p0.readTag();
       } while (!i || !WireFormatNano.parseUnknownField(p0, i));
       return this;
    }
}
