package com.yxcorp.gifshow.share.widget.d$b;
import y8c.f$b;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;
import io.reactivex.subjects.PublishSubject;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.share.widget.k;
import java.util.Map;

public class d$b extends f$b	// class@001d1f
{
    public List h;
    public QPhoto i;
    public PublishSubject j;
    public String k;
    public String l;

    public void d$b(f$b p0,List p1,QPhoto p2,PublishSubject p3,String p4,String p5){
       super(p0);
       this.h = p1;
       this.i = p2;
       this.j = p3;
       this.k = p4;
       this.l = p5;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new k();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, d$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(d$b.class, new k());
       }else {
          obj.put(d$b.class, null);
       }
       return obj;
    }
}
