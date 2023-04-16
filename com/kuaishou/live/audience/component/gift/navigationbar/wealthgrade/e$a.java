package com.kuaishou.live.audience.component.gift.navigationbar.wealthgrade.e$a;
import cl1.b;
import com.kuaishou.live.audience.component.gift.navigationbar.wealthgrade.e;
import java.lang.Object;
import cl1.a;
import com.kuaishou.live.common.core.component.gift.LiveGiftNumberNewSelectDialog$LiveGiftBatchNumberItem;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;

public class e$a implements b	// class@000b80
{
    public final e a;

    public void e$a(e p0){
       this.a = p0;
       super();
    }
    public void a(){
       a.b(this);
    }
    public void b(int p0,int p1,LiveGiftNumberNewSelectDialog$LiveGiftBatchNumberItem p2){
       if (PatchProxy.isSupport(e$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, e$a.class, "1")) {
          return;
       }
       e$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs("on_batch_count_select", ta, e.class, "3")) {
          ta.g(ta.i, "on_batch_count_select");
       }
       return;
    }
    public void c(){
       a.c(this);
    }
    public void d(){
       a.e(this);
    }
    public void e(){
       a.d(this);
    }
}
