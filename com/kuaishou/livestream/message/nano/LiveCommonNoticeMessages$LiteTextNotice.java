package com.kuaishou.livestream.message.nano.LiveCommonNoticeMessages$LiteTextNotice;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveCommonNoticeMessages$LiteTextNotice extends MessageNano	// class@001153
{
    public String animationString;
    public String backgroundColorBegin;
    public String backgroundColorEnd;
    public int bizType;
    public long displayDelayMillis;
    public long displayDurationMillis;
    public int displayPriority;
    public long endTimestamp;
    public boolean needForceDisplay;
    public boolean needUpdateDisplayDuration;
    public String routeUrl;
    public long startTimestamp;
    public String textColor;
    public String textContent;
    public static LiveCommonNoticeMessages$LiteTextNotice[] _emptyArray;

    public void LiveCommonNoticeMessages$LiteTextNotice(){
       super();
       this.clear();
    }
    public static LiveCommonNoticeMessages$LiteTextNotice[] emptyArray(){
       if (LiveCommonNoticeMessages$LiteTextNotice._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCommonNoticeMessages$LiteTextNotice._emptyArray == null) {
             LiveCommonNoticeMessages$LiteTextNotice[] liteTextNoti = new LiveCommonNoticeMessages$LiteTextNotice[0];
             LiveCommonNoticeMessages$LiteTextNotice._emptyArray = liteTextNoti;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCommonNoticeMessages$LiteTextNotice._emptyArray;
    }
    public static LiveCommonNoticeMessages$LiteTextNotice parseFrom(CodedInputByteBufferNano p0){
       return new LiveCommonNoticeMessages$LiteTextNotice().mergeFrom(p0);
    }
    public static LiveCommonNoticeMessages$LiteTextNotice parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCommonNoticeMessages$LiteTextNotice(), p0);
    }
    public LiveCommonNoticeMessages$LiteTextNotice clear(){
       this.textContent = "";
       this.textColor = "";
       this.backgroundColorBegin = "";
       this.backgroundColorEnd = "";
       this.displayDurationMillis = 0;
       this.bizType = 0;
       this.routeUrl = "";
       this.startTimestamp = 0;
       this.endTimestamp = 0;
       this.displayPriority = 0;
       this.needForceDisplay = false;
       this.needUpdateDisplayDuration = false;
       this.displayDelayMillis = 0;
       this.animationString = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.textContent).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.textContent);
       }
       if (!(this.textColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.textColor);
       }
       if (!(this.backgroundColorBegin).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.backgroundColorBegin);
       }
       if (!(this.backgroundColorEnd).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.backgroundColorEnd);
       }
       LiveCommonNoticeMessages$LiteTextNotice tdisplayDura = this.displayDurationMillis;
       if (tdisplayDura) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tdisplayDura);
       }
       LiveCommonNoticeMessages$LiteTextNotice tbizType = this.bizType;
       if (tbizType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, tbizType);
       }
       if (!(this.routeUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.routeUrl);
       }
       tdisplayDura = this.startTimestamp;
       if (tdisplayDura) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, tdisplayDura);
       }
       tdisplayDura = this.endTimestamp;
       if (tdisplayDura) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(9, tdisplayDura);
       }
       tbizType = this.displayPriority;
       if (tbizType != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(10, tbizType);
       }
       tbizType = this.needForceDisplay;
       if (tbizType != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(11, tbizType);
       }
       tbizType = this.needUpdateDisplayDuration;
       if (tbizType != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(12, tbizType);
       }
       tdisplayDura = this.displayDelayMillis;
       if (tdisplayDura) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(13, tdisplayDura);
       }
       if (!(this.animationString).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(14, this.animationString);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCommonNoticeMessages$LiteTextNotice mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.textContent = p0.readString();
                break;
              case 18:
                this.textColor = p0.readString();
                break;
              case 26:
                this.backgroundColorBegin = p0.readString();
                break;
              case '"':
                this.backgroundColorEnd = p0.readString();
                break;
              case '(':
                this.displayDurationMillis = p0.readUInt64();
                break;
              case '0':
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
                this.bizType = i;
                break;
              case ':':
                this.routeUrl = p0.readString();
                break;
              case '@':
                this.startTimestamp = p0.readUInt64();
                break;
              case 'H':
                this.endTimestamp = p0.readUInt64();
                break;
              case 'P':
                this.displayPriority = p0.readUInt32();
                break;
              case 'X':
                this.needForceDisplay = p0.readBool();
                break;
              case '`':
                this.needUpdateDisplayDuration = p0.readBool();
                break;
              case 'h':
                this.displayDelayMillis = p0.readUInt64();
                break;
              case 'r':
                this.animationString = p0.readString();
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
       if (!(this.textContent).equals(str)) {
          p0.writeString(1, this.textContent);
       }
       if (!(this.textColor).equals(str)) {
          p0.writeString(2, this.textColor);
       }
       if (!(this.backgroundColorBegin).equals(str)) {
          p0.writeString(3, this.backgroundColorBegin);
       }
       if (!(this.backgroundColorEnd).equals(str)) {
          p0.writeString(4, this.backgroundColorEnd);
       }
       LiveCommonNoticeMessages$LiteTextNotice tdisplayDura = this.displayDurationMillis;
       if (tdisplayDura) {
          p0.writeUInt64(5, tdisplayDura);
       }
       LiveCommonNoticeMessages$LiteTextNotice tbizType = this.bizType;
       if (tbizType != null) {
          p0.writeInt32(6, tbizType);
       }
       if (!(this.routeUrl).equals(str)) {
          p0.writeString(7, this.routeUrl);
       }
       tdisplayDura = this.startTimestamp;
       if (tdisplayDura) {
          p0.writeUInt64(8, tdisplayDura);
       }
       tdisplayDura = this.endTimestamp;
       if (tdisplayDura) {
          p0.writeUInt64(9, tdisplayDura);
       }
       tbizType = this.displayPriority;
       if (tbizType != null) {
          p0.writeUInt32(10, tbizType);
       }
       tbizType = this.needForceDisplay;
       if (tbizType != null) {
          p0.writeBool(11, tbizType);
       }
       tbizType = this.needUpdateDisplayDuration;
       if (tbizType != null) {
          p0.writeBool(12, tbizType);
       }
       tdisplayDura = this.displayDelayMillis;
       if (tdisplayDura) {
          p0.writeUInt64(13, tdisplayDura);
       }
       if (!(this.animationString).equals(str)) {
          p0.writeString(14, this.animationString);
       }
       super.writeTo(p0);
       return;
    }
}
