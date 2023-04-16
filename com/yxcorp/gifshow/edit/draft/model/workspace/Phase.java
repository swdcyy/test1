package com.yxcorp.gifshow.edit.draft.model.workspace.Phase;
import java.lang.Enum;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Arrays;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class Phase extends Enum	// class@001b14
{
    public String mName;
    public static final Phase[] $VALUES;
    public static final Phase CREATE;
    public static final Phase EDIT;
    public static final Phase NONE;
    public static final Phase POST;
    public static final Phase PUBLISH;

    static {
       Phase phase = new Phase("NONE", 0, "");
       Phase.NONE = phase;
       Phase phase1 = new Phase("CREATE", 1, ".create");
       Phase.CREATE = phase1;
       Phase phase2 = new Phase("EDIT", 2, ".edit");
       Phase.EDIT = phase2;
       Phase phase3 = new Phase("PUBLISH", 3, ".publish");
       Phase.PUBLISH = phase3;
       Phase phase4 = new Phase("POST", 4, ".post");
       Phase.POST = phase4;
       Phase[] phaseArray = new Phase[]{phase,phase1,phase2,phase3,phase4};
       Phase.$VALUES = phaseArray;
    }
    public void Phase(String p0,int p1,String p2){
       super(p0, p1);
       this.mName = p2;
    }
    public static List getAllNames(){
       String[] obj = PatchProxy.apply(null, null, Phase.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{Phase.NONE.getName(),Phase.CREATE.getName(),Phase.EDIT.getName(),Phase.PUBLISH.getName(),Phase.POST.getName()};
       return Arrays.asList(obj);
    }
    public static Phase getDraftOpenFlagByName(String p0){
       object oobject;
       Phase[] obj = PatchProxy.applyOneRefs(p0, null, Phase.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Phase.values();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return Phase.NONE;
          }
          oobject = obj[i];
          if (TextUtils.n(oobject.mName, p0)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public static Phase valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Phase.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(Phase.class, p0);
    }
    public static Phase[] values(){
       Object obj = PatchProxy.apply(null, null, Phase.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Phase.$VALUES.clone();
    }
    public String getName(){
       return this.mName;
    }
}
