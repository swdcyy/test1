package com.kuaishou.client.log.stat.packages.nano.ClientStat$HeartBeatEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;

public final class ClientStat$HeartBeatEvent extends MessageNano	// class@0007ca
{
    public int appUseDuration;
    public boolean isSwitchBackground;
    public String pageName;
    public int seq;
    public int type;
    public String typeSource;
    public int uploadFrequency;
    public ClientEvent$UrlPackage urlPackage;
    public static ClientStat$HeartBeatEvent[] _emptyArray;

    public void ClientStat$HeartBeatEvent(){
       super();
       this.clear();
    }
    public static ClientStat$HeartBeatEvent[] emptyArray(){
       if (ClientStat$HeartBeatEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$HeartBeatEvent._emptyArray == null) {
             ClientStat$HeartBeatEvent[] heartBeatEve = new ClientStat$HeartBeatEvent[0];
             ClientStat$HeartBeatEvent._emptyArray = heartBeatEve;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$HeartBeatEvent._emptyArray;
    }
    public static ClientStat$HeartBeatEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$HeartBeatEvent().mergeFrom(p0);
    }
    public static ClientStat$HeartBeatEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$HeartBeatEvent(), p0);
    }
    public ClientStat$HeartBeatEvent clear(){
       this.uploadFrequency = 0;
       this.seq = 0;
       this.appUseDuration = 0;
       this.urlPackage = null;
       this.isSwitchBackground = false;
       this.pageName = "";
       this.type = 0;
       this.typeSource = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$HeartBeatEvent tuploadFrequ = this.uploadFrequency;
       if (tuploadFrequ != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tuploadFrequ);
       }
       tuploadFrequ = this.seq;
       if (tuploadFrequ != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tuploadFrequ);
       }
       tuploadFrequ = this.appUseDuration;
       if (tuploadFrequ != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tuploadFrequ);
       }
       tuploadFrequ = this.urlPackage;
       if (tuploadFrequ != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, tuploadFrequ);
       }
       tuploadFrequ = this.isSwitchBackground;
       if (tuploadFrequ != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(5, tuploadFrequ);
       }
       String str = "";
       if (!(this.pageName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.pageName);
       }
       tuploadFrequ = this.type;
       if (tuploadFrequ != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(7, tuploadFrequ);
       }
       if (!(this.typeSource).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.typeSource);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$HeartBeatEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 40) {
                         if (i != 50) {
                            if (i != 56) {
                               if (i != 66) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
                                  }
                               }else {
                                  this.typeSource = p0.readString();
                               }
                            }else {
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
                                   case 9:
                                   case 10:
                                   case 11:
                                   case 12:
                                   case 13:
                                   case 14:
                                   case 15:
                                   case 16:
                                   case 17:
                                   case 18:
                                   case 19:
                                   case 20:
                                   case 21:
                                   case 22:
                                   case 23:
                                   case 24:
                                   case 25:
                                   case 26:
                                   case 27:
                                   case 1:
                                     break;
                                   default:
                               }
                               this.type = i;
                            }
                         }else {
                            this.pageName = p0.readString();
                         }
                      }else {
                         this.isSwitchBackground = p0.readBool();
                      }
                   }else if(this.urlPackage == null){
                      this.urlPackage = new ClientEvent$UrlPackage();
                   }
                   p0.readMessage(this.urlPackage);
                }else {
                   this.appUseDuration = p0.readUInt32();
                }
             }else {
                this.seq = p0.readUInt32();
             }
          }else {
             this.uploadFrequency = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$HeartBeatEvent tuploadFrequ = this.uploadFrequency;
       if (tuploadFrequ != null) {
          p0.writeUInt32(1, tuploadFrequ);
       }
       tuploadFrequ = this.seq;
       if (tuploadFrequ != null) {
          p0.writeUInt32(2, tuploadFrequ);
       }
       tuploadFrequ = this.appUseDuration;
       if (tuploadFrequ != null) {
          p0.writeUInt32(3, tuploadFrequ);
       }
       tuploadFrequ = this.urlPackage;
       if (tuploadFrequ != null) {
          p0.writeMessage(4, tuploadFrequ);
       }
       tuploadFrequ = this.isSwitchBackground;
       if (tuploadFrequ != null) {
          p0.writeBool(5, tuploadFrequ);
       }
       String str = "";
       if (!(this.pageName).equals(str)) {
          p0.writeString(6, this.pageName);
       }
       tuploadFrequ = this.type;
       if (tuploadFrequ != null) {
          p0.writeInt32(7, tuploadFrequ);
       }
       if (!(this.typeSource).equals(str)) {
          p0.writeString(8, this.typeSource);
       }
       super.writeTo(p0);
       return;
    }
}
