package eja.a0;
import ja5.h;
import com.kwai.framework.model.user.User;
import ac.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.drawee.view.DraweeView;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import ga5.f;

public class a0 extends h	// class@0026ae
{

    public void a0(){
       super();
    }
    public a P8(User p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return f.b(p0, this.q.getController(), HeadImageSize.MIDDLE);
    }
}
