package com.yxcorp.gifshow.v3.editor.text.subtitle.b$b;
import y8c.f$b;
import com.yxcorp.gifshow.v3.editor.text.subtitle.b;
import com.yxcorp.gifshow.v3.editor.text.model.TextConfigParam;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.text.subtitle.f;
import java.util.Map;

public class b$b extends f$b	// class@001492
{
    public final b h;
    public final TextConfigParam i;

    public void b$b(f$b p0,b p1,TextConfigParam p2){
       super(p0);
       this.h = p1;
       this.i = p2;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new f();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, b$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(b$b.class, new f());
       }else {
          obj.put(b$b.class, null);
       }
       return obj;
    }
}
