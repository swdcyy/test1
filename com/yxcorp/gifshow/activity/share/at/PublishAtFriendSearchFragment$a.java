package com.yxcorp.gifshow.activity.share.at.PublishAtFriendSearchFragment$a;
import com.yxcorp.gifshow.fragment.f;
import com.yxcorp.gifshow.activity.share.at.PublishAtFriendSearchFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mkc.b;
import android.view.ViewGroup;
import i2b.a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import java.util.Objects;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import kotlin.jvm.internal.a;
import lnc.a1;
import java.lang.CharSequence;
import java.lang.Throwable;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import ekd.p0;
import e17.i;

public final class PublishAtFriendSearchFragment$a extends f	// class@001373
{
    public final PublishAtFriendSearchFragment l;

    public void PublishAtFriendSearchFragment$a(PublishAtFriendSearchFragment p0,RecyclerFragment p1){
       this.l = p0;
       super(p1);
    }
    public View J0(){
       f obj = PatchProxy.apply(null, this, PublishAtFriendSearchFragment$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.i == null) {
          this.i = a.i(this.a, b.i.a);
       }
       if (this.l.J == null) {
          obj = this.i;
          if (obj instanceof KwaiEmptyStateView) {
             Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kwai.library.widget.emptyview.KwaiEmptyStateView");
             obj.f();
          }
       }
       this.a().a(this.i);
       obj = this.i;
       a.o(obj, "mEmptyView");
       return obj;
    }
    public KwaiEmptyStateView$a a(){
       KwaiEmptyStateView$a obj = PatchProxy.apply(null, this, PublishAtFriendSearchFragment$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.a();
       obj.i(a1.p(R.string.arg_RES_7f104032));
       a.o(obj, "super.getEmptyConfigBuil¡­blish_page_no_such_user\)\)");
       if (this.l.J != null) {
          obj.k(R.drawable.arg_RES_7f0805f6);
       }
       return obj;
    }
    public KwaiEmptyStateView b(Throwable p0,String p1){
       KwaiEmptyStateView kwaiEmptySta;
       c obj = PatchProxy.applyTwoRefs(p0, p1, this, PublishAtFriendSearchFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.a();
       a.o(obj, "AppEnv.get\(\)");
       if (p0.C(obj.a())) {
          kwaiEmptySta = super.J0();
          if (this.l.J == null && kwaiEmptySta != null) {
             kwaiEmptySta.f();
          }
       }else {
          kwaiEmptySta = super.b(p0, p1);
          if (this.l.J == null && kwaiEmptySta != null) {
             kwaiEmptySta.f();
          }
       }
       return kwaiEmptySta;
    }
    public KwaiEmptyStateView$a c(String p0){
       boolean b;
       KwaiEmptyStateView$a uoa;
       c obj = PatchProxy.applyOneRefs(p0, this, PublishAtFriendSearchFragment$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.a();
       a.o(obj, "AppEnv.get\(\)");
       if (p0.C(obj.a())) {
          PublishAtFriendSearchFragment$a tl = this.l;
          if (tl.I == null) {
             if (p0 != null) {
                i.d(R.style.arg_RES_7f110668, p0);
             }
             b = true;
          }else {
             b = false;
          }
          tl.I = b;
          uoa = super.a();
          uoa.h(R.string.arg_RES_7f104032);
          a.o(uoa, "super.getEmptyConfigBuil¡­ublish_page_no_such_user\)");
          if (this.l.J != null) {
             uoa.k(R.drawable.arg_RES_7f0805f6);
          }
          return uoa;
       }else {
          uoa = super.c(p0);
          a.o(uoa, "super.getErrorConfigBuilder\(errorMsg\)");
          return uoa;
       }
    }
}
