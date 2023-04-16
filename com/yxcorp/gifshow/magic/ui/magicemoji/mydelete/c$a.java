package com.yxcorp.gifshow.magic.ui.magicemoji.mydelete.c$a;
import com.yxcorp.gifshow.magic.ui.magicemoji.mydelete.DeleteTopTitlePresenter$b;
import com.yxcorp.gifshow.magic.ui.magicemoji.mydelete.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import s5b.b;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.magic.ui.magicemoji.mydelete.e;

public class c$a implements DeleteTopTitlePresenter$b	// class@001bd8
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void a(int p0,boolean p1){
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       Object[] objArray = new Object[]{"  isSelect: "+p1};
       b.D().w("MagicFaceDelete", "onSelectAll  deleteType: "+p0, objArray);
       if (p0 != 1) {
          if (p0 == 2) {
             uoa = this.a;
             uoa.z = p1;
             uoa.s.T1(p0, p1);
             this.a.P8();
          }
          return;
       }else {
          uoa = this.a;
          uoa.y = p1;
          uoa.s.T1(p0, p1);
          this.a.P8();
          return;
       }
    }
}
