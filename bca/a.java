package bca.a;
import mn9.b;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import tkd.b;
import tkd.d;
import h69.b;
import java.util.ArrayList;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mn9.b$a;
import brd.v;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.aicut.VideoTemplateResponse;
import brd.g;
import i69.f;
import com.yxcorp.gifshow.v3.editor.aicut.AICutProjectManager;
import fba.a;
import haa.a;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.AICutTheme;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.edit.draft.RecommendStyle;
import kotlin.Pair;
import java.lang.Integer;
import java.lang.Long;
import h69.j;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Number;
import com.kuaishou.edit.draft.Workspace$Type;
import vaa.a;
import com.kuaishou.edit.draft.Kuaishan;
import bca.a$s;
import java.util.concurrent.Callable;
import brd.t;
import bca.a$t;
import erd.o;
import t45.d;
import brd.z;
import bca.a$u;
import erd.g;
import bca.a$v;
import bca.a$w;
import bca.a$x;
import bca.a$y;
import erd.a;
import bca.a$z;
import bca.a$a0;
import crd.b;
import bca.a$r;
import erd.f;
import mn9.a;
import java.lang.Boolean;
import eca.g;
import com.yxcorp.gifshow.aicut.VideoTemplate;
import com.yxcorp.gifshow.aicut.KwaiAICutStyle;
import com.yxcorp.gifshow.aicut.api.AICutStyle;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import bca.a$e;
import io.reactivex.g;
import bca.a$f;
import bca.a$g;
import bca.a$h;
import bca.a$i;
import bca.a$c;
import bca.a$q;
import bca.a$j;
import bca.a$k;
import bca.a$l;
import bca.a$m;
import bca.a$n;
import bca.a$o;
import bca.a$p;
import bca.a$d;
import com.yxcorp.gifshow.aicut.VideoTemplateGroupInfo;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.collections.CollectionsKt__CollectionsKt;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import cca.b;
import bca.a$b;
import java.lang.Runnable;
import ekd.k1;
import java.util.Objects;
import java.util.Collection;
import lnc.g7;
import com.yxcorp.gifshow.widget.RecyclerTabWithIndicatorView$d;
import com.yxcorp.gifshow.kuaishan.model.KSFeedTemplateDetailInfo;
import nsd.u;
import trd.y;
import dca.s;
import com.yxcorp.gifshow.editor.aicutv2.actions.AICutSubItemLoadingNotifyAction;
import xvc.b;

public final class a implements b	// class@000464
{
    public final b a;
    public boolean b;
    public boolean c;
    public s d;
    public ArrayList e;
    public b f;
    public VideoTemplate g;
    public boolean h;
    public final ArrayList i;
    public final c j;
    public final EditorSdk2V2$VideoEditorProject k;

    public void a(c p0,EditorSdk2V2$VideoEditorProject p1){
       a.p(p0, "draft");
       super();
       this.j = p0;
       this.k = p1;
       this.a = d.a(-873393519);
       this.e = new ArrayList();
       this.i = new ArrayList();
    }
    public List a(List p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "itemList");
       a.p(p1, "payload");
       return b$a.f(this, p0, p1);
    }
    public void b(v p0){
       int i2;
       z a;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "3")) {
          return;
       }
       a.p(p0, "emitter");
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "VideoTemplateDataPrd";
       a.D().w(str, "loadDataList\(\) called : forceLoadList = "+this.b, objArray);
       if (this.a.y6() != null && this.b == null) {
          VideoTemplateResponse videoTemplat = this.a.y6();
          a.m(videoTemplat);
          p0.onNext(this.j(videoTemplat));
          p0.onComplete();
          return;
       }else if(this.a.getProject() == null){
          Object[] objArray1 = new Object[i];
          a.D().w(str, "loadDataList: initProject", objArray1);
          AICutProjectManager.a(new EditorSdk2V2$VideoEditorProject(), this.j);
       }
       Object[] objArray2 = null;
       ArrayList uArrayList = PatchProxy.apply(objArray2, this, uoa, "12");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          uArrayList = new ArrayList();
          AICutTheme uAICutTheme2 = a.a(this.j).v();
          if (uAICutTheme2 != null) {
             List recommendSty = uAICutTheme2.getRecommendStyleList();
             if (recommendSty != null) {
                Iterator iterator1 = recommendSty.iterator();
                while (iterator1.hasNext()) {
                   RecommendStyle recommendSty1 = iterator1.next();
                   a.o(recommendSty1, "it");
                   String id = recommendSty1.getId();
                   a.o(id, "it.id");
                   uArrayList.add(new Pair(Integer.valueOf(recommendSty1.getType()), Long.valueOf(Long.parseLong(id))));
                }
             }
          }
       }
       String str1 = j.d(this.j, i);
       if (!TextUtils.x(str1)) {
          AICutTheme uAICutTheme = a.a(this.j).v();
          if (uAICutTheme != null && !uAICutTheme.getIsRecommend()) {
             Iterator iterator = uArrayList.iterator();
             int i1 = 0;
             while (true) {
                if (iterator.hasNext()) {
                   if (a.g(String.valueOf(iterator.next().getSecond().longValue()), str1)) {
                   label_0114 :
                      if (i1 >= 0) {
                         uArrayList.remove(i1);
                      }
                      if (this.j.a1() != Workspace$Type.KUAISHAN) {
                         if (this.j.a1() == Workspace$Type.PHOTO_MOVIE) {
                            a uoa1 = this.j.F0();
                            if (uoa1 != null) {
                               objArray2 = uoa1.v();
                            }
                            if (objArray2 == null) {
                            label_013e :
                               i2 = 0;
                            label_0141 :
                               uArrayList.add(i, new Pair(Integer.valueOf(i2), Long.valueOf(Long.parseLong(str1))));
                            }
                         }else {
                            goto label_013e ;
                         }
                      }
                      i2 = 1;
                      goto label_0141 ;
                   }else {
                      i1 = i1 + 1;
                   }
                }else {
                   i1 = -1;
                   goto label_0114 ;
                }
             }
          }
       }
       AICutTheme uAICutTheme1 = a.a(this.j).v();
       if (uAICutTheme1 != null) {
          i = uAICutTheme1.getDpiValue();
       }
       a = d.a;
       p0.setCancellable(new a$r(t.fromCallable(new a$s(this)).flatMap(new a$t(this, uArrayList, i)).observeOn(a).doOnNext(new a$u(this, uArrayList)).observeOn(d.c).flatMap(new a$v(this)).observeOn(a).doOnNext(new a$w(this, p0)).doOnError(new a$x(p0)).doOnComplete(new a$y(p0)).subscribe(a$z.b, a$a0.b)));
       return;
    }
    public void c(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "18")) {
          return;
       }
       a.p(p0, "emitter");
       b$a.e(this, p0);
       return;
    }
    public boolean d(a p0){
       f obj = PatchProxy.applyOneRefs(p0, this, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "item");
       boolean b = (p0.d == true)? true: false;
       if (b) {
          return true;
       }else if(p0.g()){
          return false;
       }else if(!p0.f().getType()){
          if (this.a.getProject() == null) {
             return false;
          }else {
             obj = this.a.getProject();
             a.m(obj);
             return obj.f(p0.f().getAiCutStyle());
          }
       }else {
          p0.f().getType();
          return false;
       }
    }
    public boolean e(a p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "item");
       return b$a.b(this, p0, p1);
    }
    public void f(a p0,v p1){
       a tf;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "6")) {
          return;
       }
       a.p(p0, "item");
       a.p(p1, "emitter");
       VideoTemplate videoTemplat = p0.b();
       if (videoTemplat == null) {
          if (!p0.g()) {
             p1.onError(new IllegalArgumentException("toApplyTemplate is null"));
             return;
          }else {
             p1.setCancellable(new a$c(t.create(new a$e(this)).observeOn(d.a).doOnNext(new a$f(p1)).doOnComplete(new a$g(this, p0, p1)).subscribe(a$h.b, new a$i(p1))));
             return;
          }
       }else {
          String id = videoTemplat.getId();
          a tg = this.g;
          String id1 = (tg != null)? tg.getId(): null;
          if (TextUtils.n(id, id1)) {
             tf = this.f;
             if (tf != null && (tf != null && !tf.isDisposed())) {
                tf = 1;
             label_0087 :
                if (tf) {
                   this.i.add(new a$q(this, p1, p0));
                   this.l(p0, true);
                   return;
                }else {
                   f project = this.a.getProject();
                   a.m(project);
                   t ot = project.n(videoTemplat);
                   p1.setCancellable(new a$d(ot.observeOn(d.a).doOnNext(new a$j(this, p1)).doOnSubscribe(new a$k(this, p0)).doOnDispose(new a$l(this, p0)).doOnError(new a$m(this, p0, p1)).doOnComplete(new a$n(this, p0, p1)).subscribe(a$o.b, a$p.b)));
                   return;
                }
             }
          }
          tf = null;
          goto label_0087 ;
       }
    }
    public void g(v p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "14")) {
          return;
       }
       a.p(p0, "emitter");
       a.p(p1, "payload");
       b$a.d(this, p0, p1);
       return;
    }
    public void h(a p0,Object p1,v p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "15")) {
          return;
       }
       a.p(p0, "item");
       a.p(p2, "emitter");
       b$a.c(this, p0, p1, p2);
       return;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, a.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return false;
    }
    public final void i(VideoTemplateResponse p0,g p1){
       String str1;
       a$b uob2;
       Object obj6;
       Object obj = this;
       ArrayList obj1 = p0;
       Object obj2 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, a.class, "5")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("VideoTemplateDataPrd", "fillRecommendListToAICutItem\(\) invoked", objArray);
       if (obj1 != null) {
          obj1 = p0.getTemplateGroups();
          if (obj1 != null) {
             ArrayList uArrayList = new ArrayList();
             String str = j.d(obj.j, i);
             AICutTheme uAICutTheme = a.a(obj.j).v();
             boolean b = (uAICutTheme != null)? uAICutTheme.getIsRecommend(): false;
             Iterator iterator = obj1.iterator();
             while (iterator.hasNext()) {
                Object obj3 = iterator.next();
                if (a.g(obj3.getGroupName(), "ÍÆ¼ö")) {
                   Ref$IntRef intRef = new Ref$IntRef();
                   intRef.element = i;
                   obj1 = obj3.getTemplates();
                   if (obj1 != null) {
                      Iterator iterator1 = obj1.iterator();
                      int i1 = 0;
                      while (iterator1.hasNext()) {
                         a obj4 = iterator1.next();
                         int i2 = i1 + 1;
                         if (i1 < 0) {
                            CollectionsKt__CollectionsKt.W();
                         }
                         Object obj5 = obj4;
                         if (!a.g(str, obj5.getId()) || !b) {
                            obj4 = obj.d;
                            if (obj4 != null) {
                               b uob = obj4.o0();
                               if (uob != null) {
                                  str1 = uob.d();
                               label_00a8 :
                                  if (!a.g(str1, obj5.getId())) {
                                     obj6 = obj5;
                                  label_00cb :
                                     uArrayList.add(obj6);
                                     i1 = i2;
                                     uob2 = null;
                                  }
                               }
                            }
                            str1 = null;
                            goto label_00a8 ;
                         }
                         intRef.element = i1;
                         a$b uob1 = v5;
                         uob2 = v5;
                         obj6 = obj5;
                         uob1 = new a$b(str, b, intRef, uArrayList, this, p1);
                         k1.r(uob2, 0);
                         goto label_00cb ;
                      }
                   }
                   Objects.requireNonNull(p1);
                   if (!PatchProxy.applyVoidOneRefs(uArrayList, obj2, g.class, "3")) {
                      a.p(uArrayList, "templates");
                      obj2.a.clear();
                      obj2.a.addAll(uArrayList);
                   }
                   obj2.k(intRef.element);
                   if (intRef.element == null && !b) {
                      VideoTemplate videoTemplat = p1.b();
                      String id = (videoTemplat != null)? videoTemplat.getId(): null;
                      if (a.g(str, id)) {
                         g.m(obj2, false, 1, null);
                      }
                   }
                label_0112 :
                   j.d.t(obj.j, obj3.getTemplates(), 1);
                   break ;
                }
             }
          }
       }
       return;
    }
    public final List j(VideoTemplateResponse p0){
       Iterator iterator;
       Object obj = this;
       RecyclerTabWithIndicatorView$d obj1 = p0;
       ArrayList obj2 = PatchProxy.applyOneRefs(obj1, obj, a.class, "4");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       obj2 = new ArrayList();
       ArrayList uArrayList = new ArrayList();
       ArrayList templateGrou = p0.getTemplateGroups();
       if (templateGrou != null) {
          iterator = templateGrou.iterator();
          int i = 0;
          while (iterator.hasNext()) {
             Object obj3 = iterator.next();
             int i1 = i + 1;
             if (i < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             if (!g7.a(obj.j) || (i || !a.g(obj3.getGroupName(), "ÍÆ¼ö"))) {
                ArrayList templates = obj3.getTemplates();
                if (templates != null && templates.size() > 0) {
                   uArrayList.add(new RecyclerTabWithIndicatorView$d(obj3.getGroupName(), templates.size()));
                   Iterator iterator1 = templates.iterator();
                   while (iterator1.hasNext()) {
                      obj2.add(new g(iterator1.next(), 0, obj3.getGroupId(), obj3.getGroupName()));
                   }
                   VideoTemplate videoTemplat = new VideoTemplate(0, null, null, null, 15, null);
                   g og = new g(obj3, 1, null, null, 12, null);
                   obj2.add(iterator1);
                }
             }
             i = i1;
          }
       }
       y.N0(obj2);
       if (g7.a(obj.j) && (obj2.isEmpty() ^ 0x01)) {
          VideoTemplate videoTemplat1 = new VideoTemplate(0, null, null, null, 15, null);
          g og1 = new g(v13, 2, null, null, 12, null);
          obj.i(obj1, iterator);
          obj2.add(0, iterator);
          if (uArrayList.isEmpty() ^ 0x01) {
             obj1 = uArrayList.get(0);
             obj1.d = obj1.a() + 1;
          }
       }
       obj.e = uArrayList;
       return obj2;
    }
    public final void k(s p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       a.p(p0, "viewModel");
       this.d = p0;
       return;
    }
    public final void l(g p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "7")) {
          return;
       }
       if (p0.g()) {
          a td = this.d;
          if (td != null) {
             td.t0(new AICutSubItemLoadingNotifyAction(p1));
          }
       }
       return;
    }
    public final void m(boolean p0){
       this.c = p0;
    }
    public final void n(boolean p0){
       this.h = p0;
    }
}
