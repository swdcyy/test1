package com.yxcorp.gifshow.relation.util.d;
import erd.g;
import java.lang.Object;
import cda.j;
import hcc.t;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Map;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;

public final class d implements g	// class@001a55
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final void accept(Object p0){
       j a = p0.a;
       if (a == null) {
       }else {
          String userId = a.getUserId();
          p0 = p0.a.getPhotoId();
          Map b = t.b;
          if (b.containsKey(userId)) {
             List list = b.get(userId);
             if (!q.f(list) && !list.contains(p0)) {
                list.add(p0);
             }
          }else {
             ArrayList uArrayList = new ArrayList();
             uArrayList.add(p0);
             b.put(userId, uArrayList);
          }
       }
       return;
    }
}
