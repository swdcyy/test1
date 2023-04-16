package com.yxcorp.gifshow.init.module.UpdateConfigModule$1$1;
import hkd.d;
import com.yxcorp.gifshow.init.module.UpdateConfigModule$1;
import doc.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.response.ConfigResponse;
import com.kuaishou.gifshow.platform.network.keyconfig.ResourcePreloadingConfig;
import com.yxcorp.gifshow.util.resource.p;
import com.yxcorp.gifshow.util.resource.Category;
import com.yxcorp.gifshow.init.module.EmotionPluginInitModule;
import ok.x;
import java.lang.Boolean;
import pxa.e;
import q87.c;
import java.util.ArrayList;
import java.util.Iterator;
import com.yxcorp.gifshow.init.module.UpdateConfigModule;
import o56.a;
import android.content.Context;
import ekd.p0;
import qe6.b;
import qfc.b;
import boc.b;
import com.yxcorp.gifshow.util.resource.n$c;
import com.yxcorp.gifshow.util.resource.n;

public class UpdateConfigModule$1$1 extends d	// class@0019a7
{
    public final a b;
    public final UpdateConfigModule$1 c;

    public void UpdateConfigModule$1$1(UpdateConfigModule$1 p0,a p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, UpdateConfigModule$1$1.class, "1")) {
          return;
       }
       UpdateConfigModule$1$1 tb = this.b;
       if (tb instanceof ConfigResponse) {
          objArray = tb;
       }
       if (objArray == null) {
          PatchProxy.onMethodExit(UpdateConfigModule$1$1.class, "1");
          return;
       }else {
          int i = 0;
          boolean b = (this.c.b.limitDownloadEmoji != null)? true: false;
          p.a(objArray);
          this.b(objArray, Category.EMOJI, b);
          if (EmotionPluginInitModule.r.get().booleanValue()) {
             Object[] objArray1 = new Object[i];
             e.C().w("UpdateConfigModule", "updateConfig download MESSAGE_EMOJI ", objArray1);
             this.b(objArray, Category.MESSAGE_EMOJI, b);
          }
          this.b(objArray, Category.EMOJI_TTF, b);
          ArrayList uArrayList = new ArrayList();
          uArrayList.add(Category.KBAR_MMU);
          uArrayList.add(Category.HUAWEI_HIAI);
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             this.b(objArray, iterator.next(), true);
          }
          this.c.c.p0();
          if (p0.F(a.B) && b.b()) {
             this.c.c.o0(objArray);
          }else {
             this.c.c.q = objArray;
          }
          b.c(objArray);
          PatchProxy.onMethodExit(UpdateConfigModule$1$1.class, "1");
          return;
       }
    }
    public final void b(ConfigResponse p0,Category p1,boolean p2){
       if (PatchProxy.isSupport2(UpdateConfigModule$1$1.class, "2") && PatchProxy.applyVoidThreeRefsWithListener(p0, p1, Boolean.valueOf(p2), this, UpdateConfigModule$1$1.class, "2")) {
          return;
       }
       if (p.g(p0, p1)) {
          n.j(p0, p1, p2, true, true, null);
       }
       PatchProxy.onMethodExit(UpdateConfigModule$1$1.class, "2");
       return;
    }
}
