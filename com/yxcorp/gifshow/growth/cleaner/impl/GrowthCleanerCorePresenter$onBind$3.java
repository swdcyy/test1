package com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter$onBind$3;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import fna.j;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import ena.h;
import ena.j;
import fna.j$d;
import fna.j$c;
import android.view.View;
import com.yxcorp.gifshow.growth.util.GrowthCommonExtKt;
import android.view.ViewGroup;
import fna.j$e;
import fna.b;
import fna.f;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Boolean;
import java.lang.Float;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import java.lang.Integer;
import java.lang.Number;
import com.google.gson.JsonElement;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import com.yxcorp.gifshow.growth.cleaner.ui.GrowthCleanerCircle;
import java.util.ArrayList;
import android.widget.TextView;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerHelper;
import java.lang.CharSequence;
import com.yxcorp.gifshow.growth.cleaner.ui.GrowthCleanerLayout;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCategory;
import gna.a;
import gna.b$b;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter$refreshRecyclerList$$inlined$also$lambda$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import lnc.a1;
import fna.j$h;
import fna.j$g;
import java.lang.Math;
import fna.a;
import fna.i;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import fna.j$a;
import fna.j$b;

public final class GrowthCleanerCorePresenter$onBind$3 extends FunctionReferenceImpl implements l	// class@00132c
{

    public void GrowthCleanerCorePresenter$onBind$3(GrowthCleanerCorePresenter p0){
       super(1, p0, GrowthCleanerCorePresenter.class, "handleEvent", "handleEvent\(Lcom/yxcorp/gifshow/growth/cleaner/impl/GrowthCleanerEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(j p0){
       Activity activity;
       GrowthCleanerCorePresenter z;
       GrowthCleanerCorePresenter c;
       boolean b2;
       String str2;
       int i3;
       ClientEvent$ElementPackage uElementPack1;
       JsonObject jsonObject1;
       Activity uActivity;
       Object obj = this;
       a obj1 = p0;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(obj1, obj, GrowthCleanerCorePresenter$onBind$3.class, str)) {
          return;
       }
       a.p(obj1, "p1");
       CallableReference receiver = obj.receiver;
       Objects.requireNonNull(receiver);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       h oh = h.class;
       GrowthCleanerCorePresenter growthCleane = GrowthCleanerCorePresenter.class;
       if (!PatchProxy.applyVoidOneRefs(obj1, receiver, growthCleane, "14")) {
          GrowthCleanerCorePresenter t = receiver.t;
          if (t != null) {
             j m = t.m;
             if (m != null) {
                j e = t.e;
                if (e != null) {
                   j f = t.f;
                   if (f != null) {
                      j i = t.i;
                      if (i != null) {
                         v11 = obj1 instanceof j$d;
                         int i1 = 0;
                         boolean b = true;
                         boolean b1 = (v11 || obj1 instanceof j$c)? true: false;
                         receiver.x = b1;
                         GrowthCommonExtKt.g(m, i1);
                         e.setAlpha(0x3f800000);
                         String str1 = "scan_total_size";
                         int i2 = 100;
                         Object[] objArray = null;
                         if (obj1 instanceof j$e) {
                            receiver.A = b;
                            float f1 = f.b(obj1.c().b());
                            receiver.C = receiver.D;
                            receiver.D = f1;
                            activity = receiver.getActivity();
                            z = receiver.z;
                            c = receiver.C;
                            if (!PatchProxy.isSupport(oh) || !PatchProxy.applyVoidFourRefs(activity, Boolean.valueOf(z), Float.valueOf(f1), Float.valueOf(c), null, h.class, "3")) {
                               ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                               uElementPack.action2 = "SCAN_FINISH";
                               JsonObject jsonObject = new JsonObject();
                               jsonObject.a0("is_rescan", Integer.valueOf(z));
                               jsonObject.a0(str1, Float.valueOf(f1));
                               jsonObject.a0("last_scan_total_size", Float.valueOf(c));
                               uElementPack.params = jsonObject.toString();
                               if (!activity instanceof e0) {
                                  activity = objArray;
                               }
                               u1.D0("", activity, 1, uElementPack, null, null);
                            }
                            f.setProgress(i2);
                            b2 = false;
                            f.setAnimating(b2);
                            if (!PatchProxy.applyVoid(objArray, f, GrowthCleanerCircle.class, "8")) {
                               f.h.clear();
                               f.d();
                            }
                            i.setVisibility(b2);
                            i.setText(GrowthCleanerHelper.c(R.string.arg_RES_7f10059f));
                            receiver.d9(obj1.c().b());
                            if (!PatchProxy.applyVoidOneRefs(obj1, receiver, growthCleane, "16")) {
                               GrowthCleanerCorePresenter t1 = receiver.t;
                               if (t1 != null) {
                                  j s = t1.s;
                                  if (s != null) {
                                     j j = t1.j;
                                     if (j != null) {
                                        GrowthCleanerLayout growthCleane1 = new GrowthCleanerLayout();
                                        receiver.X8(growthCleane1, GrowthCleanerCategory.APP_CACHE, obj1);
                                        receiver.Y8(growthCleane1, GrowthCleanerCategory.APP_FILES, obj1);
                                        receiver.Y8(growthCleane1, GrowthCleanerCategory.APP_DOWNLOAD, obj1);
                                        receiver.Y8(growthCleane1, GrowthCleanerCategory.APP_OTHER, obj1);
                                        receiver.X8(growthCleane1, GrowthCleanerCategory.APP_UNINSTALL, obj1);
                                        receiver.X8(growthCleane1, GrowthCleanerCategory.APK, obj1);
                                        obj1 = new a(growthCleane1);
                                        receiver.c9(obj1.J0());
                                        obj1.g = new GrowthCleanerCorePresenter$refreshRecyclerList$$inlined$also$lambda$1(receiver, s);
                                        obj1.M0(false);
                                        s.setAdapter(obj1);
                                        receiver.u = obj1;
                                        receiver.Z8();
                                        j.setVisibility(false);
                                        GrowthCommonExtKt.f(j, a1.e(4.00f));
                                     }
                                  }
                               }
                            }
                         }else {
                            boolean b3 = false;
                            long l = 0;
                            if (obj1 instanceof j$h) {
                               receiver.A = b3;
                               receiver.B = b3;
                               receiver.d9(l);
                               f.setProgress(b3);
                               f.setAnimating(true);
                            }else if(obj1 instanceof j$g){
                               Object obj2 = obj1;
                               if (obj2.d()) {
                                  f.setProgress(Math.abs(((obj2.c() * 100) / obj2.d())));
                               }else {
                                  f.setProgress(i2);
                               }
                               if (obj2.c() != receiver.y) {
                                  receiver.y = obj2.c();
                                  j$g e2 = obj2.e;
                                  if (e2 != null) {
                                     a c1 = e2.c;
                                     if (c1 != null) {
                                        BitmapDrawable uBitmapDrawa = PatchProxy.applyOneRefs(c1, null, i.class, str);
                                        if (uBitmapDrawa != patchProxyRe) {
                                        }else {
                                           Integer integer = Integer.valueOf(c1.getIntrinsicWidth());
                                           i1 = (integer.intValue() > 0)? 1: 0;
                                           if (!i1) {
                                              integer = null;
                                           }
                                           int i4 = (integer != null)? integer.intValue(): 1;
                                           Integer integer1 = Integer.valueOf(c1.getIntrinsicHeight());
                                           Bitmap$Config uConfig = (integer1.intValue() > 0)? 1: null;
                                           if (!uConfig) {
                                              integer1 = null;
                                           }
                                           i1 = (integer1 != null)? integer1.intValue(): 1;
                                           Bitmap uBitmap = Bitmap.createBitmap(i4, i1, Bitmap$Config.ARGB_8888);
                                           c1.setBounds(0, 0, i4, i1);
                                           c1.draw(new Canvas(uBitmap));
                                           uBitmapDrawa = new BitmapDrawable(uBitmap);
                                        }
                                        if (!PatchProxy.applyVoidOneRefs(uBitmapDrawa, f, GrowthCleanerCircle.class, "6")) {
                                           a.p(uBitmapDrawa, "icon");
                                           f.h.add(uBitmapDrawa);
                                           f.d();
                                        }
                                     }
                                  }
                               }
                               receiver.d9(obj2.b().b());
                            }else if(v11){
                               f.setAnimating(true);
                               receiver.d9(obj1.c.b());
                            }else if(obj1 instanceof j$c){
                               obj = obj1;
                               if (obj.c().b() - l) {
                                  str2 = str1;
                                  f.setProgress((int)Math.abs(((obj.b().b() * (long)i2) / obj.c().b())));
                               }else {
                                  str2 = str1;
                                  f.setProgress(i2);
                               }
                               receiver.d9(obj.b().b());
                            label_0192 :
                               i3 = 0;
                            label_02c0 :
                               v8 = obj1 instanceof j$a;
                               if (m) {
                                  i.setVisibility(i3);
                                  i.setText(GrowthCleanerHelper.c(R.string.arg_RES_7f100593));
                               }else {
                                  i.setVisibility(8);
                               }
                               if (m || obj1 instanceof j$b) {
                                  float f2 = 0;
                                  if (m) {
                                     obj = obj1;
                                     Objects.requireNonNull(obj);
                                     b uob = PatchProxy.apply(null, obj, j$a.class, str);
                                     if (uob != patchProxyRe) {
                                     }else {
                                        uob = obj.d.c(obj.c);
                                     }
                                     f2 = f.b(uob.b());
                                  }
                                  b2 = true;
                                  receiver.B = b2;
                                  activity = receiver.getActivity();
                                  t = receiver.z;
                                  z = receiver.D;
                                  GrowthCleanerCorePresenter e1 = receiver.E;
                                  if (PatchProxy.isSupport(oh)) {
                                     Object[] objArray1 = new Object[]{activity,Boolean.valueOf(t),Float.valueOf(z),Float.valueOf(e1),Float.valueOf(f2)};
                                     if (!PatchProxy.applyVoid(objArray1, null, oh, "5")) {
                                     }
                                  }else {
                                     c = 0;
                                  }
                               }
                            label_038d :
                               receiver.a9(obj1);
                            }else {
                               str2 = str1;
                               if (obj1 instanceof j$a) {
                                  i3 = 0;
                                  f.setProgress(i3);
                                  f.setAnimating(i3);
                                  receiver.d9(l);
                                  goto label_02c0 ;
                               }else {
                                  i3 = 0;
                                  f.setProgress(i3);
                                  f.setAnimating(i3);
                                  receiver.d9(l);
                                  goto label_02c0 ;
                               }
                            }
                            str2 = str1;
                            goto label_0192 ;
                         }
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
