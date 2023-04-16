package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveActivityPendantClose;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import java.lang.System;

public final class LiveStreamMessages$SCLiveActivityPendantClose extends MessageNano	// class@001339
{
    public boolean isCloseAll;
    public boolean largePendant;
    public String pendantId;
    public int[] type;
    public static LiveStreamMessages$SCLiveActivityPendantClose[] _emptyArray;

    public void LiveStreamMessages$SCLiveActivityPendantClose(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCLiveActivityPendantClose[] emptyArray(){
       if (LiveStreamMessages$SCLiveActivityPendantClose._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCLiveActivityPendantClose._emptyArray == null) {
             LiveStreamMessages$SCLiveActivityPendantClose[] sCLiveActivi = new LiveStreamMessages$SCLiveActivityPendantClose[0];
             LiveStreamMessages$SCLiveActivityPendantClose._emptyArray = sCLiveActivi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCLiveActivityPendantClose._emptyArray;
    }
    public static LiveStreamMessages$SCLiveActivityPendantClose parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCLiveActivityPendantClose().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCLiveActivityPendantClose parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCLiveActivityPendantClose(), p0);
    }
    public LiveStreamMessages$SCLiveActivityPendantClose clear(){
       this.type = WireFormatNano.EMPTY_INT_ARRAY;
       this.isCloseAll = false;
       this.pendantId = "";
       this.largePendant = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCLiveActivityPendantClose ttype = this.type;
       if (ttype != null && ttype.length > 0) {
          int i1 = 0;
          int i2 = 0;
          LiveStreamMessages$SCLiveActivityPendantClose ttype1 = this.type;
          while (i1 < ttype1.length) {
             i2 = i2 + CodedOutputByteBufferNano.computeUInt32SizeNoTag(ttype1[i1]);
             i1 = i1 + 1;
          }
          i = (i + i2) + (ttype1.length * 1);
       }
       ttype = this.isCloseAll;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, ttype);
       }
       if (!(this.pendantId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.pendantId);
       }
       ttype = this.largePendant;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, ttype);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCLiveActivityPendantClose mergeFrom(CodedInputByteBufferNano p0){
       int i2;
       LiveStreamMessages$SCLiveActivityPendantClose ttype;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 8;
          if (i != i1) {
             if (i != 10) {
                if (i != 16) {
                   if (i != 26) {
                      if (i != 32) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.largePendant = p0.readBool();
                      }
                   }else {
                      this.pendantId = p0.readString();
                   }
                }else {
                   this.isCloseAll = p0.readBool();
                }
             }else {
                i = p0.pushLimit(p0.readRawVarint32());
                i1 = p0.getPosition();
                i2 = 0;
                while (p0.getBytesUntilLimit() > 0) {
                   p0.readUInt32();
                   i2 = i2 + 1;
                }
                p0.rewindToPosition(i1);
                ttype = this.type;
                int i3 = (ttype == null)? 0: ttype.length;
                i2 = i2 + i3;
                int[] ointArray = new int[i2];
                if (i3) {
                   System.arraycopy(ttype, 0, ointArray, 0, i3);
                }
                while (i3 < i2) {
                   ointArray[i3] = p0.readUInt32();
                   i3 = i3 + 1;
                }
                this.type = ointArray;
                p0.popLimit(i);
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             ttype = this.type;
             i2 = (ttype == null)? 0: ttype.length;
             i = i + i2;
             int[] ointArray1 = new int[i];
             if (i2) {
                System.arraycopy(ttype, 0, ointArray1, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                ointArray1[i2] = p0.readUInt32();
                p0.readTag();
                i2 = i2 + 1;
             }
             ointArray1[i2] = p0.readUInt32();
             this.type = ointArray1;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$SCLiveActivityPendantClose ttype = this.type;
       if (ttype != null && ttype.length > 0) {
          int i = 0;
          LiveStreamMessages$SCLiveActivityPendantClose ttype1 = this.type;
          while (i < ttype1.length) {
             p0.writeUInt32(1, ttype1[i]);
             i = i + 1;
          }
       }
       ttype = this.isCloseAll;
       if (ttype != null) {
          p0.writeBool(2, ttype);
       }
       if (!(this.pendantId).equals("")) {
          p0.writeString(3, this.pendantId);
       }
       ttype = this.largePendant;
       if (ttype != null) {
          p0.writeBool(4, ttype);
       }
       super.writeTo(p0);
       return;
    }
}
