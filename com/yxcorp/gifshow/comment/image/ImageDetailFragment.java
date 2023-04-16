package com.yxcorp.gifshow.comment.image.ImageDetailFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import rk9.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import lnc.i3;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import i2b.a;
import rk9.m;
import java.util.Collection;
import ekd.q;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import androidx.viewpager.widget.ViewPager;
import vk9.f;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.List;
import h3.a;
import uk9.f;
import uk9.e;
import ekd.q$a;
import vk9.b;
import java.util.Iterator;
import vk9.c;
import vk9.a;
import lnc.g2;
import rk9.l;
import lnc.g2$a;

public class ImageDetailFragment extends BaseFragment	// class@0010d2
{
    public a j;
    public static final int k;

    public void ImageDetailFragment(){
       super();
    }
    public final a ch(){
       Object obj = PatchProxy.apply(null, this, ImageDetailFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.j == null) {
          this.j = new a(this);
       }
       return this.j;
    }
    public String getPageParams(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, ImageDetailFragment.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.ch();
       Objects.requireNonNull(obj);
       String str = PatchProxy.apply(objArray, obj, a.class, "1");
       if (str != patchProxyRe) {
       }else {
          i3 oi3 = i3.f();
          String str1 = (obj.j != null)? "GIF": "PICTURE";
          oi3.d("type", str1);
          str = oi3.e();
       }
       return str;
    }
    public String o(){
       return "LARGE_PICTURE";
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ImageDetailFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d01d5, p1, false);
    }
    public void onViewCreated(View p0,Bundle p1){
       String str = "3";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ImageDetailFragment.class, str)) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (!PatchProxy.applyVoidOneRefs(p0, this, ImageDetailFragment.class, "4")) {
          a c = this.ch().c;
          if (q.f(c.a)) {
             this.getActivity().finish();
          }else {
             ViewPager viewPager = p0.findViewById(R.id.view_pager);
             Object[] objArray = new Object[]{this.ch(),viewPager};
             int i = 0;
             f uof = new f(Lists.e(objArray));
             viewPager.setAdapter(uof);
             viewPager.setOffscreenPageLimit(1);
             m a = c.a;
             Object obj = null;
             List list = PatchProxy.applyOneRefs(a, obj, f.class, "1");
             if (list != PatchProxyResult.class) {
             }else {
                list = q.g(a, e.a);
             }
             f uof1 = f.class;
             if (!PatchProxy.applyVoidOneRefs(list, uof, uof1, str)) {
                uof.d = list;
                if (!PatchProxy.applyVoid(obj, uof, uof1, "12")) {
                   int i1 = uof.d.size();
                   for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                      uof.d.get(i2).a = i2;
                   }
                }
                Iterator iterator = uof.e.iterator();
                while (iterator.hasNext()) {
                   iterator.next().b();
                }
                uof.e.clear();
                for (; i < list.size(); i = i + 1) {
                   uof.e.add(new a());
                }
                uof.q();
             }
             viewPager.setCurrentItem(c.b);
          }
       }
       new g2(this, new l(this)).b(this.ch());
       return;
    }
}
