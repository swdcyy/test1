package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCGzoneLiveHourRankInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$GzoneLiveHourRankTabInfo;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveStreamMessages$SCGzoneLiveHourRankInfo extends MessageNano	// class@001333
{
    public String liveStreamId;
    public int priority;
    public LiveStreamMessages$GzoneLiveHourRankTabInfo[] tabInfo;
    public static LiveStreamMessages$SCGzoneLiveHourRankInfo[] _emptyArray;

    public void LiveStreamMessages$SCGzoneLiveHourRankInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCGzoneLiveHourRankInfo[] emptyArray(){
       if (LiveStreamMessages$SCGzoneLiveHourRankInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCGzoneLiveHourRankInfo._emptyArray == null) {
             LiveStreamMessages$SCGzoneLiveHourRankInfo[] sCGzoneLiveH = new LiveStreamMessages$SCGzoneLiveHourRankInfo[0];
             LiveStreamMessages$SCGzoneLiveHourRankInfo._emptyArray = sCGzoneLiveH;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCGzoneLiveHourRankInfo._emptyArray;
    }
    public static LiveStreamMessages$SCGzoneLiveHourRankInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCGzoneLiveHourRankInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCGzoneLiveHourRankInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCGzoneLiveHourRankInfo(), p0);
    }
    public LiveStreamMessages$SCGzoneLiveHourRankInfo clear(){
       this.liveStreamId = "";
       this.tabInfo = LiveStreamMessages$GzoneLiveHourRankTabInfo.emptyArray();
       this.priority = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.liveStreamId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       LiveStreamMessages$SCGzoneLiveHourRankInfo ttabInfo = this.tabInfo;
       if (ttabInfo != null && ttabInfo.length > 0) {
          int i1 = 0;
          LiveStreamMessages$SCGzoneLiveHourRankInfo ttabInfo1 = this.tabInfo;
          while (i1 < ttabInfo1.length) {
             object oobject = ttabInfo1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ttabInfo = this.priority;
       if (ttabInfo != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, ttabInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCGzoneLiveHourRankInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             int i1 = 18;
             if (i != i1) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.priority = p0.readUInt32();
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                LiveStreamMessages$SCGzoneLiveHourRankInfo ttabInfo = this.tabInfo;
                int i2 = (ttabInfo == null)? 0: ttabInfo.length;
                i = i + i2;
                LiveStreamMessages$GzoneLiveHourRankTabInfo[] gzoneLiveHou = new LiveStreamMessages$GzoneLiveHourRankTabInfo[i];
                if (i2) {
                   System.arraycopy(ttabInfo, 0, gzoneLiveHou, 0, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   gzoneLiveHou[i2] = new LiveStreamMessages$GzoneLiveHourRankTabInfo();
                   p0.readMessage(gzoneLiveHou[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                gzoneLiveHou[i2] = new LiveStreamMessages$GzoneLiveHourRankTabInfo();
                p0.readMessage(gzoneLiveHou[i2]);
                this.tabInfo = gzoneLiveHou;
             }
          }else {
             this.liveStreamId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.liveStreamId).equals("")) {
          p0.writeString(1, this.liveStreamId);
       }
       LiveStreamMessages$SCGzoneLiveHourRankInfo ttabInfo = this.tabInfo;
       if (ttabInfo != null && ttabInfo.length > 0) {
          int i = 0;
          LiveStreamMessages$SCGzoneLiveHourRankInfo ttabInfo1 = this.tabInfo;
          while (i < ttabInfo1.length) {
             object oobject = ttabInfo1[i];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i = i + 1;
          }
       }
       ttabInfo = this.priority;
       if (ttabInfo != null) {
          p0.writeUInt32(3, ttabInfo);
       }
       super.writeTo(p0);
       return;
    }
}
