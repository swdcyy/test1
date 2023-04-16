package com.kuaishou.bowl.core.live.BusinessDataSource;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class BusinessDataSource extends Enum	// class@0011a3
{
    public static final BusinessDataSource[] $VALUES;
    public static final BusinessDataSource BACK_PAGE;
    public static final BusinessDataSource PAGE_INIT_MATERIAL;

    static {
       BusinessDataSource uBusinessDat = new BusinessDataSource("PAGE_INIT_MATERIAL", 0);
       BusinessDataSource.PAGE_INIT_MATERIAL = uBusinessDat;
       BusinessDataSource uBusinessDat1 = new BusinessDataSource("BACK_PAGE", 1);
       BusinessDataSource.BACK_PAGE = uBusinessDat1;
       BusinessDataSource[] uBusinessDat2 = new BusinessDataSource[]{uBusinessDat,uBusinessDat1};
       BusinessDataSource.$VALUES = uBusinessDat2;
    }
    public void BusinessDataSource(String p0,int p1){
       super(p0, p1);
    }
    public static BusinessDataSource valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BusinessDataSource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(BusinessDataSource.class, p0);
    }
    public static BusinessDataSource[] values(){
       Object obj = PatchProxy.apply(null, null, BusinessDataSource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return BusinessDataSource.$VALUES.clone();
    }
}
