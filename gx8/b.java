package gx8.b;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kuaishou.edit.draft.AssetSegment;
import android.util.Pair;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import voc.t;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import kotlin.Pair;
import wba.z;
import com.yxcorp.gifshow.encode.x0;
import x59.g;
import com.facebook.common.references.a;
import f66.i;
import jq.a;
import q87.c;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import ekd.b0;
import com.yxcorp.gifshow.util.BitmapUtil;
import com.yxcorp.gifshow.util.PictureMemoryUtils;
import java.io.File;
import com.yxcorp.gifshow.util.z;
import com.kuaishou.edit.draft.Workspace$Source;
import java.util.List;
import sxb.a;
import vba.d;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import com.yxcorp.gifshow.edit.previewer.utils.d;
import tkd.b;
import tkd.d;
import pca.c0;
import java.lang.Float;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.StringBuilder;
import java.lang.OutOfMemoryError;

public class b	// class@002516
{

    public void b(){
       super();
    }
    public static Pair a(c p0,AssetSegment p1,int p2,int p3,boolean p4,int p5){
       String obj1;
       boolean b;
       Object[] objArray1;
       object oobject = p0;
       object oobject1 = p1;
       int i = p5;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       int i1 = 1;
       Size obj = null;
       int i2 = 0;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{oobject,oobject1,Integer.valueOf(p2),Integer.valueOf(p3),Boolean.valueOf(p4),Integer.valueOf(p5)};
          obj1 = PatchProxy.apply(objArray, obj, uob, "1");
          if (obj1 != patchProxyRe) {
             return obj1;
          }
       }
       obj1 = (!TextUtils.x(p1.getCropFile()))? p1.getCropFile(): p1.getFile();
       BitmapDrawable uBitmapDrawa = t.a().b(obj1);
       if (uBitmapDrawa != null && (uBitmapDrawa.getBitmap() != null && !p4)) {
          return new Pair(uBitmapDrawa.getBitmap(), Boolean.TRUE);
       }else {
          Pair pair = z.l(oobject1, obj);
          Pair pair1 = x0.d();
          g og = pair1.component2().component2();
          b = pair1.component1().booleanValue();
          a uoa = pair1.component2().component1();
          if (pair.getFirst() == null) {
             objArray1 = new Object[i2];
             a.b().t("ImageEncodeUtils", "get picture file from asset is null", objArray1);
             PostUtils.D("ImageEncodeUtils", "get picture file from asset is null", new IllegalArgumentException());
             return obj;
          }else {
             try{
                PictureMemoryUtils.a(BitmapUtil.E(p1.getFile()));
                Bitmap uBitmap = BitmapUtil.x(pair.getFirst().getAbsolutePath(), p2, p3, false, z.e(), true);
                if (oobject == null || p0.T0() == Workspace$Source.REEDIT) {
                   return new Pair(uBitmap, Boolean.FALSE);
                }else {
                   List list = z.y(p0);
                   if (i < 0 || i >= list.size()) {
                      objArray1 = new Object[0];
                      a.b().t("ImageEncodeUtils", "assetSegment index out of bound", objArray1);
                      PostUtils.D("ImageEncodeUtils", "assetSegment index out of bound", new ArrayIndexOutOfBoundsException());
                      return new Pair(uBitmap, Boolean.FALSE);
                   }else {
                      a uoa1 = a.f(oobject, oobject1, og);
                      b0 uob0 = BitmapUtil.E(p1.getFile());
                      obj = z.m(oobject1, new Size(uob0.a, uob0.b));
                      Pair pair2 = z.l(oobject1, obj);
                      if (uoa1 != null) {
                         uoa1.l(i2);
                         d uod = uoa1.h();
                         EditorSdk2V2$AnimatedSubAsset[] uAnimatedSub = d.l(oobject, oobject1, i1);
                         EditorSdk2V2$AnimatedSubAsset[] uAnimatedSub1 = PatchProxy.applyOneRefs(uAnimatedSub, null, uob, "2");
                         if (uAnimatedSub1 != patchProxyRe) {
                         }else {
                            int i3 = 0x11255bab;
                            if (d.a(i3).isAvailable()) {
                               uAnimatedSub = d.a(i3).z4(uAnimatedSub);
                            }
                            uAnimatedSub1 = uAnimatedSub;
                         }
                         uod.n(d.b(d.e(uAnimatedSub1), false));
                         uoa1.h().u(z.n(i, oobject), i);
                         uoa1.h().q(obj);
                         uoa1.h().o(pair2.getSecond().floatValue());
                         uoa1.h().p(z.n(i, oobject));
                         if (uBitmap != null) {
                            Bitmap uBitmap1 = uoa1.m(uBitmap);
                            if (uBitmap != uBitmap1 && !uBitmap.isRecycled()) {
                               uBitmap.recycle();
                            }
                            uoa1.j(uBitmap1);
                            uBitmap = uBitmap1;
                         }
                      }
                      if (!b) {
                         objArray1 = new Object[0];
                         a.b().w("ImageEncodeUtils", "encodeBitmap release not in PostSession manager", objArray1);
                         og.e();
                      }else {
                         objArray1 = new Object[0];
                         a.b().w("ImageEncodeUtils", "encodeBitmap close manager ref", objArray1);
                         uoa.close();
                      }
                      return new Pair(uBitmap, Boolean.FALSE);
                   }
                }
             }catch(java.lang.OutOfMemoryError e0){
                Object[] objArray2 = new Object[0];
                a.b().w("ImageEncodeUtils", "OutOfMemoryError: "+e0.getMessage(), objArray2);
                PictureMemoryUtils.i(e0, BitmapUtil.E(p1.getFile()));
                return null;
             }
          }
       }
    }
}
