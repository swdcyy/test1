package jca.a$g;
import erd.g;
import jca.a;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.gifshow.editor.fine.tuning.vm.FineTuningViewModel;
import androidx.lifecycle.LiveData;
import gca.b;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import lnc.i1;
import com.yxcorp.gifshow.editor.fine.tuning.data.EditorFineTuningType;
import gca.a;
import kca.a;
import java.lang.Enum;
import com.kuaishou.edit.draft.FineTuningParam;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.FineTuningParam$b;
import rwc.j;
import java.lang.Float;
import com.yxcorp.gifshow.editor.fine.tuning.repo.FineTuningRepo;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.util.List;
import wba.z;
import com.kuaishou.edit.draft.AssetSegment;
import com.kwai.robust.PatchProxyResult;
import kotlin.Pair;
import com.kuaishou.edit.draft.Workspace$Type;
import maa.a;
import haa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.edit.draft.Asset;
import com.kuaishou.edit.draft.c;
import wba.h;
import java.lang.Number;
import com.kuaishou.edit.draft.Asset$b;
import com.kuaishou.edit.draft.AssetSegment$b;
import faa.a;
import q87.c;
import uwc.b;

public final class a$g implements g	// class@002a4d
{
    public final a b;

    public void a$g(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       FineTuningParam$b uob;
       GeneratedMessageLite generatedMes;
       boolean b;
       z a;
       int i1;
       Workspace$Type type;
       List list;
       Iterator iterator;
       int i3;
       Asset uAsset;
       GeneratedMessageLite$Builder obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, a$g.class, "1")) {
       }else {
          a m = obj.b.m;
          a.o(obj1, "it");
          int i = obj1.intValue();
          Objects.requireNonNull(m);
          FineTuningViewModel uFineTuningV = FineTuningViewModel.class;
          if (!PatchProxy.isSupport(uFineTuningV) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), m, uFineTuningV, "6")) {
             b value = m.e.getValue();
             if (value == null) {
                i1.c(new RuntimeException("changeFineTuningParam selectedFineTuningItemUiData is "+"null progress:"+i));
             }else {
                String str = "selectedFineTuningItemUi¡­ogress.toFloat\(\)\).build\(\)";
                String str1 = "selectedFineTuningItemUi¡­\n                .build\(\)";
                switch (a.a[value.a().ordinal()]){
                    case 1:
                      uob = value.b().toBuilder();
                      uob.a((float)i);
                      generatedMes = uob.build();
                      a.o(generatedMes, str);
                      value.c(generatedMes);
                   label_0139 :
                      j value1 = m.f.getValue();
                      if (value1 != null) {
                         value1.setValue(Float.valueOf((float)i));
                      }
                      FineTuningViewModel h = m.h;
                      FineTuningParam uFineTuningP = value.b();
                      FineTuningViewModel d = m.d;
                      Objects.requireNonNull(h);
                      FineTuningRepo uFineTuningR = FineTuningRepo.class;
                      if (!PatchProxy.isSupport(uFineTuningR) || !PatchProxy.applyVoidTwoRefs(uFineTuningP, Integer.valueOf(d), h, uFineTuningR, "5")) {
                         a.p(uFineTuningP, "fineTuningParam");
                         str1 = z.y(h.c).get(d).getIdentifier();
                         a = z.a;
                         FineTuningRepo c = h.c;
                         a.o(str1, "identifier");
                         Objects.requireNonNull(a);
                         PatchProxyResult patchProxyRe = PatchProxyResult.class;
                         Workspace$Type obj2 = PatchProxy.applyTwoRefs(c, str1, a, z.class, "4");
                         if (obj2 != patchProxyRe) {
                            i1 = -1;
                         }else {
                            a.p(c, "workspaceDraft");
                            a.p(str1, "assetIdentifier");
                            obj2 = c.a1();
                            a.o(obj2, "workspaceDraft.type");
                            type = obj2;
                            String str2 = "assetIdentifier";
                            String str3 = "workspaceDraft";
                            obj2 = PatchProxy.applyThreeRefs(obj2, c, str1, a, z.class, "5");
                            if (obj2 != patchProxyRe) {
                            }else {
                               obj2 = type;
                               a.p(obj2, "workspaceType");
                               a.p(c, str3);
                               a.p(str1, str2);
                               str2 = "asset";
                               str3 = "DraftGetUtils.getAssetDr¡­\(workspaceDraft\).messages";
                               if (obj2 == Workspace$Type.LONG_PICTURE) {
                                  list = a.c(c).z();
                                  a.o(list, str3);
                                  iterator = list.iterator();
                                  i3 = 0;
                               label_01f0 :
                                  if (iterator.hasNext()) {
                                     uAsset = iterator.next();
                                     a.o(uAsset, str2);
                                     if (!h.b(uAsset)) {
                                        if (a.g(z.a.i(uAsset, a.c(c)).getIdentifier(), str1)) {
                                           obj2 = new Pair(Integer.valueOf(i3), Integer.valueOf(-1));
                                        }
                                     }else {
                                        Iterator iterator1 = h.d(uAsset).iterator();
                                        int i4 = 0;
                                        while (true) {
                                           if (iterator1.hasNext()) {
                                              if (a.g(z.a.j(iterator1.next(), a.c(c)).getIdentifier(), str1)) {
                                                 obj2 = new Pair(Integer.valueOf(i3), Integer.valueOf(i4));
                                                 break ;
                                              }else {
                                                 i4 = i4 + 1;
                                              }
                                           }
                                        }
                                     }
                                     i3 = i3 + 1;
                                     goto label_01f0 ;
                                  }
                               }else {
                                  list = a.c(c).z();
                                  a.o(list, str3);
                                  iterator = list.iterator();
                                  i3 = 0;
                                  while (true) {
                                     if (iterator.hasNext()) {
                                        uAsset = iterator.next();
                                        a.o(uAsset, str2);
                                        if (a.g(z.a.i(uAsset, a.c(c)).getIdentifier(), str1)) {
                                           obj2 = new Pair(Integer.valueOf(i3), Integer.valueOf(-1));
                                           break ;
                                        }else {
                                           i3 = i3 + 1;
                                        }
                                     }
                                  }
                               }
                               obj2 = new Pair(Integer.valueOf(-1), Integer.valueOf(-1));
                            }
                         }
                         AssetSegment uAssetSegmen = -1;
                         if (obj2.getFirst().intValue() == uAssetSegmen) {
                            i1.c(new RuntimeException("saveFineTuningParam error identifier:"+str1+",  pictureIndexPair:"+obj2));
                         }else {
                            obj = a.c(h.c).n(obj2.getFirst().intValue());
                            a.o(obj, "DraftGetUtils.getAssetDr¡­IndexPair\n        .first\)");
                            if (h.c.a1() == Workspace$Type.ATLAS) {
                               if (h.b(obj) > 0) {
                                  int i2 = 0;
                                  AssetSegment$b uob1 = obj.getAssetSegment(i2).toBuilder();
                                  a.o(uob1, "builder");
                                  uob1.d(uFineTuningP);
                                  obj.e(i2, uob1);
                               }
                            }else if(obj2.getSecond().intValue() != uAssetSegmen){
                               AssetSegment$b uob2 = obj.getAssetSegment(obj2.getSecond().intValue()).toBuilder();
                               a.o(uob2, "builder");
                               uob2.d(uFineTuningP);
                               obj.e(obj2.getSecond().intValue(), uob2);
                            }
                            obj.l(uFineTuningP);
                            b = 0;
                            FineTuningRepo.e(h, d, b, 2, null);
                            Object[] objArray1 = new Object[b];
                            a.D().w("FineTuningRepo", "saveFineTuningParam fineTuningParam:"+uFineTuningP+", pictureIndex:"+d, objArray1);
                         }
                      }
                      b = false;
                      break;
                    case 2:
                      uob = value.b().toBuilder();
                      uob.d((float)i);
                      generatedMes = uob.build();
                      a.o(generatedMes, str1);
                      value.c(generatedMes);
                      goto label_0139 ;
                      break;
                    case 3:
                      uob = value.b().toBuilder();
                      uob.e((float)i);
                      generatedMes = uob.build();
                      a.o(generatedMes, str1);
                      value.c(generatedMes);
                      goto label_0139 ;
                      break;
                    case 4:
                      uob = value.b().toBuilder();
                      uob.f((float)i);
                      generatedMes = uob.build();
                      a.o(generatedMes, str);
                      value.c(generatedMes);
                      goto label_0139 ;
                      break;
                    case 5:
                      uob = value.b().toBuilder();
                      uob.c((float)i);
                      generatedMes = uob.build();
                      a.o(generatedMes, str1);
                      value.c(generatedMes);
                      goto label_0139 ;
                      break;
                    case 6:
                      uob = value.b().toBuilder();
                      uob.b((float)i);
                      generatedMes = uob.build();
                      a.o(generatedMes, "selectedFineTuningItemUi¡­\)\n               .build\(\)");
                      value.c(generatedMes);
                      goto label_0139 ;
                      break;
                    default:
                      i1.c(new RuntimeException("changeFineTuningParam error editorFineTuningType, "+"selectedFineTuningItemUiData:"+value));
                }
                m.g.X0(b, m.d, 2);
                Object[] objArray = new Object[0];
                a.D().w("FineTuningViewModel", "changeFineTuningParam mPosition:"+m.d+", progress:"+i, objArray);
             }
          }
       }
       return;
    }
}
