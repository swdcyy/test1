package com.loc.o$1;
import com.loc.ck;
import android.content.Context;
import com.loc.o;
import java.util.Map;
import com.loc.o$a;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.loc.bg;
import com.loc.bl;
import com.loc.bm;

public final class o$1 extends ck	// class@001457
{
    public final Context a;

    public void o$1(Context p0){
       this.a = p0;
       super();
    }
    public final void a(){
       Map map = o.g.b();
       String str = o.g.a(o.h(this.a), "", "", o.y(this.a));
       if (TextUtils.isEmpty(str)) {
          return;
       }
       bg.a();
       str = o.g.a(this.a, new String(bg.a(o.g.a(str.getBytes(), map)).a));
       if (!TextUtils.isEmpty(str)) {
          o.b = str;
       }
       return;
    }
}
