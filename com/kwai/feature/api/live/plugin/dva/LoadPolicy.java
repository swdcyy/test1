package com.kwai.feature.api.live.plugin.dva.LoadPolicy;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LoadPolicy extends Enum	// class@000ff8
{
    public static final LoadPolicy[] $VALUES;
    public static final LoadPolicy DIALOG;
    public static final LoadPolicy SILENT;

    static {
       LoadPolicy loadPolicy;
       LoadPolicy[] loadPolicyAr = new LoadPolicy[]{loadPolicy,loadPolicy};
       loadPolicy = new LoadPolicy("SILENT", 0);
       LoadPolicy.SILENT = loadPolicy;
       loadPolicy = new LoadPolicy("DIALOG", 1);
       LoadPolicy.DIALOG = loadPolicy;
       LoadPolicy.$VALUES = loadPolicyAr;
    }
    public void LoadPolicy(String p0,int p1){
       super(p0, p1);
    }
    public static LoadPolicy valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LoadPolicy.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LoadPolicy.class, p0);
    }
    public static LoadPolicy[] values(){
       Object obj = PatchProxy.apply(null, null, LoadPolicy.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LoadPolicy.$VALUES.clone();
    }
}
