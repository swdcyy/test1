package com.yxcorp.plugin.search.utils.f0$a;
import com.yxcorp.plugin.search.utils.f0$c;
import com.yxcorp.plugin.search.utils.f0;
import java.lang.Object;
import nfd.a3;
import java.lang.String;
import com.kuaishou.android.model.mix.QRecoTag;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.plugin.search.entity.SearchItem;
import wkd.b;
import ip.b;
import l66.a;
import dda.i;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.feed.BaseFeed;
import m66.a;
import com.yxcorp.plugin.search.utils.g0;
import ged.b;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Context;
import android.app.Activity;
import e3a.a;
import kzc.d;
import com.yxcorp.plugin.search.utils.b0;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import com.kwai.library.widget.popup.common.c$b;
import com.yxcorp.plugin.search.utils.c0;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import nfd.z2;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import com.yxcorp.plugin.search.entity.SearchItem$SearchItemType;
import lyb.h;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;

public class f0$a implements f0$c	// class@000796
{
    public final f0 a;

    public void f0$a(f0 p0){
       this.a = p0;
       super();
    }
    public void b(boolean p0){
       a3.a(this, p0);
    }
    public void c(String p0){
       a3.b(this, p0);
    }
    public void d(String p0,String p1){
       a3.e(this, p0, p1);
    }
    public void e(QRecoTag p0){
       f0 uof0 = f0.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, f0$a.class, "1")) {
          return;
       }
       int i = 1;
       this.a.e(p0, i);
       f0$a ta = this.a;
       f0 b = ta.b;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidTwoRefs(b, p0, ta, uof0, "11") && (b != null && (b.getCurrentPhoto() != null && b.a(-570058679).n(b.getCurrentPhoto())))) {
          b.a(0x6d2a4fdd).b(new i(b.getCurrentPhoto().mEntity, TextUtils.I(p0.mId)));
       }
    label_005b :
       f0 f = this.a.f;
       if (f != null) {
          f.e(p0);
       }
       if (p0.mIsEditTag != null) {
          ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoidOneRefs(p0, ta, uof0, "6")) {
             b uob = new b();
             uob.c = new g0(ta, p0);
             Activity uActivity = a.b(ta.a.getActivity());
             if (uActivity != null) {
                d uod = new d(uActivity);
                uod.G(b0.a);
                uod.O(c0.a);
                uod.L(uob);
                f0.l = uod.Y(new z2(ta));
             }
          }
       }else {
          i.e(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f1044af), i);
          if (!this.a.b.isKboxType() && !this.a.b.isCollectionPuzzleType()) {
             f0$a ta1 = this.a;
             uof0 = ta1.b;
             if (uof0.mItemType != SearchItem$SearchItemType.RELATION_SEARCH) {
                ta1.a.ef(uof0);
             }
          }
       }
       return;
    }
    public void onShow(){
       a3.d(this);
    }
}
