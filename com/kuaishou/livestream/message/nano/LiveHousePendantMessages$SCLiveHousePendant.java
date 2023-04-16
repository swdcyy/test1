package com.kuaishou.livestream.message.nano.LiveHousePendantMessages$SCLiveHousePendant;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveHousePendantMessages$SCLiveHousePendant extends MessageNano	// class@0011c9
{
    public String actionUrl;
    public String backgroundUrl;
    public boolean enableShow;
    public long endTimeMs;
    public long serverTime;
    public String title;
    public static LiveHousePendantMessages$SCLiveHousePendant[] _emptyArray;

    public void LiveHousePendantMessages$SCLiveHousePendant(){
       super();
       this.clear();
    }
    public static LiveHousePendantMessages$SCLiveHousePendant[] emptyArray(){
       if (LiveHousePendantMessages$SCLiveHousePendant._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveHousePendantMessages$SCLiveHousePendant._emptyArray == null) {
             LiveHousePendantMessages$SCLiveHousePendant[] sCLiveHouseP = new LiveHousePendantMessages$SCLiveHousePendant[0];
             LiveHousePendantMessages$SCLiveHousePendant._emptyArray = sCLiveHouseP;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveHousePendantMessages$SCLiveHousePendant._emptyArray;
    }
    public static LiveHousePendantMessages$SCLiveHousePendant parseFrom(CodedInputByteBufferNano p0){
       return new LiveHousePendantMessages$SCLiveHousePendant().mergeFrom(p0);
    }
    public static LiveHousePendantMessages$SCLiveHousePendant parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveHousePendantMessages$SCLiveHousePendant(), p0);
    }
    public LiveHousePendantMessages$SCLiveHousePendant clear(){
       this.title = "";
       this.backgroundUrl = "";
       this.enableShow = false;
       this.endTimeMs = 0;
       this.actionUrl = "";
       this.serverTime = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.title).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.title);
       }
       if (!(this.backgroundUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.backgroundUrl);
       }
       LiveHousePendantMessages$SCLiveHousePendant tenableShow = this.enableShow;
       if (tenableShow != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, tenableShow);
       }
       LiveHousePendantMessages$SCLiveHousePendant tendTimeMs = this.endTimeMs;
       if (tendTimeMs) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tendTimeMs);
       }
       if (!(this.actionUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.actionUrl);
       }
       tenableShow = this.serverTime;
       if (tenableShow) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tenableShow);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveHousePendantMessages$SCLiveHousePendant mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 42) {
                         if (i != 48) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.serverTime = p0.readUInt64();
                         }
                      }else {
                         this.actionUrl = p0.readString();
                      }
                   }else {
                      this.endTimeMs = p0.readUInt64();
                   }
                }else {
                   this.enableShow = p0.readBool();
                }
             }else {
                this.backgroundUrl = p0.readString();
             }
          }else {
             this.title = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.title).equals(str)) {
          p0.writeString(1, this.title);
       }
       if (!(this.backgroundUrl).equals(str)) {
          p0.writeString(2, this.backgroundUrl);
       }
       LiveHousePendantMessages$SCLiveHousePendant tenableShow = this.enableShow;
       if (tenableShow != null) {
          p0.writeBool(3, tenableShow);
       }
       LiveHousePendantMessages$SCLiveHousePendant tendTimeMs = this.endTimeMs;
       if (tendTimeMs) {
          p0.writeUInt64(4, tendTimeMs);
       }
       if (!(this.actionUrl).equals(str)) {
          p0.writeString(5, this.actionUrl);
       }
       tenableShow = this.serverTime;
       if (tenableShow) {
          p0.writeUInt64(6, tenableShow);
       }
       super.writeTo(p0);
       return;
    }
}
