package com.kwai.emotionsdk.core.d;
import java.util.concurrent.Callable;
import java.lang.Object;
import hk5.a;
import ik5.b;
import com.kwai.emotionsdk.db.dao.EmotionPackageDao;
import java.util.List;
import org.greenrobot.greendao.AbstractDao;
import java.util.Collections;

public final class d implements Callable	// class@000d93
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final Object call(){
       b uob = a.b().a();
       List list = (uob != null && uob.a() != null)? uob.a().loadAll(): Collections.emptyList();
       return list;
    }
}
