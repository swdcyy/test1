package com.kuaishou.live.core.voiceparty.customview.stage.GraduallyDisplayLinearLayout$a;
import android.util.Property;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.customview.stage.GraduallyDisplayLinearLayout;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Float;

public class GraduallyDisplayLinearLayout$a extends Property	// class@0014c6
{

    public void GraduallyDisplayLinearLayout$a(Class p0,String p1){
       super(p0, p1);
    }
    public Object get(Object p0){
       Float uFloat = PatchProxy.applyOneRefs(p0, this, GraduallyDisplayLinearLayout$a.class, "1");
       if (uFloat != PatchProxyResult.class) {
       }else {
          uFloat = Float.valueOf(p0.c);
       }
       return uFloat;
    }
    public void set(Object p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GraduallyDisplayLinearLayout$a.class, "2")) {
       }else {
          p0.setDisplayRatio(p1.floatValue());
       }
       return;
    }
}
