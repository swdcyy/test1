package com.kuaishou.client.log.content.packages.nano.ClientContent$LoginSourcePackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$LoginSourcePackage extends MessageNano	// class@0012a7
{
    public int actionType;
    public String portalUrl;
    public int source;
    public String sourceExtInfo;
    public static ClientContent$LoginSourcePackage[] _emptyArray;

    public void ClientContent$LoginSourcePackage(){
       super();
       this.clear();
    }
    public static ClientContent$LoginSourcePackage[] emptyArray(){
       if (ClientContent$LoginSourcePackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$LoginSourcePackage._emptyArray == null) {
             ClientContent$LoginSourcePackage[] loginSourceP = new ClientContent$LoginSourcePackage[0];
             ClientContent$LoginSourcePackage._emptyArray = loginSourceP;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$LoginSourcePackage._emptyArray;
    }
    public static ClientContent$LoginSourcePackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$LoginSourcePackage().mergeFrom(p0);
    }
    public static ClientContent$LoginSourcePackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$LoginSourcePackage(), p0);
    }
    public ClientContent$LoginSourcePackage clear(){
       this.source = 0;
       this.actionType = 0;
       this.portalUrl = "";
       this.sourceExtInfo = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$LoginSourcePackage tsource = this.source;
       if (tsource != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tsource);
       }
       tsource = this.actionType;
       if (tsource != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tsource);
       }
       String str = "";
       if (!(this.portalUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.portalUrl);
       }
       if (!(this.sourceExtInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.sourceExtInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$LoginSourcePackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.sourceExtInfo = p0.readString();
                   }
                }else {
                   this.portalUrl = p0.readString();
                }
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.actionType = i;
                }
             }
          }else {
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
                 case 1:
                   break;
                 default:
             }
             this.source = i;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$LoginSourcePackage tsource = this.source;
       if (tsource != null) {
          p0.writeInt32(1, tsource);
       }
       tsource = this.actionType;
       if (tsource != null) {
          p0.writeInt32(2, tsource);
       }
       String str = "";
       if (!(this.portalUrl).equals(str)) {
          p0.writeString(3, this.portalUrl);
       }
       if (!(this.sourceExtInfo).equals(str)) {
          p0.writeString(4, this.sourceExtInfo);
       }
       super.writeTo(p0);
       return;
    }
}
