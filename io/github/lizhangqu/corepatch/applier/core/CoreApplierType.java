package io.github.lizhangqu.corepatch.applier.core.CoreApplierType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class CoreApplierType extends Enum	// class@001036
{
    public String name;
    public static final CoreApplierType[] $VALUES;
    public static final CoreApplierType ARCHIVE;
    public static final CoreApplierType BS;
    public static final CoreApplierType TOTAL;

    static {
       CoreApplierType uCoreApplier = new CoreApplierType("TOTAL", 0, "TOTAL");
       CoreApplierType.TOTAL = uCoreApplier;
       CoreApplierType uCoreApplier1 = new CoreApplierType("BS", 1, "BS");
       CoreApplierType.BS = uCoreApplier1;
       CoreApplierType uCoreApplier2 = new CoreApplierType("ARCHIVE", 2, "ARCHIVE");
       CoreApplierType.ARCHIVE = uCoreApplier2;
       CoreApplierType[] uCoreApplier3 = new CoreApplierType[]{uCoreApplier,uCoreApplier1,uCoreApplier2};
       CoreApplierType.$VALUES = uCoreApplier3;
    }
    public void CoreApplierType(String p0,int p1,String p2){
       super(p0, p1);
       this.name = p2;
    }
    public static CoreApplierType valueOf(String p0){
       return Enum.valueOf(CoreApplierType.class, p0);
    }
    public static CoreApplierType[] values(){
       return CoreApplierType.$VALUES.clone();
    }
    public String getName(){
       return this.name;
    }
}
