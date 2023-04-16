package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCShopClosed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.String;
import java.lang.Object;
import java.lang.System;

public final class LiveStreamMessages$SCShopClosed extends MessageNano	// class@001369
{
    public String[] blackUserId;
    public long time;
    public static LiveStreamMessages$SCShopClosed[] _emptyArray;

    public void LiveStreamMessages$SCShopClosed(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCShopClosed[] emptyArray(){
       if (LiveStreamMessages$SCShopClosed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCShopClosed._emptyArray == null) {
             LiveStreamMessages$SCShopClosed[] sCShopClosed = new LiveStreamMessages$SCShopClosed[0];
             LiveStreamMessages$SCShopClosed._emptyArray = sCShopClosed;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCShopClosed._emptyArray;
    }
    public static LiveStreamMessages$SCShopClosed parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCShopClosed().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCShopClosed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCShopClosed(), p0);
    }
    public LiveStreamMessages$SCShopClosed clear(){
       this.time = 0;
       this.blackUserId = WireFormatNano.EMPTY_STRING_ARRAY;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCShopClosed ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttime);
       }
       ttime = this.blackUserId;
       if (ttime != null && ttime.length > 0) {
          int i1 = 0;
          int i2 = 0;
          int i3 = 0;
          LiveStreamMessages$SCShopClosed tblackUserId = this.blackUserId;
          while (i1 < tblackUserId.length) {
             object oobject = tblackUserId[i1];
             if (oobject != null) {
                i3 = i3 + 1;
                i2 = i2 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i1 = i1 + 1;
          }
          i = (i + i2) + (i3 * 1);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCShopClosed mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             int i1 = 18;
             if (i != i1) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                LiveStreamMessages$SCShopClosed tblackUserId = this.blackUserId;
                int i2 = (tblackUserId == null)? 0: tblackUserId.length;
                i = i + i2;
                String[] stringArray = new String[i];
                if (i2) {
                   System.arraycopy(tblackUserId, 0, stringArray, 0, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.blackUserId = stringArray;
             }
          }else {
             this.time = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$SCShopClosed ttime = this.time;
       if (ttime) {
          p0.writeUInt64(1, ttime);
       }
       ttime = this.blackUserId;
       if (ttime != null && ttime.length > 0) {
          int i = 0;
          LiveStreamMessages$SCShopClosed tblackUserId = this.blackUserId;
          while (i < tblackUserId.length) {
             object oobject = tblackUserId[i];
             if (oobject != null) {
                p0.writeString(2, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
