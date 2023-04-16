package dib.c;
import com.yxcorp.gifshow.util.resource.n$c;
import dib.e;
import java.lang.Object;
import boc.b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dc5.c;
import com.yxcorp.gifshow.util.resource.Category;
import java.lang.StringBuilder;
import ui9.j;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper;
import boc.z;
import java.lang.Throwable;

public final class c implements n$c	// class@0024b2
{
    public final e a;

    public void c(e p0){
       this.a = p0;
    }
    public final void a(b p0){
       e c;
       c ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoidOneRefs(p0, ta, e.class, "6")) {
       }else if(ta.q != null){
          c.c("IMMagicSDK", "onResourceDownloaded is invoked but has released, return");
       }else if(Category.MAGIC_YCNN_SKIN_COLOR_DETECTION_V2 == p0){
          c.g("IMMagicSDK", "onResourceDownloaded "+p0.getResourceName());
          ta.a();
          c = ta.c;
          if (c != null) {
             c.S0();
          }
       }else if(MagicEmojiResourceHelper.o(p0)){
          c.g("IMMagicSDK", "onResourceDownloaded "+p0.getResourceName());
          ta.a();
       }
       return;
    }
    public void b(b p0,float p1){
       z.c(this, p0, p1);
    }
    public void c(b p0){
       z.a(this, p0);
    }
    public void d(b p0,Throwable p1){
       z.b(this, p0, p1);
    }
}
