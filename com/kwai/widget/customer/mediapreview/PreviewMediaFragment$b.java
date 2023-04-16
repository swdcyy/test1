package com.kwai.widget.customer.mediapreview.PreviewMediaFragment$b;
import im8.g;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.widget.customer.mediapreview.o;
import java.util.Map;
import java.util.HashMap;

public class PreviewMediaFragment$b implements g	// class@00112d
{
    public p b;
    public List c;
    public Rect d;
    public PublishSubject e;
    public PublishSubject f;
    public PublishSubject g;
    public PublishSubject h;
    public PublishSubject i;
    public a0 j;
    public int k;
    public PublishSubject l;
    public a m;
    public PreviewMediaFragment n;

    public void PreviewMediaFragment$b(){
       super();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PreviewMediaFragment$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new o();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, PreviewMediaFragment$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(PreviewMediaFragment$b.class, new o());
       }else {
          obj.put(PreviewMediaFragment$b.class, null);
       }
       return obj;
    }
}
