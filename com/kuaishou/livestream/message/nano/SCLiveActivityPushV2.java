package com.kuaishou.livestream.message.nano.SCLiveActivityPushV2;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class SCLiveActivityPushV2 extends MessageNano	// class@001401
{
    public String activityId;
    public int bizType;
    public String buttonText;
    public long displayDurationMillis;
    public String displayOnlineCount;
    public boolean enableSkipLimit;
    public String extraInfo;
    public boolean isShowOnlineCount;
    public String ksOrderId;
    public String messageId;
    public int messageType;
    public String reasonTagJson;
    public String subTitle;
    public UserInfos$UserInfo targetAuthorInfo;
    public String targetLiveStreamId;
    public String title;
    public static SCLiveActivityPushV2[] _emptyArray;

    public void SCLiveActivityPushV2(){
       super();
       this.clear();
    }
    public static SCLiveActivityPushV2[] emptyArray(){
       if (SCLiveActivityPushV2._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveActivityPushV2._emptyArray == null) {
             SCLiveActivityPushV2[] sCLiveActivi = new SCLiveActivityPushV2[0];
             SCLiveActivityPushV2._emptyArray = sCLiveActivi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveActivityPushV2._emptyArray;
    }
    public static SCLiveActivityPushV2 parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveActivityPushV2().mergeFrom(p0);
    }
    public static SCLiveActivityPushV2 parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveActivityPushV2(), p0);
    }
    public SCLiveActivityPushV2 clear(){
       this.activityId = "";
       this.title = "";
       this.targetLiveStreamId = "";
       this.targetAuthorInfo = null;
       this.displayOnlineCount = "";
       this.isShowOnlineCount = false;
       this.ksOrderId = "";
       this.displayDurationMillis = 0;
       this.bizType = 0;
       this.subTitle = "";
       this.messageId = "";
       this.messageType = 0;
       this.reasonTagJson = "";
       this.buttonText = "";
       this.enableSkipLimit = false;
       this.extraInfo = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.activityId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.activityId);
       }
       if (!(this.title).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.title);
       }
       if (!(this.targetLiveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.targetLiveStreamId);
       }
       SCLiveActivityPushV2 ttargetAutho = this.targetAuthorInfo;
       if (ttargetAutho != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, ttargetAutho);
       }
       if (!(this.displayOnlineCount).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.displayOnlineCount);
       }
       ttargetAutho = this.isShowOnlineCount;
       if (ttargetAutho != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(6, ttargetAutho);
       }
       if (!(this.ksOrderId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.ksOrderId);
       }
       SCLiveActivityPushV2 tdisplayDura = this.displayDurationMillis;
       if (tdisplayDura) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, tdisplayDura);
       }
       ttargetAutho = this.bizType;
       if (ttargetAutho != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(9, ttargetAutho);
       }
       if (!(this.subTitle).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.subTitle);
       }
       if (!(this.messageId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.messageId);
       }
       ttargetAutho = this.messageType;
       if (ttargetAutho != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(12, ttargetAutho);
       }
       if (!(this.reasonTagJson).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(13, this.reasonTagJson);
       }
       if (!(this.buttonText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(14, this.buttonText);
       }
       ttargetAutho = this.enableSkipLimit;
       if (ttargetAutho != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(15, ttargetAutho);
       }
       if (!(this.extraInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(16, this.extraInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveActivityPushV2 mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.activityId = p0.readString();
                break;
              case 18:
                this.title = p0.readString();
                break;
              case 26:
                this.targetLiveStreamId = p0.readString();
                break;
              case '"':
                if (this.targetAuthorInfo == null) {
                   this.targetAuthorInfo = new UserInfos$UserInfo();
                }
                p0.readMessage(this.targetAuthorInfo);
                break;
              case '*':
                this.displayOnlineCount = p0.readString();
                break;
              case '0':
                this.isShowOnlineCount = p0.readBool();
                break;
              case ':':
                this.ksOrderId = p0.readString();
                break;
              case '@':
                this.displayDurationMillis = p0.readUInt64();
                break;
              case 'H':
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
                    case 1:
                      break;
                    default:
                }
                this.bizType = i;
                break;
              case 'R':
                this.subTitle = p0.readString();
                break;
              case 'Z':
                this.messageId = p0.readString();
                break;
              case '`':
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != 3))) {
                   continue ;
                }else {
                   this.messageType = i;
                }
                break;
              case 'j':
                this.reasonTagJson = p0.readString();
                break;
              case 'r':
                this.buttonText = p0.readString();
                break;
              case 'x':
                this.enableSkipLimit = p0.readBool();
                break;
              case 130:
                this.extraInfo = p0.readString();
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
       if (!(this.activityId).equals(str)) {
          p0.writeString(1, this.activityId);
       }
       if (!(this.title).equals(str)) {
          p0.writeString(2, this.title);
       }
       if (!(this.targetLiveStreamId).equals(str)) {
          p0.writeString(3, this.targetLiveStreamId);
       }
       SCLiveActivityPushV2 ttargetAutho = this.targetAuthorInfo;
       if (ttargetAutho != null) {
          p0.writeMessage(4, ttargetAutho);
       }
       if (!(this.displayOnlineCount).equals(str)) {
          p0.writeString(5, this.displayOnlineCount);
       }
       ttargetAutho = this.isShowOnlineCount;
       if (ttargetAutho != null) {
          p0.writeBool(6, ttargetAutho);
       }
       if (!(this.ksOrderId).equals(str)) {
          p0.writeString(7, this.ksOrderId);
       }
       SCLiveActivityPushV2 tdisplayDura = this.displayDurationMillis;
       if (tdisplayDura) {
          p0.writeUInt64(8, tdisplayDura);
       }
       ttargetAutho = this.bizType;
       if (ttargetAutho != null) {
          p0.writeInt32(9, ttargetAutho);
       }
       if (!(this.subTitle).equals(str)) {
          p0.writeString(10, this.subTitle);
       }
       if (!(this.messageId).equals(str)) {
          p0.writeString(11, this.messageId);
       }
       ttargetAutho = this.messageType;
       if (ttargetAutho != null) {
          p0.writeInt32(12, ttargetAutho);
       }
       if (!(this.reasonTagJson).equals(str)) {
          p0.writeString(13, this.reasonTagJson);
       }
       if (!(this.buttonText).equals(str)) {
          p0.writeString(14, this.buttonText);
       }
       ttargetAutho = this.enableSkipLimit;
       if (ttargetAutho != null) {
          p0.writeBool(15, ttargetAutho);
       }
       if (!(this.extraInfo).equals(str)) {
          p0.writeString(16, this.extraInfo);
       }
       super.writeTo(p0);
       return;
    }
}
