package d5c.g0$a;
import androidx.viewpager.widget.ViewPager$i;
import d5c.g0;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import androidx.fragment.app.Fragment;
import x5c.b;
import y8c.q;
import androidx.recyclerview.widget.RecyclerView;
import b9c.y;
import com.google.android.material.appbar.ProfileReboundBehavior;
import java.util.List;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import v2c.e;
import java.lang.StringBuilder;
import v2c.g;
import android.widget.ImageView;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import java.util.Objects;
import java.util.Collection;
import ekd.q;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import com.kwai.framework.model.user.ProfileTabModel;
import p3c.l;
import p3c.l$a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.profile.krn.TabChangedMsgModel;
import com.yxcorp.gifshow.profile.krn.TabModel;
import fg6.a;
import com.google.gson.Gson;
import kotlin.jvm.internal.a;
import js6.a;
import p3c.a;
import java.lang.ref.WeakReference;
import qrd.l1;
import java.util.Map;

public class g0$a implements ViewPager$i	// class@0020f1
{
    public final g0 b;

    public void g0$a(g0 p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
       RecyclerView recyclerView;
       g0 y0;
       l$a uoa1;
       TabChangedMsgModel tabChangedMs;
       TabModel tabModel;
       a uoa2;
       Object obj = this;
       int i = p0;
       g0$a uoa = g0$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), obj, uoa, "1")) {
          return;
       }
       obj.b.n9(i);
       uoa = obj.b;
       l$a obj1 = null;
       if (uoa.I != null) {
          Fragment uFragment = uoa.M.a(i);
          if (uFragment instanceof q) {
             recyclerView = uFragment.h0();
          }else if(uFragment instanceof y){
             uFragment = uFragment.t();
             if (uFragment instanceof q) {
                recyclerView = uFragment.h0();
             }
          }
          recyclerView = obj1;
          obj.b.I.V(recyclerView);
       }
       String str = " tabIdLists: ";
       String str1 = "position: ";
       String str2 = "ProfileTabError";
       if (i < obj.b.N.size()) {
          uoa = obj.b;
          uoa.b1 = uoa.N.get(i).intValue();
       }else {
          g.a(KsLogProfileTag.COMMON.appendTag(str2), str1+i+str+obj.b.N);
       }
       uoa = obj.b;
       int i1 = 1;
       if (uoa.b1 == i1) {
          if (uoa.k9()) {
             y0 = obj.b.Y0;
             if (y0 != null) {
                y0.setVisibility(0);
             }
          }
       }else {
          y0 = uoa.Y0;
          if (y0 != null && !y0.getVisibility()) {
             obj.b.Y0.setVisibility(8);
          }
       }
       uoa = obj.b;
       uoa.q.mAutoSelectedMomentBtn = false;
       if (i < uoa.N.size()) {
          uoa = obj.b;
          Objects.requireNonNull(uoa);
          g0 og0 = g0.class;
          if (PatchProxy.isSupport(og0) && (PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), uoa, og0, "57") || (i == uoa.f1 || (q.f(uoa.L) || (a1.i(uoa.getActivity()) && (i < uoa.L.size() && uoa.f1 < uoa.L.size())))))) {
             ProfileTabModel profileTabMo = uoa.L.get(uoa.f1);
             ProfileTabModel profileTabMo1 = uoa.L.get(i);
             g0 og01 = uoa.f1;
             String str3 = String.valueOf(uoa.getActivity().hashCode());
             l ol = l.class;
             if (PatchProxy.isSupport(ol)) {
                Object[] objArray = new Object[]{profileTabMo,profileTabMo1,Integer.valueOf(og01),Integer.valueOf(p0),str3};
                if (!PatchProxy.applyVoid(objArray, obj1, ol, "3")) {
                }
             }else {
             }
          }
       label_01e8 :
          uoa = obj.b;
          uoa.m9(uoa.N.get(i).intValue());
       }else {
          g.a(KsLogProfileTag.COMMON.appendTag(str2), str1+i+str+obj.b.N.toString());
       }
       obj.b.f1 = i;
       return;
    }
}
