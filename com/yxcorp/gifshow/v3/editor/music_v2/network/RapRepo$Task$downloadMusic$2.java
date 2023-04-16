package com.yxcorp.gifshow.v3.editor.music_v2.network.RapRepo$Task$downloadMusic$2;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.yxcorp.gifshow.v3.editor.music_v2.network.RapRepo$Task;
import java.util.List;
import java.lang.String;
import com.kuaishou.android.model.music.Music;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ftd.k0;
import qrd.l1;
import csd.b;
import ftd.r0;
import java.io.File;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Collection;
import kotlinx.coroutines.CoroutineDispatcher;
import ftd.z0;
import com.yxcorp.gifshow.v3.editor.music_v2.network.RapRepo$Task$downloadMusic$2$defferMusic$1;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.a;
import java.lang.StringBuilder;
import j80.g;
import com.yxcorp.gifshow.v3.editor.music_v2.network.RapRepo$Task$downloadMusic$2$saveLyricJob$1;
import java.lang.Boolean;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import dsd.a;

public final class RapRepo$Task$downloadMusic$2 extends SuspendLambda implements p	// class@0010b5
{
    public final List $cdnUrls;
    public final String $lyric;
    public final Music $music;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public boolean Z$0;
    public int label;
    public k0 p$;
    public final RapRepo$Task this$0;

    public void RapRepo$Task$downloadMusic$2(RapRepo$Task p0,List p1,String p2,Music p3,c p4){
       this.this$0 = p0;
       this.$cdnUrls = p1;
       this.$lyric = p2;
       this.$music = p3;
       super(2, p4);
    }
    public final c create(Object p0,c p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, RapRepo$Task$downloadMusic$2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       RapRepo$Task$downloadMusic$2 task$downloa = new RapRepo$Task$downloadMusic$2(this.this$0, this.$cdnUrls, this.$lyric, this.$music, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, RapRepo$Task$downloadMusic$2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       RapRepo$Task$downloadMusic$2 tL$1;
       RapRepo$Task$downloadMusic$2 tL$0;
       boolean b;
       StringBuilder obj = PatchProxy.applyOneRefs(p0, this, RapRepo$Task$downloadMusic$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       RapRepo$Task$downloadMusic$2 tlabel = this.label;
       int i = 2;
       RapRepo$Task$downloadMusic$2 task$downloa = 1;
       if (tlabel != null) {
          if (tlabel != task$downloa) {
             if (tlabel == i) {
                j0.n(p0);
             label_00e7 :
                return p0;
             }else {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
             }
          }else {
             tlabel = this.L$3;
             task$downloa = this.L$2;
             tL$1 = this.L$1;
             tL$0 = this.L$0;
             j0.n(p0);
          }
       }else {
          j0.n(p0);
          tL$0 = this.p$;
          int i1 = 0;
          if (!TextUtils.isEmpty(this.$lyric)) {
             p0 = this.$cdnUrls;
             if (p0 != null && (p0.isEmpty() ^ task$downloa) == task$downloa) {
                tL$1 = a.b(tL$0, z0.f(), null, new RapRepo$Task$downloadMusic$2$defferMusic$1(this, i1), 2, null);
                p0 = g.c(this.$lyric+".lyric");
                a.o(p0, "KwaiFileUtil.getVideoCacheFile\(\"$lyric.lyric\"\)");
                if (this.$lyric != null) {
                   r0 or0 = a.b(tL$0, z0.f(), null, new RapRepo$Task$downloadMusic$2$saveLyricJob$1(this, p0, i1), 2, null);
                   this.L$0 = tL$0;
                   this.L$1 = tL$1;
                   this.L$2 = p0;
                   this.L$3 = or0;
                   this.label = task$downloa;
                   File obj1 = or0.C(this);
                   if (obj1 == obj) {
                      return obj;
                   }else {
                      obj1 = p0;
                      p0 = obj1;
                   }
                }else {
                   throw new IllegalArgumentException("rap:lyric: is null ");
                }
             }
          }
          obj = "rap:lyric:";
          RapRepo$Task$downloadMusic$2 t$lyric = this.$lyric;
          Integer integer = (t$lyric != null)? a.f(t$lyric.length()): i1;
          obj = obj+integer+" \n cdnUrls :";
          t$lyric = this.$cdnUrls;
          if (t$lyric != null) {
             i1 = a.f(t$lyric.size());
          }
          throw new IllegalArgumentException(obj+i1);
       }
       b = p0.booleanValue();
       if (b) {
          this.$music.mMmuLrcUrl = task$downloa.getAbsolutePath();
       }
       this.$music.mMmuLyrics = this.$lyric;
       this.L$0 = tL$0;
       this.L$1 = tL$1;
       this.L$2 = task$downloa;
       this.L$3 = tlabel;
       this.Z$0 = b;
       this.label = i;
       b = tL$1.C(this);
       if (b == obj) {
          return obj;
       }else {
          goto label_00e7 ;
       }
    }
}
