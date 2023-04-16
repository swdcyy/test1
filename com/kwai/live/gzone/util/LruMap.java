package com.kwai.live.gzone.util.LruMap;
import java.util.LinkedHashMap;
import java.util.Map$Entry;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class LruMap extends LinkedHashMap	// class@000e72
{
    public final int mMaxEntries;

    public void LruMap(int p0){
       super((p0 + 1), 0x3f800000, true);
       this.mMaxEntries = p0;
    }
    public boolean removeEldestEntry(Map$Entry p0){
       p0 = PatchProxy.applyOneRefs(p0, this, LruMap.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       boolean b = (this.size() > this.mMaxEntries)? true: false;
       return b;
    }
}
