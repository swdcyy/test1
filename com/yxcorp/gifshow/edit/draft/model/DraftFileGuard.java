package com.yxcorp.gifshow.edit.draft.model.DraftFileGuard;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import haa.f;
import java.lang.StringBuilder;
import q87.c;
import java.util.Map;
import trd.t0;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import com.yxcorp.gifshow.edit.draft.model.DraftFileGuard$a;
import java.lang.Runnable;
import t45.c;
import com.kuaishou.edit.draft.Workspace;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.kwai.sdk.switchconfig.a;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.edit.draft.Kuaishan;
import android.text.TextUtils;
import com.kuaishou.edit.draft.AICutTheme;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import w46.b;
import kotlin.collections.CollectionsKt__CollectionsKt;
import wkd.b;
import j80.c;
import java.util.Objects;
import kotlin.io.FilesKt__UtilsKt;
import zsd.u;
import java.lang.Boolean;
import java.util.Set;
import java.util.Map$Entry;
import com.yxcorp.gifshow.edit.draft.model.DraftFileInfo;
import android.content.SharedPreferences;
import oe6.n;
import com.yxcorp.gifshow.edit.draft.model.DraftFileGuard$b;
import java.lang.reflect.Type;
import el.a;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.io.FileWalkDirection;
import isd.h;
import isd.l;
import com.yxcorp.gifshow.edit.draft.model.DraftFileGuard$readDraftInfoMap$1;
import wsd.m;
import msd.l;
import kotlin.sequences.SequencesKt___SequencesKt;
import tb7.c;
import wba.d;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class DraftFileGuard	// class@001ae6
{
    public static boolean a;
    public static final DraftFileGuard b;

    static {
       DraftFileGuard.b = new DraftFileGuard();
    }
    public void DraftFileGuard(){
       super();
    }
    public final void a(File p0,String p1,List p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, DraftFileGuard.class, "16")) {
          return;
       }
       a.p(p0, "dir");
       a.p(p1, "id");
       a.p(p2, "guardDirList");
       int i = 0;
       Object[] objArray = new Object[i];
       f.D().w("DraftFileGuard", "checkAllFiles\(\) "+p1+' '+p0, objArray);
       if (this.j(p1)) {
          return;
       }
       Map map = this.l(p1);
       if (map == null || map.isEmpty()) {
          i = 1;
       }
       if (i) {
          return;
       }else {
          Map map1 = t0.n0(this.n(p0, p2), this.m(null, p0, p2));
          if (this.i(map, map1)) {
             PostUtils.D("DraftFileGuard", "checkAllFiles\(\) found a origin file changed! ", new IllegalStateException("old="+map+" new="+map1));
             this.p(p1);
          }
          return;
       }
    }
    public final void b(File p0,String p1,List p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, DraftFileGuard.class, "15")) {
          return;
       }
       a.p(p0, "dir");
       a.p(p1, "id");
       a.p(p2, "guardDirList");
       Object[] objArray = new Object[0];
       f.D().w("DraftFileGuard", "checkAllFilesInDraftThread\(\) "+p1+' '+p0, objArray);
       c.a(new DraftFileGuard$a(p0, p1, p2));
       return;
    }
    public final void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DraftFileGuard.class, "20")) {
          return;
       }
       a.p(p0, "id");
       File uFile = this.f(p0);
       if (uFile.isFile() && uFile.delete()) {
          Object[] objArray = new Object[0];
          f.D().w("DraftFileGuard", "deleteDraftGuardFile\(\) del "+uFile, objArray);
       }
       return;
    }
    public final List d(Workspace p0){
       Kuaishan kuaishan;
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, DraftFileGuard.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       String str = a.t().c("postDraftGuardExtraDirList", "");
       a.o(str, "com.kwai.sdk.switchconfi¡­GUARD_EXTRA_DIR_LIST, \"\"\)");
       String[] stringArray = new String[]{","};
       Iterator iterator = StringsKt__StringsKt.H4(str, stringArray, false, 0, 6, null).iterator();
       while (iterator.hasNext()) {
          String str1 = iterator.next();
          if (a.g(str1, "kuaishan")) {
             kuaishan = (p0 != null)? p0.getKuaishan(): null;
             if (kuaishan != null && !TextUtils.isEmpty(kuaishan.getTemplateDirectory())) {
                obj.add(kuaishan.getTemplateDirectory());
             }
          }else if(a.g(str1, "aicut")){
             if (p0 != null) {
                List aiCutThemesL = p0.getAiCutThemesList();
                if (aiCutThemesL != null) {
                   Iterator iterator1 = aiCutThemesL.iterator();
                   while (iterator1.hasNext()) {
                      AICutTheme uAICutTheme = iterator1.next();
                      a.o(uAICutTheme, "it");
                      if (!TextUtils.isEmpty(uAICutTheme.getDirectory())) {
                         obj.add(uAICutTheme.getDirectory());
                      }else {
                         continue ;
                      }
                   }
                }
             }
          }else {
             obj.add('/'+str1);
          }
       }
       return obj;
    }
    public final List e(c p0){
       Object[] obj = PatchProxy.applyOneRefs(p0, this, DraftFileGuard.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "workspaceDraft");
       if (p0.v() != null) {
          return this.d(p0.v());
       }
       obj = new Object[0];
       f.D().t("DraftFileGuard", "getExtraGuardDirList: workspaceDraft.firstMessage is null", obj);
       return CollectionsKt__CollectionsKt.E();
    }
    public final File f(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       DraftFileGuard uDraftFileGu = DraftFileGuard.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uDraftFileGu, "21");
       if (obj != patchProxyRe) {
          return obj;
       }
       File uFile = PatchProxy.apply(null, this, uDraftFileGu, "5");
       if (uFile != patchProxyRe) {
       }else {
          uFile = b.a(-1504323719).g("wsguard");
       }
       return new File(uFile, p0+".json");
    }
    public final String g(File p0,File p1){
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, DraftFileGuard.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.getAbsolutePath();
       a.o(obj, "file.absolutePath");
       Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
       String str = obj.substring((p1.getAbsolutePath()).length());
       a.o(str, "\(this as java.lang.String\).substring\(startIndex\)");
       String str1 = FilesKt__UtilsKt.Y(p0);
       Objects.requireNonNull(str1, "null cannot be cast to non-null type java.lang.String");
       String str2 = str1.toLowerCase();
       a.o(str2, "\(this as java.lang.String\).toLowerCase\(\)");
       return u.g2(str, '.'+str1, str2, false, 4, null);
    }
    public final String h(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DraftFileGuard.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0+"_video_changed";
    }
    public final boolean i(Map p0,Map p1){
       int i;
       String key;
       DraftFileInfo value;
       DraftFileInfo uDraftFileIn;
       Map$Entry obj = PatchProxy.applyTwoRefs(p0, p1, this, DraftFileGuard.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Iterator iterator = p1.entrySet().iterator();
       while (true) {
          i = 0;
          if (!iterator.hasNext()) {
             return i;
          }
          obj = iterator.next();
          key = obj.getKey();
          value = obj.getValue();
          uDraftFileIn = p0.get(key);
          int i1 = a.g(value, uDraftFileIn) ^ 1;
          if (i1 && (uDraftFileIn != null && uDraftFileIn.isValidInfo())) {
             break ;
          }
       }
       Object[] objArray = new Object[i];
       f.D().A("DraftFileGuard", "hasReplacedFile\(\) file change "+key+" oldInfo="+uDraftFileIn+", newInfo="+value, objArray);
       return 1;
    }
    public final boolean j(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DraftFileGuard.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return n.b().getBoolean(this.h(p0), false);
    }
    public final boolean k(File p0,File p1,List p2){
       boolean b1;
       boolean b2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, DraftFileGuard.class, "9");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.applyOneRefs(p1, this, DraftFileGuard.class, "10");
       boolean b = true;
       if (obj != patchProxyRe) {
          b1 = obj.booleanValue();
       }else if(p1.isFile()){
          obj = FilesKt__UtilsKt.Y(p1);
          Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
          obj = obj.toLowerCase();
          a.o(obj, "\(this as java.lang.String\).toLowerCase\(\)");
          if (a.g(obj, "mp4")) {
             b1 = true;
          }
       }
       b1 = false;
       if (!b1) {
          obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, DraftFileGuard.class, "11");
          if (obj != patchProxyRe) {
             b2 = obj.booleanValue();
          }else if(!p1.isDirectory()){
             Iterator iterator = p2.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   if ((p1.getAbsolutePath()).equals(p0.getAbsolutePath()+iterator.next())) {
                      b2 = true;
                      break ;
                   }
                }
             }
          }
          b2 = false;
          if (!b2) {
             b = false;
          }
       }
       return b;
    }
    public final Map l(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DraftFileGuard.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PostUtils.C(this.f(p0), new DraftFileGuard$b().getType());
    }
    public final Map m(Map p0,File p1,List p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Map$Entry obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, DraftFileGuard.class, "8");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object[] objArray = new Object[0];
       f.D().w("DraftFileGuard", "readDraftInfoFromFileMap\(\)", objArray);
       if (p0 == null) {
          p0 = PatchProxy.applyOneRefs(p1, null, c.class, "2");
          if (p0 == patchProxyRe) {
             p0 = PostUtils.C(new File(p1, "fileMap.json"), HashMap.class);
          }
       }
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       if (p0 != null) {
          Iterator iterator = p0.entrySet().iterator();
          while (iterator.hasNext()) {
             obj = iterator.next();
             File uFile = new File(p1, obj.getKey());
             if (uFile.isFile()) {
                continue ;
             }else {
                File uFile1 = new File(obj.getValue());
                DraftFileGuard b = DraftFileGuard.b;
                if (!b.k(p1, uFile1, p2)) {
                   Object[] objArray1 = new Object[0];
                   f.D().A("DraftFileGuard", "readDraftInfoFromFileMap\(\) not mp4 file "+uFile1, objArray1);
                }else {
                   String str = b.g(uFile, p1);
                   DraftFileInfo uDraftFileIn = b.o(uFile1);
                   linkedHashMa.put(str, uDraftFileIn);
                   StringBuilder str1 = "readDraftInfoFromFileMap\(\) record info : "+str;
                   objArray = new Object[0];
                   f.D().w("DraftFileGuard", str1+'='+uDraftFileIn, objArray);
                }
             }
          }
       }
       return linkedHashMa;
    }
    public final Map n(File p0,List p1){
       LinkedHashMap obj = PatchProxy.applyTwoRefs(p0, p1, this, DraftFileGuard.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LinkedHashMap();
       if (!p0.isDirectory()) {
          return obj;
       }
       Iterator iterator = SequencesKt___SequencesKt.i0(l.K(p0, null, 1, null), new DraftFileGuard$readDraftInfoMap$1(p0, p1)).iterator();
       while (iterator.hasNext()) {
          File uFile = iterator.next();
          DraftFileGuard b = DraftFileGuard.b;
          String str = b.g(uFile, p0);
          obj.put(str, b.o(uFile));
       }
       return obj;
    }
    public final DraftFileInfo o(File p0){
       DraftFileInfo uDraftFileIn;
       DraftFileInfo uDraftFileIn1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       DraftFileGuard uDraftFileGu = DraftFileGuard.class;
       Object[] obj = PatchProxy.applyOneRefs(p0, this, uDraftFileGu, "12");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (p0.isDirectory()) {
          uDraftFileIn = PatchProxy.applyOneRefs(p0, this, uDraftFileGu, "14");
          if (uDraftFileIn != patchProxyRe) {
          }else {
             uDraftFileIn1 = new DraftFileInfo(c.c(p0), 0, true, c.b(p0));
             obj = new Object[0];
             f.D().s("DraftFileGuard", "readDirInfo\(\) info= { "+uDraftFileIn+" } "+p0, obj);
          }
       }else {
          uDraftFileIn = PatchProxy.applyOneRefs(p0, this, uDraftFileGu, "13");
          if (uDraftFileIn != patchProxyRe) {
          }else {
             uDraftFileIn1 = new DraftFileInfo(c.c(p0), d.f(p0.getAbsolutePath()));
             Object[] objArray = new Object[0];
             f.D().s("DraftFileGuard", "getVideoFileInfo\(\) info= { "+uDraftFileIn1+" } "+p0, objArray);
             uDraftFileIn = uDraftFileIn1;
          }
       }
       return uDraftFileIn;
    }
    public final void p(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DraftFileGuard.class, "18")) {
          return;
       }
       Object[] objArray = new Object[0];
       f.D().w("DraftFileGuard", "setVideoChangedFlag "+p0, objArray);
       g.a(n.b().edit().putBoolean(this.h(p0), true));
       return;
    }
}
