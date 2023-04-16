package com.kuaishou.protobuf.livestream.nano.LiveStreamRace;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.Round;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;
import com.kuaishou.protobuf.livestream.nano.Network;

public final class LiveStreamRace extends MessageNano	// class@000d19
{
    public long cost;
    public Network network;
    public long reraceCount;
    public Round[] round;
    public long startTime;
    public boolean success;
    public String tag;
    public static LiveStreamRace[] _emptyArray;

    public void LiveStreamRace(){
       super();
       this.clear();
    }
    public static LiveStreamRace[] emptyArray(){
       if (LiveStreamRace._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamRace._emptyArray == null) {
             LiveStreamRace[] liveStreamRa = new LiveStreamRace[0];
             LiveStreamRace._emptyArray = liveStreamRa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamRace._emptyArray;
    }
    public static LiveStreamRace parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamRace().mergeFrom(p0);
    }
    public static LiveStreamRace parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamRace(), p0);
    }
    public LiveStreamRace clear(){
       this.tag = "";
       this.network = null;
       this.round = Round.emptyArray();
       this.success = false;
       this.startTime = 0;
       this.cost = 0;
       this.reraceCount = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.tag).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.tag);
       }
       LiveStreamRace tnetwork = this.network;
       if (tnetwork != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tnetwork);
       }
       tnetwork = this.round;
       if (tnetwork != null && tnetwork.length > 0) {
          int i1 = 0;
          LiveStreamRace tround = this.round;
          while (i1 < tround.length) {
             object oobject = tround[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(6, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tnetwork = this.success;
       if (tnetwork != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(7, tnetwork);
       }
       tnetwork = this.startTime;
       int i2 = 0;
       if (tnetwork - i2) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, tnetwork);
       }
       tnetwork = this.cost;
       if (tnetwork - i2) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(9, tnetwork);
       }
       tnetwork = this.reraceCount;
       if (tnetwork - i2) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(10, tnetwork);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamRace mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                int i1 = 50;
                if (i != i1) {
                   if (i != 56) {
                      if (i != 64) {
                         if (i != 72) {
                            if (i != 80) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.reraceCount = p0.readUInt64();
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
                   LiveStreamRace tround = this.round;
                   int i2 = (tround == null)? 0: tround.length;
                   i = i + i2;
                   Round[] roundArray = new Round[i];
                   if (i2) {
                      System.arraycopy(tround, 0, roundArray, 0, i2);
                   }
                   i1 = i - 1;
                   while (i2 < i1) {
                      roundArray[i2] = new Round();
                      p0.readMessage(roundArray[i2]);
                      p0.readTag();
                      i2 = i2 + 1;
                   }
                   roundArray[i2] = new Round();
                   p0.readMessage(roundArray[i2]);
                   this.round = roundArray;
                }
             }else if(this.network == null){
                this.network = new Network();
             }
             p0.readMessage(this.network);
          }else {
             this.tag = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.tag).equals("")) {
          p0.writeString(1, this.tag);
       }
       LiveStreamRace tnetwork = this.network;
       if (tnetwork != null) {
          p0.writeMessage(2, tnetwork);
       }
       tnetwork = this.round;
       if (tnetwork != null && tnetwork.length > 0) {
          int i = 0;
          LiveStreamRace tround = this.round;
          while (i < tround.length) {
             object oobject = tround[i];
             if (oobject != null) {
                p0.writeMessage(6, oobject);
             }
             i = i + 1;
          }
       }
       tnetwork = this.success;
       if (tnetwork != null) {
          p0.writeBool(7, tnetwork);
       }
       tnetwork = this.startTime;
       int i1 = 0;
       if (tnetwork - i1) {
          p0.writeUInt64(8, tnetwork);
       }
       tnetwork = this.cost;
       if (tnetwork - i1) {
          p0.writeUInt64(9, tnetwork);
       }
       tnetwork = this.reraceCount;
       if (tnetwork - i1) {
          p0.writeUInt64(10, tnetwork);
       }
       super.writeTo(p0);
       return;
    }
}
