package com.yxcorp.gifshow.camera.record.sidebar.h;
import com.yxcorp.gifshow.camera.record.sidebar.g;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.kuaishou.viewbinder.ViewBinderOption;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.lang.Integer;
import java.util.Collection;
import zg9.l;
import java.lang.Iterable;
import ok.o;
import qk.y;
import java.util.Iterator;
import zg9.m;

public class h extends g	// class@000f18
{

    public void h(CameraPageType p0,b p1,ViewBinderOption p2){
       super(p0, p1, p2);
    }
    public List F2(){
       ArrayList obj = PatchProxy.apply(null, this, h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(Integer.valueOf(3));
       obj.add(Integer.valueOf(200));
       obj.add(Integer.valueOf(400));
       obj.add(Integer.valueOf(300));
       obj.add(Integer.valueOf(4));
       ArrayList uArrayList = new ArrayList(super.F2());
       y.q(uArrayList, new l(obj));
       ArrayList uArrayList1 = new ArrayList();
       Iterator iterator = obj.iterator();
       while (iterator.hasNext()) {
          uArrayList1.add(new m(iterator.next()));
       }
       uArrayList1.addAll(uArrayList);
       return uArrayList1;
    }
}
