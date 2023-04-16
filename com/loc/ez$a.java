package com.loc.ez$a;
import java.lang.Object;
import com.loc.eo;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class ez$a	// class@001421
{
    public eo a;
    public String b;

    public void ez$a(){
       super();
       this.a = null;
       this.b = null;
    }
    public final eo a(){
       return this.a;
    }
    public final void a(eo p0){
       this.a = p0;
    }
    public final void a(String p0){
       p0 = (TextUtils.isEmpty(p0))? null: p0.replace("##", "#");
       this.b = p0;
       return;
    }
    public final String b(){
       return this.b;
    }
}
