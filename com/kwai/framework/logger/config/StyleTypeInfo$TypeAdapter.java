package com.kwai.framework.logger.config.StyleTypeInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import y96.m;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$l;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class StyleTypeInfo$TypeAdapter extends TypeAdapter	// class@00165d
{
    public final Gson a;
    public static final a b;

    static {
       StyleTypeInfo$TypeAdapter.b = a.get(m.class);
    }
    public void StyleTypeInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, StyleTypeInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = p0.J();
          int i = 0;
          if (JsonToken.NULL == obj) {
             p0.A();
          }else if(JsonToken.BEGIN_OBJECT != obj){
             p0.Q();
          }else {
             p0.c();
             obj = new m();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x839c4227:
                      if (str.equals("launch_source")) {
                         i = 0;
                      }
                      break;
                    case 0x97abc3df:
                      if (str.equals("is_app_prelaunching")) {
                         i = 1;
                      }
                      break;
                    case 0xbe8aba99:
                      if (str.equals("bottom_tab_id")) {
                         i = 2;
                      }
                      break;
                    case 0xbfd87d2c:
                      if (str.equals("grant_browse_type")) {
                         i = 3;
                      }
                      break;
                    case 0xda5e102f:
                      if (str.equals("top_tab_id")) {
                         i = 4;
                      }
                      break;
                    case 0xf2e63460:
                      if (str.equals("push_id")) {
                         i = 5;
                      }
                      break;
                    case 0xf63354e4:
                      if (str.equals("browseType")) {
                         i = 6;
                      }
                      break;
                    case 0xf9449d23:
                      if (str.equals("is_app_prelaunch")) {
                         i = 7;
                      }
                      break;
                    case 0x20894ca8:
                      if (str.equals("bottom_navigation")) {
                         i = 8;
                      }
                      break;
                    case 0x4a997be3:
                      if (str.equals("children_mode")) {
                         i = 9;
                      }
                      break;
                    case 0x660c3609:
                      if (str.equals("nebulaTimerMode")) {
                         i = 10;
                      }
                      break;
                    case 0x67c2f239:
                      if (str.equals("darkMode")) {
                         i = 11;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mLaunchSource = KnownTypeAdapters$k.a(p0, obj.mLaunchSource);
                      break;
                    case 1:
                      obj.mIsAppPrelaunching = KnownTypeAdapters$g.a(p0, obj.mIsAppPrelaunching);
                      break;
                    case 2:
                      obj.mBottomRecoTabIds = KnownTypeAdapters$l.a(p0);
                      break;
                    case 3:
                      obj.mGrantBrowseType = TypeAdapters.A.read(p0);
                      break;
                    case 4:
                      obj.mTopRecoTabIds = KnownTypeAdapters$l.a(p0);
                      break;
                    case 5:
                      obj.mLaunchPushId = TypeAdapters.A.read(p0);
                      break;
                    case 6:
                      obj.mBrowseType = TypeAdapters.A.read(p0);
                      break;
                    case 7:
                      obj.mIsAppPrelaunch = KnownTypeAdapters$g.a(p0, obj.mIsAppPrelaunch);
                      break;
                    case 8:
                      obj.mIsIGauntlet = KnownTypeAdapters$g.a(p0, obj.mIsIGauntlet);
                      break;
                    case 9:
                      obj.mIsChildMode = KnownTypeAdapters$g.a(p0, obj.mIsChildMode);
                      break;
                    case 10:
                      obj.mNebulaTimerMode = TypeAdapters.A.read(p0);
                      break;
                    case 11:
                      obj.mIsDarkMode = KnownTypeAdapters$g.a(p0, obj.mIsDarkMode);
                      break;
                    default:
                      p0.Q();
                }
             }
             p0.j();
          }
          obj = i;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, StyleTypeInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mBrowseType != null) {
             p0.r("browseType");
             TypeAdapters.A.write(p0, p1.mBrowseType);
          }
          p0.r("darkMode");
          p0.P(p1.mIsDarkMode);
          p0.r("children_mode");
          p0.P(p1.mIsChildMode);
          if (p1.mGrantBrowseType != null) {
             p0.r("grant_browse_type");
             TypeAdapters.A.write(p0, p1.mGrantBrowseType);
          }
          if (p1.mTopRecoTabIds != null) {
             p0.r("top_tab_id");
             KnownTypeAdapters$l.b(p0, p1.mTopRecoTabIds);
          }
          if (p1.mBottomRecoTabIds != null) {
             p0.r("bottom_tab_id");
             KnownTypeAdapters$l.b(p0, p1.mBottomRecoTabIds);
          }
          p0.r("launch_source");
          p0.K((long)p1.mLaunchSource);
          if (p1.mLaunchPushId != null) {
             p0.r("push_id");
             TypeAdapters.A.write(p0, p1.mLaunchPushId);
          }
          if (p1.mNebulaTimerMode != null) {
             p0.r("nebulaTimerMode");
             TypeAdapters.A.write(p0, p1.mNebulaTimerMode);
          }
          p0.r("bottom_navigation");
          p0.P(p1.mIsIGauntlet);
          p0.r("is_app_prelaunch");
          p0.P(p1.mIsAppPrelaunch);
          p0.r("is_app_prelaunching");
          p0.P(p1.mIsAppPrelaunching);
          p0.j();
       }
       return;
    }
}
