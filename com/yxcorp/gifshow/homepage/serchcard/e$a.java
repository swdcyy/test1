package com.yxcorp.gifshow.homepage.serchcard.e$a;
import androidx.recyclerview.widget.GridLayoutManager$b;
import com.yxcorp.gifshow.homepage.serchcard.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import com.yxcorp.gifshow.homepage.serchcard.ItemState;
import java.lang.Enum;

public class e$a extends GridLayoutManager$b	// class@0017fd
{
    public final e e;

    public void e$a(e p0){
       this.e = p0;
       super();
    }
    public int f(int p0){
       e$a uoa = e$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = 2;
       if (this.e.K.size() < 4) {
          return i;
       }else if(this.e.K.get(p0).equals(ItemState.row)){
          i = 1;
       }
       return i;
    }
}
