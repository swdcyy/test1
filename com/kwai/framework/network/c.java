package com.kwai.framework.network.c;
import javax.inject.Provider;
import java.lang.Object;
import ta6.e;
import java.lang.Long;
import ta6.a;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import java.lang.String;

public final class c implements Provider	// class@000bef
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public final Object get(){
       Long h = e.h;
       if (h == null || !h.longValue()) {
          h = Long.valueOf(a.h());
          e.h = h;
          if (!h.longValue()) {
             h = Long.valueOf((SystemUtil.C(a.a().a()) / 0x100000));
             e.h = h;
             a.p(h.longValue());
          }
       }
       return String.valueOf(e.h);
    }
}
