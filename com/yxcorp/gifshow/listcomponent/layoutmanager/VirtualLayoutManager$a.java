package com.yxcorp.gifshow.listcomponent.layoutmanager.VirtualLayoutManager$a;
import java.util.Comparator;
import com.yxcorp.gifshow.listcomponent.layoutmanager.VirtualLayoutManager;
import java.lang.Object;
import android.util.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import w0b.g;
import java.lang.Comparable;
import java.lang.Integer;

public class VirtualLayoutManager$a implements Comparator	// class@001a7a
{
    public final VirtualLayoutManager b;

    public void VirtualLayoutManager$a(VirtualLayoutManager p0){
       this.b = p0;
       super();
    }
    public int compare(Object p0,Object p1){
       int i;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, VirtualLayoutManager$a.class, "1");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else if(p0 == null && p1 == null){
          i = 0;
       }else if(p0 == null){
          i = -1;
       }else if(p1 == null){
          i = 1;
       }else {
          i = p0.first.c().intValue() - p1.first.c().intValue();
       }
       return i;
    }
}
