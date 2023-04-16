package com.google.gson.internal.bind.TypeAdapters$27;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import com.google.gson.stream.JsonToken;
import java.lang.String;
import java.util.GregorianCalendar;
import com.google.gson.stream.b;
import java.util.Calendar;

public class TypeAdapters$27 extends TypeAdapter	// class@00059d
{

    public void TypeAdapters$27(){
       super();
    }
    public Object read(a p0){
       GregorianCalendar gregorianCal;
       if (p0.J() == JsonToken.NULL) {
          p0.A();
          gregorianCal = null;
       }else {
          p0.c();
          int i = 0;
          int i1 = 0;
          int i2 = 0;
          int i3 = 0;
          int i4 = 0;
          int i5 = 0;
          while (p0.J() != JsonToken.END_OBJECT) {
             String str = p0.y();
             int i6 = p0.v();
             if (("year").equals(str)) {
                i = i6;
             }else if(("month").equals(str)){
                i1 = i6;
             }else if(("dayOfMonth").equals(str)){
                i2 = i6;
             }else if(("hourOfDay").equals(str)){
                i3 = i6;
             }else if(("minute").equals(str)){
                i4 = i6;
             }else if(("second").equals(str)){
                i5 = i6;
             }
          }
          p0.j();
          GregorianCalendar gregorianCal1 = new GregorianCalendar(i, i1, i2, i3, i4, i5);
       }
       return gregorianCal;
    }
    public void write(b p0,Object p1){
       if (p1 == null) {
          p0.u();
       }else {
          p0.e();
          p0.r("year");
          p0.K((long)p1.get(1));
          p0.r("month");
          p0.K((long)p1.get(2));
          p0.r("dayOfMonth");
          p0.K((long)p1.get(5));
          p0.r("hourOfDay");
          p0.K((long)p1.get(11));
          p0.r("minute");
          p0.K((long)p1.get(12));
          p0.r("second");
          p0.K((long)p1.get(13));
          p0.j();
       }
       return;
    }
}
