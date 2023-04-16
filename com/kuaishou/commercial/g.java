package com.kuaishou.commercial.g;
import erd.g;
import com.kuaishou.commercial.k;
import oq8.h$a;
import java.lang.Object;
import com.tachikoma.template.manage.template.CheckUpdateData;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o56.c;
import o56.a;
import xf6.l;
import com.tachikoma.template.manage.template.CheckUpdateData$TemplateData;
import java.util.Collection;
import ekd.q;
import java.util.List;
import java.util.Locale;
import java.lang.Integer;
import java.lang.CharSequence;
import e17.i;
import com.tachikoma.template.manage.template.TemplateException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import brd.t;
import ul9.a;
import t45.d;
import brd.z;
import cw.n;
import crd.b;

public final class g implements g	// class@0014be
{
    public final k b;
    public final h$a c;

    public void g(k p0,h$a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       g tb = this.b;
       g tc = this.c;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidTwoRefs(tc, p0, tb, k.class, "6")) {
       }else if(a.a().c() && l.c("adAutomatedTest", false)){
          CheckUpdateData mTemplateDat = p0.mTemplateData;
          int i = 0x7f11066a;
          if (mTemplateDat != null && !q.f(mTemplateDat.mTemplateInfoList)) {
             Object[] objArray = new Object[]{Integer.valueOf(mTemplateDat.mTemplateInfoList.size())};
             i.d(i, String.format(Locale.ENGLISH, "TK预下载开始:%d个", objArray));
          }else {
             i.d(i, "TK预下载无更新");
          }
       }
       if (tc != null) {
          tc.b(p0);
       }
       p0 = p0.mTemplateData;
       if (p0 != null) {
          a.c("commercial_night_watch", 0, 0, 20).observeOn(d.c).subscribe(new n(p0.mTaskInfos));
       }
       return;
    }
}
