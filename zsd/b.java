package zsd.b;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import usd.k;
import java.lang.Character;
import kotlin.text.CharCategory;
import kotlin.text.CharCategory$a;
import kotlin.text.CharDirectionality;
import kotlin.text.CharDirectionality$a;

public class b	// class@002969
{

    public void b(){
       super();
    }
    public static final int a(int p0){
       if (2 <= p0 && 36 >= p0) {
          return p0;
       }
       throw new IllegalArgumentException("radix "+p0+" was not in valid range "+new k(2, 36));
    }
    public static final int b(char p0,int p1){
       return Character.digit(p0, p1);
    }
    public static final CharCategory c(char p0){
       return CharCategory.Companion.b(Character.getType(p0));
    }
    public static final CharDirectionality d(char p0){
       return CharDirectionality.Companion.b(Character.getDirectionality(p0));
    }
    public static final boolean e(char p0){
       return Character.isDefined(p0);
    }
    public static final boolean f(char p0){
       return Character.isDigit(p0);
    }
    public static final boolean g(char p0){
       return Character.isHighSurrogate(p0);
    }
    public static final boolean h(char p0){
       return Character.isISOControl(p0);
    }
    public static final boolean i(char p0){
       return Character.isIdentifierIgnorable(p0);
    }
    public static final boolean j(char p0){
       return Character.isJavaIdentifierPart(p0);
    }
    public static final boolean k(char p0){
       return Character.isJavaIdentifierStart(p0);
    }
    public static final boolean l(char p0){
       return Character.isLetter(p0);
    }
    public static final boolean m(char p0){
       return Character.isLetterOrDigit(p0);
    }
    public static final boolean n(char p0){
       return Character.isLowSurrogate(p0);
    }
    public static final boolean o(char p0){
       return Character.isLowerCase(p0);
    }
    public static final boolean p(char p0){
       return Character.isTitleCase(p0);
    }
    public static final boolean q(char p0){
       return Character.isUpperCase(p0);
    }
    public static final boolean r(char p0){
       boolean b = (Character.isWhitespace(p0) || Character.isSpaceChar(p0))? true: false;
       return b;
    }
    public static final char s(char p0){
       return Character.toLowerCase(p0);
    }
    public static final char t(char p0){
       return Character.toTitleCase(p0);
    }
    public static final char u(char p0){
       return Character.toUpperCase(p0);
    }
}
