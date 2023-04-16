package com.kuaishou.client.log.stat.packages.nano.ClientStat$ImageLoadStatEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Float;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$ImageLoadStatEvent extends MessageNano	// class@0007d8
{
    public int cdnFailCount;
    public int cdnSuccessCount;
    public long cost;
    public String errorMessage;
    public String host;
    public long imageSize;
    public String ip;
    public int loadSource;
    public long queueCost;
    public float ratio;
    public int retryCount;
    public boolean success;
    public int type;
    public String url;
    public String xKslogid;
    public static ClientStat$ImageLoadStatEvent[] _emptyArray;

    public void ClientStat$ImageLoadStatEvent(){
       super();
       this.clear();
    }
    public static ClientStat$ImageLoadStatEvent[] emptyArray(){
       if (ClientStat$ImageLoadStatEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$ImageLoadStatEvent._emptyArray == null) {
             ClientStat$ImageLoadStatEvent[] imageLoadSta = new ClientStat$ImageLoadStatEvent[0];
             ClientStat$ImageLoadStatEvent._emptyArray = imageLoadSta;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$ImageLoadStatEvent._emptyArray;
    }
    public static ClientStat$ImageLoadStatEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$ImageLoadStatEvent().mergeFrom(p0);
    }
    public static ClientStat$ImageLoadStatEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$ImageLoadStatEvent(), p0);
    }
    public ClientStat$ImageLoadStatEvent clear(){
       this.ratio = 0;
       this.type = 0;
       this.loadSource = 0;
       this.success = false;
       this.imageSize = 0;
       this.cost = 0;
       this.queueCost = 0;
       this.url = "";
       this.host = "";
       this.ip = "";
       this.errorMessage = "";
       this.retryCount = 0;
       this.cdnFailCount = 0;
       this.cdnSuccessCount = 0;
       this.xKslogid = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (Float.floatToIntBits(this.ratio) != Float.floatToIntBits(0)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(1, this.ratio);
       }
       ClientStat$ImageLoadStatEvent ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, ttype);
       }
       ttype = this.loadSource;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, ttype);
       }
       ttype = this.success;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, ttype);
       }
       ttype = this.imageSize;
       ClientStat$ImageLoadStatEvent imageLoadSta = null;
       if (ttype - imageLoadSta) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, ttype);
       }
       ttype = this.cost;
       if (ttype - imageLoadSta) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, ttype);
       }
       ttype = this.queueCost;
       if (ttype - imageLoadSta) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, ttype);
       }
       String str = "";
       if (!(this.url).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.url);
       }
       if (!(this.host).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.host);
       }
       if (!(this.ip).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.ip);
       }
       if (!(this.errorMessage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.errorMessage);
       }
       ttype = this.retryCount;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(12, ttype);
       }
       ttype = this.cdnFailCount;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(13, ttype);
       }
       ttype = this.cdnSuccessCount;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(14, ttype);
       }
       if (!(this.xKslogid).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(15, this.xKslogid);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$ImageLoadStatEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 13:
                this.ratio = p0.readFloat();
                break;
              case 16:
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
                    case 1:
                      break;
                    default:
                }
                this.type = i;
                break;
              case 24:
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.loadSource = i;
                }
                break;
              case 32:
                this.success = p0.readBool();
                break;
              case '(':
                this.imageSize = p0.readUInt64();
                break;
              case '0':
                this.cost = p0.readUInt64();
                break;
              case '8':
                this.queueCost = p0.readUInt64();
                break;
              case 'B':
                this.url = p0.readString();
                break;
              case 'J':
                this.host = p0.readString();
                break;
              case 'R':
                this.ip = p0.readString();
                break;
              case 'Z':
                this.errorMessage = p0.readString();
                break;
              case '`':
                this.retryCount = p0.readUInt32();
                break;
              case 'h':
                this.cdnFailCount = p0.readUInt32();
                break;
              case 'p':
                this.cdnSuccessCount = p0.readUInt32();
                break;
              case 'z':
                this.xKslogid = p0.readString();
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
       if (Float.floatToIntBits(this.ratio) != Float.floatToIntBits(0)) {
          p0.writeFloat(1, this.ratio);
       }
       ClientStat$ImageLoadStatEvent ttype = this.type;
       if (ttype != null) {
          p0.writeInt32(2, ttype);
       }
       ttype = this.loadSource;
       if (ttype != null) {
          p0.writeInt32(3, ttype);
       }
       ttype = this.success;
       if (ttype != null) {
          p0.writeBool(4, ttype);
       }
       ttype = this.imageSize;
       ClientStat$ImageLoadStatEvent imageLoadSta = null;
       if (ttype - imageLoadSta) {
          p0.writeUInt64(5, ttype);
       }
       ttype = this.cost;
       if (ttype - imageLoadSta) {
          p0.writeUInt64(6, ttype);
       }
       ttype = this.queueCost;
       if (ttype - imageLoadSta) {
          p0.writeUInt64(7, ttype);
       }
       String str = "";
       if (!(this.url).equals(str)) {
          p0.writeString(8, this.url);
       }
       if (!(this.host).equals(str)) {
          p0.writeString(9, this.host);
       }
       if (!(this.ip).equals(str)) {
          p0.writeString(10, this.ip);
       }
       if (!(this.errorMessage).equals(str)) {
          p0.writeString(11, this.errorMessage);
       }
       ttype = this.retryCount;
       if (ttype != null) {
          p0.writeUInt32(12, ttype);
       }
       ttype = this.cdnFailCount;
       if (ttype != null) {
          p0.writeUInt32(13, ttype);
       }
       ttype = this.cdnSuccessCount;
       if (ttype != null) {
          p0.writeUInt32(14, ttype);
       }
       if (!(this.xKslogid).equals(str)) {
          p0.writeString(15, this.xKslogid);
       }
       super.writeTo(p0);
       return;
    }
}
