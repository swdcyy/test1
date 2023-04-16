package com.kuaishou.protobuf.livestream.nano.Round;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.Horse;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import java.lang.System;

public final class Round extends MessageNano	// class@000d2f
{
    public long[] barrier;
    public long cost;
    public Horse[] horse;
    public int policy;
    public long startTime;
    public boolean success;
    public String tag;
    public long timeout;
    public static Round[] _emptyArray;

    public void Round(){
       super();
       this.clear();
    }
    public static Round[] emptyArray(){
       if (Round._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (Round._emptyArray == null) {
             Round[] roundArray = new Round[0];
             Round._emptyArray = roundArray;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return Round._emptyArray;
    }
    public static Round parseFrom(CodedInputByteBufferNano p0){
       return new Round().mergeFrom(p0);
    }
    public static Round parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new Round(), p0);
    }
    public Round clear(){
       this.policy = 0;
       this.timeout = 0;
       this.barrier = WireFormatNano.EMPTY_LONG_ARRAY;
       this.tag = "";
       this.horse = Horse.emptyArray();
       this.success = false;
       this.startTime = 0;
       this.cost = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       Round tpolicy = this.policy;
       int i1 = 1;
       if (tpolicy != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(i1, tpolicy);
       }
       Round ttimeout = this.timeout;
       if (ttimeout) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, ttimeout);
       }
       tpolicy = this.barrier;
       int i2 = 0;
       if (tpolicy != null && tpolicy.length > 0) {
          int i3 = 0;
          int i4 = 0;
          Round tbarrier = this.barrier;
          while (i3 < tbarrier.length) {
             i4 = i4 + CodedOutputByteBufferNano.computeUInt64SizeNoTag(tbarrier[i3]);
             i3 = i3 + 1;
          }
          i = (i + i4) + (tbarrier.length * 1);
       }
       if (!(this.tag).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.tag);
       }
       tpolicy = this.horse;
       if (tpolicy != null && tpolicy.length > 0) {
          tpolicy = this.horse;
          while (i2 < tpolicy.length) {
             object oobject = tpolicy[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(6, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tpolicy = this.success;
       if (tpolicy != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(7, tpolicy);
       }
       tpolicy = this.startTime;
       if (tpolicy) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, tpolicy);
       }
       tpolicy = this.cost;
       if (tpolicy) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(9, tpolicy);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public Round mergeFrom(CodedInputByteBufferNano p0){
       Round thorse;
       int i2;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                int i1 = 24;
                if (i != i1) {
                   if (i != 26) {
                      if (i != 34) {
                         i1 = 50;
                         if (i != i1) {
                            if (i != 56) {
                               if (i != 64) {
                                  if (i != 72) {
                                     if (!WireFormatNano.parseUnknownField(p0, i)) {
                                        break ;
                                     }
                                  }else {
                                     this.cost = p0.readUInt64();
                                  }
                               }else {
                                  this.startTime = p0.readUInt64();
                               }
                            }else {
                               this.success = p0.readBool();
                            }
                         }else {
                            i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                            thorse = this.horse;
                            i2 = (thorse == null)? 0: thorse.length;
                            i = i + i2;
                            Horse[] horseArray = new Horse[i];
                            if (i2) {
                               System.arraycopy(thorse, 0, horseArray, 0, i2);
                            }
                            i1 = i - 1;
                            while (i2 < i1) {
                               horseArray[i2] = new Horse();
                               p0.readMessage(horseArray[i2]);
                               p0.readTag();
                               i2 = i2 + 1;
                            }
                            horseArray[i2] = new Horse();
                            p0.readMessage(horseArray[i2]);
                            this.horse = horseArray;
                         }
                      }else {
                         this.tag = p0.readString();
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
                      thorse = this.barrier;
                      int i3 = (thorse == null)? 0: thorse.length;
                      i2 = i2 + i3;
                      long[] olongArray = new long[i2];
                      if (i3) {
                         System.arraycopy(thorse, 0, olongArray, 0, i3);
                      }
                      while (i3 < i2) {
                         olongArray[i3] = p0.readUInt64();
                         i3 = i3 + 1;
                      }
                      this.barrier = olongArray;
                      p0.popLimit(i);
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   thorse = this.barrier;
                   i2 = (thorse == null)? 0: thorse.length;
                   i = i + i2;
                   long[] olongArray1 = new long[i];
                   if (i2) {
                      System.arraycopy(thorse, 0, olongArray1, 0, i2);
                   }
                   i1 = i - 1;
                   while (i2 < i1) {
                      olongArray1[i2] = p0.readUInt64();
                      p0.readTag();
                      i2 = i2 + 1;
                   }
                   olongArray1[i2] = p0.readUInt64();
                   this.barrier = olongArray1;
                }
             }else {
                this.timeout = p0.readUInt64();
             }
          }else {
             this.policy = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       Round tpolicy = this.policy;
       if (tpolicy != null) {
          p0.writeUInt32(1, tpolicy);
       }
       tpolicy = this.timeout;
       int i = 0;
       if (tpolicy - i) {
          p0.writeUInt64(2, tpolicy);
       }
       tpolicy = this.barrier;
       int i1 = 0;
       if (tpolicy != null && tpolicy.length > 0) {
          int i2 = 0;
          Round tbarrier = this.barrier;
          while (i2 < tbarrier.length) {
             p0.writeUInt64(3, tbarrier[i2]);
             i2 = i2 + 1;
          }
       }
       if (!(this.tag).equals("")) {
          p0.writeString(4, this.tag);
       }
       tpolicy = this.horse;
       if (tpolicy != null && tpolicy.length > 0) {
          tpolicy = this.horse;
          while (i1 < tpolicy.length) {
             object oobject = tpolicy[i1];
             if (oobject != null) {
                p0.writeMessage(6, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tpolicy = this.success;
       if (tpolicy != null) {
          p0.writeBool(7, tpolicy);
       }
       tpolicy = this.startTime;
       if (tpolicy - i) {
          p0.writeUInt64(8, tpolicy);
       }
       tpolicy = this.cost;
       if (tpolicy - i) {
          p0.writeUInt64(9, tpolicy);
       }
       super.writeTo(p0);
       return;
    }
}
