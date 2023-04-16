package com.kuaishou.common.encryption.model.enums.GiftUserSource;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class GiftUserSource extends Enum	// class@0016ca
{
    public int value;
    public static final GiftUserSource[] $VALUES;
    public static final GiftUserSource DEFAULT;
    public static final GiftUserSource LIVE_FANS_TOP;

    static {
       GiftUserSource giftUserSour = new GiftUserSource("DEFAULT", 0, 0);
       GiftUserSource.DEFAULT = giftUserSour;
       GiftUserSource giftUserSour1 = new GiftUserSource("LIVE_FANS_TOP", 1, 1);
       GiftUserSource.LIVE_FANS_TOP = giftUserSour1;
       GiftUserSource[] giftUserSour2 = new GiftUserSource[]{giftUserSour,giftUserSour1};
       GiftUserSource.$VALUES = giftUserSour2;
    }
    public void GiftUserSource(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static GiftUserSource valueOf(String p0){
       return Enum.valueOf(GiftUserSource.class, p0);
    }
    public static GiftUserSource[] values(){
       return GiftUserSource.$VALUES.clone();
    }
    public int getValue(){
       return this.value;
    }
}
