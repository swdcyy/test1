package com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$FeedLogContext;

public final class ClientContent$LiveStreamPackage extends MessageNano	// class@00128c
{
    public String aggregationSessionId;
    public String anchorUserId;
    public long audienceNumber;
    public String audienceNumberString;
    public int contentType;
    public String distince;
    public int entranceType;
    public int externalIcon;
    public ClientContent$FeedLogContext feedLogCtx;
    public boolean friend;
    public boolean fromLive;
    public String gameId;
    public String gameName;
    public String host;
    public String identity;
    public String ip;
    public boolean isAnchor;
    public boolean isNormalPlay;
    public boolean kuaishouMusician;
    public int liveFormat;
    public String liveIconReasonExtraInfo;
    public String liveIconReasonTextType;
    public String liveIconTextExtraInfo;
    public String liveIconTextType;
    public String liveIconType;
    public long liveOperationType;
    public String liveRecoLabel;
    public String liveStreamId;
    public int liveStyle;
    public boolean myFollow;
    public String name;
    public String port;
    public String recoText;
    public int referLiveSourceType;
    public String serverExpTag;
    public String sessionId;
    public long showIndexPlusOne;
    public int sourceType;
    public int sourceTypeNew;
    public String sourceUrl;
    public String url;
    public static ClientContent$LiveStreamPackage[] _emptyArray;

    public void ClientContent$LiveStreamPackage(){
       super();
       this.clear();
    }
    public static ClientContent$LiveStreamPackage[] emptyArray(){
       if (ClientContent$LiveStreamPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$LiveStreamPackage._emptyArray == null) {
             ClientContent$LiveStreamPackage[] liveStreamPa = new ClientContent$LiveStreamPackage[0];
             ClientContent$LiveStreamPackage._emptyArray = liveStreamPa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$LiveStreamPackage._emptyArray;
    }
    public static ClientContent$LiveStreamPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$LiveStreamPackage().mergeFrom(p0);
    }
    public static ClientContent$LiveStreamPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$LiveStreamPackage(), p0);
    }
    public ClientContent$LiveStreamPackage clear(){
       this.identity = "";
       this.name = "";
       this.host = "";
       this.port = "";
       this.url = "";
       this.ip = "";
       this.isAnchor = false;
       this.anchorUserId = "";
       this.audienceNumber = 0;
       this.gameId = "";
       this.gameName = "";
       this.liveStreamId = "";
       this.entranceType = 0;
       this.sourceType = 0;
       this.sourceUrl = "";
       this.sessionId = "";
       this.contentType = 0;
       this.sourceTypeNew = 0;
       this.distince = "";
       this.externalIcon = 0;
       this.friend = false;
       this.myFollow = false;
       this.audienceNumberString = "";
       this.serverExpTag = "";
       this.liveFormat = 0;
       this.kuaishouMusician = false;
       this.recoText = "";
       this.fromLive = false;
       this.showIndexPlusOne = 0;
       this.liveOperationType = 0;
       this.referLiveSourceType = 0;
       this.aggregationSessionId = "";
       this.liveIconType = "";
       this.liveRecoLabel = "";
       this.liveIconTextType = "";
       this.liveIconReasonTextType = "";
       this.liveIconReasonExtraInfo = "";
       this.liveIconTextExtraInfo = "";
       this.isNormalPlay = false;
       this.liveStyle = 0;
       this.feedLogCtx = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.identity).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.identity);
       }
       if (!(this.name).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.name);
       }
       if (!(this.host).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.host);
       }
       if (!(this.port).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.port);
       }
       if (!(this.url).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.url);
       }
       if (!(this.ip).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.ip);
       }
       ClientContent$LiveStreamPackage tisAnchor = this.isAnchor;
       if (tisAnchor != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(7, tisAnchor);
       }
       if (!(this.anchorUserId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.anchorUserId);
       }
       ClientContent$LiveStreamPackage taudienceNum = this.audienceNumber;
       if (taudienceNum) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(9, taudienceNum);
       }
       if (!(this.gameId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.gameId);
       }
       if (!(this.gameName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.gameName);
       }
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.liveStreamId);
       }
       tisAnchor = this.entranceType;
       if (tisAnchor != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(13, tisAnchor);
       }
       tisAnchor = this.sourceType;
       if (tisAnchor != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(14, tisAnchor);
       }
       if (!(this.sourceUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(15, this.sourceUrl);
       }
       if (!(this.sessionId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(16, this.sessionId);
       }
       tisAnchor = this.contentType;
       if (tisAnchor != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(17, tisAnchor);
       }
       tisAnchor = this.sourceTypeNew;
       if (tisAnchor != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(18, tisAnchor);
       }
       if (!(this.distince).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(19, this.distince);
       }
       tisAnchor = this.externalIcon;
       if (tisAnchor != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(20, tisAnchor);
       }
       tisAnchor = this.friend;
       if (tisAnchor != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(21, tisAnchor);
       }
       tisAnchor = this.myFollow;
       if (tisAnchor != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(22, tisAnchor);
       }
       if (!(this.audienceNumberString).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(23, this.audienceNumberString);
       }
       if (!(this.serverExpTag).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(24, this.serverExpTag);
       }
       tisAnchor = this.liveFormat;
       if (tisAnchor != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(25, tisAnchor);
       }
       tisAnchor = this.kuaishouMusician;
       if (tisAnchor != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(26, tisAnchor);
       }
       if (!(this.recoText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(27, this.recoText);
       }
       tisAnchor = this.fromLive;
       if (tisAnchor != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(28, tisAnchor);
       }
       taudienceNum = this.showIndexPlusOne;
       if (taudienceNum) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(29, taudienceNum);
       }
       taudienceNum = this.liveOperationType;
       if (taudienceNum) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(30, taudienceNum);
       }
       tisAnchor = this.referLiveSourceType;
       if (tisAnchor != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(31, tisAnchor);
       }
       if (!(this.aggregationSessionId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(32, this.aggregationSessionId);
       }
       if (!(this.liveIconType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(33, this.liveIconType);
       }
       if (!(this.liveRecoLabel).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(34, this.liveRecoLabel);
       }
       if (!(this.liveIconTextType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(35, this.liveIconTextType);
       }
       if (!(this.liveIconReasonTextType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(36, this.liveIconReasonTextType);
       }
       if (!(this.liveIconReasonExtraInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(37, this.liveIconReasonExtraInfo);
       }
       if (!(this.liveIconTextExtraInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(38, this.liveIconTextExtraInfo);
       }
       tisAnchor = this.isNormalPlay;
       if (tisAnchor != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(39, tisAnchor);
       }
       tisAnchor = this.liveStyle;
       if (tisAnchor != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(40, tisAnchor);
       }
       tisAnchor = this.feedLogCtx;
       if (tisAnchor != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(41, tisAnchor);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$LiveStreamPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          int i1 = 3;
          switch (i){
              case 0:
                return this;
              case 10:
                this.identity = p0.readString();
                break;
              case 18:
                this.name = p0.readString();
                break;
              case 26:
                this.host = p0.readString();
                break;
              case '"':
                this.port = p0.readString();
                break;
              case '*':
                this.url = p0.readString();
                break;
              case '2':
                this.ip = p0.readString();
                break;
              case '8':
                this.isAnchor = p0.readBool();
                break;
              case 'B':
                this.anchorUserId = p0.readString();
                break;
              case 'H':
                this.audienceNumber = p0.readUInt64();
                break;
              case 'R':
                this.gameId = p0.readString();
                break;
              case 'Z':
                this.gameName = p0.readString();
                break;
              case 'b':
                this.liveStreamId = p0.readString();
                break;
              case 'h':
                i = p0.readInt32();
                if (i && i != 1) {
                   continue ;
                }else {
                   this.entranceType = i;
                }
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
                    case 1:
                      break;
                    default:
                }
                this.sourceType = i;
                break;
              case 'z':
                this.sourceUrl = p0.readString();
                break;
              case 130:
                this.sessionId = p0.readString();
                break;
              case 136:
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
                    case 1:
                      break;
                    default:
                }
                this.contentType = i;
                break;
              case 144:
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
                    case 251:
                    case 252:
                    case 253:
                    case 254:
                    case 255:
                    case 256:
                    case 257:
                    case 258:
                    case 259:
                    case 260:
                    case 261:
                    case 262:
                    case 263:
                    case 264:
                    case 265:
                    case 266:
                    case 267:
                    case 268:
                    case 269:
                    case 270:
                    case 271:
                    case 272:
                    case 273:
                    case 274:
                    case 275:
                    case 276:
                    case 277:
                    case 278:
                    case 279:
                    case 280:
                    case 281:
                    case 282:
                    case 283:
                    case 284:
                    case 285:
                    case 286:
                    case 287:
                    case 288:
                    case 289:
                    case 290:
                    case 291:
                    case 292:
                    case 293:
                    case 294:
                    case 295:
                    case 296:
                    case 297:
                    case 298:
                    case 299:
                    case 300:
                    case 301:
                    case 302:
                    case 303:
                    case 304:
                    case 305:
                    case 306:
                    case 307:
                    case 308:
                    case 309:
                    case 310:
                    case 311:
                    case 312:
                    case 313:
                    case 314:
                    case 315:
                    case 316:
                    case 317:
                    case 318:
                    case 319:
                    case 320:
                    case 321:
                    case 322:
                    case 323:
                    case 324:
                    case 325:
                    case 326:
                    case 327:
                    case 328:
                    case 329:
                    case 330:
                    case 331:
                    case 332:
                    case 333:
                    case 334:
                    case 335:
                    case 336:
                    case 337:
                    case 338:
                    case 339:
                    case 340:
                    case 341:
                    case 342:
                    case 343:
                    case 1:
                      break;
                    default:
                }
                this.sourceTypeNew = i;
                break;
              case 154:
                this.distince = p0.readString();
                break;
              case 160:
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
                    case 1:
                      break;
                    default:
                }
                this.externalIcon = i;
                break;
              case 168:
                this.friend = p0.readBool();
                break;
              case 176:
                this.myFollow = p0.readBool();
                break;
              case 186:
                this.audienceNumberString = p0.readString();
                break;
              case 194:
                this.serverExpTag = p0.readString();
                break;
              case 200:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != i1))) {
                   continue ;
                }else {
                   this.liveFormat = i;
                }
                break;
              case 208:
                this.kuaishouMusician = p0.readBool();
                break;
              case 218:
                this.recoText = p0.readString();
                break;
              case 224:
                this.fromLive = p0.readBool();
                break;
              case 232:
                this.showIndexPlusOne = p0.readUInt64();
                break;
              case 240:
                this.liveOperationType = p0.readUInt64();
                break;
              case 248:
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
                    case 251:
                    case 252:
                    case 253:
                    case 254:
                    case 255:
                    case 256:
                    case 257:
                    case 258:
                    case 259:
                    case 260:
                    case 261:
                    case 262:
                    case 263:
                    case 264:
                    case 265:
                    case 266:
                    case 267:
                    case 268:
                    case 269:
                    case 270:
                    case 271:
                    case 272:
                    case 273:
                    case 274:
                    case 275:
                    case 276:
                    case 277:
                    case 278:
                    case 279:
                    case 280:
                    case 281:
                    case 282:
                    case 283:
                    case 284:
                    case 285:
                    case 286:
                    case 287:
                    case 288:
                    case 289:
                    case 290:
                    case 291:
                    case 292:
                    case 293:
                    case 294:
                    case 295:
                    case 296:
                    case 297:
                    case 298:
                    case 299:
                    case 300:
                    case 301:
                    case 302:
                    case 303:
                    case 304:
                    case 305:
                    case 306:
                    case 307:
                    case 308:
                    case 309:
                    case 310:
                    case 311:
                    case 312:
                    case 313:
                    case 314:
                    case 315:
                    case 316:
                    case 317:
                    case 318:
                    case 319:
                    case 320:
                    case 321:
                    case 322:
                    case 323:
                    case 324:
                    case 325:
                    case 326:
                    case 327:
                    case 328:
                    case 329:
                    case 330:
                    case 331:
                    case 332:
                    case 333:
                    case 334:
                    case 335:
                    case 336:
                    case 337:
                    case 338:
                    case 339:
                    case 340:
                    case 341:
                    case 342:
                    case 343:
                    case 1:
                      break;
                    default:
                }
                this.referLiveSourceType = i;
                break;
              case 258:
                this.aggregationSessionId = p0.readString();
                break;
              case 266:
                this.liveIconType = p0.readString();
                break;
              case 274:
                this.liveRecoLabel = p0.readString();
                break;
              case 282:
                this.liveIconTextType = p0.readString();
                break;
              case 290:
                this.liveIconReasonTextType = p0.readString();
                break;
              case 298:
                this.liveIconReasonExtraInfo = p0.readString();
                break;
              case 306:
                this.liveIconTextExtraInfo = p0.readString();
                break;
              case 312:
                this.isNormalPlay = p0.readBool();
                break;
              case 320:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != i1 && i != 4)))) {
                   continue ;
                }else {
                   this.liveStyle = i;
                }
                break;
              case 330:
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
       String str = "";
       if (!(this.identity).equals(str)) {
          p0.writeString(1, this.identity);
       }
       if (!(this.name).equals(str)) {
          p0.writeString(2, this.name);
       }
       if (!(this.host).equals(str)) {
          p0.writeString(3, this.host);
       }
       if (!(this.port).equals(str)) {
          p0.writeString(4, this.port);
       }
       if (!(this.url).equals(str)) {
          p0.writeString(5, this.url);
       }
       if (!(this.ip).equals(str)) {
          p0.writeString(6, this.ip);
       }
       ClientContent$LiveStreamPackage tisAnchor = this.isAnchor;
       if (tisAnchor != null) {
          p0.writeBool(7, tisAnchor);
       }
       if (!(this.anchorUserId).equals(str)) {
          p0.writeString(8, this.anchorUserId);
       }
       ClientContent$LiveStreamPackage taudienceNum = this.audienceNumber;
       if (taudienceNum) {
          p0.writeUInt64(9, taudienceNum);
       }
       if (!(this.gameId).equals(str)) {
          p0.writeString(10, this.gameId);
       }
       if (!(this.gameName).equals(str)) {
          p0.writeString(11, this.gameName);
       }
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(12, this.liveStreamId);
       }
       tisAnchor = this.entranceType;
       if (tisAnchor != null) {
          p0.writeInt32(13, tisAnchor);
       }
       tisAnchor = this.sourceType;
       if (tisAnchor != null) {
          p0.writeInt32(14, tisAnchor);
       }
       if (!(this.sourceUrl).equals(str)) {
          p0.writeString(15, this.sourceUrl);
       }
       if (!(this.sessionId).equals(str)) {
          p0.writeString(16, this.sessionId);
       }
       tisAnchor = this.contentType;
       if (tisAnchor != null) {
          p0.writeInt32(17, tisAnchor);
       }
       tisAnchor = this.sourceTypeNew;
       if (tisAnchor != null) {
          p0.writeInt32(18, tisAnchor);
       }
       if (!(this.distince).equals(str)) {
          p0.writeString(19, this.distince);
       }
       tisAnchor = this.externalIcon;
       if (tisAnchor != null) {
          p0.writeInt32(20, tisAnchor);
       }
       tisAnchor = this.friend;
       if (tisAnchor != null) {
          p0.writeBool(21, tisAnchor);
       }
       tisAnchor = this.myFollow;
       if (tisAnchor != null) {
          p0.writeBool(22, tisAnchor);
       }
       if (!(this.audienceNumberString).equals(str)) {
          p0.writeString(23, this.audienceNumberString);
       }
       if (!(this.serverExpTag).equals(str)) {
          p0.writeString(24, this.serverExpTag);
       }
       tisAnchor = this.liveFormat;
       if (tisAnchor != null) {
          p0.writeInt32(25, tisAnchor);
       }
       tisAnchor = this.kuaishouMusician;
       if (tisAnchor != null) {
          p0.writeBool(26, tisAnchor);
       }
       if (!(this.recoText).equals(str)) {
          p0.writeString(27, this.recoText);
       }
       tisAnchor = this.fromLive;
       if (tisAnchor != null) {
          p0.writeBool(28, tisAnchor);
       }
       taudienceNum = this.showIndexPlusOne;
       if (taudienceNum) {
          p0.writeUInt64(29, taudienceNum);
       }
       taudienceNum = this.liveOperationType;
       if (taudienceNum) {
          p0.writeUInt64(30, taudienceNum);
       }
       tisAnchor = this.referLiveSourceType;
       if (tisAnchor != null) {
          p0.writeInt32(31, tisAnchor);
       }
       if (!(this.aggregationSessionId).equals(str)) {
          p0.writeString(32, this.aggregationSessionId);
       }
       if (!(this.liveIconType).equals(str)) {
          p0.writeString(33, this.liveIconType);
       }
       if (!(this.liveRecoLabel).equals(str)) {
          p0.writeString(34, this.liveRecoLabel);
       }
       if (!(this.liveIconTextType).equals(str)) {
          p0.writeString(35, this.liveIconTextType);
       }
       if (!(this.liveIconReasonTextType).equals(str)) {
          p0.writeString(36, this.liveIconReasonTextType);
       }
       if (!(this.liveIconReasonExtraInfo).equals(str)) {
          p0.writeString(37, this.liveIconReasonExtraInfo);
       }
       if (!(this.liveIconTextExtraInfo).equals(str)) {
          p0.writeString(38, this.liveIconTextExtraInfo);
       }
       tisAnchor = this.isNormalPlay;
       if (tisAnchor != null) {
          p0.writeBool(39, tisAnchor);
       }
       tisAnchor = this.liveStyle;
       if (tisAnchor != null) {
          p0.writeInt32(40, tisAnchor);
       }
       tisAnchor = this.feedLogCtx;
       if (tisAnchor != null) {
          p0.writeMessage(41, tisAnchor);
       }
       super.writeTo(p0);
       return;
    }
}
