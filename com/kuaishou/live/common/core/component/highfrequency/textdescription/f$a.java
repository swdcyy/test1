package com.kuaishou.live.common.core.component.highfrequency.textdescription.f$a;
import android.util.Property;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import android.widget.ProgressBar;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;

public class f$a extends Property	// class@001348
{

    public void f$a(Class p0,String p1){
       super(p0, p1);
    }
    public Object get(Object p0){
       Integer integer = PatchProxy.applyOneRefs(p0, this, f$a.class, "1");
       if (integer != PatchProxyResult.class) {
       }else {
          integer = Integer.valueOf(p0.getProgress());
       }
       return integer;
    }
    public void set(Object p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f$a.class, "2")) {
       }else {
          p0.setProgress(p1.intValue());
       }
       return;
    }
}
