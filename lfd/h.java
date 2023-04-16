package lfd.h;
import java.lang.Runnable;
import lfd.i;
import com.yxcorp.plugin.search.entity.template.base.JCAladdinFeed;
import lfd.b;
import com.yxcorp.plugin.search.entity.SearchItem;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fw5.a;
import android.view.View;
import android.content.Context;
import android.app.Activity;
import e3a.a;
import com.yxcorp.plugin.search.entity.template.base.JCAladdinModel;
import com.kuaishou.gifshow.kuaishan.ui.preview.a;
import nfd.c3;
import crd.b;
import lnc.b9;
import tkd.b;
import tkd.d;
import hw5.e;
import brd.t;
import vv5.l1;
import t45.d;
import brd.z;
import lfd.g;
import lfd.f;
import erd.g;

public final class h implements Runnable	// class@001c31
{
    public final i b;
    public final JCAladdinFeed c;
    public final b d;
    public final SearchItem e;

    public void h(i p0,JCAladdinFeed p1,b p2,SearchItem p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       h tb = this.b;
       h tc = this.c;
       h td = this.d;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidThreeRefs(tc, td, this.e, tb, i.class, "2")) {
       }else {
          JCAladdinFeed mJoinRespons = tb.b.mJoinResponse;
          if (mJoinRespons != null && mJoinRespons.a == 2) {
             Activity uActivity = a.b(td.getView().getContext());
             if (uActivity != null) {
                c3.c(uActivity, td.getView(), tc.mModel.mLinkUrl, a.b);
             }
          }else {
             Activity uActivity1 = a.b(td.getView().getContext());
             if (uActivity1 != null && !PatchProxy.applyVoidOneRefs(uActivity1, tb, i.class, "3")) {
                b9.a(tb.a);
                tb.a = d.a(-854594802).p4(uActivity1, tb.b.mModel.mStringId, "", "", 8).observeOn(d.a).subscribe(new g(tb), new f(tb));
             }
          }
       }
       return;
    }
}
