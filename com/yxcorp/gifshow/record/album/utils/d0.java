package com.yxcorp.gifshow.record.album.utils.d0;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.yxcorp.gifshow.record.album.utils.g0;
import i2b.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import tkd.b;
import tkd.d;
import f0c.t;
import com.yxcorp.gifshow.postwork.a;
import r26.a;
import k8c.a;
import q87.c;
import r16.e;
import r16.f;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.io.File;
import qkd.b;
import lnc.a1;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import o07.n;

public final class d0 implements PopupInterface$f	// class@001762
{
    public static final d0 b;

    static {
       d0.b = new d0();
    }
    public void d0(){
       super();
    }
    public final View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       Object[] objArray;
       int i = (g0.c())? 0x7f0d0323: 0x7f0d02f0;
       boolean b = false;
       View view = a.g(p1, i, p2, b);
       if (g0.c() && !PatchProxy.applyVoidOneRefs(view, null, g0.class, "18")) {
          KwaiImageView kwaiImageVie = view.findViewById(R.id.cover_thumb);
          kwaiImageVie.setVisibility(8);
          a uoa = d.a(-273232199).a20().d4();
          String str = "DraftRecoverUtil";
          if (uoa == null) {
             objArray = new Object[b];
             a.D().w(str, "renderRecoverPostCover\(\) called and iPostWorkInfo is null", objArray);
          }else {
             String str1 = d.a(0x6758ee6d).oz(uoa);
             if (TextUtils.x(str1)) {
                objArray = new Object[b];
                a.D().w(str, "renderRecoverPostCover\(\) called and filePath is empty", objArray);
             }else {
                File uFile = new File(str1);
                if (b.S(uFile)) {
                   Object[] objArray1 = new Object[b];
                   a.D().w(str, "renderRecoverPostCover\(\) called and coverFile is valid", objArray1);
                   kwaiImageVie.v(uFile, a1.d(R.dimen.arg_RES_7f0701ed), a1.d(R.dimen.arg_RES_7f0701ed));
                   kwaiImageVie.setVisibility(b);
                }else {
                   objArray = new Object[b];
                   a.D().w(str, "renderRecoverPostCover\(\) called and coverFile is not valid", objArray);
                }
             }
          }
       }
       return view;
    }
    public void b(c p0){
       n.a(this, p0);
    }
}
