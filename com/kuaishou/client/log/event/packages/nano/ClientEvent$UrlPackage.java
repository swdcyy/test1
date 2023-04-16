package com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTransList;

public final class ClientEvent$UrlPackage extends MessageNano	// class@000777
{
    public int category;
    public boolean coPage;
    public String entryPageId;
    public String entryPageSource;
    public ClientEvent$ExpTagTransList expTagList;
    public String identity;
    public int page;
    public String page2;
    public int pageSeq;
    public int pageType;
    public String params;
    public String subPages;
    public String topPage;
    public String userRouteTrace;
    public static ClientEvent$UrlPackage[] _emptyArray;

    public void ClientEvent$UrlPackage(){
       super();
       this.clear();
    }
    public static ClientEvent$UrlPackage[] emptyArray(){
       if (ClientEvent$UrlPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientEvent$UrlPackage._emptyArray == null) {
             ClientEvent$UrlPackage[] urlPackageAr = new ClientEvent$UrlPackage[0];
             ClientEvent$UrlPackage._emptyArray = urlPackageAr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientEvent$UrlPackage._emptyArray;
    }
    public static ClientEvent$UrlPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientEvent$UrlPackage().mergeFrom(p0);
    }
    public static ClientEvent$UrlPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientEvent$UrlPackage(), p0);
    }
    public ClientEvent$UrlPackage clear(){
       this.category = 0;
       this.page = 0;
       this.subPages = "";
       this.params = "";
       this.identity = "";
       this.pageSeq = 0;
       this.entryPageId = "";
       this.entryPageSource = "";
       this.expTagList = null;
       this.pageType = 0;
       this.page2 = "";
       this.topPage = "";
       this.userRouteTrace = "";
       this.coPage = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientEvent$UrlPackage tcategory = this.category;
       if (tcategory != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tcategory);
       }
       tcategory = this.page;
       if (tcategory != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tcategory);
       }
       String str = "";
       if (!(this.subPages).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.subPages);
       }
       if (!(this.params).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.params);
       }
       if (!(this.identity).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.identity);
       }
       tcategory = this.pageSeq;
       if (tcategory != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, tcategory);
       }
       if (!(this.entryPageId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.entryPageId);
       }
       if (!(this.entryPageSource).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.entryPageSource);
       }
       tcategory = this.expTagList;
       if (tcategory != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(9, tcategory);
       }
       tcategory = this.pageType;
       if (tcategory != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(10, tcategory);
       }
       if (!(this.page2).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.page2);
       }
       if (!(this.topPage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.topPage);
       }
       if (!(this.userRouteTrace).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(13, this.userRouteTrace);
       }
       tcategory = this.coPage;
       if (tcategory != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(14, tcategory);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientEvent$UrlPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          int i1 = 3;
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
                    case 1:
                      break;
                    default:
                }
                this.category = i;
                break;
              case 16:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != i1 && (i != 4 && (i != 5 && (i != 6 && i != 7))))))) {
                   switch (i){
                       case 7:
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
                       case 0x7544:
                       case 0x7572:
                       case 0x7574:
                       case 0x767d:
                       case 0x767e:
                       case 0x767f:
                       case 0x7680:
                       case 0x7681:
                       case 0x7682:
                       case 0x7683:
                       case 0x7684:
                       case 0x7685:
                       case 0x7686:
                       case 0x7687:
                       case 0x7688:
                       case 0x7689:
                       case 0x768a:
                       case 0x768b:
                       case 0x768c:
                       case 0x768f:
                       case 0x7690:
                       case 0x7691:
                       case 0x7692:
                       case 0x7694:
                       case 0x7695:
                       case 0x7696:
                       case 0x7697:
                       case 0x7698:
                       case 0x7699:
                       case 0x769a:
                       case 0x769b:
                       case 0x769c:
                       case 0x769d:
                       case 0x769e:
                       case 0x769f:
                       case 0x76a0:
                       case 0x76a1:
                       case 0x76a2:
                       case 0x76a3:
                       case 0x76a4:
                       case 0x76a5:
                       case 0x76a6:
                       case 0x76a8:
                       case 0x76a9:
                       case 0x76aa:
                       case 0x76ab:
                       case 0x76ad:
                       case 0x76ae:
                       case 0x76af:
                       case 0x76b0:
                       case 0x76b1:
                       case 0x76b2:
                       case 0x76b3:
                       case 0x76b4:
                       case 0x76b5:
                       case 0x76b6:
                       case 0x76b7:
                       case 0x76b8:
                       case 0x76b9:
                       case 0x76ba:
                       case 0x76bb:
                       case 0x76bc:
                       case 0x76bd:
                       case 0x76be:
                       case 0x76bf:
                       case 0x76c0:
                       case 0x76c1:
                       case 0x76c2:
                       case 0x76c3:
                       case 0x76c4:
                       case 0x76c5:
                       case 0x76c6:
                       case 0x76c7:
                       case 0x76c8:
                       case 0x76c9:
                       case 0x76ca:
                       case 0x76cb:
                       case 0x76cc:
                       case 0x76cd:
                       case 0x76ce:
                       case 0x76cf:
                       case 0x76f1:
                       case 0x76f3:
                       case 0x76f4:
                       case 0x76f5:
                       case 0x7d02:
                       case 0x7d03:
                       case 0x7d04:
                       case 0x7d05:
                       case 0x7d06:
                       case 0x7d07:
                       case 0x7d08:
                       case 0x7d09:
                       case 0x7d0a:
                       case 0x7d0b:
                       case 0x7d0c:
                       case 0x7d0d:
                       case 0x7d0e:
                       case 0x7d0f:
                       case 0x7d10:
                       case 0x7d11:
                       case 0x7d12:
                       case 0x7d13:
                       case 0x7d14:
                       case 0x7d15:
                       case 0x7d16:
                       case 0x7d17:
                       case 0x7d18:
                       case 0x7d19:
                       case 0x7d1a:
                       case 0x7d1b:
                       case 0x7d1c:
                       case 0x7d1d:
                       case 0x7d1e:
                       case 0x7d1f:
                       case 0x7d20:
                       case 0x7d21:
                       case 0x7d22:
                       case 0x7d23:
                       case 0x7d24:
                       case 0x7d25:
                       case 0x7d26:
                       case 0x7d27:
                       case 0x7d28:
                       case 0x7d29:
                       case 0x7d2a:
                       case 0x7d2b:
                       case 0x7d2c:
                       case 0x7d2d:
                       case 0x7d2e:
                       case 0x7d2f:
                       case 0x7d30:
                       case 0x7d31:
                       case 0x7d32:
                       case 0x7d33:
                       case 0x7d3c:
                       case 0x7d3d:
                       case 0x7d3e:
                       case 0x7d3f:
                       case 0x7d40:
                       case 0x7d41:
                       case 0x7d42:
                       case 0x7d43:
                       case 0x7d44:
                       case 0x7d45:
                       case 0x7d46:
                       case 0x7d47:
                       case 0x7d48:
                       case 0x7d49:
                       case 0x7d4a:
                       case 0x7d4b:
                       case 0x7d4c:
                       case 0x7d4d:
                       case 0x7d4e:
                       case 0x7d4f:
                       case 0x7d50:
                       case 0x7d51:
                       case 0x7d52:
                       case 0x7d53:
                       case 0x7d54:
                       case 0x7d55:
                       case 0x7d56:
                       case 0x7d57:
                       case 0x7d58:
                       case 0x7d59:
                       case 0x7d5a:
                       case 0x7d5b:
                       case 0x7d5c:
                       case 0x7d5d:
                       case 0x7d5e:
                       case 0x7d5f:
                       case 0x7d60:
                       case 0x7d61:
                       case 0x7d62:
                       case 0x7d63:
                       case 0x7d64:
                       case 0x7d65:
                       case 0x7d66:
                       case 0x7d67:
                       case 0x7d68:
                       case 0x7d69:
                       case 0x7d6a:
                       case 0x7d6b:
                       case 0x7d6c:
                       case 0x7d6d:
                       case 0x7d6e:
                       case 0x7d6f:
                       case 0x7d70:
                       case 0x7d71:
                       case 0x7d72:
                       case 0x7d73:
                       case 0x7d79:
                       case 0x7d7a:
                       case 0x7d7b:
                       case 0x7d7c:
                       case 0x7d7d:
                       case 0x7d7e:
                       case 0x7d7f:
                       case 0x7d80:
                       case 0x7d81:
                       case 0x7d82:
                       case 0x7d83:
                       case 0x7d84:
                       case 0x7d85:
                       case 0x7d86:
                       case 0x7d87:
                       case 0x7d88:
                       case 0x7d89:
                       case 0x7d8a:
                       case 0x7d8b:
                       case 0x7d8c:
                       case 0x7d8d:
                       case 0x7d8e:
                       case 0x7d8f:
                       case 0x7d90:
                       case 0x7d91:
                       case 0x7d92:
                       case 0x7d93:
                       case 0x7d94:
                       case 0x7d95:
                       case 0x7d96:
                       case 0x7d97:
                       case 0x7d98:
                       case 0x7d99:
                       case 0x7d9a:
                       case 0x7d9b:
                       case 0x7d9c:
                       case 0x7d9d:
                       case 0x7d9e:
                       case 0x7d9f:
                       case 0x7da0:
                       case 0x7da1:
                       case 0x7da2:
                       case 0x7da3:
                       case 0x7da5:
                       case 0x7da6:
                       case 0x7da7:
                       case 0xc351:
                       case 0xc352:
                       case 0xc353:
                       case 0xc354:
                       case 0xc355:
                       case 0xc356:
                       case 0xc357:
                       case 0xc358:
                       case 0xc359:
                       case 0xc35a:
                       case 8:
                         break;
                       default:
                         switch (i){
                             case 0x7534:
                             case 0x7536:
                             case 0x7537:
                             case 0x7538:
                             case 0x7539:
                             case 0x753a:
                             case 0x753b:
                             case 0x753c:
                             case 0x753d:
                             case 0x753e:
                             case 0x753f:
                             case 0x7540:
                             case 0x7541:
                             case 0x7542:
                             case 0x7535:
                               break;
                             default:
                               switch (i){
                                   case 0x7546:
                                   case 0x7548:
                                   case 0x7549:
                                   case 0x754a:
                                   case 0x754b:
                                   case 0x754c:
                                   case 0x754d:
                                   case 0x754e:
                                   case 0x754f:
                                   case 0x7550:
                                   case 0x7551:
                                   case 0x7552:
                                   case 0x7553:
                                   case 0x7554:
                                   case 0x7555:
                                   case 0x7556:
                                   case 0x7557:
                                   case 0x7558:
                                   case 0x7559:
                                   case 0x755a:
                                   case 0x755b:
                                   case 0x755c:
                                   case 0x755d:
                                   case 0x755e:
                                   case 0x755f:
                                   case 0x7560:
                                   case 0x7561:
                                   case 0x7562:
                                   case 0x7563:
                                   case 0x7564:
                                   case 0x7565:
                                   case 0x7566:
                                   case 0x7567:
                                   case 0x7568:
                                   case 0x7569:
                                   case 0x756a:
                                   case 0x756b:
                                   case 0x756c:
                                   case 0x756d:
                                   case 0x756e:
                                   case 0x756f:
                                   case 0x7570:
                                   case 0x7547:
                                     break;
                                   default:
                                     switch (i){
                                         case 0x7576:
                                         case 0x7578:
                                         case 0x7579:
                                         case 0x757a:
                                         case 0x757b:
                                         case 0x757c:
                                         case 0x757d:
                                         case 0x757e:
                                         case 0x757f:
                                         case 0x7580:
                                         case 0x7581:
                                         case 0x7582:
                                         case 0x7577:
                                           break;
                                         default:
                                           switch (i){
                                               case 0x7584:
                                               case 0x7586:
                                               case 0x7587:
                                               case 0x7588:
                                               case 0x7589:
                                               case 0x758a:
                                               case 0x758b:
                                               case 0x758c:
                                               case 0x758d:
                                               case 0x7585:
                                                 break;
                                               default:
                                                 switch (i){
                                                     case 0x758f:
                                                     case 0x7591:
                                                     case 0x7592:
                                                     case 0x7593:
                                                     case 0x7590:
                                                       break;
                                                     default:
                                                       switch (i){
                                                           case 0x7595:
                                                           case 0x7597:
                                                           case 0x7598:
                                                           case 0x7599:
                                                           case 0x759a:
                                                           case 0x759b:
                                                           case 0x759c:
                                                           case 0x759d:
                                                           case 0x759e:
                                                           case 0x759f:
                                                           case 0x75a0:
                                                           case 0x75a1:
                                                           case 0x75a2:
                                                           case 0x75a3:
                                                           case 0x75a4:
                                                           case 0x75a5:
                                                           case 0x75a6:
                                                           case 0x75a7:
                                                           case 0x75a8:
                                                           case 0x75a9:
                                                           case 0x75aa:
                                                           case 0x75ab:
                                                           case 0x75ac:
                                                           case 0x75ad:
                                                           case 0x75ae:
                                                           case 0x75af:
                                                           case 0x75b0:
                                                           case 0x75b1:
                                                           case 0x75b2:
                                                           case 0x75b3:
                                                           case 0x75b4:
                                                           case 0x75b5:
                                                           case 0x75b6:
                                                           case 0x75b7:
                                                           case 0x75b8:
                                                           case 0x75b9:
                                                           case 0x75ba:
                                                           case 0x75bb:
                                                           case 0x75bc:
                                                           case 0x75bd:
                                                           case 0x75be:
                                                           case 0x75bf:
                                                           case 0x75c0:
                                                           case 0x75c1:
                                                           case 0x75c2:
                                                           case 0x75c3:
                                                           case 0x75c4:
                                                           case 0x75c5:
                                                           case 0x7596:
                                                             break;
                                                           default:
                                                             switch (i){
                                                                 case 0x75c7:
                                                                 case 0x75c9:
                                                                 case 0x75ca:
                                                                 case 0x75cb:
                                                                 case 0x75cc:
                                                                 case 0x75cd:
                                                                 case 0x75ce:
                                                                 case 0x75cf:
                                                                 case 0x75d0:
                                                                 case 0x75d1:
                                                                 case 0x75d2:
                                                                 case 0x75d3:
                                                                 case 0x75d4:
                                                                 case 0x75d5:
                                                                 case 0x75d6:
                                                                 case 0x75d7:
                                                                 case 0x75d8:
                                                                 case 0x75d9:
                                                                 case 0x75da:
                                                                 case 0x75db:
                                                                 case 0x75dc:
                                                                 case 0x75dd:
                                                                 case 0x75de:
                                                                 case 0x75df:
                                                                 case 0x75e0:
                                                                 case 0x75e1:
                                                                 case 0x75e2:
                                                                 case 0x75e3:
                                                                 case 0x75e4:
                                                                 case 0x75e5:
                                                                 case 0x75e6:
                                                                 case 0x75e7:
                                                                 case 0x75e8:
                                                                 case 0x75e9:
                                                                 case 0x75ea:
                                                                 case 0x75eb:
                                                                 case 0x75ec:
                                                                 case 0x75ed:
                                                                 case 0x75ee:
                                                                 case 0x75ef:
                                                                 case 0x75f0:
                                                                 case 0x75f1:
                                                                 case 0x75f2:
                                                                 case 0x75f3:
                                                                 case 0x75f4:
                                                                 case 0x75f5:
                                                                 case 0x75f6:
                                                                 case 0x75f7:
                                                                 case 0x75f8:
                                                                 case 0x75f9:
                                                                 case 0x75fa:
                                                                 case 0x75fb:
                                                                 case 0x75fc:
                                                                 case 0x75fd:
                                                                 case 0x75fe:
                                                                 case 0x75ff:
                                                                 case 0x7600:
                                                                 case 0x7601:
                                                                 case 0x7602:
                                                                 case 0x7603:
                                                                 case 0x7604:
                                                                 case 0x7605:
                                                                 case 0x7606:
                                                                 case 0x7607:
                                                                 case 0x7608:
                                                                 case 0x7609:
                                                                 case 0x760a:
                                                                 case 0x760b:
                                                                 case 0x760c:
                                                                 case 0x760d:
                                                                 case 0x760e:
                                                                 case 0x760f:
                                                                 case 0x7610:
                                                                 case 0x7611:
                                                                 case 0x7612:
                                                                 case 0x7613:
                                                                 case 0x7614:
                                                                 case 0x7615:
                                                                 case 0x7616:
                                                                 case 0x7617:
                                                                 case 0x7618:
                                                                 case 0x7619:
                                                                 case 0x761a:
                                                                 case 0x761b:
                                                                 case 0x761c:
                                                                 case 0x761d:
                                                                 case 0x761e:
                                                                 case 0x761f:
                                                                 case 0x7620:
                                                                 case 0x7621:
                                                                 case 0x7622:
                                                                 case 0x7623:
                                                                 case 0x7624:
                                                                 case 0x7625:
                                                                 case 0x7626:
                                                                 case 0x7627:
                                                                 case 0x7628:
                                                                 case 0x7629:
                                                                 case 0x762a:
                                                                 case 0x762b:
                                                                 case 0x762c:
                                                                 case 0x75c8:
                                                                   break;
                                                                 default:
                                                                   switch (i){
                                                                       case 0x762e:
                                                                       case 0x7630:
                                                                       case 0x7631:
                                                                       case 0x7632:
                                                                       case 0x7633:
                                                                       case 0x7634:
                                                                       case 0x7635:
                                                                       case 0x7636:
                                                                       case 0x7637:
                                                                       case 0x7638:
                                                                       case 0x7639:
                                                                       case 0x763a:
                                                                       case 0x763b:
                                                                       case 0x763c:
                                                                       case 0x763d:
                                                                       case 0x763e:
                                                                       case 0x763f:
                                                                       case 0x7640:
                                                                       case 0x7641:
                                                                       case 0x7642:
                                                                       case 0x7643:
                                                                       case 0x7644:
                                                                       case 0x7645:
                                                                       case 0x7646:
                                                                       case 0x7647:
                                                                       case 0x7648:
                                                                       case 0x7649:
                                                                       case 0x764a:
                                                                       case 0x764b:
                                                                       case 0x764c:
                                                                       case 0x764d:
                                                                       case 0x764e:
                                                                       case 0x764f:
                                                                       case 0x7650:
                                                                       case 0x7651:
                                                                       case 0x7652:
                                                                       case 0x7653:
                                                                       case 0x7654:
                                                                       case 0x7655:
                                                                       case 0x7656:
                                                                       case 0x7657:
                                                                       case 0x7658:
                                                                       case 0x7659:
                                                                       case 0x765a:
                                                                       case 0x765b:
                                                                       case 0x765c:
                                                                       case 0x765d:
                                                                       case 0x765e:
                                                                       case 0x765f:
                                                                       case 0x7660:
                                                                       case 0x7661:
                                                                       case 0x7662:
                                                                       case 0x7663:
                                                                       case 0x7664:
                                                                       case 0x7665:
                                                                       case 0x7666:
                                                                       case 0x762f:
                                                                         break;
                                                                       default:
                                                                         switch (i){
                                                                             case 0x7668:
                                                                             case 0x766a:
                                                                             case 0x766b:
                                                                             case 0x766c:
                                                                             case 0x766d:
                                                                             case 0x766e:
                                                                             case 0x766f:
                                                                             case 0x7670:
                                                                             case 0x7671:
                                                                             case 0x7672:
                                                                             case 0x7673:
                                                                             case 0x7674:
                                                                             case 0x7675:
                                                                             case 0x7676:
                                                                             case 0x7677:
                                                                             case 0x7678:
                                                                             case 0x7679:
                                                                             case 0x767a:
                                                                             case 0x7669:
                                                                               break;
                                                                             default:
                                                                         }
                                                                   }
                                                             }
                                                       }
                                                 }
                                           }
                                     }
                               }
                         }
                   }
                }
                this.page = i;
                break;
              case 26:
                this.subPages = p0.readString();
                break;
              case '"':
                this.params = p0.readString();
                break;
              case '*':
                this.identity = p0.readString();
                break;
              case '0':
                this.pageSeq = p0.readInt32();
                break;
              case ':':
                this.entryPageId = p0.readString();
                break;
              case 'B':
                this.entryPageSource = p0.readString();
                break;
              case 'J':
                if (this.expTagList == null) {
                   this.expTagList = new ClientEvent$ExpTagTransList();
                }
                p0.readMessage(this.expTagList);
                break;
              case 'P':
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != i1))) {
                   continue ;
                }else {
                   this.pageType = i;
                }
                break;
              case 'Z':
                this.page2 = p0.readString();
                break;
              case 'b':
                this.topPage = p0.readString();
                break;
              case 'j':
                this.userRouteTrace = p0.readString();
                break;
              case 'p':
                this.coPage = p0.readBool();
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
       ClientEvent$UrlPackage tcategory = this.category;
       if (tcategory != null) {
          p0.writeInt32(1, tcategory);
       }
       tcategory = this.page;
       if (tcategory != null) {
          p0.writeInt32(2, tcategory);
       }
       String str = "";
       if (!(this.subPages).equals(str)) {
          p0.writeString(3, this.subPages);
       }
       if (!(this.params).equals(str)) {
          p0.writeString(4, this.params);
       }
       if (!(this.identity).equals(str)) {
          p0.writeString(5, this.identity);
       }
       tcategory = this.pageSeq;
       if (tcategory != null) {
          p0.writeInt32(6, tcategory);
       }
       if (!(this.entryPageId).equals(str)) {
          p0.writeString(7, this.entryPageId);
       }
       if (!(this.entryPageSource).equals(str)) {
          p0.writeString(8, this.entryPageSource);
       }
       tcategory = this.expTagList;
       if (tcategory != null) {
          p0.writeMessage(9, tcategory);
       }
       tcategory = this.pageType;
       if (tcategory != null) {
          p0.writeInt32(10, tcategory);
       }
       if (!(this.page2).equals(str)) {
          p0.writeString(11, this.page2);
       }
       if (!(this.topPage).equals(str)) {
          p0.writeString(12, this.topPage);
       }
       if (!(this.userRouteTrace).equals(str)) {
          p0.writeString(13, this.userRouteTrace);
       }
       tcategory = this.coPage;
       if (tcategory != null) {
          p0.writeBool(14, tcategory);
       }
       super.writeTo(p0);
       return;
    }
}
