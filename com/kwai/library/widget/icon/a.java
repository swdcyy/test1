package com.kwai.library.widget.icon.a;
import com.kwai.library.widget.icon.c$a;
import java.lang.Object;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.kwai.library.widget.icon.b;
import java.lang.StringBuilder;
import java.lang.String;
import com.yxcorp.utility.Log;
import androidx.core.graphics.drawable.a;

public final class a implements c$a	// class@000944
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final Drawable a(int p0,int p1,int p2,Resources p3,Drawable p4){
       if (p3 == null || (b.i(p3) && p4 != null)) {
          Log.b("KwaiIconHookHelper", "Kid icon state wrapper called: "+p0+" is night: "+b.i(p3));
          p4 = a.r(p4).mutate();
          a.n(p4, p3.getColor(p2));
       }
    label_003e :
       return p4;
    }
}
