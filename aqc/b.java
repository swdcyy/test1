package aqc.b;
import lnc.a1;
import java.lang.Object;
import android.graphics.Rect;
import android.graphics.RectF;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.util.List;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.edit.draft.Workspace$Type;
import java.util.HashMap;
import com.google.common.collect.Maps;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace;
import java.util.ArrayList;
import java.util.Collection;
import ekd.q;
import wba.d0;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import java.util.Iterator;
import com.kuaishou.edit.draft.Text;
import com.kuaishou.edit.draft.StickerResult;
import com.kuaishou.edit.draft.Sticker;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import java.lang.Float;
import android.graphics.Matrix;

public class b	// class@0002bd
{
    public static final float a;
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;
    public static final int f;
    public static final int g;

    static {
       b.a = (float)a1.e(540.00f);
       b.b = a1.e(443.00f);
       b.c = a1.e(727.00f);
       b.d = a1.e(0x43f70000);
       b.e = a1.e(744.00f);
       b.f = a1.e(8.00f);
       b.g = a1.e(25.00f);
    }
    public void b(){
       super();
    }
    public static boolean a(Rect p0,RectF p1,int p2){
       RectF left = p1.left;
       boolean b = true;
       Rect rect = null;
       if (left - rect <= 0 && (p1.top - rect <= 0 && (p1.right - rect <= 0 && p1.bottom - rect <= 0))) {
          return b;
       }
       float f = (float)p2;
       if ((float)p0.left - (left + f) < 0 || ((float)p0.right - (p1.right - f) > 0 || ((float)p0.top - (p1.top + f) < 0 || (float)p0.bottom - (p1.bottom - f) > 0))) {
          b = false;
       }
       return b;
    }
    public static Map b(c p0,EditorSdk2V2$VideoEditorProject p1,List p2){
       int zIndex;
       Integer integer1;
       boolean b;
       Iterator iterator1;
       Size size1;
       boolean b1;
       StickerResult result;
       RectF rectF1;
       c uoc = p0;
       EditorSdk2V2$VideoEditorProject videoEditorP = p1;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (p0.a1() != Workspace$Type.LONG_PICTURE && (p0.a1() != Workspace$Type.SINGLE_PICTURE && p0.a1() != Workspace$Type.ATLAS))? 1: 0;
       HashMap hashMap = Maps.s();
       Workspace workspace = p0.v();
       ArrayList uArrayList = new ArrayList();
       if (workspace != null && !q.f(workspace.getStickersList())) {
          uArrayList.addAll(workspace.getStickersList());
       }
       if (workspace != null && !q.f(workspace.getTextsList())) {
          uArrayList.addAll(workspace.getTextsList());
       }
       Size size = new Size(d0.m(videoEditorP, uoc), d0.m(videoEditorP, uoc));
       if (!q.f(uArrayList)) {
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             GeneratedMessageLite generatedMes = iterator.next();
             v6 = generatedMes instanceof Text;
             if (uoc) {
                zIndex = generatedMes.getResult().getZIndex();
             }else if(generatedMes instanceof Sticker){
                zIndex = generatedMes.getResult().getZIndex();
             }else {
                zIndex = -1;
             }
             Integer integer = Integer.valueOf(zIndex);
             if (obj) {
                integer1 = integer;
                GeneratedMessageLite obj1 = PatchProxy.applyThreeRefs(generatedMes, size, p2, null, b.class, "3");
                if (obj1 != PatchProxyResult.class) {
                   b = obj1.booleanValue();
                label_00cd :
                   iterator1 = iterator;
                   size1 = size;
                }else {
                   obj1 = null;
                   if (uoc) {
                      result = generatedMes.getResult();
                   }else if(generatedMes instanceof Sticker){
                      result = generatedMes.getResult();
                   }else {
                      result = obj1;
                   }
                   if (result == null) {
                      i1.c(new RuntimeException("EditSafeAreaUtil failed to get sticker result"));
                      iterator1 = iterator;
                      size1 = size;
                      b = false;
                   }else {
                      int zIndex1 = result.getZIndex();
                      if (!q.f(p2)) {
                         Iterator iterator2 = p2.iterator();
                         while (true) {
                            if (iterator2.hasNext()) {
                               EditDecorationBaseDrawer uEditDecorat = iterator2.next();
                               if (uEditDecorat.getLayerIndex() == zIndex1) {
                                  b = uEditDecorat.isInSafeArea();
                                  goto label_00cd ;
                               }
                            }
                         }
                      }
                      RectF rectF = b.c((float)size.c, (float)size.b);
                      Rect rect = PatchProxy.applyOneRefs(result, obj1, b.class, "4");
                      if (rect != PatchProxyResult.class) {
                         iterator1 = iterator;
                         rectF1 = rectF;
                         size1 = size;
                      }else {
                         rect = new Rect();
                         iterator1 = iterator;
                         double d = (double)result.getCenterX();
                         double d1 = result.getResourceWidth() / 2.00f;
                         double d2 = d - d1;
                         double d3 = (double)result.getCenterY();
                         double d4 = result.getResourceHeight() / 2.00f;
                         size1 = size;
                         double d5 = d3 - d4;
                         d = d + d1;
                         d3 = d3 + d4;
                         rect.set((int)d2, (int)d5, (int)d, (int)d3);
                         rectF1 = rectF;
                      }
                      b = b.a(rect, rectF1, -1);
                   }
                }
                if (b) {
                   b1 = true;
                label_0179 :
                   hashMap.put(integer1, Boolean.valueOf(b1));
                   iterator = iterator1;
                   size = size1;
                }
             }else {
                iterator1 = iterator;
                integer1 = integer;
                size1 = size;
             }
             b1 = false;
             goto label_0179 ;
          }
       }
       return hashMap;
    }
    public static RectF c(float p0,float p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), null, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       float f = p0 / p1;
       if (f - 0x3fe28f5c < 0) {
          return new RectF(0, 0, 0, 0);
       }else {
          float f1 = (float)b.d;
          float f2 = (float)b.e;
          if (f - 2.00f < 0) {
             f1 = (float)b.b;
             f2 = (float)b.c;
          }
          f = p1 / b.a;
          f1 = f1 * f;
          f = f * f2;
          return new RectF(((p1 - f1) / 2.00f), ((p0 - f) / 2.00f), ((p1 + f1) / 2.00f), ((p0 + f) / 2.00f));
       }
    }
    public static Rect d(Rect p0,float p1){
       RectF obj;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), null, uob, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new RectF(p0);
       Matrix matrix = new Matrix();
       matrix.setRotate(p1, (float)((p0.left + p0.right) / 2), (float)((p0.top + p0.bottom) / 2));
       matrix.mapRect(obj);
       return new Rect((int)obj.left, (int)obj.top, (int)obj.right, (int)obj.bottom);
    }
}
