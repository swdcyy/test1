package com.yxcorp.gifshow.widget.TextWithEndTagView$b;
import androidx.core.util.Pools$SimplePool;
import java.lang.Object;
import android.graphics.Rect;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class TextWithEndTagView$b extends Pools$SimplePool	// class@0018d6
{

    public void TextWithEndTagView$b(int p0){
       super(p0);
    }
    public boolean a(Object p0){
       return this.d(p0);
    }
    public Rect c(){
       Rect obj = PatchProxy.apply(null, this, TextWithEndTagView$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.q();
       if (obj == null) {
          return new Rect();
       }
       obj.setEmpty();
       return obj;
    }
    public boolean d(Rect p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TextWithEndTagView$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       p0.setEmpty();
       return super.a(p0);
    }
    public Object q(){
       return this.c();
    }
}
