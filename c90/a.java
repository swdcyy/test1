package c90.a;
import c90.c;
import c90.a$a;
import nsd.u;
import lnc.a1;
import com.kwai.feature.post.api.mediascene.MediaSceneConfig;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.LinkedHashMap;
import android.content.res.Resources;
import android.graphics.Bitmap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import z80.s;
import z80.c;
import brd.t;
import com.kuaishou.edit.draft.Workspace$From;
import c90.a$s;
import io.reactivex.g;
import c90.a$p;
import c90.a$q;
import erd.g;
import c90.a$r;
import erd.a;
import java.lang.Number;
import java.lang.Boolean;
import kotlin.jvm.internal.Ref$IntRef;
import java.util.HashMap;
import java.util.Objects;
import z80.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.kuaishou.gifshow.kuaishan.logic.m1;
import com.kuaishou.gifshow.kuaishan.logic.o1;
import java.lang.Integer;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import com.kwai.video.editorsdk2.EditorSdk2Utils$PreviewSizeLimitation;
import java.util.List;
import com.kuaishou.gifshow.kuaishan.logic.h1;
import z80.g;
import z80.h;
import erd.o;
import java.lang.RuntimeException;
import z80.o;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import z80.i;
import z80.j;
import c90.a$m;
import c90.a$n;
import c90.a$o;
import wkd.b;
import rfc.a;
import z80.k;
import z80.l;
import z80.m;
import z80.n;
import c90.a$f;
import c90.a$g;
import c90.a$h;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kwai.feature.post.api.mediascene.MediaSceneAssetContent;
import com.kuaishou.webkit.URLUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import trd.u;
import trd.t;
import lnc.r6;
import c90.a$b;
import c90.a$k;
import c90.a$l;
import com.kwai.feature.post.api.mediascene.MediaSceneAudioAsset;
import java.util.HashSet;
import c90.a$c;
import c90.a$d;
import c90.a$i;
import c90.a$j;
import brd.w;
import c90.a$e;
import a90.f;
import java.io.File;
import qkd.b;
import a90.a;

public final class a implements c	// class@000cf8
{
    public final String a;
    public Map b;
    public Map c;
    public Map d;
    public final MediaSceneConfig e;
    public static final int f;
    public static final int g;
    public static final a$a h;

    static {
       a.h = new a$a(null);
       a.f = a1.e(16.00f);
       a.g = a1.e(38.00f);
    }
    public void a(MediaSceneConfig p0){
       a.p(p0, "mConfig");
       super();
       this.e = p0;
       this.a = "ERROR_AUDIO_PATH";
       this.c = new LinkedHashMap();
       this.d = new LinkedHashMap();
    }
    public Bitmap a(Resources p0){
       s obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "resource");
       obj = s.d;
       c j = c.j;
       MediaSceneConfig mediaSceneCo = j.r();
       String str = null;
       String topColor = (mediaSceneCo != null)? mediaSceneCo.getTopColor(): str;
       MediaSceneConfig mediaSceneCo1 = j.r();
       if (mediaSceneCo1 != null) {
          str = mediaSceneCo1.getBottomColor();
       }
       return obj.e(p0, topColor, str);
    }
    public t b(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g(false);
    }
    public Workspace$From c(){
       return Workspace$From.MEDIA_SENCE_COMMON;
    }
    public t d(){
       t obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = t.create(new a$s(this));
       a.o(obj, "Observable.create { emit¡­mitter.onComplete\(\)\n    }");
       return obj;
    }
    public t e(){
       t obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = t.create(new a$p(this)).doOnSubscribe(a$q.b).doOnComplete(a$r.b);
       a.o(obj, "Observable.create<Int> {¡­AGE_GENERATE_ASSET\)\n    }");
       return obj;
    }
    public int f(){
       Object obj = PatchProxy.apply(null, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return 0x7f0816f0;
    }
    public t g(boolean p0){
       Ref$IntRef obj1;
       t ot;
       t ot1;
       t ot2;
       String obj3;
       Object[] obj4;
       Set set1;
       String str1;
       z a;
       Object obj = this;
       c uoc = c.class;
       a uoa = a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(uoa)) {
          obj1 = PatchProxy.applyOneRefs(Boolean.valueOf(p0), obj, uoa, "3");
          if (obj1 != patchProxyRe) {
             return obj1;
          }
       }
       obj1 = new Ref$IntRef();
       int i = 0;
       obj1.element = i;
       Ref$IntRef intRef = new Ref$IntRef();
       intRef.element = i;
       HashMap hashMap = new HashMap();
       HashMap hashMap1 = new HashMap();
       boolean b = s.d.d();
       c j = c.j;
       String templateId = obj.e.getTemplateId();
       Objects.requireNonNull(j);
       int i1 = 100;
       String str = "MediaSceneRepo";
       if (PatchProxy.isSupport(uoc)) {
          ot = PatchProxy.applyTwoRefs(templateId, Boolean.valueOf(p0), j, uoc, "8");
          if (ot != patchProxyRe) {
          }else {
          label_0061 :
             a.p(templateId, "templateId");
             obj4 = new Object[i];
             a.D().w(str, "fetchKSTemplate\(\) invoked with templateId = "+templateId, obj4);
             if (TextUtils.x(templateId)) {
                ot = t.error(new IllegalArgumentException("templateId is empty"));
                a.o(ot, "Observable.error\(Illegal¡­n\(\"templateId is empty\"\)\)");
             }else {
                Object[] objArray1 = null;
                obj3 = "0";
                if (p0) {
                   ot1 = PatchProxy.apply(objArray1, j, uoc, "9");
                   if (ot1 != patchProxyRe) {
                   }else {
                      m1 om1 = m1.w0();
                      a.o(om1, "KuaiShanManager.getInstance\(\)");
                      o1 oo1 = om1.v0();
                      if (oo1 != null) {
                         a.o(oo1, "KuaiShanManager.getInsta¡­\"currentProject is null\"\)");
                         if (a.g(oo1.getTemplateId(), obj3)) {
                            c.c = oo1;
                            ot1 = t.just(Integer.valueOf(i1));
                            a.o(ot1, "Observable.just\(CommonConstant.ONE_HUNDRED\)");
                         }else {
                            ot1 = h1.f(str, oo1.k0(), objArray1, i, EditorSdk2Utils$PreviewSizeLimitation.PREVIEW_SIZE_LIMITATION_1440P).doOnNext(g.b).map(h.b);
                            a.o(ot1, "KuaiShanAPI.doDownload\(\n¡­ap {\n      it.first\n    }");
                         }
                      }else {
                         throw new RuntimeException("currentProject is null");
                      }
                   }
                }else if(TextUtils.n(obj3, templateId)){
                   ot1 = PatchProxy.apply(objArray1, j, uoc, "10");
                   if (ot1 != patchProxyRe) {
                   }else {
                      ot1 = t.fromCallable(o.b).subscribeOn(d.c);
                      a.o(ot1, "Observable.fromCallable ¡­eOn\(KwaiSchedulers.ASYNC\)");
                   }
                }else {
                   ot = h1.d(str, templateId, EditorSdk2Utils$PreviewSizeLimitation.PREVIEW_SIZE_LIMITATION_1440P).observeOn(d.a).doOnNext(i.b).map(j.b);
                   a.o(ot, "KuaiShanAPI.createKuaiSh¡­       it.first\n        }");
                }
                ot = ot1;
             }
          }
       }else {
          goto label_0061 ;
       }
       ot1 = ot.map(new a$m(obj1)).doOnSubscribe(a$n.b).doOnComplete(a$o.b);
       if (TextUtils.x(obj.e.getMusicId())) {
          ot2 = t.just(Integer.valueOf(i1));
       }else {
          str1 = obj.e.getMusicId();
          i1 = obj.e.getMusicType();
          Objects.requireNonNull(j);
          if (PatchProxy.isSupport(uoc)) {
             ot2 = PatchProxy.applyTwoRefs(str1, Integer.valueOf(i1), j, uoc, "11");
             if (ot2 != patchProxyRe) {
             label_01ef :
                ot2 = ot2.map(new a$f(intRef)).doOnSubscribe(a$g.b).doOnComplete(a$h.b);
             }
          }
          a.p(str1, "musicId");
          Object[] objArray = new Object[i];
          a.D().w(str, "fetchMusic with id = "+str1+", type = "+i1, objArray);
          a = d.a;
          ot2 = b.a(0x4a533fa).h(str1, i1).map(k.b).observeOn(a).doOnNext(l.b).observeOn(d.c).flatMap(m.b).observeOn(a);
          ot2 = ot2.onErrorReturn(new n(str1, i1));
          a.o(ot2, "Singleton.get\(PublicApiS¡­_HUNDRED, null\)\n        }");
          goto label_01ef ;
       }
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Iterator iterator = obj.e.getAssetContents().entrySet().iterator();
       Object obj2 = 1;
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          MediaSceneAssetContent value = uEntry.getValue();
          if (value.mAssetType != 2 || !URLUtil.isNetworkUrl(value.mContent)) {
             obj2 = null;
          }
          if (obj2) {
             linkedHashMa.put(uEntry.getKey(), uEntry.getValue());
          }
       }
       ArrayList uArrayList = new ArrayList(linkedHashMa.size());
       Iterator iterator1 = linkedHashMa.entrySet().iterator();
       while (iterator1.hasNext()) {
          uArrayList.add(iterator1.next().getValue().mContent);
       }
       Set set = CollectionsKt___CollectionsKt.L5(uArrayList);
       int i2 = 10;
       ArrayList uArrayList1 = new ArrayList(u.Y(set, i2));
       iterator = set.iterator();
       while (iterator.hasNext()) {
          str = iterator.next();
          a.o(str, "mediaUrl");
          hashMap.put(str, Integer.valueOf(i));
          uArrayList1.add(r6.a(t.k(str)).map(new a$b(str, obj, hashMap)));
       }
       t ot3 = t.merge(uArrayList1).doOnSubscribe(a$k.b).doOnComplete(a$l.b);
       if (b) {
          ArrayList uArrayList2 = new ArrayList();
          iterator1 = obj.e.getAudioAssets().iterator();
          while (iterator1.hasNext()) {
             obj3 = iterator1.next();
             obj4 = obj3;
             i = (obj4.mAudioType == obj2 && URLUtil.isNetworkUrl(obj4.mUrl))? 1: 0;
             if (i) {
                uArrayList2.add(obj3);
             }
             MediaSceneAudioAsset mediaSceneAu = null;
          }
          ArrayList uArrayList3 = new ArrayList(u.Y(uArrayList2, i2));
          iterator1 = uArrayList2.iterator();
          while (iterator1.hasNext()) {
             uArrayList3.add(iterator1.next().mUrl);
          }
          set1 = CollectionsKt___CollectionsKt.L5(uArrayList3);
       }else {
          set1 = new HashSet();
       }
       uArrayList1 = new ArrayList(u.Y(set1, i2));
       Iterator iterator2 = set1.iterator();
       while (iterator2.hasNext()) {
          str1 = iterator2.next();
          a.o(str1, "audioUrl");
          hashMap1.put(str1, Integer.valueOf(0));
          uArrayList1.add(r6.a(t.k(str1)).onErrorReturn(new a$c(str1, obj, hashMap1)).map(new a$d(str1, obj, hashMap1)));
       }
       ot2 = t.merge(ot1, ot2, ot3, t.merge(uArrayList1).doOnSubscribe(new a$i(b)).doOnComplete(new a$j(b))).observeOn(d.a).map(new a$e(obj1, intRef, hashMap, hashMap1));
       a.o(ot2, "Observable.merge\(fetchTe¡­ogress.toInt\(\)\)\n        }");
       return ot2;
    }
    public int getVideoType(){
       return 15;
    }
    public final void h(String p0,String p1,o1 p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "9")) {
          return;
       }
       p1 = f.a.e(p0, p1);
       a tb = this.b;
       p1 = (tb != null)? tb.get(p1): null;
       if (p1 != null && b.S(new File(p1))) {
          a.b.b(p0, p1, p2);
       }
       return;
    }
}
