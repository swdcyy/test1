package com.android.kwai.foundation.network.clientfactory.a;
import okhttp3.EventListener$Factory;
import java.lang.Object;
import okhttp3.Call;
import okhttp3.EventListener;
import com.android.kwai.foundation.network.clientfactory.DefaultOkHttpClientFactoryImpl;

public final class a implements EventListener$Factory	// class@000ee5
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final EventListener create(Call p0){
       return DefaultOkHttpClientFactoryImpl.a(p0);
    }
}
