package com.kuaishou.commercial.photoreduce.g$e;
import im8.g;
import y8c.g;
import com.kuaishou.commercial.photoreduce.g;
import y8c.f;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import ekd.j;
import com.kuaishou.commercial.photoreduce.j;
import java.util.Map;
import java.util.HashMap;
import android.view.ViewGroup;
import com.yxcorp.gifshow.entity.QPhoto;
import l29.d;
import android.view.View;
import i2b.a;
import com.kuaishou.commercial.photoreduce.g$f;
import ml8.c;

public class g$e extends g implements g	// class@00152c
{
    public a$a w;
    public final g x;

    public void g$e(g p0){
       this.x = p0;
       super();
    }
    public ArrayList a1(int p0,f p1){
       Object[] obj;
       if (PatchProxy.isSupport(g$e.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, g$e.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new Object[]{this};
       return j.a(obj);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g$e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new j();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, g$e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(g$e.class, new j());
       }else {
          obj.put(g$e.class, null);
       }
       return obj;
    }
    public f h1(ViewGroup p0,int p1){
       g$e uoe = g$e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoe, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       View view = (d.a(this.x.t))? a.i(p0, R.layout.arg_RES_7f0d006e): a.i(p0, R.layout.arg_RES_7f0d006d);
       return new f(view, new g$f(this.x));
    }
}
