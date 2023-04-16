package com.yxcorp.gifshow.edit.draft.DraftUtils$DraftRecoverFlag;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class DraftUtils$DraftRecoverFlag extends Enum	// class@001adf
{
    public static final DraftUtils$DraftRecoverFlag[] $VALUES;
    public static final DraftUtils$DraftRecoverFlag CREATE;
    public static final DraftUtils$DraftRecoverFlag EDIT;
    public static final DraftUtils$DraftRecoverFlag UNKNOWN;

    static {
       DraftUtils$DraftRecoverFlag uDraftRecove = new DraftUtils$DraftRecoverFlag("UNKNOWN", 0);
       DraftUtils$DraftRecoverFlag.UNKNOWN = uDraftRecove;
       DraftUtils$DraftRecoverFlag uDraftRecove1 = new DraftUtils$DraftRecoverFlag("CREATE", 1);
       DraftUtils$DraftRecoverFlag.CREATE = uDraftRecove1;
       DraftUtils$DraftRecoverFlag uDraftRecove2 = new DraftUtils$DraftRecoverFlag("EDIT", 2);
       DraftUtils$DraftRecoverFlag.EDIT = uDraftRecove2;
       DraftUtils$DraftRecoverFlag[] uDraftRecove3 = new DraftUtils$DraftRecoverFlag[]{uDraftRecove,uDraftRecove1,uDraftRecove2};
       DraftUtils$DraftRecoverFlag.$VALUES = uDraftRecove3;
    }
    public void DraftUtils$DraftRecoverFlag(String p0,int p1){
       super(p0, p1);
    }
    public static DraftUtils$DraftRecoverFlag valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DraftUtils$DraftRecoverFlag.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(DraftUtils$DraftRecoverFlag.class, p0);
    }
    public static DraftUtils$DraftRecoverFlag[] values(){
       Object obj = PatchProxy.apply(null, null, DraftUtils$DraftRecoverFlag.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DraftUtils$DraftRecoverFlag.$VALUES.clone();
    }
}
