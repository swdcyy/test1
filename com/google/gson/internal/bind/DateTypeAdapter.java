package com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.DateTypeAdapter$1;
import java.util.ArrayList;
import java.util.Locale;
import java.text.DateFormat;
import java.lang.Object;
import java.util.List;
import bl.o;
import bl.q;
import com.google.gson.stream.a;
import com.google.gson.stream.JsonToken;
import java.lang.String;
import java.util.Iterator;
import java.util.Date;
import java.text.ParsePosition;
import cl.a;
import com.google.gson.JsonSyntaxException;
import java.lang.Throwable;
import com.google.gson.stream.b;

public final class DateTypeAdapter extends TypeAdapter	// class@000578
{
    public final List a;
    public static final j b;

    static {
       DateTypeAdapter.b = new DateTypeAdapter$1();
    }
    public void DateTypeAdapter(){
       super();
       ArrayList uArrayList = new ArrayList();
       this.a = uArrayList;
       Locale uS = Locale.US;
       uArrayList.add(DateFormat.getDateTimeInstance(2, 2, uS));
       if (!Locale.getDefault().equals(uS)) {
          uArrayList.add(DateFormat.getDateTimeInstance(2, 2));
       }
       if (o.a()) {
          uArrayList.add(q.a(2, 2));
       }
       return;
    }
    public Object read(a p0){
       Date uDate;
       if (p0.J() == JsonToken.NULL) {
          p0.A();
          uDate = null;
       }else {
          String str = p0.E();
          _monitor_enter(this);
          Iterator iterator = this.a.iterator();
          if (iterator.hasNext()) {
             DateFormat uDateFormat = iterator.next();
             try{
                uDate = uDateFormat.parse(str);
                _monitor_exit(this);
             }catch(java.text.ParseException e0){
             }
          }else {
             try{
                uDate = a.b(str, new ParsePosition(0));
                _monitor_exit(this);
             }catch(java.text.ParseException e0){
                throw new JsonSyntaxException(uDate, e0);
             }
          }
       }
    }
    public void write(b p0,Object p1){
       _monitor_enter(this);
       if (p1 == null) {
          p0.u();
          _monitor_exit(this);
       }else {
          p0.O(this.a.get(0).format(p1));
          _monitor_exit(this);
       }
       return;
    }
}
