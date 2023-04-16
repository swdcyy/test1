package kotlin.text.CharDirectionality;
import java.lang.Enum;
import java.lang.String;
import kotlin.text.CharDirectionality$a;
import nsd.u;
import kotlin.text.CharDirectionality$Companion$directionalityMap$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import java.lang.Object;

public final class CharDirectionality extends Enum	// class@0018ed
{
    public final int value;
    public static final CharDirectionality[] $VALUES;
    public static final CharDirectionality ARABIC_NUMBER;
    public static final CharDirectionality BOUNDARY_NEUTRAL;
    public static final CharDirectionality COMMON_NUMBER_SEPARATOR;
    public static final CharDirectionality$a Companion;
    public static final CharDirectionality EUROPEAN_NUMBER;
    public static final CharDirectionality EUROPEAN_NUMBER_SEPARATOR;
    public static final CharDirectionality EUROPEAN_NUMBER_TERMINATOR;
    public static final CharDirectionality LEFT_TO_RIGHT;
    public static final CharDirectionality LEFT_TO_RIGHT_EMBEDDING;
    public static final CharDirectionality LEFT_TO_RIGHT_OVERRIDE;
    public static final CharDirectionality NONSPACING_MARK;
    public static final CharDirectionality OTHER_NEUTRALS;
    public static final CharDirectionality PARAGRAPH_SEPARATOR;
    public static final CharDirectionality POP_DIRECTIONAL_FORMAT;
    public static final CharDirectionality RIGHT_TO_LEFT;
    public static final CharDirectionality RIGHT_TO_LEFT_ARABIC;
    public static final CharDirectionality RIGHT_TO_LEFT_EMBEDDING;
    public static final CharDirectionality RIGHT_TO_LEFT_OVERRIDE;
    public static final CharDirectionality SEGMENT_SEPARATOR;
    public static final CharDirectionality UNDEFINED;
    public static final CharDirectionality WHITESPACE;
    public static final p directionalityMap$delegate;

    static {
       CharDirectionality[] uCharDirecti = new CharDirectionality[20];
       CharDirectionality uCharDirecti1 = new CharDirectionality("UNDEFINED", 0, -1);
       CharDirectionality.UNDEFINED = uCharDirecti1;
       uCharDirecti[0] = uCharDirecti1;
       uCharDirecti1 = new CharDirectionality("LEFT_TO_RIGHT", 1, 0);
       CharDirectionality.LEFT_TO_RIGHT = uCharDirecti1;
       uCharDirecti[1] = uCharDirecti1;
       uCharDirecti1 = new CharDirectionality("RIGHT_TO_LEFT", 2, 1);
       CharDirectionality.RIGHT_TO_LEFT = uCharDirecti1;
       uCharDirecti[2] = uCharDirecti1;
       uCharDirecti1 = new CharDirectionality("RIGHT_TO_LEFT_ARABIC", 3, 2);
       CharDirectionality.RIGHT_TO_LEFT_ARABIC = uCharDirecti1;
       uCharDirecti[3] = uCharDirecti1;
       uCharDirecti1 = new CharDirectionality("EUROPEAN_NUMBER", 4, 3);
       CharDirectionality.EUROPEAN_NUMBER = uCharDirecti1;
       uCharDirecti[4] = uCharDirecti1;
       uCharDirecti1 = new CharDirectionality("EUROPEAN_NUMBER_SEPARATOR", 5, 4);
       CharDirectionality.EUROPEAN_NUMBER_SEPARATOR = uCharDirecti1;
       uCharDirecti[5] = uCharDirecti1;
       uCharDirecti1 = new CharDirectionality("EUROPEAN_NUMBER_TERMINATOR", 6, 5);
       CharDirectionality.EUROPEAN_NUMBER_TERMINATOR = uCharDirecti1;
       uCharDirecti[6] = uCharDirecti1;
       uCharDirecti1 = new CharDirectionality("ARABIC_NUMBER", 7, 6);
       CharDirectionality.ARABIC_NUMBER = uCharDirecti1;
       uCharDirecti[7] = uCharDirecti1;
       uCharDirecti1 = new CharDirectionality("COMMON_NUMBER_SEPARATOR", 8, 7);
       CharDirectionality.COMMON_NUMBER_SEPARATOR = uCharDirecti1;
       uCharDirecti[8] = uCharDirecti1;
       uCharDirecti1 = new CharDirectionality("NONSPACING_MARK", 9, 8);
       CharDirectionality.NONSPACING_MARK = uCharDirecti1;
       uCharDirecti[9] = uCharDirecti1;
       uCharDirecti1 = new CharDirectionality("BOUNDARY_NEUTRAL", 10, 9);
       CharDirectionality.BOUNDARY_NEUTRAL = uCharDirecti1;
       uCharDirecti[10] = uCharDirecti1;
       uCharDirecti1 = new CharDirectionality("PARAGRAPH_SEPARATOR", 11, 10);
       CharDirectionality.PARAGRAPH_SEPARATOR = uCharDirecti1;
       uCharDirecti[11] = uCharDirecti1;
       uCharDirecti1 = new CharDirectionality("SEGMENT_SEPARATOR", 12, 11);
       CharDirectionality.SEGMENT_SEPARATOR = uCharDirecti1;
       uCharDirecti[12] = uCharDirecti1;
       uCharDirecti1 = new CharDirectionality("WHITESPACE", 13, 12);
       CharDirectionality.WHITESPACE = uCharDirecti1;
       uCharDirecti[13] = uCharDirecti1;
       uCharDirecti1 = new CharDirectionality("OTHER_NEUTRALS", 14, 13);
       CharDirectionality.OTHER_NEUTRALS = uCharDirecti1;
       uCharDirecti[14] = uCharDirecti1;
       uCharDirecti1 = new CharDirectionality("LEFT_TO_RIGHT_EMBEDDING", 15, 14);
       CharDirectionality.LEFT_TO_RIGHT_EMBEDDING = uCharDirecti1;
       uCharDirecti[15] = uCharDirecti1;
       uCharDirecti1 = new CharDirectionality("LEFT_TO_RIGHT_OVERRIDE", 16, 15);
       CharDirectionality.LEFT_TO_RIGHT_OVERRIDE = uCharDirecti1;
       uCharDirecti[16] = uCharDirecti1;
       uCharDirecti1 = new CharDirectionality("RIGHT_TO_LEFT_EMBEDDING", 17, 16);
       CharDirectionality.RIGHT_TO_LEFT_EMBEDDING = uCharDirecti1;
       uCharDirecti[17] = uCharDirecti1;
       uCharDirecti1 = new CharDirectionality("RIGHT_TO_LEFT_OVERRIDE", 18, 17);
       CharDirectionality.RIGHT_TO_LEFT_OVERRIDE = uCharDirecti1;
       uCharDirecti[18] = uCharDirecti1;
       uCharDirecti1 = new CharDirectionality("POP_DIRECTIONAL_FORMAT", 19, 18);
       CharDirectionality.POP_DIRECTIONAL_FORMAT = uCharDirecti1;
       uCharDirecti[19] = uCharDirecti1;
       CharDirectionality.$VALUES = uCharDirecti;
       CharDirectionality.Companion = new CharDirectionality$a(null);
       CharDirectionality.directionalityMap$delegate = s.c(CharDirectionality$Companion$directionalityMap$2.INSTANCE);
    }
    public void CharDirectionality(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static CharDirectionality valueOf(String p0){
       return Enum.valueOf(CharDirectionality.class, p0);
    }
    public static CharDirectionality[] values(){
       return CharDirectionality.$VALUES.clone();
    }
    public final int getValue(){
       return this.value;
    }
}
