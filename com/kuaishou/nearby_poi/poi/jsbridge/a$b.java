package com.kuaishou.nearby_poi.poi.jsbridge.a$b;
import ee6.a;
import com.kuaishou.nearby_poi.poi.jsbridge.a;
import f55.g;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.os.Bundle;
import ce6.a;
import java.util.ArrayList;
import nk7.a;

public class a$b implements a	// class@000a23
{
    public final g a;
    public final a b;

    public void a$b(a p0,g p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(int p0,String p1){
       a$b uob = a$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "2")) {
          return;
       }
       this.a.a(p0, p1, null);
       return;
    }
    public void b(a p0,ArrayList p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a$b.class, "1")) {
          return;
       }
       a uoa = new a(p1, p2, p0.hasMore(), p0.getPcursor(), p0.a4());
       this.a.onSuccess(v7);
       return;
    }
}
