package com.kuaishou.post.story.entrance.vm.MoodTemplateViewModel;
import androidx.lifecycle.ViewModel;
import com.kuaishou.post.story.entrance.repo.MoodTemplateRepo;
import com.kuaishou.post.story.entrance.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import di0.b;
import com.kuaishou.post.story.entrance.vm.MoodTemplateViewModel$mMoodTemplateList$1;
import msd.p;
import di0.b$a;
import crd.a;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Collection;
import com.kuaishou.post.story.entrance.data.MoodTemplateUiData;
import rp4.a;
import java.lang.StringBuilder;
import q87.c;
import com.kuaishou.post.story.entrance.data.MoodTemplateData;
import kotlin.Pair;
import vp4.b;
import brd.a0;
import com.kuaishou.post.story.entrance.vm.MoodTemplateViewModel$e;
import erd.a;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$PostTaskState;
import nsd.u;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.kuaishou.post.story.entrance.d$a;
import java.lang.Number;
import androidx.lifecycle.LiveData;
import com.kuaishou.kotlin.livedata.ListHolder;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import brd.t;
import com.kuaishou.post.story.entrance.vm.MoodTemplateViewModel$a;
import erd.o;
import com.kuaishou.post.story.entrance.vm.MoodTemplateViewModel$b;
import com.kuaishou.post.story.entrance.vm.MoodTemplateViewModel$c;
import com.kuaishou.post.story.entrance.vm.MoodTemplateViewModel$d;
import erd.g;
import crd.b;

public final class MoodTemplateViewModel extends ViewModel	// class@000b77
{
    public final MutableLiveData a;
    public final MutableLiveData b;
    public final b c;
    public final MutableLiveData d;
    public final MutableLiveData e;
    public final MutableLiveData f;
    public final MutableLiveData g;
    public final MutableLiveData h;
    public final a i;
    public MoodTemplateUiData j;
    public final boolean k;
    public final boolean l;
    public final MoodTemplateRepo m;
    public final e n;

    public void MoodTemplateViewModel(MoodTemplateRepo p0,e p1){
       boolean b;
       a.p(p0, "moodTemplateRepo");
       a.p(p1, "storyMoodContext");
       super();
       this.m = p0;
       this.n = p1;
       this.a = new MutableLiveData();
       this.b = new MutableLiveData();
       this.c = b.a.a(p0.m(), MoodTemplateViewModel$mMoodTemplateList$1.INSTANCE);
       this.d = new MutableLiveData();
       this.e = new MutableLiveData();
       this.f = new MutableLiveData();
       this.g = new MutableLiveData();
       this.h = new MutableLiveData();
       this.i = new a();
       this.k = PostExperimentUtils.r();
       Objects.requireNonNull(p0);
       p1 = PatchProxy.apply(null, p0, MoodTemplateRepo.class, "15");
       b = (p1 != PatchProxyResult.class)? p1.booleanValue(): p0.t.isEmpty() ^ 0x01;
       this.l = b;
       return;
    }
    public static boolean C0(MoodTemplateViewModel p0,MoodTemplateUiData p1,boolean p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = true;
       }
       return p0.A0(p1, p2);
    }
    public static void p0(MoodTemplateViewModel p0,String p1,byte[] p2,int p3,Object p4){
       p0.o0(p1, null);
    }
    public final boolean A0(MoodTemplateUiData p0,boolean p1){
       String obj;
       MoodTemplateViewModel moodTemplate = MoodTemplateViewModel.class;
       if (PatchProxy.isSupport(moodTemplate)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, moodTemplate, "18");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "moodTemplateUiData");
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("MoodTemplateViewModel", "realChooseRemoteTemplate moodTemplateUiData:"+p0+", "+"stateful:"+p1+", mAttemptSelectedTemplate:"+this.j, objArray);
       moodTemplate = this.j;
       obj = (moodTemplate != null)? moodTemplate.n(): null;
       if (a.g(obj, p0.n()) ^ 1) {
          return i;
       }else if(p1){
          this.a.setValue(new Pair(p0, Boolean.TRUE));
       }
       p1.j = p0.q();
       p1.k = p0;
       return 1;
    }
    public final void D0(boolean p0){
       this.n.e.d = p0;
    }
    public final a0 E0(boolean p0){
       MoodTemplateViewModel moodTemplate = MoodTemplateViewModel.class;
       if (PatchProxy.isSupport(moodTemplate)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, moodTemplate, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0) {
          this.h.setValue(Boolean.TRUE);
       }
       a0 uoa0 = this.m.r(p0).m(new MoodTemplateViewModel$e(this, p0));
       a.o(uoa0, "moodTemplateRepo.waitAll¡­lue = false\n      }\n    }");
       return uoa0;
    }
    public final void o0(String p0,byte[] p1){
       MoodTemplateUiData moodTemplate = this;
       Object obj = p0;
       if (PatchProxy.applyVoidTwoRefs(obj, p1, moodTemplate, MoodTemplateViewModel.class, "13")) {
          return;
       }
       a.p(obj, "localPicturePath");
       Object[] objArray = new Object[0];
       a.D().w("MoodTemplateViewModel", "chooseRemoteTemplate localPicturePath:"+obj, objArray);
       String str = "MoodTemplateViewModel";
       String str1 = "chooseRemoteTemplate localPicturePath:";
       MoodTemplateData moodTemplate1 = new MoodTemplateData(p0, "LOCAL_PICTURE_TEMPLATE_NAME", null, null, p0, null, 2, 0, 0, 0, null, null, null, null, null, 0, 2, 0, 0, false, 0xeffac, null);
       MoodTemplateUiData moodTemplate2 = new MoodTemplateUiData(v13);
       moodTemplate.j = moodTemplate2;
       MoodTemplateViewModel n = moodTemplate.n;
       n.k = moodTemplate2;
       n.j = moodTemplate2.q();
       moodTemplate.a.setValue(null);
       moodTemplate.b.setValue(moodTemplate2);
       byte[] uobyteArray = p1;
       if (uobyteArray) {
          VideoContext videoContext = new VideoContext();
          videoContext.k0(uobyteArray);
          moodTemplate.n.g.a = videoContext;
       }
       Object[] objArray1 = new Object[0];
       a.D().w(str, str1+p0+", "+"localPictureTemplateData:"+moodTemplate2, objArray1);
       return;
    }
    public final void q0(){
       if (PatchProxy.applyVoid(null, this, MoodTemplateViewModel.class, "7")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("MoodTemplateViewModel", "closeRemoteTemplatePanel", objArray);
       this.f.setValue(Boolean.FALSE);
       return;
    }
    public final int r0(MoodTemplateUiData p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MoodTemplateViewModel.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 == null) {
          return -1;
       }
       int i = 0;
       ListHolder value = this.c.getValue();
       if (value != null) {
          List list = value.c();
          if (list != null) {
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                if (a.g(iterator.next().n(), p0.n())) {
                   return i;
                }
                i = i + 1;
             }
          }
       }
       return i;
    }
    public final void s0(){
       if (PatchProxy.applyVoid(null, this, MoodTemplateViewModel.class, "3")) {
          return;
       }
       if (this.n.m == null) {
          this.i.c(t.timer(500, TimeUnit.MILLISECONDS, d.c).flatMap(MoodTemplateViewModel$a.b).map(MoodTemplateViewModel$b.b).subscribe(new MoodTemplateViewModel$c(this), MoodTemplateViewModel$d.b));
       }
       return;
    }
    public final MutableLiveData t0(){
       return this.e;
    }
    public final MutableLiveData u0(){
       return this.a;
    }
    public final MutableLiveData v0(){
       return this.g;
    }
    public final MutableLiveData w0(){
       return this.h;
    }
    public final MutableLiveData x0(){
       return this.f;
    }
    public final boolean y0(){
       e uoe = PatchProxy.apply(null, this, MoodTemplateViewModel.class, "12");
       if (uoe != PatchProxyResult.class) {
       }else {
          uoe = this.n.n;
          a.o(uoe, "storyMoodContext.mFromCopyText");
       }
       return uoe.booleanValue();
    }
    public final boolean z0(){
       return this.n.m;
    }
}
