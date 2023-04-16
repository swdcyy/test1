package com.google.gson.internal.bind.SqlDateTypeAdapter;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.SqlDateTypeAdapter$1;
import java.text.SimpleDateFormat;
import java.lang.String;
import com.google.gson.stream.a;
import java.lang.Object;
import com.google.gson.stream.JsonToken;
import java.util.Date;
import java.text.DateFormat;
import java.sql.Date;
import com.google.gson.JsonSyntaxException;
import java.lang.Throwable;
import com.google.gson.stream.b;

public final class SqlDateTypeAdapter extends TypeAdapter	// class@000583
{
    public final DateFormat a;
    public static final j b;

    static {
       SqlDateTypeAdapter.b = new SqlDateTypeAdapter$1();
    }
    public void SqlDateTypeAdapter(){
       super();
       this.a = new SimpleDateFormat("MMM d, yyyy");
    }
    public Object read(a p0){
       _monitor_enter(this);
       if (p0.J() == JsonToken.NULL) {
          p0.A();
          _monitor_exit(this);
       }else {
          try{
             Date uDate = new Date(this.a.parse(p0.E()).getTime());
             _monitor_exit(this);
          }catch(java.text.ParseException e3){
             throw new JsonSyntaxException(e3);
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
