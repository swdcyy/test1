package com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$a$a;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$a;
import nn9.b;
import android.view.View;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class PostListComponentView$a$a	// class@0011c7
{

    public static boolean a(PostListComponentView$a p0,b p1,View p2,String p3){
       p0 = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, PostListComponentView$a$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       a.p(p1, "itemState");
       a.p(p2, "itemView");
       a.p(p3, "tag");
       return false;
    }
}
