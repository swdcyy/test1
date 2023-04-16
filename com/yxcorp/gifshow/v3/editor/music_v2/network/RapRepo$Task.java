package com.yxcorp.gifshow.v3.editor.music_v2.network.RapRepo$Task;
import com.yxcorp.gifshow.v3.editor.music_v2.network.RapRepo;
import trc.t0;
import brd.v;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.music.Music;
import java.util.List;
import asd.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.music_v2.network.RapRepo$Task$downloadMusic$2;
import msd.p;
import ftd.l0;
import android.media.MediaMetadataRetriever;
import java.lang.Integer;
import java.util.Objects;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Collection;
import com.yxcorp.gifshow.model.CDNUrl;
import njd.a;
import kotlin.Pair;
import trc.x0;
import com.yxcorp.gifshow.v3.editor.music_v2.network.RapRepo$Task$queryRapResult$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import kotlinx.coroutines.c;
import trc.n0;
import faa.a;
import java.lang.StringBuilder;
import com.google.gson.JsonElement;
import q87.c;
import trc.m0;

public final class RapRepo$Task	// class@0010b8
{
    public final t0 a;
    public final v b;
    public final RapRepo c;

    public void RapRepo$Task(RapRepo p0,t0 p1,v p2){
       a.p(p1, "rapStyleInfo");
       a.p(p2, "emitter");
       this.c = p0;
       super();
       this.a = p1;
       this.b = p2;
    }
    public final Object a(Music p0,String p1,List p2,c p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, RapRepo$Task.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       RapRepo$Task$downloadMusic$2 task$downloa = new RapRepo$Task$downloadMusic$2(this, p2, p1, p0, null);
       return l0.g(obj, p3);
    }
    public final void b(Music p0,t0 p1){
       Object obj;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RapRepo$Task.class, "3")) {
          return;
       }
       int i = 0;
       if (p0 != null && p0.mPath != null) {
          MediaMetadataRetriever mediaMetadat = new MediaMetadataRetriever();
          mediaMetadat.setDataSource(p0.mPath);
          String str = mediaMetadat.extractMetadata(9);
          int i1 = (str != null)? Integer.parseInt(str): 0;
          p0.mDuration = i1;
       }
       RapRepo$Task tc = this.c;
       Objects.requireNonNull(tc);
       List list = PatchProxy.applyOneRefs(p1, tc, RapRepo.class, "10");
       if (list != PatchProxyResult.class) {
       }else {
          a.p(p1, "rapStyleInfo");
          Iterator iterator = tc.e.iterator();
          while (true) {
             if (iterator.hasNext()) {
                obj = iterator.next();
                Object obj1 = (obj.e() == p1.e())? 1: null;
                if (!obj1) {
                   continue ;
                }
             }else {
                obj = null;
             }
             if (obj != null) {
                list = obj.a();
             }else {
                list = null;
             }
          }
       }
       if (list != null && (list.isEmpty() ^ 1)) {
          if (p0) {
             p0.mAvatarUrl = list.get(i).mUrl;
          }
          if (p0 != null) {
             p0.mCoverPath = list.get(i).mUrl;
          }
          if (p0 != null) {
             CDNUrl[] uCDNUrlArray = new CDNUrl[i];
             Object[] objArray = list.toArray(uCDNUrlArray);
             Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
             p0.mAvatarUrls = objArray;
          }
       }
       return;
    }
    public final v c(){
       return this.b;
    }
    public final t0 d(){
       return this.a;
    }
    public final Pair e(a p0){
       x0 obj = PatchProxy.applyOneRefs(p0, this, RapRepo$Task.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.a();
       int i = 1;
       if (obj.b() || !(obj.a().isEmpty() ^ i)) {
          i = 0;
       }
       Pair pair = null;
       if (!i) {
          Pair pair1 = pair;
       }
       if (p0 != null) {
          pair = new Pair(p0.a().lyric, p0.a().a());
       }
       return pair;
    }
    public final Object f(a p0,String p1,float p2,int p3,c p4){
       RapRepo$Task$queryRapResult$1 task$queryRa;
       RapRepo$Task$queryRapResult$1 i$0;
       RapRepo$Task$queryRapResult$1 f$0;
       RapRepo$Task$queryRapResult$1 task$queryRa1;
       RapRepo$Task$queryRapResult$1 l$1;
       if (p4 instanceof RapRepo$Task$queryRapResult$1) {
          task$queryRa = p4;
          RapRepo$Task$queryRapResult$1 label = task$queryRa.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             task$queryRa.label = label - i;
          label_0018 :
             RapRepo$Task$queryRapResult$1 result = task$queryRa.result;
             Object obj = b.h();
             RapRepo$Task$queryRapResult$1 label1 = task$queryRa.label;
             if (label1 != null) {
                if (label1 != 1) {
                   if (label1 == 2) {
                      j0.n(result);
                   label_0095 :
                      p0 = a.D();
                      p1 = "query result: ";
                      JsonElement jsonElement = result.i();
                      String str = (jsonElement != null)? jsonElement.toString(): null;
                      Object[] objArray = new Object[0];
                      p0.s("RapRepo", p1+str, objArray);
                      return new Pair(result.a().lyric, result.a().audioUrls);
                   }else {
                      throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                   }
                }else {
                   i$0 = task$queryRa.I$0;
                   f$0 = task$queryRa.F$0;
                   task$queryRa1 = task$queryRa.L$2;
                   l$1 = task$queryRa.L$1;
                   label1 = task$queryRa.L$0;
                   j0.n(result);
                }
             }else {
                j0.n(result);
                task$queryRa.L$0 = this;
                task$queryRa.L$1 = p0;
                task$queryRa.L$2 = p1;
                task$queryRa.F$0 = p2;
                task$queryRa.I$0 = p3;
                task$queryRa.label = 1;
                if (c.a((long)(p0.a().b() * (float)1000), task$queryRa) == obj) {
                   return obj;
                }else {
                   RapRepo$Task task = this;
                }
             }
             task$queryRa.L$0 = label1;
             task$queryRa.L$1 = l$1;
             task$queryRa.L$2 = task$queryRa1;
             task$queryRa.F$0 = f$0;
             task$queryRa.I$0 = i$0;
             task$queryRa.label = 2;
             result = label1.c.c().a(task$queryRa1, i$0, f$0, task$queryRa);
             if (result == obj) {
                return obj;
             }else {
                goto label_0095 ;
             }
          }
       }
       task$queryRa = new RapRepo$Task$queryRapResult$1(this, p4);
       goto label_0018 ;
    }
}
