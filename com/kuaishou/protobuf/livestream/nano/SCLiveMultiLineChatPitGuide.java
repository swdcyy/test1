package com.kuaishou.protobuf.livestream.nano.SCLiveMultiLineChatPitGuide;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.MultiLineChatPitGuideInfo;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class SCLiveMultiLineChatPitGuide extends MessageNano	// class@000d5d
{
    public long authorId;
    public long displayDurationMs;
    public long displayIntervalMs;
    public long displayTimes;
    public MultiLineChatPitGuideInfo[] guideInfo;
    public String liveStreamId;
    public String multiLineChatId;
    public long timestamp;
    public String userSession;
    public static SCLiveMultiLineChatPitGuide[] _emptyArray;

    public void SCLiveMultiLineChatPitGuide(){
       super();
       this.clear();
    }
    public static SCLiveMultiLineChatPitGuide[] emptyArray(){
       if (SCLiveMultiLineChatPitGuide._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveMultiLineChatPitGuide._emptyArray == null) {
             SCLiveMultiLineChatPitGuide[] sCLiveMultiL = new SCLiveMultiLineChatPitGuide[0];
             SCLiveMultiLineChatPitGuide._emptyArray = sCLiveMultiL;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveMultiLineChatPitGuide._emptyArray;
    }
    public static SCLiveMultiLineChatPitGuide parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveMultiLineChatPitGuide().mergeFrom(p0);
    }
    public static SCLiveMultiLineChatPitGuide parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveMultiLineChatPitGuide(), p0);
    }
    public SCLiveMultiLineChatPitGuide clear(){
       this.multiLineChatId = "";
       this.liveStreamId = "";
       this.authorId = 0;
       this.userSession = "";
       this.timestamp = 0;
       this.guideInfo = MultiLineChatPitGuideInfo.emptyArray();
       this.displayIntervalMs = 0;
       this.displayDurationMs = 0;
       this.displayTimes = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.multiLineChatId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.multiLineChatId);
       }
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.liveStreamId);
       }
       SCLiveMultiLineChatPitGuide tauthorId = this.authorId;
       if (tauthorId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tauthorId);
       }
       if (!(this.userSession).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.userSession);
       }
       SCLiveMultiLineChatPitGuide ttimestamp = this.timestamp;
       if (ttimestamp) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, ttimestamp);
       }
       ttimestamp = this.guideInfo;
       if (ttimestamp != null && ttimestamp.length > 0) {
          int i1 = 0;
          SCLiveMultiLineChatPitGuide tguideInfo = this.guideInfo;
          while (i1 < tguideInfo.length) {
             object oobject = tguideInfo[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(6, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ttimestamp = this.displayIntervalMs;
       if (ttimestamp) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, ttimestamp);
       }
       ttimestamp = this.displayDurationMs;
       if (ttimestamp) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, ttimestamp);
       }
       ttimestamp = this.displayTimes;
       if (ttimestamp) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(9, ttimestamp);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveMultiLineChatPitGuide mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 40) {
                         int i1 = 50;
                         if (i != i1) {
                            if (i != 56) {
                               if (i != 64) {
                                  if (i != 72) {
                                     if (!WireFormatNano.parseUnknownField(p0, i)) {
                                        break ;
                                     }
                                  }else {
                                     this.displayTimes = p0.readUInt64();
                                  }
                               }else {
                                  this.displayDurationMs = p0.readUInt64();
                               }
                            }else {
                               this.displayIntervalMs = p0.readUInt64();
                            }
                         }else {
                            i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                            SCLiveMultiLineChatPitGuide tguideInfo = this.guideInfo;
                            int i2 = (tguideInfo == null)? 0: tguideInfo.length;
                            i = i + i2;
                            MultiLineChatPitGuideInfo[] multiLineCha = new MultiLineChatPitGuideInfo[i];
                            if (i2) {
                               System.arraycopy(tguideInfo, 0, multiLineCha, 0, i2);
                            }
                            i1 = i - 1;
                            while (i2 < i1) {
                               multiLineCha[i2] = new MultiLineChatPitGuideInfo();
                               p0.readMessage(multiLineCha[i2]);
                               p0.readTag();
                               i2 = i2 + 1;
                            }
                            multiLineCha[i2] = new MultiLineChatPitGuideInfo();
                            p0.readMessage(multiLineCha[i2]);
                            this.guideInfo = multiLineCha;
                         }
                      }else {
                         this.timestamp = p0.readUInt64();
                      }
                   }else {
                      this.userSession = p0.readString();
                   }
                }else {
                   this.authorId = p0.readUInt64();
                }
             }else {
                this.liveStreamId = p0.readString();
             }
          }else {
             this.multiLineChatId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.multiLineChatId).equals(str)) {
          p0.writeString(1, this.multiLineChatId);
       }
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(2, this.liveStreamId);
       }
       SCLiveMultiLineChatPitGuide tauthorId = this.authorId;
       if (tauthorId) {
          p0.writeUInt64(3, tauthorId);
       }
       if (!(this.userSession).equals(str)) {
          p0.writeString(4, this.userSession);
       }
       SCLiveMultiLineChatPitGuide ttimestamp = this.timestamp;
       if (ttimestamp) {
          p0.writeUInt64(5, ttimestamp);
       }
       ttimestamp = this.guideInfo;
       if (ttimestamp != null && ttimestamp.length > 0) {
          int i = 0;
          SCLiveMultiLineChatPitGuide tguideInfo = this.guideInfo;
          while (i < tguideInfo.length) {
             object oobject = tguideInfo[i];
             if (oobject != null) {
                p0.writeMessage(6, oobject);
             }
             i = i + 1;
          }
       }
       ttimestamp = this.displayIntervalMs;
       if (ttimestamp) {
          p0.writeUInt64(7, ttimestamp);
       }
       ttimestamp = this.displayDurationMs;
       if (ttimestamp) {
          p0.writeUInt64(8, ttimestamp);
       }
       ttimestamp = this.displayTimes;
       if (ttimestamp) {
          p0.writeUInt64(9, ttimestamp);
       }
       super.writeTo(p0);
       return;
    }
}
