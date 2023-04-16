package h90.d;
import java.lang.String;
import java.lang.Object;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.List;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$TimeRange;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.clipkit.mv.EditorSdk2MvCreationResult;
import com.kwai.video.clipkit.mv.EditorSdk2MvAsset;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import h90.e;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.gifshow.kuaishan.utils.e;
import java.lang.StringBuilder;
import java.lang.System;
import u80.e;
import q87.c;
import com.kwai.video.minecraft.model.nano.Minecraft$WesterosFaceMagicParam;
import java.util.Collection;
import java.util.Map;
import java.util.Iterator;
import com.kuaishou.gifshow.kuaishan.model.b;
import java.util.Comparator;
import java.util.Collections;
import w46.b;
import h90.b;
import com.yxcorp.gifshow.kuaishan.model.KSBaseInfo;
import com.yxcorp.gifshow.kuaishan.model.KSFeedTemplateDetailInfo$FrameExtraRequirement;
import java.lang.Boolean;
import java.util.Objects;

public class d	// class@002111
{
    public final String a;
    public int b;
    public int c;
    public String d;
    public final List e;
    public final Map f;

    public void d(String p0){
       super();
       this.e = new LinkedList();
       this.f = new HashMap();
       this.a = p0;
    }
    public static EditorSdk2$TimeRange b(List p0){
       EditorSdk2$TimeRange timeRange = null;
       Object obj = PatchProxy.applyOneRefs(p0, timeRange, d.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       while (i < p0.size()) {
          EditorSdk2$TimeRange timeRange1 = p0.get(i);
          if (timeRange == null || timeRange1.duration() - timeRange.duration() > 0) {
             timeRange = timeRange1;
          }
          i = i + 1;
       }
       return timeRange;
    }
    public final e a(EditorSdk2MvCreationResult p0,EditorSdk2MvAsset p1,KSTemplateDetailInfo p2){
       String obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, d.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p1.getGroupId();
       if (TextUtils.x(obj)) {
          if (e.t(p2)) {
             obj = this.h(p2, p1.getRefId());
          }
          if (TextUtils.x(obj)) {
             obj = p1.getRefId()+System.currentTimeMillis();
          }
          Object[] objArray = new Object[0];
          e.D().w("KuaiShanTemplate", "buildAreasAndGroups: using custom group id="+obj, objArray);
       }
       String str = obj;
       Minecraft$WesterosFaceMagicParam faceMagicPar = p1.getFaceMagicParam();
       String str1 = null;
       if (p1.requireFaceBlend()) {
          str1 = (TextUtils.x(p1.getFaceBlendPath()))? this.d(this.a, "face"): this.d(this.a, p1.getFaceBlendPath());
       }
    label_008f :
       e uoe = new e(p0, str, p1, str1, faceMagicPar);
       return str1;
    }
    public List c(){
       LinkedList obj = PatchProxy.apply(null, this, d.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LinkedList();
       Iterator iterator = this.f.values().iterator();
       while (iterator.hasNext()) {
          obj.add(iterator.next());
       }
       Collections.sort(obj, b.b);
       return obj;
    }
    public String d(String p0,String p1){
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "/";
       if (p0.endsWith(obj)) {
          return p0+p1;
       }
       return p0+obj+p1;
    }
    public List e(String p0){
       LinkedList obj = PatchProxy.applyOneRefs(p0, this, d.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       e.D().s("KuaiShanTemplate", "getGroups\(\) called with: refId = ["+p0+"]", objArray);
       obj = new LinkedList();
       if (!TextUtils.x(p0)) {
          e uoe = this.f.get(p0);
          if (uoe == null) {
             Object[] objArray1 = new Object[i];
             e.D().t("KuaiShanTemplate", "getGroups: cant find area for refId ="+p0, objArray1);
          }else {
             obj.add(uoe);
          }
          return obj;
       }else {
          Iterator iterator = this.e.iterator();
          while (iterator.hasNext()) {
             obj.add(iterator.next().c.get(i));
          }
          return obj;
       }
    }
    public List f(){
       return this.e;
    }
    public e g(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.get(p0);
    }
    public final String h(KSTemplateDetailInfo p0,String p1){
       KSFeedTemplateDetailInfo$FrameExtraRequirement obj = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Iterator iterator = p0.mFrameExtraRequirementList.iterator();
       String str = null;
       while (iterator.hasNext()) {
          obj = iterator.next();
          if (TextUtils.n(p1, obj.mId)) {
             if (("-1").equals(obj.mGroupId)) {
                break ;
             }else {
                str = obj.mGroupId;
                break ;
             }
          }
       }
       return str;
    }
    public boolean i(){
       boolean b;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, uod, "23");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       Iterator obj1 = PatchProxy.apply(objArray, this, uod, "24");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          obj1 = this.e.iterator();
          while (true) {
             if (obj1.hasNext()) {
                b uob = obj1.next();
                Objects.requireNonNull(uob);
                Object obj2 = PatchProxy.apply(objArray, uob, b.class, "8");
                if (obj2 != patchProxyRe) {
                   b1 = obj2.booleanValue();
                }else {
                   Iterator iterator2 = uob.c.iterator();
                   while (true) {
                      if (iterator2.hasNext()) {
                         if (iterator2.next().o != null) {
                            b1 = true;
                         }
                      }else {
                         b1 = false;
                      }
                   }
                   return true;
                }
                if (b1) {
                   b = true;
                }else {
                   continue ;
                }
             }else {
                b = false;
             }
          }
       }
       if (b) {
          goto label_006b ;
       }else {
          Iterator iterator = this.e.iterator();
          while (true) {
             if (!iterator.hasNext()) {
                return false;
             }
             obj1 = iterator.next().c.iterator();
             while (true) {
                if (obj1.hasNext()) {
                   e uoe = obj1.next();
                   if (uoe.n != null) {
                   }else {
                      Iterator iterator1 = uoe.k().iterator();
                      while (true) {
                         if (iterator1.hasNext()) {
                            if (iterator1.next().n != null) {
                               return true;
                            }
                         }else {
                            continue ;
                         }
                      }
                   }
                }else {
                   continue ;
                }
             }
             return true;
          }
       }
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, d.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KuaiShanTemplate{mTemplatePath=\'"+this.a+'''+", mKeyFrames="+this.e+'}';
    }
}
