package com.yxcorp.gifshow.homepage.kcube.f;
import com.kwai.kcube.decorator.IContainerDecorator;
import android.view.ViewGroup;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import br6.a;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import i2b.a;
import com.kwai.kcube.ext.MvpDecoratorViewHolder;
import com.yxcorp.gifshow.homepage.kcube.e;
import psa.b;
import z1.a;
import msd.a;
import java.util.ArrayList;
import com.google.common.collect.Lists;

public class f extends IContainerDecorator	// class@001730
{
    public f$a h;

    public void f(){
       super();
    }
    public List g(ViewGroup p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       a[] obj = PatchProxy.applyOneRefs(p0, this, uof, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new a[1];
       MvpDecoratorViewHolder mvpDecorator = PatchProxy.applyOneRefs(p0, this, uof, "2");
       if (mvpDecorator != patchProxyRe) {
       }else {
          mvpDecorator = new MvpDecoratorViewHolder(a.f(LayoutInflater.from(p0.getContext()), 0x7f0d06ca, null), 0, e.a, new b(this));
       }
       obj[0] = mvpDecorator;
       return Lists.e(obj);
    }
}
