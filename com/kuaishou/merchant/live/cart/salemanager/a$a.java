package com.kuaishou.merchant.live.cart.salemanager.a$a;
import android.widget.Filter;
import com.kuaishou.merchant.live.cart.salemanager.a;
import java.lang.CharSequence;
import android.widget.Filter$FilterResults;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import g9c.a;
import java.util.Collection;
import com.yxcorp.utility.TextUtils;
import java.util.Iterator;
import com.kuaishou.merchant.live.cart.basic.model.ItemCard;
import com.kuaishou.merchant.api.core.model.Commodity;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public class a$a extends Filter	// class@0019d0
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public Filter$FilterResults performFiltering(CharSequence p0){
       String str;
       Filter$FilterResults obj = PatchProxy.applyOneRefs(p0, this, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Filter$FilterResults();
       a$a ta = this.a;
       if (ta.y == null) {
          ta.y = new ArrayList(this.a.Q0());
       }
       if (p0 instanceof String) {
          str = p0.trim();
       }
       ArrayList uArrayList = new ArrayList(this.a.y);
       if (TextUtils.x(str)) {
          obj.values = new ArrayList(uArrayList);
          obj.count = uArrayList.size();
          str.y = null;
       }else {
          ArrayList uArrayList1 = new ArrayList();
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             Object obj1 = iterator.next();
             if (obj1 instanceof ItemCard) {
                ItemCard obj2 = obj1;
                if (obj2.mType == 1) {
                   obj2 = obj2.mCommodity;
                   if (obj2 != null && (obj2.mTitle).contains(str)) {
                      uArrayList1.add(obj1);
                   }
                }
             }
          }
          obj.values = uArrayList1;
          obj.count = uArrayList1.size();
       }
       return obj;
    }
    public void publishResults(CharSequence p0,Filter$FilterResults p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a.class, "2")) {
          return;
       }
       this.a.W0(p1.values);
       this.a.k0();
       return;
    }
}
