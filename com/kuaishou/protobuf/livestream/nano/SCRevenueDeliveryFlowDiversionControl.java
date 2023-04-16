package com.kuaishou.protobuf.livestream.nano.SCRevenueDeliveryFlowDiversionControl;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import java.lang.System;

public final class SCRevenueDeliveryFlowDiversionControl extends MessageNano	// class@000d7a
{
    public long[] blockedAuthorId;
    public long originAuthorId;
    public String originLiveStreamId;
    public int status;
    public static SCRevenueDeliveryFlowDiversionControl[] _emptyArray;

    public void SCRevenueDeliveryFlowDiversionControl(){
       super();
       this.clear();
    }
    public static SCRevenueDeliveryFlowDiversionControl[] emptyArray(){
       if (SCRevenueDeliveryFlowDiversionControl._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCRevenueDeliveryFlowDiversionControl._emptyArray == null) {
             SCRevenueDeliveryFlowDiversionControl[] sCRevenueDel = new SCRevenueDeliveryFlowDiversionControl[0];
             SCRevenueDeliveryFlowDiversionControl._emptyArray = sCRevenueDel;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCRevenueDeliveryFlowDiversionControl._emptyArray;
    }
    public static SCRevenueDeliveryFlowDiversionControl parseFrom(CodedInputByteBufferNano p0){
       return new SCRevenueDeliveryFlowDiversionControl().mergeFrom(p0);
    }
    public static SCRevenueDeliveryFlowDiversionControl parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCRevenueDeliveryFlowDiversionControl(), p0);
    }
    public SCRevenueDeliveryFlowDiversionControl clear(){
       this.originAuthorId = 0;
       this.originLiveStreamId = "";
       this.blockedAuthorId = WireFormatNano.EMPTY_LONG_ARRAY;
       this.status = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCRevenueDeliveryFlowDiversionControl toriginAutho = this.originAuthorId;
       if (toriginAutho - null) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, toriginAutho);
       }
       if (!(this.originLiveStreamId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.originLiveStreamId);
       }
       toriginAutho = this.blockedAuthorId;
       if (toriginAutho != null && toriginAutho.length > 0) {
          int i1 = 0;
          int i2 = 0;
          SCRevenueDeliveryFlowDiversionControl tblockedAuth = this.blockedAuthorId;
          while (i1 < tblockedAuth.length) {
             i2 = i2 + CodedOutputByteBufferNano.computeUInt64SizeNoTag(tblockedAuth[i1]);
             i1 = i1 + 1;
          }
          i = (i + i2) + (tblockedAuth.length * 1);
       }
       toriginAutho = this.status;
       if (toriginAutho != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, toriginAutho);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCRevenueDeliveryFlowDiversionControl mergeFrom(CodedInputByteBufferNano p0){
       int i2;
       SCRevenueDeliveryFlowDiversionControl tblockedAuth;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                int i1 = 24;
                if (i != i1) {
                   if (i != 26) {
                      if (i != 32) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         i = p0.readInt32();
                         if (i && (i != 1 && i != 2)) {
                            continue ;
                         }else {
                            this.status = i;
                         }
                      }
                   }else {
                      i = p0.pushLimit(p0.readRawVarint32());
                      i1 = p0.getPosition();
                      i2 = 0;
                      while (p0.getBytesUntilLimit() > 0) {
                         p0.readUInt64();
                         i2 = i2 + 1;
                      }
                      p0.rewindToPosition(i1);
                      tblockedAuth = this.blockedAuthorId;
                      int i3 = (tblockedAuth == null)? 0: tblockedAuth.length;
                      i2 = i2 + i3;
                      long[] olongArray = new long[i2];
                      if (i3) {
                         System.arraycopy(tblockedAuth, 0, olongArray, 0, i3);
                      }
                      while (i3 < i2) {
                         olongArray[i3] = p0.readUInt64();
                         i3 = i3 + 1;
                      }
                      this.blockedAuthorId = olongArray;
                      p0.popLimit(i);
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   tblockedAuth = this.blockedAuthorId;
                   i2 = (tblockedAuth == null)? 0: tblockedAuth.length;
                   i = i + i2;
                   long[] olongArray1 = new long[i];
                   if (i2) {
                      System.arraycopy(tblockedAuth, 0, olongArray1, 0, i2);
                   }
                   i1 = i - 1;
                   while (i2 < i1) {
                      olongArray1[i2] = p0.readUInt64();
                      p0.readTag();
                      i2 = i2 + 1;
                   }
                   olongArray1[i2] = p0.readUInt64();
                   this.blockedAuthorId = olongArray1;
                }
             }else {
                this.originLiveStreamId = p0.readString();
             }
          }else {
             this.originAuthorId = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCRevenueDeliveryFlowDiversionControl toriginAutho = this.originAuthorId;
       if (toriginAutho) {
          p0.writeUInt64(1, toriginAutho);
       }
       if (!(this.originLiveStreamId).equals("")) {
          p0.writeString(2, this.originLiveStreamId);
       }
       toriginAutho = this.blockedAuthorId;
       if (toriginAutho != null && toriginAutho.length > 0) {
          int i = 0;
          SCRevenueDeliveryFlowDiversionControl tblockedAuth = this.blockedAuthorId;
          while (i < tblockedAuth.length) {
             p0.writeUInt64(3, tblockedAuth[i]);
             i = i + 1;
          }
       }
       toriginAutho = this.status;
       if (toriginAutho != null) {
          p0.writeInt32(4, toriginAutho);
       }
       super.writeTo(p0);
       return;
    }
}
