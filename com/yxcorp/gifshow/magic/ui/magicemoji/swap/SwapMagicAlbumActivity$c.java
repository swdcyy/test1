package com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMagicAlbumActivity$c;
import erd.o;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMagicAlbumActivity;
import kotlin.jvm.internal.Ref$IntRef;
import java.lang.Object;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.io.File;
import com.yxcorp.gifshow.models.EmptyQMedia;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMagicAlbumActivity$a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.feature.post.api.feature.kuaishan.model.KSAssetExportInfo;
import kotlin.Pair;
import java.lang.Integer;
import brd.t;
import java.util.List;
import com.kwai.feature.post.api.feature.kuaishan.model.KSAssetExportInfo$Size;
import w26.c;
import lnc.x6;
import lnc.y6;
import trd.t;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.e;

public final class SwapMagicAlbumActivity$c implements o	// class@001c1b
{
    public final SwapMagicAlbumActivity b;
    public final Ref$IntRef c;

    public void SwapMagicAlbumActivity$c(SwapMagicAlbumActivity p0,Ref$IntRef p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       QMedia qMedia1;
       KSAssetExportInfo kSAssetExpor;
       t ot = PatchProxy.applyOneRefs(p0, this, SwapMagicAlbumActivity$c.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "media");
          String str = "SwapMagicAlbumActivity";
          Log.b(str, "index:"+this.c.element+" media:"+p0+", clipPath:"+p0.mExportFilePath);
          SwapMagicAlbumActivity$c tc = this.c;
          Ref$IntRef element = tc.element;
          tc.element = element + 1;
          int i = 100;
          String str1 = "clipIndex:";
          if (p0.isVideo()) {
             QMedia path = p0.path;
             File uFile = (path == null || !path.length())? 1: null;
             if (uFile || (new File(p0.path).exists() && !p0 instanceof EmptyQMedia)) {
                Iterator iterator = this.b.W.iterator();
                while (true) {
                   QMedia qMedia = null;
                   if (iterator.hasNext()) {
                      qMedia1 = iterator.next();
                      QMedia qMedia2 = qMedia1.b();
                      qMedia2 = (qMedia2 != null)? qMedia2.path: qMedia;
                      if (!TextUtils.n(qMedia2, p0.path)) {
                         continue ;
                      }
                   }else {
                      qMedia1 = qMedia;
                   }
                   StringBuilder str2 = str1+element+" info.media:";
                   QMedia qMedia3 = (qMedia1 != null)? qMedia1.b(): qMedia;
                   str2 = str2+qMedia3+", "+"clipPath:";
                   if (qMedia1 != null) {
                      qMedia3 = qMedia1.b();
                      if (qMedia3 != null) {
                         qMedia3 = qMedia3.mExportFilePath;
                      label_00d6 :
                         Log.b(str, str2+qMedia3);
                         if (qMedia1 != null && (qMedia1.d == null && qMedia1.a() != null)) {
                            qMedia3 = qMedia1.b();
                            String str3 = "";
                            if (qMedia3 != null) {
                               qMedia3 = qMedia3.mExportFilePath;
                               if (qMedia3 != null) {
                               label_00fc :
                                  if (new File(qMedia3).exists()) {
                                     str2 = "info ";
                                     qMedia3 = qMedia1.b();
                                     qMedia3 = (qMedia3 != null)? qMedia3.path: qMedia;
                                     str2 = str2+qMedia3+" has cropped, clipPath:";
                                     qMedia3 = qMedia1.b();
                                     if (qMedia3 != null) {
                                        qMedia = qMedia3.mExportFilePath;
                                     }
                                     Log.b(str, str2+qMedia);
                                     path = qMedia1.b();
                                     if (path != null) {
                                        path = path.mExportFilePath;
                                        if (path != null) {
                                           str3 = path;
                                        }
                                     }
                                     p0.mExportFilePath = str3;
                                     ot = t.just(new Pair(Integer.valueOf(element), Integer.valueOf(i)));
                                     break ;
                                  }
                               }
                            }
                            str1 = str3;
                            goto label_00fc ;
                         }
                      label_0153 :
                         if (qMedia1 != null) {
                            qMedia = qMedia1.a();
                         }
                         if (qMedia != null) {
                            kSAssetExpor = qMedia1.a();
                            a.m(kSAssetExpor);
                         }else {
                            kSAssetExpor = this.b.z3(p0, element);
                         }
                         KSAssetExportInfo kSAssetExpor1 = kSAssetExpor;
                         if (qMedia1 != null) {
                            path = qMedia1.b();
                            if (path != null) {
                               p0.mClipStart = path.mClipStart;
                               p0.mExportPositionX = path.mExportPositionX;
                               p0.mExportPositionY = path.mExportPositionY;
                            }
                         }
                         Log.b(str, "media clip, index:"+element+", start:"+p0.mClipStart+", duration:"+p0.mClipDuration+", width:"+kSAssetExpor1.mAssetExportSizeList.get(0).mWidth+", height:"+kSAssetExpor1.mAssetExportSizeList.get(0).mHeight);
                         x6 ox6 = y6.r(c.class);
                         a.m(ox6);
                         ot = ox6.RT(t.k(p0), kSAssetExpor1, true, true, false).map(new e(element));
                         break ;
                      }
                   }
                   qMedia3 = qMedia;
                   goto label_00d6 ;
                }
             }
          }
       label_01eb :
          Log.b(str, str1+element+", media "+p0+" is empty or not video, continue");
          ot = t.just(new Pair(Integer.valueOf(element), Integer.valueOf(i)));
       }
       return ot;
    }
}
