package com.kuaishou.client.log.stat.packages.nano.ClientStat$KeyConfigStatEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$KeyConfigStatEvent extends MessageNano	// class@0007dc
{
    public String failReason;
    public int lastVersion;
    public String sessionId;
    public String stage;
    public boolean success;
    public long totalCost;
    public String url;
    public int version;
    public String warmUpResource;
    public static ClientStat$KeyConfigStatEvent[] _emptyArray;

    public void ClientStat$KeyConfigStatEvent(){
       super();
       this.clear();
    }
    public static ClientStat$KeyConfigStatEvent[] emptyArray(){
       if (ClientStat$KeyConfigStatEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$KeyConfigStatEvent._emptyArray == null) {
             ClientStat$KeyConfigStatEvent[] keyConfigSta = new ClientStat$KeyConfigStatEvent[0];
             ClientStat$KeyConfigStatEvent._emptyArray = keyConfigSta;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$KeyConfigStatEvent._emptyArray;
    }
    public static ClientStat$KeyConfigStatEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$KeyConfigStatEvent().mergeFrom(p0);
    }
    public static ClientStat$KeyConfigStatEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$KeyConfigStatEvent(), p0);
    }
    public ClientStat$KeyConfigStatEvent clear(){
       this.lastVersion = 0;
       this.version = 0;
       this.success = false;
       this.failReason = "";
       this.url = "";
       this.warmUpResource = "";
       this.stage = "";
       this.totalCost = 0;
       this.sessionId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$KeyConfigStatEvent tlastVersion = this.lastVersion;
       if (tlastVersion != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tlastVersion);
       }
       tlastVersion = this.version;
       if (tlastVersion != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tlastVersion);
       }
       tlastVersion = this.success;
       if (tlastVersion != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, tlastVersion);
       }
       String str = "";
       if (!(this.failReason).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.failReason);
       }
       if (!(this.url).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.url);
       }
       if (!(this.warmUpResource).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.warmUpResource);
       }
       if (!(this.stage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.stage);
       }
       ClientStat$KeyConfigStatEvent ttotalCost = this.totalCost;
       if (ttotalCost) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, ttotalCost);
       }
       if (!(this.sessionId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.sessionId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$KeyConfigStatEvent mergeFrom(CodedInputByteBufferNano p0){
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
                         if (i != 50) {
                            if (i != 58) {
                               if (i != 64) {
                                  if (i != 74) {
                                     if (!WireFormatNano.parseUnknownField(p0, i)) {
                                        break ;
                                     }
                                  }else {
                                     this.sessionId = p0.readString();
                                  }
                               }else {
                                  this.totalCost = p0.readUInt64();
                               }
                            }else {
                               this.stage = p0.readString();
                            }
                         }else {
                            this.warmUpResource = p0.readString();
                         }
                      }else {
                         this.url = p0.readString();
                      }
                   }else {
                      this.failReason = p0.readString();
                   }
                }else {
                   this.success = p0.readBool();
                }
             }else {
                this.version = p0.readUInt32();
             }
          }else {
             this.lastVersion = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$KeyConfigStatEvent tlastVersion = this.lastVersion;
       if (tlastVersion != null) {
          p0.writeUInt32(1, tlastVersion);
       }
       tlastVersion = this.version;
       if (tlastVersion != null) {
          p0.writeUInt32(2, tlastVersion);
       }
       tlastVersion = this.success;
       if (tlastVersion != null) {
          p0.writeBool(3, tlastVersion);
       }
       String str = "";
       if (!(this.failReason).equals(str)) {
          p0.writeString(4, this.failReason);
       }
       if (!(this.url).equals(str)) {
          p0.writeString(5, this.url);
       }
       if (!(this.warmUpResource).equals(str)) {
          p0.writeString(6, this.warmUpResource);
       }
       if (!(this.stage).equals(str)) {
          p0.writeString(7, this.stage);
       }
       ClientStat$KeyConfigStatEvent ttotalCost = this.totalCost;
       if (ttotalCost) {
          p0.writeUInt64(8, ttotalCost);
       }
       if (!(this.sessionId).equals(str)) {
          p0.writeString(9, this.sessionId);
       }
       super.writeTo(p0);
       return;
    }
}
