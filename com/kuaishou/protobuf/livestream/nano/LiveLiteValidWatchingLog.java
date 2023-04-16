package com.kuaishou.protobuf.livestream.nano.LiveLiteValidWatchingLog;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Map;
import com.google.protobuf.nano.MapFactories$MapFactory;
import com.google.protobuf.nano.MapFactories;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveLiteValidWatchingLog extends MessageNano	// class@000ca2
{
    public int appType;
    public String appVer;
    public long authorId;
    public int clientId;
    public String deviceId;
    public String expTag;
    public Map extraData;
    public String id;
    public long liveStreamId;
    public long logTime;
    public String photoPage;
    public int platform;
    public int product;
    public long rawLogGenTime;
    public String serverExpTag;
    public int source;
    public String stid;
    public long visitorId;
    public static LiveLiteValidWatchingLog[] _emptyArray;

    public void LiveLiteValidWatchingLog(){
       super();
       this.clear();
    }
    public static LiveLiteValidWatchingLog[] emptyArray(){
       if (LiveLiteValidWatchingLog._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveLiteValidWatchingLog._emptyArray == null) {
             LiveLiteValidWatchingLog[] liveLiteVali = new LiveLiteValidWatchingLog[0];
             LiveLiteValidWatchingLog._emptyArray = liveLiteVali;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveLiteValidWatchingLog._emptyArray;
    }
    public static LiveLiteValidWatchingLog parseFrom(CodedInputByteBufferNano p0){
       return new LiveLiteValidWatchingLog().mergeFrom(p0);
    }
    public static LiveLiteValidWatchingLog parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveLiteValidWatchingLog(), p0);
    }
    public LiveLiteValidWatchingLog clear(){
       this.id = "";
       this.authorId = 0;
       this.liveStreamId = 0;
       this.visitorId = 0;
       this.deviceId = "";
       this.clientId = 0;
       this.appVer = "";
       this.product = 0;
       this.appType = 0;
       this.platform = 0;
       this.logTime = 0;
       this.rawLogGenTime = 0;
       this.photoPage = "";
       this.expTag = "";
       this.serverExpTag = "";
       this.stid = "";
       this.extraData = null;
       this.source = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       LiveLiteValidWatchingLog tauthorId = this.authorId;
       if (tauthorId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tauthorId);
       }
       tauthorId = this.liveStreamId;
       if (tauthorId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tauthorId);
       }
       tauthorId = this.visitorId;
       if (tauthorId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tauthorId);
       }
       if (!(this.deviceId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.deviceId);
       }
       LiveLiteValidWatchingLog tclientId = this.clientId;
       if (tclientId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, tclientId);
       }
       if (!(this.appVer).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.appVer);
       }
       tclientId = this.product;
       if (tclientId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(8, tclientId);
       }
       tclientId = this.appType;
       if (tclientId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(9, tclientId);
       }
       tclientId = this.platform;
       if (tclientId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(10, tclientId);
       }
       LiveLiteValidWatchingLog tlogTime = this.logTime;
       if (tlogTime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(11, tlogTime);
       }
       tlogTime = this.rawLogGenTime;
       if (tlogTime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(12, tlogTime);
       }
       if (!(this.photoPage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(13, this.photoPage);
       }
       if (!(this.expTag).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(14, this.expTag);
       }
       if (!(this.serverExpTag).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(15, this.serverExpTag);
       }
       if (!(this.stid).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(16, this.stid);
       }
       tclientId = this.extraData;
       if (tclientId != null) {
          i = i + InternalNano.computeMapFieldSize(tclientId, 17, 9, 9);
       }
       tclientId = this.source;
       if (tclientId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(18, tclientId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveLiteValidWatchingLog mergeFrom(CodedInputByteBufferNano p0){
       MapFactories$MapFactory mapFactory = MapFactories.getMapFactory();
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.id = p0.readString();
                break;
              case 16:
                this.authorId = p0.readUInt64();
                break;
              case 24:
                this.liveStreamId = p0.readUInt64();
                break;
              case 32:
                this.visitorId = p0.readUInt64();
                break;
              case '*':
                this.deviceId = p0.readString();
                break;
              case '0':
                this.clientId = p0.readUInt32();
                break;
              case ':':
                this.appVer = p0.readString();
                break;
              case '@':
                this.product = p0.readUInt32();
                break;
              case 'H':
                this.appType = p0.readUInt32();
                break;
              case 'P':
                this.platform = p0.readUInt32();
                break;
              case 'X':
                this.logTime = p0.readUInt64();
                break;
              case '`':
                this.rawLogGenTime = p0.readUInt64();
                break;
              case 'j':
                this.photoPage = p0.readString();
                break;
              case 'r':
                this.expTag = p0.readString();
                break;
              case 'z':
                this.serverExpTag = p0.readString();
                break;
              case 130:
                this.stid = p0.readString();
                break;
              case 138:
                this.extraData = InternalNano.mergeMapEntry(p0, this.extraData, mapFactory, 9, 9, null, 10, 18);
                break;
              case 144:
                this.source = p0.readUInt32();
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
       if (!(this.id).equals(str)) {
          p0.writeString(1, this.id);
       }
       LiveLiteValidWatchingLog tauthorId = this.authorId;
       if (tauthorId) {
          p0.writeUInt64(2, tauthorId);
       }
       tauthorId = this.liveStreamId;
       if (tauthorId) {
          p0.writeUInt64(3, tauthorId);
       }
       tauthorId = this.visitorId;
       if (tauthorId) {
          p0.writeUInt64(4, tauthorId);
       }
       if (!(this.deviceId).equals(str)) {
          p0.writeString(5, this.deviceId);
       }
       LiveLiteValidWatchingLog tclientId = this.clientId;
       if (tclientId != null) {
          p0.writeUInt32(6, tclientId);
       }
       if (!(this.appVer).equals(str)) {
          p0.writeString(7, this.appVer);
       }
       tclientId = this.product;
       if (tclientId != null) {
          p0.writeUInt32(8, tclientId);
       }
       tclientId = this.appType;
       if (tclientId != null) {
          p0.writeUInt32(9, tclientId);
       }
       tclientId = this.platform;
       if (tclientId != null) {
          p0.writeUInt32(10, tclientId);
       }
       LiveLiteValidWatchingLog tlogTime = this.logTime;
       if (tlogTime) {
          p0.writeUInt64(11, tlogTime);
       }
       tlogTime = this.rawLogGenTime;
       if (tlogTime) {
          p0.writeUInt64(12, tlogTime);
       }
       if (!(this.photoPage).equals(str)) {
          p0.writeString(13, this.photoPage);
       }
       if (!(this.expTag).equals(str)) {
          p0.writeString(14, this.expTag);
       }
       if (!(this.serverExpTag).equals(str)) {
          p0.writeString(15, this.serverExpTag);
       }
       if (!(this.stid).equals(str)) {
          p0.writeString(16, this.stid);
       }
       tclientId = this.extraData;
       if (tclientId != null) {
          InternalNano.serializeMapField(p0, tclientId, 17, 9, 9);
       }
       tclientId = this.source;
       if (tclientId != null) {
          p0.writeUInt32(18, tclientId);
       }
       super.writeTo(p0);
       return;
    }
}
