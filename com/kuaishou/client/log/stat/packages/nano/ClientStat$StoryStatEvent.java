package com.kuaishou.client.log.stat.packages.nano.ClientStat$StoryStatEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;

public final class ClientStat$StoryStatEvent extends MessageNano	// class@000805
{
    public String atlasParams;
    public long commentStayDuration;
    public int enterAction;
    public int leaveAction;
    public int mediaType;
    public String momentType;
    public long otherPauseDuration;
    public long playedDuration;
    public ClientEvent$UrlPackage referUrlPackage;
    public int relationType;
    public String sAuthorId;
    public String sMomentId;
    public String sPhotoId;
    public long storyDuration;
    public String storyExtraParams;
    public String storyRelationType;
    public ClientEvent$UrlPackage urlPackage;
    public long viewHistoryStayDuration;
    public static ClientStat$StoryStatEvent[] _emptyArray;

    public void ClientStat$StoryStatEvent(){
       super();
       this.clear();
    }
    public static ClientStat$StoryStatEvent[] emptyArray(){
       if (ClientStat$StoryStatEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$StoryStatEvent._emptyArray == null) {
             ClientStat$StoryStatEvent[] storyStatEve = new ClientStat$StoryStatEvent[0];
             ClientStat$StoryStatEvent._emptyArray = storyStatEve;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$StoryStatEvent._emptyArray;
    }
    public static ClientStat$StoryStatEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$StoryStatEvent().mergeFrom(p0);
    }
    public static ClientStat$StoryStatEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$StoryStatEvent(), p0);
    }
    public ClientStat$StoryStatEvent clear(){
       this.urlPackage = null;
       this.referUrlPackage = null;
       this.sMomentId = "";
       this.mediaType = 0;
       this.sPhotoId = "";
       this.storyDuration = 0;
       this.playedDuration = 0;
       this.sAuthorId = "";
       this.storyRelationType = "";
       this.enterAction = 0;
       this.leaveAction = 0;
       this.otherPauseDuration = 0;
       this.commentStayDuration = 0;
       this.viewHistoryStayDuration = 0;
       this.relationType = 0;
       this.momentType = "";
       this.storyExtraParams = "";
       this.atlasParams = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$StoryStatEvent turlPackage = this.urlPackage;
       if (turlPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, turlPackage);
       }
       turlPackage = this.referUrlPackage;
       if (turlPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, turlPackage);
       }
       String str = "";
       if (!(this.sMomentId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.sMomentId);
       }
       turlPackage = this.mediaType;
       if (turlPackage != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, turlPackage);
       }
       if (!(this.sPhotoId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.sPhotoId);
       }
       ClientStat$StoryStatEvent tstoryDurati = this.storyDuration;
       if (tstoryDurati) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tstoryDurati);
       }
       tstoryDurati = this.playedDuration;
       if (tstoryDurati) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, tstoryDurati);
       }
       if (!(this.sAuthorId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.sAuthorId);
       }
       if (!(this.storyRelationType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.storyRelationType);
       }
       turlPackage = this.enterAction;
       if (turlPackage != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(10, turlPackage);
       }
       turlPackage = this.leaveAction;
       if (turlPackage != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(11, turlPackage);
       }
       tstoryDurati = this.otherPauseDuration;
       if (tstoryDurati) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(12, tstoryDurati);
       }
       tstoryDurati = this.commentStayDuration;
       if (tstoryDurati) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(13, tstoryDurati);
       }
       tstoryDurati = this.viewHistoryStayDuration;
       if (tstoryDurati) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(14, tstoryDurati);
       }
       turlPackage = this.relationType;
       if (turlPackage != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(15, turlPackage);
       }
       if (!(this.momentType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(16, this.momentType);
       }
       if (!(this.storyExtraParams).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(17, this.storyExtraParams);
       }
       if (!(this.atlasParams).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(112, this.atlasParams);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$StoryStatEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                if (this.urlPackage == null) {
                   this.urlPackage = new ClientEvent$UrlPackage();
                }
                p0.readMessage(this.urlPackage);
                break;
              case 18:
                if (this.referUrlPackage == null) {
                   this.referUrlPackage = new ClientEvent$UrlPackage();
                }
                p0.readMessage(this.referUrlPackage);
                break;
              case 26:
                this.sMomentId = p0.readString();
                break;
              case 32:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != 3))) {
                   continue ;
                }else {
                   this.mediaType = i;
                }
                break;
              case '*':
                this.sPhotoId = p0.readString();
                break;
              case '0':
                this.storyDuration = p0.readUInt64();
                break;
              case '8':
                this.playedDuration = p0.readUInt64();
                break;
              case 'B':
                this.sAuthorId = p0.readString();
                break;
              case 'J':
                this.storyRelationType = p0.readString();
                break;
              case 'P':
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
                    case 1:
                      break;
                    default:
                }
                this.enterAction = i;
                break;
              case 'X':
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
                    case 1:
                      break;
                    default:
                }
                this.leaveAction = i;
                break;
              case '`':
                this.otherPauseDuration = p0.readUInt64();
                break;
              case 'h':
                this.commentStayDuration = p0.readUInt64();
                break;
              case 'p':
                this.viewHistoryStayDuration = p0.readUInt64();
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
                    case 1:
                      break;
                    default:
                }
                this.relationType = i;
                break;
              case 130:
                this.momentType = p0.readString();
                break;
              case 138:
                this.storyExtraParams = p0.readString();
                break;
              case 898:
                this.atlasParams = p0.readString();
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
       ClientStat$StoryStatEvent turlPackage = this.urlPackage;
       if (turlPackage != null) {
          p0.writeMessage(1, turlPackage);
       }
       turlPackage = this.referUrlPackage;
       if (turlPackage != null) {
          p0.writeMessage(2, turlPackage);
       }
       String str = "";
       if (!(this.sMomentId).equals(str)) {
          p0.writeString(3, this.sMomentId);
       }
       turlPackage = this.mediaType;
       if (turlPackage != null) {
          p0.writeInt32(4, turlPackage);
       }
       if (!(this.sPhotoId).equals(str)) {
          p0.writeString(5, this.sPhotoId);
       }
       ClientStat$StoryStatEvent tstoryDurati = this.storyDuration;
       if (tstoryDurati) {
          p0.writeUInt64(6, tstoryDurati);
       }
       tstoryDurati = this.playedDuration;
       if (tstoryDurati) {
          p0.writeUInt64(7, tstoryDurati);
       }
       if (!(this.sAuthorId).equals(str)) {
          p0.writeString(8, this.sAuthorId);
       }
       if (!(this.storyRelationType).equals(str)) {
          p0.writeString(9, this.storyRelationType);
       }
       turlPackage = this.enterAction;
       if (turlPackage != null) {
          p0.writeInt32(10, turlPackage);
       }
       turlPackage = this.leaveAction;
       if (turlPackage != null) {
          p0.writeInt32(11, turlPackage);
       }
       tstoryDurati = this.otherPauseDuration;
       if (tstoryDurati) {
          p0.writeUInt64(12, tstoryDurati);
       }
       tstoryDurati = this.commentStayDuration;
       if (tstoryDurati) {
          p0.writeUInt64(13, tstoryDurati);
       }
       tstoryDurati = this.viewHistoryStayDuration;
       if (tstoryDurati) {
          p0.writeUInt64(14, tstoryDurati);
       }
       turlPackage = this.relationType;
       if (turlPackage != null) {
          p0.writeInt32(15, turlPackage);
       }
       if (!(this.momentType).equals(str)) {
          p0.writeString(16, this.momentType);
       }
       if (!(this.storyExtraParams).equals(str)) {
          p0.writeString(17, this.storyExtraParams);
       }
       if (!(this.atlasParams).equals(str)) {
          p0.writeString(112, this.atlasParams);
       }
       super.writeTo(p0);
       return;
    }
}
