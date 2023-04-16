package com.kuaishou.livestream.message.nano.SCTeamPkRoomOpened;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$MicSeatDetailInfo;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class SCTeamPkRoomOpened extends MessageNano	// class@001464
{
    public boolean fromEnterRoom;
    public String liveStreamId;
    public LiveStreamMessages$MicSeatDetailInfo[] micSeatDetailInfo;
    public int micSeatsVersion;
    public String pkRoomId;
    public String pkRuleUrl;
    public String voicePartyId;
    public static SCTeamPkRoomOpened[] _emptyArray;

    public void SCTeamPkRoomOpened(){
       super();
       this.clear();
    }
    public static SCTeamPkRoomOpened[] emptyArray(){
       if (SCTeamPkRoomOpened._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCTeamPkRoomOpened._emptyArray == null) {
             SCTeamPkRoomOpened[] sCTeamPkRoom = new SCTeamPkRoomOpened[0];
             SCTeamPkRoomOpened._emptyArray = sCTeamPkRoom;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCTeamPkRoomOpened._emptyArray;
    }
    public static SCTeamPkRoomOpened parseFrom(CodedInputByteBufferNano p0){
       return new SCTeamPkRoomOpened().mergeFrom(p0);
    }
    public static SCTeamPkRoomOpened parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCTeamPkRoomOpened(), p0);
    }
    public SCTeamPkRoomOpened clear(){
       this.liveStreamId = "";
       this.voicePartyId = "";
       this.pkRoomId = "";
       this.pkRuleUrl = "";
       this.micSeatDetailInfo = LiveStreamMessages$MicSeatDetailInfo.emptyArray();
       this.micSeatsVersion = 0;
       this.fromEnterRoom = false;
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
       if (!(this.pkRuleUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.pkRuleUrl);
       }
       SCTeamPkRoomOpened tmicSeatDeta = this.micSeatDetailInfo;
       if (tmicSeatDeta != null && tmicSeatDeta.length > 0) {
          int i1 = 0;
          SCTeamPkRoomOpened tmicSeatDeta1 = this.micSeatDetailInfo;
          while (i1 < tmicSeatDeta1.length) {
             object oobject = tmicSeatDeta1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(5, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tmicSeatDeta = this.micSeatsVersion;
       if (tmicSeatDeta != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, tmicSeatDeta);
       }
       tmicSeatDeta = this.fromEnterRoom;
       if (tmicSeatDeta != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(7, tmicSeatDeta);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCTeamPkRoomOpened mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      int i1 = 42;
                      if (i != i1) {
                         if (i != 48) {
                            if (i != 56) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.fromEnterRoom = p0.readBool();
                            }
                         }else {
                            this.micSeatsVersion = p0.readUInt32();
                         }
                      }else {
                         i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                         SCTeamPkRoomOpened tmicSeatDeta = this.micSeatDetailInfo;
                         int i2 = (tmicSeatDeta == null)? 0: tmicSeatDeta.length;
                         i = i + i2;
                         LiveStreamMessages$MicSeatDetailInfo[] micSeatDetai = new LiveStreamMessages$MicSeatDetailInfo[i];
                         if (i2) {
                            System.arraycopy(tmicSeatDeta, 0, micSeatDetai, 0, i2);
                         }
                         i1 = i - 1;
                         while (i2 < i1) {
                            micSeatDetai[i2] = new LiveStreamMessages$MicSeatDetailInfo();
                            p0.readMessage(micSeatDetai[i2]);
                            p0.readTag();
                            i2 = i2 + 1;
                         }
                         micSeatDetai[i2] = new LiveStreamMessages$MicSeatDetailInfo();
                         p0.readMessage(micSeatDetai[i2]);
                         this.micSeatDetailInfo = micSeatDetai;
                      }
                   }else {
                      this.pkRuleUrl = p0.readString();
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
       if (!(this.pkRuleUrl).equals(str)) {
          p0.writeString(4, this.pkRuleUrl);
       }
       SCTeamPkRoomOpened tmicSeatDeta = this.micSeatDetailInfo;
       if (tmicSeatDeta != null && tmicSeatDeta.length > 0) {
          int i = 0;
          SCTeamPkRoomOpened tmicSeatDeta1 = this.micSeatDetailInfo;
          while (i < tmicSeatDeta1.length) {
             object oobject = tmicSeatDeta1[i];
             if (oobject != null) {
                p0.writeMessage(5, oobject);
             }
             i = i + 1;
          }
       }
       tmicSeatDeta = this.micSeatsVersion;
       if (tmicSeatDeta != null) {
          p0.writeUInt32(6, tmicSeatDeta);
       }
       tmicSeatDeta = this.fromEnterRoom;
       if (tmicSeatDeta != null) {
          p0.writeBool(7, tmicSeatDeta);
       }
       super.writeTo(p0);
       return;
    }
}
