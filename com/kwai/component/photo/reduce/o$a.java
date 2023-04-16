package com.kwai.component.photo.reduce.o$a;
import im8.g;
import y8c.g;
import com.kwai.component.photo.reduce.o;
import y8c.f;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import ekd.j;
import com.kwai.component.photo.reduce.c;
import java.util.Map;
import java.util.HashMap;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.kwai.component.photo.reduce.o$c;
import ml8.c;

public class o$a extends g implements g	// class@000afc
{
    public FeedNegativeFeedback$NegativeReason w;
    public final o x;

    public void o$a(o p0){
       this.x = p0;
       super();
    }
    public ArrayList a1(int p0,f p1){
       Object[] obj;
       if (PatchProxy.isSupport(o$a.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, o$a.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new Object[]{this};
       return j.a(obj);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new c();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, o$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(o$a.class, new c());
       }else {
          obj.put(o$a.class, null);
       }
       return obj;
    }
    public f h1(ViewGroup p0,int p1){
       o$a uoa = o$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.i(p0, 0x7f0d1136), new o$c(this.x));
    }
}
