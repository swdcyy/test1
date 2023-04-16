package amd.a;
import java.lang.Object;
import xvc.g;
import xld.a;
import jod.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import maa.a;
import com.kuaishou.edit.draft.Workspace$Type;
import java.util.List;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.kuaishou.edit.draft.Asset;
import com.kuaishou.edit.draft.c;
import wba.h;
import com.kuaishou.edit.draft.AssetSegment;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Collection;
import yaa.c;
import com.kuaishou.edit.draft.Music;
import wba.u;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import xvc.o;
import java.lang.Boolean;
import wld.a;
import trd.t0;
import uvc.a;
import android.graphics.RectF;

public final class a	// class@00006c
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final a a(g p0,a p1,int p2,a p3){
       c obj2;
       String this;
       ArrayList uArrayList;
       ArrayList uArrayList1;
       List list1;
       Map map;
       LinkedHashMap obj3;
       int i;
       LinkedHashMap linkedHashMa;
       a uoa2;
       String identifier;
       Iterator iterator2;
       String obj5;
       Iterator iterator4;
       Object obj = this;
       AssetSegment obj1 = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj2 = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), p3, this, a.class, "1");
          if (obj2 != patchProxyRe) {
             return obj2;
          }
       }
       a.p(p0, "draftState");
       a.p(obj1, "oldState");
       a.p(p3, "timelineData");
       obj2 = p0.i();
       if (obj2 != null) {
          a uoa1 = obj2.o0();
          if (uoa1 != null) {
             a.o(uoa1, "workspaceDraft.assetDraft ?: return oldState");
             Workspace$Type type = obj2.a1();
             this = "it.getAssetSegment\(0\).identifier";
             String str = "it.getAssetSegment\(0\)";
             String str1 = "it.identifier";
             String str2 = "it";
             String str3 = "assetDraft.messages";
             if (type == Workspace$Type.ATLAS || type == Workspace$Type.LONG_PICTURE) {
                uArrayList = PatchProxy.applyOneRefs(uoa1, obj, uoa, "3");
                if (uArrayList != patchProxyRe) {
                }else {
                   uArrayList = new ArrayList();
                   list1 = uoa1.z();
                   a.o(list1, str3);
                   iterator2 = list1.iterator();
                   while (iterator2.hasNext()) {
                      Asset uAsset2 = iterator2.next();
                      a.o(uAsset2, str2);
                      if (h.b(uAsset2) > 0) {
                         iterator4 = iterator2;
                         AssetSegment assetSegment1 = uAsset2.getAssetSegment(0);
                         a.o(assetSegment1, str);
                         obj5 = assetSegment1.getIdentifier();
                         a.o(obj5, this);
                         uArrayList.add(obj5);
                      }else {
                         iterator4 = iterator2;
                         obj5 = uAsset2.getIdentifier();
                         a.o(obj5, str1);
                         uArrayList.add(obj5);
                      }
                      iterator2 = iterator4;
                   }
                }
             }else {
                uArrayList = PatchProxy.applyOneRefs(uoa1, obj, uoa, "2");
                if (uArrayList != patchProxyRe) {
                }else {
                   List list = uoa1.z();
                   a.o(list, str3);
                   uArrayList1 = new ArrayList(u.Y(list, 10));
                   Iterator iterator1 = list.iterator();
                   while (iterator1.hasNext()) {
                      Asset uAsset3 = iterator1.next();
                      a.o(uAsset3, str2);
                      uArrayList1.add(uAsset3.getIdentifier());
                   }
                   if (type == Workspace$Type.ATLAS || type == Workspace$Type.LONG_PICTURE) {
                      list = PatchProxy.applyOneRefs(uoa1, obj, uoa, "4");
                      if (list != patchProxyRe) {
                      }else {
                         list = new ArrayList();
                         list1 = uoa1.z();
                         a.o(list1, str3);
                         iterator2 = list1.iterator();
                         while (iterator2.hasNext()) {
                            Iterator iterator3 = iterator2;
                            obj5 = iterator2.next();
                            a.o(obj5, str2);
                            if (h.b(obj5) > 0) {
                               iterator2 = h.d(obj5).iterator();
                               while (iterator2.hasNext()) {
                                  obj5 = iterator2.next().getIdentifier();
                                  a.o(obj5, "segment.identifier");
                                  list.add(obj5);
                                  iterator2 = iterator2;
                               }
                            }else {
                               obj5 = obj5.getIdentifier();
                               a.o(obj5, str1);
                               list.add(obj5);
                            }
                            iterator2 = iterator3;
                         }
                      }
                   }else {
                      list = p1.j();
                   }
                   list1 = list;
                   if (type == Workspace$Type.ATLAS || type == Workspace$Type.LONG_PICTURE) {
                      map = PatchProxy.applyOneRefs(uoa1, obj, uoa, "5");
                      if (map != patchProxyRe) {
                      }else {
                         obj3 = new LinkedHashMap();
                         list = uoa1.z();
                         a.o(list, str3);
                         iterator1 = list.iterator();
                         while (iterator1.hasNext()) {
                            Asset uAsset1 = iterator1.next();
                            a.o(uAsset1, str2);
                            if (h.b(uAsset1) > 0) {
                               obj1 = uAsset1.getAssetSegment(0);
                               a.o(obj1, str);
                               identifier = obj1.getIdentifier();
                               a.o(identifier, this);
                               String identifier1 = uAsset1.getIdentifier();
                               a.o(identifier1, str1);
                               obj3.put(identifier, identifier1);
                               iterator1 = iterator1;
                            }else {
                               i = p1;
                            }
                         }
                      }
                   }else {
                      map = p1.d();
                   }
                   Map map1 = map;
                   obj3 = PatchProxy.applyOneRefs(uoa1, obj, uoa, "6");
                   i = 1;
                   if (obj3 != patchProxyRe) {
                      linkedHashMa = obj3;
                      i = 0;
                   }else {
                      obj3 = new LinkedHashMap();
                      List list2 = uoa1.z();
                      a.o(list2, str3);
                      Iterator iterator = list2.iterator();
                      while (iterator.hasNext()) {
                         Asset uAsset = iterator.next();
                         a.o(uAsset, str2);
                         int i1 = h.c(uAsset).isEmpty() ^ i;
                         if (i1) {
                            str3 = uAsset.getIdentifier();
                            a.o(str3, str1);
                            AssetSegment assetSegment = uAsset.getAssetSegment(0);
                            a.o(assetSegment, str);
                            identifier = assetSegment.getIdentifier();
                            a.o(identifier, this);
                            obj3.put(str3, identifier);
                            i = 1;
                         }
                      }
                      linkedHashMa = obj3;
                   }
                   Music music = u.a(obj2.J0());
                   boolean b = (DraftUtils.T(obj2) && (music == null || music.getTransPointsCount() <= 0))? true: false;
                   o oo = p0.d();
                   Workspace$Type type1 = null;
                   o oo1 = (oo != null)? oo.d: type1;
                   if (PatchProxy.isSupport(uoa)) {
                      uoa2 = PatchProxy.applyThreeRefs(Boolean.valueOf(b), oo1, p1, this, a.class, "7");
                      if (uoa2 != patchProxyRe) {
                      }else if(b){
                         uoa2 = (oo1 instanceof a)? oo1.a: p1.l();
                      }else {
                         uoa2 = t0.z();
                      }
                   }else {
                      goto label_0262 ;
                   }
                   Object obj4 = uoa2;
                   boolean b1 = p0.j();
                   double d = p0.f();
                   double d1 = p0.e();
                   c this1 = p0.i();
                   if (this1 != null) {
                      type1 = this1.a1();
                   }
                   boolean b2 = (type1 == Workspace$Type.PHOTO_MOVIE)? true: false;
                   return a.b(p1, false, uArrayList1, list1, map1, linkedHashMa, p2, 0, p3, d, b1, false, false, b, obj4, 0, d1, 0, null, b2, 0x30c41, null);
                }
             }
             uArrayList1 = uArrayList;
             goto label_00ef ;
          }
       }
       return p1;
    }
}
