package com.kuaishou.livestream.message.nano.SCLiveLocalLifeExplainCardPromotionStageInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveLocalLifeExplainCardPromotionStageInfo extends MessageNano	// class@00142b
{
    public long promotionStageTime;
    public int promotionStatus;
    public String rightText;
    public String text;
    public int topLeftTextType;
    public static SCLiveLocalLifeExplainCardPromotionStageInfo[] _emptyArray;

    public void SCLiveLocalLifeExplainCardPromotionStageInfo(){
       super();
       this.clear();
    }
    public static SCLiveLocalLifeExplainCardPromotionStageInfo[] emptyArray(){
       if (SCLiveLocalLifeExplainCardPromotionStageInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveLocalLifeExplainCardPromotionStageInfo._emptyArray == null) {
             SCLiveLocalLifeExplainCardPromotionStageInfo[] sCLiveLocalL = new SCLiveLocalLifeExplainCardPromotionStageInfo[0];
             SCLiveLocalLifeExplainCardPromotionStageInfo._emptyArray = sCLiveLocalL;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveLocalLifeExplainCardPromotionStageInfo._emptyArray;
    }
    public static SCLiveLocalLifeExplainCardPromotionStageInfo parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveLocalLifeExplainCardPromotionStageInfo().mergeFrom(p0);
    }
    public static SCLiveLocalLifeExplainCardPromotionStageInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveLocalLifeExplainCardPromotionStageInfo(), p0);
    }
    public SCLiveLocalLifeExplainCardPromotionStageInfo clear(){
       this.topLeftTextType = 0;
       this.promotionStageTime = 0;
       this.text = "";
       this.rightText = "";
       this.promotionStatus = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCLiveLocalLifeExplainCardPromotionStageInfo ttopLeftText = this.topLeftTextType;
       if (ttopLeftText != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ttopLeftText);
       }
       ttopLeftText = this.promotionStageTime;
       if (ttopLeftText - null) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, ttopLeftText);
       }
       String str = "";
       if (!(this.text).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.text);
       }
       if (!(this.rightText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.rightText);
       }
       ttopLeftText = this.promotionStatus;
       if (ttopLeftText != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, ttopLeftText);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveLocalLifeExplainCardPromotionStageInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         i = p0.readInt32();
                         if (i && (i != 1 && (i != 2 && i != 3))) {
                            continue ;
                         }else {
                            this.promotionStatus = i;
                         }
                      }
                   }else {
                      this.rightText = p0.readString();
                   }
                }else {
                   this.text = p0.readString();
                }
             }else {
                this.promotionStageTime = p0.readUInt64();
             }
          }else {
             i = p0.readInt32();
             if (i && i != 1) {
                continue ;
             }else {
                this.topLeftTextType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCLiveLocalLifeExplainCardPromotionStageInfo ttopLeftText = this.topLeftTextType;
       if (ttopLeftText != null) {
          p0.writeInt32(1, ttopLeftText);
       }
       ttopLeftText = this.promotionStageTime;
       if (ttopLeftText - null) {
          p0.writeUInt64(2, ttopLeftText);
       }
       String str = "";
       if (!(this.text).equals(str)) {
          p0.writeString(3, this.text);
       }
       if (!(this.rightText).equals(str)) {
          p0.writeString(4, this.rightText);
       }
       ttopLeftText = this.promotionStatus;
       if (ttopLeftText != null) {
          p0.writeInt32(5, ttopLeftText);
       }
       super.writeTo(p0);
       return;
    }
}
