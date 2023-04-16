package fq1.d;
import java.util.List;
import android.util.Pair;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import java.util.Iterator;
import nh3.c;
import com.kwai.framework.model.user.UserInfo;
import java.util.Map;
import java.util.LinkedHashMap;
import java.lang.Iterable;
import ae1.a;
import xp1.b;
import java.lang.Number;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import java.util.Set;
import java.util.Map$Entry;
import android.graphics.Rect;
import android.net.Uri;
import java.lang.Integer;
import android.net.Uri$Builder;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.util.Objects;
import com.airbnb.lottie.LottieAnimationView;
import java.lang.Boolean;
import android.widget.ImageView;

public final class d	// class@002382
{

    public static final Pair a(List p0){
       StringBuilder obj = PatchProxy.applyOneRefs(p0, null, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "userInfoList");
       obj = "";
       StringBuilder str = "";
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          c uoc = iterator.next();
          str = str+uoc.c().mName+" ";
          obj = obj+uoc.b()+" "+uoc.c().mName+" "+uoc.a()+" ";
       }
       return new Pair(str, obj);
    }
    public static final Map b(List p0){
       LinkedHashMap obj = PatchProxy.applyOneRefs(p0, null, d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LinkedHashMap();
       if (p0 != null) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             c uoc = iterator.next();
             a uoa = new a(uoc.c().mId, uoc.c(), 4);
             uoa.f = uoc.a();
             UserInfo mId = uoc.c().mId;
             a.o(mId, "it.userInfo.mId");
             obj.put(mId, uoa);
          }
       }
       return obj;
    }
    public static final int c(b p0,String p1,Map p2){
       Rect rect;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, d.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "chatInfoModel");
       a.p(p1, "anchorId");
       LayoutConfig value = p0.c().getValue();
       int i = 0;
       if (value != null && value.c() == 1) {
          if (p2 != null) {
             Iterator iterator = p2.entrySet().iterator();
             rect = Integer.MAX_VALUE;
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                int i1 = a.g(uEntry.getKey(), p1) ^ 1;
                if (i1 && uEntry.getValue().top < rect) {
                   rect = uEntry.getValue().top;
                }
             }
          }else {
             rect = Integer.MAX_VALUE;
          }
          if (rect != Integer.MAX_VALUE) {
             i = rect;
          }
       }
    label_0079 :
       return i;
    }
    public static final Uri d(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uod, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new Uri$Builder().scheme("res").path(String.valueOf(p0)).build();
    }
    public static final UserInfo e(String p0,Map p1){
       UserInfo userInfo = null;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, userInfo, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "userId");
       if (p1 != null) {
          c uoc = p1.get(p0);
          if (uoc != null) {
             userInfo = uoc.c();
          }
       }
       return userInfo;
    }
    public static final int f(View p0){
       ViewGroup$LayoutParams layoutParams = null;
       Object obj = PatchProxy.applyOneRefs(p0, layoutParams, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 != null) {
          layoutParams = p0.getLayoutParams();
       }
       if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
          ViewGroup$LayoutParams layoutParams1 = p0.getLayoutParams();
          Objects.requireNonNull(layoutParams1, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
          return (layoutParams1.leftMargin + layoutParams1.rightMargin);
       }else {
          return 0;
       }
    }
    public static final int g(View p0){
       ViewGroup$LayoutParams width;
       ViewGroup$LayoutParams obj = PatchProxy.applyOneRefs(p0, null, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 != null) {
          obj = p0.getLayoutParams();
          if (obj != null) {
             width = obj.width;
          label_0025 :
             return width;
          }
       }
       width = d.f(p0) + 0;
       goto label_0025 ;
    }
    public static final void h(boolean p0,LottieAnimationView p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, null, uod, "10")) {
          return;
       }
       a.p(p1, "avatarAnimView");
       if (p0) {
          p1.setAnimation(R.raw.arg_RES_7f0f003a);
          p1.setVisibility(0);
          p1.setRepeatCount(-1);
          p1.s();
       }else if(p1.p()){
          p1.f();
       }
       p1.setVisibility(8);
       return;
    }
}
