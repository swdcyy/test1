package com.kwai.feature.post.api.componet.prettify.filter.model.FilterGroup$a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class FilterGroup$a	// class@0012ed
{
    public int a;
    public String b;

    public void FilterGroup$a(){
       super();
    }
    public boolean a(int p0,String p1){
       FilterGroup$a uoa = FilterGroup$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (this.a == p0 && TextUtils.n(this.b, p1))? true: false;
       return b;
    }
}
