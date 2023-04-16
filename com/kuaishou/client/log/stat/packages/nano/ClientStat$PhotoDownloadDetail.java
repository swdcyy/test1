package com.kuaishou.client.log.stat.packages.nano.ClientStat$PhotoDownloadDetail;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$PhotoDownloadDetail extends MessageNano	// class@00141a
{
    public int cost;
    public int downloadSize;
    public String errMsg;
    public int fileType;
    public String host;
    public int httpCode;
    public int loadSource;
    public String response;
    public String serverIp;
    public long startTimestamp;
    public int status;
    public String url;
    public static ClientStat$PhotoDownloadDetail[] _emptyArray;

    public void ClientStat$PhotoDownloadDetail(){
       super();
       this.clear();
    }
    public static ClientStat$PhotoDownloadDetail[] emptyArray(){
       if (ClientStat$PhotoDownloadDetail._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$PhotoDownloadDetail._emptyArray == null) {
             ClientStat$PhotoDownloadDetail[] photoDownloa = new ClientStat$PhotoDownloadDetail[0];
             ClientStat$PhotoDownloadDetail._emptyArray = photoDownloa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$PhotoDownloadDetail._emptyArray;
    }
    public static ClientStat$PhotoDownloadDetail parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$PhotoDownloadDetail().mergeFrom(p0);
    }
    public static ClientStat$PhotoDownloadDetail parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$PhotoDownloadDetail(), p0);
    }
    public ClientStat$PhotoDownloadDetail clear(){
       this.fileType = 0;
       this.url = "";
       this.host = "";
       this.serverIp = "";
       this.cost = 0;
       this.httpCode = 0;
       this.downloadSize = 0;
       this.status = 0;
       this.errMsg = "";
       this.response = "";
       this.startTimestamp = 0;
       this.loadSource = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$PhotoDownloadDetail tfileType = this.fileType;
       if (tfileType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tfileType);
       }
       String str = "";
       if (!(this.url).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.url);
       }
       if (!(this.host).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.host);
       }
       if (!(this.serverIp).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.serverIp);
       }
       tfileType = this.cost;
       if (tfileType != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, tfileType);
       }
       tfileType = this.httpCode;
       if (tfileType != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, tfileType);
       }
       tfileType = this.downloadSize;
       if (tfileType != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, tfileType);
       }
       tfileType = this.status;
       if (tfileType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(8, tfileType);
       }
       if (!(this.errMsg).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.errMsg);
       }
       if (!(this.response).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.response);
       }
       tfileType = this.startTimestamp;
       if (tfileType) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(11, tfileType);
       }
       tfileType = this.loadSource;
       if (tfileType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(12, tfileType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$PhotoDownloadDetail mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          int i1 = 2;
          switch (i){
              case 0:
                return this;
              case 8:
                i = p0.readInt32();
                if (i && (i != 1 && i != i1)) {
                   continue ;
                }else {
                   this.fileType = i;
                }
                break;
              case 18:
                this.url = p0.readString();
                break;
              case 26:
                this.host = p0.readString();
                break;
              case '"':
                this.serverIp = p0.readString();
                break;
              case '(':
                this.cost = p0.readUInt32();
                break;
              case '0':
                this.httpCode = p0.readUInt32();
                break;
              case '8':
                this.downloadSize = p0.readUInt32();
                break;
              case '@':
                i = p0.readInt32();
                if (i && (i != 1 && (i != i1 && i != 3))) {
                   continue ;
                }else {
                   this.status = i;
                }
                break;
              case 'J':
                this.errMsg = p0.readString();
                break;
              case 'R':
                this.response = p0.readString();
                break;
              case 'X':
                this.startTimestamp = p0.readUInt64();
                break;
              case '`':
                i = p0.readInt32();
                if (i && (i != 1 && i != i1)) {
                   continue ;
                }else {
                   this.loadSource = i;
                }
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
       ClientStat$PhotoDownloadDetail tfileType = this.fileType;
       if (tfileType != null) {
          p0.writeInt32(1, tfileType);
       }
       String str = "";
       if (!(this.url).equals(str)) {
          p0.writeString(2, this.url);
       }
       if (!(this.host).equals(str)) {
          p0.writeString(3, this.host);
       }
       if (!(this.serverIp).equals(str)) {
          p0.writeString(4, this.serverIp);
       }
       tfileType = this.cost;
       if (tfileType != null) {
          p0.writeUInt32(5, tfileType);
       }
       tfileType = this.httpCode;
       if (tfileType != null) {
          p0.writeUInt32(6, tfileType);
       }
       tfileType = this.downloadSize;
       if (tfileType != null) {
          p0.writeUInt32(7, tfileType);
       }
       tfileType = this.status;
       if (tfileType != null) {
          p0.writeInt32(8, tfileType);
       }
       if (!(this.errMsg).equals(str)) {
          p0.writeString(9, this.errMsg);
       }
       if (!(this.response).equals(str)) {
          p0.writeString(10, this.response);
       }
       tfileType = this.startTimestamp;
       if (tfileType) {
          p0.writeUInt64(11, tfileType);
       }
       tfileType = this.loadSource;
       if (tfileType != null) {
          p0.writeInt32(12, tfileType);
       }
       super.writeTo(p0);
       return;
    }
}
