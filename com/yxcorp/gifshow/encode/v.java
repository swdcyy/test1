package com.yxcorp.gifshow.encode.v;
import java.lang.Runnable;
import com.yxcorp.gifshow.encode.w;
import java.io.File;
import com.kwai.feature.post.api.feature.encode.model.PostEncodeInfo;
import java.lang.String;
import com.kwai.video.editorsdk2.ExportTask;
import com.yxcorp.gifshow.postwork.PostWorkInfo;
import com.yxcorp.gifshow.encode.EncodeManager$d;
import java.lang.Object;
import java.util.Objects;
import java.lang.StringBuilder;
import dnc.x0;
import com.yxcorp.gifshow.encode.EncodeManager;
import com.yxcorp.gifshow.upload.UploadInfo;
import qkd.b;
import dq.a;
import q87.c;
import com.yxcorp.gifshow.util.PostUtils;
import java.io.IOException;
import mca.a;
import java.lang.Throwable;
import lnc.i1;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import com.kwai.video.editorsdk2.EncodedSegmentInfo;
import pca.l0;
import ekd.k1;

public final class v implements Runnable	// class@000d54
{
    public final w b;
    public final File c;
    public final PostEncodeInfo d;
    public final File e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final ExportTask j;
    public final PostWorkInfo k;
    public final ExportTask l;
    public final EncodeManager$d m;
    public final long n;
    public final long o;

    public void v(w p0,File p1,PostEncodeInfo p2,File p3,boolean p4,boolean p5,boolean p6,String p7,ExportTask p8,PostWorkInfo p9,ExportTask p10,EncodeManager$d p11,long p12,long p13){
       int i = this;
       super();
       i.b = p0;
       i.c = p1;
       i.d = p2;
       i.e = p3;
       i.f = p4;
       i.g = p5;
       i.h = p6;
       i.i = p7;
       i.j = p8;
       i.k = p9;
       i.l = p10;
       i.m = p11;
       i.n = p12;
       i.o = p13;
    }
    public final void run(){
       v ov3;
       v ov4;
       v ov6;
       v ov7;
       boolean b1;
       v ov = this;
       v b = ov.b;
       v c = ov.c;
       v d = ov.d;
       v e = ov.e;
       v f = ov.f;
       v g = ov.g;
       v h = ov.h;
       v i = ov.i;
       v j = ov.j;
       v m = ov.m;
       v n = ov.n;
       v ov1 = ov.l;
       v ov2 = ov.k;
       v o = ov.o;
       Objects.requireNonNull(b);
       if (!c.exists()) {
          b.a = "Temp file does not exist: "+c.getAbsolutePath();
       }else if(!c.isFile()){
          b.a = "Temp file is not a file";
       }else {
          ov4 = null;
          if (!c.length() - ov4) {
             b.a = "Temp file returns 0 length";
          }else {
             v ov5 = n;
             String str = "EncodeManager";
             if (b.k.q().b(d, null)) {
                ov6 = m;
                File uFile = b.Y(e.getParentFile(), e.getName(), ".temp");
                a uoa = a.D();
                ov7 = o;
                String str1 = "targetTempFile: "+uFile.getAbsolutePath()+" exists: "+uFile.exists();
                Object[] objArray = new Object[0];
                try{
                   uoa.w(str, str1, objArray);
                   PostUtils.c(c, uFile);
                   if (!uFile.exists()) {
                      b.a = "Target temp file does not exist";
                   }else if(e.exists() && !b.q(e)){
                      b.a = "Failed to delete existing target file \(1\)";
                   }else if(!b.k0(uFile, e)){
                      b.a = "Failed to rename target temp file to target file";
                   }else {
                      b1 = true;
                   label_0175 :
                      if (!e.exists()) {
                         b.a = "Target file does not exist";
                      }else if(!e.length() - ov4){
                         b.a = "Target file is empty";
                      }else if(d.mKtvInfo != null){
                         w k = b.k;
                         Objects.requireNonNull(k);
                         EncodeInfo obj = PatchProxy.applyOneRefs(d, k, EncodeManager.class, "57");
                         if (obj != PatchProxyResult.class) {
                            b1 = obj.booleanValue();
                         }else {
                            try{
                               obj = d.mKtvInfo;
                               if (obj.isSinglePicSongMode()) {
                                  File uFile1 = new File(d.getAudioOutputPath());
                                  uFile = new File(obj.mOutputAudioPath);
                                  if (k.q().b(d, null)) {
                                     PostUtils.c(uFile1, uFile);
                                     if (!uFile.exists() || uFile.length() - ov4 <= 0) {
                                        b1 = false;
                                     }
                                  }else {
                                     b1 = b.k0(uFile1, uFile);
                                  }
                               }
                            }catch(java.lang.Exception e0){
                            }
                         }
                      }
                      Object[] objArray1 = new Object[0];
                      a.D().w(str, "finalizeEncoding, task.isTranscodeSkipped\(\):"+f+"  task.isWholeFileSegment\(\):"+g+"  useWholeFileUpload:"+h, objArray1);
                      if (f == null && (h != null || g != null)) {
                         ov3 = ov5;
                         ov = ov6;
                         f = ov1;
                         ov4 = ov7;
                         ov1 = j;
                         b.k.q().u(i, null, j.getLinuxFileDescriptor(), true, ov2, null);
                      label_023e :
                         l0 ol0 = new l0(b, f, d, ov, i, ov3, ov4, ov1, ov2);
                         k1.o(c);
                         return;
                      }
                   }
                }catch(java.io.IOException e0){
                   b.a = "IOException while copying temp file "+e0.getMessage();
                }
             }else {
                try{
                   ov6 = m;
                   ov7 = o;
                   if (e.exists() && !b.q(e)) {
                      b.a = "Failed to delete existing target file \(2\)";
                   }else {
                      Object[] objArray2 = new Object[0];
                      a.D().w(str, "isTranscodeSkipped: "+f+",exportVersion: "+a.o(), objArray2);
                      if (f != null) {
                         b1 = true;
                         if (a.o() <= b1) {
                            PostUtils.c(c, e);
                            goto label_0175 ;
                         }
                      }else {
                         b1 = true;
                      }
                      if (!b.k0(c, e)) {
                         b.a = "Failed to rename temp file to target file";
                      }else {
                         goto label_0175 ;
                      }
                   }
                }catch(java.io.IOException e0){
                   Throwable throwable = e0;
                   i1.c(throwable);
                   b.a = "IOException while copying temp file "+throwable.getMessage();
                }
             }
          }
       }
       ov3 = n;
       ov = m;
       ov4 = o;
       f = ov1;
    label_0049 :
       ov1 = j;
       goto label_023e ;
    }
}
