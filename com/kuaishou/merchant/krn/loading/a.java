package com.kuaishou.merchant.krn.loading.a;
import javax.inject.Provider;
import java.lang.Object;
import com.kuaishou.merchant.krn.loading.LoadingManager;

public final class a implements Provider	// class@001869
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final Object get(){
       return new LoadingManager();
    }
}
