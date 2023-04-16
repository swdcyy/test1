package com.kuaishou.client.log.stat.packages.nano.ClientStat$NotificationSettingPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$SwitchAuthorizationStatusPackage;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$ChannelSettingPackage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClientStat$NotificationSettingPackage extends MessageNano	// class@001412
{
    public int alertSetting;
    public int alertStyle;
    public int authorizationStatus;
    public int badgeSetting;
    public int carPlaySetting;
    public ClientStat$ChannelSettingPackage[] channelSetting;
    public int lockScreenSetting;
    public int notificationCenterSetting;
    public int notificationSwitcher;
    public int soundSetting;
    public ClientStat$SwitchAuthorizationStatusPackage[] switchAuthorizationStatus;
    public static ClientStat$NotificationSettingPackage[] _emptyArray;

    public void ClientStat$NotificationSettingPackage(){
       super();
       this.clear();
    }
    public static ClientStat$NotificationSettingPackage[] emptyArray(){
       if (ClientStat$NotificationSettingPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$NotificationSettingPackage._emptyArray == null) {
             ClientStat$NotificationSettingPackage[] notification = new ClientStat$NotificationSettingPackage[0];
             ClientStat$NotificationSettingPackage._emptyArray = notification;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$NotificationSettingPackage._emptyArray;
    }
    public static ClientStat$NotificationSettingPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$NotificationSettingPackage().mergeFrom(p0);
    }
    public static ClientStat$NotificationSettingPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$NotificationSettingPackage(), p0);
    }
    public ClientStat$NotificationSettingPackage clear(){
       this.authorizationStatus = 0;
       this.soundSetting = 0;
       this.badgeSetting = 0;
       this.alertSetting = 0;
       this.notificationCenterSetting = 0;
       this.lockScreenSetting = 0;
       this.carPlaySetting = 0;
       this.alertStyle = 0;
       this.notificationSwitcher = 0;
       this.switchAuthorizationStatus = ClientStat$SwitchAuthorizationStatusPackage.emptyArray();
       this.channelSetting = ClientStat$ChannelSettingPackage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$NotificationSettingPackage tauthorizati = this.authorizationStatus;
       if (tauthorizati != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tauthorizati);
       }
       tauthorizati = this.soundSetting;
       if (tauthorizati != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tauthorizati);
       }
       tauthorizati = this.badgeSetting;
       if (tauthorizati != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tauthorizati);
       }
       tauthorizati = this.alertSetting;
       if (tauthorizati != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tauthorizati);
       }
       tauthorizati = this.notificationCenterSetting;
       if (tauthorizati != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tauthorizati);
       }
       tauthorizati = this.lockScreenSetting;
       if (tauthorizati != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, tauthorizati);
       }
       tauthorizati = this.carPlaySetting;
       if (tauthorizati != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(7, tauthorizati);
       }
       tauthorizati = this.alertStyle;
       if (tauthorizati != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(8, tauthorizati);
       }
       tauthorizati = this.notificationSwitcher;
       if (tauthorizati != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(9, tauthorizati);
       }
       tauthorizati = this.switchAuthorizationStatus;
       int i1 = 0;
       if (tauthorizati != null && tauthorizati.length > 0) {
          int i2 = 0;
          ClientStat$NotificationSettingPackage tswitchAutho = this.switchAuthorizationStatus;
          while (i2 < tswitchAutho.length) {
             object oobject = tswitchAutho[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(10, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tauthorizati = this.channelSetting;
       if (tauthorizati != null && tauthorizati.length > 0) {
          tauthorizati = this.channelSetting;
          while (i1 < tauthorizati.length) {
             object oobject1 = tauthorizati[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(11, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$NotificationSettingPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          ClientStat$NotificationSettingPackage notification = 3;
          int i2 = 2;
          ClientStat$SwitchAuthorizationStatusPackage[] switchAuthor = 1;
          switch (i){
              case 0:
                return this;
              case 8:
                i = p0.readInt32();
                if (i && (i != switchAuthor && (i != i2 && (i != notification && i != 4)))) {
                   continue ;
                }else {
                   this.authorizationStatus = i;
                }
                break;
              case 16:
                i = p0.readInt32();
                if (i && (i != switchAuthor && (i != i2 && i != notification))) {
                   continue ;
                }else {
                   this.soundSetting = i;
                }
                break;
              case 24:
                i = p0.readInt32();
                if (i && (i != switchAuthor && (i != i2 && i != notification))) {
                   continue ;
                }else {
                   this.badgeSetting = i;
                }
                break;
              case 32:
                i = p0.readInt32();
                if (i && (i != switchAuthor && (i != i2 && i != notification))) {
                   continue ;
                }else {
                   this.alertSetting = i;
                }
                break;
              case '(':
                i = p0.readInt32();
                if (i && (i != switchAuthor && (i != i2 && i != notification))) {
                   continue ;
                }else {
                   this.notificationCenterSetting = i;
                }
                break;
              case '0':
                i = p0.readInt32();
                if (i && (i != switchAuthor && (i != i2 && i != notification))) {
                   continue ;
                }else {
                   this.lockScreenSetting = i;
                }
                break;
              case '8':
                i = p0.readInt32();
                if (i && (i != switchAuthor && (i != i2 && i != notification))) {
                   continue ;
                }else {
                   this.carPlaySetting = i;
                }
                break;
              case '@':
                i = p0.readInt32();
                if (i && (i != switchAuthor && (i != i2 && i != notification))) {
                   continue ;
                }else {
                   this.alertStyle = i;
                }
                break;
              case 'H':
                i = p0.readInt32();
                if (i && (i != switchAuthor && (i != i2 && i != notification))) {
                   continue ;
                }else {
                   this.notificationSwitcher = i;
                }
                break;
              case 'R':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 82);
                notification = this.switchAuthorizationStatus;
                i2 = (notification == null)? 0: notification.length;
                i = i + i2;
                switchAuthor = new ClientStat$SwitchAuthorizationStatusPackage[i];
                if (i2) {
                   System.arraycopy(notification, i1, switchAuthor, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   switchAuthor[i2] = new ClientStat$SwitchAuthorizationStatusPackage();
                   p0.readMessage(switchAuthor[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                switchAuthor[i2] = new ClientStat$SwitchAuthorizationStatusPackage();
                p0.readMessage(switchAuthor[i2]);
                this.switchAuthorizationStatus = switchAuthor;
                break;
              case 'Z':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 90);
                notification = this.channelSetting;
                i2 = (notification == null)? 0: notification.length;
                i = i + i2;
                ClientStat$ChannelSettingPackage[] uChannelSett = new ClientStat$ChannelSettingPackage[i];
                if (i2) {
                   System.arraycopy(notification, i1, uChannelSett, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   uChannelSett[i2] = new ClientStat$ChannelSettingPackage();
                   p0.readMessage(uChannelSett[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                uChannelSett[i2] = new ClientStat$ChannelSettingPackage();
                p0.readMessage(uChannelSett[i2]);
                this.channelSetting = uChannelSett;
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
       ClientStat$NotificationSettingPackage tauthorizati = this.authorizationStatus;
       if (tauthorizati != null) {
          p0.writeInt32(1, tauthorizati);
       }
       tauthorizati = this.soundSetting;
       if (tauthorizati != null) {
          p0.writeInt32(2, tauthorizati);
       }
       tauthorizati = this.badgeSetting;
       if (tauthorizati != null) {
          p0.writeInt32(3, tauthorizati);
       }
       tauthorizati = this.alertSetting;
       if (tauthorizati != null) {
          p0.writeInt32(4, tauthorizati);
       }
       tauthorizati = this.notificationCenterSetting;
       if (tauthorizati != null) {
          p0.writeInt32(5, tauthorizati);
       }
       tauthorizati = this.lockScreenSetting;
       if (tauthorizati != null) {
          p0.writeInt32(6, tauthorizati);
       }
       tauthorizati = this.carPlaySetting;
       if (tauthorizati != null) {
          p0.writeInt32(7, tauthorizati);
       }
       tauthorizati = this.alertStyle;
       if (tauthorizati != null) {
          p0.writeInt32(8, tauthorizati);
       }
       tauthorizati = this.notificationSwitcher;
       if (tauthorizati != null) {
          p0.writeInt32(9, tauthorizati);
       }
       tauthorizati = this.switchAuthorizationStatus;
       int i = 0;
       if (tauthorizati != null && tauthorizati.length > 0) {
          int i1 = 0;
          ClientStat$NotificationSettingPackage tswitchAutho = this.switchAuthorizationStatus;
          while (i1 < tswitchAutho.length) {
             object oobject = tswitchAutho[i1];
             if (oobject != null) {
                p0.writeMessage(10, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tauthorizati = this.channelSetting;
       if (tauthorizati != null && tauthorizati.length > 0) {
          tauthorizati = this.channelSetting;
          while (i < tauthorizati.length) {
             object oobject1 = tauthorizati[i];
             if (oobject1 != null) {
                p0.writeMessage(11, oobject1);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
