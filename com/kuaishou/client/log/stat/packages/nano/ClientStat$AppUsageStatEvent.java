package com.kuaishou.client.log.stat.packages.nano.ClientStat$AppUsageStatEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;

public final class ClientStat$AppUsageStatEvent extends MessageNano	// class@00079f
{
    public long appUseDuration;
    public long appUseTimeStart;
    public String detail;
    public int itemCountScrolled;
    public int screenCountScrolled;
    public int source;
    public ClientEvent$UrlPackage urlPackage;
    public static ClientStat$AppUsageStatEvent[] _emptyArray;

    public void ClientStat$AppUsageStatEvent(){
       super();
       this.clear();
    }
    public static ClientStat$AppUsageStatEvent[] emptyArray(){
       if (ClientStat$AppUsageStatEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$AppUsageStatEvent._emptyArray == null) {
             ClientStat$AppUsageStatEvent[] uAppUsageSta = new ClientStat$AppUsageStatEvent[0];
             ClientStat$AppUsageStatEvent._emptyArray = uAppUsageSta;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$AppUsageStatEvent._emptyArray;
    }
    public static ClientStat$AppUsageStatEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$AppUsageStatEvent().mergeFrom(p0);
    }
    public static ClientStat$AppUsageStatEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$AppUsageStatEvent(), p0);
    }
    public ClientStat$AppUsageStatEvent clear(){
       this.appUseDuration = 0;
       this.itemCountScrolled = 0;
       this.screenCountScrolled = 0;
       this.urlPackage = null;
       this.detail = "";
       this.source = 0;
       this.appUseTimeStart = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$AppUsageStatEvent tappUseDurat = this.appUseDuration;
       int i1 = 0;
       if (tappUseDurat - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tappUseDurat);
       }
       tappUseDurat = this.itemCountScrolled;
       if (tappUseDurat != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tappUseDurat);
       }
       tappUseDurat = this.screenCountScrolled;
       if (tappUseDurat != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tappUseDurat);
       }
       tappUseDurat = this.urlPackage;
       if (tappUseDurat != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, tappUseDurat);
       }
       if (!(this.detail).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.detail);
       }
       tappUseDurat = this.source;
       if (tappUseDurat != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, tappUseDurat);
       }
       tappUseDurat = this.appUseTimeStart;
       if (tappUseDurat - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, tappUseDurat);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$AppUsageStatEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 42) {
                         if (i != 48) {
                            if (i != 56) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.appUseTimeStart = p0.readUInt64();
                            }
                         }else {
                            this.source = p0.readUInt32();
                         }
                      }else {
                         this.detail = p0.readString();
                      }
                   }else if(this.urlPackage == null){
                      this.urlPackage = new ClientEvent$UrlPackage();
                   }
                   p0.readMessage(this.urlPackage);
                }else {
                   this.screenCountScrolled = p0.readUInt32();
                }
             }else {
                this.itemCountScrolled = p0.readUInt32();
             }
          }else {
             this.appUseDuration = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$AppUsageStatEvent tappUseDurat = this.appUseDuration;
       int i = 0;
       if (tappUseDurat - i) {
          p0.writeUInt64(1, tappUseDurat);
       }
       tappUseDurat = this.itemCountScrolled;
       if (tappUseDurat != null) {
          p0.writeUInt32(2, tappUseDurat);
       }
       tappUseDurat = this.screenCountScrolled;
       if (tappUseDurat != null) {
          p0.writeUInt32(3, tappUseDurat);
       }
       tappUseDurat = this.urlPackage;
       if (tappUseDurat != null) {
          p0.writeMessage(4, tappUseDurat);
       }
       if (!(this.detail).equals("")) {
          p0.writeString(5, this.detail);
       }
       tappUseDurat = this.source;
       if (tappUseDurat != null) {
          p0.writeUInt32(6, tappUseDurat);
       }
       tappUseDurat = this.appUseTimeStart;
       if (tappUseDurat - i) {
          p0.writeUInt64(7, tappUseDurat);
       }
       super.writeTo(p0);
       return;
    }
}
