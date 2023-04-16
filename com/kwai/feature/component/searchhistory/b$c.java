package com.kwai.feature.component.searchhistory.b$c;
import java.util.Comparator;
import java.lang.Object;
import com.kwai.feature.component.searchhistory.b$a;
import com.kwai.feature.component.searchhistory.SearchHistoryData;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Long;

public class b$c implements Comparator	// class@00129e
{

    public void b$c(){
       super();
    }
    public void b$c(b$a p0){
       super();
    }
    public int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b$c.class, "1");
       int i = (obj != PatchProxyResult.class)? obj.intValue(): Long.compare(p1.mSearchTime, p0.mSearchTime);
       return i;
    }
}
