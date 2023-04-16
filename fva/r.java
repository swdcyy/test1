package fva.r;
import java.lang.Object;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.hot.spot.fragment.HotSpotFragment;
import com.smile.gifshow.annotation.provider.v2.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import fva.r$e;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import fva.r$f;
import fva.r$g;
import fva.r$h;
import com.kwai.framework.model.user.User;
import fva.r$i;
import com.kuaishou.android.model.mix.CommonMeta;
import fva.r$j;
import fva.r$k;
import fva.r$l;
import fva.r$m;
import fva.r$a;
import fva.r$b;
import fva.r$c;
import fva.r$d;
import com.yxcorp.gifshow.model.hotspot.HotSpotItem;
import android.app.Activity;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.utility.Log;
import vm5.h$a;
import tkd.b;
import tkd.d;
import os5.l;
import brd.t;
import fva.r$n;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.feed.g;
import fva.r$o;

public final class r	// class@002a29
{
    public static final r a;

    static {
       r.a = new r();
    }
    public void r(){
       super();
    }
    public final a a(int p0,List p1,QPhoto p2,HotSpotFragment p3){
       a obj;
       if (PatchProxy.isSupport(r.class)) {
          obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), p1, p2, p3, this, r.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new a();
       obj.i("HOTSPOT_CLICK_TO_SLIDE_PLAY", new r$e());
       obj.i("PAGE_NAME", new r$f());
       obj.i("HOTSPOT_CLICK_TO_SLIDE_PLAY_SOURCE", new r$g(p0));
       obj.i("HOTSPOT_CLICK_TO_SLIDE_PLAY_LIST", new r$h(p1));
       obj.h(User.class, new r$i(p2));
       obj.h(CommonMeta.class, new r$j(p2));
       obj.i("FRAGMENT", new r$k(p3));
       obj.i("SLIDE_PLAY_BUSINESS", new r$l());
       obj.i("HOT_CLICK_TO_NASA_SLIDE_PLAY", new r$m());
       obj.i("LOCAL_CLICK_TO_NASA_SLIDE_PLAY", new r$a());
       obj.i("LOCAL_CLICK_NEBULA_TO_NASA_SLIDE_PLAY", new r$b());
       obj.i("PROFILE_CLICK_NEBULA_TO_NASA_SLIDE_PLAY", new r$c());
       obj.i("ATLAS_SEARCH_RELATED_PHOTO_SLIDE_SAME_STEAM", new r$d());
       return obj;
    }
    public final void b(HotSpotItem p0,Activity p1,int p2,List p3,HotSpotFragment p4){
       r or = r.class;
       if (PatchProxy.isSupport(or)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),p3,p4};
          if (PatchProxy.applyVoid(objArray, this, or, "1")) {
             return;
          }
       }
       a.p(p0, "data");
       a.p(p1, "activity");
       a.p(p3, "list");
       a.p(p4, "fragment");
       this.c(p0.mPhotoId, p0.mLiveStreamId, p0.mServerExpTag, p1, p2, p3, p4);
       return;
    }
    public final void c(String p0,String p1,String p2,Activity p3,int p4,List p5,HotSpotFragment p6){
       r or = r.class;
       int i = 0;
       int i1 = 2;
       int i2 = 1;
       if (PatchProxy.isSupport(or)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4),p5,p6};
          if (PatchProxy.applyVoid(objArray, this, or, "2")) {
             return;
          }
       }
       a.p(p3, "activity");
       a.p(p5, "list");
       a.p(p6, "fragment");
       String str = "hotSpot";
       if (p4 == i2 && (TextUtils.isEmpty(p1) && TextUtils.isEmpty(p0))) {
          Log.g(str, "点击不响应进内流，原因：liveStreamId 和 photoId 均为空");
          return;
       }else if(p4 == i1 && TextUtils.isEmpty(p0)){
          Log.g(str, "点击不响应进内流，原因：photoId 均为空");
          return;
       }else {
          h$a uoa = new h$a();
          uoa.O = 289;
          uoa.P = new int[i1]{1,1};
          if (p4 == i2) {
             if (p1 == null || !p1.length()) {
                i = 1;
             }
             if (!i) {
                r$n on = new r$n(uoa, p4, p5, p6, p3);
                d.a(-1492894991).Fy(p1, p2, null).subscribe(p1);
                return;
             }
          }
          r$o oo = new r$o(uoa, p4, p5, p6, p3);
          g.e(p0, p2).subscribe(p1);
          return;
       }
    }
}
