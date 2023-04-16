package com.th3rdwave.safeareacontext.SafeAreaProviderManager$a;
import com.th3rdwave.safeareacontext.SafeAreaProvider$a;
import com.th3rdwave.safeareacontext.SafeAreaProviderManager;
import df.c;
import java.lang.Object;
import com.th3rdwave.safeareacontext.SafeAreaProvider;
import ar8.a;
import ar8.c;
import ar8.b;
import android.view.ViewGroup;
import df.b;

public class SafeAreaProviderManager$a implements SafeAreaProvider$a	// class@000f94
{
    public final c a;
    public final SafeAreaProviderManager b;

    public void SafeAreaProviderManager$a(SafeAreaProviderManager p0,c p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(SafeAreaProvider p0,a p1,c p2){
       this.a.c(new b(p0.getId(), p1, p2));
    }
}
