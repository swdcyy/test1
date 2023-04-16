package com.google.gson.internal.bind.TimeTypeAdapter;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.TimeTypeAdapter$1;
import java.text.SimpleDateFormat;
import java.lang.String;
import com.google.gson.stream.a;
import java.lang.Object;
import com.google.gson.stream.JsonToken;
import java.util.Date;
import java.text.DateFormat;
import java.sql.Time;
import com.google.gson.JsonSyntaxException;
import java.lang.Throwable;
import com.google.gson.stream.b;

public final class TimeTypeAdapter extends TypeAdapter	// class@000585
{
    public final DateFormat a;
    public static final j b;

    static {
       TimeTypeAdapter.b = new TimeTypeAdapter$1();
    }
    public void TimeTypeAdapter(){
       super();
       this.a = new SimpleDateFormat("hh:mm:ss a");
    }
    public Object read(a p0){
       _monitor_enter(this);
       if (p0.J() == JsonToken.NULL) {
          p0.A();
          _monitor_exit(this);
       }else {
          try{
             _monitor_exit(this);
             Time time = new Time(this.a.parse(p0.E()).getTime());
          }catch(java.text.ParseException e4){
             throw new JsonSyntaxException(e4);
          }
       }
       return null;
    }
    public void write(b p0,Object p1){
       _monitor_enter(this);
       p1 = (p1 == null)? null: this.a.format(p1);
       p0.O(p1);
       _monitor_exit(this);
       return;
    }
}
