package com.oasisfeng.condom.CondomCore$2;
import com.oasisfeng.condom.util.Lazy;
import com.oasisfeng.condom.CondomCore;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import com.oasisfeng.condom.CondomPackageManager;
import android.content.pm.PackageManager;

public class CondomCore$2 extends Lazy	// class@000a6f
{
    public final Context a;
    public final String b;
    public final CondomCore c;

    public void CondomCore$2(CondomCore p0,Context p1,String p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public Object create(){
       return new CondomPackageManager(this.c, this.a.getPackageManager(), this.b);
    }
}
