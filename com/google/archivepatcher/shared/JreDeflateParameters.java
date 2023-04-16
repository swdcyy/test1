package com.google.archivepatcher.shared.JreDeflateParameters;
import java.lang.Enum;
import java.lang.String;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Object;
import java.lang.StringBuilder;

public final class JreDeflateParameters extends Enum	// class@0016fd
{
    public final int level;
    public final boolean nowrap;
    public final int strategy;
    public static final JreDeflateParameters[] $VALUES;
    public static final JreDeflateParameters LEVEL1_STRATEGY0_NOWRAP;
    public static final JreDeflateParameters LEVEL1_STRATEGY0_WRAP;
    public static final JreDeflateParameters LEVEL1_STRATEGY1_NOWRAP;
    public static final JreDeflateParameters LEVEL1_STRATEGY1_WRAP;
    public static final JreDeflateParameters LEVEL1_STRATEGY2_NOWRAP;
    public static final JreDeflateParameters LEVEL1_STRATEGY2_WRAP;
    public static final JreDeflateParameters LEVEL2_STRATEGY0_NOWRAP;
    public static final JreDeflateParameters LEVEL2_STRATEGY0_WRAP;
    public static final JreDeflateParameters LEVEL2_STRATEGY1_NOWRAP;
    public static final JreDeflateParameters LEVEL2_STRATEGY1_WRAP;
    public static final JreDeflateParameters LEVEL2_STRATEGY2_NOWRAP;
    public static final JreDeflateParameters LEVEL2_STRATEGY2_WRAP;
    public static final JreDeflateParameters LEVEL3_STRATEGY0_NOWRAP;
    public static final JreDeflateParameters LEVEL3_STRATEGY0_WRAP;
    public static final JreDeflateParameters LEVEL3_STRATEGY1_NOWRAP;
    public static final JreDeflateParameters LEVEL3_STRATEGY1_WRAP;
    public static final JreDeflateParameters LEVEL3_STRATEGY2_NOWRAP;
    public static final JreDeflateParameters LEVEL3_STRATEGY2_WRAP;
    public static final JreDeflateParameters LEVEL4_STRATEGY0_NOWRAP;
    public static final JreDeflateParameters LEVEL4_STRATEGY0_WRAP;
    public static final JreDeflateParameters LEVEL4_STRATEGY1_NOWRAP;
    public static final JreDeflateParameters LEVEL4_STRATEGY1_WRAP;
    public static final JreDeflateParameters LEVEL4_STRATEGY2_NOWRAP;
    public static final JreDeflateParameters LEVEL4_STRATEGY2_WRAP;
    public static final JreDeflateParameters LEVEL5_STRATEGY0_NOWRAP;
    public static final JreDeflateParameters LEVEL5_STRATEGY0_WRAP;
    public static final JreDeflateParameters LEVEL5_STRATEGY1_NOWRAP;
    public static final JreDeflateParameters LEVEL5_STRATEGY1_WRAP;
    public static final JreDeflateParameters LEVEL5_STRATEGY2_NOWRAP;
    public static final JreDeflateParameters LEVEL5_STRATEGY2_WRAP;
    public static final JreDeflateParameters LEVEL6_STRATEGY0_NOWRAP;
    public static final JreDeflateParameters LEVEL6_STRATEGY0_WRAP;
    public static final JreDeflateParameters LEVEL6_STRATEGY1_NOWRAP;
    public static final JreDeflateParameters LEVEL6_STRATEGY1_WRAP;
    public static final JreDeflateParameters LEVEL6_STRATEGY2_NOWRAP;
    public static final JreDeflateParameters LEVEL6_STRATEGY2_WRAP;
    public static final JreDeflateParameters LEVEL7_STRATEGY0_NOWRAP;
    public static final JreDeflateParameters LEVEL7_STRATEGY0_WRAP;
    public static final JreDeflateParameters LEVEL7_STRATEGY1_NOWRAP;
    public static final JreDeflateParameters LEVEL7_STRATEGY1_WRAP;
    public static final JreDeflateParameters LEVEL7_STRATEGY2_NOWRAP;
    public static final JreDeflateParameters LEVEL7_STRATEGY2_WRAP;
    public static final JreDeflateParameters LEVEL8_STRATEGY0_NOWRAP;
    public static final JreDeflateParameters LEVEL8_STRATEGY0_WRAP;
    public static final JreDeflateParameters LEVEL8_STRATEGY1_NOWRAP;
    public static final JreDeflateParameters LEVEL8_STRATEGY1_WRAP;
    public static final JreDeflateParameters LEVEL8_STRATEGY2_NOWRAP;
    public static final JreDeflateParameters LEVEL8_STRATEGY2_WRAP;
    public static final JreDeflateParameters LEVEL9_STRATEGY0_NOWRAP;
    public static final JreDeflateParameters LEVEL9_STRATEGY0_WRAP;
    public static final JreDeflateParameters LEVEL9_STRATEGY1_NOWRAP;
    public static final JreDeflateParameters LEVEL9_STRATEGY1_WRAP;
    public static final JreDeflateParameters LEVEL9_STRATEGY2_NOWRAP;
    public static final JreDeflateParameters LEVEL9_STRATEGY2_WRAP;

    static {
       JreDeflateParameters jreDeflatePa = new JreDeflateParameters("LEVEL1_STRATEGY0_NOWRAP", 0, 1, 0, true);
       JreDeflateParameters.LEVEL1_STRATEGY0_NOWRAP = v6;
       JreDeflateParameters jreDeflatePa1 = new JreDeflateParameters("LEVEL2_STRATEGY0_NOWRAP", 1, 2, 0, true);
       JreDeflateParameters.LEVEL2_STRATEGY0_NOWRAP = jreDeflatePa;
       JreDeflateParameters jreDeflatePa2 = new JreDeflateParameters("LEVEL3_STRATEGY0_NOWRAP", 2, 3, 0, true);
       JreDeflateParameters.LEVEL3_STRATEGY0_NOWRAP = v1;
       jreDeflatePa1 = new JreDeflateParameters("LEVEL4_STRATEGY0_NOWRAP", 3, 4, 0, true);
       JreDeflateParameters.LEVEL4_STRATEGY0_NOWRAP = v2;
       jreDeflatePa2 = new JreDeflateParameters("LEVEL5_STRATEGY0_NOWRAP", 4, 5, 0, true);
       JreDeflateParameters.LEVEL5_STRATEGY0_NOWRAP = v3;
       jreDeflatePa1 = new JreDeflateParameters("LEVEL6_STRATEGY0_NOWRAP", 5, 6, 0, true);
       JreDeflateParameters.LEVEL6_STRATEGY0_NOWRAP = v4;
       jreDeflatePa2 = new JreDeflateParameters("LEVEL7_STRATEGY0_NOWRAP", 6, 7, 0, true);
       JreDeflateParameters.LEVEL7_STRATEGY0_NOWRAP = v5;
       jreDeflatePa1 = new JreDeflateParameters("LEVEL8_STRATEGY0_NOWRAP", 7, 8, 0, true);
       JreDeflateParameters.LEVEL8_STRATEGY0_NOWRAP = jreDeflatePa2;
       JreDeflateParameters jreDeflatePa3 = new JreDeflateParameters("LEVEL9_STRATEGY0_NOWRAP", 8, 9, 0, true);
       JreDeflateParameters.LEVEL9_STRATEGY0_NOWRAP = jreDeflatePa1;
       JreDeflateParameters jreDeflatePa4 = new JreDeflateParameters("LEVEL1_STRATEGY1_NOWRAP", 9, 1, 1, true);
       JreDeflateParameters.LEVEL1_STRATEGY1_NOWRAP = v8;
       jreDeflatePa3 = new JreDeflateParameters("LEVEL2_STRATEGY1_NOWRAP", 10, 2, 1, true);
       JreDeflateParameters.LEVEL2_STRATEGY1_NOWRAP = v9;
       jreDeflatePa4 = new JreDeflateParameters("LEVEL3_STRATEGY1_NOWRAP", 11, 3, 1, true);
       JreDeflateParameters.LEVEL3_STRATEGY1_NOWRAP = v10;
       jreDeflatePa3 = new JreDeflateParameters("LEVEL4_STRATEGY1_NOWRAP", 12, 4, 1, true);
       JreDeflateParameters.LEVEL4_STRATEGY1_NOWRAP = v11;
       jreDeflatePa4 = new JreDeflateParameters("LEVEL5_STRATEGY1_NOWRAP", 13, 5, 1, true);
       JreDeflateParameters.LEVEL5_STRATEGY1_NOWRAP = v12;
       jreDeflatePa3 = new JreDeflateParameters("LEVEL6_STRATEGY1_NOWRAP", 14, 6, 1, true);
       JreDeflateParameters.LEVEL6_STRATEGY1_NOWRAP = jreDeflatePa4;
       JreDeflateParameters jreDeflatePa5 = new JreDeflateParameters("LEVEL7_STRATEGY1_NOWRAP", 15, 7, true, true);
       JreDeflateParameters.LEVEL7_STRATEGY1_NOWRAP = jreDeflatePa3;
       JreDeflateParameters jreDeflatePa6 = new JreDeflateParameters("LEVEL8_STRATEGY1_NOWRAP", 16, 8, 1, true);
       JreDeflateParameters.LEVEL8_STRATEGY1_NOWRAP = v15;
       jreDeflatePa5 = new JreDeflateParameters("LEVEL9_STRATEGY1_NOWRAP", 17, 9, true, true);
       JreDeflateParameters.LEVEL9_STRATEGY1_NOWRAP = v16;
       jreDeflatePa6 = new JreDeflateParameters("LEVEL1_STRATEGY2_NOWRAP", 18, 1, 2, true);
       JreDeflateParameters.LEVEL1_STRATEGY2_NOWRAP = v17;
       jreDeflatePa5 = new JreDeflateParameters("LEVEL2_STRATEGY2_NOWRAP", 19, 2, 2, true);
       JreDeflateParameters.LEVEL2_STRATEGY2_NOWRAP = v18;
       jreDeflatePa6 = new JreDeflateParameters("LEVEL3_STRATEGY2_NOWRAP", 20, 3, 2, true);
       JreDeflateParameters.LEVEL3_STRATEGY2_NOWRAP = v19;
       jreDeflatePa5 = new JreDeflateParameters("LEVEL4_STRATEGY2_NOWRAP", 21, 4, 2, true);
       JreDeflateParameters.LEVEL4_STRATEGY2_NOWRAP = jreDeflatePa6;
       JreDeflateParameters jreDeflatePa7 = new JreDeflateParameters("LEVEL5_STRATEGY2_NOWRAP", 22, 5, 2, true);
       JreDeflateParameters.LEVEL5_STRATEGY2_NOWRAP = jreDeflatePa5;
       JreDeflateParameters jreDeflatePa8 = new JreDeflateParameters("LEVEL6_STRATEGY2_NOWRAP", 23, 6, 2, true);
       JreDeflateParameters.LEVEL6_STRATEGY2_NOWRAP = v22;
       jreDeflatePa7 = new JreDeflateParameters("LEVEL7_STRATEGY2_NOWRAP", 24, 7, 2, true);
       JreDeflateParameters.LEVEL7_STRATEGY2_NOWRAP = v23;
       jreDeflatePa8 = new JreDeflateParameters("LEVEL8_STRATEGY2_NOWRAP", 25, 8, 2, true);
       JreDeflateParameters.LEVEL8_STRATEGY2_NOWRAP = v24;
       jreDeflatePa7 = new JreDeflateParameters("LEVEL9_STRATEGY2_NOWRAP", 26, 9, 2, true);
       JreDeflateParameters.LEVEL9_STRATEGY2_NOWRAP = v25;
       jreDeflatePa8 = new JreDeflateParameters("LEVEL1_STRATEGY0_WRAP", 27, 1, 0, false);
       JreDeflateParameters.LEVEL1_STRATEGY0_WRAP = v26;
       jreDeflatePa7 = new JreDeflateParameters("LEVEL2_STRATEGY0_WRAP", 28, 2, 0, false);
       JreDeflateParameters.LEVEL2_STRATEGY0_WRAP = jreDeflatePa8;
       JreDeflateParameters jreDeflatePa9 = new JreDeflateParameters("LEVEL3_STRATEGY0_WRAP", 29, 3, false, false);
       JreDeflateParameters.LEVEL3_STRATEGY0_WRAP = jreDeflatePa7;
       JreDeflateParameters jreDeflatePa10 = new JreDeflateParameters("LEVEL4_STRATEGY0_WRAP", 30, 4, 0, false);
       JreDeflateParameters.LEVEL4_STRATEGY0_WRAP = v29;
       jreDeflatePa9 = new JreDeflateParameters("LEVEL5_STRATEGY0_WRAP", 31, 5, false, false);
       JreDeflateParameters.LEVEL5_STRATEGY0_WRAP = v30;
       jreDeflatePa10 = new JreDeflateParameters("LEVEL6_STRATEGY0_WRAP", 32, 6, 0, false);
       JreDeflateParameters.LEVEL6_STRATEGY0_WRAP = v31;
       jreDeflatePa9 = new JreDeflateParameters("LEVEL7_STRATEGY0_WRAP", 33, 7, false, false);
       JreDeflateParameters.LEVEL7_STRATEGY0_WRAP = v32;
       jreDeflatePa10 = new JreDeflateParameters("LEVEL8_STRATEGY0_WRAP", 34, 8, 0, false);
       JreDeflateParameters.LEVEL8_STRATEGY0_WRAP = v33;
       jreDeflatePa9 = new JreDeflateParameters("LEVEL9_STRATEGY0_WRAP", 35, 9, false, false);
       JreDeflateParameters.LEVEL9_STRATEGY0_WRAP = jreDeflatePa10;
       JreDeflateParameters jreDeflatePa11 = new JreDeflateParameters("LEVEL1_STRATEGY1_WRAP", 36, 1, 1, false);
       JreDeflateParameters.LEVEL1_STRATEGY1_WRAP = jreDeflatePa9;
       JreDeflateParameters jreDeflatePa12 = new JreDeflateParameters("LEVEL2_STRATEGY1_WRAP", 37, 2, 1, false);
       JreDeflateParameters.LEVEL2_STRATEGY1_WRAP = v36;
       jreDeflatePa11 = new JreDeflateParameters("LEVEL3_STRATEGY1_WRAP", 38, 3, 1, false);
       JreDeflateParameters.LEVEL3_STRATEGY1_WRAP = v37;
       jreDeflatePa12 = new JreDeflateParameters("LEVEL4_STRATEGY1_WRAP", 39, 4, 1, false);
       JreDeflateParameters.LEVEL4_STRATEGY1_WRAP = v38;
       jreDeflatePa11 = new JreDeflateParameters("LEVEL5_STRATEGY1_WRAP", 40, 5, 1, false);
       JreDeflateParameters.LEVEL5_STRATEGY1_WRAP = v39;
       jreDeflatePa12 = new JreDeflateParameters("LEVEL6_STRATEGY1_WRAP", 41, 6, 1, false);
       JreDeflateParameters.LEVEL6_STRATEGY1_WRAP = v40;
       jreDeflatePa11 = new JreDeflateParameters("LEVEL7_STRATEGY1_WRAP", 42, 7, 1, false);
       JreDeflateParameters.LEVEL7_STRATEGY1_WRAP = jreDeflatePa12;
       JreDeflateParameters jreDeflatePa13 = new JreDeflateParameters("LEVEL8_STRATEGY1_WRAP", 43, 8, 1, false);
       JreDeflateParameters.LEVEL8_STRATEGY1_WRAP = jreDeflatePa11;
       JreDeflateParameters jreDeflatePa14 = new JreDeflateParameters("LEVEL9_STRATEGY1_WRAP", 44, 9, 1, false);
       JreDeflateParameters.LEVEL9_STRATEGY1_WRAP = v43;
       jreDeflatePa13 = new JreDeflateParameters("LEVEL1_STRATEGY2_WRAP", 45, 1, 2, false);
       JreDeflateParameters.LEVEL1_STRATEGY2_WRAP = v44;
       jreDeflatePa14 = new JreDeflateParameters("LEVEL2_STRATEGY2_WRAP", 46, 2, 2, false);
       JreDeflateParameters.LEVEL2_STRATEGY2_WRAP = v45;
       jreDeflatePa13 = new JreDeflateParameters("LEVEL3_STRATEGY2_WRAP", 47, 3, 2, false);
       JreDeflateParameters.LEVEL3_STRATEGY2_WRAP = v46;
       jreDeflatePa14 = new JreDeflateParameters("LEVEL4_STRATEGY2_WRAP", 48, 4, 2, false);
       JreDeflateParameters.LEVEL4_STRATEGY2_WRAP = v47;
       jreDeflatePa13 = new JreDeflateParameters("LEVEL5_STRATEGY2_WRAP", 49, 5, 2, false);
       JreDeflateParameters.LEVEL5_STRATEGY2_WRAP = jreDeflatePa14;
       JreDeflateParameters jreDeflatePa15 = new JreDeflateParameters("LEVEL6_STRATEGY2_WRAP", 50, 6, 2, false);
       JreDeflateParameters.LEVEL6_STRATEGY2_WRAP = jreDeflatePa13;
       JreDeflateParameters jreDeflatePa16 = new JreDeflateParameters("LEVEL7_STRATEGY2_WRAP", 51, 7, 2, false);
       JreDeflateParameters.LEVEL7_STRATEGY2_WRAP = v50;
       jreDeflatePa15 = new JreDeflateParameters("LEVEL8_STRATEGY2_WRAP", 52, 8, 2, false);
       JreDeflateParameters.LEVEL8_STRATEGY2_WRAP = v51;
       jreDeflatePa16 = new JreDeflateParameters("LEVEL9_STRATEGY2_WRAP", 53, 9, 2, false);
       JreDeflateParameters.LEVEL9_STRATEGY2_WRAP = v52;
       JreDeflateParameters jreDeflatePa17 = v15;
       JreDeflateParameters[] jreDeflatePa18 = new JreDeflateParameters[54];
       jreDeflatePa18[0] = v6;
       jreDeflatePa18[1] = jreDeflatePa;
       jreDeflatePa18[2] = v1;
       jreDeflatePa18[3] = v2;
       jreDeflatePa18[4] = v3;
       jreDeflatePa18[5] = v4;
       jreDeflatePa18[6] = v5;
       jreDeflatePa18[7] = jreDeflatePa2;
       jreDeflatePa18[8] = jreDeflatePa1;
       jreDeflatePa18[9] = v8;
       jreDeflatePa18[10] = v9;
       jreDeflatePa18[11] = v10;
       jreDeflatePa18[12] = v11;
       jreDeflatePa18[13] = v12;
       jreDeflatePa18[14] = jreDeflatePa4;
       jreDeflatePa18[15] = jreDeflatePa3;
       jreDeflatePa18[16] = jreDeflatePa17;
       jreDeflatePa18[17] = v16;
       jreDeflatePa18[18] = v17;
       jreDeflatePa18[19] = v18;
       jreDeflatePa18[20] = v19;
       jreDeflatePa18[21] = jreDeflatePa6;
       jreDeflatePa18[22] = jreDeflatePa5;
       jreDeflatePa18[23] = v22;
       jreDeflatePa18[24] = v23;
       jreDeflatePa18[25] = v24;
       jreDeflatePa18[26] = v25;
       jreDeflatePa18[27] = v26;
       jreDeflatePa18[28] = jreDeflatePa8;
       jreDeflatePa18[29] = jreDeflatePa7;
       jreDeflatePa18[30] = v29;
       jreDeflatePa18[31] = v30;
       jreDeflatePa18[32] = v31;
       jreDeflatePa18[33] = v32;
       jreDeflatePa18[34] = v33;
       jreDeflatePa18[35] = jreDeflatePa10;
       jreDeflatePa18[36] = jreDeflatePa9;
       jreDeflatePa18[37] = v36;
       jreDeflatePa18[38] = v37;
       jreDeflatePa18[39] = v38;
       jreDeflatePa18[40] = v39;
       jreDeflatePa18[41] = v40;
       jreDeflatePa18[42] = jreDeflatePa12;
       jreDeflatePa18[43] = jreDeflatePa11;
       jreDeflatePa18[44] = v43;
       jreDeflatePa18[45] = v44;
       jreDeflatePa18[46] = v45;
       jreDeflatePa18[47] = v46;
       jreDeflatePa18[48] = v47;
       jreDeflatePa18[49] = jreDeflatePa14;
       jreDeflatePa18[50] = jreDeflatePa13;
       jreDeflatePa18[51] = v50;
       jreDeflatePa18[52] = v51;
       jreDeflatePa18[53] = v52;
       JreDeflateParameters.$VALUES = jreDeflatePa18;
    }
    public void JreDeflateParameters(String p0,int p1,int p2,int p3,boolean p4){
       super(p0, p1);
       if (p2 < 1 || (p2 > 9 || (p3 < 0 || p3 > 2))) {
          throw new IllegalArgumentException("Only levels 1-9 and strategies 0-2 are valid.");
       }
       this.level = p2;
       this.strategy = p3;
       this.nowrap = p4;
       return;
    }
    public static JreDeflateParameters of(int p0,int p1,boolean p2){
       switch ((((p0 * 100) + (p1 * 10)) + p2)){
           case 'd':
             return JreDeflateParameters.LEVEL1_STRATEGY0_WRAP;
           case 'e':
             return JreDeflateParameters.LEVEL1_STRATEGY0_NOWRAP;
           case 'n':
             return JreDeflateParameters.LEVEL1_STRATEGY1_WRAP;
           case 'o':
             return JreDeflateParameters.LEVEL1_STRATEGY1_NOWRAP;
           case 'x':
             return JreDeflateParameters.LEVEL1_STRATEGY2_WRAP;
           case 'y':
             return JreDeflateParameters.LEVEL1_STRATEGY2_NOWRAP;
           case 200:
             return JreDeflateParameters.LEVEL2_STRATEGY0_WRAP;
           case 201:
             return JreDeflateParameters.LEVEL2_STRATEGY0_NOWRAP;
           case 210:
             return JreDeflateParameters.LEVEL2_STRATEGY1_WRAP;
           case 211:
             return JreDeflateParameters.LEVEL2_STRATEGY1_NOWRAP;
           case 220:
             return JreDeflateParameters.LEVEL2_STRATEGY2_WRAP;
           case 221:
             return JreDeflateParameters.LEVEL2_STRATEGY2_NOWRAP;
           case 300:
             return JreDeflateParameters.LEVEL3_STRATEGY0_WRAP;
           case 301:
             return JreDeflateParameters.LEVEL3_STRATEGY0_NOWRAP;
           case 310:
             return JreDeflateParameters.LEVEL3_STRATEGY1_WRAP;
           case 311:
             return JreDeflateParameters.LEVEL3_STRATEGY1_NOWRAP;
           case 320:
             return JreDeflateParameters.LEVEL3_STRATEGY2_WRAP;
           case 321:
             return JreDeflateParameters.LEVEL3_STRATEGY2_NOWRAP;
           case 400:
             return JreDeflateParameters.LEVEL4_STRATEGY0_WRAP;
           case 401:
             return JreDeflateParameters.LEVEL4_STRATEGY0_NOWRAP;
           case 410:
             return JreDeflateParameters.LEVEL4_STRATEGY1_WRAP;
           case 411:
             return JreDeflateParameters.LEVEL4_STRATEGY1_NOWRAP;
           case 420:
             return JreDeflateParameters.LEVEL4_STRATEGY2_WRAP;
           case 421:
             return JreDeflateParameters.LEVEL4_STRATEGY2_NOWRAP;
           case 500:
             return JreDeflateParameters.LEVEL5_STRATEGY0_WRAP;
           case 501:
             return JreDeflateParameters.LEVEL5_STRATEGY0_NOWRAP;
           case 510:
             return JreDeflateParameters.LEVEL5_STRATEGY1_WRAP;
           case 511:
             return JreDeflateParameters.LEVEL5_STRATEGY1_NOWRAP;
           case 520:
             return JreDeflateParameters.LEVEL5_STRATEGY2_WRAP;
           case 521:
             return JreDeflateParameters.LEVEL5_STRATEGY2_NOWRAP;
           case 600:
             return JreDeflateParameters.LEVEL6_STRATEGY0_WRAP;
           case 601:
             return JreDeflateParameters.LEVEL6_STRATEGY0_NOWRAP;
           case 610:
             return JreDeflateParameters.LEVEL6_STRATEGY1_WRAP;
           case 611:
             return JreDeflateParameters.LEVEL6_STRATEGY1_NOWRAP;
           case 620:
             return JreDeflateParameters.LEVEL6_STRATEGY2_WRAP;
           case 621:
             return JreDeflateParameters.LEVEL6_STRATEGY2_NOWRAP;
           case 700:
             return JreDeflateParameters.LEVEL7_STRATEGY0_WRAP;
           case 701:
             return JreDeflateParameters.LEVEL7_STRATEGY0_NOWRAP;
           case 710:
             return JreDeflateParameters.LEVEL7_STRATEGY1_WRAP;
           case 711:
             return JreDeflateParameters.LEVEL7_STRATEGY1_NOWRAP;
           case 720:
             return JreDeflateParameters.LEVEL7_STRATEGY2_WRAP;
           case 721:
             return JreDeflateParameters.LEVEL7_STRATEGY2_NOWRAP;
           case 800:
             return JreDeflateParameters.LEVEL8_STRATEGY0_WRAP;
           case 801:
             return JreDeflateParameters.LEVEL8_STRATEGY0_NOWRAP;
           case 810:
             return JreDeflateParameters.LEVEL8_STRATEGY1_WRAP;
           case 811:
             return JreDeflateParameters.LEVEL8_STRATEGY1_NOWRAP;
           case 820:
             return JreDeflateParameters.LEVEL8_STRATEGY2_WRAP;
           case 821:
             return JreDeflateParameters.LEVEL8_STRATEGY2_NOWRAP;
           case 900:
             return JreDeflateParameters.LEVEL9_STRATEGY0_WRAP;
           case 901:
             return JreDeflateParameters.LEVEL9_STRATEGY0_NOWRAP;
           case 910:
             return JreDeflateParameters.LEVEL9_STRATEGY1_WRAP;
           case 911:
             return JreDeflateParameters.LEVEL9_STRATEGY1_NOWRAP;
           case 920:
             return JreDeflateParameters.LEVEL9_STRATEGY2_WRAP;
           case 921:
             return JreDeflateParameters.LEVEL9_STRATEGY2_NOWRAP;
           default:
             throw new IllegalArgumentException("No such parameters");
       }
    }
    public static JreDeflateParameters parseString(String p0){
       String[] stringArray = p0.split(",");
       return JreDeflateParameters.of(Integer.parseInt((stringArray[0]).split("=")[1]), Integer.parseInt((stringArray[1]).split("=")[1]), Boolean.parseBoolean((stringArray[2]).split("=")[1]));
    }
    public static JreDeflateParameters valueOf(String p0){
       return Enum.valueOf(JreDeflateParameters.class, p0);
    }
    public static JreDeflateParameters[] values(){
       return JreDeflateParameters.$VALUES.clone();
    }
    public String toString(){
       return "level="+this.level+",strategy="+this.strategy+",nowrap="+this.nowrap;
    }
}
