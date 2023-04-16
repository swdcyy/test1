package com.yxcorp.plugin.search.result.reduce.presenter.a$a;
import y8c.g;
import com.yxcorp.plugin.search.result.reduce.presenter.a;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import i2b.a;
import com.yxcorp.plugin.search.result.reduce.presenter.a$b;
import ml8.c;

public class a$a extends g	// class@002329
{
    public final a w;

    public void a$a(a p0){
       this.w = p0;
       super();
    }
    public f h1(ViewGroup p0,int p1){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.i(p0, 0x7f0d144c), new a$b(this.w));
    }
}
