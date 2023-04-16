package com.kuaishou.livestream.message.nano.SCLiveGiftTitleChangeInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveGiftTitleInfo;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class SCLiveGiftTitleChangeInfo extends MessageNano	// class@001424
{
    public LiveGiftTitleInfo[] info;
    public String liveStreamId;
    public long serverTime;
    public static SCLiveGiftTitleChangeInfo[] _emptyArray;

    public void SCLiveGiftTitleChangeInfo(){
       super();
       this.clear();
    }
    public static SCLiveGiftTitleChangeInfo[] emptyArray(){
       if (SCLiveGiftTitleChangeInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveGiftTitleChangeInfo._emptyArray == null) {
             SCLiveGiftTitleChangeInfo[] sCLiveGiftTi = new SCLiveGiftTitleChangeInfo[0];
             SCLiveGiftTitleChangeInfo._emptyArray = sCLiveGiftTi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveGiftTitleChangeInfo._emptyArray;
    }
    public static SCLiveGiftTitleChangeInfo parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveGiftTitleChangeInfo().mergeFrom(p0);
    }
    public static SCLiveGiftTitleChangeInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveGiftTitleChangeInfo(), p0);
    }
    public SCLiveGiftTitleChangeInfo clear(){
       this.serverTime = 0;
       this.liveStreamId = "";
       this.info = LiveGiftTitleInfo.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCLiveGiftTitleChangeInfo tserverTime = this.serverTime;
       if (tserverTime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tserverTime);
       }
       if (!(this.liveStreamId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.liveStreamId);
       }
       tserverTime = this.info;
       if (tserverTime != null && tserverTime.length > 0) {
          int i1 = 0;
          SCLiveGiftTitleChangeInfo tinfo = this.info;
          while (i1 < tinfo.length) {
             object oobject = tinfo[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveGiftTitleChangeInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                int i1 = 26;
                if (i != i1) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   SCLiveGiftTitleChangeInfo tinfo = this.info;
                   int i2 = (tinfo == null)? 0: tinfo.length;
                   i = i + i2;
                   LiveGiftTitleInfo[] liveGiftTitl = new LiveGiftTitleInfo[i];
                   if (i2) {
                      System.arraycopy(tinfo, 0, liveGiftTitl, 0, i2);
                   }
                   i1 = i - 1;
                   while (i2 < i1) {
                      liveGiftTitl[i2] = new LiveGiftTitleInfo();
                      p0.readMessage(liveGiftTitl[i2]);
                      p0.readTag();
                      i2 = i2 + 1;
                   }
                   liveGiftTitl[i2] = new LiveGiftTitleInfo();
                   p0.readMessage(liveGiftTitl[i2]);
                   this.info = liveGiftTitl;
                }
             }else {
                this.liveStreamId = p0.readString();
             }
          }else {
             this.serverTime = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCLiveGiftTitleChangeInfo tserverTime = this.serverTime;
       if (tserverTime) {
          p0.writeUInt64(1, tserverTime);
       }
       if (!(this.liveStreamId).equals("")) {
          p0.writeString(2, this.liveStreamId);
       }
       tserverTime = this.info;
       if (tserverTime != null && tserverTime.length > 0) {
          int i = 0;
          SCLiveGiftTitleChangeInfo tinfo = this.info;
          while (i < tinfo.length) {
             object oobject = tinfo[i];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
