package com.kuaishou.livestream.message.nano.LiveStreamMessages$GzoneLiveHourRankTabInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$GzoneLiveHourRankTabInfo extends MessageNano	// class@0012dc
{
    public String displayRank;
    public String gapValue;
    public boolean isInTop;
    public int rank;
    public String rankName;
    public int tabId;
    public static LiveStreamMessages$GzoneLiveHourRankTabInfo[] _emptyArray;

    public void LiveStreamMessages$GzoneLiveHourRankTabInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$GzoneLiveHourRankTabInfo[] emptyArray(){
       if (LiveStreamMessages$GzoneLiveHourRankTabInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$GzoneLiveHourRankTabInfo._emptyArray == null) {
             LiveStreamMessages$GzoneLiveHourRankTabInfo[] gzoneLiveHou = new LiveStreamMessages$GzoneLiveHourRankTabInfo[0];
             LiveStreamMessages$GzoneLiveHourRankTabInfo._emptyArray = gzoneLiveHou;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$GzoneLiveHourRankTabInfo._emptyArray;
    }
    public static LiveStreamMessages$GzoneLiveHourRankTabInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$GzoneLiveHourRankTabInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$GzoneLiveHourRankTabInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$GzoneLiveHourRankTabInfo(), p0);
    }
    public LiveStreamMessages$GzoneLiveHourRankTabInfo clear(){
       this.tabId = 0;
       this.isInTop = false;
       this.rankName = "";
       this.rank = 0;
       this.displayRank = "";
       this.gapValue = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$GzoneLiveHourRankTabInfo ttabId = this.tabId;
       if (ttabId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, ttabId);
       }
       ttabId = this.isInTop;
       if (ttabId != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, ttabId);
       }
       String str = "";
       if (!(this.rankName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.rankName);
       }
       ttabId = this.rank;
       if (ttabId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, ttabId);
       }
       if (!(this.displayRank).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.displayRank);
       }
       if (!(this.gapValue).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.gapValue);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$GzoneLiveHourRankTabInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 32) {
                      if (i != 42) {
                         if (i != 50) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.gapValue = p0.readString();
                         }
                      }else {
                         this.displayRank = p0.readString();
                      }
                   }else {
                      this.rank = p0.readUInt32();
                   }
                }else {
                   this.rankName = p0.readString();
                }
             }else {
                this.isInTop = p0.readBool();
             }
          }else {
             this.tabId = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$GzoneLiveHourRankTabInfo ttabId = this.tabId;
       if (ttabId != null) {
          p0.writeUInt32(1, ttabId);
       }
       ttabId = this.isInTop;
       if (ttabId != null) {
          p0.writeBool(2, ttabId);
       }
       String str = "";
       if (!(this.rankName).equals(str)) {
          p0.writeString(3, this.rankName);
       }
       ttabId = this.rank;
       if (ttabId != null) {
          p0.writeUInt32(4, ttabId);
       }
       if (!(this.displayRank).equals(str)) {
          p0.writeString(5, this.displayRank);
       }
       if (!(this.gapValue).equals(str)) {
          p0.writeString(6, this.gapValue);
       }
       super.writeTo(p0);
       return;
    }
}
