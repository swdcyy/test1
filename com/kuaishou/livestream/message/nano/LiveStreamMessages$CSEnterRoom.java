package com.kuaishou.livestream.message.nano.LiveStreamMessages$CSEnterRoom;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$CSEnterRoom extends MessageNano	// class@0012c0
{
    public int appType;
    public String appVer;
    public String attach;
    public long authorId;
    public String broadcastGiftToken;
    public String channel;
    public int clientId;
    public String deviceId;
    public String expTag;
    public boolean firstEnter;
    public boolean isAuthor;
    public boolean isCustodian;
    public boolean isLite;
    public boolean isSimpleLive;
    public String kpf;
    public String kpn;
    public int lastErrorCode;
    public String liveStreamId;
    public String locale;
    public String location;
    public String operator;
    public String phoneModel;
    public int reconnectCount;
    public String redPackId;
    public String serviceToken;
    public int sourceType;
    public String sys;
    public String sysVer;
    public String token;
    public static LiveStreamMessages$CSEnterRoom[] _emptyArray;

    public void LiveStreamMessages$CSEnterRoom(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$CSEnterRoom[] emptyArray(){
       if (LiveStreamMessages$CSEnterRoom._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$CSEnterRoom._emptyArray == null) {
             LiveStreamMessages$CSEnterRoom[] uCSEnterRoom = new LiveStreamMessages$CSEnterRoom[0];
             LiveStreamMessages$CSEnterRoom._emptyArray = uCSEnterRoom;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$CSEnterRoom._emptyArray;
    }
    public static LiveStreamMessages$CSEnterRoom parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$CSEnterRoom().mergeFrom(p0);
    }
    public static LiveStreamMessages$CSEnterRoom parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$CSEnterRoom(), p0);
    }
    public LiveStreamMessages$CSEnterRoom clear(){
       this.token = "";
       this.clientId = 0;
       this.deviceId = "";
       this.liveStreamId = "";
       this.isAuthor = false;
       this.reconnectCount = 0;
       this.lastErrorCode = 0;
       this.locale = "";
       this.appVer = "";
       this.location = "";
       this.operator = "";
       this.firstEnter = false;
       this.expTag = "";
       this.attach = "";
       this.appType = 0;
       this.sourceType = 0;
       this.broadcastGiftToken = "";
       this.serviceToken = "";
       this.redPackId = "";
       this.authorId = 0;
       this.kpn = "";
       this.kpf = "";
       this.isCustodian = false;
       this.sysVer = "";
       this.sys = "";
       this.phoneModel = "";
       this.channel = "";
       this.isSimpleLive = false;
       this.isLite = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.token).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.token);
       }
       LiveStreamMessages$CSEnterRoom tclientId = this.clientId;
       if (tclientId != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tclientId);
       }
       if (!(this.deviceId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.deviceId);
       }
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.liveStreamId);
       }
       tclientId = this.isAuthor;
       if (tclientId != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(5, tclientId);
       }
       tclientId = this.reconnectCount;
       if (tclientId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, tclientId);
       }
       tclientId = this.lastErrorCode;
       if (tclientId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, tclientId);
       }
       if (!(this.locale).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.locale);
       }
       if (!(this.appVer).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.appVer);
       }
       if (!(this.location).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.location);
       }
       if (!(this.operator).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.operator);
       }
       tclientId = this.firstEnter;
       if (tclientId != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(12, tclientId);
       }
       if (!(this.expTag).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(13, this.expTag);
       }
       if (!(this.attach).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(14, this.attach);
       }
       tclientId = this.appType;
       if (tclientId != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(15, tclientId);
       }
       tclientId = this.sourceType;
       if (tclientId != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(16, tclientId);
       }
       if (!(this.broadcastGiftToken).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(17, this.broadcastGiftToken);
       }
       if (!(this.serviceToken).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(18, this.serviceToken);
       }
       if (!(this.redPackId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(19, this.redPackId);
       }
       LiveStreamMessages$CSEnterRoom tauthorId = this.authorId;
       if (tauthorId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(20, tauthorId);
       }
       if (!(this.kpn).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(21, this.kpn);
       }
       if (!(this.kpf).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(22, this.kpf);
       }
       tclientId = this.isCustodian;
       if (tclientId != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(23, tclientId);
       }
       if (!(this.sysVer).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(24, this.sysVer);
       }
       if (!(this.sys).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(25, this.sys);
       }
       if (!(this.phoneModel).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(26, this.phoneModel);
       }
       if (!(this.channel).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(27, this.channel);
       }
       tclientId = this.isSimpleLive;
       if (tclientId != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(28, tclientId);
       }
       tclientId = this.isLite;
       if (tclientId != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(29, tclientId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$CSEnterRoom mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          int i1 = 22;
          int i2 = 9;
          int i3 = 2;
          switch (i){
              case 0:
                return this;
              case 10:
                this.token = p0.readString();
                break;
              case 16:
                i = p0.readInt32();
                if (i && (i != 1 && (i != i3 && (i != 3 && (i != 6 && (i != 13 && (i != 8 && (i != i2 && (i != i1 && i != 23))))))))) {
                   continue ;
                }else {
                   this.clientId = i;
                }
                break;
              case 26:
                this.deviceId = p0.readString();
                break;
              case '"':
                this.liveStreamId = p0.readString();
                break;
              case '(':
                this.isAuthor = p0.readBool();
                break;
              case '0':
                this.reconnectCount = p0.readUInt32();
                break;
              case '8':
                this.lastErrorCode = p0.readUInt32();
                break;
              case 'B':
                this.locale = p0.readString();
                break;
              case 'J':
                this.appVer = p0.readString();
                break;
              case 'R':
                this.location = p0.readString();
                break;
              case 'Z':
                this.operator = p0.readString();
                break;
              case '`':
                this.firstEnter = p0.readBool();
                break;
              case 'j':
                this.expTag = p0.readString();
                break;
              case 'r':
                this.attach = p0.readString();
                break;
              case 'x':
                i = p0.readInt32();
                if (i && (i != 1 && (i != i3 && (i != 8 && (i != i2 && (i != 21 && (i != i1 && i != 34))))))) {
                   switch (i){
                       case 28:
                       case 30:
                       case 31:
                       case 29:
                         break;
                       default:
                   }
                }
             label_0099 :
                this.appType = i;
                break;
              case 128:
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
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case '!':
                    case '"':
                    case '#':
                    case '$':
                    case '%':
                    case '&':
                    case 39:
                    case '(':
                    case ')':
                    case '*':
                    case '+':
                    case ',':
                    case '-':
                    case '.':
                    case '/':
                    case '0':
                    case '1':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case ':':
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                    case '?':
                    case '@':
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'I':
                    case 'J':
                    case 'K':
                    case 'L':
                    case 'M':
                    case 'N':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'T':
                    case 'U':
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                    case '[':
                    case 92:
                    case ']':
                    case '^':
                    case '_':
                    case '`':
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'm':
                    case 'n':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                    case '{':
                    case '|':
                    case '}':
                    case '~':
                    case 1:
                      break;
                    default:
                }
                this.sourceType = i;
                break;
              case 138:
                this.broadcastGiftToken = p0.readString();
                break;
              case 146:
                this.serviceToken = p0.readString();
                break;
              case 154:
                this.redPackId = p0.readString();
                break;
              case 160:
                this.authorId = p0.readUInt64();
                break;
              case 170:
                this.kpn = p0.readString();
                break;
              case 178:
                this.kpf = p0.readString();
                break;
              case 184:
                this.isCustodian = p0.readBool();
                break;
              case 194:
                this.sysVer = p0.readString();
                break;
              case 202:
                this.sys = p0.readString();
                break;
              case 210:
                this.phoneModel = p0.readString();
                break;
              case 218:
                this.channel = p0.readString();
                break;
              case 224:
                this.isSimpleLive = p0.readBool();
                break;
              case 232:
                this.isLite = p0.readBool();
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
       if (!(this.token).equals(str)) {
          p0.writeString(1, this.token);
       }
       LiveStreamMessages$CSEnterRoom tclientId = this.clientId;
       if (tclientId != null) {
          p0.writeInt32(2, tclientId);
       }
       if (!(this.deviceId).equals(str)) {
          p0.writeString(3, this.deviceId);
       }
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(4, this.liveStreamId);
       }
       tclientId = this.isAuthor;
       if (tclientId != null) {
          p0.writeBool(5, tclientId);
       }
       tclientId = this.reconnectCount;
       if (tclientId != null) {
          p0.writeUInt32(6, tclientId);
       }
       tclientId = this.lastErrorCode;
       if (tclientId != null) {
          p0.writeUInt32(7, tclientId);
       }
       if (!(this.locale).equals(str)) {
          p0.writeString(8, this.locale);
       }
       if (!(this.appVer).equals(str)) {
          p0.writeString(9, this.appVer);
       }
       if (!(this.location).equals(str)) {
          p0.writeString(10, this.location);
       }
       if (!(this.operator).equals(str)) {
          p0.writeString(11, this.operator);
       }
       tclientId = this.firstEnter;
       if (tclientId != null) {
          p0.writeBool(12, tclientId);
       }
       if (!(this.expTag).equals(str)) {
          p0.writeString(13, this.expTag);
       }
       if (!(this.attach).equals(str)) {
          p0.writeString(14, this.attach);
       }
       tclientId = this.appType;
       if (tclientId != null) {
          p0.writeInt32(15, tclientId);
       }
       tclientId = this.sourceType;
       if (tclientId != null) {
          p0.writeInt32(16, tclientId);
       }
       if (!(this.broadcastGiftToken).equals(str)) {
          p0.writeString(17, this.broadcastGiftToken);
       }
       if (!(this.serviceToken).equals(str)) {
          p0.writeString(18, this.serviceToken);
       }
       if (!(this.redPackId).equals(str)) {
          p0.writeString(19, this.redPackId);
       }
       LiveStreamMessages$CSEnterRoom tauthorId = this.authorId;
       if (tauthorId) {
          p0.writeUInt64(20, tauthorId);
       }
       if (!(this.kpn).equals(str)) {
          p0.writeString(21, this.kpn);
       }
       if (!(this.kpf).equals(str)) {
          p0.writeString(22, this.kpf);
       }
       tclientId = this.isCustodian;
       if (tclientId != null) {
          p0.writeBool(23, tclientId);
       }
       if (!(this.sysVer).equals(str)) {
          p0.writeString(24, this.sysVer);
       }
       if (!(this.sys).equals(str)) {
          p0.writeString(25, this.sys);
       }
       if (!(this.phoneModel).equals(str)) {
          p0.writeString(26, this.phoneModel);
       }
       if (!(this.channel).equals(str)) {
          p0.writeString(27, this.channel);
       }
       tclientId = this.isSimpleLive;
       if (tclientId != null) {
          p0.writeBool(28, tclientId);
       }
       tclientId = this.isLite;
       if (tclientId != null) {
          p0.writeBool(29, tclientId);
       }
       super.writeTo(p0);
       return;
    }
}
