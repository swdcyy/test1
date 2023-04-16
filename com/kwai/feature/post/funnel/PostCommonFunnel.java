package com.kwai.feature.post.funnel.PostCommonFunnel;
import java.lang.Object;
import java.util.List;
import trd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import v46.g;
import lnc.x6;
import lnc.y6;
import v46.b;
import com.kwai.feature.post.funnel.PostCommonFunnel$funnelPerf$1;
import msd.l;
import android.view.View;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.feature.post.funnel.PostCommonFunnel$funnelViewClick$1;
import com.kwai.feature.post.funnel.IPostFunnelLifecycleCallBack$Stage;
import com.kwai.feature.post.funnel.PostCommonFunnel$pageLifecycle$1;

public final class PostCommonFunnel	// class@0014a5
{
    public static final List a;
    public static final PostCommonFunnel b;

    static {
       PostCommonFunnel.b = new PostCommonFunnel();
       PostCommonFunnel.a = t.k("UpdatePlayerTimeAction");
    }
    public void PostCommonFunnel(){
       super();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, PostCommonFunnel.class, "2")) {
          return;
       }
       g og = y6.r(g.class);
       if (og != null) {
          b uob = og.H30();
          if (uob != null) {
             uob.l(PostCommonFunnel$funnelPerf$1.INSTANCE);
          }
       }
       return;
    }
    public final void b(View p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PostCommonFunnel.class, "4")) {
          return;
       }
       a.p(p1, "tag");
       if (p0 == null && TextUtils.x(p1)) {
          return;
       }
       g og = y6.r(g.class);
       if (og != null) {
          b uob = og.H30();
          if (uob != null) {
             uob.l(new PostCommonFunnel$funnelViewClick$1(p1, p0));
          }
       }
       return;
    }
    public final void c(Object p0,IPostFunnelLifecycleCallBack$Stage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PostCommonFunnel.class, "1")) {
          return;
       }
       a.p(p0, "page");
       a.p(p1, "stage");
       g og = y6.r(g.class);
       if (og != null) {
          b uob = og.H30();
          if (uob != null) {
             uob.l(new PostCommonFunnel$pageLifecycle$1(p0, p1));
          }
       }
       return;
    }
}
