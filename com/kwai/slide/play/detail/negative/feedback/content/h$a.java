package com.kwai.slide.play.detail.negative.feedback.content.h$a;
import java.lang.Object;
import java.util.ArrayList;
import com.kwai.slide.play.detail.negative.feedback.content.h$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;

public class h$a	// class@001837
{
    public final List a;

    public void h$a(){
       super();
       this.a = new ArrayList();
    }
    public h$a a(h$b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a.add(p0);
       return this;
    }
}
