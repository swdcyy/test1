package com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$KwaiMusicStationPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContentWrapper$KwaiMusicStationPackage extends MessageNano	// class@001318
{
    public String authorId;
    public String detailType;
    public int feedType;
    public boolean isEnterSelected;
    public int likeStatus;
    public boolean missionCompleteStatus;
    public String missionId;
    public String musicName;
    public String photoId;
    public int sourceType;
    public int tabType;
    public long totalConsumeDuration;
    public String type;
    public int userBehaveMoment;
    public static ClientContentWrapper$KwaiMusicStationPackage[] _emptyArray;

    public void ClientContentWrapper$KwaiMusicStationPackage(){
       super();
       this.clear();
    }
    public static ClientContentWrapper$KwaiMusicStationPackage[] emptyArray(){
       if (ClientContentWrapper$KwaiMusicStationPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContentWrapper$KwaiMusicStationPackage._emptyArray == null) {
             ClientContentWrapper$KwaiMusicStationPackage[] kwaiMusicSta = new ClientContentWrapper$KwaiMusicStationPackage[0];
             ClientContentWrapper$KwaiMusicStationPackage._emptyArray = kwaiMusicSta;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContentWrapper$KwaiMusicStationPackage._emptyArray;
    }
    public static ClientContentWrapper$KwaiMusicStationPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContentWrapper$KwaiMusicStationPackage().mergeFrom(p0);
    }
    public static ClientContentWrapper$KwaiMusicStationPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContentWrapper$KwaiMusicStationPackage(), p0);
    }
    public ClientContentWrapper$KwaiMusicStationPackage clear(){
       this.type = "";
       this.authorId = "";
       this.photoId = "";
       this.musicName = "";
       this.detailType = "";
       this.feedType = 0;
       this.sourceType = 0;
       this.tabType = 0;
       this.likeStatus = 0;
       this.userBehaveMoment = 0;
       this.totalConsumeDuration = 0;
       this.missionId = "";
       this.missionCompleteStatus = false;
       this.isEnterSelected = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.type).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.type);
       }
       if (!(this.authorId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.authorId);
       }
       if (!(this.photoId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.photoId);
       }
       if (!(this.musicName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.musicName);
       }
       if (!(this.detailType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.detailType);
       }
       ClientContentWrapper$KwaiMusicStationPackage tKwaiMusicSt = this.feedType;
       if (tKwaiMusicSt != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, tKwaiMusicSt);
       }
       tKwaiMusicSt = this.sourceType;
       if (tKwaiMusicSt != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(7, tKwaiMusicSt);
       }
       tKwaiMusicSt = this.tabType;
       if (tKwaiMusicSt != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(8, tKwaiMusicSt);
       }
       tKwaiMusicSt = this.likeStatus;
       if (tKwaiMusicSt != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(9, tKwaiMusicSt);
       }
       tKwaiMusicSt = this.userBehaveMoment;
       if (tKwaiMusicSt != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(10, tKwaiMusicSt);
       }
       ClientContentWrapper$KwaiMusicStationPackage ttotalConsum = this.totalConsumeDuration;
       if (ttotalConsum) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(11, ttotalConsum);
       }
       if (!(this.missionId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.missionId);
       }
       tKwaiMusicSt = this.missionCompleteStatus;
       if (tKwaiMusicSt != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(13, tKwaiMusicSt);
       }
       tKwaiMusicSt = this.isEnterSelected;
       if (tKwaiMusicSt != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(14, tKwaiMusicSt);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContentWrapper$KwaiMusicStationPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          int i1 = 2;
          switch (i){
              case 0:
                return this;
              case 10:
                this.type = p0.readString();
                break;
              case 18:
                this.authorId = p0.readString();
                break;
              case 26:
                this.photoId = p0.readString();
                break;
              case '"':
                this.musicName = p0.readString();
                break;
              case '*':
                this.detailType = p0.readString();
                break;
              case '0':
                i = p0.readInt32();
                if (i && (i != 1 && i != i1)) {
                   continue ;
                }else {
                   this.feedType = i;
                }
                break;
              case '8':
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
                this.sourceType = i;
                break;
              case '@':
                i = p0.readInt32();
                if (i && (i != 1 && i != i1)) {
                   continue ;
                }else {
                   this.tabType = i;
                }
                break;
              case 'H':
                i = p0.readInt32();
                if (i && (i != 1 && i != i1)) {
                   continue ;
                }else {
                   this.likeStatus = i;
                }
                break;
              case 'P':
                i = p0.readInt32();
                if (i && (i != 1 && (i != i1 && i != 3))) {
                   continue ;
                }else {
                   this.userBehaveMoment = i;
                }
                break;
              case 'X':
                this.totalConsumeDuration = p0.readUInt64();
                break;
              case 'b':
                this.missionId = p0.readString();
                break;
              case 'h':
                this.missionCompleteStatus = p0.readBool();
                break;
              case 'p':
                this.isEnterSelected = p0.readBool();
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
       if (!(this.type).equals(str)) {
          p0.writeString(1, this.type);
       }
       if (!(this.authorId).equals(str)) {
          p0.writeString(2, this.authorId);
       }
       if (!(this.photoId).equals(str)) {
          p0.writeString(3, this.photoId);
       }
       if (!(this.musicName).equals(str)) {
          p0.writeString(4, this.musicName);
       }
       if (!(this.detailType).equals(str)) {
          p0.writeString(5, this.detailType);
       }
       ClientContentWrapper$KwaiMusicStationPackage tKwaiMusicSt = this.feedType;
       if (tKwaiMusicSt != null) {
          p0.writeInt32(6, tKwaiMusicSt);
       }
       tKwaiMusicSt = this.sourceType;
       if (tKwaiMusicSt != null) {
          p0.writeInt32(7, tKwaiMusicSt);
       }
       tKwaiMusicSt = this.tabType;
       if (tKwaiMusicSt != null) {
          p0.writeInt32(8, tKwaiMusicSt);
       }
       tKwaiMusicSt = this.likeStatus;
       if (tKwaiMusicSt != null) {
          p0.writeInt32(9, tKwaiMusicSt);
       }
       tKwaiMusicSt = this.userBehaveMoment;
       if (tKwaiMusicSt != null) {
          p0.writeInt32(10, tKwaiMusicSt);
       }
       ClientContentWrapper$KwaiMusicStationPackage ttotalConsum = this.totalConsumeDuration;
       if (ttotalConsum) {
          p0.writeUInt64(11, ttotalConsum);
       }
       if (!(this.missionId).equals(str)) {
          p0.writeString(12, this.missionId);
       }
       tKwaiMusicSt = this.missionCompleteStatus;
       if (tKwaiMusicSt != null) {
          p0.writeBool(13, tKwaiMusicSt);
       }
       tKwaiMusicSt = this.isEnterSelected;
       if (tKwaiMusicSt != null) {
          p0.writeBool(14, tKwaiMusicSt);
       }
       super.writeTo(p0);
       return;
    }
}
