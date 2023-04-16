package r87.u;
import java.lang.Object;
import java.util.Calendar;
import r87.u$a;

public class u	// class@002330
{
    public u$a a;
    public long b;
    public Calendar c;

    public void u(){
       super();
    }
    public final void a(long p0){
       u ta = this.a;
       if (this.c == null) {
          this.c = Calendar.getInstance();
       }
       this.c.setTimeInMillis(p0);
       ta.a = this.c.get(1);
       ta.b = this.c.get(2) + 1;
       ta.c = this.c.get(5);
       ta.d = this.c.get(11);
       ta.e = this.c.get(12);
       ta.f = this.c.get(13);
       ta.g = this.c.get(14);
       ta = this.a;
       this.b = p0 - (long)((((ta.d * 0x36ee80) + (ta.e * 0xea60)) + (ta.f * 1000)) + ta.g);
       return;
    }
}
