package com.kuaishou.client.log.stat.packages.nano.ClientStat$ChannelSettingPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$ChannelSettingPackage extends MessageNano	// class@0013c2
{
    public int badgeStatus;
    public int bubbleStatus;
    public String channelId;
    public String channelName;
    public int lightStatus;
    public int locksCreenStatus;
    public int passDndStatus;
    public String phoneSoundStatus;
    public int soundStatus;
    public int vibrateStatus;
    public static ClientStat$ChannelSettingPackage[] _emptyArray;

    public void ClientStat$ChannelSettingPackage(){
       super();
       this.clear();
    }
    public static ClientStat$ChannelSettingPackage[] emptyArray(){
       if (ClientStat$ChannelSettingPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$ChannelSettingPackage._emptyArray == null) {
             ClientStat$ChannelSettingPackage[] uChannelSett = new ClientStat$ChannelSettingPackage[0];
             ClientStat$ChannelSettingPackage._emptyArray = uChannelSett;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$ChannelSettingPackage._emptyArray;
    }
    public static ClientStat$ChannelSettingPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$ChannelSettingPackage().mergeFrom(p0);
    }
    public static ClientStat$ChannelSettingPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$ChannelSettingPackage(), p0);
    }
    public ClientStat$ChannelSettingPackage clear(){
       this.channelName = "";
       this.channelId = "";
       this.soundStatus = 0;
       this.vibrateStatus = 0;
       this.lightStatus = 0;
       this.bubbleStatus = 0;
       this.badgeStatus = 0;
       this.locksCreenStatus = 0;
       this.passDndStatus = 0;
       this.phoneSoundStatus = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.channelName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.channelName);
       }
       if (!(this.channelId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.channelId);
       }
       ClientStat$ChannelSettingPackage tsoundStatus = this.soundStatus;
       if (tsoundStatus != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tsoundStatus);
       }
       tsoundStatus = this.vibrateStatus;
       if (tsoundStatus != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tsoundStatus);
       }
       tsoundStatus = this.lightStatus;
       if (tsoundStatus != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tsoundStatus);
       }
       tsoundStatus = this.bubbleStatus;
       if (tsoundStatus != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, tsoundStatus);
       }
       tsoundStatus = this.badgeStatus;
       if (tsoundStatus != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(7, tsoundStatus);
       }
       tsoundStatus = this.locksCreenStatus;
       if (tsoundStatus != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(8, tsoundStatus);
       }
       tsoundStatus = this.passDndStatus;
       if (tsoundStatus != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(9, tsoundStatus);
       }
       if (!(this.phoneSoundStatus).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.phoneSoundStatus);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$ChannelSettingPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.channelName = p0.readString();
                break;
              case 18:
                this.channelId = p0.readString();
                break;
              case 24:
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.soundStatus = i;
                }
                break;
              case 32:
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.vibrateStatus = i;
                }
                break;
              case '(':
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.lightStatus = i;
                }
                break;
              case '0':
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.bubbleStatus = i;
                }
                break;
              case '8':
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.badgeStatus = i;
                }
                break;
              case '@':
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.locksCreenStatus = i;
                }
                break;
              case 'H':
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.passDndStatus = i;
                }
                break;
              case 'R':
                this.phoneSoundStatus = p0.readString();
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
       if (!(this.channelName).equals(str)) {
          p0.writeString(1, this.channelName);
       }
       if (!(this.channelId).equals(str)) {
          p0.writeString(2, this.channelId);
       }
       ClientStat$ChannelSettingPackage tsoundStatus = this.soundStatus;
       if (tsoundStatus != null) {
          p0.writeInt32(3, tsoundStatus);
       }
       tsoundStatus = this.vibrateStatus;
       if (tsoundStatus != null) {
          p0.writeInt32(4, tsoundStatus);
       }
       tsoundStatus = this.lightStatus;
       if (tsoundStatus != null) {
          p0.writeInt32(5, tsoundStatus);
       }
       tsoundStatus = this.bubbleStatus;
       if (tsoundStatus != null) {
          p0.writeInt32(6, tsoundStatus);
       }
       tsoundStatus = this.badgeStatus;
       if (tsoundStatus != null) {
          p0.writeInt32(7, tsoundStatus);
       }
       tsoundStatus = this.locksCreenStatus;
       if (tsoundStatus != null) {
          p0.writeInt32(8, tsoundStatus);
       }
       tsoundStatus = this.passDndStatus;
       if (tsoundStatus != null) {
          p0.writeInt32(9, tsoundStatus);
       }
       if (!(this.phoneSoundStatus).equals(str)) {
          p0.writeString(10, this.phoneSoundStatus);
       }
       super.writeTo(p0);
       return;
    }
}
