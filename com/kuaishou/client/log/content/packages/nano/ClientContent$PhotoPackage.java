package com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$FeedLogContext;

public final class ClientContent$PhotoPackage extends MessageNano	// class@0012c3
{
    public int atlastype;
    public long authorId;
    public long drawTime;
    public String expTag;
    public String extraInfo;
    public ClientContent$FeedLogContext feedLogCtx;
    public boolean fullScreenDisplay;
    public String identity;
    public long index;
    public String isClip;
    public String isTop;
    public String keyword;
    public boolean landscapeScreenDisplay;
    public String llsid;
    public int photoType;
    public String reportContext;
    public String sAuthorId;
    public String serverExpTag;
    public boolean shareIdentify;
    public String source;
    public int subtype;
    public boolean supportLandscapeMode;
    public boolean tagOwner;
    public int type;
    public int verticalIndex;
    public int videoPlayStat;
    public static ClientContent$PhotoPackage[] _emptyArray;

    public void ClientContent$PhotoPackage(){
       super();
       this.clear();
    }
    public static ClientContent$PhotoPackage[] emptyArray(){
       if (ClientContent$PhotoPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$PhotoPackage._emptyArray == null) {
             ClientContent$PhotoPackage[] photoPackage = new ClientContent$PhotoPackage[0];
             ClientContent$PhotoPackage._emptyArray = photoPackage;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$PhotoPackage._emptyArray;
    }
    public static ClientContent$PhotoPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$PhotoPackage().mergeFrom(p0);
    }
    public static ClientContent$PhotoPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$PhotoPackage(), p0);
    }
    public ClientContent$PhotoPackage clear(){
       this.type = 0;
       this.identity = "";
       this.authorId = 0;
       this.expTag = "";
       this.index = 0;
       this.llsid = "";
       this.keyword = "";
       this.verticalIndex = 0;
       this.sAuthorId = "";
       this.fullScreenDisplay = false;
       this.drawTime = 0;
       this.tagOwner = false;
       this.shareIdentify = false;
       this.serverExpTag = "";
       this.isTop = "";
       this.isClip = "";
       this.subtype = 0;
       this.atlastype = 0;
       this.extraInfo = "";
       this.supportLandscapeMode = false;
       this.landscapeScreenDisplay = false;
       this.photoType = 0;
       this.source = "";
       this.reportContext = "";
       this.videoPlayStat = 0;
       this.feedLogCtx = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$PhotoPackage ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ttype);
       }
       String str = "";
       if (!(this.identity).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.identity);
       }
       ClientContent$PhotoPackage tauthorId = this.authorId;
       if (tauthorId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tauthorId);
       }
       if (!(this.expTag).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.expTag);
       }
       tauthorId = this.index;
       if (tauthorId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tauthorId);
       }
       if (!(this.llsid).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.llsid);
       }
       if (!(this.keyword).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.keyword);
       }
       ttype = this.verticalIndex;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(8, ttype);
       }
       if (!(this.sAuthorId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.sAuthorId);
       }
       ttype = this.fullScreenDisplay;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(10, ttype);
       }
       tauthorId = this.drawTime;
       if (tauthorId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(11, tauthorId);
       }
       ttype = this.tagOwner;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(12, ttype);
       }
       ttype = this.shareIdentify;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(13, ttype);
       }
       if (!(this.serverExpTag).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(14, this.serverExpTag);
       }
       if (!(this.isTop).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(15, this.isTop);
       }
       if (!(this.isClip).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(16, this.isClip);
       }
       ttype = this.subtype;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(17, ttype);
       }
       ttype = this.atlastype;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(18, ttype);
       }
       if (!(this.extraInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(19, this.extraInfo);
       }
       ttype = this.supportLandscapeMode;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(20, ttype);
       }
       ttype = this.landscapeScreenDisplay;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(21, ttype);
       }
       ttype = this.photoType;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(22, ttype);
       }
       if (!(this.source).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(23, this.source);
       }
       if (!(this.reportContext).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(24, this.reportContext);
       }
       ttype = this.videoPlayStat;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(25, ttype);
       }
       ttype = this.feedLogCtx;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(26, ttype);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$PhotoPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          int i1 = 2;
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
                    case 1:
                      break;
                    default:
                }
                this.type = i;
                break;
              case 18:
                this.identity = p0.readString();
                break;
              case 24:
                this.authorId = p0.readUInt64();
                break;
              case '"':
                this.expTag = p0.readString();
                break;
              case '(':
                this.index = p0.readUInt64();
                break;
              case '2':
                this.llsid = p0.readString();
                break;
              case ':':
                this.keyword = p0.readString();
                break;
              case '@':
                this.verticalIndex = p0.readUInt32();
                break;
              case 'J':
                this.sAuthorId = p0.readString();
                break;
              case 'P':
                this.fullScreenDisplay = p0.readBool();
                break;
              case 'X':
                this.drawTime = p0.readUInt64();
                break;
              case '`':
                this.tagOwner = p0.readBool();
                break;
              case 'h':
                this.shareIdentify = p0.readBool();
                break;
              case 'r':
                this.serverExpTag = p0.readString();
                break;
              case 'z':
                this.isTop = p0.readString();
                break;
              case 130:
                this.isClip = p0.readString();
                break;
              case 136:
                i = p0.readInt32();
                if (i && i != 1) {
                   continue ;
                }else {
                   this.subtype = i;
                }
                break;
              case 144:
                i = p0.readInt32();
                if (i && (i != 1 && (i != i1 && i != 3))) {
                   continue ;
                }else {
                   this.atlastype = i;
                }
                break;
              case 154:
                this.extraInfo = p0.readString();
                break;
              case 160:
                this.supportLandscapeMode = p0.readBool();
                break;
              case 168:
                this.landscapeScreenDisplay = p0.readBool();
                break;
              case 176:
                i = p0.readInt32();
                if (i && (i != 1 && i != i1)) {
                   continue ;
                }else {
                   this.photoType = i;
                }
                break;
              case 186:
                this.source = p0.readString();
                break;
              case 194:
                this.reportContext = p0.readString();
                break;
              case 200:
                i = p0.readInt32();
                if (i && (i != 1 && i != i1)) {
                   continue ;
                }else {
                   this.videoPlayStat = i;
                }
                break;
              case 210:
                if (this.feedLogCtx == null) {
                   this.feedLogCtx = new ClientContent$FeedLogContext();
                }
                p0.readMessage(this.feedLogCtx);
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
       ClientContent$PhotoPackage ttype = this.type;
       if (ttype != null) {
          p0.writeInt32(1, ttype);
       }
       String str = "";
       if (!(this.identity).equals(str)) {
          p0.writeString(2, this.identity);
       }
       ClientContent$PhotoPackage tauthorId = this.authorId;
       if (tauthorId) {
          p0.writeUInt64(3, tauthorId);
       }
       if (!(this.expTag).equals(str)) {
          p0.writeString(4, this.expTag);
       }
       tauthorId = this.index;
       if (tauthorId) {
          p0.writeUInt64(5, tauthorId);
       }
       if (!(this.llsid).equals(str)) {
          p0.writeString(6, this.llsid);
       }
       if (!(this.keyword).equals(str)) {
          p0.writeString(7, this.keyword);
       }
       ttype = this.verticalIndex;
       if (ttype != null) {
          p0.writeUInt32(8, ttype);
       }
       if (!(this.sAuthorId).equals(str)) {
          p0.writeString(9, this.sAuthorId);
       }
       ttype = this.fullScreenDisplay;
       if (ttype != null) {
          p0.writeBool(10, ttype);
       }
       tauthorId = this.drawTime;
       if (tauthorId) {
          p0.writeUInt64(11, tauthorId);
       }
       ttype = this.tagOwner;
       if (ttype != null) {
          p0.writeBool(12, ttype);
       }
       ttype = this.shareIdentify;
       if (ttype != null) {
          p0.writeBool(13, ttype);
       }
       if (!(this.serverExpTag).equals(str)) {
          p0.writeString(14, this.serverExpTag);
       }
       if (!(this.isTop).equals(str)) {
          p0.writeString(15, this.isTop);
       }
       if (!(this.isClip).equals(str)) {
          p0.writeString(16, this.isClip);
       }
       ttype = this.subtype;
       if (ttype != null) {
          p0.writeInt32(17, ttype);
       }
       ttype = this.atlastype;
       if (ttype != null) {
          p0.writeInt32(18, ttype);
       }
       if (!(this.extraInfo).equals(str)) {
          p0.writeString(19, this.extraInfo);
       }
       ttype = this.supportLandscapeMode;
       if (ttype != null) {
          p0.writeBool(20, ttype);
       }
       ttype = this.landscapeScreenDisplay;
       if (ttype != null) {
          p0.writeBool(21, ttype);
       }
       ttype = this.photoType;
       if (ttype != null) {
          p0.writeInt32(22, ttype);
       }
       if (!(this.source).equals(str)) {
          p0.writeString(23, this.source);
       }
       if (!(this.reportContext).equals(str)) {
          p0.writeString(24, this.reportContext);
       }
       ttype = this.videoPlayStat;
       if (ttype != null) {
          p0.writeInt32(25, ttype);
       }
       ttype = this.feedLogCtx;
       if (ttype != null) {
          p0.writeMessage(26, ttype);
       }
       super.writeTo(p0);
       return;
    }
}
