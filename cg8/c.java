package cg8.c;
import cg8.b;
import androidx.room.RoomDatabase;
import java.lang.Object;
import gg8.b;
import gg8.a$a;
import cg8.c$h;
import cg8.c$i;
import cg8.c$j;
import cg8.c$k;
import cg8.c$l;
import cg8.c$m;
import cg8.c$n;
import cg8.c$o;
import cg8.c$p;
import cg8.c$a;
import cg8.c$b;
import cg8.c$c;
import cg8.c$d;
import cg8.c$e;
import cg8.c$f;
import cg8.c$g;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import v2.o0;
import a3.e;
import android.os.CancellationSignal;
import android.database.Cursor;
import x2.c;
import x2.b;
import java.util.ArrayList;
import com.mini.packagemanager.model.SubPackageModel;
import com.mini.packagemanager.model.BaseFileModel;
import com.mini.packagemanager.model.FrameworkModel;
import com.mini.packagemanager.model.MiniAppPackageInfo;
import cg8.a;
import com.mini.packagemanager.model.MainPackageModel;
import a3.f;
import v2.q0;
import java.lang.StringBuilder;
import x2.f;
import a3.d;
import com.mini.packagemanager.model.MiniAppDetailInfo;
import com.mini.packagemanager.model.MiniAppNetDomain;
import zi8.x0;
import java.util.Iterator;
import v2.p;
import java.lang.Iterable;
import v2.q;
import gg8.a;
import java.util.Objects;
import com.google.gson.Gson;
import zi8.d0;
import java.lang.RuntimeException;

public final class c implements b	// class@000416
{
    public final RoomDatabase a;
    public final q b;
    public final b c;
    public final q d;
    public final q e;
    public final a$a f;
    public final q g;
    public final q h;
    public final p i;
    public final p j;
    public final q0 k;
    public final q0 l;
    public final q0 m;
    public final q0 n;
    public final q0 o;
    public final q0 p;
    public final q0 q;
    public final q0 r;
    public final q0 s;

    public void c(RoomDatabase p0){
       super();
       this.c = new b();
       this.f = new a$a();
       this.a = p0;
       this.b = new c$h(this, p0);
       this.d = new c$i(this, p0);
       this.e = new c$j(this, p0);
       this.g = new c$k(this, p0);
       this.h = new c$l(this, p0);
       this.i = new c$m(this, p0);
       this.j = new c$n(this, p0);
       this.k = new c$o(this, p0);
       this.l = new c$p(this, p0);
       this.m = new c$a(this, p0);
       this.n = new c$b(this, p0);
       this.o = new c$c(this, p0);
       this.p = new c$d(this, p0);
       this.q = new c$e(this, p0);
       this.r = new c$f(this, p0);
       this.s = new c$g(this, p0);
    }
    public List A(String p0,int p1,String p2){
       o0 obj;
       boolean b;
       c uoc = this;
       String str = p0;
       String str1 = p2;
       if (PatchProxy.isSupport(c.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, c.class, "27");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = 3;
       obj = o0.b("SELECT `SubPackageModel`.`versionCode` AS `versionCode`, `SubPackageModel`.`versionName` AS `versionName`, `SubPackageModel`.`size` AS `size`, `SubPackageModel`.`md5` AS `md5`, `SubPackageModel`.`desc` AS `desc`, `SubPackageModel`.`updateTime` AS `updateTime`, `SubPackageModel`.`url` AS `url`, `SubPackageModel`.`cdnURLs` AS `cdnURLs`, `SubPackageModel`.`appId` AS `appId`, `SubPackageModel`.`root` AS `root`, `SubPackageModel`.`releaseCode` AS `releaseCode`, `SubPackageModel`.`buildEnv` AS `buildEnv`, `SubPackageModel`.`independent` AS `independent` FROM SubPackageModel WHERE appId = ? AND releaseCode = ? AND buildEnv = ?", i);
       int i1 = 1;
       if (!str) {
          obj.bindNull(i1);
       }else {
          obj.bindString(i1, str);
       }
       obj.bindLong(2, (long)p1);
       if (!str1) {
          obj.bindNull(i);
       }else {
          obj.bindString(i, str1);
       }
       uoc.a.d();
       Cursor uCursor = c.b(uoc.a, obj, false, null);
       int i2 = b.e(uCursor, "versionCode");
       int i3 = b.e(uCursor, "versionName");
       int i4 = b.e(uCursor, "size");
       int i5 = b.e(uCursor, "md5");
       int i6 = b.e(uCursor, "desc");
       int i7 = b.e(uCursor, "updateTime");
       int i8 = b.e(uCursor, "url");
       int i9 = b.e(uCursor, "cdnURLs");
       int i10 = b.e(uCursor, "appId");
       int i11 = b.e(uCursor, "root");
       int i12 = b.e(uCursor, "releaseCode");
       i1 = b.e(uCursor, "buildEnv");
       o0 oo0 = obj;
       p1 = b.e(uCursor, "independent");
       ArrayList uArrayList = new ArrayList(uCursor.getCount());
       while (uCursor.moveToNext()) {
          SubPackageModel subPackageMo = new SubPackageModel();
          ArrayList uArrayList1 = uArrayList;
          subPackageMo.versionCode = uCursor.getInt(i2);
          subPackageMo.versionName = uCursor.getString(i3);
          int i13 = i2;
          subPackageMo.size = uCursor.getLong(i4);
          subPackageMo.md5 = uCursor.getString(i5);
          subPackageMo.desc = uCursor.getString(i6);
          subPackageMo.updateTime = uCursor.getLong(i7);
          subPackageMo.url = uCursor.getString(i8);
          subPackageMo.cdnUrls = uoc.c.b(uCursor.getString(i9));
          subPackageMo.appId = uCursor.getString(i10);
          subPackageMo.root = uCursor.getString(i11);
          subPackageMo.releaseCode = uCursor.getInt(i12);
          subPackageMo.buildEnv = uCursor.getString(i1);
          i2 = p1;
          b = (uCursor.getInt(i2))? true: false;
          subPackageMo.independent = b;
          uArrayList = uArrayList1;
          uArrayList.add(subPackageMo);
          p1 = i2;
          i2 = i13;
       }
       uCursor.close();
       oo0.release();
       return uArrayList;
    }
    public List B(){
       Object[] objArray = null;
       o0 obj = PatchProxy.apply(objArray, this, c.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = o0.b("SELECT `FrameworkModel`.`versionCode` AS `versionCode`, `FrameworkModel`.`versionName` AS `versionName`, `FrameworkModel`.`size` AS `size`, `FrameworkModel`.`md5` AS `md5`, `FrameworkModel`.`desc` AS `desc`, `FrameworkModel`.`updateTime` AS `updateTime`, `FrameworkModel`.`url` AS `url`, `FrameworkModel`.`cdnURLs` AS `cdnURLs`, `FrameworkModel`.`downloadPriority` AS `downloadPriority` FROM FrameworkModel", 0);
       this.a.d();
       Cursor uCursor = c.b(this.a, obj, 0, objArray);
       int i = b.e(uCursor, "versionCode");
       int i1 = b.e(uCursor, "versionName");
       int i2 = b.e(uCursor, "size");
       int i3 = b.e(uCursor, "md5");
       int i4 = b.e(uCursor, "desc");
       int i5 = b.e(uCursor, "updateTime");
       int i6 = b.e(uCursor, "url");
       int i7 = b.e(uCursor, "cdnURLs");
       int i8 = b.e(uCursor, "downloadPriority");
       ArrayList uArrayList = new ArrayList(uCursor.getCount());
       while (uCursor.moveToNext()) {
          FrameworkModel uFrameworkMo = new FrameworkModel();
          uFrameworkMo.versionCode = uCursor.getInt(i);
          uFrameworkMo.versionName = uCursor.getString(i1);
          uFrameworkMo.size = uCursor.getLong(i2);
          uFrameworkMo.md5 = uCursor.getString(i3);
          uFrameworkMo.desc = uCursor.getString(i4);
          uFrameworkMo.updateTime = uCursor.getLong(i5);
          uFrameworkMo.url = uCursor.getString(i6);
          uFrameworkMo.cdnUrls = this.c.b(uCursor.getString(i7));
          uFrameworkMo.downloadPriority = uCursor.getString(i8);
          uArrayList.add(uFrameworkMo);
       }
       uCursor.close();
       obj.release();
       return uArrayList;
    }
    public void C(MiniAppPackageInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "13")) {
          return;
       }
       this.a.e();
       a.d(this, p0);
       this.a.C();
       this.a.k();
       return;
    }
    public List D(String p0){
       ArrayList obj = this;
       Object obj1 = p0;
       o0 obj2 = PatchProxy.applyOneRefs(obj1, obj, c.class, "37");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       int i = 1;
       obj2 = o0.b("SELECT `MainPackageModel`.`versionCode` AS `versionCode`, `MainPackageModel`.`versionName` AS `versionName`, `MainPackageModel`.`size` AS `size`, `MainPackageModel`.`md5` AS `md5`, `MainPackageModel`.`desc` AS `desc`, `MainPackageModel`.`updateTime` AS `updateTime`, `MainPackageModel`.`url` AS `url`, `MainPackageModel`.`cdnURLs` AS `cdnURLs`, `MainPackageModel`.`appId` AS `appId`, `MainPackageModel`.`buildEnv` AS `buildEnv`, `MainPackageModel`.`frameworkVersionCode` AS `frameworkVersionCode`, `MainPackageModel`.`releaseCode` AS `releaseCode`, `MainPackageModel`.`compilerVersion` AS `compilerVersion`, `MainPackageModel`.`ws` AS `ws` FROM MainPackageModel WHERE buildEnv = ?", i);
       if (obj1 == null) {
          obj2.bindNull(i);
       }else {
          obj2.bindString(i, obj1);
       }
       obj.a.d();
       Cursor uCursor = c.b(obj.a, obj2, false, null);
       int i1 = b.e(uCursor, "versionCode");
       int i2 = b.e(uCursor, "versionName");
       int i3 = b.e(uCursor, "size");
       int i4 = b.e(uCursor, "md5");
       int i5 = b.e(uCursor, "desc");
       int i6 = b.e(uCursor, "updateTime");
       int i7 = b.e(uCursor, "url");
       int i8 = b.e(uCursor, "cdnURLs");
       int i9 = b.e(uCursor, "appId");
       int i10 = b.e(uCursor, "buildEnv");
       int i11 = b.e(uCursor, "frameworkVersionCode");
       int i12 = b.e(uCursor, "releaseCode");
       o0 oo0 = obj2;
       int i13 = b.e(uCursor, "ws");
       int i14 = b.e(uCursor, "compilerVersion");
       ArrayList uArrayList = new ArrayList(uCursor.getCount());
       while (uCursor.moveToNext()) {
          MainPackageModel mainPackageM = new MainPackageModel();
          mainPackageM.versionCode = uCursor.getInt(i1);
          mainPackageM.versionName = uCursor.getString(i2);
          int i15 = i11;
          mainPackageM.size = uCursor.getLong(i3);
          mainPackageM.md5 = uCursor.getString(i4);
          mainPackageM.desc = uCursor.getString(i5);
          mainPackageM.updateTime = uCursor.getLong(i6);
          mainPackageM.url = uCursor.getString(i7);
          mainPackageM.cdnUrls = obj.c.b(uCursor.getString(i8));
          mainPackageM.appId = uCursor.getString(i9);
          mainPackageM.buildEnv = uCursor.getString(i10);
          mainPackageM.frameworkVersionCode = uCursor.getInt(i15);
          i11 = i12;
          mainPackageM.releaseCode = uCursor.getInt(i11);
          i12 = i14;
          mainPackageM.compilerVersion = uCursor.getString(i12);
          i1 = i13;
          mainPackageM.ws = uCursor.getString(i1);
          obj = uArrayList;
          obj.add(mainPackageM);
          uArrayList = obj;
          int i16 = this;
       }
       uCursor.close();
       oo0.release();
       return uArrayList;
    }
    public void E(){
       if (PatchProxy.applyVoid(null, this, c.class, "22")) {
          return;
       }
       this.a.d();
       f uof = this.p.a();
       this.a.e();
       uof.executeUpdateDelete();
       this.a.C();
       this.a.k();
       this.p.f(uof);
       return;
    }
    public void F(String[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "38")) {
          return;
       }
       this.a.d();
       StringBuilder str = f.b()+"DELETE FROM SubPackageModel WHERE appId IN \(";
       f.a(str, p0.length);
       f uof = this.a.h(str+"\)");
       int len = p0.length;
       int i1 = 1;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = p0[i];
          if (oobject == null) {
             uof.bindNull(i1);
          }else {
             uof.bindString(i1, oobject);
          }
          i1 = i1 + 1;
       }
       this.a.e();
       uof.executeUpdateDelete();
       this.a.C();
       this.a.k();
       return;
    }
    public void G(){
       if (PatchProxy.applyVoid(null, this, c.class, "23")) {
          return;
       }
       this.a.d();
       f uof = this.q.a();
       this.a.e();
       uof.executeUpdateDelete();
       this.a.C();
       this.a.k();
       this.q.f(uof);
       return;
    }
    public MiniAppDetailInfo H(String p0){
       int i20;
       MiniAppNetDomain miniAppNetDo;
       MiniAppDetailInfo miniAppDetai;
       Object obj = this;
       MiniAppDetailInfo obj1 = p0;
       o0 obj2 = PatchProxy.applyOneRefs(obj1, obj, c.class, "32");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       boolean i = 1;
       obj2 = o0.b("SELECT `request`, `uploadFile`, `downloadFile`, `socket`, `udp`, `MiniAppDetailInfo`.`appId` AS `appId`, `MiniAppDetailInfo`.`name` AS `name`, `MiniAppDetailInfo`.`icon` AS `icon`, `MiniAppDetailInfo`.`developerName` AS `developerName`, `MiniAppDetailInfo`.`desc` AS `desc`, `MiniAppDetailInfo`.`isIntegrated` AS `isIntegrated`, `MiniAppDetailInfo`.`menuBlocklist` AS `menuBlocklist`, `MiniAppDetailInfo`.`scopeName` AS `scopeName`, `MiniAppDetailInfo`.`webViewDomains` AS `webViewDomains`, `MiniAppDetailInfo`.`chatTargetId` AS `chatTargetId`, `MiniAppDetailInfo`.`isInternal` AS `isInternal`, `MiniAppDetailInfo`.`appEnableGuide` AS `appEnableGuide`, `MiniAppDetailInfo`.`canShareExternal` AS `canShareExternal`, `MiniAppDetailInfo`.`shareExternalSubbiz` AS `shareExternalSubbiz`, `MiniAppDetailInfo`.`apiBlacklist` AS `apiBlacklist` FROM MiniAppDetailInfo WHERE appId = ?", i);
       if (obj1 == null) {
          obj2.bindNull(i);
       }else {
          obj2.bindString(i, obj1);
       }
       obj.a.d();
       Cursor uCursor = c.b(obj.a, obj2, false, null);
       int i1 = b.e(uCursor, "request");
       int i2 = b.e(uCursor, "uploadFile");
       int i3 = b.e(uCursor, "downloadFile");
       int i4 = b.e(uCursor, "socket");
       int i5 = b.e(uCursor, "udp");
       int i6 = b.e(uCursor, "appId");
       int i7 = b.e(uCursor, "name");
       int i8 = b.e(uCursor, "icon");
       int i9 = b.e(uCursor, "developerName");
       int i10 = b.e(uCursor, "desc");
       i = b.e(uCursor, "isIntegrated");
       int i11 = b.e(uCursor, "menuBlocklist");
       int i12 = b.e(uCursor, "scopeName");
       boolean i13 = b.e(uCursor, "webViewDomains");
       o0 oo0 = obj2;
       int i14 = b.e(uCursor, "chatTargetId");
       int i15 = b.e(uCursor, "isInternal");
       int i16 = b.e(uCursor, "appEnableGuide");
       int i17 = b.e(uCursor, "canShareExternal");
       int i18 = b.e(uCursor, "shareExternalSubbiz");
       int i19 = b.e(uCursor, "apiBlacklist");
       if (uCursor.moveToFirst()) {
          if (uCursor.isNull(i1) && (uCursor.isNull(i2) && (uCursor.isNull(i3) && (!uCursor.isNull(i4) || !uCursor.isNull(i5))))) {
             i20 = i19;
             miniAppNetDo = new MiniAppNetDomain();
             miniAppNetDo.requests = x0.b(uCursor.getString(i1));
             miniAppNetDo.uploadFiles = x0.b(uCursor.getString(i2));
             miniAppNetDo.downloadFiles = x0.b(uCursor.getString(i3));
             miniAppNetDo.sockets = x0.b(uCursor.getString(i4));
             miniAppNetDo.udps = x0.b(uCursor.getString(i5));
          }else {
             i20 = i19;
             miniAppNetDo = null;
          }
          obj1 = new MiniAppDetailInfo();
          obj1.appId = uCursor.getString(i6);
          obj1.appName = uCursor.getString(i7);
          obj1.appIcon = uCursor.getString(i8);
          obj1.developerName = uCursor.getString(i9);
          obj1.desc = uCursor.getString(i10);
          i = (uCursor.getInt(i))? true: false;
          obj1.isIntegrated = i;
          obj1.menuInvisibleItems = x0.b(uCursor.getString(i11));
          obj1.scopeNames = x0.b(uCursor.getString(i12));
          obj1.webViewDomains = x0.b(uCursor.getString(i13));
          obj1.chatTargetId = uCursor.getString(i14);
          i13 = (uCursor.getInt(i15))? true: false;
          obj1.isInternal = i13;
          i13 = (uCursor.getInt(i16))? true: false;
          obj1.appEnableGuide = i13;
          i = (uCursor.getInt(i17))? true: false;
          obj1.canShareExternal = i;
          obj1.shareExternalSubbiz = uCursor.getString(i18);
          obj1.apiBlacklist = uCursor.getString(i20);
          obj1.netDomain = miniAppNetDo;
          miniAppDetai = obj1;
       }else {
          miniAppDetai = null;
       }
       uCursor.close();
       oo0.release();
       return miniAppDetai;
    }
    public List I(){
       Object obj = this;
       Object[] objArray = null;
       ArrayList obj1 = PatchProxy.apply(objArray, obj, c.class, "36");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       o0 oo0 = o0.b("SELECT `MainPackageModel`.`versionCode` AS `versionCode`, `MainPackageModel`.`versionName` AS `versionName`, `MainPackageModel`.`size` AS `size`, `MainPackageModel`.`md5` AS `md5`, `MainPackageModel`.`desc` AS `desc`, `MainPackageModel`.`updateTime` AS `updateTime`, `MainPackageModel`.`url` AS `url`, `MainPackageModel`.`cdnURLs` AS `cdnURLs`, `MainPackageModel`.`appId` AS `appId`, `MainPackageModel`.`buildEnv` AS `buildEnv`, `MainPackageModel`.`frameworkVersionCode` AS `frameworkVersionCode`, `MainPackageModel`.`releaseCode` AS `releaseCode`, `MainPackageModel`.`compilerVersion` AS `compilerVersion`, `MainPackageModel`.`ws` AS `ws` FROM MainPackageModel", 0);
       obj.a.d();
       Cursor uCursor = c.b(obj.a, oo0, 0, objArray);
       int i = b.e(uCursor, "versionCode");
       int i1 = b.e(uCursor, "versionName");
       int i2 = b.e(uCursor, "size");
       int i3 = b.e(uCursor, "md5");
       int i4 = b.e(uCursor, "desc");
       int i5 = b.e(uCursor, "updateTime");
       int i6 = b.e(uCursor, "url");
       int i7 = b.e(uCursor, "cdnURLs");
       int i8 = b.e(uCursor, "appId");
       int i9 = b.e(uCursor, "buildEnv");
       int i10 = b.e(uCursor, "frameworkVersionCode");
       int i11 = b.e(uCursor, "releaseCode");
       o0 oo01 = oo0;
       int i12 = b.e(uCursor, "ws");
       int i13 = b.e(uCursor, "compilerVersion");
       ArrayList uArrayList = new ArrayList(uCursor.getCount());
       while (uCursor.moveToNext()) {
          MainPackageModel mainPackageM = new MainPackageModel();
          mainPackageM.versionCode = uCursor.getInt(i);
          mainPackageM.versionName = uCursor.getString(i1);
          mainPackageM.size = uCursor.getLong(i2);
          mainPackageM.md5 = uCursor.getString(i3);
          mainPackageM.desc = uCursor.getString(i4);
          mainPackageM.updateTime = uCursor.getLong(i5);
          mainPackageM.url = uCursor.getString(i6);
          mainPackageM.cdnUrls = obj.c.b(uCursor.getString(i7));
          mainPackageM.appId = uCursor.getString(i8);
          mainPackageM.buildEnv = uCursor.getString(i9);
          mainPackageM.frameworkVersionCode = uCursor.getInt(i10);
          mainPackageM.releaseCode = uCursor.getInt(i11);
          i1 = i13;
          mainPackageM.compilerVersion = uCursor.getString(i1);
          int i14 = i12;
          mainPackageM.ws = uCursor.getString(i14);
          obj1 = uArrayList;
          obj1.add(mainPackageM);
          int i15 = i14;
          uArrayList = obj1;
          i12 = i15;
       }
       uCursor.close();
       oo01.release();
       return uArrayList;
    }
    public List J(){
       int i20;
       MiniAppNetDomain obj = this;
       Object[] objArray = null;
       MiniAppDetailInfo obj1 = PatchProxy.apply(objArray, obj, c.class, "33");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       o0 oo0 = o0.b("SELECT `request`, `uploadFile`, `downloadFile`, `socket`, `udp`, `MiniAppDetailInfo`.`appId` AS `appId`, `MiniAppDetailInfo`.`name` AS `name`, `MiniAppDetailInfo`.`icon` AS `icon`, `MiniAppDetailInfo`.`developerName` AS `developerName`, `MiniAppDetailInfo`.`desc` AS `desc`, `MiniAppDetailInfo`.`isIntegrated` AS `isIntegrated`, `MiniAppDetailInfo`.`menuBlocklist` AS `menuBlocklist`, `MiniAppDetailInfo`.`scopeName` AS `scopeName`, `MiniAppDetailInfo`.`webViewDomains` AS `webViewDomains`, `MiniAppDetailInfo`.`chatTargetId` AS `chatTargetId`, `MiniAppDetailInfo`.`isInternal` AS `isInternal`, `MiniAppDetailInfo`.`appEnableGuide` AS `appEnableGuide`, `MiniAppDetailInfo`.`canShareExternal` AS `canShareExternal`, `MiniAppDetailInfo`.`shareExternalSubbiz` AS `shareExternalSubbiz`, `MiniAppDetailInfo`.`apiBlacklist` AS `apiBlacklist` FROM MiniAppDetailInfo", 0);
       obj.a.d();
       Cursor uCursor = c.b(obj.a, oo0, 0, objArray);
       int i = b.e(uCursor, "request");
       boolean i1 = b.e(uCursor, "uploadFile");
       int i2 = b.e(uCursor, "downloadFile");
       int i3 = b.e(uCursor, "socket");
       int i4 = b.e(uCursor, "udp");
       int i5 = b.e(uCursor, "appId");
       int i6 = b.e(uCursor, "name");
       int i7 = b.e(uCursor, "icon");
       int i8 = b.e(uCursor, "developerName");
       int i9 = b.e(uCursor, "desc");
       int i10 = b.e(uCursor, "isIntegrated");
       boolean i11 = b.e(uCursor, "menuBlocklist");
       int i12 = b.e(uCursor, "scopeName");
       o0 oo01 = oo0;
       int i13 = b.e(uCursor, "chatTargetId");
       int i14 = b.e(uCursor, "isInternal");
       int i15 = b.e(uCursor, "appEnableGuide");
       int i16 = b.e(uCursor, "canShareExternal");
       int i17 = b.e(uCursor, "shareExternalSubbiz");
       int i18 = b.e(uCursor, "apiBlacklist");
       int i19 = b.e(uCursor, "webViewDomains");
       ArrayList uArrayList = new ArrayList(uCursor.getCount());
       while (uCursor.moveToNext()) {
          if (uCursor.isNull(i) && (uCursor.isNull(i1) && (uCursor.isNull(i2) && (!uCursor.isNull(i3) || !uCursor.isNull(i4))))) {
             obj = new MiniAppNetDomain();
             i20 = i;
             obj.requests = x0.b(uCursor.getString(i));
             obj.uploadFiles = x0.b(uCursor.getString(i1));
             obj.downloadFiles = x0.b(uCursor.getString(i2));
             obj.sockets = x0.b(uCursor.getString(i3));
             obj.udps = x0.b(uCursor.getString(i4));
          }else {
             i20 = i;
             obj = null;
          }
          obj1 = new MiniAppDetailInfo();
          int i21 = i1;
          obj1.appId = uCursor.getString(i5);
          obj1.appName = uCursor.getString(i6);
          obj1.appIcon = uCursor.getString(i7);
          obj1.developerName = uCursor.getString(i8);
          obj1.desc = uCursor.getString(i9);
          i1 = (uCursor.getInt(i10))? true: false;
          obj1.isIntegrated = i1;
          obj1.menuInvisibleItems = x0.b(uCursor.getString(i11));
          obj1.scopeNames = x0.b(uCursor.getString(i12));
          i1 = i19;
          int i22 = i11;
          obj1.webViewDomains = x0.b(uCursor.getString(i1));
          i11 = i13;
          i13 = i12;
          obj1.chatTargetId = uCursor.getString(i11);
          i12 = i14;
          if (uCursor.getInt(i12)) {
             i14 = i11;
             i11 = true;
          }else {
             i14 = i11;
             i11 = false;
          }
          obj1.isInternal = i11;
          i11 = i15;
          if (uCursor.getInt(i11)) {
             i15 = i11;
             i11 = true;
          }else {
             i15 = i11;
             i11 = false;
          }
          obj1.appEnableGuide = i11;
          i11 = i16;
          if (uCursor.getInt(i11)) {
             i16 = i11;
             i11 = true;
          }else {
             i16 = i11;
             i11 = false;
          }
          obj1.canShareExternal = i11;
          i11 = i17;
          obj1.shareExternalSubbiz = uCursor.getString(i11);
          i12 = i18;
          i18 = i11;
          obj1.apiBlacklist = uCursor.getString(i12);
          obj1.netDomain = obj;
          uArrayList.add(obj1);
          i19 = i1;
          i1 = i21;
          i = i20;
          i11 = i22;
          int i23 = i18;
          i12 = i13;
          i13 = i14;
          i14 = i12;
          i17 = i23;
       }
       uCursor.close();
       oo01.release();
       return uArrayList;
    }
    public void K(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "39")) {
          return;
       }
       this.a.d();
       StringBuilder str = f.b()+"DELETE FROM FrameworkModel WHERE versionCode IN \(";
       f.a(str, p0.size());
       f uof = this.a.h(str+"\)");
       Iterator iterator = p0.iterator();
       int i = 1;
       while (iterator.hasNext()) {
          Integer integer = iterator.next();
          if (integer == null) {
             uof.bindNull(i);
          }else {
             uof.bindLong(i, (long)integer.intValue());
          }
          i = i + 1;
       }
       this.a.e();
       uof.executeUpdateDelete();
       this.a.C();
       this.a.k();
       return;
    }
    public void L(MainPackageModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "10")) {
          return;
       }
       this.a.d();
       this.a.e();
       this.j.h(p0);
       this.a.C();
       this.a.k();
       return;
    }
    public void M(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "11")) {
          return;
       }
       this.a.d();
       this.a.e();
       this.j.i(p0);
       this.a.C();
       this.a.k();
       return;
    }
    public void N(FrameworkModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "3")) {
          return;
       }
       this.a.d();
       this.a.e();
       this.d.i(p0);
       this.a.C();
       this.a.k();
       return;
    }
    public void O(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "17")) {
          return;
       }
       this.a.d();
       f uof = this.k.a();
       if (p0 == null) {
          uof.bindNull(1);
       }else {
          uof.bindString(1, p0);
       }
       this.a.e();
       uof.executeUpdateDelete();
       this.a.C();
       this.a.k();
       this.k.f(uof);
       return;
    }
    public void a(String p0,int p1,String p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, c.class, "18")) {
          return;
       }
       this.a.d();
       f uof = this.l.a();
       int i = 1;
       if (p0 == null) {
          uof.bindNull(i);
       }else {
          uof.bindString(i, p0);
       }
       uof.bindLong(2, (long)p1);
       int i1 = 3;
       if (p2 == null) {
          uof.bindNull(i1);
       }else {
          uof.bindString(i1, p2);
       }
       this.a.e();
       uof.executeUpdateDelete();
       this.a.C();
       this.a.k();
       this.l.f(uof);
       return;
    }
    public void b(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "20")) {
          return;
       }
       this.a.d();
       f uof = this.n.a();
       uof.bindLong(1, (long)p0);
       this.a.e();
       uof.executeUpdateDelete();
       this.a.C();
       this.a.k();
       this.n.f(uof);
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, c.class, "25")) {
          return;
       }
       this.a.d();
       f uof = this.s.a();
       this.a.e();
       uof.executeUpdateDelete();
       this.a.C();
       this.a.k();
       this.s.f(uof);
       return;
    }
    public void d(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.a.d();
       this.a.e();
       this.b.h(p0);
       this.a.C();
       this.a.k();
       return;
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "24")) {
          return;
       }
       this.a.d();
       f uof = this.r.a();
       if (p0 == null) {
          uof.bindNull(1);
       }else {
          uof.bindString(1, p0);
       }
       this.a.e();
       uof.executeUpdateDelete();
       this.a.C();
       this.a.k();
       this.r.f(uof);
       return;
    }
    public void f(SubPackageModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       this.a.d();
       this.a.e();
       this.b.i(p0);
       this.a.C();
       this.a.k();
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, c.class, "19")) {
          return;
       }
       this.a.d();
       f uof = this.m.a();
       this.a.e();
       uof.executeUpdateDelete();
       this.a.C();
       this.a.k();
       this.m.f(uof);
       return;
    }
    public MiniAppPackageInfo getMiniAppInfo(String p0,int p1,String p2){
       if (PatchProxy.isSupport(c.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, c.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.a.e();
       this.a.C();
       this.a.k();
       return a.c(this, p0, p1, p2);
    }
    public void h(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "40")) {
          return;
       }
       this.a.d();
       StringBuilder str = f.b()+"DELETE FROM BackupMiniAppPackageInfo WHERE appId IN \(";
       f.a(str, p0.size());
       f uof = this.a.h(str+"\)");
       Iterator iterator = p0.iterator();
       int i = 1;
       while (iterator.hasNext()) {
          String str1 = iterator.next();
          if (str1 == null) {
             uof.bindNull(i);
          }else {
             uof.bindString(i, str1);
          }
          i = i + 1;
       }
       this.a.e();
       uof.executeUpdateDelete();
       this.a.C();
       this.a.k();
       return;
    }
    public void i(){
       a.b(this);
    }
    public MainPackageModel j(String p0,int p1,String p2){
       o0 obj;
       MainPackageModel mainPackageM1;
       c uoc = this;
       String str = p0;
       String str1 = p2;
       if (PatchProxy.isSupport(c.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, c.class, "34");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = 3;
       obj = o0.b("SELECT `MainPackageModel`.`versionCode` AS `versionCode`, `MainPackageModel`.`versionName` AS `versionName`, `MainPackageModel`.`size` AS `size`, `MainPackageModel`.`md5` AS `md5`, `MainPackageModel`.`desc` AS `desc`, `MainPackageModel`.`updateTime` AS `updateTime`, `MainPackageModel`.`url` AS `url`, `MainPackageModel`.`cdnURLs` AS `cdnURLs`, `MainPackageModel`.`appId` AS `appId`, `MainPackageModel`.`buildEnv` AS `buildEnv`, `MainPackageModel`.`frameworkVersionCode` AS `frameworkVersionCode`, `MainPackageModel`.`releaseCode` AS `releaseCode`, `MainPackageModel`.`compilerVersion` AS `compilerVersion`, `MainPackageModel`.`ws` AS `ws` FROM MainPackageModel WHERE appId = ? AND releaseCode = ? AND buildEnv = ?", i);
       int i1 = 1;
       if (!str) {
          obj.bindNull(i1);
       }else {
          obj.bindString(i1, str);
       }
       obj.bindLong(2, (long)p1);
       if (!str1) {
          obj.bindNull(i);
       }else {
          obj.bindString(i, str1);
       }
       uoc.a.d();
       Cursor uCursor = c.b(uoc.a, obj, false, null);
       int i2 = b.e(uCursor, "versionCode");
       int i3 = b.e(uCursor, "versionName");
       int i4 = b.e(uCursor, "size");
       int i5 = b.e(uCursor, "md5");
       int i6 = b.e(uCursor, "desc");
       int i7 = b.e(uCursor, "updateTime");
       int i8 = b.e(uCursor, "url");
       int i9 = b.e(uCursor, "cdnURLs");
       int i10 = b.e(uCursor, "appId");
       int i11 = b.e(uCursor, "buildEnv");
       int i12 = b.e(uCursor, "frameworkVersionCode");
       int i13 = b.e(uCursor, "releaseCode");
       i1 = b.e(uCursor, "compilerVersion");
       o0 oo0 = obj;
       int i14 = b.e(uCursor, "ws");
       if (uCursor.moveToFirst()) {
          MainPackageModel mainPackageM = new MainPackageModel();
          mainPackageM.versionCode = uCursor.getInt(i2);
          mainPackageM.versionName = uCursor.getString(i3);
          mainPackageM.size = uCursor.getLong(i4);
          mainPackageM.md5 = uCursor.getString(i5);
          mainPackageM.desc = uCursor.getString(i6);
          mainPackageM.updateTime = uCursor.getLong(i7);
          mainPackageM.url = uCursor.getString(i8);
          mainPackageM.cdnUrls = uoc.c.b(uCursor.getString(i9));
          mainPackageM.appId = uCursor.getString(i10);
          mainPackageM.buildEnv = uCursor.getString(i11);
          mainPackageM.frameworkVersionCode = uCursor.getInt(i12);
          mainPackageM.releaseCode = uCursor.getInt(i13);
          mainPackageM.compilerVersion = uCursor.getString(i1);
          mainPackageM.ws = uCursor.getString(i14);
          mainPackageM1 = mainPackageM;
       }else {
          mainPackageM1 = null;
       }
       uCursor.close();
       oo0.release();
       return mainPackageM1;
    }
    public void k(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "5")) {
          return;
       }
       this.a.d();
       this.a.e();
       this.e.h(p0);
       this.a.C();
       this.a.k();
       return;
    }
    public void l(SubPackageModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "8")) {
          return;
       }
       this.a.d();
       this.a.e();
       this.i.h(p0);
       this.a.C();
       this.a.k();
       return;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, c.class, "21")) {
          return;
       }
       this.a.d();
       f uof = this.o.a();
       this.a.e();
       uof.executeUpdateDelete();
       this.a.C();
       this.a.k();
       this.o.f(uof);
       return;
    }
    public List n(String p0,String p1){
       Object obj = this;
       ArrayList obj1 = p0;
       Cursor obj2 = p1;
       o0 obj3 = PatchProxy.applyTwoRefs(obj1, obj2, obj, c.class, "35");
       if (obj3 != PatchProxyResult.class) {
          return obj3;
       }
       int i = 2;
       obj3 = o0.b("SELECT `MainPackageModel`.`versionCode` AS `versionCode`, `MainPackageModel`.`versionName` AS `versionName`, `MainPackageModel`.`size` AS `size`, `MainPackageModel`.`md5` AS `md5`, `MainPackageModel`.`desc` AS `desc`, `MainPackageModel`.`updateTime` AS `updateTime`, `MainPackageModel`.`url` AS `url`, `MainPackageModel`.`cdnURLs` AS `cdnURLs`, `MainPackageModel`.`appId` AS `appId`, `MainPackageModel`.`buildEnv` AS `buildEnv`, `MainPackageModel`.`frameworkVersionCode` AS `frameworkVersionCode`, `MainPackageModel`.`releaseCode` AS `releaseCode`, `MainPackageModel`.`compilerVersion` AS `compilerVersion`, `MainPackageModel`.`ws` AS `ws` FROM MainPackageModel WHERE appId = ? AND buildEnv = ?", i);
       int i1 = 1;
       if (obj1 == null) {
          obj3.bindNull(i1);
       }else {
          obj3.bindString(i1, obj1);
       }
       if (obj2 == null) {
          obj3.bindNull(i);
       }else {
          obj3.bindString(i, obj2);
       }
       obj.a.d();
       obj2 = c.b(obj.a, obj3, false, null);
       int i2 = b.e(obj2, "versionCode");
       i = b.e(obj2, "versionName");
       i1 = b.e(obj2, "size");
       int i3 = b.e(obj2, "md5");
       int i4 = b.e(obj2, "desc");
       int i5 = b.e(obj2, "updateTime");
       int i6 = b.e(obj2, "url");
       int i7 = b.e(obj2, "cdnURLs");
       int i8 = b.e(obj2, "appId");
       int i9 = b.e(obj2, "buildEnv");
       int i10 = b.e(obj2, "frameworkVersionCode");
       int i11 = b.e(obj2, "releaseCode");
       o0 oo0 = obj3;
       int i12 = b.e(obj2, "ws");
       int i13 = b.e(obj2, "compilerVersion");
       ArrayList uArrayList = new ArrayList(obj2.getCount());
       while (obj2.moveToNext()) {
          MainPackageModel mainPackageM = new MainPackageModel();
          mainPackageM.versionCode = obj2.getInt(i2);
          mainPackageM.versionName = obj2.getString(i);
          mainPackageM.size = obj2.getLong(i1);
          mainPackageM.md5 = obj2.getString(i3);
          mainPackageM.desc = obj2.getString(i4);
          mainPackageM.updateTime = obj2.getLong(i5);
          mainPackageM.url = obj2.getString(i6);
          mainPackageM.cdnUrls = obj.c.b(obj2.getString(i7));
          mainPackageM.appId = obj2.getString(i8);
          mainPackageM.buildEnv = obj2.getString(i9);
          mainPackageM.frameworkVersionCode = obj2.getInt(i10);
          mainPackageM.releaseCode = obj2.getInt(i11);
          int i14 = i13;
          mainPackageM.compilerVersion = obj2.getString(i14);
          i = i12;
          mainPackageM.ws = obj2.getString(i);
          obj1 = uArrayList;
          obj1.add(mainPackageM);
          uArrayList = obj1;
          i = i;
       }
       obj2.close();
       oo0.release();
       return uArrayList;
    }
    public void o(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "9")) {
          return;
       }
       this.a.d();
       this.a.e();
       this.i.i(p0);
       this.a.C();
       this.a.k();
       return;
    }
    public void p(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "14")) {
          return;
       }
       this.a.e();
       a.e(this, p0);
       this.a.C();
       this.a.k();
       return;
    }
    public void q(MiniAppDetailInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "6")) {
          return;
       }
       this.a.d();
       this.a.e();
       this.g.i(p0);
       this.a.C();
       this.a.k();
       return;
    }
    public List r(){
       o0 obj = PatchProxy.apply(null, this, c.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = o0.b("SELECT `BackupMiniAppPackageInfo`.`appId` AS `appId`, `BackupMiniAppPackageInfo`.`data` AS `data`, `BackupMiniAppPackageInfo`.`insertTime` AS `insertTime` FROM BackupMiniAppPackageInfo", 0);
       this.a.d();
       Cursor uCursor = c.b(this.a, obj, 0, null);
       int i = b.e(uCursor, "appId");
       int i1 = b.e(uCursor, "data");
       int i2 = b.e(uCursor, "insertTime");
       ArrayList uArrayList = new ArrayList(uCursor.getCount());
       while (uCursor.moveToNext()) {
          a uoa = new a();
          uoa.a = uCursor.getString(i);
          String str = uCursor.getString(i1);
          c tf = this.f;
          Objects.requireNonNull(tf);
          Object obj1 = PatchProxy.applyOneRefs(str, tf, a$a.class, "2");
          if (obj1 != PatchProxyResult.class) {
          }else {
             try{
                obj1 = d0.c().h(str, MiniAppPackageInfo.class);
             }catch(com.google.gson.JsonSyntaxException e9){
                e9.printStackTrace();
                obj1 = null;
             }
          }
          uoa.b = obj1;
          uoa.c = uCursor.getLong(i2);
          uArrayList.add(uoa);
       }
       uCursor.close();
       obj.release();
       return uArrayList;
    }
    public FrameworkModel s(int p0){
       o0 obj;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "29");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = o0.b("SELECT `FrameworkModel`.`versionCode` AS `versionCode`, `FrameworkModel`.`versionName` AS `versionName`, `FrameworkModel`.`size` AS `size`, `FrameworkModel`.`md5` AS `md5`, `FrameworkModel`.`desc` AS `desc`, `FrameworkModel`.`updateTime` AS `updateTime`, `FrameworkModel`.`url` AS `url`, `FrameworkModel`.`cdnURLs` AS `cdnURLs`, `FrameworkModel`.`downloadPriority` AS `downloadPriority` FROM FrameworkModel WHERE versionCode = ?", 1);
       obj.bindLong(1, (long)p0);
       this.a.d();
       CancellationSignal uCancellatio = null;
       Cursor uCursor = c.b(this.a, obj, false, uCancellatio);
       int i = b.e(uCursor, "versionCode");
       int i1 = b.e(uCursor, "versionName");
       int i2 = b.e(uCursor, "size");
       int i3 = b.e(uCursor, "md5");
       int i4 = b.e(uCursor, "desc");
       int i5 = b.e(uCursor, "updateTime");
       int i6 = b.e(uCursor, "url");
       int i7 = b.e(uCursor, "cdnURLs");
       int i8 = b.e(uCursor, "downloadPriority");
       if (uCursor.moveToFirst()) {
          uCancellatio = new FrameworkModel();
          uCancellatio.versionCode = uCursor.getInt(i);
          uCancellatio.versionName = uCursor.getString(i1);
          uCancellatio.size = uCursor.getLong(i2);
          uCancellatio.md5 = uCursor.getString(i3);
          uCancellatio.desc = uCursor.getString(i4);
          uCancellatio.updateTime = uCursor.getLong(i5);
          uCancellatio.url = uCursor.getString(i6);
          uCancellatio.cdnUrls = this.c.b(uCursor.getString(i7));
          uCancellatio.downloadPriority = uCursor.getString(i8);
       }
       uCursor.close();
       obj.release();
       return uCancellatio;
    }
    public void t(String[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "41")) {
          return;
       }
       this.a.d();
       StringBuilder str = f.b()+"DELETE FROM MainPackageModel WHERE appId IN \(";
       f.a(str, p0.length);
       f uof = this.a.h(str+"\)");
       int len = p0.length;
       int i1 = 1;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = p0[i];
          if (oobject == null) {
             uof.bindNull(i1);
          }else {
             uof.bindString(i1, oobject);
          }
          i1 = i1 + 1;
       }
       this.a.e();
       uof.executeUpdateDelete();
       this.a.C();
       this.a.k();
       return;
    }
    public void u(String[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "15")) {
          return;
       }
       this.a.e();
       a.f(this, p0);
       this.a.C();
       this.a.k();
       return;
    }
    public void v(){
       if (PatchProxy.applyVoid(null, this, c.class, "16")) {
          return;
       }
       this.a.e();
       a.a(this);
       this.a.C();
       this.a.k();
       return;
    }
    public void w(MainPackageModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "7")) {
          return;
       }
       this.a.d();
       this.a.e();
       this.h.i(p0);
       this.a.C();
       this.a.k();
       return;
    }
    public List x(String p0){
       Object obj = this;
       ArrayList obj1 = p0;
       o0 obj2 = PatchProxy.applyOneRefs(obj1, obj, c.class, "28");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       int i = 1;
       obj2 = o0.b("SELECT `SubPackageModel`.`versionCode` AS `versionCode`, `SubPackageModel`.`versionName` AS `versionName`, `SubPackageModel`.`size` AS `size`, `SubPackageModel`.`md5` AS `md5`, `SubPackageModel`.`desc` AS `desc`, `SubPackageModel`.`updateTime` AS `updateTime`, `SubPackageModel`.`url` AS `url`, `SubPackageModel`.`cdnURLs` AS `cdnURLs`, `SubPackageModel`.`appId` AS `appId`, `SubPackageModel`.`root` AS `root`, `SubPackageModel`.`releaseCode` AS `releaseCode`, `SubPackageModel`.`buildEnv` AS `buildEnv`, `SubPackageModel`.`independent` AS `independent` FROM SubPackageModel WHERE appId = ?", i);
       if (obj1 == null) {
          obj2.bindNull(i);
       }else {
          obj2.bindString(i, obj1);
       }
       obj.a.d();
       Cursor uCursor = c.b(obj.a, obj2, false, null);
       boolean i1 = b.e(uCursor, "versionCode");
       int i2 = b.e(uCursor, "versionName");
       int i3 = b.e(uCursor, "size");
       int i4 = b.e(uCursor, "md5");
       int i5 = b.e(uCursor, "desc");
       int i6 = b.e(uCursor, "updateTime");
       int i7 = b.e(uCursor, "url");
       int i8 = b.e(uCursor, "cdnURLs");
       int i9 = b.e(uCursor, "appId");
       int i10 = b.e(uCursor, "root");
       int i11 = b.e(uCursor, "releaseCode");
       i = b.e(uCursor, "buildEnv");
       o0 oo0 = obj2;
       int i12 = b.e(uCursor, "independent");
       ArrayList uArrayList = new ArrayList(uCursor.getCount());
       while (uCursor.moveToNext()) {
          SubPackageModel subPackageMo = new SubPackageModel();
          ArrayList uArrayList1 = uArrayList;
          subPackageMo.versionCode = uCursor.getInt(i1);
          subPackageMo.versionName = uCursor.getString(i2);
          subPackageMo.size = uCursor.getLong(i3);
          subPackageMo.md5 = uCursor.getString(i4);
          subPackageMo.desc = uCursor.getString(i5);
          subPackageMo.updateTime = uCursor.getLong(i6);
          subPackageMo.url = uCursor.getString(i7);
          subPackageMo.cdnUrls = obj.c.b(uCursor.getString(i8));
          subPackageMo.appId = uCursor.getString(i9);
          subPackageMo.root = uCursor.getString(i10);
          subPackageMo.releaseCode = uCursor.getInt(i11);
          int i13 = i;
          subPackageMo.buildEnv = uCursor.getString(i13);
          i = i12;
          if (uCursor.getInt(i)) {
             i12 = i1;
             i1 = true;
          }else {
             i12 = i1;
             i1 = false;
          }
          subPackageMo.independent = i1;
          obj1 = uArrayList1;
          obj1.add(subPackageMo);
          uArrayList = obj1;
          i1 = i12;
          i12 = i;
          i = i13;
       }
       uCursor.close();
       oo0.release();
       return uArrayList;
    }
    public void y(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "4")) {
          return;
       }
       this.a.d();
       this.a.e();
       this.d.h(p0);
       this.a.C();
       this.a.k();
       return;
    }
    public SubPackageModel z(String p0,String p1,int p2,String p3){
       o0 obj;
       Cursor this;
       o0 oo0;
       SubPackageModel subPackageMo1;
       c uoc = this;
       String str = p0;
       String str1 = p1;
       String str2 = p3;
       if (PatchProxy.isSupport(c.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), p3, this, c.class, "26");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = 4;
       obj = o0.b("SELECT `SubPackageModel`.`versionCode` AS `versionCode`, `SubPackageModel`.`versionName` AS `versionName`, `SubPackageModel`.`size` AS `size`, `SubPackageModel`.`md5` AS `md5`, `SubPackageModel`.`desc` AS `desc`, `SubPackageModel`.`updateTime` AS `updateTime`, `SubPackageModel`.`url` AS `url`, `SubPackageModel`.`cdnURLs` AS `cdnURLs`, `SubPackageModel`.`appId` AS `appId`, `SubPackageModel`.`root` AS `root`, `SubPackageModel`.`releaseCode` AS `releaseCode`, `SubPackageModel`.`buildEnv` AS `buildEnv`, `SubPackageModel`.`independent` AS `independent` FROM SubPackageModel WHERE appId = ? AND root = ? AND releaseCode = ? AND buildEnv = ?", i);
       boolean i1 = 1;
       if (!str) {
          obj.bindNull(i1);
       }else {
          obj.bindString(i1, str);
       }
       int i2 = 2;
       if (!str1) {
          obj.bindNull(i2);
       }else {
          obj.bindString(i2, str1);
       }
       obj.bindLong(3, (long)p2);
       if (!str2) {
          obj.bindNull(i);
       }else {
          obj.bindString(i, str2);
       }
       uoc.a.d();
       this = c.b(uoc.a, obj, false, null);
       i2 = b.e(this, "versionCode");
       int i3 = b.e(this, "versionName");
       int i4 = b.e(this, "size");
       int i5 = b.e(this, "md5");
       int i6 = b.e(this, "desc");
       int i7 = b.e(this, "updateTime");
       int i8 = b.e(this, "url");
       int i9 = b.e(this, "cdnURLs");
       int i10 = b.e(this, "appId");
       int i11 = b.e(this, "root");
       i = b.e(this, "releaseCode");
       i1 = b.e(this, "buildEnv");
       int i12 = b.e(this, "independent");
       if (this.moveToFirst()) {
          oo0 = obj;
          SubPackageModel subPackageMo = new SubPackageModel();
          subPackageMo.versionCode = this.getInt(i2);
          subPackageMo.versionName = this.getString(i3);
          subPackageMo.size = this.getLong(i4);
          subPackageMo.md5 = this.getString(i5);
          subPackageMo.desc = this.getString(i6);
          subPackageMo.updateTime = this.getLong(i7);
          subPackageMo.url = this.getString(i8);
          subPackageMo.cdnUrls = uoc.c.b(this.getString(i9));
          subPackageMo.appId = this.getString(i10);
          subPackageMo.root = this.getString(i11);
          subPackageMo.releaseCode = this.getInt(i);
          subPackageMo.buildEnv = this.getString(i1);
          i1 = (this.getInt(i12))? true: false;
          subPackageMo.independent = i1;
          subPackageMo1 = subPackageMo;
       }else {
          oo0 = obj;
          subPackageMo1 = null;
       }
       this.close();
       oo0.release();
       return subPackageMo1;
    }
}
