package com.yxcorp.gifshow.magic.ui.magicemoji.mydelete.c$b;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import s5b.b;
import java.lang.Throwable;
import w46.b;

public class c$b	// class@001bd9
{
    public ProgressFragment a;
    public Fragment b;

    public void c$b(Fragment p0){
       super();
       this.b = p0;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, c$b.class, "1")) {
          return;
       }
       try{
          c$b ta = this.a;
          if (ta == null) {
             return;
          }else {
             ta.dismiss();
          }
       }catch(java.lang.Exception e0){
          Object[] objArray = new Object[]{"dismissDialog"};
          b.D().u("MagicFaceDelete", e0, objArray);
       }
       return;
    }
}
