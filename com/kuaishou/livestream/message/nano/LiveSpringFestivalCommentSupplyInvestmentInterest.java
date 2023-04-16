package com.kuaishou.livestream.message.nano.LiveSpringFestivalCommentSupplyInvestmentInterest;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveSpringFestivalCommentSupplyInvestmentInterest extends MessageNano	// class@0012b1
{
    public long authorId;
    public int consumptionType;
    public long endServerTimestamp;
    public long liveStreamId;
    public String productName;
    public long startServerTimestamp;
    public long userId;
    public static LiveSpringFestivalCommentSupplyInvestmentInterest[] _emptyArray;

    public void LiveSpringFestivalCommentSupplyInvestmentInterest(){
       super();
       this.clear();
    }
    public static LiveSpringFestivalCommentSupplyInvestmentInterest[] emptyArray(){
       if (LiveSpringFestivalCommentSupplyInvestmentInterest._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveSpringFestivalCommentSupplyInvestmentInterest._emptyArray == null) {
             LiveSpringFestivalCommentSupplyInvestmentInterest[] liveSpringFe = new LiveSpringFestivalCommentSupplyInvestmentInterest[0];
             LiveSpringFestivalCommentSupplyInvestmentInterest._emptyArray = liveSpringFe;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveSpringFestivalCommentSupplyInvestmentInterest._emptyArray;
    }
    public static LiveSpringFestivalCommentSupplyInvestmentInterest parseFrom(CodedInputByteBufferNano p0){
       return new LiveSpringFestivalCommentSupplyInvestmentInterest().mergeFrom(p0);
    }
    public static LiveSpringFestivalCommentSupplyInvestmentInterest parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveSpringFestivalCommentSupplyInvestmentInterest(), p0);
    }
    public LiveSpringFestivalCommentSupplyInvestmentInterest clear(){
       this.userId = 0;
       this.authorId = 0;
       this.startServerTimestamp = 0;
       this.endServerTimestamp = 0;
       this.productName = "";
       this.liveStreamId = 0;
       this.consumptionType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveSpringFestivalCommentSupplyInvestmentInterest tuserId = this.userId;
       int i1 = 0;
       if (tuserId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tuserId);
       }
       tuserId = this.authorId;
       if (tuserId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tuserId);
       }
       tuserId = this.startServerTimestamp;
       if (tuserId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tuserId);
       }
       tuserId = this.endServerTimestamp;
       if (tuserId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tuserId);
       }
       if (!(this.productName).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.productName);
       }
       tuserId = this.liveStreamId;
       if (tuserId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tuserId);
       }
       tuserId = this.consumptionType;
       if (tuserId != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(7, tuserId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveSpringFestivalCommentSupplyInvestmentInterest mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 42) {
                         if (i != 48) {
                            if (i != 56) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               i = p0.readInt32();
                               if (i && (i != 1 && i != 2)) {
                                  continue ;
                               }else {
                                  this.consumptionType = i;
                               }
                            }
                         }else {
                            this.liveStreamId = p0.readUInt64();
                         }
                      }else {
                         this.productName = p0.readString();
                      }
                   }else {
                      this.endServerTimestamp = p0.readUInt64();
                   }
                }else {
                   this.startServerTimestamp = p0.readUInt64();
                }
             }else {
                this.authorId = p0.readUInt64();
             }
          }else {
             this.userId = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveSpringFestivalCommentSupplyInvestmentInterest tuserId = this.userId;
       int i = 0;
       if (tuserId - i) {
          p0.writeUInt64(1, tuserId);
       }
       tuserId = this.authorId;
       if (tuserId - i) {
          p0.writeUInt64(2, tuserId);
       }
       tuserId = this.startServerTimestamp;
       if (tuserId - i) {
          p0.writeUInt64(3, tuserId);
       }
       tuserId = this.endServerTimestamp;
       if (tuserId - i) {
          p0.writeUInt64(4, tuserId);
       }
       if (!(this.productName).equals("")) {
          p0.writeString(5, this.productName);
       }
       tuserId = this.liveStreamId;
       if (tuserId - i) {
          p0.writeUInt64(6, tuserId);
       }
       tuserId = this.consumptionType;
       if (tuserId != null) {
          p0.writeInt32(7, tuserId);
       }
       super.writeTo(p0);
       return;
    }
}
