package com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapPresenter$c;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapPresenter;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import i5b.j;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import i5b.h;
import k2b.e0;
import com.yxcorp.gifshow.models.QMedia;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import i5b.c;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMediaArrayList;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.d;
import java.util.Collection;
import com.yxcorp.gifshow.magic.data.swap.models.SwapQMedia;
import s5b.b;
import q87.c;
import java.util.Iterator;
import java.lang.StringBuilder;
import java.util.List;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.a;
import com.kwai.gifshow.post.api.feature.magic.SwapMagicEffectDescription;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.a$a;
import java.lang.Number;
import uyb.m;
import android.content.Intent;
import i5b.i;
import com.yxcorp.gifshow.activity.GifshowActivity;
import i5b.f0;
import n3d.a;

public class SwapPresenter$c implements View$OnClickListener	// class@001c2b
{
    public final SwapPresenter b;

    public void SwapPresenter$c(SwapPresenter p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       a$a uoa;
       ArrayList uArrayList1;
       int i;
       int i1;
       Object obj = this;
       if (PatchProxy.applyVoidOneRefs(p0, obj, SwapPresenter$c.class, "1")) {
          return;
       }
       if (!PermissionUtils.a(obj.b.getActivity(), "android.permission.WRITE_EXTERNAL_STORAGE")) {
          obj.b.V8();
          return;
       }else {
          j.a.b(obj.b.M.b(), 0, null, true, obj.b.M.h());
          SwapPresenter$c b = obj.b;
          Objects.requireNonNull(b);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          SwapPresenter swapPresente = SwapPresenter.class;
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, b, swapPresente, "26")) {
             ArrayList uArrayList = PatchProxy.apply(objArray, b, swapPresente, "27");
             if (uArrayList != patchProxyRe) {
             }else {
                uArrayList = new ArrayList();
                if (b.N.j()) {
                   uArrayList.addAll(b.R.u1());
                }else {
                   QMedia qMedia1 = b.R.s1();
                   if (qMedia1 != null && !qMedia1 instanceof SwapQMedia) {
                      uArrayList.add(qMedia1);
                   }
                }
             }
             Object obj1 = uArrayList;
             Object[] objArray1 = new Object[0];
             String str = "SwapPresenter";
             b.D().w(str, "openLocalAlbum", objArray1);
             Iterator iterator = obj1.iterator();
             while (iterator.hasNext()) {
                QMedia qMedia = iterator.next();
                Object[] objArray2 = new Object[0];
                b.D().s(str, "media:"+qMedia+" , mExportFilePath:"+qMedia.mExportFilePath, objArray2);
             }
             if (b.N.a() != null && b.N.a().size() > 0) {
                uArrayList = new ArrayList();
                Iterator iterator1 = b.N.a().iterator();
                while (iterator1.hasNext()) {
                   SwapMagicEffectDescription swapMagicEff = new SwapMagicEffectDescription();
                   uoa = iterator1.next().c();
                   swapMagicEff.mDuration = (int)uoa.a();
                   swapMagicEff.mWidth = uoa.c();
                   swapMagicEff.mHeight = uoa.b();
                   uArrayList.add(swapMagicEff);
                }
             }else if(b.N.g() != null){
                uArrayList = new ArrayList();
                SwapMagicEffectDescription swapMagicEff1 = new SwapMagicEffectDescription();
                uoa = b.N.g();
                swapMagicEff1.mDuration = (int)uoa.a();
                swapMagicEff1.mWidth = uoa.c();
                swapMagicEff1.mHeight = uoa.b();
                uArrayList.add(swapMagicEff1);
             }else {
                uArrayList1 = objArray;
             label_0146 :
                SwapPresenter s = b.S;
                Activity activity = b.getActivity();
                Object obj2 = PatchProxy.apply(objArray, b, swapPresente, "28");
                if (obj2 != patchProxyRe) {
                   i = obj2.intValue();
                }else if(b.N.j()){
                   i = b.N.c();
                }else {
                   i1 = 1;
                label_016d :
                   int i2 = b.R8();
                   int i3 = (b.M.f() != null)? b.M.f().getRecordDuration(): 0;
                   Intent intent = s.a(activity, i1, i2, i3, b.M.i(), b.M.h(), uArrayList1, obj1);
                   if (intent != null) {
                      SwapPresenter s1 = b.S;
                      Objects.requireNonNull(s1);
                      b.getActivity().t1(intent, 100, new f0(s1));
                   }
                }
                i1 = i;
                goto label_016d ;
             }
             uArrayList1 = uArrayList;
             goto label_0146 ;
          }
          return;
       }
    }
}
