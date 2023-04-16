package com.kwai.framework.network.j;
import io7.a;
import java.lang.Object;
import java.lang.String;
import io7.f;
import ta6.l;
import java.lang.reflect.Type;
import el.a;
import java.util.ArrayList;
import java.util.List;
import com.kwai.framework.network.k;
import ta6.c;
import java.lang.StringBuilder;
import q87.c;

public final class j implements a	// class@0017ce
{
    public static final j b;

    static {
       j.b = new j();
    }
    public void j(){
       super();
    }
    public final void a(String p0,f p1){
       k.a = p1.d(new l().getType(), new ArrayList());
       Object[] objArray = new Object[0];
       c.C().w("Region", "onChanged, sSemanticConfig = "+k.a, objArray);
    }
}
