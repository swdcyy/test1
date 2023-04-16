package com.yxcorp.gifshow.edit.previewer.loaderv2.w;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hba.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import eba.a;
import uaa.a;
import maa.a;
import com.kwai.robust.PatchProxyResult;
import android.util.Pair;
import java.util.ArrayList;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.yxcorp.gifshow.edit.previewer.utils.KtvEditUtils;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import java.lang.Boolean;
import java.util.List;
import java.util.Iterator;
import com.kuaishou.edit.draft.Text;
import com.yxcorp.gifshow.edit.previewer.loaderv2.v;
import com.yxcorp.gifshow.edit.previewer.loaderv2.v$a;
import com.kuaishou.edit.draft.Workspace$Source;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import wba.b;
import rba.c;
import com.yxcorp.gifshow.edit.previewer.utils.d;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import qba.c;
import lnc.s6;
import java.util.Collection;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import java.lang.Integer;
import java.lang.Math;

public class w extends a	// class@001b54
{
    public a$a h;
    public a i;
    public a j;
    public a k;
    public a l;
    public d m;
    public int n;
    public int o;

    public void w(){
       super();
    }
    public void c(a$a p0,Object[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, w.class, "1")) {
          return;
       }
       this.h = p0;
       this.m = p0.f;
       this.i = this.a.W0();
       this.j = this.a.U0();
       this.k = this.a.E0();
       this.l = this.a.o0();
       return;
    }
    public void d(){
       boolean b;
       int b1;
       Object[] objArray1;
       EditorSdk2V2$AnimatedSubAsset uAnimatedSub;
       w ow = w.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ow, "3")) {
          return;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Pair pair = PatchProxy.apply(objArray, this, ow, "4");
       if (pair != patchProxyRe) {
       }else {
          ArrayList uArrayList = new ArrayList();
          Workspace$Type type = this.a.a1();
          int i = 0;
          if (type == Workspace$Type.KTV_SONG && (this.l.p() > 1 || KtvEditUtils.c(this.a))) {
             w ti = this.i;
             v obj = PatchProxy.applyOneRefs(ti, objArray, DraftUtils.class, "60");
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else if(ti == null){
                Iterator iterator2 = ti.z().iterator();
                while (true) {
                   if (iterator2.hasNext()) {
                      if (iterator2.next().hasSubtitleExtraParam()) {
                         b = true;
                         break ;
                      }
                   }
                }
             }
             b = false;
             if (!b) {
                obj = new v();
                v$a uoa = new v$a();
                uoa.a = uArrayList;
                Workspace$Type kTV_SONG = Workspace$Type.KTV_SONG;
                b1 = (type != kTV_SONG)? true: false;
                uoa.b = b1;
                if (this.a.T0() != Workspace$Source.REEDIT && (type == Workspace$Type.KTV_MV || type == kTV_SONG)) {
                   objArray1 = new Object[]{uoa,this.a.E0()};
                   obj.b(this.h, objArray1);
                }else {
                   objArray1 = new Object[]{uoa};
                   obj.b(this.h, objArray1);
                }
                obj.e(1);
             }
          }
          a ta = this.a;
          Pair pair1 = d.g(this.d, ta, true, false, false, b.m(ta, this.b));
          Iterator iterator = pair1.second.iterator();
          while (iterator.hasNext()) {
             uAnimatedSub = iterator.next();
             if (b.v(uAnimatedSub.opaque()) && uAnimatedSub.renderType() != this.h.c.a()) {
                uAnimatedSub.setRenderType(this.h.c.a());
             }
          }
          if (s6.i()) {
             iterator = pair1.second.iterator();
             while (iterator.hasNext()) {
                uAnimatedSub = iterator.next();
                if (b.p(uAnimatedSub.opaque()) && (uAnimatedSub.renderType() != this.h.c.a() && (this.a.T0() != Workspace$Source.REEDIT || !b.q(uAnimatedSub.opaque())))) {
                   uAnimatedSub.setRenderType(this.h.c.a());
                }
             }
          }
          uArrayList.addAll(pair1.second);
          if (!uArrayList.isEmpty()) {
             EditorSdk2V2$AnimatedSubAsset[] uAnimatedSub1 = (this.b.animatedSubAssets().isNotEmpty())? this.b.animatedSubAssets().toNormalArray(): new EditorSdk2V2$AnimatedSubAsset[i];
             EditorSdk2V2$AnimatedSubAsset[] uAnimatedSub2 = new EditorSdk2V2$AnimatedSubAsset[(uAnimatedSub1.length + uArrayList.size())];
             int i1 = -1;
             b1 = uAnimatedSub1.length;
             for (; i < b1; i = i + 1) {
                i1 = i1 + 1;
                uAnimatedSub2[i1] = uAnimatedSub1[i];
             }
             Iterator iterator1 = uArrayList.iterator();
             while (iterator1.hasNext()) {
                i1 = i1 + 1;
                uAnimatedSub2[i1] = iterator1.next();
             }
             this.b.setAnimatedSubAssets(uAnimatedSub2);
          }
          pair = pair1.first;
       }
       this.o = pair.first.intValue();
       this.n = (s6.i())? Math.max(this.o, pair.second.intValue()): pair.second.intValue();
       return;
    }
    public void f(EditorSdk2V2$VideoEditorProject p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, w.class, "2")) {
          return;
       }
       EditorSdk2V2$AnimatedSubAsset[] uAnimatedSub = new EditorSdk2V2$AnimatedSubAsset[0];
       p0.setAnimatedSubAssets(uAnimatedSub);
       return;
    }
    public int g(){
       return 1;
    }
}
