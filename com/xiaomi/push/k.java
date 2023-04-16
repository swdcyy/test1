package com.xiaomi.push.k;
import com.xiaomi.push.iz$a;
import com.xiaomi.push.jf;
import java.lang.Object;
import java.io.ByteArrayOutputStream;
import ws8.u6;
import java.io.OutputStream;
import ws8.x6;
import ws8.q6;
import com.xiaomi.push.is;

public class k	// class@00113f
{
    public final ByteArrayOutputStream a;
    public final u6 b;
    public q6 c;

    public void k(){
       super(new iz$a());
    }
    public void k(jf p0){
       super();
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       this.a = uByteArrayOu;
       u6 ou6 = new u6(uByteArrayOu);
       this.b = ou6;
       this.c = p0.a(ou6);
    }
    public byte[] a(is p0){
       this.a.reset();
       p0.b(this.c);
       return this.a.toByteArray();
    }
}
