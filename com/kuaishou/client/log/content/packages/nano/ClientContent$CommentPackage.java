package com.kuaishou.client.log.content.packages.nano.ClientContent$CommentPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$CommentPackage extends MessageNano	// class@00122e
{
    public int atUserCnt;
    public String authorHeadInfo;
    public String authorId;
    public boolean childComment;
    public int childCommentCount;
    public String clickPosition;
    public String commentMark;
    public String commentTab;
    public int commentTag;
    public String commentUserLabel;
    public boolean downComment;
    public int editStatus;
    public String emotionBizType;
    public String emotionId;
    public boolean god;
    public boolean hiddenComment;
    public boolean hot;
    public String identity;
    public boolean ifHaveReplyButton;
    public int index;
    public boolean isEdited;
    public boolean isFirstShow;
    public boolean isHeadPendant;
    public boolean pasted;
    public String pictureBizType;
    public String pictureId;
    public int recallType;
    public String recallTypeNew;
    public String replyAuthorId;
    public String replyIdentity;
    public String severParams;
    public long showLength;
    public String tagType;
    public static ClientContent$CommentPackage[] _emptyArray;

    public void ClientContent$CommentPackage(){
       super();
       this.clear();
    }
    public static ClientContent$CommentPackage[] emptyArray(){
       if (ClientContent$CommentPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$CommentPackage._emptyArray == null) {
             ClientContent$CommentPackage[] uCommentPack = new ClientContent$CommentPackage[0];
             ClientContent$CommentPackage._emptyArray = uCommentPack;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$CommentPackage._emptyArray;
    }
    public static ClientContent$CommentPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$CommentPackage().mergeFrom(p0);
    }
    public static ClientContent$CommentPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$CommentPackage(), p0);
    }
    public ClientContent$CommentPackage clear(){
       this.identity = "";
       this.replyIdentity = "";
       this.pasted = false;
       this.authorId = "";
       this.hot = false;
       this.childComment = false;
       this.index = 0;
       this.childCommentCount = 0;
       this.recallType = 0;
       this.recallTypeNew = "";
       this.tagType = "";
       this.showLength = 0;
       this.isFirstShow = false;
       this.replyAuthorId = "";
       this.atUserCnt = 0;
       this.isEdited = false;
       this.editStatus = 0;
       this.emotionId = "";
       this.emotionBizType = "";
       this.god = false;
       this.commentMark = "";
       this.commentUserLabel = "";
       this.downComment = false;
       this.severParams = "";
       this.hiddenComment = false;
       this.authorHeadInfo = "";
       this.commentTag = 0;
       this.ifHaveReplyButton = false;
       this.clickPosition = "";
       this.commentTab = "";
       this.isHeadPendant = false;
       this.pictureId = "";
       this.pictureBizType = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.identity).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.identity);
       }
       if (!(this.replyIdentity).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.replyIdentity);
       }
       ClientContent$CommentPackage tpasted = this.pasted;
       if (tpasted != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, tpasted);
       }
       if (!(this.authorId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.authorId);
       }
       tpasted = this.hot;
       if (tpasted != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(5, tpasted);
       }
       tpasted = this.childComment;
       if (tpasted != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(6, tpasted);
       }
       tpasted = this.index;
       if (tpasted != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, tpasted);
       }
       tpasted = this.childCommentCount;
       if (tpasted != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(8, tpasted);
       }
       tpasted = this.recallType;
       if (tpasted != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(9, tpasted);
       }
       if (!(this.recallTypeNew).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.recallTypeNew);
       }
       if (!(this.tagType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.tagType);
       }
       ClientContent$CommentPackage tshowLength = this.showLength;
       if (tshowLength) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(12, tshowLength);
       }
       tpasted = this.isFirstShow;
       if (tpasted != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(13, tpasted);
       }
       if (!(this.replyAuthorId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(14, this.replyAuthorId);
       }
       tpasted = this.atUserCnt;
       if (tpasted != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(15, tpasted);
       }
       tpasted = this.isEdited;
       if (tpasted != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(16, tpasted);
       }
       tpasted = this.editStatus;
       if (tpasted != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(17, tpasted);
       }
       if (!(this.emotionId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(19, this.emotionId);
       }
       if (!(this.emotionBizType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(20, this.emotionBizType);
       }
       tpasted = this.god;
       if (tpasted != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(21, tpasted);
       }
       if (!(this.commentMark).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(22, this.commentMark);
       }
       if (!(this.commentUserLabel).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(23, this.commentUserLabel);
       }
       tpasted = this.downComment;
       if (tpasted != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(24, tpasted);
       }
       if (!(this.severParams).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(25, this.severParams);
       }
       tpasted = this.hiddenComment;
       if (tpasted != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(26, tpasted);
       }
       if (!(this.authorHeadInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(27, this.authorHeadInfo);
       }
       tpasted = this.commentTag;
       if (tpasted != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(28, tpasted);
       }
       tpasted = this.ifHaveReplyButton;
       if (tpasted != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(29, tpasted);
       }
       if (!(this.clickPosition).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(30, this.clickPosition);
       }
       if (!(this.commentTab).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(31, this.commentTab);
       }
       tpasted = this.isHeadPendant;
       if (tpasted != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(32, tpasted);
       }
       if (!(this.pictureId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(33, this.pictureId);
       }
       if (!(this.pictureBizType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(34, this.pictureBizType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$CommentPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          int i1 = 2;
          switch (i){
              case 0:
                return this;
              case 10:
                this.identity = p0.readString();
                break;
              case 18:
                this.replyIdentity = p0.readString();
                break;
              case 24:
                this.pasted = p0.readBool();
                break;
              case '"':
                this.authorId = p0.readString();
                break;
              case '(':
                this.hot = p0.readBool();
                break;
              case '0':
                this.childComment = p0.readBool();
                break;
              case '8':
                this.index = p0.readUInt32();
                break;
              case '@':
                this.childCommentCount = p0.readUInt32();
                break;
              case 'H':
                i = p0.readInt32();
                if (i && (i != 1 && i != i1)) {
                   continue ;
                }else {
                   this.recallType = i;
                }
                break;
              case 'R':
                this.recallTypeNew = p0.readString();
                break;
              case 'Z':
                this.tagType = p0.readString();
                break;
              case '`':
                this.showLength = p0.readUInt64();
                break;
              case 'h':
                this.isFirstShow = p0.readBool();
                break;
              case 'r':
                this.replyAuthorId = p0.readString();
                break;
              case 'x':
                this.atUserCnt = p0.readUInt32();
                break;
              case 128:
                this.isEdited = p0.readBool();
                break;
              case 136:
                this.editStatus = p0.readUInt32();
                break;
              case 154:
                this.emotionId = p0.readString();
                break;
              case 162:
                this.emotionBizType = p0.readString();
                break;
              case 168:
                this.god = p0.readBool();
                break;
              case 178:
                this.commentMark = p0.readString();
                break;
              case 186:
                this.commentUserLabel = p0.readString();
                break;
              case 192:
                this.downComment = p0.readBool();
                break;
              case 202:
                this.severParams = p0.readString();
                break;
              case 208:
                this.hiddenComment = p0.readBool();
                break;
              case 218:
                this.authorHeadInfo = p0.readString();
                break;
              case 224:
                i = p0.readInt32();
                if (i && (i != 1 && (i != i1 && (i != 3 && i != 4)))) {
                   continue ;
                }else {
                   this.commentTag = i;
                }
                break;
              case 232:
                this.ifHaveReplyButton = p0.readBool();
                break;
              case 242:
                this.clickPosition = p0.readString();
                break;
              case 250:
                this.commentTab = p0.readString();
                break;
              case 256:
                this.isHeadPendant = p0.readBool();
                break;
              case 266:
                this.pictureId = p0.readString();
                break;
              case 274:
                this.pictureBizType = p0.readString();
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
       if (!(this.identity).equals(str)) {
          p0.writeString(1, this.identity);
       }
       if (!(this.replyIdentity).equals(str)) {
          p0.writeString(2, this.replyIdentity);
       }
       ClientContent$CommentPackage tpasted = this.pasted;
       if (tpasted != null) {
          p0.writeBool(3, tpasted);
       }
       if (!(this.authorId).equals(str)) {
          p0.writeString(4, this.authorId);
       }
       tpasted = this.hot;
       if (tpasted != null) {
          p0.writeBool(5, tpasted);
       }
       tpasted = this.childComment;
       if (tpasted != null) {
          p0.writeBool(6, tpasted);
       }
       tpasted = this.index;
       if (tpasted != null) {
          p0.writeUInt32(7, tpasted);
       }
       tpasted = this.childCommentCount;
       if (tpasted != null) {
          p0.writeUInt32(8, tpasted);
       }
       tpasted = this.recallType;
       if (tpasted != null) {
          p0.writeInt32(9, tpasted);
       }
       if (!(this.recallTypeNew).equals(str)) {
          p0.writeString(10, this.recallTypeNew);
       }
       if (!(this.tagType).equals(str)) {
          p0.writeString(11, this.tagType);
       }
       ClientContent$CommentPackage tshowLength = this.showLength;
       if (tshowLength) {
          p0.writeUInt64(12, tshowLength);
       }
       tpasted = this.isFirstShow;
       if (tpasted != null) {
          p0.writeBool(13, tpasted);
       }
       if (!(this.replyAuthorId).equals(str)) {
          p0.writeString(14, this.replyAuthorId);
       }
       tpasted = this.atUserCnt;
       if (tpasted != null) {
          p0.writeUInt32(15, tpasted);
       }
       tpasted = this.isEdited;
       if (tpasted != null) {
          p0.writeBool(16, tpasted);
       }
       tpasted = this.editStatus;
       if (tpasted != null) {
          p0.writeUInt32(17, tpasted);
       }
       if (!(this.emotionId).equals(str)) {
          p0.writeString(19, this.emotionId);
       }
       if (!(this.emotionBizType).equals(str)) {
          p0.writeString(20, this.emotionBizType);
       }
       tpasted = this.god;
       if (tpasted != null) {
          p0.writeBool(21, tpasted);
       }
       if (!(this.commentMark).equals(str)) {
          p0.writeString(22, this.commentMark);
       }
       if (!(this.commentUserLabel).equals(str)) {
          p0.writeString(23, this.commentUserLabel);
       }
       tpasted = this.downComment;
       if (tpasted != null) {
          p0.writeBool(24, tpasted);
       }
       if (!(this.severParams).equals(str)) {
          p0.writeString(25, this.severParams);
       }
       tpasted = this.hiddenComment;
       if (tpasted != null) {
          p0.writeBool(26, tpasted);
       }
       if (!(this.authorHeadInfo).equals(str)) {
          p0.writeString(27, this.authorHeadInfo);
       }
       tpasted = this.commentTag;
       if (tpasted != null) {
          p0.writeInt32(28, tpasted);
       }
       tpasted = this.ifHaveReplyButton;
       if (tpasted != null) {
          p0.writeBool(29, tpasted);
       }
       if (!(this.clickPosition).equals(str)) {
          p0.writeString(30, this.clickPosition);
       }
       if (!(this.commentTab).equals(str)) {
          p0.writeString(31, this.commentTab);
       }
       tpasted = this.isHeadPendant;
       if (tpasted != null) {
          p0.writeBool(32, tpasted);
       }
       if (!(this.pictureId).equals(str)) {
          p0.writeString(33, this.pictureId);
       }
       if (!(this.pictureBizType).equals(str)) {
          p0.writeString(34, this.pictureBizType);
       }
       super.writeTo(p0);
       return;
    }
}
