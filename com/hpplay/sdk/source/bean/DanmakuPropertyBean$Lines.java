package com.hpplay.sdk.source.bean.DanmakuPropertyBean$Lines;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class DanmakuPropertyBean$Lines extends Enum	// class@000648
{
    public int value;
    public static final DanmakuPropertyBean$Lines[] $VALUES;
    public static final DanmakuPropertyBean$Lines LINES_1;
    public static final DanmakuPropertyBean$Lines LINES_10;
    public static final DanmakuPropertyBean$Lines LINES_2;
    public static final DanmakuPropertyBean$Lines LINES_3;
    public static final DanmakuPropertyBean$Lines LINES_4;
    public static final DanmakuPropertyBean$Lines LINES_5;
    public static final DanmakuPropertyBean$Lines LINES_6;
    public static final DanmakuPropertyBean$Lines LINES_7;
    public static final DanmakuPropertyBean$Lines LINES_8;
    public static final DanmakuPropertyBean$Lines LINES_9;

    static {
       DanmakuPropertyBean$Lines lines = new DanmakuPropertyBean$Lines("LINES_1", 0, 1);
       DanmakuPropertyBean$Lines.LINES_1 = lines;
       DanmakuPropertyBean$Lines lines1 = new DanmakuPropertyBean$Lines("LINES_2", 1, 2);
       DanmakuPropertyBean$Lines.LINES_2 = lines1;
       DanmakuPropertyBean$Lines lines2 = new DanmakuPropertyBean$Lines("LINES_3", 2, 3);
       DanmakuPropertyBean$Lines.LINES_3 = lines2;
       DanmakuPropertyBean$Lines lines3 = new DanmakuPropertyBean$Lines("LINES_4", 3, 4);
       DanmakuPropertyBean$Lines.LINES_4 = lines3;
       DanmakuPropertyBean$Lines lines4 = new DanmakuPropertyBean$Lines("LINES_5", 4, 5);
       DanmakuPropertyBean$Lines.LINES_5 = lines4;
       DanmakuPropertyBean$Lines lines5 = new DanmakuPropertyBean$Lines("LINES_6", 5, 6);
       DanmakuPropertyBean$Lines.LINES_6 = lines5;
       DanmakuPropertyBean$Lines lines6 = new DanmakuPropertyBean$Lines("LINES_7", 6, 7);
       DanmakuPropertyBean$Lines.LINES_7 = lines6;
       DanmakuPropertyBean$Lines lines7 = new DanmakuPropertyBean$Lines("LINES_8", 7, 8);
       DanmakuPropertyBean$Lines.LINES_8 = lines7;
       DanmakuPropertyBean$Lines lines8 = new DanmakuPropertyBean$Lines("LINES_9", 8, 9);
       DanmakuPropertyBean$Lines.LINES_9 = lines8;
       DanmakuPropertyBean$Lines lines9 = new DanmakuPropertyBean$Lines("LINES_10", 9, 10);
       DanmakuPropertyBean$Lines.LINES_10 = lines9;
       DanmakuPropertyBean$Lines[] linesArray = new DanmakuPropertyBean$Lines[10];
       linesArray[0] = lines;
       linesArray[1] = lines1;
       linesArray[2] = lines2;
       linesArray[3] = lines3;
       linesArray[4] = lines4;
       linesArray[5] = lines5;
       linesArray[6] = lines6;
       linesArray[7] = lines7;
       linesArray[8] = lines8;
       linesArray[9] = lines9;
       DanmakuPropertyBean$Lines.$VALUES = linesArray;
    }
    public void DanmakuPropertyBean$Lines(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static DanmakuPropertyBean$Lines valueOf(String p0){
       return Enum.valueOf(DanmakuPropertyBean$Lines.class, p0);
    }
    public static DanmakuPropertyBean$Lines[] values(){
       return DanmakuPropertyBean$Lines.$VALUES.clone();
    }
    public int value(){
       return this.value;
    }
}
