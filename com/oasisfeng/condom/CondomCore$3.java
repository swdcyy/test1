package com.oasisfeng.condom.CondomCore$3;
import com.oasisfeng.condom.util.Lazy;
import com.oasisfeng.condom.CondomCore;
import android.content.Context;
import java.lang.Object;
import com.oasisfeng.condom.CondomContentResolver;
import android.content.ContentResolver;

public class CondomCore$3 extends Lazy	// class@000a70
{
    public final Context a;
    public final CondomCore b;

    public void CondomCore$3(CondomCore p0,Context p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public Object create(){
       CondomCore$3 ta = this.a;
       return new CondomContentResolver(this.b, ta, ta.getContentResolver());
    }
}
