package com.smile.gifshow.annotation.provider.v2.Accessors$Holder;
import java.lang.Enum;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessors;
import com.smile.gifshow.annotation.provider.v2.Accessors$a;
import java.lang.Class;
import java.lang.Object;

public final class Accessors$Holder extends Enum	// class@000c47
{
    public Accessors mInjectors;
    public static final Accessors$Holder[] $VALUES;
    public static final Accessors$Holder INSTANCE;

    static {
       Accessors$Holder holder = new Accessors$Holder("INSTANCE", 0);
       Accessors$Holder.INSTANCE = holder;
       Accessors$Holder[] holderArray = new Accessors$Holder[]{holder};
       Accessors$Holder.$VALUES = holderArray;
    }
    public void Accessors$Holder(String p0,int p1){
       super(p0, p1);
       this.mInjectors = new Accessors(null);
    }
    public static Accessors$Holder valueOf(String p0){
       return Enum.valueOf(Accessors$Holder.class, p0);
    }
    public static Accessors$Holder[] values(){
       return Accessors$Holder.$VALUES.clone();
    }
    public Accessors getInstance(){
       return this.mInjectors;
    }
}
