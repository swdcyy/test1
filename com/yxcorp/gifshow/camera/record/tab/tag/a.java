package com.yxcorp.gifshow.camera.record.tab.tag.a;
import fh9.a;
import com.yxcorp.gifshow.camera.record.tab.tag.CameraTabTagManager;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import j8c.a;
import q87.c;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import com.yxcorp.gifshow.camera.record.tab.tag.CameraTabTagConfig;
import java.lang.Integer;
import lnc.a1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.camera.record.tab.tag.CameraTabTagManager$a;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.View;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kwai.library.widget.textview.SizeAdjustableTextView;
import android.widget.TextView;
import android.text.TextPaint;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatTextView;
import com.kwai.library.widget.textview.KwaiSizeAdjustableTextView;
import ekd.n1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.content.Intent;
import android.app.Activity;
import java.util.HashSet;
import hh9.a;
import ok.o;
import com.google.common.collect.Maps;
import oa0.a;

public final class a implements a	// class@000f57
{
    public final CameraTabTagManager a;

    public void a(CameraTabTagManager p0){
       this.a = p0;
    }
    public final void a(List p0){
       int i1;
       CameraTabTagManager$a uoa;
       CameraTabTagConfig mGuidanceChi;
       int i4;
       GradientDrawable gradientDraw;
       Iterator obj = p0;
       a a = this.a;
       Objects.requireNonNull(a);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       CameraTabTagManager uCameraTabTa = CameraTabTagManager.class;
       if (PatchProxy.applyVoidOneRefs(obj, a, uCameraTabTa, "4")) {
       }else if(q.f(p0)){
          int i = 0;
          Object[] objArray = new Object[i];
          a.D().s("CameraTabTagManager", "parseTabBtnTagList", objArray);
          Map map = CameraTabTagManager.b();
          Object obj1 = null;
          Iterator obj2 = PatchProxy.applyTwoRefs(obj, map, obj1, uCameraTabTa, "8");
          if (obj2 != patchProxyRe) {
          }else if(q.f(p0)){
             obj2 = obj1;
          }else {
             HashMap hashMap = new HashMap();
             Iterator iterator1 = p0.iterator();
             while (iterator1.hasNext()) {
                mGuidanceChi = iterator1.next();
                if (hashMap.containsKey(Integer.valueOf(mGuidanceChi.mCameraTabType))) {
                   continue ;
                }else {
                   long l = a1.k();
                   if (l - mGuidanceChi.mEndShowTime > 0 || l - mGuidanceChi.mBeginShowTime < 0) {
                      continue ;
                   }else {
                      int i5 = CameraTabTagManager.a(mGuidanceChi, map);
                      if (i5 == -1 || (i5 >= mGuidanceChi.mMaxCount || (!TextUtils.x(mGuidanceChi.mGuidanceIcon) && (mGuidanceChi.mGuidanceIconHeight <= null || mGuidanceChi.mGuidanceIconWidth <= null)))) {
                         continue ;
                      }
                   }
                }
                hashMap.put(Integer.valueOf(mGuidanceChi.mCameraTabType), mGuidanceChi);
             }
             obj2 = hashMap.values();
          }
          if (!q.f(obj2)) {
             if (!PatchProxy.applyVoidTwoRefs(obj2, map, a, uCameraTabTa, "6")) {
                obj2 = obj2.iterator();
                while (obj2.hasNext()) {
                   CameraTabTagConfig uCameraTabTa2 = obj2.next();
                   if (!PatchProxy.applyVoidTwoRefs(uCameraTabTa2, map, a, uCameraTabTa, "7")) {
                      Iterator iterator = a.a.values().iterator();
                      while (true) {
                         if (iterator.hasNext()) {
                            uoa = iterator.next();
                            if (uCameraTabTa2.mCameraTabType != uoa.d) {
                               continue ;
                            }
                         }else {
                            uoa = obj1;
                         }
                         if (!TextUtils.x(uCameraTabTa2.mGuidanceChinese) && uoa != null) {
                            CameraTabTagManager$a c = uoa.c;
                            if (c == null || (uoa.b != null && (c.getParent() != null && (!uoa.b.isSelected() || uCameraTabTa2.mIsRemainShowAfterClick != null)))) {
                               Object[] objArray1 = new Object[i];
                               a.D().s("CameraTabTagManager", "showBtnTag", objArray1);
                               int i2 = 1;
                               int i3 = CameraTabTagManager.a(uCameraTabTa2, map) + i2;
                               CameraTabTagManager.e(uCameraTabTa2, i3, map);
                               mGuidanceChi = uCameraTabTa2.mGuidanceChinese;
                               if (!PatchProxy.applyVoidOneRefs(mGuidanceChi, obj1, uCameraTabTa, "13") && !TextUtils.x(mGuidanceChi)) {
                                  ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                                  uElementPack.action2 = "KUAISHAN_UP_TEXT_TIPS";
                                  JsonObject jsonObject = new JsonObject();
                                  jsonObject.c0("button_up_text", mGuidanceChi);
                                  uElementPack.params = jsonObject.toString();
                                  u1.u0(7, uElementPack, obj1);
                               }
                               String str = 2;
                               if (TextUtils.x(uCameraTabTa2.mGuidanceIcon)) {
                                  uoa.c.setLayoutResource(R.layout.arg_RES_7f0d1623);
                                  SizeAdjustableTextView sizeAdjustab = uoa.c.inflate();
                                  uoa.e = sizeAdjustab;
                                  sizeAdjustab.setText(uCameraTabTa2.mGuidanceChinese);
                                  sizeAdjustab.getPaint().setFakeBoldText(i2);
                                  i4 = 0x7f0604ba;
                                  i1 = a1.a(i4);
                                  if (!TextUtils.x(uCameraTabTa2.mBackgroundColor)) {
                                     i1 = TextUtils.J(uCameraTabTa2.mBackgroundColor, a1.a(i4));
                                  }
                                  if (PatchProxy.isSupport(uCameraTabTa)) {
                                     gradientDraw = PatchProxy.applyOneRefs(Integer.valueOf(i1), obj1, uCameraTabTa, "15");
                                     if (gradientDraw != patchProxyRe) {
                                     label_01b5 :
                                        sizeAdjustab.setBackgroundDrawable(gradientDraw);
                                        if (sizeAdjustab.getBackgroundRadius() > 0) {
                                           n1.c(sizeAdjustab, sizeAdjustab.getBackgroundRadius());
                                        }
                                        i1 = 0;
                                     }
                                  }
                                  gradientDraw = new GradientDrawable();
                                  gradientDraw.setColor(i1);
                                  goto label_01b5 ;
                               }else {
                                  uoa.c.setLayoutResource(R.layout.arg_RES_7f0d15a2);
                                  KwaiImageView kwaiImageVie = uoa.c.inflate();
                                  kwaiImageVie.getLayoutParams().height = a1.e((float)uCameraTabTa2.mGuidanceIconHeight);
                                  kwaiImageVie.getLayoutParams().width = a1.e((float)uCameraTabTa2.mGuidanceIconWidth);
                                  if (kwaiImageVie.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
                                     i4 = kwaiImageVie.getLayoutParams().height / str;
                                     i2 = a1.d(0x7f07101a) - i4;
                                     if (i2 < 0) {
                                        i2 = 0;
                                     }
                                     Object[] objArray2 = new Object[0];
                                     a.D().y("CameraTabTagManager", "showBtnTag, marginTop: "+i2, objArray2);
                                     kwaiImageVie.getLayoutParams().topMargin = i2;
                                  }else {
                                     i1 = 0;
                                  }
                                  uoa.e = kwaiImageVie;
                                  kwaiImageVie.L(uCameraTabTa2.mGuidanceIcon);
                               }
                               if (uCameraTabTa2.mCameraTabType == 2) {
                                  CameraTabTagManager b = a.b;
                                  if (b != null) {
                                     b.getIntent().putExtra("followTagGroupId", uCameraTabTa2.mTabId);
                                  }
                               }
                               uoa.f = uCameraTabTa2;
                               a.d(uCameraTabTa2.mCameraTabType, uoa.e, true, uCameraTabTa2.mGuidanceChinese);
                            label_0257 :
                               i = 0;
                               obj1 = null;
                            }
                         }
                      }
                   }
                label_00ce :
                   i1 = 0;
                   goto label_0257 ;
                }
             }
             if (!PatchProxy.applyVoidTwoRefs(obj, map, null, uCameraTabTa, "11")) {
                if (q.f(p0)) {
                   map.clear();
                }else {
                   HashSet hashSet = new HashSet();
                   obj = p0.iterator();
                   while (obj.hasNext()) {
                      CameraTabTagConfig uCameraTabTa1 = obj.next();
                      if (uCameraTabTa1 == null || TextUtils.x(uCameraTabTa1.getUniqueIdentifier())) {
                         continue ;
                      }
                      hashSet.add(uCameraTabTa1.getUniqueIdentifier());
                   }
                   map = new HashMap(Maps.i(map, new a(hashSet)));
                }
                a.J0(map);
             }
          }
       }
       return;
    }
}
