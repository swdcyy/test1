package com.google.gson.DefaultDateTypeAdapter;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.util.ArrayList;
import java.util.Locale;
import java.text.DateFormat;
import java.lang.Object;
import java.util.List;
import bl.o;
import bl.q;
import java.lang.String;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.Date;
import java.sql.Timestamp;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import com.google.gson.stream.a;
import com.google.gson.stream.JsonToken;
import java.util.Iterator;
import java.text.ParsePosition;
import cl.a;
import java.lang.AssertionError;
import com.google.gson.JsonSyntaxException;
import java.lang.Throwable;
import com.google.gson.stream.b;

public final class DefaultDateTypeAdapter extends TypeAdapter	// class@001941
{
    public final Class a;
    public final List b;

    public void DefaultDateTypeAdapter(Class p0){
       super();
       ArrayList uArrayList = new ArrayList();
       this.b = uArrayList;
       DefaultDateTypeAdapter.a(p0);
       this.a = p0;
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
    public void DefaultDateTypeAdapter(Class p0,int p1,int p2){
       super();
       ArrayList uArrayList = new ArrayList();
       this.b = uArrayList;
       DefaultDateTypeAdapter.a(p0);
       this.a = p0;
       Locale uS = Locale.US;
       uArrayList.add(DateFormat.getDateTimeInstance(p1, p2, uS));
       if (!Locale.getDefault().equals(uS)) {
          uArrayList.add(DateFormat.getDateTimeInstance(p1, p2));
       }
       if (o.a()) {
          uArrayList.add(q.a(p1, p2));
       }
       return;
    }
    public void DefaultDateTypeAdapter(Class p0,String p1){
       super();
       ArrayList uArrayList = new ArrayList();
       this.b = uArrayList;
       DefaultDateTypeAdapter.a(p0);
       this.a = p0;
       Locale uS = Locale.US;
       uArrayList.add(new SimpleDateFormat(p1, uS));
       if (!Locale.getDefault().equals(uS)) {
          uArrayList.add(new SimpleDateFormat(p1));
       }
       return;
    }
    public static Class a(Class p0){
       if (p0 != Date.class && (p0 == Date.class || p0 == Timestamp.class)) {
          return p0;
       }
       throw new IllegalArgumentException("Date type must be one of "+Date.class+", "+Timestamp.class+", or "+Date.class+" but was "+p0);
    }
    public Object read(a p0){
       Date uDate;
       Timestamp timestamp;
       try{
          if (p0.J() == JsonToken.NULL) {
             p0.A();
             uDate = null;
          }else {
             String str = p0.E();
             DefaultDateTypeAdapter tb = this.b;
             _monitor_enter(tb);
             Iterator iterator = this.b.iterator();
             if (iterator.hasNext()) {
                DateFormat uDateFormat = iterator.next();
                uDate = uDateFormat.parse(str);
                _monitor_exit(tb);
             }else {
                try{
                   uDate = a.b(str, new ParsePosition(0));
                   _monitor_exit(tb);
                }catch(java.text.ParseException e1){
                   throw new JsonSyntaxException(uDate, e1);
                }
             }
             tb = this.a;
             if (tb != Date.class) {
                if (tb == Timestamp.class) {
                   timestamp = new Timestamp(uDate.getTime());
                }else if(tb == Date.class){
                   timestamp = new Date(uDate.getTime());
                }else {
                   throw new AssertionError();
                }
                uDate = timestamp;
             }
          }
       }catch(java.text.ParseException e0){
       }
       return uDate;
    }
    public String toString(){
       DateFormat uDateFormat = this.b.get(0);
       if (uDateFormat instanceof SimpleDateFormat) {
          return "DefaultDateTypeAdapter\("+uDateFormat.toPattern()+')';
       }
       return "DefaultDateTypeAdapter\("+uDateFormat.getClass().getSimpleName()+')';
    }
    public void write(b p0,Object p1){
       if (p1 == null) {
          p0.u();
       }else {
          DefaultDateTypeAdapter tb = this.b;
          _monitor_enter(tb);
          p0.O(this.b.get(0).format(p1));
          _monitor_exit(tb);
       }
       return;
    }
}
