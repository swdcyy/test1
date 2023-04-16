package kaa.u;
import kaa.w;
import jaa.d;
import jaa.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kaa.u$a;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.edit.draft.Workspace$b;
import java.lang.Enum;
import com.kuaishou.edit.draft.Asset;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.edit.draft.Asset$b;
import com.kuaishou.edit.draft.AssetSegment;
import com.kuaishou.edit.draft.AssetSegment$b;
import java.io.File;
import ekd.b0;
import com.yxcorp.gifshow.util.BitmapUtil;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite;
import haa.f;
import java.lang.StringBuilder;
import q87.c;

public class u extends w	// class@002c38
{
    public final d a;

    public void u(){
       super();
       this.a = new d(2, 9, 38);
    }
    public d a(){
       return this.a;
    }
    public void b(c p0){
       Object[] objArray;
       Asset$b uob1;
       Object[] objArray1;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, u.class, "1")) {
          return;
       }
       super.b(p0);
       c a = obj1.a;
       int i = u$a.a[a.getType().ordinal()];
       if (i != 1 && (i != 2 && i != 3)) {
          return;
       }
       int i1 = 0;
       while (i1 < a.getAssetsCount()) {
          Asset assets = a.getAssets(i1);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          double d = PatchProxy.applyTwoRefs(obj1, assets, obj, u.class, "2");
          if (d != patchProxyRe) {
          }else {
             d = 0;
             Asset$b uob = d;
             int i2 = 0;
             File uFile = null;
             while (i2 < assets.getAssetSegmentCount()) {
                AssetSegment assetSegment = assets.getAssetSegment(i2);
                GeneratedMessageLite$Builder uBuilder = PatchProxy.applyTwoRefs(obj1, assetSegment, obj, u.class, "3");
                if (uBuilder != patchProxyRe) {
                }else if(assetSegment.getOriginPicWidth() - uFile > 0 && assetSegment.getOriginPicHeight() - uFile > 0){
                   uFile = new File(obj1.c, assetSegment.getFile());
                   if (uFile.exists()) {
                      b0 uob0 = BitmapUtil.E(uFile.getAbsolutePath());
                      if (uob0.a > null && uob0.b > null) {
                         uBuilder = assetSegment.toBuilder();
                         uBuilder.g((double)uob0.a);
                         uBuilder.f((double)uob0.b);
                      }else {
                         objArray = new Object[0];
                         f.D().A("Migrator2938", "no valid asset segment size: "+uob0, objArray);
                      }
                   }else {
                      objArray = new Object[0];
                      f.D().A("Migrator2938", "no valid asset segment file: "+uFile, objArray);
                   }
                }
                uBuilder = d;
                if (uBuilder != null) {
                   if (uob == null) {
                      uob = assets.toBuilder();
                   }
                   uob.e(i2, uBuilder);
                }
                i2 = i2 + 1;
             }
             if (assets.getOriginPicWidth() - uFile > 0 && assets.getOriginPicHeight() - uFile > 0) {
                d = uob;
             }else if(uob == null){
                uob1 = assets.toBuilder();
             }else {
                uob1 = uob;
             }
             File uFile1 = new File(obj1.c, assets.getFile());
             if (uFile1.exists()) {
                b0 uob01 = BitmapUtil.E(uFile1.getAbsolutePath());
                b0 a1 = uob01.a;
                if (a1 > null && uob01.b > null) {
                   uob1.p((double)a1);
                   uob1.o((double)uob01.b);
                   d = uob1;
                }else {
                   objArray1 = new Object[0];
                   f.D().A("Migrator2938", "no valid asset size: "+uob01, objArray1);
                }
             }else {
                objArray1 = new Object[0];
                f.D().A("Migrator2938", "no valid asset file: "+uFile1, objArray1);
             }
          }
          if (d != null) {
             a.g(i1, d);
          }
          i1 = i1 + 1;
       }
       return;
    }
}
