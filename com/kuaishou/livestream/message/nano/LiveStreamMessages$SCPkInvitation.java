package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCPkInvitation;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$PkPlayerInfo;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$PKSellingChatInfo;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$PKSellingCPSInfo;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$PkPayInfo;
import java.lang.System;

public final class LiveStreamMessages$SCPkInvitation extends MessageNano	// class@00135b
{
    public String displayDistrictInfo;
    public String districtForbidPkInvitationMessage;
    public long incomingTimeoutMillis;
    public int invitationSource;
    public String invitationText;
    public LiveStreamMessages$PkPayInfo payInfo;
    public String pkId;
    public LiveStreamMessages$PKSellingCPSInfo pkSellingCpsInfo;
    public LiveStreamMessages$PkPlayerInfo[] player;
    public long pollIntervalMilli;
    public LiveStreamMessages$PKSellingChatInfo sellingChatInfo;
    public long time;
    public static LiveStreamMessages$SCPkInvitation[] _emptyArray;

    public void LiveStreamMessages$SCPkInvitation(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCPkInvitation[] emptyArray(){
       if (LiveStreamMessages$SCPkInvitation._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCPkInvitation._emptyArray == null) {
             LiveStreamMessages$SCPkInvitation[] sCPkInvitati = new LiveStreamMessages$SCPkInvitation[0];
             LiveStreamMessages$SCPkInvitation._emptyArray = sCPkInvitati;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCPkInvitation._emptyArray;
    }
    public static LiveStreamMessages$SCPkInvitation parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCPkInvitation().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCPkInvitation parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCPkInvitation(), p0);
    }
    public LiveStreamMessages$SCPkInvitation clear(){
       this.pkId = "";
       this.time = 0;
       this.player = LiveStreamMessages$PkPlayerInfo.emptyArray();
       this.pollIntervalMilli = 0;
       this.incomingTimeoutMillis = 0;
       this.invitationSource = 0;
       this.displayDistrictInfo = "";
       this.districtForbidPkInvitationMessage = "";
       this.payInfo = null;
       this.pkSellingCpsInfo = null;
       this.invitationText = "";
       this.sellingChatInfo = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.pkId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.pkId);
       }
       LiveStreamMessages$SCPkInvitation ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, ttime);
       }
       LiveStreamMessages$SCPkInvitation tplayer = this.player;
       if (tplayer != null && tplayer.length > 0) {
          int i1 = 0;
          ttime = this.player;
          while (i1 < ttime.length) {
             object oobject = ttime[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ttime = this.pollIntervalMilli;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, ttime);
       }
       ttime = this.incomingTimeoutMillis;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, ttime);
       }
       tplayer = this.invitationSource;
       if (tplayer != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, tplayer);
       }
       if (!(this.displayDistrictInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.displayDistrictInfo);
       }
       if (!(this.districtForbidPkInvitationMessage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.districtForbidPkInvitationMessage);
       }
       tplayer = this.payInfo;
       if (tplayer != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(9, tplayer);
       }
       tplayer = this.pkSellingCpsInfo;
       if (tplayer != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(10, tplayer);
       }
       if (!(this.invitationText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.invitationText);
       }
       tplayer = this.sellingChatInfo;
       if (tplayer != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(12, tplayer);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCPkInvitation mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.pkId = p0.readString();
                break;
              case 16:
                this.time = p0.readUInt64();
                break;
              case 26:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 26);
                LiveStreamMessages$SCPkInvitation tplayer = this.player;
                int i1 = (tplayer == null)? 0: tplayer.length;
                i = i + i1;
                LiveStreamMessages$PkPlayerInfo[] pkPlayerInfo = new LiveStreamMessages$PkPlayerInfo[i];
                if (i1) {
                   System.arraycopy(tplayer, 0, pkPlayerInfo, 0, i1);
                }
                int i2 = i - 1;
                while (i1 < i2) {
                   pkPlayerInfo[i1] = new LiveStreamMessages$PkPlayerInfo();
                   p0.readMessage(pkPlayerInfo[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                pkPlayerInfo[i1] = new LiveStreamMessages$PkPlayerInfo();
                p0.readMessage(pkPlayerInfo[i1]);
                this.player = pkPlayerInfo;
                break;
              case 32:
                this.pollIntervalMilli = p0.readUInt64();
                break;
              case '(':
                this.incomingTimeoutMillis = p0.readUInt64();
                break;
              case '0':
                i = p0.readInt32();
                switch (i){
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 1:
                      break;
                    default:
                }
                this.invitationSource = i;
                break;
              case ':':
                this.displayDistrictInfo = p0.readString();
                break;
              case 'B':
                this.districtForbidPkInvitationMessage = p0.readString();
                break;
              case 'J':
                if (this.payInfo == null) {
                   this.payInfo = new LiveStreamMessages$PkPayInfo();
                }
                p0.readMessage(this.payInfo);
                break;
              case 'R':
                if (this.pkSellingCpsInfo == null) {
                   this.pkSellingCpsInfo = new LiveStreamMessages$PKSellingCPSInfo();
                }
                p0.readMessage(this.pkSellingCpsInfo);
                break;
              case 'Z':
                this.invitationText = p0.readString();
                break;
              case 'b':
                if (this.sellingChatInfo == null) {
                   this.sellingChatInfo = new LiveStreamMessages$PKSellingChatInfo();
                }
                p0.readMessage(this.sellingChatInfo);
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   return this;
                }
                continue ;
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.pkId).equals(str)) {
          p0.writeString(1, this.pkId);
       }
       LiveStreamMessages$SCPkInvitation ttime = this.time;
       if (ttime) {
          p0.writeUInt64(2, ttime);
       }
       LiveStreamMessages$SCPkInvitation tplayer = this.player;
       if (tplayer != null && tplayer.length > 0) {
          int i = 0;
          ttime = this.player;
          while (i < ttime.length) {
             object oobject = ttime[i];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i = i + 1;
          }
       }
       ttime = this.pollIntervalMilli;
       if (ttime) {
          p0.writeUInt64(4, ttime);
       }
       ttime = this.incomingTimeoutMillis;
       if (ttime) {
          p0.writeUInt64(5, ttime);
       }
       tplayer = this.invitationSource;
       if (tplayer != null) {
          p0.writeInt32(6, tplayer);
       }
       if (!(this.displayDistrictInfo).equals(str)) {
          p0.writeString(7, this.displayDistrictInfo);
       }
       if (!(this.districtForbidPkInvitationMessage).equals(str)) {
          p0.writeString(8, this.districtForbidPkInvitationMessage);
       }
       tplayer = this.payInfo;
       if (tplayer != null) {
          p0.writeMessage(9, tplayer);
       }
       tplayer = this.pkSellingCpsInfo;
       if (tplayer != null) {
          p0.writeMessage(10, tplayer);
       }
       if (!(this.invitationText).equals(str)) {
          p0.writeString(11, this.invitationText);
       }
       tplayer = this.sellingChatInfo;
       if (tplayer != null) {
          p0.writeMessage(12, tplayer);
       }
       super.writeTo(p0);
       return;
    }
}
