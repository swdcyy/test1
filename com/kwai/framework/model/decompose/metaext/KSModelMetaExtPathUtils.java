package com.kwai.framework.model.decompose.metaext.KSModelMetaExtPathUtils;
import java.util.List;
import java.lang.Integer;
import java.lang.Object;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kwai.framework.model.decompose.metaext.KSModelMetaExtPathUtils$State;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Enum;
import java.lang.Number;
import java.lang.Character;
import ha6.f;

public final class KSModelMetaExtPathUtils	// class@0016ad
{
    public static final List a;
    public static final KSModelMetaExtPathUtils b;

    static {
       Integer[] integerArray;
       Integer integer;
       Integer integer1;
       Integer[] integerArray1;
       KSModelMetaExtPathUtils.b = new KSModelMetaExtPathUtils();
       List[] listArray = new List[]{CollectionsKt__CollectionsKt.L(integerArray),CollectionsKt__CollectionsKt.L(integerArray),CollectionsKt__CollectionsKt.L(integerArray),CollectionsKt__CollectionsKt.L(integerArray),CollectionsKt__CollectionsKt.L(integerArray),CollectionsKt__CollectionsKt.L(integerArray1)};
       integerArray = new Integer[]{integer,integer,integer1,integer1,integer1,integer1,integer};
       integer = Integer.valueOf(1);
       integer1 = Integer.valueOf(0);
       integerArray = new Integer[]{integer1,integer,integer,integer1,integer1,integer,integer};
       integerArray = new Integer[]{integer1,integer1,integer1,integer,integer1,integer1,integer1};
       integerArray = new Integer[]{integer1,integer1,integer1,integer,integer,integer1,integer1};
       integerArray = new Integer[]{integer1,integer1,integer,integer1,integer1,integer,integer};
       integerArray1 = new Integer[]{integer1,integer,integer1,integer1,integer1,integer1,integer1};
       KSModelMetaExtPathUtils.a = CollectionsKt__CollectionsKt.L(listArray);
    }
    public void KSModelMetaExtPathUtils(){
       super();
    }
    public final boolean a(KSModelMetaExtPathUtils$State p0,KSModelMetaExtPathUtils$State p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, KSModelMetaExtPathUtils.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (KSModelMetaExtPathUtils.a.get(p0.ordinal()).get(p1.ordinal()).intValue() != b) {
          b = false;
       }
       return b;
    }
    public final KSModelMetaExtPathUtils$State b(KSModelMetaExtPathUtils$State p0,char p1){
       KSModelMetaExtPathUtils$State obj;
       KSModelMetaExtPathUtils$State state;
       KSModelMetaExtPathUtils kSModelMetaE = KSModelMetaExtPathUtils.class;
       if (PatchProxy.isSupport(kSModelMetaE)) {
          obj = PatchProxy.applyTwoRefs(p0, Character.valueOf(p1), this, kSModelMetaE, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 != KSModelMetaExtPathUtils$State.End) {
          obj = KSModelMetaExtPathUtils$State.Error;
          if (p0 != obj) {
             if (p1 != '.') {
                if (p1 != '[') {
                   if (p1 != ']') {
                      int i = f.a[p0.ordinal()];
                      if (i != 1 && i != 2) {
                         state = (i != 3 && i != 4)? p0: KSModelMetaExtPathUtils$State.Naming;
                      }else if(Character.isDigit(p1)){
                         state = KSModelMetaExtPathUtils$State.Indexing;
                      }else {
                         state = obj;
                      }
                   }else {
                      state = KSModelMetaExtPathUtils$State.IndexEnd;
                   }
                }else {
                   state = KSModelMetaExtPathUtils$State.IndexBeg;
                }
             }else {
                state = KSModelMetaExtPathUtils$State.Dot;
             }
             if (state == obj || !this.a(p0, state)) {
                return obj;
             }else {
                return state;
             }
          }
       }
       return p0;
    }
}
