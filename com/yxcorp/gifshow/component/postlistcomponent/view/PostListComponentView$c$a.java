package com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$c$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$c;
import nn9.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$b;
import jn9.e;
import mn9.a;

public final class PostListComponentView$c$a implements Runnable	// class@0011cb
{
    public final PostListComponentView$c b;
    public final b c;
    public final View d;

    public void PostListComponentView$c$a(PostListComponentView$c p0,b p1,View p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, PostListComponentView$c$a.class, "1")) {
          return;
       }
       PostListComponentView g = this.b.a.g;
       if (g != null) {
          g.a().d(this.c.g(), this.d, g.b());
       }
       return;
    }
}
