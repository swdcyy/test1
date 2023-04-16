package com.yxcorp.gifshow.fragment.user.f;
import erd.o;
import java.lang.Object;
import java.util.List;
import o56.c;
import o56.a;
import java.lang.String;
import xf6.l;
import java.lang.Integer;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.Math;

public final class f implements o	// class@001284
{
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
    }
    public final Object apply(Object p0){
       if (a.a().c()) {
          int i = Integer.valueOf(l.e("key_mock_draft_count", 0)).intValue();
          if (i) {
             ArrayList uArrayList = new ArrayList();
             int i1 = 0;
             int i2 = i / p0.size();
             i2 = i2 + 1;
             while (i1 < i2) {
                uArrayList.addAll(p0);
                i1 = i1 + 1;
             }
             p0 = uArrayList.subList(0, Math.min((i - 1), (uArrayList.size() - 1)));
          }
       }
       return p0;
    }
}
