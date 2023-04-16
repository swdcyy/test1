package com.kuaishou.livestream.message.nano.SCLiveGiftNamingNotice;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveGiftNamingInfo;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class SCLiveGiftNamingNotice extends MessageNano	// class@001421
{
    public int achievementWallVersion;
    public long authorId;
    public LiveGiftNamingInfo[] info;
    public String liveStreamId;
    public long serverTime;
    public static SCLiveGiftNamingNotice[] _emptyArray;

    public void SCLiveGiftNamingNotice(){
       super();
       this.clear();
    }
    public static SCLiveGiftNamingNotice[] emptyArray(){
       if (SCLiveGiftNamingNotice._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveGiftNamingNotice._emptyArray == null) {
             SCLiveGiftNamingNotice[] sCLiveGiftNa = new SCLiveGiftNamingNotice[0];
             SCLiveGiftNamingNotice._emptyArray = sCLiveGiftNa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveGiftNamingNotice._emptyArray;
    }
    public static SCLiveGiftNamingNotice parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveGiftNamingNotice().mergeFrom(p0);
    }
    public static SCLiveGiftNamingNotice parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveGiftNamingNotice(), p0);
    }
    public SCLiveGiftNamingNotice clear(){
       this.serverTime = 0;
       this.info = LiveGiftNamingInfo.emptyArray();
       this.authorId = 0;
       this.liveStreamId = "";
       this.achievementWallVersion = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCLiveGiftNamingNotice tserverTime = this.serverTime;
       int i1 = 0;
       if (tserverTime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tserverTime);
       }
       tserverTime = this.info;
       if (tserverTime != null && tserverTime.length > 0) {
          int i2 = 0;
          SCLiveGiftNamingNotice tinfo = this.info;
          while (i2 < tinfo.length) {
             object oobject = tinfo[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tserverTime = this.authorId;
       if (tserverTime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tserverTime);
       }
       if (!(this.liveStreamId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.liveStreamId);
       }
       tserverTime = this.achievementWallVersion;
       if (tserverTime != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, tserverTime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveGiftNamingNotice mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             int i1 = 18;
             if (i != i1) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.achievementWallVersion = p0.readUInt32();
                      }
                   }else {
                      this.liveStreamId = p0.readString();
                   }
                }else {
                   this.authorId = p0.readUInt64();
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                SCLiveGiftNamingNotice tinfo = this.info;
                int i2 = (tinfo == null)? 0: tinfo.length;
                i = i + i2;
                LiveGiftNamingInfo[] liveGiftNami = new LiveGiftNamingInfo[i];
                if (i2) {
                   System.arraycopy(tinfo, 0, liveGiftNami, 0, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   liveGiftNami[i2] = new LiveGiftNamingInfo();
                   p0.readMessage(liveGiftNami[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                liveGiftNami[i2] = new LiveGiftNamingInfo();
                p0.readMessage(liveGiftNami[i2]);
                this.info = liveGiftNami;
             }
          }else {
             this.serverTime = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCLiveGiftNamingNotice tserverTime = this.serverTime;
       int i = 0;
       if (tserverTime - i) {
          p0.writeUInt64(1, tserverTime);
       }
       tserverTime = this.info;
       if (tserverTime != null && tserverTime.length > 0) {
          int i1 = 0;
          SCLiveGiftNamingNotice tinfo = this.info;
          while (i1 < tinfo.length) {
             object oobject = tinfo[i1];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tserverTime = this.authorId;
       if (tserverTime - i) {
          p0.writeUInt64(3, tserverTime);
       }
       if (!(this.liveStreamId).equals("")) {
          p0.writeString(4, this.liveStreamId);
       }
       tserverTime = this.achievementWallVersion;
       if (tserverTime != null) {
          p0.writeUInt32(5, tserverTime);
       }
       super.writeTo(p0);
       return;
    }
}
