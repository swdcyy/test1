package com.yxcorp.gifshow.v3.editor.music_v2.network.RapRepo$Task$downloadMusic$2$saveLyricJob$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.yxcorp.gifshow.v3.editor.music_v2.network.RapRepo$Task$downloadMusic$2;
import java.io.File;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ftd.k0;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.music_v2.network.RapRepo$Task;
import java.lang.Boolean;
import faa.a;
import w46.b;
import okio.m;
import okio.l;
import okio.c;
import cud.j;
import java.io.Closeable;
import java.lang.Throwable;
import isd.b;
import com.yxcorp.gifshow.util.PostUtils;
import dsd.a;
import java.lang.IllegalStateException;

public final class RapRepo$Task$downloadMusic$2$saveLyricJob$1 extends SuspendLambda implements p	// class@0010b4
{
    public final File $file;
    public int label;
    public k0 p$;
    public final RapRepo$Task$downloadMusic$2 this$0;

    public void RapRepo$Task$downloadMusic$2$saveLyricJob$1(RapRepo$Task$downloadMusic$2 p0,File p1,c p2){
       this.this$0 = p0;
       this.$file = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       RapRepo$Task$downloadMusic$2$saveLyricJob$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, RapRepo$Task$downloadMusic$2$saveLyricJob$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new RapRepo$Task$downloadMusic$2$saveLyricJob$1(this.this$0, this.$file, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, RapRepo$Task$downloadMusic$2$saveLyricJob$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       RapRepo$Task$downloadMusic$2 obj = PatchProxy.applyOneRefs(p0, this, RapRepo$Task$downloadMusic$2$saveLyricJob$1.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       b.h();
       if (this.label != null) {
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
       j0.n(p0);
       p0 = this.this$0;
       obj = p0.this$0;
       p0 = p0.$lyric;
       RapRepo$Task$downloadMusic$2$saveLyricJob$1 t$file = this.$file;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyTwoRefs(p0, t$file, obj, RapRepo$Task.class, "6");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          int i = 1;
          if (t$file.exists() && (!t$file.delete() && !t$file.createNewFile())) {
             Object[] objArray = new Object[0];
             a.D().t("RapRepo", "create  lyric file failed", objArray);
             patchProxyRe = 0;
          }else {
             patchProxyRe = 1;
          }
          Object obj2 = null;
          try{
             c uoc = l.c(l.i(t$file, 0, i, obj2));
             uoc.writeUtf8(p0);
             b.a(uoc, obj2);
             b = patchProxyRe;
          }catch(java.lang.Exception e8){
             PostUtils.D("RapRepo", "request start error", e8);
             a.D().e("RapRepo", "save lyric  failed", e8);
             b = false;
          }
       }
    }
}
