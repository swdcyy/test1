package com.kuaishou.android.vader.stat.VaderStat;
import java.lang.Object;
import cr.f;
import cr.h;
import cr.g;
import cr.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import cr.e;

public abstract class VaderStat	// class@000f7d
{

    public void VaderStat(){
       super();
    }
    public static VaderStat create(f p0,h p1,g p2,i p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, VaderStat.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new e(p0, p1, p2, p3);
    }
    public abstract f controlConfigStat();
    public abstract g databaseStat();
    public abstract h sequenceIdStat();
    public abstract i uploadStat();
}
