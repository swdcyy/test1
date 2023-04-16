package buc.i;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import buc.i$a;
import nsd.u;
import xvc.f;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState;
import tvc.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Arrays;
import tvc.e;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import buc.d;
import buc.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import crd.b;
import androidx.lifecycle.ViewModel;
import xvc.b;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateAction;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateDraftAction;
import xvc.g;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.util.PostUtils;
import com.kuaishou.edit.draft.Workspace$Type;
import java.util.List;
import wba.z;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.edit.draft.AssetSegment;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$b;
import java.io.File;
import buc.j;
import com.kuaishou.edit.draft.Template;
import buc.a;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$ResourceState;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$a;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$c;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$e;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate;
import com.yxcorp.gifshow.v3.EditorItemFunc;

public final class i extends EditReduxViewModel	// class@00049b
{
    public final d l;
    public final h m;
    public b n;
    public static final i$a o;

    static {
       i.o = new i$a(null);
    }
    public void i(f p0,PicTemplateState p1,c[] p2){
       a.p(p0, "editRepo");
       a.p(p1, "initState");
       a.p(p2, "middlewares");
       super(true, p0, p1, Arrays.copyOf(p2, p2.length), null, 16, null);
       this.l = new d();
       this.m = new h();
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, i.class, "3")) {
          return;
       }
       i tn = this.n;
       if (tn != null) {
          tn.dispose();
       }
       super.onCleared();
       return;
    }
    public e v0(b p0,e p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, i.class, str);
       if (obj != patchProxyRe) {
       }else {
          obj = "action";
          a.p(p0, obj);
          a.p(p1, "oldState");
          i tm = this.m;
          Objects.requireNonNull(tm);
          Object obj1 = PatchProxy.applyTwoRefs(p0, p1, tm, h.class, str);
          if (obj1 != patchProxyRe) {
             obj = obj1;
          }else {
             a.p(p0, obj);
             a.p(p1, "oldState");
             if (p0 instanceof PicTemplateAction) {
                p1 = p0.reduce(p1);
             }else if(p0 instanceof PicTemplateDraftAction){
                p1 = p0.reduce(p1);
             }
             obj = p1;
          }
       }
       return obj;
    }
    public e w0(g p0,e p1){
       int i;
       PicTemplateState$b obj7;
       PicTemplateState$b uob;
       String str1;
       String id;
       String id1;
       String id2;
       Object obj = this;
       c obj1 = p0;
       Object obj2 = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj3 = PatchProxy.applyTwoRefs(obj1, obj2, obj, i.class, "2");
       if (obj3 != patchProxyRe) {
       }else {
          obj3 = "draftState";
          a.p(obj1, obj3);
          String str = "oldState";
          a.p(obj2, str);
          i l = obj.l;
          Objects.requireNonNull(l);
          List obj4 = PatchProxy.applyTwoRefs(obj1, obj2, l, d.class, "1");
          if (obj4 != patchProxyRe) {
             obj2 = obj4;
          }else {
             a.p(obj1, obj3);
             a.p(obj2, str);
             obj1 = p0.i();
             if (obj1 == null) {
                PostUtils.F("PicTemplateMapper", "workspace draft is null");
             }else {
                Workspace$Type type = obj1.a1();
                a.o(type, "workspaceDraft.type");
                PicTemplateState$ResourceState resourceStat = null;
                List list = null;
                obj4 = null;
                boolean b = false;
                boolean b1 = false;
                boolean b2 = false;
                Object obj5 = null;
                List list1 = z.x(Workspace$Type.ATLAS, obj1);
                ArrayList uArrayList = new ArrayList(u.Y(list1, 10));
                Iterator iterator = list1.iterator();
                i = 0;
                while (iterator.hasNext()) {
                   Object obj6 = iterator.next();
                   int i1 = i + 1;
                   if (i < 0) {
                      CollectionsKt__CollectionsKt.W();
                   }
                   Iterator iterator1 = obj2.d().iterator();
                   while (true) {
                      if (iterator1.hasNext()) {
                         obj7 = iterator1.next();
                         if (a.g(obj7.getId(), obj6.getIdentifier())) {
                         label_00b3 :
                            Object obj8 = obj7;
                            if (obj8 != null) {
                               uob = PicTemplateState$b.a(obj8, null, new File(z.f(obj6)), false, null, null, null, 61, null);
                            }else {
                               Template atlasTemplat = obj6.getAtlasTemplate();
                               a.o(atlasTemplat, "assetSegment.atlasTemplate");
                               String templateId = atlasTemplat.getTemplateId();
                               a.o(templateId, "it");
                               a uoa = (templateId.length() > 0)? 1: null;
                               if (!uoa) {
                                  templateId = null;
                               }
                               a uoa1 = (templateId != null)? new a(templateId): null;
                               str1 = obj6.getIdentifier();
                               a.o(str1, "assetSegment.identifier");
                               boolean b3 = (i == obj2.m())? true: false;
                               obj7 = new PicTemplateState$b(str1, new File(z.f(obj6)), b3, null, uoa1, uoa1);
                            }
                            uArrayList.add(uob);
                            i = i1;
                            str1 = 10;
                         }else {
                            str1 = 10;
                         }
                      }else {
                         obj7 = 0;
                         goto label_00b3 ;
                      }
                   }
                }
                obj5 = obj2;
                PicTemplateState picTemplateS = PicTemplateState.a(obj2, uArrayList, resourceStat, list, obj4, b, b1, b2, 0, 0, 0, 0, obj5, type, null, 0x2ffe, null);
                PicTemplateState$b uob1 = picTemplateS.l();
                if (uob1 != null) {
                   j oj = uob1.e();
                   if (oj != null) {
                      id = oj.getId();
                   label_0163 :
                      PicTemplateState$b uob2 = obj5.l();
                      if (uob2 != null) {
                         j oj1 = uob2.e();
                         if (oj1 != null) {
                            id1 = oj1.getId();
                         label_0176 :
                            if (a.g(id, id1) ^ 0x01) {
                               list1 = obj5.r();
                               uArrayList = new ArrayList(u.Y(list1, 10));
                               iterator = list1.iterator();
                               while (iterator.hasNext()) {
                                  PicTemplateState$e uoe = iterator.next();
                                  obj3 = uoe.getId();
                                  PicTemplateState$b uob3 = picTemplateS.l();
                                  if (uob3 != null) {
                                     j oj2 = uob3.e();
                                     if (oj2 != null) {
                                        id2 = oj2.getId();
                                     label_01bb :
                                        if (a.g(obj3, id2) && !uoe.h()) {
                                           uoe = PicTemplateState$e.a(uoe, null, null, 0, false, true, null, false, null, false, 495, null);
                                        }else {
                                           obj3 = uoe.getId();
                                           uob3 = picTemplateS.l();
                                           if (uob3 != null) {
                                              oj2 = uob3.e();
                                              if (oj2 != null) {
                                                 id2 = oj2.getId();
                                              label_01ef :
                                                 int i2 = a.g(obj3, id2) ^ 0x01;
                                                 if (i2 && uoe.h()) {
                                                    uoe = PicTemplateState$e.a(uoe, null, null, 0, false, false, null, false, null, false, 495, null);
                                                 }
                                              }
                                           }
                                           id2 = null;
                                           goto label_01ef ;
                                        }
                                        uArrayList.add(uoe);
                                     }
                                  }
                                  id2 = null;
                                  goto label_01bb ;
                               }
                               obj2 = PicTemplateState.a(picTemplateS, null, null, null, uArrayList, false, false, false, 0, 0, 0, 0, null, null, null, 0x3ff7, null);
                            }else {
                               obj2 = picTemplateS;
                            }
                         }
                      }
                      id1 = null;
                      goto label_0176 ;
                   }
                }
                id = null;
                goto label_0163 ;
             }
          }
          obj3 = obj2;
       }
       return obj3;
    }
    public EditorItemFunc y0(){
       return EditorItemFunc.PIC_TEMPLATE_V2;
    }
}
