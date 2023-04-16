package com.kuaishou.livestream.message.nano.LiveStreamMessages$MicSeatDetailInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$MicSeatDecorationInfo;
import java.lang.Object;
import java.lang.System;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$MicSeatUserInfo;

public final class LiveStreamMessages$MicSeatDetailInfo extends MessageNano	// class@0012f8
{
    public LiveStreamMessages$MicSeatDecorationInfo decorationInfo;
    public int micSeatId;
    public int[] micSeatType;
    public long rankScore;
    public int state;
    public LiveStreamMessages$MicSeatUserInfo userInfo;
    public static LiveStreamMessages$MicSeatDetailInfo[] _emptyArray;

    public void LiveStreamMessages$MicSeatDetailInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$MicSeatDetailInfo[] emptyArray(){
       if (LiveStreamMessages$MicSeatDetailInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$MicSeatDetailInfo._emptyArray == null) {
             LiveStreamMessages$MicSeatDetailInfo[] micSeatDetai = new LiveStreamMessages$MicSeatDetailInfo[0];
             LiveStreamMessages$MicSeatDetailInfo._emptyArray = micSeatDetai;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$MicSeatDetailInfo._emptyArray;
    }
    public static LiveStreamMessages$MicSeatDetailInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$MicSeatDetailInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$MicSeatDetailInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$MicSeatDetailInfo(), p0);
    }
    public LiveStreamMessages$MicSeatDetailInfo clear(){
       this.micSeatId = 0;
       this.state = 0;
       this.userInfo = null;
       this.micSeatType = WireFormatNano.EMPTY_INT_ARRAY;
       this.rankScore = 0;
       this.decorationInfo = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$MicSeatDetailInfo tmicSeatId = this.micSeatId;
       int i1 = 1;
       if (tmicSeatId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(i1, tmicSeatId);
       }
       tmicSeatId = this.state;
       if (tmicSeatId != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tmicSeatId);
       }
       tmicSeatId = this.userInfo;
       if (tmicSeatId != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tmicSeatId);
       }
       tmicSeatId = this.micSeatType;
       if (tmicSeatId != null && tmicSeatId.length > 0) {
          int i2 = 0;
          int i3 = 0;
          LiveStreamMessages$MicSeatDetailInfo tmicSeatType = this.micSeatType;
          while (i2 < tmicSeatType.length) {
             i3 = i3 + CodedOutputByteBufferNano.computeInt32SizeNoTag(tmicSeatType[i2]);
             i2 = i2 + 1;
          }
          i = (i + i3) + (tmicSeatType.length * 1);
       }
       tmicSeatId = this.rankScore;
       if (tmicSeatId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tmicSeatId);
       }
       tmicSeatId = this.decorationInfo;
       if (tmicSeatId != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(6, tmicSeatId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$MicSeatDetailInfo mergeFrom(CodedInputByteBufferNano p0){
       int i4;
       int i5;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             LiveStreamMessages$MicSeatDetailInfo micSeatDetai = 2;
             int i1 = 1;
             if (i != 16) {
                if (i != 26) {
                   int i2 = 32;
                   int i3 = 0;
                   if (i != i2) {
                      if (i != 34) {
                         if (i != 40) {
                            if (i != 50) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else if(this.decorationInfo == null){
                               this.decorationInfo = new LiveStreamMessages$MicSeatDecorationInfo();
                            }
                            p0.readMessage(this.decorationInfo);
                         }else {
                            this.rankScore = p0.readUInt64();
                         }
                      }else {
                         i = p0.pushLimit(p0.readRawVarint32());
                         i2 = p0.getPosition();
                         i4 = 0;
                         while (p0.getBytesUntilLimit() > 0) {
                            i5 = p0.readInt32();
                            if (i5 && (i5 != i1 && i5 != micSeatDetai)) {
                               continue ;
                            }
                            i4 = i4 + 1;
                         }
                         if (i4) {
                            p0.rewindToPosition(i2);
                            LiveStreamMessages$MicSeatDetailInfo tmicSeatType = this.micSeatType;
                            i5 = (tmicSeatType == null)? 0: tmicSeatType.length;
                            i4 = i4 + i5;
                            int[] ointArray = new int[i4];
                            if (i5) {
                               System.arraycopy(tmicSeatType, i3, ointArray, i3, i5);
                            }
                            while (p0.getBytesUntilLimit() > 0) {
                               i2 = p0.readInt32();
                               if (i2 && (i2 != i1 && i2 != micSeatDetai)) {
                                  continue ;
                               }
                               i3 = i5 + 1;
                               ointArray[i5] = i2;
                               i5 = i3;
                            }
                            this.micSeatType = ointArray;
                         }
                         p0.popLimit(i);
                      }
                   }else {
                      i = WireFormatNano.getRepeatedFieldArrayLength(p0, i2);
                      int[] ointArray1 = new int[i];
                      i4 = 0;
                      i5 = 0;
                      while (i4 < i) {
                         if (i4) {
                            p0.readTag();
                         }
                         int i6 = p0.readInt32();
                         if (!i6 || (i6 == i1 || i6 == micSeatDetai)) {
                            int i7 = i5 + 1;
                            ointArray1[i5] = i6;
                            i5 = i7;
                         }
                         i4 = i4 + 1;
                      }
                      if (i5) {
                         micSeatDetai = this.micSeatType;
                         i1 = (micSeatDetai == null)? 0: micSeatDetai.length;
                         if (!i1 && i5 == i) {
                            this.micSeatType = ointArray1;
                         }else {
                            i = i1 + i5;
                            int[] ointArray2 = new int[i];
                            if (i1) {
                               System.arraycopy(micSeatDetai, i3, ointArray2, i3, i1);
                            }
                            System.arraycopy(ointArray1, i3, ointArray2, i1, i5);
                            this.micSeatType = ointArray2;
                         }
                      }
                   }
                }else if(this.userInfo == null){
                   this.userInfo = new LiveStreamMessages$MicSeatUserInfo();
                }
                p0.readMessage(this.userInfo);
             }else {
                i = p0.readInt32();
                if (i && (i != i1 && (i != micSeatDetai && (i != 3 && i != 4)))) {
                   continue ;
                }else {
                   this.state = i;
                }
             }
          }else {
             this.micSeatId = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$MicSeatDetailInfo tmicSeatId = this.micSeatId;
       if (tmicSeatId != null) {
          p0.writeUInt32(1, tmicSeatId);
       }
       tmicSeatId = this.state;
       if (tmicSeatId != null) {
          p0.writeInt32(2, tmicSeatId);
       }
       tmicSeatId = this.userInfo;
       if (tmicSeatId != null) {
          p0.writeMessage(3, tmicSeatId);
       }
       tmicSeatId = this.micSeatType;
       if (tmicSeatId != null && tmicSeatId.length > 0) {
          int i = 0;
          LiveStreamMessages$MicSeatDetailInfo tmicSeatType = this.micSeatType;
          while (i < tmicSeatType.length) {
             p0.writeInt32(4, tmicSeatType[i]);
             i = i + 1;
          }
       }
       tmicSeatId = this.rankScore;
       if (tmicSeatId) {
          p0.writeUInt64(5, tmicSeatId);
       }
       tmicSeatId = this.decorationInfo;
       if (tmicSeatId != null) {
          p0.writeMessage(6, tmicSeatId);
       }
       super.writeTo(p0);
       return;
    }
}
