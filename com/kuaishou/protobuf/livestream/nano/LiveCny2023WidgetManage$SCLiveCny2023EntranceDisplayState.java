package com.kuaishou.protobuf.livestream.nano.LiveCny2023WidgetManage$SCLiveCny2023EntranceDisplayState;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveCny2023WidgetManage$SCLiveCny2023EntranceDisplayState extends MessageNano	// class@000c43
{
    public int enableBranch1Entrance;
    public int enableBranch2Entrance;
    public int enableGiftEntrance;
    public int enableLotteryEntrance;
    public int enableMerchantEntrance;
    public int enableProgramEntrance;
    public int enableTaskEntrance;
    public int enableTimeLimitTaskEntrance;
    public int enableWalletEntrance;
    public static LiveCny2023WidgetManage$SCLiveCny2023EntranceDisplayState[] _emptyArray;

    public void LiveCny2023WidgetManage$SCLiveCny2023EntranceDisplayState(){
       super();
       this.clear();
    }
    public static LiveCny2023WidgetManage$SCLiveCny2023EntranceDisplayState[] emptyArray(){
       if (LiveCny2023WidgetManage$SCLiveCny2023EntranceDisplayState._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCny2023WidgetManage$SCLiveCny2023EntranceDisplayState._emptyArray == null) {
             LiveCny2023WidgetManage$SCLiveCny2023EntranceDisplayState[] sCLiveCny202 = new LiveCny2023WidgetManage$SCLiveCny2023EntranceDisplayState[0];
             LiveCny2023WidgetManage$SCLiveCny2023EntranceDisplayState._emptyArray = sCLiveCny202;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCny2023WidgetManage$SCLiveCny2023EntranceDisplayState._emptyArray;
    }
    public static LiveCny2023WidgetManage$SCLiveCny2023EntranceDisplayState parseFrom(CodedInputByteBufferNano p0){
       return new LiveCny2023WidgetManage$SCLiveCny2023EntranceDisplayState().mergeFrom(p0);
    }
    public static LiveCny2023WidgetManage$SCLiveCny2023EntranceDisplayState parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCny2023WidgetManage$SCLiveCny2023EntranceDisplayState(), p0);
    }
    public LiveCny2023WidgetManage$SCLiveCny2023EntranceDisplayState clear(){
       this.enableProgramEntrance = 0;
       this.enableWalletEntrance = 0;
       this.enableTaskEntrance = 0;
       this.enableLotteryEntrance = 0;
       this.enableMerchantEntrance = 0;
       this.enableBranch1Entrance = 0;
       this.enableBranch2Entrance = 0;
       this.enableTimeLimitTaskEntrance = 0;
       this.enableGiftEntrance = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveCny2023WidgetManage$SCLiveCny2023EntranceDisplayState tenableProgr = this.enableProgramEntrance;
       if (tenableProgr != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tenableProgr);
       }
       tenableProgr = this.enableWalletEntrance;
       if (tenableProgr != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tenableProgr);
       }
       tenableProgr = this.enableTaskEntrance;
       if (tenableProgr != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tenableProgr);
       }
       tenableProgr = this.enableLotteryEntrance;
       if (tenableProgr != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tenableProgr);
       }
       tenableProgr = this.enableMerchantEntrance;
       if (tenableProgr != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tenableProgr);
       }
       tenableProgr = this.enableBranch1Entrance;
       if (tenableProgr != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, tenableProgr);
       }
       tenableProgr = this.enableBranch2Entrance;
       if (tenableProgr != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(7, tenableProgr);
       }
       tenableProgr = this.enableTimeLimitTaskEntrance;
       if (tenableProgr != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(8, tenableProgr);
       }
       tenableProgr = this.enableGiftEntrance;
       if (tenableProgr != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(9, tenableProgr);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCny2023WidgetManage$SCLiveCny2023EntranceDisplayState mergeFrom(CodedInputByteBufferNano p0){
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
                         if (i != 48) {
                            if (i != 56) {
                               if (i != 64) {
                                  if (i != 72) {
                                     if (!WireFormatNano.parseUnknownField(p0, i)) {
                                        break ;
                                     }
                                  }else {
                                     this.enableGiftEntrance = p0.readInt32();
                                  }
                               }else {
                                  this.enableTimeLimitTaskEntrance = p0.readInt32();
                               }
                            }else {
                               this.enableBranch2Entrance = p0.readInt32();
                            }
                         }else {
                            this.enableBranch1Entrance = p0.readInt32();
                         }
                      }else {
                         this.enableMerchantEntrance = p0.readInt32();
                      }
                   }else {
                      this.enableLotteryEntrance = p0.readInt32();
                   }
                }else {
                   this.enableTaskEntrance = p0.readInt32();
                }
             }else {
                this.enableWalletEntrance = p0.readInt32();
             }
          }else {
             this.enableProgramEntrance = p0.readInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveCny2023WidgetManage$SCLiveCny2023EntranceDisplayState tenableProgr = this.enableProgramEntrance;
       if (tenableProgr != null) {
          p0.writeInt32(1, tenableProgr);
       }
       tenableProgr = this.enableWalletEntrance;
       if (tenableProgr != null) {
          p0.writeInt32(2, tenableProgr);
       }
       tenableProgr = this.enableTaskEntrance;
       if (tenableProgr != null) {
          p0.writeInt32(3, tenableProgr);
       }
       tenableProgr = this.enableLotteryEntrance;
       if (tenableProgr != null) {
          p0.writeInt32(4, tenableProgr);
       }
       tenableProgr = this.enableMerchantEntrance;
       if (tenableProgr != null) {
          p0.writeInt32(5, tenableProgr);
       }
       tenableProgr = this.enableBranch1Entrance;
       if (tenableProgr != null) {
          p0.writeInt32(6, tenableProgr);
       }
       tenableProgr = this.enableBranch2Entrance;
       if (tenableProgr != null) {
          p0.writeInt32(7, tenableProgr);
       }
       tenableProgr = this.enableTimeLimitTaskEntrance;
       if (tenableProgr != null) {
          p0.writeInt32(8, tenableProgr);
       }
       tenableProgr = this.enableGiftEntrance;
       if (tenableProgr != null) {
          p0.writeInt32(9, tenableProgr);
       }
       super.writeTo(p0);
       return;
    }
}
