package com.kuaishou.log.realshow.nano.DiscardedShowLogs$DiscardedShowFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class DiscardedShowLogs$DiscardedShowFeed extends MessageNano	// class@0014a7
{
    public long authorId;
    public String clientPage;
    public String expTag;
    public int feedType;
    public String liveStreamId;
    public long photoId;
    public String reason;
    public String sAuthorId;
    public String sPhotoId;
    public String serverExpTag;
    public long serverLiveStreamId;
    public static DiscardedShowLogs$DiscardedShowFeed[] _emptyArray;

    public void DiscardedShowLogs$DiscardedShowFeed(){
       super();
       this.clear();
    }
    public static DiscardedShowLogs$DiscardedShowFeed[] emptyArray(){
       if (DiscardedShowLogs$DiscardedShowFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (DiscardedShowLogs$DiscardedShowFeed._emptyArray == null) {
             DiscardedShowLogs$DiscardedShowFeed[] uDiscardedSh = new DiscardedShowLogs$DiscardedShowFeed[0];
             DiscardedShowLogs$DiscardedShowFeed._emptyArray = uDiscardedSh;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return DiscardedShowLogs$DiscardedShowFeed._emptyArray;
    }
    public static DiscardedShowLogs$DiscardedShowFeed parseFrom(CodedInputByteBufferNano p0){
       return new DiscardedShowLogs$DiscardedShowFeed().mergeFrom(p0);
    }
    public static DiscardedShowLogs$DiscardedShowFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new DiscardedShowLogs$DiscardedShowFeed(), p0);
    }
    public DiscardedShowLogs$DiscardedShowFeed clear(){
       this.feedType = 0;
       this.authorId = 0;
       this.photoId = 0;
       this.liveStreamId = "";
       this.expTag = "";
       this.serverLiveStreamId = 0;
       this.reason = "";
       this.sAuthorId = "";
       this.sPhotoId = "";
       this.serverExpTag = "";
       this.clientPage = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       DiscardedShowLogs$DiscardedShowFeed tuDiscardedS = this.feedType;
       if (tuDiscardedS != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tuDiscardedS);
       }
       tuDiscardedS = this.authorId;
       DiscardedShowLogs$DiscardedShowFeed uDiscardedSh = null;
       if (tuDiscardedS - uDiscardedSh) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tuDiscardedS);
       }
       tuDiscardedS = this.photoId;
       if (tuDiscardedS - uDiscardedSh) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tuDiscardedS);
       }
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.liveStreamId);
       }
       if (!(this.expTag).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.expTag);
       }
       DiscardedShowLogs$DiscardedShowFeed tserverLiveS = this.serverLiveStreamId;
       if (tserverLiveS - uDiscardedSh) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tserverLiveS);
       }
       if (!(this.reason).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.reason);
       }
       if (!(this.sAuthorId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.sAuthorId);
       }
       if (!(this.sPhotoId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.sPhotoId);
       }
       if (!(this.serverExpTag).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.serverExpTag);
       }
       if (!(this.clientPage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.clientPage);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public DiscardedShowLogs$DiscardedShowFeed mergeFrom(CodedInputByteBufferNano p0){
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
                    case 1:
                      break;
                    default:
                }
                this.feedType = i;
                break;
              case 16:
                this.authorId = p0.readUInt64();
                break;
              case 24:
                this.photoId = p0.readUInt64();
                break;
              case '"':
                this.liveStreamId = p0.readString();
                break;
              case '*':
                this.expTag = p0.readString();
                break;
              case '0':
                this.serverLiveStreamId = p0.readUInt64();
                break;
              case ':':
                this.reason = p0.readString();
                break;
              case 'B':
                this.sAuthorId = p0.readString();
                break;
              case 'J':
                this.sPhotoId = p0.readString();
                break;
              case 'R':
                this.serverExpTag = p0.readString();
                break;
              case 'Z':
                this.clientPage = p0.readString();
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
       DiscardedShowLogs$DiscardedShowFeed tuDiscardedS = this.feedType;
       if (tuDiscardedS != null) {
          p0.writeInt32(1, tuDiscardedS);
       }
       tuDiscardedS = this.authorId;
       DiscardedShowLogs$DiscardedShowFeed uDiscardedSh = null;
       if (tuDiscardedS - uDiscardedSh) {
          p0.writeUInt64(2, tuDiscardedS);
       }
       tuDiscardedS = this.photoId;
       if (tuDiscardedS - uDiscardedSh) {
          p0.writeUInt64(3, tuDiscardedS);
       }
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(4, this.liveStreamId);
       }
       if (!(this.expTag).equals(str)) {
          p0.writeString(5, this.expTag);
       }
       DiscardedShowLogs$DiscardedShowFeed tserverLiveS = this.serverLiveStreamId;
       if (tserverLiveS - uDiscardedSh) {
          p0.writeUInt64(6, tserverLiveS);
       }
       if (!(this.reason).equals(str)) {
          p0.writeString(7, this.reason);
       }
       if (!(this.sAuthorId).equals(str)) {
          p0.writeString(8, this.sAuthorId);
       }
       if (!(this.sPhotoId).equals(str)) {
          p0.writeString(9, this.sPhotoId);
       }
       if (!(this.serverExpTag).equals(str)) {
          p0.writeString(10, this.serverExpTag);
       }
       if (!(this.clientPage).equals(str)) {
          p0.writeString(11, this.clientPage);
       }
       super.writeTo(p0);
       return;
    }
}
