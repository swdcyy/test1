package com.yxcorp.gifshow.profile.collect.fragment.CollectionPostFragment$d;
import j2c.j;
import com.yxcorp.gifshow.profile.collect.fragment.CollectionPostFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import s1c.r0;
import java.lang.CharSequence;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.Fragment;
import com.kwai.framework.model.user.User;
import z5c.d3;
import java.util.Objects;
import i2c.o;
import com.kwai.framework.model.user.QCurrentUser;
import lnc.a1;
import android.text.style.ClickableSpan;
import android.text.SpannableStringBuilder;
import com.yxcorp.gifshow.profile.util.ClickableSpanUtil;
import lkd.b;
import android.view.View;
import com.yxcorp.utility.n;
import qvb.i;
import com.kwai.framework.model.user.UserOwnerCount;
import z5c.i2;

public class CollectionPostFragment$d extends j	// class@0012a5
{
    public final CollectionPostFragment z;

    public void CollectionPostFragment$d(CollectionPostFragment p0,RecyclerFragment p1,r0 p2){
       this.z = p0;
       super(p1, p2);
    }
    public CharSequence A(){
       Object obj = PatchProxy.apply(null, this, CollectionPostFragment$d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.z.Mh()) {
          return this.z.Ih();
       }
       return this.z.getString(0x7f103f97);
    }
    public CharSequence B(){
       Object obj = PatchProxy.apply(null, this, CollectionPostFragment$d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.z.getString(0x7f10394f);
    }
    public CharSequence C(){
       SpannableStringBuilder spannableStr;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       CollectionPostFragment$d obj = PatchProxy.apply(objArray, this, CollectionPostFragment$d.class, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (d3.a(this.i.b)) {
          obj = this.z;
          Objects.requireNonNull(obj);
          spannableStr = PatchProxy.apply(objArray, obj, CollectionPostFragment.class, "22");
          if (spannableStr != patchProxyRe) {
          }else {
             o oo = new o(obj);
             int i = 0x7f100758;
             SpannableStringBuilder spannableStr1 = (QCurrentUser.me().isNotPublicProfileCollect())? ClickableSpanUtil.a(a1.p(R.string.arg_RES_7f103eb9), a1.p(i), oo): ClickableSpanUtil.a(a1.p(R.string.arg_RES_7f103eb7), a1.p(i), oo);
             spannableStr = spannableStr1;
          }
       }else {
          spannableStr = this.z.getString(R.string.arg_RES_7f100753);
       }
       return spannableStr;
    }
    public void i(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CollectionPostFragment$d.class, "1")) {
          return;
       }
       super.i();
       this.D(objArray);
       n.Y(this.z.Q, 8, false);
       return;
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, CollectionPostFragment$d.class, "5")) {
          return;
       }
       int i = (this.z.Mh() && (this.z.q().getCount() > 0 && i2.b(this.i.b.mOwnerCount, this.z.q().getCount(), 6) > 0))? 1: 0;
       float f = (i)? 12.00f: 16.00f;
       this.E(a1.e(f));
       super.p();
       CollectionPostFragment$d tz = this.z;
       tz.Hh(tz.q().getCount());
       return;
    }
    public int z(){
       return 0x7f0822c1;
    }
}
