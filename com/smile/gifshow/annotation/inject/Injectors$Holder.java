package com.smile.gifshow.annotation.inject.Injectors$Holder;
import java.lang.Enum;
import java.lang.String;
import com.smile.gifshow.annotation.inject.Injectors;
import com.smile.gifshow.annotation.inject.Injectors$a;
import java.lang.Class;
import java.lang.Object;

public final class Injectors$Holder extends Enum	// class@000c3f
{
    public Injectors mInjectors;
    public static final Injectors$Holder[] $VALUES;
    public static final Injectors$Holder INSTANCE;

    static {
       Injectors$Holder holder = new Injectors$Holder("INSTANCE", 0);
       Injectors$Holder.INSTANCE = holder;
       Injectors$Holder[] holderArray = new Injectors$Holder[]{holder};
       Injectors$Holder.$VALUES = holderArray;
    }
    public void Injectors$Holder(String p0,int p1){
       super(p0, p1);
       this.mInjectors = new Injectors(null);
    }
    public static Injectors$Holder valueOf(String p0){
       return Enum.valueOf(Injectors$Holder.class, p0);
    }
    public static Injectors$Holder[] values(){
       return Injectors$Holder.$VALUES.clone();
    }
    public Injectors getInstance(){
       return this.mInjectors;
    }
}
