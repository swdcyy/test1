package com.kuaishou.protobuf.gamezone.nano.SCGzoneSpreadGoldEntrance;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.gamezone.nano.SCGzoneSpreadGoldEntrance$GzoneSpreadGoldEntranceState;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class SCGzoneSpreadGoldEntrance extends MessageNano	// class@000be1
{
    public long activityId;
    public String bubbleContent;
    public int bubbleDayLimit;
    public int bubbleLsLimit;
    public int bubbleShowDelayMills;
    public String linkUrl;
    public SCGzoneSpreadGoldEntrance$GzoneSpreadGoldEntranceState[] spreadGoldState;
    public long tsMills;
    public static SCGzoneSpreadGoldEntrance[] _emptyArray;

    public void SCGzoneSpreadGoldEntrance(){
       super();
       this.clear();
    }
    public static SCGzoneSpreadGoldEntrance[] emptyArray(){
       if (SCGzoneSpreadGoldEntrance._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCGzoneSpreadGoldEntrance._emptyArray == null) {
             SCGzoneSpreadGoldEntrance[] sCGzoneSprea = new SCGzoneSpreadGoldEntrance[0];
             SCGzoneSpreadGoldEntrance._emptyArray = sCGzoneSprea;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCGzoneSpreadGoldEntrance._emptyArray;
    }
    public static SCGzoneSpreadGoldEntrance parseFrom(CodedInputByteBufferNano p0){
       return new SCGzoneSpreadGoldEntrance().mergeFrom(p0);
    }
    public static SCGzoneSpreadGoldEntrance parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCGzoneSpreadGoldEntrance(), p0);
    }
    public SCGzoneSpreadGoldEntrance clear(){
       this.spreadGoldState = SCGzoneSpreadGoldEntrance$GzoneSpreadGoldEntranceState.emptyArray();
       this.activityId = 0;
       this.linkUrl = "";
       this.bubbleLsLimit = 0;
       this.bubbleDayLimit = 0;
       this.bubbleShowDelayMills = 0;
       this.bubbleContent = "";
       this.tsMills = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCGzoneSpreadGoldEntrance tspreadGoldS = this.spreadGoldState;
       if (tspreadGoldS != null && tspreadGoldS.length > 0) {
          int i1 = 0;
          SCGzoneSpreadGoldEntrance tspreadGoldS1 = this.spreadGoldState;
          while (i1 < tspreadGoldS1.length) {
             object oobject = tspreadGoldS1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tspreadGoldS = this.activityId;
       int i2 = 0;
       if (tspreadGoldS - i2) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tspreadGoldS);
       }
       String str = "";
       if (!(this.linkUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.linkUrl);
       }
       tspreadGoldS = this.bubbleLsLimit;
       if (tspreadGoldS != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tspreadGoldS);
       }
       tspreadGoldS = this.bubbleDayLimit;
       if (tspreadGoldS != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, tspreadGoldS);
       }
       tspreadGoldS = this.bubbleShowDelayMills;
       if (tspreadGoldS != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, tspreadGoldS);
       }
       if (!(this.bubbleContent).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.bubbleContent);
       }
       tspreadGoldS = this.tsMills;
       if (tspreadGoldS - i2) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, tspreadGoldS);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCGzoneSpreadGoldEntrance mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 32) {
                      if (i != 40) {
                         if (i != 48) {
                            if (i != 58) {
                               if (i != 64) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
                                  }
                               }else {
                                  this.tsMills = p0.readUInt64();
                               }
                            }else {
                               this.bubbleContent = p0.readString();
                            }
                         }else {
                            this.bubbleShowDelayMills = p0.readUInt32();
                         }
                      }else {
                         this.bubbleDayLimit = p0.readUInt32();
                      }
                   }else {
                      this.bubbleLsLimit = p0.readUInt32();
                   }
                }else {
                   this.linkUrl = p0.readString();
                }
             }else {
                this.activityId = p0.readUInt64();
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             SCGzoneSpreadGoldEntrance tspreadGoldS = this.spreadGoldState;
             int i2 = (tspreadGoldS == null)? 0: tspreadGoldS.length;
             i = i + i2;
             SCGzoneSpreadGoldEntrance$GzoneSpreadGoldEntranceState[] gzoneSpreadG = new SCGzoneSpreadGoldEntrance$GzoneSpreadGoldEntranceState[i];
             if (i2) {
                System.arraycopy(tspreadGoldS, 0, gzoneSpreadG, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                gzoneSpreadG[i2] = new SCGzoneSpreadGoldEntrance$GzoneSpreadGoldEntranceState();
                p0.readMessage(gzoneSpreadG[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             gzoneSpreadG[i2] = new SCGzoneSpreadGoldEntrance$GzoneSpreadGoldEntranceState();
             p0.readMessage(gzoneSpreadG[i2]);
             this.spreadGoldState = gzoneSpreadG;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCGzoneSpreadGoldEntrance tspreadGoldS = this.spreadGoldState;
       if (tspreadGoldS != null && tspreadGoldS.length > 0) {
          int i = 0;
          SCGzoneSpreadGoldEntrance tspreadGoldS1 = this.spreadGoldState;
          while (i < tspreadGoldS1.length) {
             object oobject = tspreadGoldS1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       tspreadGoldS = this.activityId;
       int i1 = 0;
       if (tspreadGoldS - i1) {
          p0.writeUInt64(2, tspreadGoldS);
       }
       String str = "";
       if (!(this.linkUrl).equals(str)) {
          p0.writeString(3, this.linkUrl);
       }
       tspreadGoldS = this.bubbleLsLimit;
       if (tspreadGoldS != null) {
          p0.writeUInt32(4, tspreadGoldS);
       }
       tspreadGoldS = this.bubbleDayLimit;
       if (tspreadGoldS != null) {
          p0.writeUInt32(5, tspreadGoldS);
       }
       tspreadGoldS = this.bubbleShowDelayMills;
       if (tspreadGoldS != null) {
          p0.writeUInt32(6, tspreadGoldS);
       }
       if (!(this.bubbleContent).equals(str)) {
          p0.writeString(7, this.bubbleContent);
       }
       tspreadGoldS = this.tsMills;
       if (tspreadGoldS - i1) {
          p0.writeUInt64(8, tspreadGoldS);
       }
       super.writeTo(p0);
       return;
    }
}
