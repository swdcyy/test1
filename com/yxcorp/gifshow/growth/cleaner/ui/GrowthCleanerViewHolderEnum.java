package com.yxcorp.gifshow.growth.cleaner.ui.GrowthCleanerViewHolderEnum;
import java.lang.Enum;
import gna.d$a;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import java.lang.String;
import gna.d$b;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class GrowthCleanerViewHolderEnum extends Enum	// class@001354
{
    public final d clazz;
    public static final GrowthCleanerViewHolderEnum[] $VALUES;
    public static final GrowthCleanerViewHolderEnum SelectItem;
    public static final GrowthCleanerViewHolderEnum SelectTitle;

    static {
       GrowthCleanerViewHolderEnum growthCleane1;
       GrowthCleanerViewHolderEnum[] growthCleane = new GrowthCleanerViewHolderEnum[]{growthCleane1,growthCleane1};
       growthCleane1 = new GrowthCleanerViewHolderEnum("SelectItem", 0, m0.d(d$a.class));
       GrowthCleanerViewHolderEnum.SelectItem = growthCleane1;
       growthCleane1 = new GrowthCleanerViewHolderEnum("SelectTitle", 1, m0.d(d$b.class));
       GrowthCleanerViewHolderEnum.SelectTitle = growthCleane1;
       GrowthCleanerViewHolderEnum.$VALUES = growthCleane;
    }
    public void GrowthCleanerViewHolderEnum(String p0,int p1,d p2){
       super(p0, p1);
       this.clazz = p2;
    }
    public static GrowthCleanerViewHolderEnum valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, GrowthCleanerViewHolderEnum.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(GrowthCleanerViewHolderEnum.class, p0);
    }
    public static GrowthCleanerViewHolderEnum[] values(){
       Object obj = PatchProxy.apply(null, null, GrowthCleanerViewHolderEnum.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GrowthCleanerViewHolderEnum.$VALUES.clone();
    }
    public final d getClazz(){
       return this.clazz;
    }
}
