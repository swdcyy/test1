package com.kuaishou.livestream.message.nano.LiveCommonNoticeMessages$SCTopBannerBroadcastNotice;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveCommonNoticeMessages$SCTopBannerBroadcastNotice extends MessageNano	// class@00115b
{
    public String backgroundColorBegin;
    public String backgroundColorEnd;
    public long bizId;
    public String buttonContent;
    public String configBizId;
    public String content;
    public String contentForA;
    public String contentForI;
    public long displayDurationMillis;
    public boolean enableWipe;
    public long expiredTimestamp;
    public String extraInfo;
    public String iconUrl;
    public int priorityType;
    public int routeType;
    public String routeUrl;
    public int style;
    public static LiveCommonNoticeMessages$SCTopBannerBroadcastNotice[] _emptyArray;

    public void LiveCommonNoticeMessages$SCTopBannerBroadcastNotice(){
       super();
       this.clear();
    }
    public static LiveCommonNoticeMessages$SCTopBannerBroadcastNotice[] emptyArray(){
       if (LiveCommonNoticeMessages$SCTopBannerBroadcastNotice._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCommonNoticeMessages$SCTopBannerBroadcastNotice._emptyArray == null) {
             LiveCommonNoticeMessages$SCTopBannerBroadcastNotice[] sCTopBannerB = new LiveCommonNoticeMessages$SCTopBannerBroadcastNotice[0];
             LiveCommonNoticeMessages$SCTopBannerBroadcastNotice._emptyArray = sCTopBannerB;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCommonNoticeMessages$SCTopBannerBroadcastNotice._emptyArray;
    }
    public static LiveCommonNoticeMessages$SCTopBannerBroadcastNotice parseFrom(CodedInputByteBufferNano p0){
       return new LiveCommonNoticeMessages$SCTopBannerBroadcastNotice().mergeFrom(p0);
    }
    public static LiveCommonNoticeMessages$SCTopBannerBroadcastNotice parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCommonNoticeMessages$SCTopBannerBroadcastNotice(), p0);
    }
    public LiveCommonNoticeMessages$SCTopBannerBroadcastNotice clear(){
       this.content = "";
       this.style = 0;
       this.priorityType = 0;
       this.backgroundColorBegin = "";
       this.backgroundColorEnd = "";
       this.enableWipe = false;
       this.iconUrl = "";
       this.routeType = 0;
       this.buttonContent = "";
       this.routeUrl = "";
       this.displayDurationMillis = 0;
       this.configBizId = "";
       this.extraInfo = "";
       this.bizId = 0;
       this.expiredTimestamp = 0;
       this.contentForA = "";
       this.contentForI = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.content).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.content);
       }
       LiveCommonNoticeMessages$SCTopBannerBroadcastNotice tstyle = this.style;
       if (tstyle != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tstyle);
       }
       tstyle = this.priorityType;
       if (tstyle != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tstyle);
       }
       if (!(this.backgroundColorBegin).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.backgroundColorBegin);
       }
       if (!(this.backgroundColorEnd).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.backgroundColorEnd);
       }
       tstyle = this.enableWipe;
       if (tstyle != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(6, tstyle);
       }
       if (!(this.iconUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.iconUrl);
       }
       tstyle = this.routeType;
       if (tstyle != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(8, tstyle);
       }
       if (!(this.buttonContent).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.buttonContent);
       }
       if (!(this.routeUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.routeUrl);
       }
       LiveCommonNoticeMessages$SCTopBannerBroadcastNotice tdisplayDura = this.displayDurationMillis;
       if (tdisplayDura) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(11, tdisplayDura);
       }
       if (!(this.configBizId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.configBizId);
       }
       if (!(this.extraInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(13, this.extraInfo);
       }
       tdisplayDura = this.bizId;
       if (tdisplayDura) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(14, tdisplayDura);
       }
       tdisplayDura = this.expiredTimestamp;
       if (tdisplayDura) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(15, tdisplayDura);
       }
       if (!(this.contentForA).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(16, this.contentForA);
       }
       if (!(this.contentForI).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(17, this.contentForI);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCommonNoticeMessages$SCTopBannerBroadcastNotice mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.content = p0.readString();
                break;
              case 16:
                this.style = p0.readUInt32();
                break;
              case 24:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != 3))) {
                   continue ;
                }else {
                   this.priorityType = i;
                }
                break;
              case '"':
                this.backgroundColorBegin = p0.readString();
                break;
              case '*':
                this.backgroundColorEnd = p0.readString();
                break;
              case '0':
                this.enableWipe = p0.readBool();
                break;
              case ':':
                this.iconUrl = p0.readString();
                break;
              case '@':
                this.routeType = p0.readUInt32();
                break;
              case 'J':
                this.buttonContent = p0.readString();
                break;
              case 'R':
                this.routeUrl = p0.readString();
                break;
              case 'X':
                this.displayDurationMillis = p0.readUInt64();
                break;
              case 'b':
                this.configBizId = p0.readString();
                break;
              case 'j':
                this.extraInfo = p0.readString();
                break;
              case 'p':
                this.bizId = p0.readUInt64();
                break;
              case 'x':
                this.expiredTimestamp = p0.readUInt64();
                break;
              case 130:
                this.contentForA = p0.readString();
                break;
              case 138:
                this.contentForI = p0.readString();
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
       if (!(this.content).equals(str)) {
          p0.writeString(1, this.content);
       }
       LiveCommonNoticeMessages$SCTopBannerBroadcastNotice tstyle = this.style;
       if (tstyle != null) {
          p0.writeUInt32(2, tstyle);
       }
       tstyle = this.priorityType;
       if (tstyle != null) {
          p0.writeInt32(3, tstyle);
       }
       if (!(this.backgroundColorBegin).equals(str)) {
          p0.writeString(4, this.backgroundColorBegin);
       }
       if (!(this.backgroundColorEnd).equals(str)) {
          p0.writeString(5, this.backgroundColorEnd);
       }
       tstyle = this.enableWipe;
       if (tstyle != null) {
          p0.writeBool(6, tstyle);
       }
       if (!(this.iconUrl).equals(str)) {
          p0.writeString(7, this.iconUrl);
       }
       tstyle = this.routeType;
       if (tstyle != null) {
          p0.writeUInt32(8, tstyle);
       }
       if (!(this.buttonContent).equals(str)) {
          p0.writeString(9, this.buttonContent);
       }
       if (!(this.routeUrl).equals(str)) {
          p0.writeString(10, this.routeUrl);
       }
       LiveCommonNoticeMessages$SCTopBannerBroadcastNotice tdisplayDura = this.displayDurationMillis;
       if (tdisplayDura) {
          p0.writeUInt64(11, tdisplayDura);
       }
       if (!(this.configBizId).equals(str)) {
          p0.writeString(12, this.configBizId);
       }
       if (!(this.extraInfo).equals(str)) {
          p0.writeString(13, this.extraInfo);
       }
       tdisplayDura = this.bizId;
       if (tdisplayDura) {
          p0.writeUInt64(14, tdisplayDura);
       }
       tdisplayDura = this.expiredTimestamp;
       if (tdisplayDura) {
          p0.writeUInt64(15, tdisplayDura);
       }
       if (!(this.contentForA).equals(str)) {
          p0.writeString(16, this.contentForA);
       }
       if (!(this.contentForI).equals(str)) {
          p0.writeString(17, this.contentForI);
       }
       super.writeTo(p0);
       return;
    }
}
