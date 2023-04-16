package com.yxcorp.gifshow.share.widget.MerchantSectionFragment;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;
import com.yxcorp.gifshow.share.widget.MerchantSectionFragment$a;
import nsd.u;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import uo7.j0;
import java.util.Collections;
import uo7.a;
import ip7.h;
import java.util.Collection;

public final class MerchantSectionFragment extends ForwardGridSectionFragment	// class@001d19
{
    public JsMerchantShareParams X0;
    public CheckBox Y0;
    public TextView Z0;
    public static final MerchantSectionFragment$a a1;

    static {
       MerchantSectionFragment.a1 = new MerchantSectionFragment$a(null);
    }
    public void MerchantSectionFragment(){
       super();
    }
    public void dd(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantSectionFragment.class, "2")) {
          return;
       }
       a.p(p0, "operationList");
       ArrayList uArrayList = new ArrayList();
       List list = Collections.emptyList();
       a.o(list, "Collections.emptyList\(\)");
       j0 oj0 = new j0(list, "MERCHANT_POP_BANNER", null, null, 12, null);
       uArrayList.add(0, v9);
       uArrayList.addAll(p0);
       super.dd(uArrayList);
       return;
    }
}
