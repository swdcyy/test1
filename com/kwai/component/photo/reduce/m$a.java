package com.kwai.component.photo.reduce.m$a;
import y8c.g;
import com.kwai.component.photo.reduce.m;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import android.view.View;
import i2b.a;
import com.kwai.component.photo.reduce.m$b;
import ml8.c;

public class m$a extends g	// class@000af1
{
    public final m w;

    public void m$a(m p0){
       this.w = p0;
       super();
    }
    public f h1(ViewGroup p0,int p1){
       m$a uoa = m$a.class;
       if (PatchProxy.isSupport(uoa)) {
          p0 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       PresenterV2 presenterV2 = new PresenterV2();
       presenterV2.U7(new m$b(this.w));
       return new f(a.a(this.w.getContext(), 0x7f0d1133), presenterV2);
    }
}
