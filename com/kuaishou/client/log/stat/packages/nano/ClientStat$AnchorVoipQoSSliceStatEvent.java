package com.kuaishou.client.log.stat.packages.nano.ClientStat$AnchorVoipQoSSliceStatEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$AnchorVoipQoSSliceStatEvent extends MessageNano	// class@00079c
{
    public int cid;
    public int lac;
    public String livePushQosInfo;
    public int mcc;
    public int mnc;
    public int rssi;
    public static ClientStat$AnchorVoipQoSSliceStatEvent[] _emptyArray;

    public void ClientStat$AnchorVoipQoSSliceStatEvent(){
       super();
       this.clear();
    }
    public static ClientStat$AnchorVoipQoSSliceStatEvent[] emptyArray(){
       if (ClientStat$AnchorVoipQoSSliceStatEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$AnchorVoipQoSSliceStatEvent._emptyArray == null) {
             ClientStat$AnchorVoipQoSSliceStatEvent[] uAnchorVoipQ = new ClientStat$AnchorVoipQoSSliceStatEvent[0];
             ClientStat$AnchorVoipQoSSliceStatEvent._emptyArray = uAnchorVoipQ;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$AnchorVoipQoSSliceStatEvent._emptyArray;
    }
    public static ClientStat$AnchorVoipQoSSliceStatEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$AnchorVoipQoSSliceStatEvent().mergeFrom(p0);
    }
    public static ClientStat$AnchorVoipQoSSliceStatEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$AnchorVoipQoSSliceStatEvent(), p0);
    }
    public ClientStat$AnchorVoipQoSSliceStatEvent clear(){
       this.livePushQosInfo = "";
       this.rssi = 0;
       this.mcc = 0;
       this.mnc = 0;
       this.lac = 0;
       this.cid = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.livePushQosInfo).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.livePushQosInfo);
       }
       ClientStat$AnchorVoipQoSSliceStatEvent trssi = this.rssi;
       if (trssi != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, trssi);
       }
       trssi = this.mcc;
       if (trssi != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, trssi);
       }
       trssi = this.mnc;
       if (trssi != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, trssi);
       }
       trssi = this.lac;
       if (trssi != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, trssi);
       }
       trssi = this.cid;
       if (trssi != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, trssi);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$AnchorVoipQoSSliceStatEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 40) {
                         if (i != 48) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.cid = p0.readUInt32();
                         }
                      }else {
                         this.lac = p0.readUInt32();
                      }
                   }else {
                      this.mnc = p0.readUInt32();
                   }
                }else {
                   this.mcc = p0.readUInt32();
                }
             }else {
                this.rssi = p0.readUInt32();
             }
          }else {
             this.livePushQosInfo = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.livePushQosInfo).equals("")) {
          p0.writeString(1, this.livePushQosInfo);
       }
       ClientStat$AnchorVoipQoSSliceStatEvent trssi = this.rssi;
       if (trssi != null) {
          p0.writeUInt32(2, trssi);
       }
       trssi = this.mcc;
       if (trssi != null) {
          p0.writeUInt32(3, trssi);
       }
       trssi = this.mnc;
       if (trssi != null) {
          p0.writeUInt32(4, trssi);
       }
       trssi = this.lac;
       if (trssi != null) {
          p0.writeUInt32(5, trssi);
       }
       trssi = this.cid;
       if (trssi != null) {
          p0.writeUInt32(6, trssi);
       }
       super.writeTo(p0);
       return;
    }
}
