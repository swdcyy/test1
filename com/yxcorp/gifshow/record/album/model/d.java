package com.yxcorp.gifshow.record.album.model.d;
import m8c.e;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Object;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace;
import java.util.Objects;
import java.io.File;
import com.kwai.feature.post.api.reedit.ReEditAfterDeleteOperator;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kwai.feature.post.api.reedit.PublishedBackUpInfo;
import lnc.p3;
import java.lang.StringBuilder;
import q87.c;
import haa.f;
import m8c.k;
import java.util.concurrent.Callable;
import laa.m0;
import t45.d;
import brd.z;
import m8c.h;
import erd.a;
import m8c.j;
import erd.o;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import java.lang.Number;
import com.kuaishou.edit.draft.Workspace$Source;
import com.kuaishou.edit.draft.Workspace$Type;
import java.lang.Double;
import com.kuaishou.edit.draft.Attributes;
import com.google.protobuf.Timestamp;
import wba.z;
import com.kuaishou.edit.draft.Asset;
import com.kuaishou.edit.draft.c;
import wba.h;
import java.util.List;
import com.kuaishou.edit.draft.AssetSegment;
import k8c.a;

public class d implements e	// class@00173f
{
    public double a;
    public c b;
    public boolean c;

    public void d(c p0){
       super();
       this.c = false;
       this.b = p0;
    }
    public t a(){
       ReEditAfterDeleteOperator d;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       File obj = PatchProxy.apply(null, this, d.class, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       Workspace workspace = this.b.v();
       Objects.requireNonNull(workspace);
       obj = DraftFileManager.E().I(workspace);
       String str = this.b.V0();
       d = ReEditAfterDeleteOperator.d;
       String str1 = this.b.D0();
       Objects.requireNonNull(d);
       Object[] obj1 = PatchProxy.applyOneRefs(str1, d, ReEditAfterDeleteOperator.class, "14");
       int i = 0;
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          a.p(str1, "draftId");
          PublishedBackUpInfo publishedBac = d.c(str1);
          if (publishedBac != null) {
             Object[] objArray = new Object[i];
             p3.D().w("ReEditAfterDeleteOperator", "isNotExpiredAsPublishedBackup: publishedBackUpInfo  "+publishedBac, objArray);
             b = d.n(publishedBac.getPublishedDate()) ^ 0x01;
          }else {
             b = false;
          }
       }
       obj1 = new Object[i];
       f.D().w("LocalAlbumWorkspaceProject", "user delete draft id: "+this.b.D0()+" taskId:"+str+" isNotExpired"+b, obj1);
       t ot = t.fromCallable(new k(this));
       t ot1 = DraftFileManager.E().n(this.b.f0());
       if (!b) {
          ot = ot1;
       }
       return ot.observeOn(d.c).doOnTerminate(new h(obj)).map(new j(str));
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return DraftUtils.a0(this.b);
    }
    public File c(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b.v() != null) {
          objArray = DraftFileManager.E().J(this.b.v());
       }
       return objArray;
    }
    public long d(){
       Workspace obj = PatchProxy.apply(null, this, d.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.b.v();
       Objects.requireNonNull(obj);
       return DraftUtils.C(obj);
    }
    public long e(){
       Object obj = PatchProxy.apply(null, this, d.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.b.f0().lastModified();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 instanceof d && this.b.equals(p0.b))? true: false;
       return b;
    }
    public boolean f(){
       return false;
    }
    public void g(double p0){
       this.a = p0;
    }
    public File getCoverFile(){
       Object obj = PatchProxy.apply(null, this, d.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DraftFileManager.E().u(this.b);
    }
    public File getDirectory(){
       Object obj = PatchProxy.apply(null, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.f0();
    }
    public String getIdentifier(){
       Object obj = PatchProxy.apply(null, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.D0();
    }
    public Workspace$Source getSource(){
       Object obj = PatchProxy.apply(null, this, d.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.v().getSource();
    }
    public Workspace$Type getType(){
       Object obj = PatchProxy.apply(null, this, d.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.a1();
    }
    public double getVideoDuration(){
       Object obj = PatchProxy.apply(null, this, d.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       if (this.b.e1().doubleValue() > 0) {
          return this.b.e1().doubleValue();
       }
       return this.a;
    }
    public boolean h(){
       Object obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.f0().exists();
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, d.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.hashCode();
    }
    public long i(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Workspace obj = PatchProxy.apply(objArray, this, d.class, "3");
       if (obj != patchProxyRe) {
          return obj.longValue();
       }
       obj = this.b.v();
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(obj, objArray, DraftUtils.class, "32");
       long l = (obj1 != patchProxyRe)? obj1.longValue(): DraftUtils.l0(obj.getAttributes().getModifiedAt());
       return l;
    }
    public File j(){
       String file;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       DraftFileManager obj = PatchProxy.apply(objArray, this, d.class, "12");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = DraftFileManager.E();
       d tb = this.b;
       Objects.requireNonNull(obj);
       Workspace obj1 = PatchProxy.applyOneRefs(tb, obj, DraftFileManager.class, "68");
       if (obj1 != patchProxyRe) {
          objArray = obj1;
       }else {
          obj1 = tb.v();
          if (obj1 == null) {
             Object[] objArray1 = new Object[0];
             f.D().w("DraftFileManager", "getFirstAssetFile null", objArray1);
          }else {
             File uFile = obj.H(tb);
             Object[] obj2 = PatchProxy.applyTwoRefs(uFile, obj1, objArray, DraftUtils.class, "8");
             if (obj2 != patchProxyRe) {
                objArray = obj2;
             }else if(obj1.getAssetsCount() <= 0){
                if (z.u(obj1.getType())) {
                   Asset assets = obj1.getAssets(0);
                   Workspace$Type type = obj1.getType();
                   String str = PatchProxy.applyTwoRefs(assets, type, objArray, z.class, "10");
                   if (str != patchProxyRe) {
                   }else {
                      a.p(assets, "asset");
                      a.p(type, "workspaceType");
                      if (type == Workspace$Type.LONG_PICTURE) {
                         file = (h.b(assets) <= 0)? assets.getFile(): h.d(assets).get(0).getFile();
                         a.o(file, "if \(asset.assetSegmentCo¡­stWrapped[0].file\n      }");
                      }else {
                         file = assets.getFile();
                         a.o(file, "asset.file");
                      }
                      str = file;
                      Object[] objArray2 = new Object[0];
                      f.D().w("PictureDraftUtils", "getFirstAssetRelativePathListFromAsset relativePath:"+str, objArray2);
                   }
                   objArray = new File(uFile, str);
                }else {
                   objArray = new File(uFile, obj1.getAssets(0).getFile());
                }
             }
             obj2 = new Object[0];
             f.D().w("DraftFileManager", "getFirstAssetFile originDirectory:"+uFile+",firstAssetFile:"+objArray, obj2);
          }
       }
       return objArray;
    }
    public c k(){
       return this.b;
    }
    public boolean l(){
       Object obj = PatchProxy.apply(null, this, d.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Object[] objArray = new Object[0];
       a.D().w("LocalAlbumWorkspaceProject", "isReloading mReloading="+this.c, objArray);
       return this.c;
    }
}
