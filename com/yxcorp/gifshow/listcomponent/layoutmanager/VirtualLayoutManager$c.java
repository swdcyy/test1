package com.yxcorp.gifshow.listcomponent.layoutmanager.VirtualLayoutManager$c;
import w0b.c;
import com.yxcorp.gifshow.listcomponent.layoutmanager.VirtualLayoutManager;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.listcomponent.layoutmanager.LayoutView;

public class VirtualLayoutManager$c implements c	// class@001a7c
{
    public final VirtualLayoutManager a;

    public void VirtualLayoutManager$c(VirtualLayoutManager p0){
       this.a = p0;
       super();
    }
    public View a(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VirtualLayoutManager$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LayoutView(p0);
    }
}
