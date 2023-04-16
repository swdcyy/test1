package com.kuaishou.merchant.transaction.detail.self.widget.OrderAnimationView$c;
import com.kuaishou.merchant.transaction.detail.self.widget.OrderAnimationView;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class OrderAnimationView$c	// class@00076f
{
    public String a;
    public float b;
    public float c;
    public float d;
    public Bitmap e;
    public String f;
    public int g;
    public float h;
    public float i;
    public List j;
    public List k;
    public List l;
    public List m;
    public String n;
    public String o;
    public final OrderAnimationView p;

    public void OrderAnimationView$c(OrderAnimationView p0){
       this.p = p0;
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, OrderAnimationView$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AnimationInfo{text=\'"+this.f+'''+", translateY="+this.h+", startY="+this.b+", alpha="+this.i+'}';
    }
}
