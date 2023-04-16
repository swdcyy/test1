package com.yxcorp.gifshow.activity.share.util.TextProcessor$f;
import com.yxcorp.gifshow.activity.share.util.TextProcessor$d;
import android.text.Editable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;

public final class TextProcessor$f extends TextProcessor$d	// class@001493
{

    public void TextProcessor$f(){
       super();
    }
    public int e(Editable p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(TextProcessor$f.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, TextProcessor$f.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       a.p(p0, "editable");
       p0.delete(p1, p2);
       return (p1 - p2);
    }
}
