package kotlin.text.CharCategory;
import java.lang.Enum;
import java.lang.String;
import kotlin.text.CharCategory$a;
import nsd.u;
import kotlin.text.CharCategory$Companion$categoryMap$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import java.lang.Object;
import java.lang.Character;

public final class CharCategory extends Enum	// class@0018ea
{
    public final String code;
    public final int value;
    public static final CharCategory[] $VALUES;
    public static final CharCategory COMBINING_SPACING_MARK;
    public static final CharCategory CONNECTOR_PUNCTUATION;
    public static final CharCategory CONTROL;
    public static final CharCategory CURRENCY_SYMBOL;
    public static final CharCategory$a Companion;
    public static final CharCategory DASH_PUNCTUATION;
    public static final CharCategory DECIMAL_DIGIT_NUMBER;
    public static final CharCategory ENCLOSING_MARK;
    public static final CharCategory END_PUNCTUATION;
    public static final CharCategory FINAL_QUOTE_PUNCTUATION;
    public static final CharCategory FORMAT;
    public static final CharCategory INITIAL_QUOTE_PUNCTUATION;
    public static final CharCategory LETTER_NUMBER;
    public static final CharCategory LINE_SEPARATOR;
    public static final CharCategory LOWERCASE_LETTER;
    public static final CharCategory MATH_SYMBOL;
    public static final CharCategory MODIFIER_LETTER;
    public static final CharCategory MODIFIER_SYMBOL;
    public static final CharCategory NON_SPACING_MARK;
    public static final CharCategory OTHER_LETTER;
    public static final CharCategory OTHER_NUMBER;
    public static final CharCategory OTHER_PUNCTUATION;
    public static final CharCategory OTHER_SYMBOL;
    public static final CharCategory PARAGRAPH_SEPARATOR;
    public static final CharCategory PRIVATE_USE;
    public static final CharCategory SPACE_SEPARATOR;
    public static final CharCategory START_PUNCTUATION;
    public static final CharCategory SURROGATE;
    public static final CharCategory TITLECASE_LETTER;
    public static final CharCategory UNASSIGNED;
    public static final CharCategory UPPERCASE_LETTER;
    public static final p categoryMap$delegate;

    static {
       CharCategory[] uCharCategor = new CharCategory[30];
       CharCategory uCharCategor1 = new CharCategory("UNASSIGNED", 0, 0, "Cn");
       CharCategory.UNASSIGNED = uCharCategor1;
       uCharCategor[0] = uCharCategor1;
       uCharCategor1 = new CharCategory("UPPERCASE_LETTER", 1, 1, "Lu");
       CharCategory.UPPERCASE_LETTER = uCharCategor1;
       uCharCategor[1] = uCharCategor1;
       uCharCategor1 = new CharCategory("LOWERCASE_LETTER", 2, 2, "Ll");
       CharCategory.LOWERCASE_LETTER = uCharCategor1;
       uCharCategor[2] = uCharCategor1;
       uCharCategor1 = new CharCategory("TITLECASE_LETTER", 3, 3, "Lt");
       CharCategory.TITLECASE_LETTER = uCharCategor1;
       uCharCategor[3] = uCharCategor1;
       uCharCategor1 = new CharCategory("MODIFIER_LETTER", 4, 4, "Lm");
       CharCategory.MODIFIER_LETTER = uCharCategor1;
       uCharCategor[4] = uCharCategor1;
       uCharCategor1 = new CharCategory("OTHER_LETTER", 5, 5, "Lo");
       CharCategory.OTHER_LETTER = uCharCategor1;
       uCharCategor[5] = uCharCategor1;
       uCharCategor1 = new CharCategory("NON_SPACING_MARK", 6, 6, "Mn");
       CharCategory.NON_SPACING_MARK = uCharCategor1;
       uCharCategor[6] = uCharCategor1;
       uCharCategor1 = new CharCategory("ENCLOSING_MARK", 7, 7, "Me");
       CharCategory.ENCLOSING_MARK = uCharCategor1;
       uCharCategor[7] = uCharCategor1;
       uCharCategor1 = new CharCategory("COMBINING_SPACING_MARK", 8, 8, "Mc");
       CharCategory.COMBINING_SPACING_MARK = uCharCategor1;
       uCharCategor[8] = uCharCategor1;
       uCharCategor1 = new CharCategory("DECIMAL_DIGIT_NUMBER", 9, 9, "Nd");
       CharCategory.DECIMAL_DIGIT_NUMBER = uCharCategor1;
       uCharCategor[9] = uCharCategor1;
       uCharCategor1 = new CharCategory("LETTER_NUMBER", 10, 10, "Nl");
       CharCategory.LETTER_NUMBER = uCharCategor1;
       uCharCategor[10] = uCharCategor1;
       uCharCategor1 = new CharCategory("OTHER_NUMBER", 11, 11, "No");
       CharCategory.OTHER_NUMBER = uCharCategor1;
       uCharCategor[11] = uCharCategor1;
       uCharCategor1 = new CharCategory("SPACE_SEPARATOR", 12, 12, "Zs");
       CharCategory.SPACE_SEPARATOR = uCharCategor1;
       uCharCategor[12] = uCharCategor1;
       uCharCategor1 = new CharCategory("LINE_SEPARATOR", 13, 13, "Zl");
       CharCategory.LINE_SEPARATOR = uCharCategor1;
       uCharCategor[13] = uCharCategor1;
       uCharCategor1 = new CharCategory("PARAGRAPH_SEPARATOR", 14, 14, "Zp");
       CharCategory.PARAGRAPH_SEPARATOR = uCharCategor1;
       uCharCategor[14] = uCharCategor1;
       uCharCategor1 = new CharCategory("CONTROL", 15, 15, "Cc");
       CharCategory.CONTROL = uCharCategor1;
       uCharCategor[15] = uCharCategor1;
       uCharCategor1 = new CharCategory("FORMAT", 16, 16, "Cf");
       CharCategory.FORMAT = uCharCategor1;
       uCharCategor[16] = uCharCategor1;
       uCharCategor1 = new CharCategory("PRIVATE_USE", 17, 18, "Co");
       CharCategory.PRIVATE_USE = uCharCategor1;
       uCharCategor[17] = uCharCategor1;
       uCharCategor1 = new CharCategory("SURROGATE", 18, 19, "Cs");
       CharCategory.SURROGATE = uCharCategor1;
       uCharCategor[18] = uCharCategor1;
       uCharCategor1 = new CharCategory("DASH_PUNCTUATION", 19, 20, "Pd");
       CharCategory.DASH_PUNCTUATION = uCharCategor1;
       uCharCategor[19] = uCharCategor1;
       uCharCategor1 = new CharCategory("START_PUNCTUATION", 20, 21, "Ps");
       CharCategory.START_PUNCTUATION = uCharCategor1;
       uCharCategor[20] = uCharCategor1;
       uCharCategor1 = new CharCategory("END_PUNCTUATION", 21, 22, "Pe");
       CharCategory.END_PUNCTUATION = uCharCategor1;
       uCharCategor[21] = uCharCategor1;
       uCharCategor1 = new CharCategory("CONNECTOR_PUNCTUATION", 22, 23, "Pc");
       CharCategory.CONNECTOR_PUNCTUATION = uCharCategor1;
       uCharCategor[22] = uCharCategor1;
       uCharCategor1 = new CharCategory("OTHER_PUNCTUATION", 23, 24, "Po");
       CharCategory.OTHER_PUNCTUATION = uCharCategor1;
       uCharCategor[23] = uCharCategor1;
       uCharCategor1 = new CharCategory("MATH_SYMBOL", 24, 25, "Sm");
       CharCategory.MATH_SYMBOL = uCharCategor1;
       uCharCategor[24] = uCharCategor1;
       uCharCategor1 = new CharCategory("CURRENCY_SYMBOL", 25, 26, "Sc");
       CharCategory.CURRENCY_SYMBOL = uCharCategor1;
       uCharCategor[25] = uCharCategor1;
       uCharCategor1 = new CharCategory("MODIFIER_SYMBOL", 26, 27, "Sk");
       CharCategory.MODIFIER_SYMBOL = uCharCategor1;
       uCharCategor[26] = uCharCategor1;
       uCharCategor1 = new CharCategory("OTHER_SYMBOL", 27, 28, "So");
       CharCategory.OTHER_SYMBOL = uCharCategor1;
       uCharCategor[27] = uCharCategor1;
       uCharCategor1 = new CharCategory("INITIAL_QUOTE_PUNCTUATION", 28, 29, "Pi");
       CharCategory.INITIAL_QUOTE_PUNCTUATION = uCharCategor1;
       uCharCategor[28] = uCharCategor1;
       uCharCategor1 = new CharCategory("FINAL_QUOTE_PUNCTUATION", 29, 30, "Pf");
       CharCategory.FINAL_QUOTE_PUNCTUATION = uCharCategor1;
       uCharCategor[29] = uCharCategor1;
       CharCategory.$VALUES = uCharCategor;
       CharCategory.Companion = new CharCategory$a(null);
       CharCategory.categoryMap$delegate = s.c(CharCategory$Companion$categoryMap$2.INSTANCE);
    }
    public void CharCategory(String p0,int p1,int p2,String p3){
       super(p0, p1);
       this.value = p2;
       this.code = p3;
    }
    public static CharCategory valueOf(String p0){
       return Enum.valueOf(CharCategory.class, p0);
    }
    public static CharCategory[] values(){
       return CharCategory.$VALUES.clone();
    }
    public final boolean contains(char p0){
       boolean b = (Character.getType(p0) == this.value)? true: false;
       return b;
    }
    public final String getCode(){
       return this.code;
    }
    public final int getValue(){
       return this.value;
    }
}
