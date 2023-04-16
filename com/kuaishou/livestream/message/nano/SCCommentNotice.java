package com.kuaishou.livestream.message.nano.SCCommentNotice;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.CommentNoticeButton;
import com.kuaishou.livestream.message.nano.ClickCommentNoticeEvent;
import java.lang.System;

public final class SCCommentNotice extends MessageNano	// class@0013f0
{
    public String bizId;
    public int bizType;
    public CommentNoticeButton button;
    public ClickCommentNoticeEvent clickEvent;
    public CommentNoticeButton clickedButton;
    public String clickedDesc;
    public long clickedDisplayDurationMs;
    public String clickedSubTitle;
    public String clickedTitle;
    public UserInfos$PicUrl[] commentNoticePicUrl;
    public String commonGuideSubBizType;
    public long delayDisplayMs;
    public String desc;
    public long displayDurationMs;
    public long displayEndTime;
    public int enableLiveModel;
    public String extraInfo;
    public boolean noticePicIsSquare;
    public int priority;
    public String subTitle;
    public String targetLiveStreamId;
    public String title;
    public UserInfos$PicUrl[] titleIcon;
    public int totalShowTimes;
    public int type;
    public static SCCommentNotice[] _emptyArray;

    public void SCCommentNotice(){
       super();
       this.clear();
    }
    public static SCCommentNotice[] emptyArray(){
       if (SCCommentNotice._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCCommentNotice._emptyArray == null) {
             SCCommentNotice[] sCCommentNot = new SCCommentNotice[0];
             SCCommentNotice._emptyArray = sCCommentNot;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCCommentNotice._emptyArray;
    }
    public static SCCommentNotice parseFrom(CodedInputByteBufferNano p0){
       return new SCCommentNotice().mergeFrom(p0);
    }
    public static SCCommentNotice parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCCommentNotice(), p0);
    }
    public SCCommentNotice clear(){
       this.type = 0;
       this.bizId = "";
       this.commentNoticePicUrl = UserInfos$PicUrl.emptyArray();
       this.desc = "";
       this.displayDurationMs = 0;
       this.title = "";
       this.totalShowTimes = 0;
       this.extraInfo = "";
       this.titleIcon = UserInfos$PicUrl.emptyArray();
       this.subTitle = "";
       this.button = null;
       this.clickEvent = null;
       this.bizType = 0;
       this.noticePicIsSquare = false;
       this.priority = 0;
       this.targetLiveStreamId = "";
       this.delayDisplayMs = 0;
       this.displayEndTime = 0;
       this.clickedDesc = "";
       this.clickedTitle = "";
       this.clickedSubTitle = "";
       this.clickedDisplayDurationMs = 0;
       this.clickedButton = null;
       this.commonGuideSubBizType = "";
       this.enableLiveModel = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       SCCommentNotice tcommentNoti;
       int i = super.computeSerializedSize();
       SCCommentNotice ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ttype);
       }
       String str = "";
       if (!(this.bizId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.bizId);
       }
       ttype = this.commentNoticePicUrl;
       int i1 = 0;
       if (ttype != null && ttype.length > 0) {
          int i2 = 0;
          tcommentNoti = this.commentNoticePicUrl;
          while (i2 < tcommentNoti.length) {
             object oobject = tcommentNoti[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i2 = i2 + 1;
          }
       }
       if (!(this.desc).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.desc);
       }
       tcommentNoti = this.displayDurationMs;
       if (tcommentNoti) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tcommentNoti);
       }
       if (!(this.title).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.title);
       }
       ttype = this.totalShowTimes;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, ttype);
       }
       if (!(this.extraInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.extraInfo);
       }
       ttype = this.titleIcon;
       if (ttype != null && ttype.length > 0) {
          ttype = this.titleIcon;
          while (i1 < ttype.length) {
             object oobject1 = ttype[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(9, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.subTitle).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.subTitle);
       }
       ttype = this.button;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(11, ttype);
       }
       ttype = this.clickEvent;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(12, ttype);
       }
       ttype = this.bizType;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(13, ttype);
       }
       ttype = this.noticePicIsSquare;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(14, ttype);
       }
       ttype = this.priority;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(15, ttype);
       }
       if (!(this.targetLiveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(16, this.targetLiveStreamId);
       }
       SCCommentNotice tdelayDispla = this.delayDisplayMs;
       if (tdelayDispla) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(17, tdelayDispla);
       }
       tdelayDispla = this.displayEndTime;
       if (tdelayDispla) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(18, tdelayDispla);
       }
       if (!(this.clickedDesc).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(19, this.clickedDesc);
       }
       if (!(this.clickedTitle).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(20, this.clickedTitle);
       }
       if (!(this.clickedSubTitle).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(21, this.clickedSubTitle);
       }
       tdelayDispla = this.clickedDisplayDurationMs;
       if (tdelayDispla) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(22, tdelayDispla);
       }
       ttype = this.clickedButton;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(23, ttype);
       }
       if (!(this.commonGuideSubBizType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(24, this.commonGuideSubBizType);
       }
       ttype = this.enableLiveModel;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(25, ttype);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCCommentNotice mergeFrom(CodedInputByteBufferNano p0){
       SCCommentNotice tcommentNoti;
       int i2;
       UserInfos$PicUrl[] picUrlArray;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
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
                    case 1:
                      break;
                    default:
                      switch (i){
                          case 'd':
                          case 'f':
                          case 'g':
                          case 'h':
                          case 'i':
                          case 'j':
                          case 'e':
                            break;
                          default:
                            switch (i){
                                case 200:
                                case 202:
                                case 203:
                                case 201:
                                  break;
                                default:
                            }
                            this.type = i;
                      }
                }
                break;
              case 18:
                this.bizId = p0.readString();
                break;
              case 26:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 26);
                tcommentNoti = this.commentNoticePicUrl;
                i2 = (tcommentNoti == null)? 0: tcommentNoti.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tcommentNoti, i1, picUrlArray, i1, i2);
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
                this.commentNoticePicUrl = picUrlArray;
                break;
              case '"':
                this.desc = p0.readString();
                break;
              case '(':
                this.displayDurationMs = p0.readUInt64();
                break;
              case '2':
                this.title = p0.readString();
                break;
              case '8':
                this.totalShowTimes = p0.readUInt32();
                break;
              case 'B':
                this.extraInfo = p0.readString();
                break;
              case 'J':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 74);
                tcommentNoti = this.titleIcon;
                i2 = (tcommentNoti == null)? 0: tcommentNoti.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tcommentNoti, i1, picUrlArray, i1, i2);
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
                this.titleIcon = picUrlArray;
                break;
              case 'R':
                this.subTitle = p0.readString();
                break;
              case 'Z':
                if (this.button == null) {
                   this.button = new CommentNoticeButton();
                }
                p0.readMessage(this.button);
                break;
              case 'b':
                if (this.clickEvent == null) {
                   this.clickEvent = new ClickCommentNoticeEvent();
                }
                p0.readMessage(this.clickEvent);
                break;
              case 'h':
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
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                    case 131:
                    case 132:
                    case 133:
                    case 134:
                    case 135:
                    case 136:
                    case 137:
                    case 138:
                    case 139:
                    case 140:
                    case 141:
                    case 142:
                    case 143:
                    case 144:
                    case 145:
                    case 146:
                    case 147:
                    case 148:
                    case 149:
                    case 150:
                    case 151:
                    case 152:
                    case 153:
                    case 154:
                    case 155:
                    case 156:
                    case 157:
                    case 158:
                    case 159:
                    case 160:
                    case 161:
                    case 162:
                    case 163:
                    case 164:
                    case 165:
                    case 166:
                    case 167:
                    case 168:
                    case 169:
                    case 170:
                    case 171:
                    case 172:
                    case 173:
                    case 174:
                    case 175:
                    case 176:
                    case 177:
                    case 178:
                    case 179:
                    case 180:
                    case 181:
                    case 182:
                    case 183:
                    case 184:
                    case 185:
                    case 186:
                    case 187:
                    case 188:
                    case 189:
                    case 190:
                    case 191:
                    case 192:
                    case 193:
                    case 194:
                    case 195:
                    case 196:
                    case 197:
                    case 198:
                    case 199:
                    case 200:
                    case 201:
                    case 202:
                    case 203:
                    case 204:
                    case 205:
                    case 206:
                    case 207:
                    case 208:
                    case 209:
                    case 210:
                    case 211:
                    case 212:
                    case 213:
                    case 214:
                    case 215:
                    case 216:
                    case 217:
                    case 218:
                    case 219:
                    case 220:
                    case 221:
                    case 222:
                    case 223:
                    case 224:
                    case 225:
                    case 226:
                    case 227:
                    case 228:
                    case 229:
                    case 230:
                    case 231:
                    case 232:
                    case 233:
                    case 234:
                    case 235:
                    case 236:
                    case 237:
                    case 238:
                    case 239:
                    case 240:
                    case 241:
                    case 242:
                    case 243:
                    case 244:
                    case 245:
                    case 246:
                    case 247:
                    case 248:
                    case 249:
                    case 250:
                    case 1:
                      break;
                    default:
                }
                this.bizType = i;
                break;
              case 'p':
                this.noticePicIsSquare = p0.readBool();
                break;
              case 'x':
                this.priority = p0.readUInt32();
                break;
              case 130:
                this.targetLiveStreamId = p0.readString();
                break;
              case 136:
                this.delayDisplayMs = p0.readUInt64();
                break;
              case 144:
                this.displayEndTime = p0.readUInt64();
                break;
              case 154:
                this.clickedDesc = p0.readString();
                break;
              case 162:
                this.clickedTitle = p0.readString();
                break;
              case 170:
                this.clickedSubTitle = p0.readString();
                break;
              case 176:
                this.clickedDisplayDurationMs = p0.readUInt64();
                break;
              case 186:
                if (this.clickedButton == null) {
                   this.clickedButton = new CommentNoticeButton();
                }
                p0.readMessage(this.clickedButton);
                break;
              case 194:
                this.commonGuideSubBizType = p0.readString();
                break;
              case 200:
                this.enableLiveModel = p0.readInt32();
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
       SCCommentNotice tcommentNoti;
       SCCommentNotice ttype = this.type;
       if (ttype != null) {
          p0.writeInt32(1, ttype);
       }
       String str = "";
       if (!(this.bizId).equals(str)) {
          p0.writeString(2, this.bizId);
       }
       ttype = this.commentNoticePicUrl;
       int i = 0;
       if (ttype != null && ttype.length > 0) {
          int i1 = 0;
          tcommentNoti = this.commentNoticePicUrl;
          while (i1 < tcommentNoti.length) {
             object oobject = tcommentNoti[i1];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.desc).equals(str)) {
          p0.writeString(4, this.desc);
       }
       tcommentNoti = this.displayDurationMs;
       if (tcommentNoti) {
          p0.writeUInt64(5, tcommentNoti);
       }
       if (!(this.title).equals(str)) {
          p0.writeString(6, this.title);
       }
       ttype = this.totalShowTimes;
       if (ttype != null) {
          p0.writeUInt32(7, ttype);
       }
       if (!(this.extraInfo).equals(str)) {
          p0.writeString(8, this.extraInfo);
       }
       ttype = this.titleIcon;
       if (ttype != null && ttype.length > 0) {
          ttype = this.titleIcon;
          while (i < ttype.length) {
             object oobject1 = ttype[i];
             if (oobject1 != null) {
                p0.writeMessage(9, oobject1);
             }
             i = i + 1;
          }
       }
       if (!(this.subTitle).equals(str)) {
          p0.writeString(10, this.subTitle);
       }
       ttype = this.button;
       if (ttype != null) {
          p0.writeMessage(11, ttype);
       }
       ttype = this.clickEvent;
       if (ttype != null) {
          p0.writeMessage(12, ttype);
       }
       ttype = this.bizType;
       if (ttype != null) {
          p0.writeInt32(13, ttype);
       }
       ttype = this.noticePicIsSquare;
       if (ttype != null) {
          p0.writeBool(14, ttype);
       }
       ttype = this.priority;
       if (ttype != null) {
          p0.writeUInt32(15, ttype);
       }
       if (!(this.targetLiveStreamId).equals(str)) {
          p0.writeString(16, this.targetLiveStreamId);
       }
       SCCommentNotice tdelayDispla = this.delayDisplayMs;
       if (tdelayDispla) {
          p0.writeUInt64(17, tdelayDispla);
       }
       tdelayDispla = this.displayEndTime;
       if (tdelayDispla) {
          p0.writeUInt64(18, tdelayDispla);
       }
       if (!(this.clickedDesc).equals(str)) {
          p0.writeString(19, this.clickedDesc);
       }
       if (!(this.clickedTitle).equals(str)) {
          p0.writeString(20, this.clickedTitle);
       }
       if (!(this.clickedSubTitle).equals(str)) {
          p0.writeString(21, this.clickedSubTitle);
       }
       tdelayDispla = this.clickedDisplayDurationMs;
       if (tdelayDispla) {
          p0.writeUInt64(22, tdelayDispla);
       }
       ttype = this.clickedButton;
       if (ttype != null) {
          p0.writeMessage(23, ttype);
       }
       if (!(this.commonGuideSubBizType).equals(str)) {
          p0.writeString(24, this.commonGuideSubBizType);
       }
       ttype = this.enableLiveModel;
       if (ttype != null) {
          p0.writeInt32(25, ttype);
       }
       super.writeTo(p0);
       return;
    }
}
