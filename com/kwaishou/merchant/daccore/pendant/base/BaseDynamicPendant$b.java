package com.kwaishou.merchant.daccore.pendant.base.BaseDynamicPendant$b;
import hu4.f;
import com.kwaishou.merchant.daccore.pendant.base.BaseDynamicPendant;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import q08.a;
import f08.f;
import l08.c;
import f08.f$a;
import java.util.Map;
import android.view.ViewGroup;
import hu4.e;

public final class BaseDynamicPendant$b implements f	// class@00132e
{
    public final BaseDynamicPendant a;

    public void BaseDynamicPendant$b(BaseDynamicPendant p0){
       this.a = p0;
       super();
    }
    public void a(Throwable p0){
       BaseDynamicPendant j = this.a.j;
       if (j != null) {
          j.c("render_main_view", false);
       }
       f$a.b(f.a, this.a.d(), this.a.e(), "component view load failed", p0, null, 16, null);
       return;
    }
    public void b(ViewGroup p0){
       BaseDynamicPendant j = this.a.j;
       if (j != null) {
          j.c("render_main_view", true);
       }
       f$a.c(f.a, this.a.d(), this.a.e(), "component view load success", null, true, 8, null);
       return;
    }
    public void c(){
       e.a(this);
    }
}
