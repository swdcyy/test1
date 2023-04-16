package com.kuaishou.livestream.message.nano.SCTeamPkStatisticInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.TeamPkStatisticInfo;

public final class SCTeamPkStatisticInfo extends MessageNano	// class@001466
{
    public String liveStreamId;
    public String pkId;
    public String pkRoomId;
    public TeamPkStatisticInfo statisticInfo;
    public String voicePartyId;
    public static SCTeamPkStatisticInfo[] _emptyArray;

    public void SCTeamPkStatisticInfo(){
       super();
       this.clear();
    }
    public static SCTeamPkStatisticInfo[] emptyArray(){
       if (SCTeamPkStatisticInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCTeamPkStatisticInfo._emptyArray == null) {
             SCTeamPkStatisticInfo[] sCTeamPkStat = new SCTeamPkStatisticInfo[0];
             SCTeamPkStatisticInfo._emptyArray = sCTeamPkStat;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCTeamPkStatisticInfo._emptyArray;
    }
    public static SCTeamPkStatisticInfo parseFrom(CodedInputByteBufferNano p0){
       return new SCTeamPkStatisticInfo().mergeFrom(p0);
    }
    public static SCTeamPkStatisticInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCTeamPkStatisticInfo(), p0);
    }
    public SCTeamPkStatisticInfo clear(){
       this.liveStreamId = "";
       this.voicePartyId = "";
       this.pkRoomId = "";
       this.pkId = "";
       this.statisticInfo = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       if (!(this.voicePartyId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.voicePartyId);
       }
       if (!(this.pkRoomId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.pkRoomId);
       }
       if (!(this.pkId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.pkId);
       }
       SCTeamPkStatisticInfo tstatisticIn = this.statisticInfo;
       if (tstatisticIn != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(5, tstatisticIn);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCTeamPkStatisticInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else if(this.statisticInfo == null){
                         this.statisticInfo = new TeamPkStatisticInfo();
                      }
                      p0.readMessage(this.statisticInfo);
                   }else {
                      this.pkId = p0.readString();
                   }
                }else {
                   this.pkRoomId = p0.readString();
                }
             }else {
                this.voicePartyId = p0.readString();
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
       if (!(this.voicePartyId).equals(str)) {
          p0.writeString(2, this.voicePartyId);
       }
       if (!(this.pkRoomId).equals(str)) {
          p0.writeString(3, this.pkRoomId);
       }
       if (!(this.pkId).equals(str)) {
          p0.writeString(4, this.pkId);
       }
       SCTeamPkStatisticInfo tstatisticIn = this.statisticInfo;
       if (tstatisticIn != null) {
          p0.writeMessage(5, tstatisticIn);
       }
       super.writeTo(p0);
       return;
    }
}
