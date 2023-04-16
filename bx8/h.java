package bx8.h;
import java.util.concurrent.Callable;
import bx8.j;
import java.util.List;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import vaa.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;
import com.kuaishou.edit.draft.Kuaishan;
import com.kuaishou.edit.draft.KuaishanAsset;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.Collection;
import ekd.q;
import com.kuaishou.edit.draft.AuditFrame;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.io.File;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class h implements Callable	// class@000476
{
    public final j b;
    public final List c;

    public void h(j p0,List p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object call(){
       Object[] objArray1;
       h tb = this.b;
       h tc = this.c;
       Objects.requireNonNull(tb);
       ArrayList uArrayList = PatchProxy.applyOneRefs(tc, tb, j.class, "8");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          a uoa = tb.a.F0();
          HashSet hashSet = new HashSet();
          ArrayList uArrayList1 = new ArrayList();
          Iterator iterator = tc.iterator();
          while (iterator.hasNext()) {
             Iterator iterator1 = iterator.next().getAssetsList().iterator();
             while (iterator1.hasNext()) {
                KuaishanAsset kuaishanAsse = iterator1.next();
                String assetId = kuaishanAsse.getAssetId();
                Object[] objArray = new Object[0];
                a.b().s("AuditInfoUploadManager", "filterKSAsset: assetId: "+assetId, objArray);
                if (hashSet.contains(assetId)) {
                   objArray1 = new Object[0];
                   a.b().s("AuditInfoUploadManager", "current assetId already fetched.", objArray1);
                }else {
                   List auditFrameLi = kuaishanAsse.getAuditFrameList();
                   if (q.f(auditFrameLi)) {
                      objArray1 = new Object[0];
                      a.b().s("AuditInfoUploadManager", "filterKSAsset auditFrameList is empty", objArray1);
                   }else {
                      int i = 0;
                      while (i < auditFrameLi.size()) {
                         File uFile = DraftFileManager.E().B(auditFrameLi.get(i).getFile(), uoa);
                         if (uFile == null) {
                            objArray = new Object[0];
                            a.b().s("AuditInfoUploadManager", "frameFile is null", objArray);
                         }else {
                            uArrayList1.add(uFile.getAbsolutePath());
                         }
                         i = i + 1;
                      }
                      if (!TextUtils.x(assetId)) {
                         hashSet.add(assetId);
                      }
                   }
                }
             }
          }
          uArrayList = uArrayList1;
       }
       return uArrayList;
    }
}
