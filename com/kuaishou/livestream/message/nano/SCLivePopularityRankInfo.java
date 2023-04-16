package com.kuaishou.livestream.message.nano.SCLivePopularityRankInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLivePopularityRankInfo extends MessageNano	// class@001435
{
    public long currentTimestamp;
    public String displayRank;
    public boolean isInTop;
    public String liveStreamId;
    public int priority;
    public String rank;
    public int rankType;
    public boolean showRank;
    public static SCLivePopularityRankInfo[] _emptyArray;

    public void SCLivePopularityRankInfo(){
       super();
       this.clear();
    }
    public static SCLivePopularityRankInfo[] emptyArray(){
       if (SCLivePopularityRankInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLivePopularityRankInfo._emptyArray == null) {
             SCLivePopularityRankInfo[] sCLivePopula = new SCLivePopularityRankInfo[0];
             SCLivePopularityRankInfo._emptyArray = sCLivePopula;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLivePopularityRankInfo._emptyArray;
    }
    public static SCLivePopularityRankInfo parseFrom(CodedInputByteBufferNano p0){
       return new SCLivePopularityRankInfo().mergeFrom(p0);
    }
    public static SCLivePopularityRankInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLivePopularityRankInfo(), p0);
    }
    public SCLivePopularityRankInfo clear(){
       this.liveStreamId = "";
       this.isInTop = false;
       this.displayRank = "";
       this.showRank = false;
       this.priority = 0;
       this.currentTimestamp = 0;
       this.rank = "";
       this.rankType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       SCLivePopularityRankInfo tisInTop = this.isInTop;
       if (tisInTop != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tisInTop);
       }
       if (!(this.displayRank).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.displayRank);
       }
       tisInTop = this.showRank;
       if (tisInTop != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, tisInTop);
       }
       tisInTop = this.priority;
       if (tisInTop != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, tisInTop);
       }
       SCLivePopularityRankInfo tcurrentTime = this.currentTimestamp;
       if (tcurrentTime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tcurrentTime);
       }
       if (!(this.rank).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.rank);
       }
       tisInTop = this.rankType;
       if (tisInTop != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(8, tisInTop);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLivePopularityRankInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
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
                                  this.rankType = p0.readUInt32();
                               }
                            }else {
                               this.rank = p0.readString();
                            }
                         }else {
                            this.currentTimestamp = p0.readUInt64();
                         }
                      }else {
                         this.priority = p0.readUInt32();
                      }
                   }else {
                      this.showRank = p0.readBool();
                   }
                }else {
                   this.displayRank = p0.readString();
                }
             }else {
                this.isInTop = p0.readBool();
             }
          }else {
             this.liveStreamId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(1, this.liveStreamId);
       }
       SCLivePopularityRankInfo tisInTop = this.isInTop;
       if (tisInTop != null) {
          p0.writeBool(2, tisInTop);
       }
       if (!(this.displayRank).equals(str)) {
          p0.writeString(3, this.displayRank);
       }
       tisInTop = this.showRank;
       if (tisInTop != null) {
          p0.writeBool(4, tisInTop);
       }
       tisInTop = this.priority;
       if (tisInTop != null) {
          p0.writeUInt32(5, tisInTop);
       }
       SCLivePopularityRankInfo tcurrentTime = this.currentTimestamp;
       if (tcurrentTime) {
          p0.writeUInt64(6, tcurrentTime);
       }
       if (!(this.rank).equals(str)) {
          p0.writeString(7, this.rank);
       }
       tisInTop = this.rankType;
       if (tisInTop != null) {
          p0.writeUInt32(8, tisInTop);
       }
       super.writeTo(p0);
       return;
    }
}
