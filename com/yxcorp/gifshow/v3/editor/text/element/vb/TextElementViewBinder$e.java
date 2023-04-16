package com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$e;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder;
import java.lang.Object;
import com.kuaishou.kotlin.livedata.ListHolder;
import uuc.e;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import java.lang.StringBuilder;
import com.kuaishou.kotlin.livedata.ListHolder$UpdateType;
import q87.c;
import wuc.b;
import java.lang.Enum;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import java.util.List;
import java.util.Objects;
import java.util.ArrayList;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement;
import java.util.Iterator;
import java.lang.Iterable;
import tuc.c;
import com.yxcorp.gifshow.v3.editor.text.model.EditTextBaseElementData;
import suc.b;
import suc.a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import java.lang.Boolean;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import wpc.g;
import erd.g;
import wpc.h;
import com.yxcorp.gifshow.v3.editor.text.element.vb.c;
import erd.r;
import com.yxcorp.gifshow.v3.editor.text.model.TextDrawConfigParam;
import java.io.File;
import com.yxcorp.gifshow.postfont.FontEnv;
import com.yxcorp.gifshow.v3.editor.text.font.FontVMDelegate;
import d0c.d;
import d0c.a;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer;
import uld.g;
import java.lang.Float;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Text$b;
import com.kuaishou.edit.draft.StickerResult;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.StickerResult$b;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import com.kuaishou.edit.draft.Text;
import com.kuaishou.edit.draft.FeatureId;
import huc.d;
import kotlin.Pair;
import android.widget.PopupWindow;
import com.yxcorp.gifshow.v3.editor.text.font.FontPopupWindow;
import java.lang.Number;
import wuc.a;
import java.lang.Runnable;
import android.widget.AbsoluteLayout;
import wba.h0;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleValue;

public final class TextElementViewBinder$e implements Observer	// class@001403
{
    public final TextElementViewBinder b;

    public void TextElementViewBinder$e(TextElementViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       ListHolder$UpdateType updateType;
       Object[] objArray1;
       TextElementViewBinder$e b;
       boolean layerIndex;
       TextElementViewBinder textElementV2;
       int layerIndex1;
       String obj2;
       EditDecorationContainerView uEditDecorat2;
       EditTextBaseElement uEditTextBas4;
       TextElementViewBinder a;
       Object obj3;
       TextElementViewBinder textElementV3;
       Iterator iterator2;
       String str5;
       String str6;
       String str7;
       int b3;
       boolean b5;
       int i5;
       e c;
       Text text;
       Object[] obj6;
       c uoc2;
       EditTextBaseElement uEditTextBas5;
       Object obj8;
       String obj9;
       Object[] objArray3;
       Object obj = this;
       Iterator obj1 = p0;
       e uoe = e.class;
       TextElementViewBinder textElementV = TextElementViewBinder.class;
       TextElementViewModel textElementV1 = TextElementViewModel.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, TextElementViewBinder$e.class, "1")) {
       }else {
          int i = obj1.b();
          int i1 = 0;
          Object[] objArray = new Object[i1];
          String str = "TextElementViewBinder";
          a.D().w(str, "mTextElementUiDataList updateType:"+obj1.e()+",it.payload:"+obj1.d(), objArray);
          updateType = obj1.e();
          if (updateType != null) {
             int i2 = b.a[updateType.ordinal()];
             if (i2 != 1) {
                if (i2 != 2) {
                   int i3 = 21;
                   String str1 = 4;
                   if (i2 != 3) {
                      if (i2 == str1) {
                         objArray1 = new Object[i1];
                         a.D().w(str, "CHANGE_ALL", objArray1);
                         double d = 0;
                         if (a.g(obj1.d(), Integer.valueOf(i3))) {
                            b = obj.b;
                            List list = obj1.c();
                            obj1 = obj1.d();
                            Objects.requireNonNull(b);
                            if (!PatchProxy.applyVoidTwoRefs(list, obj1, b, textElementV, "5")) {
                               ArrayList uArrayList = new ArrayList();
                               ArrayList uArrayList1 = new ArrayList();
                               EditDecorationBaseDrawer selectDrawer = b.k.getSelectDrawer();
                               layerIndex = (selectDrawer != null)? selectDrawer.getLayerIndex(): -1;
                               Iterator iterator = list.iterator();
                               object oobject = d;
                               while (iterator.hasNext()) {
                                  c uoc = iterator.next();
                                  if (uoc.a().A0() == 256) {
                                     EditTextBaseElement uEditTextBas = a.a(uoc.a(), uoc.c(), b.w, b.G);
                                     layerIndex1 = uEditTextBas.getLayerIndex();
                                     EditDecorationBaseDrawer selectDrawer1 = b.k.getSelectDrawer();
                                     int i4 = (selectDrawer1 != null && selectDrawer1.getLayerIndex() == layerIndex1)? 1: 0;
                                     textElementV2 = b.k;
                                     Objects.requireNonNull(textElementV2);
                                     if (PatchProxy.isSupport(EditDecorationContainerView.class)) {
                                        obj2 = PatchProxy.applyThreeRefs(Integer.valueOf(layerIndex1), uEditTextBas, uArrayList1, textElementV2, EditDecorationContainerView.class, "14");
                                        if (obj2 != patchProxyRe) {
                                           obj2.booleanValue();
                                        label_0134 :
                                           if (!i4) {
                                              b.A.m1(uEditTextBas);
                                           }else {
                                              oobject = uEditTextBas;
                                           }
                                           b.A.s1(uEditTextBas.getLayerIndex(), uEditTextBas.getTextFontName());
                                           uoc.a().a(uEditTextBas.getEditTextBaseElementData());
                                           uArrayList.add(uEditTextBas);
                                        }
                                     }
                                     EditDecorationBaseDrawer uEditDecorat = textElementV2.n0(layerIndex1);
                                     textElementV2.i0(uEditDecorat, d, i1);
                                     textElementV2.b0(uEditTextBas, d, i1);
                                     uArrayList1.add(uEditDecorat);
                                     goto label_0134 ;
                                  }
                                  textElementV2 = 1;
                               }
                               TextElementViewBinder k = b.k;
                               Integer integer = Integer.valueOf(19);
                               Objects.requireNonNull(k);
                               if (!PatchProxy.applyVoidTwoRefs(integer, uArrayList1, k, EditDecorationContainerView.class, "17")) {
                                  k.f(new g(integer, uArrayList1));
                               }
                               TextElementViewBinder k1 = b.k;
                               Objects.requireNonNull(k1);
                               if (PatchProxy.isSupport(EditDecorationContainerView.class)) {
                                  Object[] objArray2 = new Object[]{uArrayList,obj1,uArrayList1,oobject,Integer.valueOf(layerIndex)};
                                  if (!PatchProxy.applyVoid(objArray2, k1, EditDecorationContainerView.class, "18")) {
                                  }
                               }else {
                               }
                            }
                         }else {
                            uEditDecorat2 = obj.b.J();
                            Objects.requireNonNull(uEditDecorat2, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView<com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData, com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer<out com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData>>");
                            uEditDecorat2.f0(new c(obj), Integer.valueOf(10));
                            Iterator iterator1 = obj1.c().iterator();
                            String str2 = null;
                            while (iterator1.hasNext()) {
                               c uoc1 = iterator1.next();
                               TextElementViewBinder$e b1 = obj.b;
                               EditTextBaseElementData uEditTextBas1 = uoc1.a();
                               Objects.requireNonNull(b1);
                               String str3 = "6";
                               obj2 = PatchProxy.applyOneRefs(uEditTextBas1, b1, textElementV, str3);
                               if (obj2 != patchProxyRe) {
                                  layerIndex1 = obj2.booleanValue();
                               }else {
                                  obj2 = uEditTextBas1.C0().k();
                                  i3 = (!obj2.length())? 1: 0;
                                  if (i3 || (!new File(FontEnv.a(), obj2).exists() && uEditTextBas1.C0().i())) {
                                     TextElementViewBinder z = b1.z;
                                     Objects.requireNonNull(z);
                                     obj6 = PatchProxy.apply(d, z, FontVMDelegate.class, str3);
                                     if (obj6 != patchProxyRe) {
                                     }else if(!z.d().isEmpty()){
                                        layerIndex1 = 0;
                                        if (z.d().get(layerIndex1).j()) {
                                           obj6 = z.d().get(layerIndex1);
                                        }
                                     }
                                     obj6 = d;
                                     if (obj6 != null) {
                                        TextDrawConfigParam textDrawConf = uEditTextBas1.C0();
                                        String str8 = obj6.c();
                                        if (str8 == null) {
                                           str8 = "";
                                        }
                                        uEditTextBas1.F0(textDrawConf.d(str8, obj6.f()));
                                        layerIndex1 = true;
                                     }
                                  }
                               label_0296 :
                                  layerIndex1 = false;
                               }
                               TextElementViewBinder$e b2 = obj.b;
                               EditTextBaseElement uEditTextBas2 = a.a(uoc1.a(), uoc1.c(), b2.w, b2.G);
                               if (obj.b.J().r0(uEditTextBas2, obj1.d())) {
                                  TextElementViewBinder$e uoe1 = (!(uoc1.c()).length())? 1: null;
                                  if (uoe1 && obj.b.H != null) {
                                     uoc1.a().L(0x3f000000);
                                  }
                                  EditTextBaseElement uEditTextBas3 = uEditTextBas2;
                                  String str4 = "editTextBaseElement";
                                  if (uoc1.b() - (double)0 > 0) {
                                     uEditTextBas4 = uEditTextBas3;
                                     uEditTextBas4.fixOldTextScale(uoc1.b());
                                     a = obj.b.A;
                                     Objects.requireNonNull(a);
                                     if (PatchProxy.applyVoidOneRefs(uEditTextBas4, a, textElementV1, "59")) {
                                        obj3 = obj1;
                                        textElementV3 = textElementV;
                                        iterator2 = iterator1;
                                     }else {
                                        a.p(uEditTextBas4, str4);
                                        Size size = new Size(-1, -1);
                                        uEditTextBas4.generateDecorationBitmap(0x3f800000);
                                        BaseDrawer mDecorationB = uEditTextBas4.mDecorationBitmap;
                                        int width = (mDecorationB != null)? mDecorationB.getWidth(): -1;
                                        size.b = width;
                                        mDecorationB = uEditTextBas4.mDecorationBitmap;
                                        width = (mDecorationB != null)? mDecorationB.getHeight(): -1;
                                        size.c = width;
                                        a.a.a(uEditTextBas4);
                                        str3 = uEditTextBas4.getDecorationFilePath();
                                        TextElementViewModel f1 = a.F;
                                        int layerIndex2 = uEditTextBas4.getLayerIndex();
                                        textElementV3 = textElementV;
                                        float f2 = uEditTextBas4.getEditTextBaseElementData().A();
                                        iterator2 = iterator1;
                                        a.o(str3, "regenerateFilePath");
                                        Objects.requireNonNull(f1);
                                        if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidFourRefs(Integer.valueOf(layerIndex2), Float.valueOf(f2), size, str3, f1, e.class, "10")) {
                                           obj3 = obj1;
                                        }else {
                                           a.p(size, "size");
                                           a.p(str3, "filePath");
                                           e c1 = f1.c;
                                           if (c1 == null) {
                                              a.S("mTextDraft");
                                           }
                                           if (!c1.D()) {
                                              obj3 = obj1;
                                              i1.c(new RuntimeException("convertOldTextToNew error textDraft not editing"));
                                           }else {
                                              obj3 = obj1;
                                           }
                                           b3 = f1.m(layerIndex2);
                                           if (b3 < 0) {
                                              i1.c(new RuntimeException("convertOldTextToNew error draftPosition"));
                                           }else {
                                              c1 = f1.c;
                                              if (c1 == null) {
                                                 a.S("mTextDraft");
                                              }
                                              GeneratedMessageLite$Builder uBuilder = c1.n(b3);
                                              a.o(uBuilder, "mTextDraft.getBuilder\(draftPosition\)");
                                              StickerResult$b uob = uBuilder.getResult().toBuilder();
                                              str6 = str2;
                                              str5 = str4;
                                              uob.r((double)size.b);
                                              uob.q((double)size.c);
                                              uob.t(f2);
                                              e c2 = f1.c;
                                              if (c2 == null) {
                                                 a.S("mTextDraft");
                                              }
                                              uob.l(c2.Q(str3));
                                              uBuilder.k(uob.build());
                                              c = f1.c;
                                              if (c == null) {
                                                 a.S("mTextDraft");
                                              }
                                              c.g(false);
                                              c = f1.c;
                                              if (c == null) {
                                                 a.S("mTextDraft");
                                              }
                                              c.c0();
                                              objArray1 = new Object[0];
                                              a.D().w("TextElementRepo", "convertOldTextToNew layerIndex:"+layerIndex2+", scale:"+f2+", filePath:"+str3+", size:"+size, objArray1);
                                           }
                                        }
                                     }
                                     str5 = str4;
                                     str6 = str2;
                                  }else {
                                     obj3 = obj1;
                                     textElementV3 = textElementV;
                                     iterator2 = iterator1;
                                     str5 = str4;
                                     str6 = str2;
                                     uEditTextBas4 = uEditTextBas3;
                                  }
                                  obj.b.J().C0(uEditTextBas4);
                                  if (layerIndex1) {
                                     obj.b.A.s1(uEditTextBas4.getLayerIndex(), uEditTextBas4.getTextFontName());
                                  }
                                  uoc1.a().a(uEditTextBas4.getEditTextBaseElementData());
                                  TextElementViewBinder a1 = obj.b.A;
                                  str7 = uoc1.a().l();
                                  i = uoc1.a().l0();
                                  Objects.requireNonNull(a1);
                                  if (PatchProxy.isSupport(textElementV1)) {
                                     Size obj4 = PatchProxy.applyTwoRefs(str7, Integer.valueOf(i), a1, textElementV1, "37");
                                     if (obj4 != patchProxyRe) {
                                        b3 = obj4.booleanValue();
                                     label_0521 :
                                        if (b3) {
                                           a1 = obj.b.A;
                                           Objects.requireNonNull(a1);
                                           if (!PatchProxy.applyVoidOneRefs(uEditTextBas4, a1, textElementV1, "47")) {
                                              a.p(uEditTextBas4, str5);
                                              Pair pair = a1.z0(uEditTextBas4);
                                              obj4 = pair.getSecond();
                                              a1.v1(uEditTextBas4.getEditTextBaseElementData(), obj4, pair.getFirst(), 16);
                                           }
                                        }
                                        if (!layerIndex1) {
                                           a1 = obj.b.c;
                                           if (a1 != null && (a1.isShowing() == true && (str6 == null && (obj.b.A.T0() && (uEditTextBas4.getEditTextBaseElementData().y0() && obj.b.z.a(uEditTextBas4.getTextFontName()) != obj.b.z.b()))))) {
                                              TextElementViewBinder$e b4 = obj.b;
                                              textElementV = b4.c;
                                              if (textElementV != null) {
                                                 textElementV.c(b4.z.a(uEditTextBas4.getTextFontName()));
                                              }
                                              str2 = 1;
                                           label_05b5 :
                                              obj1 = obj3;
                                              textElementV = textElementV3;
                                              iterator1 = iterator2;
                                              d = 0;
                                              str4 = null;
                                           }
                                        }
                                     }
                                  }
                                  a.p(str7, "textId");
                                  TextElementViewModel f = a1.F;
                                  Objects.requireNonNull(f);
                                  if (PatchProxy.isSupport(uoe)) {
                                     FeatureId obj5 = PatchProxy.applyTwoRefs(str7, Integer.valueOf(i), f, uoe, "22");
                                     if (obj5 != patchProxyRe) {
                                        b5 = obj5.booleanValue();
                                        f = 1;
                                     }else {
                                     label_04c6 :
                                        a.p(str7, "textID");
                                        c = f.c;
                                        if (c == null) {
                                           a.S("mTextDraft");
                                        }
                                        List list1 = c.o();
                                        a.o(list1, "mTextDraft.committedMessages");
                                        obj1 = list1.iterator();
                                        obj5 = null;
                                        while (obj1.hasNext()) {
                                           text = obj1.next();
                                           if (text.hasResult()) {
                                              a.o(text, "it");
                                              StickerResult result = text.getResult();
                                              a.o(result, "it.result");
                                              if (result.getZIndex() == i) {
                                                 obj5 = text.getFeatureId();
                                              }
                                           }
                                        }
                                        if (obj5 != null && a.g(d.f(obj5), str7)) {
                                           b5 = 1;
                                        }else {
                                           b5 = 0;
                                        }
                                     }
                                  }else {
                                     goto label_04c6 ;
                                  }
                                  i5 = b5 ^ 0x01;
                                  b3 = i5;
                                  goto label_0521 ;
                               }else {
                                  obj3 = obj1;
                                  textElementV3 = textElementV;
                                  iterator2 = iterator1;
                                  str6 = str2;
                                  i1.c(new RuntimeException("CHANGE_ALL error insert failed"));
                               }
                            label_05b3 :
                               str2 = str6;
                               goto label_05b5 ;
                            }
                            obj.b.J().e0();
                         }
                      }
                   }else {
                      obj3 = obj1;
                      uoc2 = obj3.c().get(i);
                      TextElementViewBinder$e b6 = obj.b;
                      uEditTextBas5 = a.a(uoc2.a(), uoc2.c(), b6.w, b6.G);
                      objArray1 = new Object[0];
                      a.D().w(str, "INSERT textElementUiData: payload:"+obj3.d(), objArray1);
                      boolean i6 = 20;
                      if (!a.g(obj3.d(), Integer.valueOf(3)) && (!a.g(obj3.d(), Integer.valueOf(4)) && (!a.g(obj3.d(), Integer.valueOf(0)) && (!a.g(obj3.d(), Integer.valueOf(1)) && (a.g(obj3.d(), Integer.valueOf(i6)) || a.g(obj3.d(), Integer.valueOf(i3))))))) {
                         i5 = uEditTextBas5.getLayerIndex();
                         if (a.g(obj3.d(), Integer.valueOf(4)) || a.g(obj3.d(), Integer.valueOf(1))) {
                            i5 = obj.b.J().b0(uEditTextBas5, obj3.d(), true);
                            obj.b.A.m1(uEditTextBas5);
                         }else if(i5 >= 0 && (a.g(obj3.d(), Integer.valueOf(i6)) || a.g(obj3.d(), Integer.valueOf(i3)))){
                            uEditDecorat2 = obj.b.J();
                            Object obj7 = obj3.d();
                            Integer integer1 = Integer.valueOf(19);
                            i6 = a.g(obj3.d(), Integer.valueOf(i6));
                            Objects.requireNonNull(uEditDecorat2);
                            if (PatchProxy.isSupport(EditDecorationContainerView.class)) {
                               objArray = new Object[]{Integer.valueOf(i5),uEditTextBas5,obj7,integer1,Boolean.valueOf(i6)};
                               obj6 = PatchProxy.apply(objArray, uEditDecorat2, EditDecorationContainerView.class, "12");
                               if (obj6 != patchProxyRe) {
                                  i5 = obj6.booleanValue();
                               }else if(PatchProxy.isSupport(EditDecorationContainerView.class)){
                                  obj6 = new Object[]{Integer.valueOf(i5),uEditTextBas5,obj7,integer1,Boolean.valueOf(i6),Boolean.TRUE};
                                  obj8 = PatchProxy.apply(obj6, uEditDecorat2, EditDecorationContainerView.class, "13");
                                  if (obj8 != patchProxyRe) {
                                     i5 = obj8.booleanValue();
                                  }
                               }
                               EditDecorationBaseDrawer uEditDecorat1 = uEditDecorat2.n0(i5);
                               boolean b7 = true;
                               layerIndex = uEditDecorat2.i0(uEditDecorat1, integer1, b7);
                               i6 = (i6)? uEditDecorat2.a0(uEditTextBas5, obj7, b7): uEditDecorat2.b0(uEditTextBas5, obj7, b7);
                               if (uEditDecorat1 != null) {
                                  uEditDecorat1.remove(uEditDecorat2, false);
                               }
                               if (i6 && layerIndex) {
                                  i5 = true;
                               }else {
                                  i5 = false;
                               }
                            }else {
                               goto label_06f9 ;
                            }
                            if (a.g(obj3.d(), Integer.valueOf(i3))) {
                               obj.b.A.m1(uEditTextBas5);
                            }
                         }else if(a.g(obj3.d(), Integer.valueOf(3))){
                            obj.b.J().R();
                         }
                         i5 = obj.b.J().Z(uEditTextBas5, obj3.d());
                         if (i5 && uEditTextBas5.getLayerIndex() < 0) {
                            EditTextBaseElement topElement = obj.b.J().getTopElement();
                            i1 = (topElement == null)? 0: topElement.getLayerIndex() + 1;
                            uEditTextBas5.setLayerIndex(i1);
                         }
                         obj.b.A.s1(uEditTextBas5.getLayerIndex(), uEditTextBas5.getTextFontName());
                         uoc2.a().a(uEditTextBas5.getEditTextBaseElementData());
                         i1 = i5;
                      }else {
                         obj8 = 0;
                      }
                      if (!i1) {
                         i1.c(new RuntimeException("INSERT error insert failed"));
                      }
                   }
                }else {
                   obj9 = obj1.d();
                   Objects.requireNonNull(obj9, "null cannot be cast to non-null type kotlin.Pair<kotlin.Int, kotlin.Int>");
                   objArray3 = new Object[0];
                   a.D().w(str, "REMOVE payload:"+obj9, objArray3);
                   if (obj9.getFirst().intValue() == 9 || obj9.getFirst().intValue() == 19) {
                      Object[] objArray4 = new Object[0];
                      a.D().w(str, "REMOVE do nothing", objArray4);
                   }else if(obj9.getFirst().intValue() == 8 || obj9.getFirst().intValue() == 11){
                      if (!obj.b.J().j0(obj9.getSecond().intValue(), obj9.getFirst())) {
                         i1.c(new RuntimeException("REMOVE error remove failed"));
                      }
                   }else {
                      throw new RuntimeException("REMOVE no this action payload:"+obj9);
                   }
                }
             }else {
                obj3 = obj1;
                uoc2 = obj3.c().get(i);
                objArray3 = new Object[0];
                a.D().w(str, "CHANGE editTextUiData:"+uoc2, objArray3);
                if (a.g(obj3.d(), Integer.valueOf(6)) || a.g(obj3.d(), Integer.valueOf(5))) {
                   uEditTextBas5 = obj.b.J().p0(uoc2.a().l0());
                   if (uEditTextBas5 != null) {
                      obj.b.J().C0(uEditTextBas5);
                      uoc2.a().a(uEditTextBas5.getEditTextBaseElementData());
                      obj.b.A.r1(uEditTextBas5.getLayerIndex(), uEditTextBas5.getText());
                   }else {
                      i1.c(new RuntimeException("CHANGE error change text"));
                   }
                }else {
                   i5 = 7;
                   if (a.g(obj3.d(), Integer.valueOf(i5)) || a.g(obj3.d(), Integer.valueOf(23))) {
                      uEditTextBas5 = obj.b.J().p0(uoc2.a().l0());
                      if (uEditTextBas5 != null) {
                         uEditTextBas5.updateCommonData(uoc2.a().e0());
                         if (a.g(obj3.d(), Integer.valueOf(i5))) {
                            obj.b.A.m1(uEditTextBas5);
                         }
                      }
                   }else {
                      str7 = "changedElement font: ";
                      if (a.g(obj3.d(), Integer.valueOf(13))) {
                         uEditTextBas5 = obj.b.J().p0(uoc2.a().l0());
                         if (uEditTextBas5 != null) {
                            String str9 = uoc2.a().C0().k();
                            Object[] objArray5 = new Object[0];
                            a.D().s(str, str7+str9, objArray5);
                            uEditTextBas5.updateTextFont(str9);
                            obj.b.J().C0(uEditTextBas5);
                            uoc2.a().a(uEditTextBas5.getEditTextBaseElementData());
                            obj.b.A.r1(uEditTextBas5.getLayerIndex(), uEditTextBas5.getText());
                         }
                      }else if(a.g(obj3.d(), Integer.valueOf(14))){
                         uEditTextBas5 = obj.b.J().p0(uoc2.a().l0());
                         if (uEditTextBas5 != null) {
                            obj9 = uoc2.a().C0().k();
                            objArray3 = new Object[0];
                            a.D().s(str, str7+obj9, objArray3);
                            uEditTextBas5.setNeedReGenerateFile(true);
                            uEditTextBas5.updateTextFont(obj9);
                            obj.b.A.m1(uEditTextBas5);
                         }
                      }else if(!a.g(obj3.d(), Integer.valueOf(16))){
                         i5 = 18;
                         if (a.g(obj3.d(), Integer.valueOf(17)) || a.g(obj3.d(), Integer.valueOf(i5))) {
                            uEditTextBas5 = obj.b.J().p0(uoc2.a().l0());
                            if (uEditTextBas5 != null) {
                               uEditTextBas5.updateTextStyle(uoc2.a().z0());
                               obj.b.J().C0(uEditTextBas5);
                               if (a.g(obj3.d(), Integer.valueOf(i5))) {
                                  uEditTextBas5.setNeedReGenerateFile(true);
                                  obj.b.A.m1(uEditTextBas5);
                               }
                            }
                         }else if(a.g(obj3.d(), Integer.valueOf(24))){
                            uEditTextBas5 = obj.b.J().p0(uoc2.a().l0());
                            if (uEditTextBas5 != null) {
                               uEditTextBas5.updateText(uoc2.c());
                               obj.b.J().post(new a(uEditTextBas5, obj, uoc2));
                            }
                         }else if(a.g(obj3.d(), Integer.valueOf(25))){
                            uEditTextBas5 = obj.b.J().p0(uoc2.a().l0());
                            if (uEditTextBas5 != null) {
                               uEditTextBas5.updateAlpha(0x3f000000);
                               uEditTextBas5.updateCommonData(uoc2.a().e0());
                               obj.b.J().C0(uEditTextBas5);
                            }
                         }else {
                            throw new RuntimeException("CHANGE no this action payload:"+obj3.d());
                         }
                      }
                   }
                }
             }
          }
       }
    }
}
