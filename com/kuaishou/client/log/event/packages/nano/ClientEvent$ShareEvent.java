package com.kuaishou.client.log.event.packages.nano.ClientEvent$ShareEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientEvent$ShareEvent extends MessageNano	// class@000767
{
    public String authorId;
    public boolean cancelStatusReliable;
    public int contentType;
    public String contentWrapper;
    public long downloadCost;
    public String expTag;
    public String expTag0;
    public String failureReason;
    public int index;
    public String photoId;
    public String photoInfo;
    public int platform;
    public long shortenUrlCost;
    public int source;
    public int status;
    public int step;
    public int type;
    public String url;
    public String urlParams;
    public long watermarkCost;
    public static ClientEvent$ShareEvent[] _emptyArray;

    public void ClientEvent$ShareEvent(){
       super();
       this.clear();
    }
    public static ClientEvent$ShareEvent[] emptyArray(){
       if (ClientEvent$ShareEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientEvent$ShareEvent._emptyArray == null) {
             ClientEvent$ShareEvent[] shareEventAr = new ClientEvent$ShareEvent[0];
             ClientEvent$ShareEvent._emptyArray = shareEventAr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientEvent$ShareEvent._emptyArray;
    }
    public static ClientEvent$ShareEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientEvent$ShareEvent().mergeFrom(p0);
    }
    public static ClientEvent$ShareEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientEvent$ShareEvent(), p0);
    }
    public ClientEvent$ShareEvent clear(){
       this.source = 0;
       this.status = 0;
       this.contentType = 0;
       this.platform = 0;
       this.authorId = "";
       this.photoId = "";
       this.expTag = "";
       this.url = "";
       this.failureReason = "";
       this.expTag0 = "";
       this.photoInfo = "";
       this.urlParams = "";
       this.cancelStatusReliable = false;
       this.index = 0;
       this.step = 0;
       this.shortenUrlCost = 0;
       this.watermarkCost = 0;
       this.downloadCost = 0;
       this.type = 0;
       this.contentWrapper = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientEvent$ShareEvent tsource = this.source;
       if (tsource != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tsource);
       }
       tsource = this.status;
       if (tsource != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tsource);
       }
       tsource = this.contentType;
       if (tsource != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tsource);
       }
       tsource = this.platform;
       if (tsource != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tsource);
       }
       String str = "";
       if (!(this.authorId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.authorId);
       }
       if (!(this.photoId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.photoId);
       }
       if (!(this.expTag).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.expTag);
       }
       if (!(this.url).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.url);
       }
       if (!(this.failureReason).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.failureReason);
       }
       if (!(this.expTag0).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.expTag0);
       }
       if (!(this.photoInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.photoInfo);
       }
       if (!(this.urlParams).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.urlParams);
       }
       tsource = this.cancelStatusReliable;
       if (tsource != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(13, tsource);
       }
       tsource = this.index;
       if (tsource != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(14, tsource);
       }
       tsource = this.step;
       if (tsource != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(15, tsource);
       }
       ClientEvent$ShareEvent tshortenUrlC = this.shortenUrlCost;
       if (tshortenUrlC) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(16, tshortenUrlC);
       }
       tshortenUrlC = this.watermarkCost;
       if (tshortenUrlC) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(17, tshortenUrlC);
       }
       tshortenUrlC = this.downloadCost;
       if (tshortenUrlC) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(18, tshortenUrlC);
       }
       tsource = this.type;
       if (tsource != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(19, tsource);
       }
       if (!(this.contentWrapper).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(20, this.contentWrapper);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientEvent$ShareEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 8:
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
                    case 1:
                      break;
                    default:
                }
                this.source = i;
                break;
              case 16:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && (i != 4 && i != 5))))) {
                   continue ;
                }else {
                   this.status = i;
                }
                break;
              case 24:
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
                    case 1:
                      break;
                    default:
                }
                this.contentType = i;
                break;
              case 32:
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
                    case '2':
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
                    case 1:
                      break;
                    default:
                }
                this.platform = i;
                break;
              case '*':
                this.authorId = p0.readString();
                break;
              case '2':
                this.photoId = p0.readString();
                break;
              case ':':
                this.expTag = p0.readString();
                break;
              case 'B':
                this.url = p0.readString();
                break;
              case 'J':
                this.failureReason = p0.readString();
                break;
              case 'R':
                this.expTag0 = p0.readString();
                break;
              case 'Z':
                this.photoInfo = p0.readString();
                break;
              case 'b':
                this.urlParams = p0.readString();
                break;
              case 'h':
                this.cancelStatusReliable = p0.readBool();
                break;
              case 'p':
                this.index = p0.readInt32();
                break;
              case 'x':
                i = p0.readInt32();
                switch (i){
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 1:
                      break;
                    default:
                }
                this.step = i;
                break;
              case 128:
                this.shortenUrlCost = p0.readUInt64();
                break;
              case 136:
                this.watermarkCost = p0.readUInt64();
                break;
              case 144:
                this.downloadCost = p0.readUInt64();
                break;
              case 152:
                i = p0.readInt32();
                switch (i){
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 1:
                      break;
                    default:
                }
                this.type = i;
                break;
              case 162:
                this.contentWrapper = p0.readString();
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
       ClientEvent$ShareEvent tsource = this.source;
       if (tsource != null) {
          p0.writeInt32(1, tsource);
       }
       tsource = this.status;
       if (tsource != null) {
          p0.writeInt32(2, tsource);
       }
       tsource = this.contentType;
       if (tsource != null) {
          p0.writeInt32(3, tsource);
       }
       tsource = this.platform;
       if (tsource != null) {
          p0.writeInt32(4, tsource);
       }
       String str = "";
       if (!(this.authorId).equals(str)) {
          p0.writeString(5, this.authorId);
       }
       if (!(this.photoId).equals(str)) {
          p0.writeString(6, this.photoId);
       }
       if (!(this.expTag).equals(str)) {
          p0.writeString(7, this.expTag);
       }
       if (!(this.url).equals(str)) {
          p0.writeString(8, this.url);
       }
       if (!(this.failureReason).equals(str)) {
          p0.writeString(9, this.failureReason);
       }
       if (!(this.expTag0).equals(str)) {
          p0.writeString(10, this.expTag0);
       }
       if (!(this.photoInfo).equals(str)) {
          p0.writeString(11, this.photoInfo);
       }
       if (!(this.urlParams).equals(str)) {
          p0.writeString(12, this.urlParams);
       }
       tsource = this.cancelStatusReliable;
       if (tsource != null) {
          p0.writeBool(13, tsource);
       }
       tsource = this.index;
       if (tsource != null) {
          p0.writeInt32(14, tsource);
       }
       tsource = this.step;
       if (tsource != null) {
          p0.writeInt32(15, tsource);
       }
       ClientEvent$ShareEvent tshortenUrlC = this.shortenUrlCost;
       if (tshortenUrlC) {
          p0.writeUInt64(16, tshortenUrlC);
       }
       tshortenUrlC = this.watermarkCost;
       if (tshortenUrlC) {
          p0.writeUInt64(17, tshortenUrlC);
       }
       tshortenUrlC = this.downloadCost;
       if (tshortenUrlC) {
          p0.writeUInt64(18, tshortenUrlC);
       }
       tsource = this.type;
       if (tsource != null) {
          p0.writeInt32(19, tsource);
       }
       if (!(this.contentWrapper).equals(str)) {
          p0.writeString(20, this.contentWrapper);
       }
       super.writeTo(p0);
       return;
    }
}
