package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateSwitchAssetAction;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateAction;
import buc.j;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import androidx.lifecycle.ViewModelProvider;
import com.yxcorp.gifshow.v3.framework.KSStore;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState;
import crd.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ytc.h;
import java.util.Objects;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import qrd.l1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.util.List;
import java.util.Iterator;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$b;
import uwc.c;
import androidx.lifecycle.ViewModel;
import java.util.Map;
import uwc.a;
import qsc.e;
import t36.f;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateSwitchAssetAction$a;
import t36.f$a;
import uwc.b;
import com.yxcorp.gifshow.v3.previewer.player.viewmodel.PicturesViewModel;
import tvc.e;
import java.lang.Iterable;
import java.util.ArrayList;
import trd.u;
import java.io.File;
import java.util.Collection;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$e;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$ResourceState;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate;
import buc.b;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$a;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$c;

public final class PicTemplateSwitchAssetAction extends PicTemplateAction	// class@00137f
{
    public final j asset;
    public final boolean byUser;

    public void PicTemplateSwitchAssetAction(j p0,boolean p1){
       a.p(p0, "asset");
       super();
       this.asset = p0;
       this.byUser = p1;
    }
    public void PicTemplateSwitchAssetAction(j p0,boolean p1,int p2,u p3){
       if (p2 & 0x02) {
          p1 = true;
       }
       super(p0, p1);
       return;
    }
    public final j getAsset(){
       return this.asset;
    }
    public final boolean getByUser(){
       return this.byUser;
    }
    public b handle(ViewModelProvider p0,KSStore p1,PicTemplateState p2){
       h a;
       int i;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, PicTemplateSwitchAssetAction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "vmp");
       a.p(p1, "store");
       a.p(p2, "state");
       if (this.byUser != null) {
          a = h.a;
          i = p2.m();
          Objects.requireNonNull(a);
          h oh = h.class;
          if (!PatchProxy.isSupport(oh) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), a, oh, "8")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "CLICK_PICTURE";
             i3 oi3 = i3.f();
             int i1 = 1;
             oi3.c("picture_index", Integer.valueOf((i + i1)));
             uElementPack.params = oi3.e();
             u1.u(i1, uElementPack, null);
          }
       }
       i = 0;
       Iterator iterator = p2.d().iterator();
       while (true) {
          if (iterator.hasNext()) {
             if (a.g(iterator.next().getId(), this.asset.getId())) {
             label_0093 :
                if (i != -1 && !p2.d().get(i).f()) {
                   ViewModel viewModel = p0.get(c.class);
                   a.o(viewModel, "get\(T::class.java\)");
                   f.p0(viewModel.t0(), e.class).s0(new PicTemplateSwitchAssetAction$a(i));
                   ViewModel viewModel1 = p0.get(b.class);
                   a.o(viewModel1, "get\(T::class.java\)");
                   if (i != -1 && viewModel1.q0() != i) {
                      viewModel1.n(i);
                      break ;
                   }
                }
                break ;
             }else {
                i = i + 1;
             }
          }else {
             i = -1;
             goto label_0093 ;
          }
       }
       return null;
    }
    public b handle(ViewModelProvider p0,KSStore p1,e p2){
       return this.handle(p0, p1, p2);
    }
    public PicTemplateState reduce(PicTemplateState p0){
       String str1;
       List list1;
       PicTemplateState$b uob1;
       b a;
       Object obj = this;
       PicTemplateState picTemplateS = p0;
       Iterator obj1 = PatchProxy.applyOneRefs(picTemplateS, obj, PicTemplateSwitchAssetAction.class, "2");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       a.p(picTemplateS, "state");
       obj1 = p0.d().iterator();
       while (true) {
          String str = null;
          if (obj1.hasNext()) {
             str1 = obj1.next();
             if (!a.g(str1.getId(), obj.asset.getId())) {
                continue ;
             }
          }else {
             str1 = str;
          }
          if (str1 != null) {
             PicTemplateState$b uob = p0.l();
             String id = (uob != null)? uob.getId(): str;
             List list = 10;
             if (a.g(id, str1.getId())) {
                list1 = p0.d();
             }else {
                list1 = p0.d();
                ArrayList uArrayList2 = new ArrayList(u.Y(list1, list));
                obj1 = list1.iterator();
                while (obj1.hasNext()) {
                   uob1 = obj1.next();
                   if (a.g(uob1.getId(), str1.getId())) {
                      uob1 = PicTemplateState$b.a(uob1, null, null, true, null, null, null, 59, null);
                   }else if(uob1.f()){
                      uob1 = PicTemplateState$b.a(uob1, null, null, false, null, null, null, 59, null);
                   }
                   uArrayList2.add(uob1);
                }
                list1 = uArrayList2;
             }
             int i = 0;
             int i1 = 0;
             uob1 = p0.l();
             String id1 = (uob1 != null)? uob1.getId(): str;
             if (a.g(id1, str1.getId())) {
                list = p0.r();
             }else {
                List list2 = p0.r();
                ArrayList uArrayList = new ArrayList(u.Y(list2, list));
                Iterator iterator = list2.iterator();
                while (iterator.hasNext()) {
                   PicTemplateState$e uoe = iterator.next();
                   id1 = uoe.getId();
                   j oj = str1.e();
                   String id2 = (oj != null)? oj.getId(): str;
                   if (a.g(id1, id2)) {
                      uoe = PicTemplateState$e.a(uoe, null, null, 0, false, true, null, false, null, false, 495, null);
                   }else if(uoe.h()){
                      uoe = PicTemplateState$e.a(uoe, null, null, 0, false, false, null, false, null, false, 495, null);
                   }
                   uArrayList.add(uoe);
                }
                ArrayList uArrayList1 = uArrayList;
             }
             id1 = 0;
             int i2 = 0;
             int i3 = 0;
             a = b.a;
             int i4 = 1;
             int i5 = a.a(p0.h(), (obj.byUser ^ i4));
             int i6 = p0.f();
             str1 = str1.getId();
             PicTemplateState$b uob2 = p0.l();
             if (uob2 != null) {
                str = uob2.getId();
             }
             picTemplateS = PicTemplateState.a(p0, list1, i, i1, list, id1, i2, i3, i5, a.a(i6, (a.g(str1, str) ^ i4)), a.a(p0.i(), (obj.byUser ^ i4)), a.a(p0.g(), i4), null, null, null, 0x3876, null);
             break ;
          }
          break ;
       }
       return picTemplateS;
    }
    public e reduce(e p0){
       return this.reduce(p0);
    }
}
