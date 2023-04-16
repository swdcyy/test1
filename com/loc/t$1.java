package com.loc.t$1;
import com.loc.ck;
import android.content.Context;
import java.lang.String;
import com.loc.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Object;
import java.io.File;

public final class t$1 extends ck	// class@001465
{
    public final Context a;

    public void t$1(Context p0){
       this.a = p0;
       super();
    }
    public final void a(){
       Iterator iterator = t.a(t.a(this.a)).iterator();
       while (iterator.hasNext()) {
          t.a(this.a, iterator.next().getName());
       }
       t.b(this.a);
       return;
    }
}
