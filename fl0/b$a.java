package fl0.b$a;
import dl0.a;
import fl0.b;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;
import android.view.View;
import android.widget.FrameLayout;
import lnc.a1;
import java.lang.CharSequence;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import androidx.fragment.app.Fragment;
import com.kuaishou.life_plugin_common.fragment.LifeBasePluginProxyFragment;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.c;
import fl0.a;
import androidx.fragment.app.c$b;
import androidx.fragment.app.e;

public final class b$a implements a	// class@00236f
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void a(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "2")) {
          return;
       }
       b$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, b.class, "4")) {
          ta.S8();
          b q = ta.q;
          String str = "mLoadingAnimation";
          if (q == null) {
             a.S(str);
          }
          int i = 8;
          if (q.getVisibility() != i) {
             q = ta.q;
             if (q == null) {
                a.S(str);
             }
             q.setVisibility(i);
          }
          q = ta.r;
          if (q == null) {
             a.S("mHintEmptyView");
          }
          if (q.getVisibility()) {
             q = ta.r;
             if (q == null) {
                a.S("mHintEmptyView");
             }
             q.setVisibility(0);
             String str1 = (p0 == null)? a1.p(R.string.arg_RES_7f101caf): p0.getMessage();
             b r = ta.r;
             if (r == null) {
                a.S("mHintEmptyView");
             }
             r.h(str1);
          }
       }
       return;
    }
    public void onSuccess(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b$a.class, "1")) {
          return;
       }
       b$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, uob, "10")) {
          b p = ta.p;
          if (p == null) {
             a.S("proxyFragment");
          }
          if (p.dh() == null) {
             p = ta.p;
             if (p == null) {
                a.S("proxyFragment");
             }
             if (p.isAdded()) {
                p = ta.p;
                if (p == null) {
                   a.S("proxyFragment");
                }
                Fragment uFragment = p.ch();
                if (uFragment != null) {
                   Bundle uBundle = new Bundle();
                   b p1 = ta.p;
                   if (p1 == null) {
                      a.S("proxyFragment");
                   }
                   if (p1.getArguments() != null) {
                      p1 = ta.p;
                      if (p1 == null) {
                         a.S("proxyFragment");
                      }
                      uBundle.putAll(p1.getArguments());
                   }
                   if (uFragment.getArguments() != null) {
                      uBundle.putAll(uFragment.getArguments());
                   }
                   uFragment.setArguments(uBundle);
                   Object[] objArray1 = PatchProxy.apply(objArray, ta, uob, "11");
                   if (objArray1 != PatchProxyResult.class) {
                   }else {
                      b p3 = ta.p;
                      if (p3 == null) {
                         a.S("proxyFragment");
                      }
                      if (!p3.isAdded()) {
                         objArray1 = objArray;
                      }else {
                         p3 = ta.p;
                         if (p3 == null) {
                            a.S("proxyFragment");
                         }
                         objArray1 = p3.getChildFragmentManager();
                      }
                   }
                   if (objArray1 != null) {
                      objArray1.registerFragmentLifecycleCallbacks(new a(ta), false);
                      e uoe = objArray1.beginTransaction();
                      b p2 = ta.p;
                      if (p2 == null) {
                         a.S("proxyFragment");
                      }
                      uoe.w(R.id.life_plugin_content_container, uFragment, p2.eh());
                      uoe.m();
                   }
                }
             }
          }
       }
    label_00c4 :
       ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, uob, "7")) {
          ta.S8();
          uob = ta.q;
          if (uob == null) {
             a.S("mLoadingAnimation");
          }
          uob.setVisibility(8);
          uob = ta.r;
          if (uob == null) {
             a.S("mHintEmptyView");
          }
          uob.setVisibility(8);
       }
       return;
    }
}
