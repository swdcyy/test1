package kotlin.text.RegexOption;
import zsd.g;
import java.lang.Enum;
import java.lang.String;
import nsd.u;
import java.lang.Class;
import java.lang.Object;

public final class RegexOption extends Enum implements g	// class@0018fb
{
    public final int mask;
    public final int value;
    public static final RegexOption[] $VALUES;
    public static final RegexOption CANON_EQ;
    public static final RegexOption COMMENTS;
    public static final RegexOption DOT_MATCHES_ALL;
    public static final RegexOption IGNORE_CASE;
    public static final RegexOption LITERAL;
    public static final RegexOption MULTILINE;
    public static final RegexOption UNIX_LINES;

    static {
       RegexOption regexOption;
       RegexOption[] regexOptionA = new RegexOption[]{v8,regexOption,regexOption,regexOption,regexOption,regexOption,regexOption};
       regexOption = new RegexOption("IGNORE_CASE", 0, 2, 0, 2, null);
       RegexOption.IGNORE_CASE = v8;
       RegexOption regexOption1 = new RegexOption("MULTILINE", 1, 8, 0, 2, null);
       RegexOption.MULTILINE = regexOption;
       RegexOption regexOption2 = new RegexOption("LITERAL", 2, 16, 0, 2, null);
       RegexOption.LITERAL = regexOption;
       regexOption2 = new RegexOption("UNIX_LINES", 3, 1, 0, 2, null);
       RegexOption.UNIX_LINES = regexOption;
       regexOption2 = new RegexOption("COMMENTS", 4, 4, 0, 2, null);
       RegexOption.COMMENTS = regexOption;
       regexOption2 = new RegexOption("DOT_MATCHES_ALL", 5, 32, 0, 2, null);
       RegexOption.DOT_MATCHES_ALL = regexOption;
       regexOption2 = new RegexOption("CANON_EQ", 6, 128, 0, 2, null);
       RegexOption.CANON_EQ = regexOption;
       RegexOption.$VALUES = regexOptionA;
    }
    public void RegexOption(String p0,int p1,int p2,int p3){
       super(p0, p1);
       this.value = p2;
       this.mask = p3;
    }
    public void RegexOption(String p0,int p1,int p2,int p3,int p4,u p5){
       if (p4 & 0x02) {
          p3 = p2;
       }
       super(p0, p1, p2, p3);
       return;
    }
    public static RegexOption valueOf(String p0){
       return Enum.valueOf(RegexOption.class, p0);
    }
    public static RegexOption[] values(){
       return RegexOption.$VALUES.clone();
    }
    public int getMask(){
       return this.mask;
    }
    public int getValue(){
       return this.value;
    }
}
