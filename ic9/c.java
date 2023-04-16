package ic9.c;
import hc9.f;
import java.util.List;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Iterator;
import ic9.a;
import android.content.Intent;
import java.util.ArrayList;
import mc9.b;
import com.kwai.framework.model.feed.BaseFeed;
import r8c.x;
import qb9.z;
import android.net.Uri;
import qb9.a0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Number;
import ekd.j0;
import java.io.File;
import com.yxcorp.gifshow.camera.record.autoapply.sample.SampleDownloadOption$1;
import ee9.m;
import lnc.n4;
import xf9.a;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import hn6.c;
import lnc.x6;
import lnc.y6;
import ic9.b;

public class c extends f	// class@002671
{
    public f s;

    public void c(f p0){
       super();
       this.s = p0;
    }
    public static boolean C(List p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, c.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Iterator iterator = p0.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          if (p1.equals(iterator.next().c())) {
             break ;
          }
       }
       return true;
    }
    public static c D(Intent p0){
       m obj4;
       a uoa;
       z obj5;
       Uri obj6;
       a uoa3;
       Iterator iterator;
       int b;
       b obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       Object obj1 = null;
       ArrayList obj2 = PatchProxy.applyOneRefs(obj, obj1, uoc, "10");
       if (obj2 != patchProxyRe) {
          return obj2;
       }
       if (obj.hasExtra("tag_recommend_templates")) {
          return obj1;
       }
       obj2 = new ArrayList();
       ArrayList uArrayList = new ArrayList();
       BaseFeed obj3 = PatchProxy.applyOneRefs(obj, obj1, b.class, "1");
       String str = 3;
       if (obj3 != patchProxyRe) {
       }else {
          obj3 = x.b(p0);
          obj5 = new z();
          obj6 = p0.getData();
          if (obj6 != null) {
             a0.a.b(obj6, obj5);
          }
          if (obj3 != null || !TextUtils.x(obj5.b)) {
             Object obj7 = PatchProxy.applyOneRefs(obj, obj1, x.class, "3");
             int i = (obj7 != patchProxyRe)? obj7.intValue(): j0.b(obj, "source_photo_action", false);
             if (i == 1 || (i == 2 || (i == str || i == 7))) {
                String str1 = x.a(p0);
                if (TextUtils.x(str1) || !new File(str1).exists()) {
                   b uob = new b();
                   uob.a(false);
                   if (obj3 != null) {
                      uob.w(obj3, false);
                   }else {
                      uob.x(obj5.b, new SampleDownloadOption$1(obj5));
                   }
                   uob.o = false;
                   uob.A(false);
                   obj3 = uob;
                }
             }
          }
       label_0054 :
          obj3 = obj1;
       }
       if (obj3 != null) {
          obj4 = (obj3.c() != null)? obj3.c(): obj3.e();
          obj2.add(obj3);
          uoa = new a(obj3.d(), obj4, "sample", false, 4);
          uArrayList.add(obj4);
       }
       if (!obj.getBooleanExtra("magicFaceNotAutoApply", false)) {
          obj4 = m.E(p0);
          if (obj4 == null) {
             obj4 = m.F(p0);
             if (obj4 != null) {
                n4.d(p0);
             }
          }
          if (obj4 != null) {
             if (obj4.C()) {
                obj4.a(false);
             }
             obj5 = (obj4.c() != null)? obj4.c(): obj4.e();
             obj2.add(obj4);
             a uoa1 = new a(obj4.d(), obj5, "magicface", false, 4);
             uArrayList.add(obj5);
          }
       }else {
          obj4 = obj1;
       }
       uoa = a.C(obj, true);
       if (uoa != null) {
          obj6 = (uoa.c() != null)? uoa.c(): uoa.e();
          obj2.add(uoa);
          a uoa2 = new a(uoa.d(), obj6, "music", true, 2);
          uArrayList.add(obj6);
       }
       if (!PatchProxy.applyVoidTwoRefs(obj, uArrayList, obj1, uoc, "11")) {
          if (obj.getIntExtra("camera_page_source", false) == 8) {
             int intExtra = obj.getIntExtra("tag_source_tag_type", false);
             if (intExtra != str) {
                if (intExtra != 4) {
                   if (intExtra != 5) {
                      iterator = uArrayList.iterator();
                      while (iterator.hasNext()) {
                         iterator.next().g(false);
                      }
                   }else {
                      iterator = uArrayList.iterator();
                      while (iterator.hasNext()) {
                         uoa3 = iterator.next();
                         b = (!"sample".equals(uoa3.c()) && !"music".equals(uoa3.c()))? true: false;
                         uoa3.g(b);
                      }
                   }
                }else {
                   iterator = uArrayList.iterator();
                   while (iterator.hasNext()) {
                      uoa3 = iterator.next();
                      b = "magicface".equals(uoa3.c()) ^ true;
                      uoa3.g(b);
                   }
                }
             }else {
                iterator = uArrayList.iterator();
                while (iterator.hasNext()) {
                   uoa3 = iterator.next();
                   b = "music".equals(uoa3.c()) ^ true;
                   uoa3.g(b);
                }
             }
          }else if(uArrayList.isEmpty()){
             if (uArrayList.size() == 1) {
                uArrayList.get(false).g(false);
             }else if(c.C(uArrayList, "sample")){
                if (y6.r(c.class).Z30(ActivityContext.g().e())) {
                   iterator = uArrayList.iterator();
                   while (iterator.hasNext()) {
                      uoa3 = iterator.next();
                      b = (!"sample".equals(uoa3.c()) && !"music".equals(uoa3.c()))? true: false;
                      uoa3.g(b);
                   }
                }else if(obj.getBooleanExtra("isGoToLipSync", false)){
                   iterator = uArrayList.iterator();
                   while (iterator.hasNext()) {
                      uoa3 = iterator.next();
                      b = (!"sample".equals(uoa3.c()) && !"music".equals(uoa3.c()))? true: false;
                      uoa3.g(b);
                   }
                }else {
                   iterator = uArrayList.iterator();
                   while (iterator.hasNext()) {
                      uoa3 = iterator.next();
                      b = "sample".equals(uoa3.c()) ^ true;
                      uoa3.g(b);
                   }
                }
             }else if(obj.getBooleanExtra("needMusicDownloadIndicator", false) && c.C(uArrayList, "music")){
                iterator = uArrayList.iterator();
                while (iterator.hasNext()) {
                   uoa3 = iterator.next();
                   b = "music".equals(uoa3.c()) ^ true;
                   uoa3.g(b);
                }
             }else if(c.C(uArrayList, "magicface")){
                iterator = uArrayList.iterator();
                while (iterator.hasNext()) {
                   uoa3 = iterator.next();
                   b = "magicface".equals(uoa3.c()) ^ true;
                   uoa3.g(b);
                }
             }else {
                iterator = uArrayList.iterator();
                while (iterator.hasNext()) {
                   iterator.next().g(false);
                }
             }
          }
       }
       if (!uArrayList.isEmpty()) {
          obj = new b(uArrayList);
          uoa3 = (!obj.b.isEmpty())? obj.b.get(false): obj.c.get(false);
          if (!"sample".equals(uoa3.c())) {
             if ("magicface".equals(uoa3.c())) {
                obj3 = obj4;
             }else if("music".equals(uoa3.c())){
                obj3 = uoa;
             }else {
                obj3 = obj2.get(false);
             }
          }
          c uoc1 = new c(obj3);
          uoc1.w(obj, false);
          return uoc1;
       }else {
          return obj1;
       }
    }
    public int i(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.s.i();
    }
    public boolean j(){
       return true;
    }
    public boolean k(){
       Object obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.s.k();
    }
    public boolean l(){
       Object obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.s.l();
    }
    public boolean m(){
       Object obj = PatchProxy.apply(null, this, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.s.m();
    }
    public boolean n(){
       Object obj = PatchProxy.apply(null, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.s.n();
    }
    public boolean o(){
       Object obj = PatchProxy.apply(null, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.s.o();
    }
    public boolean p(){
       return false;
    }
    public boolean q(){
       Object obj = PatchProxy.apply(null, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.s.q();
    }
    public boolean r(){
       Object obj = PatchProxy.apply(null, this, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.s.r();
    }
    public boolean s(){
       Object obj = PatchProxy.apply(null, this, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.s.s();
    }
}
