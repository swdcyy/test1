package gib.j$c;
import java.lang.Runnable;
import gib.j;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u4d.a;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.lang.StringBuilder;
import dc5.c;

public final class j$c implements Runnable	// class@002af8
{
    public final j b;
    public final BeautifyConfig c;

    public void j$c(j p0,BeautifyConfig p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, j$c.class, "1")) {
          return;
       }
       j$c tc = this.c;
       if (tc == null) {
          a.c("");
       }else {
          JsonObject jsonObject = this.b.u(tc);
          if (jsonObject != null) {
             a.c(jsonObject.toString());
             c.a("IMBeautyRepoV2", "saveLastBeautyConfig finish : "+this.c.mId);
          }
       }
       return;
    }
}
