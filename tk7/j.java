package tk7.j;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import wk7.e;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import tk7.a;
import vk7.j0;
import tk7.k;
import com.kwai.privacykit.config.PrivacyConfig;
import com.kwai.privacykit.config.PrivacyPolicy;
import uk7.b;
import java.lang.System;
import java.lang.Number;
import java.util.List;
import wk7.c;
import uk7.a;
import com.kwai.chat.sdk.logreport.utils.GsonUtil;
import java.lang.StringBuilder;
import wk7.f;
import com.kwai.middleware.azeroth.Azeroth2;
import android.content.Context;
import wk7.a;
import wk7.a$a;
import java.util.ArrayList;
import java.util.Collection;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import java.lang.Exception;
import java.lang.Integer;
import java.util.Collections;
import java.util.Arrays;
import com.kwai.privacykit.config.PrivacyPolicy$Frequency;
import ekd.q;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.app.Activity;
import tk7.d;
import tk7.b;
import wk7.j;
import v96.b;
import tk7.b$a;
import tk7.f;
import android.view.View$OnClickListener;
import tk7.g;

public class j	// class@00254e
{
    public PrivacyConfig a;
    public a b;
    public b c;
    public static final j d;
    public static boolean e;
    public static final Map f;
    public static final Map g;

    static {
       j.d = new j();
       j.f = new ConcurrentHashMap();
       j.g = new ConcurrentHashMap();
    }
    public void j(){
       super();
    }
    public static j g(){
       return j.d;
    }
    public static boolean i(){
       Boolean uBoolean = PatchProxy.apply(null, null, j.class, "15");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          uBoolean = e.a("userAgreedLicense", false);
       }
       return uBoolean.booleanValue();
    }
    public static boolean l(){
       Boolean uBoolean = PatchProxy.apply(null, null, j.class, "8");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          uBoolean = e.a("isInterceptReadClipboardBackground", false);
       }
       return uBoolean.booleanValue();
    }
    public static void o(boolean p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, oj, "11")) {
          return;
       }
       Iterator iterator = j.g.keySet().iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          if (uoa != null) {
             uoa.a(p0);
          }
       }
       return;
    }
    public static void q(boolean p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, oj, "13")) {
          return;
       }
       j0.a = p0;
       e.f("userAgreedLicense", p0);
       if (!PatchProxy.isSupport(oj) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, oj, "14")) {
          Map f = j.f;
          if (!f.isEmpty()) {
             Iterator iterator = f.keySet().iterator();
             while (iterator.hasNext()) {
                k ok = iterator.next();
                if (ok != null) {
                   ok.a(p0);
                }
             }
          }
       }
       return;
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "29")) {
          return;
       }
       PrivacyConfig privacyConfi = this.h();
       if (privacyConfi != null) {
          PrivacyPolicy privacyPolic = privacyConfi.c(p0);
          if (!PatchProxy.applyVoidOneRefs(privacyPolic, null, b.class, "10") && privacyPolic != null) {
             long l = b.a(privacyPolic.c());
             int i = 0;
             int i1 = (!l)? 1: 0;
             int i2 = b.d(privacyPolic.c());
             long l1 = System.currentTimeMillis();
             String str = ((l1 - l) - privacyPolic.b() < 0)? 1: null;
             if (i1 || !str) {
                b.e(privacyPolic.c(), l1);
             }else {
                i = i2;
             }
             b.g(privacyPolic.c(), (i + 1));
          }
       }
       return;
    }
    public final boolean b(String p0,String p1,String p2,boolean p3){
       if (PatchProxy.isSupport(j.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, j.class, "33");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.h().a(p2, p0, p1, p3);
    }
    public int c(String p0,String p1,String p2,boolean p3){
       PrivacyPolicy obj;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(j.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, j.class, "47");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       if (!j.i()) {
          return 0x21aad;
       }else {
          obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, j.class, "48");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else {
             obj = this.h().c(p0);
             if (obj != null) {
                Object obj1 = PatchProxy.applyTwoRefs(p1, p2, obj, PrivacyPolicy.class, "10");
                b = (obj1 != patchProxyRe)? obj1.booleanValue(): obj.d(obj.mPrivilegedCases, p1, p2);
                if (b) {
                   b = c.b(p0);
                }
             }
             b = false;
          }
          if (b) {
             return 0;
          }else if(!this.b(p1, p2, p0, p3)){
             int i = (p3)? 0x21aaf: 0x21aae;
             return i;
          }else if(!this.j(p0, p1)){
             return 0x21ab1;
          }else if(!c.b(p0)){
             return 0x21ab0;
          }else if(!this.t(p0, p3)){
             return 0x21ab6;
          }else {
             return 0;
          }
       }
    }
    public final boolean d(String p0,boolean p1,String p2){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(j.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), p2, this, j.class, "38");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       PrivacyPolicy privacyPolic = this.h().c(p0);
       boolean b = true;
       if (privacyPolic != null) {
          if (!p1) {
             Object obj1 = PatchProxy.applyOneRefs(p2, privacyPolic, PrivacyPolicy.class, "7");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else {
                long l = System.currentTimeMillis();
                long l1 = b.b(privacyPolic.mPermission, p2);
                patchProxyRe = (!l1)? 1: 0;
                if (patchProxyRe || (l - l1) - (privacyPolic.mCooldownTime * 1000) > 0) {
                   b1 = true;
                }else {
                   b1 = false;
                }
             }
             if (!b1) {
             label_0068 :
                b = false;
             }
          }
       }else {
          goto label_0068 ;
       }
       return b;
    }
    public final a e(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, j.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.b == null) {
          _monitor_enter(j.class);
          if (this.b == null) {
             obj = PatchProxy.apply(objArray, objArray, b.class, "7");
             if (obj != patchProxyRe) {
             }else {
                obj = e.e("privacyConfig", "{\"config\":{\"kpn\":\"KUAISHOU\",\"appVersion\":\"9.10.20\",\"configVersion\":1,\"createTime\":1655363006463,\"configs\":[{\"permission\":\"location\",\"frequency\":{\"unit\":\"hour\",\"value\":20},\"cooldownTime\":172800,\"bizList\":[\"default\",\"post_dynamic_avatar\",\"live_author\",\"live_square\",\"social\",\"moment\",\"socialShake\",\"merchant_address_location\",\"KSMerchantLocationPermissionServiceForUserShoppingAddress\",\"promotion\",\"app_selection\",\"live_audience\",\"service_activity\",\"jimu\",\"workday\",\"ks_mp_platform\",\"locallife\",\"ks_ad\",\"creator\",\"consumer\",\"guru_comment\"],\"whitelistScenes\":[{\"biz\":\"default\",\"scenes\":[\"nearby\",\"KSLoalRoamingPanel\",\"KSLocalPhotoMap\",\"post_poi_picker\",\"post_poi_picker_krn\",\"post_magicface\",\"poi\",\"tuna_location_picker\",\"tuna_poi_preview\",\"location_upload\",\"yoda_request_location\"]},{\"biz\":\"live_square\",\"scenes\":[\"live_square\"]},{\"biz\":\"social\",\"scenes\":[\"socialNearbyPeople\",\"socialNearbyPeopleAlert\"]},{\"biz\":\"moment\",\"scenes\":[\"moment_nearby\"]},{\"biz\":\"socialShake\",\"scenes\":[\"socialShake\",\"socialShakeAlert\"]},{\"biz\":\"KSMerchantLocationPermissionServiceForUserShoppingAddress\",\"scenes\":[\"KSMerchantLocationPermissionServiceForUserShoppingAddress\"]},{\"biz\":\"merchant_address_location\",\"scenes\":[\"merchant_address_location\",\"address_fill_new\"]},{\"biz\":\"app_selection\",\"scenes\":[\"selection_slide_location\"]},{\"biz\":\"promotion\",\"scenes\":[\"razor_promotion\"]},{\"biz\":\"live_audience\",\"scenes\":[\"live_audience\"]},{\"biz\":\"workday\",\"scenes\":[\"workday_location\"]},{\"biz\":\"locallife\",\"scenes\":[\"poi\"]},{\"biz\":\"creator\",\"scenes\":[\"talent_sale\"]},{\"biz\":\"consumer\",\"scenes\":[\"app_weather_h5\"]},{\"biz\":\"guru_comment\",\"scenes\":[\"user_location\"]}],\"enableUidIteration\":false,\"appList\":[],\"extra\":{},\"lightMode\":false,\"privilegedCases\":[{\"biz\":\"default\"
    ,\"scenes\":[\"location_upload\"]}]},{\"permission\":\"appList\",\"frequency\":{\"unit\":\"day\",\"value\":1},\"cooldownTime\":86400,\"bizList\":[\"default\",\"user_growth\",\"testBiz\"],\"whitelistScenes\":[{\"biz\":\"default\",\"scenes\":[\"default\"]},{\"biz\":\"testBiz\",\"scenes\":[\"testSecne\"]},{\"biz\":\"user_growth\",\"scenes\":[\"spaceclean\"]}],\"enableUidIteration\":true,\"appList\":[],\"extra\":{},\"lightMode\":false,\"privilegedCases\":[]},{\"permission\":\"photo\",\"frequency\":{\"unit\":\"hour\",\"value\":20},\"cooldownTime\":172800,\"bizList\":[\"post_asset_picker\",\"post_camera_album\",\"post_edit_cut_reorder\",\"post_edit_music_import_voice\",\"post_edit_image_reorder\",\"post_custom_cover_album\",\"post_aicut_album\",\"post_image_publish_append\",\"post_main_icon_long_click\",\"post_entrence_bubble\",\"post_ks_import_album\",\"post_ktv_add_image\",\"post_magicface_album\",\"post_story_editor\",\"post_image_template_plc\",\"im_latest_photo_album\",\"post_editor\",\"post_share_saveAlbum\",\"post_camera_burst\",\"post_camera_popup\",\"post_smart_album\",\"post_ai_cut\",\"post_album_tool\",\"post_album\",\"post_image_crop\",\"post_album_banner\",\"post_predict\",\"post_thirdparty_share\"],\"enableUidIteration\":false,\"appList\":[],\"extra\":{},\"lightMode\":false,\"privilegedCases\":[]}],\"extra\":{},\"env\":\"\"}}");
             }
             this.b = GsonUtil.fromJson(obj, a.class);
             String str = "PrivacyManager";
             obj = "mCachePrivacyConfig is null ";
             b = (this.b == null)? true: false;
             f.a(str, obj+b);
          }
          _monitor_exit(j.class);
       }
       return this.b;
    }
    public List f(String p0){
       Iterator obj;
       ArrayList uArrayList;
       ArrayList obj1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p0 = PatchProxy.applyOneRefs(p0, this, j.class, "20");
       if (p0 != patchProxyRe) {
          return p0;
       }
       PrivacyPolicy privacyPolic = this.h().c("appList");
       if (privacyPolic == null) {
          return new ArrayList();
       }
       Context uContext = Azeroth2.B.d();
       PrivacyPolicy mAppList = privacyPolic.mAppList;
       privacyPolic = privacyPolic.mEnableUidIteration;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyThreeRefs(uContext, mAppList, Boolean.valueOf(privacyPolic), null, a.class, "1");
          if (obj != patchProxyRe) {
          }else {
          label_0044 :
             int i = 0x4e1f;
             if (a.c) {
                if (PatchProxy.isSupport(a.class)) {
                   obj = PatchProxy.applyThreeRefs(uContext, mAppList, Boolean.valueOf(privacyPolic), null, a.class, "3");
                   if (obj != patchProxyRe) {
                   }
                }
                if (!a.b.isEmpty()) {
                   uArrayList = new ArrayList(a.b);
                }else {
                   PackageManager packageManag = uContext.getPackageManager();
                   if (mAppList != null) {
                      obj = mAppList.iterator();
                      while (obj.hasNext()) {
                         String str = obj.next();
                         try{
                            a.b.add(packageManag.getPackageInfo(str, 128));
                         }catch(java.lang.Exception e3){
                            e3.printStackTrace();
                            goto label_0084 ;
                         }
                      }
                   }
                   if (privacyPolic != null) {
                      Iterator iterator = a.a.iterator();
                      while (iterator.hasNext()) {
                         String[] packagesForU = packageManag.getPackagesForUid(iterator.next().intValue());
                         if (packagesForU != null && packagesForU.length > 0) {
                            a.a(packageManag, packagesForU);
                         }
                      }
                      Object[] objArray = null;
                      obj1 = PatchProxy.apply(objArray, objArray, a$a.class, "1");
                      int i1 = (obj1 != patchProxyRe)? obj1.intValue(): e.b("LAST_MAX_UID", i);
                      i1 = i1 + 128;
                      if (i1 <= i) {
                         i = i1;
                      }
                      i1 = 0x2710;
                      int i2 = 0x2710;
                      while (true) {
                         if (i1 > i) {
                            int i3 = i2 + 128;
                            if (i1 < i3) {
                            label_0101 :
                               String[] packagesForU1 = packageManag.getPackagesForUid(i1);
                               if (packagesForU1 != null && packagesForU1.length > 0) {
                                  a.a(packageManag, packagesForU1);
                                  i2 = i1;
                               }
                               i1 = i1 + 1;
                            }else if(PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(i2), objArray, a$a.class, "2")){
                               e.g("LAST_MAX_UID", i2);
                            }
                         }else {
                            goto label_0101 ;
                         }
                      }
                   }
                   uArrayList = new ArrayList(a.b);
                }
             }else if(PatchProxy.isSupport(a.class)){
                obj1 = PatchProxy.applyThreeRefs(uContext, mAppList, Boolean.valueOf(privacyPolic), null, a.class, "2");
                if (obj1 != patchProxyRe) {
                }
             }
             if (!a.b.isEmpty()) {
                uArrayList = new ArrayList(a.b);
             }else {
                PackageManager packageManag1 = uContext.getPackageManager();
                if (mAppList != null) {
                   Iterator iterator1 = mAppList.iterator();
                   while (iterator1.hasNext()) {
                      String str1 = iterator1.next();
                      try{
                         a.b.add(packageManag1.getPackageInfo(str1, 128));
                      }catch(java.lang.Exception e2){
                         e2.printStackTrace();
                         goto label_014e ;
                      }
                   }
                }
                if (privacyPolic != null) {
                   int i4 = 1000;
                   while (i4 <= i) {
                      String[] packagesForU2 = packageManag1.getPackagesForUid(i4);
                      if (packagesForU2 != null && packagesForU2.length > 0) {
                         a.a(packageManag1, packagesForU2);
                      }
                      i4++;
                   }
                }
                uArrayList = new ArrayList(a.b);
             }
             obj = uArrayList;
          }
       }else {
          goto label_0044 ;
       }
       return obj;
    }
    public PrivacyConfig h(){
       a obj = PatchProxy.apply(null, this, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a == null) {
          obj = this.e();
          if (obj != null) {
             this.a = obj.a();
          }
          StringBuilder str = "mPrivacyConfig is null ";
          boolean b = (this.a == null)? true: false;
          f.a("PrivacyManager", str+b);
       }
       return this.a;
    }
    public boolean j(String p0,String p1){
       Object[] obj = PatchProxy.applyTwoRefs(p0, p1, this, j.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = new Object[]{p0,p1};
       return e.a(String.format("hasUserPermission-%s-%s", obj), 0).booleanValue();
    }
    public final boolean k(a p0){
       PrivacyPolicy obj1;
       int i;
       boolean b1;
       boolean b2;
       j oj = j.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, oj, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       a uoa = (p0 != null && p0.a() != null)? 1: null;
       if (!uoa) {
          return false;
       }else {
          uoa = this.e();
          if (uoa != null) {
             obj1 = PatchProxy.apply(null, uoa, a.class, "1");
             if (obj1 != PatchProxyResult.class) {
                i = obj1.intValue();
             }else if(uoa.a() != null){
                i = uoa.a().b();
             }else {
             label_004a :
                i = 0;
             }
          }else {
             goto label_004a ;
          }
          i = (p0.a().b() > i)? 1: 0;
          Iterator obj2 = PatchProxy.applyOneRefs(p0, this, oj, "5");
          if (obj2 != PatchProxyResult.class) {
             b1 = obj2.booleanValue();
          }else {
             obj2 = Collections.singletonList("appList").iterator();
             while (true) {
                if (obj2.hasNext()) {
                   obj1 = p0.a().c(obj2.next());
                   if (obj1 != null) {
                      String[] obj3 = PatchProxy.apply(null, obj1, PrivacyPolicy.class, "9");
                      if (obj3 != PatchProxyResult.class) {
                         b2 = obj3.booleanValue();
                      }else {
                         obj3 = new String[]{"day","hour","launch"};
                         List list = Arrays.asList(obj3);
                         obj1 = obj1.mFrequency;
                         if (obj1 != null) {
                            PrivacyPolicy$Frequency mUnit = obj1.mUnit;
                            if (mUnit != null && list.contains(mUnit)) {
                               b2 = true;
                            }
                         }
                         b2 = false;
                      }
                      if (b2) {
                         b2 = true;
                      label_00bc :
                         if (!b2) {
                            b1 = false;
                         }
                      }
                   }
                   b2 = false;
                   goto label_00bc ;
                }else {
                   b1 = true;
                }
             }
          }
          if (!i || !b1) {
             b = false;
          }
          return b;
       }
    }
    public final boolean m(String p0){
       PrivacyPolicy obj = PatchProxy.applyOneRefs(p0, this, j.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.h().c(p0);
       if (obj != null && obj.mLightMode != null) {
          f.a("PrivacyManager", p0+" isLightMode is true");
          if (q.f(obj.a())) {
             return false;
          }else {
             Iterator iterator = obj.a().iterator();
             while (iterator.hasNext()) {
                String str = iterator.next();
                if (!TextUtils.isEmpty(str) && this.j(p0, str)) {
                   f.a("PrivacyManager", "isValidLightMode hasUserPermission biz =  "+str);
                   return true;
                }
             }
          }
       }
       return false;
    }
    public boolean n(String p0,String p1,String p2,boolean p3){
       if (PatchProxy.isSupport(j.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, j.class, "22");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (this.h().a(p0, p1, p2, p3) && this.t(p0, p3))? true: false;
       return b;
    }
    public void p(Activity p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7,d p8,boolean p9,String p10,b p11){
       String str;
       b$a uoa;
       j c;
       j oj1;
       String str1;
       String str2;
       String str3;
       d uod;
       f uof;
       g og;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p4;
       object oobject5 = p5;
       object oobject6 = p6;
       object oobject7 = p7;
       object oobject8 = p8;
       int b = p9;
       object oobject9 = p10;
       j oj = j.class;
       boolean i = 11;
       int i1 = 1;
       int i2 = 10;
       if (PatchProxy.isSupport(oj)) {
          Object[] objArray = new Object[12];
          objArray[0] = oobject;
          objArray[i1] = oobject1;
          objArray[2] = oobject2;
          objArray[3] = oobject3;
          objArray[4] = oobject4;
          objArray[5] = oobject5;
          objArray[6] = oobject6;
          objArray[7] = oobject7;
          objArray[8] = oobject8;
          objArray[9] = Boolean.valueOf(p9);
          objArray[i2] = oobject9;
          objArray[i] = p11;
          if (PatchProxy.applyVoid(objArray, obj, oj, "16")) {
             return;
          }
       }
       if (("default").equals(oobject1) && TextUtils.isEmpty(p10)) {
          f.b("requestPermissionFromUser", "statKey is invalid");
       }
       if (!j.i()) {
          j.f(p3, p1, p10, p2, 0, 0x21aad, "2", false, false);
          oobject8.d(oobject3, 0x21aad);
          return;
       }else if(!obj.b(oobject1, oobject2, oobject3, b)){
          int i3 = (b)? 0x21aaf: 0x21aae;
          j.f(p3, p1, p10, p2, 0, i3, "2", false, false);
          oobject8.d(oobject3, i3);
          return;
       }else {
          boolean b1 = c.b(p3);
          i = obj.j(oobject3, oobject1);
          if (b1 && (!i && obj.m(oobject3))) {
             obj.s(oobject3, oobject1, i1);
             j.f(p3, p1, p10, p2, 1, 0x21ab8, "2", false, true);
             oobject8.c(oobject3, 0x21ab8);
             return;
          }else if(i && b1){
             j.f(p3, p1, p10, p2, 1, 0x21ab4, "2", false, true);
             oobject8.c(oobject3, 0x21ab4);
          }else if(!obj.d(oobject3, b, oobject1)){
             j.f(p3, p1, p10, p2, 0, 0x21ab2, "2", true, false);
             oobject8.a(oobject3);
          }else {
             b.f(oobject3, System.currentTimeMillis(), oobject1);
             if (PatchProxy.isSupport(oj)) {
                Object[] objArray1 = new Object[11];
                objArray1[0] = oobject;
                objArray1[i1] = oobject4;
                objArray1[2] = oobject5;
                objArray1[3] = oobject6;
                objArray1[4] = oobject7;
                objArray1[5] = oobject8;
                objArray1[6] = oobject3;
                objArray1[7] = oobject1;
                objArray1[8] = oobject2;
                objArray1[9] = oobject9;
                objArray1[i2] = p11;
                if (!PatchProxy.applyVoid(objArray1, obj, oj, "34")) {
                }
             }else {
             }
          }
          return;
       }
    }
    public final void r(String p0){
       j oj = j.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oj, "3")) {
          return;
       }
       String str = "PrivacyManager";
       String str1 = "sdkConfig = "+p0;
       try{
          f.a(str, str1);
          if (TextUtils.isEmpty(p0)) {
             f.b("PrivacyManager", "sdkConfig is empty");
             return;
          }else {
             a uoa = GsonUtil.fromJson(p0, a.class);
             if (!this.k(uoa)) {
                f.b("PrivacyManager", "sdkConfig is illegal sdkConfig = "+p0);
                return;
             }else if(PatchProxy.applyVoidOneRefs(p0, null, b.class, "8")){
                e.i("privacyConfig", p0);
             }
             _monitor_enter(oj);
             this.a = uoa.a();
             this.b = null;
             _monitor_exit(oj);
          }
       }catch(java.lang.Exception e6){
          f.b("PrivacyManager", e6.getMessage());
       }
       return;
    }
    public void s(String p0,String p1,boolean p2){
       if (PatchProxy.isSupport(j.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, j.class, "36")) {
          return;
       }
       Object[] objArray = new Object[]{p0,p1};
       e.f(String.format("hasUserPermission-%s-%s", objArray), p2);
       return;
    }
    public final boolean t(String p0,boolean p1){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, oj, "32");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       PrivacyPolicy privacyPolic = this.h().c(p0);
       boolean b = true;
       if (!p1) {
          if (privacyPolic != null) {
             Object obj1 = PatchProxy.apply(null, privacyPolic, PrivacyPolicy.class, "5");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else {
                long l = b.a(privacyPolic.mPermission);
                obj1 = (!l)? 1: 0;
                int i = b.d(privacyPolic.mPermission);
                l = ((System.currentTimeMillis() - l) - privacyPolic.b() < 0)? 1: 0;
                privacyPolic = privacyPolic.mFrequency;
                PrivacyPolicy$Frequency mValue = (privacyPolic != null)? privacyPolic.mValue: null;
                mValue = (i < mValue)? 1: 0;
                if (!obj1 && (!l || mValue)) {
                   b1 = true;
                }else {
                   b1 = false;
                }
             }
             if (!b1) {
             label_007c :
                b = false;
             }
          }else {
             goto label_007c ;
          }
       }
       return b;
    }
}
