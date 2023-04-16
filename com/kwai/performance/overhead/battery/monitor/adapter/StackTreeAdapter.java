package com.kwai.performance.overhead.battery.monitor.adapter.StackTreeAdapter;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.String;
import com.google.gson.stream.b;
import com.kwai.performance.overhead.battery.monitor.model.StackTree;
import org.json.JSONObject;

public class StackTreeAdapter extends TypeAdapter	// class@001134
{

    public void StackTreeAdapter(){
       super();
    }
    public Object read(a p0){
       throw new RuntimeException("read method not implement");
    }
    public void write(b p0,Object p1){
       p1 = (p1 == null)? null: p1.convertToJsonObject().toString();
       p0.p(p1);
       return;
    }
}
