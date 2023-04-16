package com.yxcorp.gifshow.encode.a0;
import erd.o;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Object;
import android.util.Pair;
import com.yxcorp.gifshow.encode.s0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import java.lang.Float;
import gq.a;
import q87.c;
import com.kwai.feature.post.api.feature.encode.model.PostEncodeInfo;
import tkd.b;
import tkd.d;
import f0c.t;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace;
import java.io.File;
import laa.m0;
import com.kwai.feature.post.api.feature.encode.model.AtlasInfo;
import java.util.List;
import com.kuaishou.edit.draft.Workspace$Type;
import java.lang.IllegalStateException;
import qaa.a;
import haa.a;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import pca.z0;
import com.yxcorp.gifshow.encode.j0;

public final class a0 implements o	// class@000d0b
{
    public final c b;
    public final boolean c;
    public final boolean d;

    public void a0(c p0,boolean p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       t ot;
       a0 tb = this.b;
       a0 tc = this.c;
       a0 td = this.d;
       if (PatchProxy.isSupport(s0.class)) {
          ot = PatchProxy.applyFourRefs(p0, tb, Boolean.valueOf(tc), Boolean.valueOf(td), null, s0.class, "32");
          if (ot != PatchProxyResult.class) {
          }else {
          label_002b :
             VideoContext videoContext = null;
             if (p0.first == null) {
                ot = t.just(new Pair(videoContext, Float.valueOf((p0.second.floatValue() * 0x3f000000))));
             }else {
                Object[] objArray = new Object[0];
                a.D().w("EncodingUtils", "prepareOutputFile from encode info", objArray);
                p0 = p0.first;
                AtlasInfo uAtlasInfo = d.a(-273232199).xr(tb.v(), tb.f0());
                if (uAtlasInfo != null && uAtlasInfo.mMixedType == 2) {
                   p0 = s0.e(uAtlasInfo.mDonePictures, s0.o(tb.v(), tc, td, ".jpg"), tc);
                }else if(tb.v().getType() == Workspace$Type.SINGLE_PICTURE){
                   p0 = s0.j(tb.v(), tc);
                   if (p0 == null) {
                      throw new IllegalStateException("export single image from draft exception");
                   }
                }else {
                   File uFile = s0.o(tb.v(), tc, td, ".mp4");
                   File uFile1 = (td != null)? s0.n(a.f(tb)): videoContext;
                   File uFile2 = new File(p0.getOutputPath());
                   if (tc != null) {
                      videoContext = tb.d1();
                   }
                   p0 = s0.i(uFile2, uFile, uFile1, tc, videoContext).map(new z0(uFile));
                }
                ot = p0.flatMap(j0.b);
             }
          }
       }else {
          goto label_002b ;
       }
       return ot;
    }
}
