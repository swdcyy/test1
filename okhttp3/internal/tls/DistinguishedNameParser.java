package okhttp3.internal.tls.DistinguishedNameParser;
import javax.security.auth.x500.X500Principal;
import java.lang.Object;
import java.lang.String;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;

public final class DistinguishedNameParser	// class@001fd3
{
    public int beg;
    public char[] chars;
    public int cur;
    public final String dn;
    public int end;
    public final int length;
    public int pos;

    public void DistinguishedNameParser(X500Principal p0){
       super();
       String name = p0.getName("RFC2253");
       this.dn = name;
       this.length = name.length();
    }
    public final String escapedAV(){
       DistinguishedNameParser tbeg;
       int i2;
       DistinguishedNameParser tpos = this.pos;
       this.beg = tpos;
       this.end = tpos;
       while (true) {
          tpos = this.pos;
          if (tpos >= this.length) {
             tbeg = this.beg;
             return new String(this.chars, tbeg, (this.end - tbeg));
          }else {
             DistinguishedNameParser tchars = this.chars;
             char c = tchars[tpos];
             int i = 44;
             int i1 = 59;
             if (c != ' ') {
                if (c != i1) {
                   if (c != '\') {
                      if (c != '+' && c != i) {
                         tbeg = this.end;
                         i = tbeg + 1;
                         this.end = i;
                         tchars[tbeg] = tchars[tpos];
                         i2 = tpos + 1;
                         this.pos = i2;
                      }
                   }else {
                      tpos = this.end;
                      int i3 = tpos + 1;
                      this.end = i3;
                      tchars[tpos] = this.getEscaped();
                      i2 = this.pos + 1;
                      this.pos = i2;
                   }
                }
                tbeg = this.beg;
                return new String(tchars, tbeg, (this.end - tbeg));
             }else {
                tbeg = this.end;
                this.cur = tbeg;
                i2 = tpos + 1;
                this.pos = i2;
                i2 = tbeg + 1;
                this.end = i2;
                tchars[tbeg] = ' ';
                tpos = this.pos;
                tchars = this.length;
                while (tpos < tchars) {
                   tbeg = this.chars;
                   if (tbeg[tpos] == ' ') {
                      tchars = this.end;
                      int i4 = tchars + 1;
                      this.end = i4;
                      tbeg[tchars] = ' ';
                      i2 = tpos + 1;
                      this.pos = i2;
                   }else if(tpos != tchars){
                      tchars = this.chars;
                      if (tchars[tpos] == i || (tchars[tpos] != '+' && tchars[tpos] != i1)) {
                      }
                   }
                }
             }
          }
       }
       tbeg = this.beg;
       return new String(this.chars, tbeg, (this.cur - tbeg));
    }
    public String findMostSpecific(String p0){
       String str2;
       this.pos = 0;
       this.beg = 0;
       this.end = 0;
       this.cur = 0;
       this.chars = (this.dn).toCharArray();
       String str = this.nextAT();
       String str1 = null;
       if (str == null) {
          return str1;
       }
       while (true) {
          DistinguishedNameParser tpos = this.pos;
          if (tpos == this.length) {
             return str1;
          }
          char c = this.chars[tpos];
          if (c != '"') {
             if (c != '#') {
                str2 = (c != '+' && (c != ',' && c != ';'))? this.escapedAV(): "";
             }else {
                str2 = this.hexAV();
             }
          }else {
             str2 = this.quotedAV();
          }
          if (p0.equalsIgnoreCase(str)) {
             return str2;
          }else {
             DistinguishedNameParser tpos1 = this.pos;
             if (tpos1 >= this.length) {
                return str1;
             }else {
                tpos = this.chars;
                if (tpos[tpos1] == ',' || (tpos[tpos1] == ';' || tpos[tpos1] == '+')) {
                   int i = tpos1 + 1;
                   this.pos = i;
                   str = this.nextAT();
                   if (str != null) {
                   }else {
                      throw new IllegalStateException("Malformed DN: "+this.dn);
                   }
                }else {
                   break ;
                }
             }
          }
       }
       throw new IllegalStateException("Malformed DN: "+this.dn);
    }
    public final int getByte(int p0){
       int i = p0 + 1;
       if (i >= this.length) {
          throw new IllegalStateException("Malformed DN: "+this.dn);
       }
       DistinguishedNameParser tchars = this.chars;
       char c = tchars[p0];
       if (c >= '0' && c <= '9') {
          c = c - 48;
       }else if(c >= 'a' && c <= 'f'){
          c = c - 87;
       }else if(c >= 'A' && c <= 'F'){
          c = c - 55;
       }else {
          throw new IllegalStateException("Malformed DN: "+this.dn);
       }
       char c1 = tchars[i];
       if (c1 >= '0' && c1 <= '9') {
          i = c1 - 48;
       }else if(c1 >= 'a' && c1 <= 'f'){
          i = c1 - 87;
       }else if(c1 >= 'A' && c1 <= 'F'){
          i = c1 - 55;
       }else {
          throw new IllegalStateException("Malformed DN: "+this.dn);
       }
       return ((c << 4) + i);
    }
    public final char getEscaped(){
       int i = this.pos + 1;
       this.pos = i;
       if (i == this.length) {
          throw new IllegalStateException("Unexpected end of DN: "+this.dn);
       }
       DistinguishedNameParser tchars = this.chars;
       char c = tchars[i];
       if (c != ' ' && (c != '%' && (c != '\' && (c != '_' && (c != '"' && c != '#'))))) {
          switch (c){
              case '*':
              case ',':
              case '+':
              default:
                switch (c){
                    case ';':
                    case '=':
                    case '>':
                    case '<':
                    default:
                      return this.getUTF8();
                }
          }
       }
    label_0031 :
       return tchars[i];
    }
    public final char getUTF8(){
       int i;
       int bytex = this.getByte(this.pos);
       this.pos = this.pos + 1;
       if (bytex < 128) {
          return (char)bytex;
       }
       if (bytex < 192 || bytex > 247) {
          return '?';
       }
       if (bytex <= 223) {
          bytex = bytex & 0x1f;
          i = 1;
       }else if(bytex <= 239){
          i = 2;
          bytex = bytex & 0x0f;
       }else {
          i = 3;
          bytex = bytex & 0x07;
       }
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return (char)bytex;
          }
          int i2 = this.pos + 1;
          this.pos = i2;
          if (i2 == this.length || this.chars[i2] != '\') {
             break ;
          }else {
             i2 = i2 + 1;
             this.pos = i2;
             i2 = this.getByte(i2);
             int i3 = this.pos + 1;
             this.pos = i3;
             i3 = i2 & 0x00c0;
             if (i3 != 128) {
                return '?';
             }else {
                bytex = bytex << 6;
                i2 = i2 & 0x3f;
                bytex = bytex + i2;
                i1 = i1 + 1;
             }
          }
       }
       return '?';
    }
    public final String hexAV(){
       int i;
       int i1;
       DistinguishedNameParser tpos = this.pos;
       String str = "Unexpected end of DN: ";
       if ((tpos + 4) >= this.length) {
          throw new IllegalStateException(str+this.dn);
       }
       this.beg = tpos;
       this.pos = tpos + 1;
       while (true) {
          tpos = this.pos;
          if (tpos != this.length) {
             DistinguishedNameParser tchars = this.chars;
             if (tchars[tpos] != '+' && (tchars[tpos] == ',' || tchars[tpos] == ';')) {
             label_005f :
                this.end = tpos;
                break ;
             }else {
                int i2 = 32;
                if (tchars[tpos] == i2) {
                   this.end = tpos;
                   this.pos = tpos + 1;
                   tpos = this.pos;
                   while (tpos < this.length && this.chars[tpos] == i2) {
                      i = tpos + 1;
                      this.pos = i;
                   }
                   tchars = this.beg;
                   i = this.end - tchars;
                   if (i >= 5 && (i & 0x01)) {
                      i1 = i / 2;
                      byte[] uobyteArray = new byte[i1];
                      int i3 = tchars + 1;
                      for (i2 = 0; i2 < i1; i2 = i2 + 1) {
                         uobyteArray[i2] = (byte)this.getByte(i3);
                         i3 = i3 + 2;
                      }
                      return new String(this.chars, this.beg, i);
                   }else {
                      throw new IllegalStateException(str+this.dn);
                   }
                }else if(tchars[tpos] >= 'A' && tchars[tpos] <= 'F'){
                   i1 = tchars[tpos] + i2;
                   tchars[tpos] = (char)i1;
                }
                i = tpos + 1;
                this.pos = i;
             }
          }else {
             goto label_005f ;
          }
       }
    }
    public final String nextAT(){
       int i1;
       DistinguishedNameParser tpos = this.pos;
       DistinguishedNameParser tlength = this.length;
       int i = 32;
       while (tpos < tlength && this.chars[tpos] == i) {
          i1 = tpos + 1;
          this.pos = i1;
       }
       if (tpos == tlength) {
          return null;
       }
       this.beg = tpos;
       this.pos = tpos + 1;
       tpos = this.pos;
       tlength = this.length;
       int i2 = 61;
       while (tpos < tlength) {
          DistinguishedNameParser tchars = this.chars;
          if (tchars[tpos] != i2 && tchars[tpos] != i) {
             i1 = tpos + 1;
             this.pos = i1;
          }else {
             break ;
          }
       }
       String str = "Unexpected end of DN: ";
       if (tpos >= tlength) {
          throw new IllegalStateException(str+this.dn);
       }
       this.end = tpos;
       if (this.chars[tpos] == i) {
          tpos = this.pos;
          tlength = this.length;
          while (tpos < tlength) {
             DistinguishedNameParser tchars1 = this.chars;
             if (tchars1[tpos] != i2 && tchars1[tpos] == i) {
                i1 = tpos + 1;
                this.pos = i1;
             }else if(this.chars[tpos] == i2 && tpos != tlength){
                throw new IllegalStateException(str+this.dn);
             }
          }
       }
       this.pos = this.pos + 1;
       tpos = this.pos;
       while (tpos < this.length && this.chars[tpos] == i) {
          i1 = tpos + 1;
          this.pos = i1;
       }
       tpos = this.end;
       tlength = this.beg;
       i2 = 4;
       if ((tpos - tlength) > i2) {
          DistinguishedNameParser tchars2 = this.chars;
          if (tchars2[(tlength + 3)] == '.' && (tchars2[tlength] == 'O' || (tchars2[tlength] == 'o' && (tchars2[(tlength + 1)] == 'I' || (tchars2[(tlength + 1)] == 'i' && (tchars2[(tlength + 2)] == 'D' || tchars2[(tlength + 2)] == 'd')))))) {
             this.beg = tlength + i2;
          }
       }
    label_00ce :
       DistinguishedNameParser tbeg = this.beg;
       return new String(this.chars, tbeg, (tpos - tbeg));
    }
    public final String quotedAV(){
       int i = this.pos + 1;
       this.pos = i;
       this.beg = i;
       this.end = i;
       while (true) {
          DistinguishedNameParser tpos = this.pos;
          if (tpos == this.length) {
             throw new IllegalStateException("Unexpected end of DN: "+this.dn);
          }
          DistinguishedNameParser tchars = this.chars;
          if (tchars[tpos] == '"') {
             this.pos = tpos + 1;
             tpos = this.pos;
             while (tpos < this.length && this.chars[tpos] == ' ') {
                i = tpos + 1;
                this.pos = i;
             }
             DistinguishedNameParser tbeg = this.beg;
             return new String(this.chars, tbeg, (this.end - tbeg));
          }else if(tchars[tpos] == '\'){
             tchars[this.end] = this.getEscaped();
          }else {
             tchars[this.end] = tchars[tpos];
          }
          i = this.pos + 1;
          this.pos = i;
          i = this.end + 1;
          this.end = i;
       }
    }
}
