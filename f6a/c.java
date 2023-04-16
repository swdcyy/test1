package f6a.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import le5.f;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.entity.QPhoto;
import fx6.b;
import java.lang.Number;
import lw6.a;
import java.util.List;
import com.kwai.framework.model.feed.BaseFeed;
import yw6.g;
import yw6.h;
import java.util.Objects;
import qvb.i;
import java.lang.StringBuilder;
import sy6.a;
import com.yxcorp.gifshow.tube.StandardSerialInfo;
import fm5.a;
import com.yxcorp.gifshow.tube.SerialInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import wh5.c;
import com.kwai.feature.api.danmaku.DanmakuSwitchUtil;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils;
import com.kwai.feature.api.danmaku.DanmakuUtil;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.mix.FeedSwitchesInfo;
import com.kuaishou.android.model.entity.PlayerPanelFeatureType;
import java.util.Set;
import java.util.Collection;
import ekd.q;

public final class c	// class@0022c8
{

    public void c(){
       super();
    }
    public static boolean a(){
       c uoc = c.class;
       Object obj = PatchProxy.applyWithListener(null, null, uoc, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       PatchProxy.onMethodExit(uoc, "13");
       return f.c();
    }
    public static boolean b(){
       c uoc = c.class;
       Object obj = PatchProxy.applyWithListener(null, null, uoc, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       PatchProxy.onMethodExit(uoc, "14");
       return f.d();
    }
    public static int c(SlidePlayViewModel p0,QPhoto p1){
       int i3;
       List list1;
       b uob = b.class;
       Object obj = null;
       String obj1 = PatchProxy.applyTwoRefsWithListener(p0, p1, obj, c.class, "4");
       if (obj1 != PatchProxyResult.class) {
          return obj1.intValue();
       }
       int i = -1;
       if (p1 == null) {
          a.b("NasaDetailUtil", "photo = null  return -1");
          PatchProxy.onMethodExit(c.class, "4");
          return i;
       }else {
          List list = p0.V0();
          int i1 = 0;
          int i2 = 0;
          while (true) {
             if (i2 < list.size()) {
                if (list.get(i2).getEntity() == p1.getEntity()) {
                   PatchProxy.onMethodExit(c.class, "4");
                   return i2;
                }else {
                   i2 = i2 + 1;
                }
             }else {
                i3 = list.indexOf(p1);
                if (i3 == i) {
                   obj1 = "kwai_data_source_service";
                   b uob1 = p0.Q0(obj1);
                   if (uob1 != null) {
                      list1 = PatchProxy.apply(obj, uob1, uob, "9");
                      if (list1 != PatchProxyResult.class) {
                      }else {
                         list1 = uob1.a.f().I0();
                      }
                   }else {
                      list1 = obj;
                   }
                   b uob2 = p0.Q0(obj1);
                   if (uob2 != null) {
                      Object obj2 = PatchProxy.apply(obj, uob2, uob, "10");
                      if (obj2 != PatchProxyResult.class) {
                      }else {
                         g og = uob2.a.f();
                         Objects.requireNonNull(og);
                         obj2 = PatchProxy.apply(obj, og, g.class, "45");
                         if (obj2 != PatchProxyResult.class) {
                         }else {
                            og = og.g;
                            if (og != null) {
                               obj = og.getItems();
                            }
                         }
                      }
                      obj = obj2;
                   }
                   StringBuilder str = "dataSource size = "+list.size()+" pageListWrapper size = ";
                   int i4 = (list1 == null)? 0: list1.size();
                   str = str+i4+" originPageListPhotos size = ";
                   if (obj != null) {
                      i1 = obj.size();
                   }
                   a.b("NasaDetailUtil", str+i1);
                   a.b("NasaDetailUtil", "遍历DataSource...");
                   c.i(list);
                   a.b("NasaDetailUtil", "遍历PageListWrapper...");
                   c.i(list1);
                   a.b("NasaDetailUtil", "遍历OriginPageList...");
                   c.i(obj);
                   break ;
                }
                break ;
             }
          }
          PatchProxy.onMethodExit(c.class, "4");
          return i3;
       }
    }
    public static int d(a p0,QPhoto p1){
       int i3;
       StringBuilder obj = PatchProxy.applyTwoRefsWithListener(p0, p1, null, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = -1;
       if (p1 == null) {
          a.b("NasaDetailUtil", "photo = null  return -1");
          PatchProxy.onMethodExit(c.class, "3");
          return i;
       }else {
          List list = p0.i0();
          int i1 = 0;
          int i2 = 0;
          while (true) {
             if (i2 < list.size()) {
                if (list.get(i2).getEntity() == p1.getEntity()) {
                   PatchProxy.onMethodExit(c.class, "3");
                   return i2;
                }else {
                   i2 = i2 + 1;
                }
             }else {
                i3 = list.indexOf(p1);
                if (i3 == i) {
                   List list1 = p0.i0();
                   obj = "dataSource size = "+list.size()+" pageListWrapper size = ";
                   if (list1 != null) {
                      i1 = list1.size();
                   }
                   a.b("NasaDetailUtil", obj+i1);
                   a.b("NasaDetailUtil", "遍历DataSource...");
                   c.i(list);
                   a.b("NasaDetailUtil", "遍历PageListWrapper...");
                   c.i(list1);
                   break ;
                }
                break ;
             }
          }
          PatchProxy.onMethodExit(c.class, "3");
          return i3;
       }
    }
    public static boolean e(QPhoto p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, null, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          PatchProxy.onMethodExit(c.class, "8");
          return b;
       }else {
          StandardSerialInfo standardSeri = a.t(p0);
          if (standardSeri != null) {
             standardSeri = standardSeri.mSerialInfo;
             if (standardSeri != null && !TextUtils.x(standardSeri.mSerialId)) {
                b = true;
             }
          }
          PatchProxy.onMethodExit(c.class, "8");
          return b;
       }
    }
    public static boolean f(QPhoto p0,int p1){
       Object obj;
       boolean b1;
       DanmakuExperimentUtils uDanmakuExpe;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport2(c.class, "11")) {
          obj = PatchProxy.applyTwoRefsWithListener(p0, Integer.valueOf(p1), null, c.class, "11");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (c.b()) {
          PatchProxy.onMethodExit(c.class, "11");
          return b;
       }else if(DanmakuSwitchUtil.b(p0) && p1 != -1){
          if (p1 == 0x7602) {
             String str = "10";
             obj = PatchProxy.applyOneRefsWithListener(p0, null, c.class, str);
             if (obj != patchProxyRe) {
                b1 = obj.booleanValue();
             }else if(!DanmakuSwitchUtil.b(p0) || (!p0.isMine() || (p0.isMine() && DanmakuExperimentUtils.T()))){
                uDanmakuExpe = 1;
             }else {
                uDanmakuExpe = null;
             }
             PatchProxy.onMethodExit(c.class, str);
             b1 = uDanmakuExpe;
             if (!b1) {
             label_0069 :
                b1 = false;
             label_006a :
                if (DanmakuExperimentUtils.U.C()) {
                   PatchProxy.onMethodExit(c.class, "11");
                   return b1;
                }else if(b1 && !DanmakuUtil.g.o(p0)){
                   b = true;
                }
                PatchProxy.onMethodExit(c.class, "11");
                return b;
             }
          }
          b1 = true;
          goto label_006a ;
       }else {
          goto label_0069 ;
       }
    }
    public static boolean g(QPhoto p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, null, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0.isVideoType()) {
          PatchProxy.onMethodExit(c.class, "7");
          return false;
       }else {
          PhotoMeta photoMeta = p0.getPhotoMeta();
          if (photoMeta == null) {
             PatchProxy.onMethodExit(c.class, "7");
             return false;
          }else {
             photoMeta = photoMeta.mFeedSwitches;
             if (photoMeta == null) {
                PatchProxy.onMethodExit(c.class, "7");
                return false;
             }else {
                PatchProxy.onMethodExit(c.class, "7");
                return photoMeta.mEnablePlayerPanel;
             }
          }
       }
    }
    public static boolean h(QPhoto p0,PlayerPanelFeatureType p1){
       Object obj = PatchProxy.applyTwoRefsWithListener(p0, p1, null, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       PhotoMeta photoMeta = p0.getPhotoMeta();
       boolean b = false;
       if (photoMeta == null) {
          PatchProxy.onMethodExit(c.class, "6");
          return b;
       }else {
          photoMeta = photoMeta.mPlayerPanelUnsupportedType;
          if (photoMeta == null || !photoMeta.contains(p1)) {
             b = true;
          }
          PatchProxy.onMethodExit(c.class, "6");
          return b;
       }
    }
    public static void i(List p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, null, c.class, "5")) {
          return;
       }
       if (q.f(p0)) {
          a.b("NasaDetailUtil", "printList, but empty");
          PatchProxy.onMethodExit(c.class, "5");
          return;
       }else {
          int i = 0;
          if (p0.size() > 50) {
             i = p0.size() - 50;
          }
          while (i < p0.size()) {
             String str = (p0.get(i) == null)? "null": p0.get(i).toString();
             a.b("NasaDetailUtil", str);
             i = i + 1;
          }
          PatchProxy.onMethodExit(c.class, "5");
          return;
       }
    }
    public static boolean j(QPhoto p0,boolean p1){
       if (PatchProxy.isSupport2(c.class, "12")) {
          Object obj = PatchProxy.applyTwoRefsWithListener(p0, Boolean.valueOf(p1), null, c.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (p1 && (p0 != null && (p0.isMine() && !p0.isLiveStream())))? true: false;
       PatchProxy.onMethodExit(c.class, "12");
       return b;
    }
}
