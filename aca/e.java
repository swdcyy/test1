package aca.e;
import tvc.c;
import jn9.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import cca.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import mn9.b;
import java.util.Objects;
import bca.a;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import mn9.a;
import eca.g;
import com.yxcorp.gifshow.aicut.VideoTemplate;
import com.yxcorp.gifshow.component.postlistcomponent.SelectScrollOption;
import cca.a;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import tvc.a;
import tvc.e;
import xvc.b;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateLoadListAction;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateDisposableListAction;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateDataFinishAction;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateLoadItemAction;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplatePreloadItemAction;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import crd.b;
import java.util.ArrayList;
import i69.f;
import h69.b;
import brd.t;
import t45.d;
import brd.z;
import bca.c;
import erd.g;
import bca.d;
import erd.a;
import bca.e;
import bca.f;
import bca.g;
import bca.h;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateLoadingCompleteAction;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateChangedAction;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplatePanelDetachAction;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateClearAction;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateClearCancelAction;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateDestroyAction;
import com.yxcorp.gifshow.editor.aicutv2.actions.AICutLastSelectedSubItemIdUpdateAction;
import com.yxcorp.gifshow.editor.aicutv2.actions.AICutFocusNotifyAction;
import com.yxcorp.gifshow.editor.aicutv2.actions.AICutSubItemLoadingNotifyAction;
import com.yxcorp.gifshow.editor.aicutv2.actions.AICutIgnoreLoadingItemCallbackAction;
import java.lang.Integer;
import com.yxcorp.gifshow.component.postlistcomponent.action.PostListComponentResetItemLoadingAction;
import on9.c;

public final class e extends c	// class@00008e
{
    public final b b;

    public void e(b p0){
       a.p(p0, "listAdapter");
       super();
       this.b = p0;
    }
    public static b c(e p0,String p1,b p2,boolean p3,boolean p4,int p5,Object p6){
       b uob;
       boolean b6;
       b uob2;
       e uoe = p0;
       Object obj = p1;
       boolean b = true;
       boolean b1 = (p5 & 0x04)? true: p3;
       boolean b2 = false;
       boolean b3 = (p5 & 0x08)? false: p4;
       if (PatchProxy.isSupport(e.class)) {
          uob = PatchProxy.applyFourRefs(p1, p2, Boolean.valueOf(b1), Boolean.valueOf(b3), p0, e.class, "2");
          if (uob != PatchProxyResult.class) {
          }else {
          label_003c :
             int b4 = p2.b();
             b uob1 = uoe.b.n();
             String str = "null cannot be cast to non-null type com.yxcorp.gifshow.editor.aicutv2.newtwork.VideoTemplateDataProvider";
             Objects.requireNonNull(uob1, str);
             uob1.m(b2);
             Iterator iterator = uoe.b.m().iterator();
             boolean b5 = false;
             while (true) {
                int i = -1;
                if (iterator.hasNext()) {
                   a uoa = iterator.next();
                   if (uoa instanceof g) {
                      a uoa1 = uoa;
                      if (uoa1.g()) {
                         VideoTemplate videoTemplat = uoa1.b();
                         String id = (videoTemplat != null)? videoTemplat.getId(): null;
                         if (!a.g(id, obj)) {
                            if (b3) {
                               Iterator iterator1 = uoa1.a.iterator();
                               int i1 = 0;
                               while (true) {
                                  if (iterator1.hasNext()) {
                                     if (a.g(iterator1.next().getId(), obj)) {
                                        uoa1.k(i1);
                                        uob2 = uoe.b.n();
                                        Objects.requireNonNull(uob2, str);
                                        uob2.m(b);
                                     }else {
                                        i1 = i1 + 1;
                                     }
                                  }
                               }
                            }
                         }
                         uoa1 = 1;
                      label_00be :
                         if (a.g(uoa.getId(), obj) || uoa1) {
                            if (b3) {
                               b4 = uoa1;
                            }
                            b6 = b4;
                            b4 = b5;
                         label_00d8 :
                            if (b4 != i) {
                               b.E(uoe.b, b4, b1, null, 4, null);
                               uob = b.a(p2, null, false, false, null, null, b4, false, false, false, null, 0, false, 0, null, b6, false, 0xbfdf, null);
                               break ;
                            }else {
                               uoe.b.d();
                               uob = b.a(p2, null, false, false, null, null, 0, false, false, false, null, 0, false, 0, null, false, false, 0xbfff, null);
                               break ;
                            }
                         }else {
                            b5 = b5 + 1;
                         }
                      }
                   }
                   uob2 = 0;
                   goto label_00be ;
                }else {
                   b6 = b4;
                   b4 = -1;
                   goto label_00d8 ;
                }
             }
          }
       }else {
          goto label_003c ;
       }
       return uob;
    }
    public e b(a p0,e p1){
       b uob;
       a uoa;
       String id;
       Object[] objArray2;
       g b;
       int i3;
       Object obj = this;
       Iterator obj1 = p0;
       Object obj2 = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b obj3 = PatchProxy.applyTwoRefs(obj1, obj2, obj, e.class, "1");
       if (obj3 != patchProxyRe) {
          obj2 = obj3;
       }else {
          a.p(obj1, "action");
          a.p(obj2, "oldState");
          if (obj1 instanceof VideoTemplateLoadListAction) {
             obj.b.d();
             b.w(obj.b, false, false, null, 7, null);
             obj2 = b.a(obj2, null, false, false, null, null, -1, false, false, false, null, 0, false, 0, null, false, false, 0xffdf, null);
          }else if(obj1 instanceof VideoTemplateDisposableListAction){
             obj.b.e();
          }else {
             String str = "null cannot be cast to non-null type com.yxcorp.gifshow.editor.aicutv2.newtwork.VideoTemplateDataProvider";
             if (obj1 instanceof VideoTemplateDataFinishAction) {
                uob = obj.b.n();
                Objects.requireNonNull(uob, str);
                obj2 = b.a(e.c(this, obj1.getInitId(), obj2, false, false, 12, null), null, false, false, uob.e, null, 0, false, false, false, null, 0, false, 0, null, false, false, 0xfff7, null);
             }else if(obj1 instanceof VideoTemplateLoadItemAction){
                if (!obj1.getLoadFirstItem()) {
                   obj2 = e.c(this, obj1.getId(), obj2, false, false, 8, null);
                }else {
                   obj1 = obj.b.m().iterator();
                   while (true) {
                      if (obj1.hasNext()) {
                         uoa = obj1.next();
                         if (uoa instanceof g && uoa.j()) {
                            id = uoa.getId();
                         }
                      }else {
                         id = "-1";
                      }
                      obj2 = e.c(this, id, obj2, false, false, 8, null);
                      break ;
                   }
                }
             }else {
                int i = -1;
                Object[] objArray = null;
                int i1 = 0;
                int i2 = 1;
                if (obj1 instanceof VideoTemplatePreloadItemAction) {
                   obj3 = obj.b.n();
                   Objects.requireNonNull(obj3, str);
                   g preloadItem = obj1.getPreloadItem();
                   if (!PatchProxy.applyVoidOneRefs(preloadItem, obj3, a.class, "8")) {
                      a.p(preloadItem, "preloadItem");
                      Object[] objArray1 = new Object[i1];
                      a.D().w("VideoTemplateDataPrd", "preloadItem invoked with id: "+preloadItem.getId(), objArray1);
                      if (!preloadItem.g()) {
                         objArray2 = new Object[i1];
                         a.D().A("VideoTemplateDataPrd", "preloadItem is not needed, return", objArray2);
                      }else {
                         a f = obj3.f;
                         if (f != null && !f.isDisposed()) {
                            objArray2 = new Object[i1];
                            a.D().A("VideoTemplateDataPrd", "preloadItem is in progress, return", objArray2);
                         }else if(obj3.d(preloadItem)){
                            objArray2 = new Object[i1];
                            a.D().A("VideoTemplateDataPrd", "preloadItem is ready, return", objArray2);
                         }else {
                            Object obj4 = PatchProxy.apply(objArray, preloadItem, g.class, "2");
                            if (obj4 != patchProxyRe) {
                               objArray = obj4;
                            }else if(preloadItem.d != 2){
                               b = preloadItem.b;
                               if (b >= null && b < preloadItem.a.size()) {
                                  i = (preloadItem.b == (preloadItem.a.size() + i))? 0: preloadItem.b + 1;
                               }
                               objArray = preloadItem.a.get(i);
                            }
                            if (objArray != null) {
                               f project = obj3.a.getProject();
                               a.m(project);
                               obj3.f = project.n(objArray).observeOn(d.a).doOnSubscribe(new c(obj3, objArray)).doFinally(new d(obj3)).doOnNext(new e(obj3)).doOnComplete(new f(obj3)).subscribe(g.b, new h(obj3));
                            }
                         }
                      }
                   }
                }else if(obj1 instanceof VideoTemplateLoadingCompleteAction){
                   if (obj1.getApplyStyle()) {
                      VideoTemplate template = obj1.getTemplate();
                      String id1 = (template != null)? template.getId(): objArray;
                      obj2 = e.c(this, id1, obj2, (obj1.getNeedOnSelectedCallback() ^ 0x01), false, 8, null);
                   }
                }else if(obj1 instanceof VideoTemplateChangedAction){
                   if (obj1.getItem().g()) {
                      Iterator iterator = obj.b.m().iterator();
                      while (iterator.hasNext()) {
                         a uoa1 = iterator.next();
                         Objects.requireNonNull(uoa1, "null cannot be cast to non-null type com.yxcorp.gifshow.editor.aicutv2.ui.item.VideoTemplateUIItem");
                         if (uoa1.g()) {
                            i = i1;
                         }
                         i1 = i1 + i2;
                      }
                      i3 = i;
                   }else {
                      i3 = obj.b.m().indexOf(obj1.getItem());
                   }
                   obj2 = b.a(obj2, null, false, false, null, null, i3, false, false, false, null, 0, false, 0, null, obj1.getItem().g(), false, 0xbfdf, null);
                }else if(obj1 instanceof VideoTemplatePanelDetachAction){
                   if (!obj1.getSaveChanges()) {
                      obj2 = e.c(this, obj1.getOriginTemplateId(), obj2, false, true, 4, null);
                   }
                   obj.b.c();
                }else if(obj1 instanceof VideoTemplateClearAction){
                   obj.b.d();
                   obj2 = b.a(obj2, null, false, false, null, null, 0, false, false, false, null, 0, false, 0, null, false, false, 0xbfff, null);
                }else if(obj1 instanceof VideoTemplateClearCancelAction){
                   obj.b.c();
                }else if(obj1 instanceof VideoTemplateDestroyAction){
                   obj.b.z();
                }else if(obj1 instanceof AICutLastSelectedSubItemIdUpdateAction){
                   obj2 = b.a(obj2, null, false, false, null, null, 0, false, false, false, null, 0, false, 0, obj1.getId(), false, false, 0xdfff, null);
                }else if(obj1 instanceof AICutFocusNotifyAction){
                   obj2 = b.a(obj2, null, false, false, null, null, 0, false, false, false, null, 0, false, 0, null, obj1.getHasFocus(), false, 0xbfff, null);
                }else if(obj1 instanceof AICutSubItemLoadingNotifyAction){
                   obj2 = b.a(obj2, null, false, false, null, null, 0, false, false, false, null, 0, false, 0, null, false, obj1.isLoading(), 0x7fff, null);
                }else if(obj1 instanceof AICutIgnoreLoadingItemCallbackAction){
                   obj1 = obj.b.m().iterator();
                   while (true) {
                      if (obj1.hasNext()) {
                         uoa = obj1.next();
                         if (uoa instanceof g && uoa.g()) {
                            objArray = uoa;
                         }
                      }
                      if (objArray != null) {
                         objArray.l(i2);
                      }
                      e b1 = obj.b;
                      Objects.requireNonNull(b1);
                      uob = b.class;
                      if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i1), b1, uob, "4")) {
                         b1.c.a(new PostListComponentResetItemLoadingAction(i1));
                      }
                      b uob1 = obj.b.n();
                      Objects.requireNonNull(uob1, str);
                      uob1.n(i2);
                      break ;
                   }
                }
             }
          }
       }
       return obj2;
    }
}
