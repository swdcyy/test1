package com.yxcrop.gifshow.v3.editor.decoration_v2.action.DecorationDirectSeekAction$a;
import java.util.Comparator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcrop.gifshow.v3.editor.decoration_v2.data.NewDecorationElementData;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import java.lang.Double;
import java.lang.Comparable;
import xrd.b;

public final class DecorationDirectSeekAction$a implements Comparator	// class@000a27
{

    public void DecorationDirectSeekAction$a(){
       super();
    }
    public final int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, DecorationDirectSeekAction$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return b.f(Double.valueOf(p0.m0()), Double.valueOf(p1.m0()));
    }
}
