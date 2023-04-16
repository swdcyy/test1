package com.kuaishou.livestream.message.nano.TeamPkFightMotion;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class TeamPkFightMotion extends MessageNano	// class@001472
{
    public int fromTeam;
    public String liveStreamId;
    public String pkId;
    public String pkRoomId;
    public int toTeam;
    public String voicePartyId;
    public static TeamPkFightMotion[] _emptyArray;

    public void TeamPkFightMotion(){
       super();
       this.clear();
    }
    public static TeamPkFightMotion[] emptyArray(){
       if (TeamPkFightMotion._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (TeamPkFightMotion._emptyArray == null) {
             TeamPkFightMotion[] teamPkFightM = new TeamPkFightMotion[0];
             TeamPkFightMotion._emptyArray = teamPkFightM;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return TeamPkFightMotion._emptyArray;
    }
    public static TeamPkFightMotion parseFrom(CodedInputByteBufferNano p0){
       return new TeamPkFightMotion().mergeFrom(p0);
    }
    public static TeamPkFightMotion parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new TeamPkFightMotion(), p0);
    }
    public TeamPkFightMotion clear(){
       this.liveStreamId = "";
       this.voicePartyId = "";
       this.pkRoomId = "";
       this.pkId = "";
       this.fromTeam = 0;
       this.toTeam = 0;
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
       TeamPkFightMotion tfromTeam = this.fromTeam;
       if (tfromTeam != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tfromTeam);
       }
       tfromTeam = this.toTeam;
       if (tfromTeam != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, tfromTeam);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public TeamPkFightMotion mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 40) {
                         if (i != 48) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            i = p0.readInt32();
                            if (i && (i != 1 && i != 2)) {
                               continue ;
                            }else {
                               this.toTeam = i;
                            }
                         }
                      }else {
                         i = p0.readInt32();
                         if (i && (i != 1 && i != 2)) {
                            continue ;
                         }else {
                            this.fromTeam = i;
                         }
                      }
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
       TeamPkFightMotion tfromTeam = this.fromTeam;
       if (tfromTeam != null) {
          p0.writeInt32(5, tfromTeam);
       }
       tfromTeam = this.toTeam;
       if (tfromTeam != null) {
          p0.writeInt32(6, tfromTeam);
       }
       super.writeTo(p0);
       return;
    }
}
