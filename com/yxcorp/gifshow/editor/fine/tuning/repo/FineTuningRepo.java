package com.yxcorp.gifshow.editor.fine.tuning.repo.FineTuningRepo;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.editor.fine.tuning.repo.FineTuningRepo$mFineTuningViewDataList$2;
import msd.a;
import qrd.p;
import qrd.s;
import di0.b;
import com.kuaishou.kotlin.livedata.ListHolder;
import nsd.u;
import com.google.common.collect.ImmutableList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.edit.draft.Workspace$Type;
import maa.a;
import haa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import wba.p;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Integer;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import java.util.ArrayList;
import androidx.lifecycle.LiveData;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import gca.a;
import wba.z;
import com.kuaishou.edit.draft.AssetSegment;
import com.kuaishou.edit.draft.FineTuningParam;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.FineTuningParam$b;

public final class FineTuningRepo	// class@001baa
{
    public final p a;
    public final b b;
    public final c c;

    public void FineTuningRepo(c p0){
       a.p(p0, "workspaceDraft");
       super();
       this.c = p0;
       this.a = s.c(FineTuningRepo$mFineTuningViewDataList$2.INSTANCE);
       this.b = new b(null, 1, null);
    }
    public static void e(FineTuningRepo p0,int p1,int p2,int p3,Object p4){
       if (p3 & 2) {
          p2 = 2;
       }
       p0.d(p1, p2);
       return;
    }
    public final ImmutableList a(){
       Object obj = PatchProxy.apply(null, this, FineTuningRepo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public final boolean b(){
       Object obj = PatchProxy.apply(null, this, FineTuningRepo.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.c.a1() == Workspace$Type.SINGLE_PICTURE)? true: false;
       return b;
    }
    public final void c(boolean p0){
       FineTuningRepo uFineTuningR = FineTuningRepo.class;
       if (PatchProxy.isSupport(uFineTuningR) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uFineTuningR, "7")) {
          return;
       }
       if (p0) {
          a.c(this.c).f();
          FineTuningRepo tc = this.c;
          Workspace$Type type = tc.a1();
          a.o(type, "workspaceDraft.type");
          p.a.e(tc, type);
       }else {
          a.c(this.c).j();
       }
       Object[] objArray = new Object[0];
       a.D().w("FineTuningRepo", "saveOrDiscardDraft isSave:"+p0, objArray);
       return;
    }
    public final void d(int p0,int p1){
       List list;
       int i1;
       FineTuningRepo uFineTuningR = FineTuningRepo.class;
       if (PatchProxy.isSupport(uFineTuningR) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uFineTuningR, "3")) {
          return;
       }
       if (!this.b.v()) {
          i1.c(new RuntimeException("updateItemFineTuningParam error item list is empty "+"pictureIndex:"+p0+", size:"+this.b.v()));
          return;
       }else {
          ListHolder value = this.b.getValue();
          if (value != null) {
             list = value.c();
             if (list != null) {
             label_0066 :
                Iterator iterator = new ArrayList(list).iterator();
                int i = 0;
                i1 = 0;
                while (iterator.hasNext()) {
                   a uoa = iterator.next();
                   GeneratedMessageLite generatedMes = z.y(this.c).get(p0).getFineTuningParam().toBuilder().build();
                   a.o(generatedMes, "PictureDraftUtils\n      ¡­Param.toBuilder\(\).build\(\)");
                   uoa.c(generatedMes);
                   a.o(uoa, "it");
                   this.b.y(i1, uoa, Integer.valueOf(p1));
                   i1 = i1 + 1;
                }
                Object[] objArray = new Object[i];
                a.D().w("FineTuningRepo", "updateItemFineTuningParam pictureIndex:"+p0+", index:"+i1, objArray);
                return;
             }
          }
          list = new ArrayList();
          goto label_0066 ;
       }
    }
}
