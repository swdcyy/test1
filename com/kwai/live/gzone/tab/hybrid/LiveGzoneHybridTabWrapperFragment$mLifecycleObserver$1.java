package com.kwai.live.gzone.tab.hybrid.LiveGzoneHybridTabWrapperFragment$mLifecycleObserver$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.kwai.live.gzone.tab.hybrid.LiveGzoneHybridTabWrapperFragment;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.live.gzone.tab.bean.LiveGzoneTabServerInfo;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.webkit.URLUtil;
import android.net.Uri;
import xkd.b;
import java.net.URL;
import java.util.List;
import kotlin.text.StringsKt__StringsKt;
import java.util.Iterator;
import java.lang.Iterable;
import zsd.u;
import com.kwai.framework.model.user.QCurrentUser;
import android.widget.FrameLayout;
import mkc.b;
import android.view.View;
import mkc.c;
import qrd.l1;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import com.kwai.live.gzone.tab.hybrid.LiveGzoneHybridTabWrapperFragment$mLifecycleObserver$1$a;
import android.view.View$OnClickListener;

public final class LiveGzoneHybridTabWrapperFragment$mLifecycleObserver$1 implements DefaultLifecycleObserver	// class@000e11
{
    public final LiveGzoneHybridTabWrapperFragment b;

    public void LiveGzoneHybridTabWrapperFragment$mLifecycleObserver$1(LiveGzoneHybridTabWrapperFragment p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       a.b(this, p0);
    }
    public void onPause(LifecycleOwner p0){
       a.c(this, p0);
    }
    public void onResume(LifecycleOwner p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneHybridTabWrapperFragment$mLifecycleObserver$1.class, "1")) {
          return;
       }
       a.p(p0, "owner");
       LiveGzoneHybridTabWrapperFragment$mLifecycleObserver$1 tb = this.b;
       LiveGzoneTabServerInfo mLink = tb.n.mLink;
       a.o(mLink, "mTabInfo.mLink");
       Objects.requireNonNull(tb);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       URL obj = PatchProxy.applyOneRefs(mLink, tb, LiveGzoneHybridTabWrapperFragment.class, "10");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(!TextUtils.isEmpty(mLink)){
          if (URLUtil.isHttpUrl(mLink) || URLUtil.isHttpsUrl(mLink)) {
             obj = new URL(mLink);
             String str = PatchProxy.applyTwoRefs(obj, "needLogin", tb, LiveGzoneHybridTabWrapperFragment.class, "11");
             if (str != patchProxyRe) {
             }else if(TextUtils.isEmpty("needLogin")){
                String query = obj.getQuery();
                if (query != null) {
                   String[] stringArray = new String[]{"&"};
                   Iterator iterator = StringsKt__StringsKt.H4(query, stringArray, false, 0, 6, null).iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         Object obj1 = iterator.next();
                         if (u.q2(obj1, "needLogin", false, 2, null)) {
                            stringArray = new String[]{"="};
                            str = StringsKt__StringsKt.H4(obj1, stringArray, false, 0, 6, null).get(true);
                            break ;
                         }
                      }
                   }
                }
             }
             str = "";
             b = Boolean.parseBoolean(str);
          }else {
             Uri uri = b.g(mLink);
             if (uri != null) {
                b = uri.getBooleanQueryParameter("needLogin", false);
             }
          }
       }
       b = false;
       if (b) {
          QCurrentUser qCurrentUser = QCurrentUser.me();
          a.o(qCurrentUser, "QCurrentUser.me\(\)");
          if (!qCurrentUser.isLogined()) {
             tb = this.b;
             View view = c.h(LiveGzoneHybridTabWrapperFragment.ch(tb), b.g);
             a.o(view, "this");
             view.setClickable(true);
             tb.k = view;
             KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
             uoa.b();
             uoa.k(R.drawable.arg_RES_7f080609);
             uoa.h(R.string.arg_RES_7f1030ae);
             uoa.e(R.string.arg_RES_7f103059);
             uoa.p(new LiveGzoneHybridTabWrapperFragment$mLifecycleObserver$1$a(this));
             LiveGzoneHybridTabWrapperFragment k = this.b.k;
             a.m(k);
             uoa.a(k);
          }else {
          label_010c :
             tb = this.b;
             if (tb.k != null) {
                c.c(LiveGzoneHybridTabWrapperFragment.ch(tb), this.b.k);
             }
          }
       }else {
          goto label_010c ;
       }
       return;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
