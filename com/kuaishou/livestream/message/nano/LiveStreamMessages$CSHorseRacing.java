package com.kuaishou.livestream.message.nano.LiveStreamMessages$CSHorseRacing;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Double;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$CSHorseRacing extends MessageNano	// class@0012c1
{
    public String appVer;
    public int clientId;
    public long clientVisitorId;
    public String deviceId;
    public String horseTag;
    public boolean isAuthor;
    public double latitude;
    public String liveStreamId;
    public String locale;
    public double longitude;
    public String operator;
    public String sClientVisitorId;
    public static LiveStreamMessages$CSHorseRacing[] _emptyArray;

    public void LiveStreamMessages$CSHorseRacing(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$CSHorseRacing[] emptyArray(){
       if (LiveStreamMessages$CSHorseRacing._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$CSHorseRacing._emptyArray == null) {
             LiveStreamMessages$CSHorseRacing[] uCSHorseRaci = new LiveStreamMessages$CSHorseRacing[0];
             LiveStreamMessages$CSHorseRacing._emptyArray = uCSHorseRaci;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$CSHorseRacing._emptyArray;
    }
    public static LiveStreamMessages$CSHorseRacing parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$CSHorseRacing().mergeFrom(p0);
    }
    public static LiveStreamMessages$CSHorseRacing parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$CSHorseRacing(), p0);
    }
    public LiveStreamMessages$CSHorseRacing clear(){
       this.liveStreamId = "";
       this.horseTag = "";
       this.clientVisitorId = 0;
       this.isAuthor = false;
       this.clientId = 0;
       this.deviceId = "";
       this.locale = "";
       this.appVer = "";
       this.latitude = 0;
       this.longitude = 0;
       this.operator = "";
       this.sClientVisitorId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       if (!(this.horseTag).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.horseTag);
       }
       LiveStreamMessages$CSHorseRacing tclientVisit = this.clientVisitorId;
       if (tclientVisit) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tclientVisit);
       }
       LiveStreamMessages$CSHorseRacing tisAuthor = this.isAuthor;
       if (tisAuthor != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, tisAuthor);
       }
       tisAuthor = this.clientId;
       if (tisAuthor != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(10, tisAuthor);
       }
       if (!(this.deviceId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.deviceId);
       }
       if (!(this.locale).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.locale);
       }
       if (!(this.appVer).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(13, this.appVer);
       }
       double d = 0;
       if (Double.doubleToLongBits(this.latitude) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(14, this.latitude);
       }
       if (Double.doubleToLongBits(this.longitude) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(15, this.longitude);
       }
       if (!(this.operator).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(16, this.operator);
       }
       if (!(this.sClientVisitorId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(17, this.sClientVisitorId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$CSHorseRacing mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.liveStreamId = p0.readString();
                break;
              case 18:
                this.horseTag = p0.readString();
                break;
              case 24:
                this.clientVisitorId = p0.readUInt64();
                break;
              case 32:
                this.isAuthor = p0.readBool();
                break;
              case 'P':
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && (i != 6 && (i != 13 && (i != 8 && (i != 9 && (i != 22 && i != 23))))))))) {
                   continue ;
                }else {
                   this.clientId = i;
                }
                break;
              case 'Z':
                this.deviceId = p0.readString();
                break;
              case 'b':
                this.locale = p0.readString();
                break;
              case 'j':
                this.appVer = p0.readString();
                break;
              case 'q':
                this.latitude = p0.readDouble();
                break;
              case 'y':
                this.longitude = p0.readDouble();
                break;
              case 130:
                this.operator = p0.readString();
                break;
              case 138:
                this.sClientVisitorId = p0.readString();
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
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(1, this.liveStreamId);
       }
       if (!(this.horseTag).equals(str)) {
          p0.writeString(2, this.horseTag);
       }
       LiveStreamMessages$CSHorseRacing tclientVisit = this.clientVisitorId;
       if (tclientVisit) {
          p0.writeUInt64(3, tclientVisit);
       }
       LiveStreamMessages$CSHorseRacing tisAuthor = this.isAuthor;
       if (tisAuthor != null) {
          p0.writeBool(4, tisAuthor);
       }
       tisAuthor = this.clientId;
       if (tisAuthor != null) {
          p0.writeInt32(10, tisAuthor);
       }
       if (!(this.deviceId).equals(str)) {
          p0.writeString(11, this.deviceId);
       }
       if (!(this.locale).equals(str)) {
          p0.writeString(12, this.locale);
       }
       if (!(this.appVer).equals(str)) {
          p0.writeString(13, this.appVer);
       }
       double d = 0;
       if (Double.doubleToLongBits(this.latitude) - Double.doubleToLongBits(d)) {
          p0.writeDouble(14, this.latitude);
       }
       if (Double.doubleToLongBits(this.longitude) - Double.doubleToLongBits(d)) {
          p0.writeDouble(15, this.longitude);
       }
       if (!(this.operator).equals(str)) {
          p0.writeString(16, this.operator);
       }
       if (!(this.sClientVisitorId).equals(str)) {
          p0.writeString(17, this.sClientVisitorId);
       }
       super.writeTo(p0);
       return;
    }
}
