package bx8.g;
import java.util.concurrent.Callable;
import bx8.j;
import java.io.File;
import java.util.List;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import com.kuaishou.edit.draft.Asset;
import com.kuaishou.edit.draft.Asset$ShootInfo;
import f66.i;
import jq.a;
import q87.c;
import java.lang.System;
import com.kuaishou.edit.draft.AuditFrame;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.lang.CharSequence;
import com.yxcorp.gifshow.util.PostUtils;
import qkd.b;
import java.lang.StringBuilder;
import java.lang.Throwable;
import java.util.ArrayList;

public final class g implements Callable	// class@000475
{
    public final j b;
    public final File c;
    public final List d;

    public void g(j p0,File p1,List p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object call(){
       g og = this;
       g b = og.b;
       g c = og.c;
       g d = og.d;
       Objects.requireNonNull(b);
       ArrayList uArrayList = PatchProxy.applyTwoRefs(c, d, b, j.class, "9");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          File uFile = new File(c, "verify_1");
          if (!uFile.exists()) {
             uFile.mkdirs();
          }
          File uFile1 = new File(c, "verify_0");
          if (!uFile1.exists()) {
             uFile1.mkdirs();
          }
          int i = 0;
          try{
             Iterator iterator = d.iterator();
             int i1 = 0;
             try{
                while (iterator.hasNext()) {
                   Asset$ShootInfo shootInfo = iterator.next().getShootInfo();
                   if (!shootInfo.getAuditFrameCount() && !shootInfo.getMagicFaceAttributeFrameCount()) {
                      Object[] objArray = new Object[i];
                      a.b().s("AuditInfoUploadManager", "extractframe count is 0", objArray);
                   }else {
                      long l = System.currentTimeMillis();
                      Iterator iterator1 = shootInfo.getMagicFaceAttributeFrameList().iterator();
                      String str = "_";
                      while (iterator1.hasNext()) {
                         AuditFrame uAuditFrame = iterator1.next();
                         File uFile2 = DraftFileManager.E().B(uAuditFrame.getFile(), b.a);
                         if (uFile2 != null && uFile2.exists()) {
                            if ((uFile2.getName()).contains(str)) {
                               PostUtils.c(uFile2, new File(uFile, String.valueOf(l)));
                            }else {
                               b.i(uFile2, uFile);
                            }
                            i1 = 1;
                         }
                         uFile2 = DraftFileManager.E().B(uAuditFrame.getJsonFile(), b.a);
                         if (uFile2 != null && uFile2.exists()) {
                            if ((uFile2.getName()).contains(str)) {
                               PostUtils.c(uFile2, new File(uFile, l+".json"));
                               l = l + 1;
                            }else {
                               b.i(uFile2, uFile);
                            }
                         }
                         DraftFileManager uDraftFileMa = null;
                      }
                      Iterator iterator2 = shootInfo.getAuditFrameList().iterator();
                      while (iterator2.hasNext()) {
                         File uFile3 = DraftFileManager.E().B(iterator2.next().getFile(), b.a);
                         if (uFile3 != null && uFile3.exists()) {
                            if ((uFile3.getName()).contains(str)) {
                               PostUtils.c(uFile3, new File(uFile1, String.valueOf(l)));
                               l = l + 1;
                            }else {
                               b.i(uFile3, uFile1);
                            }
                            i1 = 1;
                         }else {
                            j oj = 1;
                            continue ;
                         }
                      }
                      b.h = shootInfo.getFrameEncryptStartIndex();
                      b.i = shootInfo.getFrameEncryptLength();
                      i = 0;
                   }
                }
                ArrayList uArrayList1 = new ArrayList(2);
                if (i1) {
                   uArrayList1.add(uFile.getPath());
                   uArrayList1.add(uFile1.getPath());
                }
                uArrayList = uArrayList1;
             }catch(java.io.IOException e0){
                i = i1;
             }
             a.b().r("AuditInfoUploadManager", "copyFileError, ", e0);
             i1 = i;
             goto label_0167 ;
          }catch(java.io.IOException e0){
             i = 0;
             goto label_015d ;
          }
       }
       return uArrayList;
    }
}
