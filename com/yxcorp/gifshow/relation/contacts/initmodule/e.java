package com.yxcorp.gifshow.relation.contacts.initmodule.e;
import java.util.concurrent.Callable;
import java.lang.Object;
import com.yxcorp.gifshow.relation.contacts.initmodule.ContactInitModule;
import tkd.b;
import tkd.d;
import pv5.c;
import java.util.List;
import wwb.o;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kwai.feature.api.social.login.model.SwitchAccountModel;

public final class e implements Callable	// class@0017ea
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final Object call(){
       List list = d.a(0x6154d94e).k6();
       List list1 = o.b();
       if (!q.f(list1)) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             list1.remove(iterator.next().mUserId);
          }
       }
       return list1;
    }
}
