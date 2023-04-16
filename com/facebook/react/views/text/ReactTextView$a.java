package com.facebook.react.views.text.ReactTextView$a;
import java.util.Comparator;
import com.facebook.react.views.text.ReactTextView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.ReadableMap;

public class ReactTextView$a implements Comparator	// class@00140f
{
    public final ReactTextView b;

    public void ReactTextView$a(ReactTextView p0){
       this.b = p0;
       super();
    }
    public int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, ReactTextView$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (p0.getInt("index") - p1.getInt("index"));
    }
}
