package bc9.x$b;
import cc9.i;
import bc9.x;
import java.lang.Object;
import cc9.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantResponse;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.Objects;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import bc9.g;
import com.yxcorp.gifshow.camera.record.base.d;
import androidx.fragment.app.Fragment;
import h3.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import ac9.g;
import com.yxcorp.gifshow.camera.record.assistant.model.KSAssistantTemplate;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import u79.a;
import android.app.Activity;
import lnc.da;
import lnc.a1;
import android.graphics.drawable.ColorDrawable;
import java.lang.StringBuilder;
import android.graphics.Color;
import j8c.a;
import java.lang.Throwable;
import w46.b;
import bc9.b;
import com.yxcorp.gifshow.model.CDNUrl;

public final class x$b implements i	// class@00040a
{
    public final x a;

    public void x$b(x p0){
       this.a = p0;
       super();
    }
    public void a(Object p0){
       x$b a;
       x$b a1;
       x b;
       KSTemplateDetailInfo obj2;
       x v;
       String url;
       int i3;
       ArrayList uArrayList1;
       int i4;
       int i5;
       Object obj = this;
       Object obj1 = p0;
       x ox = x.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, x$b.class, "1")) {
       }else {
          a.p(obj1, "newState");
          if (obj1.b() != null && !q.f(obj1.b().getTemplateList())) {
             a = obj.a;
             Objects.requireNonNull(a);
             Object[] objArray = null;
             if (!PatchProxy.applyVoid(objArray, a, ox, "13")) {
                b = a.x;
                if (b != null && a.w == null) {
                   i5 = 0x7f0a0605;
                   ViewStubInflater2 viewStubInfl = new ViewStubInflater2(0x7f0a0606, i5);
                   viewStubInfl.d(b);
                   viewStubInfl.e(R.layout.arg_RES_7f0d0165);
                   a.w = viewStubInfl.b(i5);
                   d f = a.f;
                   a.o(f, "mFragment");
                   g og1 = new g(f);
                   a.v = og1;
                   v = a.w;
                   if (v != null) {
                      v.setAdapter(og1);
                   }
                }
             }
             a = obj.a;
             AssistantResponse uAssistantRe = obj1.b();
             Objects.requireNonNull(a);
             if (!PatchProxy.applyVoidOneRefs(uAssistantRe, a, ox, "11")) {
                ArrayList uArrayList = new ArrayList();
                Iterator iterator = uAssistantRe.getTemplateList().iterator();
                while (iterator.hasNext()) {
                   g og = iterator.next();
                   if (og instanceof KSAssistantTemplate) {
                      KSTemplateDetailInfo kuaishan = og.getKuaishan();
                      if (kuaishan != null) {
                         uArrayList.add(kuaishan);
                      }
                   }
                }
                b = a.B;
                int i = 0;
                if (b != null) {
                   a.m(b);
                   obj2 = PatchProxy.applyTwoRefs(uArrayList, b, a, ox, "16");
                   boolean b1 = true;
                   if (obj2 != PatchProxyResult.class) {
                      b1 = obj2.booleanValue();
                   }else if(a.g(uArrayList, b)){
                      if (uArrayList.size() == b.size()) {
                         i5 = uArrayList.size();
                         int i6 = 0;
                         while (i6 < i5) {
                            int i7 = a.g(uArrayList.get(i6).mTemplateId, b.get(i6).mTemplateId) ^ b1;
                            if (!i7) {
                               i6 = i6 + 1;
                            }
                         }
                      }
                      b1 = false;
                   }
                   if (b1) {
                      b = a.v;
                      if (b == null || b.j()) {
                      label_023e :
                         if (obj1.d()) {
                            a1 = obj.a;
                            if (a1.G != null) {
                               a1.o2();
                            }
                         }
                         a1 = obj.a;
                         if (a1.t != null && (a1.G == null && (obj1.c() || (!obj1.d() && (a.g(obj.a.I, obj1.b()) && obj1.b() != null))))) {
                            obj.a.p2();
                         }
                      label_027c :
                         obj.a.I = obj1.b();
                      }
                   }
                }
             label_010c :
                if (a.D <= null && !PatchProxy.applyVoid(objArray, a, ox, "12")) {
                   View view = a.e.findViewById(R.id.camera_time_tab_scroll_container);
                   if (view != null) {
                      a.D = view.getTop() - a.p;
                   }
                }
                ox = a.v;
                if (ox != null) {
                   ox.J(a.C, a.D);
                }
                a.B = uArrayList;
                v = a.v;
                if (v == null || PatchProxy.applyVoidOneRefs(uArrayList, v, g.class, "4")) {
                   goto label_023e ;
                }else {
                   a.p(uArrayList, "templates");
                   if (uArrayList.isEmpty()) {
                      goto label_023e ;
                   }else {
                      v.z();
                      int i1 = uArrayList.size();
                      int i2 = 0;
                      while (i2 < i1) {
                         Object obj3 = uArrayList.get(i2);
                         double d = obj3.mTemplateDuration * (double)1000.00f;
                         String str = (d - (double)i > 0)? a1.r(0x7f101bd8, da.b((long)d)): objArray;
                         String str1 = a1.q(R.string.arg_RES_7f101bd9, obj3.mMediaCount);
                         a.o(str1, "CommonUtil.string\(\n     бн_photo, info.mMediaCount\)");
                         ColorDrawable uColorDrawab = new ColorDrawable(Color.parseColor(v.g+obj3.mColor));
                         KSTemplateDetailInfo mCoverUrls = obj3.mCoverUrls;
                         if (mCoverUrls != null && (uColorDrawab != null && obj3.mDemoUrls != null)) {
                            a.m(mCoverUrls);
                            obj2 = obj3.mCoverUrls;
                            a.m(obj2);
                            b obj4 = obj2.get(i);
                            a.o(obj4, "info.mCoverUrls!![0]");
                            url = obj4.getUrl();
                            a.o(url, "info.mCoverUrls!![0].url");
                            obj2 = obj3.mDemoUrls;
                            a.m(obj2);
                            obj4 = obj2.get(i);
                            a.o(obj4, "info.mDemoUrls!![0]");
                            String url1 = obj4.getUrl();
                            a.o(url1, "info.mDemoUrls!![0].url");
                            i3 = i1;
                            obj4 = v14;
                            uArrayList1 = uArrayList;
                            b uob = v14;
                            i4 = i2;
                            obj4 = new b(mCoverUrls, obj3, str1, str, uColorDrawab, i2, url, url1, v.h, v.i);
                            v.d.add(uob);
                         }else {
                            i3 = i1;
                            uArrayList1 = uArrayList;
                            i4 = i2;
                         }
                         i2 = i4 + 1;
                         i1 = i3;
                         uArrayList = uArrayList1;
                         url = null;
                         i = 0;
                      }
                      v.q();
                      goto label_023e ;
                   }
                }
             }
          }else {
             goto label_023e ;
          }
       }
       return;
    }
}
