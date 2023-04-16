package com.kuaishou.nearby_poi.poi.jsbridge.a$a;
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

public class a$a implements a	// class@000a22
{
    public final g a;
    public final a b;

    public void a$a(a p0,g p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(int p0,String p1){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "2")) {
          return;
       }
       this.a.a(p0, p1, null);
       return;
    }
    public void b(a p0,ArrayList p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a$a.class, "1")) {
          return;
       }
       a uoa = new a(p1, p2, p0.hasMore(), p0.getPcursor(), p0.a4());
       this.a.onSuccess(v7);
       return;
    }
}
