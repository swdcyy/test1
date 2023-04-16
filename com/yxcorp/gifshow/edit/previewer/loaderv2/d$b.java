package com.yxcorp.gifshow.edit.previewer.loaderv2.d$b;
import java.lang.Object;
import java.util.ArrayList;
import com.yxcorp.gifshow.edit.previewer.loaderv2.d$a;
import com.kwai.video.clipkit.mv.ClipAICut$TemplateAssetInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.util.List;

public class d$b	// class@001b3a
{
    public boolean a;
    public List b;
    public List c;
    public String d;

    public void d$b(){
       super();
       this.b = new ArrayList();
       this.c = new ArrayList();
    }
    public void d$b(d$a p0){
       super();
       this.b = new ArrayList();
       this.c = new ArrayList();
    }
    public ClipAICut$TemplateAssetInfo a(int p0){
       d$b uob = d$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.b.get(p0);
    }
}
