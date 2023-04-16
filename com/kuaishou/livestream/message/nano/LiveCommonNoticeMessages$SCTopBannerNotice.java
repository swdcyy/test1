package com.kuaishou.livestream.message.nano.LiveCommonNoticeMessages$SCTopBannerNotice;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveCommonNoticeMessages$SCTopBannerNotice extends MessageNano	// class@00115c
{
    public int actionType;
    public UserInfos$PicUrl[] backGroundPictureUrl;
    public String backgroundColor;
    public String backgroundColorBegin;
    public String backgroundColorEnd;
    public String backgroupColor;
    public long displayDurationMillis;
    public UserInfos$PicUrl[] displayIcon;
    public int displayIconHeightDp;
    public int displayIconWidthDp;
    public String extraInfo;
    public String link;
    public int priority;
    public int source;
    public String targetLiveStreamId;
    public UserInfos$UserInfo targetUserInfo;
    public String textColor;
    public String textContent;
    public int type;
    public static LiveCommonNoticeMessages$SCTopBannerNotice[] _emptyArray;

    public void LiveCommonNoticeMessages$SCTopBannerNotice(){
       super();
       this.clear();
    }
    public static LiveCommonNoticeMessages$SCTopBannerNotice[] emptyArray(){
       if (LiveCommonNoticeMessages$SCTopBannerNotice._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCommonNoticeMessages$SCTopBannerNotice._emptyArray == null) {
             LiveCommonNoticeMessages$SCTopBannerNotice[] sCTopBannerN = new LiveCommonNoticeMessages$SCTopBannerNotice[0];
             LiveCommonNoticeMessages$SCTopBannerNotice._emptyArray = sCTopBannerN;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCommonNoticeMessages$SCTopBannerNotice._emptyArray;
    }
    public static LiveCommonNoticeMessages$SCTopBannerNotice parseFrom(CodedInputByteBufferNano p0){
       return new LiveCommonNoticeMessages$SCTopBannerNotice().mergeFrom(p0);
    }
    public static LiveCommonNoticeMessages$SCTopBannerNotice parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCommonNoticeMessages$SCTopBannerNotice(), p0);
    }
    public LiveCommonNoticeMessages$SCTopBannerNotice clear(){
       this.backgroupColor = "";
       this.textColor = "";
       this.textContent = "";
       this.type = 0;
       this.backgroundColor = "";
       this.backgroundColorBegin = "";
       this.backgroundColorEnd = "";
       this.priority = 0;
       this.actionType = 0;
       this.targetUserInfo = null;
       this.targetLiveStreamId = "";
       this.displayIcon = UserInfos$PicUrl.emptyArray();
       this.backGroundPictureUrl = UserInfos$PicUrl.emptyArray();
       this.source = 0;
       this.displayDurationMillis = 0;
       this.displayIconWidthDp = 0;
       this.displayIconHeightDp = 0;
       this.link = "";
       this.extraInfo = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.backgroupColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.backgroupColor);
       }
       if (!(this.textColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.textColor);
       }
       if (!(this.textContent).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.textContent);
       }
       LiveCommonNoticeMessages$SCTopBannerNotice ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, ttype);
       }
       if (!(this.backgroundColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.backgroundColor);
       }
       if (!(this.backgroundColorBegin).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.backgroundColorBegin);
       }
       if (!(this.backgroundColorEnd).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.backgroundColorEnd);
       }
       ttype = this.priority;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(8, ttype);
       }
       ttype = this.actionType;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(9, ttype);
       }
       ttype = this.targetUserInfo;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(10, ttype);
       }
       if (!(this.targetLiveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.targetLiveStreamId);
       }
       ttype = this.displayIcon;
       int i1 = 0;
       if (ttype != null && ttype.length > 0) {
          int i2 = 0;
          LiveCommonNoticeMessages$SCTopBannerNotice tdisplayIcon = this.displayIcon;
          while (i2 < tdisplayIcon.length) {
             object oobject = tdisplayIcon[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(12, oobject);
             }
             i2 = i2 + 1;
          }
       }
       ttype = this.backGroundPictureUrl;
       if (ttype != null && ttype.length > 0) {
          ttype = this.backGroundPictureUrl;
          while (i1 < ttype.length) {
             object oobject1 = ttype[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(13, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       ttype = this.source;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(14, ttype);
       }
       LiveCommonNoticeMessages$SCTopBannerNotice tdisplayDura = this.displayDurationMillis;
       if (tdisplayDura) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(15, tdisplayDura);
       }
       ttype = this.displayIconWidthDp;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(16, ttype);
       }
       ttype = this.displayIconHeightDp;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(17, ttype);
       }
       if (!(this.link).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(18, this.link);
       }
       if (!(this.extraInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(19, this.extraInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCommonNoticeMessages$SCTopBannerNotice mergeFrom(CodedInputByteBufferNano p0){
       LiveCommonNoticeMessages$SCTopBannerNotice tdisplayIcon;
       int i2;
       UserInfos$PicUrl[] picUrlArray;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 10:
                this.backgroupColor = p0.readString();
                break;
              case 18:
                this.textColor = p0.readString();
                break;
              case 26:
                this.textContent = p0.readString();
                break;
              case 32:
                this.type = p0.readUInt32();
                break;
              case '*':
                this.backgroundColor = p0.readString();
                break;
              case '2':
                this.backgroundColorBegin = p0.readString();
                break;
              case ':':
                this.backgroundColorEnd = p0.readString();
                break;
              case '@':
                this.priority = p0.readUInt32();
                break;
              case 'H':
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
                   continue ;
                }else {
                   this.actionType = i;
                }
                break;
              case 'R':
                if (this.targetUserInfo == null) {
                   this.targetUserInfo = new UserInfos$UserInfo();
                }
                p0.readMessage(this.targetUserInfo);
                break;
              case 'Z':
                this.targetLiveStreamId = p0.readString();
                break;
              case 'b':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 98);
                tdisplayIcon = this.displayIcon;
                i2 = (tdisplayIcon == null)? 0: tdisplayIcon.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tdisplayIcon, i1, picUrlArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   picUrlArray[i2] = new UserInfos$PicUrl();
                   p0.readMessage(picUrlArray[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                picUrlArray[i2] = new UserInfos$PicUrl();
                p0.readMessage(picUrlArray[i2]);
                this.displayIcon = picUrlArray;
                break;
              case 'j':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 106);
                tdisplayIcon = this.backGroundPictureUrl;
                i2 = (tdisplayIcon == null)? 0: tdisplayIcon.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tdisplayIcon, i1, picUrlArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   picUrlArray[i2] = new UserInfos$PicUrl();
                   p0.readMessage(picUrlArray[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                picUrlArray[i2] = new UserInfos$PicUrl();
                p0.readMessage(picUrlArray[i2]);
                this.backGroundPictureUrl = picUrlArray;
                break;
              case 'p':
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
                this.source = i;
                break;
              case 'x':
                this.displayDurationMillis = p0.readUInt64();
                break;
              case 128:
                this.displayIconWidthDp = p0.readUInt32();
                break;
              case 136:
                this.displayIconHeightDp = p0.readUInt32();
                break;
              case 146:
                this.link = p0.readString();
                break;
              case 154:
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
       if (!(this.backgroupColor).equals(str)) {
          p0.writeString(1, this.backgroupColor);
       }
       if (!(this.textColor).equals(str)) {
          p0.writeString(2, this.textColor);
       }
       if (!(this.textContent).equals(str)) {
          p0.writeString(3, this.textContent);
       }
       LiveCommonNoticeMessages$SCTopBannerNotice ttype = this.type;
       if (ttype != null) {
          p0.writeUInt32(4, ttype);
       }
       if (!(this.backgroundColor).equals(str)) {
          p0.writeString(5, this.backgroundColor);
       }
       if (!(this.backgroundColorBegin).equals(str)) {
          p0.writeString(6, this.backgroundColorBegin);
       }
       if (!(this.backgroundColorEnd).equals(str)) {
          p0.writeString(7, this.backgroundColorEnd);
       }
       ttype = this.priority;
       if (ttype != null) {
          p0.writeUInt32(8, ttype);
       }
       ttype = this.actionType;
       if (ttype != null) {
          p0.writeInt32(9, ttype);
       }
       ttype = this.targetUserInfo;
       if (ttype != null) {
          p0.writeMessage(10, ttype);
       }
       if (!(this.targetLiveStreamId).equals(str)) {
          p0.writeString(11, this.targetLiveStreamId);
       }
       ttype = this.displayIcon;
       int i = 0;
       if (ttype != null && ttype.length > 0) {
          int i1 = 0;
          LiveCommonNoticeMessages$SCTopBannerNotice tdisplayIcon = this.displayIcon;
          while (i1 < tdisplayIcon.length) {
             object oobject = tdisplayIcon[i1];
             if (oobject != null) {
                p0.writeMessage(12, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ttype = this.backGroundPictureUrl;
       if (ttype != null && ttype.length > 0) {
          ttype = this.backGroundPictureUrl;
          while (i < ttype.length) {
             object oobject1 = ttype[i];
             if (oobject1 != null) {
                p0.writeMessage(13, oobject1);
             }
             i = i + 1;
          }
       }
       ttype = this.source;
       if (ttype != null) {
          p0.writeInt32(14, ttype);
       }
       LiveCommonNoticeMessages$SCTopBannerNotice tdisplayDura = this.displayDurationMillis;
       if (tdisplayDura) {
          p0.writeUInt64(15, tdisplayDura);
       }
       ttype = this.displayIconWidthDp;
       if (ttype != null) {
          p0.writeUInt32(16, ttype);
       }
       ttype = this.displayIconHeightDp;
       if (ttype != null) {
          p0.writeUInt32(17, ttype);
       }
       if (!(this.link).equals(str)) {
          p0.writeString(18, this.link);
       }
       if (!(this.extraInfo).equals(str)) {
          p0.writeString(19, this.extraInfo);
       }
       super.writeTo(p0);
       return;
    }
}
