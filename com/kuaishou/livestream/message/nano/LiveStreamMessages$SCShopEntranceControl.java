package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCShopEntranceControl;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import com.google.protobuf.nano.MapFactories$MapFactory;
import com.google.protobuf.nano.MapFactories;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SpecialUserInfo;

public final class LiveStreamMessages$SCShopEntranceControl extends MessageNano	// class@00136a
{
    public long displayMaxDelayMillis;
    public String jumpUrl;
    public int onSaleCount;
    public boolean showYellowCart;
    public Map specialUser;
    public static LiveStreamMessages$SCShopEntranceControl[] _emptyArray;

    public void LiveStreamMessages$SCShopEntranceControl(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCShopEntranceControl[] emptyArray(){
       if (LiveStreamMessages$SCShopEntranceControl._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCShopEntranceControl._emptyArray == null) {
             LiveStreamMessages$SCShopEntranceControl[] sCShopEntran = new LiveStreamMessages$SCShopEntranceControl[0];
             LiveStreamMessages$SCShopEntranceControl._emptyArray = sCShopEntran;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCShopEntranceControl._emptyArray;
    }
    public static LiveStreamMessages$SCShopEntranceControl parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCShopEntranceControl().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCShopEntranceControl parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCShopEntranceControl(), p0);
    }
    public LiveStreamMessages$SCShopEntranceControl clear(){
       this.displayMaxDelayMillis = 0;
       this.showYellowCart = false;
       this.onSaleCount = 0;
       this.jumpUrl = "";
       this.specialUser = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCShopEntranceControl tdisplayMaxD = this.displayMaxDelayMillis;
       if (tdisplayMaxD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tdisplayMaxD);
       }
       tdisplayMaxD = this.showYellowCart;
       if (tdisplayMaxD != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tdisplayMaxD);
       }
       tdisplayMaxD = this.onSaleCount;
       if (tdisplayMaxD != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tdisplayMaxD);
       }
       if (!(this.jumpUrl).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.jumpUrl);
       }
       tdisplayMaxD = this.specialUser;
       if (tdisplayMaxD != null) {
          i = i + InternalNano.computeMapFieldSize(tdisplayMaxD, 5, 9, 11);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCShopEntranceControl mergeFrom(CodedInputByteBufferNano p0){
       MapFactories$MapFactory mapFactory = MapFactories.getMapFactory();
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.specialUser = InternalNano.mergeMapEntry(p0, this.specialUser, mapFactory, 9, 11, new LiveStreamMessages$SpecialUserInfo(), 10, 18);
                      }
                   }else {
                      this.jumpUrl = p0.readString();
                   }
                }else {
                   this.onSaleCount = p0.readUInt32();
                }
             }else {
                this.showYellowCart = p0.readBool();
             }
          }else {
             this.displayMaxDelayMillis = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$SCShopEntranceControl tdisplayMaxD = this.displayMaxDelayMillis;
       if (tdisplayMaxD) {
          p0.writeUInt64(1, tdisplayMaxD);
       }
       tdisplayMaxD = this.showYellowCart;
       if (tdisplayMaxD != null) {
          p0.writeBool(2, tdisplayMaxD);
       }
       tdisplayMaxD = this.onSaleCount;
       if (tdisplayMaxD != null) {
          p0.writeUInt32(3, tdisplayMaxD);
       }
       if (!(this.jumpUrl).equals("")) {
          p0.writeString(4, this.jumpUrl);
       }
       tdisplayMaxD = this.specialUser;
       if (tdisplayMaxD != null) {
          InternalNano.serializeMapField(p0, tdisplayMaxD, 5, 9, 11);
       }
       super.writeTo(p0);
       return;
    }
}
