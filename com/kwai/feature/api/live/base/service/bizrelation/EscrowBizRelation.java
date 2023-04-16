package com.kwai.feature.api.live.base.service.bizrelation.EscrowBizRelation;
import aq5.a;
import java.lang.Enum;
import java.lang.String;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Long;
import java.util.Map;
import java.util.List;
import java.util.Collection;
import ekd.q;

public final class EscrowBizRelation extends Enum implements a	// class@000f96
{
    public final int mPriority;
    public Long mRelationBits;
    public static final EscrowBizRelation[] $VALUES;
    public static final EscrowBizRelation EMPTY;
    public static final Map mBizRelationMap;

    static {
       EscrowBizRelation uEscrowBizRe = new EscrowBizRelation("EMPTY", 0, -1);
       EscrowBizRelation.EMPTY = uEscrowBizRe;
       EscrowBizRelation[] uEscrowBizRe1 = new EscrowBizRelation[]{uEscrowBizRe};
       EscrowBizRelation.$VALUES = uEscrowBizRe1;
       EscrowBizRelation.mBizRelationMap = new HashMap();
    }
    public void EscrowBizRelation(String p0,int p1,int p2){
       super(p0, p1);
       this.mPriority = p2;
    }
    public static EscrowBizRelation valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EscrowBizRelation.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(EscrowBizRelation.class, p0);
    }
    public static EscrowBizRelation[] values(){
       Object obj = PatchProxy.apply(null, null, EscrowBizRelation.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EscrowBizRelation.$VALUES.clone();
    }
    public int getPositionInStatusBits(){
       Object obj = PatchProxy.apply(null, this, EscrowBizRelation.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.ordinal();
    }
    public int getPriority(){
       return this.mPriority;
    }
    public long getRelationBits(){
       List obj = PatchProxy.apply(null, this, EscrowBizRelation.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (this.mRelationBits == null) {
          this.mRelationBits = Long.valueOf(0);
          obj = EscrowBizRelation.mBizRelationMap.get(this);
          if (!q.f(obj)) {
             for (int i = 0; i < obj.size(); i = i + 1) {
                long l = 1 << obj.get(i).ordinal();
                long l1 = this.mRelationBits.longValue() | l;
                this.mRelationBits = Long.valueOf(l1);
             }
          }
       }
       return this.mRelationBits.longValue();
    }
}
