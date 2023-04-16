package com.kuaishou.livestream.message.nano.SCLiveGiftPanelRefresh;
import com.google.protobuf.nano.KwaiExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;

public final class SCLiveGiftPanelRefresh extends KwaiExtendableMessageNano	// class@001422
{
    public boolean disablePreloadMagicFaceResource;
    public boolean enableRefreshPanelUi;
    public long giftPanelMaxDelayMills;
    public int refreshMode;
    public int refreshTab;
    public static SCLiveGiftPanelRefresh[] _emptyArray;

    public void SCLiveGiftPanelRefresh(){
       super();
       this.clear();
    }
    public static SCLiveGiftPanelRefresh[] emptyArray(){
       if (SCLiveGiftPanelRefresh._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveGiftPanelRefresh._emptyArray == null) {
             SCLiveGiftPanelRefresh[] sCLiveGiftPa = new SCLiveGiftPanelRefresh[0];
             SCLiveGiftPanelRefresh._emptyArray = sCLiveGiftPa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveGiftPanelRefresh._emptyArray;
    }
    public static SCLiveGiftPanelRefresh parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveGiftPanelRefresh().mergeFrom(p0);
    }
    public static SCLiveGiftPanelRefresh parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveGiftPanelRefresh(), p0);
    }
    public SCLiveGiftPanelRefresh clear(){
       this.unknownFieldData = null;
       this.giftPanelMaxDelayMills = 0;
       this.disablePreloadMagicFaceResource = false;
       this.refreshTab = 0;
       this.enableRefreshPanelUi = false;
       this.refreshMode = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCLiveGiftPanelRefresh tgiftPanelMa = this.giftPanelMaxDelayMills;
       if (tgiftPanelMa) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tgiftPanelMa);
       }
       tgiftPanelMa = this.disablePreloadMagicFaceResource;
       if (tgiftPanelMa != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tgiftPanelMa);
       }
       tgiftPanelMa = this.refreshTab;
       if (tgiftPanelMa != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tgiftPanelMa);
       }
       tgiftPanelMa = this.enableRefreshPanelUi;
       if (tgiftPanelMa != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, tgiftPanelMa);
       }
       tgiftPanelMa = this.refreshMode;
       if (tgiftPanelMa != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, tgiftPanelMa);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveGiftPanelRefresh mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 40) {
                         if (!this.storeUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.refreshMode = p0.readUInt32();
                      }
                   }else {
                      this.enableRefreshPanelUi = p0.readBool();
                   }
                }else {
                   this.refreshTab = p0.readUInt32();
                }
             }else {
                this.disablePreloadMagicFaceResource = p0.readBool();
             }
          }else {
             this.giftPanelMaxDelayMills = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCLiveGiftPanelRefresh tgiftPanelMa = this.giftPanelMaxDelayMills;
       if (tgiftPanelMa) {
          p0.writeUInt64(1, tgiftPanelMa);
       }
       tgiftPanelMa = this.disablePreloadMagicFaceResource;
       if (tgiftPanelMa != null) {
          p0.writeBool(2, tgiftPanelMa);
       }
       tgiftPanelMa = this.refreshTab;
       if (tgiftPanelMa != null) {
          p0.writeUInt32(3, tgiftPanelMa);
       }
       tgiftPanelMa = this.enableRefreshPanelUi;
       if (tgiftPanelMa != null) {
          p0.writeBool(4, tgiftPanelMa);
       }
       tgiftPanelMa = this.refreshMode;
       if (tgiftPanelMa != null) {
          p0.writeUInt32(5, tgiftPanelMa);
       }
       super.writeTo(p0);
       return;
    }
}
