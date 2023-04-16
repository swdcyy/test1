package com.yxcorp.gifshow.record.album.i;
import erd.g;
import com.yxcorp.gifshow.record.album.LocalAlbumFragmentV2;
import m8c.e;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.yxcorp.gifshow.record.album.LocalAlbumUtils;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import java.util.Map;
import com.yxcorp.gifshow.record.album.model.d;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.record.album.model.c;
import com.yxcorp.gifshow.publish.ShareProject;
import k8c.a;
import q87.c;
import com.yxcorp.gifshow.record.album.g;
import hn6.a$a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.model.mix.SameFrameInfo;
import qr4.i;
import qr4.m$k0;
import qr4.m$c0;
import java.lang.Integer;
import java.lang.NumberFormatException;
import com.kuaishou.android.model.music.Music;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;

public final class i implements g	// class@00172a
{
    public final LocalAlbumFragmentV2 b;
    public final e c;

    public void i(LocalAlbumFragmentV2 p0,e p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       VideoContext videoContext1;
       i tb = this.b;
       i tc = this.c;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          tb.Ef(tc);
       }else {
          p0 = LocalAlbumUtils.class;
          if (!PatchProxy.applyVoidOneRefs(tc, tb, LocalAlbumFragmentV2.class, "22")) {
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             VideoContext videoContext = PatchProxy.applyOneRefs(tc, tb, LocalAlbumFragmentV2.class, "23");
             i obj = null;
             if (videoContext != patchProxyRe) {
             }else {
                videoContext = tb.F.get(tc);
                if (videoContext == null) {
                   videoContext = PatchProxy.applyOneRefs(tc, obj, p0, "31");
                   if (videoContext != patchProxyRe) {
                   }else if(tc instanceof d){
                      videoContext1 = tc.k().d1();
                   }else {
                      videoContext1 = tc.k().j();
                   }
                   videoContext = videoContext1;
                   if (videoContext != null) {
                      tb.F.put(tc, videoContext);
                   }
                }
             }
             int i = 0;
             if (videoContext == null) {
                Object[] objArray = new Object[i];
                a.D().w("ks://LocalAlbumFragmentV2", "onLaunchSameFrameActivity videoContext is null", objArray);
             }else {
                g og = new g(tb, tc);
                if (!PatchProxy.applyVoidTwoRefs(og, videoContext, obj, p0, "30")) {
                   p0 = new a$a();
                   String str = videoContext.N();
                   int i1 = 1;
                   if (TextUtils.x(str) ^ i1) {
                      SameFrameInfo sameFrameInf = new SameFrameInfo();
                      sameFrameInf.mAllowSameFrame = i1;
                      obj = videoContext.a.b;
                      if (obj != null) {
                         m$k0 t = obj.t;
                         if (t != null) {
                            i = t.c;
                         }
                      }
                      sameFrameInf.mCurrentDepth = i;
                      try{
                         sameFrameInf.mAvailableDepth = Integer.parseInt(str);
                      }catch(java.lang.NumberFormatException e0){
                         e0.printStackTrace();
                      }
                      p0.g(sameFrameInf);
                   }else {
                      SameFrameInfo sameFrameInf1 = new SameFrameInfo();
                      sameFrameInf1.mAllowSameFrame = i1;
                      p0.g(sameFrameInf1);
                   }
                   Music music = videoContext.B();
                   if (music == null) {
                      music = videoContext.K();
                   }
                   if (music != null) {
                      p0.f(music);
                   }
                   try{
                      og.accept(p0);
                   }catch(java.lang.Exception e7){
                      PostUtils.D("LocalAlbumUtils", "outputFileAction", e7);
                   }
                }
             }
          }
       }
    }
}
