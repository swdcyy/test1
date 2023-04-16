package com.kuaishou.merchant.transaction.order.orderlist.tab.OrderTabStaggeredGridLayoutManager;
import com.yxcorp.gifshow.recycler.widget.KwaiStaggeredGridLayoutManager;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.lang.IndexOutOfBoundsException;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import java.lang.Throwable;
import o74.a;

public class OrderTabStaggeredGridLayoutManager extends KwaiStaggeredGridLayoutManager	// class@0008bd
{

    public void OrderTabStaggeredGridLayoutManager(int p0,int p1){
       super(p0, p1);
    }
    public void OrderTabStaggeredGridLayoutManager(Context p0,AttributeSet p1,int p2,int p3){
       super(p0, p1, p2, p3);
    }
    public void onItemsAdded(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(OrderTabStaggeredGridLayoutManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, OrderTabStaggeredGridLayoutManager.class, "1")) {
          return;
       }
       try{
          super.onItemsAdded(p0, p1, p2);
       }catch(java.lang.IndexOutOfBoundsException e8){
          e8.printStackTrace();
          a.l(MerchantTransactionLogBiz.ORDER, "OrderTabStaggeredGridLayoutManager", "onItemsAdded", e8);
       }
       return;
    }
}
