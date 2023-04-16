package com.meizu.cloud.pushsdk.c.c.b$a;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import com.meizu.cloud.pushsdk.c.c.f;
import java.util.List;
import com.meizu.cloud.pushsdk.c.c.b;
import com.meizu.cloud.pushsdk.c.c.b$1;

public final class b$a	// class@0014c7
{
    public final List a;
    public final List b;

    public void b$a(){
       super();
       this.a = new ArrayList();
       this.b = new ArrayList();
    }
    public b$a a(String p0,String p1){
       this.a.add(f.a(p0, " \"\':;<=>@[]^`{}|/\\?#&!$\(\),~", false, false, true, true));
       this.b.add(f.a(p1, " \"\':;<=>@[]^`{}|/\\?#&!$\(\),~", false, false, true, true));
       return this;
    }
    public b a(){
       return new b(this.a, this.b, null);
    }
    public b$a b(String p0,String p1){
       this.a.add(f.a(p0, " \"\':;<=>@[]^`{}|/\\?#&!$\(\),~", true, false, true, true));
       this.b.add(f.a(p1, " \"\':;<=>@[]^`{}|/\\?#&!$\(\),~", true, false, true, true));
       return this;
    }
}
