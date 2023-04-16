package com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager$a;
import mn9.a;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager$TextColors;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;

public class TextStyleDataManager$a implements a	// class@00146f
{
    public TextStyleDataManager$TextColors a;
    public boolean b;

    public void TextStyleDataManager$a(TextStyleDataManager$TextColors p0){
       super();
       this.a = p0;
       this.b = false;
    }
    public boolean a(){
       return false;
    }
    public boolean d(){
       return true;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TextStyleDataManager$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof TextStyleDataManager$a) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       TextStyleDataManager$a ta = this.a;
       p0 = p0.a;
       if (ta != null) {
          b = ta.equals(p0);
       }else if(p0 == null){
          b = false;
       }
       return b;
    }
    public String getId(){
       return this.a.b;
    }
    public int h(){
       return 0;
    }
    public int hashCode(){
       TextStyleDataManager$a obj = PatchProxy.apply(null, this, TextStyleDataManager$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (obj != null)? obj.hashCode(): 0;
       return ((i * 31) + this.b);
    }
    public boolean i(){
       return false;
    }
}
