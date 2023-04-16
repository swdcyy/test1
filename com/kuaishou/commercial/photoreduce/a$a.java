package com.kuaishou.commercial.photoreduce.a$a;
import java.lang.Object;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeMenu;
import java.util.List;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class a$a	// class@00151d
{
    public int a;
    public String b;
    public String c;
    public int d;
    public String e;
    public String f;
    public String g;
    public String h;
    public List i;

    public void a$a(){
       super();
    }
    public static a$a a(PhotoAdvertisement$NegativeMenu p0,List p1,String p2,String p3){
       a$a obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a$a();
       PhotoAdvertisement$NegativeMenu negativeType = p0.negativeType;
       if (negativeType == null) {
          negativeType = p0.id;
       }
       obj.a = negativeType;
       obj.b = p0.name;
       obj.c = p0.desc;
       obj.d = p0.clickAction;
       obj.e = p0.url;
       obj.f = p0.icon;
       obj.g = p2;
       obj.h = p3;
       obj.i = p1;
       return obj;
    }
}
