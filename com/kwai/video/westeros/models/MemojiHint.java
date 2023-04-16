package com.kwai.video.westeros.models.MemojiHint;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.video.westeros.models.MemojiHint$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.video.westeros.models.MemojiHint$MemojiHintVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class MemojiHint extends Enum implements Internal$EnumLite	// class@000fb3
{
    public final int value;
    public static final MemojiHint[] $VALUES;
    public static final MemojiHint UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;
    public static final MemojiHint kNeedCloseMouth;
    public static final MemojiHint kNeedKeep;
    public static final MemojiHint kNeedLower;
    public static final MemojiHint kNeedTurnLeft;
    public static final MemojiHint kNeedTurnRight;
    public static final MemojiHint kNeedUpper;
    public static final MemojiHint kTracked;

    static {
       MemojiHint memojiHint = new MemojiHint("kNeedKeep", 0, 0);
       MemojiHint.kNeedKeep = memojiHint;
       MemojiHint memojiHint1 = new MemojiHint("kNeedLower", 1, 1);
       MemojiHint.kNeedLower = memojiHint1;
       MemojiHint memojiHint2 = new MemojiHint("kNeedUpper", 2, 2);
       MemojiHint.kNeedUpper = memojiHint2;
       MemojiHint memojiHint3 = new MemojiHint("kNeedTurnLeft", 3, 3);
       MemojiHint.kNeedTurnLeft = memojiHint3;
       MemojiHint memojiHint4 = new MemojiHint("kNeedTurnRight", 4, 4);
       MemojiHint.kNeedTurnRight = memojiHint4;
       MemojiHint memojiHint5 = new MemojiHint("kNeedCloseMouth", 5, 5);
       MemojiHint.kNeedCloseMouth = memojiHint5;
       MemojiHint memojiHint6 = new MemojiHint("kTracked", 6, 6);
       MemojiHint.kTracked = memojiHint6;
       MemojiHint memojiHint7 = new MemojiHint("UNRECOGNIZED", 7, -1);
       MemojiHint.UNRECOGNIZED = memojiHint7;
       MemojiHint[] memojiHintAr = new MemojiHint[]{memojiHint,memojiHint1,memojiHint2,memojiHint3,memojiHint4,memojiHint5,memojiHint6,memojiHint7};
       MemojiHint.$VALUES = memojiHintAr;
       MemojiHint.internalValueMap = new MemojiHint$1();
    }
    public void MemojiHint(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static MemojiHint forNumber(int p0){
       switch (p0){
           case 0:
             return MemojiHint.kNeedKeep;
           case 1:
             return MemojiHint.kNeedLower;
           case 2:
             return MemojiHint.kNeedUpper;
           case 3:
             return MemojiHint.kNeedTurnLeft;
           case 4:
             return MemojiHint.kNeedTurnRight;
           case 5:
             return MemojiHint.kNeedCloseMouth;
           case 6:
             return MemojiHint.kTracked;
           default:
             return null;
       }
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return MemojiHint.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return MemojiHint$MemojiHintVerifier.INSTANCE;
    }
    public static MemojiHint valueOf(int p0){
       return MemojiHint.forNumber(p0);
    }
    public static MemojiHint valueOf(String p0){
       return Enum.valueOf(MemojiHint.class, p0);
    }
    public static MemojiHint[] values(){
       return MemojiHint.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != MemojiHint.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
