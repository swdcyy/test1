package com.kwai.feature.api.live.service.basic.bizrelation.EntryBizRelation;
import aq5.a;
import java.lang.Enum;
import java.lang.String;
import java.util.HashMap;
import java.lang.Object;
import java.util.ArrayList;
import ekd.j;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ekd.e0;
import android.content.res.Resources;
import android.content.Context;
import java.lang.Number;
import java.lang.Long;
import java.util.List;
import java.util.Collection;
import ekd.q;

public final class EntryBizRelation extends Enum implements a	// class@001000
{
    public int mNameResId;
    public int mPriority;
    public Long mRelationBits;
    public static final EntryBizRelation[] $VALUES;
    public static final EntryBizRelation CONVERSION_TASK;
    public static final EntryBizRelation COURSE;
    public static final EntryBizRelation HOUSE;
    public static final EntryBizRelation LIVE_PAID_SHOW;
    public static final EntryBizRelation LOCAL_LIFE;
    public static final EntryBizRelation MERCHANT_CONFIRM;
    public static final EntryBizRelation PRIVATE_SETTING;
    public static final EntryBizRelation TUNA;
    public static Map mBizRelationMap;

    static {
       EntryBizRelation uEntryBizRel = new EntryBizRelation("CONVERSION_TASK", 0, 999, 0x7f103ffb);
       EntryBizRelation.CONVERSION_TASK = uEntryBizRel;
       EntryBizRelation uEntryBizRel1 = new EntryBizRelation("MERCHANT_CONFIRM", 1, 999, 0x7f1020eb);
       EntryBizRelation.MERCHANT_CONFIRM = uEntryBizRel1;
       EntryBizRelation uEntryBizRel2 = new EntryBizRelation("COURSE", 2, 999, 0x7f1020ea);
       EntryBizRelation.COURSE = uEntryBizRel2;
       EntryBizRelation uEntryBizRel3 = new EntryBizRelation("PRIVATE_SETTING", 3, 999, 0x7f1020ec);
       EntryBizRelation.PRIVATE_SETTING = uEntryBizRel3;
       EntryBizRelation uEntryBizRel4 = new EntryBizRelation("LIVE_PAID_SHOW", 4, 999, 0x7f10287e);
       EntryBizRelation.LIVE_PAID_SHOW = uEntryBizRel4;
       EntryBizRelation uEntryBizRel5 = new EntryBizRelation("TUNA", 5, 999, 0x7f104e55);
       EntryBizRelation.TUNA = uEntryBizRel5;
       EntryBizRelation uEntryBizRel6 = new EntryBizRelation("HOUSE", 6, 999, 0x7f101563);
       EntryBizRelation.HOUSE = uEntryBizRel6;
       EntryBizRelation uEntryBizRel7 = new EntryBizRelation("LOCAL_LIFE", 7, 999, 0x7f102f7e);
       EntryBizRelation.LOCAL_LIFE = uEntryBizRel7;
       EntryBizRelation[] uEntryBizRel8 = new EntryBizRelation[]{uEntryBizRel,uEntryBizRel1,uEntryBizRel2,uEntryBizRel3,uEntryBizRel4,uEntryBizRel5,uEntryBizRel6,uEntryBizRel7};
       EntryBizRelation.$VALUES = uEntryBizRel8;
       HashMap hashMap = new HashMap();
       EntryBizRelation.mBizRelationMap = hashMap;
       EntryBizRelation[] uEntryBizRel9 = new EntryBizRelation[]{uEntryBizRel4,uEntryBizRel1,uEntryBizRel5,uEntryBizRel6,uEntryBizRel7};
       hashMap.put(uEntryBizRel, j.a(uEntryBizRel9));
       uEntryBizRel9 = new EntryBizRelation[]{uEntryBizRel4,uEntryBizRel,uEntryBizRel5,uEntryBizRel6,uEntryBizRel7};
       EntryBizRelation.mBizRelationMap.put(uEntryBizRel1, j.a(uEntryBizRel9));
       EntryBizRelation[] uEntryBizRel10 = new EntryBizRelation[]{uEntryBizRel4,uEntryBizRel5,uEntryBizRel6,uEntryBizRel7};
       EntryBizRelation.mBizRelationMap.put(uEntryBizRel2, j.a(uEntryBizRel10));
       uEntryBizRel10 = new EntryBizRelation[]{uEntryBizRel4,uEntryBizRel5,uEntryBizRel6,uEntryBizRel7};
       EntryBizRelation.mBizRelationMap.put(uEntryBizRel3, j.a(uEntryBizRel10));
       uEntryBizRel9 = new EntryBizRelation[]{uEntryBizRel,uEntryBizRel1,uEntryBizRel2,uEntryBizRel3,uEntryBizRel5,uEntryBizRel6,uEntryBizRel7};
       EntryBizRelation.mBizRelationMap.put(uEntryBizRel4, j.a(uEntryBizRel9));
       uEntryBizRel9 = new EntryBizRelation[]{uEntryBizRel,uEntryBizRel1,uEntryBizRel2,uEntryBizRel3,uEntryBizRel6,uEntryBizRel7,uEntryBizRel4};
       EntryBizRelation.mBizRelationMap.put(uEntryBizRel5, j.a(uEntryBizRel9));
       uEntryBizRel9 = new EntryBizRelation[]{uEntryBizRel,uEntryBizRel1,uEntryBizRel2,uEntryBizRel3,uEntryBizRel5,uEntryBizRel6,uEntryBizRel4};
       EntryBizRelation.mBizRelationMap.put(uEntryBizRel7, j.a(uEntryBizRel9));
       uEntryBizRel10 = new EntryBizRelation[]{uEntryBizRel,uEntryBizRel1,uEntryBizRel2,uEntryBizRel3,uEntryBizRel5,uEntryBizRel7,uEntryBizRel4};
       EntryBizRelation.mBizRelationMap.put(uEntryBizRel6, j.a(uEntryBizRel10));
    }
    public void EntryBizRelation(String p0,int p1,int p2,int p3){
       super(p0, p1);
       this.mPriority = p2;
       this.mNameResId = p3;
    }
    public static EntryBizRelation valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EntryBizRelation.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(EntryBizRelation.class, p0);
    }
    public static EntryBizRelation[] values(){
       Object obj = PatchProxy.apply(null, null, EntryBizRelation.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EntryBizRelation.$VALUES.clone();
    }
    public String getName(){
       Object obj = PatchProxy.apply(null, this, EntryBizRelation.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e0.b.getResources().getString(this.mNameResId);
    }
    public int getPositionInStatusBits(){
       Object obj = PatchProxy.apply(null, this, EntryBizRelation.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.ordinal();
    }
    public int getPriority(){
       return this.mPriority;
    }
    public long getRelationBits(){
       List obj = PatchProxy.apply(null, this, EntryBizRelation.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (this.mRelationBits == null) {
          this.mRelationBits = Long.valueOf(0);
          obj = EntryBizRelation.mBizRelationMap.get(this);
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
