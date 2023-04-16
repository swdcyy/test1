package com.swmansion.reanimated.nodes.EventNode$a;
import com.facebook.react.bridge.ReadableArray;
import java.lang.Object;
import java.lang.String;

public class EventNode$a	// class@000c9e
{
    public final int a;
    public final String[] b;

    public void EventNode$a(ReadableArray p0){
       super();
       int i = p0.size() - 1;
       String[] stringArray = new String[i];
       this.b = stringArray;
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.b[i1] = p0.getString(i1);
       }
       this.a = p0.getInt(i);
       return;
    }
}
