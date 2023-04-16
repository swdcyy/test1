package com.yxcorp.gifshow.detail.fragments.milano.presenter.c$d;
import df5.b;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.c;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import df5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.danmaku.DanmakuUtil;
import java.lang.CharSequence;
import android.widget.TextView;
import f6a.c;
import tw6.e;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;

public class c$d implements b	// class@00151e
{
    public final c a;

    public void c$d(c p0){
       this.a = p0;
       super();
    }
    public void a(QPhoto p0){
       a.a(this, p0);
    }
    public void b(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$d.class, "1")) {
          return;
       }
       c$d ta = this.a;
       ta.s = p0;
       ta.E.setHint(DanmakuUtil.h(p0));
       c$d ta1 = this.a;
       ta1.S8(4, c.j(ta1.s, ta1.p));
       ta1 = this.a;
       ta1.L.c0(ta1.S);
       this.a.P8();
       return;
    }
    public void c(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$d.class, "2")) {
          return;
       }
       c$d ta = this.a;
       ta.J = false;
       ta.L.d0(ta.S);
       ta.P = false;
       return;
    }
}
