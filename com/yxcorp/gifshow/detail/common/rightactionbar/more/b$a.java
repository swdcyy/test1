package com.yxcorp.gifshow.detail.common.rightactionbar.more.b$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.detail.common.rightactionbar.more.b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ekd.r0;
import whc.k0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;
import qa9.s;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.common.rightactionbar.more.b$a$a;
import erd.g;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import e17.s;
import com.yxcorp.gifshow.detail.common.rightactionbar.more.b$a$b;
import com.yxcorp.gifshow.detail.common.rightactionbar.more.b$a$c;

public final class b$a implements View$OnClickListener	// class@0014af
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       b s;
       b$a tb;
       b s1;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       this.b.V8();
       if (!r0.d(this.b.getContext())) {
          s = this.b.s;
          if (s != null) {
             s.y(R.string.arg_RES_7f105153);
          }
          s.b(b.P8(this.b));
          return;
       }else {
          a.o(p0, "v");
          int id = p0.getId();
          if (id == 0x7f0a2c02) {
             tb = this.b;
             s1 = tb.s;
             if (s1 != null) {
                s = tb.x;
                if (s == null) {
                   a.S("mEveryoneVisibleCheck");
                }
                s.setVisibility(0);
                s1.g(8, 0, new b$a$a(this), true);
             }
          }else {
             int i = 0x7f103bad;
             if (id == 0x7f0a2c04) {
                if (r1.t3(b.R8(this.b).mEntity)) {
                   s.h(a1.p(i));
                   return;
                }else {
                   tb = this.b;
                   s1 = tb.s;
                   if (s1 != null) {
                      s = tb.y;
                      if (s == null) {
                         a.S("mFriendVisibleCheck");
                      }
                      s.setVisibility(0);
                      s1.g(9, 0, new b$a$b(this), true);
                   }
                }
             }else if(id == 0x7f0a2c1e){
                if (r1.t3(b.R8(this.b).mEntity)) {
                   s.h(a1.p(i));
                   return;
                }else {
                   tb = this.b;
                   s1 = tb.s;
                   if (s1 != null) {
                      s = tb.z;
                      if (s == null) {
                         a.S("mPrivateVisibleCheck");
                      }
                      s.setVisibility(0);
                      s1.g(7, 0, new b$a$c(this), true);
                   }
                }
             }
          }
          s.b(b.P8(this.b));
          return;
       }
    }
}
