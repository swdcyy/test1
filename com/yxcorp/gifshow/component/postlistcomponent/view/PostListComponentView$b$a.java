package com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$b$a;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$b;
import com.yxcorp.gifshow.component.postlistcomponent.state.LoadingStatus;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import nn9.b;
import android.view.View;
import mn9.a;

public final class PostListComponentView$b$a	// class@0011c9
{

    public static void a(PostListComponentView$b p0,LoadingStatus p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, PostListComponentView$b$a.class, "1")) {
          return;
       }
       a.p(p1, "newLoadingStatus");
       a.p(p2, "tag");
       return;
    }
    public static void b(PostListComponentView$b p0,b p1,View p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, PostListComponentView$b$a.class, "3")) {
          return;
       }
       a.p(p1, "itemState");
       a.p(p2, "itemView");
       a.p(p3, "tag");
       return;
    }
    public static void c(PostListComponentView$b p0,a p1,View p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, PostListComponentView$b$a.class, "2")) {
          return;
       }
       a.p(p1, "item");
       a.p(p2, "itemView");
       a.p(p3, "tag");
       return;
    }
}
