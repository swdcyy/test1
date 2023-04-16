package com.kuaishou.client.log.stat.packages.nano.ClientStat$PhotoDownloadStatEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$PhotoDownloadDetail;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class ClientStat$PhotoDownloadStatEvent extends MessageNano	// class@0007f9
{
    public ClientStat$PhotoDownloadDetail apiDetail;
    public int downloadCost;
    public int duration;
    public int encodeBitrate;
    public int encodeCost;
    public String encodeErrMsg;
    public int encodeHeight;
    public String encodeInfo;
    public long encodeStartTimestamp;
    public int encodeStatus;
    public int encodeWidth;
    public int failReason;
    public ClientStat$PhotoDownloadDetail[] fileDownloadDetail;
    public long photoId;
    public int photoType;
    public long startTimestamp;
    public int status;
    public int storeCost;
    public String storeErrMsg;
    public String storePath;
    public long storeStartTimestamp;
    public int storeStatus;
    public int totalCost;
    public int watermarkGenCost;
    public String watermarkGenErrMsg;
    public long watermarkGenStartTimestamp;
    public int watermarkGenStatus;
    public static ClientStat$PhotoDownloadStatEvent[] _emptyArray;

    public void ClientStat$PhotoDownloadStatEvent(){
       super();
       this.clear();
    }
    public static ClientStat$PhotoDownloadStatEvent[] emptyArray(){
       if (ClientStat$PhotoDownloadStatEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$PhotoDownloadStatEvent._emptyArray == null) {
             ClientStat$PhotoDownloadStatEvent[] photoDownloa = new ClientStat$PhotoDownloadStatEvent[0];
             ClientStat$PhotoDownloadStatEvent._emptyArray = photoDownloa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$PhotoDownloadStatEvent._emptyArray;
    }
    public static ClientStat$PhotoDownloadStatEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$PhotoDownloadStatEvent().mergeFrom(p0);
    }
    public static ClientStat$PhotoDownloadStatEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$PhotoDownloadStatEvent(), p0);
    }
    public ClientStat$PhotoDownloadStatEvent clear(){
       this.startTimestamp = 0;
       this.photoType = 0;
       this.totalCost = 0;
       this.status = 0;
       this.failReason = 0;
       this.apiDetail = null;
       this.fileDownloadDetail = ClientStat$PhotoDownloadDetail.emptyArray();
       this.downloadCost = 0;
       this.watermarkGenStartTimestamp = 0;
       this.watermarkGenCost = 0;
       this.watermarkGenStatus = 0;
       this.watermarkGenErrMsg = "";
       this.encodeStartTimestamp = 0;
       this.encodeHeight = 0;
       this.encodeWidth = 0;
       this.encodeBitrate = 0;
       this.encodeCost = 0;
       this.duration = 0;
       this.encodeStatus = 0;
       this.encodeErrMsg = "";
       this.storeStartTimestamp = 0;
       this.storePath = "";
       this.storeStatus = 0;
       this.storeCost = 0;
       this.storeErrMsg = "";
       this.photoId = 0;
       this.encodeInfo = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$PhotoDownloadStatEvent tstartTimest = this.startTimestamp;
       if (tstartTimest) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tstartTimest);
       }
       tstartTimest = this.photoType;
       if (tstartTimest != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tstartTimest);
       }
       tstartTimest = this.totalCost;
       if (tstartTimest != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tstartTimest);
       }
       tstartTimest = this.status;
       if (tstartTimest != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tstartTimest);
       }
       tstartTimest = this.failReason;
       if (tstartTimest != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tstartTimest);
       }
       tstartTimest = this.apiDetail;
       if (tstartTimest != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(6, tstartTimest);
       }
       tstartTimest = this.fileDownloadDetail;
       if (tstartTimest != null && tstartTimest.length > 0) {
          int i1 = 0;
          ClientStat$PhotoDownloadStatEvent tfileDownloa = this.fileDownloadDetail;
          while (i1 < tfileDownloa.length) {
             object oobject = tfileDownloa[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(7, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tstartTimest = this.downloadCost;
       if (tstartTimest != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(8, tstartTimest);
       }
       tstartTimest = this.watermarkGenStartTimestamp;
       if (tstartTimest) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(9, tstartTimest);
       }
       tstartTimest = this.watermarkGenCost;
       if (tstartTimest != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(10, tstartTimest);
       }
       tstartTimest = this.watermarkGenStatus;
       if (tstartTimest != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(11, tstartTimest);
       }
       String str = "";
       if (!(this.watermarkGenErrMsg).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.watermarkGenErrMsg);
       }
       ClientStat$PhotoDownloadStatEvent tencodeStart = this.encodeStartTimestamp;
       if (tencodeStart) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(13, tencodeStart);
       }
       tstartTimest = this.encodeHeight;
       if (tstartTimest != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(14, tstartTimest);
       }
       tstartTimest = this.encodeWidth;
       if (tstartTimest != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(15, tstartTimest);
       }
       tstartTimest = this.encodeBitrate;
       if (tstartTimest != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(16, tstartTimest);
       }
       tstartTimest = this.encodeCost;
       if (tstartTimest != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(17, tstartTimest);
       }
       tstartTimest = this.duration;
       if (tstartTimest != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(18, tstartTimest);
       }
       tstartTimest = this.encodeStatus;
       if (tstartTimest != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(19, tstartTimest);
       }
       if (!(this.encodeErrMsg).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(20, this.encodeErrMsg);
       }
       tencodeStart = this.storeStartTimestamp;
       if (tencodeStart) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(21, tencodeStart);
       }
       if (!(this.storePath).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(22, this.storePath);
       }
       tstartTimest = this.storeStatus;
       if (tstartTimest != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(23, tstartTimest);
       }
       tstartTimest = this.storeCost;
       if (tstartTimest != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(24, tstartTimest);
       }
       if (!(this.storeErrMsg).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(25, this.storeErrMsg);
       }
       tencodeStart = this.photoId;
       if (tencodeStart) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(26, tencodeStart);
       }
       if (!(this.encodeInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(27, this.encodeInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$PhotoDownloadStatEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          ClientStat$PhotoDownloadStatEvent photoDownloa = 4;
          int i1 = 3;
          int i2 = 2;
          ClientStat$PhotoDownloadDetail[] photoDownloa1 = 1;
          switch (i){
              case 0:
                return this;
              case 8:
                this.startTimestamp = p0.readUInt64();
                break;
              case 16:
                i = p0.readInt32();
                if (i && (i != photoDownloa1 && (i != i2 && (i != i1 && i != photoDownloa)))) {
                   continue ;
                }else {
                   this.photoType = i;
                }
                break;
              case 24:
                this.totalCost = p0.readUInt32();
                break;
              case 32:
                i = p0.readInt32();
                if (i && (i != photoDownloa1 && (i != i2 && i != i1))) {
                   continue ;
                }else {
                   this.status = i;
                }
                break;
              case '(':
                i = p0.readInt32();
                if (i && (i != photoDownloa1 && (i != i2 && (i != i1 && i != photoDownloa)))) {
                   continue ;
                }else {
                   this.failReason = i;
                }
                break;
              case '2':
                if (this.apiDetail == null) {
                   this.apiDetail = new ClientStat$PhotoDownloadDetail();
                }
                p0.readMessage(this.apiDetail);
                break;
              case ':':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 58);
                photoDownloa = this.fileDownloadDetail;
                i1 = 0;
                i2 = (photoDownloa == null)? 0: photoDownloa.length;
                i = i + i2;
                photoDownloa1 = new ClientStat$PhotoDownloadDetail[i];
                if (i2) {
                   System.arraycopy(photoDownloa, i1, photoDownloa1, i1, i2);
                }
                int i3 = i - 1;
                while (i2 < i3) {
                   photoDownloa1[i2] = new ClientStat$PhotoDownloadDetail();
                   p0.readMessage(photoDownloa1[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                photoDownloa1[i2] = new ClientStat$PhotoDownloadDetail();
                p0.readMessage(photoDownloa1[i2]);
                this.fileDownloadDetail = photoDownloa1;
                break;
              case '@':
                this.downloadCost = p0.readUInt32();
                break;
              case 'H':
                this.watermarkGenStartTimestamp = p0.readUInt64();
                break;
              case 'P':
                this.watermarkGenCost = p0.readUInt32();
                break;
              case 'X':
                i = p0.readInt32();
                if (i && (i != photoDownloa1 && (i != i2 && i != i1))) {
                   continue ;
                }else {
                   this.watermarkGenStatus = i;
                }
                break;
              case 'b':
                this.watermarkGenErrMsg = p0.readString();
                break;
              case 'h':
                this.encodeStartTimestamp = p0.readUInt64();
                break;
              case 'p':
                this.encodeHeight = p0.readUInt32();
                break;
              case 'x':
                this.encodeWidth = p0.readUInt32();
                break;
              case 128:
                this.encodeBitrate = p0.readUInt32();
                break;
              case 136:
                this.encodeCost = p0.readUInt32();
                break;
              case 144:
                this.duration = p0.readUInt32();
                break;
              case 152:
                i = p0.readInt32();
                if (i && (i != photoDownloa1 && (i != i2 && i != i1))) {
                   continue ;
                }else {
                   this.encodeStatus = i;
                }
                break;
              case 162:
                this.encodeErrMsg = p0.readString();
                break;
              case 168:
                this.storeStartTimestamp = p0.readUInt64();
                break;
              case 178:
                this.storePath = p0.readString();
                break;
              case 184:
                i = p0.readInt32();
                if (i && (i != photoDownloa1 && (i != i2 && i != i1))) {
                   continue ;
                }else {
                   this.storeStatus = i;
                }
                break;
              case 192:
                this.storeCost = p0.readUInt32();
                break;
              case 202:
                this.storeErrMsg = p0.readString();
                break;
              case 208:
                this.photoId = p0.readUInt64();
                break;
              case 218:
                this.encodeInfo = p0.readString();
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
       ClientStat$PhotoDownloadStatEvent tstartTimest = this.startTimestamp;
       if (tstartTimest) {
          p0.writeUInt64(1, tstartTimest);
       }
       tstartTimest = this.photoType;
       if (tstartTimest != null) {
          p0.writeInt32(2, tstartTimest);
       }
       tstartTimest = this.totalCost;
       if (tstartTimest != null) {
          p0.writeUInt32(3, tstartTimest);
       }
       tstartTimest = this.status;
       if (tstartTimest != null) {
          p0.writeInt32(4, tstartTimest);
       }
       tstartTimest = this.failReason;
       if (tstartTimest != null) {
          p0.writeInt32(5, tstartTimest);
       }
       tstartTimest = this.apiDetail;
       if (tstartTimest != null) {
          p0.writeMessage(6, tstartTimest);
       }
       tstartTimest = this.fileDownloadDetail;
       if (tstartTimest != null && tstartTimest.length > 0) {
          int i = 0;
          ClientStat$PhotoDownloadStatEvent tfileDownloa = this.fileDownloadDetail;
          while (i < tfileDownloa.length) {
             object oobject = tfileDownloa[i];
             if (oobject != null) {
                p0.writeMessage(7, oobject);
             }
             i = i + 1;
          }
       }
       tstartTimest = this.downloadCost;
       if (tstartTimest != null) {
          p0.writeUInt32(8, tstartTimest);
       }
       tstartTimest = this.watermarkGenStartTimestamp;
       if (tstartTimest) {
          p0.writeUInt64(9, tstartTimest);
       }
       tstartTimest = this.watermarkGenCost;
       if (tstartTimest != null) {
          p0.writeUInt32(10, tstartTimest);
       }
       tstartTimest = this.watermarkGenStatus;
       if (tstartTimest != null) {
          p0.writeInt32(11, tstartTimest);
       }
       String str = "";
       if (!(this.watermarkGenErrMsg).equals(str)) {
          p0.writeString(12, this.watermarkGenErrMsg);
       }
       ClientStat$PhotoDownloadStatEvent tencodeStart = this.encodeStartTimestamp;
       if (tencodeStart) {
          p0.writeUInt64(13, tencodeStart);
       }
       tstartTimest = this.encodeHeight;
       if (tstartTimest != null) {
          p0.writeUInt32(14, tstartTimest);
       }
       tstartTimest = this.encodeWidth;
       if (tstartTimest != null) {
          p0.writeUInt32(15, tstartTimest);
       }
       tstartTimest = this.encodeBitrate;
       if (tstartTimest != null) {
          p0.writeUInt32(16, tstartTimest);
       }
       tstartTimest = this.encodeCost;
       if (tstartTimest != null) {
          p0.writeUInt32(17, tstartTimest);
       }
       tstartTimest = this.duration;
       if (tstartTimest != null) {
          p0.writeUInt32(18, tstartTimest);
       }
       tstartTimest = this.encodeStatus;
       if (tstartTimest != null) {
          p0.writeInt32(19, tstartTimest);
       }
       if (!(this.encodeErrMsg).equals(str)) {
          p0.writeString(20, this.encodeErrMsg);
       }
       tencodeStart = this.storeStartTimestamp;
       if (tencodeStart) {
          p0.writeUInt64(21, tencodeStart);
       }
       if (!(this.storePath).equals(str)) {
          p0.writeString(22, this.storePath);
       }
       tstartTimest = this.storeStatus;
       if (tstartTimest != null) {
          p0.writeInt32(23, tstartTimest);
       }
       tstartTimest = this.storeCost;
       if (tstartTimest != null) {
          p0.writeUInt32(24, tstartTimest);
       }
       if (!(this.storeErrMsg).equals(str)) {
          p0.writeString(25, this.storeErrMsg);
       }
       tencodeStart = this.photoId;
       if (tencodeStart) {
          p0.writeUInt64(26, tencodeStart);
       }
       if (!(this.encodeInfo).equals(str)) {
          p0.writeString(27, this.encodeInfo);
       }
       super.writeTo(p0);
       return;
    }
}
