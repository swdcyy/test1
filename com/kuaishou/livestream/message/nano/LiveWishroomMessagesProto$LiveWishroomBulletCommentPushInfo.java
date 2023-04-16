package com.kuaishou.livestream.message.nano.LiveWishroomMessagesProto$LiveWishroomBulletCommentPushInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveWishroomMessagesProto$LiveWishLocation;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveWishroomMessagesProto$LiveWishroomBulletCommentPushInfo extends MessageNano	// class@0013da
{
    public String background;
    public String backgroundDecorationIcon;
    public String content;
    public long likeCount;
    public String likeDisplayCount;
    public String liveStreamId;
    public LiveWishroomMessagesProto$LiveWishLocation location;
    public boolean manualInput;
    public int propType;
    public String tag;
    public int tagOrder;
    public int tagType;
    public UserInfos$UserInfo userInfo;
    public int visibleStatus;
    public String wishId;
    public long wishNo;
    public static LiveWishroomMessagesProto$LiveWishroomBulletCommentPushInfo[] _emptyArray;

    public void LiveWishroomMessagesProto$LiveWishroomBulletCommentPushInfo(){
       super();
       this.clear();
    }
    public static LiveWishroomMessagesProto$LiveWishroomBulletCommentPushInfo[] emptyArray(){
       if (LiveWishroomMessagesProto$LiveWishroomBulletCommentPushInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveWishroomMessagesProto$LiveWishroomBulletCommentPushInfo._emptyArray == null) {
             LiveWishroomMessagesProto$LiveWishroomBulletCommentPushInfo[] liveWishroom = new LiveWishroomMessagesProto$LiveWishroomBulletCommentPushInfo[0];
             LiveWishroomMessagesProto$LiveWishroomBulletCommentPushInfo._emptyArray = liveWishroom;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveWishroomMessagesProto$LiveWishroomBulletCommentPushInfo._emptyArray;
    }
    public static LiveWishroomMessagesProto$LiveWishroomBulletCommentPushInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveWishroomMessagesProto$LiveWishroomBulletCommentPushInfo().mergeFrom(p0);
    }
    public static LiveWishroomMessagesProto$LiveWishroomBulletCommentPushInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveWishroomMessagesProto$LiveWishroomBulletCommentPushInfo(), p0);
    }
    public LiveWishroomMessagesProto$LiveWishroomBulletCommentPushInfo clear(){
       this.wishId = "";
       this.userInfo = null;
       this.tag = "";
       this.tagOrder = 0;
       this.tagType = 0;
       this.content = "";
       this.likeCount = 0;
       this.likeDisplayCount = "";
       this.background = "";
       this.backgroundDecorationIcon = "";
       this.location = null;
       this.manualInput = false;
       this.wishNo = 0;
       this.visibleStatus = 0;
       this.liveStreamId = "";
       this.propType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.wishId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.wishId);
       }
       LiveWishroomMessagesProto$LiveWishroomBulletCommentPushInfo tuserInfo = this.userInfo;
       if (tuserInfo != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tuserInfo);
       }
       if (!(this.tag).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.tag);
       }
       tuserInfo = this.tagOrder;
       if (tuserInfo != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tuserInfo);
       }
       tuserInfo = this.tagType;
       if (tuserInfo != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, tuserInfo);
       }
       if (!(this.content).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.content);
       }
       LiveWishroomMessagesProto$LiveWishroomBulletCommentPushInfo tlikeCount = this.likeCount;
       if (tlikeCount) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, tlikeCount);
       }
       if (!(this.likeDisplayCount).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.likeDisplayCount);
       }
       if (!(this.background).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.background);
       }
       if (!(this.backgroundDecorationIcon).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.backgroundDecorationIcon);
       }
       tuserInfo = this.location;
       if (tuserInfo != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(11, tuserInfo);
       }
       tuserInfo = this.manualInput;
       if (tuserInfo != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(12, tuserInfo);
       }
       tlikeCount = this.wishNo;
       if (tlikeCount) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(13, tlikeCount);
       }
       tuserInfo = this.visibleStatus;
       if (tuserInfo != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(14, tuserInfo);
       }
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(15, this.liveStreamId);
       }
       tuserInfo = this.propType;
       if (tuserInfo != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(16, tuserInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveWishroomMessagesProto$LiveWishroomBulletCommentPushInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.wishId = p0.readString();
                break;
              case 18:
                if (this.userInfo == null) {
                   this.userInfo = new UserInfos$UserInfo();
                }
                p0.readMessage(this.userInfo);
                break;
              case 26:
                this.tag = p0.readString();
                break;
              case 32:
                this.tagOrder = p0.readUInt32();
                break;
              case '(':
                this.tagType = p0.readUInt32();
                break;
              case '2':
                this.content = p0.readString();
                break;
              case '8':
                this.likeCount = p0.readUInt64();
                break;
              case 'B':
                this.likeDisplayCount = p0.readString();
                break;
              case 'J':
                this.background = p0.readString();
                break;
              case 'R':
                this.backgroundDecorationIcon = p0.readString();
                break;
              case 'Z':
                if (this.location == null) {
                   this.location = new LiveWishroomMessagesProto$LiveWishLocation();
                }
                p0.readMessage(this.location);
                break;
              case '`':
                this.manualInput = p0.readBool();
                break;
              case 'h':
                this.wishNo = p0.readUInt64();
                break;
              case 'p':
                this.visibleStatus = p0.readUInt32();
                break;
              case 'z':
                this.liveStreamId = p0.readString();
                break;
              case 128:
                this.propType = p0.readUInt32();
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
       if (!(this.wishId).equals(str)) {
          p0.writeString(1, this.wishId);
       }
       LiveWishroomMessagesProto$LiveWishroomBulletCommentPushInfo tuserInfo = this.userInfo;
       if (tuserInfo != null) {
          p0.writeMessage(2, tuserInfo);
       }
       if (!(this.tag).equals(str)) {
          p0.writeString(3, this.tag);
       }
       tuserInfo = this.tagOrder;
       if (tuserInfo != null) {
          p0.writeUInt32(4, tuserInfo);
       }
       tuserInfo = this.tagType;
       if (tuserInfo != null) {
          p0.writeUInt32(5, tuserInfo);
       }
       if (!(this.content).equals(str)) {
          p0.writeString(6, this.content);
       }
       LiveWishroomMessagesProto$LiveWishroomBulletCommentPushInfo tlikeCount = this.likeCount;
       if (tlikeCount) {
          p0.writeUInt64(7, tlikeCount);
       }
       if (!(this.likeDisplayCount).equals(str)) {
          p0.writeString(8, this.likeDisplayCount);
       }
       if (!(this.background).equals(str)) {
          p0.writeString(9, this.background);
       }
       if (!(this.backgroundDecorationIcon).equals(str)) {
          p0.writeString(10, this.backgroundDecorationIcon);
       }
       tuserInfo = this.location;
       if (tuserInfo != null) {
          p0.writeMessage(11, tuserInfo);
       }
       tuserInfo = this.manualInput;
       if (tuserInfo != null) {
          p0.writeBool(12, tuserInfo);
       }
       tlikeCount = this.wishNo;
       if (tlikeCount) {
          p0.writeUInt64(13, tlikeCount);
       }
       tuserInfo = this.visibleStatus;
       if (tuserInfo != null) {
          p0.writeUInt32(14, tuserInfo);
       }
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(15, this.liveStreamId);
       }
       tuserInfo = this.propType;
       if (tuserInfo != null) {
          p0.writeUInt32(16, tuserInfo);
       }
       super.writeTo(p0);
       return;
    }
}
