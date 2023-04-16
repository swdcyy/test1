package com.kuaishou.live.core.basic.bulletin.CommentAreaOptABContext$a;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import w51.a;
import xf6.l;
import com.kwai.framework.abtest.f;

public final class CommentAreaOptABContext$a	// class@00081d
{

    public void CommentAreaOptABContext$a(){
       super();
    }
    public void CommentAreaOptABContext$a(u p0){
       super();
    }
    public final boolean a(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, CommentAreaOptABContext$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!a.R()) {
          int i = l.e(p1, 0);
          boolean b = true;
          if (i == b) {
             return b;
          }else if(i == 2){
             return 0;
          }
       }
       return f.a(p0);
    }
}
