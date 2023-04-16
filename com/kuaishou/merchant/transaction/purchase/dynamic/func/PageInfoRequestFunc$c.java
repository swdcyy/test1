package com.kuaishou.merchant.transaction.purchase.dynamic.func.PageInfoRequestFunc$c;
import erd.a;
import com.kuaishou.merchant.transaction.purchase.dynamic.func.PageInfoRequestFunc;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.base.dynamic.LoadingViewModel;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.transaction.base.dynamic.LoadingViewModel$a;
import com.kuaishou.ksmvvm.command.KSCommand;

public final class PageInfoRequestFunc$c implements a	// class@00090b
{
    public final PageInfoRequestFunc b;

    public void PageInfoRequestFunc$c(PageInfoRequestFunc p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, PageInfoRequestFunc$c.class, "1")) {
          return;
       }
       LoadingViewModel.i.a(this.b.c).t0().a();
       return;
    }
}
